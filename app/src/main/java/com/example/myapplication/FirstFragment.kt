package com.example.myapplication

import android.annotation.SuppressLint
import android.graphics.PorterDuff
import android.media.MediaPlayer
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import com.example.myapplication.databinding.FragmentFirstBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment() : Fragment(), Parcelable {

    private var _binding: FragmentFirstBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    constructor(parcel: Parcel) : this()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root
    }

    @SuppressLint("ClickableViewAccessibility")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val mp = MediaPlayer.create(requireContext(), R.raw.note_c)
        binding.whiteButtons.buttonC.setOnTouchListener { v, motionEvent ->
            when (motionEvent.action) {
                MotionEvent.ACTION_DOWN -> {
                    if (mp.isPlaying) {
                        mp.stop()
                        mp.prepare()
                        mp.start()
                    } else {
                        mp.start()
                    }
                    v.background.setColorFilter(-0x1f0b8adf, PorterDuff.Mode.SRC_ATOP)
                    v.invalidate()
                }
                MotionEvent.ACTION_UP -> {
                    v.background.clearColorFilter()
                    v.invalidate()
                }
            }
            return@setOnTouchListener false
        }
        val mp1 = MediaPlayer.create(requireContext(), R.raw.note_d)
        binding.whiteButtons.buttonD.setOnTouchListener { v, motionEvent ->
            when (motionEvent.action) {
                MotionEvent.ACTION_DOWN -> {
                    if (mp1.isPlaying) {
                        mp1.stop()
                        mp1.prepare()
                        mp1.start()
                    } else {
                        mp1.start()
                    }
                    v.background.setColorFilter(-0x1f0b8adf, PorterDuff.Mode.SRC_ATOP)
                    v.invalidate()
                }
                MotionEvent.ACTION_UP -> {
                    v.background.clearColorFilter()
                    v.invalidate()
                }
            }
            return@setOnTouchListener false
        }
        val mp2 = MediaPlayer.create(requireContext(), R.raw.note_e)
        binding.whiteButtons.buttonE.setOnTouchListener { v, motionEvent ->
            when (motionEvent.action) {
                MotionEvent.ACTION_DOWN -> {
                    if (mp2.isPlaying) {
                        mp2.stop()
                        mp2.prepare()
                        mp2.start()
                    } else {
                        mp2.start()
                    }
                    v.background.setColorFilter(-0x1f0b8adf, PorterDuff.Mode.SRC_ATOP)
                    v.invalidate()
                }
                MotionEvent.ACTION_UP -> {
                    v.background.clearColorFilter()
                    v.invalidate()
                }
            }
            return@setOnTouchListener false
        }
        val mp3 = MediaPlayer.create(requireContext(), R.raw.note_f)
        binding.whiteButtons.buttonF.setOnTouchListener { v, motionEvent ->
            when (motionEvent.action) {
                MotionEvent.ACTION_DOWN -> {
                    if (mp3.isPlaying) {
                        mp3.stop()
                        mp3.prepare()
                        mp3.start()
                    } else {
                        mp3.start()
                    }
                    v.background.setColorFilter(-0x1f0b8adf, PorterDuff.Mode.SRC_ATOP)
                    v.invalidate()
                }
                MotionEvent.ACTION_UP -> {
                    v.background.clearColorFilter()
                    v.invalidate()
                }
            }
            return@setOnTouchListener false
        }
        val mp4 = MediaPlayer.create(requireContext(), R.raw.note_g)
        binding.whiteButtons.buttonG.setOnTouchListener { v, motionEvent ->
            when (motionEvent.action) {
                MotionEvent.ACTION_DOWN -> {
                    if (mp4.isPlaying) {
                        mp4.stop()
                        mp4.prepare()
                        mp4.start()
                    } else {
                        mp4.start()
                    }
                    v.background.setColorFilter(-0x1f0b8adf, PorterDuff.Mode.SRC_ATOP)
                    v.invalidate()
                }
                MotionEvent.ACTION_UP -> {
                    v.background.clearColorFilter()
                    v.invalidate()
                }
            }
            return@setOnTouchListener false
        }
        val mp5 = MediaPlayer.create(requireContext(), R.raw.note_a)
        binding.whiteButtons.buttonA.setOnTouchListener { v, motionEvent ->
            when (motionEvent.action) {
                MotionEvent.ACTION_DOWN -> {
                    if (mp5.isPlaying) {
                        mp5.stop()
                        mp5.prepare()
                        mp5.start()
                    } else {
                        mp5.start()
                    }
                    v.background.setColorFilter(-0x1f0b8adf, PorterDuff.Mode.SRC_ATOP)
                    v.invalidate()
                }
                MotionEvent.ACTION_UP -> {
                    v.background.clearColorFilter()
                    v.invalidate()
                }
            }
            return@setOnTouchListener false
        }
        val mp6 = MediaPlayer.create(requireContext(), R.raw.note_h)
        binding.whiteButtons.buttonH.setOnTouchListener { v, motionEvent ->
            when (motionEvent.action) {
                MotionEvent.ACTION_DOWN -> {
                    if (mp6.isPlaying) {
                        mp6.stop()
                        mp6.prepare()
                        mp6.start()
                    } else {
                        mp6.start()
                    }
                    v.background.setColorFilter(-0x1f0b8adf, PorterDuff.Mode.SRC_ATOP)
                    v.invalidate()
                }
                MotionEvent.ACTION_UP -> {
                    v.background.clearColorFilter()
                    v.invalidate()
                }
            }
            return@setOnTouchListener false
        }
        val mp7 = MediaPlayer.create(requireContext(), R.raw.note_c2)
        binding.whiteButtons.buttonC2.setOnTouchListener { v, motionEvent ->
            when (motionEvent.action) {
                MotionEvent.ACTION_DOWN -> {
                    if (mp7.isPlaying) {
                        mp7.stop()
                        mp7.prepare()
                        mp7.start()
                    } else {
                        mp7.start()
                    }
                    v.background.setColorFilter(-0x1f0b8adf, PorterDuff.Mode.SRC_ATOP)
                    v.invalidate()
                }
                MotionEvent.ACTION_UP -> {
                    v.background.clearColorFilter()
                    v.invalidate()
                }
            }
            return@setOnTouchListener false
        }
        val mp8 = MediaPlayer.create(requireContext(), R.raw.cis)
        binding.blackButtons.buttoncis.setOnTouchListener { v, motionEvent ->
            when (motionEvent.action) {
                MotionEvent.ACTION_DOWN -> {
                    if (mp8.isPlaying) {
                        mp8.stop()
                        mp8.prepare()
                        mp8.start()
                    } else {
                        mp8.start()
                    }
                    v.background.setColorFilter(-0x1f0b8adf, PorterDuff.Mode.SRC_ATOP)
                    v.invalidate()
                }
                MotionEvent.ACTION_UP -> {
                    v.background.clearColorFilter()
                    v.invalidate()
                }
            }
            return@setOnTouchListener false
        }
        val mp9 = MediaPlayer.create(requireContext(), R.raw.dis)
        binding.blackButtons.buttondis.setOnTouchListener { v, motionEvent ->
            when (motionEvent.action) {
                MotionEvent.ACTION_DOWN -> {
                    if (mp9.isPlaying) {
                        mp9.stop()
                        mp9.prepare()
                        mp9.start()
                    } else {
                        mp9.start()
                    }
                    v.background.setColorFilter(-0x1f0b8adf, PorterDuff.Mode.SRC_ATOP)
                    v.invalidate()
                }
                MotionEvent.ACTION_UP -> {
                    v.background.clearColorFilter()
                    v.invalidate()
                }
            }
            return@setOnTouchListener false
        }
        val mp10 = MediaPlayer.create(requireContext(), R.raw.fis)
        binding.blackButtons.buttonfis.setOnTouchListener { v, motionEvent ->
            when (motionEvent.action) {
                MotionEvent.ACTION_DOWN -> {
                    if (mp10.isPlaying) {
                        mp10.stop()
                        mp10.prepare()
                        mp10.start()
                    } else {
                        mp10.start()
                    }
                    v.background.setColorFilter(-0x1f0b8adf, PorterDuff.Mode.SRC_ATOP)
                    v.invalidate()
                }
                MotionEvent.ACTION_UP -> {
                    v.background.clearColorFilter()
                    v.invalidate()
                }
            }
            return@setOnTouchListener false
        }
        val mp11 = MediaPlayer.create(requireContext(), R.raw.gis)
        binding.blackButtons.buttongis.setOnTouchListener { v, motionEvent ->
            when (motionEvent.action) {
                MotionEvent.ACTION_DOWN -> {
                    if (mp11.isPlaying) {
                        mp11.stop()
                        mp11.prepare()
                        mp11.start()
                    } else {
                        mp11.start()
                    }
                    v.background.setColorFilter(-0x1f0b8adf, PorterDuff.Mode.SRC_ATOP)
                    v.invalidate()
                }
                MotionEvent.ACTION_UP -> {
                    v.background.clearColorFilter()
                    v.invalidate()
                }
            }
            return@setOnTouchListener false
        }
        val mp12 = MediaPlayer.create(requireContext(), R.raw.ais)
        binding.blackButtons.buttonais.setOnTouchListener { v, motionEvent ->
            when (motionEvent.action) {
                MotionEvent.ACTION_DOWN -> {
                    if (mp12.isPlaying) {
                        mp12.stop()
                        mp12.prepare()
                        mp12.start()
                    } else {
                        mp12.start()
                    }
                    v.background.setColorFilter(-0x1f0b8adf, PorterDuff.Mode.SRC_ATOP)
                    v.invalidate()
                }
                MotionEvent.ACTION_UP -> {
                    v.background.clearColorFilter()
                    v.invalidate()
                }
            }
            return@setOnTouchListener false
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<FirstFragment> {
        override fun createFromParcel(parcel: Parcel): FirstFragment {
            return FirstFragment(parcel)
        }

        override fun newArray(size: Int): Array<FirstFragment?> {
            return arrayOfNulls(size)
        }
    }
//    private fun rotateTxt(text: String): String {
//
//
//    }
}
