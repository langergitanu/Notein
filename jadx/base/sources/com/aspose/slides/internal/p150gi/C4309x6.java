package com.aspose.slides.internal.p150gi;

import com.aspose.slides.internal.p057c6.InterfaceC1987x1;
import com.aspose.slides.internal.p097e0.AbstractC3524ks;
import com.aspose.slides.internal.p097e0.AbstractC3533um;
import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.gi.x6 */
/* JADX INFO: loaded from: classes.dex */
public class C4309x6 extends AbstractC4275gi implements Cloneable {

    /* JADX INFO: renamed from: dy */
    private AbstractC4275gi f11747dy;

    /* JADX INFO: renamed from: m9 */
    private AbstractC4275gi[] f11748m9;

    public C4309x6(int i) {
        super(i);
        this.f11748m9 = new AbstractC4275gi[11];
        this.f11747dy = null;
    }

    /* JADX INFO: renamed from: kk */
    private static int m17285kk(int i) {
        return ((i & (-512)) >> 9) - 1;
    }

    @Override // com.aspose.slides.internal.p150gi.AbstractC4275gi
    /* JADX INFO: renamed from: a_ */
    public AbstractC4275gi mo17209a_(int i) {
        return this.f11748m9[m17285kk(i)];
    }

    @Override // com.aspose.slides.internal.p150gi.AbstractC4275gi
    /* JADX INFO: renamed from: k4 */
    public AbstractC4282kp mo14302k4(int i, AbstractC3533um abstractC3533um, boolean z, boolean z2) {
        AbstractC4282kp abstractC4282kpMo14302k4 = super.mo14302k4(i, abstractC3533um, z, z2);
        return (i == 0 || abstractC4282kpMo14302k4 == null) ? abstractC4282kpMo14302k4 : m17215k4(abstractC4282kpMo14302k4, i);
    }

    @Override // com.aspose.slides.internal.p150gi.AbstractC4275gi
    /* JADX INFO: renamed from: x1 */
    public AbstractC4282kp mo17139x1(AbstractC4282kp abstractC4282kp, AbstractC3533um abstractC3533um, AbstractC3524ks abstractC3524ks) {
        AbstractC4282kp abstractC4282kpMo17139x1 = this.f11747dy.mo17139x1(abstractC4282kp, abstractC3533um, abstractC3524ks);
        if (abstractC4282kpMo17139x1 == null) {
            return null;
        }
        AbstractC4282kp abstractC4282kpM17286kk = m17286kk(abstractC3533um);
        InterfaceC1987x1 interfaceC1987x1 = (InterfaceC1987x1) abstractC4282kpM17286kk.mo9922g_();
        for (int i = 0; i < 11; i++) {
            AbstractC4275gi abstractC4275gi = this.f11748m9[i];
            if (abstractC4275gi != null && abstractC4275gi.f11668to) {
                interfaceC1987x1.mo10117k4(abstractC4275gi.m17230x1() & (-512), abstractC4282kpMo17139x1, false);
            }
        }
        return abstractC4282kpM17286kk;
    }

    @Override // com.aspose.slides.internal.p150gi.AbstractC4275gi
    /* JADX INFO: renamed from: k4 */
    public AbstractC4282kp mo17212k4(AbstractC3533um abstractC3533um) {
        String str = this.f11669x1;
        return str != null ? mo14415k4(abstractC3533um, str, abstractC3533um.m14404x1()) : m17286kk(abstractC3533um);
    }

    /* JADX INFO: renamed from: kk */
    public final AbstractC4282kp m17286kk(AbstractC3533um abstractC3533um) {
        AbstractC4282kp abstractC4282kpMo17137k4 = mo17137k4();
        InterfaceC1987x1 interfaceC1987x1 = (InterfaceC1987x1) abstractC4282kpMo17137k4.mo9922g_();
        for (int i = 0; i < 11; i++) {
            AbstractC4275gi abstractC4275gi = this.f11748m9[i];
            if (abstractC4275gi != null) {
                interfaceC1987x1.mo10117k4(abstractC4275gi.m17230x1() & (-512), abstractC4275gi.mo17212k4(abstractC3533um), true);
            }
        }
        return abstractC4282kpMo17137k4;
    }

    @Override // com.aspose.slides.internal.p150gi.AbstractC4275gi
    /* JADX INFO: renamed from: x1 */
    public void mo17233x1(AbstractC4275gi abstractC4275gi) {
        int i = abstractC4275gi.f11665k4 & (-512);
        abstractC4275gi.f11665k4 = i;
        abstractC4275gi.f11665k4 = i | this.f11665k4;
        this.f11748m9[m17285kk(abstractC4275gi.m17230x1())] = abstractC4275gi;
        if (this.f11747dy == null && abstractC4275gi.f11668to) {
            this.f11747dy = abstractC4275gi;
        }
    }

    @Override // com.aspose.slides.internal.p150gi.AbstractC4275gi
    /* JADX INFO: renamed from: k4 */
    public AbstractC4282kp mo14415k4(AbstractC3533um abstractC3533um, String str, AbstractC3524ks abstractC3524ks) {
        return mo17139x1(super.mo14415k4(abstractC3533um, str, abstractC3524ks), abstractC3533um, abstractC3524ks);
    }

    @Override // com.aspose.slides.internal.p150gi.AbstractC4275gi
    /* JADX INFO: renamed from: k4 */
    public AbstractC4282kp mo17216k4(AbstractC4282kp abstractC4282kp, int i, AbstractC3533um abstractC3533um, String str, AbstractC3524ks abstractC3524ks) {
        AbstractC4282kp abstractC4282kpMo14415k4;
        if (abstractC4282kp == null) {
            abstractC4282kp = m17286kk(abstractC3533um);
        }
        AbstractC4275gi abstractC4275giMo17209a_ = mo17209a_(i);
        return (abstractC4275giMo17209a_ == null || (abstractC4282kpMo14415k4 = abstractC4275giMo17209a_.mo14415k4(abstractC3533um, str, abstractC3524ks)) == null) ? abstractC4282kp : mo17138k4(abstractC4282kp, i & (-512), abstractC4282kpMo14415k4);
    }

    @Override // com.aspose.slides.internal.p150gi.AbstractC4275gi
    /* JADX INFO: renamed from: k4 */
    public AbstractC4282kp mo17217k4(String str) {
        AbstractC4275gi abstractC4275gi = this.f11747dy;
        AbstractC4282kp abstractC4282kpMo17217k4 = abstractC4275gi != null ? abstractC4275gi.mo17217k4(str) : null;
        return abstractC4282kpMo17217k4 == null ? super.mo17217k4(str) : abstractC4282kpMo17217k4;
    }

    @Override // com.aspose.slides.internal.p150gi.AbstractC4275gi
    /* JADX INFO: renamed from: k4 */
    public void mo17219k4(AbstractC4275gi abstractC4275gi) {
        super.mo17219k4(abstractC4275gi);
        C4309x6 c4309x6 = (C4309x6) C7019kk.m27452k4((Object) abstractC4275gi, C4309x6.class);
        if (c4309x6 != null) {
            for (int i = 0; i < 11; i++) {
                AbstractC4275gi abstractC4275gi2 = c4309x6.f11748m9[i];
                if (abstractC4275gi2 != null) {
                    mo17233x1((AbstractC4275gi) abstractC4275gi2.clone());
                }
            }
        }
    }
}
