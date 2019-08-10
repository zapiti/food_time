package br.com.zapiti.foodtime.fragment

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import br.com.zapiti.foodtime.R
import br.com.zapiti.foodtime.adapter.DiaryAdapter
import br.com.zapiti.foodtime.view.AddDiaryActivity
import kotlinx.android.synthetic.main.fragment_diary.*


class DiaryFragment : Fragment() {




    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        iniComponent()
    }

    private fun iniComponent() {
        diary_recycleview.adapter =  DiaryAdapter(ArrayList())
        diary_add_floatting.setOnClickListener {
            startActivity(Intent(activity,AddDiaryActivity::class.java))
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_diary, container, false)
    }



    override fun onAttach(context: Context) {
        super.onAttach(context)

    }


}
