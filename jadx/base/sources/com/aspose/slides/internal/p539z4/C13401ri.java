package com.aspose.slides.internal.p539z4;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14088s7;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.z4.ri */
/* JADX INFO: loaded from: classes5.dex */
public final class C13401ri extends AbstractC13369du {

    /* JADX INFO: renamed from: k4 */
    private short f44844k4;

    /* JADX INFO: renamed from: kk */
    private short f44845kk;

    /* JADX INFO: renamed from: to */
    private short f44846to;

    /* JADX INFO: renamed from: x1 */
    private short f44847x1;

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        return C7019kk.m27469x1(obj, C13401ri.class) && m62313k4((C13401ri) obj);
    }

    @Override // com.aspose.slides.internal.p539z4.AbstractC13373f9
    /* JADX INFO: renamed from: h4 */
    public int mo62023h4() {
        return 8;
    }

    public int hashCode() {
        return (((((C14088s7.m67172k4(this.f44844k4) * 397) ^ C14088s7.m67172k4(this.f44847x1)) * 397) ^ C14088s7.m67172k4(this.f44845kk)) * 397) ^ C14088s7.m67172k4(this.f44846to);
    }

    @Override // com.aspose.slides.internal.p539z4.AbstractC13369du
    /* JADX INFO: renamed from: k4 */
    public C12007ix mo62062k4() {
        return new C12007ix(this.f44844k4, this.f44847x1, this.f44845kk, this.f44846to);
    }

    /* JADX INFO: renamed from: kk */
    public final void m62315kk(short s) {
        this.f44845kk = s;
    }

    /* JADX INFO: renamed from: to */
    public final void m62316to(short s) {
        this.f44846to = s;
    }

    public String toString() {
        return C14113y2.m67402k4("[X: {0}, Y: {1}, Width: {2}, Height: {3}]", Short.valueOf(this.f44844k4), Short.valueOf(this.f44847x1), Short.valueOf(this.f44845kk), Short.valueOf(this.f44846to));
    }

    /* JADX INFO: renamed from: x1 */
    public final void m62317x1(short s) {
        this.f44847x1 = s;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62314k4(short s) {
        this.f44844k4 = s;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m62313k4(C13401ri c13401ri) {
        return this.f44844k4 == c13401ri.f44844k4 && this.f44847x1 == c13401ri.f44847x1 && this.f44845kk == c13401ri.f44845kk && this.f44846to == c13401ri.f44846to;
    }
}
