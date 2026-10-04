package OooooOo;

import com.aspose.slides.internal.p071cz.C2860po;

/* JADX INFO: renamed from: OooooOo.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C21377OooO0o0 implements InterfaceC21371OooO {
    public static double OooO0O0(C2860po c2860po, double d) {
        return c2860po.m12213h4().m12521x1().m12482k4() / d;
    }

    @Override // OooooOo.InterfaceC21371OooO
    public double OooO00o(double d) {
        double d2 = d < 0.0d ? -d : d;
        return Math.copySign(d2 >= 0.04045d ? Math.pow((0.9478672985781991d * d2) + 0.05213270142180095d, 2.4d) : d2 * 0.07739938080495357d, d);
    }
}
