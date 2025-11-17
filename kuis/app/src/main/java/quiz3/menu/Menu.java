package quiz3.menu;

import quiz3.models.EmptyListException;
import quiz3.models.InvalidInputException;
import quiz3.models.StatisticList;
import quiz3.utils.CLIUtil;

public class Menu {

    private StatisticList list = new StatisticList<>();

    public void render() {
        this.printMenu();
        int menu = CLIUtil.getInt();
        while (menu != 0) {
            try {
                switch (menu) {
                    case 1:
                        this.handleInput();
                        break;
                    case 2:
                        System.out.println(list.getAverage());
                        break;
                    case 3:
                        System.out.println(list.getMax());
                        break;
                    case 4:
                        System.out.println(list.getMin());
                        break;
                    case 5:
                        System.out.println(list.getMedian());
                        break;
                    case 6:
                        System.out.println(list.getMedian());
                        break;
                    case 0:
                        return;
                }
            } catch (EmptyListException e) {
                e.printStackTrace();
            }

            this.printMenu();
            menu = CLIUtil.getInt();
        }
    }

    private void printMenu() {
        System.out.println("======= Menu Utama ========");
        System.out.println("1. Tambah Angka");
        System.out.println("2. Tampilkan Rata-Rata");
        System.out.println("3. Tampilkan Nilai Maksimum");
        System.out.println("4. Tampilkan Nilai Minimum");
        System.out.println("5. Tampilkan Median");
        System.out.println("6. Tampilkan Daftar (Sorted)");
        System.out.println("0. Exit");
    }

    private void handleInput() {
        System.out.println("Masukkan Angka: ");
        int input = CLIUtil.getInt();
        list.addList(input);
    }
}
