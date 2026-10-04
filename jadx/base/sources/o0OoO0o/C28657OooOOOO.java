package o0OoO0o;

import OooOo.C20481OooOOoo;
import Oooo0oO.o0Oo0oo;
import androidx.appcompat.widget.C21532OooOOo;

/* JADX INFO: renamed from: o0OoO0o.OooOOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C28657OooOOOO {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final C20481OooOOoo<C28657OooOOOO> f101557OooO0OO = new C20481OooOOoo<>((Object) null);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final C28657OooOOOO f101558OooO0Oo = new C28657OooOOOO(0, "CLAMP");

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f101559OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f101560OooO0O0;

    /* JADX INFO: renamed from: o0OoO0o.OooOOOO$OooO00o */
    public static final class OooO00o {
        public static C28657OooOOOO OooO00o(int i) {
            C28657OooOOOO c28657OooOOOOOooO0O0 = C28657OooOOOO.f101557OooO0OO.OooO0O0(i);
            if (c28657OooOOOOOooO0O0 != null) {
                return c28657OooOOOOOooO0O0;
            }
            throw new IllegalStateException(C21532OooOOo.OooO0OO(i, "Invalid OutOfRange value: ").toString());
        }
    }

    static {
        new C28657OooOOOO(1, "REPEAT");
        new C28657OooOOOO(2, "MIRROR");
    }

    public C28657OooOOOO(int i, String str) {
        this.f101559OooO00o = i;
        this.f101560OooO0O0 = str;
        C20481OooOOoo<C28657OooOOOO> c20481OooOOoo = f101557OooO0OO;
        if (c20481OooOOoo.OooO00o(i)) {
            throw new IllegalStateException(o0Oo0oo.OooO0O0(i, "Duplicate OutOfRange value: ", ".").toString());
        }
        c20481OooOOoo.OooO0oO(i, this);
    }

    public final String toString() {
        return "OutOfRange." + this.f101560OooO0O0;
    }
}
