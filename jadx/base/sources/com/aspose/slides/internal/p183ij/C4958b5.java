package com.aspose.slides.internal.p183ij;

import com.aspose.slides.internal.p360qg.C9874up;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ij.b5 */
/* JADX INFO: loaded from: classes.dex */
public class C4958b5 extends AbstractC5023o3 {

    /* JADX INFO: renamed from: k4 */
    private long f13538k4;

    public C4958b5(C5061vw c5061vw) {
        super(c5061vw);
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
        return m20816k4((C4958b5) obj);
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public int hashCode() {
        return (super.hashCode() * 397) ^ ((int) this.f13538k4);
    }

    /* JADX INFO: renamed from: k4 */
    public final long m20814k4() {
        return this.f13538k4;
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public String toString() {
        return C14113y2.m67402k4("{0}, PolygonFillMode: {1}", super.toString(), C14042ak.m66410k4(C9874up.class, m20814k4()));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m20815k4(long j) {
        this.f13538k4 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m20816k4(C4958b5 c4958b5) {
        return m21559k4((C5061vw) c4958b5) && this.f13538k4 == c4958b5.f13538k4;
    }
}
