package com.aspose.slides.internal.p135fp;

/* JADX INFO: renamed from: com.aspose.slides.internal.fp.ks */
/* JADX INFO: loaded from: classes.dex */
public class C4098ks {

    /* JADX INFO: renamed from: c5 */
    private C4095jd[] f11208c5;

    /* JADX INFO: renamed from: ck */
    private byte f11209ck;

    /* JADX INFO: renamed from: dy */
    public int f11211dy;

    /* JADX INFO: renamed from: fa */
    private int f11212fa;

    /* JADX INFO: renamed from: k4 */
    public int f11215k4;

    /* JADX INFO: renamed from: ks */
    private int f11217ks;

    /* JADX INFO: renamed from: m9 */
    public int f11218m9;

    /* JADX INFO: renamed from: rv */
    private int f11219rv;

    /* JADX INFO: renamed from: up */
    private int f11221up;

    /* JADX INFO: renamed from: x1 */
    public int f11222x1;

    /* JADX INFO: renamed from: yj */
    private int f11223yj;

    /* JADX INFO: renamed from: jd */
    private byte f11214jd = 8;

    /* JADX INFO: renamed from: kk */
    public int f11216kk = 1;

    /* JADX INFO: renamed from: to */
    public int f11220to = 1;

    /* JADX INFO: renamed from: du */
    public int f11210du = 8;

    /* JADX INFO: renamed from: h4 */
    public boolean f11213h4 = true;

    public C4098ks(byte b, C4095jd[] c4095jdArr) {
        this.f11209ck = b;
        this.f11208c5 = c4095jdArr;
    }

    /* JADX INFO: renamed from: c5 */
    public int m16348c5() {
        return this.f11219rv;
    }

    /* JADX INFO: renamed from: du */
    public void m16349du(int i) {
        this.f11219rv = i;
    }

    /* JADX INFO: renamed from: dy */
    public int m16351dy() {
        return this.f11217ks;
    }

    /* JADX INFO: renamed from: h4 */
    public int m16352h4() {
        return this.f11221up;
    }

    /* JADX INFO: renamed from: k4 */
    public byte m16353k4() {
        return this.f11214jd;
    }

    /* JADX INFO: renamed from: kk */
    public byte m16356kk() {
        return this.f11209ck;
    }

    /* JADX INFO: renamed from: m9 */
    public int m16358m9() {
        return this.f11223yj;
    }

    /* JADX INFO: renamed from: to */
    public int m16359to() {
        return this.f11212fa;
    }

    /* JADX INFO: renamed from: x1 */
    public void m16361x1(int i) {
        this.f11221up = i;
    }

    /* JADX INFO: renamed from: k4 */
    public static C4098ks m16345k4(C4094ix c4094ix, byte b) {
        c4094ix.m16303kk(2);
        int[] iArr = {0};
        c4094ix.m16309x1(iArr);
        int i = iArr[0];
        int[] iArr2 = {0};
        c4094ix.m16302k4(iArr2);
        int i2 = iArr2[0];
        int[] iArr3 = {0};
        c4094ix.m16302k4(iArr3);
        int i3 = iArr3[0];
        int[] iArr4 = {0};
        c4094ix.m16309x1(iArr4);
        int i4 = iArr4[0];
        C4095jd[] c4095jdArr = new C4095jd[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            C4095jd c4095jd = new C4095jd();
            int[] iArr5 = {0};
            c4094ix.m16309x1(iArr5);
            int i6 = iArr5[0];
            int[] iArr6 = {0};
            c4094ix.m16309x1(iArr6);
            int i7 = iArr6[0];
            int[] iArr7 = {0};
            c4094ix.m16309x1(iArr7);
            int i8 = iArr7[0];
            c4095jd.m16330to((byte) i6);
            c4095jd.f11202x1 = (byte) i7;
            c4095jd.m16313du((byte) i8);
            c4095jdArr[i5] = c4095jd;
        }
        C4098ks c4098ks = new C4098ks(b, c4095jdArr);
        c4098ks.m16354k4((byte) i);
        c4098ks.m16360to(i3 & 65535);
        c4098ks.m16349du(65535 & i2);
        c4098ks.m16347k4(c4095jdArr);
        return c4098ks;
    }

    /* JADX INFO: renamed from: du */
    public boolean m16350du() {
        byte b = this.f11209ck;
        return b == -62 || b == -58 || b == -54 || b == -50;
    }

    /* JADX INFO: renamed from: kk */
    public void m16357kk(int i) {
        this.f11223yj = i;
    }

    /* JADX INFO: renamed from: to */
    public void m16360to(int i) {
        this.f11217ks = i;
    }

    /* JADX INFO: renamed from: x1 */
    public C4095jd[] m16362x1() {
        return this.f11208c5;
    }

    /* JADX INFO: renamed from: k4 */
    public void m16354k4(byte b) {
        this.f11214jd = b;
    }

    /* JADX INFO: renamed from: k4 */
    public void m16355k4(int i) {
        this.f11212fa = i;
    }

    /* JADX INFO: renamed from: k4 */
    public static void m16346k4(C4101qq c4101qq, C4098ks c4098ks) {
        c4101qq.m62855k4((byte) -1);
        c4101qq.m62855k4(c4098ks.m16356kk());
        c4101qq.m16370k4(((c4098ks.m16362x1().length * 3) + 8) & 65535);
        c4101qq.m62855k4(c4098ks.f11214jd);
        c4101qq.m16370k4(c4098ks.m16348c5());
        c4101qq.m16370k4(c4098ks.m16351dy());
        c4101qq.m62855k4((byte) c4098ks.m16362x1().length);
        for (C4095jd c4095jd : c4098ks.m16362x1()) {
            c4101qq.m62855k4(c4095jd.m16317h4());
            c4101qq.m62855k4(c4095jd.f11202x1);
            c4101qq.m62855k4(c4095jd.m16311ck());
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m16347k4(C4095jd[] c4095jdArr) {
        this.f11208c5 = c4095jdArr;
    }
}
