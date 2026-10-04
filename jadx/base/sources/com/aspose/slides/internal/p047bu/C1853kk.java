package com.aspose.slides.internal.p047bu;

import androidx.core.internal.view.SupportMenu;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p129fe.C3977ck;
import com.aspose.slides.internal.p171hq.AbstractC4638kk;
import com.aspose.slides.internal.p171hq.AbstractC4671x1;
import com.aspose.slides.internal.p171hq.C4608ak;
import com.aspose.slides.internal.p171hq.C4610b3;
import com.aspose.slides.internal.p171hq.C4612bv;
import com.aspose.slides.internal.p171hq.C4614c5;
import com.aspose.slides.internal.p171hq.C4616ca;
import com.aspose.slides.internal.p171hq.C4618dq;
import com.aspose.slides.internal.p171hq.C4620dy;
import com.aspose.slides.internal.p171hq.C4621e0;
import com.aspose.slides.internal.p171hq.C4624fa;
import com.aspose.slides.internal.p171hq.C4625g8;
import com.aspose.slides.internal.p171hq.C4627gi;
import com.aspose.slides.internal.p171hq.C4628gk;
import com.aspose.slides.internal.p171hq.C4629h4;
import com.aspose.slides.internal.p171hq.C4630he;
import com.aspose.slides.internal.p171hq.C4631ig;
import com.aspose.slides.internal.p171hq.C4633j2;
import com.aspose.slides.internal.p171hq.C4634j5;
import com.aspose.slides.internal.p171hq.C4635jd;
import com.aspose.slides.internal.p171hq.C4637k4;
import com.aspose.slides.internal.p171hq.C4639kp;
import com.aspose.slides.internal.p171hq.C4641lr;
import com.aspose.slides.internal.p171hq.C4647os;
import com.aspose.slides.internal.p171hq.C4648qm;
import com.aspose.slides.internal.p171hq.C4649qq;
import com.aspose.slides.internal.p171hq.C4650qw;
import com.aspose.slides.internal.p171hq.C4652rv;
import com.aspose.slides.internal.p171hq.C4653s7;
import com.aspose.slides.internal.p171hq.C4654ss;
import com.aspose.slides.internal.p171hq.C4659ts;
import com.aspose.slides.internal.p171hq.C4661um;
import com.aspose.slides.internal.p171hq.C4662up;
import com.aspose.slides.internal.p171hq.C4664v4;
import com.aspose.slides.internal.p171hq.C4665vh;
import com.aspose.slides.internal.p171hq.C4666vj;
import com.aspose.slides.internal.p171hq.C4667w6;
import com.aspose.slides.internal.p171hq.C4668wl;
import com.aspose.slides.internal.p171hq.C4670wy;
import com.aspose.slides.internal.p171hq.C4675xw;
import com.aspose.slides.internal.p171hq.C4678yd;
import com.aspose.slides.internal.p171hq.C4680yo;
import com.aspose.slides.internal.p171hq.C4681zj;
import com.aspose.slides.internal.p298nh.AbstractC6888dy;
import com.aspose.slides.internal.p298nh.AbstractC6897x1;
import com.aspose.slides.internal.p298nh.C6885c5;
import com.aspose.slides.internal.p298nh.C6886ck;
import com.aspose.slides.internal.p298nh.C6889fa;
import com.aspose.slides.internal.p298nh.C6891jd;
import com.aspose.slides.internal.p298nh.C6892k4;
import com.aspose.slides.internal.p298nh.C6893kk;
import com.aspose.slides.internal.p298nh.C6894m9;
import com.aspose.slides.internal.p298nh.C6895to;
import com.aspose.slides.internal.p298nh.C6896up;
import com.aspose.slides.internal.p298nh.C6898yj;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p403so.C10278qw;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12012lr;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p475wh.C12018u4;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.internal.p500xi.AbstractC12536x1;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.bu.kk */
/* JADX INFO: loaded from: classes3.dex */
public class C1853kk {
    /* JADX INFO: renamed from: k4 */
    public static int m9648k4(int i, int i2, boolean z) {
        int i3 = 1 << i2;
        return z ? i | i3 : i & (~i3);
    }

