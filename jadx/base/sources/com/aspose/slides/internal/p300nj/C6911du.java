package com.aspose.slides.internal.p300nj;

import com.aspose.slides.C22203OooOO0o;
import com.aspose.slides.C22205OooOOo;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p087dm.C3181c5;
import com.aspose.slides.internal.p115eq.C3783ck;
import com.aspose.slides.internal.p115eq.C3786fa;
import com.aspose.slides.internal.p298nh.AbstractC6897x1;
import com.aspose.slides.internal.p298nh.C6886ck;
import com.aspose.slides.internal.p298nh.C6896up;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p404sp.C10307du;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p472w8.C11902kk;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14116yg;
import com.google.mlkit.p567nl.translate.TranslateLanguage;

/* JADX INFO: renamed from: com.aspose.slides.internal.nj.du */
/* JADX INFO: loaded from: classes4.dex */
public class C6911du extends AbstractC6913k4 {
    public C6911du() {
        this.f9456h4 = "radialGradient";
    }

    /* JADX INFO: renamed from: k4 */
    private float m27042k4(C12007ix c12007ix, C11896dy c11896dy) {
        C12025x6[] c12025x6Arr = {new C12025x6(c12007ix.m56557jd(), c12007ix.m56551ck()), new C12025x6(c12007ix.m56550c5() + c12007ix.m56557jd(), c12007ix.m56551ck()), new C12025x6(c12007ix.m56550c5() + c12007ix.m56557jd(), c12007ix.m56575x1() + c12007ix.m56551ck()), new C12025x6(c12007ix.m56557jd(), c12007ix.m56575x1() + c12007ix.m56551ck())};
        C12007ix c12007ixClone = c11896dy.m55523c5().Clone();
        C12025x6 c12025x6 = new C12025x6(C22205OooOOo.OooO00o(c12007ixClone, 2.0f, c12007ixClone.m56557jd()), C22203OooOO0o.OooO0O0(c12007ixClone, 2.0f, c12007ixClone.m56551ck()));
        C11913yj c11913yjM27044k4 = m27044k4(0.95f, c12025x6.m56897x1(), c12025x6.m56895kk());
        int i = 0;
        while (true) {
            try {
                if (!c11896dy.m55560k4(c12025x6Arr[0].Clone()) || !c11896dy.m55560k4(c12025x6Arr[1].Clone()) || !c11896dy.m55560k4(c12025x6Arr[2].Clone()) || !c11896dy.m55560k4(c12025x6Arr[3].Clone())) {
                    int i2 = i + 1;
                    if (i >= 1000000) {
                        break;
                    }
                    c11913yjM27044k4.m55775k4(c12025x6Arr);
                    i = i2;
                } else {
                    break;
                }
            } catch (Throwable th) {
                if (c11913yjM27044k4 != null) {
                    c11913yjM27044k4.dispose();
                }
                throw th;
            }
        }
        if (c11913yjM27044k4 != null) {
            c11913yjM27044k4.dispose();
        }
        return C14116yg.m67481k4(c12007ix.m56550c5() / (c12025x6Arr[2].m56897x1() - c12025x6Arr[0].m56897x1()), c12007ix.m56575x1() / (c12025x6Arr[2].m56895kk() - c12025x6Arr[0].m56895kk()));
    }

    /* JADX INFO: renamed from: bz */
    public final C10307du m27046bz() {
        return (this.f9461x1.containsKey(TranslateLanguage.WELSH) || C7019kk.m27452k4((Object) m27064c6(), C6911du.class) == null) ? C10307du.m50262k4(this.f9461x1.get_Item(TranslateLanguage.WELSH), C10307du.m50264x1(50.0f)) : ((C6911du) m27064c6()).m27046bz();
    }

    /* JADX INFO: renamed from: e0 */
    public final C10307du m27047e0() {
        return (this.f9461x1.containsKey("cx") || C7019kk.m27452k4((Object) m27064c6(), C6911du.class) == null) ? C10307du.m50262k4(this.f9461x1.get_Item("cx"), C10307du.m50264x1(50.0f)) : ((C6911du) m27064c6()).m27047e0();
    }

