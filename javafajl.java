import java.io.IOException;
public class samoglasnik {
    public static void main(String[] args)
            throws IOException
    {
        String rec = "Ruka";

        rec = rec.toLowerCase();

        char[] chars = rec.toCharArray();

        int count = 0;

        for (int i = 0; i < rec.length(); i++)
        {
            if (rec.charAt(i) == 'a' || rec.charAt(i) == 'e'
                    || rec.charAt(i) == 'i'
                    || rec.charAt(i) == 'o'
                    || rec.charAt(i) == 'u')
            {

                count++;
            }
        }

        System.out.println("Ukupan broj samoglasnika je: " + count);
    }
}
