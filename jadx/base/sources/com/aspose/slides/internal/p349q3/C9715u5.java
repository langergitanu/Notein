package com.aspose.slides.internal.p349q3;

import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.q3.u5 */
/* JADX INFO: loaded from: classes4.dex */
public class C9715u5 extends AbstractC9685o3 {

    /* JADX INFO: renamed from: k4 */
    private int f35119k4;

    /* JADX INFO: renamed from: kk */
    private int f35120kk;

    /* JADX INFO: renamed from: to */
    private int f35121to;

    /* JADX INFO: renamed from: x1 */
    private int f35122x1;

    public C9715u5(C9723vw c9723vw) {
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
        return m47710k4((C9715u5) obj);
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
    public int hashCode() {
        return (((((((super.hashCode() * 397) ^ this.f35119k4) * 397) ^ this.f35122x1) * 397) ^ this.f35120kk) * 397) ^ this.f35121to;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m47708k4() {
        return this.f35119k4;
    }

    /* JADX INFO: renamed from: kk */
    public final int m47711kk() {
        return this.f35120kk;
    }

    /* JADX INFO: renamed from: to */
    public final int m47713to() {
        return this.f35121to;
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
    public String toString() {
        return C14113y2.m67402k4("{0}, XNum: {1}, XDenom: {2}, YNum: {3}, YDenom: {4}", super.toString(), Integer.valueOf(m47708k4()), Integer.valueOf(m47715x1()), Integer.valueOf(m47711kk()), Integer.valueOf(m47713to()));
    }

    /* JADX INFO: renamed from: x1 */
    public final int m47715x1() {
        return this.f35122x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47709k4(int i) {
        this.f35119k4 = i;
    }

    /* JADX INFO: renamed from: kk */
    public final void m47712kk(int i) {
        this.f35120kk = i;
    }

    /* JADX INFO: renamed from: to */
    public final void m47714to(int i) {
        this.f35121to = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m47716x1(int i) {
        this.f35122x1 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m47710k4(C9715u5 c9715u5) {
        return m47765k4((C9723vw) c9715u5) && this.f35119k4 == c9715u5.f35119k4 && this.f35122x1 == c9715u5.f35122x1 && this.f35120kk == c9715u5.f35120kk && this.f35121to == c9715u5.f35121to;
    }
}
