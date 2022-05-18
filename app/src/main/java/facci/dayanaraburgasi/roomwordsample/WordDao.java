package facci.dayanaraburgasi.roomwordsample;


import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

@Dao
public interface WordDao {

    // allowing the insert of the same word multiple times by passing a
    // conflict resolution strategy
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(Word word);

    @Query("DELETE FROM practica_word")
    void deleteAll();

    @Query("SELECT * FROM practica_word ORDER BY word ASC")
    LiveData<List<Word>> getAlphabetizedWords();
}