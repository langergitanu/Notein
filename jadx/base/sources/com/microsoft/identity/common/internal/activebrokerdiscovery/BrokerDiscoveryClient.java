package com.microsoft.identity.common.internal.activebrokerdiscovery;

import android.content.Context;
import android.os.Bundle;
import com.aspose.words.StyleIdentifier;
import com.microsoft.identity.common.exception.BrokerCommunicationException;
import com.microsoft.identity.common.internal.broker.BrokerData;
import com.microsoft.identity.common.internal.broker.BrokerValidator;
import com.microsoft.identity.common.internal.broker.PackageHelper;
import com.microsoft.identity.common.internal.broker.ipc.BrokerOperationBundle;
import com.microsoft.identity.common.internal.broker.ipc.ContentProviderStrategy;
import com.microsoft.identity.common.internal.broker.ipc.IIpcStrategy;
import com.microsoft.identity.common.internal.cache.IClientActiveBrokerCache;
import com.microsoft.identity.common.java.exception.ClientException;
import com.microsoft.identity.common.java.interfaces.IPlatformComponents;
import com.microsoft.identity.common.java.logging.Logger;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import java.io.Serializable;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0O000o.OooO00o;
import oO0o0OO.AbstractC33630OooOooO;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.C33880OooOO0;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oO0o0oOo.C33900OooO0o0;
import oO0o0oOo.InterfaceC33895OooO00o;
import oOo0000O.OooO;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000  2\u00020\u0001:\u0001 B]\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000f\u0010\u0010B!\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0015J\u001d\u0010\u0017\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0016\u001a\u00020\fH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0016\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001bR\u001c\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001cR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001dR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001eR \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001fR \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006!"}, m80612d2 = {"Lcom/microsoft/identity/common/internal/activebrokerdiscovery/BrokerDiscoveryClient;", "Lcom/microsoft/identity/common/internal/activebrokerdiscovery/IBrokerDiscoveryClient;", "", "Lcom/microsoft/identity/common/internal/broker/BrokerData;", "brokerCandidates", "Lkotlin/Function0;", "getActiveBrokerFromAccountManager", "Lcom/microsoft/identity/common/internal/broker/ipc/IIpcStrategy;", "ipcStrategy", "Lcom/microsoft/identity/common/internal/cache/IClientActiveBrokerCache;", "cache", "Lkotlin/Function1;", "", "isPackageInstalled", "isValidBroker", "<init>", "(Ljava/util/Set;LoO0O000o/OooO00o;Lcom/microsoft/identity/common/internal/broker/ipc/IIpcStrategy;Lcom/microsoft/identity/common/internal/cache/IClientActiveBrokerCache;LoO0O000o/OooOO0o;LoO0O000o/OooOO0o;)V", "Landroid/content/Context;", "context", "Lcom/microsoft/identity/common/java/interfaces/IPlatformComponents;", "components", "(Landroid/content/Context;Lcom/microsoft/identity/common/java/interfaces/IPlatformComponents;Lcom/microsoft/identity/common/internal/cache/IClientActiveBrokerCache;)V", "shouldSkipCache", "getActiveBrokerAsync", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getActiveBroker", "(Z)Lcom/microsoft/identity/common/internal/broker/BrokerData;", "Ljava/util/Set;", "LoO0O000o/OooO00o;", "Lcom/microsoft/identity/common/internal/broker/ipc/IIpcStrategy;", "Lcom/microsoft/identity/common/internal/cache/IClientActiveBrokerCache;", "LoO0O000o/OooOO0o;", "Companion", "common_distRelease"}, m80613k = 1, m80614mv = {1, 7, 1}, m80616xi = 48)
public final class BrokerDiscoveryClient implements IBrokerDiscoveryClient {
    public static final String ACTIVE_BROKER_PACKAGE_NAME_BUNDLE_KEY = "ACTIVE_BROKER_PACKAGE_NAME_BUNDLE_KEY";
    public static final String ACTIVE_BROKER_SIGNING_CERTIFICATE_THUMBPRINT_BUNDLE_KEY = "ACTIVE_BROKER_SIGNING_CERTIFICATE_THUMBPRINT_BUNDLE_KEY";
    public static final String ERROR_BUNDLE_KEY = "ERROR_BUNDLE_KEY";
    private static final InterfaceC33895OooO00o classLevelLock;
    private static final AbstractC33630OooOooO dispatcher;
    private final Set<BrokerData> brokerCandidates;
    private final IClientActiveBrokerCache cache;
    private final OooO00o<BrokerData> getActiveBrokerFromAccountManager;
    private final IIpcStrategy ipcStrategy;
    private final InterfaceC32507OooOO0o<BrokerData, Boolean> isPackageInstalled;
    private final InterfaceC32507OooOO0o<BrokerData, Boolean> isValidBroker;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = C24035Oooo00o.f80943OooO00o.OooO0O0(BrokerDiscoveryClient.class).OooOO0();