    /* JADX INFO: renamed from: x1 */
    private static long m9666x1(AbstractC6897x1 abstractC6897x1) {
        if (C7019kk.m27469x1(abstractC6897x1, C6896up.class)) {
            return 0L;
        }
        if (C7019kk.m27469x1(abstractC6897x1, C6894m9.class)) {
            return 1L;
        }
        if (C7019kk.m27469x1(abstractC6897x1, C6891jd.class)) {
            return 4L;
        }
        if (C7019kk.m27469x1(abstractC6897x1, C6886ck.class)) {
            return 3L;
        }
        if (C7019kk.m27469x1(abstractC6897x1, C6898yj.class)) {
            return 2L;
        }
        throw new ArgumentException("brush");
    }

    /* JADX INFO: renamed from: k4 */
    private static C4610b3 m9649k4(C6893kk c6893kk) {
        if (c6893kk == null) {
            return null;
        }
        C4610b3 c4610b3 = new C4610b3();
        c4610b3.m19029k4(new C4612bv());
        c4610b3.m19027k4().m19054k4(new C4659ts());
        C6892k4 c6892k4 = (C6892k4) C7019kk.m27452k4((Object) c6893kk, C6892k4.class);
        if (c6892k4 != null) {
            c4610b3.m19027k4().m19038k4(1);
            C4664v4 c4664v4 = new C4664v4();
            c4664v4.m19394k4(c6892k4.m27008to());
            c4664v4.m19406x1(c6892k4.m27009x1());
            c4664v4.m19401kk(c6892k4.m27007kk());
            c4664v4.m19398k4(c6892k4.m27005k4());
            int[] iArr = {0};
            int[] iArr2 = {0};
            c6892k4.m27015k4(iArr, iArr2);
            int i = iArr[0];
            int i2 = iArr2[0];
            c4664v4.m19396k4(((long) i) & 4294967295L);
            c4664v4.m19407x1(((long) i2) & 4294967295L);
            c4664v4.m19395k4(c6892k4.m27017m9());
            c4664v4.m19403to(10.0f);
            c4664v4.m19389du(c6892k4.m27012dy());
            c4664v4.m19397k4(new C4681zj());
            c4664v4.m19408x1(new C4681zj());
            c4610b3.m19027k4().m19039k4(c4664v4);
        } else {
            c4610b3.m19027k4().m19038k4(0);
            C4641lr c4641lr = new C4641lr();
            c4641lr.m19224x1(((long) c6893kk.m27011du()) & 4294967295L);
            c4641lr.m19210k4(c6893kk.m27013h4());
            int[] iArr3 = {0};
            int[] iArr4 = {0};
            c6893kk.m27015k4(iArr3, iArr4);
            int i3 = iArr3[0];
            int i4 = iArr4[0];
            c4641lr.m19218kk(((long) i3) & 4294967295L);
            c4641lr.m19221to(((long) i4) & 4294967295L);
            c4641lr.m19211k4(c6893kk.m27017m9());
            c4641lr.m19223x1(10.0f);
            c4641lr.m19217kk(c6893kk.m27012dy());
            c4641lr.m19214k4(new C4681zj());
            c4641lr.m19225x1(new C4681zj());
            c4641lr.m19213k4(new C4678yd());
            if (c6893kk.m27010c5() != null) {
                C4608ak c4608ak = new C4608ak();
                c4608ak.m19024k4(m9660k4(c6893kk.m27010c5()));
                c4608ak.m19023k4(c4608ak.m19022k4().mo19017h4());
                c4641lr.m19207fa().m19511k4(c4608ak);
                c4641lr.m19212k4(c4641lr.m19209k4() | 1);
            }
            if (c6893kk.m27014jd() != null) {
                C4654ss c4654ss = new C4654ss();
                c4654ss.m19344k4(m9660k4(c6893kk.m27014jd()));
                c4654ss.m19343k4(c4654ss.m19346x1().mo19017h4());
                c4641lr.m19207fa().m19512k4(c4654ss);
                c4641lr.m19212k4(c4641lr.m19209k4() | 2);
            }
            c4610b3.m19027k4().m19039k4(c4641lr);
        }
        c4610b3.m19028k4(((long) c4610b3.m19027k4().mo19017h4()) & 4294967295L);
        return c4610b3;
    }

