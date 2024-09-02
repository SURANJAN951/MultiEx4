//yaha dono me se koi class Thread ko extends nhi kar rahi hai,
// to Threads aur inn classes ke bich koi relation nhi hai aur aap chahte hai
// ki nya thread ban jaye to aapko explicitly thread ka object banana padega
class Mythreadk implements Runnable{
    public void run(){
        System.out.println("I am happy");
    }
}

class Mythread4 implements Runnable{
    public void run(){
        System.out.println("I am sad");
        try {
            for (int i = 0; i < 2; i++) {
                System.out.println("Very sad");
                Thread.sleep(2000);//Ham thread ko bol rahe hai ki 2 sec ke liye so jao
            }
        }
        catch(Exception e){
            System.out.println("Some problem");

        }

    }

}


public class MultiEx4 {

    public static void main(String[] args) {

        Mythreadk t2 = new Mythreadk();
        Mythread4 t3 = new Mythread4();

//        t2.start();
//        t3.start(); Error because Runnable interface me sirf ek hi method hoti hai, run().
//        Isme start() method nahi hota.start() method Thread class ka part hai,
//        aur isi method ka kaam hota hai ek naya thread shuru karna.

        //Jab aap Runnable interface ko implement karte ho, to aap run() method
        // ko define karte ho. Is method me aap wo code likhte ho jo
        // aap parallel (concurrently) execute karna chahte ho.

        //Runnable object ko execute karne ke liye, aap usko Thread object
        // ke constructor me pass karte ho. which is given below:-

        Thread td = new Thread(t2);
        Thread td2 = new Thread(t3);

        td.start();
        td2.start();

    }
}