    /* JADX INFO: renamed from: com.microsoft.identity.common.internal.activebrokerdiscovery.BrokerDiscoveryClient$1 */
    @Metadata(m80611d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, m80612d2 = {"<anonymous>", "Lcom/microsoft/identity/common/internal/broker/BrokerData;", "invoke"}, m80613k = 3, m80614mv = {1, 7, 1}, m80616xi = 48)
    public static final class C185561 extends OooOOOO implements OooO00o<BrokerData> {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C185561(Context context) {
            super(0);
            this.$context = context;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // oO0O000o.OooO00o
        public final BrokerData invoke() {
            return new AccountManagerBrokerDiscoveryUtil(this.$context).getActiveBrokerFromAccountManager();
        }
    }

    /* JADX INFO: renamed from: com.microsoft.identity.common.internal.activebrokerdiscovery.BrokerDiscoveryClient$2 */
    @Metadata(m80611d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m80612d2 = {"<anonymous>", "", "brokerData", "Lcom/microsoft/identity/common/internal/broker/BrokerData;", "invoke", "(Lcom/microsoft/identity/common/internal/broker/BrokerData;)Ljava/lang/Boolean;"}, m80613k = 3, m80614mv = {1, 7, 1}, m80616xi = 48)
    public static final class C185572 extends OooOOOO implements InterfaceC32507OooOO0o<BrokerData, Boolean> {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C185572(Context context) {
            super(1);
            this.$context = context;
        }

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final Boolean invoke(BrokerData brokerData) {
            OooOOO0.OooO0oO(brokerData, "brokerData");
            return Boolean.valueOf(new PackageHelper(this.$context).isPackageInstalledAndEnabled(brokerData.getPackageName()));
        }
    }

    /* JADX INFO: renamed from: com.microsoft.identity.common.internal.activebrokerdiscovery.BrokerDiscoveryClient$3 */
    @Metadata(m80611d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m80612d2 = {"<anonymous>", "", "brokerData", "Lcom/microsoft/identity/common/internal/broker/BrokerData;", "invoke", "(Lcom/microsoft/identity/common/internal/broker/BrokerData;)Ljava/lang/Boolean;"}, m80613k = 3, m80614mv = {1, 7, 1}, m80616xi = 48)
    public static final class C185583 extends OooOOOO implements InterfaceC32507OooOO0o<BrokerData, Boolean> {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C185583(Context context) {
            super(1);
            this.$context = context;
        }

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final Boolean invoke(BrokerData brokerData) {
            OooOOO0.OooO0oO(brokerData, "brokerData");
            return Boolean.valueOf(new BrokerValidator(this.$context).isSignedByKnownKeys(brokerData));
        }
    }

