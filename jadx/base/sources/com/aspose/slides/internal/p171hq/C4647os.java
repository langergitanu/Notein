package com.aspose.slides.internal.p171hq;

import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.p396sc.C10172b3;
import com.aspose.slides.internal.p396sc.C10175c5;
import com.aspose.slides.internal.p396sc.C10201u4;
import com.aspose.slides.internal.p396sc.C10204uz;
import com.aspose.slides.internal.p396sc.C10206wl;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.hq.os */
/* JADX INFO: loaded from: classes.dex */
public class C4647os extends AbstractC4626gf {

    /* JADX INFO: renamed from: c5 */
    private C4670wy f12972c5;

    /* JADX INFO: renamed from: ck */
    private C4668wl f12973ck;

    /* JADX INFO: renamed from: du */
    private float f12974du;

    /* JADX INFO: renamed from: dy */
    private float f12975dy;

    /* JADX INFO: renamed from: fa */
    private C4610b3 f12976fa;

    /* JADX INFO: renamed from: h4 */
    private int f12977h4;

    /* JADX INFO: renamed from: jd */
    private int f12978jd;

    /* JADX INFO: renamed from: k4 */
    private C4680yo f12979k4;

    /* JADX INFO: renamed from: kk */
    private long f12980kk;

    /* JADX INFO: renamed from: m9 */
    private int f12981m9;

    /* JADX INFO: renamed from: to */
    private int f12982to;

    /* JADX INFO: renamed from: up */
    private C4661um f12983up;

    /* JADX INFO: renamed from: x1 */
    private long f12984x1;

    /* JADX INFO: renamed from: c5 */
    public final float m19279c5() {
        return this.f12975dy;
    }

    /* JADX INFO: renamed from: ck */
    public final int m19280ck() {
        return this.f12978jd;
    }

    /* JADX INFO: renamed from: du */
    public final float m19281du() {
        return this.f12974du;
    }

    /* JADX INFO: renamed from: dy */
    public final int m19282dy() {
        return this.f12981m9;
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
        return m19294k4((C4647os) obj);
    }

    /* JADX INFO: renamed from: fa */
    public final C4668wl m19283fa() {
        return this.f12973ck;
    }

    @Override // com.aspose.slides.internal.p171hq.AbstractC4623f9
    /* JADX INFO: renamed from: h4 */
    public int mo19017h4() {
        throw new NotSupportedException("Use overloaded methos with EmfPlusPenDataFlags param");
    }

    public int hashCode() {
        C4680yo c4680yo = this.f12979k4;
        int iHashCode = (((((((((((((((c4680yo != null ? c4680yo.hashCode() : 0) * 397) ^ ((int) this.f12984x1)) * 397) ^ ((int) this.f12980kk)) * 397) ^ this.f12982to) * 397) ^ C14064he.m66708k4(this.f12974du)) * 397) ^ this.f12977h4) * 397) ^ this.f12981m9) * 397) ^ C14064he.m66708k4(this.f12975dy)) * 397;
        C4670wy c4670wy = this.f12972c5;
        int iHashCode2 = (((iHashCode ^ (c4670wy != null ? c4670wy.hashCode() : 0)) * 397) ^ this.f12978jd) * 397;
        C4668wl c4668wl = this.f12973ck;
        int iHashCode3 = (iHashCode2 ^ (c4668wl != null ? c4668wl.hashCode() : 0)) * 397;
        C4610b3 c4610b3 = this.f12976fa;
        int iHashCode4 = (iHashCode3 ^ (c4610b3 != null ? c4610b3.hashCode() : 0)) * 397;
        C4661um c4661um = this.f12983up;
        return iHashCode4 ^ (c4661um != null ? c4661um.hashCode() : 0);
    }

    /* JADX INFO: renamed from: jd */
    public final C4670wy m19284jd() {
        return this.f12972c5;
    }

    /* JADX INFO: renamed from: k4 */
    public final C4680yo m19285k4() {
        return this.f12979k4;
    }

