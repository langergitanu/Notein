package com.aspose.slides.internal.p260ly;

import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p102e8.C3585h4;
import com.aspose.slides.internal.p124f7.C3866fa;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p377r9.C9985kk;
import com.aspose.slides.internal.p472w8.C11900jd;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.AbstractC12024x1;
import com.aspose.slides.internal.p475wh.C11999ar;
import com.aspose.slides.internal.p475wh.C12026yj;
import com.aspose.slides.internal.p488x0.C12331c5;
import com.aspose.slides.internal.p488x0.C12334dy;
import com.aspose.slides.internal.p500xi.C12530dy;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.ly.x6 */
/* JADX INFO: loaded from: classes4.dex */
public class C6290x6 extends AbstractC6276k4 implements Cloneable {

    /* JADX INFO: renamed from: du */
    private long f17890du;

    /* JADX INFO: renamed from: dy */
    private C12331c5 f17891dy;

    /* JADX INFO: renamed from: h4 */
    private long f17892h4;

    /* JADX INFO: renamed from: k4 */
    private long f17893k4;

    /* JADX INFO: renamed from: kk */
    private int f17894kk;

    /* JADX INFO: renamed from: m9 */
    private long[] f17895m9;

    /* JADX INFO: renamed from: to */
    private C12334dy f17896to;

    /* JADX INFO: renamed from: x1 */
    private long f17897x1;

    /* JADX INFO: renamed from: c5 */
    public final long[] m25711c5() {
        return this.f17895m9;
    }

    /* JADX INFO: renamed from: dy */
    public final long m25712dy() {
        return this.f17892h4;
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
        return m25721k4((C6290x6) obj);
    }

    /* JADX INFO: renamed from: h4 */
    public C12334dy m25713h4() {
        return this.f17896to;
    }

    public int hashCode() {
        int i = ((((((int) this.f17893k4) * 397) ^ ((int) this.f17897x1)) * 397) ^ (this.f17894kk & 65535)) * 397;
        C12334dy c12334dy = this.f17896to;
        int iHashCode = (((((i ^ (c12334dy != null ? c12334dy.hashCode() : 0)) * 397) ^ ((int) this.f17890du)) * 397) ^ ((int) this.f17892h4)) * 397;
        long[] jArr = this.f17895m9;
        return ((iHashCode ^ (jArr != null ? AbstractC14092to.m67208k4(jArr).hashCode() : 0)) * 397) ^ (m25714jd() != null ? m25714jd().hashCode() : 0);
    }

    /* JADX INFO: renamed from: jd */
    public final C12331c5 m25714jd() {
        return this.f17891dy;
    }

    /* JADX INFO: renamed from: k4 */
    public long m25715k4() {
        return this.f17893k4;
    }

    /* JADX INFO: renamed from: kk */
    public int m25722kk() {
        return (int) m25727x1();
    }

    /* JADX INFO: renamed from: m9 */
    public final long m25724m9() {
        return this.f17890du;
    }

    /* JADX INFO: renamed from: to */
    public final int m25725to() {
        return this.f17894kk;
    }

    public String toString() {
        return C14113y2.m67402k4("PenStyle: {0}, Width: {1}, ActualWidth: {2}, BrushStyle: {3}, ColorRef: {4}, BrushHatch: {5}, NumStyleEntities: {6}, BrushDibPattern: {7}", C14042ak.m66410k4(C3866fa.class, m25715k4()), Long.valueOf(m25727x1()), Integer.valueOf(m25722kk()), C14042ak.m66410k4(C9985kk.class, m25725to()), m25713h4(), Long.valueOf(m25724m9()), Long.valueOf(m25712dy()), m25714jd());
    }

    /* JADX INFO: renamed from: x1 */
    public final long m25727x1() {
        return this.f17897x1;
    }

    /* JADX INFO: renamed from: k4 */
    private C11900jd m25710k4(int i, C3585h4 c3585h4) {
        return new C11900jd(i, m25713h4().m57666h4().Clone(), c3585h4.m14539ne().Clone());
    }

    /* JADX INFO: renamed from: kk */
    public final void m25723kk(long j) {
        this.f17890du = j;
    }

