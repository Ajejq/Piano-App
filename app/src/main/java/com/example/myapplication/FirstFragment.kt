package com.example.myapplication

import android.media.MediaPlayer
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myapplication.databinding.FragmentFirstBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val mp = MediaPlayer.create(requireContext(), R.raw.note_do)
        binding.buttonDo.setOnClickListener {
            mp.start()
        }
        val mp1 = MediaPlayer.create(requireContext(), R.raw.note_d)
        binding.buttonRe.setOnClickListener {
            mp1.start()
        }
        val mp2 = MediaPlayer.create(requireContext(), R.raw.note_e)
        binding.buttonMi.setOnClickListener {
            mp2.start()
        }
        val mp3 = MediaPlayer.create(requireContext(), R.raw.note_f)
        binding.buttonFa.setOnClickListener {
            mp3.start()
        }
        val mp4 = MediaPlayer.create(requireContext(), R.raw.note_g)
        binding.buttonSol.setOnClickListener {
            mp4.start()
        }
        val mp5 = MediaPlayer.create(requireContext(), R.raw.note_a)
        binding.buttonLa.setOnClickListener {
            mp5.start()
        }
        val mp6 = MediaPlayer.create(requireContext(), R.raw.note_h)
        binding.buttonSi.setOnClickListener {
            mp6.start()
        }
        val mp7 = MediaPlayer.create(requireContext(), R.raw.note_c2)
        binding.buttonDO2.setOnClickListener {
            mp7.start()
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}