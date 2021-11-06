package cl.duocuc.pry2111.alertamascota.ui.notifications

import android.icu.lang.UCharacter
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.get
import androidx.core.view.marginStart
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import cl.duocuc.pry2111.alertamascota.R
import cl.duocuc.pry2111.alertamascota.databinding.FragmentNotificationsBinding
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*

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

        for(i in 1..15) {
            binding.notifPage.addView(createNotifView("Notificacion de Prueba: "+i,"Esta es una notificacion creada en codigo",Date()))
         }


        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    fun createNotifView(title: String, content: String, date: Date): LinearLayout? {
        val layout = LinearLayout(context)
        layout.id = View.generateViewId()
        layout.orientation = LinearLayout.VERTICAL
        layout.layoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT).apply {
            marginStart = 20
            topMargin = 16
        }
        val txtTitle = TextView(context)
        txtTitle.id = View.generateViewId()
        txtTitle.text = title
        txtTitle.textSize = 20F
        val txtDate = TextView(context)
        txtDate.id = View.generateViewId()
        txtDate.text = date.toString()
        txtDate.textSize = 16F
        val txtContent = TextView(context)
        txtContent.id = View.generateViewId()
        txtContent.text = content
        txtContent.textSize = 18F
        txtTitle.layoutParams =
            LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT)
                .apply {
            marginStart = 20
            topMargin = 20
        }
        txtContent.layoutParams =
            LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT).apply{
                marginStart = 20
                topMargin = 20
            }
        txtDate.layoutParams =
            LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT).apply{
                marginEnd = 20
                topMargin = 0
                marginStart = 20
            }
        layout.addView(txtTitle)
        layout.addView(txtDate)
        layout.addView(txtContent)

        return layout
    }
}