    /* JADX INFO: renamed from: g8 */
    public final C10307du m27048g8() {
        if (!this.f9461x1.containsKey("fx")) {
            AbstractC6913k4 abstractC6913k4M27064c6 = m27064c6();
            while (true) {
                C6911du c6911du = (C6911du) C7019kk.m27452k4((Object) abstractC6913k4M27064c6, C6911du.class);
                if (c6911du == null) {
                    break;
                }
                if (c6911du.f9461x1.containsKey("fx")) {
                    return c6911du.m27048g8();
                }
                abstractC6913k4M27064c6 = c6911du.m27064c6();
            }
        }
        return C10307du.m50262k4(this.f9461x1.get_Item("fx"), m27047e0());
    }

    /* JADX INFO: renamed from: kk */
    public final void m27050kk(C10307du c10307du) {
        this.f9461x1.set_Item(TranslateLanguage.WELSH, c10307du.toString());
    }

    /* JADX INFO: renamed from: qm */
    public final C10307du m27051qm() {
        return (this.f9461x1.containsKey("r") || C7019kk.m27452k4((Object) m27064c6(), C6911du.class) == null) ? C10307du.m50262k4(this.f9461x1.get_Item("r"), C10307du.m50264x1(50.0f)) : ((C6911du) m27064c6()).m27051qm();
    }

    /* JADX INFO: renamed from: sv */
    public final C10307du m27052sv() {
        if (!this.f9461x1.containsKey("fy")) {
            AbstractC6913k4 abstractC6913k4M27064c6 = m27064c6();
            while (true) {
                C6911du c6911du = (C6911du) C7019kk.m27452k4((Object) abstractC6913k4M27064c6, C6911du.class);
                if (c6911du == null) {
                    break;
                }
                if (c6911du.f9461x1.containsKey("fy")) {
                    return c6911du.m27048g8();
                }
                abstractC6913k4M27064c6 = c6911du.m27064c6();
            }
        }
        return C10307du.m50262k4(this.f9461x1.get_Item("fy"), m27046bz());
    }

    /* JADX INFO: renamed from: to */
    public final void m27053to(C10307du c10307du) {
        this.f9461x1.set_Item("r", c10307du.toString());
    }

