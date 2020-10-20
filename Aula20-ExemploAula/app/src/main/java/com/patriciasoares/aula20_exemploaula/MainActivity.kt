package com.patriciasoares.aula20_exemploaula

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        floating_action_button.setOnClickListener {
            MaterialAlertDialogBuilder(this)
                .setTitle("Título")
                .setMessage("Cuidado com as formatações")
                .setNegativeButton("Não") { dialog, which ->
                    // Respond to negative button press
                }
                .setPositiveButton("Sim") { dialog, which ->
                    // Respond to positive button press
                }
                .show()
        }
    }
}