    @Metadata(m80611d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\f\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\f\u0010\rJS\u0010\u0016\u001a\u0004\u0018\u00010\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00110\u00102\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00110\u0010H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u0012\u0004\b\u001c\u0010\u0003\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u001d8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u001fR\u0014\u0010#\u001a\u00020\u001d8\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\u001fR\u0014\u0010$\u001a\u00020\u001d8\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010\u001fR\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006("}, m80612d2 = {"Lcom/microsoft/identity/common/internal/activebrokerdiscovery/BrokerDiscoveryClient$Companion;", "", "<init>", "()V", "Lcom/microsoft/identity/common/internal/broker/BrokerData;", "candidate", "Lcom/microsoft/identity/common/internal/broker/ipc/IIpcStrategy;", "ipcStrategy", "makeRequest", "(Lcom/microsoft/identity/common/internal/broker/BrokerData;Lcom/microsoft/identity/common/internal/broker/ipc/IIpcStrategy;)Lcom/microsoft/identity/common/internal/broker/BrokerData;", "Landroid/os/Bundle;", "bundle", "extractResult", "(Landroid/os/Bundle;)Lcom/microsoft/identity/common/internal/broker/BrokerData;", "", "brokerCandidates", "Lkotlin/Function1;", "", "isPackageInstalled", "isValidBroker", "queryFromBroker$common_distRelease", "(Ljava/util/Set;Lcom/microsoft/identity/common/internal/broker/ipc/IIpcStrategy;LoO0O000o/OooOO0o;LoO0O000o/OooOO0o;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryFromBroker", "LoO0o0OO/OooOooO;", "dispatcher", "LoO0o0OO/OooOooO;", "getDispatcher", "()LoO0o0OO/OooOooO;", "getDispatcher$annotations", "", "TAG", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", BrokerDiscoveryClient.ACTIVE_BROKER_PACKAGE_NAME_BUNDLE_KEY, BrokerDiscoveryClient.ACTIVE_BROKER_SIGNING_CERTIFICATE_THUMBPRINT_BUNDLE_KEY, BrokerDiscoveryClient.ERROR_BUNDLE_KEY, "LoO0o0oOo/OooO00o;", "classLevelLock", "LoO0o0oOo/OooO00o;", "common_distRelease"}, m80613k = 1, m80614mv = {1, 7, 1}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
            this();
        }

        private final BrokerData extractResult(Bundle bundle) throws Throwable {
            if (bundle == null) {
                return null;
            }
            Serializable serializable = bundle.getSerializable(BrokerDiscoveryClient.ERROR_BUNDLE_KEY);
            if (serializable != null) {
                throw ((Throwable) serializable);
            }
            String string = bundle.getString(BrokerDiscoveryClient.ACTIVE_BROKER_PACKAGE_NAME_BUNDLE_KEY);
            if (string == null) {
                throw new NoSuchElementException("ACTIVE_BROKER_PACKAGE_NAME_BUNDLE_KEY must not be null");
            }
            String string2 = bundle.getString(BrokerDiscoveryClient.ACTIVE_BROKER_SIGNING_CERTIFICATE_THUMBPRINT_BUNDLE_KEY);
            if (string2 != null) {
                return new BrokerData(string, string2);
            }
            throw new NoSuchElementException("ACTIVE_BROKER_SIGNING_CERTIFICATE_THUMBPRINT_BUNDLE_KEY must not be null");
        }

        public static /* synthetic */ void getDispatcher$annotations() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final BrokerData makeRequest(BrokerData candidate, IIpcStrategy ipcStrategy) {
            String str = getTAG() + ":makeRequest";
            try {
                return extractResult(ipcStrategy.communicateToBroker(new BrokerOperationBundle(BrokerOperationBundle.Operation.BROKER_DISCOVERY_FROM_SDK, candidate.getPackageName(), new Bundle())));
            } catch (Throwable th) {
                if ((th instanceof BrokerCommunicationException) && BrokerCommunicationException.Category.OPERATION_NOT_SUPPORTED_ON_SERVER_SIDE == ((BrokerCommunicationException) th).getCategory()) {
                    Logger.info(str, "Tried broker discovery on " + candidate + ". It doesn't support the IPC mechanism.");
                    return null;
                }
                if ((th instanceof ClientException) && ClientException.ONLY_SUPPORTS_ACCOUNT_MANAGER_ERROR_CODE.equals(((ClientException) th).getErrorCode())) {
                    Logger.info(str, "Tried broker discovery on " + candidate + ". The Broker side indicates that only AccountManager is supported.");
                    return null;
                }
                Logger.error(str, "Tried broker discovery on " + candidate + ", get an error", th);
                return null;
            }
        }

        public final AbstractC33630OooOooO getDispatcher() {
            return BrokerDiscoveryClient.dispatcher;
        }

        public final String getTAG() {
            return BrokerDiscoveryClient.TAG;
        }

