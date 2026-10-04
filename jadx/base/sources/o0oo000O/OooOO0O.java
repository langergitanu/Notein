package o0oo000O;

import android.content.Context;
import android.content.res.Configuration;
import androidx.fragment.app.ActivityC21897OooOo0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOO0O {
    public static boolean OooO00o(Context context) {
        Configuration configuration = context.getResources().getConfiguration();
        kotlin.jvm.internal.OooOOO0.OooO0o(configuration, "getConfiguration(...)");
        return OooO0O0(configuration);
    }

    public static boolean OooO0O0(Configuration configuration) {
        int i = configuration.screenWidthDp;
        Integer numValueOf = Integer.valueOf(i);
        if (i == 0) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
        int i2 = configuration.screenHeightDp;
        Integer numValueOf2 = i2 != 0 ? Integer.valueOf(i2) : null;
        int iIntValue2 = numValueOf2 != null ? numValueOf2.intValue() : 0;
        int iMax = Math.max(iIntValue, iIntValue2);
        int iMin = Math.min(iIntValue, iIntValue2);
        int i3 = configuration.smallestScreenWidthDp;
        boolean z = i3 >= 600;
        boolean z2 = iMax >= 600 && iMin >= 480;
        boolean z3 = z || z2;
        C34406OooO00o.f123390OooO00o.OooO00o("ScreenClassUtils#isLargeScreen smallest=%d width=%d height=%d long=%d short=%d bySmallest=%b byAspect=%b -> %b", Integer.valueOf(i3), Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2), Integer.valueOf(iMax), Integer.valueOf(iMin), Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3));
        return z3;
    }

    public static boolean OooO0OO(ActivityC21897OooOo0 activityC21897OooOo0) {
        Configuration configuration = activityC21897OooOo0.getResources().getConfiguration();
        kotlin.jvm.internal.OooOOO0.OooO0o(configuration, "getConfiguration(...)");
        return OooO0O0(configuration);
    }
}
