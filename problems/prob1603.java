package problems;

public class prob1603 {
 


    int big,medium,small;
    public static void main(String[] args) {
        prob1603 a=new prob1603();
        int big=1;
        int medium=1;
        int small=0;
        a.ParkingSystem(big,medium,small);
        int carType=3;
        System.out.println(a.addCar(carType));
    }
    void ParkingSystem(int big, int medium, int small) {
        this.big=big;
        this.medium=medium;
        this.small=small;
    }
    
     boolean addCar(int carType) {
       
        if(big>=1 && carType==1){
            big--;
            return true;
        }
        else if(medium>=1 && carType==2){
            medium--;
            return true;
        }
        else if(small>=1 && carType==3){
            small--;
            return true;
        }else{
            return false;
        }
    }
}
   
}
