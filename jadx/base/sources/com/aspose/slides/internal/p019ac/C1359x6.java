package com.aspose.slides.internal.p019ac;

import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p075d5.C3022m9;
import com.aspose.slides.internal.p100e4.C3568kk;
import com.aspose.slides.internal.p143g4.C4201h4;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p360qg.C9865fa;
import com.aspose.slides.internal.p472w8.C11900jd;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.AbstractC12024x1;
import com.aspose.slides.internal.p475wh.C11999ar;
import com.aspose.slides.internal.p475wh.C12026yj;
import com.aspose.slides.internal.p498xe.C12502c5;
import com.aspose.slides.internal.p498xe.C12505dy;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ac.x6 */
/* JADX INFO: loaded from: classes3.dex */
public class C1359x6 extends AbstractC1345k4 implements Cloneable {

    /* JADX INFO: renamed from: du */
    private long f5904du;

    /* JADX INFO: renamed from: dy */
    private C12502c5 f5905dy;

    /* JADX INFO: renamed from: h4 */
    private long f5906h4;

    /* JADX INFO: renamed from: k4 */
    private long f5907k4;

    /* JADX INFO: renamed from: kk */
    private int f5908kk;

    /* JADX INFO: renamed from: m9 */
    private long[] f5909m9;

    /* JADX INFO: renamed from: to */
    private C12505dy f5910to;

    /* JADX INFO: renamed from: x1 */
    private long f5911x1;

    /* JADX INFO: renamed from: c5 */
    public final long[] m8036c5() {
        return this.f5909m9;
    }

    /* JADX INFO: renamed from: dy */
    public final long m8037dy() {
        return this.f5906h4;
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
        return m8046k4((C1359x6) obj);
    }

    /* JADX INFO: renamed from: h4 */
    public C12505dy m8038h4() {
        return this.f5910to;
    }

    public int hashCode() {
        int i = ((((((int) this.f5907k4) * 397) ^ ((int) this.f5911x1)) * 397) ^ (this.f5908kk & 65535)) * 397;
        C12505dy c12505dy = this.f5910to;
        int iHashCode = (((((i ^ (c12505dy != null ? c12505dy.hashCode() : 0)) * 397) ^ ((int) this.f5904du)) * 397) ^ ((int) this.f5906h4)) * 397;
        long[] jArr = this.f5909m9;
        return ((iHashCode ^ (jArr != null ? AbstractC14092to.m67208k4(jArr).hashCode() : 0)) * 397) ^ (m8039jd() != null ? m8039jd().hashCode() : 0);
    }

    /* JADX INFO: renamed from: jd */
    public final C12502c5 m8039jd() {
        return this.f5905dy;
    }

    /* JADX INFO: renamed from: k4 */
    public long m8040k4() {
        return this.f5907k4;
    }

    /* JADX INFO: renamed from: kk */
    public int m8047kk() {
        return (int) m8052x1();
    }

    /* JADX INFO: renamed from: m9 */
    public final long m8049m9() {
        return this.f5904du;
    }

    /* JADX INFO: renamed from: to */
    public final int m8050to() {
        return this.f5908kk;
    }

    public String toString() {
        return C14113y2.m67402k4("PenStyle: {0}, Width: {1}, ActualWidth: {2}, BrushStyle: {3}, ColorRef: {4}, BrushHatch: {5}, NumStyleEntities: {6}, BrushDibPattern: {7}", C14042ak.m66410k4(C9865fa.class, m8040k4()), Long.valueOf(m8052x1()), Integer.valueOf(m8047kk()), C14042ak.m66410k4(C3568kk.class, m8050to()), m8038h4(), Long.valueOf(m8049m9()), Long.valueOf(m8037dy()), m8039jd());
    }

