package com.aspose.slides.internal.p183ij;

import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ij.k1 */
/* JADX INFO: loaded from: classes.dex */
public class C5003k1 extends AbstractC5023o3 {

    /* JADX INFO: renamed from: k4 */
    private int f13713k4;

    /* JADX INFO: renamed from: x1 */
    private int f13714x1;

    public C5003k1(C5061vw c5061vw) {
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
        return m21178k4((C5003k1) obj);
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public int hashCode() {
        return (((super.hashCode() * 397) ^ this.f13713k4) * 397) ^ this.f13714x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m21176k4() {
        return this.f13713k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m21179x1() {
        return this.f13714x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21177k4(int i) {
        this.f13713k4 = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m21180x1(int i) {
        this.f13714x1 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m21178k4(C5003k1 c5003k1) {
        return m21559k4((C5061vw) c5003k1) && this.f13713k4 == c5003k1.f13713k4 && this.f13714x1 == c5003k1.f13714x1;
    }
}
