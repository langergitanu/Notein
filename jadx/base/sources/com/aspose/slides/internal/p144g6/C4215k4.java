package com.aspose.slides.internal.p144g6;

import com.aspose.slides.C22203OooOO0o;
import com.aspose.slides.internal.p151gj.C4317dy;
import com.aspose.slides.internal.p151gj.C4318fa;
import com.aspose.slides.internal.p151gj.C4320jd;
import com.aspose.slides.internal.p151gj.C4328x1;
import com.aspose.slides.internal.p223ka.C5656k4;
import com.aspose.slides.internal.p223ka.C5659x1;
import com.aspose.slides.internal.p420th.AbstractC10973uz;
import com.aspose.slides.internal.p420th.C10947ak;
import com.aspose.slides.internal.p420th.C10950bv;
import com.aspose.slides.internal.p420th.C10951c5;
import com.aspose.slides.internal.p420th.C10953ck;
import com.aspose.slides.internal.p420th.C10955du;
import com.aspose.slides.internal.p420th.C10956dy;
import com.aspose.slides.internal.p420th.C10960jd;
import com.aspose.slides.internal.p420th.C10963ks;
import com.aspose.slides.internal.p420th.C10971um;
import com.aspose.slides.internal.p420th.C10980yd;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.words.ControlChar;

/* JADX INFO: renamed from: com.aspose.slides.internal.g6.k4 */
/* JADX INFO: loaded from: classes.dex */
public class C4215k4 {

    /* JADX INFO: renamed from: du */
    private C4211fa f11500du;

    /* JADX INFO: renamed from: k4 */
    private static final C5656k4 f11496k4 = C5656k4.f15627z7;

    /* JADX INFO: renamed from: x1 */
    private static final C5656k4 f11499x1 = C5656k4.f15578rs;

    /* JADX INFO: renamed from: kk */
    private static final C5656k4 f11497kk = C5656k4.f15596um;

    /* JADX INFO: renamed from: to */
    private static final C5656k4 f11498to = C5656k4.f15518dy;

    public C4215k4(C4211fa c4211fa) {
        this.f11500du = c4211fa;
    }

    /* JADX INFO: renamed from: x1 */
    private void m16947x1(C10951c5 c10951c5, C12007ix c12007ix) {
        c12007ix.m56561k4(1.0f, 1.0f);
        c10951c5.m52907k4(m16942k4(c12007ix.Clone()));
    }

    /* JADX INFO: renamed from: k4 */
    public final C10951c5 m16949k4(C10947ak c10947ak) {
        C10951c5 c10951c5 = new C10951c5();
        C12007ix c12007ixClone = c10947ak.mo52867to().Clone();
        c12007ixClone.m56561k4(0.0f, 2.0f);
        m16945k4(c10951c5, c12007ixClone.Clone(), f11496k4);
        if (!C14113y2.m67411k4(c10947ak.m52859du())) {
            if (c10947ak.m52870yj()) {
                String[] strArrM67369h4 = C14113y2.m67369h4(c10947ak.m52859du(), ControlChar.PARAGRAPH_BREAK_CHAR, '\n', 8233);
                float fM52868up = c10947ak.m52868up() > 0.0f ? c10947ak.m52868up() : c10947ak.m52861jd().m23116jd() + c10947ak.m52861jd().m23111c5() + 1.0f;
                int i = 0;
                for (String str : strArrM67369h4) {
                    C5659x1 c5659x1M52861jd = c10947ak.m52861jd();
                    C5656k4 c5656k4 = f11498to;
                    C10963ks c10963ks = new C10963ks(c5659x1M52861jd, c5656k4, c5656k4, new C12025x6(0.0f, 0.0f), str, c12007ixClone.m56570m9().Clone(), 0.0f);
                    i++;
                    c10963ks.m52984k4(new C4317dy(1.0f, 0.0f, 0.0f, 1.0f, c12007ixClone.m56552du().m56897x1() + 1.0f, ((i * fM52868up) + c12007ixClone.m56552du().m56895kk()) - c10947ak.m52861jd().m23116jd()));
                    c10951c5.m52930k4(c10963ks);
                }
            } else {
                float fM23116jd = c10947ak.m52861jd().m23116jd() + c10947ak.m52861jd().m23111c5();
                C5659x1 c5659x1M52861jd2 = c10947ak.m52861jd();
                C5656k4 c5656k42 = f11498to;
                C10963ks c10963ks2 = new C10963ks(c5659x1M52861jd2, c5656k42, c5656k42, new C12025x6(0.0f, 0.0f), c10947ak.m52859du(), c12007ixClone.m56570m9().Clone(), 0.0f);
                c10963ks2.m52984k4(new C4317dy(1.0f, 0.0f, 0.0f, 1.0f, c12007ixClone.m56552du().m56897x1() + 1.0f, (fM23116jd / 2.0f) + (c10947ak.m52858ck().m56697kk() / 2.0f) + c12007ixClone.m56552du().m56895kk()));
                c10951c5.m52930k4(c10963ks2);
            }
        }
        m16944k4(c10951c5, c12007ixClone.Clone());
        m16947x1(c10951c5, c12007ixClone.Clone());
        return c10951c5;
    }

