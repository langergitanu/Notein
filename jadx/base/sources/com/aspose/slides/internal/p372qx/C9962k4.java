package com.aspose.slides.internal.p372qx;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p151gj.C4314c5;
import com.aspose.slides.internal.p151gj.C4316du;
import com.aspose.slides.internal.p151gj.C4317dy;
import com.aspose.slides.internal.p151gj.C4318fa;
import com.aspose.slides.internal.p151gj.C4319h4;
import com.aspose.slides.internal.p151gj.C4320jd;
import com.aspose.slides.internal.p151gj.C4324m9;
import com.aspose.slides.internal.p151gj.C4327up;
import com.aspose.slides.internal.p151gj.C4328x1;
import com.aspose.slides.internal.p154gr.C4375kk;
import com.aspose.slides.internal.p171hq.C4614c5;
import com.aspose.slides.internal.p171hq.C4618dq;
import com.aspose.slides.internal.p171hq.C4620dy;
import com.aspose.slides.internal.p171hq.C4621e0;
import com.aspose.slides.internal.p171hq.C4624fa;
import com.aspose.slides.internal.p171hq.C4628gk;
import com.aspose.slides.internal.p171hq.C4631ig;
import com.aspose.slides.internal.p171hq.C4634j5;
import com.aspose.slides.internal.p171hq.C4635jd;
import com.aspose.slides.internal.p171hq.C4637k4;
import com.aspose.slides.internal.p171hq.C4639kp;
import com.aspose.slides.internal.p171hq.C4652rv;
import com.aspose.slides.internal.p171hq.C4657to;
import com.aspose.slides.internal.p171hq.C4662up;
import com.aspose.slides.internal.p171hq.C4666vj;
import com.aspose.slides.internal.p171hq.C4679yj;
import com.aspose.slides.internal.p223ka.C5656k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p420th.C10971um;
import com.aspose.slides.internal.p460vf.C11640to;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p472w8.C11900jd;
import com.aspose.slides.internal.p472w8.C11909up;
import com.aspose.slides.internal.p472w8.C11912x6;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.AbstractC12024x1;
import com.aspose.slides.internal.p475wh.C11999ar;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12012lr;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p475wh.C12016rv;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.internal.p475wh.C12026yj;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.AbstractC14106wy;

