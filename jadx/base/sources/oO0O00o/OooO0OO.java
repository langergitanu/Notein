package oO0O00o;

import java.io.Serializable;
import oO0.OooO00o;
import oOo000o0.C34451OooO0O0;

/* JADX INFO: loaded from: classes10.dex */
public abstract class OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final AbstractC32515OooO00o f116800OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final OooO00o f116801OooOo0o = new OooO00o();

    public static final class OooO00o extends OooO0OO implements Serializable {

        /* JADX INFO: renamed from: oO0O00o.OooO0OO$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C20238OooO00o implements Serializable {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public static final C20238OooO00o f116802OooOo0o = new C20238OooO00o();
            private static final long serialVersionUID = 0;

            private final Object readResolve() {
                return OooO0OO.f116801OooOo0o;
            }
        }

        private final Object writeReplace() {
            return C20238OooO00o.f116802OooOo0o;
        }

        @Override // oO0O00o.OooO0OO
        public final int OooO00o(int i) {
            return OooO0OO.f116800OooOo.OooO00o(i);
        }
    }

    static {
        C34451OooO0O0.f123481OooO00o.getClass();
        Integer num = OooO00o.C20184OooO00o.f113728OooO00o;
        f116800OooOo = (num == null || num.intValue() >= 34) ? new oO0O00oO.OooO00o() : new OooO0O0();
    }

    public abstract int OooO00o(int i);
}
