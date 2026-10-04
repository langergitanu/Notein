package com.aspose.slides.internal.p171hq;

import com.aspose.slides.internal.p396sc.C10177ck;
import com.aspose.slides.internal.p396sc.C10197ss;
import com.aspose.slides.internal.p427tt.C11113x1;
import com.aspose.slides.internal.p475wh.C12013m9;
import com.aspose.slides.internal.p475wh.C12022v4;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.hq.xk */
/* JADX INFO: loaded from: classes.dex */
public class C4674xk extends AbstractC4615c6 {

    /* JADX INFO: renamed from: du */
    private long f13054du;

    /* JADX INFO: renamed from: h4 */
    private String f13055h4;

    /* JADX INFO: renamed from: k4 */
    private float f13056k4;

    /* JADX INFO: renamed from: kk */
    private int f13057kk;

    /* JADX INFO: renamed from: to */
    private long f13058to;

    /* JADX INFO: renamed from: x1 */
    private int f13059x1;

    /* JADX INFO: renamed from: du */
    public final int m19470du() {
        return this.f13059x1;
    }

    /* JADX INFO: renamed from: dy */
    public final C12013m9 m19471dy() {
        try {
            return C11113x1.m53658k4(m19472k4(), m19479m9(), m19480to(), m19470du());
        } catch (Exception unused) {
            return C11113x1.m53662x1(C12022v4.m56852x1().m56651x1().m56527du(), m19479m9(), m19480to(), m19470du());
        }
    }

    @Override // com.aspose.slides.internal.p171hq.AbstractC4615c6
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
        return m19477k4((C4674xk) obj);
    }

    @Override // com.aspose.slides.internal.p171hq.AbstractC4623f9
    /* JADX INFO: renamed from: h4 */
    public int mo19017h4() {
        return (int) ((((this.f13054du & 4294967295L) * 2) & 4294967295L) + 24);
    }

    @Override // com.aspose.slides.internal.p171hq.AbstractC4615c6
    public int hashCode() {
        int iM66708k4 = ((((((((C14064he.m66708k4(this.f13056k4) * 397) ^ this.f13059x1) * 397) ^ this.f13057kk) * 397) ^ ((int) this.f13058to)) * 397) ^ ((int) this.f13054du)) * 397;
        String str = this.f13055h4;
        return iM66708k4 ^ (str != null ? str.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final String m19472k4() {
        return this.f13055h4;
    }

    /* JADX INFO: renamed from: kk */
    public final long m19478kk() {
        return this.f13058to;
    }

    /* JADX INFO: renamed from: m9 */
    public final float m19479m9() {
        return this.f13056k4;
    }

    /* JADX INFO: renamed from: to */
    public final int m19480to() {
        return this.f13057kk;
    }

    @Override // com.aspose.slides.internal.p171hq.AbstractC4615c6
    public String toString() {
        return C14113y2.m67402k4("{0}, EmSize: {1}, SizeUnit: {2}, FontStyleFlags: {3}, Reserved: {4}, Length: {5}, FamilyName: {6}", super.toString(), Float.valueOf(this.f13056k4), C14042ak.m66410k4(C10197ss.class, this.f13059x1), C14042ak.m66410k4(C10177ck.class, this.f13057kk), Long.valueOf(this.f13058to), Long.valueOf(this.f13054du), this.f13055h4);
    }

    /* JADX INFO: renamed from: x1 */
    public final long m19481x1() {
        return this.f13054du;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19473k4(float f) {
        this.f13056k4 = f;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m19482x1(int i) {
        this.f13059x1 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19474k4(int i) {
        this.f13057kk = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m19483x1(long j) {
        this.f13058to = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19475k4(long j) {
        this.f13054du = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19476k4(String str) {
        this.f13055h4 = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m19477k4(C4674xk c4674xk) {
        return C14064he.m66718x1(this.f13056k4, c4674xk.f13056k4) && this.f13059x1 == c4674xk.f13059x1 && this.f13057kk == c4674xk.f13057kk && this.f13058to == c4674xk.f13058to && this.f13054du == c4674xk.f13054du && C14113y2.m67363du(this.f13055h4, c4674xk.f13055h4);
    }
}
