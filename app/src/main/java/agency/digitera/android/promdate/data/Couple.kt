package agency.digitera.android.promdate.data

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(primaryKeys = ["u1_id", "u2_id"])
data class Couple(
    @Embedded(prefix = "u1_")
    var user1: User = User(),

    @Embedded(prefix = "u2_")
    var user2: User = User()
)