package com.aspose.slides.internal.p260ly;

import com.aspose.slides.internal.p102e8.C3585h4;
import com.aspose.slides.internal.p124f7.C3866fa;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.C12026yj;
import com.aspose.slides.internal.p488x0.C12334dy;
import com.aspose.slides.internal.p488x0.C12343ne;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.ly.rv */
/* JADX INFO: loaded from: classes4.dex */
public class C6282rv extends AbstractC6276k4 implements Cloneable {

    /* JADX INFO: renamed from: k4 */
    private long f17846k4;

    /* JADX INFO: renamed from: kk */
    private C12334dy f17847kk;

    /* JADX INFO: renamed from: x1 */
    private C12343ne f17848x1;

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
        return m25617k4((C6282rv) obj);
    }

    public int hashCode() {
        int i = ((int) this.f17846k4) * 397;
        C12343ne c12343ne = this.f17848x1;
        int iHashCode = (i ^ (c12343ne != null ? c12343ne.hashCode() : 0)) * 397;
        C12334dy c12334dy = this.f17847kk;
        return iHashCode ^ (c12334dy != null ? c12334dy.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public long m25612k4() {
        return this.f17846k4;
    }

    /* JADX INFO: renamed from: kk */
    public int m25618kk() {
        return this.f17848x1.m57778k4();
    }

    /* JADX INFO: renamed from: to */
    public C12334dy m25619to() {
        return this.f17847kk;
    }

    public String toString() {
        return C14113y2.m67402k4("PenStyle: {0}, Width: {1}, ActualWidth: {2}, ColorRef: {3}", C14042ak.m66410k4(C3866fa.class, m25612k4()), m25620x1(), Integer.valueOf(m25618kk()), m25619to());
    }

    /* JADX INFO: renamed from: x1 */
    public final C12343ne m25620x1() {
        return this.f17848x1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0098  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C12026yj m25613k4(C3585h4 c3585h4) {
        if (m25612k4() == 5) {
            return null;
        }
        C12026yj c12026yj = new C12026yj(m25619to().m57666h4().Clone());
        int iM25612k4 = (int) (((long) (((int) m25612k4()) & 983040)) & 4294967295L);
        if (iM25612k4 != 0) {
            if (iM25612k4 == 65536) {
                c12026yj.m56926kk(m25620x1().m57778k4());
            }
        } else if (m25620x1().m57778k4() == 1) {
            C11913yj c11913yjM14561vj = c3585h4.m14561vj();
            c12026yj = new C12026yj(m25619to().m57666h4().Clone(), 2.0f / (C14116yg.m67480k4(c11913yjM14561vj.m55776k4()[3]) + C14116yg.m67480k4(c11913yjM14561vj.m55776k4()[0])));
        }
        switch ((int) (((long) (((int) m25612k4()) & 15)) & 4294967295L)) {
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
                if ((((long) (((int) m25612k4()) & 983040)) & 4294967295L) == 0) {
                }
                break;
        }
        int iM25612k42 = (int) (((long) (((int) m25612k4()) & 3840)) & 4294967295L);
        if (iM25612k42 == 0) {
            c12026yj.m56909du(2);
            c12026yj.m56932to(2);
        } else if (iM25612k42 == 256) {
            c12026yj.m56909du(1);
        } else if (iM25612k42 == 512) {
            c12026yj.m56909du(0);
        }
        int iM25612k43 = (int) (((long) (((int) m25612k4()) & 61440)) & 4294967295L);
        if (iM25612k43 == 0) {
            c12026yj.m56914h4(2);
        } else if (iM25612k43 == 4096) {
            c12026yj.m56914h4(1);
        } else if (iM25612k43 == 8192) {
            c12026yj.m56914h4(0);
        }
        c12026yj.m56936x1(c3585h4.m14477bv());
        return c12026yj;
    }

    /* JADX INFO: renamed from: k4 */
    public void m25614k4(long j) {
        this.f17846k4 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public void m25615k4(C12334dy c12334dy) {
        this.f17847kk = c12334dy;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m25616k4(C12343ne c12343ne) {
        this.f17848x1 = c12343ne;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m25617k4(C6282rv c6282rv) {
        return this.f17846k4 == c6282rv.f17846k4 && C14067j2.m66728k4(this.f17848x1, c6282rv.f17848x1) && C14067j2.m66728k4(this.f17847kk, c6282rv.f17847kk);
    }
}
