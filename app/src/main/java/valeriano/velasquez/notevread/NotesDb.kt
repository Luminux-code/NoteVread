package valeriano.velasquez.notevread

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Notes::class], version = 1)
abstract class AppDataBase : RoomDatabase(){
    abstract fun NotesDao(): NotesDao

}

