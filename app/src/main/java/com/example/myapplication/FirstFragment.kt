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
        binding.buttonDo.setOnClickListener {
            if(mp.isPlaying) {
                mp.stop()
                mp.prepare()
                mp.start()
            } else {
                mp.start()
            }
        }

        val mp1 = MediaPlayer.create(requireContext(), R.raw.note_d)
        binding.buttonRe.setOnClickListener {
            if (mp1.isPlaying) {
                mp1.stop()
                mp1.prepare()
                mp1.start()
            } else {
                mp1.start()
            }
        }
        val mp2 = MediaPlayer.create(requireContext(), R.raw.note_e)
        binding.buttonMi.setOnClickListener {
            if(mp2.isPlaying) {
            mp2.stop()
            mp2.prepare()
            mp2.start()
        } else {
            mp2.start()
        }
        }
        val mp3 = MediaPlayer.create(requireContext(), R.raw.note_f)
        binding.buttonFa.setOnClickListener {
            if(mp3.isPlaying) {
            mp3.stop()
            mp3.prepare()
            mp3.start()
        } else {
            mp3.start()
        }
        }
        val mp4 = MediaPlayer.create(requireContext(), R.raw.note_g)
        binding.buttonSol.setOnClickListener {
            if(mp4.isPlaying) {
            mp4.stop()
            mp4.prepare()
            mp4.start()
        } else {
            mp4.start()
        }
        }
        val mp5 = MediaPlayer.create(requireContext(), R.raw.note_a)
        binding.buttonLa.setOnClickListener {
            if(mp5.isPlaying) {
            mp5.stop()
            mp5.prepare()
            mp5.start()
        } else {
            mp5.start()
        }
        }
        val mp6 = MediaPlayer.create(requireContext(), R.raw.note_h)
        binding.buttonSi.setOnClickListener {
        if(mp6.isPlaying) {
            mp6.stop()
            mp6.prepare()
            mp6.start()
        } else {
            mp6.start()
        }
        }
        val mp7 = MediaPlayer.create(requireContext(), R.raw.note_c2)
        binding.buttonDO2.setOnClickListener {
            if(mp7.isPlaying) {
            mp7.stop()
            mp7.prepare()
            mp7.start()
        } else {
            mp7.start()
        }
        }
        val mp8 = MediaPlayer.create(requireContext(), R.raw.c5)
        binding.buttoncis.setOnClickListener {
            if(mp8.isPlaying) {
            mp8.stop()
            mp8.prepare()
            mp8.start()
        } else {
            mp8.start()
        }
        }
        val mp9 = MediaPlayer.create(requireContext(), R.raw.d5)
        binding.buttondis.setOnClickListener {
            if(mp9.isPlaying) {
            mp9.stop()
            mp9.prepare()
            mp9.start()
        } else {
            mp9.start()
        }
        }
        val mp10 = MediaPlayer.create(requireContext(), R.raw.e5)
        binding.buttoneis.setOnClickListener {
            if(mp10.isPlaying) {
            mp10.stop()
            mp10.prepare()
            mp10.start()
        } else {
            mp10.start()
        }
        }
        val mp11 = MediaPlayer.create(requireContext(), R.raw.f5)
        binding.buttonfis.setOnClickListener {
            if(mp11.isPlaying) {
            mp11.stop()
            mp11.prepare()
            mp11.start()
        } else {
            mp11.start()
        }
        }
        val mp12 = MediaPlayer.create(requireContext(), R.raw.g5)
        binding.buttongis.setOnClickListener {
            if(mp12.isPlaying) {
            mp12.stop()
            mp12.prepare()
            mp12.start()
        } else {
            mp12.start()
        }
        }
        val mp13 = MediaPlayer.create(requireContext(), R.raw.a5)
        binding.buttonhis.setOnClickListener {
            if(mp13.isPlaying) {
            mp13.stop()
            mp13.prepare()
            mp13.start()
        } else {
            mp13.start()
        }
        }
        val mp14 = MediaPlayer.create(requireContext(), R.raw.b5)
        binding.buttonais.setOnClickListener {
            if(mp14.isPlaying) {
            mp14.stop()
            mp14.prepare()
            mp14.start()
        } else {
            mp14.start()
        }
        }
        val mp15 = MediaPlayer.create(requireContext(), R.raw.c5)
        binding.buttonhis.setOnClickListener {
            if(mp15.isPlaying) {
            mp15.stop()
            mp15.prepare()
            mp15.start()
        } else {
            mp15.start()
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