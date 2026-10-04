package com.aspose.slides.internal.p300nj;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p087dm.C3181c5;
import com.aspose.slides.internal.p115eq.C3783ck;
import com.aspose.slides.internal.p115eq.C3786fa;
import com.aspose.slides.internal.p298nh.AbstractC6897x1;
import com.aspose.slides.internal.p298nh.C6891jd;
import com.aspose.slides.internal.p298nh.C6896up;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p404sp.C10307du;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p472w8.C11902kk;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.nj.x1 */
/* JADX INFO: loaded from: classes4.dex */
public class C6916x1 extends AbstractC6913k4 {
    public C6916x1() {
        this.f9456h4 = "linearGradient";
    }

    /* JADX INFO: renamed from: k4 */
    public static float m27108k4(float f, float f2, float f3, float f4) {
        float fM67480k4 = C14116yg.m67480k4(f2 - f);
        float fM67480k42 = C14116yg.m67480k4(f4 - f3);
        if (C14116yg.m67480k4(fM67480k42) < 0.001d) {
            return 0.0f;
        }
        if (C14116yg.m67480k4(fM67480k4) < 0.001d) {
            return 90.0f;
        }
        return (float) ((C14116yg.m67498to(fM67480k42, fM67480k4) * 180.0d) / 3.141592653589793d);
    }

    /* JADX INFO: renamed from: bz */
    public final C10307du m27110bz() {
        return (this.f9461x1.containsKey("y1") || C7019kk.m27452k4((Object) m27064c6(), C6916x1.class) == null) ? C10307du.m50262k4(this.f9461x1.get_Item("y1"), C10307du.m50263kk(0.0f)) : ((C6916x1) m27064c6()).m27110bz();
    }

    /* JADX INFO: renamed from: du */
    public final void m27111du(C10307du c10307du) {
        this.f9461x1.set_Item("y2", c10307du.toString());
    }

    /* JADX INFO: renamed from: e0 */
    public final C10307du m27112e0() {
        return (this.f9461x1.containsKey("x1") || C7019kk.m27452k4((Object) m27064c6(), C6916x1.class) == null) ? C10307du.m50262k4(this.f9461x1.get_Item("x1"), C10307du.m50263kk(0.0f)) : ((C6916x1) m27064c6()).m27112e0();
    }

    /* JADX INFO: renamed from: g8 */
    public final C10307du m27113g8() {
        return (this.f9461x1.containsKey("y2") || C7019kk.m27452k4((Object) m27064c6(), C6916x1.class) == null) ? C10307du.m50262k4(this.f9461x1.get_Item("y2"), C10307du.m50263kk(0.0f)) : ((C6916x1) m27064c6()).m27113g8();
    }

    /* JADX INFO: renamed from: kk */
    public final void m27115kk(C10307du c10307du) {
        this.f9461x1.set_Item("y1", c10307du.toString());
    }

    /* JADX INFO: renamed from: qm */
    public final C10307du m27116qm() {
        return (this.f9461x1.containsKey("x2") || C7019kk.m27452k4((Object) m27064c6(), C6916x1.class) == null) ? C10307du.m50262k4(this.f9461x1.get_Item("x2"), C10307du.m50264x1(100.0f)) : ((C6916x1) m27064c6()).m27116qm();
    }

    /* JADX INFO: renamed from: to */
    public final void m27117to(C10307du c10307du) {
        this.f9461x1.set_Item("x2", c10307du.toString());
    }

