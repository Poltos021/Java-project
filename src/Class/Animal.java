package Class;

public abstract class Animal {
    public boolean isSleep;
    public boolean isEat;

    public void setSleep(boolean isSleep){
        this.isSleep = isSleep;
    }
    public void setEat(boolean isEat){
        this.isEat = isEat;
    }

    public abstract String Voice();

}
