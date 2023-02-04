import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tvtext : TextView= findViewById(R.id.tvtext)
        val bdbutton1 :Button =findViewById(R.id.bdbutton1)
        val btbutton2: Button=findViewById(R.id.btbutton2)
        val btbutton3 : Button=findViewById(R.id.btbutton3)
        val linearLayout:LinearLayout=findViewById(R.id.linearLayout)
        var fontSize : Float= 5f
         var fontColor : Int = 0
        var bgcolor : Int =0
        bdbutton1.setOnClickListener{
            tvtext.setTextSize(fontSize);
            fontSize=(fontSize+5)%50
        }
        btbutton2.setOnClickListener{
            when (fontColor%3)
            {
                0-> tvtext.setTextColor(Color.RED)
                1-> tvtext.setTextColor(Color.GREEN)
                2-> tvtext.setTextColor(Color.BLUE)

            }
            fontColor++
        }
        btbutton3.setOnClickListener {
            when (bgcolor%3)
            {
                0-> linearLayout.setBackgroundColor(Color.BLACK)
                1-> linearLayout.setBackgroundColor(Color.GREEN)
                2-> linearLayout.setBackgroundColor(Color.BLUE)

            }
            bgcolor++
        }
    }
}
