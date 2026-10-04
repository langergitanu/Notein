package OooOoO;

import com.aspose.slides.internal.p071cz.C2847og;
import com.google.firebase.inappmessaging.internal.InAppMessageStreamManager;
import oO00o00o.InterfaceC32330OooO0O0;

/* JADX INFO: renamed from: OooOoO.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C20509OooO0oo implements InterfaceC32330OooO0O0 {
    public static double OooO00o(C2847og c2847og, double d) {
        return c2847og.m12213h4().m12521x1().m12482k4() / d;
    }

    public static float OooO0O0(float f, float f2, float f3, float f4) {
        return (f3 - (f * f2)) / f4;
    }

    public static int OooO0OO(float f, int i, int i2) {
        return (Float.hashCode(f) + i) * i2;
    }

    public static StringBuilder OooO0Oo(String str, float f, String str2, float f2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(f);
        sb.append(str2);
        sb.append(f2);
        sb.append(str3);
        return sb;
    }

    @Override // oO00o00o.InterfaceC32330OooO0O0
    public void accept(Object obj) throws Exception {
        InAppMessageStreamManager.lambda$getContentIfNotRateLimited$22((Boolean) obj);
    }
}
