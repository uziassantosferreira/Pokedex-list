package br.com.uziassantosferreira.simplelist.beagle

import android.view.View
import br.com.uziassantosferreira.simplelist.component.ItemPokemon
import br.com.zup.beagle.android.widget.RootView
import br.com.zup.beagle.android.widget.WidgetView

data class BeagleItemPokemon(
    val name: String,
    val idItem: String,
    val typeofpokemon: List<String>? = null,
    val imageUrl: String
) : WidgetView() {
    override fun buildView(rootView: RootView): View {
        return ItemPokemon(rootView.getContext(), name, idItem, typeofpokemon, imageUrl)
    }
}