package com.aspose.slides.internal.p174hz;

import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p525yi.C12824h4;
import com.aspose.slides.internal.p525yi.C12832ne;
import com.aspose.slides.p559ms.System.C14111xk;

/* JADX INFO: renamed from: com.aspose.slides.internal.hz.j2 */
/* JADX INFO: loaded from: classes.dex */
public final class C4724j2 extends AbstractC4751tq {

    /* JADX INFO: renamed from: c5 */
    private static final C7017h4 f13152c5 = new C7017h4("1.3.14.3.2.26", "1.2.840.113549.2.5", "2.16.840.1.101.3.4.2.1", "2.16.840.1.101.3.4.2.2", "2.16.840.1.101.3.4.2.3");

    /* JADX INFO: renamed from: du */
    private boolean f13153du;

    /* JADX INFO: renamed from: dy */
    private C12824h4 f13154dy;

    /* JADX INFO: renamed from: h4 */
    private boolean f13155h4 = true;

    /* JADX INFO: renamed from: kk */
    private C12832ne f13156kk;

    /* JADX INFO: renamed from: m9 */
    private boolean f13157m9;

    /* JADX INFO: renamed from: to */
    private boolean f13158to;

    public C4724j2() {
        m19636k4(1024, (C4731ks) null);
    }

    @Override // com.aspose.slides.internal.p174hz.AbstractC4709du
    /* JADX INFO: renamed from: k4 */
    public int mo19591k4() {
        C12824h4 c12824h4 = this.f13154dy;
        return c12824h4 == null ? this.f13133k4 : c12824h4.mo19591k4();
    }

    /* JADX INFO: renamed from: to */
    public boolean m19641to() {
        return this.f13154dy.m59622to();
    }

    @Override // com.aspose.slides.internal.p174hz.AbstractC4751tq
    /* JADX INFO: renamed from: x1 */
    public C4701bs mo19642x1(boolean z) {
        if (!z || this.f13155h4) {
            return this.f13154dy.mo19642x1(z);
        }
        throw new CryptographicException("cannot export private key");
    }

    public C4724j2(int i) {
        m19636k4(i, (C4731ks) null);
    }

    /* JADX INFO: renamed from: k4 */
    private void m19636k4(int i, C4731ks c4731ks) {
        this.f13134x1 = new C4711e0[]{new C4711e0(384, 16384, 8)};
        super.m19592k4(i);
        C12824h4 c12824h4 = new C12824h4(mo19591k4());
        this.f13154dy = c12824h4;
        c12824h4.f42666kk.mo27432x1(new C4761w6(this));
        this.f13158to = c4731ks != null;
        if (c4731ks == null) {
            this.f13156kk = new C12832ne(new C4731ks(1));
            return;
        }
        C12832ne c12832ne = new C12832ne(c4731ks);
        this.f13156kk = c12832ne;
        boolean zM59663kk = c12832ne.m59663kk();
        if ((c4731ks.m19669k4() & 8) != 0 && !zM59663kk) {
            throw new CryptographicException("Keyset does not exist");
        }
        if (this.f13156kk.m59665x1() != null) {
            this.f13153du = true;
            m19741x1(this.f13156kk.m59665x1());
        }
    }

    @Override // com.aspose.slides.internal.p174hz.AbstractC4751tq
    /* JADX INFO: renamed from: x1 */
    public byte[] mo19643x1(byte[] bArr) {
        if (this.f13154dy.m59621du()) {
            return this.f13154dy.mo19643x1(bArr);
        }
        throw new CryptographicException("Incomplete private key - missing CRT.");
    }

    public C4724j2(C4731ks c4731ks) {
        m19636k4(1024, c4731ks);
    }

    @Override // com.aspose.slides.internal.p174hz.AbstractC4751tq
    /* JADX INFO: renamed from: k4 */
    public void mo19639k4(C4701bs c4701bs) {
        this.f13154dy.mo19639k4(c4701bs.Clone());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k4 */
    public void m19638k4(Object obj, C14111xk c14111xk) {
        if (!this.f13158to || this.f13153du) {
            return;
        }
        this.f13156kk.m59662k4(mo19739kk(!this.f13154dy.m59622to()));
        this.f13156kk.m59664to();
        this.f13153du = true;
    }

    @Override // com.aspose.slides.internal.p174hz.AbstractC4709du
    /* JADX INFO: renamed from: k4 */
    public void mo19593k4(boolean z) {
        if (this.f13157m9) {
            return;
        }
        if (this.f13153du && !this.f13158to) {
            this.f13156kk.m59660du();
        }
        C12824h4 c12824h4 = this.f13154dy;
        if (c12824h4 != null) {
            c12824h4.m19594x1();
        }
        this.f13157m9 = true;
    }

    @Override // com.aspose.slides.internal.p174hz.AbstractC4751tq
    /* JADX INFO: renamed from: k4 */
    public byte[] mo19640k4(byte[] bArr) {
        return this.f13154dy.mo19640k4(bArr);
    }
}
