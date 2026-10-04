package com.aspose.slides.internal.p051bz;

import androidx.core.app.FrameMetricsAggregator;
import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p048bv.C1864kk;
import com.aspose.slides.internal.p057c6.C1985m9;
import com.aspose.slides.internal.p057c6.InterfaceC1979du;
import com.aspose.slides.internal.p057c6.InterfaceC1984kk;
import com.aspose.slides.internal.p057c6.InterfaceC1986to;
import com.aspose.slides.internal.p150gi.AbstractC4282kp;
import com.aspose.slides.internal.p150gi.C4261ar;
import com.aspose.slides.internal.p150gi.C4274g8;
import com.aspose.slides.internal.p150gi.C4276h4;
import com.aspose.slides.internal.p150gi.C4279jd;
import com.aspose.slides.internal.p150gi.C4292ss;
import com.aspose.slides.internal.p150gi.C4293sv;
import com.aspose.slides.internal.p150gi.C4304vj;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p380ri.C10009ck;
import com.aspose.slides.internal.p393s7.C10159m9;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14113y2;
import com.orion.penkit.tools.DrawToolFactory;

/* JADX INFO: renamed from: com.aspose.slides.internal.bz.um */
/* JADX INFO: loaded from: classes3.dex */
public class C1925um extends C1906bv {

    /* JADX INFO: renamed from: du */
    private static final Dictionary<String, InterfaceC1911fa> f6852du;

    /* JADX INFO: renamed from: to */
    private C1904ar f6853to;

    static {
        Dictionary<String, InterfaceC1911fa> dictionary = new Dictionary<>();
        f6852du = dictionary;
        dictionary.addItem("ceiling", new C1909du());
        dictionary.addItem("floor", new C1919m9());
        dictionary.addItem("round", new C1932yd());
        dictionary.addItem("min", new C1922rv());
        dictionary.addItem("max", new C1917ks());
        dictionary.addItem("abs", new C1915k4());
        dictionary.addItem("rgb", new C1928v4());
        dictionary.addItem("system-color", new C1905b3());
        dictionary.addItem("from-table-column", new C1907c5());
        dictionary.addItem("inherited-property-value", new C1926up());
        dictionary.addItem("from-parent", new C1910dy());
        dictionary.addItem("from-nearest-specified-value", new C1913ix());
        dictionary.addItem("proportional-column-width", new C1929wl());
        dictionary.addItem("label-end", new C1933yj());
        dictionary.addItem("body-start", new C1930x1());
        dictionary.addItem("rgb-icc", new C1908ck());
        dictionary.addItem("rgb-named-color", new C1920ne());
        dictionary.addItem("cie-lab-color", new C1916kk());
        dictionary.addItem("cmyk", new C1923to());
        dictionary.addItem(DrawToolFactory.LASSO_TYPE_RECT, new C1912h4());
    }

    private C1925um(String str, C1904ar c1904ar) {
        super(str);
        this.f6853to = c1904ar;
    }

    /* JADX INFO: renamed from: du */
    private AbstractC4282kp m9907du() {
        if (this.f6842k4 != 9) {
            return m9916m9();
        }
        m9869k4();
        return m9910k4(m9907du().mo9878h4());
    }

    /* JADX INFO: renamed from: h4 */
    private void m9908h4() {
        if (this.f6842k4 != 4) {
            throw new C1921qq("expected )");
        }
        m9869k4();
    }

    /* JADX INFO: renamed from: k4 */
    private static AbstractC4282kp m9909k4(double d, double d2) {
        return C4293sv.m17270k4(d % d2);
    }

