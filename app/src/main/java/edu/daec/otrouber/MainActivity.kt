package edu.daec.otrouber

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import com.google.firebase.FirebaseError
import com.google.firebase.database.ValueEventListener
import edu.daec.otrouber.modelo.DespensaFirebase
import edu.daec.otrouber.modelo.Item

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getSupportActionBar()?.hide();
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()
    }
}