    /* JADX INFO: renamed from: x1 */
    private static C4661um m9667x1(C6893kk c6893kk) {
        if (c6893kk == null) {
            return null;
        }
        C4661um c4661um = new C4661um();
        c4661um.m19376k4(new C4612bv());
        c4661um.m19374k4().m19054k4(new C4659ts());
        C6892k4 c6892k4 = (C6892k4) C7019kk.m27452k4((Object) c6893kk, C6892k4.class);
        if (c6892k4 != null) {
            c4661um.m19374k4().m19038k4(1);
            C4664v4 c4664v4 = new C4664v4();
            c4664v4.m19394k4(c6892k4.m27008to());
            c4664v4.m19406x1(c6892k4.m27009x1());
            c4664v4.m19401kk(c6892k4.m27007kk());
            c4664v4.m19398k4(c6892k4.m27005k4());
            int[] iArr = {0};
            int[] iArr2 = {0};
            c6892k4.m27015k4(iArr, iArr2);
            int i = iArr[0];
            int i2 = iArr2[0];
            c4664v4.m19396k4(((long) i) & 4294967295L);
            c4664v4.m19407x1(4294967295L & ((long) i2));
            c4664v4.m19395k4(c6892k4.m27017m9());
            c4664v4.m19403to(10.0f);
            c4664v4.m19389du(c6892k4.m27012dy());
            c4664v4.m19397k4(new C4681zj());
            c4664v4.m19408x1(new C4681zj());
            c4661um.m19374k4().m19039k4(c4664v4);
        } else {
            c4661um.m19374k4().m19038k4(0);
            C4641lr c4641lr = new C4641lr();
            c4641lr.m19224x1(((long) c6893kk.m27011du()) & 4294967295L);
            c4641lr.m19210k4(c6893kk.m27013h4());
            int[] iArr3 = {0};
            int[] iArr4 = {0};
            c6893kk.m27015k4(iArr3, iArr4);
            int i3 = iArr3[0];
            int i4 = iArr4[0];
            c4641lr.m19218kk(((long) i3) & 4294967295L);
            c4641lr.m19221to(4294967295L & ((long) i4));
            c4641lr.m19211k4(c6893kk.m27017m9());
            c4641lr.m19223x1(10.0f);
            c4641lr.m19217kk(c6893kk.m27012dy());
            c4641lr.m19214k4(new C4681zj());
            c4641lr.m19225x1(new C4681zj());
            c4641lr.m19213k4(new C4678yd());
            if (c6893kk.m27010c5() != null) {
                C4608ak c4608ak = new C4608ak();
                c4608ak.m19024k4(m9660k4(c6893kk.m27010c5()));
                c4608ak.m19023k4(c4608ak.m19022k4().mo19017h4());
                c4641lr.m19207fa().m19511k4(c4608ak);
                c4641lr.m19212k4(c4641lr.m19209k4() | 1);
            }
            if (c6893kk.m27014jd() != null) {
                C4654ss c4654ss = new C4654ss();
                c4654ss.m19344k4(m9660k4(c6893kk.m27014jd()));
                c4654ss.m19343k4(c4654ss.m19346x1().mo19017h4());
                c4641lr.m19207fa().m19512k4(c4654ss);
                c4641lr.m19212k4(c4641lr.m19209k4() | 2);
            }
            c4661um.m19374k4().m19039k4(c4641lr);
        }
        c4661um.m19375k4(c4661um.m19374k4().mo19017h4());
        return c4661um;
    }

    /* JADX INFO: renamed from: k4 */
    private static C4621e0 m9650k4(C6894m9 c6894m9) {
        C4621e0 c4621e0 = new C4621e0();
        c4621e0.m19087x1(new C4637k4(c6894m9.m27019kk().Clone()));
        c4621e0.m19084k4(new C4637k4(c6894m9.m27021x1().Clone()));
        c4621e0.m19083k4(((long) c6894m9.m27020to()) & 4294967295L);
        return c4621e0;
    }