        public final Object queryFromBroker$common_distRelease(Set<BrokerData> set, IIpcStrategy iIpcStrategy, InterfaceC32507OooOO0o<? super BrokerData, Boolean> interfaceC32507OooOO0o, InterfaceC32507OooOO0o<? super BrokerData, Boolean> interfaceC32507OooOO0o2, Continuation<? super BrokerData> continuation) {
            return C33633Oooo0.OooO0o0(new BrokerDiscoveryClient$Companion$queryFromBroker$2(set, interfaceC32507OooOO0o, interfaceC32507OooOO0o2, iIpcStrategy, null), continuation);
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.microsoft.identity.common.internal.activebrokerdiscovery.BrokerDiscoveryClient$getActiveBroker$1 */
    @Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m80612d2 = {"LoO0o0OO/Oooo00o;", "Lcom/microsoft/identity/common/internal/broker/BrokerData;", "<anonymous>", "(LoO0o0OO/Oooo00o;)Lcom/microsoft/identity/common/internal/broker/BrokerData;"}, m80613k = 3, m80614mv = {1, 7, 1})
    @InterfaceC32482OooO0o0(m80622c = "com.microsoft.identity.common.internal.activebrokerdiscovery.BrokerDiscoveryClient$getActiveBroker$1", m80623f = "BrokerDiscoveryClient.kt", m80624l = {184}, m80625m = "invokeSuspend")
    public static final class C185601 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super BrokerData>, Object> {
        final /* synthetic */ boolean $shouldSkipCache;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C185601(boolean z, Continuation<? super C185601> continuation) {
            super(2, continuation);
            this.$shouldSkipCache = z;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return BrokerDiscoveryClient.this.new C185601(this.$shouldSkipCache, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return obj;
            }
            C32446OooOOOo.OooO0O0(obj);
            BrokerDiscoveryClient brokerDiscoveryClient = BrokerDiscoveryClient.this;
            boolean z = this.$shouldSkipCache;
            this.label = 1;
            Object activeBrokerAsync = brokerDiscoveryClient.getActiveBrokerAsync(z, this);
            return activeBrokerAsync == enumC32485OooO00o ? enumC32485OooO00o : activeBrokerAsync;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super BrokerData> continuation) {
            return ((C185601) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }
    }

    /* JADX INFO: renamed from: com.microsoft.identity.common.internal.activebrokerdiscovery.BrokerDiscoveryClient$getActiveBrokerAsync$1 */
    @Metadata(m80613k = 3, m80614mv = {1, 7, 1}, m80616xi = 48)
    @InterfaceC32482OooO0o0(m80622c = "com.microsoft.identity.common.internal.activebrokerdiscovery.BrokerDiscoveryClient", m80623f = "BrokerDiscoveryClient.kt", m80624l = {StyleIdentifier.PLAIN_TABLE_1, 228}, m80625m = "getActiveBrokerAsync")
    public static final class C185611 extends AbstractC32479OooO0OO {
        Object L$0;
        Object L$1;
        Object L$2;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C185611(Continuation<? super C185611> continuation) {
            super(continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BrokerDiscoveryClient.this.getActiveBrokerAsync(false, this);
        }
    }

