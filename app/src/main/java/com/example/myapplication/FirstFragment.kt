package com.example.myapplication

import android.media.MediaPlayer
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
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
    ): View? {

        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val mp = MediaPlayer.create(requireContext(), R.raw.note_c)
        binding.whiteButtons.buttonC.setOnClickListener {
            if (mp.isPlaying) {
                mp.stop()
                mp.prepare()
                mp.start()
            } else {
                mp.start()
            }
        }
        val mp1 = MediaPlayer.create(requireContext(), R.raw.note_d)
        binding.whiteButtons.buttonD.setOnClickListener {
            if (mp1.isPlaying) {
                mp1.stop()
                mp1.prepare()
                mp1.start()
            } else {
                mp1.start()
            }
        }
        val mp2 = MediaPlayer.create(requireContext(), R.raw.note_e)
        binding.whiteButtons.buttonE.setOnClickListener {
            if (mp2.isPlaying) {
                mp2.stop()
                mp2.prepare()
                mp2.start()
            } else {
                mp2.start()
            }
        }
        val mp3 = MediaPlayer.create(requireContext(), R.raw.note_f)
        binding.whiteButtons.buttonF.setOnClickListener {
            if (mp3.isPlaying) {
                mp3.stop()
                mp3.prepare()
                mp3.start()
            } else {
                mp3.start()
            }
        }
        val mp4 = MediaPlayer.create(requireContext(), R.raw.note_g)
        binding.whiteButtons.buttonG.setOnClickListener {
            if (mp4.isPlaying) {
                mp4.stop()
                mp4.prepare()
                mp4.start()
            } else {
                mp4.start()
            }
        }
        val mp5 = MediaPlayer.create(requireContext(), R.raw.note_a)
        binding.whiteButtons.buttonA.setOnClickListener {
            if (mp5.isPlaying) {
                mp5.stop()
                mp5.prepare()
                mp5.start()
            } else {
                mp5.start()
            }
        }
        val mp6 = MediaPlayer.create(requireContext(), R.raw.note_h)
        binding.whiteButtons.buttonH.setOnClickListener {
            if (mp6.isPlaying) {
                mp6.stop()
                mp6.prepare()
                mp6.start()
            } else {
                mp6.start()
            }
        }
        val mp7 = MediaPlayer.create(requireContext(), R.raw.note_c2)
        binding.whiteButtons.buttonC2.setOnClickListener {
            if (mp7.isPlaying) {
                mp7.stop()
                mp7.prepare()
                mp7.start()
            } else {
                mp7.start()
            }
        }
        val mp8 = MediaPlayer.create(requireContext(), R.raw.cis)
        binding.blackButtons.buttoncis.setOnClickListener {
            if (mp8.isPlaying) {
                mp8.stop()
                mp8.prepare()
                mp8.start()
            } else {
                mp8.start()
            }
        }
        val mp9 = MediaPlayer.create(requireContext(), R.raw.dis)
        binding.blackButtons.buttondis.setOnClickListener {
            if (mp9.isPlaying) {
                mp9.stop()
                mp9.prepare()
                mp9.start()
            } else {
                mp9.start()
            }
        }
        val mp10 = MediaPlayer.create(requireContext(), R.raw.fis)
        binding.blackButtons.buttonfis.setOnClickListener {
            if (mp10.isPlaying) {
                mp10.stop()
                mp10.prepare()
                mp10.start()
            } else {
                mp10.start()
            }
        }
        val mp11 = MediaPlayer.create(requireContext(), R.raw.gis)
        binding.blackButtons.buttongis.setOnClickListener {
            if (mp11.isPlaying) {
                mp11.stop()
                mp11.prepare()
                mp11.start()
            } else {
                mp11.start()
            }
        }
        val mp12 = MediaPlayer.create(requireContext(), R.raw.ais)
        binding.blackButtons.buttonais.setOnClickListener {
            if (mp12.isPlaying) {
                mp12.stop()
                mp12.prepare()
                mp12.start()
            } else {
                mp12.start()
            }
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