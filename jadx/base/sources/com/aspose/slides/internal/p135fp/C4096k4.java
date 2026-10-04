package com.aspose.slides.internal.p135fp;

import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.fp.k4 */
/* JADX INFO: loaded from: classes.dex */
public class C4096k4 {

    /* JADX INFO: renamed from: k4 */
    private int f11203k4;

    /* JADX INFO: renamed from: kk */
    private byte f11204kk;

    /* JADX INFO: renamed from: to */
    private int f11205to;

    /* JADX INFO: renamed from: x1 */
    private int f11206x1;

    /* JADX INFO: renamed from: k4 */
    public byte m16337k4() {
        return this.f11204kk;
    }

    /* JADX INFO: renamed from: kk */
    public void m16340kk(int i) {
        this.f11205to = i;
    }

    /* JADX INFO: renamed from: x1 */
    public void m16341x1(int i) {
        this.f11206x1 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public static C4096k4 m16335k4(C4094ix c4094ix) {
        C4096k4 c4096k4 = new C4096k4();
        int[] iArr = {0};
        c4094ix.m16302k4(iArr);
        int i = iArr[0] - 2;
        byte[] bArr = new byte[i];
        c4094ix.m16300k4(bArr, i);
        if (C7019kk.m27462to(Byte.valueOf(bArr[0]), 6) != 65 || C7019kk.m27462to(Byte.valueOf(bArr[1]), 6) != 100 || C7019kk.m27462to(Byte.valueOf(bArr[2]), 6) != 111 || C7019kk.m27462to(Byte.valueOf(bArr[3]), 6) != 98 || C7019kk.m27462to(Byte.valueOf(bArr[4]), 6) != 101) {
            return null;
        }
        c4096k4.m16340kk(C7019kk.m27462to(Byte.valueOf(bArr[6]), 6) + (C7019kk.m27462to(Byte.valueOf(bArr[5]), 6) << 8));
        c4096k4.m16339k4(C7019kk.m27462to(Byte.valueOf(bArr[8]), 6) + (C7019kk.m27462to(Byte.valueOf(bArr[7]), 6) << 8));
        c4096k4.m16341x1(C7019kk.m27462to(Byte.valueOf(bArr[10]), 6) + (C7019kk.m27462to(Byte.valueOf(bArr[9]), 6) << 8));
        c4096k4.m16338k4(bArr[11]);
        return c4096k4;
    }

    /* JADX INFO: renamed from: k4 */
    public void m16338k4(byte b) {
        this.f11204kk = b;
    }

    /* JADX INFO: renamed from: k4 */
    public void m16339k4(int i) {
        this.f11203k4 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public static void m16336k4(AbstractC3150x6 abstractC3150x6, C4096k4 c4096k4) {
        abstractC3150x6.writeByte((byte) -1);
        abstractC3150x6.writeByte((byte) -18);
        abstractC3150x6.writeByte((byte) 0);
        abstractC3150x6.writeByte((byte) 14);
        abstractC3150x6.write(new byte[]{65, 100, 111, 98, 101, C7019kk.m27442k4(Integer.valueOf(c4096k4.f11205to >> 8), 9), C7019kk.m27442k4(Integer.valueOf(c4096k4.f11205to & 255), 9), C7019kk.m27442k4(Integer.valueOf(c4096k4.f11203k4 >> 8), 9), C7019kk.m27442k4(Integer.valueOf(c4096k4.f11203k4 & 255), 9), C7019kk.m27442k4(Integer.valueOf(c4096k4.f11206x1 >> 8), 9), C7019kk.m27442k4(Integer.valueOf(c4096k4.f11206x1 & 8), 9), c4096k4.f11204kk}, 0, 12);
    }
}
