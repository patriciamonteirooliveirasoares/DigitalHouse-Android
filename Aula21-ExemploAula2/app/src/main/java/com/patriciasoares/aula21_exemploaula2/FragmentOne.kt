package com.patriciasoares.aula21_exemploaula2

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_one.view.*

/**
 * A simple [Fragment] subclass.
 * Use the [FragmentOne.newInstance] factory method to
 * create an instance of this fragment.
 */
class FragmentOne : Fragment() {

    lateinit var clicou: iClicou


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_one, container, false)

        view.btnClica.setOnClickListener {
            clicou.clicou("Clicou mesmo!")
        }


        return view
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)

        clicou = context as iClicou


    }
}