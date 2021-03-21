package com.example.tema1.fragment

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.tema1.R
import com.example.tema1.`interface`.ActivityFragmentCommunication
import com.example.tema1.activity.Activity2

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [F2A2.newInstance] factory method to
 * create an instance of this fragment.
 */
class F2A2 : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    private var activityFragmentCommunication: ActivityFragmentCommunication? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.f2a2, container, false)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment Fragment3.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            F2A2().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val button = view.findViewById<Button>(R.id.button_f2a2_to_f3a2)

        button.setOnClickListener {
            if (activityFragmentCommunication != null) {
                activityFragmentCommunication?.replaceF2A2ToF3A2()
            }
        }

        val button2 = view.findViewById<Button>(R.id.button_back_f1a2)

        button2.setOnClickListener {
            if (activityFragmentCommunication != null) {
                activityFragmentCommunication?.goBackF1A2()
            }
        }

        val button3 = view.findViewById<Button>(R.id.button_close)

        button3.setOnClickListener {
            if (activityFragmentCommunication != null) {
                activity?.finish()
            }
        }
    }
    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is ActivityFragmentCommunication) {
            this.activityFragmentCommunication = context
        }
    }

}