package com.aspose.slides.internal.p060ca;

import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.p559ms.System.C14084qq;
import com.huawei.hms.network.embedded.C18177fb;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.la */
/* JADX INFO: loaded from: classes3.dex */
public class C2174la extends C2236ov {

    /* JADX INFO: renamed from: c5 */
    private C14084qq f7549c5;

    /* JADX INFO: renamed from: ck */
    private short f7550ck;

    /* JADX INFO: renamed from: du */
    private long f7551du;

    /* JADX INFO: renamed from: dy */
    private C14084qq f7552dy;

    /* JADX INFO: renamed from: fa */
    private short f7553fa;

    /* JADX INFO: renamed from: h4 */
    private long f7554h4;

    /* JADX INFO: renamed from: jd */
    private short f7555jd;

    /* JADX INFO: renamed from: k4 */
    public long f7556k4;

    /* JADX INFO: renamed from: kk */
    private int f7557kk;

    /* JADX INFO: renamed from: ks */
    private int f7558ks;

    /* JADX INFO: renamed from: m9 */
    private long f7559m9;

    /* JADX INFO: renamed from: ne */
    private short f7560ne;

    /* JADX INFO: renamed from: rv */
    private short f7561rv;

    /* JADX INFO: renamed from: to */
    private float f7562to;

    /* JADX INFO: renamed from: up */
    private short f7563up;

    /* JADX INFO: renamed from: x1 */
    private float f7564x1;

    /* JADX INFO: renamed from: x6 */
    private short f7565x6;

    /* JADX INFO: renamed from: yj */
    private int f7566yj;

    public C2174la(C2092fz c2092fz, C2132iq c2132iq) {
        super(c2092fz, c2132iq);
        this.f7552dy = new C14084qq();
        this.f7549c5 = new C14084qq();
        this.f7564x1 = 1.0f;
        this.f7557kk = 0;
        this.f7562to = 0.0f;
        this.f7551du = 0L;
        this.f7554h4 = 1594834165L;
        this.f7559m9 = 2048L;
        C14084qq.m67081jd().CloneTo(this.f7552dy);
        C14084qq.m67081jd().CloneTo(this.f7549c5);
        this.f7555jd = (short) 0;
        this.f7550ck = (short) 0;
        long j = this.f7559m9;
        this.f7553fa = (short) j;
        this.f7563up = (short) j;
        this.f7566yj = 0;
        this.f7558ks = 6;
        this.f7561rv = (short) 0;
        this.f7565x6 = (short) 1;
        this.f7560ne = (short) 0;
    }

    /* JADX INFO: renamed from: c5 */
    public final short m10998c5() {
        return this.f7561rv;
    }

    /* JADX INFO: renamed from: du */
    public final short m10999du() {
        return this.f7553fa;
    }

    /* JADX INFO: renamed from: dy */
    public final int m11001dy() {
        return this.f7558ks;
    }

    /* JADX INFO: renamed from: h4 */
    public final short m11002h4() {
        return this.f7563up;
    }

