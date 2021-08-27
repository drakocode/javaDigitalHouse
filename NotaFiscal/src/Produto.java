public class Produto {
    private int codigo;
    private int ncm;
    private int oCst;
    private int cFop;
    private String unidade;
    private String valorUnitario;
    private float aliquotaIcms;
    private float aliquotaIpi;



    //getters and setters

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getNcm() {
        return ncm;
    }

    public void setNcm(int ncm) {
        this.ncm = ncm;
    }

    public int getoCst() {
        return oCst;
    }

    public void setoCst(int oCst) {
        this.oCst = oCst;
    }

    public int getcFop() {
        return cFop;
    }

    public void setcFop(int cFop) {
        this.cFop = cFop;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public String getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(String valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public float getAliquotaIcms() {
        return aliquotaIcms;
    }

    public void setAliquotaIcms(float aliquotaIcms) {
        this.aliquotaIcms = aliquotaIcms;
    }

    public float getAliquotaIpi() {
        return aliquotaIpi;
    }

    public void setAliquotaIpi(float aliquotaIpi) {
        this.aliquotaIpi = aliquotaIpi;
    }


    //constructor

    public Produto(int codigo, int ncm, int oCst, int cFop, String unidade, String valorUnitario, float aliquotaIcms, float aliquotaIpi) {
        this.codigo = codigo;
        this.ncm = ncm;
        this.oCst = oCst;
        this.cFop = cFop;
        this.unidade = unidade;
        this.valorUnitario = valorUnitario;
        this.aliquotaIcms = aliquotaIcms;
        this.aliquotaIpi = aliquotaIpi;
    }
}
