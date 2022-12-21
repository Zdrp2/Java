package classes;

public class Massage_zp extends Massage {
    protected float ZP;
    protected float award;
    protected float itog;
    public Massage_zp(Massage_zp object){ // передача объекта конструктору
        super(object);
        ZP = object.ZP;
        award = object.award;
        itog = object.itog;
    }
    public Massage_zp(){
        super(0,"Нет имени", 0);
        ZP = 0;
        award= 0;
        itog = 0;
    }
    public Massage_zp(int id, String name, int exp, float zp, float aw){
        super(id, name, exp);
        ZP = zp;
        award= aw;
        itog = zp + aw;
    }

    public float get_itog(){
        return itog;
    }

    public float get_zp(){
        return ZP;
    }
    public float get_aw(){
        return award;
    }

    public String toString() {
        return "Заработная плата: " + ZP 
        + "\nПремия: " + award 
        + "\nИтог: " + itog;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}