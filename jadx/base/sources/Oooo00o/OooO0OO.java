package Oooo00o;

import OooooOo.InterfaceC21371OooO;
import com.aspose.slides.internal.p071cz.C2847og;
import com.google.firebase.inappmessaging.internal.InAppMessageStreamManager;
import oO00o00o.InterfaceC32330OooO0O0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO0OO implements InterfaceC21371OooO, InterfaceC32330OooO0O0 {
    public static double OooO0O0(C2847og c2847og, double d) {
        return c2847og.m12213h4().m12521x1().m12484x1() / d;
    }

    public static String OooO0OO(StringBuilder sb, float f, String str) {
        sb.append(f);
        sb.append(str);
        return sb.toString();
    }

    @Override // OooooOo.InterfaceC21371OooO
    public double OooO00o(double d) {
        double d2;
        double dPow = d < 0.0d ? -d : d;
        if (dPow >= 0.0031308049535603718d) {
            dPow = Math.pow(dPow, 0.4166666666666667d) - 0.05213270142180095d;
            d2 = 0.9478672985781991d;
        } else {
            d2 = 0.07739938080495357d;
        }
        return Math.copySign(dPow / d2, d);
    }

    @Override // oO00o00o.InterfaceC32330OooO0O0
    public void accept(Object obj) throws Exception {
        InAppMessageStreamManager.lambda$createFirebaseInAppMessageStream$15((Throwable) obj);
    }
}
