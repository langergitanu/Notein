package com.aspose.slides.internal.p106ef;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p135fp.C4090du;
import com.aspose.slides.internal.p135fp.C4094ix;
import com.aspose.slides.internal.p135fp.C4106up;
import com.aspose.slides.internal.p135fp.C4111x6;
import com.aspose.slides.internal.p225ke.C5667to;

/* JADX INFO: renamed from: com.aspose.slides.internal.ef.to */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3680to {

    /* JADX INFO: renamed from: k4 */
    protected final C4094ix f10221k4;

    /* JADX INFO: renamed from: kk */
    protected C4106up f10222kk;

    /* JADX INFO: renamed from: to */
    protected int f10223to;

    /* JADX INFO: renamed from: m9 */
    private static final int[] f10218m9 = {0, -1, -3, -7, -15, -31, -63, -127, -255, -511, -1023, -2047, -4095, -8191, -16383, -32767};

    /* JADX INFO: renamed from: dy */
    private static final int[] f10217dy = {0, 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384};

    /* JADX INFO: renamed from: du */
    protected C3677k4 f10219du = new C3677k4();

    /* JADX INFO: renamed from: h4 */
    protected boolean f10220h4 = false;

    /* JADX INFO: renamed from: x1 */
    protected int[] f10224x1 = new int[C5667to.f15657x1];

    public AbstractC3680to(C4106up c4106up) {
        this.f10222kk = c4106up;
        this.f10221k4 = c4106up.m16404ck();
    }

    /* JADX INFO: renamed from: k4 */
    public static int m14908k4(int i, int i2) {
        return i < f10217dy[i2] ? i + f10218m9[i2] : i;
    }

    /* JADX INFO: renamed from: x1 */
    public static int m14911x1(int i, C3677k4[] c3677k4Arr) {
        C3677k4 c3677k4 = c3677k4Arr[0];
        int i2 = c3677k4.f10201x1 - i;
        c3677k4.f10201x1 = i2;
        return ((1 << i) - 1) & (c3677k4.f10200k4 >> i2);
    }

    /* JADX INFO: renamed from: k4 */
    public abstract void mo14887k4();

    /* JADX INFO: renamed from: k4 */
    public abstract boolean mo14888k4(C4111x6 c4111x6);

    /* JADX INFO: renamed from: kk */
    public void m14916kk() {
        this.f10221k4.m16308x1(this.f10219du.f10201x1 / 8);
        this.f10219du.f10201x1 = 0;
    }

    /* JADX INFO: renamed from: to */
    public void mo14890to() {
        m14916kk();
        if (!this.f10221k4.m16305m9()) {
            throw new Exception("Invalid jpeg marker");
        }
        int i = 0;
        while (true) {
            int[] iArr = this.f10224x1;
            if (i >= iArr.length) {
                break;
            }
            iArr[i] = 0;
            i++;
        }
        this.f10223to = this.f10222kk.m16424up();
        if (this.f10221k4.m16299k4() == 0) {
            this.f10220h4 = false;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static int m14909k4(int i, C3677k4 c3677k4) {
        return ((1 << i) - 1) & (c3677k4.f10200k4 >> (c3677k4.f10201x1 - i));
    }

    /* JADX INFO: renamed from: x1 */
    public C4106up m14917x1() {
        return this.f10222kk;
    }

    /* JADX INFO: renamed from: k4 */
    public int m14912k4(C3677k4[] c3677k4Arr, C4090du c4090du, int i) {
        if (!m14913k4(i, c3677k4Arr)) {
            return -1;
        }
        int iM14911x1 = m14911x1(i, c3677k4Arr);
        while (iM14911x1 > c4090du.m16275dy()[i]) {
            int i2 = iM14911x1 << 1;
            if (!m14913k4(1, c3677k4Arr)) {
                return -1;
            }
            iM14911x1 = i2 | m14911x1(1, c3677k4Arr);
            i++;
        }
        if (i > 16) {
            return 0;
        }
        return c4090du.m16274du()[iM14911x1 + c4090du.m16273ck()[i]] & 255;
    }

    /* JADX INFO: renamed from: k4 */
    public static void m14910k4(int i, int[] iArr) {
        iArr[0] = iArr[0] - i;
    }

    /* JADX INFO: renamed from: k4 */
    public boolean m14913k4(int i, C3677k4[] c3677k4Arr) {
        return c3677k4Arr[0].f10201x1 >= i || m14915k4(c3677k4Arr, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001f  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m14914k4(C4090du c4090du, int[] iArr, C3677k4[] c3677k4Arr) {
        int i;
        if (c3677k4Arr[0].f10201x1 >= C5667to.f15653du) {
            i = 0;
        } else {
            if (!m14915k4(c3677k4Arr, 0)) {
                iArr[0] = -1;
                return false;
            }
            if (c3677k4Arr[0].f10201x1 < C5667to.f15653du) {
                i = 1;
            }
        }
        int i2 = i;
        if (i == 0) {
            int iM14909k4 = m14909k4(C5667to.f15653du, c3677k4Arr[0].Clone());
            int i3 = c4090du.m16277h4()[iM14909k4];
            if (i3 != 0) {
                int[] iArr2 = {c3677k4Arr[0].f10201x1};
                m14910k4(i3, iArr2);
                c3677k4Arr[0].f10201x1 = iArr2[0];
                iArr[0] = c4090du.m16282m9()[iM14909k4];
                return true;
            }
            i2 = C5667to.f15653du + 1;
        }
        int iM14912k4 = m14912k4(c3677k4Arr, c4090du, i2);
        iArr[0] = iM14912k4;
        return iM14912k4 >= 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m14915k4(C3677k4[] c3677k4Arr, int i) {
        int i2;
        if (this.f10221k4.m16299k4() == 0) {
            while (c3677k4Arr[0].f10201x1 < 25) {
                int[] iArr = {0};
                this.f10221k4.m16309x1(iArr);
                int i3 = iArr[0];
                if (i3 == 255) {
                    do {
                        iArr[0] = i3;
                        this.f10221k4.m16309x1(iArr);
                        i3 = iArr[0];
                    } while (i3 == 255);
                    if (i3 == 0) {
                        i3 = 255;
                    } else {
                        this.f10221k4.m16301k4(i3);
                        C3677k4 c3677k4 = c3677k4Arr[0];
                        i2 = c3677k4.f10201x1;
                        if (i > i2) {
                            if (!this.f10220h4) {
                                this.f10220h4 = true;
                            }
                            c3677k4.f10200k4 <<= 25 - i2;
                            c3677k4.f10201x1 = 25;
                        }
                    }
                }
                C3677k4 c3677k42 = c3677k4Arr[0];
                c3677k42.f10200k4 = i3 | (c3677k42.f10200k4 << 8);
                c3677k42.f10201x1 += 8;
            }
        } else {
            C3677k4 c3677k43 = c3677k4Arr[0];
            i2 = c3677k43.f10201x1;
            if (i > i2) {
            }
        }
        return true;
    }
}
