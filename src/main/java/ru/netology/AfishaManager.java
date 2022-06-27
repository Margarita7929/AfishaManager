package ru.netology;

public class AfishaManager {

    private int limit;

    public AfishaManager(int limit) {
         this.limit = limit;
     }

         public AfishaManager() {
             limit = 10;
         }


    private String[] namesOfFilms = new String[0];

    public void save(String item) {
        String[] tmp = new String[namesOfFilms.length + 1];
        for (int i = 0; i < namesOfFilms.length; i++) {
            tmp[i] = namesOfFilms[i];
        }
        tmp[tmp.length - 1] = item;
        namesOfFilms = tmp;

    }


    public String[] findLast() {
        int resultLength;
        if(namesOfFilms.length < limit) {
            resultLength = namesOfFilms.length;
        } else {
            resultLength = limit;
        }
        String[] all = new String[resultLength];
        for (int i = 0; i < all.length; i++) {
            all[i] = namesOfFilms[namesOfFilms.length - 1 - i];
        }
        return all;
    }

    public String[] findAll() {
        return namesOfFilms;
    }
}
