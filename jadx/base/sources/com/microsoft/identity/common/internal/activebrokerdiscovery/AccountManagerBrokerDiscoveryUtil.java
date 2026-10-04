package com.microsoft.identity.common.internal.activebrokerdiscovery;

import android.accounts.AccountManager;
import android.accounts.AuthenticatorDescription;
import android.content.Context;
import com.microsoft.identity.common.internal.broker.BrokerData;
import com.microsoft.identity.common.internal.broker.BrokerValidator;
import com.microsoft.identity.common.java.AuthenticationConstants;
import com.microsoft.identity.common.java.exception.ClientException;
import com.microsoft.identity.common.java.logging.Logger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.OooO00o;
import oO0o0O0o.C33595OooOOo;
import oO0o0O0o.C33599OooOo0O;
import oOo000Oo.OooOo;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B=\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b¢\u0006\u0004\b\f\u0010\rB\u0011\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\f\u0010\u0010J\u000f\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0013R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R \u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0015¨\u0006\u0017"}, m80612d2 = {"Lcom/microsoft/identity/common/internal/activebrokerdiscovery/AccountManagerBrokerDiscoveryUtil;", "", "", "Lcom/microsoft/identity/common/internal/broker/BrokerData;", "knownBrokerApps", "Lkotlin/Function1;", "", "isSignedByKnownKeys", "Lkotlin/Function0;", "", "Landroid/accounts/AuthenticatorDescription;", "getAccountManagerApps", "<init>", "(Ljava/util/Set;LoO0O000o/OooOO0o;LoO0O000o/OooO00o;)V", "Landroid/content/Context;", "context", "(Landroid/content/Context;)V", "getActiveBrokerFromAccountManager", "()Lcom/microsoft/identity/common/internal/broker/BrokerData;", "Ljava/util/Set;", "LoO0O000o/OooOO0o;", "LoO0O000o/OooO00o;", "Companion", "common_distRelease"}, m80613k = 1, m80614mv = {1, 7, 1}, m80616xi = 48)
public final class AccountManagerBrokerDiscoveryUtil {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = C24035Oooo00o.f80943OooO00o.OooO0O0(AccountManagerBrokerDiscoveryUtil.class).OooOO0();
    private final OooO00o<AuthenticatorDescription[]> getAccountManagerApps;
    private final InterfaceC32507OooOO0o<BrokerData, Boolean> isSignedByKnownKeys;
    private final Set<BrokerData> knownBrokerApps;

    /* JADX INFO: renamed from: com.microsoft.identity.common.internal.activebrokerdiscovery.AccountManagerBrokerDiscoveryUtil$2 */
    @Metadata(m80611d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m80612d2 = {"<anonymous>", "", "brokerData", "Lcom/microsoft/identity/common/internal/broker/BrokerData;", "invoke", "(Lcom/microsoft/identity/common/internal/broker/BrokerData;)Ljava/lang/Boolean;"}, m80613k = 3, m80614mv = {1, 7, 1}, m80616xi = 48)
    public static final class C185542 extends OooOOOO implements InterfaceC32507OooOO0o<BrokerData, Boolean> {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C185542(Context context) {
            super(1);
            this.$context = context;
        }

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final Boolean invoke(BrokerData brokerData) {
            OooOOO0.OooO0oO(brokerData, "brokerData");
            return Boolean.valueOf(new BrokerValidator(this.$context).isSignedByKnownKeys(brokerData));
        }
    }

    /* JADX INFO: renamed from: com.microsoft.identity.common.internal.activebrokerdiscovery.AccountManagerBrokerDiscoveryUtil$3 */
    @Metadata(m80611d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m80612d2 = {"<anonymous>", "", "Landroid/accounts/AuthenticatorDescription;", "invoke", "()[Landroid/accounts/AuthenticatorDescription;"}, m80613k = 3, m80614mv = {1, 7, 1}, m80616xi = 48)
    public static final class C185553 extends OooOOOO implements OooO00o<AuthenticatorDescription[]> {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C185553(Context context) {
            super(0);
            this.$context = context;
        }

