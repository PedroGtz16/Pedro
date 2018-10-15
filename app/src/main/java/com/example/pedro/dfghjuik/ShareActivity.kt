package kot.app.com.myapplication

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_share.*

class ShareActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_share)
        X.setOnClickListener {
            val intent: Intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    Copiar.setOnClickListener {
        Toast.makeText(this,"URL copiado",Toast.LENGTH_LONG).show()

    }
        face.setOnClickListener ({
            var gourl = Intent(Intent.ACTION_VIEW,Uri.parse("https://www.facebook.com"))
            startActivity(gourl)
        })
        insta.setOnClickListener ({
            var gourl1 = Intent(Intent.ACTION_VIEW,Uri.parse("https://www.instagram.com/?hl=es-la"))
            startActivity(gourl1)
        })
        twit.setOnClickListener ({
            var gourl2 = Intent(Intent.ACTION_VIEW,Uri.parse("https://twitter.com/?lang=es"))
            startActivity(gourl2)
        })
        goo.setOnClickListener ({
            var gourl2 = Intent(Intent.ACTION_VIEW,Uri.parse("https://plus.google.com/?hl=es"))
            startActivity(gourl2)
        })

}
}
