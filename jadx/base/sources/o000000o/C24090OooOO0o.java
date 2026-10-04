package o000000o;

import android.content.Context;
import android.os.Build;

/* JADX INFO: renamed from: o000000o.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24090OooOO0o {
    public static final OooOO0 OooO00o(Context context) {
        C24083OooO00o c24083OooO00o = new C24083OooO00o();
        context.getApplicationContext();
        return new OooOO0(c24083OooO00o, new C24084OooO0O0(Build.VERSION.SDK_INT >= 31 ? context.getResources().getConfiguration().fontWeightAdjustment : 0));
    }
}
