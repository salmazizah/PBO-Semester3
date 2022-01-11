package latihan;

public class Main{
    
    Thread thread;
    int jumlah = 7;
    
    public static void main(String[] args) {
        Main test = new Main();
        test.proses_satu();
        test.proses_dua();
    }
    
    void proses_satu(){
         thread = new Thread(){
            public void run(){
                try{
                    for(int a=1; a<=jumlah; a++){
                        System.out.println("Proses 1: " + a);
                        sleep(100);
                    }
                }catch(InterruptedException ex){
                    ex.printStackTrace();
                }
            }
        };
         thread.start();
    }
    
    void proses_dua(){
            thread = new Thread(){
            public void run(){
                try{
                    for(int a=1; a<=jumlah; a++){
                        System.out.println("Proses 2: " + a);
                        sleep(500);
                    }
                }catch(InterruptedException ex){
                    ex.printStackTrace();
                }
            }
        };
         thread.start();
    }
}
