package com.aspose.slides.internal.p430tx;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.exceptions.XsltCompileException;
import com.aspose.slides.exceptions.XsltException;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p267m6.C6324x1;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p463vm.C11683c5;
import com.aspose.slides.p559ms.System.C14062gk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.aspose.slides.p559ms.System.Xml.C13851ai;
import com.aspose.slides.p559ms.System.Xml.C13890ei;
import com.huawei.hms.network.embedded.C18358t1;
import com.microsoft.identity.common.java.jwt.AbstractJwtRequest;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.tx.x6 */
/* JADX INFO: loaded from: classes4.dex */
public class C11232x6 extends AbstractC11200ks {

    /* JADX INFO: renamed from: k4 */
    private int f38756k4 = 0;

    /* JADX INFO: renamed from: kk */
    public C11220u4 f38757kk;

    /* JADX INFO: renamed from: x1 */
    public ArrayList f38758x1;

    /* JADX INFO: renamed from: ix */
    private void m54117ix(C11212rv c11212rv) {
        c11212rv.m53907c5().m53886k4().m53804x1(c11212rv);
    }

    /* JADX INFO: renamed from: k4 */
    private double m54118k4(String str) {
        if (C18358t1.g.f56183c.equals(str)) {
            return -0.5d;
        }
        int length = str.length();
        int i = length - 2;
        if (i < 0 || str.charAt(i) != ':' || str.charAt(length - 1) != '*') {
            C11184f9.m53724k4(str, new String[]{null}, new String[]{null});
            return 0.0d;
        }
        if (C11184f9.m53725x1(C14113y2.m67443x1(str, 0, i))) {
            return -0.25d;
        }
        throw XsltException.create("'{1}' is an invalid value for the '{0}' attribute.", "elements", str);
    }