    /* JADX INFO: renamed from: k4 */
    public static C4625g8 m9651k4(C6885c5 c6885c5) {
        C4625g8 c4625g8 = new C4625g8();
        c4625g8.m19096k4(0);
        c4625g8.m19097k4(((long) c6885c5.m26949k4()) & 4294967295L);
        c4625g8.m19098k4(new C4637k4(c6885c5.m26952x1().Clone()));
        c4625g8.m19105x1(0);
        c4625g8.m19101kk(0);
        return c4625g8;
    }

    /* JADX INFO: renamed from: k4 */
    public static C4630he m9652k4(C12018u4 c12018u4) {
        C3134k4 c3134k4 = new C3134k4(new C3152yj(c12018u4.m56757kk().m55611k4()));
        c3134k4.m13386x6();
        c3134k4.m13386x6();
        return (C4630he) new C10278qw().m50232k4(c3134k4);
    }

    /* JADX INFO: renamed from: k4 */
    private static C4631ig m9653k4(C6898yj c6898yj) {
        C4631ig c4631ig = new C4631ig();
        C4628gk c4628gk = new C4628gk();
        if (!c6898yj.m27028x1().m55789x1()) {
            c4628gk.m19115k4(m9661k4(c6898yj.m27028x1()));
            c4631ig.m19142k4(c4631ig.m19141k4() | 2);
        }
        c4628gk.m19114k4(m9657k4(new C6895to(((C12012lr) c6898yj.mo26959k4()).m56619h4())));
        c4631ig.m19146x1(((long) c6898yj.m27027kk()) & 4294967295L);
        c4631ig.m19143k4(c4628gk);
        return c4631ig;
    }

    /* JADX INFO: renamed from: k4 */
    public static C4633j2 m9654k4(C6889fa c6889fa) {
        C4667w6 c4667w6 = new C4667w6();
        c4667w6.m19436k4(128L);
        C4647os c4647os = new C4647os();
        if (!c6889fa.m26984rv().m55789x1()) {
            c4647os.m19293k4(m9661k4(c6889fa.m26984rv()));
        }
        c4647os.m19288k4(((long) c6889fa.m26982ks()) & 4294967295L);
        c4647os.m19305x1(((long) c6889fa.m26971fa()) & 4294967295L);
        c4647os.m19287k4(c6889fa.m26986up());
        c4647os.m19286k4(c6889fa.m26991yj());
        c4647os.m19304x1(c6889fa.m26968ck());
        c4647os.m19297kk(c6889fa.m26970dy());
        c4647os.m19303x1(c6889fa.m26967c5());
        if (c6889fa.m26968ck() == 5 && c6889fa.m26973jd().length > 0) {
            c4647os.m19292k4(new C4670wy());
            c4647os.m19284jd().m19455k4(c6889fa.m26973jd());
            c4647os.m19284jd().m19454k4(4294967295L & ((long) c6889fa.m26973jd().length));
            c4667w6.m19436k4(c4667w6.m19433k4() | 256);
        }
        c4647os.m19300to(c6889fa.m26987x1());
        if (c6889fa.m26969du().length > 0) {
            c4647os.m19291k4(new C4668wl());
            c4647os.m19283fa().m19443k4(c6889fa.m26969du());
            c4647os.m19283fa().m19442k4(c6889fa.m26969du().length);
        }
        if (c6889fa.m26982ks() == 255) {
            c4647os.m19289k4(m9649k4(c6889fa.m26983m9()));
            c4667w6.m19436k4(c4667w6.m19433k4() | 2);
            c4667w6.m19436k4(c4667w6.m19433k4() | 2048);
        }
        if (c6889fa.m26971fa() == 255) {
            c4647os.m19290k4(m9667x1(c6889fa.m26972h4()));
            c4667w6.m19436k4(c4667w6.m19433k4() | 4);
            c4667w6.m19436k4(c4667w6.m19433k4() | 4096);
        }
        if (c6889fa.m26987x1() != 0) {
            c4667w6.m19436k4(c4667w6.m19433k4() | 512);
        }
        if (c6889fa.m26969du().length > 0) {
            c4667w6.m19436k4(c4667w6.m19433k4() | 1024);
        }
        if (c6889fa.m26968ck() != 0 && c6889fa.m26968ck() != 5) {
            c4667w6.m19436k4(c4667w6.m19433k4() | 32);
        }
        if (c6889fa.m26970dy() != 0) {
            c4667w6.m19436k4(c4667w6.m19433k4() | 64);
        }
        if (c6889fa.m26971fa() != 0) {
            c4667w6.m19436k4(c4667w6.m19433k4() | 4);
        }
        if (c6889fa.m26982ks() != 0) {
            c4667w6.m19436k4(c4667w6.m19433k4() | 2);
        }
        if (c6889fa.m26986up() != 0) {
            c4667w6.m19436k4(c4667w6.m19433k4() | 8);
        }
        if (C14116yg.m67480k4(c6889fa.m26991yj() - 10.0f) > 0.001d) {
            c4667w6.m19436k4(c4667w6.m19433k4() | 16);
        }
        c4667w6.m19435k4(0);
        c4667w6.m19434k4(c6889fa.m26990x6());
        c4667w6.m19437k4(c4647os);
        C4633j2 c4633j2 = new C4633j2();
        c4633j2.m19157k4(c4667w6);
        c4633j2.m19156k4(m9658k4(c6889fa.m26979kk()));
        return c4633j2;
    }

