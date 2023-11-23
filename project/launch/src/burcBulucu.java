import java.util.Scanner;
public class burcBulucu {
    public static void main(String[] args) {
        int month, day;
        String burc="" ;
        boolean isError=false;
        Scanner inp = new Scanner(System.in);

        //ay ve gün

        System.out.print("Doğduğunuz Ay  : ");
        month = inp.nextInt();

        System.out.print("Doğduğunuz Gün :");
        day = inp.nextInt();

        if (month == 1) {
            if (day >= 1 && day <= 31) {

            if (22 > day) {
                burc ="Oğlak Burcu" ;
            } else {
                burc ="Kova Burcu" ;
            }
        } else {
                isError=true;
            }
        } else if (month == 2) {
            if(day>= 1 && day <= 28 ){
                if (day<20){
                    burc ="Kova Burcu" ;
                }else {
                    burc ="Koç Burcu" ;
                }
            }else {
                isError=true;
            }

        } else if (month==3) {
            if (day>=1 && day <=31){
                if(day<21 ){
                    burc = "Balık";
                } else {
                    burc = "Koç";
                }
            } else {
                isError=true;
            }
        }else if (month==4){
            if (day>=1 && day <=30){
                if(day<22 ){
                    burc = "Koç";
                } else {
                    burc = "Boğa";
                }
            } else {
                isError=true;
            }
        } else if (month==5) {
            if (day>=1 && day <=31){
                if(day<22 ){
                    burc = "Boğa";
                } else {
                    burc = "İkizler";
                }
            } else {
                isError=true;
            }
        } else if (month==6) {
            if (day>=1 && day <=30){
                if(day<23 ){
                    burc = "İkizler";
                } else {
                    burc = "Yengeç";
                }
            } else {
                isError=true;
            }
        }else if (month==7){
            if (day>=1 && day <=31){
                if(day<23 ){
                    burc = "Yengeç";
                } else {
                    burc = "Aslan";
                }
            } else {
                isError=true;
            }
        } else if (month==8) {
            if (day>=1 && day <=31){
                if(day<23 ){
                    burc = "Aslan";
                } else {
                    burc = "Başak";
                }
            } else {
                isError=true;
            }
        } else if (month==9) {
            if (day>=1 && day <=30){
                if(day<23 ){
                    burc = "Başak";
                } else {
                    burc = "Terazi";
                }
            } else {
                isError=true;
            }
        } else if (month==10) {
            if (day>=1 && day <=31){
                if(day<23 ){
                    burc = "Terazi";
                } else {
                    burc = "Akrep";
                }
            } else {
                isError=true;
            }
        } else if (month==11) {
            if (day>=1 && day <=30){
                if(day<22 ){
                    burc = "Akrep";
                } else {
                    burc = "Yay";
                }
            } else {
                isError=true;
            }
        } else if (month==12) {
            if (day>=1 && day <=31){
                if(day<22 ){
                    burc = "Yay";
                } else {
                    burc = "Oğlak";
                }
            } else {
                isError=true;
            }

        }
        if (isError) {
            System.out.println("Hatalı Giriş tekrar Dene");

        }else {
            System.out.println("burcunuz :" + burc);
        }



    }
}