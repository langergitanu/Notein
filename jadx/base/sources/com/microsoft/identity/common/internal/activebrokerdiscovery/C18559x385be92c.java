package com.microsoft.identity.common.internal.activebrokerdiscovery;

import com.microsoft.identity.common.internal.broker.BrokerData;
import com.microsoft.identity.common.internal.broker.ipc.IIpcStrategy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: com.microsoft.identity.common.internal.activebrokerdiscovery.BrokerDiscoveryClient$Companion$queryFromBroker$2$deferredResults$1$1 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m80612d2 = {"LoO0o0OO/Oooo00o;", "Lcom/microsoft/identity/common/internal/broker/BrokerData;", "<anonymous>", "(LoO0o0OO/Oooo00o;)Lcom/microsoft/identity/common/internal/broker/BrokerData;"}, m80613k = 3, m80614mv = {1, 7, 1})
@InterfaceC32482OooO0o0(m80622c = "com.microsoft.identity.common.internal.activebrokerdiscovery.BrokerDiscoveryClient$Companion$queryFromBroker$2$deferredResults$1$1", m80623f = "BrokerDiscoveryClient.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C18559x385be92c extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super BrokerData>, Object> {
    final /* synthetic */ BrokerData $candidate;
    final /* synthetic */ IIpcStrategy $ipcStrategy;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18559x385be92c(BrokerData brokerData, IIpcStrategy iIpcStrategy, Continuation<? super C18559x385be92c> continuation) {
        super(2, continuation);
        this.$candidate = brokerData;
        this.$ipcStrategy = iIpcStrategy;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C18559x385be92c(this.$candidate, this.$ipcStrategy, continuation);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C32446OooOOOo.OooO0O0(obj);
        return BrokerDiscoveryClient.INSTANCE.makeRequest(this.$candidate, this.$ipcStrategy);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super BrokerData> continuation) {
        return ((C18559x385be92c) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }
}
