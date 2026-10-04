package com.microsoft.identity.common.internal.activebrokerdiscovery;

import android.content.Context;
import com.microsoft.identity.common.internal.cache.IClientActiveBrokerCache;
import com.microsoft.identity.common.java.interfaces.IPlatformComponents;
import com.microsoft.identity.common.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import oO0o0OO.C33609OooO0oo;
import oO0o0oOo.C33900OooO0o0;
import oO0o0oOo.InterfaceC33895OooO00o;
import oOo0000O.OooO;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, m80612d2 = {"Lcom/microsoft/identity/common/internal/activebrokerdiscovery/BrokerDiscoveryClientFactory;", "", "()V", "Companion", "common_distRelease"}, m80613k = 1, m80614mv = {1, 7, 1}, m80616xi = 48)
public final class BrokerDiscoveryClientFactory {
    private static volatile boolean IS_NEW_DISCOVERY_ENABLED;
    private static volatile IBrokerDiscoveryClient brokerSdkInstance;
    private static volatile IBrokerDiscoveryClient clientSdkInstance;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = C24035Oooo00o.f80943OooO00o.OooO0O0(BrokerDiscoveryClientFactory.class).OooOO0();
    private static final InterfaceC33895OooO00o lock = C33900OooO0o0.OooO00o();

    @Metadata(m80611d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0016\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, m80612d2 = {"Lcom/microsoft/identity/common/internal/activebrokerdiscovery/BrokerDiscoveryClientFactory$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/microsoft/identity/common/java/interfaces/IPlatformComponents;", "platformComponents", "Lcom/microsoft/identity/common/internal/cache/IClientActiveBrokerCache;", "cache", "Lcom/microsoft/identity/common/internal/activebrokerdiscovery/IBrokerDiscoveryClient;", "getInstance", "(Landroid/content/Context;Lcom/microsoft/identity/common/java/interfaces/IPlatformComponents;Lcom/microsoft/identity/common/internal/cache/IClientActiveBrokerCache;)Lcom/microsoft/identity/common/internal/activebrokerdiscovery/IBrokerDiscoveryClient;", "", "isEnabled", "LoO00ooO/OooOooO;", "setNewBrokerDiscoveryEnabled", "(Z)V", "isNewBrokerDiscoveryEnabled", "()Z", "getInstanceForClientSdk", "(Landroid/content/Context;Lcom/microsoft/identity/common/java/interfaces/IPlatformComponents;)Lcom/microsoft/identity/common/internal/activebrokerdiscovery/IBrokerDiscoveryClient;", "getInstanceForBrokerSdk", "IS_NEW_DISCOVERY_ENABLED", "Z", "", "TAG", "Ljava/lang/String;", "brokerSdkInstance", "Lcom/microsoft/identity/common/internal/activebrokerdiscovery/IBrokerDiscoveryClient;", "clientSdkInstance", "LoO0o0oOo/OooO00o;", "lock", "LoO0o0oOo/OooO00o;", "common_distRelease"}, m80613k = 1, m80614mv = {1, 7, 1}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final IBrokerDiscoveryClient getInstance(Context context, IPlatformComponents platformComponents, IClientActiveBrokerCache cache) {
            String str = BrokerDiscoveryClientFactory.TAG + ":getInstance";
            if (isNewBrokerDiscoveryEnabled()) {
                Logger.info(str, "Broker Discovery is enabled. Use the new logic on the SDK side");
                return new BrokerDiscoveryClient(context, platformComponents, cache);
            }
            Logger.info(str, "Broker Discovery is disabled. Use AccountManager on the SDK side.");
            return new LegacyBrokerDiscoveryClient(context);
        }

        public final IBrokerDiscoveryClient getInstanceForBrokerSdk(Context context, IPlatformComponents platformComponents) throws Throwable {
            OooOOO0.OooO0oO(context, "context");
            OooOOO0.OooO0oO(platformComponents, "platformComponents");
            if (BrokerDiscoveryClientFactory.brokerSdkInstance == null) {
                C33609OooO0oo.OooO0Oo(OooO.f123416OooOo0o, new BrokerDiscoveryClientFactory$Companion$getInstanceForBrokerSdk$1(context, platformComponents, null));
            }
            IBrokerDiscoveryClient iBrokerDiscoveryClient = BrokerDiscoveryClientFactory.brokerSdkInstance;
            OooOOO0.OooO0Oo(iBrokerDiscoveryClient);
            return iBrokerDiscoveryClient;
        }

        public final IBrokerDiscoveryClient getInstanceForClientSdk(Context context, IPlatformComponents platformComponents) throws Throwable {
            OooOOO0.OooO0oO(context, "context");
            OooOOO0.OooO0oO(platformComponents, "platformComponents");
            if (BrokerDiscoveryClientFactory.clientSdkInstance == null) {
                C33609OooO0oo.OooO0Oo(OooO.f123416OooOo0o, new BrokerDiscoveryClientFactory$Companion$getInstanceForClientSdk$1(context, platformComponents, null));
            }
            IBrokerDiscoveryClient iBrokerDiscoveryClient = BrokerDiscoveryClientFactory.clientSdkInstance;
            OooOOO0.OooO0Oo(iBrokerDiscoveryClient);
            return iBrokerDiscoveryClient;
        }

        public final boolean isNewBrokerDiscoveryEnabled() {
            return BrokerDiscoveryClientFactory.IS_NEW_DISCOVERY_ENABLED;
        }

        public final void setNewBrokerDiscoveryEnabled(boolean isEnabled) {
            if (isEnabled != BrokerDiscoveryClientFactory.IS_NEW_DISCOVERY_ENABLED) {
                BrokerDiscoveryClientFactory.clientSdkInstance = null;
                BrokerDiscoveryClientFactory.brokerSdkInstance = null;
                BrokerDiscoveryClientFactory.IS_NEW_DISCOVERY_ENABLED = isEnabled;
            }
        }

        private Companion() {
        }
    }

    private static final IBrokerDiscoveryClient getInstance(Context context, IPlatformComponents iPlatformComponents, IClientActiveBrokerCache iClientActiveBrokerCache) {
        return INSTANCE.getInstance(context, iPlatformComponents, iClientActiveBrokerCache);
    }

    public static final IBrokerDiscoveryClient getInstanceForBrokerSdk(Context context, IPlatformComponents iPlatformComponents) {
        return INSTANCE.getInstanceForBrokerSdk(context, iPlatformComponents);
    }

    public static final IBrokerDiscoveryClient getInstanceForClientSdk(Context context, IPlatformComponents iPlatformComponents) {
        return INSTANCE.getInstanceForClientSdk(context, iPlatformComponents);
    }

    public static final boolean isNewBrokerDiscoveryEnabled() {
        return INSTANCE.isNewBrokerDiscoveryEnabled();
    }

    public static final void setNewBrokerDiscoveryEnabled(boolean z) {
        INSTANCE.setNewBrokerDiscoveryEnabled(z);
    }
}
