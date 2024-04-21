package suma_liczb_rekurencyjnie;

class Suma
{
    public int obliczSume (int liczba)
    {
        if (liczba <= 1)
            return 1;
        else
            return liczba + obliczSume(liczba -1);
    };
};

public class Main
{
    public static void main(String[] args)
    {
        Suma oblicz = new Suma();
        System.out.println("Suma = " + oblicz.obliczSume(100) + ".");
    }
}
