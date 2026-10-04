package com.aspose.slides.internal.p253lm;

import androidx.core.app.FrameMetricsAggregator;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.internal.p492x4.C12380dy;
import com.aspose.slides.internal.p492x4.C12385to;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14062gk;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.C14117yj;
import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import com.orion.notein.richeditor.utils.p606io.IOUtils;

/* JADX INFO: renamed from: com.aspose.slides.internal.lm.f9 */
/* JADX INFO: loaded from: classes4.dex */
public class C6134f9 extends C6198wp {

    /* JADX INFO: renamed from: h4 */
    private static final char[] f17336h4 = {';', ',', IOUtils.DIR_SEPARATOR_UNIX, '?', ':', '@', '&', '=', '+', '$', '#'};

    /* JADX INFO: renamed from: m9 */
    private static final char[] f17337m9 = {'-', '_', FilenameUtils.EXTENSION_SEPARATOR, '!', '~', '*', '\'', '(', ')', '[', ']'};

    /* JADX INFO: renamed from: du */
    private final InterfaceC6132em f17338du;

    /* JADX INFO: renamed from: to */
    private final InterfaceC6173qw f17339to;

    public C6134f9(InterfaceC6173qw interfaceC6173qw, InterfaceC6132em interfaceC6132em, String str, C6116bs c6116bs) {
        super(c6116bs);
        ((C6198wp) this).f17519k4 = str;
        this.f17339to = interfaceC6173qw;
        this.f17338du = interfaceC6132em;
    }

    /* JADX INFO: renamed from: ck */
    public static AbstractC6123ca m24818ck() {
        return C6163nh.f17403k4;
    }

    /* JADX INFO: renamed from: c5 */
    public final AbstractC6123ca m24819c5(AbstractC6123ca[] abstractC6123caArr) {
        if (abstractC6123caArr.length >= 1) {
            AbstractC6123ca abstractC6123ca = abstractC6123caArr[0];
            if (abstractC6123ca != C6163nh.f17403k4) {
                String strM66624c5 = C14062gk.m66624c5(abstractC6123ca.toString());
                for (char c : f17336h4) {
                    strM66624c5 = C14113y2.m67401k4(strM66624c5, C14062gk.m66624c5(C14117yj.m67537ne(c)), C14117yj.m67537ne(c));
                }
                for (char c2 : f17337m9) {
                    strM66624c5 = C14113y2.m67401k4(strM66624c5, C14062gk.m66624c5(C14117yj.m67537ne(c2)), C14117yj.m67537ne(c2));
                }
                return this.f17339to.mo24980v4().m25068h4(strM66624c5);
            }
        }
        return this.f17339to.mo24980v4().m25069jd();
    }

    /* JADX INFO: renamed from: du */
    public final AbstractC6123ca m24820du(AbstractC6123ca[] abstractC6123caArr) {
        AbstractC6123ca abstractC6123ca;
        if (abstractC6123caArr.length < 1 || (abstractC6123ca = abstractC6123caArr[0]) == C6163nh.f17403k4) {
            return this.f17339to.mo24972ks().m25187c5();
        }
        return this.f17339to.mo24972ks().m25189k4((abstractC6123ca == this.f17339to.mo24977um().mo25032k4("NaN") || abstractC6123ca == this.f17339to.mo24977um().mo25032k4("POSITIVE_INFINITY") || abstractC6123ca == this.f17339to.mo24977um().mo25032k4("NEGATIVE_INFINITY")) ? false : true);
    }

    /* JADX INFO: renamed from: dy */
    public final AbstractC6123ca m24821dy(AbstractC6123ca[] abstractC6123caArr) {
        if (abstractC6123caArr.length >= 1) {
            AbstractC6123ca abstractC6123ca = abstractC6123caArr[0];
            if (abstractC6123ca != C6163nh.f17403k4) {
                String strM66624c5 = C14062gk.m66624c5(abstractC6123ca.toString());
                for (char c : f17337m9) {
                    strM66624c5 = C14113y2.m67401k4(strM66624c5, C14062gk.m66624c5(C14117yj.m67537ne(c)), C14117yj.m67537ne(c));
                }
                return this.f17339to.mo24980v4().m25068h4(strM66624c5);
            }
        }
        return this.f17339to.mo24980v4().m25069jd();
    }

    /* JADX INFO: renamed from: h4 */
    public final AbstractC6123ca m24822h4(AbstractC6123ca[] abstractC6123caArr) {
        return (abstractC6123caArr.length < 1 || abstractC6123caArr[0] == C6163nh.f17403k4) ? this.f17339to.mo24980v4().m25069jd() : this.f17339to.mo24980v4().m25068h4(C14062gk.m66625ck(C14113y2.m67401k4(abstractC6123caArr[0].toString(), "+", " ")));
    }

