package cl.duocuc.pry2111.alertamascota.ui.share

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import cl.duocuc.pry2111.alertamascota.databinding.FragmentShareBinding

class ShareFragment : Fragment()  {
    private lateinit var shareViewModel: ShareViewModel
    private var _binding: FragmentShareBinding? = null

    private val binding get() = _binding!!

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        shareViewModel =
            ViewModelProvider(this).get(ShareViewModel::class.java)
        _binding = FragmentShareBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val mapview: WebView = binding.mapView
        mapview.settings.javaScriptEnabled = true
        mapview.loadUrl("https://www.google.com/maps")
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
