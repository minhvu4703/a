package OOP.Session_4.Vi_du;

public class hinhTru {
    public double chieuCao;
    public Htron day;

    public double dienTichXQ(double chieuCao, Htron day){
        double dienTichXQ = day.r * chieuCao;
        return dienTichXQ;
    }
    public double dienTichTP(double chieuCao, Htron day){
        double dienTichTP = dienTichXQ(chieuCao, day) * 2 * (Math.pow(day.r, 2) * Math.PI);
        return dienTichTP;
    }
    public double theTich(double chieuCao, Htron day){
        double theTich = Math.PI * (Math.pow(day.r, 2));
        return theTich;
    }
    public hinhTru(double chieuCao, Htron day){
        this.chieuCao = chieuCao;
        this.day = day;
    }
}
