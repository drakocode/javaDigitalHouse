public class DownloadProxy implements IDownload{
    @Override
    public void ServiceDownload(Object[] dados{

        if (verifyUser(dados[1])){
            Download download=new Download();
            download.serviceDownload(dados[1]);


        }
    }


    public boolean verifyUser(boolean tipoConta){
        if (tipoConta==true){
            return tipoConta;
        }
        System.out.println("not downloaded");
    }


}