    /* JADX INFO: renamed from: kk */
    private AbstractC4282kp m9914kk() {
        AbstractC4282kp abstractC4282kpM9917to = m9917to();
        boolean z = false;
        while (!z) {
            int i = this.f6842k4;
            if (i == 8) {
                m9869k4();
                abstractC4282kpM9917to = m9911k4(abstractC4282kpM9917to.mo9878h4(), m9917to().mo9878h4());
            } else if (i != 9) {
                z = true;
            } else {
                m9869k4();
                abstractC4282kpM9917to = m9920x1(abstractC4282kpM9917to.mo9878h4(), m9917to().mo9878h4());
            }
        }
        return abstractC4282kpM9917to;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00af  */
    /* JADX INFO: renamed from: m9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private AbstractC4282kp m9916m9() {
        AbstractC4282kp c1931x6;
        double dMo9874x1;
        if (this.f6842k4 == 13) {
            m9869k4();
        }
        int i = this.f6842k4;
        if (i == 1) {
            c1931x6 = new C1931x6(this.f6846x1);
        } else {
            if (i == 3) {
                m9869k4();
                AbstractC4282kp abstractC4282kpM9914kk = m9914kk();
                m9908h4();
                return abstractC4282kpM9914kk;
            }
            if (i == 5) {
                c1931x6 = C4304vj.m17277x1(this.f6846x1);
            } else {
                if (i == 7) {
                    InterfaceC1911fa[] interfaceC1911faArr = {null};
                    boolean zTryGetValue = f6852du.tryGetValue(this.f6846x1, interfaceC1911faArr);
                    InterfaceC1911fa interfaceC1911fa = interfaceC1911faArr[0];
                    if (!zTryGetValue) {
                        throw new C1921qq(C14113y2.m67408k4("no such function: ", this.f6846x1));
                    }
                    m9869k4();
                    this.f6853to.m9851k4(interfaceC1911fa);
                    AbstractC4282kp abstractC4282kpMo9857k4 = interfaceC1911fa.mo9856k4() < 0 ? interfaceC1911fa.mo9857k4(m9921x1(interfaceC1911fa), this.f6853to) : interfaceC1911fa.mo9857k4(m9913k4(interfaceC1911fa), this.f6853to);
                    this.f6853to.m9849h4();
                    return abstractC4282kpMo9857k4;
                }
                if (i != 12) {
                    switch (i) {
                        case 14:
                            String str = this.f6846x1;
                            double dM66427k4 = C14044b3.m66427k4(C10009ck.m49139k4(str, 0, str.length() - 1), FrameMetricsAggregator.EVERY_DURATION, C1864kk.f6725k4.m9751k4()) / 100.0d;
                            InterfaceC1979du interfaceC1979duM9850k4 = this.f6853to.m9850k4();
                            if (interfaceC1979duM9850k4 == null) {
                                c1931x6 = C4293sv.m17270k4(dM66427k4);
                                break;
                            } else if (interfaceC1979duM9850k4.mo9872k4() == 0) {
                                dMo9874x1 = interfaceC1979duM9850k4.mo9874x1() * dM66427k4;
                                c1931x6 = C4293sv.m17270k4(dMo9874x1);
                                break;
                            } else {
                                if (interfaceC1979duM9850k4.mo9872k4() != 1) {
                                    throw new C1921qq("Illegal percent dimension value");
                                }
                                if (!C7019kk.m27469x1(interfaceC1979duM9850k4, C1985m9.class)) {
                                    c1931x6 = new C4292ss(dM66427k4, interfaceC1979duM9850k4);
                                    break;
                                } else if (dM66427k4 != 0.0d) {
                                    InterfaceC1984kk interfaceC1984kkM10114kk = ((C1985m9) interfaceC1979duM9850k4).m10114kk();
                                    if (interfaceC1984kkM10114kk != null && interfaceC1984kkM10114kk.mo9883kk()) {
                                        c1931x6 = C4261ar.m17118k4(dM66427k4 * ((double) interfaceC1984kkM10114kk.mo9884to()));
                                        break;
                                    }
                                } else {
                                    c1931x6 = C4261ar.f11596k4;
                                    break;
                                }
                            }
                            break;
                        case 15:
                            c1931x6 = C4276h4.m17236k4(this.f6853to.m9853m9(), this.f6846x1);
                            break;
                        case 16:
                            dMo9874x1 = C14044b3.m66427k4(this.f6846x1, FrameMetricsAggregator.EVERY_DURATION, C1864kk.f6725k4.m9751k4());
                            c1931x6 = C4293sv.m17270k4(dMo9874x1);
                            break;
                        case 17:
                            dMo9874x1 = C14044b3.m66426k4(this.f6846x1);
                            c1931x6 = C4293sv.m17270k4(dMo9874x1);
                            break;
                        default:
                            throw new C1921qq("syntax error");
                    }
                } else {
                    int length = this.f6846x1.length() - this.f6843kk;
                    String strM67422kk = C14113y2.m67422kk(this.f6846x1, length);
                    double dM66427k42 = C14044b3.m66427k4(C10009ck.m49139k4(this.f6846x1, 0, length), FrameMetricsAggregator.EVERY_DURATION, C1864kk.f6725k4.m9751k4());
                    if (C14113y2.m67363du("em", strM67422kk)) {
                        c1931x6 = (AbstractC4282kp) C1924u4.m9898kk(C4293sv.m17270k4(dM66427k42), this.f6853to.m9855x1());
                    } else if (C14113y2.m67363du("ex", strM67422kk)) {
                        C4279jd c4279jdM14384ck = this.f6853to.m9854to().m14384ck();
                        C10159m9 c10159m9Mo14168c_ = this.f6853to.m9854to().m14393k4().mo14107n_().mo14168c_();
                        c1931x6 = C4261ar.m17119k4(dM66427k42 * ((double) c10159m9Mo14168c_.m49955k4(c4279jdM14384ck.m17246k4(c10159m9Mo14168c_)[0], c4279jdM14384ck.f11682k4.mo9884to(), c4279jdM14384ck.m17248x1()).m49968ck()), "mpt");
                    } else {
                        c1931x6 = C14113y2.m67363du("px", strM67422kk) ? C4261ar.m17120k4(dM66427k42, strM67422kk, 72.0f / this.f6853to.m9854to().m14393k4().m14111q_().m59581up()) : C4261ar.m17119k4(dM66427k42, strM67422kk);
                    }
                }
            }
        }
        m9869k4();
        return c1931x6;
    }

    /* JADX INFO: renamed from: to */
    private AbstractC4282kp m9917to() {
        AbstractC4282kp abstractC4282kpM9907du = m9907du();
        boolean z = false;
        while (!z) {
            int i = this.f6842k4;
            if (i == 2) {
                m9869k4();
                abstractC4282kpM9907du = m9915kk(abstractC4282kpM9907du.mo9878h4(), m9907du().mo9878h4());
            } else if (i == 10) {
                m9869k4();
                abstractC4282kpM9907du = m9909k4(C14080ne.m66903fa(abstractC4282kpM9907du.mo9924m9()), C14080ne.m66903fa(m9907du().mo9924m9()));
            } else if (i != 11) {
                z = true;
            } else {
                m9869k4();
                abstractC4282kpM9907du = m9918to(abstractC4282kpM9907du.mo9878h4(), m9907du().mo9878h4());
            }
        }
        return abstractC4282kpM9907du;
    }

    /* JADX INFO: renamed from: x1 */
    private AbstractC4282kp m9919x1() {
        AbstractC4282kp abstractC4282kpM9914kk;
        m9869k4();
        if (this.f6842k4 == 0) {
            return C4304vj.m17277x1(C14113y2.f47374k4);
        }
        C4274g8 c4274g8 = null;
        while (true) {
            abstractC4282kpM9914kk = m9914kk();
            if (this.f6842k4 == 0) {
                break;
            }
            if (c4274g8 == null) {
                c4274g8 = new C4274g8(abstractC4282kpM9914kk);
            } else {
                c4274g8.mo17207k4(abstractC4282kpM9914kk);
            }
        }
        if (c4274g8 == null) {
            return abstractC4282kpM9914kk;
        }
        c4274g8.mo17207k4(abstractC4282kpM9914kk);
        return c4274g8;
    }

    /* JADX INFO: renamed from: k4 */
    private static AbstractC4282kp m9910k4(InterfaceC1986to interfaceC1986to) {
        if (interfaceC1986to != null) {
            return (AbstractC4282kp) C1924u4.m9903x1(interfaceC1986to);
        }
        throw new C1921qq("Non numeric operand to unary minus");
    }

    /* JADX INFO: renamed from: kk */
    private static AbstractC4282kp m9915kk(InterfaceC1986to interfaceC1986to, InterfaceC1986to interfaceC1986to2) {
        if (interfaceC1986to == null || interfaceC1986to2 == null) {
            throw new C1921qq("Non numeric operand in multiplication");
        }
        return (AbstractC4282kp) C1924u4.m9898kk(interfaceC1986to, interfaceC1986to2);
    }

    /* JADX INFO: renamed from: to */
    private static AbstractC4282kp m9918to(InterfaceC1986to interfaceC1986to, InterfaceC1986to interfaceC1986to2) {
        if (interfaceC1986to == null || interfaceC1986to2 == null) {
            throw new C1921qq("Non numeric operand in division");
        }
        return (AbstractC4282kp) C1924u4.m9901to(interfaceC1986to, interfaceC1986to2);
    }

    /* JADX INFO: renamed from: x1 */
    private static AbstractC4282kp m9920x1(InterfaceC1986to interfaceC1986to, InterfaceC1986to interfaceC1986to2) {
        if (interfaceC1986to == null || interfaceC1986to2 == null) {
            throw new C1921qq("Non numeric operand in subtraction");
        }
        return (AbstractC4282kp) C1924u4.m9905x1(interfaceC1986to, interfaceC1986to2);
    }

    /* JADX INFO: renamed from: k4 */
    private static AbstractC4282kp m9911k4(InterfaceC1986to interfaceC1986to, InterfaceC1986to interfaceC1986to2) {
        if (interfaceC1986to == null || interfaceC1986to2 == null) {
            throw new C1921qq("Non numeric operand in addition");
        }
        return (AbstractC4282kp) C1924u4.m9896k4(interfaceC1986to, interfaceC1986to2);
    }

    /* JADX INFO: renamed from: x1 */
    private AbstractC4282kp[] m9921x1(InterfaceC1911fa interfaceC1911fa) {
        int i = -interfaceC1911fa.mo9856k4();
        List list = new List();
        if (this.f6842k4 == 4) {
            m9869k4();
        } else {
            while (true) {
                list.addItem(m9914kk());
                if (this.f6842k4 != 13) {
                    break;
                }
                m9869k4();
            }
            m9908h4();
        }
        if (i <= list.size()) {
            return (AbstractC4282kp[]) C7019kk.m27458kk(list.toArray(new AbstractC4282kp[0]), AbstractC4282kp[].class);
        }
        throw new C1921qq(C14113y2.m67408k4("Expected at least ", C14057f9.m66591x1(i), ", but got ", C14057f9.m66591x1(list.size()), " args for function"));
    }

    /* JADX INFO: renamed from: k4 */
    public static AbstractC4282kp m9912k4(String str, C1904ar c1904ar) {
        try {
            return new C1925um(str, c1904ar).m9919x1();
        } catch (C1921qq e) {
            e.m9887k4(c1904ar);
            throw e;
        } catch (RuntimeException e2) {
            throw e2;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private AbstractC4282kp[] m9913k4(InterfaceC1911fa interfaceC1911fa) {
        int iMo9856k4 = interfaceC1911fa.mo9856k4();
        AbstractC4282kp[] abstractC4282kpArr = new AbstractC4282kp[iMo9856k4];
        int i = 0;
        if (this.f6842k4 == 4) {
            m9869k4();
        } else {
            while (true) {
                AbstractC4282kp abstractC4282kpM9914kk = m9914kk();
                if (i < iMo9856k4) {
                    abstractC4282kpArr[i] = abstractC4282kpM9914kk;
                    i++;
                }
                if (this.f6842k4 != 13) {
                    break;
                }
                m9869k4();
            }
            m9908h4();
        }
        if (i == iMo9856k4 - 1 && interfaceC1911fa.mo9870kk()) {
            abstractC4282kpArr[i] = C4304vj.m17277x1(this.f6853to.m9848du().m17229to());
            i++;
        }
        if (iMo9856k4 == i) {
            return abstractC4282kpArr;
        }
        throw new C1921qq(C14113y2.m67408k4("Expected ", C14057f9.m66591x1(iMo9856k4), ", but got ", C14057f9.m66591x1(i), " args for function"));
    }
}
