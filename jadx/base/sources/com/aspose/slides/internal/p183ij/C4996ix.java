package com.aspose.slides.internal.p183ij;

import com.aspose.slides.p559ms.System.AbstractC14106wy;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ij.ix */
/* JADX INFO: loaded from: classes.dex */
public class C4996ix extends C5061vw {

    /* JADX INFO: renamed from: k4 */
    private long f13681k4;

    /* JADX INFO: renamed from: com.aspose.slides.internal.ij.ix$k4 */
    public static final class k4 extends AbstractC14106wy {
        static {
            AbstractC14106wy.register(new AbstractC14106wy.du(k4.class, Long.class) { // from class: com.aspose.slides.internal.ij.ix.k4.1
                {
                    addConstant("EMR_COMMENT_EMFSPOOL", 0L);
                    addConstant("EMR_COMMENT_EMFPLUS", 726027589L);
                    addConstant("EMR_COMMENT_PUBLIC", 1128875079L);
                }
            });
        }

        private k4() {
        }
    }

    public C4996ix() {
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
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
        return m21110k4((C4996ix) obj);
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public int hashCode() {
        return (super.hashCode() * 397) ^ ((int) this.f13681k4);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m21110k4(C4996ix c4996ix) {
        return m21559k4((C5061vw) c4996ix) && this.f13681k4 == c4996ix.f13681k4;
    }

    /* JADX INFO: renamed from: to */
    public final long m21111to() {
        return this.f13681k4;
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public String toString() {
        return C14113y2.m67402k4("{0}, DataSize: {1}", super.toString(), Long.valueOf(this.f13681k4));
    }

    public C4996ix(C5061vw c5061vw) {
        super(c5061vw);
    }

    /* JADX INFO: renamed from: to */
    public final void m21112to(long j) {
        this.f13681k4 = j;
    }
}
