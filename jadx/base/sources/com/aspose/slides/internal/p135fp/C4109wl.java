package com.aspose.slides.internal.p135fp;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p515xz.C12754k4;
import com.aspose.slides.internal.p515xz.C12755kk;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.fp.wl */
/* JADX INFO: loaded from: classes.dex */
public class C4109wl {

    /* JADX INFO: renamed from: du */
    private int[] f11262du;

    /* JADX INFO: renamed from: dy */
    private int f11263dy;

    /* JADX INFO: renamed from: h4 */
    private int f11264h4;

    /* JADX INFO: renamed from: k4 */
    public byte f11265k4;

    /* JADX INFO: renamed from: kk */
    public byte f11266kk;

    /* JADX INFO: renamed from: m9 */
    private int f11267m9;

    /* JADX INFO: renamed from: to */
    public byte f11268to;

    /* JADX INFO: renamed from: x1 */
    public int[] f11269x1;

    public C4109wl() {
        this.f11266kk = (byte) 63;
        this.f11262du = new int[10];
    }

    /* JADX INFO: renamed from: du */
    public int m16438du() {
        return this.f11267m9;
    }

    /* JADX INFO: renamed from: h4 */
    public int m16440h4() {
        return this.f11263dy;
    }

    /* JADX INFO: renamed from: k4 */
    public int m16441k4() {
        return C7019kk.m27462to(Byte.valueOf(C7019kk.m27442k4(Integer.valueOf(C7019kk.m27462to(Byte.valueOf(this.f11265k4), 6) >> 4), 9)), 6);
    }

    /* JADX INFO: renamed from: kk */
    public void m16444kk(int i) {
        this.f11264h4 = i;
    }

    /* JADX INFO: renamed from: to */
    public int m16446to() {
        return this.f11264h4;
    }

    /* JADX INFO: renamed from: x1 */
    public int m16448x1() {
        return C7019kk.m27462to(Byte.valueOf(C7019kk.m27442k4(Integer.valueOf(C7019kk.m27462to(Byte.valueOf(this.f11265k4), 6) & 15), 9)), 6);
    }

    public C4109wl(byte b, byte b2, int i, int i2, int i3) {
        this(b, b2, i, i2, new int[i3]);
    }

    /* JADX INFO: renamed from: k4 */
    public static C4109wl m16436k4(C4094ix c4094ix, C4098ks c4098ks) {
        boolean z;
        C4109wl c4109wl = new C4109wl();
        c4094ix.m16303kk(2);
        int[] iArr = {0};
        c4094ix.m16309x1(iArr);
        int i = iArr[0];
        c4109wl.f11269x1 = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            int[] iArr2 = {0};
            c4094ix.m16309x1(iArr2);
            int i3 = iArr2[0];
            int i4 = 0;
            while (true) {
                if (i4 >= c4098ks.m16362x1().length) {
                    i4 = 0;
                    z = false;
                    break;
                }
                if ((c4098ks.m16362x1()[i4].m16317h4() & 255) == i3) {
                    z = true;
                    break;
                }
                i4++;
            }
            if (!z) {
                throw new C12754k4(C14113y2.f47374k4, (Exception) new C12755kk("Corrupted Jpeg scan component id definition. Cannot load image."));
            }
            c4109wl.f11269x1[i2] = i3;
            int[] iArr3 = {0};
            c4094ix.m16309x1(iArr3);
            c4098ks.m16362x1()[i4].m16323k4(((byte) iArr3[0]) & 255);
        }
        int[] iArr4 = {0};
        c4094ix.m16309x1(iArr4);
        int i5 = iArr4[0];
        int[] iArr5 = {0};
        c4094ix.m16309x1(iArr5);
        int i6 = iArr5[0];
        int[] iArr6 = {0};
        c4094ix.m16309x1(iArr6);
        int i7 = iArr6[0];
        c4109wl.f11268to = (byte) i5;
        c4109wl.f11266kk = (byte) i6;
        c4109wl.f11265k4 = (byte) i7;
        return c4109wl;
    }

    /* JADX INFO: renamed from: du */
    public void m16439du(int i) {
        this.f11263dy = i;
    }

    /* JADX INFO: renamed from: kk */
    public int[] m16445kk() {
        return this.f11262du;
    }

    /* JADX INFO: renamed from: to */
    public void m16447to(int i) {
        this.f11267m9 = i;
    }

    /* JADX INFO: renamed from: x1 */
    public void m16449x1(int i) {
        this.f11265k4 = C7019kk.m27442k4(Integer.valueOf(i | (C7019kk.m27462to(Byte.valueOf(this.f11265k4), 6) & 240)), 9);
    }

    public C4109wl(byte b, byte b2, int i, int i2, int[] iArr) {
        this.f11266kk = (byte) 63;
        this.f11262du = new int[10];
        m16442k4(i);
        m16449x1(i2);
        this.f11268to = b;
        this.f11266kk = b2;
        this.f11269x1 = iArr;
    }

    /* JADX INFO: renamed from: k4 */
    public void m16442k4(int i) {
        this.f11265k4 = C7019kk.m27442k4(Integer.valueOf((i << 4) | C7019kk.m27462to(Byte.valueOf(this.f11265k4), 6)), 9);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m16437k4(C4101qq c4101qq, C4098ks c4098ks, C4109wl c4109wl) {
        c4101qq.m62855k4((byte) -1);
        c4101qq.m62855k4((byte) -38);
        c4101qq.m16370k4(((c4109wl.f11269x1.length * 2) + 6) & 65535);
        c4101qq.m62855k4((byte) c4109wl.f11269x1.length);
        for (int i = 0; i < c4109wl.f11269x1.length; i++) {
            c4101qq.m62855k4(c4098ks.m16362x1()[c4109wl.f11269x1[i]].m16317h4());
            c4101qq.m62855k4((byte) (((c4098ks.m16362x1()[c4109wl.f11269x1[i]].m16332x1() & 255) << 4) + (c4098ks.m16362x1()[c4109wl.f11269x1[i]].m16321k4() & 255)));
        }
        c4101qq.m62855k4(c4109wl.f11268to);
        c4101qq.m62855k4(c4109wl.f11266kk);
        c4101qq.m62855k4(c4109wl.f11265k4);
    }

    /* JADX INFO: renamed from: k4 */
    public void m16443k4(int[] iArr) {
        this.f11262du = iArr;
    }
}
