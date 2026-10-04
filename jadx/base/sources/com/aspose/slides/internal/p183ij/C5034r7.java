package com.aspose.slides.internal.p183ij;

import com.aspose.slides.internal.p100e4.C3567k4;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ij.r7 */
/* JADX INFO: loaded from: classes.dex */
public class C5034r7 extends AbstractC5023o3 {

    /* JADX INFO: renamed from: k4 */
    private int f13823k4;

    public C5034r7(C5061vw c5061vw) {
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
        return m21407k4((C5034r7) obj);
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public int hashCode() {
        return (super.hashCode() * 397) ^ (this.f13823k4 & 65535);
    }

    /* JADX INFO: renamed from: k4 */
    public final int m21405k4() {
        return this.f13823k4;
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public String toString() {
        return C14113y2.m67402k4("{0}, Rop2Mode: {1}", super.toString(), C14042ak.m66410k4(C3567k4.class, m21405k4()));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21406k4(int i) {
        this.f13823k4 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m21407k4(C5034r7 c5034r7) {
        return m21559k4((C5061vw) c5034r7) && this.f13823k4 == c5034r7.f13823k4;
    }
}
