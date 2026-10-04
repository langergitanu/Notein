package com.aspose.slides.internal.p019ac;

import com.aspose.slides.internal.p143g4.C4201h4;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p360qg.C9865fa;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.C12026yj;
import com.aspose.slides.internal.p498xe.C12505dy;
import com.aspose.slides.internal.p498xe.C12514ne;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ac.rv */
/* JADX INFO: loaded from: classes3.dex */
public class C1351rv extends AbstractC1345k4 implements Cloneable {

    /* JADX INFO: renamed from: k4 */
    private long f5862k4;

    /* JADX INFO: renamed from: kk */
    private C12505dy f5863kk;

    /* JADX INFO: renamed from: x1 */
    private C12514ne f5864x1;

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
        return m7970k4((C1351rv) obj);
    }

    public int hashCode() {
        int i = ((int) this.f5862k4) * 397;
        C12514ne c12514ne = this.f5864x1;
        int iHashCode = (i ^ (c12514ne != null ? c12514ne.hashCode() : 0)) * 397;
        C12505dy c12505dy = this.f5863kk;
        return iHashCode ^ (c12505dy != null ? c12505dy.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public long m7965k4() {
        return this.f5862k4;
    }

    /* JADX INFO: renamed from: kk */
    public int m7971kk() {
        return this.f5864x1.m58194k4();
    }

    /* JADX INFO: renamed from: to */
    public C12505dy m7972to() {
        return this.f5863kk;
    }

    public String toString() {
        return C14113y2.m67402k4("PenStyle: {0}, Width: {1}, ActualWidth: {2}, ColorRef: {3}", C14042ak.m66410k4(C9865fa.class, m7965k4()), m7973x1(), Integer.valueOf(m7971kk()), m7972to());
    }

    /* JADX INFO: renamed from: x1 */
    public final C12514ne m7973x1() {
        return this.f5864x1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b9  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C12026yj m7966k4(C4201h4 c4201h4) {
        if (m7965k4() == 5) {
            return null;
        }
        C12026yj c12026yj = new C12026yj(m7972to().m58099k4().Clone());
        int iM7965k4 = (int) (((long) (((int) m7965k4()) & 983040)) & 4294967295L);
        if (iM7965k4 != 0) {
            if (iM7965k4 == 65536) {
                c12026yj = new C12026yj(m7972to().m58099k4().Clone(), m7973x1().m58194k4());
            }
        } else if (m7973x1().m58194k4() == 1) {
            C11913yj c11913yjM16760vj = c4201h4.m16760vj();
            c12026yj = new C12026yj(m7972to().m58099k4().Clone(), 2.0f / (c11913yjM16760vj.m55776k4()[0] + c11913yjM16760vj.m55776k4()[3]));
        } else {
            c12026yj = new C12026yj(m7972to().m58099k4().Clone(), m7973x1().m58194k4());
        }
        switch ((int) (((long) (((int) m7965k4()) & 15)) & 4294967295L)) {
            case 0:
            case 6:
                c12026yj.m56927kk(0);
                break;
            case 1:
                c12026yj.m56927kk(1);
                break;
            case 2:
                c12026yj.m56927kk(2);
                break;
            case 3:
                c12026yj.m56927kk(3);
                break;
            case 4:
                c12026yj.m56927kk(4);
                break;
            case 7:
                C6005k4.m24263kk("Warning: EmfPenStyle.PS_USERSTYLE for EmfLogPen");
                c12026yj.m56927kk(0);
                break;
            case 8:
                if ((((long) (((int) m7965k4()) & 983040)) & 4294967295L) == 0) {
                }
                break;
        }
        int iM7965k42 = (int) (((long) (((int) m7965k4()) & 3840)) & 4294967295L);
        if (iM7965k42 == 0) {
            c12026yj.m56909du(2);
            c12026yj.m56932to(2);
        } else if (iM7965k42 == 256) {
            c12026yj.m56909du(1);
        } else if (iM7965k42 == 512) {
            c12026yj.m56909du(0);
        }
        int iM7965k43 = (int) (((long) (((int) m7965k4()) & 61440)) & 4294967295L);
        if (iM7965k43 == 0) {
            c12026yj.m56914h4(2);
        } else if (iM7965k43 == 4096) {
            c12026yj.m56914h4(1);
        } else if (iM7965k43 == 8192) {
            c12026yj.m56914h4(0);
        }
        c12026yj.m56936x1(c4201h4.m16677bv());
        return c12026yj;
    }

    /* JADX INFO: renamed from: k4 */
    public void m7967k4(long j) {
        this.f5862k4 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public void m7968k4(C12505dy c12505dy) {
        this.f5863kk = c12505dy;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m7969k4(C12514ne c12514ne) {
        this.f5864x1 = c12514ne;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m7970k4(C1351rv c1351rv) {
        return this.f5862k4 == c1351rv.f5862k4 && C14067j2.m66728k4(this.f5864x1, c1351rv.f5864x1) && C14067j2.m66728k4(this.f5863kk, c1351rv.f5863kk);
    }
}
