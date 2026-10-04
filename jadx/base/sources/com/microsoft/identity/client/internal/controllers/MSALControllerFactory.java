package com.microsoft.identity.client.internal.controllers;

import android.content.Context;
import android.os.PowerManager;
import androidx.concurrent.futures.OooO00o;
import com.microsoft.identity.client.PublicClientApplicationConfiguration;
import com.microsoft.identity.common.components.AndroidPlatformComponentsFactory;
import com.microsoft.identity.common.internal.activebrokerdiscovery.BrokerDiscoveryClientFactory;
import com.microsoft.identity.common.internal.activebrokerdiscovery.IBrokerDiscoveryClient;
import com.microsoft.identity.common.internal.broker.BrokerData;
import com.microsoft.identity.common.internal.controllers.BrokerMsalController;
import com.microsoft.identity.common.internal.controllers.LocalMSALController;
import com.microsoft.identity.common.java.authorities.Authority;
import com.microsoft.identity.common.java.authorities.AzureActiveDirectoryAuthority;
import com.microsoft.identity.common.java.controllers.BaseController;
import com.microsoft.identity.common.java.controllers.IControllerFactory;
import com.microsoft.identity.common.java.interfaces.IPlatformComponents;
import com.microsoft.identity.common.logging.Logger;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import oOo000Oo.OooOo;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B%\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\fJ\b\u0010\u000f\u001a\u00020\u0010H\u0002J\u0006\u0010\u0011\u001a\u00020\u0010J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0003J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0016J\b\u0010\u0018\u001a\u00020\u0010H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m80612d2 = {"Lcom/microsoft/identity/client/internal/controllers/MSALControllerFactory;", "Lcom/microsoft/identity/common/java/controllers/IControllerFactory;", "applicationConfiguration", "Lcom/microsoft/identity/client/PublicClientApplicationConfiguration;", "(Lcom/microsoft/identity/client/PublicClientApplicationConfiguration;)V", "authority", "Lcom/microsoft/identity/common/java/authorities/Authority;", "(Lcom/microsoft/identity/client/PublicClientApplicationConfiguration;Lcom/microsoft/identity/common/java/authorities/Authority;)V", "applicationContext", "Landroid/content/Context;", "platformComponents", "Lcom/microsoft/identity/common/java/interfaces/IPlatformComponents;", "(Landroid/content/Context;Lcom/microsoft/identity/common/java/interfaces/IPlatformComponents;Lcom/microsoft/identity/common/java/authorities/Authority;Lcom/microsoft/identity/client/PublicClientApplicationConfiguration;)V", "discoveryClient", "Lcom/microsoft/identity/common/internal/activebrokerdiscovery/IBrokerDiscoveryClient;", "brokerEligible", "", "brokerEligibleAndInstalled", "getActiveBrokerPackageName", "", "getAllControllers", "", "Lcom/microsoft/identity/common/java/controllers/BaseController;", "getDefaultController", "powerOptimizationEnabled", "Companion", "msal_distRelease"}, m80613k = 1, m80614mv = {1, 7, 1}, m80616xi = 48)
public final class MSALControllerFactory implements IControllerFactory {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = C24035Oooo00o.f80943OooO00o.OooO0O0(MSALControllerFactory.class).OooOO0();
    private static BaseController injectedMockDefaultController;
    private final PublicClientApplicationConfiguration applicationConfiguration;
    private final Context applicationContext;
    private final Authority authority;
    private final IBrokerDiscoveryClient discoveryClient;
    private final IPlatformComponents platformComponents;

    @Metadata(m80611d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0007\u0010\u0002\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\f"}, m80612d2 = {"Lcom/microsoft/identity/client/internal/controllers/MSALControllerFactory$Companion;", "", "()V", "TAG", "", "injectedMockDefaultController", "Lcom/microsoft/identity/common/java/controllers/BaseController;", "getInjectedMockDefaultController$annotations", "getInjectedMockDefaultController", "()Lcom/microsoft/identity/common/java/controllers/BaseController;", "setInjectedMockDefaultController", "(Lcom/microsoft/identity/common/java/controllers/BaseController;)V", "msal_distRelease"}, m80613k = 1, m80614mv = {1, 7, 1}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
            this();
        }

        public static /* synthetic */ void getInjectedMockDefaultController$annotations() {
        }

        public final BaseController getInjectedMockDefaultController() {
            return MSALControllerFactory.injectedMockDefaultController;
        }

        public final void setInjectedMockDefaultController(BaseController baseController) {
            MSALControllerFactory.injectedMockDefaultController = baseController;
        }

