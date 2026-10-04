package com.aspose.slides.internal.p183ij;

import com.aspose.slides.internal.p183ij.C4996ix;
import com.aspose.slides.internal.p360qg.C9869kk;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ij.ne */
/* JADX INFO: loaded from: classes.dex */
public class C5019ne extends C4996ix {

    /* JADX INFO: renamed from: k4 */
    private long f13776k4;

    /* JADX INFO: renamed from: x1 */
    private long f13777x1;

    public C5019ne(C4996ix c4996ix) {
        super(c4996ix);
        m21112to(c4996ix.m21111to());
    }

    @Override // com.aspose.slides.internal.p183ij.C4996ix, com.aspose.slides.internal.p183ij.C5061vw
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
        return m21306k4((C5019ne) obj);
    }

    @Override // com.aspose.slides.internal.p183ij.C4996ix, com.aspose.slides.internal.p183ij.C5061vw
    public int hashCode() {
        return (((super.hashCode() * 397) ^ ((int) this.f13776k4)) * 397) ^ ((int) this.f13777x1);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m21306k4(C5019ne c5019ne) {
        return m21110k4((C4996ix) c5019ne) && this.f13776k4 == c5019ne.f13776k4 && this.f13777x1 == c5019ne.f13777x1;
    }

    /* JADX INFO: renamed from: kk */
    public final long m21307kk() {
        return this.f13777x1;
    }

    @Override // com.aspose.slides.internal.p183ij.C4996ix, com.aspose.slides.internal.p183ij.C5061vw
    public String toString() {
        return C14113y2.m67402k4("{0}, CommentIdentifier: {1}, PublicCommentIdentifier: {2}", super.toString(), C14042ak.m66410k4(C4996ix.k4.class, m21309x1()), C14042ak.m66410k4(C9869kk.class, m21307kk()));
    }

    /* JADX INFO: renamed from: x1 */
    public final long m21309x1() {
        return this.f13776k4;
    }

    /* JADX INFO: renamed from: kk */
    public final void m21308kk(long j) {
        this.f13777x1 = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m21310x1(long j) {
        this.f13776k4 = j;
    }
}
