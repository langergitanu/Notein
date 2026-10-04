package com.aspose.slides.internal.p349q3;

import com.aspose.slides.internal.p488x0.C12350uz;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.q3.n0 */
/* JADX INFO: loaded from: classes4.dex */
public class C9678n0 extends AbstractC9615ak {

    /* JADX INFO: renamed from: c5 */
    private String f35009c5;

    /* JADX INFO: renamed from: du */
    private long f35010du;

    /* JADX INFO: renamed from: dy */
    private C12350uz f35011dy;

    /* JADX INFO: renamed from: h4 */
    private float f35012h4;

    /* JADX INFO: renamed from: jd */
    private byte[] f35013jd;

    /* JADX INFO: renamed from: k4 */
    private int f35014k4;

    /* JADX INFO: renamed from: kk */
    private long f35015kk;

    /* JADX INFO: renamed from: m9 */
    private float f35016m9;

    /* JADX INFO: renamed from: to */
    private long f35017to;

    /* JADX INFO: renamed from: x1 */
    private int f35018x1;

    public C9678n0(C9723vw c9723vw) {
        super(c9723vw);
    }

    /* JADX INFO: renamed from: c5 */
    public final C12350uz m47464c5() {
        return this.f35011dy;
    }

    /* JADX INFO: renamed from: ck */
    public final byte[] m47465ck() {
        return this.f35013jd;
    }

    /* JADX INFO: renamed from: dy */
    public final float m47466dy() {
        return this.f35016m9;
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
        return m47476k4((C9678n0) obj);
    }

    /* JADX INFO: renamed from: h4 */
    public final long m47467h4() {
        return this.f35010du;
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
    public int hashCode() {
        int iHashCode = ((((((((((((((super.hashCode() * 397) ^ this.f35014k4) * 397) ^ this.f35018x1) * 397) ^ ((int) this.f35015kk)) * 397) ^ ((int) this.f35017to)) * 397) ^ ((int) this.f35010du)) * 397) ^ C14064he.m66708k4(this.f35012h4)) * 397) ^ C14064he.m66708k4(this.f35016m9)) * 397;
        C12350uz c12350uz = this.f35011dy;
        int iHashCode2 = (iHashCode ^ (c12350uz != null ? c12350uz.hashCode() : 0)) * 397;
        String str = this.f35009c5;
        return iHashCode2 ^ (str != null ? str.hashCode() : 0);
    }

    /* JADX INFO: renamed from: jd */
    public final String m47468jd() {
        return this.f35009c5;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m47469k4() {
        return this.f35014k4;
    }

    /* JADX INFO: renamed from: kk */
    public final long m47477kk() {
        return this.f35015kk;
    }

    /* JADX INFO: renamed from: m9 */
    public final float m47479m9() {
        return this.f35012h4;
    }

    /* JADX INFO: renamed from: to */
    public final long m47480to() {
        return this.f35017to;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m47481x1() {
        return this.f35018x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47470k4(float f) {
        this.f35012h4 = f;
    }

    /* JADX INFO: renamed from: kk */
    public final void m47478kk(long j) {
        this.f35010du = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m47482x1(float f) {
        this.f35016m9 = f;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47471k4(int i) {
        this.f35014k4 = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m47483x1(int i) {
        this.f35018x1 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47472k4(long j) {
        this.f35015kk = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m47484x1(long j) {
        this.f35017to = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47473k4(C12350uz c12350uz) {
        this.f35011dy = c12350uz;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47474k4(String str) {
        this.f35009c5 = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47475k4(byte[] bArr) {
        this.f35013jd = bArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m47476k4(C9678n0 c9678n0) {
        return m47765k4((C9723vw) c9678n0) && this.f35014k4 == c9678n0.f35014k4 && this.f35018x1 == c9678n0.f35018x1 && this.f35015kk == c9678n0.f35015kk && this.f35017to == c9678n0.f35017to && this.f35010du == c9678n0.f35010du && C14064he.m66718x1(this.f35012h4, c9678n0.f35012h4) && C14064he.m66718x1(this.f35016m9, c9678n0.f35016m9) && C14067j2.m66728k4(this.f35011dy, c9678n0.f35011dy) && C14113y2.m67363du(this.f35009c5, c9678n0.f35009c5);
    }
}
