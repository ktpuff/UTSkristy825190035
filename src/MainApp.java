import java.util.Scanner;

//kristy tiffani 825190035
//saya membuat program pembelian iklan
//user atau buyer akan memilih jenis iklan apa yang akan mereka beli
//lalu mereka harus menginput data
// jika sudah, price yang harus dibayar akan muncul
// user akan memasukan jumlah uang yang mereka punya dan jika ada kembalian maka akan dikembalikan
public class MainApp {
    public static void main (String[] args){
        String name;
        int phone;
        int moneyy;
        String cate;
        String judul;

        Scanner input = new Scanner(System.in);

        System.out.println("Program Pembelian Jasa Iklan");
        System.out.println("--------------------------------------");
        System.out.println("Choose the advertisement type your want to purchase");
        System.out.println("[1] Simple words Advertisement ");
        System.out.println("[2] Advertisement with photo ");
        System.out.println("[3] Advertisement with Video");
        System.out.print("Enter Number of choice : ");
        int number =input.nextInt();


        switch (number) {
            case 1 -> {
                SloganAd order1 = new SloganAd();
                System.out.println("\n--------------------------------------");
                System.out.println("Enter Data!");

                input.nextLine();
                System.out.print("name : ");
                name = input.nextLine();
                order1.setContact_name(name);

                System.out.print("no telephone (9 digit) : ");
                phone = input.nextInt();
                order1.setNotlp(phone);

                System.out.print("Adverts Category : "); //example like foods, goodies, electronic
                cate = input.nextLine();
                order1.setCategory(cate);

                input.nextLine();
                System.out.print("Judul Iklan : ");
                judul = input.nextLine();
                order1.setJudul_iklan(judul);

                order1.print();

                System.out.println("\n--------------------------------------");
                System.out.print("enter money : ");
                moneyy = input.nextInt();
                System.out.print("kembalian :" + order1.price(moneyy));
            }
            case 2 -> {
                PhotoAd order2 = new PhotoAd();
                System.out.println("\n--------------------------------------");
                System.out.println("Enter Data!");

                input.nextLine();
                System.out.print("name : ");
                name = input.nextLine();
                order2.setContact_name(name);

                System.out.print("no telephone (9 digit) : ");
                phone = input.nextInt();
                order2.setNotlp(phone);

                System.out.print("Adverts Category : ");//example like foods, goodies, electronic
                cate = input.nextLine();
                order2.setCategory(cate);

                input.nextLine();
                System.out.print("Judul Iklan : ");
                judul = input.nextLine();
                order2.setJudul_iklan(judul);

                System.out.print("Photo Size (KB) : ");
                double psize = input.nextDouble();
                order2.setPhoto_size(psize);

                input.nextLine();
                System.out.print("img file type : "); // example like jpg, png, gif, dst
                String pfile = input.nextLine();
                order2.setImg_file_type(pfile);

                order2.print();

                System.out.println("\n--------------------------------------");
                System.out.print("enter money : ");
                moneyy = input.nextInt();
                System.out.print("kembalian :" + order2.price(moneyy));
            }
            case 3 -> {
                VideoAd order3 = new VideoAd();
                System.out.println("\n--------------------------------------");
                System.out.println("Enter Data!");

                input.nextLine();
                System.out.print("name : ");
                name = input.nextLine();
                order3.setContact_name(name);

                System.out.print("no telephone (9 digit) : ");
                phone = input.nextInt();
                order3.setNotlp(phone);

                System.out.print("Adverts Category : ");//example like foods, goodies, electronic
                cate = input.nextLine();
                order3.setCategory(cate);

                input.nextLine();
                System.out.print("Judul Iklan : ");
                judul = input.nextLine();
                order3.setJudul_iklan(judul);

                System.out.print("Video Size (KB) : ");
                double vsize = input.nextDouble();
                order3.setVideo_size(vsize);

                input.nextLine();
                System.out.print("Video file type : "); // example like mp4, avi, dst
                String vfile = input.nextLine();
                order3.setVideo_type_file(vfile);

                order3.print();

                System.out.println("\n--------------------------------------");
                System.out.print("enter money : ");
                moneyy = input.nextInt();
                System.out.print("kembalian :" + order3.price(moneyy));
            }
        }
    }
}