        @Override // oO0O000o.OooO00o
        public final AuthenticatorDescription[] invoke() {
            AuthenticatorDescription[] authenticatorTypes = AccountManager.get(this.$context).getAuthenticatorTypes();
            OooOOO0.OooO0o(authenticatorTypes, "get(context).authenticatorTypes");
            return authenticatorTypes;
        }
    }

    @Metadata(m80611d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m80612d2 = {"Lcom/microsoft/identity/common/internal/activebrokerdiscovery/AccountManagerBrokerDiscoveryUtil$Companion;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "common_distRelease"}, m80613k = 1, m80614mv = {1, 7, 1}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
            this();
        }

        public final String getTAG() {
            return AccountManagerBrokerDiscoveryUtil.TAG;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AccountManagerBrokerDiscoveryUtil(Set<BrokerData> knownBrokerApps, InterfaceC32507OooOO0o<? super BrokerData, Boolean> isSignedByKnownKeys, OooO00o<AuthenticatorDescription[]> getAccountManagerApps) {
        OooOOO0.OooO0oO(knownBrokerApps, "knownBrokerApps");
        OooOOO0.OooO0oO(isSignedByKnownKeys, "isSignedByKnownKeys");
        OooOOO0.OooO0oO(getAccountManagerApps, "getAccountManagerApps");
        this.knownBrokerApps = knownBrokerApps;
        this.isSignedByKnownKeys = isSignedByKnownKeys;
        this.getAccountManagerApps = getAccountManagerApps;
    }

    public final BrokerData getActiveBrokerFromAccountManager() throws ClientException {
        String strOooO0OO = androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), TAG, ":getActiveBrokerFromAccountManager");
        try {
            AuthenticatorDescription[] authenticatorDescriptionArrInvoke = this.getAccountManagerApps.invoke();
            int length = authenticatorDescriptionArrInvoke.length;
            int i = 0;
            while (true) {
                Object obj = null;
                if (i >= length) {
                    Logger.info(strOooO0OO, "No valid AccountManager broker is found");
                    return null;
                }
                AuthenticatorDescription authenticatorDescription = authenticatorDescriptionArrInvoke[i];
                String str = authenticatorDescription.packageName;
                if (str != null && authenticatorDescription.type != null) {
                    OooOOO0.OooO0o(str, "authenticator.packageName");
                    String string = C33599OooOo0O.Oooooo0(str).toString();
                    String str2 = authenticatorDescription.type;
                    OooOOO0.OooO0o(str2, "authenticator.type");
                    if (AuthenticationConstants.Broker.BROKER_ACCOUNT_TYPE.equalsIgnoreCase(C33599OooOo0O.Oooooo0(str2).toString())) {
                        Set<BrokerData> set = this.knownBrokerApps;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : set) {
                            if (C33595OooOOo.OooOOo(((BrokerData) obj2).getPackageName(), string, true)) {
                                arrayList.add(obj2);
                            }
                        }
                        InterfaceC32507OooOO0o<BrokerData, Boolean> interfaceC32507OooOO0o = this.isSignedByKnownKeys;
                        Iterator it = arrayList.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Object next = it.next();
                            if (interfaceC32507OooOO0o.invoke((BrokerData) next).booleanValue()) {
                                obj = next;
                                break;
                            }
                        }
                        BrokerData brokerData = (BrokerData) obj;
                        if (brokerData != null) {
                            Logger.info(strOooO0OO, brokerData + " is the active AccountManager broker.");
                            return brokerData;
                        }
                    } else {
                        continue;
                    }
                }
                i++;
            }
        } catch (Throwable th) {
            throw new ClientException(ClientException.ACCOUNT_MANAGER_FAILED, th.getMessage());
        }
    }

    public AccountManagerBrokerDiscoveryUtil(Context context) {
        OooOOO0.OooO0oO(context, "context");
        Set<BrokerData> knownBrokerApps = BrokerData.INSTANCE.getKnownBrokerApps();
        ArrayList arrayList = new ArrayList();
        for (Object obj : knownBrokerApps) {
            if (BrokerData.INSTANCE.isAccountManagerSupported(((BrokerData) obj).getPackageName())) {
                arrayList.add(obj);
            }
        }
        this(OooOo.o0OO00O(arrayList), new C185542(context), new C185553(context));
    }
}
