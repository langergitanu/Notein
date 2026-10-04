package o0oo0OoO;

import com.facebook.soloader.OooOo;
import o000OO00.C24453OooO0oO;
import o000OO00.C24457OooOOo;
import o000OO00.C24477Oooo00O;
import o000OO00.C24485OoooO;

/* JADX INFO: renamed from: o0oo0OoO.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31269OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C31269OooO0O0 f111653OooO00o = new C31269OooO0O0();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static volatile C24457OooOOo f111654OooO0O0;

    public final synchronized C24457OooOOo OooO00o() {
        C24457OooOOo c24457OooOOo = f111654OooO0O0;
        if (c24457OooOOo != null) {
            return c24457OooOOo;
        }
        C24457OooOOo c24457OooOOo2 = new C24457OooOOo(new C24477Oooo00O(OooOo.OooO0oO((C24453OooO0oO) C24485OoooO.f82782OooO00o.getValue()), 255), new C24457OooOOo.OooO0O0.OooO0OO(), "notein-ballpoint-v1", 10);
        f111654OooO0O0 = c24457OooOOo2;
        return c24457OooOOo2;
    }
}
