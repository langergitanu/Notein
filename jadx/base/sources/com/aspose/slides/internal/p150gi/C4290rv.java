package com.aspose.slides.internal.p150gi;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p051bz.C1921qq;
import com.aspose.slides.internal.p097e0.AbstractC3533um;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p523yd.C12814to;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.words.StyleIdentifier;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.gi.rv */
/* JADX INFO: loaded from: classes.dex */
public class C4290rv {

    /* JADX INFO: renamed from: k4 */
    private int f11710k4;

    /* JADX INFO: renamed from: x1 */
    private C12003du f11713x1 = new C12003du();

    /* JADX INFO: renamed from: kk */
    private C12003du f11711kk = new C12003du();

    /* JADX INFO: renamed from: to */
    private C12003du f11712to = new C12003du();

    /* JADX INFO: renamed from: k4 */
    public static C4290rv m17260k4(AbstractC3533um abstractC3533um) {
        return m17261x1(abstractC3533um);
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0133, code lost:
    
        return r1;
     */
    /* JADX INFO: renamed from: x1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static C4290rv m17261x1(AbstractC3533um abstractC3533um) {
        boolean zM27456k4;
        C12003du c12003duMo9923k4;
        C12003du c12003du;
        AbstractC3533um abstractC3533umM14397kk = abstractC3533um.m14397kk();
        C4290rv c4290rvM17261x1 = abstractC3533umM14397kk != null ? m17261x1(abstractC3533umM14397kk) : null;
        AbstractC4282kp abstractC4282kpMo14065x1 = abstractC3533um.mo14065x1(StyleIdentifier.LIGHT_GRID_ACCENT_6);
        if (abstractC4282kpMo14065x1 == null) {
            return c4290rvM17261x1;
        }
        List.Enumerator<AbstractC4282kp> it = abstractC4282kpMo14065x1.mo17208t_().iterator();
        while (true) {
            try {
                if (it.hasNext()) {
                    AbstractC4282kp next = it.next();
                    int iMo17251du = next.mo17251du();
                    C12814to c12814toM14111q_ = abstractC3533um.m14393k4() == null ? null : abstractC3533um.m14393k4().m14111q_();
                    if (iMo17251du == 95) {
                        if (c4290rvM17261x1 != null) {
                            c4290rvM17261x1.f11710k4 = 0;
                        }
                        if (zM27456k4) {
                            return c4290rvM17261x1;
                        }
                    } else {
                        if (iMo17251du == 153) {
                            if (c4290rvM17261x1 == null) {
                                c4290rvM17261x1 = new C4290rv();
                            }
                            c4290rvM17261x1.f11710k4 |= 1;
                            c12003duMo9923k4 = abstractC3533um.m14402to(72).mo9923k4(c12814toM14111q_);
                            c12003du = c4290rvM17261x1.f11713x1;
                        } else if (iMo17251du == 92) {
                            if (c4290rvM17261x1 != null) {
                                c4290rvM17261x1.f11710k4 &= 14;
                                c12003duMo9923k4 = abstractC3533um.m14402to(72).mo9923k4(c12814toM14111q_);
                                c12003du = c4290rvM17261x1.f11713x1;
                            }
                        } else if (iMo17251du == 103) {
                            if (c4290rvM17261x1 == null) {
                                c4290rvM17261x1 = new C4290rv();
                            }
                            c4290rvM17261x1.f11710k4 |= 2;
                            c12003duMo9923k4 = abstractC3533um.m14402to(72).mo9923k4(c12814toM14111q_);
                            c12003du = c4290rvM17261x1.f11711kk;
                        } else if (iMo17251du == 91) {
                            if (c4290rvM17261x1 != null) {
                                c4290rvM17261x1.f11710k4 &= 13;
                                c12003duMo9923k4 = abstractC3533um.m14402to(72).mo9923k4(c12814toM14111q_);
                                c12003du = c4290rvM17261x1.f11711kk;
                            }
                        } else if (iMo17251du == 77) {
                            if (c4290rvM17261x1 == null) {
                                c4290rvM17261x1 = new C4290rv();
                            }
                            c4290rvM17261x1.f11710k4 |= 4;
                            c12003duMo9923k4 = abstractC3533um.m14402to(72).mo9923k4(c12814toM14111q_);
                            c12003du = c4290rvM17261x1.f11712to;
                        } else if (iMo17251du == 90) {
                            if (c4290rvM17261x1 != null) {
                                c4290rvM17261x1.f11710k4 &= 11;
                                c12003duMo9923k4 = abstractC3533um.m14402to(72).mo9923k4(c12814toM14111q_);
                                c12003du = c4290rvM17261x1.f11712to;
                            }
                        } else if (iMo17251du == 17) {
                            if (c4290rvM17261x1 == null) {
                                c4290rvM17261x1 = new C4290rv();
                            }
                            c4290rvM17261x1.f11710k4 |= 8;
                        } else {
                            if (iMo17251du != 86) {
                                throw new C1921qq(C14113y2.m67408k4("Illegal value encountered: ", next.mo9926j_()));
                            }
                            if (c4290rvM17261x1 != null) {
                                c4290rvM17261x1.f11710k4 &= 7;
                            }
                        }
                        c12003duMo9923k4.CloneTo(c12003du);
                    }
                } else if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: du */
    public final C12003du m17262du() {
        return this.f11713x1;
    }

    /* JADX INFO: renamed from: h4 */
    public final C12003du m17263h4() {
        return this.f11711kk;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m17265kk() {
        return (this.f11710k4 & 4) != 0;
    }

    /* JADX INFO: renamed from: m9 */
    public final C12003du m17266m9() {
        return this.f11712to;
    }

    /* JADX INFO: renamed from: to */
    public final boolean m17267to() {
        return (this.f11710k4 & 8) != 0;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m17264k4() {
        return (this.f11710k4 & 1) != 0;
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m17268x1() {
        return (this.f11710k4 & 2) != 0;
    }
}
