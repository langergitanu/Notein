package com.aspose.slides.internal.p539z4;

import com.aspose.slides.internal.p026an.C1490m9;
import com.aspose.slides.internal.p026an.C1499u4;
import com.aspose.slides.internal.p026an.C1502uz;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.z4.lr */
/* JADX INFO: loaded from: classes5.dex */
public class C13391lr extends C13359ar {

    /* JADX INFO: renamed from: c5 */
    private C13431zj f44790c5;

    /* JADX INFO: renamed from: ck */
    private C13428yd f44791ck;

    /* JADX INFO: renamed from: du */
    private long f44792du;

    /* JADX INFO: renamed from: dy */
    private float f44793dy;

    /* JADX INFO: renamed from: h4 */
    private int f44794h4;

    /* JADX INFO: renamed from: jd */
    private C13431zj f44795jd;

    /* JADX INFO: renamed from: k4 */
    private long f44796k4;

    /* JADX INFO: renamed from: kk */
    private float f44797kk;

    /* JADX INFO: renamed from: m9 */
    private float f44798m9;

    /* JADX INFO: renamed from: to */
    private long f44799to;

    /* JADX INFO: renamed from: x1 */
    private long f44800x1;

    /* JADX INFO: renamed from: c5 */
    public final C13428yd m62199c5() {
        return this.f44791ck;
    }

    /* JADX INFO: renamed from: du */
    public final long m62200du() {
        return this.f44792du;
    }

    /* JADX INFO: renamed from: dy */
    public final float m62201dy() {
        return this.f44793dy;
    }

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
        return m62208k4((C13391lr) obj);
    }

    @Override // com.aspose.slides.internal.p539z4.C13359ar, com.aspose.slides.internal.p539z4.AbstractC13373f9
    /* JADX INFO: renamed from: h4 */
    public int mo62023h4() {
        C13428yd c13428yd = this.f44791ck;
        if (c13428yd != null) {
            return c13428yd.mo62023h4() + 48;
        }
        return 48;
    }

    public int hashCode() {
        int iM66708k4 = ((((((((((((((((int) this.f44796k4) * 397) ^ ((int) this.f44800x1)) * 397) ^ C14064he.m66708k4(this.f44797kk)) * 397) ^ ((int) this.f44799to)) * 397) ^ ((int) this.f44792du)) * 397) ^ this.f44794h4) * 397) ^ C14064he.m66708k4(this.f44798m9)) * 397) ^ C14064he.m66708k4(this.f44793dy)) * 397;
        C13431zj c13431zj = this.f44790c5;
        int iHashCode = (iM66708k4 ^ (c13431zj != null ? c13431zj.hashCode() : 0)) * 397;
        C13431zj c13431zj2 = this.f44795jd;
        int iHashCode2 = (iHashCode ^ (c13431zj2 != null ? c13431zj2.hashCode() : 0)) * 397;
        C13428yd c13428yd = this.f44791ck;
        return iHashCode2 ^ (c13428yd != null ? c13428yd.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final long m62202k4() {
        return this.f44796k4;
    }

    /* JADX INFO: renamed from: kk */
    public final float m62209kk() {
        return this.f44797kk;
    }

    /* JADX INFO: renamed from: m9 */
    public final int m62212m9() {
        return this.f44794h4;
    }

    /* JADX INFO: renamed from: to */
    public final long m62213to() {
        return this.f44799to;
    }

    public String toString() {
        return C14113y2.m67402k4("[CustomLineCapDataFlags: {0}, BaseCap: {1}, BaseInset: {2}, StrokeStartCap: {3}, StrokeEndCap: {4}, StrokeJoin: {5}, StrokeMiterLimit: {6}, WidthScale: {7}, FillHotSpot: {8}, StrokeHotSpot: {9}, OptionalData: {10}]", C14042ak.m66410k4(C1490m9.class, this.f44796k4), C14042ak.m66410k4(C1499u4.class, this.f44800x1), Float.valueOf(this.f44797kk), Long.valueOf(this.f44799to), Long.valueOf(this.f44792du), C14042ak.m66410k4(C1502uz.class, this.f44794h4), Float.valueOf(this.f44798m9), Float.valueOf(this.f44793dy), this.f44790c5, this.f44795jd, this.f44791ck);
    }

    /* JADX INFO: renamed from: x1 */
    public final long m62215x1() {
        return this.f44800x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62203k4(float f) {
        this.f44797kk = f;
    }

    /* JADX INFO: renamed from: kk */
    public final void m62210kk(float f) {
        this.f44793dy = f;
    }

    /* JADX INFO: renamed from: to */
    public final void m62214to(long j) {
        this.f44792du = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m62216x1(float f) {
        this.f44798m9 = f;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62204k4(int i) {
        this.f44794h4 = i;
    }

    /* JADX INFO: renamed from: kk */
    public final void m62211kk(long j) {
        this.f44799to = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m62217x1(long j) {
        this.f44800x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62205k4(long j) {
        this.f44796k4 = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m62218x1(C13431zj c13431zj) {
        this.f44795jd = c13431zj;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62206k4(C13428yd c13428yd) {
        this.f44791ck = c13428yd;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62207k4(C13431zj c13431zj) {
        this.f44790c5 = c13431zj;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m62208k4(C13391lr c13391lr) {
        return this.f44796k4 == c13391lr.f44796k4 && this.f44800x1 == c13391lr.f44800x1 && C14064he.m66718x1(this.f44797kk, c13391lr.f44797kk) && this.f44799to == c13391lr.f44799to && this.f44792du == c13391lr.f44792du && this.f44794h4 == c13391lr.f44794h4 && C14064he.m66718x1(this.f44798m9, c13391lr.f44798m9) && C14064he.m66718x1(this.f44793dy, c13391lr.f44793dy) && C14067j2.m66728k4(this.f44790c5, c13391lr.f44790c5) && C14067j2.m66728k4(this.f44795jd, c13391lr.f44795jd) && C14067j2.m66728k4(this.f44791ck, c13391lr.f44791ck);
    }
}
