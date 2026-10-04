package com.aspose.slides.internal.p150gi;

import androidx.core.app.FrameMetricsAggregator;
import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p051bz.C1904ar;
import com.aspose.slides.internal.p051bz.C1921qq;
import com.aspose.slides.internal.p051bz.C1925um;
import com.aspose.slides.internal.p057c6.C1985m9;
import com.aspose.slides.internal.p057c6.InterfaceC1979du;
import com.aspose.slides.internal.p057c6.InterfaceC1987x1;
import com.aspose.slides.internal.p097e0.AbstractC3524ks;
import com.aspose.slides.internal.p097e0.AbstractC3533um;
import com.aspose.slides.internal.p097e0.C3521jd;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.gi.gi */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4275gi {

    /* JADX INFO: renamed from: du */
    protected AbstractC4282kp f11660du;

    /* JADX INFO: renamed from: fa */
    private InterfaceC4268dq f11662fa;

    /* JADX INFO: renamed from: h4 */
    protected C4277ix f11663h4;

    /* JADX INFO: renamed from: k4 */
    public int f11665k4;

    /* JADX INFO: renamed from: m9 */
    private boolean f11667m9 = true;

    /* JADX INFO: renamed from: dy */
    private Dictionary<String, AbstractC4282kp> f11661dy = null;

    /* JADX INFO: renamed from: c5 */
    private Dictionary<String, String> f11658c5 = null;

    /* JADX INFO: renamed from: x1 */
    protected String f11669x1 = null;

    /* JADX INFO: renamed from: kk */
    protected boolean f11666kk = false;

    /* JADX INFO: renamed from: to */
    public boolean f11668to = false;

    /* JADX INFO: renamed from: jd */
    private int f11664jd = -1;

    /* JADX INFO: renamed from: ck */
    private AbstractC4275gi[] f11659ck = null;

    public AbstractC4275gi(int i) {
        this.f11665k4 = i;
    }

    /* JADX INFO: renamed from: a_ */
    public AbstractC4275gi mo17209a_(int i) {
        throw new Exception("Unable to add subproperties");
    }

    public final Object clone() {
        return m17211du();
    }

    /* JADX INFO: renamed from: du */
    public final AbstractC4282kp m17210du(AbstractC3533um abstractC3533um) {
        AbstractC4282kp abstractC4282kpMo14062x1;
        AbstractC4275gi[] abstractC4275giArr = this.f11659ck;
        if (abstractC4275giArr == null) {
            return null;
        }
        int length = abstractC4275giArr.length;
        for (int i = 0; i < length; i++) {
            AbstractC4275gi abstractC4275gi = this.f11659ck[i];
            if (abstractC4275gi == null) {
                break;
            }
            AbstractC4282kp abstractC4282kpMo14065x1 = abstractC3533um.mo14065x1(abstractC4275gi.f11665k4);
            if (abstractC4282kpMo14065x1 != null && (abstractC4282kpMo14062x1 = abstractC4275gi.f11662fa.mo14062x1(m17230x1(), abstractC4282kpMo14065x1, this, abstractC3533um)) != null) {
                return abstractC4282kpMo14062x1;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public AbstractC4282kp mo17137k4() {
        return null;
    }

    /* JADX INFO: renamed from: kk */
    public final String m17225kk(String str) {
        String str2;
        Dictionary<String, String> dictionary = this.f11658c5;
        return (dictionary == null || !dictionary.containsKey(str) || (str2 = this.f11658c5.get_Item(str)) == null) ? str : str2;
    }

    /* JADX INFO: renamed from: to */
    public AbstractC4282kp mo17228to(AbstractC3533um abstractC3533um) {
        C4277ix c4277ix = this.f11663h4;
        if (c4277ix != null) {
            return c4277ix.mo17241x1(abstractC3533um);
        }
        return null;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m17230x1() {
        return this.f11665k4;
    }

    /* JADX INFO: renamed from: du */
    public Object m17211du() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public AbstractC4282kp mo14302k4(int i, AbstractC3533um abstractC3533um, boolean z, boolean z2) {
        AbstractC4282kp abstractC4282kpM17214k4 = m17214k4(abstractC3533um, z);
        return (abstractC4282kpM17214k4 == null && z2) ? mo17212k4(abstractC3533um) : abstractC4282kpM17214k4;
    }

    /* JADX INFO: renamed from: kk */
    public final void m17226kk(AbstractC4275gi abstractC4275gi) {
        if (this.f11659ck == null) {
            this.f11659ck = new AbstractC4275gi[3];
        }
        int i = 0;
        while (true) {
            AbstractC4275gi[] abstractC4275giArr = this.f11659ck;
            if (i >= abstractC4275giArr.length) {
                return;
            }
            if (abstractC4275giArr[i] == null) {
                abstractC4275giArr[i] = abstractC4275gi;
                return;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: to */
    public final String m17229to() {
        return C3521jd.m14278k4(this.f11665k4);
    }

    /* JADX INFO: renamed from: x1 */
    public InterfaceC1979du mo17231x1(AbstractC3533um abstractC3533um) {
        int i = this.f11664jd;
        if (i == -1) {
            return null;
        }
        return new C1985m9(abstractC3533um, i);
    }

    /* JADX INFO: renamed from: k4 */
    public AbstractC4282kp mo17212k4(AbstractC3533um abstractC3533um) {
        AbstractC4282kp abstractC4282kp = this.f11660du;
        if (abstractC4282kp != null) {
            return abstractC4282kp;
        }
        AbstractC4282kp abstractC4282kpMo14415k4 = mo14415k4(abstractC3533um, this.f11669x1, abstractC3533um.m14404x1());
        if (!this.f11666kk) {
            this.f11660du = abstractC4282kpMo14415k4;
        }
        return abstractC4282kpMo14415k4;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m17227kk() {
        return this.f11667m9;
    }

    /* JADX INFO: renamed from: x1 */
    public AbstractC4282kp mo17139x1(AbstractC4282kp abstractC4282kp, AbstractC3533um abstractC3533um, AbstractC3524ks abstractC3524ks) {
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC4282kp m17213k4(AbstractC3533um abstractC3533um, AbstractC4282kp abstractC4282kp, AbstractC3524ks abstractC3524ks) {
        String strMo9925i_;
        AbstractC4282kp abstractC4282kpMo17139x1 = mo17139x1(abstractC4282kp, abstractC3533um, abstractC3524ks);
        if (abstractC4282kpMo17139x1 == null && (strMo9925i_ = abstractC4282kp.mo9925i_()) != null && (abstractC4282kpMo17139x1 = mo17217k4(strMo9925i_)) == null) {
            String strM17225kk = m17225kk(strMo9925i_);
            if (!C14113y2.m67363du(strM17225kk, strMo9925i_)) {
                return mo17139x1(C1925um.m9912k4(strM17225kk, new C1904ar(this, abstractC3533um)), abstractC3533um, abstractC3524ks);
            }
        }
        return abstractC4282kpMo17139x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m17232x1(int i) {
        this.f11664jd = i;
    }

    /* JADX INFO: renamed from: k4 */
    public AbstractC4282kp mo14415k4(AbstractC3533um abstractC3533um, String str, AbstractC3524ks abstractC3524ks) {
        AbstractC4282kp abstractC4282kpMo17217k4;
        try {
            if (C14113y2.m67363du(str, "inherit")) {
                abstractC4282kpMo17217k4 = abstractC3533um.m14400m9(this.f11665k4 & FrameMetricsAggregator.EVERY_DURATION);
                int i = this.f11665k4;
                if ((i & (-512)) != 0) {
                    abstractC4282kpMo17217k4 = m17215k4(abstractC4282kpMo17217k4, i & (-512));
                }
            } else {
                str = m17225kk(C14113y2.m67440x1(str));
                abstractC4282kpMo17217k4 = mo17217k4(str);
            }
            if (abstractC4282kpMo17217k4 == null) {
                abstractC4282kpMo17217k4 = C1925um.m9912k4(str, new C1904ar(this, abstractC3533um));
            }
            if (abstractC4282kpMo17217k4 != null) {
                abstractC4282kpMo17217k4 = mo17139x1(abstractC4282kpMo17217k4, abstractC3533um, abstractC3524ks);
            }
            if (abstractC4282kpMo17217k4 != null) {
                return abstractC4282kpMo17217k4;
            }
            throw new C1921qq(C14113y2.m67408k4("No conversion defined ", str));
        } catch (C1921qq e) {
            if (abstractC3524ks != null) {
                e.m59590k4(abstractC3524ks.m14106m_());
            }
            e.m9888k4(m17229to());
            throw e;
        }
    }

    /* JADX INFO: renamed from: x1 */
    public void mo17233x1(AbstractC4275gi abstractC4275gi) {
        throw new Exception(C14113y2.m67408k4("Unable to add subproperties ", C14067j2.m66727k4(this).mo48540du()));
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC4282kp m17214k4(AbstractC3533um abstractC3533um, boolean z) {
        AbstractC4282kp abstractC4282kpMo14065x1;
        AbstractC3533um abstractC3533umM14397kk;
        C4277ix c4277ix = this.f11663h4;
        if (c4277ix == null || !c4277ix.mo17239k4(abstractC3533um)) {
            abstractC4282kpMo14065x1 = abstractC3533um.mo14065x1(this.f11665k4);
            if (abstractC4282kpMo14065x1 == null) {
                abstractC4282kpMo14065x1 = m17210du(abstractC3533um);
            }
            if (abstractC4282kpMo14065x1 == null) {
                abstractC4282kpMo14065x1 = mo17228to(abstractC3533um);
            }
        } else {
            abstractC4282kpMo14065x1 = this.f11663h4.mo17241x1(abstractC3533um);
        }
        return (abstractC4282kpMo14065x1 == null && z && (abstractC3533umM14397kk = abstractC3533um.m14397kk()) != null && m17227kk()) ? abstractC3533umM14397kk.mo14063k4(this.f11665k4, true, false) : abstractC4282kpMo14065x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m17234x1(String str) {
        this.f11669x1 = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC4282kp m17215k4(AbstractC4282kp abstractC4282kp, int i) {
        return ((InterfaceC1987x1) abstractC4282kp.mo9922g_()).mo10116k4(i);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m17235x1(boolean z) {
        this.f11668to = z;
    }

    /* JADX INFO: renamed from: k4 */
    public AbstractC4282kp mo17216k4(AbstractC4282kp abstractC4282kp, int i, AbstractC3533um abstractC3533um, String str, AbstractC3524ks abstractC3524ks) {
        return abstractC4282kp;
    }

    /* JADX INFO: renamed from: k4 */
    public AbstractC4282kp mo17138k4(AbstractC4282kp abstractC4282kp, int i, AbstractC4282kp abstractC4282kp2) {
        ((InterfaceC1987x1) abstractC4282kp.mo9922g_()).mo10117k4(i, abstractC4282kp2, false);
        return abstractC4282kp;
    }

    /* JADX INFO: renamed from: k4 */
    public AbstractC4282kp mo14303k4(AbstractC4282kp abstractC4282kp, AbstractC3533um abstractC3533um, AbstractC3524ks abstractC3524ks) {
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public AbstractC4282kp mo17217k4(String str) {
        Dictionary<String, AbstractC4282kp> dictionary = this.f11661dy;
        if (dictionary == null || !dictionary.containsKey(str)) {
            return null;
        }
        return this.f11661dy.get_Item(str);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m17218k4(InterfaceC4268dq interfaceC4268dq) {
        this.f11662fa = interfaceC4268dq;
    }

    /* JADX INFO: renamed from: k4 */
    public void mo17219k4(AbstractC4275gi abstractC4275gi) {
        this.f11666kk = abstractC4275gi.f11666kk;
        this.f11667m9 = abstractC4275gi.f11667m9;
        this.f11669x1 = abstractC4275gi.f11669x1;
        this.f11664jd = abstractC4275gi.f11664jd;
        AbstractC4275gi[] abstractC4275giArr = abstractC4275gi.f11659ck;
        if (abstractC4275giArr != null) {
            this.f11659ck = new AbstractC4275gi[abstractC4275giArr.length];
            AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) abstractC4275gi.f11659ck), 0, AbstractC14092to.m67208k4((Object) this.f11659ck), 0, this.f11659ck.length);
        }
        if (abstractC4275gi.f11661dy != null) {
            this.f11661dy = new Dictionary<>(abstractC4275gi.f11661dy);
        }
        if (abstractC4275gi.f11658c5 != null) {
            this.f11658c5 = new Dictionary<>(abstractC4275gi.f11658c5);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m17220k4(C4277ix c4277ix) {
        this.f11663h4 = c4277ix;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m17221k4(String str, AbstractC4282kp abstractC4282kp) {
        if (this.f11661dy == null) {
            this.f11661dy = new Dictionary<>();
        }
        this.f11661dy.set_Item(str, abstractC4282kp);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m17222k4(String str, String str2) {
        if (this.f11658c5 == null) {
            this.f11658c5 = new Dictionary<>();
        }
        this.f11658c5.set_Item(str, str2);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m17223k4(String str, boolean z) {
        this.f11669x1 = str;
        this.f11666kk = z;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m17224k4(boolean z) {
        this.f11667m9 = z;
    }
}
