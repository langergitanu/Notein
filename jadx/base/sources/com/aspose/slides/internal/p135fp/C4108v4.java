package com.aspose.slides.internal.p135fp;

import OooO0O0.C20395OooO0o0;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p225ke.C5663h4;
import com.aspose.slides.internal.p225ke.C5667to;

/* JADX INFO: renamed from: com.aspose.slides.internal.fp.v4 */
/* JADX INFO: loaded from: classes.dex */
public class C4108v4 {

    /* JADX INFO: renamed from: k4 */
    public byte f11260k4;

    /* JADX INFO: renamed from: x1 */
    public int[] f11261x1 = new int[C5667to.f15654k4];

    /* JADX INFO: renamed from: k4 */
    public byte m16432k4() {
        return (byte) ((this.f11260k4 & 255) >> 4);
    }

    /* JADX INFO: renamed from: x1 */
    public byte m16434x1() {
        return (byte) (this.f11260k4 & 15);
    }

    /* JADX INFO: renamed from: k4 */
    public static C4108v4 m16429k4(byte b, byte[] bArr, int i, boolean z) {
        C4108v4 c4108v4 = new C4108v4();
        c4108v4.m16435x1(b);
        c4108v4.m16433k4((byte) 0);
        for (int i2 = 0; i2 < C5667to.f15654k4; i2++) {
            int i3 = 255;
            int iOooO0O0 = C20395OooO0o0.OooO0O0(bArr[i2] & 255, i, 50, 100);
            if (iOooO0O0 <= 0) {
                iOooO0O0 = 1;
            }
            if (iOooO0O0 > 32767) {
                iOooO0O0 = 32767;
            }
            if (!z || iOooO0O0 <= 255) {
                i3 = iOooO0O0;
            }
            c4108v4.f11261x1[i2] = i3 & 65535;
        }
        return c4108v4;
    }

    /* JADX INFO: renamed from: x1 */
    public void m16435x1(byte b) {
        this.f11260k4 = (byte) ((b & 255) | (this.f11260k4 & 104));
    }

    /* JADX INFO: renamed from: k4 */
    public void m16433k4(byte b) {
        this.f11260k4 = (byte) (((b & 255) << 4) | (this.f11260k4 & 255));
    }

    /* JADX INFO: renamed from: k4 */
    public static void m16430k4(C4101qq c4101qq, C4108v4[] c4108v4Arr) {
        c4101qq.m62855k4((byte) -1);
        c4101qq.m62855k4((byte) -37);
        int iM16432k4 = 2;
        for (C4108v4 c4108v4 : c4108v4Arr) {
            iM16432k4 = ((C5667to.f15654k4 * (c4108v4.m16432k4() & 255)) + 65 + (iM16432k4 & 65535)) & 65535;
        }
        c4101qq.m16370k4(iM16432k4);
        for (C4108v4 c4108v42 : c4108v4Arr) {
            c4101qq.m62855k4(c4108v42.f11260k4);
            for (int i = 0; i < C5667to.f15654k4; i++) {
                if ((c4108v42.m16432k4() & 255) == 0) {
                    c4101qq.m62855k4((byte) (c4108v42.f11261x1[C5663h4.f15647k4[i]] & 255));
                } else {
                    c4101qq.m16370k4(c4108v42.f11261x1[C5663h4.f15647k4[i]]);
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static C4108v4[] m16431k4(C4094ix c4094ix) {
        int i;
        List list = new List();
        int[] iArr = {0};
        c4094ix.m16302k4(iArr);
        int i2 = iArr[0];
        int i3 = 2;
        while (i3 < i2) {
            C4108v4 c4108v4 = new C4108v4();
            int[] iArr2 = {0};
            c4094ix.m16309x1(iArr2);
            c4108v4.f11260k4 = (byte) iArr2[0];
            i3++;
            for (int i4 = 0; i4 < C5667to.f15654k4; i4++) {
                if ((c4108v4.m16432k4() & 255) == 0) {
                    int[] iArr3 = {0};
                    c4094ix.m16309x1(iArr3);
                    i = iArr3[0];
                    i3++;
                } else {
                    int[] iArr4 = {0};
                    c4094ix.m16302k4(iArr4);
                    i = iArr4[0];
                    i3 += 2;
                }
                c4108v4.f11261x1[C5663h4.f15647k4[i4]] = i & 65535;
            }
            list.addItem(c4108v4);
        }
        return (C4108v4[]) list.toArray(new C4108v4[0]);
    }
}
