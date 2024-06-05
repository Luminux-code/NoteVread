package valeriano.velasquez.notevread

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Notes(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val description: String,
    val title: String
)
