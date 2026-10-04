package com.aspose.slides.internal.p349q3;

import com.aspose.slides.internal.p488x0.C12343ne;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.q3.ai */
/* JADX INFO: loaded from: classes4.dex */
public class C9614ai extends C9723vw {

    /* JADX INFO: renamed from: k4 */
    private C12343ne f34772k4;

    public C9614ai(C9723vw c9723vw) {
        super(c9723vw);
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
        return m46949k4((C9614ai) obj);
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
    public int hashCode() {
        int iHashCode = super.hashCode() * 397;
        C12343ne c12343ne = this.f34772k4;
        return iHashCode ^ (c12343ne != null ? c12343ne.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final C12343ne m46947k4() {
        return this.f34772k4;
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
    public String toString() {
        return C14113y2.m67402k4("{0}, Offset: {1}", super.toString(), m46947k4());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m46948k4(C12343ne c12343ne) {
        this.f34772k4 = c12343ne;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m46949k4(C9614ai c9614ai) {
        return m47765k4((C9723vw) c9614ai) && C14067j2.m66728k4(this.f34772k4, c9614ai.f34772k4);
    }
}
