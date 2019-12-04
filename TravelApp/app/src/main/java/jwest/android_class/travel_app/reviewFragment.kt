package jwest.android_class.travel_app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.ProgressBar
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import jwest.android_class.travel_app.databinding.FragmentReviewBinding


class reviewFragment : Fragment() {

    private var b: Int = 0
    private var c: Int = 0
    private lateinit var binding: FragmentReviewBinding
    lateinit var scoreNum: EditText
    lateinit var totalNum: EditText
    lateinit var resultScore: TextView
    lateinit var pieChart: ProgressBar
    lateinit var scoreButton: Button
    lateinit var totalButton: Button
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate<FragmentReviewBinding>(
            inflater,
            R.layout.fragment_review,
            container,
            false
        )

        //binding data with ID's
        scoreNum = binding.score
        totalNum = binding.total
        resultScore = binding.numberOfCalories
        pieChart = binding.statsProgressbar

        scoreButton = binding.s
        totalButton = binding.t
        scoreButton.setOnClickListener(View.OnClickListener {
            addBurned()
        })
        totalButton.setOnClickListener(View.OnClickListener {
            addConsumed()
        })

        return binding.root
    }


    fun addBurned() {
        // Update the old value:
        b = Integer.parseInt(scoreNum.getText().toString())
        updateChart()
    }

    fun addConsumed() {
        // Update the old value:
        c = Integer.parseInt(totalNum.getText().toString())
        updateChart()
    }

    private fun updateChart() {
        resultScore.setText(b.toString() + " / " + c)

        val d = b.toDouble() / c.toDouble()
        val progress = (d * 100).toInt()
        pieChart.setProgress(progress)
    }
}
