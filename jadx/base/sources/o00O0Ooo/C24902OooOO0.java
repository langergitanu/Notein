package o00O0Ooo;

import Oooo0oO.o0Oo0oo;
import android.content.ComponentName;
import android.content.Context;

/* JADX INFO: renamed from: o00O0Ooo.OooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24902OooOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final String f84514OooO00o = o00O0O0o.OooOO0O.OooO0o0("PackageManagerHelper");

    public static void OooO00o(Context context, Class<?> cls, boolean z) {
        String str = f84514OooO00o;
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z ? 1 : 2, 1);
            o00O0O0o.OooOO0O.OooO0OO().OooO00o(str, cls.getName() + " " + (z ? "enabled" : "disabled"), new Throwable[0]);
        } catch (Exception e) {
            o00O0O0o.OooOO0O.OooO0OO().OooO00o(str, o0Oo0oo.OooO0Oo(cls.getName(), " could not be ", z ? "enabled" : "disabled"), e);
        }
    }
}
