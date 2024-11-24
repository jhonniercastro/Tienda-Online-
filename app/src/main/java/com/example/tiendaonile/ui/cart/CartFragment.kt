package com.example.tiendaonile.ui.cart

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.tiendaonile.databinding.FragmentCartBinding
import com.example.tiendaonile.PaypalActivity // Importa tu PaypalActivity

class CartFragment : Fragment() {

    private var _binding: FragmentCartBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Obtiene el ViewModel si es necesario
        val cartViewModel = ViewModelProvider(this).get(CartViewModel::class.java)

        // Inflar el layout del fragmento
        _binding = FragmentCartBinding.inflate(inflater, container, false)
        val root: View = binding.root

        // Configura el botón para navegar a PaypalActivity
        val btnCart = binding.btnCart  // Usar el botón que está en el layout del fragmento

        btnCart.setOnClickListener {
            // Usar requireActivity() para obtener el contexto de la actividad que contiene el fragmento
            val intent = Intent(requireActivity(), PaypalActivity::class.java)
            startActivity(intent)  // Iniciar la nueva actividad
        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null // Limpiar el binding cuando la vista se destruya
    }
}