    /* JADX INFO: renamed from: x1 */
    public final long m8052x1() {
        return this.f5911x1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0187  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C12026yj m8041k4(C4201h4 c4201h4) {
        float f;
        if (m8040k4() == 5) {
            return null;
        }
        AbstractC12024x1 c11999ar = new C11999ar(m8038h4().m58099k4().Clone());
        int iM8050to = m8050to();
        if (iM8050to == 1) {
            return null;
        }
        if (iM8050to == 2) {
            switch ((int) m8049m9()) {
                case 1:
                    c11999ar = new C11900jd(1, m8038h4().m58099k4().Clone());
                    break;
                case 2:
                    c11999ar = new C11900jd(2, m8038h4().m58099k4().Clone());
                    break;
                case 3:
                    c11999ar = new C11900jd(3, m8038h4().m58099k4().Clone());
                    break;
                case 4:
                    c11999ar = new C11900jd(4, m8038h4().m58099k4().Clone());
                    break;
                case 5:
                    c11999ar = new C11900jd(5, m8038h4().m58099k4().Clone());
                    break;
                case 6:
                    c11999ar = new C11999ar(m8038h4().m58099k4().Clone());
                    break;
                case 7:
                    C6005k4.m24263kk("EmfHatchStyle.HS_DITHEREDCLR");
                    c11999ar = new C11999ar(m8038h4().m58099k4().Clone());
                    break;
                case 8:
                    c11999ar = new C11999ar(c4201h4.m16698ix().Clone());
                    break;
                case 9:
                    C6005k4.m24263kk("EmfHatchStyle.HS_DITHEREDTEXTCLR");
                    c11999ar = new C11999ar(c4201h4.m16698ix().Clone());
                    break;
                case 10:
                    c11999ar = new C11999ar(c4201h4.m16739ne().Clone());
                    break;
                case 11:
                    C6005k4.m24263kk("EmfHatchStyle.HS_DITHEREDTEXTCLR");
                    c11999ar = new C11999ar(c4201h4.m16739ne().Clone());
                    break;
                default:
                    c11999ar = new C11900jd(0, m8038h4().m58099k4().Clone());
                    break;
            }
        } else {
            if (iM8050to == 3) {
                throw new NotImplementedException();
            }
            if (iM8050to == 5) {
                throw new NotImplementedException();
            }
            if (iM8050to == 6) {
                throw new NotImplementedException();
            }
        }
        C12026yj c12026yj = new C12026yj(c11999ar);
        int iM8040k4 = (int) (((long) (((int) m8040k4()) & 983040)) & 4294967295L);
        if (iM8040k4 == 0) {
            C11913yj c11913yjM16760vj = c4201h4.m16760vj();
            c12026yj = new C12026yj(c11999ar, 2.0f / (c11913yjM16760vj.m55776k4()[0] + c11913yjM16760vj.m55776k4()[3]));
        } else if (iM8040k4 == 65536) {
            c12026yj = new C12026yj(c11999ar, m8052x1() & 4294967295L);
        }
        switch ((int) (((long) (((int) m8040k4()) & 15)) & 4294967295L)) {
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
                float[] fArr = new float[(int) m8037dy()];
                if ((((long) (((int) m8040k4()) & 983040)) & 4294967295L) == 65536) {
                    C11913yj c11913yjM16760vj2 = c4201h4.m16760vj();
                    f = ((c11913yjM16760vj2.m55776k4()[0] + c11913yjM16760vj2.m55776k4()[3]) / 2.0f) / 2.0f;
                } else {
                    f = 1.0f;
                }
                for (int i = 0; i < (m8037dy() & 4294967295L); i++) {
                    fArr[i] = (m8036c5()[i] & 4294967295L) * f;
                }
                c12026yj.m56939x1(fArr);
                break;
            case 8:
                if ((((long) (((int) m8040k4()) & 983040)) & 4294967295L) == 0) {
                }
                break;
        }
        int iM8040k42 = (int) (((long) (((int) m8040k4()) & 3840)) & 4294967295L);
        if (iM8040k42 == 0) {
            c12026yj.m56932to(2);
            c12026yj.m56909du(2);
            c12026yj.m56937x1(2);
        } else if (iM8040k42 == 256) {
            c12026yj.m56909du(1);
        } else if (iM8040k42 == 512) {
            c12026yj.m56909du(0);
        }
        int iM8040k43 = (int) (((long) (((int) m8040k4()) & 61440)) & 4294967295L);
        if (iM8040k43 == 0) {
            c12026yj.m56914h4(2);
        } else if (iM8040k43 == 4096) {
            c12026yj.m56914h4(1);
        } else if (iM8040k43 == 8192) {
            c12026yj.m56914h4(0);
        }
        c12026yj.m56936x1(c4201h4.m16677bv());
        return c12026yj;
    }

    /* JADX INFO: renamed from: kk */
    public final void m8048kk(long j) {
        this.f5904du = j;
    }

    /* JADX INFO: renamed from: to */
    public final void m8051to(long j) {
        this.f5906h4 = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m8053x1(long j) {
        this.f5911x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m8042k4(int i) {
        this.f5908kk = i;
    }

    /* JADX INFO: renamed from: k4 */
    public void m8043k4(long j) {
        this.f5907k4 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public void m8044k4(C12505dy c12505dy) {
        this.f5910to = c12505dy;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m8045k4(long[] jArr) {
        this.f5909m9 = jArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m8046k4(C1359x6 c1359x6) {
        return this.f5907k4 == c1359x6.f5907k4 && this.f5911x1 == c1359x6.f5911x1 && this.f5908kk == c1359x6.f5908kk && C14067j2.m66728k4(this.f5910to, c1359x6.f5910to) && this.f5904du == c1359x6.f5904du && this.f5906h4 == c1359x6.f5906h4 && C3022m9.m12722k4(this.f5909m9, c1359x6.f5909m9) && C14067j2.m66728k4(m8039jd(), c1359x6.m8039jd());
    }
}
