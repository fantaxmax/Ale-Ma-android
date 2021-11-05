package cl.duocuc.pry2111.alertamascota.ui.profile

import cl.duocuc.pry2111.alertamascota.R;
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.TextView
import androidx.core.content.res.ResourcesCompat
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import cl.duocuc.pry2111.alertamascota.databinding.FragmentProfileBinding

class ProfileFragment : Fragment() , AdapterView.OnItemSelectedListener{
    private lateinit var profileViewModel: ProfileViewModel
    private var _binding: FragmentProfileBinding? = null

    private val binding get() = _binding!!

    var slNameArray = arrayOf("Inosuke","Drogon")
    var slSex = arrayOf("Macho","Hembra")
    var slSpecies = arrayOf("Cerdo","Dragon","Perro","Gato")

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {

        profileViewModel =
            ViewModelProvider(this)[ProfileViewModel::class.java]
        _binding = FragmentProfileBinding.inflate(inflater, container, false)
        val root: View = binding.root
        val aaMascota = ArrayAdapter(requireActivity(),android.R.layout.simple_spinner_item,slNameArray)
        aaMascota.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        binding.slPet.adapter = aaMascota
        binding.slPet.onItemSelectedListener = this
        val aaSexo = ArrayAdapter(requireActivity(),android.R.layout.simple_spinner_item,slSex)
        aaSexo.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        binding.slPetSex.adapter = aaSexo
        val aaEspecie = ArrayAdapter(requireActivity(),android.R.layout.simple_spinner_item,slSpecies)
        aaEspecie.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        binding.slPetSpecie.adapter = aaEspecie
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onItemSelected(arg0: AdapterView<*>, arg1: View, position: Int, id: Long) {
        when (position) {
             0 -> {
                 binding.txtPetName.setText("Inosuke")
                 binding.txtPetAge.setText("16")
                 binding.txtPetDesc.setText("Cerdo loco y erratico, tiene tendencias violentas")
                 binding.slPetSpecie.setSelection(0,true)
                 binding.slPetSex.setSelection(0,true)
                 binding.petImage.setImageDrawable(ResourcesCompat.getDrawable(resources,R.drawable.inosuke,null))
                 binding.swLinkedTag.isChecked = true

            }
            1 -> {
                binding.txtPetName.setText("Drogon")
                binding.txtPetAge.setText("36")
                binding.txtPetDesc.setText("Dragon Negro, le gusta comer ovejas y quemar aldeas")
                binding.slPetSpecie.setSelection(1,true)
                binding.slPetSex.setSelection(0,true)
                binding.petImage.setImageDrawable(ResourcesCompat.getDrawable(resources,R.drawable.drogon,null))
                binding.swLinkedTag.isChecked = false
            }
        }
    }

    override fun onNothingSelected(arg0: AdapterView<*>) {

    }
}
