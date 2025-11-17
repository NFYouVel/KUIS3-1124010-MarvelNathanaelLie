package quiz3.models;

import java.util.ArrayList;
import java.util.List;

public class StatisticList<T extends Number> {
    private List<T> list;

    public StatisticList() {
        this.list = new ArrayList<>();
    }

    public void addList(T value) throws InvalidInputException{
        if (value.doubleValue() <= 0 || value.doubleValue() >= 0) {
            this.list.add(value);
            this.list.sort(null);
        } else {
            throw new InvalidInputException("Input tidak valid atau bukan angka!");
        }
    }

    public double getAverage() throws EmptyListException{
        double size = this.list.size();
        if (size == 0) {
            throw new EmptyListException("List nya masih kosong!");
        }

        double temp_pembilang = 0;
        for (int i = 0; i < size; i++) {
            temp_pembilang += list.get(i).doubleValue();
        }

        return temp_pembilang / size;
    }

    public T getMax() throws EmptyListException {
        if (list.isEmpty()) {
            throw new EmptyListException("List nya masih kosong!");
        }
        
        double max = 0;
        int index = 0;
        for (int i = 0; i < list.size(); i++) {
            if (max <= list.get(i).doubleValue()) {
                max = list.get(i).doubleValue();
                index = i;
            }
        }
        
        return this.list.get(index);
    }

    public T getMin() throws EmptyListException {
        if (list.isEmpty()) {
            throw new EmptyListException("List nya masih kosong!");
        }
        
        double min = 0;
        int index = 0;
        for (int i = 0; i < list.size(); i++) {
            if (min >= list.get(i).doubleValue()) {
                min = list.get(i).doubleValue();
                index = i;
            }
        }
        
        return this.list.get(index);
    }

    public double getMedian() throws EmptyListException{
        if (list.isEmpty()) {
            throw new EmptyListException("List nya masih kosong!");
        }

        if (list.size() / 2 == 0) {
            double one = list.get(list.size() / 2 - 1).doubleValue();
            double two = list.get(list.size() / 2).doubleValue();

            return (one + two) / 2;
        } else {
            return list.get(list.size() / 2).doubleValue();
        }
    }

}
