package oO0OOOO0;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import oO0OOOO0.AbstractC32954OooO0oo;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0o {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final /* synthetic */ int f119069OooO0O0 = 0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Map<OooO00o, AbstractC32954OooO0oo.C32956OooO0o0<?, ?>> f119070OooO00o;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final InterfaceC32958OooOOOo f119071OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f119072OooO0O0;

        public OooO00o(int i, InterfaceC32958OooOOOo interfaceC32958OooOOOo) {
            this.f119071OooO00o = interfaceC32958OooOOOo;
            this.f119072OooO0O0 = i;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof OooO00o)) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            return this.f119071OooO00o == oooO00o.f119071OooO00o && this.f119072OooO0O0 == oooO00o.f119072OooO0O0;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f119071OooO00o) * 65535) + this.f119072OooO0O0;
        }
    }

    static {
        new OooO0o(0);
    }

    public OooO0o() {
        this.f119070OooO00o = new HashMap();
    }

    public final void OooO00o(AbstractC32954OooO0oo.C32956OooO0o0<?, ?> c32956OooO0o0) {
        this.f119070OooO00o.put(new OooO00o(c32956OooO0o0.f119093OooO0Oo.f119088OooOo0o, c32956OooO0o0.f119090OooO00o), c32956OooO0o0);
    }

    public OooO0o(int i) {
        this.f119070OooO00o = Collections.EMPTY_MAP;
    }
}