    /* JADX INFO: renamed from: k4 */
    private static C4634j5 m9655k4(C6896up c6896up) {
        C4634j5 c4634j5 = new C4634j5();
        c4634j5.m19164k4(new C4637k4(c6896up.m27024x1().Clone()));
        return c4634j5;
    }

    /* JADX INFO: renamed from: k4 */
    private static C4639kp m9656k4(C6891jd c6891jd) {
        C4639kp c4639kp = new C4639kp();
        c4639kp.m19189k4(2L);
        c4639kp.m19192k4(new C4637k4(c6891jd.m27003to()[1].Clone()));
        c4639kp.m19199x1(new C4637k4(c6891jd.m27003to()[0].Clone()));
        c4639kp.m19190k4(new C4616ca(c6891jd.m26996h4().Clone()));
        c4639kp.m19198x1(((long) c6891jd.m26995dy()) & 4294967295L);
        if (c6891jd.m27001kk()) {
            c4639kp.m19189k4(c4639kp.m19187k4() | 128);
        }
        C4627gi c4627gi = new C4627gi();
        c4627gi.m19109k4(m9661k4(c6891jd.m27002m9()));
        if (c6891jd.m27004x1() != null) {
            c4639kp.m19189k4(c4639kp.m19187k4() | 8);
            C4635jd c4635jd = new C4635jd();
            c4635jd.m19076k4(4294967295L & ((long) c6891jd.m27004x1().m55747x1().length));
            c4635jd.m19167x1(new float[c6891jd.m27004x1().m55747x1().length]);
            c4635jd.m19077k4(new float[c6891jd.m27004x1().m55744kk().length]);
            for (int i = 0; i < c4635jd.m19166kk().length; i++) {
                c4635jd.m19166kk()[i] = c6891jd.m27004x1().m55747x1()[i];
                c4635jd.m19079k4()[i] = c6891jd.m27004x1().m55744kk()[i];
            }
            c4627gi.m19110k4(new C4620dy[]{null, c4635jd});
        } else {
            try {
                C4614c5 c4614c5 = new C4614c5();
                c4614c5.m19076k4(4294967295L & ((long) c6891jd.m26994du().m55668k4().length));
                c4614c5.m19051k4(new C4637k4[c6891jd.m26994du().m55668k4().length]);
                c4614c5.m19077k4(new float[c6891jd.m26994du().m55669x1().length]);
                for (int i2 = 0; i2 < c4614c5.m19052kk().length; i2++) {
                    c4614c5.m19052kk()[i2] = new C4637k4(c6891jd.m26994du().m55668k4()[i2].Clone());
                    c4614c5.m19079k4()[i2] = c6891jd.m26994du().m55669x1()[i2];
                }
                c4627gi.m19110k4(new C4620dy[]{c4614c5});
                c4639kp.m19189k4(c4639kp.m19187k4() | 4);
            } catch (ArgumentException unused) {
            }
        }
        c4639kp.m19188k4(SupportMenu.CATEGORY_MASK);
        c4639kp.m19197x1(-16776961);
        c4639kp.m19191k4(c4627gi);
        return c4639kp;
    }

