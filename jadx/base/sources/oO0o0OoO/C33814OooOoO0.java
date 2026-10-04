package oO0o0OoO;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24019OooOO0o;
import kotlin.jvm.internal.C24039Oooo0o0;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: oO0o0OoO.OooOoO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33814OooOoO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooO00o f121901OooO00o;

    /* JADX INFO: renamed from: oO0o0OoO.OooOoO0$OooO00o */
    public /* synthetic */ class OooO00o extends C24019OooOO0o implements InterfaceC32510OooOOo0<InterfaceC33723OooO0oO<? super Object>, Object, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO00o f121902OooOo0o = new OooO00o(3, InterfaceC33723OooO0oO.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);

        @Override // oO0O000o.InterfaceC32510OooOOo0
        public final Object invoke(InterfaceC33723OooO0oO<? super Object> interfaceC33723OooO0oO, Object obj, Continuation<? super C32460OooOooO> continuation) {
            return interfaceC33723OooO0oO.emit(obj, continuation);
        }
    }

    static {
        OooO00o oooO00o = OooO00o.f121902OooOo0o;
        kotlin.jvm.internal.OooOOO0.OooO0o0(oooO00o, "null cannot be cast to non-null type kotlin.Function3<kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>, kotlin.Any?, kotlin.coroutines.Continuation<kotlin.Unit>, kotlin.Any?>");
        C24039Oooo0o0.OooO0o0(3, oooO00o);
        f121901OooO00o = oooO00o;
    }
}
