package com.aspose.slides.internal.p118ex;

import com.aspose.slides.C22200OooO0o0;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ex.fa */
/* JADX INFO: loaded from: classes.dex */
public class C3816fa {

    /* JADX INFO: renamed from: k4 */
    private C3823m9 f10392k4;

    /* JADX INFO: renamed from: kk */
    private String f10393kk = C14113y2.f47374k4;

    /* JADX INFO: renamed from: to */
    private int f10394to;

    /* JADX INFO: renamed from: x1 */
    private C3826rv[] f10395x1;

    public C3816fa(C3823m9 c3823m9) {
        this.f10392k4 = c3823m9;
    }

    /* JADX INFO: renamed from: x1 */
    private int m15269x1(int i) {
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (true) {
            int i5 = i2 + 1;
            if (i2 >= 32) {
                return i4;
            }
            if ((i & i3) == i3) {
                i4++;
            }
            i3 <<= 1;
            i2 = i5;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public C3823m9 m15270k4() {
        return this.f10392k4;
    }

    /* JADX INFO: renamed from: kk */
    public int m15272kk() {
        return this.f10394to;
    }

    /* JADX INFO: renamed from: to */
    public void m15273to() {
        int i = this.f10394to;
        if (i == 0) {
            this.f10395x1 = (C3826rv[]) C22200OooO0o0.OooO00o(C3826rv.class, 0);
            return;
        }
        C3826rv[] c3826rvArr = (C3826rv[]) C22200OooO0o0.OooO00o(C3826rv.class, m15269x1(i));
        this.f10395x1 = c3826rvArr;
        int[] iArr = {0};
        m15268k4(c3826rvArr, iArr, this.f10394to, 32);
        iArr[0] = iArr[0];
        m15268k4(this.f10395x1, iArr, this.f10394to, 1);
        iArr[0] = iArr[0];
        m15268k4(this.f10395x1, iArr, this.f10394to, 2);
        iArr[0] = iArr[0];
        m15268k4(this.f10395x1, iArr, this.f10394to, 4);
        iArr[0] = iArr[0];
        m15268k4(this.f10395x1, iArr, this.f10394to, 8);
        iArr[0] = iArr[0];
        m15268k4(this.f10395x1, iArr, this.f10394to, 16);
        iArr[0] = iArr[0];
        m15268k4(this.f10395x1, iArr, this.f10394to, 64);
        iArr[0] = iArr[0];
        m15268k4(this.f10395x1, iArr, this.f10394to, 128);
        iArr[0] = iArr[0];
        m15268k4(this.f10395x1, iArr, this.f10394to, 256);
        iArr[0] = iArr[0];
        m15268k4(this.f10395x1, iArr, this.f10394to, 512);
        iArr[0] = iArr[0];
        m15268k4(this.f10395x1, iArr, this.f10394to, 1024);
        iArr[0] = iArr[0];
        m15268k4(this.f10395x1, iArr, this.f10394to, 2048);
        iArr[0] = iArr[0];
        m15268k4(this.f10395x1, iArr, this.f10394to, 4096);
        iArr[0] = iArr[0];
        m15268k4(this.f10395x1, iArr, this.f10394to, 8192);
        iArr[0] = iArr[0];
        m15268k4(this.f10395x1, iArr, this.f10394to, 16384);
        iArr[0] = iArr[0];
        m15268k4(this.f10395x1, iArr, this.f10394to, 32768);
        iArr[0] = iArr[0];
        m15268k4(this.f10395x1, iArr, this.f10394to, 65536);
        iArr[0] = iArr[0];
        m15268k4(this.f10395x1, iArr, this.f10394to, 131072);
        iArr[0] = iArr[0];
        m15268k4(this.f10395x1, iArr, this.f10394to, 262144);
        iArr[0] = iArr[0];
        m15268k4(this.f10395x1, iArr, this.f10394to, 524288);
        iArr[0] = iArr[0];
        m15268k4(this.f10395x1, iArr, this.f10394to, 16777216);
        iArr[0] = iArr[0];
        m15268k4(this.f10395x1, iArr, this.f10394to, 33554432);
    }

    /* JADX INFO: renamed from: k4 */
    public void m15271k4(int i) {
        this.f10394to = i;
    }

    /* JADX INFO: renamed from: x1 */
    public C3826rv[] m15274x1() {
        return this.f10395x1;
    }

    /* JADX INFO: renamed from: k4 */
    private void m15268k4(C3826rv[] c3826rvArr, int[] iArr, int i, int i2) {
        if ((i & i2) != 0) {
            c3826rvArr[iArr[0]].m15335k4(i2);
            c3826rvArr[iArr[0]].m15337k4(C3826rv.m15332x1(i2));
            iArr[0] = iArr[0] + 1;
        }
    }
}
