package facci.dayanaraburgasi.roomwordsample;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "practica_word")

public class Word {
    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "word")
    private final String mWord;

    public Word(@NonNull String word) {this.mWord = word;}

    public String getWord(){return this.mWord;}
}
