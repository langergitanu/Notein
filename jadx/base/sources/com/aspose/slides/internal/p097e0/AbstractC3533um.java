package com.aspose.slides.internal.p097e0;

import androidx.core.app.FrameMetricsAggregator;
import com.aspose.slides.internal.p051bz.C1921qq;
import com.aspose.slides.internal.p111em.InterfaceC3760kk;
import com.aspose.slides.internal.p150gi.AbstractC4275gi;
import com.aspose.slides.internal.p150gi.AbstractC4282kp;
import com.aspose.slides.internal.p150gi.C4265c5;
import com.aspose.slides.internal.p150gi.C4267ck;
import com.aspose.slides.internal.p150gi.C4269du;
import com.aspose.slides.internal.p150gi.C4273fa;
import com.aspose.slides.internal.p150gi.C4279jd;
import com.aspose.slides.internal.p150gi.C4283ks;
import com.aspose.slides.internal.p150gi.C4285m9;
import com.aspose.slides.internal.p150gi.C4290rv;
import com.aspose.slides.internal.p150gi.C4300up;
import com.aspose.slides.internal.p150gi.C4313yj;
import com.aspose.slides.internal.p364qm.C9892x1;
import com.aspose.slides.internal.p380ri.C10009ck;
import com.aspose.slides.internal.p523yd.C12809h4;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.words.StyleIdentifier;
import com.huawei.hms.network.embedded.C18241k5;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;

