package mmv.jrp.helu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        logo_helu.setOnClickListener(View.OnClickListener {
            var intent = Intent(this, pruebas::class.java)
            startActivity(intent)
        })
    }


}
