package ooOOoOoo;

import oO0O0oOo.C32776OooO0o0;
import ooOOoOoo.InterfaceC35161OooO0o;

/* JADX INFO: renamed from: ooOOoOoo.OooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC35180OooOoO implements InterfaceC35161OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f126289OooO00o;

    /* JADX INFO: renamed from: ooOOoOoo.OooOoO$OooO00o */
    public static final class OooO00o extends AbstractC35180OooOoO {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f126290OooO0O0;

        /* JADX WARN: Illegal instructions before constructor call */
        public OooO00o(int i) {
            StringBuilder sbOooO0OO = OooO0O0.OooO0o.OooO0OO(i, "must have at least ", " value parameter");
            sbOooO0OO.append(i > 1 ? "s" : "");
            super(sbOooO0OO.toString());
            this.f126290OooO0O0 = i;
        }

        @Override // ooOOoOoo.InterfaceC35161OooO0o
        public final boolean OooO0O0(C32776OooO0o0 c32776OooO0o0) {
            return c32776OooO0o0.OooO0o().size() >= this.f126290OooO0O0;
        }
    }

    /* JADX INFO: renamed from: ooOOoOoo.OooOoO$OooO0O0 */
    public static final class OooO0O0 extends AbstractC35180OooOoO {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f126291OooO0O0;

        public OooO0O0() {
            super("must have exactly 2 value parameters");
            this.f126291OooO0O0 = 2;
        }

        @Override // ooOOoOoo.InterfaceC35161OooO0o
        public final boolean OooO0O0(C32776OooO0o0 c32776OooO0o0) {
            return c32776OooO0o0.OooO0o().size() == this.f126291OooO0O0;
        }
    }

    /* JADX INFO: renamed from: ooOOoOoo.OooOoO$OooO0OO */
    public static final class OooO0OO extends AbstractC35180OooOoO {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final OooO0OO f126292OooO0O0 = new OooO0OO("must have no value parameters");

        @Override // ooOOoOoo.InterfaceC35161OooO0o
        public final boolean OooO0O0(C32776OooO0o0 c32776OooO0o0) {
            return c32776OooO0o0.OooO0o().isEmpty();
        }
    }

    /* JADX INFO: renamed from: ooOOoOoo.OooOoO$OooO0Oo, reason: case insensitive filesystem */
    public static final class C35181OooO0Oo extends AbstractC35180OooOoO {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final C35181OooO0Oo f126293OooO0O0 = new C35181OooO0Oo("must have a single value parameter");

        @Override // ooOOoOoo.InterfaceC35161OooO0o
        public final boolean OooO0O0(C32776OooO0o0 c32776OooO0o0) {
            return c32776OooO0o0.OooO0o().size() == 1;
        }
    }

    public AbstractC35180OooOoO(String str) {
        this.f126289OooO00o = str;
    }

    @Override // ooOOoOoo.InterfaceC35161OooO0o
    public final String OooO00o(C32776OooO0o0 c32776OooO0o0) {
        return InterfaceC35161OooO0o.OooO00o.OooO00o(this, c32776OooO0o0);
    }

    @Override // ooOOoOoo.InterfaceC35161OooO0o
    public final String getDescription() {
        return this.f126289OooO00o;
    }
}
