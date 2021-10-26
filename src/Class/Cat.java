package Class;

public class Cat extends Animal {

    public boolean isSleep;
    public boolean isEat;

    public void setSleep(boolean isSleep){
        this.isSleep = isSleep;
    }
    public void setEat(boolean isEat){
        this.isEat = isEat;
    }

    @Override
    public String Voice(){
        return isVoice("Мяу",isSleep, isEat);
    }
}
