package com.aspose.slides.internal.p171hq;

import com.aspose.slides.internal.p396sc.C10192m9;
import com.aspose.slides.internal.p396sc.C10201u4;
import com.aspose.slides.internal.p396sc.C10204uz;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.hq.lr */
/* JADX INFO: loaded from: classes.dex */
public class C4641lr extends C4609ar {

    /* JADX INFO: renamed from: c5 */
    private C4681zj f12937c5;

    /* JADX INFO: renamed from: ck */
    private C4678yd f12938ck;

    /* JADX INFO: renamed from: du */
    private long f12939du;

    /* JADX INFO: renamed from: dy */
    private float f12940dy;

    /* JADX INFO: renamed from: h4 */
    private int f12941h4;

    /* JADX INFO: renamed from: jd */
    private C4681zj f12942jd;

    /* JADX INFO: renamed from: k4 */
    private long f12943k4;

    /* JADX INFO: renamed from: kk */
    private float f12944kk;

    /* JADX INFO: renamed from: m9 */
    private float f12945m9;

    /* JADX INFO: renamed from: to */
    private long f12946to;

    /* JADX INFO: renamed from: x1 */
    private long f12947x1;

    /* JADX INFO: renamed from: c5 */
    public final float m19203c5() {
        return this.f12940dy;
    }

    /* JADX INFO: renamed from: ck */
    public final C4681zj m19204ck() {
        return this.f12942jd;
    }

    /* JADX INFO: renamed from: du */
    public final long m19205du() {
        return this.f12939du;
    }

    /* JADX INFO: renamed from: dy */
    public final float m19206dy() {
        return this.f12945m9;
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
        return m19215k4((C4641lr) obj);
    }

    /* JADX INFO: renamed from: fa */
    public final C4678yd m19207fa() {
        return this.f12938ck;
    }

    @Override // com.aspose.slides.internal.p171hq.C4609ar, com.aspose.slides.internal.p171hq.AbstractC4623f9
    /* JADX INFO: renamed from: h4 */
    public int mo19017h4() {
        C4678yd c4678yd = this.f12938ck;
        if (c4678yd != null) {
            return c4678yd.mo19017h4() + 48;
        }
        return 48;
    }

    public int hashCode() {
        int iM66708k4 = ((((((((((((((((int) this.f12943k4) * 397) ^ ((int) this.f12947x1)) * 397) ^ C14064he.m66708k4(this.f12944kk)) * 397) ^ ((int) this.f12946to)) * 397) ^ ((int) this.f12939du)) * 397) ^ this.f12941h4) * 397) ^ C14064he.m66708k4(this.f12945m9)) * 397) ^ C14064he.m66708k4(this.f12940dy)) * 397;
        C4681zj c4681zj = this.f12937c5;
        int iHashCode = (iM66708k4 ^ (c4681zj != null ? c4681zj.hashCode() : 0)) * 397;
        C4681zj c4681zj2 = this.f12942jd;
        int iHashCode2 = (iHashCode ^ (c4681zj2 != null ? c4681zj2.hashCode() : 0)) * 397;
        C4678yd c4678yd = this.f12938ck;
        return iHashCode2 ^ (c4678yd != null ? c4678yd.hashCode() : 0);
    }

    /* JADX INFO: renamed from: jd */
    public final C4681zj m19208jd() {
        return this.f12937c5;
    }

    /* JADX INFO: renamed from: k4 */
    public final long m19209k4() {
        return this.f12943k4;
    }

    /* JADX INFO: renamed from: kk */
    public final float m19216kk() {
        return this.f12944kk;
    }

    /* JADX INFO: renamed from: m9 */
    public final int m19219m9() {
        return this.f12941h4;
    }

    /* JADX INFO: renamed from: to */
    public final long m19220to() {
        return this.f12946to;
    }

    public String toString() {
        return C14113y2.m67402k4("[CustomLineCapDataFlags: {0}, BaseCap: {1}, BaseInset: {2}, StrokeStartCap: {3}, StrokeEndCap: {4}, StrokeJoin: {5}, StrokeMiterLimit: {6}, WidthScale: {7}, FillHotSpot: {8}, StrokeHotSpot: {9}, OptionalData: {10}]", C14042ak.m66410k4(C10192m9.class, this.f12943k4), C14042ak.m66410k4(C10201u4.class, this.f12947x1), Float.valueOf(this.f12944kk), Long.valueOf(this.f12946to), Long.valueOf(this.f12939du), C14042ak.m66410k4(C10204uz.class, this.f12941h4), Float.valueOf(this.f12945m9), Float.valueOf(this.f12940dy), this.f12937c5, this.f12942jd, this.f12938ck);
    }

    /* JADX INFO: renamed from: x1 */
    public final long m19222x1() {
        return this.f12947x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19210k4(float f) {
        this.f12944kk = f;
    }

    /* JADX INFO: renamed from: kk */
    public final void m19217kk(float f) {
        this.f12940dy = f;
    }

    /* JADX INFO: renamed from: to */
    public final void m19221to(long j) {
        this.f12939du = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m19223x1(float f) {
        this.f12945m9 = f;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19211k4(int i) {
        this.f12941h4 = i;
    }

    /* JADX INFO: renamed from: kk */
    public final void m19218kk(long j) {
        this.f12946to = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m19224x1(long j) {
        this.f12947x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19212k4(long j) {
        this.f12943k4 = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m19225x1(C4681zj c4681zj) {
        this.f12942jd = c4681zj;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19213k4(C4678yd c4678yd) {
        this.f12938ck = c4678yd;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19214k4(C4681zj c4681zj) {
        this.f12937c5 = c4681zj;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m19215k4(C4641lr c4641lr) {
        return this.f12943k4 == c4641lr.f12943k4 && this.f12947x1 == c4641lr.f12947x1 && C14064he.m66718x1(this.f12944kk, c4641lr.f12944kk) && this.f12946to == c4641lr.f12946to && this.f12939du == c4641lr.f12939du && this.f12941h4 == c4641lr.f12941h4 && C14064he.m66718x1(this.f12945m9, c4641lr.f12945m9) && C14064he.m66718x1(this.f12940dy, c4641lr.f12940dy) && C14067j2.m66728k4(this.f12937c5, c4641lr.f12937c5) && C14067j2.m66728k4(this.f12942jd, c4641lr.f12942jd) && C14067j2.m66728k4(this.f12938ck, c4641lr.f12938ck);
    }
}
