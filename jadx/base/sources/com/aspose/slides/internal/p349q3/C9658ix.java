package com.aspose.slides.internal.p349q3;

import com.aspose.slides.p559ms.System.AbstractC14106wy;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.q3.ix */
/* JADX INFO: loaded from: classes4.dex */
public class C9658ix extends C9723vw {

    /* JADX INFO: renamed from: k4 */
    private long f34928k4;

    /* JADX INFO: renamed from: com.aspose.slides.internal.q3.ix$k4 */
    public static final class k4 extends AbstractC14106wy {
        static {
            AbstractC14106wy.register(new AbstractC14106wy.du(k4.class, Long.class) { // from class: com.aspose.slides.internal.q3.ix.k4.1
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

    public C9658ix() {
    }

    /* JADX INFO: renamed from: dy */
    public final long m47290dy() {
        return this.f34928k4;
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
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
        return m47291k4((C9658ix) obj);
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
    public int hashCode() {
        return (super.hashCode() * 397) ^ ((int) this.f34928k4);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m47291k4(C9658ix c9658ix) {
        return m47765k4((C9723vw) c9658ix) && this.f34928k4 == c9658ix.f34928k4;
    }

    /* JADX INFO: renamed from: to */
    public final void m47292to(long j) {
        this.f34928k4 = j;
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
    public String toString() {
        return C14113y2.m67402k4("{0}, DataSize: {1}", super.toString(), Long.valueOf(this.f34928k4));
    }

    public C9658ix(C9723vw c9723vw) {
        super(c9723vw);
    }
}