/* JADX INFO: renamed from: com.aspose.slides.internal.qx.k4 */
/* JADX INFO: loaded from: classes4.dex */
public class C9962k4 {
    /* JADX INFO: renamed from: k4 */
    public static int m49060k4(int i) {
        if (i == 0) {
            return 0;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    if (i == 4) {
                        return 4;
                    }
                    throw new ArgumentOutOfRangeException(AbstractC14106wy.getName((Class<?>) C11912x6.class, i), Integer.valueOf(i), null);
                }
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: k4 */
    public static C4317dy m49061k4(C11913yj c11913yj) {
        return new C4317dy(c11913yj.m55776k4()[0], c11913yj.m55776k4()[1], c11913yj.m55776k4()[2], c11913yj.m55776k4()[3], c11913yj.m55776k4()[4], c11913yj.m55776k4()[5]);
    }

    /* JADX INFO: renamed from: k4 */
    public static C4320jd m49062k4(C12026yj c12026yj) {
        C4320jd c4320jd = (c12026yj.m56931rv() == 2 || c12026yj.m56931rv() == 1) ? new C4320jd(m49065k4(c12026yj.m56935x1()), c12026yj.m56930ne()) : new C4320jd(C5656k4.m23095k4(c12026yj.m56925kk().Clone()), c12026yj.m56930ne());
        c4320jd.m17378x1(c12026yj.m56910du());
        c4320jd.m17370kk(c12026yj.m56907c5());
        c4320jd.m17359du(c12026yj.m56911dy());
        c4320jd.m17367k4(m49060k4(c12026yj.m56917k4()));
        c4320jd.m17363h4(c12026yj.m56908ck());
        c4320jd.m17371kk(c12026yj.m56934up());
        c4320jd.m17374to(c12026yj.m56941yj());
        c4320jd.m17376x1(c12026yj.m56928ks());
        c4320jd.m17377x1(c12026yj.m56912fa());
        if (c12026yj.m56908ck() != 0) {
            c4320jd.m17368k4(c12026yj.m56916jd());
        }
        return c4320jd;
    }

    /* JADX INFO: renamed from: k4 */
    public static C4328x1 m49063k4(C4652rv c4652rv) {
        return m49064k4(c4652rv, null);
    }

    /* JADX INFO: renamed from: k4 */
    public static C4328x1 m49064k4(C4652rv c4652rv, C4317dy c4317dy) {
        C10971um c10971umM53090k4;
        int iM19334x1 = (int) c4652rv.m19334x1();
        if (iM19334x1 == 0) {
            return new C4318fa(C5656k4.m23095k4(((C4634j5) c4652rv.m19330k4()).m19163k4().m19174du().Clone()));
        }
        if (iM19334x1 == 1) {
            C4621e0 c4621e0 = (C4621e0) c4652rv.m19330k4();
            return new C4316du((int) c4621e0.m19085kk(), C5656k4.m23095k4(c4621e0.m19086x1().m19174du().Clone()), C5656k4.m23095k4(c4621e0.m19082k4().m19174du().Clone()));
        }
        if (iM19334x1 == 2) {
            C4631ig c4631ig = (C4631ig) c4652rv.m19330k4();
            C4628gk c4628gkM19144kk = c4631ig.m19144kk();
            C4317dy c4317dy2 = new C4317dy();
            if ((c4631ig.m19141k4() & 2) > 0) {
                c4317dy2 = m49061k4(c4628gkM19144kk.m19113k4().m19523dy());
            }
            C4327up c4327up = new C4327up(c4628gkM19144kk.m19116x1().m19308k4().mo19127kk(), (int) c4631ig.m19145x1());
            c4327up.m17387k4(c4317dy2);
            return c4327up;
        }
        int i = 0;
        if (iM19334x1 != 3) {
            if (iM19334x1 != 4) {
                throw new ArgumentOutOfRangeException();
            }
            C4639kp c4639kp = (C4639kp) c4652rv.m19330k4();
            C12007ix c12007ixClone = c4639kp.m19195to().mo19058k4().Clone();
            C12025x6 c12025x6Clone = c12007ixClone.m56552du().Clone();
            C12025x6 c12025x6 = new C12025x6(c12007ixClone.m56550c5() + c12025x6Clone.m56897x1(), c12007ixClone.m56575x1() + c12025x6Clone.m56895kk());
            C11909up c11909up = new C11909up(c12025x6Clone.Clone(), c12025x6.Clone(), c4639kp.m19186dy().m19174du().Clone(), c4639kp.m19196x1().m19174du().Clone());
            C4324m9 c4324m9 = new C4324m9(c12025x6Clone.Clone(), c12025x6.Clone(), C5656k4.m23095k4(c4639kp.m19186dy().m19174du().Clone()), C5656k4.m23095k4(c4639kp.m19196x1().m19174du().Clone()));
            c4324m9.m17397k4(c11909up.m55724jd().Clone());
            c4324m9.m17386k4((int) c4639kp.m19184c5());
            if ((c4639kp.m19187k4() & 128) > 0) {
                c4324m9.m17398k4(true);
            }
            if ((c4639kp.m19187k4() & 2) > 0) {
                c4324m9.m17387k4(m49061k4(c4639kp.m19193kk().m19108k4().m19523dy()));
            }
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
                        float[] fArr = new float[(int) c4635jd.m19080x1()];
                        float[] fArr2 = new float[(int) c4635jd.m19080x1()];
                        for (int i3 = 0; i3 < (c4635jd.m19080x1() & 4294967295L); i3++) {
                            fArr[i3] = c4635jd.m19166kk()[i3];
                            fArr2[i3] = c4635jd.m19079k4()[i3];
                        }
                        c4324m9.m17408x1(fArr);
                        c4324m9.m17404k4(fArr2);
                    } else {
                        i2++;
                    }
                }
            }
            if ((c4639kp.m19187k4() & 4) > 0) {
                C4614c5 c4614c5 = (C4614c5) c4639kp.m19193kk().m19111x1()[0];
                C4319h4[] c4319h4Arr = new C4319h4[(int) c4614c5.m19080x1()];
                while (i < (c4614c5.m19080x1() & 4294967295L)) {
                    c4319h4Arr[i] = new C4319h4(C5656k4.m23095k4(c4614c5.m19052kk()[i].m19174du().Clone()), c4614c5.m19079k4()[i]);
                    i++;
                }
                c4324m9.m17405k4(c4319h4Arr);
            }
            return c4324m9;
        }
        C4666vj c4666vj = (C4666vj) c4652rv.m19330k4();
        C4624fa c4624faM19418dy = c4666vj.m19418dy();
        C12007ix c12007ixClone2 = C12007ix.f40519k4.Clone();
        if (C7019kk.m27469x1(c4624faM19418dy, C4662up.class)) {
            C11896dy c11896dyM19486dy = ((C4662up) C7019kk.m27452k4((Object) c4624faM19418dy, C4662up.class)).m19380k4().m19486dy();
            if (c4317dy != null) {
                c11896dyM19486dy.m55532k4(m49066k4(c4317dy)).CloneTo(c12007ixClone2);
            }
            c10971umM53090k4 = C11640to.m54747k4(c11896dyM19486dy, true);
        } else {
            C4679yj c4679yj = (C4679yj) C7019kk.m27452k4((Object) c4624faM19418dy, C4679yj.class);
            C12025x6[] c12025x6Arr = (C12025x6[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) C12025x6.class), c4679yj.m19516k4()));
            for (int i4 = 0; i4 < c12025x6Arr.length; i4++) {
                c4679yj.m19519x1()[i4].mo19089k4().CloneTo(c12025x6Arr[i4]);
            }
            c10971umM53090k4 = C10971um.m53090k4(c12025x6Arr, true);
        }
        C12025x6 c12025x6Clone2 = c4666vj.m19430to().mo19089k4().Clone();
        if (c4317dy != null && !c4317dy.m17344k4()) {
            c10971umM53090k4.m53109x1(c4317dy);
            c4317dy.m17333k4(c12025x6Clone2.Clone()).CloneTo(c12025x6Clone2);
        }
        C4314c5 c4314c5 = new C4314c5(c10971umM53090k4, c12025x6Clone2.Clone());
        c4314c5.m17303k4(c12007ixClone2.Clone());
        c4314c5.m17302k4(C5656k4.m23095k4(c4666vj.m19427kk().m19174du().Clone()));
        if ((c4666vj.m19417du() & 4294967295L) > 0) {
            C4637k4[] c4637k4ArrM19429m9 = c4666vj.m19429m9();
            C5656k4[] c5656k4Arr = new C5656k4[c4637k4ArrM19429m9.length];
            for (int i5 = 0; i5 < c4637k4ArrM19429m9.length; i5++) {
                c5656k4Arr[i5] = C5656k4.m23095k4(c4637k4ArrM19429m9[i5].m19174du().Clone());
            }
            c4314c5.m17305k4(c5656k4Arr);
        }
        if ((c4666vj.m19419k4() & 2) > 0) {
            c4314c5.m17387k4(m49061k4(c4666vj.m19416c5().m19409k4().m19523dy()));
        }
        if ((c4666vj.m19419k4() & 4) > 0) {
            C4614c5 c4614c52 = (C4614c5) c4666vj.m19416c5().m19415x1();
            C4319h4[] c4319h4Arr2 = new C4319h4[(int) c4614c52.m19080x1()];
            for (int i6 = 0; i6 < (c4614c52.m19080x1() & 4294967295L); i6++) {
                c4319h4Arr2[i6] = new C4319h4(C5656k4.m23095k4(c4614c52.m19052kk()[i6].m19174du().Clone()), c4614c52.m19079k4()[i6]);
            }
            c4314c5.m17405k4(c4319h4Arr2);
        }
        if ((c4666vj.m19419k4() & 8) > 0) {
            C4635jd c4635jd2 = (C4635jd) c4666vj.m19416c5().m19415x1();
            c4314c5.m17408x1(new float[(int) c4635jd2.m19080x1()]);
            c4314c5.m17404k4(new float[(int) c4635jd2.m19080x1()]);
            while (i < (c4635jd2.m19080x1() & 4294967295L)) {
                c4314c5.m17407to()[i] = c4635jd2.m19166kk()[i];
                c4314c5.m17406kk()[i] = c4635jd2.m19079k4()[i];
                i++;
            }
        }
        if ((c4666vj.m19419k4() & 64) > 0) {
            C4618dq c4618dqM19414kk = c4666vj.m19416c5().m19414kk();
            c4314c5.m17307x1(new C12025x6(c4618dqM19414kk.m19070k4(), c4618dqM19414kk.m19074x1()));
        }
        return c4314c5;
    }

    /* JADX INFO: renamed from: k4 */
    public static C4328x1 m49065k4(AbstractC12024x1 abstractC12024x1) {
        if (C7019kk.m27469x1(abstractC12024x1, C11999ar.class)) {
            return new C4318fa(C5656k4.m23095k4(((C11999ar) abstractC12024x1).m56305h4().Clone()));
        }
        if (C7019kk.m27469x1(abstractC12024x1, C11900jd.class)) {
            C11900jd c11900jd = (C11900jd) abstractC12024x1;
            return new C4316du(c11900jd.m55650dy(), C5656k4.m23095k4(c11900jd.m55652m9().Clone()), C5656k4.m23095k4(c11900jd.m55651h4().Clone()));
        }
        if (!C7019kk.m27469x1(abstractC12024x1, C12012lr.class)) {
            if (!C7019kk.m27469x1(abstractC12024x1, C11909up.class)) {
                throw new NotSupportedException();
            }
            C11909up c11909up = (C11909up) abstractC12024x1;
            C12003du[] c12003duArrM55718c5 = c11909up.m55718c5();
            return new C4324m9(c11909up.m55724jd().Clone(), C5656k4.m23095k4(c12003duArrM55718c5[0].Clone()), C5656k4.m23095k4(c12003duArrM55718c5[1].Clone()));
        }
        C12012lr c12012lr = (C12012lr) abstractC12024x1;
        C3152yj c3152yj = new C3152yj();
        try {
            c12012lr.m56619h4().m56333k4(c3152yj, c12012lr.m56619h4().mo15750ck());
            C4327up c4327up = new C4327up(c3152yj.toArray(), c12012lr.m56618dy());
            c4327up.m17387k4(m49061k4(c12012lr.m56624m9()));
            return c4327up;
        } finally {
            c3152yj.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static C11913yj m49066k4(C4317dy c4317dy) {
        return new C11913yj(c4317dy.m17347to(), c4317dy.m17329du(), c4317dy.m17331h4(), c4317dy.m17346m9(), c4317dy.m17330dy(), c4317dy.m17328c5());
    }

    /* JADX INFO: renamed from: k4 */
    public static C12007ix m49067k4(C12014ne c12014ne) {
        return new C12007ix(c12014ne.m56669jd(), c12014ne.m56664ck(), c12014ne.m56663c5(), c12014ne.m56683x1());
    }

    /* JADX INFO: renamed from: k4 */
    public static C12014ne m49068k4(C12007ix c12007ix) {
        return new C12014ne(C7019kk.m27462to(Float.valueOf(c12007ix.m56557jd()), 13), C7019kk.m27462to(Float.valueOf(c12007ix.m56551ck()), 13), C7019kk.m27462to(Float.valueOf(c12007ix.m56550c5()), 13), C7019kk.m27462to(Float.valueOf(c12007ix.m56575x1()), 13));
    }

    /* JADX INFO: renamed from: k4 */
    public static int[] m49069k4(C11896dy c11896dy) {
        if (!C4375kk.m17631k4(c11896dy)) {
            return new int[0];
        }
        byte[] bArrM55571to = c11896dy.m55571to();
        int length = bArrM55571to.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = bArrM55571to[i] & 255;
        }
        return iArr;
    }

    /* JADX INFO: renamed from: k4 */
    public static C12025x6[] m49070k4(C4657to[] c4657toArr) {
        C12025x6[] c12025x6Arr = (C12025x6[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) C12025x6.class), c4657toArr.length));
        for (int i = 0; i < c4657toArr.length; i++) {
            c4657toArr[i].mo19089k4().CloneTo(c12025x6Arr[i]);
        }
        return c12025x6Arr;
    }

    /* JADX INFO: renamed from: k4 */
    public static C12025x6[] m49071k4(C12016rv[] c12016rvArr) {
        C12025x6[] c12025x6Arr = (C12025x6[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) C12025x6.class), c12016rvArr.length));
        for (int i = 0; i < c12016rvArr.length; i++) {
            C12016rv.m56703k4(c12016rvArr[i]).CloneTo(c12025x6Arr[i]);
        }
        return c12025x6Arr;
    }
}
