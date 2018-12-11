import java.util.ArrayList;

public class Digits
{
    private ArrayList<Integer> digitList;

    public Digits(int num)
    {
        digitList = new ArrayList<Integer>();
        String strNum = String.valueOf(num);

        for(int i = 0; i<strNum.length();i++)
        {
            digitList.add(Integer.valueOf(strNum.substring(i,i+1)));
        }
    }

    public boolean isStrictlyIncreasing()
    {
        for(int i =1;i<digitList.size();i++)
        {
            if(digitList.get(i)<digitList.get(i-1))
            {
                return false;
            }
        }
        return true;
    }
}
