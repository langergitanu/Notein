package com.aspose.slides.internal.p407st;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p077d8.C3110yd;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.c6 */
/* JADX INFO: loaded from: classes4.dex */
class C10385c6 {

    /* JADX INFO: renamed from: com.aspose.slides.internal.st.c6$k4 */
    public static class k4 {

        /* JADX INFO: renamed from: du */
        int f36883du;

        /* JADX INFO: renamed from: k4 */
        char[] f36884k4;

        /* JADX INFO: renamed from: kk */
        short f36885kk;

        /* JADX INFO: renamed from: to */
        short f36886to;

        /* JADX INFO: renamed from: x1 */
        int f36887x1;

        private k4() {
            this.f36887x1 = 0;
            this.f36885kk = (short) 0;
            this.f36886to = (short) 0;
            this.f36883du = 0;
        }

        /* JADX INFO: renamed from: k4 */
        public int m50541k4() {
            char[] cArr = this.f36884k4;
            return (cArr == null ? 0 : cArr.length) + 12;
        }

        /* JADX INFO: renamed from: k4 */
        public void m50542k4(byte[] bArr, int i) {
            if (bArr.length < m50541k4() + i) {
                return;
            }
            int i2 = 0;
            while (true) {
                char[] cArr = this.f36884k4;
                if (i2 >= cArr.length) {
                    C3110yd.m13258x1(bArr, i, this.f36887x1);
                    C3110yd.m13246k4(bArr, i + 4, this.f36885kk);
                    C3110yd.m13246k4(bArr, i + 6, this.f36886to);
                    C3110yd.m13258x1(bArr, i + 8, this.f36883du);
                    return;
                }
                bArr[i] = (byte) cArr[i2];
                i2++;
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.st.c6$x1 */
    public static class x1 {

        /* JADX INFO: renamed from: c5 */
        int f36888c5;

        /* JADX INFO: renamed from: ck */
        int f36889ck;

        /* JADX INFO: renamed from: du */
        short f36890du;

        /* JADX INFO: renamed from: dy */
        int f36891dy;

        /* JADX INFO: renamed from: h4 */
        int f36892h4;

        /* JADX INFO: renamed from: jd */
        int f36893jd;

        /* JADX INFO: renamed from: k4 */
        int f36894k4;

        /* JADX INFO: renamed from: kk */
        int f36895kk;

        /* JADX INFO: renamed from: m9 */
        int f36896m9;

        /* JADX INFO: renamed from: to */
        short f36897to;

        /* JADX INFO: renamed from: x1 */
        int f36898x1;

        public x1(byte[] bArr, int i) {
            this.f36894k4 = 0;
            this.f36898x1 = 0;
            this.f36895kk = 0;
            this.f36897to = (short) 0;
            this.f36890du = (short) 0;
            this.f36892h4 = 0;
            this.f36896m9 = 0;
            this.f36891dy = 0;
            this.f36888c5 = 0;
            this.f36893jd = 0;
            this.f36889ck = 0;
            this.f36894k4 = C3110yd.m13249kk(bArr, i);
            this.f36898x1 = C3110yd.m13249kk(bArr, i + 4);
            this.f36895kk = C3110yd.m13249kk(bArr, i + 8);
            this.f36897to = C3110yd.m13241k4(bArr, i + 12);
            this.f36890du = C3110yd.m13241k4(bArr, i + 14);
            this.f36892h4 = C3110yd.m13249kk(bArr, i + 16);
            this.f36896m9 = C3110yd.m13249kk(bArr, i + 20);
            this.f36891dy = C3110yd.m13249kk(bArr, i + 24);
            this.f36888c5 = C3110yd.m13249kk(bArr, i + 28);
            this.f36893jd = C3110yd.m13249kk(bArr, i + 32);
            this.f36889ck = C3110yd.m13249kk(bArr, i + 36);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static byte[] m50540k4(byte[] bArr) {
        short s;
        try {
            x1 x1Var = new x1(bArr, 0);
            if (x1Var.f36896m9 == 0) {
                x1Var.f36896m9 = ((((x1Var.f36898x1 * x1Var.f36890du) + 31) & (-32)) >> 3) * C14116yg.m67482k4(x1Var.f36895kk);
            }
            if (x1Var.f36893jd == 0 && (s = x1Var.f36890du) < 16) {
                x1Var.f36893jd = 1 << s;
            }
            k4 k4Var = new k4();
            int i = x1Var.f36894k4;
            int i2 = x1Var.f36893jd;
            int i3 = (i2 * 4) + i + x1Var.f36896m9;
            k4Var.f36884k4 = new char[]{'B', 'M'};
            int i4 = i3 + 14;
            k4Var.f36887x1 = i4;
            k4Var.f36883du = (i2 * 4) + i + 14;
            byte[] bArr2 = new byte[i4];
            k4Var.m50542k4(bArr2, 0);
            System.arraycopy(bArr, 0, bArr2, 14, i3);
            return bArr2;
        } catch (Exception e) {
            C3085sv.m13082k4(e);
            return null;
        }
    }
}
