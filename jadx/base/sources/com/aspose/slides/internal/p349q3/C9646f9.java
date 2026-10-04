package com.aspose.slides.internal.p349q3;

import com.aspose.slides.internal.p260ly.C6284u4;
import com.aspose.slides.internal.p488x0.C12350uz;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.q3.f9 */
/* JADX INFO: loaded from: classes4.dex */
public class C9646f9 extends AbstractC9615ak {

    /* JADX INFO: renamed from: du */
    private int f34881du;

    /* JADX INFO: renamed from: h4 */
    private C6284u4 f34882h4;

    /* JADX INFO: renamed from: k4 */
    private C12350uz f34883k4;

    /* JADX INFO: renamed from: kk */
    private long f34884kk;

    /* JADX INFO: renamed from: to */
    private int f34885to;

    /* JADX INFO: renamed from: x1 */
    private long f34886x1;

    public C9646f9(C9723vw c9723vw) {
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
        return m47191k4((C9646f9) obj);
    }

    /* JADX INFO: renamed from: h4 */
    public final int m47185h4() {
        return this.f34881du;
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
    public int hashCode() {
        int iHashCode = super.hashCode() * 397;
        C12350uz c12350uz = this.f34883k4;
        int iHashCode2 = (((((((((iHashCode ^ (c12350uz != null ? c12350uz.hashCode() : 0)) * 397) ^ ((int) this.f34886x1)) * 397) ^ ((int) this.f34884kk)) * 397) ^ this.f34885to) * 397) ^ this.f34881du) * 397;
        C6284u4 c6284u4 = this.f34882h4;
        return iHashCode2 ^ (c6284u4 != null ? c6284u4.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final C12350uz m47186k4() {
        return this.f34883k4;
    }

    /* JADX INFO: renamed from: kk */
    public final long m47192kk() {
        return this.f34884kk;
    }

    /* JADX INFO: renamed from: m9 */
    public final C6284u4 m47193m9() {
        return this.f34882h4;
    }

    /* JADX INFO: renamed from: to */
    public final int m47194to() {
        return this.f34885to;
    }

    /* JADX INFO: renamed from: x1 */
    public final long m47195x1() {
        return this.f34886x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47187k4(int i) {
        this.f34885to = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m47196x1(int i) {
        this.f34881du = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47188k4(long j) {
        this.f34886x1 = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m47197x1(long j) {
        this.f34884kk = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47189k4(C6284u4 c6284u4) {
        this.f34882h4 = c6284u4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47190k4(C12350uz c12350uz) {
        this.f34883k4 = c12350uz;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m47191k4(C9646f9 c9646f9) {
        return m47765k4((C9723vw) c9646f9) && C14067j2.m66728k4(this.f34883k4, c9646f9.f34883k4) && this.f34886x1 == c9646f9.f34886x1 && this.f34884kk == c9646f9.f34884kk && this.f34885to == c9646f9.f34885to && this.f34881du == c9646f9.f34881du && this.f34882h4.equals(c9646f9.f34882h4);
    }
}