    /* JADX INFO: renamed from: kk */
    public final int m19295kk(long j) {
        int iMo19017h4 = ((1 & j) <= 0 || this.f12979k4 == null) ? 0 : 24;
        if ((2 & j) > 0) {
            iMo19017h4 += 4;
        }
        if ((4 & j) > 0) {
            iMo19017h4 += 4;
        }
        if ((8 & j) > 0) {
            iMo19017h4 += 4;
        }
        if ((16 & j) > 0) {
            iMo19017h4 += 4;
        }
        if ((32 & j) > 0) {
            iMo19017h4 += 4;
        }
        if ((64 & j) > 0) {
            iMo19017h4 += 4;
        }
        if ((128 & j) > 0) {
            iMo19017h4 += 4;
        }
        if ((j & 512) > 0) {
            iMo19017h4 += 4;
        }
        if (m19284jd() != null) {
            iMo19017h4 += m19284jd().mo19017h4();
        }
        if (m19283fa() != null) {
            iMo19017h4 += m19283fa().mo19017h4();
        }
        if (m19301up() != null) {
            iMo19017h4 += m19301up().mo19017h4();
        }
        return m19306yj() != null ? m19306yj().mo19017h4() + iMo19017h4 : iMo19017h4;
    }

    /* JADX INFO: renamed from: m9 */
    public final int m19298m9() {
        return this.f12977h4;
    }

    /* JADX INFO: renamed from: to */
    public final int m19299to() {
        return this.f12982to;
    }

    public String toString() {
        return C14113y2.m67402k4("TransformMatrix: {0}, StartCap: {1}, EndCap: {2}, Join: {3}, MiterLimit: {4}, LineStyle: {5}, DashedLineCapType: {6}, DashOffset: {7}, DashedLineData: {8}, PenAlignment: {9}, CompoundLineData: {10}, CustomStartCapData: {11}, CustomEndCapData: {12}", this.f12979k4, C14042ak.m66410k4(C10201u4.class, this.f12984x1), C14042ak.m66410k4(C10201u4.class, this.f12980kk), C14042ak.m66410k4(C10204uz.class, this.f12982to), Float.valueOf(this.f12974du), C14042ak.m66410k4(C10206wl.class, this.f12977h4), C14042ak.m66410k4(C10175c5.class, this.f12981m9), Float.valueOf(this.f12975dy), this.f12972c5, C14042ak.m66410k4(C10172b3.class, this.f12978jd), this.f12973ck, this.f12976fa, this.f12983up);
    }

    /* JADX INFO: renamed from: up */
    public final C4610b3 m19301up() {
        return this.f12976fa;
    }

    /* JADX INFO: renamed from: x1 */
    public final long m19302x1() {
        return this.f12984x1;
    }

    /* JADX INFO: renamed from: yj */
    public final C4661um m19306yj() {
        return this.f12983up;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19286k4(float f) {
        this.f12974du = f;
    }

    /* JADX INFO: renamed from: kk */
    public final long m19296kk() {
        return this.f12980kk;
    }

    /* JADX INFO: renamed from: to */
    public final void m19300to(int i) {
        this.f12978jd = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m19303x1(float f) {
        this.f12975dy = f;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19287k4(int i) {
        this.f12982to = i;
    }

    /* JADX INFO: renamed from: kk */
    public final void m19297kk(int i) {
        this.f12981m9 = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m19304x1(int i) {
        this.f12977h4 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19288k4(long j) {
        this.f12984x1 = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m19305x1(long j) {
        this.f12980kk = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19289k4(C4610b3 c4610b3) {
        this.f12976fa = c4610b3;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19290k4(C4661um c4661um) {
        this.f12983up = c4661um;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19291k4(C4668wl c4668wl) {
        this.f12973ck = c4668wl;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19292k4(C4670wy c4670wy) {
        this.f12972c5 = c4670wy;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19293k4(C4680yo c4680yo) {
        this.f12979k4 = c4680yo;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m19294k4(C4647os c4647os) {
        return C14067j2.m66728k4(this.f12979k4, c4647os.f12979k4) && this.f12984x1 == c4647os.f12984x1 && this.f12980kk == c4647os.f12980kk && this.f12982to == c4647os.f12982to && C14064he.m66718x1(this.f12974du, c4647os.f12974du) && this.f12977h4 == c4647os.f12977h4 && this.f12981m9 == c4647os.f12981m9 && C14064he.m66718x1(this.f12975dy, c4647os.f12975dy) && C14067j2.m66728k4(this.f12972c5, c4647os.f12972c5) && this.f12978jd == c4647os.f12978jd && C14067j2.m66728k4(this.f12973ck, c4647os.f12973ck) && C14067j2.m66728k4(this.f12976fa, c4647os.f12976fa) && C14067j2.m66728k4(this.f12983up, c4647os.f12983up);
    }
}
