package com.aspose.slides.internal.p183ij;

import com.aspose.slides.internal.p498xe.C12521uz;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ij.n0 */
/* JADX INFO: loaded from: classes.dex */
public class C5016n0 extends AbstractC4953ak {

    /* JADX INFO: renamed from: c5 */
    private String f13762c5;

    /* JADX INFO: renamed from: du */
    private long f13763du;

    /* JADX INFO: renamed from: dy */
    private C12521uz f13764dy;

    /* JADX INFO: renamed from: h4 */
    private float f13765h4;

    /* JADX INFO: renamed from: jd */
    private byte[] f13766jd;

    /* JADX INFO: renamed from: k4 */
    private int f13767k4;

    /* JADX INFO: renamed from: kk */
    private long f13768kk;

    /* JADX INFO: renamed from: m9 */
    private float f13769m9;

    /* JADX INFO: renamed from: to */
    private long f13770to;

    /* JADX INFO: renamed from: x1 */
    private int f13771x1;

    public C5016n0(C5061vw c5061vw) {
        super(c5061vw);
    }

    /* JADX INFO: renamed from: c5 */
    public final C12521uz m21276c5() {
        return this.f13764dy;
    }

    /* JADX INFO: renamed from: ck */
    public final byte[] m21277ck() {
        return this.f13766jd;
    }

    /* JADX INFO: renamed from: dy */
    public final float m21278dy() {
        return this.f13769m9;
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
        return m21288k4((C5016n0) obj);
    }

    /* JADX INFO: renamed from: h4 */
    public final long m21279h4() {
        return this.f13763du;
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public int hashCode() {
        int iHashCode = ((((((((((((((super.hashCode() * 397) ^ this.f13767k4) * 397) ^ this.f13771x1) * 397) ^ ((int) this.f13768kk)) * 397) ^ ((int) this.f13770to)) * 397) ^ ((int) this.f13763du)) * 397) ^ C14064he.m66708k4(this.f13765h4)) * 397) ^ C14064he.m66708k4(this.f13769m9)) * 397;
        C12521uz c12521uz = this.f13764dy;
        int iHashCode2 = (iHashCode ^ (c12521uz != null ? c12521uz.hashCode() : 0)) * 397;
        String str = this.f13762c5;
        return iHashCode2 ^ (str != null ? str.hashCode() : 0);
    }

    /* JADX INFO: renamed from: jd */
    public final String m21280jd() {
        return this.f13762c5;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m21281k4() {
        return this.f13767k4;
    }

    /* JADX INFO: renamed from: kk */
    public final long m21289kk() {
        return this.f13768kk;
    }

    /* JADX INFO: renamed from: m9 */
    public final float m21291m9() {
        return this.f13765h4;
    }

    /* JADX INFO: renamed from: to */
    public final long m21292to() {
        return this.f13770to;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m21293x1() {
        return this.f13771x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21282k4(float f) {
        this.f13765h4 = f;
    }

    /* JADX INFO: renamed from: kk */
    public final void m21290kk(long j) {
        this.f13763du = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m21294x1(float f) {
        this.f13769m9 = f;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21283k4(int i) {
        this.f13767k4 = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m21295x1(int i) {
        this.f13771x1 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21284k4(long j) {
        this.f13768kk = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m21296x1(long j) {
        this.f13770to = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21285k4(C12521uz c12521uz) {
        this.f13764dy = c12521uz;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21286k4(String str) {
        this.f13762c5 = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21287k4(byte[] bArr) {
        this.f13766jd = bArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m21288k4(C5016n0 c5016n0) {
        return m21559k4((C5061vw) c5016n0) && this.f13767k4 == c5016n0.f13767k4 && this.f13771x1 == c5016n0.f13771x1 && this.f13768kk == c5016n0.f13768kk && this.f13770to == c5016n0.f13770to && this.f13763du == c5016n0.f13763du && C14064he.m66718x1(this.f13765h4, c5016n0.f13765h4) && C14064he.m66718x1(this.f13769m9, c5016n0.f13769m9) && C14067j2.m66728k4(this.f13764dy, c5016n0.f13764dy) && C14113y2.m67363du(this.f13762c5, c5016n0.f13762c5);
    }
}
