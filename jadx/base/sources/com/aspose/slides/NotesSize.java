package com.aspose.slides;

import com.aspose.slides.android.SizeF;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: loaded from: classes3.dex */
public class NotesSize implements INotesSize {

    /* JADX INFO: renamed from: k4 */
    long f2845k4 = -1;

    /* JADX INFO: renamed from: x1 */
    long f2846x1 = -1;

    @Override // com.aspose.slides.INotesSize
    public final SizeF getSize() {
        return (SizeF) C12015qq.m56690k4(m2030k4());
    }

    /* JADX INFO: renamed from: k4 */
    public C12015qq m2030k4() {
        return this.f2845k4 < 0 ? new C12015qq(Float.NaN, Float.NaN) : new C12015qq((float) (this.f2845k4 / 12700.0d), (float) (this.f2846x1 / 12700.0d));
    }

    @Override // com.aspose.slides.INotesSize
    public final void setSize(SizeF sizeF) {
        m2031k4(C12015qq.m56689k4(sizeF));
    }

    /* JADX INFO: renamed from: k4 */
    public void m2031k4(C12015qq c12015qq) {
        if (c12015qq.m56699x1() < 1.0f || c12015qq.m56697kk() < 1.0f) {
            throw new PptxEditException("Slide size dimensions should be positive.");
        }
        if (C14064he.m66715kk(c12015qq.m56699x1()) || C14064he.m66715kk(c12015qq.m56697kk())) {
            this.f2846x1 = -1L;
            this.f2845k4 = -1L;
        } else {
            this.f2845k4 = C7019kk.m27438h4(Double.valueOf(C14116yg.m67497to(((double) c12015qq.m56699x1()) * 12700.0d)), 14);
            this.f2846x1 = C7019kk.m27438h4(Double.valueOf(C14116yg.m67497to(((double) c12015qq.m56697kk()) * 12700.0d)), 14);
        }
    }
}
