package com.aspose.slides.internal.p349q3;

import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.q3.k1 */
/* JADX INFO: loaded from: classes4.dex */
public class C9665k1 extends AbstractC9685o3 {

    /* JADX INFO: renamed from: k4 */
    private int f34960k4;

    /* JADX INFO: renamed from: x1 */
    private int f34961x1;

    public C9665k1(C9723vw c9723vw) {
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
        return m47361k4((C9665k1) obj);
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
    public int hashCode() {
        return (((super.hashCode() * 397) ^ this.f34960k4) * 397) ^ this.f34961x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m47359k4() {
        return this.f34960k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m47362x1() {
        return this.f34961x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47360k4(int i) {
        this.f34960k4 = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m47363x1(int i) {
        this.f34961x1 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m47361k4(C9665k1 c9665k1) {
        return m47765k4((C9723vw) c9665k1) && this.f34960k4 == c9665k1.f34960k4 && this.f34961x1 == c9665k1.f34961x1;
    }
}
