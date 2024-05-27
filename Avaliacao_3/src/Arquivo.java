import java.io.*;
import java.util.ArrayList;

public class Arquivo {
    public static void escrever(Jogos jogo){
        OutputStream fs= null;
        OutputStreamWriter gfs=null;
        BufferedWriter bs=null;
        String linha=null;
        try{
            fs = new FileOutputStream("Jogos.txt",true);
            gfs = new OutputStreamWriter(fs);
            bs = new BufferedWriter(gfs);


            bs.write("-----Jogo -----");
            bs.newLine();
            bs.write(jogo.getNome() + "\n");
            bs.write(jogo.getPreco() + "\n");
            bs.write(jogo.getGenero() + "\n");


        }catch (Exception e){
            System.out.println("ERRO: " + e);
        }finally {
            try {
                bw.close();
            }catch (Exception e){}
        }
    }



    public ArrayList<Jogo> ler(){
        InputStream fe = null;
        InputStreamReader lfe = null;
        BufferedReader be = null;

        String linhaLer=null;

        ArrayList<Jogo> arrayJogos = new ArrayList<>();

        try{

            fe = new FileInputStream("Jogos.txt");
            lfe = new InputStreamReader(fe);
            be = new BufferedReader(lfe);

            linhaLer = be.readLine();

            while (linhaLer != null){

                if(linhaLer.contains("--- Jogo ---")){

                    Jogo aux = new Jogo();

                    aux.setNome(be.readLine());
                    aux.setPreco(Integer.parseInt(be.readLine()));
                    aux.setGenero(be.readLine());

                    arrayJogos.add(aux);
                }

                linhaLer = be.readLine();
            }

        }catch (Exception e) {
            System.out.println(e);

        } finally {
            try {
                br.close();
            }catch (Exception e){
                System.out.println(e);
            }
        }

        return  arrayJogos;
    }
}
