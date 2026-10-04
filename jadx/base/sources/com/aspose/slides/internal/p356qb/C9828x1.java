package com.aspose.slides.internal.p356qb;

import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;

/* JADX INFO: renamed from: com.aspose.slides.internal.qb.x1 */
/* JADX INFO: loaded from: classes4.dex */
public class C9828x1 {

    /* JADX INFO: renamed from: x6 */
    private static final byte[] f35594x6 = {-48, -49, 17, -32, -95, -79, 26, -31};

    /* JADX INFO: renamed from: c5 */
    private long f35595c5;

    /* JADX INFO: renamed from: ck */
    private long f35596ck;

    /* JADX INFO: renamed from: du */
    private long f35597du;

    /* JADX INFO: renamed from: dy */
    private long f35598dy;

    /* JADX INFO: renamed from: fa */
    private long f35599fa;

    /* JADX INFO: renamed from: h4 */
    private long f35600h4;

    /* JADX INFO: renamed from: jd */
    private long f35601jd;

    /* JADX INFO: renamed from: k4 */
    private AbstractC3150x6 f35602k4;

    /* JADX INFO: renamed from: kk */
    private byte[] f35603kk;

    /* JADX INFO: renamed from: ks */
    private long f35604ks;

    /* JADX INFO: renamed from: m9 */
    private long f35605m9;

    /* JADX INFO: renamed from: rv */
    private final int f35606rv;

    /* JADX INFO: renamed from: to */
    private long f35607to;

    /* JADX INFO: renamed from: up */
    private long f35608up;

    /* JADX INFO: renamed from: x1 */
    private byte[] f35609x1;

    /* JADX INFO: renamed from: yj */
    private long f35610yj;

    public C9828x1() {
        this.f35602k4 = null;
        this.f35609x1 = new byte[8];
        this.f35603kk = new byte[16];
        this.f35607to = 0L;
        this.f35597du = 0L;
        this.f35600h4 = 65534L;
        this.f35605m9 = 0L;
        this.f35598dy = 0L;
        this.f35595c5 = 0L;
        this.f35601jd = 0L;
        this.f35596ck = 0L;
        this.f35599fa = 0L;
        this.f35608up = 0L;
        this.f35610yj = 0L;
        this.f35604ks = 0L;
        this.f35606rv = 76;
    }

    /* JADX INFO: renamed from: jd */
    private void m48446jd() {
        C3134k4 c3134k4 = new C3134k4(this.f35602k4);
        byte[] bArrM13372dy = c3134k4.m13372dy(8);
        this.f35609x1 = bArrM13372dy;
        byte b = bArrM13372dy[0];
        if ((b & 255) == 80 && (bArrM13372dy[1] & 255) == 75 && (bArrM13372dy[2] & 255) == 3 && (bArrM13372dy[3] & 255) == 4) {
            throw new C9826to("The file is ZIP archive. It can be Microsoft PowerPoint 2007 PPTX presentation.");
        }
        int i = b & 255;
        byte[] bArr = f35594x6;
        if (i != (bArr[0] & 255) || (bArrM13372dy[1] & 255) != (bArr[1] & 255) || (bArrM13372dy[2] & 255) != (bArr[2] & 255) || (bArrM13372dy[3] & 255) != (bArr[3] & 255) || (bArrM13372dy[4] & 255) != (bArr[4] & 255) || (bArrM13372dy[5] & 255) != (bArr[5] & 255) || (bArrM13372dy[6] & 255) != (bArr[6] & 255) || (bArrM13372dy[7] & 255) != (bArr[7] & 255)) {
            throw new C9826to("Unknown file format.");
        }
        this.f35603kk = c3134k4.m13372dy(16);
        this.f35607to = c3134k4.m13382u4() & 65535;
        this.f35597du = c3134k4.m13382u4() & 65535;
        this.f35600h4 = c3134k4.m13382u4() & 65535;
        this.f35605m9 = c3134k4.m13382u4() & 65535;
        this.f35598dy = c3134k4.m13382u4() & 65535;
        c3134k4.m13372dy(10);
        this.f35595c5 = c3134k4.m13384uz() & 4294967295L;
        this.f35601jd = c3134k4.m13384uz() & 4294967295L;
        c3134k4.m13372dy(4);
        c3134k4.m13384uz();
        this.f35596ck = 4096L;
        this.f35599fa = c3134k4.m13384uz();
        this.f35608up = c3134k4.m13384uz() & 4294967295L;
        this.f35610yj = c3134k4.m13386x6();
        this.f35604ks = c3134k4.m13384uz() & 4294967295L;
    }

