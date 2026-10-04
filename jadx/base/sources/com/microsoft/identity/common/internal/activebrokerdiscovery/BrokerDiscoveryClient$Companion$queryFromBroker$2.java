package com.microsoft.identity.common.internal.activebrokerdiscovery;

import Oooo0.C20857Oooooo;
import com.microsoft.identity.common.internal.broker.BrokerData;
import com.microsoft.identity.common.internal.broker.ipc.IIpcStrategy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.OooOo;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m80612d2 = {"LoO0o0OO/Oooo00o;", "Lcom/microsoft/identity/common/internal/broker/BrokerData;", "<anonymous>", "(LoO0o0OO/Oooo00o;)Lcom/microsoft/identity/common/internal/broker/BrokerData;"}, m80613k = 3, m80614mv = {1, 7, 1})
@InterfaceC32482OooO0o0(m80622c = "com.microsoft.identity.common.internal.activebrokerdiscovery.BrokerDiscoveryClient$Companion$queryFromBroker$2", m80623f = "BrokerDiscoveryClient.kt", m80624l = {108}, m80625m = "invokeSuspend")
public final class BrokerDiscoveryClient$Companion$queryFromBroker$2 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super BrokerData>, Object> {
    final /* synthetic */ Set<BrokerData> $brokerCandidates;
    final /* synthetic */ IIpcStrategy $ipcStrategy;
    final /* synthetic */ InterfaceC32507OooOO0o<BrokerData, Boolean> $isPackageInstalled;
    final /* synthetic */ InterfaceC32507OooOO0o<BrokerData, Boolean> $isValidBroker;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BrokerDiscoveryClient$Companion$queryFromBroker$2(Set<BrokerData> set, InterfaceC32507OooOO0o<? super BrokerData, Boolean> interfaceC32507OooOO0o, InterfaceC32507OooOO0o<? super BrokerData, Boolean> interfaceC32507OooOO0o2, IIpcStrategy iIpcStrategy, Continuation<? super BrokerDiscoveryClient$Companion$queryFromBroker$2> continuation) {
        super(2, continuation);
        this.$brokerCandidates = set;
        this.$isPackageInstalled = interfaceC32507OooOO0o;
        this.$isValidBroker = interfaceC32507OooOO0o2;
        this.$ipcStrategy = iIpcStrategy;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        BrokerDiscoveryClient$Companion$queryFromBroker$2 brokerDiscoveryClient$Companion$queryFromBroker$2 = new BrokerDiscoveryClient$Companion$queryFromBroker$2(this.$brokerCandidates, this.$isPackageInstalled, this.$isValidBroker, this.$ipcStrategy, continuation);
        brokerDiscoveryClient$Companion$queryFromBroker$2.L$0 = obj;
        return brokerDiscoveryClient$Companion$queryFromBroker$2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.label;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.L$0;
            Set<BrokerData> set = this.$brokerCandidates;
            InterfaceC32507OooOO0o<BrokerData, Boolean> interfaceC32507OooOO0o = this.$isPackageInstalled;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : set) {
                if (interfaceC32507OooOO0o.invoke((BrokerData) obj2).booleanValue()) {
                    arrayList.add(obj2);
                }
            }
            InterfaceC32507OooOO0o<BrokerData, Boolean> interfaceC32507OooOO0o2 = this.$isValidBroker;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : arrayList) {
                if (interfaceC32507OooOO0o2.invoke((BrokerData) obj3).booleanValue()) {
                    arrayList2.add(obj3);
                }
            }
            IIpcStrategy iIpcStrategy = this.$ipcStrategy;
            ArrayList arrayList3 = new ArrayList(C34428OooOOo.OooOOoo(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(C33609OooO0oo.OooO00o(interfaceC33636Oooo00o, BrokerDiscoveryClient.INSTANCE.getDispatcher(), new C18559x385be92c((BrokerData) it.next(), iIpcStrategy, null), 2));
            }
            this.label = 1;
            obj = C20857Oooooo.OooO00o(arrayList3, this);
            if (obj == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        return OooOo.Oooo(OooOo.Oooo0o0((Iterable) obj));
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super BrokerData> continuation) {
        return ((BrokerDiscoveryClient$Companion$queryFromBroker$2) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }
}
