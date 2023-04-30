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
        binding.buttonRe.setOnClickListener { mp1.start() }
        val mp2 = MediaPlayer.create(requireContext(), R.raw.note_e)
        binding.buttonMi.setOnClickListener { mp2.start() }
        val mp3 = MediaPlayer.create(requireContext(), R.raw.note_f)
        binding.buttonFa.setOnClickListener { mp3.start() }
        val mp4 = MediaPlayer.create(requireContext(), R.raw.note_g)
        binding.buttonSol.setOnClickListener { mp4.start() }
        val mp5 = MediaPlayer.create(requireContext(), R.raw.note_a)
        binding.buttonLa.setOnClickListener { mp5.start() }
        val mp6 = MediaPlayer.create(requireContext(), R.raw.note_h)
        binding.buttonSi.setOnClickListener { mp6.start() }
        val mp7 = MediaPlayer.create(requireContext(), R.raw.note_c2)
        binding.buttonDO2.setOnClickListener { mp7.start() }
        val mp8 = MediaPlayer.create(requireContext(), R.raw.c5)
        binding.buttoncis.setOnClickListener { mp8.start() }
        val mp9 = MediaPlayer.create(requireContext(), R.raw.d5)
        binding.buttondis.setOnClickListener { mp9.start() }
        val mp10 = MediaPlayer.create(requireContext(), R.raw.e5)
        binding.buttoneis.setOnClickListener { mp10.start() }
        val mp11 = MediaPlayer.create(requireContext(), R.raw.f5)
        binding.buttonfis.setOnClickListener { mp11.start() }
        val mp12 = MediaPlayer.create(requireContext(), R.raw.g5)
        binding.buttongis.setOnClickListener { mp12.start() }
        val mp13 = MediaPlayer.create(requireContext(), R.raw.a5)
        binding.buttonhis.setOnClickListener { mp13.start() }
        val mp14 = MediaPlayer.create(requireContext(), R.raw.b5)
        binding.buttonais.setOnClickListener { mp14.start() }
        val mp15 = MediaPlayer.create(requireContext(), R.raw.c5)
        binding.buttonhis.setOnClickListener { mp15.start() }
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