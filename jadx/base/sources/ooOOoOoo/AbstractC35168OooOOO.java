package ooOOoOoo;

import oO0O0oOo.C32776OooO0o0;
import ooOOoOoo.InterfaceC35161OooO0o;

/* JADX INFO: renamed from: ooOOoOoo.OooOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC35168OooOOO implements InterfaceC35161OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f126243OooO00o;

    /* JADX INFO: renamed from: ooOOoOoo.OooOOO$OooO00o */
    public static final class OooO00o extends AbstractC35168OooOOO {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final OooO00o f126244OooO0O0 = new OooO00o("must be a member function");

        @Override // ooOOoOoo.InterfaceC35161OooO0o
        public final boolean OooO0O0(C32776OooO0o0 c32776OooO0o0) {
            return c32776OooO0o0.f117447Oooo000 != null;
        }
    }

    /* JADX INFO: renamed from: ooOOoOoo.OooOOO$OooO0O0 */
    public static final class OooO0O0 extends AbstractC35168OooOOO {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final OooO0O0 f126245OooO0O0 = new OooO0O0("must be a member or an extension function");

        @Override // ooOOoOoo.InterfaceC35161OooO0o
        public final boolean OooO0O0(C32776OooO0o0 c32776OooO0o0) {
            return (c32776OooO0o0.f117447Oooo000 == null && c32776OooO0o0.f117444OooOooo == null) ? false : true;
        }
    }

    public AbstractC35168OooOOO(String str) {
        this.f126243OooO00o = str;
    }

    @Override // ooOOoOoo.InterfaceC35161OooO0o
    public final String OooO00o(C32776OooO0o0 c32776OooO0o0) {
        return InterfaceC35161OooO0o.OooO00o.OooO00o(this, c32776OooO0o0);
    }

    @Override // ooOOoOoo.InterfaceC35161OooO0o
    public final String getDescription() {
        return this.f126243OooO00o;
    }
}
