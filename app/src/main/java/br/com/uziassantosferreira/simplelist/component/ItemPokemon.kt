package br.com.uziassantosferreira.simplelist.component

import android.content.Context
import android.graphics.PorterDuff
import android.graphics.PorterDuffColorFilter
import android.widget.RelativeLayout
import androidx.core.view.isVisible
import br.com.uziassantosferreira.simplelist.R
import br.com.uziassantosferreira.simplelist.utils.PokemonColorUtil
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.item_pokemon.view.*


class ItemPokemon(
    context: Context,
    private val name: String,
    private val id: String,
    private val typeofpokemon: List<String>?,
    private val imageUrl: String
) : RelativeLayout(context) {

    init {
        inflate(context, R.layout.item_pokemon, this)
        bind()
    }

    private fun bind() {
        textViewName.text = name
        textViewID.text = id

        val color = PokemonColorUtil(context).getPokemonColor(typeofpokemon)
        relativeLayoutBackground.background.colorFilter =
            PorterDuffColorFilter(color, PorterDuff.Mode.SRC_ATOP)

        typeofpokemon?.getOrNull(0).let { firstType ->
            textViewType3.text = firstType
            textViewType3.isVisible = firstType != null
        }

        typeofpokemon?.getOrNull(1).let { secondType ->
            textViewType2.text = secondType
            textViewType2.isVisible = secondType != null
        }

        typeofpokemon?.getOrNull(2).let { thirdType ->
            textViewType1.text = thirdType
            textViewType1.isVisible = thirdType != null
        }

        Glide.with(context)
            .load(imageUrl)
            .placeholder(android.R.color.transparent)
            .into(imageView)

    }
}
