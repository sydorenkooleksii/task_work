package ua.epam;


public class Model {


    View view;
    private int minBarrier = RAND_MIN;
    private int maxBarrier = RAND_MAX;
    private int winValue;
    private int value;
    public static final int RAND_MIN=0;
    public static final int RAND_TEMP=1;
    public static final int RAND_MAX=100;

    public boolean checkInputValue(int value, boolean game) {
        if (value <= getMinBarrier() || value >= getMaxBarrier()){
            System.out.println(view.WRONG_INPUT + view.INPUT_INT_DATA + getMinBarrier() + view.AND + getMaxBarrier());
        }
        else if (value == getWinValue()) {
                game = false;
            }
        else if (value != getWinValue()) {
                    if (value < getWinValue()) {
                        setMinBarrier(value);
                        System.out.println(view.INPUT_INT_DATA + getMinBarrier() + view.AND + getMaxBarrier());
                        game = true;

                    } else if (value > getWinValue()) {
                        setMaxValue(value);
                        System.out.println(view.INPUT_INT_DATA + getMinBarrier() + view.AND + getMaxBarrier());
                        game = true;
                    }
                }
        return game;
    }



    public void setValue(int value) {
        this.value = value;
    }

    public int getMaxBarrier() {
        return maxBarrier;
    }

    public void setMaxValue(int maxBarrier) {
        this.maxBarrier = maxBarrier;
    }

    public int getMinBarrier() {
        return minBarrier;
    }

    public void setMinBarrier(int minBarrier) {
        this.minBarrier = minBarrier;
    }

    public int getWinValue() {
        return winValue;
    }
    public int setWinValue() {

        winValue = (int)(Math.random() * ((getMaxBarrier() - getMinBarrier()-RAND_TEMP) + RAND_TEMP));
        return winValue;
    }
    public int setWinValue(int randMinBarrier, int randMaxBarrier) {
        if (randMaxBarrier<randMinBarrier){
            int temp = randMaxBarrier;
            randMaxBarrier = randMinBarrier;
            randMinBarrier = temp;
        }
        int randMinTemp = (randMinBarrier<=RAND_MIN)? RAND_TEMP : randMinBarrier;
        winValue = randMinTemp + (int)(Math.random() * ((randMaxBarrier - randMinBarrier) + RAND_TEMP));
        return winValue;
    }


}