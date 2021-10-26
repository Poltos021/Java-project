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

    public String isVoice(String voice, boolean isSleep, boolean isEat){
        if (isSleep == true && !isEat){
            return String.format("Это животное спит");
        }
        else {
            return String.format(voice);
        }

    }

    public abstract String Voice();

}