    /* JADX INFO: renamed from: x1 */
    private void m16948x1(C10951c5 c10951c5, C12025x6 c12025x6) {
        C10971um c10971um = new C10971um(new C4320jd(f11498to));
        C10950bv c10950bv = new C10950bv();
        c10950bv.m52901x1(new C12025x6[]{new C12025x6(3.0f, 5.0f), new C12025x6(4.0f, 8.0f), new C12025x6(9.0f, 1.0f)});
        c10971um.m52930k4(c10950bv);
        c10971um.m53099k4(new C4317dy(1.0f, 0.0f, 0.0f, 1.0f, c12025x6.m56897x1(), c12025x6.m56895kk()));
        c10951c5.m52930k4((AbstractC10973uz) c10971um);
    }

    /* JADX INFO: renamed from: k4 */
    public final C10951c5 m16950k4(C10953ck c10953ck) {
        C10951c5 c10951c5 = new C10951c5();
        C12007ix c12007ixClone = c10953ck.mo52867to().Clone();
        c12007ixClone.m56561k4(0.0f, 2.0f);
        m16945k4(c10951c5, c12007ixClone.Clone(), f11496k4);
        if (c10953ck.m52917kk() > -1 && c10953ck.m52917kk() < c10953ck.m52918x1().size()) {
            C5659x1 c5659x1M52912k4 = c10953ck.m52912k4();
            C5656k4 c5656k4 = f11498to;
            C10963ks c10963ks = new C10963ks(c5659x1M52912k4, c5656k4, c5656k4, new C12025x6(0.0f, 0.0f), c10953ck.m52918x1().get_Item(c10953ck.m52917kk()), c12007ixClone.m56570m9().Clone(), 0.0f);
            c10963ks.m52984k4(new C4317dy(1.0f, 0.0f, 0.0f, 1.0f, c12007ixClone.m56552du().m56897x1() + 1.0f, ((c10953ck.m52912k4().m23116jd() + c10953ck.m52912k4().m23111c5()) / 2.0f) + (c10953ck.m52911du().m56697kk() / 2.0f) + c12007ixClone.m56552du().m56895kk()));
            c10951c5.m52930k4(c10963ks);
        }
        m16944k4(c10951c5, c12007ixClone.Clone());
        m16946k4(c10951c5, new C12025x6(c12007ixClone.m56556h4() - 8.0f, C22203OooOO0o.OooO0O0(c12007ixClone, 2.0f, c12007ixClone.m56551ck())));
        m16947x1(c10951c5, c12007ixClone.Clone());
        return c10951c5;
    }

    /* JADX INFO: renamed from: k4 */
    public final C10951c5 m16951k4(C10956dy c10956dy) {
        C10951c5 c10951c5 = new C10951c5();
        C12007ix c12007ixClone = c10956dy.mo52867to().Clone();
        m16945k4(c10951c5, c12007ixClone.Clone(), f11499x1);
        if (!C14113y2.m67411k4(c10956dy.m52926x1())) {
            C5659x1 c5659x1M52925kk = c10956dy.m52925kk();
            C5656k4 c5656k4 = f11498to;
            C10963ks c10963ks = new C10963ks(c5659x1M52925kk, c5656k4, c5656k4, new C12025x6(0.0f, 0.0f), c10956dy.m52926x1(), c12007ixClone.m56570m9().Clone(), 0.0f);
            C12015qq c12015qqClone = c10956dy.m52925kk().m23126x1(c10956dy.m52926x1()).Clone();
            C12025x6 c12025x6 = new C12025x6(c12015qqClone.m56699x1() / 2.0f, c12015qqClone.m56697kk() / 2.0f);
            C12025x6 c12025x62 = new C12025x6(c10956dy.m52922k4().m56699x1() / 2.0f, c10956dy.m52922k4().m56697kk() / 2.0f);
            c10963ks.m52984k4(new C4317dy(1.0f, 0.0f, 0.0f, 1.0f, c12025x62.m56897x1() - c12025x6.m56897x1(), c12025x6.m56895kk() + c12025x62.m56895kk()));
            c10951c5.m52930k4(c10963ks);
        }
        m16944k4(c10951c5, c12007ixClone.Clone());
        m16947x1(c10951c5, c12007ixClone.Clone());
        return c10951c5;
    }

