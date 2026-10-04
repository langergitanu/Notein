package com.aspose.slides.internal.p171hq;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p396sc.C10188kk;
import com.aspose.slides.internal.p472w8.C11900jd;
import com.aspose.slides.internal.p472w8.C11902kk;
import com.aspose.slides.internal.p472w8.C11906rv;
import com.aspose.slides.internal.p472w8.C11909up;
import com.aspose.slides.internal.p472w8.C11911x1;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.AbstractC12024x1;
import com.aspose.slides.internal.p475wh.C11999ar;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12012lr;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.hq.rv */
/* JADX INFO: loaded from: classes.dex */
public final class C4652rv extends AbstractC4615c6 {

    /* JADX INFO: renamed from: k4 */
    private AbstractC4638kk f12995k4;

    /* JADX INFO: renamed from: x1 */
    private long f12996x1;

    @Override // com.aspose.slides.internal.p171hq.AbstractC4615c6
    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        return C7019kk.m27469x1(obj, C4652rv.class) && m19329k4((C4652rv) obj);
    }

    @Override // com.aspose.slides.internal.p171hq.AbstractC4623f9
    /* JADX INFO: renamed from: h4 */
    public int mo19017h4() {
        return this.f12995k4.mo19017h4() + 8;
    }

    @Override // com.aspose.slides.internal.p171hq.AbstractC4615c6
    public int hashCode() {
        AbstractC4638kk abstractC4638kk = this.f12995k4;
        return ((abstractC4638kk != null ? abstractC4638kk.hashCode() : 0) * 397) ^ ((int) this.f12996x1);
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC4638kk m19330k4() {
        return this.f12995k4;
    }

    /* JADX INFO: renamed from: kk */
    public final AbstractC12024x1 m19333kk() {
        C11906rv c11906rv;
        int iM19334x1 = (int) m19334x1();
        if (iM19334x1 == 0) {
            return new C11999ar(((C4634j5) m19330k4()).m19163k4().m19174du().Clone());
        }
        if (iM19334x1 == 1) {
            C4621e0 c4621e0 = (C4621e0) m19330k4();
            return new C11900jd((int) c4621e0.m19085kk(), c4621e0.m19086x1().m19174du().Clone(), c4621e0.m19082k4().m19174du().Clone());
        }
        if (iM19334x1 == 2) {
            C4631ig c4631ig = (C4631ig) m19330k4();
            int iM19145x1 = (int) c4631ig.m19145x1();
            C11913yj c11913yj = new C11913yj();
            if (c4631ig.m19144kk() == null) {
                throw new ArgumentException("Bitmap data is missed");
            }
            C4628gk c4628gkM19144kk = c4631ig.m19144kk();
            if ((c4631ig.m19141k4() & 2) > 0) {
                if (c4628gkM19144kk.m19113k4() == null) {
                    throw new ArgumentException("Transformation info is missed");
                }
                c11913yj = c4628gkM19144kk.m19113k4().m19523dy();
            }
            C12012lr c12012lr = new C12012lr(c4628gkM19144kk.m19116x1().m19308k4().mo19122k4(), iM19145x1);
            c12012lr.m56623kk(c11913yj);
            return c12012lr;
        }
        int i = 0;
        if (iM19334x1 != 3) {
            if (iM19334x1 != 4) {
                throw new ArgumentException("unknown brush type");
            }
            C4639kp c4639kp = (C4639kp) m19330k4();
            C12007ix c12007ixClone = c4639kp.m19195to().mo19058k4().Clone();
            C12025x6 c12025x6Clone = c12007ixClone.m56552du().Clone();
            C11909up c11909up = new C11909up(c12025x6Clone.Clone(), new C12025x6(c12007ixClone.m56550c5() + c12025x6Clone.m56897x1(), c12007ixClone.m56575x1() + c12025x6Clone.m56895kk()).Clone(), c4639kp.m19186dy().m19174du().Clone(), c4639kp.m19196x1().m19174du().Clone());
            c11909up.m55725k4((int) c4639kp.m19184c5());
            if ((c4639kp.m19187k4() & 128) > 0) {
                c11909up.m55738x1(true);
            }
            c11909up.m55730kk((c4639kp.m19187k4() & 2) > 0 ? c4639kp.m19193kk().m19108k4().m19523dy() : new C11913yj());
            if ((c4639kp.m19187k4() & 8) > 0) {
                C4620dy[] c4620dyArrM19111x1 = c4639kp.m19193kk().m19111x1();
                int i2 = 0;
                while (true) {
                    if (i2 >= c4620dyArrM19111x1.length) {
                        break;
                    }
                    C4620dy c4620dy = c4620dyArrM19111x1[i2];
                    if (c4620dy != null) {
                        C4635jd c4635jd = (C4635jd) c4620dy;
                        C11911x1 c11911x1 = new C11911x1((int) c4635jd.m19080x1());
                        float[] fArr = new float[(int) c4635jd.m19080x1()];
                        float[] fArr2 = new float[(int) c4635jd.m19080x1()];
                        for (int i3 = 0; i3 < (c4635jd.m19080x1() & 4294967295L); i3++) {
                            fArr[i3] = c4635jd.m19166kk()[i3];
                            fArr2[i3] = c4635jd.m19079k4()[i3];
                        }
                        c11911x1.m55742k4(fArr);
                        c11911x1.m55746x1(fArr2);
                        c11909up.m55727k4(c11911x1);
                    } else {
                        i2++;
                    }
                }
            }
            if ((c4639kp.m19187k4() & 4) > 0) {
                C4614c5 c4614c5 = (C4614c5) c4639kp.m19193kk().m19111x1()[0];
                C11902kk c11902kk = new C11902kk((int) c4614c5.m19080x1());
                C12003du[] c12003duArr = (C12003du[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) C12003du.class), (int) c4614c5.m19080x1()));
                float[] fArr3 = new float[(int) c4614c5.m19080x1()];
                while (i < (c4614c5.m19080x1() & 4294967295L)) {
                    c4614c5.m19052kk()[i].m19174du().CloneTo(c12003duArr[i]);
                    fArr3[i] = c4614c5.m19079k4()[i];
                    i++;
                }
                c11902kk.m55667k4(c12003duArr);
                c11902kk.m55666k4(fArr3);
                c11909up.m55726k4(c11902kk);
            }
            return c11909up;
        }
        C4666vj c4666vj = (C4666vj) m19330k4();
        C4624fa c4624faM19418dy = c4666vj.m19418dy();
        if (C7019kk.m27469x1(c4624faM19418dy, C4662up.class)) {
            c11906rv = new C11906rv(((C4662up) C7019kk.m27452k4((Object) c4624faM19418dy, C4662up.class)).m19380k4().m19486dy());
        } else {
            C4679yj c4679yj = (C4679yj) C7019kk.m27452k4((Object) c4624faM19418dy, C4679yj.class);
            C12025x6[] c12025x6Arr = (C12025x6[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) C12025x6.class), c4679yj.m19516k4()));
            for (int i4 = 0; i4 < c12025x6Arr.length; i4++) {
                c4679yj.m19519x1()[i4].mo19089k4().CloneTo(c12025x6Arr[i4]);
            }
            c11906rv = new C11906rv(c12025x6Arr);
        }
        c11906rv.m55689k4((int) c4666vj.m19431x1());
        c11906rv.m55692k4(c4666vj.m19427kk().m19174du().Clone());
        c11906rv.m55693k4(c4666vj.m19430to().mo19089k4().Clone());
        if ((c4666vj.m19417du() & 4294967295L) > 0) {
            C4637k4[] c4637k4ArrM19429m9 = c4666vj.m19429m9();
            C12003du[] c12003duArr2 = (C12003du[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) C12003du.class), c4637k4ArrM19429m9.length));
            for (int i5 = 0; i5 < c4637k4ArrM19429m9.length; i5++) {
                c4637k4ArrM19429m9[i5].m19174du().CloneTo(c12003duArr2[i5]);
            }
            c11906rv.m55694k4(c12003duArr2);
        }
        c11906rv.m55697kk((c4666vj.m19419k4() & 2) > 0 ? c4666vj.m19416c5().m19409k4().m19523dy() : new C11913yj());
        if ((c4666vj.m19419k4() & 4) > 0) {
            C4614c5 c4614c52 = (C4614c5) c4666vj.m19416c5().m19415x1();
            C11902kk c11902kk2 = new C11902kk((int) c4614c52.m19080x1());
            C12003du[] c12003duArr3 = (C12003du[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) C12003du.class), (int) c4614c52.m19080x1()));
            float[] fArr4 = new float[(int) c4614c52.m19080x1()];
            for (int i6 = 0; i6 < (c4614c52.m19080x1() & 4294967295L); i6++) {
                c4614c52.m19052kk()[i6].m19174du().CloneTo(c12003duArr3[i6]);
                fArr4[i6] = c4614c52.m19079k4()[i6];
            }
            c11902kk2.m55667k4(c12003duArr3);
            c11902kk2.m55666k4(fArr4);
            c11906rv.m55690k4(c11902kk2);
        }
        if ((c4666vj.m19419k4() & 8) > 0) {
            C4635jd c4635jd2 = (C4635jd) c4666vj.m19416c5().m19415x1();
            C11911x1 c11911x12 = new C11911x1((int) c4635jd2.m19080x1());
            float[] fArr5 = new float[(int) c4635jd2.m19080x1()];
            float[] fArr6 = new float[(int) c4635jd2.m19080x1()];
            while (i < (c4635jd2.m19080x1() & 4294967295L)) {
                fArr5[i] = c4635jd2.m19166kk()[i];
                fArr6[i] = c4635jd2.m19079k4()[i];
                i++;
            }
            c11911x12.m55742k4(fArr5);
            c11911x12.m55746x1(fArr6);
            c11906rv.m55691k4(c11911x12);
        }
        if ((c4666vj.m19419k4() & 64) > 0) {
            C4618dq c4618dqM19414kk = c4666vj.m19416c5().m19414kk();
            c11906rv.m55703x1(new C12025x6(c4618dqM19414kk.m19070k4(), c4618dqM19414kk.m19074x1()));
        }
        return c11906rv;
    }

    @Override // com.aspose.slides.internal.p171hq.AbstractC4615c6
    public String toString() {
        return C14113y2.m67402k4("{0}, BrushData: {1}, Type: {2}", super.toString(), this.f12995k4, C14042ak.m66410k4(C10188kk.class, this.f12996x1));
    }

    /* JADX INFO: renamed from: x1 */
    public final long m19334x1() {
        return this.f12996x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19331k4(long j) {
        this.f12996x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19332k4(AbstractC4638kk abstractC4638kk) {
        this.f12995k4 = abstractC4638kk;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m19329k4(C4652rv c4652rv) {
        return C14067j2.m66728k4(this.f12995k4, c4652rv.f12995k4) && this.f12996x1 == c4652rv.f12996x1;
    }
}
