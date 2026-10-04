package com.aspose.slides.internal.p420th;

import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12025x6;

/* JADX INFO: renamed from: com.aspose.slides.internal.th.jd */
/* JADX INFO: loaded from: classes4.dex */
public class C10960jd extends AbstractC10981yj {

    /* JADX INFO: renamed from: k4 */
    private boolean f38187k4;

    /* JADX INFO: renamed from: x1 */
    private float f38188x1;

    public C10960jd() {
    }

    /* JADX INFO: renamed from: k4 */
    public final void m52945k4(float f) {
        this.f38188x1 = f;
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10981yj
    /* JADX INFO: renamed from: to */
    public C12007ix mo52867to() {
        return new C12007ix(m53142h4().Clone(), new C12015qq(m52948x1(), m52948x1()));
    }

    /* JADX INFO: renamed from: x1 */
    public final float m52948x1() {
        return this.f38188x1;
    }

    public C10960jd(C12025x6 c12025x6, String str, float f) {
        super(c12025x6.Clone(), str);
        this.f38188x1 = f;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m52946k4(boolean z) {
        this.f38187k4 = z;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m52947k4() {
        return this.f38187k4;
    }
}
