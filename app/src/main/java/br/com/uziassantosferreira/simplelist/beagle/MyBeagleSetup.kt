package br.com.uziassantosferreira.simplelist.beagle

import br.com.zup.beagle.analytics.Analytics
import br.com.zup.beagle.android.action.Action
import br.com.zup.beagle.android.action.FormLocalActionHandler
import br.com.zup.beagle.android.components.form.core.ValidatorHandler
import br.com.zup.beagle.android.data.serializer.adapter.generic.TypeAdapterResolver
import br.com.zup.beagle.android.imagedownloader.BeagleImageDownloader
import br.com.zup.beagle.android.logger.BeagleLogger
import br.com.zup.beagle.android.navigation.BeagleControllerReference
import br.com.zup.beagle.android.navigation.DeepLinkHandler
import br.com.zup.beagle.android.networking.HttpClient
import br.com.zup.beagle.android.networking.urlbuilder.UrlBuilder
import br.com.zup.beagle.android.setup.BeagleConfig
import br.com.zup.beagle.android.setup.BeagleSdk
import br.com.zup.beagle.android.setup.DesignSystem
import br.com.zup.beagle.android.store.StoreHandler
import br.com.zup.beagle.android.view.BeagleActivity
import br.com.zup.beagle.android.view.ServerDrivenActivity
import br.com.zup.beagle.android.widget.WidgetView

class MyBeagleSetup : BeagleSdk {
    override val analytics: Analytics? = null
    override val config: BeagleConfig = MyBeagleConfig()
    override val controllerReference: BeagleControllerReference? = null
    override val deepLinkHandler: DeepLinkHandler? = null
    override val designSystem: DesignSystem? = null
    override val formLocalActionHandler: FormLocalActionHandler? = null
    override val httpClient: HttpClient? = null
    override val imageDownloader: BeagleImageDownloader? = null
    override val logger: BeagleLogger? = null
    override val serverDrivenActivity: Class<BeagleActivity> =
        ServerDrivenActivity::class.java as Class<BeagleActivity>
    override val storeHandler: StoreHandler? = null
    override val typeAdapterResolver: TypeAdapterResolver? = null
    override val urlBuilder: UrlBuilder? = null
    override val validatorHandler: ValidatorHandler? = null

    override fun registeredActions(): List<Class<Action>> = emptyList()
    override fun registeredWidgets(): List<Class<WidgetView>> = emptyList()
}