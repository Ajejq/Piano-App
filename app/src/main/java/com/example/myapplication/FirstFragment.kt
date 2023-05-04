package com.example.myapplication

import android.annotation.SuppressLint
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
        binding.whiteButtons.buttonC.setOnTouchListener { _, motionEvent ->
            if (motionEvent.action == MotionEvent.ACTION_DOWN) {
                if (mp.isPlaying) {
                    mp.stop()
                    mp.prepare()
                    mp.start()
                } else {
                    mp.start()
                }
            }
            return@setOnTouchListener true
        }
        val mp1 = MediaPlayer.create(requireContext(), R.raw.note_d)
        binding.whiteButtons.buttonD.setOnTouchListener { _, motionEvent ->
            if (motionEvent.action == MotionEvent.ACTION_DOWN) {
                if (mp1.isPlaying) {
                    mp1.stop()
                    mp1.prepare()
                    mp1.start()
                } else {
                    mp1.start()
                }
            }
            return@setOnTouchListener true
        }
        val mp2 = MediaPlayer.create(requireContext(), R.raw.note_e)
        binding.whiteButtons.buttonE.setOnTouchListener { _, motionEvent ->
            if (motionEvent.action == MotionEvent.ACTION_DOWN) {
                if (mp2.isPlaying) {
                    mp2.stop()
                    mp2.prepare()
                    mp2.start()
                } else {
                    mp2.start()
                }
            }
            return@setOnTouchListener true
        }
        val mp3 = MediaPlayer.create(requireContext(), R.raw.note_f)
        binding.whiteButtons.buttonF.setOnTouchListener { _, motionEvent ->
            if (motionEvent.action == MotionEvent.ACTION_DOWN) {
                if (mp3.isPlaying) {
                    mp3.stop()
                    mp3.prepare()
                    mp3.start()
                } else {
                    mp3.start()
                }
            }
            return@setOnTouchListener true
        }
        val mp4 = MediaPlayer.create(requireContext(), R.raw.note_g)
        binding.whiteButtons.buttonG.setOnTouchListener { _, motionEvent ->
            if (motionEvent.action == MotionEvent.ACTION_DOWN) {
                if (mp4.isPlaying) {
                    mp4.stop()
                    mp4.prepare()
                    mp4.start()
                } else {
                    mp4.start()
                }
            }
            return@setOnTouchListener true
        }
        val mp5 = MediaPlayer.create(requireContext(), R.raw.note_a)
        binding.whiteButtons.buttonA.setOnTouchListener { _, motionEvent ->
            if (motionEvent.action == MotionEvent.ACTION_DOWN) {
                if (mp5.isPlaying) {
                    mp5.stop()
                    mp5.prepare()
                    mp5.start()
                } else {
                    mp5.start()
                }
            }
            return@setOnTouchListener true
        }
        val mp6 = MediaPlayer.create(requireContext(), R.raw.note_h)
        binding.whiteButtons.buttonH.setOnTouchListener { _, motionEvent ->
            if (motionEvent.action == MotionEvent.ACTION_DOWN) {
                if (mp6.isPlaying) {
                    mp6.stop()
                    mp6.prepare()
                    mp6.start()
                } else {
                    mp6.start()
                }
            }
            return@setOnTouchListener true
        }
        val mp7 = MediaPlayer.create(requireContext(), R.raw.note_c2)
        binding.whiteButtons.buttonC2.setOnTouchListener { _, motionEvent ->
            if (motionEvent.action == MotionEvent.ACTION_DOWN) {
                if (mp7.isPlaying) {
                    mp7.stop()
                    mp7.prepare()
                    mp7.start()
                } else {
                    mp7.start()
                }
            }
            return@setOnTouchListener true
        }
        val mp8 = MediaPlayer.create(requireContext(), R.raw.cis)
        binding.blackButtons.buttoncis.setOnTouchListener { _, motionEvent ->
            if (motionEvent.action == MotionEvent.ACTION_DOWN) {
                if (mp8.isPlaying) {
                    mp8.stop()
                    mp8.prepare()
                    mp8.start()
                } else {
                    mp8.start()
                }
            }
            return@setOnTouchListener true
        }
        val mp9 = MediaPlayer.create(requireContext(), R.raw.dis)
        binding.blackButtons.buttondis.setOnTouchListener { _, motionEvent ->
            if (motionEvent.action == MotionEvent.ACTION_DOWN) {
                if (mp9.isPlaying) {
                    mp9.stop()
                    mp9.prepare()
                    mp9.start()
                } else {
                    mp9.start()
                }
            }
            return@setOnTouchListener true
        }
        val mp10 = MediaPlayer.create(requireContext(), R.raw.fis)
        binding.blackButtons.buttonfis.setOnTouchListener { _, motionEvent ->
            if (motionEvent.action == MotionEvent.ACTION_DOWN) {
                if (mp10.isPlaying) {
                    mp10.stop()
                    mp10.prepare()
                    mp10.start()
                } else {
                    mp10.start()
                }
            }
            return@setOnTouchListener true
        }
        val mp11 = MediaPlayer.create(requireContext(), R.raw.gis)
        binding.blackButtons.buttongis.setOnTouchListener { _, motionEvent ->
            if (motionEvent.action == MotionEvent.ACTION_DOWN) {
                if (mp11.isPlaying) {
                    mp11.stop()
                    mp11.prepare()
                    mp11.start()
                } else {
                    mp11.start()
                }
            }
            return@setOnTouchListener true
        }
        val mp12 = MediaPlayer.create(requireContext(), R.raw.ais)
        binding.blackButtons.buttonais.setOnTouchListener { _, motionEvent ->
            if (motionEvent.action == MotionEvent.ACTION_DOWN) {
                if (mp12.isPlaying) {
                    mp12.stop()
                    mp12.prepare()
                    mp12.start()
                } else {
                    mp12.start()
                }
            }
            return@setOnTouchListener true
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
}