/* JADX INFO: renamed from: com.aspose.slides.internal.e0.um */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3533um {

    /* JADX INFO: renamed from: x1 */
    private static boolean[] f9865x1;

    /* JADX INFO: renamed from: k4 */
    protected AbstractC3533um f9866k4;

    /* JADX INFO: renamed from: kk */
    private AbstractC3524ks f9867kk;

    public AbstractC3533um(AbstractC3524ks abstractC3524ks, AbstractC3533um abstractC3533um) {
        this.f9867kk = abstractC3524ks;
        this.f9866k4 = abstractC3533um;
    }

    /* JADX INFO: renamed from: c5 */
    private AbstractC4282kp m14374c5(int i) {
        AbstractC4275gi abstractC4275giM14375ck = m14375ck(i);
        if (abstractC4275giM14375ck != null) {
            return abstractC4275giM14375ck.mo17212k4(this);
        }
        return null;
    }

    /* JADX INFO: renamed from: ck */
    private static AbstractC4275gi m14375ck(int i) {
        if (i < 1 || i > 301) {
            return null;
        }
        return AbstractC3524ks.m14312x1(i);
    }

    /* JADX INFO: renamed from: dy */
    private AbstractC4282kp m14376dy(int i) {
        AbstractC4275gi abstractC4275giM14375ck = m14375ck(i);
        if (abstractC4275giM14375ck != null) {
            return abstractC4275giM14375ck.m17210du(this);
        }
        return null;
    }

    /* JADX INFO: renamed from: du */
    public final AbstractC4282kp m14385du(int i) {
        return mo14063k4(i, true, true);
    }

    /* JADX INFO: renamed from: fa */
    public final C4290rv m14388fa() {
        return C4290rv.m17260k4(this);
    }

    /* JADX INFO: renamed from: h4 */
    public final C4267ck m14389h4() {
        return C4267ck.m17192k4(this);
    }

    /* JADX INFO: renamed from: jd */
    public final C4285m9 m14391jd() {
        return new C4285m9(this);
    }

    /* JADX INFO: renamed from: k4 */
    public final int m14392k4(int i, int i2, int i3, int i4) {
        try {
            int iMo17251du = m14402to(StyleIdentifier.PLAIN_TABLE_1).mo17251du();
            if (iMo17251du == 79) {
                return i;
            }
            if (iMo17251du == 121) {
                return i2;
            }
            if (iMo17251du == 140) {
                return i3;
            }
            if (iMo17251du != 205) {
                return -1;
            }
            return i4;
        } catch (C1921qq unused) {
            return -1;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public abstract void mo14064k4(int i, AbstractC4282kp abstractC4282kp);

    /* JADX INFO: renamed from: kk */
    public final AbstractC3533um m14397kk() {
        return this.f9866k4;
    }

    /* JADX INFO: renamed from: m9 */
    public final C4273fa m14399m9() {
        return new C4273fa(this);
    }

    /* JADX INFO: renamed from: to */
    public final C4265c5 m14401to() {
        return C4265c5.m17143k4(this);
    }

    /* JADX INFO: renamed from: up */
    public final C4269du m14403up() {
        return C4269du.m17196k4(this);
    }

    /* JADX INFO: renamed from: x1 */
    public final AbstractC3524ks m14404x1() {
        AbstractC3533um abstractC3533um = this.f9866k4;
        if (abstractC3533um != null) {
            return abstractC3533um.m14393k4();
        }
        return null;
    }

    /* JADX INFO: renamed from: x1 */
    public abstract AbstractC4282kp mo14065x1(int i);

    /* JADX INFO: renamed from: jd */
    private static boolean m14377jd(int i) {
        if (f9865x1 == null) {
            f9865x1 = new boolean[302];
            for (int i2 = 1; i2 <= 301; i2++) {
                AbstractC4275gi abstractC4275giM14375ck = m14375ck(i2);
                f9865x1[i2] = abstractC4275giM14375ck != null && abstractC4275giM14375ck.m17227kk();
            }
        }
        return f9865x1[i];
    }

    /* JADX INFO: renamed from: x1 */
    public static String m14382x1(String str) {
        int iM67429to = C14113y2.m67429to(str, FilenameUtils.EXTENSION_SEPARATOR);
        if (iM67429to > -1) {
            return C14113y2.m67422kk(str, iM67429to + 1);
        }
        return null;
    }

    /* JADX INFO: renamed from: c5 */
    public final C4283ks m14383c5() {
        return new C4283ks(this);
    }

    /* JADX INFO: renamed from: ck */
    public final C4279jd m14384ck() {
        return C4279jd.m17243k4(this);
    }

    /* JADX INFO: renamed from: du */
    public final C4313yj m14386du() {
        return C4313yj.m17294k4(this);
    }

    /* JADX INFO: renamed from: dy */
    public final C4300up m14387dy() {
        return new C4300up(this);
    }

    /* JADX INFO: renamed from: h4 */
    public final AbstractC4282kp m14390h4(int i) {
        for (AbstractC3533um abstractC3533um = this.f9866k4; abstractC3533um != null; abstractC3533um = abstractC3533um.f9866k4) {
            AbstractC4282kp abstractC4282kpMo14065x1 = abstractC3533um.mo14065x1(i);
            if (abstractC4282kpMo14065x1 != null) {
                return abstractC4282kpMo14065x1;
            }
        }
        return m14374c5(i);
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC3524ks m14393k4() {
        return this.f9867kk;
    }

    /* JADX INFO: renamed from: kk */
    public final AbstractC4282kp m14398kk(int i) {
        return m14377jd(i) ? m14400m9(i) : m14374c5(i);
    }

    /* JADX INFO: renamed from: m9 */
    public final AbstractC4282kp m14400m9(int i) {
        AbstractC3533um abstractC3533um = this.f9866k4;
        return abstractC3533um != null ? abstractC3533um.m14402to(i) : m14374c5(i);
    }

    /* JADX INFO: renamed from: to */
    public final AbstractC4282kp m14402to(int i) {
        return mo14063k4(i, true, true);
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC4282kp m14394k4(int i) {
        AbstractC4282kp abstractC4282kpMo14065x1 = mo14065x1(i);
        return abstractC4282kpMo14065x1 == null ? m14376dy(i) : abstractC4282kpMo14065x1;
    }

    /* JADX INFO: renamed from: k4 */
    public AbstractC4282kp mo14063k4(int i, boolean z, boolean z2) {
        AbstractC4275gi abstractC4275giM14375ck = m14375ck(i & FrameMetricsAggregator.EVERY_DURATION);
        if (abstractC4275giM14375ck != null) {
            return abstractC4275giM14375ck.mo14302k4(i & (-512), this, z, z2);
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    private AbstractC4282kp m14378k4(InterfaceC3760kk interfaceC3760kk, AbstractC3524ks abstractC3524ks, int i, String str, AbstractC4275gi abstractC4275gi) {
        AbstractC4282kp abstractC4282kpMo14065x1 = mo14065x1(i);
        if (abstractC4282kpMo14065x1 != null) {
            return abstractC4282kpMo14065x1;
        }
        String strMo15082to = interfaceC3760kk.mo15082to(str);
        if (strMo15082to == null || abstractC4275gi == null) {
            return null;
        }
        return abstractC4275gi.mo14415k4(this, strMo15082to, abstractC3524ks);
    }

    /* JADX INFO: renamed from: k4 */
    private String m14379k4(InterfaceC3760kk interfaceC3760kk, String str) {
        String strMo15082to = interfaceC3760kk.mo15082to(str);
        if (strMo15082to != null) {
            m14381k4(interfaceC3760kk, str, strMo15082to);
        }
        return strMo15082to;
    }

    /* JADX INFO: renamed from: k4 */
    public static String m14380k4(String str) {
        int iM67429to = C14113y2.m67429to(str, FilenameUtils.EXTENSION_SEPARATOR);
        return iM67429to > -1 ? C10009ck.m49139k4(str, 0, iM67429to) : str;
    }

    /* JADX INFO: renamed from: k4 */
    public void mo14395k4(InterfaceC3760kk interfaceC3760kk) {
        m14379k4(interfaceC3760kk, "writing-mode");
        m14379k4(interfaceC3760kk, "column-number");
        m14379k4(interfaceC3760kk, "number-columns-spanned");
        if (C14113y2.m67411k4(m14379k4(interfaceC3760kk, "font"))) {
            m14379k4(interfaceC3760kk, "font-size");
            m14379k4(interfaceC3760kk, "font-family");
        }
        C12809h4 c12809h4M59556du = m14393k4().m14111q_().m59556du();
        for (int i = 0; i < interfaceC3760kk.mo15083yj(); i++) {
            String strMo15078dy = interfaceC3760kk.mo15078dy(i);
            String strMo15079jd = interfaceC3760kk.mo15079jd(i);
            String strMo15077ck = interfaceC3760kk.mo15077ck(i);
            if (strMo15078dy == null || strMo15078dy.length() == 0 || C14113y2.m67363du("xml:lang", strMo15079jd) || C14113y2.m67363du("xml:base", strMo15079jd)) {
                m14381k4(interfaceC3760kk, strMo15079jd, strMo15077ck);
            } else if (!c12809h4M59556du.m59538k4(strMo15078dy)) {
                AbstractC3515du abstractC3515duM14253k4 = c12809h4M59556du.m59530h4().m14253k4(strMo15078dy);
                C9892x1 c9892x1 = new C9892x1(strMo15078dy, strMo15079jd);
                if (abstractC3515duM14253k4 == null) {
                    m14396k4(c9892x1);
                } else if (!abstractC3515duM14253k4.mo14162k4(c9892x1) || abstractC3515duM14253k4.mo14163kk() == null) {
                    m14393k4().m14321k4(c9892x1, strMo15077ck);
                } else {
                    m14381k4(interfaceC3760kk, C14113y2.m67408k4(abstractC3515duM14253k4.mo14163kk(), C18241k5.f55433h, c9892x1.m48711k4()), strMo15077ck);
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m14381k4(InterfaceC3760kk interfaceC3760kk, String str, String str2) {
        int i;
        AbstractC4282kp abstractC4282kpMo17216k4;
        if (C14113y2.m67448x1(str, "xmlns:") || C14113y2.m67363du("xmlns", str) || str2 == null) {
            return;
        }
        String strM14380k4 = m14380k4(str);
        String strM14382x1 = m14382x1(str);
        int iM14273k4 = C3521jd.m14273k4(strM14380k4);
        int iM14296x1 = C3521jd.m14296x1(strM14382x1);
        if (iM14273k4 == -1 || (iM14296x1 == -1 && strM14382x1 != null)) {
            m14396k4(new C9892x1(null, str));
        }
        AbstractC3524ks abstractC3524ksM14325l_ = this.f9867kk.m14325l_();
        AbstractC4275gi abstractC4275giM14375ck = m14375ck(iM14273k4);
        if (abstractC4275giM14375ck == null) {
            return;
        }
        try {
            if (strM14382x1 != null) {
                AbstractC4282kp abstractC4282kpM14378k4 = m14378k4(interfaceC3760kk, abstractC3524ksM14325l_, iM14273k4, strM14380k4, abstractC4275giM14375ck);
                i = iM14273k4;
                abstractC4282kpMo17216k4 = abstractC4275giM14375ck.mo17216k4(abstractC4282kpM14378k4, iM14296x1, this, str2, abstractC3524ksM14325l_);
            } else {
                if (mo14065x1(iM14273k4) != null) {
                    return;
                }
                abstractC4282kpMo17216k4 = abstractC4275giM14375ck.mo14415k4(this, str2, abstractC3524ksM14325l_);
                i = iM14273k4;
            }
            if (abstractC4282kpMo17216k4 != null) {
                mo14064k4(i, abstractC4282kpMo17216k4);
            }
        } catch (C1921qq e) {
            this.f9867kk.m14118up().mo14350k4(this, this.f9867kk.m14105ks(), str, str2, e, this.f9867kk.f9753kk);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m14396k4(C9892x1 c9892x1) {
        if (C14113y2.m67448x1(c9892x1.m48712x1(), "xmlns")) {
            return;
        }
        this.f9867kk.m14118up().mo14347k4((Object) this, this.f9867kk.m14105ks(), c9892x1, true, this.f9867kk.f9753kk);
    }
}
