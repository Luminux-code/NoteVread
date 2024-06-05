package valeriano.velasquez.notevread
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query


@Dao
interface NotesDao {
    @Query("SELECT * FROM Notes")
    fun getAllNotes(): List<Notes>

    @Insert
    fun insert(notes: Notes)
}