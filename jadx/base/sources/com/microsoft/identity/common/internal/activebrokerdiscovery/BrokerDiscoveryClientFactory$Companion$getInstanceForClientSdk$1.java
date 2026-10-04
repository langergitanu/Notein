package com.microsoft.identity.common.internal.activebrokerdiscovery;

import android.content.Context;
import com.microsoft.identity.common.internal.activebrokerdiscovery.BrokerDiscoveryClientFactory;
import com.microsoft.identity.common.internal.cache.ClientActiveBrokerCache;
import com.microsoft.identity.common.java.interfaces.IPlatformComponents;
import com.microsoft.identity.common.java.interfaces.IStorageSupplier;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0oOo.InterfaceC33895OooO00o;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m80612d2 = {"LoO0o0OO/Oooo00o;", "LoO00ooO/OooOooO;", "<anonymous>", "(LoO0o0OO/Oooo00o;)V"}, m80613k = 3, m80614mv = {1, 7, 1})
@InterfaceC32482OooO0o0(m80622c = "com.microsoft.identity.common.internal.activebrokerdiscovery.BrokerDiscoveryClientFactory$Companion$getInstanceForClientSdk$1", m80623f = "BrokerDiscoveryClientFactory.kt", m80624l = {146}, m80625m = "invokeSuspend")
public final class BrokerDiscoveryClientFactory$Companion$getInstanceForClientSdk$1 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ IPlatformComponents $platformComponents;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrokerDiscoveryClientFactory$Companion$getInstanceForClientSdk$1(Context context, IPlatformComponents iPlatformComponents, Continuation<? super BrokerDiscoveryClientFactory$Companion$getInstanceForClientSdk$1> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$platformComponents = iPlatformComponents;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new BrokerDiscoveryClientFactory$Companion$getInstanceForClientSdk$1(this.$context, this.$platformComponents, continuation);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        Context context;
        InterfaceC33895OooO00o interfaceC33895OooO00o;
        IPlatformComponents iPlatformComponents;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.label;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33895OooO00o interfaceC33895OooO00o2 = BrokerDiscoveryClientFactory.lock;
            context = this.$context;
            IPlatformComponents iPlatformComponents2 = this.$platformComponents;
            this.L$0 = interfaceC33895OooO00o2;
            this.L$1 = context;
            this.L$2 = iPlatformComponents2;
            this.label = 1;
            if (interfaceC33895OooO00o2.OooO00o(this) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            interfaceC33895OooO00o = interfaceC33895OooO00o2;
            iPlatformComponents = iPlatformComponents2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iPlatformComponents = (IPlatformComponents) this.L$2;
            context = (Context) this.L$1;
            interfaceC33895OooO00o = (InterfaceC33895OooO00o) this.L$0;
            C32446OooOOOo.OooO0O0(obj);
        }
        try {
            if (BrokerDiscoveryClientFactory.clientSdkInstance == null) {
                BrokerDiscoveryClientFactory.Companion companion = BrokerDiscoveryClientFactory.INSTANCE;
                ClientActiveBrokerCache.Companion companion2 = ClientActiveBrokerCache.INSTANCE;
                IStorageSupplier storageSupplier = iPlatformComponents.getStorageSupplier();
                OooOOO0.OooO0o(storageSupplier, "platformComponents.storageSupplier");
                BrokerDiscoveryClientFactory.clientSdkInstance = companion.getInstance(context, iPlatformComponents, companion2.getClientSdkCache(storageSupplier));
            }
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            interfaceC33895OooO00o.OooOOO0(null);
            return C32460OooOooO.f116667OooO00o;
        } catch (Throwable th) {
            interfaceC33895OooO00o.OooOOO0(null);
            throw th;
        }
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((BrokerDiscoveryClientFactory$Companion$getInstanceForClientSdk$1) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }
}
