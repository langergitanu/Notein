package com.aspose.slides.internal.p284mx;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.IOException;
import com.aspose.slides.internal.p080dd.C3123ar;
import com.aspose.slides.internal.p080dd.C3148wl;
import com.aspose.slides.internal.p284mx.C6618k4;
import com.aspose.slides.internal.p558zz.C13637dy;

/* JADX INFO: renamed from: com.aspose.slides.internal.mx.x1 */
/* JADX INFO: loaded from: classes4.dex */
public class C6621x1 {

    /* JADX INFO: renamed from: k4 */
    private boolean f18357k4 = false;

    /* JADX INFO: renamed from: x1 */
    private List<Integer> f18358x1;

    private C6621x1() {
    }

    /* JADX INFO: renamed from: k4 */
    private C6618k4.k4 m26417k4(C13637dy c13637dy, int i) {
        return C6618k4.k4.m26405k4(this, c13637dy, i);
    }

    /* JADX INFO: renamed from: kk */
    private C6618k4.k4[] m26420kk(C3148wl c3148wl) {
        C13637dy c13637dyM62959fa = C13637dy.m62959fa((int) c3148wl.mo13437k4().getLength());
        c13637dyM62959fa.m62964k4(c3148wl);
        return m26419k4(c13637dyM62959fa);
    }

    /* JADX INFO: renamed from: to */
    private static boolean m26421to(C3148wl c3148wl) {
        byte[] bArr = new byte[4];
        c3148wl.mo13437k4().read(bArr, 0, 4);
        c3148wl.mo13437k4().setPosition(c3148wl.mo13437k4().getPosition() - 4);
        return C6619kk.f18328k4 == C6619kk.m26410k4(bArr);
    }

    /* JADX INFO: renamed from: x1 */
    private C6618k4[] m26422x1(C3148wl c3148wl) {
        C6618k4.k4[] k4VarArrM26420kk = m26420kk(c3148wl);
        int length = k4VarArrM26420kk.length;
        C6618k4[] c6618k4Arr = new C6618k4[length];
        for (int i = 0; i < length; i++) {
            c6618k4Arr[i] = k4VarArrM26420kk[i].m26409k4();
        }
        return c6618k4Arr;
    }

    /* JADX INFO: renamed from: k4 */
    public static C6621x1 m26418k4() {
        return new C6621x1();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m26423k4(C6618k4 c6618k4, C3123ar c3123ar) {
        c6618k4.m26390k4(c3123ar, this.f18358x1);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m26424k4(boolean z) {
        this.f18357k4 = z;
    }

    /* JADX INFO: renamed from: k4 */
    private C6618k4.k4[] m26419k4(C13637dy c13637dy) {
        int i = 0;
        c13637dy.m62998dy(0);
        c13637dy.m63000jd(4);
        int iM62998dy = c13637dy.m62998dy(8);
        C6618k4.k4[] k4VarArr = new C6618k4.k4[iM62998dy];
        int i2 = 12;
        while (i < iM62998dy) {
            k4VarArr[i] = m26417k4(c13637dy, c13637dy.m62998dy(i2));
            i++;
            i2 += 4;
        }
        return k4VarArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final C6618k4[] m26425k4(C3148wl c3148wl) {
        if (m26421to(c3148wl)) {
            return m26422x1(c3148wl);
        }
        if (this.f18357k4) {
            throw new IOException("Unable to get requested message digest algorithm.");
        }
        return new C6618k4[]{C6618k4.k4.m26404k4(this, c3148wl).m26409k4()};
    }
}
