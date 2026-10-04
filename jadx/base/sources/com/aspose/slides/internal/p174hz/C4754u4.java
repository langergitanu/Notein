package com.aspose.slides.internal.p174hz;

import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.internal.p525yi.C12825ix;
import com.aspose.slides.internal.p525yi.C12832ne;
import com.aspose.slides.internal.p525yi.C12838up;
import com.aspose.slides.p559ms.System.C14111xk;

/* JADX INFO: renamed from: com.aspose.slides.internal.hz.u4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4754u4 extends AbstractC4723ix {

    /* JADX INFO: renamed from: du */
    private boolean f13278du;

    /* JADX INFO: renamed from: dy */
    private C12838up f13279dy;

    /* JADX INFO: renamed from: h4 */
    private boolean f13280h4;

    /* JADX INFO: renamed from: kk */
    private C12832ne f13281kk;

    /* JADX INFO: renamed from: m9 */
    private boolean f13282m9;

    /* JADX INFO: renamed from: to */
    private boolean f13283to;

    public C4754u4() {
        this(1024, null);
    }

    @Override // com.aspose.slides.internal.p174hz.AbstractC4709du
    /* JADX INFO: renamed from: k4 */
    public int mo19591k4() {
        return this.f13279dy.mo19591k4();
    }

    /* JADX INFO: renamed from: to */
    public boolean m19758to() {
        return this.f13279dy.m59701to();
    }

    @Override // com.aspose.slides.internal.p174hz.AbstractC4723ix
    /* JADX INFO: renamed from: x1 */
    public C4762wl mo19633x1(boolean z) {
        if (!z || this.f13280h4) {
            return this.f13279dy.mo19633x1(z);
        }
        throw new CryptographicException(C12825ix.m59623k4("Cannot export private key"));
    }

    public C4754u4(int i) {
        this(i, null);
    }

    @Override // com.aspose.slides.internal.p174hz.AbstractC4723ix
    /* JADX INFO: renamed from: x1 */
    public void mo19634x1(C4762wl c4762wl) {
        this.f13279dy.mo19634x1(c4762wl.Clone());
    }

    public C4754u4(int i, C4731ks c4731ks) {
        this.f13280h4 = true;
        this.f13134x1 = new C4711e0[]{new C4711e0(512, 1024, 64)};
        m19592k4(i);
        C12838up c12838up = new C12838up(i);
        this.f13279dy = c12838up;
        c12838up.f42718kk.mo27432x1(new C4757uz(this));
        this.f13283to = c4731ks != null;
        if (c4731ks == null) {
            this.f13281kk = new C12832ne(new C4731ks(13));
            return;
        }
        C12832ne c12832ne = new C12832ne(c4731ks);
        this.f13281kk = c12832ne;
        c12832ne.m59663kk();
        if (this.f13281kk.m59665x1() != null) {
            this.f13278du = true;
            m19635x1(this.f13281kk.m59665x1());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k4 */
    public void m19757k4(Object obj, C14111xk c14111xk) {
        if (!this.f13283to || this.f13278du) {
            return;
        }
        this.f13281kk.m59662k4(m19632kk(!this.f13279dy.m59701to()));
        this.f13281kk.m59664to();
        this.f13278du = true;
    }

    public C4754u4(C4731ks c4731ks) {
        this(1024, c4731ks);
    }

    @Override // com.aspose.slides.internal.p174hz.AbstractC4709du
    /* JADX INFO: renamed from: k4 */
    public void mo19593k4(boolean z) {
        if (this.f13282m9) {
            return;
        }
        if (this.f13278du && !this.f13283to) {
            this.f13281kk.m59660du();
        }
        C12838up c12838up = this.f13279dy;
        if (c12838up != null) {
            c12838up.m19594x1();
        }
        this.f13282m9 = true;
    }

    @Override // com.aspose.slides.internal.p174hz.AbstractC4723ix
    /* JADX INFO: renamed from: k4 */
    public boolean mo19630k4(byte[] bArr, byte[] bArr2) {
        return this.f13279dy.mo19630k4(bArr, bArr2);
    }

    @Override // com.aspose.slides.internal.p174hz.AbstractC4723ix
    /* JADX INFO: renamed from: k4 */
    public byte[] mo19631k4(byte[] bArr) {
        return this.f13279dy.mo19631k4(bArr);
    }
}
