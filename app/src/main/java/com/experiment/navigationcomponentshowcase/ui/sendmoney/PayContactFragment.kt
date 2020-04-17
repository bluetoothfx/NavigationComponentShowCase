package com.experiment.navigationcomponentshowcase.ui.sendmoney

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.experiment.navigationcomponentshowcase.R
import kotlinx.android.synthetic.main.fragment_pay_contact.*

/**
 * See the project README for the equivalent Java code.
 */
class PayContactFragment : Fragment() {
    private val args: PayContactFragmentArgs by navArgs()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_pay_contact, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        person_name.text = args.personName

        disclaimer_button.setOnClickListener {
            findNavController().navigate(R.id.action_payContactFragment_to_viewDisclaimerFragment)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.next, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.action_next) {
            val directions = PayContactFragmentDirections.actionPayContactFragmentToPaymentCompleteFragment(
                    args.personName,
                    from_account_number.text.toString(),
                    amount.text.toString()
            )

            findNavController().navigate(directions)
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}