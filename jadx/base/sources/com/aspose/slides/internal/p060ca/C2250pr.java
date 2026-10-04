package com.aspose.slides.internal.p060ca;

import com.aspose.slides.internal.p080dd.C3152yj;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.pr */
/* JADX INFO: loaded from: classes3.dex */
public class C2250pr extends C2236ov {

    /* JADX INFO: renamed from: k4 */
    public byte[] f7747k4;

    /* JADX INFO: renamed from: kk */
    private volatile boolean f7748kk;

    /* JADX INFO: renamed from: to */
    private C2103gv f7749to;

    /* JADX INFO: renamed from: x1 */
    private Object f7750x1;

    public C2250pr(C2092fz c2092fz, C2132iq c2132iq) {
        super(c2092fz, c2132iq);
        this.f7750x1 = new Object();
        this.f7748kk = false;
        this.f7749to = new C2103gv();
    }

    /* JADX INFO: renamed from: to */
    private void m11253to() {
        if (this.f7748kk) {
            return;
        }
        synchronized (this.f7750x1) {
            try {
                if (!this.f7748kk) {
                    C2003ar c2003ar = new C2003ar(m11256x1(), m11223yd());
                    c2003ar.m10222x1();
                    this.f7749to = c2003ar.m10221k4();
                    this.f7748kk = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.aspose.slides.internal.p060ca.C2236ov
    /* JADX INFO: renamed from: k4 */
    public void mo10299k4(C2212n9 c2212n9) {
        super.mo10299k4(c2212n9);
    }

    /* JADX INFO: renamed from: kk */
    public final C2103gv m11255kk() {
        m11253to();
        return this.f7749to;
    }

    @Override // com.aspose.slides.internal.p060ca.C2236ov
    /* JADX INFO: renamed from: x1 */
    public void mo10300x1(C2212n9 c2212n9) {
        super.mo10300x1(c2212n9);
        c2212n9.m11159k4(m11222wy() & 4294967295L);
        this.f7747k4 = c2212n9.m11160k4((int) m11216ak());
    }

    public C2250pr(C2377xv c2377xv, long j, long j2, long j3) {
        super(c2377xv, j, j2, j3);
        this.f7750x1 = new Object();
        this.f7748kk = false;
        this.f7749to = new C2103gv();
    }

    @Override // com.aspose.slides.internal.p060ca.C2236ov
    /* JADX INFO: renamed from: k4 */
    public void mo10132k4(byte[][] bArr, long[] jArr, long[] jArr2) {
        if (!m11217b3()) {
            super.mo10132k4(bArr, jArr, jArr2);
            return;
        }
        C3152yj c3152yj = new C3152yj();
        try {
            C2362x4 c2362x4 = new C2362x4(c3152yj, true);
            try {
                byte[] bArr2 = this.f7747k4;
                if (bArr2 != null) {
                    c2362x4.m11657k4(bArr2);
                }
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

    /* JADX INFO: renamed from: x1 */
    public final byte[] m11256x1() {
        m11218dq();
        return this.f7747k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final byte[] m11254k4() {
        m11218dq();
        return this.f7747k4;
    }
}
