package cl.duocuc.pry2111.alertamascota.ui.notifications

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.marginStart
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import cl.duocuc.pry2111.alertamascota.R
import cl.duocuc.pry2111.alertamascota.databinding.FragmentNotificationsBinding

class NotificationsFragment : Fragment() {

    private lateinit var notificationsViewModel: NotificationsViewModel
    private var _binding: FragmentNotificationsBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        notificationsViewModel =
                ViewModelProvider(this).get(NotificationsViewModel::class.java)

        _binding = FragmentNotificationsBinding.inflate(inflater, container, false)
        val root: View = binding.root
        val txtPrueba = TextView(context)
        val txtpruebaid = View.generateViewId()
        txtPrueba.text = "Texto de prueba"
        txtPrueba.id = txtpruebaid
        txtPrueba.textSize = 20F
        val param = ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.WRAP_CONTENT,ConstraintLayout.LayoutParams.WRAP_CONTENT)
        param.marginStart = 40
        param.topMargin = 20
        param.startToStart = binding.notifPage.id
        param.topToTop = binding.notifPage.id
        txtPrueba.layoutParams = param
        binding.notifPage.addView(txtPrueba)
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}