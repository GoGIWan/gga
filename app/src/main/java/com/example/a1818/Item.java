package com.example.a1818;

import android.view.View;

import java.util.ArrayList;

/**
 * Simple POJO model for example
 */
@SuppressWarnings({"unused", "WeakerAccess"})



public class Item {
//    private int image;
    private String part;
    private String in_part;
    private String frist_routin;
    private String second_routin;
    private int spend_time;
    private int set_count;
    private int in_set_count;
    private int weight;
    private int in_weight;
    private int fatigue;
    private int count;
    private int frist_routin_count;
    private int in_count;
    private int frist_routin_set;
    private int second_routin_count;
    private int second_routin_set;
    private String date;
    private String time;
    private int volume;

    private View.OnClickListener requestBtnClickListener;

    public Item() {
    }

    public Item(String part, String in_part, int spend_time, int in_count, int in_weight, int in_set_count, int set_count, int weight, int fatigue, int count, String date, String time, String frist_routin, String second_routin, int frist_routin_count, int frist_routin_set, int second_routin_count, int second_routin_set) {
//        this.image = image;
        this.part = part;
        this.in_part = in_part;
        this.set_count = set_count;
        this.in_set_count = in_set_count;
        this.weight = weight;
        this.in_weight = in_weight;
        this.count = count;
        this.in_count = in_count;
        this.spend_time = spend_time;
        this.fatigue = fatigue;
        this.date = date;
        this.time = time;
        this.frist_routin = frist_routin;
        this.second_routin = second_routin;
        this.second_routin_count = second_routin_count;
        this.frist_routin_count = frist_routin_count;
        this.frist_routin_set = frist_routin_set;
        this.second_routin_set = second_routin_set;


    }
//    public int getImage() {return image;}
//
//    public  void setImage(int image) {this.image=image;}

    public String getPart() {
        return part;
    }

    public void setPart(String part) {
        this.part = part;
    }

    public String getIn_part() {
        return in_part;
    }

    public void setIn_part(String in_part) {
        this.in_part = in_part;
    }


    public String getFrist_routin() {
        return frist_routin;
    }

    public void setFrist_routin(String frist_routin) {
        this.frist_routin = frist_routin;
    }


    public String getSecond_routin() {
        return second_routin;
    }

    public void setSecond_routin(String second_routin) {
        this.second_routin = second_routin;
    }

    public int getIn_set_count() {
        return in_set_count;
    }

    public void setIn_set_count(int in_set_count) {
        this.in_set_count = in_set_count;
    }

    public int getSet_count() {
        return set_count;
    }

    public void setSet_count(int set_count) {
        this.set_count = set_count;
    }

    public int getSpend_time() {
        return spend_time;
    }

    public void setSpend_time(int spend_time) {
        this.spend_time = spend_time;
    }

    public int getIn_weight() {
        return in_weight;
    }

    public void setIn_weight(int in_weight) {
        this.in_weight = in_weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getFatigue() {
        return fatigue;
    }

    public void setFatigue(int fatigue) {
        this.fatigue = fatigue;
    }

    public int getIn_count() {
        return in_count;
    }

    public void setIn_count(int count) {
        this.count = in_count;
    }

    public int getFrist_routin_count() {
        return frist_routin_count;
    }

    public void setFrist_routin_count(int frist_routin_count) {
        this.frist_routin_count = frist_routin_count;
    }

    public int getFrist_routin_set() {
        return frist_routin_set;
    }

    public void setFrist_routin_set(int frist_routin_set) {
        this.frist_routin_set = frist_routin_set;
    }

    public int getSecond_routin_count() {
        return second_routin_count;
    }

    public void setSecond_routin_count(int second_routin_count) {
        this.second_routin_count = second_routin_count;
    }

    public int getSecond_routin_set() {
        return second_routin_set;
    }

    public void setSecond_routin_set(int second_routin_set) {
        this.second_routin_set = second_routin_set;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }


    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public View.OnClickListener getRequestBtnClickListener() {
        return requestBtnClickListener;
    }

    public void setRequestBtnClickListener(View.OnClickListener requestBtnClickListener) {
        this.requestBtnClickListener = requestBtnClickListener;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Item item = (Item) o;

        if (count != item.count) return false;
//        if (image != item.image) return false;
        if (part != null ? !part.equals(item.part) : item.part != null) return false;
        if (in_part != null ? !in_part.equals(item.in_part) : item.in_part != null) return false;
        if (frist_routin != null ? !frist_routin.equals(item.frist_routin) : item.frist_routin != null)
            return false;
        if (second_routin != null ? !second_routin.equals(item.second_routin) : item.second_routin != null)
            return false;
        if (spend_time != item.spend_time) return false;
        if (in_set_count != item.in_set_count) return false;
        if (in_weight != item.in_weight) return false;
        if (set_count != item.set_count) return false;
        if (weight != item.weight) return false;
        if (in_count != item.in_count) return false;
        if (fatigue != item.fatigue) return false;
        if (frist_routin_count != item.frist_routin_count) return false;
        if (second_routin_count != item.second_routin_count) return false;
        if (frist_routin_set != item.frist_routin_set) return false;
        if (second_routin_set != item.second_routin_set) return false;
        if (date != null ? !date.equals(item.date) : item.date != null) return false;
        return !(time != null ? !time.equals(item.time) : item.time != null);

    }

    @Override
    public int hashCode() {
        int result = part != null ? part.hashCode() : 0;
        result = 31 * result + (in_part != null ? in_part.hashCode() : 0);
        result = 31 * result + (frist_routin != null ? frist_routin.hashCode() : 0);
        result = 31 * result + (second_routin != null ? second_routin.hashCode() : 0);
        result = 31 * result + set_count;
        result = 31 * result + in_set_count;
        result = 31 * result + spend_time;
        result = 31 * result + weight;
        result = 31 * result + in_weight;
        result = 31 * result + fatigue;
        result = 31 * result + count;
        result = 31 * result + in_count;
        result = 31 * result + frist_routin_set;
        result = 31 * result + frist_routin_count;
        result = 31 * result + second_routin_set;
        result = 31 * result + second_routin_count;
//        result = 31 * result + image;
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (time != null ? time.hashCode() : 0);
        return result;
    }

    /**
     * @return List of elements prepared for tests
     */
    public static ArrayList<Item> getTestingList() {
        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item("가슴", "가슴", 10, 15, 30, 8, 8, 30, 30, 15, "3,600", "Volume", "벤치프레스30kg", "벤치프레스45kg", 5, 10, 10, 10));
        items.add(new Item("등허리", "등허리", 15, 15, 40, 10, 10, 40, 10, 15, "6,000", "Volume", "바벨로우20kg", "바벨로우30kg", 5, 10, 10, 10));
        items.add(new Item("복부", "복부", 10, 20, 30, 7, 7, 30, 10, 20, "4,200", "Volume", "풀오버13kg", "벤치프레스18kg", 5, 10, 10, 10));
        items.add(new Item("하체", "하체", 10, 20, 30, 12, 12, 30, 15, 20, "7,200", "Volume", "몸의 중량", "몸의 중량", 5, 10, 10, 10));
        items.add(new Item("어깨", "어깨", 15, 28, 40, 15, 15, 40, 20, 15, "16,800", "Volume", "몸의 중량", "몸의 중량", 5, 10, 10, 10));
        return items;

    }


}