    static {
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        ExecutorC33873OooO0O0.f122045OooOoO0.getClass();
        dispatcher = C33880OooOO0.f122052OooOoO0.o000OOo0(10);
        classLevelLock = C33900OooO0o0.OooO00o();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BrokerDiscoveryClient(Set<BrokerData> brokerCandidates, OooO00o<BrokerData> getActiveBrokerFromAccountManager, IIpcStrategy ipcStrategy, IClientActiveBrokerCache cache, InterfaceC32507OooOO0o<? super BrokerData, Boolean> isPackageInstalled, InterfaceC32507OooOO0o<? super BrokerData, Boolean> isValidBroker) {
        OooOOO0.OooO0oO(brokerCandidates, "brokerCandidates");
        OooOOO0.OooO0oO(getActiveBrokerFromAccountManager, "getActiveBrokerFromAccountManager");
        OooOOO0.OooO0oO(ipcStrategy, "ipcStrategy");
        OooOOO0.OooO0oO(cache, "cache");
        OooOOO0.OooO0oO(isPackageInstalled, "isPackageInstalled");
        OooOOO0.OooO0oO(isValidBroker, "isValidBroker");
        this.brokerCandidates = brokerCandidates;
        this.getActiveBrokerFromAccountManager = getActiveBrokerFromAccountManager;
        this.ipcStrategy = ipcStrategy;
        this.cache = cache;
        this.isPackageInstalled = isPackageInstalled;
        this.isValidBroker = isValidBroker;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0135 A[Catch: all -> 0x0042, TRY_LEAVE, TryCatch #0 {all -> 0x0042, blocks: (B:14:0x003d, B:52:0x0131, B:54:0x0135, B:57:0x013e, B:59:0x0164, B:61:0x016a), top: B:66:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013e A[Catch: all -> 0x0042, TRY_ENTER, TryCatch #0 {all -> 0x0042, blocks: (B:14:0x003d, B:52:0x0131, B:54:0x0135, B:57:0x013e, B:59:0x0164, B:61:0x016a), top: B:66:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getActiveBrokerAsync(boolean z, Continuation<? super BrokerData> continuation) throws Throwable {
        C185611 c185611;
        String strOooO0OO;
        InterfaceC33895OooO00o interfaceC33895OooO00o;
        BrokerDiscoveryClient brokerDiscoveryClient;
        InterfaceC33895OooO00o interfaceC33895OooO00o2;
        String str;
        BrokerDiscoveryClient brokerDiscoveryClient2;
        BrokerData brokerData;
        if (continuation instanceof C185611) {
            c185611 = (C185611) continuation;
            int i = c185611.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c185611.label = i - Integer.MIN_VALUE;
            } else {
                c185611 = new C185611(continuation);
            }
        }
        C185611 c1856112 = c185611;
        Object obj = c1856112.result;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c1856112.label;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            strOooO0OO = androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), TAG, ":getActiveBrokerAsync");
            interfaceC33895OooO00o = classLevelLock;
            c1856112.L$0 = this;
            c1856112.L$1 = strOooO0OO;
            c1856112.L$2 = interfaceC33895OooO00o;
            c1856112.Z$0 = z;
            c1856112.label = 1;
            if (interfaceC33895OooO00o.OooO00o(c1856112) != enumC32485OooO00o) {
                brokerDiscoveryClient = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC33895OooO00o2 = (InterfaceC33895OooO00o) c1856112.L$2;
            str = (String) c1856112.L$1;
            brokerDiscoveryClient2 = (BrokerDiscoveryClient) c1856112.L$0;
            try {
                C32446OooOOOo.OooO0O0(obj);
                brokerData = (BrokerData) obj;
                if (brokerData == null) {
                    brokerDiscoveryClient2.cache.setCachedActiveBroker(brokerData);
                    interfaceC33895OooO00o2.OooOOO0(null);
                    return brokerData;
                }
                Logger.info(str, "Will skip broker discovery via IPC and fall back to AccountManager for the next 60 minutes.");
                brokerDiscoveryClient2.cache.clearCachedActiveBroker();
                brokerDiscoveryClient2.cache.setShouldUseAccountManagerForTheNextMilliseconds(TimeUnit.MINUTES.toMillis(60L));
                BrokerData brokerDataInvoke = brokerDiscoveryClient2.getActiveBrokerFromAccountManager.invoke();
                StringBuilder sb = new StringBuilder("Tried getting active broker from account manager, get ");
                sb.append(brokerDataInvoke != null ? brokerDataInvoke.getPackageName() : null);
                sb.append(FilenameUtils.EXTENSION_SEPARATOR);
                Logger.info(str, sb.toString());
                interfaceC33895OooO00o2.OooOOO0(null);
                return brokerDataInvoke;
            } catch (Throwable th) {
                th = th;
                interfaceC33895OooO00o2.OooOOO0(null);
                throw th;
            }
        }
        z = c1856112.Z$0;
        interfaceC33895OooO00o = (InterfaceC33895OooO00o) c1856112.L$2;
        String str2 = (String) c1856112.L$1;
        BrokerDiscoveryClient brokerDiscoveryClient3 = (BrokerDiscoveryClient) c1856112.L$0;
        C32446OooOOOo.OooO0O0(obj);
        strOooO0OO = str2;
        brokerDiscoveryClient = brokerDiscoveryClient3;
        InterfaceC33895OooO00o interfaceC33895OooO00o3 = interfaceC33895OooO00o;
        if (!z) {
            try {
                if (brokerDiscoveryClient.cache.shouldUseAccountManager()) {
                    BrokerData brokerDataInvoke2 = brokerDiscoveryClient.getActiveBrokerFromAccountManager.invoke();
                    interfaceC33895OooO00o3.OooOOO0(null);
                    return brokerDataInvoke2;
                }
                BrokerData cachedActiveBroker = brokerDiscoveryClient.cache.getCachedActiveBroker();
                if (cachedActiveBroker != null) {
                    if (!brokerDiscoveryClient.isPackageInstalled.invoke(cachedActiveBroker).booleanValue()) {
                        Logger.info(strOooO0OO, "There is a cached broker: " + cachedActiveBroker + ", but the app is no longer installed.");
                        brokerDiscoveryClient.cache.clearCachedActiveBroker();
                    } else if (!brokerDiscoveryClient.isValidBroker.invoke(cachedActiveBroker).booleanValue()) {
                        Logger.info(strOooO0OO, "Clearing cache as the installed app does not have a matching signature hash.");
                        brokerDiscoveryClient.cache.clearCachedActiveBroker();
                    } else {
                        if (brokerDiscoveryClient.ipcStrategy.isSupportedByTargetedBroker(cachedActiveBroker.getPackageName())) {
                            Logger.info(strOooO0OO, "Returning cached broker: " + cachedActiveBroker);
                            interfaceC33895OooO00o3.OooOOO0(null);
                            return cachedActiveBroker;
                        }
                        Logger.info(strOooO0OO, "Clearing cache as the installed app does not provide any IPC mechanism to communicate to. (e.g. the broker code isn't shipped with this apk)");
                        brokerDiscoveryClient.cache.clearCachedActiveBroker();
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                interfaceC33895OooO00o2 = interfaceC33895OooO00o3;
                interfaceC33895OooO00o2.OooOOO0(null);
                throw th;
            }
        }
        Companion companion = INSTANCE;
        Set<BrokerData> set = brokerDiscoveryClient.brokerCandidates;
        IIpcStrategy iIpcStrategy = brokerDiscoveryClient.ipcStrategy;
        InterfaceC32507OooOO0o<BrokerData, Boolean> interfaceC32507OooOO0o = brokerDiscoveryClient.isPackageInstalled;
        InterfaceC32507OooOO0o<BrokerData, Boolean> interfaceC32507OooOO0o2 = brokerDiscoveryClient.isValidBroker;
        c1856112.L$0 = brokerDiscoveryClient;
        c1856112.L$1 = strOooO0OO;
        c1856112.L$2 = interfaceC33895OooO00o3;
        c1856112.label = 2;
        Object objQueryFromBroker$common_distRelease = companion.queryFromBroker$common_distRelease(set, iIpcStrategy, interfaceC32507OooOO0o, interfaceC32507OooOO0o2, c1856112);
        if (objQueryFromBroker$common_distRelease != enumC32485OooO00o) {
            str = strOooO0OO;
            brokerDiscoveryClient2 = brokerDiscoveryClient;
            obj = objQueryFromBroker$common_distRelease;
            interfaceC33895OooO00o2 = interfaceC33895OooO00o3;
            brokerData = (BrokerData) obj;
            if (brokerData == null) {
            }
        }
        return enumC32485OooO00o;
    }

    @Override // com.microsoft.identity.common.internal.activebrokerdiscovery.IBrokerDiscoveryClient
    public BrokerData getActiveBroker(boolean shouldSkipCache) {
        return (BrokerData) C33609OooO0oo.OooO0Oo(OooO.f123416OooOo0o, new C185601(shouldSkipCache, null));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BrokerDiscoveryClient(Context context, IPlatformComponents components, IClientActiveBrokerCache cache) {
        this(BrokerData.INSTANCE.getKnownBrokerApps(), new C185561(context), new ContentProviderStrategy(context, components), cache, new C185572(context), new C185583(context));
        OooOOO0.OooO0oO(context, "context");
        OooOOO0.OooO0oO(components, "components");
        OooOOO0.OooO0oO(cache, "cache");
    }
}
