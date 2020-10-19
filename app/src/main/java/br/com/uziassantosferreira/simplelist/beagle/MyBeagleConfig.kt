package br.com.uziassantosferreira.simplelist.beagle

import br.com.zup.beagle.android.setup.BeagleConfig
import br.com.zup.beagle.android.setup.Cache
import br.com.zup.beagle.android.setup.Environment

class MyBeagleConfig : BeagleConfig {
    override val baseUrl: String = ""
    override val cache: Cache = Cache(enabled = false, maxAge = 0, size = 1)
    override val environment: Environment = Environment.DEBUG
    override val isLoggingEnabled: Boolean = true
}