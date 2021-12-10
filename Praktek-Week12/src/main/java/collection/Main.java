package collection;

import java.io.*;
import java.util.*;
import com.google.gson.*;
import com.google.gson.reflect.TypeToken;

public class Main {
	public static void main(String[] args) {
        Gson gson = new Gson();
        try {
            ArrayList<Barang> produk = gson.fromJson(
              new FileReader("D:\\Documents\\POLBAN\\Semester 3\\Pemrograman Berorientasi Object\\Praktek\\Week12\\barang.json"), 
              new TypeToken<ArrayList<Barang>>() {}.getType()
            );
            for(int i=0;i<produk.size();i++){
                System.out.println((i+1) + ". " + produk.get(i).toString());
            }
        }catch (JsonIOException | JsonSyntaxException | FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
