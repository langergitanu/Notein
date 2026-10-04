package com.microsoft.identity.common.internal.cache;

import android.content.Context;
import android.os.Bundle;
import androidx.concurrent.futures.OooO00o;
import com.microsoft.identity.common.internal.broker.BrokerData;
import com.microsoft.identity.common.internal.broker.BrokerValidator;
import com.microsoft.identity.common.logging.Logger;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B#\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013¨\u0006\u0015"}, m80612d2 = {"Lcom/microsoft/identity/common/internal/cache/ActiveBrokerCacheUpdater;", "", "Lkotlin/Function1;", "Lcom/microsoft/identity/common/internal/broker/BrokerData;", "", "isValidBroker", "Lcom/microsoft/identity/common/internal/cache/IClientActiveBrokerCache;", "cache", "<init>", "(LoO0O000o/OooOO0o;Lcom/microsoft/identity/common/internal/cache/IClientActiveBrokerCache;)V", "Landroid/content/Context;", "context", "(Landroid/content/Context;Lcom/microsoft/identity/common/internal/cache/IClientActiveBrokerCache;)V", "Landroid/os/Bundle;", "bundle", "LoO00ooO/OooOooO;", "updateCachedActiveBrokerFromResultBundle", "(Landroid/os/Bundle;)V", "LoO0O000o/OooOO0o;", "Lcom/microsoft/identity/common/internal/cache/IClientActiveBrokerCache;", "Companion", "common_distRelease"}, m80613k = 1, m80614mv = {1, 7, 1}, m80616xi = 48)
public final class ActiveBrokerCacheUpdater {
    public static final String ACTIVE_BROKER_PACKAGE_NAME_KEY = "active.broker.package.name";
    public static final String ACTIVE_BROKER_SIGNING_CERTIFICATE_THUMBPRINT_KEY = "active.broker.signing.certificate.thumbprint";
    public static final String BROKER_DISCOVERY_DISABLED_KEY = "broker.discovery.disabled";
    public static final String KEY_REQUEST_ACTIVE_BROKER_DATA = "com.microsoft.identity.request.broker.data";
    private final IClientActiveBrokerCache cache;
    private final InterfaceC32507OooOO0o<BrokerData, Boolean> isValidBroker;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = C24035Oooo00o.f80943OooO00o.OooO0O0(ActiveBrokerCacheUpdater.class).OooOO0();

    /* JADX INFO: renamed from: com.microsoft.identity.common.internal.cache.ActiveBrokerCacheUpdater$1 */
    @Metadata(m80611d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m80612d2 = {"<anonymous>", "", "brokerData", "Lcom/microsoft/identity/common/internal/broker/BrokerData;", "invoke", "(Lcom/microsoft/identity/common/internal/broker/BrokerData;)Ljava/lang/Boolean;"}, m80613k = 3, m80614mv = {1, 7, 1}, m80616xi = 48)
    public static final class C185701 extends OooOOOO implements InterfaceC32507OooOO0o<BrokerData, Boolean> {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C185701(Context context) {
            super(1);
            this.$context = context;
        }

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final Boolean invoke(BrokerData brokerData) {
            OooOOO0.OooO0oO(brokerData, "brokerData");
            return Boolean.valueOf(new BrokerValidator(this.$context).isSignedByKnownKeys(brokerData));
        }
    }

    @Metadata(m80611d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000fR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u000f¨\u0006\u0014"}, m80612d2 = {"Lcom/microsoft/identity/common/internal/cache/ActiveBrokerCacheUpdater$Companion;", "", "<init>", "()V", "Landroid/os/Bundle;", "bundle", "Lcom/microsoft/identity/common/internal/broker/BrokerData;", "activeBroker", "LoO00ooO/OooOooO;", "appendActiveBrokerToResultBundle", "(Landroid/os/Bundle;Lcom/microsoft/identity/common/internal/broker/BrokerData;)V", "appendBrokerDiscoveryDisabledToResultBundle", "(Landroid/os/Bundle;)V", "", "ACTIVE_BROKER_PACKAGE_NAME_KEY", "Ljava/lang/String;", "ACTIVE_BROKER_SIGNING_CERTIFICATE_THUMBPRINT_KEY", "BROKER_DISCOVERY_DISABLED_KEY", "KEY_REQUEST_ACTIVE_BROKER_DATA", "TAG", "common_distRelease"}, m80613k = 1, m80614mv = {1, 7, 1}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
            this();
        }