    /* JADX INFO: renamed from: to */
    private int m48447to(short s) {
        int i = 0;
        if (s == 0) {
            this.f35605m9 = 0L;
            return 0;
        }
        while (s != 1) {
            s = (short) (s >> 1);
            i++;
        }
        return i;
    }

    /* JADX INFO: renamed from: c5 */
    public final long m48448c5() {
        return this.f35610yj;
    }

    /* JADX INFO: renamed from: du */
    public final long m48449du() {
        return this.f35596ck;
    }

    /* JADX INFO: renamed from: dy */
    public final long m48450dy() {
        return this.f35604ks;
    }

    /* JADX INFO: renamed from: h4 */
    public final long m48451h4() {
        return this.f35599fa;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m48452k4() {
        return 1 << ((int) this.f35605m9);
    }

    /* JADX INFO: renamed from: kk */
    public final long m48457kk() {
        return this.f35595c5;
    }

    /* JADX INFO: renamed from: m9 */
    public final long m48461m9() {
        return this.f35608up;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m48464x1() {
        return 1 << ((int) this.f35598dy);
    }

    public C9828x1(AbstractC3150x6 abstractC3150x6) {
        this.f35602k4 = null;
        this.f35609x1 = new byte[8];
        this.f35603kk = new byte[16];
        this.f35607to = 0L;
        this.f35597du = 0L;
        this.f35600h4 = 65534L;
        this.f35605m9 = 0L;
        this.f35598dy = 0L;
        this.f35595c5 = 0L;
        this.f35601jd = 0L;
        this.f35596ck = 0L;
        this.f35599fa = 0L;
        this.f35608up = 0L;
        this.f35610yj = 0L;
        this.f35604ks = 0L;
        this.f35606rv = 76;
        if (abstractC3150x6.getLength() < 76) {
            throw new C9823kk("Insufficient header length.");
        }
        this.f35602k4 = abstractC3150x6;
        m48446jd();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m48453k4(int i) {
        this.f35595c5 = i;
    }

    /* JADX INFO: renamed from: kk */
    public final void m48458kk(int i) {
        this.f35608up = i;
    }

    /* JADX INFO: renamed from: to */
    public final long m48462to() {
        return this.f35601jd;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m48465x1(int i) {
        this.f35596ck = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m48454k4(long j) {
        this.f35601jd = j & 4294967295L;
    }

    /* JADX INFO: renamed from: kk */
    public final void m48459kk(long j) {
        this.f35610yj = j;
    }

    /* JADX INFO: renamed from: to */
    public final void m48463to(int i) {
        this.f35604ks = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m48466x1(long j) {
        this.f35599fa = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m48455k4(AbstractC3150x6 abstractC3150x6) {
        C3149x1 c3149x1 = new C3149x1(abstractC3150x6);
        c3149x1.m13450k4(new byte[]{-48, -49, 17, -32, -95, -79, 26, -31});
        c3149x1.m13450k4(new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
        c3149x1.m13443k4((byte) 62);
        c3149x1.m13443k4((byte) 0);
        c3149x1.m13443k4((byte) 3);
        c3149x1.m13443k4((byte) 0);
        c3149x1.m13443k4((byte) (this.f35600h4 & 255));
        c3149x1.m13443k4((byte) ((this.f35600h4 >> 8) & 255));
        c3149x1.m13443k4((byte) 9);
        c3149x1.m13443k4((byte) 0);
        c3149x1.m13443k4((byte) 6);
        c3149x1.m13443k4((byte) 0);
        c3149x1.m13450k4(new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
        c3149x1.m13455x1((int) this.f35595c5);
        c3149x1.m13455x1((int) this.f35601jd);
        c3149x1.m13450k4(new byte[]{0, 0, 0, 0});
        c3149x1.m13455x1((int) this.f35596ck);
        c3149x1.m13447k4(this.f35599fa & 4294967295L);
        c3149x1.m13455x1((int) this.f35608up);
        c3149x1.m13455x1((int) this.f35610yj);
        c3149x1.m13455x1((int) this.f35604ks);
        c3149x1.m13452kk();
    }

    /* JADX INFO: renamed from: kk */
    public final void m48460kk(short s) {
        this.f35598dy = m48447to(s);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m48467x1(short s) {
        this.f35605m9 = m48447to(s);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m48456k4(short s) {
        this.f35600h4 = s;
    }
}