    /* JADX INFO: renamed from: jd */
    public final InterfaceC6132em m24823jd() {
        return this.f17338du;
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC6123ca m24824k4(AbstractC6123ca abstractC6123ca, AbstractC6123ca[] abstractC6123caArr) {
        int iM27462to = C7019kk.m27462to(Double.valueOf(abstractC6123caArr[0].mo24775x1()), 14);
        if (iM27462to >= 0) {
            double d = iM27462to;
            if (!C14044b3.m66437kk(d) && !C14044b3.m66439x1(d)) {
                ((AbstractC6211yd) abstractC6123ca).mo24947k4(iM27462to);
                return abstractC6123caArr[0];
            }
        }
        throw new C6158m4(this.f17339to.mo24968ix().m25165h4("invalid length"));
    }

    /* JADX INFO: renamed from: kk */
    public final AbstractC6123ca m24826kk(AbstractC6211yd abstractC6211yd) {
        return this.f17339to.mo24977um().m25186k4(abstractC6211yd.mo24948kk());
    }

    /* JADX INFO: renamed from: m9 */
    public final AbstractC6123ca m24828m9(AbstractC6123ca[] abstractC6123caArr) {
        return (abstractC6123caArr.length < 1 || abstractC6123caArr[0] == C6163nh.f17403k4) ? this.f17339to.mo24980v4().m25069jd() : this.f17339to.mo24980v4().m25068h4(C14062gk.m66625ck(C14113y2.m67401k4(abstractC6123caArr[0].toString(), "+", " ")));
    }

    /* JADX INFO: renamed from: to */
    public final AbstractC6123ca m24829to(AbstractC6123ca[] abstractC6123caArr) {
        return (abstractC6123caArr.length < 1 || abstractC6123caArr[0] == C6163nh.f17403k4) ? this.f17339to.mo24972ks().m25189k4(false) : this.f17339to.mo24972ks().m25189k4(C14044b3.m66440x1(Double.NaN, abstractC6123caArr[0].mo24775x1()));
    }

    @Override // com.aspose.slides.internal.p253lm.C6116bs, com.aspose.slides.internal.p253lm.AbstractC6123ca
    public String toString() {
        return C14113y2.m67402k4("function {0}", m25131fa());
    }

    /* JADX INFO: renamed from: x1 */
    public final AbstractC6123ca m24830x1(AbstractC6123ca[] abstractC6123caArr) {
        AbstractC6123ca abstractC6123ca;
        C6163nh c6163nh;
        int i;
        AbstractC6123ca abstractC6123ca2;
        if (abstractC6123caArr.length < 1 || (abstractC6123ca = abstractC6123caArr[0]) == (c6163nh = C6163nh.f17403k4)) {
            return C6163nh.f17403k4;
        }
        String strM67440x1 = C14113y2.m67440x1(abstractC6123ca.toString());
        if (!C14113y2.m67411k4(strM67440x1)) {
            if (C14113y2.m67448x1(strM67440x1, CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR)) {
                strM67440x1 = C14113y2.m67422kk(strM67440x1, 1);
                i = -1;
            } else {
                if (C14113y2.m67448x1(strM67440x1, "+")) {
                    strM67440x1 = C14113y2.m67422kk(strM67440x1, 1);
                }
                i = 1;
            }
            int iM66998m9 = (abstractC6123caArr.length < 2 || (abstractC6123ca2 = abstractC6123caArr[1]) == c6163nh || abstractC6123ca2.equals(0)) ? 10 : C14080ne.m66998m9(abstractC6123caArr[1].mo24769C_());
            if (iM66998m9 == 0) {
                iM66998m9 = 10;
            } else if (iM66998m9 >= 2 && iM66998m9 <= 36) {
            }
            if (C14113y2.m67448x1(C14113y2.m67368h4(strM67440x1), "0x")) {
                iM66998m9 = 16;
            }
            try {
                if (iM66998m9 != 10) {
                    return this.f17339to.mo24977um().m25186k4(i * C14080ne.m67044x1(strM67440x1, iM66998m9));
                }
                double[] dArr = {0.0d};
                return C14044b3.m66435k4(strM67440x1, FrameMetricsAggregator.EVERY_DURATION, C11697x1.m55250kk(), dArr) ? this.f17339to.mo24977um().m25186k4(((double) i) * C14116yg.m67490kk(dArr[0])) : ((C6177s7) C7019kk.m27452k4((Object) this.f17339to, C6177s7.class)).mo25032k4("NaN");
            } catch (RuntimeException unused) {
            }
        }
        return ((C6177s7) C7019kk.m27452k4((Object) this.f17339to, C6177s7.class)).mo25032k4("NaN");
    }

    @Override // com.aspose.slides.internal.p253lm.C6198wp
    /* JADX INFO: renamed from: k4 */
    public AbstractC6123ca mo10037k4(InterfaceC6132em interfaceC6132em, AbstractC6211yd abstractC6211yd, AbstractC6123ca[] abstractC6123caArr) {
        AbstractC6123ca abstractC6123caM24818ck;
        if ("eval".equals(((C6198wp) this).f17519k4)) {
            abstractC6123caM24818ck = m24825k4(abstractC6123caArr);
        } else if ("parseInt".equals(((C6198wp) this).f17519k4)) {
            abstractC6123caM24818ck = m24830x1(abstractC6123caArr);
        } else if ("parseFloat".equals(((C6198wp) this).f17519k4)) {
            abstractC6123caM24818ck = m24827kk(abstractC6123caArr);
        } else if ("isNaN".equals(((C6198wp) this).f17519k4)) {
            abstractC6123caM24818ck = m24829to(abstractC6123caArr);
        } else if ("isFinite".equals(((C6198wp) this).f17519k4)) {
            abstractC6123caM24818ck = m24820du(abstractC6123caArr);
        } else if ("decodeURI".equals(((C6198wp) this).f17519k4)) {
            abstractC6123caM24818ck = m24822h4(abstractC6123caArr);
        } else if ("encodeURI".equals(((C6198wp) this).f17519k4)) {
            abstractC6123caM24818ck = m24819c5(abstractC6123caArr);
        } else if ("decodeURIComponent".equals(((C6198wp) this).f17519k4)) {
            abstractC6123caM24818ck = m24828m9(abstractC6123caArr);
        } else if ("encodeURIComponent".equals(((C6198wp) this).f17519k4)) {
            abstractC6123caM24818ck = m24821dy(abstractC6123caArr);
        } else if ("get_length".equals(((C6198wp) this).f17519k4)) {
            abstractC6123caM24818ck = m24826kk(abstractC6211yd);
        } else if ("set_length".equals(((C6198wp) this).f17519k4)) {
            abstractC6123caM24818ck = m24824k4(abstractC6211yd, abstractC6123caArr);
        } else {
            if (!"prototype".equals(((C6198wp) this).f17519k4)) {
                throw new C6208y2("unknown global function");
            }
            abstractC6123caM24818ck = m24818ck();
        }
        interfaceC6132em.mo10079x1(abstractC6123caM24818ck);
        return abstractC6123caM24818ck;
    }

    /* JADX INFO: renamed from: kk */
    public final AbstractC6123ca m24827kk(AbstractC6123ca[] abstractC6123caArr) {
        AbstractC6123ca abstractC6123ca;
        if (abstractC6123caArr.length < 1 || (abstractC6123ca = abstractC6123caArr[0]) == C6163nh.f17403k4) {
            return C6163nh.f17403k4;
        }
        C12385to c12385toM57989x1 = new C12380dy("^[\\+\\-\\d\\.e]*", 66).m57989x1(C14113y2.m67440x1(abstractC6123ca.toString()));
        double[] dArr = {0.0d};
        boolean z = c12385toM57989x1.mo58006to() && C14044b3.m66435k4(c12385toM57989x1.mo57995kk(), 167, new C11697x1("en-US"), dArr);
        double d = dArr[0];
        InterfaceC6173qw interfaceC6173qw = this.f17339to;
        return z ? interfaceC6173qw.mo24977um().m25186k4(d) : ((C6177s7) C7019kk.m27452k4((Object) interfaceC6173qw, C6177s7.class)).mo25032k4("NaN");
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC6123ca m24825k4(AbstractC6123ca[] abstractC6123caArr) {
        if (!"String".equals(abstractC6123caArr[0].mo24774to())) {
            return abstractC6123caArr[0];
        }
        try {
            try {
                C6149jw.m24870k4(abstractC6123caArr[0].toString()).mo24749k4((InterfaceC6166os) m24823jd());
                return m24823jd().mo10039c5();
            } catch (RuntimeException e) {
                throw new C6158m4(this.f17339to.mo24974ne().m25165h4(e.getMessage()));
            }
        } catch (RuntimeException e2) {
            throw new C6158m4(this.f17339to.mo24979uz().m25165h4(e2.getMessage()));
        }
    }
}
