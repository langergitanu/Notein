package o00oo0Oo;

import OooooOO.C21354OoooooO;
import android.util.Log;
import o00o0o.AbstractC25434OooO00o;
import o00o0o.C25437OooO0Oo;
import o00o0o00.C25438OooO00o;

/* JADX INFO: renamed from: o00oo0Oo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25685OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C19715OooO00o f87633OooO00o;

    /* JADX INFO: renamed from: o00oo0Oo.OooO00o$OooO00o, reason: collision with other inner class name */
    public class C19715OooO00o implements AbstractC25434OooO00o.OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ C21354OoooooO f87634OooO00o;

        public C19715OooO00o(C21354OoooooO c21354OoooooO) {
            this.f87634OooO00o = c21354OoooooO;
        }

        @Override // o00o0o.AbstractC25434OooO00o.OooO0OO
        public final void OooO00o(C25437OooO0Oo<Object> reference, Throwable th) {
            this.f87634OooO00o.getClass();
            kotlin.jvm.internal.OooOOO0.OooO0oO(reference, "reference");
            Object objOooO00o = reference.OooO00o();
            C25438OooO00o.OooOO0("Fresco", "Finalized without closing: %x %x (type = %s).\nStack:\n%s", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(reference)), objOooO00o != null ? objOooO00o.getClass().getName() : "<value is null>", th == null ? "" : Log.getStackTraceString(th));
        }

        @Override // o00o0o.AbstractC25434OooO00o.OooO0OO
        public final boolean OooO0O0() {
            this.f87634OooO00o.getClass();
            return false;
        }
    }

    public C25685OooO00o(C21354OoooooO c21354OoooooO) {
        this.f87633OooO00o = new C19715OooO00o(c21354OoooooO);
    }
}
