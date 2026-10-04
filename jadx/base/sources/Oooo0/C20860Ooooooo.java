package Oooo0;

import android.os.Bundle;
import com.aspose.slides.internal.p332p7.C8087kh;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: Oooo0.Ooooooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C20860Ooooooo implements o000OOO.OooO {
    public static String OooO0O0(C8087kh c8087kh, StringBuilder sb, String str) {
        sb.append(System.identityHashCode(c8087kh));
        sb.append(str);
        return sb.toString();
    }

    public static String OooO0OO(C34406OooO00o.C20358OooO00o c20358OooO00o, String str, String str2, int i) {
        c20358OooO00o.OooOOO0(str);
        return str2 + i;
    }

    public static boolean OooO0Oo(Bundle bundle, String str, Class cls, String str2) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(bundle, str);
        bundle.setClassLoader(cls.getClassLoader());
        return bundle.containsKey(str2);
    }

    @Override // o000OOO.OooO
    public double OooO00o(double d) {
        double d2 = d < 0.0d ? -d : d;
        return Math.copySign(d2 >= 0.04045d ? Math.pow((0.9478672985781991d * d2) + 0.05213270142180095d, 2.4d) : d2 * 0.07739938080495357d, d);
    }
}
