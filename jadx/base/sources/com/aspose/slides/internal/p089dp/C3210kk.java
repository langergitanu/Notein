package com.aspose.slides.internal.p089dp;

import com.aspose.slides.internal.p173hx.AbstractC4691k4;
import com.aspose.slides.internal.p173hx.C4689du;
import com.aspose.slides.internal.p416tb.C10894bv;
import com.aspose.slides.internal.p416tb.C10898dy;
import com.aspose.slides.internal.p416tb.C10922yj;

/* JADX INFO: renamed from: com.aspose.slides.internal.dp.kk */
/* JADX INFO: loaded from: classes3.dex */
public class C3210kk extends C10894bv {

    /* JADX INFO: renamed from: du */
    private final int f9597du;

    /* JADX INFO: renamed from: k4 */
    private final byte[] f9598k4;

    /* JADX INFO: renamed from: kk */
    private final int f9599kk;

    /* JADX INFO: renamed from: to */
    private final int f9600to;

    public C3210kk(C10898dy c10898dy, byte[] bArr, int i, int i2, int i3) {
        super(c10898dy);
        this.f9598k4 = bArr;
        this.f9599kk = i;
        this.f9600to = i2;
        this.f9597du = i3;
    }

    @Override // com.aspose.slides.internal.p416tb.C10894bv, com.aspose.slides.internal.p416tb.AbstractC10914up
    /* JADX INFO: renamed from: k4 */
    public void mo9082k4(C10922yj c10922yj) {
        m52424k4(c10922yj, this.f9598k4, this.f9599kk);
    }

    @Override // com.aspose.slides.internal.p416tb.C10894bv
    /* JADX INFO: renamed from: kk */
    public AbstractC4691k4 mo13905kk() {
        int iM52608h4 = this.f37962x1.m52464x1().m52608h4();
        if (iM52608h4 != 0 && iM52608h4 != 2) {
            return super.mo13905kk();
        }
        C4689du c4689du = new C4689du();
        c4689du.m19548kk(8);
        c4689du.m19549x1(this.f9600to);
        c4689du.m19545k4(1);
        c4689du.m19547k4(true);
        return c4689du;
    }

    @Override // com.aspose.slides.internal.p416tb.C10894bv
    /* JADX INFO: renamed from: to */
    public long mo13906to() {
        return this.f9599kk;
    }

    @Override // com.aspose.slides.internal.p416tb.C10894bv
    /* JADX INFO: renamed from: x1 */
    public void mo9084x1(C10922yj c10922yj) {
        c10922yj.m52666kk("/Type", "/XObject");
        c10922yj.m52666kk("/Subtype", "/Image");
        c10922yj.m52652k4("/Width", this.f9600to);
        c10922yj.m52652k4("/Height", this.f9597du);
        c10922yj.m52666kk("/ColorSpace", "/DeviceGray");
        c10922yj.m52652k4("/BitsPerComponent", 8);
    }
}
