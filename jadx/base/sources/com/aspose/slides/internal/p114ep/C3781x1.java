package com.aspose.slides.internal.p114ep;

import OooO0O0.C20395OooO0o0;
import androidx.datastore.preferences.protobuf.C21825OoooOO0;
import com.aspose.slides.internal.p340pm.C9464du;
import com.aspose.slides.internal.p472w8.C11913yj;

/* JADX INFO: renamed from: com.aspose.slides.internal.ep.x1 */
/* JADX INFO: loaded from: classes.dex */
public class C3781x1 {

    /* JADX INFO: renamed from: k4 */
    public final double f10295k4;

    /* JADX INFO: renamed from: kk */
    public final double f10296kk;

    /* JADX INFO: renamed from: x1 */
    public final double f10297x1;

    public C3781x1(float f, C11913yj c11913yj) {
        C9464du c9464duM46500k4 = C9464du.m46500k4(f, c11913yj);
        double dM15108k4 = m15108k4(c9464duM46500k4);
        this.f10295k4 = dM15108k4;
        double dCos = Math.cos(dM15108k4);
        double dSin = Math.sin(dM15108k4);
        float f2 = c9464duM46500k4.f34422k4;
        float f3 = c9464duM46500k4.f34425x1;
        double dOooO00o = C20395OooO0o0.OooO00o(f3, dCos, dSin, ((double) f2) * dCos * dCos);
        float f4 = c9464duM46500k4.f34423kk;
        double dOooO00o2 = C20395OooO0o0.OooO00o(f4, dSin, dSin, dOooO00o);
        double dOooO00o3 = C20395OooO0o0.OooO00o(f4, dCos, dCos, C21825OoooOO0.OooO00o(f3, dCos, dSin, ((double) f2) * dSin * dSin));
        double d = ((double) (-c9464duM46500k4.f34424to)) * (-4.0d) * dOooO00o2 * dOooO00o3;
        double d2 = 4.0d * dOooO00o2;
        this.f10296kk = Math.sqrt(d / ((d2 * dOooO00o3) * dOooO00o3));
        this.f10297x1 = Math.sqrt(d / ((d2 * dOooO00o2) * dOooO00o3));
    }

    /* JADX INFO: renamed from: k4 */
    public double m15109k4(double d) {
        if (d < 0.0d) {
            d += 6.283185307179586d;
        }
        return 6.283185307179586d - d;
    }

    /* JADX INFO: renamed from: k4 */
    private double m15108k4(C9464du c9464du) {
        return 1.5707963267948966d - m15109k4(Math.atan2(c9464du.f34425x1, c9464du.f34422k4 - c9464du.f34423kk) / 2.0d);
    }
}