        public final void appendActiveBrokerToResultBundle(Bundle bundle, BrokerData activeBroker) {
            OooOOO0.OooO0oO(bundle, "bundle");
            OooOOO0.OooO0oO(activeBroker, "activeBroker");
            bundle.putString(ActiveBrokerCacheUpdater.ACTIVE_BROKER_PACKAGE_NAME_KEY, activeBroker.getPackageName());
            bundle.putString(ActiveBrokerCacheUpdater.ACTIVE_BROKER_SIGNING_CERTIFICATE_THUMBPRINT_KEY, activeBroker.getSigningCertificateThumbprint());
        }

        public final void appendBrokerDiscoveryDisabledToResultBundle(Bundle bundle) {
            OooOOO0.OooO0oO(bundle, "bundle");
            bundle.putBoolean(ActiveBrokerCacheUpdater.BROKER_DISCOVERY_DISABLED_KEY, true);
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ActiveBrokerCacheUpdater(InterfaceC32507OooOO0o<? super BrokerData, Boolean> isValidBroker, IClientActiveBrokerCache cache) {
        OooOOO0.OooO0oO(isValidBroker, "isValidBroker");
        OooOOO0.OooO0oO(cache, "cache");
        this.isValidBroker = isValidBroker;
        this.cache = cache;
    }

    public static final void appendActiveBrokerToResultBundle(Bundle bundle, BrokerData brokerData) {
        INSTANCE.appendActiveBrokerToResultBundle(bundle, brokerData);
    }

    public static final void appendBrokerDiscoveryDisabledToResultBundle(Bundle bundle) {
        INSTANCE.appendBrokerDiscoveryDisabledToResultBundle(bundle);
    }

    public final void updateCachedActiveBrokerFromResultBundle(Bundle bundle) {
        String strOooO0OO = OooO00o.OooO0OO(new StringBuilder(), TAG, ":updateCachedActiveBrokerFromResultBundle");
        if (bundle == null) {
            return;
        }
        if (bundle.getBoolean(BROKER_DISCOVERY_DISABLED_KEY, false)) {
            Logger.info(strOooO0OO, "Got a response indicating that the broker discovery is disabled.Will also wipe the local active broker cache,and skip broker discovery via IPC (only fall back to AccountManager) for the next 60 minutes.");
            this.cache.clearCachedActiveBroker();
            this.cache.setShouldUseAccountManagerForTheNextMilliseconds(TimeUnit.MINUTES.toMillis(60L));
            return;
        }
        String string = bundle.getString(ACTIVE_BROKER_PACKAGE_NAME_KEY);
        String string2 = bundle.getString(ACTIVE_BROKER_SIGNING_CERTIFICATE_THUMBPRINT_KEY);
        if (string == null || string.length() == 0 || string2 == null || string2.length() == 0) {
            Logger.info(strOooO0OO, "A response was received without active broker information.");
            return;
        }
        BrokerData brokerData = new BrokerData(string, string2);
        if (this.isValidBroker.invoke(brokerData).booleanValue()) {
            this.cache.setCachedActiveBroker(brokerData);
            return;
        }
        Logger.warn(strOooO0OO, "Cannot find an installed " + string + " with a matching signing certificate thumbprint.");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ActiveBrokerCacheUpdater(Context context, IClientActiveBrokerCache cache) {
        this(new C185701(context), cache);
        OooOOO0.OooO0oO(context, "context");
        OooOOO0.OooO0oO(cache, "cache");
    }
}
