package o000OO00;

import OooOo.C20481OooOOoo;
import Oooo0oO.o0Oo0oo;
import androidx.appcompat.widget.C21532OooOOo;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX INFO: renamed from: o000OO00.Oooo00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24478Oooo00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f82776OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f82777OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final C20481OooOOoo<C24478Oooo00o> f82771OooO0OO = new C20481OooOOoo<>((Object) null);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final C24478Oooo00o f82772OooO0Oo = new C24478Oooo00o(0, GrsBaseInfo.CountryCodeSource.UNKNOWN);

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final C24478Oooo00o f82774OooO0o0 = new C24478Oooo00o(1, "MOUSE");

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final C24478Oooo00o f82773OooO0o = new C24478Oooo00o(2, "TOUCH");

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final C24478Oooo00o f82775OooO0oO = new C24478Oooo00o(3, "STYLUS");

    /* JADX INFO: renamed from: o000OO00.Oooo00o$OooO00o */
    public static final class OooO00o {
        public static C24478Oooo00o OooO00o(int i) {
            C24478Oooo00o c24478Oooo00oOooO0O0 = C24478Oooo00o.f82771OooO0OO.OooO0O0(i);
            if (c24478Oooo00oOooO0O0 != null) {
                return c24478Oooo00oOooO0O0;
            }
            throw new IllegalStateException(C21532OooOOo.OooO0OO(i, "Invalid InputToolType value: ").toString());
        }
    }

    public C24478Oooo00o(int i, String str) {
        this.f82776OooO00o = i;
        this.f82777OooO0O0 = str;
        C20481OooOOoo<C24478Oooo00o> c20481OooOOoo = f82771OooO0OO;
        if (c20481OooOOoo.OooO00o(i)) {
            throw new IllegalStateException(o0Oo0oo.OooO0O0(i, "Duplicate InputToolType value: ", ".").toString());
        }
        c20481OooOOoo.OooO0oO(i, this);
    }

    public final String toString() {
        return "InputToolType." + this.f82777OooO0O0;
    }
}
