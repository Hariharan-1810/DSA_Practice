public class bag
{
    public static void main(String[] args)
    {
        int value[] = {60, 100, 120};
        int weight[] = {10, 20, 30};

        int maxweight = 50;

        int n = value.length;
        int ratio[] = new int [n];

        for(int i=0; i<n ;i++)
        {
            ratio[i] = value[i] / weight[i];
        }

        int totalvalue = 0;
        int totalweight = 0;

        for(int i=0; i<n; i++)
        {
            for(int j=i+1; j<n; j++)
            {
                if(ratio[i] < ratio[j])
                {
                    int temp = ratio[i];
                    ratio[i] = ratio[j];
                    ratio[j] = temp;

                    int tempValue = value[i];
                    value[i] = value[j];
                    value[j] = tempValue;

                    int tempWeight = weight[i];
                    weight[i] = weight[j];
                    weight[j] = tempWeight;
                }
            }
        }

        for(int i=0; i<n; i++)
        {
            if(totalweight + weight[i] <= maxweight)
            {
                totalweight += weight[i];
                totalvalue += value[i];
            }
            else
            {
                int remainingWeight = maxweight - totalweight;
                totalvalue += (ratio[i] * remainingWeight);
                break;
            }
        }
        System.out.println("Total Value: " + totalvalue);

    }
}
