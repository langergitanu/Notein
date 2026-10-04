package com.aspose.slides.internal.p539z4;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p026an.C1486kk;
import com.aspose.slides.internal.p314oc.C7019kk;
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

/* JADX INFO: renamed from: com.aspose.slides.internal.z4.rv */
/* JADX INFO: loaded from: classes5.dex */
public final class C13402rv extends AbstractC13365c6 {

    /* JADX INFO: renamed from: k4 */
    private AbstractC13388kk f44848k4;

    /* JADX INFO: renamed from: x1 */
    private long f44849x1;

    @Override // com.aspose.slides.internal.p539z4.AbstractC13365c6
    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        return C7019kk.m27469x1(obj, C13402rv.class) && m62318k4((C13402rv) obj);
    }

    @Override // com.aspose.slides.internal.p539z4.AbstractC13373f9
    /* JADX INFO: renamed from: h4 */
    public int mo62023h4() {
        return this.f44848k4.mo62023h4() + 8;
    }

    @Override // com.aspose.slides.internal.p539z4.AbstractC13365c6
    public int hashCode() {
        AbstractC13388kk abstractC13388kk = this.f44848k4;
        return ((abstractC13388kk != null ? abstractC13388kk.hashCode() : 0) * 397) ^ ((int) this.f44849x1);
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC13388kk m62319k4() {
        return this.f44848k4;
    }

    /* JADX INFO: renamed from: kk */
    public final AbstractC12024x1 m62322kk() {
        C11906rv c11906rv;
        int iM62323x1 = (int) m62323x1();
        if (iM62323x1 == 0) {
            return new C11999ar(((C13384j5) m62319k4()).m62161k4().m62172du().Clone());
        }
        if (iM62323x1 == 1) {
            C13371e0 c13371e0 = (C13371e0) m62319k4();
            return new C11900jd((int) c13371e0.m62088kk(), c13371e0.m62089x1().m62172du().Clone(), c13371e0.m62085k4().m62172du().Clone());
        }
        if (iM62323x1 == 2) {
            C13381ig c13381ig = (C13381ig) m62319k4();
            int iM62144x1 = (int) c13381ig.m62144x1();
            C11913yj c11913yj = new C11913yj();
            if (c13381ig.m62143kk() == null) {
                throw new ArgumentException("Bitmap data is missed");
            }
            C13378gk c13378gkM62143kk = c13381ig.m62143kk();
            if ((c13381ig.m62140k4() & 2) > 0) {
                if (c13378gkM62143kk.m62113k4() == null) {
                    throw new ArgumentException("Transformation info is missed");
                }
                c11913yj = c13378gkM62143kk.m62113k4().m62505k4();
            }
            C12012lr c12012lr = new C12012lr(c13378gkM62143kk.m62116x1().m62301k4().mo62121k4(), iM62144x1);
            c12012lr.m56623kk(c11913yj);
            return c12012lr;
        }
        int i = 0;
        if (iM62323x1 != 3) {
            if (iM62323x1 != 4) {
                throw new ArgumentException("unknown brush type");
            }
            C13389kp c13389kp = (C13389kp) m62319k4();
            C12007ix c12007ixClone = c13389kp.m62191to().mo62062k4().Clone();
            C12025x6 c12025x6Clone = c12007ixClone.m56552du().Clone();
            C11909up c11909up = new C11909up(c12025x6Clone.Clone(), new C12025x6(c12007ixClone.m56550c5() + c12025x6Clone.m56897x1(), c12007ixClone.m56575x1() + c12025x6Clone.m56895kk()).Clone(), c13389kp.m62182du().m62172du().Clone(), c13389kp.m62192x1().m62172du().Clone());
            c11909up.m55725k4((int) c13389kp.m62190m9());
            if ((c13389kp.m62183k4() & 128) > 0) {
                c11909up.m55738x1(true);
            }
            c11909up.m55730kk((c13389kp.m62183k4() & 2) > 0 ? c13389kp.m62189kk().m62108k4().m62505k4() : new C11913yj());
            if ((c13389kp.m62183k4() & 8) > 0) {
                C13370dy[] c13370dyArrM62111x1 = c13389kp.m62189kk().m62111x1();
                int i2 = 0;
                while (true) {
                    if (i2 >= c13370dyArrM62111x1.length) {
                        break;
                    }
                    C13370dy c13370dy = c13370dyArrM62111x1[i2];
                    if (c13370dy != null) {
                        C13385jd c13385jd = (C13385jd) c13370dy;
                        C11911x1 c11911x1 = new C11911x1((int) c13385jd.m62083x1());
                        float[] fArr = new float[(int) c13385jd.m62083x1()];
                        float[] fArr2 = new float[(int) c13385jd.m62083x1()];
                        for (int i3 = 0; i3 < (c13385jd.m62083x1() & 4294967295L); i3++) {
                            fArr[i3] = c13385jd.m62164kk()[i3];
                            fArr2[i3] = c13385jd.m62082k4()[i3];
                        }
                        c11911x1.m55742k4(fArr);
                        c11911x1.m55746x1(fArr2);
                        c11909up.m55727k4(c11911x1);
                    } else {
                        i2++;
                    }
                }
            }
            if ((c13389kp.m62183k4() & 4) > 0) {
                C13364c5 c13364c5 = (C13364c5) c13389kp.m62189kk().m62111x1()[0];
                C11902kk c11902kk = new C11902kk((int) c13364c5.m62083x1());
                C12003du[] c12003duArr = (C12003du[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) C12003du.class), (int) c13364c5.m62083x1()));
                float[] fArr3 = new float[(int) c13364c5.m62083x1()];
                while (i < (c13364c5.m62083x1() & 4294967295L)) {
                    c13364c5.m62056kk()[i].m62172du().CloneTo(c12003duArr[i]);
                    fArr3[i] = c13364c5.m62082k4()[i];
                    i++;
                }
                c11902kk.m55667k4(c12003duArr);
                c11902kk.m55666k4(fArr3);
                c11909up.m55726k4(c11902kk);
            }
            return c11909up;
        }
        C13416vj c13416vj = (C13416vj) m62319k4();
        C13374fa c13374faM62402dy = c13416vj.m62402dy();
        if (C7019kk.m27469x1(c13374faM62402dy, C13412up.class)) {
            c11906rv = new C11906rv(((C13412up) C7019kk.m27452k4((Object) c13374faM62402dy, C13412up.class)).m62367k4().m62467c5());
        } else {
            C13429yj c13429yj = (C13429yj) C7019kk.m27452k4((Object) c13374faM62402dy, C13429yj.class);
            C12025x6[] c12025x6Arr = (C12025x6[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) C12025x6.class), c13429yj.m62498k4()));
            for (int i4 = 0; i4 < c12025x6Arr.length; i4++) {
                c13429yj.m62501x1()[i4].mo62092k4().CloneTo(c12025x6Arr[i4]);
            }
            c11906rv = new C11906rv(c12025x6Arr);
        }
        c11906rv.m55689k4((int) c13416vj.m62415x1());
        c11906rv.m55692k4(c13416vj.m62411kk().m62172du().Clone());
        c11906rv.m55693k4(c13416vj.m62414to().mo62092k4().Clone());
        if ((c13416vj.m62401du() & 4294967295L) > 0) {
            C13387k4[] c13387k4ArrM62413m9 = c13416vj.m62413m9();
            C12003du[] c12003duArr2 = (C12003du[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) C12003du.class), c13387k4ArrM62413m9.length));
            for (int i5 = 0; i5 < c13387k4ArrM62413m9.length; i5++) {
                c13387k4ArrM62413m9[i5].m62172du().CloneTo(c12003duArr2[i5]);
            }
            c11906rv.m55694k4(c12003duArr2);
        }
        c11906rv.m55697kk((c13416vj.m62403k4() & 2) > 0 ? c13416vj.m62400c5().m62393k4().m62505k4() : new C11913yj());
        if ((c13416vj.m62403k4() & 4) > 0) {
            C13364c5 c13364c52 = (C13364c5) c13416vj.m62400c5().m62399x1();
            C11902kk c11902kk2 = new C11902kk((int) c13364c52.m62083x1());
            C12003du[] c12003duArr3 = (C12003du[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) C12003du.class), (int) c13364c52.m62083x1()));
            float[] fArr4 = new float[(int) c13364c52.m62083x1()];
            for (int i6 = 0; i6 < (c13364c52.m62083x1() & 4294967295L); i6++) {
                c13364c52.m62056kk()[i6].m62172du().CloneTo(c12003duArr3[i6]);
                fArr4[i6] = c13364c52.m62082k4()[i6];
            }
            c11902kk2.m55667k4(c12003duArr3);
            c11902kk2.m55666k4(fArr4);
            c11906rv.m55690k4(c11902kk2);
        }
        if ((c13416vj.m62403k4() & 8) > 0) {
            C13385jd c13385jd2 = (C13385jd) c13416vj.m62400c5().m62399x1();
            C11911x1 c11911x12 = new C11911x1((int) c13385jd2.m62083x1());
            float[] fArr5 = new float[(int) c13385jd2.m62083x1()];
            float[] fArr6 = new float[(int) c13385jd2.m62083x1()];
            while (i < (c13385jd2.m62083x1() & 4294967295L)) {
                fArr5[i] = c13385jd2.m62164kk()[i];
                fArr6[i] = c13385jd2.m62082k4()[i];
                i++;
            }
            c11911x12.m55742k4(fArr5);
            c11911x12.m55746x1(fArr6);
            c11906rv.m55691k4(c11911x12);
        }
        if ((c13416vj.m62403k4() & 64) > 0) {
            C13368dq c13368dqM62398kk = c13416vj.m62400c5().m62398kk();
            c11906rv.m55703x1(new C12025x6(c13368dqM62398kk.m62074k4(), c13368dqM62398kk.m62077x1()));
        }
        return c11906rv;
    }

    @Override // com.aspose.slides.internal.p539z4.AbstractC13365c6
    public String toString() {
        return C14113y2.m67402k4("{0}, BrushData: {1}, Type: {2}", super.toString(), this.f44848k4, C14042ak.m66410k4(C1486kk.class, this.f44849x1));
    }

    /* JADX INFO: renamed from: x1 */
    public final long m62323x1() {
        return this.f44849x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62320k4(long j) {
        this.f44849x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62321k4(AbstractC13388kk abstractC13388kk) {
        this.f44848k4 = abstractC13388kk;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m62318k4(C13402rv c13402rv) {
        return C14067j2.m66728k4(this.f44848k4, c13402rv.f44848k4) && this.f44849x1 == c13402rv.f44849x1;
    }
}