    /* JADX INFO: renamed from: jd */
    public final short m11004jd() {
        return this.f7565x6;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m11005k4() {
        return this.f7557kk;
    }

    /* JADX INFO: renamed from: kk */
    public final short m11009kk() {
        return this.f7555jd;
    }

    /* JADX INFO: renamed from: m9 */
    public final int m11012m9() {
        return this.f7566yj;
    }

    /* JADX INFO: renamed from: to */
    public final short m11013to() {
        return this.f7550ck;
    }

    /* JADX INFO: renamed from: x1 */
    public final long m11015x1() {
        return this.f7559m9;
    }

    public C2174la(C2377xv c2377xv, long j, long j2, long j3) {
        super(c2377xv, j, j2, j3);
        this.f7552dy = new C14084qq();
        this.f7549c5 = new C14084qq();
    }

    /* JADX INFO: renamed from: du */
    public final void m11000du(short s) {
        this.f7561rv = s;
    }

    /* JADX INFO: renamed from: h4 */
    public final void m11003h4(short s) {
        this.f7565x6 = s;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m11006k4(int i) {
        this.f7557kk = i;
    }

    /* JADX INFO: renamed from: kk */
    public final void m11010kk(int i) {
        this.f7558ks = i;
    }

    /* JADX INFO: renamed from: to */
    public final void m11014to(short s) {
        this.f7563up = s;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m11016x1(int i) {
        this.f7566yj = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m11007k4(long j) {
        this.f7559m9 = j;
    }

    /* JADX INFO: renamed from: kk */
    public final void m11011kk(short s) {
        this.f7553fa = s;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m11017x1(short s) {
        this.f7550ck = s;
    }

    @Override // com.aspose.slides.internal.p060ca.C2236ov
    /* JADX INFO: renamed from: k4 */
    public void mo10299k4(C2212n9 c2212n9) {
        c2212n9.m11159k4(m11222wy() & 4294967295L);
        this.f7564x1 = c2212n9.m11163to();
        this.f7562to = c2212n9.m11163to();
        this.f7551du = c2212n9.m11164up();
        this.f7554h4 = c2212n9.m11164up();
        this.f7557kk = c2212n9.m11151fa() & 65535;
        this.f7559m9 = c2212n9.m11151fa() & 65535;
        c2212n9.m11155k4(true).CloneTo(this.f7552dy);
        c2212n9.m11155k4(true).CloneTo(this.f7549c5);
        this.f7555jd = c2212n9.m11152h4();
        this.f7550ck = c2212n9.m11152h4();
        this.f7553fa = c2212n9.m11152h4();
        this.f7563up = c2212n9.m11152h4();
        this.f7566yj = c2212n9.m11151fa() & 65535;
        this.f7558ks = c2212n9.m11151fa();
        this.f7561rv = c2212n9.m11147c5();
        this.f7565x6 = c2212n9.m11147c5();
        this.f7560ne = c2212n9.m11147c5();
        super.mo10299k4(c2212n9);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m11008k4(short s) {
        this.f7555jd = s;
    }

    @Override // com.aspose.slides.internal.p060ca.C2236ov
    /* JADX INFO: renamed from: k4 */
    public void mo10132k4(byte[][] bArr, long[] jArr, long[] jArr2) throws Throwable {
        this.f7556k4 = 8L;
        if (!m11217b3() || this.f7564x1 != 1.0f) {
            super.mo10132k4(bArr, jArr, jArr2);
            return;
        }
        C3152yj c3152yj = new C3152yj();
        try {
            C2362x4 c2362x4 = new C2362x4(c3152yj, true);
            try {
                c2362x4.m11646k4(this.f7564x1);
                c2362x4.m11646k4(this.f7562to);
                c2362x4.m11660kk(this.f7551du);
                c2362x4.m11660kk(this.f7554h4);
                c2362x4.m11647k4(this.f7557kk & 65535);
                c2362x4.m11647k4((int) (this.f7559m9 & C18177fb.f54859s));
                c2362x4.m11648k4(this.f7552dy.Clone());
                c2362x4.m11648k4(this.f7549c5.Clone());
                c2362x4.m11664x1(this.f7555jd);
                c2362x4.m11664x1(this.f7550ck);
                c2362x4.m11664x1(this.f7553fa);
                c2362x4.m11664x1(this.f7563up);
                c2362x4.m11647k4(this.f7566yj & 65535);
                c2362x4.m11647k4(this.f7558ks);
                c2362x4.m11651k4(this.f7561rv);
                c2362x4.m11651k4(this.f7565x6);
                c2362x4.m11651k4(this.f7560ne);
                m11219k4(c2362x4, c3152yj, bArr, jArr, jArr2);
                c2362x4.dispose();
                c3152yj.dispose();
            } catch (Throwable th) {
                c2362x4.dispose();
                throw th;
            }
        } catch (Throwable th2) {
            c3152yj.dispose();
            throw th2;
        }
    }
}
