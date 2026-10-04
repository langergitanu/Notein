package com.aspose.slides.internal.p203je;

import com.aspose.slides.exceptions.InvalidEnumArgumentException;
import com.aspose.slides.internal.p140fz.C4143du;
import com.aspose.slides.internal.p140fz.InterfaceC4146h4;
import com.aspose.slides.internal.p180ib.InterfaceC4809to;
import com.aspose.slides.internal.p362qj.C9883du;
import com.aspose.slides.internal.p362qj.C9884h4;
import com.aspose.slides.internal.p362qj.C9886kk;
import com.aspose.slides.internal.p362qj.C9887to;
import com.aspose.slides.internal.p362qj.C9888x1;
import com.aspose.slides.internal.p362qj.InterfaceC9885k4;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p475wh.C12026yj;

/* JADX INFO: renamed from: com.aspose.slides.internal.je.x1 */
/* JADX INFO: loaded from: classes.dex */
public class C5444x1 {
    /* JADX INFO: renamed from: k4 */
    private static float m22269k4(C12026yj c12026yj, boolean z) {
        float fM56930ne = c12026yj.m56930ne() * c12026yj.m56907c5();
        if (c12026yj.m56911dy() == 0 || !z) {
            return fM56930ne;
        }
        float f = 0.0f;
        for (float f2 : c12026yj.m56916jd()) {
            f += f2;
        }
        return ((c12026yj.m56930ne() * f) + fM56930ne) - c12026yj.m56930ne();
    }

    /* JADX INFO: renamed from: k4 */
    public static C5443k4 m22270k4(C12026yj c12026yj, C11896dy c11896dy, InterfaceC4809to interfaceC4809to) {
        if (c12026yj.m56908ck() == 0) {
            return null;
        }
        if (c12026yj.m56908ck() == 5 && c12026yj.m56916jd().length == 1) {
            return null;
        }
        return new C5443k4(m22269k4(c12026yj, c11896dy.m55569rv()), m22272k4(c12026yj), interfaceC4809to);
    }

    /* JADX INFO: renamed from: k4 */
    public static InterfaceC9885k4 m22271k4(C12026yj c12026yj, InterfaceC4146h4 interfaceC4146h4) {
        int iM56911dy = c12026yj.m56911dy();
        if (iM56911dy == 0) {
            return new C9888x1();
        }
        if (iM56911dy == 2) {
            return c12026yj.m56940x6().m55789x1() ? new C9886kk() : new C9887to(c12026yj.m56930ne() / 2.0f, c12026yj.m56940x6());
        }
        if (iM56911dy != 3) {
            throw new InvalidEnumArgumentException("DashCap");
        }
        if (interfaceC4146h4 instanceof C4143du) {
            return null;
        }
        return c12026yj.m56940x6().m55789x1() ? new C9884h4() : new C9883du(c12026yj.m56930ne() / 2.0f, c12026yj.m56940x6());
    }

    /* JADX INFO: renamed from: k4 */
    private static float[] m22272k4(C12026yj c12026yj) {
        float[] fArrM56916jd = c12026yj.m56916jd();
        int length = fArrM56916jd.length % 2 == 0 ? fArrM56916jd.length : fArrM56916jd.length + 1;
        float[] fArr = new float[length];
        for (int i = 0; i < fArrM56916jd.length; i++) {
            fArr[i] = fArrM56916jd[i];
        }
        float fMax = Math.max(c12026yj.m56930ne(), 1.0f);
        for (int i2 = 0; i2 < length; i2++) {
            fArr[i2] = fArr[i2] * fMax;
            if (c12026yj.m56911dy() != 0) {
                if (i2 % 2 == 0) {
                    fArr[i2] = Math.max(fArr[i2] - c12026yj.m56930ne(), 0.01f);
                } else {
                    fArr[i2] = c12026yj.m56930ne() + fArr[i2];
                }
            }
        }
        return fArr;
    }
}
