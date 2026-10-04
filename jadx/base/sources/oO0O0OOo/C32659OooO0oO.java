package oO0O0OOo;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.C24023OooOOoo;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32460OooOooO;
import oO0o0OO.InterfaceC33611OooOO0O;
import oOoo0.InterfaceC34594OooO0OO;

/* JADX INFO: renamed from: oO0O0OOo.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32659OooO0oO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater<C32659OooO0oO, InterfaceC33611OooOO0O<C32460OooOooO>>[] f117361OooO00o;
    private volatile InterfaceC33611OooOO0O<? super C32460OooOooO> acceptHandlerReference;
    private volatile InterfaceC33611OooOO0O<? super C32460OooOooO> connectHandlerReference;
    private volatile InterfaceC33611OooOO0O<? super C32460OooOooO> readHandlerReference;
    private volatile InterfaceC33611OooOO0O<? super C32460OooOooO> writeHandlerReference;

    /* JADX INFO: renamed from: oO0O0OOo.OooO0oO$OooO00o */
    public /* synthetic */ class OooO00o extends C24023OooOOoo {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO00o f117362OooOo0o = new OooO00o(C32659OooO0oO.class, "readHandlerReference", "getReadHandlerReference()Lkotlinx/coroutines/CancellableContinuation;", 0);

        @Override // kotlin.jvm.internal.C24023OooOOoo, oOoo0.InterfaceC34603OooOOO
        public final Object get(Object obj) {
            return ((C32659OooO0oO) obj).readHandlerReference;
        }
    }

    /* JADX INFO: renamed from: oO0O0OOo.OooO0oO$OooO0O0 */
    public /* synthetic */ class OooO0O0 extends C24023OooOOoo {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO0O0 f117363OooOo0o = new OooO0O0(C32659OooO0oO.class, "writeHandlerReference", "getWriteHandlerReference()Lkotlinx/coroutines/CancellableContinuation;", 0);

        @Override // kotlin.jvm.internal.C24023OooOOoo, oOoo0.InterfaceC34603OooOOO
        public final Object get(Object obj) {
            return ((C32659OooO0oO) obj).writeHandlerReference;
        }
    }

    /* JADX INFO: renamed from: oO0O0OOo.OooO0oO$OooO0OO */
    public /* synthetic */ class OooO0OO extends C24023OooOOoo {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO0OO f117364OooOo0o = new OooO0OO(C32659OooO0oO.class, "acceptHandlerReference", "getAcceptHandlerReference()Lkotlinx/coroutines/CancellableContinuation;", 0);

        @Override // kotlin.jvm.internal.C24023OooOOoo, oOoo0.InterfaceC34603OooOOO
        public final Object get(Object obj) {
            return ((C32659OooO0oO) obj).acceptHandlerReference;
        }
    }

    /* JADX INFO: renamed from: oO0O0OOo.OooO0oO$OooO0Oo, reason: case insensitive filesystem */
    public /* synthetic */ class C32660OooO0Oo extends C24023OooOOoo {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final C32660OooO0Oo f117365OooOo0o = new C32660OooO0Oo(C32659OooO0oO.class, "connectHandlerReference", "getConnectHandlerReference()Lkotlinx/coroutines/CancellableContinuation;", 0);

        @Override // kotlin.jvm.internal.C24023OooOOoo, oOoo0.InterfaceC34603OooOOO
        public final Object get(Object obj) {
            return ((C32659OooO0oO) obj).connectHandlerReference;
        }
    }

    /* JADX INFO: renamed from: oO0O0OOo.OooO0oO$OooO0o0, reason: case insensitive filesystem */
    public static final class C32661OooO0o0 {
    }

    static {
        InterfaceC34594OooO0OO interfaceC34594OooO0OO;
        OooOO0[] oooOO0Arr = OooOO0.f117367OooOo;
        OooOO0[] oooOO0Arr2 = OooOO0.f117367OooOo;
        ArrayList arrayList = new ArrayList(oooOO0Arr2.length);
        for (OooOO0 oooOO02 : oooOO0Arr2) {
            int iOrdinal = oooOO02.ordinal();
            if (iOrdinal == 0) {
                interfaceC34594OooO0OO = OooO00o.f117362OooOo0o;
            } else if (iOrdinal == 1) {
                interfaceC34594OooO0OO = OooO0O0.f117363OooOo0o;
            } else if (iOrdinal == 2) {
                interfaceC34594OooO0OO = OooO0OO.f117364OooOo0o;
            } else {
                if (iOrdinal != 3) {
                    throw new C32442OooOO0o();
                }
                interfaceC34594OooO0OO = C32660OooO0Oo.f117365OooOo0o;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdaterNewUpdater = AtomicReferenceFieldUpdater.newUpdater(C32659OooO0oO.class, InterfaceC33611OooOO0O.class, interfaceC34594OooO0OO.getName());
            kotlin.jvm.internal.OooOOO0.OooO0o0(atomicReferenceFieldUpdaterNewUpdater, "null cannot be cast to non-null type java.util.concurrent.atomic.AtomicReferenceFieldUpdater<io.ktor.network.selector.InterestSuspensionsMap, kotlinx.coroutines.CancellableContinuation<kotlin.Unit>?>");
            arrayList.add(atomicReferenceFieldUpdaterNewUpdater);
        }
        f117361OooO00o = (AtomicReferenceFieldUpdater[]) arrayList.toArray(new AtomicReferenceFieldUpdater[0]);
    }

    public final String toString() {
        return "R " + this.readHandlerReference + " W " + this.writeHandlerReference + " C " + this.connectHandlerReference + " A " + this.acceptHandlerReference;
    }
}
