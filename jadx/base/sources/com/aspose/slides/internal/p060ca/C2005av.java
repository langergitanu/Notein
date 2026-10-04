package com.aspose.slides.internal.p060ca;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.Stack;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.av */
/* JADX INFO: loaded from: classes3.dex */
public class C2005av extends AbstractC2281rv implements InterfaceC2067eg {

    /* JADX INFO: renamed from: du */
    private C2295sq f6983du;

    /* JADX INFO: renamed from: h4 */
    private Stack<Double> f6984h4;

    public C2005av(C2120hx c2120hx, AbstractC2281rv abstractC2281rv, boolean z, boolean z2) {
        super(c2120hx, abstractC2281rv);
        this.f7515x1 = new byte[][]{AbstractC6747ar.m26650yj().mo26677to("/")};
        this.f7511k4 = new byte[][]{AbstractC6747ar.m26650yj().mo26677to("end"), AbstractC6747ar.m26650yj().mo26677to("def"), AbstractC6747ar.m26650yj().mo26677to("readonly def"), AbstractC6747ar.m26650yj().mo26677to("executeonly def"), AbstractC6747ar.m26650yj().mo26677to("noaccess def"), AbstractC6747ar.m26650yj().mo26677to("ND\r"), AbstractC6747ar.m26650yj().mo26677to("ND\n"), AbstractC6747ar.m26650yj().mo26677to("|-\r"), AbstractC6747ar.m26650yj().mo26677to("|-\n")};
        List list = new List();
        list.addItem(new C2026c4(this, c2120hx.m10701k4()));
        list.addItem(new C2280ru(c2120hx, this));
        list.addItem(new C2178lm(this, c2120hx.m10701k4()));
        list.addItem(new C2018bu(this, c2120hx.m10701k4()));
        list.addItem(new C2215nh(this, c2120hx.m10701k4()));
        list.addItem(new C2326up(c2120hx, this));
        list.addItem(new C2369xi(this, c2120hx.m10701k4()));
        list.addItem(new C2144jf(this, c2120hx.m10701k4()));
        if (z) {
            list.addItem(new C2050dl(c2120hx, this, z2));
        }
        list.addItem(new C2235ou(this, c2120hx.m10701k4()));
        m10978k4((AbstractC2167ks[]) list.toArray(new AbstractC2167ks[0]));
    }

    /* JADX INFO: renamed from: k4 */
    public final C2295sq m10224k4() {
        return this.f6983du;
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2281rv, com.aspose.slides.internal.p060ca.AbstractC2167ks
    /* JADX INFO: renamed from: kk */
    public void mo10227kk() {
        this.f6983du = new C2295sq();
        this.f6984h4 = new Stack<>();
        ((C2026c4) m10972dy()[0]).m10977k4(true);
        super.mo10227kk();
    }

    @Override // com.aspose.slides.internal.p060ca.InterfaceC2067eg
    /* JADX INFO: renamed from: x1 */
    public final Stack<Double> mo10228x1() {
        return this.f6984h4;
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2167ks
    /* JADX INFO: renamed from: k4 */
    public void mo10225k4(int i) {
        super.mo10225k4(i);
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2281rv, com.aspose.slides.internal.p060ca.AbstractC2167ks, com.aspose.slides.internal.p060ca.InterfaceC2191m8
    /* JADX INFO: renamed from: k4 */
    public void mo10226k4(Object obj) {
        C2295sq c2295sq;
        C2295sq c2295sq2;
        String strM10278k4;
        C2026c4 c2026c4 = (C2026c4) C7019kk.m27452k4(obj, C2026c4.class);
        if (c2026c4 != null) {
            this.f6983du.m11423k4(c2026c4.m10301k4());
        } else {
            C2369xi c2369xi = (C2369xi) C7019kk.m27452k4(obj, C2369xi.class);
            int i = 0;
            if (c2369xi != null) {
                c2295sq2 = this.f6983du;
                strM10278k4 = c2369xi.m11681k4();
            } else {
                C2215nh c2215nh = (C2215nh) C7019kk.m27452k4(obj, C2215nh.class);
                if (c2215nh != null) {
                    c2295sq2 = this.f6983du;
                    strM10278k4 = c2215nh.m11175k4();
                } else {
                    C2235ou c2235ou = (C2235ou) C7019kk.m27452k4(obj, C2235ou.class);
                    if (c2235ou != null) {
                        c2295sq2 = this.f6983du;
                        strM10278k4 = c2235ou.m11214k4();
                    } else {
                        C2178lm c2178lm = (C2178lm) C7019kk.m27452k4(obj, C2178lm.class);
                        i = 5;
                        if (c2178lm != null) {
                            c2295sq2 = this.f6983du;
                            strM10278k4 = c2178lm.m11022k4();
                        } else {
                            C2018bu c2018bu = (C2018bu) C7019kk.m27452k4(obj, C2018bu.class);
                            if (c2018bu != null) {
                                c2295sq2 = this.f6983du;
                                strM10278k4 = c2018bu.m10278k4();
                            } else {
                                C2144jf c2144jf = (C2144jf) C7019kk.m27452k4(obj, C2144jf.class);
                                if (c2144jf != null) {
                                    this.f6983du.m11422k4(Double.valueOf(c2144jf.m10840k4()));
                                    this.f6983du.m11421k4(2);
                                    mo10228x1().push(Double.valueOf(c2144jf.m10840k4()));
                                    if ("lenIV".equals(this.f6983du.m11420k4())) {
                                        m11351rv().m10698k4(C7019kk.m27462to(Double.valueOf(c2144jf.m10840k4()), 14));
                                    }
                                } else {
                                    C2326up c2326up = (C2326up) C7019kk.m27452k4(obj, C2326up.class);
                                    if (c2326up != null) {
                                        this.f6983du.m11422k4(c2326up.m11516k4());
                                        c2295sq = this.f6983du;
                                        i = 4;
                                    } else {
                                        C2050dl c2050dl = (C2050dl) C7019kk.m27452k4(obj, C2050dl.class);
                                        if (c2050dl != null) {
                                            this.f6983du.m11422k4(c2050dl.m10374k4());
                                            c2295sq = this.f6983du;
                                            i = 3;
                                        } else {
                                            C2280ru c2280ru = (C2280ru) C7019kk.m27452k4(obj, C2280ru.class);
                                            if (c2280ru != null) {
                                                this.f6983du.m11422k4(c2280ru.m11350x6());
                                                c2295sq = this.f6983du;
                                                i = 8;
                                            }
                                        }
                                    }
                                    c2295sq.m11421k4(i);
                                }
                            }
                        }
                    }
                }
            }
            c2295sq2.m11422k4((Object) strM10278k4);
            c2295sq = this.f6983du;
            c2295sq.m11421k4(i);
        }
        super.mo10226k4(obj);
    }
}
