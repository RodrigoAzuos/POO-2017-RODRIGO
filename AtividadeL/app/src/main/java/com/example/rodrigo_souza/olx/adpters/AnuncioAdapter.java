package com.example.rodrigo_souza.olx.adpters;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.PopupMenu;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.rodrigo_souza.olx.MainActivity;
import com.example.rodrigo_souza.olx.R;
import com.example.rodrigo_souza.olx.Produto;

import java.text.DateFormat;
import java.util.List;

import io.objectbox.Box;

/**
 * Created by rodrigo-souza on 09/02/18.
 */

public class AnuncioAdapter extends RecyclerView.Adapter<AnuncioAdapter.ViewHolder> {

    private List<Produto> produtos;
    private Context mContext;
    Box<Produto> anuncioBox;
    LayoutInflater layoutInflater;



    public AnuncioAdapter(Context context, List<Produto> produtos, LayoutInflater layoutInflater) {
        this.mContext = context;
        this.produtos = produtos;
        this.layoutInflater = layoutInflater;
        anuncioBox = MainActivity.BOXSTORE.boxFor(Produto.class);

    }

    public Context getContext() {
        return mContext;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView descricao;
        public TextView preco;
        public TextView dataLocal;
        public ImageView imagemProd;

        public ViewHolder(View itemView) {
            super(itemView);

            descricao = itemView.findViewById(R.id.layout_descricao);
            preco = itemView.findViewById(R.id.layout_preco);
            dataLocal = itemView.findViewById(R.id.layout_local_data);
            imagemProd = itemView.findViewById(R.id.layout_imagem);
        }

    }

    @Override
    public AnuncioAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View produroView = inflater.inflate(R.layout.layout_anuncio,parent,false);

        ViewHolder viewHolder = new ViewHolder(produroView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final AnuncioAdapter.ViewHolder holder, final int position) {

         atualizaLista(holder, position);
        final Produto produto = produtos.get(position);
        DateFormat dateFormat = android.text.format.DateFormat.getDateFormat(getContext());

        holder.descricao.setText(produto.getDescricao());
        holder.preco.setText(String.valueOf(produto.getPreco()));
        holder.dataLocal.setText( dateFormat.format(produto.getData())+ "," + produto.getLocal());
        holder.imagemProd.setImageResource(produto.getImagem());

         holder.itemView.setOnLongClickListener(new View.OnLongClickListener() {
             @Override
             public boolean onLongClick(View v) {
                 PopupMenu popupMenu = new PopupMenu(mContext, holder.itemView);
                 popupMenu.inflate(R.menu.context_menu);
                 popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                     @Override
                     public boolean onMenuItemClick(MenuItem item) {
                         switch (item.getItemId()){
                             case R.id.context_editar:
                                 editar(produto, position).show();
                                 break;
                             case R.id.context_remover:
                                 alertDialog(produto, position).show();
                                 break;

                         }
                         return false;
                     }
                 });
                 popupMenu.show();
                 return false;
             }
         });
    }

    private void atualizaLista(ViewHolder holder, int position) {
    }

    private Dialog alertDialog(final Produto produto, final int pos) {
        final AlertDialog.Builder alertDialog = new AlertDialog.Builder(mContext);

        alertDialog.setMessage("Tem certeza que deseja excluir?")
                .setPositiveButton("Confirmar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        produtos.remove(produto);
                        anuncioBox.remove(produto);
                        notifyItemRemoved(pos);
                        Toast.makeText(mContext, "Anuncio removido", Toast.LENGTH_SHORT).show();
                    }
                }).setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        return alertDialog.create();
    }

    private Dialog editar(final Produto produto, final int pos) {
        final AlertDialog.Builder  builder = new AlertDialog.Builder(mContext);

        final View dialogView = layoutInflater.inflate(R.layout.activity_main2,null);
        builder.setView(dialogView);

        final EditText edtDescricao = dialogView.findViewById(R.id.edt_descricao_anuncio);
        final EditText edtvalor = dialogView.findViewById(R.id.edt_valor_anuncio);
        final EditText edtLocal = dialogView.findViewById(R.id.edt_local_anuncio);
        final EditText edtCategoria = dialogView.findViewById(R.id.edt_categoria_anuncio);

        //edtCategoria.setText(produto.);
        edtDescricao.setText(produto.getDescricao());
        edtvalor.setText(String.valueOf(produto.getPreco()));
        edtLocal.setText(produto.getLocal());

        builder.setTitle("Editar")
                .setPositiveButton(R.string.confirmar_edicao, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        try {
                            produto.setDescricao(edtDescricao.getText().toString());
                            produto.setLocal(edtLocal.getText().toString());
                            produto.setPreco(Float.parseFloat(edtvalor.getText().toString()));
                            produto.setImagem(R.drawable.olx);
                            anuncioBox.put(produto);
                            produtos.set(pos,produto);
                            notifyItemChanged(pos);
                            Toast.makeText(mContext, "Anuncio editado com sucesso!", Toast.LENGTH_SHORT).show();
                        }catch (NumberFormatException e){
                            Toast.makeText(mContext, "Digite um valor válido", Toast.LENGTH_SHORT).show();
                        }catch (NullPointerException e){
                            Toast.makeText(mContext, "Preecha todos os valores", Toast.LENGTH_SHORT).show();
                        }catch (Exception e){
                            Toast.makeText(mContext, "Erro ao editar.", Toast.LENGTH_SHORT).show();
                        }

                    }
                })
                .setNegativeButton(R.string.cancelar_edicao, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
        return builder.create();

    }

    @Override
    public int getItemCount() {
        return produtos.size();
    }
}