    /* JADX INFO: renamed from: ks */
    private void m54120ks(C11212rv c11212rv) {
        C14062gk c14062gkM53969up = c11212rv.m53969up(c11212rv.m53908c5(c11212rv.m53964to().m53740kk().f15148sv));
        String string = c14062gkM53969up.toString();
        if (c11212rv.m53920fa(string)) {
            throw XsltException.create("Stylesheet '{0}' cannot directly or indirectly include or import itself.", string);
        }
        C11186g8 c11186g8M53932k4 = c11212rv.m53932k4(c14062gkM53969up);
        c11212rv.m53936k4(c11186g8M53932k4);
        try {
            try {
                m54136k4(c11212rv, true);
                c11212rv.m53971uz();
                m53850du(c11212rv);
            } catch (XsltCompileException e) {
                throw e;
            } catch (RuntimeException e2) {
                throw new XsltCompileException(e2, c11186g8M53932k4.m53736ix(), c11186g8M53932k4.m53737jd(), c11186g8M53932k4.m53731ck());
            }
        } catch (Throwable th) {
            c11212rv.m53971uz();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ne */
    private void m54121ne(C11212rv c11212rv) {
        C11186g8 c11186g8M53964to = c11212rv.m53964to();
        if (c11186g8M53964to.m53746to().mo21877x1("use-attribute-sets", c11186g8M53964to.m53740kk().f15174xi)) {
            m54134k4(c11212rv.m53922gi());
            c11186g8M53964to.m53746to().mo21864ne();
        }
        c11212rv.m53951ks();
        if (c11186g8M53964to.m53750wl()) {
            do {
                String strM53752x6 = c11186g8M53964to.m53752x6();
                if (!"http://www.w3.org/1999/XSL/Transform".equals(strM53752x6) && !c11212rv.m53965to(strM53752x6) && !c11212rv.m53948kk(strM53752x6) && !c11212rv.m53914du(strM53752x6)) {
                    m54135k4(new C11174bz(c11186g8M53964to));
                }
            } while (c11186g8M53964to.m53744qq());
            c11186g8M53964to.m53733dy();
        }
        if (c11186g8M53964to.m53747u4()) {
            do {
                if (!C13851ai.m65152k4(c11186g8M53964to.m53741ks(), c11186g8M53964to.m53740kk().f15174xi)) {
                    m54135k4(c11212rv.m53963t6());
                    m54133k4(c11212rv.m53982x6(c11186g8M53964to.m53752x6()));
                    m54135k4(new C11224v4(2));
                }
            } while (c11186g8M53964to.m53749uz());
            c11186g8M53964to.m53733dy();
        }
    }

    /* JADX INFO: renamed from: rv */
    private void m54122rv(C11212rv c11212rv) {
        AbstractC11197k4 abstractC11197k4M53917e0;
        C11186g8 c11186g8M53964to = c11212rv.m53964to();
        String strM53753yj = c11186g8M53964to.m53753yj();
        if (C13851ai.m65152k4(strM53753yj, c11186g8M53964to.m53740kk().f15118kk)) {
            abstractC11197k4M53917e0 = c11212rv.m53968um();
        } else if (C13851ai.m65152k4(strM53753yj, c11186g8M53964to.m53740kk().f15151to)) {
            abstractC11197k4M53917e0 = c11212rv.m53905bv();
        } else if (C13851ai.m65152k4(strM53753yj, c11186g8M53964to.m53740kk().f15106h4)) {
            abstractC11197k4M53917e0 = c11212rv.m53972v4();
        } else if (C13851ai.m65152k4(strM53753yj, c11186g8M53964to.m53740kk().f15094dy)) {
            abstractC11197k4M53917e0 = c11212rv.m53986yd();
        } else if (C13851ai.m65152k4(strM53753yj, c11186g8M53964to.m53740kk().f15158up)) {
            abstractC11197k4M53917e0 = c11212rv.m53904b3();
        } else if (C13851ai.m65152k4(strM53753yj, c11186g8M53964to.m53740kk().f15182yj)) {
            abstractC11197k4M53917e0 = c11212rv.m53976wy();
        } else if (C13851ai.m65152k4(strM53753yj, c11186g8M53964to.m53740kk().f15120ks)) {
            abstractC11197k4M53917e0 = c11212rv.m53902ak();
        } else if (C13851ai.m65152k4(strM53753yj, c11186g8M53964to.m53740kk().f15144rv)) {
            abstractC11197k4M53917e0 = c11212rv.m53912dq();
        } else if (C13851ai.m65152k4(strM53753yj, c11186g8M53964to.m53740kk().f15122lr)) {
            abstractC11197k4M53917e0 = c11212rv.m53984xk();
        } else {
            if (C13851ai.m65152k4(strM53753yj, c11186g8M53964to.m53740kk().f15091dq)) {
                return;
            }
            if (C13851ai.m65152k4(strM53753yj, c11186g8M53964to.m53740kk().f15175xk)) {
                abstractC11197k4M53917e0 = c11212rv.m53909c6();
            } else if (C13851ai.m65152k4(strM53753yj, c11186g8M53964to.m53740kk().f15147ss)) {
                abstractC11197k4M53917e0 = c11212rv.m53978x1(0);
            } else if (C13851ai.m65152k4(strM53753yj, c11186g8M53964to.m53740kk().f15186zj)) {
                abstractC11197k4M53917e0 = c11212rv.m53966ts();
            } else if (C13851ai.m65152k4(strM53753yj, c11186g8M53964to.m53740kk().f15112j5)) {
                abstractC11197k4M53917e0 = c11212rv.m53906bz();
            } else if (C13851ai.m65152k4(strM53753yj, c11186g8M53964to.m53740kk().f15075b1)) {
                abstractC11197k4M53917e0 = c11212rv.m53956qm();
            } else if (C13851ai.m65152k4(strM53753yj, c11186g8M53964to.m53740kk().f15082c4)) {
                abstractC11197k4M53917e0 = c11212rv.m53949kp();
            } else if (C13851ai.m65152k4(strM53753yj, c11186g8M53964to.m53740kk().f15136q6)) {
                abstractC11197k4M53917e0 = c11212rv.m53960s7();
            } else if (C13851ai.m65152k4(strM53753yj, c11186g8M53964to.m53740kk().f15093dw)) {
                abstractC11197k4M53917e0 = c11212rv.m53947kk(2);
            } else {
                if (!c11212rv.m53919fa()) {
                    throw c11212rv.m53973vj();
                }
                abstractC11197k4M53917e0 = c11212rv.m53917e0();
            }
        }
        m54134k4(abstractC11197k4M53917e0);
    }

    /* JADX INFO: renamed from: x6 */
    private void m54123x6(C11212rv c11212rv) {
        AbstractC11201lr c11224v4;
        int iM53734fa = c11212rv.m53964to().m53734fa();
        if (iM53734fa == 1) {
            m54135k4(c11212rv.m53963t6());
            m54121ne(c11212rv);
            if (c11212rv.m53924h4()) {
                m54128fa(c11212rv);
                c11212rv.m53954m9();
            }
            c11224v4 = new C11224v4(1);
        } else if (iM53734fa != 4 && iM53734fa != 5) {
            return;
        } else {
            c11224v4 = c11212rv.m53985xw();
        }
        m54135k4(c11224v4);
    }

    /* JADX INFO: renamed from: yj */
    private void m54124yj(C11212rv c11212rv) {
        ArrayList arrayListM53874x1 = c11212rv.m53915dy().m53874x1();
        int iM53977x1 = c11212rv.m53977x1();
        for (int size = arrayListM53874x1.size() - 1; size >= 0; size--) {
            C14062gk c14062gk = (C14062gk) C7019kk.m27452k4(arrayListM53874x1.get_Item(size), C14062gk.class);
            int i = this.f38756k4 + 1;
            this.f38756k4 = i;
            arrayListM53874x1.set_Item(size, m54132k4(c11212rv, c14062gk, i));
        }
        c11212rv.m53934k4(iM53977x1);
    }

    /* JADX INFO: renamed from: c5 */
    public final void m54125c5(C11212rv c11212rv) {
        int iM53929k4;
        int iM53929k42;
        C11186g8 c11186g8M53964to = c11212rv.m53964to();
        String strM53753yj = c11186g8M53964to.m53753yj();
        C13890ei c13890eiM53927jd = null;
        if (c11186g8M53964to.m53747u4()) {
            iM53929k4 = -1;
            iM53929k42 = -1;
            do {
                String strM53741ks = c11186g8M53964to.m53741ks();
                String strM53753yj2 = c11186g8M53964to.m53753yj();
                String strM53752x6 = c11186g8M53964to.m53752x6();
                if (strM53741ks.length() == 0) {
                    if (C13851ai.m65152k4(strM53753yj2, c11186g8M53964to.m53740kk().f15078bs)) {
                        c13890eiM53927jd = c11212rv.m53927jd(strM53752x6);
                    } else if (C13851ai.m65152k4(strM53753yj2, c11186g8M53964to.m53740kk().f15165w6)) {
                        iM53929k4 = c11212rv.m53929k4(strM53752x6, false, false, true);
                    } else if (C13851ai.m65152k4(strM53753yj2, c11186g8M53964to.m53740kk().f15130nh)) {
                        iM53929k42 = c11212rv.m53929k4(strM53752x6, false, false, false);
                    } else if (!c11212rv.m53919fa()) {
                        throw XsltException.create("'{0}' is an invalid attribute for the '{1}' element.", strM53753yj2, strM53753yj);
                    }
                }
            } while (c11186g8M53964to.m53749uz());
            c11186g8M53964to.m53733dy();
        } else {
            iM53929k4 = -1;
            iM53929k42 = -1;
        }
        m53852k4(c11212rv, iM53929k4 != -1, "match");
        m53852k4(c11212rv, iM53929k42 != -1, AbstractJwtRequest.ClaimNames.USE);
        m53852k4(c11212rv, c13890eiM53927jd != null, "name");
        c11212rv.m53941k4(c13890eiM53927jd, iM53929k4, iM53929k42);
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0131 A[PHI: r2
      0x0131: PHI (r2v38 com.aspose.slides.internal.tx.j5) = (r2v37 com.aspose.slides.internal.tx.j5), (r2v39 com.aspose.slides.internal.tx.j5) binds: [B:64:0x0145, B:59:0x012f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ck */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m54126ck(C11212rv c11212rv) {
        C11194j5 c11194j5M53947kk;
        if (c11212rv.m53924h4()) {
            C11186g8 c11186g8M53964to = c11212rv.m53964to();
            boolean z = false;
            do {
                int iM53734fa = c11186g8M53964to.m53734fa();
                if (iM53734fa == 1) {
                    String strM53753yj = c11186g8M53964to.m53753yj();
                    String strM53741ks = c11186g8M53964to.m53741ks();
                    if (C13851ai.m65152k4(strM53741ks, c11186g8M53964to.m53740kk().f15174xi)) {
                        if (!C13851ai.m65152k4(strM53753yj, c11186g8M53964to.m53740kk().f15104gi)) {
                            if (C13851ai.m65152k4(strM53753yj, c11186g8M53964to.m53740kk().f15100f9)) {
                                m54120ks(c11212rv);
                            } else {
                                c11212rv.m53983x6();
                                if (C13851ai.m65152k4(strM53753yj, c11186g8M53964to.m53740kk().f15143rq)) {
                                    m54140x1(c11212rv, false);
                                } else if (C13851ai.m65152k4(strM53753yj, c11186g8M53964to.m53740kk().f15181yg)) {
                                    m54140x1(c11212rv, true);
                                } else if (C13851ai.m65152k4(strM53753yj, c11186g8M53964to.m53740kk().f15108ig)) {
                                    m54117ix(c11212rv);
                                } else if (C13851ai.m65152k4(strM53753yj, c11186g8M53964to.m53740kk().f15162vj)) {
                                    m54125c5(c11212rv);
                                } else if (C13851ai.m65152k4(strM53753yj, c11186g8M53964to.m53740kk().f15110ix)) {
                                    m54130jd(c11212rv);
                                } else if (C13851ai.m65152k4(strM53753yj, c11186g8M53964to.m53740kk().f15115jw)) {
                                    m54127dy(c11212rv);
                                } else if (C13851ai.m65152k4(strM53753yj, c11186g8M53964to.m53740kk().f15126m9)) {
                                    c11212rv.m53938k4(c11212rv.m53952lr());
                                } else if (C13851ai.m65152k4(strM53753yj, c11186g8M53964to.m53740kk().f15093dw)) {
                                    c11194j5M53947kk = c11212rv.m53947kk(0);
                                    if (c11194j5M53947kk != null) {
                                        m54134k4(c11194j5M53947kk);
                                    }
                                } else if (C13851ai.m65152k4(strM53753yj, c11186g8M53964to.m53740kk().f15184yo)) {
                                    c11194j5M53947kk = c11212rv.m53947kk(1);
                                    if (c11194j5M53947kk != null) {
                                    }
                                } else if (C13851ai.m65152k4(strM53753yj, c11186g8M53964to.m53740kk().f15146sq)) {
                                    c11212rv.m53935k4(c11212rv.m53975wp());
                                } else if (!c11212rv.m53919fa()) {
                                    throw c11212rv.m53973vj();
                                }
                                c11212rv.m53955ne();
                            }
                            z = true;
                        } else {
                            if (z) {
                                throw XsltException.create("'Xsl:import' instructions must precede all other element children of an 'Xsl:stylesheet' element.", new String[0]);
                            }
                            C14062gk c14062gkM53969up = c11212rv.m53969up(c11212rv.m53908c5(c11212rv.m53964to().m53740kk().f15148sv));
                            String string = c14062gkM53969up.toString();
                            if (c11212rv.m53920fa(string)) {
                                throw XsltException.create("Stylesheet '{0}' cannot directly or indirectly include or import itself.", string);
                            }
                            c11212rv.m53915dy().m53874x1().addItem(c14062gkM53969up);
                            m53850du(c11212rv);
                        }
                    } else if (strM53741ks.length() == 0) {
                        throw XsltException.create("Top-level element '{0}' may not have a null namespace URI.", c11186g8M53964to.m53748up());
                    }
                } else if (iM53734fa != 5 && iM53734fa != 6 && iM53734fa != 7 && iM53734fa != 8) {
                    throw XsltException.create("The contents of '{0}' are invalid.", "stylesheet");
                }
            } while (c11212rv.m53913du());
            c11212rv.m53954m9();
        }
    }

    /* JADX INFO: renamed from: dy */
    public final void m54127dy(C11212rv c11212rv) {
        String str;
        String str2;
        C11186g8 c11186g8M53964to = c11212rv.m53964to();
        String strM53753yj = c11186g8M53964to.m53753yj();
        String strM53933k4 = null;
        if (c11186g8M53964to.m53747u4()) {
            str = null;
            str2 = null;
            do {
                String strM53741ks = c11186g8M53964to.m53741ks();
                String strM53753yj2 = c11186g8M53964to.m53753yj();
                if (strM53741ks.length() == 0) {
                    if (C13851ai.m65152k4(strM53753yj2, c11186g8M53964to.m53740kk().f15171x3)) {
                        strM53933k4 = c11212rv.m53933k4(new String[]{c11186g8M53964to.m53752x6()});
                    } else if (C13851ai.m65152k4(strM53753yj2, c11186g8M53964to.m53740kk().f15109ii)) {
                        String[] strArr = {c11186g8M53964to.m53752x6()};
                        String strM53933k42 = c11212rv.m53933k4(strArr);
                        str2 = strArr[0];
                        str = strM53933k42;
                    } else if (!c11212rv.m53919fa()) {
                        throw XsltException.create("'{0}' is an invalid attribute for the '{1}' element.", strM53753yj2, strM53753yj);
                    }
                }
            } while (c11186g8M53964to.m53749uz());
            c11186g8M53964to.m53733dy();
        } else {
            str = null;
            str2 = null;
        }
        m53851k4(c11212rv, strM53933k4, "stylesheet-prefix");
        m53851k4(c11212rv, str, "result-prefix");
        m53850du(c11212rv);
        c11212rv.m53944k4(strM53933k4, new C11208qm(str2, str, c11212rv.m53977x1()));
    }

    /* JADX INFO: renamed from: fa */
    public final void m54128fa(C11212rv c11212rv) {
        do {
            m54139up(c11212rv);
        } while (c11212rv.m53913du());
    }

    /* JADX INFO: renamed from: h4 */
    public final void m54129h4(C11212rv c11212rv) {
        String str;
        C11186g8 c11186g8M53964to = c11212rv.m53964to();
        String strM53753yj = c11186g8M53964to.m53753yj();
        String str2 = null;
        if (c11186g8M53964to.m53747u4()) {
            String strM53752x6 = null;
            do {
                String strM53741ks = c11186g8M53964to.m53741ks();
                String strM53753yj2 = c11186g8M53964to.m53753yj();
                if (strM53741ks.length() == 0) {
                    if (C13851ai.m65152k4(strM53753yj2, c11186g8M53964to.m53740kk().f15150tl)) {
                        strM53752x6 = c11186g8M53964to.m53752x6();
                        if (1.0d <= C13850af.m65076k4((Object) strM53752x6)) {
                            c11212rv.m53945k4(!"1.0".equals(strM53752x6));
                        } else if (!c11212rv.m53919fa()) {
                            throw XsltException.create("'{1}' is an invalid value for the '{0}' attribute.", "version", strM53752x6);
                        }
                    } else if (C13851ai.m65152k4(strM53753yj2, c11186g8M53964to.m53740kk().f15072ak)) {
                        c11212rv.m53943k4(c11186g8M53964to.m53752x6());
                    } else if (C13851ai.m65152k4(strM53753yj2, c11186g8M53964to.m53740kk().f15168wy)) {
                        c11212rv.m53980x1(c11186g8M53964to.m53752x6());
                    } else if (!C13851ai.m65152k4(strM53753yj2, c11186g8M53964to.m53740kk().f15167wp)) {
                        str2 = strM53753yj2;
                    }
                }
            } while (c11186g8M53964to.m53749uz());
            c11186g8M53964to.m53733dy();
            str = str2;
            str2 = strM53752x6;
        } else {
            str = null;
        }
        if (str2 == null) {
            throw XsltException.create("Missing mandatory attribute '{0}'.", "version");
        }
        if (str != null && !c11212rv.m53919fa()) {
            throw XsltException.create("'{0}' is an invalid attribute for the '{1}' element.", str, strM53753yj);
        }
    }

    /* JADX INFO: renamed from: jd */
    public final void m54130jd(C11212rv c11212rv) {
        C11683c5 c11683c5 = new C11683c5();
        C6324x1 c6324x1 = new C6324x1(c11683c5, '#', '0', ';');
        C11186g8 c11186g8M53964to = c11212rv.m53964to();
        C13890ei c13890ei = null;
        if (c11186g8M53964to.m53747u4()) {
            do {
                if (c11186g8M53964to.m53745rv().length() == 0) {
                    String strM53753yj = c11186g8M53964to.m53753yj();
                    String strM53752x6 = c11186g8M53964to.m53752x6();
                    if (C13851ai.m65152k4(strM53753yj, c11186g8M53964to.m53740kk().f15078bs)) {
                        c13890ei = c11212rv.m53927jd(strM53752x6);
                    } else if (C13851ai.m65152k4(strM53753yj, c11186g8M53964to.m53740kk().f15155u4)) {
                        c11683c5.m55043du(strM53752x6);
                    } else if (C13851ai.m65152k4(strM53753yj, c11186g8M53964to.m53740kk().f15138qm)) {
                        c11683c5.m55048h4(strM53752x6);
                    } else if (C13851ai.m65152k4(strM53753yj, c11186g8M53964to.m53740kk().f15176xw)) {
                        c11683c5.m55041c5(strM53752x6);
                    } else if (C13851ai.m65152k4(strM53753yj, c11186g8M53964to.m53740kk().f15142ri)) {
                        c11683c5.m55066to(strM53752x6);
                    } else if (C13851ai.m65152k4(strM53753yj, c11186g8M53964to.m53740kk().f15177y2)) {
                        c11683c5.m55076x1(strM53752x6);
                    } else if (C13851ai.m65152k4(strM53753yj, c11186g8M53964to.m53740kk().f15169wz)) {
                        c11683c5.m55061m9(strM53752x6);
                    } else if (C13851ai.m65152k4(strM53753yj, c11186g8M53964to.m53740kk().f15183yn)) {
                        c11683c5.m55046dy(strM53752x6);
                    } else {
                        if (C13851ai.m65152k4(strM53753yj, c11186g8M53964to.m53740kk().f15140qq)) {
                            if (m54137k4(strM53752x6.length() == 1, c11212rv)) {
                                c6324x1.f17992x1 = strM53752x6.charAt(0);
                            }
                        } else if (C13851ai.m65152k4(strM53753yj, c11186g8M53964to.m53740kk().f15098ew)) {
                            if (m54137k4(strM53752x6.length() == 1, c11212rv)) {
                                c6324x1.f17990kk = strM53752x6.charAt(0);
                            }
                        } else if (C13851ai.m65152k4(strM53753yj, c11186g8M53964to.m53740kk().f15128na)) {
                            if (m54137k4(strM53752x6.length() == 1, c11212rv)) {
                                c6324x1.f17991to = strM53752x6.charAt(0);
                            }
                        }
                    }
                }
            } while (c11186g8M53964to.m53749uz());
            c11186g8M53964to.m53733dy();
        }
        c11683c5.m55057kk(C14113y2.m67408k4(c11683c5.m55064rv(), c11683c5.m55036ak()));
        if (c13890ei == null) {
            c13890ei = new C13890ei();
        }
        c11212rv.m53942k4(c13890ei, c6324x1);
        m53850du(c11212rv);
    }

    /* JADX INFO: renamed from: m9 */
    public final void m54138m9(C11212rv c11212rv) {
        C11186g8 c11186g8M53964to = c11212rv.m53964to();
        String strM53752x6 = null;
        if (c11186g8M53964to.m53747u4()) {
            do {
                String strM53741ks = c11186g8M53964to.m53741ks();
                String strM53753yj = c11186g8M53964to.m53753yj();
                if (C13851ai.m65152k4(strM53741ks, c11186g8M53964to.m53740kk().f15174xi) && C13851ai.m65152k4(strM53753yj, c11186g8M53964to.m53740kk().f15150tl)) {
                    strM53752x6 = c11186g8M53964to.m53752x6();
                }
            } while (c11186g8M53964to.m53749uz());
            c11186g8M53964to.m53733dy();
        }
        if (strM53752x6 != null) {
            c11212rv.m53935k4(c11212rv.m53961ss());
        } else {
            if (!C13851ai.m65152k4(c11186g8M53964to.m53753yj(), c11186g8M53964to.m53740kk().f15070af) || !"http://www.w3.org/TR/WD-Xsl".equals(c11186g8M53964to.m53741ks())) {
                throw XsltException.create("Stylesheet must start either with an 'Xsl:stylesheet' or an 'Xsl:transform' element, or with a literal result element that has an 'Xsl:version' attribute, where prefix 'Xsl' denotes the 'http://www.w3.org/1999/XSL/Transform' namespace.", new String[0]);
            }
            throw XsltException.create("The 'http://www.w3.org/TR/WD-Xsl' namespace is no longer supported.", new String[0]);
        }
    }

    /* JADX INFO: renamed from: up */
    public final void m54139up(C11212rv c11212rv) {
        C11186g8 c11186g8M53964to = c11212rv.m53964to();
        if (c11186g8M53964to.m53734fa() != 1) {
            m54123x6(c11212rv);
            return;
        }
        String strM53741ks = c11186g8M53964to.m53741ks();
        if (C13851ai.m65152k4(strM53741ks, c11186g8M53964to.m53740kk().f15174xi)) {
            c11212rv.m53983x6();
            m54122rv(c11212rv);
            c11212rv.m53955ne();
        } else {
            c11212rv.m53959rv();
            c11212rv.m53988yj();
            if (c11212rv.m53948kk(strM53741ks)) {
                m54134k4(c11212rv.m53917e0());
            } else {
                m54123x6(c11212rv);
            }
            c11212rv.m53955ne();
        }
    }

    /* JADX INFO: renamed from: x1 */
    public void mo53671x1(C11212rv c11212rv) {
        throw new NotImplementedException();
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC11197k4 m54131k4(int i) {
        ArrayList arrayList = this.f38758x1;
        if (arrayList == null || i >= arrayList.size()) {
            return null;
        }
        return (AbstractC11197k4) this.f38758x1.get_Item(i);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m54140x1(C11212rv c11212rv, boolean z) {
        String[] strArrM65133v4 = C13850af.m65133v4(c11212rv.m53908c5(c11212rv.m53964to().m53740kk().f15180yd));
        for (int i = 0; i < strArrM65133v4.length; i++) {
            c11212rv.m53915dy().m53868k4(c11212rv, strArrM65133v4[i], m54118k4(strArrM65133v4[i]), z);
        }
        m53850du(c11212rv);
    }

    /* JADX INFO: renamed from: k4 */
    public final C11207os m54132k4(C11212rv c11212rv, C14062gk c14062gk, int i) {
        C11186g8 c11186g8M53932k4 = c11212rv.m53932k4(c14062gk);
        c11212rv.m53936k4(c11186g8M53932k4);
        try {
            try {
                c11212rv.m53939k4(new C11207os());
                c11212rv.m53934k4(i);
                m54136k4(c11212rv, false);
                c11212rv.m53971uz();
                return c11212rv.m53974wl();
            } catch (XsltCompileException e) {
                throw e;
            } catch (RuntimeException e2) {
                throw new XsltCompileException(e2, c11186g8M53932k4.m53736ix(), c11186g8M53932k4.m53737jd(), c11186g8M53932k4.m53731ck());
            }
        } catch (Throwable th) {
            c11212rv.m53971uz();
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.aspose.slides.Collections.ArrayList, org.json.JSONStringer] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Iterator, org.json.JSONStringer] */
    /* JADX INFO: renamed from: x1 */
    public final void m54141x1(C13890ei c13890ei) {
        ?? r1 = this.f38758x1;
        if (r1 != 0) {
            ?? EndObject = r1.endObject();
            while (EndObject.hasNext()) {
                try {
                    C11206nv c11206nv = (C11206nv) C7019kk.m27452k4(EndObject.next(), C11206nv.class);
                    if (c11206nv != null && C13890ei.m65278k4(c11206nv.m53816kk(), c13890ei)) {
                        throw XsltException.create("Value of parameter '{0}' cannot be specified more than once within a single 'Xsl:call-template' or 'Xsl:apply-templates' element.", c13890ei.toString());
                    }
                } finally {
                    if (C7019kk.m27456k4((Iterator) EndObject, (Class<IDisposable>) IDisposable.class)) {
                        ((IDisposable) EndObject).dispose();
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m54119k4() {
        if (this.f38757kk == null) {
            C11220u4 c11220u4 = new C11220u4();
            m54134k4(c11220u4);
            this.f38757kk = c11220u4;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m54133k4(ArrayList arrayList) {
        m54119k4();
        this.f38757kk.m54020k4(arrayList);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m54134k4(AbstractC11197k4 abstractC11197k4) {
        if (this.f38758x1 == null) {
            this.f38758x1 = new ArrayList();
        }
        this.f38758x1.addItem(abstractC11197k4);
        this.f38757kk = null;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m54135k4(AbstractC11201lr abstractC11201lr) {
        m54119k4();
        this.f38757kk.m54021k4(abstractC11201lr);
    }

    @Override // com.aspose.slides.internal.p430tx.AbstractC11197k4
    /* JADX INFO: renamed from: k4 */
    public void mo53717k4(C11212rv c11212rv) {
        ArrayList arrayList = this.f38758x1;
        if (arrayList == null) {
            return;
        }
        arrayList.size();
        for (int i = 0; i < this.f38758x1.size(); i++) {
            ((AbstractC11197k4) this.f38758x1.get_Item(i)).mo53717k4(c11212rv);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m54136k4(C11212rv c11212rv, boolean z) {
        C11186g8 c11186g8M53964to = c11212rv.m53964to();
        while (c11186g8M53964to.m53734fa() != 1) {
            if (!c11212rv.m53913du()) {
                throw XsltException.create("Stylesheet must start either with an 'Xsl:stylesheet' or an 'Xsl:transform' element, or with a literal result element that has an 'Xsl:version' attribute, where prefix 'Xsl' denotes the 'http://www.w3.org/1999/XSL/Transform' namespace.", new String[0]);
            }
        }
        if (!C13851ai.m65152k4(c11186g8M53964to.m53741ks(), c11186g8M53964to.m53740kk().f15174xi)) {
            c11212rv.m53959rv();
            m54138m9(c11212rv);
        } else {
            if (!C13851ai.m65152k4(c11186g8M53964to.m53753yj(), c11186g8M53964to.m53740kk().f15070af) && !C13851ai.m65152k4(c11186g8M53964to.m53753yj(), c11186g8M53964to.m53740kk().f15114jf)) {
                throw XsltException.create("Stylesheet must start either with an 'Xsl:stylesheet' or an 'Xsl:transform' element, or with a literal result element that has an 'Xsl:version' attribute, where prefix 'Xsl' denotes the 'http://www.w3.org/1999/XSL/Transform' namespace.", new String[0]);
            }
            c11212rv.m53983x6();
            m54129h4(c11212rv);
            m54126ck(c11212rv);
            if (!z) {
                m54124yj(c11212rv);
            }
        }
        c11212rv.m53955ne();
    }

    @Override // com.aspose.slides.internal.p430tx.AbstractC11197k4
    /* JADX INFO: renamed from: k4 */
    public void mo53668k4(C11234xw c11234xw, C11231x1 c11231x1) {
        int iM54107kk = c11231x1.m54107kk();
        if (iM54107kk != 0) {
            if (iM54107kk != 1) {
                C6005k4.m24259k4("Invalid Container action execution state");
                return;
            } else {
                c11231x1.m54091jd();
                return;
            }
        }
        ArrayList arrayList = this.f38758x1;
        if (arrayList == null || arrayList.size() <= 0) {
            c11231x1.m54091jd();
        } else {
            c11234xw.m54184k4(c11231x1);
            c11231x1.m54094k4(1);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m54137k4(boolean z, C11212rv c11212rv) {
        if (z) {
            return true;
        }
        if (c11212rv.m53919fa()) {
            return false;
        }
        throw XsltException.create("'{1}' is an invalid value for the '{0}' attribute.", c11212rv.m53964to().m53753yj(), c11212rv.m53964to().m53752x6());
    }
}