    /* JADX INFO: renamed from: k4 */
    public static C4648qm m9657k4(AbstractC6888dy abstractC6888dy) {
        C3152yj c3152yj;
        if (C7019kk.m27469x1(abstractC6888dy, C6895to.class)) {
            AbstractC12002ck abstractC12002ckM27022k4 = ((C6895to) abstractC6888dy).m27022k4();
            C4648qm c4648qm = new C4648qm();
            c4648qm.m19309k4(1L);
            C4629h4 c4629h4 = new C4629h4();
            c4629h4.m19132x1(1L);
            C4649qq c4649qq = new C4649qq();
            c3152yj = new C3152yj();
            try {
                abstractC12002ckM27022k4.m56333k4(c3152yj, C3977ck.m15681jd());
                c4649qq.m19313k4(m9664k4(c3152yj.toArray()));
                c3152yj.dispose();
                c4629h4.m19125k4((AbstractC4671x1) c4649qq);
                c4648qm.m19310k4(c4629h4);
                return c4648qm;
            } finally {
            }
        }
        AbstractC12536x1 abstractC12536x1 = (AbstractC12536x1) C7019kk.m27452k4((Object) abstractC6888dy, AbstractC12536x1.class);
        if (abstractC12536x1 == null) {
            throw new ArgumentException("unknown image type");
        }
        C4648qm c4648qm2 = new C4648qm();
        c4648qm2.m19309k4(2L);
        C4653s7 c4653s7 = new C4653s7();
        c4653s7.m19336k4(4L);
        c3152yj = new C3152yj();
        try {
            abstractC12536x1.mo13499a_(c3152yj);
            c3152yj.seek(0L, 0);
            c4653s7.m19337k4(c3152yj.toArray());
            c4653s7.m19341x1(((long) c4653s7.m19339m9().length) & 4294967295L);
            c3152yj.dispose();
            c4648qm2.m19310k4(c4653s7);
            return c4648qm2;
        } finally {
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static C4652rv m9658k4(AbstractC6897x1 abstractC6897x1) {
        AbstractC4638kk abstractC4638kkM9655k4;
        C4652rv c4652rv = new C4652rv();
        c4652rv.m19331k4(m9666x1(abstractC6897x1));
        int iM19334x1 = (int) c4652rv.m19334x1();
        if (iM19334x1 == 0) {
            abstractC4638kkM9655k4 = m9655k4((C6896up) abstractC6897x1);
        } else if (iM19334x1 == 1) {
            abstractC4638kkM9655k4 = m9650k4((C6894m9) abstractC6897x1);
        } else if (iM19334x1 == 2) {
            abstractC4638kkM9655k4 = m9653k4((C6898yj) abstractC6897x1);
        } else if (iM19334x1 == 3) {
            abstractC4638kkM9655k4 = m9659k4((C6886ck) abstractC6897x1);
        } else {
            if (iM19334x1 != 4) {
                return c4652rv;
            }
            abstractC4638kkM9655k4 = m9656k4((C6891jd) abstractC6897x1);
        }
        c4652rv.m19332k4(abstractC4638kkM9655k4);
        return c4652rv;
    }

    /* JADX INFO: renamed from: k4 */
    private static C4666vj m9659k4(C6886ck c6886ck) {
        C4666vj c4666vj = new C4666vj();
        c4666vj.m19420k4(0L);
        c4666vj.m19432x1(((long) c6886ck.m26958jd()) & 4294967295L);
        c4666vj.m19422k4(new C4637k4(c6886ck.m26964to().Clone()));
        c4666vj.m19424k4(new C4681zj(c6886ck.m26955du().Clone()));
        c4666vj.m19420k4(c4666vj.m19419k4() | 1);
        C4662up c4662up = new C4662up();
        c4662up.m19382k4(m9660k4(c6886ck.m26965x1()));
        c4662up.m19381k4(c4662up.m19380k4().mo19017h4());
        c4666vj.m19421k4((C4624fa) c4662up);
        int length = c6886ck.m26965x1().m55565kk().length;
        int i = 0;
        if (c6886ck.m26956dy() == null || c6886ck.m26956dy().length <= 0) {
            c4666vj.m19428kk(0L);
        } else if (c6886ck.m26956dy().length <= 1 || c6886ck.m26956dy().length >= length) {
            c4666vj.m19428kk(((long) c6886ck.m26956dy().length) & 4294967295L);
            c4666vj.m19425k4(new C4637k4[(int) c4666vj.m19417du()]);
            for (int i2 = 0; i2 < c6886ck.m26956dy().length; i2++) {
                c4666vj.m19429m9()[i2] = new C4637k4(c6886ck.m26956dy()[i2].Clone());
            }
        } else {
            c4666vj.m19428kk(((long) length) & 4294967295L);
            c4666vj.m19425k4(new C4637k4[(int) c4666vj.m19417du()]);
            for (int i3 = 0; i3 < c6886ck.m26956dy().length; i3++) {
                c4666vj.m19429m9()[i3] = new C4637k4(c6886ck.m26956dy()[i3].Clone());
            }
            for (int length2 = c6886ck.m26956dy().length; length2 < length; length2++) {
                c4666vj.m19429m9()[length2] = new C4637k4(c6886ck.m26956dy()[c6886ck.m26956dy().length - 1].Clone());
            }
        }
        C4665vh c4665vh = new C4665vh();
        if (!c6886ck.m26954c5().m55789x1()) {
            c4665vh.m19412k4(m9661k4(c6886ck.m26954c5()));
            c4666vj.m19420k4(c4666vj.m19419k4() | 2);
        }
        if (c6886ck.f18831k4) {
            C4614c5 c4614c5 = new C4614c5();
            c4614c5.m19076k4(4294967295L & ((long) c6886ck.m26963m9().m55668k4().length));
            c4614c5.m19051k4(new C4637k4[c6886ck.m26963m9().m55668k4().length]);
            c4614c5.m19077k4(new float[c6886ck.m26963m9().m55669x1().length]);
            while (i < c4614c5.m19052kk().length) {
                c4614c5.m19052kk()[i] = new C4637k4(c6886ck.m26963m9().m55668k4()[i].Clone());
                c4614c5.m19079k4()[i] = c6886ck.m26963m9().m55669x1()[i];
                i++;
            }
            c4665vh.m19411k4((C4620dy) c4614c5);
            c4666vj.m19420k4(c4666vj.m19419k4() | 4);
        } else if (c6886ck.f18834x1) {
            c4666vj.m19420k4(c4666vj.m19419k4() | 8);
            C4635jd c4635jd = new C4635jd();
            c4635jd.m19076k4(4294967295L & ((long) c6886ck.m26962kk().m55747x1().length));
            c4635jd.m19167x1(new float[c6886ck.m26962kk().m55747x1().length]);
            c4635jd.m19077k4(new float[c6886ck.m26962kk().m55744kk().length]);
            while (i < c4635jd.m19166kk().length) {
                c4635jd.m19166kk()[i] = c6886ck.m26962kk().m55747x1()[i];
                c4635jd.m19079k4()[i] = c6886ck.m26962kk().m55744kk()[i];
                i++;
            }
            c4665vh.m19411k4((C4620dy) c4635jd);
        }
        if (c6886ck.f18832kk) {
            C4618dq c4618dq = new C4618dq();
            c4618dq.m19071k4(c6886ck.m26957h4().m56897x1());
            c4618dq.m19075x1(c6886ck.m26957h4().m56895kk());
            c4618dq.m19072k4(2L);
            c4665vh.m19410k4(c4618dq);
            c4666vj.m19420k4(c4666vj.m19419k4() | 64);
        }
        c4666vj.m19423k4(c4665vh);
        return c4666vj;
    }

    /* JADX INFO: renamed from: k4 */
    public static C4675xw m9660k4(C11896dy c11896dy) {
        if (c11896dy == null) {
            return null;
        }
        C4675xw c4675xw = new C4675xw();
        if (c11896dy.m55573x1().m55672k4().length == 0) {
            c4675xw.m19488k4(0L);
            c4675xw.m19491k4(new C4681zj[0]);
            c4675xw.m19489k4((short) 0);
            c4675xw.m19497x1(new C4650qw[0]);
            return c4675xw;
        }
        C12025x6[] c12025x6ArrM55565kk = c11896dy.m55565kk();
        byte[] bArrM55571to = c11896dy.m55571to();
        c4675xw.m19488k4(((long) c12025x6ArrM55565kk.length) & 4294967295L);
        c4675xw.m19491k4(m9665k4(c12025x6ArrM55565kk));
        C4650qw[] c4650qwArr = new C4650qw[bArrM55571to.length];
        for (int i = 0; i < bArrM55571to.length; i++) {
            C4650qw c4650qw = new C4650qw();
            c4650qw.m19316k4(bArrM55571to[i] & 255);
            c4650qwArr[i] = c4650qw;
        }
        c4675xw.m19497x1(c4650qwArr);
        if (c11896dy.m55531k4() == 1) {
            c4675xw.m19489k4((short) m9648k4(c4675xw.m19495x1(), 13, true));
        }
        return c4675xw;
    }

    /* JADX INFO: renamed from: k4 */
    public static C4680yo m9661k4(C11913yj c11913yj) {
        C4680yo c4680yo = new C4680yo();
        c4680yo.m19526k4(c11913yj.m55776k4()[0]);
        c4680yo.m19533x1(c11913yj.m55776k4()[1]);
        c4680yo.m19528kk(c11913yj.m55776k4()[2]);
        c4680yo.m19531to(c11913yj.m55776k4()[3]);
        c4680yo.m19522du(c11913yj.m55776k4()[4]);
        c4680yo.m19524h4(c11913yj.m55776k4()[5]);
        return c4680yo;
    }

    /* JADX INFO: renamed from: k4 */
    public static C12009k4 m9662k4(AbstractC6888dy abstractC6888dy, C6885c5 c6885c5) {
        C12009k4 c12009k4 = new C12009k4(abstractC6888dy.mo13502h4(), abstractC6888dy.mo13504m9());
        AbstractC12008jd abstractC12008jdM56582k4 = AbstractC12008jd.m56582k4((AbstractC12002ck) c12009k4);
        try {
            abstractC12008jdM56582k4.mo17511k4((AbstractC12002ck) abstractC6888dy.mo13505to(), new C12014ne(0, 0, abstractC6888dy.mo13502h4(), abstractC6888dy.mo13504m9()), 0, 0, abstractC6888dy.mo13502h4(), abstractC6888dy.mo13504m9(), 2, c6885c5.m26951kk());
            abstractC12008jdM56582k4.dispose();
            return c12009k4;
        } finally {
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m9663k4(short s, int i) {
        int i2 = 1 << i;
        return (s & i2) == i2;
    }

    /* JADX INFO: renamed from: k4 */
    public static byte[] m9664k4(byte[] bArr) {
        int length = bArr.length % 4;
        if (length == 0) {
            return bArr;
        }
        byte[] bArr2 = new byte[bArr.length + (4 - length)];
        AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) bArr), 0, AbstractC14092to.m67208k4((Object) bArr2), 0, bArr.length);
        return bArr2;
    }

    /* JADX INFO: renamed from: k4 */
    public static C4681zj[] m9665k4(C12025x6[] c12025x6Arr) {
        if (c12025x6Arr == null) {
            return null;
        }
        C4681zj[] c4681zjArr = new C4681zj[c12025x6Arr.length];
        for (int i = 0; i < c12025x6Arr.length; i++) {
            c4681zjArr[i] = new C4681zj(c12025x6Arr[i].Clone());
        }
        return c4681zjArr;
    }
}
