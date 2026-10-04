package oO000Oo;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import o0OoooOo.RunnableC29640OooO0o0;
import oO0OOo0o.C33058OooO00o;
import oO0OOo0o.ExecutorC33121o00ooo;
import oO0OOo0o.o000oOoO;

/* JADX INFO: loaded from: classes10.dex */
public final class o0000OOO extends AbstractC31975Oooo {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final C33058OooO00o.OooO0O0<OooO0O0> f114528OooO0Oo = new C33058OooO00o.OooO0O0<>("io.grpc.internal.RetryingNameResolver.RESOLUTION_RESULT_LISTENER_KEY");

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooOO0 f114529OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ExecutorC33121o00ooo f114530OooO0OO;

    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            o0000OOO.this.OooO0O0();
        }
    }

    public class OooO0O0 {
        public OooO0O0() {
        }
    }

    public class OooO0OO extends o000oOoO.AbstractC33116OooO0Oo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o000oOoO.AbstractC33116OooO0Oo f114533OooO00o;

        public OooO0OO(o000oOoO.AbstractC33116OooO0Oo abstractC33116OooO0Oo) {
            this.f114533OooO00o = abstractC33116OooO0Oo;
        }

        @Override // oO0OOo0o.o000oOoO.InterfaceC33117OooO0o0
        public final void OooO00o(oO0OOo0o.o00Oo0 o00oo02) {
            this.f114533OooO00o.OooO00o(o00oo02);
            o0000OOO.this.f114530OooO0OO.execute(new RunnableC29640OooO0o0(this, 1));
        }

        @Override // oO0OOo0o.o000oOoO.AbstractC33116OooO0Oo
        public final void OooO0O0(o000oOoO.OooO0o oooO0o) {
            C33058OooO00o.OooO0O0<OooO0O0> oooO0O0 = o0000OOO.f114528OooO0Oo;
            C33058OooO00o c33058OooO00o = oooO0o.f119712OooO0O0;
            if (c33058OooO00o.f119519OooO00o.get(oooO0O0) != null) {
                throw new IllegalStateException("RetryingNameResolver can only be used once to wrap a NameResolver");
            }
            List list = Collections.EMPTY_LIST;
            C33058OooO00o c33058OooO00o2 = C33058OooO00o.f119518OooO0O0;
            c33058OooO00o.getClass();
            OooO0O0 oooO0O02 = o0000OOO.this.new OooO0O0();
            IdentityHashMap identityHashMap = new IdentityHashMap(1);
            identityHashMap.put(oooO0O0, oooO0O02);
            for (Map.Entry<C33058OooO00o.OooO0O0<?>, Object> entry : c33058OooO00o.f119519OooO00o.entrySet()) {
                if (!identityHashMap.containsKey(entry.getKey())) {
                    identityHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            this.f114533OooO00o.OooO0O0(new o000oOoO.OooO0o(oooO0o.f119711OooO00o, new C33058OooO00o(identityHashMap), oooO0o.f119713OooO0OO));
        }
    }

    public o0000OOO(oO0OOo0o.o000oOoO o000oooo2, OooOO0 oooOO02, ExecutorC33121o00ooo executorC33121o00ooo) {
        super(o000oooo2);
        this.f114529OooO0O0 = oooOO02;
        this.f114530OooO0OO = executorC33121o00ooo;
    }

    @Override // oO000Oo.AbstractC31975Oooo, oO0OOo0o.o000oOoO
    public final void OooO0OO() {
        super.OooO0OO();
        OooOO0 oooOO02 = this.f114529OooO0O0;
        ExecutorC33121o00ooo executorC33121o00ooo = oooOO02.f113971OooO0O0;
        executorC33121o00ooo.OooO0Oo();
        executorC33121o00ooo.execute(new OooO(oooOO02));
    }

    @Override // oO000Oo.AbstractC31975Oooo, oO0OOo0o.o000oOoO
    public final void OooO0o0(o000oOoO.AbstractC33116OooO0Oo abstractC33116OooO0Oo) {
        super.OooO0o0(new OooO0OO(abstractC33116OooO0Oo));
    }
}