    /* JADX INFO: renamed from: k4 */
    public final C10951c5 m16952k4(C10960jd c10960jd) {
        C10951c5 c10951c5 = new C10951c5();
        C12007ix c12007ix = new C12007ix(c10960jd.m53142h4().Clone(), new C12015qq(10.0f, 10.0f));
        m16945k4(c10951c5, c12007ix.Clone(), f11496k4);
        m16944k4(c10951c5, c12007ix.Clone());
        if (c10960jd.m52947k4()) {
            C12007ix c12007ixClone = c10960jd.mo52867to().Clone();
            m16948x1(c10951c5, new C12025x6(c12007ixClone.m56557jd(), c12007ixClone.m56551ck()));
        }
        return c10951c5;
    }

    /* JADX INFO: renamed from: k4 */
    public final C10951c5 m16953k4(C10980yd c10980yd) {
        C10951c5 c10951c5 = new C10951c5();
        if (this.f11500du.m16913to().m16969x1()) {
            m16943k4(c10980yd.m53142h4().m56897x1() + 5.0f, c10980yd.m53142h4().m56895kk() + 5.0f, 3.5f, c10951c5, new C4318fa(f11496k4));
        }
        if (c10980yd.m52947k4()) {
            m16943k4(c10980yd.m53142h4().m56897x1() + 5.0f, c10980yd.m53142h4().m56895kk() + 5.0f, 1.5f, c10951c5, new C4318fa(f11498to));
        }
        return c10951c5;
    }

    /* JADX INFO: renamed from: k4 */
    private C10971um m16942k4(C12007ix c12007ix) {
        C10971um c10971um = new C10971um();
        C10950bv c10950bv = new C10950bv();
        c10950bv.m52899x1(c12007ix.Clone());
        c10950bv.m52895k4(true);
        c10971um.m52930k4(c10950bv);
        return c10971um;
    }

    /* JADX INFO: renamed from: k4 */
    private static void m16943k4(float f, float f2, float f3, C10951c5 c10951c5, C4328x1 c4328x1) {
        C10971um c10971um = new C10971um(new C4320jd(f11497kk, 0.7f));
        c10971um.m53099k4(new C4317dy(1.0f, 0.0f, 0.0f, 1.0f, f, f2));
        C10950bv c10950bv = new C10950bv();
        c10950bv.m52895k4(true);
        c10971um.m52930k4(c10950bv);
        float f4 = f3 + 0.0f;
        float f5 = 0.55228f * f3;
        float f6 = f5 + 0.0f;
        c10950bv.m52930k4(new C10955du(new C12025x6(0.0f, f4), new C12025x6(f6, f3), new C12025x6(f4, f6), new C12025x6(f4, 0.0f)));
        float f7 = 0.0f - f3;
        float f8 = 0.0f - f5;
        c10950bv.m52930k4(new C10955du(new C12025x6(f4, 0.0f), new C12025x6(f4, f8), new C12025x6(f6, f7), new C12025x6(0.0f, f7)));
        c10950bv.m52930k4(new C10955du(new C12025x6(0.0f, f7), new C12025x6(f8, f7), new C12025x6(f7, f8), new C12025x6(f7, 0.0f)));
        c10950bv.m52930k4(new C10955du(new C12025x6(f7, 0.0f), new C12025x6(f7, f6), new C12025x6(f8, f4), new C12025x6(0.0f, f4)));
        c10971um.m53101k4(c4328x1);
        c10951c5.m52930k4((AbstractC10973uz) c10971um);
    }

    /* JADX INFO: renamed from: k4 */
    private void m16944k4(C10951c5 c10951c5, C12007ix c12007ix) {
        if (this.f11500du.m16913to().m16969x1()) {
            C10971um c10971umM16942k4 = m16942k4(c12007ix.Clone());
            c10971umM16942k4.m53100k4(new C4320jd(f11497kk));
            c10951c5.m52930k4((AbstractC10973uz) c10971umM16942k4);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m16945k4(C10951c5 c10951c5, C12007ix c12007ix, C5656k4 c5656k4) {
        if (this.f11500du.m16913to().m16969x1()) {
            C10971um c10971umM16942k4 = m16942k4(c12007ix.Clone());
            c10971umM16942k4.m53101k4(new C4318fa(c5656k4));
            c10951c5.m52930k4((AbstractC10973uz) c10971umM16942k4);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m16946k4(C10951c5 c10951c5, C12025x6 c12025x6) {
        C5656k4 c5656k4 = f11498to;
        C10971um c10971um = new C10971um(new C4320jd(c5656k4));
        c10971um.m53101k4(new C4318fa(c5656k4));
        C10950bv c10950bv = new C10950bv();
        c10950bv.m52901x1(new C12025x6[]{new C12025x6(0.0f, 0.0f), new C12025x6(4.0f, 0.0f), new C12025x6(2.0f, 4.0f)});
        c10950bv.m52895k4(true);
        c10971um.m52930k4(c10950bv);
        c10971um.m53099k4(new C4317dy(1.0f, 0.0f, 0.0f, 1.0f, c12025x6.m56897x1() - 2.0f, c12025x6.m56895kk() - 2.0f));
        c10951c5.m52930k4((AbstractC10973uz) c10971um);
    }
}
