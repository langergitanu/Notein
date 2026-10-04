package o0OoO0o;

import OooOo.C20481OooOOoo;
import Oooo0oO.o0Oo0oo;
import androidx.appcompat.widget.C21532OooOOo;

/* JADX INFO: renamed from: o0OoO0o.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C28660OooOOo0 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final C20481OooOOoo<C28660OooOOo0> f101570OooO0OO = new C20481OooOOoo<>((Object) null);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final C28660OooOOo0 f101571OooO0Oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f101572OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f101573OooO0O0;

    /* JADX INFO: renamed from: o0OoO0o.OooOOo0$OooO00o */
    public static final class OooO00o {
        public static C28660OooOOo0 OooO00o(int i) {
            C28660OooOOo0 c28660OooOOo0OooO0O0 = C28660OooOOo0.f101570OooO0OO.OooO0O0(i);
            if (c28660OooOOo0OooO0O0 != null) {
                return c28660OooOOo0OooO0O0;
            }
            throw new IllegalStateException(C21532OooOOo.OooO0OO(i, "Invalid ProgressDomain value: ").toString());
        }
    }

    static {
        new C28660OooOOo0(0, "DISTANCE_IN_CENTIMETERS");
        new C28660OooOOo0(1, "DISTANCE_IN_MULTIPLES_OF_BRUSH_SIZE");
        f101571OooO0Oo = new C28660OooOOo0(2, "TIME_IN_SECONDS");
    }

    public C28660OooOOo0(int i, String str) {
        this.f101572OooO00o = i;
        this.f101573OooO0O0 = str;
        C20481OooOOoo<C28660OooOOo0> c20481OooOOoo = f101570OooO0OO;
        if (c20481OooOOoo.OooO00o(i)) {
            throw new IllegalStateException(o0Oo0oo.OooO0O0(i, "Duplicate ProgressDomain value: ", ".").toString());
        }
        c20481OooOOoo.OooO0oO(i, this);
    }

    public final String toString() {
        return "ProgressDomain." + this.f101573OooO0O0;
    }
}