        private Companion() {
        }
    }

    public MSALControllerFactory(Context applicationContext, IPlatformComponents platformComponents, Authority authority, PublicClientApplicationConfiguration applicationConfiguration) {
        OooOOO0.OooO0oO(applicationContext, "applicationContext");
        OooOOO0.OooO0oO(platformComponents, "platformComponents");
        OooOOO0.OooO0oO(authority, "authority");
        OooOOO0.OooO0oO(applicationConfiguration, "applicationConfiguration");
        this.applicationContext = applicationContext;
        this.platformComponents = platformComponents;
        this.authority = authority;
        this.applicationConfiguration = applicationConfiguration;
        this.discoveryClient = BrokerDiscoveryClientFactory.INSTANCE.getInstanceForClientSdk(applicationContext, platformComponents);
    }

    private final boolean brokerEligible() {
        String strOooO0OO = OooO00o.OooO0OO(new StringBuilder(), TAG, ":brokerEligible");
        if (!this.applicationConfiguration.getUseBroker().booleanValue() || !(this.authority instanceof AzureActiveDirectoryAuthority)) {
            Logger.verbose(strOooO0OO, "Eligible to call broker? [false]. App does not ask for Broker or the authority is not AAD authority.");
            return false;
        }
        if (!powerOptimizationEnabled()) {
            return true;
        }
        Logger.verbose(strOooO0OO, "Is the power optimization enabled? [true]");
        return true;
    }

    private final String getActiveBrokerPackageName() {
        String strOooO0OO = OooO00o.OooO0OO(new StringBuilder(), TAG, ":getActiveBrokerPackageName");
        BrokerData activeBroker = this.discoveryClient.getActiveBroker(false);
        if (activeBroker != null) {
            return activeBroker.getPackageName();
        }
        Logger.info(strOooO0OO, "Broker application is not installed.");
        return null;
    }

    public static final BaseController getInjectedMockDefaultController() {
        return INSTANCE.getInjectedMockDefaultController();
    }

    private final boolean powerOptimizationEnabled() {
        String strOooO0OO = OooO00o.OooO0OO(new StringBuilder(), TAG, ":powerOptimizationEnabled");
        String packageName = this.applicationContext.getPackageName();
        Object systemService = this.applicationContext.getSystemService("power");
        OooOOO0.OooO0o0(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        boolean zIsIgnoringBatteryOptimizations = ((PowerManager) systemService).isIgnoringBatteryOptimizations(packageName);
        Logger.verbose(strOooO0OO, "Is power optimization on? [" + zIsIgnoringBatteryOptimizations + ']');
        return zIsIgnoringBatteryOptimizations;
    }

    public static final void setInjectedMockDefaultController(BaseController baseController) {
        INSTANCE.setInjectedMockDefaultController(baseController);
    }

    public final boolean brokerEligibleAndInstalled() {
        return getActiveBrokerPackageName() != null && brokerEligible();
    }

    @Override // com.microsoft.identity.common.java.controllers.IControllerFactory
    public List<BaseController> getAllControllers() {
        String activeBrokerPackageName = getActiveBrokerPackageName();
        ArrayList arrayList = new ArrayList();
        if (activeBrokerPackageName != null && activeBrokerPackageName.length() != 0 && brokerEligible()) {
            arrayList.add(new BrokerMsalController(this.applicationContext, this.platformComponents, activeBrokerPackageName));
        }
        arrayList.add(new LocalMSALController());
        return OooOo.o0ooOO0(arrayList);
    }

    @Override // com.microsoft.identity.common.java.controllers.IControllerFactory
    public BaseController getDefaultController() {
        String activeBrokerPackageName = getActiveBrokerPackageName();
        return (activeBrokerPackageName == null || activeBrokerPackageName.length() == 0 || !brokerEligible()) ? new LocalMSALController() : new BrokerMsalController(this.applicationContext, this.platformComponents, activeBrokerPackageName);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MSALControllerFactory(PublicClientApplicationConfiguration applicationConfiguration) {
        OooOOO0.OooO0oO(applicationConfiguration, "applicationConfiguration");
        Authority defaultAuthority = applicationConfiguration.getDefaultAuthority();
        OooOOO0.OooO0o(defaultAuthority, "applicationConfiguration.defaultAuthority");
        this(applicationConfiguration, defaultAuthority);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MSALControllerFactory(PublicClientApplicationConfiguration applicationConfiguration, Authority authority) {
        OooOOO0.OooO0oO(applicationConfiguration, "applicationConfiguration");
        OooOOO0.OooO0oO(authority, "authority");
        Context appContext = applicationConfiguration.getAppContext();
        OooOOO0.OooO0o(appContext, "applicationConfiguration.appContext");
        IPlatformComponents iPlatformComponentsCreateFromContext = AndroidPlatformComponentsFactory.createFromContext(applicationConfiguration.getAppContext());
        OooOOO0.OooO0o(iPlatformComponentsCreateFromContext, "createFromContext(applic…Configuration.appContext)");
        this(appContext, iPlatformComponentsCreateFromContext, authority, applicationConfiguration);
    }
}
