package com.aspose.slides.internal.p349q3;

import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.q3.sq */
/* JADX INFO: loaded from: classes4.dex */
public class C9703sq extends AbstractC9685o3 {

    /* JADX INFO: renamed from: k4 */
    private int f35085k4;

    /* JADX INFO: renamed from: kk */
    private int f35086kk;

    /* JADX INFO: renamed from: to */
    private int f35087to;

    /* JADX INFO: renamed from: x1 */
    private int f35088x1;

    public C9703sq(C9723vw c9723vw) {
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
        return m47631k4((C9703sq) obj);
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
    public int hashCode() {
        return (((((((super.hashCode() * 397) ^ this.f35085k4) * 397) ^ this.f35088x1) * 397) ^ this.f35086kk) * 397) ^ this.f35087to;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m47629k4() {
        return this.f35085k4;
    }

    /* JADX INFO: renamed from: kk */
    public final int m47632kk() {
        return this.f35086kk;
    }

    /* JADX INFO: renamed from: to */
    public final int m47634to() {
        return this.f35087to;
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
    public String toString() {
        return C14113y2.m67402k4("{0}, XNum: {1}, XDenom: {2}, YNum: {3}, YDenom: {4}", super.toString(), Integer.valueOf(m47629k4()), Integer.valueOf(m47636x1()), Integer.valueOf(m47632kk()), Integer.valueOf(m47634to()));
    }

    /* JADX INFO: renamed from: x1 */
    public final int m47636x1() {
        return this.f35088x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47630k4(int i) {
        this.f35085k4 = i;
    }

    /* JADX INFO: renamed from: kk */
    public final void m47633kk(int i) {
        this.f35086kk = i;
    }

    /* JADX INFO: renamed from: to */
    public final void m47635to(int i) {
        this.f35087to = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m47637x1(int i) {
        this.f35088x1 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m47631k4(C9703sq c9703sq) {
        return m47765k4((C9723vw) c9703sq) && this.f35085k4 == c9703sq.f35085k4 && this.f35088x1 == c9703sq.f35088x1 && this.f35086kk == c9703sq.f35086kk && this.f35087to == c9703sq.f35087to;
    }
}
