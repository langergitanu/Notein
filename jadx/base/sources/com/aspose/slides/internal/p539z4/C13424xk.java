package com.aspose.slides.internal.p539z4;

import com.aspose.slides.internal.p026an.C1475ck;
import com.aspose.slides.internal.p026an.C1495ss;
import com.aspose.slides.internal.p277mm.C6400x1;
import com.aspose.slides.internal.p475wh.C12013m9;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.z4.xk */
/* JADX INFO: loaded from: classes5.dex */
public class C13424xk extends AbstractC13365c6 {

    /* JADX INFO: renamed from: du */
    private long f44907du;

    /* JADX INFO: renamed from: h4 */
    private String f44908h4;

    /* JADX INFO: renamed from: k4 */
    private float f44909k4;

    /* JADX INFO: renamed from: kk */
    private int f44910kk;

    /* JADX INFO: renamed from: to */
    private long f44911to;

    /* JADX INFO: renamed from: x1 */
    private int f44912x1;

    /* JADX INFO: renamed from: du */
    public final float m62453du() {
        return this.f44909k4;
    }

    @Override // com.aspose.slides.internal.p539z4.AbstractC13365c6
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
        return m62459k4((C13424xk) obj);
    }

    @Override // com.aspose.slides.internal.p539z4.AbstractC13373f9
    /* JADX INFO: renamed from: h4 */
    public int mo62023h4() {
        return (int) ((((this.f44907du & 4294967295L) * 2) & 4294967295L) + 24);
    }

    @Override // com.aspose.slides.internal.p539z4.AbstractC13365c6
    public int hashCode() {
        int iM66708k4 = ((((((((C14064he.m66708k4(this.f44909k4) * 397) ^ this.f44912x1) * 397) ^ this.f44910kk) * 397) ^ ((int) this.f44911to)) * 397) ^ ((int) this.f44907du)) * 397;
        String str = this.f44908h4;
        return iM66708k4 ^ (str != null ? str.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final String m62454k4() {
        return this.f44908h4;
    }

    /* JADX INFO: renamed from: kk */
    public final int m62460kk() {
        return this.f44910kk;
    }

    /* JADX INFO: renamed from: m9 */
    public final C12013m9 m62461m9() {
        return C6400x1.m26263k4(m62454k4(), m62453du(), m62460kk(), m62462to());
    }

    /* JADX INFO: renamed from: to */
    public final int m62462to() {
        return this.f44912x1;
    }

    @Override // com.aspose.slides.internal.p539z4.AbstractC13365c6
    public String toString() {
        return C14113y2.m67402k4("{0}, EmSize: {1}, SizeUnit: {2}, FontStyleFlags: {3}, Reserved: {4}, Length: {5}, FamilyName: {6}", super.toString(), Float.valueOf(this.f44909k4), C14042ak.m66410k4(C1495ss.class, this.f44912x1), C14042ak.m66410k4(C1475ck.class, this.f44910kk), Long.valueOf(this.f44911to), Long.valueOf(this.f44907du), this.f44908h4);
    }

    /* JADX INFO: renamed from: x1 */
    public final long m62463x1() {
        return this.f44907du;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62455k4(float f) {
        this.f44909k4 = f;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m62464x1(int i) {
        this.f44912x1 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62456k4(int i) {
        this.f44910kk = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m62465x1(long j) {
        this.f44911to = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62457k4(long j) {
        this.f44907du = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62458k4(String str) {
        this.f44908h4 = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m62459k4(C13424xk c13424xk) {
        return C14064he.m66718x1(this.f44909k4, c13424xk.f44909k4) && this.f44912x1 == c13424xk.f44912x1 && this.f44910kk == c13424xk.f44910kk && this.f44911to == c13424xk.f44911to && this.f44907du == c13424xk.f44907du && C14113y2.m67363du(this.f44908h4, c13424xk.f44908h4);
    }
}
