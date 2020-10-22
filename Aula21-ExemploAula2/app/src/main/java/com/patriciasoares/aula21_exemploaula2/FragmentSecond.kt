package com.patriciasoares.aula21_exemploaula2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_second.view.*

/**
 * A simple [Fragment] subclass.
 * Use the [FragmentSecond.newInstance] factory method to
 * create an instance of this fragment.
 */

class FragmentSecond : Fragment() {
  private lateinit var minhaView: View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        minhaView = inflater.inflate(R.layout.fragment_second, container, false)

        return minhaView
    }

    fun mudarTexto(texto: String) {
        minhaView.txtSegundoFragment.text = texto
    }

}
