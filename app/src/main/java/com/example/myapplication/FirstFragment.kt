package com.example.myapplication

import android.annotation.SuppressLint
import android.graphics.Color
import android.graphics.PorterDuff
import android.media.MediaPlayer
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.view.View.OnTouchListener
import android.view.ViewGroup
import com.example.myapplication.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root
    }

    @SuppressLint("ClickableViewAccessibility")
    private fun makeOnTouchListener(mp: MediaPlayer, isBlack: Boolean): View.OnTouchListener {
        val onTouchListener = OnTouchListener { v, motionEvent ->
            when (motionEvent.action) {
                MotionEvent.ACTION_UP -> {
                    val color = if (isBlack) Color.BLACK else Color.WHITE
                    v.background.setTint(color)
                    v.invalidate()
                }
                
                MotionEvent.ACTION_DOWN -> {
                    val color = if (isBlack) Color.WHITE else Color.GRAY
                    v.background.setTint(color)
                    v.invalidate()

                    if (mp.isPlaying) {
                        mp.stop()
                        mp.prepare()
                        mp.start()
                    } else {
                        mp.start()
                    }
                }
            }
            return@OnTouchListener false
        }
        return onTouchListener
    }
    @SuppressLint("ClickableViewAccessibility")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val mp = MediaPlayer.create(requireContext(), R.raw.note_c)
        binding.whiteButtons.buttonC.button.setOnTouchListener(makeOnTouchListener(mp, false))

        val mp1 = MediaPlayer.create(requireContext(), R.raw.note_d)
        binding.whiteButtons.buttonD.button.setOnTouchListener (makeOnTouchListener(mp1, false))

        val mp2 = MediaPlayer.create(requireContext(), R.raw.note_e)
        binding.whiteButtons.buttonE.button.setOnTouchListener (makeOnTouchListener(mp2, false))

        val mp3 = MediaPlayer.create(requireContext(), R.raw.note_f)
        binding.whiteButtons.buttonF.button.setOnTouchListener (makeOnTouchListener(mp3, false))

        val mp4 = MediaPlayer.create(requireContext(), R.raw.note_g)
        binding.whiteButtons.buttonG.button.setOnTouchListener (makeOnTouchListener(mp4, false))

        val mp5 = MediaPlayer.create(requireContext(), R.raw.note_a)
        binding.whiteButtons.buttonA.button.setOnTouchListener (makeOnTouchListener(mp5, false))

        val mp6 = MediaPlayer.create(requireContext(), R.raw.note_h)
        binding.whiteButtons.buttonH.button.setOnTouchListener (makeOnTouchListener(mp6,false))

        val mp7 = MediaPlayer.create(requireContext(), R.raw.note_c2)
        binding.whiteButtons.buttonC2.button.setOnTouchListener (makeOnTouchListener(mp7,false))

        val mp8 = MediaPlayer.create(requireContext(), R.raw.cis)
        binding.blackButtons.buttonCis.button.setOnTouchListener (makeOnTouchListener(mp8, true))

        val mp9 = MediaPlayer.create(requireContext(), R.raw.dis)
        binding.blackButtons.buttonDis.button.setOnTouchListener (makeOnTouchListener(mp9, true))

        val mp10 = MediaPlayer.create(requireContext(), R.raw.fis)
        binding.blackButtons.buttonFis.button.setOnTouchListener (makeOnTouchListener(mp10, true))

        val mp11 = MediaPlayer.create(requireContext(), R.raw.gis)
        binding.blackButtons.buttonGis.button.setOnTouchListener (makeOnTouchListener(mp11, true))

        val mp12 = MediaPlayer.create(requireContext(), R.raw.ais)
        binding.blackButtons.buttonAis.button.setOnTouchListener (makeOnTouchListener(mp12, true))
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