    /* JADX INFO: renamed from: x1 */
    public final void m27118x1(C10307du c10307du) {
        this.f9461x1.set_Item("x1", c10307du.toString());
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC6897x1 m27114k4(C3181c5 c3181c5, C3783ck c3783ck, C3786fa c3786fa, C12007ix c12007ix, C12007ix c12007ix2, float f) {
        m27070k4(c3783ck);
        C12007ix c12007ixClone = (m27074wy() ? c12007ix : c12007ix2).Clone();
        if (m27074wy() && (c12007ix.m56550c5() == 0.0f || c12007ix.m56575x1() == 0.0f)) {
            return null;
        }
        int i = c3786fa.f10318k4;
        c3786fa.f10318k4 = m27074wy() ? 1 : 0;
        float fM15125k4 = c3786fa.m15125k4(m27112e0(), "x", c3181c5, c12007ixClone.m56570m9().Clone());
        float fM15125k42 = c3786fa.m15125k4(m27110bz(), "y", c3181c5, c12007ixClone.m56570m9().Clone());
        float fM15125k43 = c3786fa.m15125k4(m27116qm(), "x", c3181c5, c12007ixClone.m56570m9().Clone());
        float fM15125k44 = c3786fa.m15125k4(m27113g8(), "y", c3181c5, c12007ixClone.m56570m9().Clone());
        c3786fa.f10318k4 = i;
        C11913yj c11913yjM27069k4 = m27069k4(c3786fa, c12007ixClone.m56570m9().Clone());
        float fM27108k4 = m27108k4(fM15125k4, fM15125k43, fM15125k42, fM15125k44);
        float fM56550c5 = fM15125k43 - fM15125k4;
        float fM56575x1 = fM15125k44 - fM15125k42;
        if (fM56550c5 == 0.0f) {
            fM56550c5 = c12007ixClone.m56550c5();
        } else if (fM56550c5 < 0.0f) {
            fM56550c5 *= -1.0f;
        }
        if (fM56575x1 == 0.0f) {
            fM56575x1 = c12007ixClone.m56575x1();
        } else if (fM56575x1 < 0.0f) {
            fM56575x1 *= -1.0f;
        }
        C11902kk c11902kkM27068k4 = m27068k4(c3786fa, c12007ixClone.Clone(), f, false);
        if (c11902kkM27068k4 == null || c11902kkM27068k4.m55668k4().length == 0) {
            return null;
        }
        if (c11902kkM27068k4.m55668k4().length == 1) {
            return new C6896up(c11902kkM27068k4.m55668k4()[0].Clone());
        }
        boolean z = m27062ak() == 0;
        C12007ix c12007ix3 = new C12007ix(c12007ixClone.m56557jd() + fM15125k4, c12007ixClone.m56551ck() + fM15125k42, fM56550c5, fM56575x1);
        if (z) {
            C11896dy c11896dy = new C11896dy();
            c11896dy.m55578x1(c12007ix3.Clone());
            c11896dy.m55577x1(c11913yjM27069k4);
            C12007ix c12007ixClone2 = c11896dy.m55523c5().Clone();
            float fM67481k4 = C14116yg.m67481k4(c12007ixClone.m56550c5() / c12007ixClone2.m56550c5(), c12007ixClone.m56575x1() / c12007ixClone2.m56575x1());
            c11902kkM27068k4 = m27109k4(c11902kkM27068k4, c12007ixClone.Clone(), fM15125k43 == fM15125k4 ? 0.0f : fM15125k4, fM67481k4);
            c12007ix3.m56566kk(c12007ix3.m56557jd() - fM15125k4);
            c12007ix3.m56576x1(c12007ix3.m56550c5() * fM67481k4);
            c12007ix3.m56560k4(c12007ix3.m56575x1() * fM67481k4);
        }
        if (m27074wy() && m27116qm().m50265k4() == m27113g8().m50265k4() && fM15125k43 > fM15125k44) {
            fM27108k4 = m27108k4(0.0f, fM15125k44, 0.0f, fM15125k43);
        }
        if (m27074wy() && !c11913yjM27069k4.m55789x1() && C14116yg.m67480k4(c12007ixClone.m56550c5() - c12007ixClone.m56575x1()) > 0.01d) {
            fM27108k4 = m27108k4(0.0f, c12007ixClone.m56575x1(), 0.0f, c12007ixClone.m56550c5());
        }
        C6891jd c6891jd = new C6891jd(c12007ix3.Clone(), C12003du.m56385i5().Clone(), C12003du.m56385i5().Clone(), c11913yjM27069k4.m55789x1() ? fM27108k4 : 0.0f);
        c6891jd.m26998k4(c11902kkM27068k4);
        if (m27062ak() != 2) {
            c6891jd.m26997k4(3);
        } else {
            c6891jd.m26997k4(0);
        }
        C11913yj c11913yjM27002m9 = c6891jd.m27002m9();
        c11913yjM27002m9.m55787x1(c11913yjM27069k4);
        if (!c11913yjM27069k4.m55789x1()) {
            c11913yjM27002m9.m55762k4(fM27108k4);
        }
        c6891jd.m26999k4(c11913yjM27002m9);
        c6891jd.m27000k4("linearRGB".equals(m27065dq()));
        return c6891jd;
    }

    /* JADX INFO: renamed from: k4 */
    private C11902kk m27109k4(C11902kk c11902kk, C12007ix c12007ix, float f, float f2) {
        if (f2 <= 1.001f) {
            return c11902kk;
        }
        List list = new List();
        List list2 = new List(AbstractC14092to.m67204k4((Object[]) c11902kk.m55668k4()));
        float fM56550c5 = f / c12007ix.m56550c5();
        if (c11902kk.m55669x1()[0] > 0.0f || C14116yg.m67480k4(fM56550c5) > 0.001d) {
            list.addItem(Float.valueOf(0.0f));
            list2.insertItem(0, ((C12003du) list2.get_Item(0)).Clone());
        }
        for (float f3 : c11902kk.m55669x1()) {
            list.addItem(Float.valueOf((f3 / f2) + fM56550c5));
        }
        list.addItem(Float.valueOf(1.0f));
        list2.addItem(((C12003du) list2.get_Item(list2.size() - 1)).Clone());
        float[] fArr = new float[list.size()];
        list.copyTo(AbstractC14092to.m67208k4(fArr), 0);
        c11902kk.m55666k4(fArr);
        c11902kk.m55667k4((C12003du[]) list2.toArray(new C12003du[0]));
        return c11902kk;
    }
}