    /* JADX INFO: renamed from: x1 */
    public final void m27054x1(C10307du c10307du) {
        this.f9461x1.set_Item("cx", c10307du.toString());
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC6897x1 m27049k4(C3181c5 c3181c5, C3783ck c3783ck, C3786fa c3786fa, C12007ix c12007ix, C12007ix c12007ix2, float f, C11896dy[] c11896dyArr) {
        m27070k4(c3783ck);
        c11896dyArr[0] = new C11896dy();
        C12007ix c12007ixClone = (m27074wy() ? c12007ix : c12007ix2).Clone();
        C11902kk c11902kkM27068k4 = m27068k4(c3786fa, c12007ixClone.Clone(), f, false);
        if (c11902kkM27068k4 == null || c11902kkM27068k4.m55668k4().length == 0) {
            return null;
        }
        if (c11902kkM27068k4.m55668k4().length == 1) {
            return new C6896up(c11902kkM27068k4.m55668k4()[0].Clone());
        }
        int i = c3786fa.f10318k4;
        c3786fa.f10318k4 = m27074wy() ? 1 : 0;
        float fM15125k4 = c3786fa.m15125k4(m27047e0(), "x", c3181c5, c12007ixClone.m56570m9().Clone());
        float fM15125k42 = c3786fa.m15125k4(m27046bz(), "y", c3181c5, c12007ixClone.m56570m9().Clone());
        float fM15125k43 = c3786fa.m15125k4(m27048g8(), "x", c3181c5, c12007ixClone.m56570m9().Clone());
        float fM15125k44 = c3786fa.m15125k4(m27052sv(), "y", c3181c5, c12007ixClone.m56570m9().Clone());
        float fM15125k45 = c3786fa.m15125k4(m27051qm(), "x", c3181c5, c12007ixClone.m56570m9().Clone());
        float fM15125k46 = c3786fa.m15125k4(m27051qm(), "y", c3181c5, c12007ixClone.m56570m9().Clone());
        c3786fa.f10318k4 = i;
        C12025x6[] c12025x6Arr = {new C12025x6(fM15125k43, fM15125k44)};
        c11896dyArr[0].m55534k4(fM15125k4 - fM15125k45, fM15125k42 - fM15125k46, fM15125k45 * 2.0f, fM15125k46 * 2.0f);
        C11913yj c11913yjM27069k4 = m27069k4(c3786fa, c12007ixClone.m56570m9().Clone());
        try {
            c11913yjM27069k4.m55786x1(c12007ixClone.m56557jd(), c12007ixClone.m56551ck(), 0);
            c11896dyArr[0].m55577x1(c11913yjM27069k4);
            c11913yjM27069k4.m55775k4(c12025x6Arr);
            c11913yjM27069k4.dispose();
            float fFloatValue = c3181c5.f9461x1.containsKey("stroke-width") ? Float.valueOf(c3181c5.f9461x1.get_Item("stroke-width")).floatValue() : 0.0f;
            float fM67501x1 = m27062ak() == 0 ? 1.0f : (float) C14116yg.m67501x1(m27042k4(C12007ix.m56542k4(c12007ix.Clone(), fFloatValue, fFloatValue).Clone().Clone(), c11896dyArr[0]));
            C11902kk c11902kkM27043k4 = m27043k4(c3786fa, c12007ixClone.Clone(), f, fM67501x1);
            C12007ix c12007ixClone2 = c11896dyArr[0].m55523c5().Clone();
            C12025x6 c12025x6 = new C12025x6(C22205OooOOo.OooO00o(c12007ixClone2, 2.0f, c12007ixClone2.m56571to()), C22203OooOO0o.OooO0O0(c12007ixClone2, 2.0f, c12007ixClone2.m56554dy()));
            C11913yj c11913yj = new C11913yj();
            try {
                c11913yj.m55786x1(c12025x6.m56897x1() * (-1.0f), c12025x6.m56895kk() * (-1.0f), 1);
                c11913yj.m55764k4(fM67501x1, fM67501x1, 1);
                c11913yj.m55786x1(c12025x6.m56897x1(), c12025x6.m56895kk(), 1);
                c11896dyArr[0].m55577x1(c11913yj);
                c11913yj.dispose();
                C12025x6 c12025x6Clone = c12025x6Arr[0].Clone();
                if (!c11896dyArr[0].m55560k4(c12025x6Clone.Clone())) {
                    m27045k4(c12025x6Clone.Clone(), c11896dyArr[0]).CloneTo(c12025x6Clone);
                }
                C6886ck c6886ck = new C6886ck(c11896dyArr[0]);
                c6886ck.m26961k4(c12025x6Clone.Clone());
                c6886ck.m26960k4(c11902kkM27043k4);
                return c6886ck;
            } catch (Throwable th) {
                c11913yj.dispose();
                throw th;
            }
        } catch (Throwable th2) {
            if (c11913yjM27069k4 != null) {
                c11913yjM27069k4.dispose();
            }
            throw th2;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private C11902kk m27043k4(C3786fa c3786fa, C12007ix c12007ix, float f, float f2) {
        int i = 1;
        C11902kk c11902kkM27068k4 = m27068k4(c3786fa, c12007ix.Clone(), f, true);
        List list = new List();
        List list2 = new List(AbstractC14092to.m67204k4((Object[]) c11902kkM27068k4.m55668k4()));
        if (f2 > 1.0f) {
            int iM27062ak = m27062ak();
            if (iM27062ak == 1) {
                for (float f3 : c11902kkM27068k4.m55669x1()) {
                    list.addItem(Float.valueOf(((f3 - 1.0f) / f2) + 1.0f));
                }
                for (int i2 = 1; i2 < f2; i2++) {
                    if (i2 % 2 == 1) {
                        for (int i3 = 1; i3 < c11902kkM27068k4.m55669x1().length; i3++) {
                            list.insertItem(0, Float.valueOf(((Float) list.get_Item(0)).floatValue() - ((c11902kkM27068k4.m55669x1()[i3] - c11902kkM27068k4.m55669x1()[i3 - 1]) / f2)));
                            list2.insertItem(0, c11902kkM27068k4.m55668k4()[i3].Clone());
                        }
                    } else {
                        int i4 = 0;
                        while (i4 < c11902kkM27068k4.m55669x1().length - 1) {
                            int i5 = i4 + 1;
                            list.insertItem(0, Float.valueOf(((Float) list.get_Item(0)).floatValue() - ((c11902kkM27068k4.m55669x1()[i5] - c11902kkM27068k4.m55669x1()[i4]) / f2)));
                            list2.insertItem(i4, c11902kkM27068k4.m55668k4()[i4].Clone());
                            i4 = i5;
                        }
                    }
                }
                float[] fArr = new float[list.size()];
                list.copyTo(AbstractC14092to.m67208k4(fArr), 0);
                c11902kkM27068k4.m55666k4(fArr);
                c11902kkM27068k4.m55667k4((C12003du[]) list2.toArray(new C12003du[0]));
            } else if (iM27062ak == 2) {
                float fM67501x1 = (float) C14116yg.m67501x1(f2);
                for (float f4 : c11902kkM27068k4.m55669x1()) {
                    list.addItem(Float.valueOf(f4 / fM67501x1));
                }
                while (true) {
                    float f5 = i;
                    if (f5 >= fM67501x1) {
                        float[] fArr2 = new float[list.size()];
                        list.copyTo(AbstractC14092to.m67208k4(fArr2), 0);
                        c11902kkM27068k4.m55666k4(fArr2);
                        c11902kkM27068k4.m55667k4((C12003du[]) list2.toArray(new C12003du[0]));
                        return c11902kkM27068k4;
                    }
                    for (int i6 = 0; i6 < c11902kkM27068k4.m55669x1().length; i6++) {
                        float f6 = (c11902kkM27068k4.m55669x1()[i6] + f5) / fM67501x1;
                        if (i6 == 0) {
                            f6 += 0.001f;
                        }
                        list.addItem(Float.valueOf(f6));
                    }
                    list2.addRange(AbstractC14092to.m67204k4((Object[]) c11902kkM27068k4.m55668k4()));
                    i++;
                }
            }
        }
        return c11902kkM27068k4;
    }

    /* JADX INFO: renamed from: k4 */
    private static C11913yj m27044k4(float f, float f2, float f3) {
        C11913yj c11913yj = new C11913yj();
        c11913yj.m55786x1(f2 * (-1.0f), (-1.0f) * f3, 1);
        c11913yj.m55764k4(f, f, 1);
        c11913yj.m55786x1(f2, f3, 1);
        return c11913yj;
    }

    /* JADX INFO: renamed from: k4 */
    private C12025x6 m27045k4(C12025x6 c12025x6, C11896dy c11896dy) {
        C12025x6[] c12025x6Arr = {c12025x6};
        C12007ix c12007ixClone = c11896dy.m55523c5().Clone();
        C12025x6 c12025x62 = new C12025x6(C22205OooOOo.OooO00o(c12007ixClone, 2.0f, c12007ixClone.m56557jd()), C22203OooOO0o.OooO0O0(c12007ixClone, 2.0f, c12007ixClone.m56551ck()));
        C11913yj c11913yjM27044k4 = m27044k4(0.95f, c12025x62.m56897x1(), c12025x62.m56895kk());
        int i = 0;
        while (!c11896dy.m55560k4(c12025x6Arr[0].Clone())) {
            try {
                int i2 = i + 1;
                if (i >= 1000000) {
                    break;
                }
                c11913yjM27044k4.m55775k4(c12025x6Arr);
                i = i2;
            } finally {
                if (c11913yjM27044k4 != null) {
                    c11913yjM27044k4.dispose();
                }
            }
        }
        return c12025x6Arr[0];
    }
}
