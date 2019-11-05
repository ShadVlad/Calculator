public class Calculation {
    private int a, b;

    public Calculation()
    {
        this.a = 0;
        this.b = 0;
    }
    public Calculation(int a, int b)
    {
        this.a = a;
        this.b = b;
    }

    public int add(){
        return a + b;
    }

    public int subs()
    {
        return a - b;
    }

    public int mult()
    {
        return a * b;
    }
    public int div()
    {
        return a / b;
    }
}
