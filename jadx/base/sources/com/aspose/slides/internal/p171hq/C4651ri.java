package com.aspose.slides.internal.p171hq;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14088s7;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.hq.ri */
/* JADX INFO: loaded from: classes.dex */
public final class C4651ri extends AbstractC4619du {

    /* JADX INFO: renamed from: k4 */
    private short f12991k4;

    /* JADX INFO: renamed from: kk */
    private short f12992kk;

    /* JADX INFO: renamed from: to */
    private short f12993to;

    /* JADX INFO: renamed from: x1 */
    private short f12994x1;

    /* JADX INFO: renamed from: du */
    public final short m19321du() {
        return this.f12993to;
    }

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        return C7019kk.m27469x1(obj, C4651ri.class) && m19320k4((C4651ri) obj);
    }

    @Override // com.aspose.slides.internal.p171hq.AbstractC4623f9
    /* JADX INFO: renamed from: h4 */
    public int mo19017h4() {
        return 8;
    }

    public int hashCode() {
        return (((((C14088s7.m67172k4(this.f12991k4) * 397) ^ C14088s7.m67172k4(this.f12994x1)) * 397) ^ C14088s7.m67172k4(this.f12992kk)) * 397) ^ C14088s7.m67172k4(this.f12993to);
    }

    @Override // com.aspose.slides.internal.p171hq.AbstractC4619du
    /* JADX INFO: renamed from: k4 */
    public C12007ix mo19058k4() {
        return new C12007ix(this.f12991k4, this.f12994x1, this.f12992kk, this.f12993to);
    }

    /* JADX INFO: renamed from: kk */
    public final short m19323kk() {
        return this.f12994x1;
    }

    /* JADX INFO: renamed from: to */
    public final short m19325to() {
        return this.f12992kk;
    }

    public String toString() {
        return C14113y2.m67402k4("[X: {0}, Y: {1}, Width: {2}, Height: {3}]", Short.valueOf(this.f12991k4), Short.valueOf(this.f12994x1), Short.valueOf(this.f12992kk), Short.valueOf(this.f12993to));
    }

    /* JADX INFO: renamed from: x1 */
    public final short m19327x1() {
        return this.f12991k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19322k4(short s) {
        this.f12991k4 = s;
    }

    /* JADX INFO: renamed from: kk */
    public final void m19324kk(short s) {
        this.f12992kk = s;
    }

    /* JADX INFO: renamed from: to */
    public final void m19326to(short s) {
        this.f12993to = s;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m19328x1(short s) {
        this.f12994x1 = s;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m19320k4(C4651ri c4651ri) {
        return this.f12991k4 == c4651ri.f12991k4 && this.f12994x1 == c4651ri.f12994x1 && this.f12992kk == c4651ri.f12992kk && this.f12993to == c4651ri.f12993to;
    }
}
