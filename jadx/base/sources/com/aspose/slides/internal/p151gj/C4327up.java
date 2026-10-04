package com.aspose.slides.internal.p151gj;

import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p223ka.C5656k4;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p500xi.AbstractC12536x1;
import com.aspose.slides.internal.p504xm.C12549du;

/* JADX INFO: renamed from: com.aspose.slides.internal.gj.up */
/* JADX INFO: loaded from: classes.dex */
public class C4327up extends AbstractC4323ks {

    /* JADX INFO: renamed from: du */
    private C12007ix f11819du;

    /* JADX INFO: renamed from: k4 */
    protected AbstractC12002ck f11820k4;

    /* JADX INFO: renamed from: kk */
    private byte[] f11821kk;

    /* JADX INFO: renamed from: to */
    private float f11822to;

    /* JADX INFO: renamed from: x1 */
    private C5656k4[] f11823x1;

    public C4327up(byte[] bArr) {
        this(bArr, 0);
    }

    /* JADX INFO: renamed from: du */
    public final C12007ix m17410du() {
        return this.f11819du;
    }

    /* JADX INFO: renamed from: h4 */
    public AbstractC12002ck m17411h4() {
        if (this.f11820k4 == null) {
            this.f11820k4 = C12549du.m58510ne(m17416x1()) ? AbstractC12536x1.m58363k4(new C3152yj(m17416x1())).mo13505to() : AbstractC12002ck.m56312k4(new C3152yj(m17416x1()));
        }
        return this.f11820k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m17412k4(float f) {
        this.f11822to = f;
    }

    /* JADX INFO: renamed from: kk */
    public final float m17414kk() {
        return this.f11822to;
    }

    /* JADX INFO: renamed from: to */
    public final C5656k4[] m17415to() {
        return this.f11823x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final byte[] m17416x1() {
        return this.f11821kk;
    }

    public C4327up(byte[] bArr, int i) {
        super(2);
        this.f11822to = -3.4028235E38f;
        this.f11819du = C12007ix.f40519k4.Clone();
        m17413k4(bArr);
        m17387k4(new C4317dy());
        m17386k4(i);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m17413k4(byte[] bArr) {
        this.f11821kk = bArr;
    }
}
