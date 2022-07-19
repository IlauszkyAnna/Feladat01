public class Feladat01 {

    public int feladat01(String[] szinek){

        int res=0;
        if(szinek==null){
            System.out.println("Üres tömb");
            return res;
        }

        int len= szinek.length;

        for (int i=2; i<len+1; i++){
            res+=binomial(len,i);
        }

        System.out.println(res);
        return res;

    }

    //a number bemenet faktoriálisát számolja ki
    public int factor(int number){
        int result=1;
        for (int i=1; i<number+1; i++){
            result=result*i;
        }
        return result;
    }

    //kiszámolja hogy az up darabnyi számból hány féle képpen lehet down darabnyi számot kiválasztani
    public int binomial(int up, int down){
        return (factor(up))/(factor(down)*factor(up-down));
    }
}

