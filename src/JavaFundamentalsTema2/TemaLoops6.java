package JavaFundamentalsTema2;

public class TemaLoops6 {
    public static void main(String[] args) {

        TemaLoops6 object = new TemaLoops6();
        int[] myIntArray = {1, 0, -1, 2, 3, 2};
        object.findRange(myIntArray);


    }

    public int findRange(int[] intArray) {
        int smallesteNumber = intArray[0];
        int biggestNumber = intArray[0];
        for (int i=0;i<=intArray.length-1;i++){
            if (smallesteNumber>intArray[i]){
                smallesteNumber=intArray[i];
            }

        }
        for (int i=0;i<=intArray.length -1;i++){
            if(biggestNumber<intArray[i]){
                biggestNumber=intArray[i];
            }
        }
//        int number = biggestNumber - smallesteNumber;
       System.out.println(biggestNumber-smallesteNumber);
        return biggestNumber - smallesteNumber;
    }
}

