package com.aspose.slides.internal.p349q3;

import com.aspose.slides.internal.p124f7.C3870kk;
import com.aspose.slides.internal.p349q3.C9658ix;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.q3.ne */
/* JADX INFO: loaded from: classes4.dex */
public class C9681ne extends C9658ix {

    /* JADX INFO: renamed from: k4 */
    private long f35023k4;

    /* JADX INFO: renamed from: x1 */
    private long f35024x1;

    public C9681ne(C9658ix c9658ix) {
        super(c9658ix);
        m47292to(c9658ix.m47290dy());
    }

    @Override // com.aspose.slides.internal.p349q3.C9658ix, com.aspose.slides.internal.p349q3.C9723vw
    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        if (C14067j2.m66727k4(obj) != C14067j2.m66727k4(this)) {
            return false;
        }
        return m47496k4((C9681ne) obj);
    }

    /* JADX INFO: renamed from: h4 */
    public final long m47495h4() {
        return this.f35023k4;
    }

    @Override // com.aspose.slides.internal.p349q3.C9658ix, com.aspose.slides.internal.p349q3.C9723vw
    public int hashCode() {
        return (((super.hashCode() * 397) ^ ((int) this.f35023k4)) * 397) ^ ((int) this.f35024x1);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m47496k4(C9681ne c9681ne) {
        return m47291k4((C9658ix) c9681ne) && this.f35023k4 == c9681ne.f35023k4 && this.f35024x1 == c9681ne.f35024x1;
    }

    /* JADX INFO: renamed from: kk */
    public final void m47497kk(long j) {
        this.f35024x1 = j;
    }

    /* JADX INFO: renamed from: m9 */
    public final long m47498m9() {
        return this.f35024x1;
    }

    @Override // com.aspose.slides.internal.p349q3.C9658ix, com.aspose.slides.internal.p349q3.C9723vw
    public String toString() {
        return C14113y2.m67402k4("{0}, CommentIdentifier: {1}, PublicCommentIdentifier: {2}", super.toString(), C14042ak.m66410k4(C9658ix.k4.class, m47495h4()), C14042ak.m66410k4(C3870kk.class, m47498m9()));
    }

    /* JADX INFO: renamed from: x1 */
    public final void m47499x1(long j) {
        this.f35023k4 = j;
    }
}
