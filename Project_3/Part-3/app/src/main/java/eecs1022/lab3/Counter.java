package eecs1022.lab3;


public class Counter
{
    final int MAX_WINS = 2;
    int count;

    Counter(){ this.count = 0; }

    void increase(){
        this.count ++;
    }

    void decrease(){
        this.count --;
    }

    void reset() {this.count = 0;}

    @Override
    public String toString() {
        String result = "";

        result += "Counter value is " + this.count;

        return result;
    }
}
