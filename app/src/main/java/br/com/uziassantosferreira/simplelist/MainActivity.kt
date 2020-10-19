package br.com.uziassantosferreira.simplelist

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.uziassantosferreira.simplelist.beagle.BeagleItemPokemon
import br.com.zup.beagle.android.components.layout.Container
import br.com.zup.beagle.android.components.layout.Screen
import br.com.zup.beagle.android.components.layout.ScrollView
import br.com.zup.beagle.android.utils.newServerDrivenIntent
import br.com.zup.beagle.android.utils.renderScreen
import br.com.zup.beagle.android.view.OnFragmentCallback
import br.com.zup.beagle.android.view.ServerDrivenActivity
import br.com.zup.beagle.core.Style
import br.com.zup.beagle.ext.applyFlex
import br.com.zup.beagle.ext.applyStyle
import br.com.zup.beagle.widget.core.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), OnFragmentCallback {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))

        container.renderScreen(this, getScreen())

    }

    private fun getScreen(): String = """
    {
  "_beagleComponent_": "beagle:scrollview",
  "children": [
    {
      "_beagleComponent_": "beagle:container",
      "children": [
        {
          "_beagleComponent_": "custom:BeagleItemPokemon",
          "style": {
            "flex": {
              "basis": {
                "value": 50,
                "type": "PERCENT"
              }
            }
          },
          "name": "Bulbasaur",
          "idItem": "#001",
          "imageUrl": "https://assets.pokemon.com/assets/cms2/img/pokedex/full/001.png",
          "typeofpokemon": [
            "Grass",
            "Poison"
          ]
        },
        {
          "_beagleComponent_": "custom:BeagleItemPokemon",
          "style": {
            "flex": {
              "basis": {
                "value": 50,
                "type": "PERCENT"
              }
            }
          },
          "name": "Ivysaur",
          "idItem": "#002",
          "imageUrl": "https://assets.pokemon.com/assets/cms2/img/pokedex/full/002.png",
          "typeofpokemon": [
            "Grass",
            "Poison"
          ]
        },
        {
          "_beagleComponent_": "custom:BeagleItemPokemon",
          "style": {
            "flex": {
              "basis": {
                "value": 50,
                "type": "PERCENT"
              }
            }
          },
          "name": "Venusaur",
          "idItem": "#003",
          "imageUrl": "https://assets.pokemon.com/assets/cms2/img/pokedex/full/003.png",
          "typeofpokemon": [
            "Grass",
            "Poison"
          ]
        },
        {
          "_beagleComponent_": "custom:BeagleItemPokemon",
          "style": {
            "flex": {
              "basis": {
                "value": 50,
                "type": "PERCENT"
              }
            }
          },
          "name": "Charmander",
          "idItem": "#004",
          "imageUrl": "https://assets.pokemon.com/assets/cms2/img/pokedex/full/004.png",
          "typeofpokemon": [
            "Fire"
          ]
        },
        {
          "_beagleComponent_": "custom:BeagleItemPokemon",
          "style": {
            "flex": {
              "basis": {
                "value": 50,
                "type": "PERCENT"
              }
            }
          },
          "name": "Charmeleon",
          "idItem": "#005",
          "imageUrl": "https://assets.pokemon.com/assets/cms2/img/pokedex/full/005.png",
          "typeofpokemon": [
            "Fire"
          ]
        },
        {
          "_beagleComponent_": "custom:BeagleItemPokemon",
          "style": {
            "flex": {
              "basis": {
                "value": 50,
                "type": "PERCENT"
              }
            }
          },
          "name": "Charizard",
          "idItem": "#006",
          "imageUrl": "https://assets.pokemon.com/assets/cms2/img/pokedex/full/006.png",
          "typeofpokemon": [
            "Fire",
            "Flying"
          ]
        },
        {
          "_beagleComponent_": "custom:BeagleItemPokemon",
          "style": {
            "flex": {
              "basis": {
                "value": 50,
                "type": "PERCENT"
              }
            }
          },
          "name": "Squirtle",
          "idItem": "#007",
          "imageUrl": "https://assets.pokemon.com/assets/cms2/img/pokedex/full/007.png",
          "typeofpokemon": [
            "Water"
          ]
        },
        {
          "_beagleComponent_": "custom:BeagleItemPokemon",
          "style": {
            "flex": {
              "basis": {
                "value": 50,
                "type": "PERCENT"
              }
            }
          },
          "name": "Wartortle",
          "idItem": "#008",
          "imageUrl": "https://assets.pokemon.com/assets/cms2/img/pokedex/full/008.png",
          "typeofpokemon": [
            "Water"
          ]
        },
        {
          "_beagleComponent_": "custom:BeagleItemPokemon",
          "style": {
            "flex": {
              "basis": {
                "value": 50,
                "type": "PERCENT"
              }
            }
          },
          "name": "Blastoise",
          "idItem": "#009",
          "imageUrl": "https://assets.pokemon.com/assets/cms2/img/pokedex/full/009.png",
          "typeofpokemon": [
            "Water"
          ]
        },
        {
          "_beagleComponent_": "custom:BeagleItemPokemon",
          "style": {
            "flex": {
              "basis": {
                "value": 50,
                "type": "PERCENT"
              }
            }
          },
          "name": "Caterpie",
          "idItem": "#010",
          "imageUrl": "https://assets.pokemon.com/assets/cms2/img/pokedex/full/010.png",
          "typeofpokemon": [
            "Bug"
          ]
        },
        {
          "_beagleComponent_": "custom:BeagleItemPokemon",
          "style": {
            "flex": {
              "basis": {
                "value": 50,
                "type": "PERCENT"
              }
            }
          },
          "name": "Metapod",
          "idItem": "#011",
          "imageUrl": "https://assets.pokemon.com/assets/cms2/img/pokedex/full/011.png",
          "typeofpokemon": [
            "Bug"
          ]
        },
        {
          "_beagleComponent_": "custom:BeagleItemPokemon",
          "style": {
            "flex": {
              "basis": {
                "value": 50,
                "type": "PERCENT"
              }
            }
          },
          "name": "Butterfree",
          "idItem": "#012",
          "imageUrl": "https://assets.pokemon.com/assets/cms2/img/pokedex/full/012.png",
          "typeofpokemon": [
            "Bug",
            "Flying"
          ]
        },
        {
          "_beagleComponent_": "custom:BeagleItemPokemon",
          "style": {
            "flex": {
              "basis": {
                "value": 50,
                "type": "PERCENT"
              }
            }
          },
          "name": "Sandshrew",
          "idItem": "#027",
          "imageUrl": "https://assets.pokemon.com/assets/cms2/img/pokedex/full/027.png",
          "typeofpokemon": [
            "Ground"
          ]
        },
        {
          "_beagleComponent_": "custom:BeagleItemPokemon",
          "style": {
            "flex": {
              "basis": {
                "value": 50,
                "type": "PERCENT"
              }
            }
          },
          "name": "Sandslash",
          "idItem": "#028",
          "imageUrl": "https://assets.pokemon.com/assets/cms2/img/pokedex/full/028.png",
          "typeofpokemon": [
            "Ground"
          ]
        },
        {
          "_beagleComponent_": "custom:BeagleItemPokemon",
          "style": {
            "flex": {
              "basis": {
                "value": 50,
                "type": "PERCENT"
              }
            }
          },
          "name": "Nidoran♀",
          "idItem": "#029",
          "imageUrl": "https://assets.pokemon.com/assets/cms2/img/pokedex/full/029.png",
          "typeofpokemon": [
            "Poison"
          ]
        },
        {
          "_beagleComponent_": "custom:BeagleItemPokemon",
          "style": {
            "flex": {
              "basis": {
                "value": 50,
                "type": "PERCENT"
              }
            }
          },
          "name": "Nidorina",
          "idItem": "#030",
          "imageUrl": "https://assets.pokemon.com/assets/cms2/img/pokedex/full/030.png",
          "typeofpokemon": [
            "Poison"
          ]
        },
        {
          "_beagleComponent_": "custom:BeagleItemPokemon",
          "style": {
            "flex": {
              "basis": {
                "value": 50,
                "type": "PERCENT"
              }
            }
          },
          "name": "Nidoqueen",
          "idItem": "#031",
          "imageUrl": "https://assets.pokemon.com/assets/cms2/img/pokedex/full/031.png",
          "typeofpokemon": [
            "Poison",
            "Ground"
          ]
        },
        {
          "_beagleComponent_": "custom:BeagleItemPokemon",
          "style": {
            "flex": {
              "basis": {
                "value": 50,
                "type": "PERCENT"
              }
            }
          },
          "name": "Nidoran♂",
          "idItem": "#032",
          "imageUrl": "https://assets.pokemon.com/assets/cms2/img/pokedex/full/032.png",
          "typeofpokemon": [
            "Poison"
          ]
        },
        {
          "_beagleComponent_": "custom:BeagleItemPokemon",
          "style": {
            "flex": {
              "basis": {
                "value": 50,
                "type": "PERCENT"
              }
            }
          },
          "name": "Nidorino",
          "idItem": "#033",
          "imageUrl": "https://assets.pokemon.com/assets/cms2/img/pokedex/full/033.png",
          "typeofpokemon": [
            "Poison"
          ]
        },
        {
          "_beagleComponent_": "custom:BeagleItemPokemon",
          "style": {
            "flex": {
              "basis": {
                "value": 50,
                "type": "PERCENT"
              }
            }
          },
          "name": "Nidoking",
          "idItem": "#034",
          "imageUrl": "https://assets.pokemon.com/assets/cms2/img/pokedex/full/034.png",
          "typeofpokemon": [
            "Poison",
            "Ground"
          ]
        },
        {
          "_beagleComponent_": "custom:BeagleItemPokemon",
          "style": {
            "flex": {
              "basis": {
                "value": 50,
                "type": "PERCENT"
              }
            }
          },
          "name": "Clefairy",
          "idItem": "#035",
          "imageUrl": "https://assets.pokemon.com/assets/cms2/img/pokedex/full/035.png",
          "typeofpokemon": [
            "Fairy"
          ]
        },
        {
          "_beagleComponent_": "custom:BeagleItemPokemon",
          "style": {
            "flex": {
              "basis": {
                "value": 50,
                "type": "PERCENT"
              }
            }
          },
          "name": "Clefable",
          "idItem": "#036",
          "imageUrl": "https://assets.pokemon.com/assets/cms2/img/pokedex/full/036.png",
          "typeofpokemon": [
            "Fairy"
          ]
        }
      ],
      "style": {
        "flex": {
          "flexWrap": "WRAP",
          "flex": "1.0",
          "flexDirection": "ROW"
        }
      }
    }
  ]
}
    """

    override fun fragmentResume() {}
}