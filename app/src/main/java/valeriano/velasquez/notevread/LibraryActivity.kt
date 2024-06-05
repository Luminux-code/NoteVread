package valeriano.velasquez.notevread

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LibraryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_library)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val readingNowButton = findViewById<ImageButton>(R.id.readingNow)

        readingNowButton.setOnClickListener {
            val intent = Intent(this, ReadingNowActivity::class.java)
            startActivity(intent)
        }

        val forReadingButton = findViewById<ImageButton>(R.id.forReading)

        forReadingButton.setOnClickListener {
            val intent = Intent(this, ForReadingActivity::class.java)
            startActivity(intent)
        }
        val colectionsButton = findViewById<ImageButton>(R.id.colectionsBooks)

        colectionsButton.setOnClickListener {
            val intent = Intent(this, ColectionsActivity::class.java)
            startActivity(intent)
        }
        val favoritesButton = findViewById<ImageButton>(R.id.favoritesBooks)

        favoritesButton.setOnClickListener {
            val intent = Intent(this, FavoritesActivity::class.java)
            startActivity(intent)
        }
    }
}