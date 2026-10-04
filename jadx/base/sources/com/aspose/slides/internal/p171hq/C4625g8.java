package com.aspose.slides.internal.p171hq;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p129fe.C3976c5;
import com.aspose.slides.internal.p396sc.C10171ar;
import com.aspose.slides.internal.p396sc.C10189kp;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.hq.g8 */
/* JADX INFO: loaded from: classes.dex */
public class C4625g8 extends AbstractC4615c6 {

    /* JADX INFO: renamed from: du */
    private int f12892du;

    /* JADX INFO: renamed from: k4 */
    private int f12893k4;

    /* JADX INFO: renamed from: kk */
    private C4637k4 f12894kk;

    /* JADX INFO: renamed from: to */
    private int f12895to;

    /* JADX INFO: renamed from: x1 */
    private long f12896x1;

    /* JADX INFO: renamed from: du */
    public final int m19094du() {
        return this.f12892du;
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
        return m19099k4((C4625g8) obj);
    }

    @Override // com.aspose.slides.internal.p171hq.AbstractC4623f9
    /* JADX INFO: renamed from: h4 */
    public int mo19017h4() {
        return 24;
    }

    @Override // com.aspose.slides.internal.p171hq.AbstractC4615c6
    public int hashCode() {
        int iHashCode = ((((super.hashCode() * 397) ^ this.f12893k4) * 397) ^ ((int) this.f12896x1)) * 397;
        C4637k4 c4637k4 = this.f12894kk;
        return ((((iHashCode ^ (c4637k4 != null ? c4637k4.hashCode() : 0)) * 397) ^ this.f12895to) * 397) ^ this.f12892du;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m19095k4() {
        return this.f12893k4;
    }

    /* JADX INFO: renamed from: kk */
    public final C4637k4 m19100kk() {
        return this.f12894kk;
    }

    /* JADX INFO: renamed from: m9 */
    public final C3976c5 m19102m9() {
        C3976c5 c3976c5 = new C3976c5();
        c3976c5.m15664k4((int) m19104x1(), m19100kk().m19174du().Clone());
        return c3976c5;
    }

    /* JADX INFO: renamed from: to */
    public final int m19103to() {
        return this.f12895to;
    }

    @Override // com.aspose.slides.internal.p171hq.AbstractC4615c6
    public String toString() {
        return C14113y2.m67402k4("{0}, WrapMode: {1}, ClampColor: {2}, ObjectClamp: {3}", super.toString(), C14042ak.m66410k4(C10189kp.class, this.f12896x1), this.f12894kk, C14042ak.m66410k4(C10171ar.class, this.f12895to));
    }

    /* JADX INFO: renamed from: x1 */
    public final long m19104x1() {
        return this.f12896x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19096k4(int i) {
        this.f12893k4 = i;
    }

    /* JADX INFO: renamed from: kk */
    public final void m19101kk(int i) {
        if (i != 0) {
            throw new ArgumentOutOfRangeException("value");
        }
        this.f12892du = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m19105x1(int i) {
        this.f12895to = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19097k4(long j) {
        this.f12896x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19098k4(C4637k4 c4637k4) {
        this.f12894kk = c4637k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m19099k4(C4625g8 c4625g8) {
        return m19055k4((AbstractC4615c6) c4625g8) && this.f12893k4 == c4625g8.f12893k4 && this.f12896x1 == c4625g8.f12896x1 && C14067j2.m66728k4(this.f12894kk, c4625g8.f12894kk) && this.f12895to == c4625g8.f12895to && this.f12892du == c4625g8.f12892du;
    }
}