    /* JADX INFO: renamed from: to */
    public final void m25726to(long j) {
        this.f17892h4 = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m25728x1(long j) {
        this.f17897x1 = j;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0149  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C12026yj m25716k4(C3585h4 c3585h4) {
        int i;
        float f;
        C12026yj c12026yj;
        float fM67480k4;
        if (m25715k4() == 5) {
            return null;
        }
        AbstractC12024x1 c11999ar = new C11999ar(m25713h4().m57666h4().Clone());
        int iM25725to = m25725to();
        if (iM25725to == 1) {
            return null;
        }
        if (iM25725to == 2) {
            switch ((int) m25724m9()) {
                case 1:
                    c11999ar = m25710k4(1, c3585h4);
                    break;
                case 2:
                    c11999ar = m25710k4(2, c3585h4);
                    break;
                case 3:
                    c11999ar = m25710k4(3, c3585h4);
                    break;
                case 4:
                    c11999ar = m25710k4(4, c3585h4);
                    break;
                case 5:
                    c11999ar = m25710k4(5, c3585h4);
                    break;
                case 6:
                    c11999ar = new C11999ar(m25713h4().m57666h4().Clone());
                    break;
                case 7:
                    C6005k4.m24263kk("EmfHatchStyle.HS_DITHEREDCLR");
                    c11999ar = new C11999ar(m25713h4().m57666h4().Clone());
                    break;
                case 8:
                    c11999ar = new C11999ar(c3585h4.m14498ix().Clone());
                    break;
                case 9:
                    C6005k4.m24263kk("EmfHatchStyle.HS_DITHEREDTEXTCLR");
                    c11999ar = new C11999ar(c3585h4.m14498ix().Clone());
                    break;
                case 10:
                    c11999ar = new C11999ar(c3585h4.m14539ne().Clone());
                    break;
                case 11:
                    C6005k4.m24263kk("EmfHatchStyle.HS_DITHEREDTEXTCLR");
                    c11999ar = new C11999ar(c3585h4.m14539ne().Clone());
                    break;
                default:
                    c11999ar = m25710k4(0, c3585h4);
                    break;
            }
        } else {
            if (iM25725to == 3) {
                throw new NotImplementedException();
            }
            if (iM25725to == 5) {
                throw new NotImplementedException();
            }
            if (iM25725to == 6) {
                throw new NotImplementedException();
            }
        }
        int iM25715k4 = (int) (((long) (((int) m25715k4()) & 983040)) & 4294967295L);
        if (iM25715k4 == 0) {
            i = 983040;
            f = 2.0f;
            C11913yj c11913yjM14561vj = c3585h4.m14561vj();
            c12026yj = new C12026yj(c11999ar, 2.0f / (C14116yg.m67480k4(c11913yjM14561vj.m55776k4()[3]) + C14116yg.m67480k4(c11913yjM14561vj.m55776k4()[0])));
        } else if (iM25715k4 != 65536) {
            c12026yj = new C12026yj(c11999ar);
            i = 983040;
            f = 2.0f;
        } else {
            i = 983040;
            f = 2.0f;
            c12026yj = new C12026yj(c11999ar, m25727x1() & 4294967295L);
        }
        switch ((int) (((long) (((int) m25715k4()) & 15)) & 4294967295L)) {
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
                c12026yj.m56927kk(5);
                float[] fArr = new float[(int) m25712dy()];
                if ((((long) (((int) m25715k4()) & i)) & 4294967295L) == 65536) {
                    C11913yj c11913yjM14561vj2 = c3585h4.m14561vj();
                    fM67480k4 = ((C14116yg.m67480k4(c11913yjM14561vj2.m55776k4()[3]) + C14116yg.m67480k4(c11913yjM14561vj2.m55776k4()[0])) / f) / f;
                } else {
                    fM67480k4 = 1.0f;
                }
                for (int i2 = 0; i2 < (m25712dy() & 4294967295L); i2++) {
                    fArr[i2] = (m25711c5()[i2] & 4294967295L) * fM67480k4;
                }
                c12026yj.m56939x1(fArr);
                break;
            case 8:
                if ((((long) (((int) m25715k4()) & i)) & 4294967295L) == 0) {
                }
                break;
        }
        int iM25715k42 = (int) (((long) (((int) m25715k4()) & 3840)) & 4294967295L);
        if (iM25715k42 == 0) {
            c12026yj.m56932to(2);
            c12026yj.m56909du(2);
            c12026yj.m56937x1(2);
        } else if (iM25715k42 == 256) {
            c12026yj.m56909du(1);
        } else if (iM25715k42 == 512) {
            c12026yj.m56909du(0);
        }
        int iM25715k43 = (int) (((long) (((int) m25715k4()) & 61440)) & 4294967295L);
        if (iM25715k43 == 0) {
            c12026yj.m56914h4(2);
        } else if (iM25715k43 == 4096) {
            c12026yj.m56914h4(1);
        } else if (iM25715k43 == 8192) {
            c12026yj.m56914h4(0);
        }
        c12026yj.m56936x1(c3585h4.m14477bv());
        return c12026yj;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m25717k4(int i) {
        this.f17894kk = i;
    }

    /* JADX INFO: renamed from: k4 */
    public void m25718k4(long j) {
        this.f17893k4 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public void m25719k4(C12334dy c12334dy) {
        this.f17896to = c12334dy;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m25720k4(long[] jArr) {
        this.f17895m9 = jArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m25721k4(C6290x6 c6290x6) {
        return this.f17893k4 == c6290x6.f17893k4 && this.f17897x1 == c6290x6.f17897x1 && this.f17894kk == c6290x6.f17894kk && C14067j2.m66728k4(this.f17896to, c6290x6.f17896to) && this.f17890du == c6290x6.f17890du && this.f17892h4 == c6290x6.f17892h4 && C12530dy.m58333k4(this.f17895m9, c6290x6.f17895m9) && C14067j2.m66728k4(m25714jd(), c6290x6.m25714jd());
    }
}
