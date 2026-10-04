package com.aspose.slides;

import com.aspose.slides.AbstractC0858ck;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p172hu.AbstractC4682du;
import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.ck */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC0858ck<TLocalData, TEffectiveData extends AbstractC0858ck<TLocalData, TEffectiveData>> extends AbstractC1137ga<TLocalData, TEffectiveData> implements InterfaceC14398rk {

    /* JADX INFO: renamed from: du */
    private long f4330du;

    /* JADX INFO: renamed from: dy */
    private C0963et f4331dy;

    /* JADX INFO: renamed from: h4 */
    private long f4332h4;

    /* JADX INFO: renamed from: k4 */
    InterfaceC14398rk f4333k4;

    /* JADX INFO: renamed from: kk */
    private InterfaceC14376r6 f4334kk;

    /* JADX INFO: renamed from: m9 */
    private FontScheme f4335m9;

    /* JADX INFO: renamed from: to */
    private long f4336to;

    /* JADX INFO: renamed from: x1 */
    ColorFormat f4337x1;

    public AbstractC0858ck(InterfaceC14398rk interfaceC14398rk) {
        this.f4331dy = null;
        this.f4333k4 = interfaceC14398rk;
        this.f4336to = 4294967295L;
    }

    /* JADX INFO: renamed from: h4 */
    private boolean m4595h4() {
        if (C7019kk.m27469x1(this, fuq.class) || m4602X_() == null) {
            return false;
        }
        long jMo4607kk = ((InterfaceC14398rk) m4602X_().createThemeEffective()).mo4607kk();
        boolean z = (this.f4332h4 & 4294967295L) != (4294967295L & jMo4607kk);
        this.f4332h4 = jMo4607kk;
        return z;
    }

    /* JADX INFO: renamed from: k4 */
    public static IBaseSlide m4596k4(InterfaceC14376r6 interfaceC14376r6) {
        ISlideComponent iSlideComponent;
        if (interfaceC14376r6 == null || (iSlideComponent = (ISlideComponent) C7019kk.m27452k4((Object) interfaceC14376r6.getParent_IPresentationComponent(), ISlideComponent.class)) == null) {
            return null;
        }
        return iSlideComponent.getSlide();
    }

    /* JADX INFO: renamed from: m9 */
    private boolean m4600m9() {
        if (C7019kk.m27469x1(this, fuq.class)) {
            return false;
        }
        if (m4602X_() == null) {
            return true;
        }
        FontScheme fontSchemeM6303k4 = ((fuq) m4602X_().createThemeEffective()).m6303k4();
        long jM1513to = fontSchemeM6303k4 != null ? fontSchemeM6303k4.m1513to() : 0L;
        boolean z = (this.f4335m9 == fontSchemeM6303k4 && (this.f4330du & 4294967295L) == (4294967295L & jM1513to)) ? false : true;
        this.f4335m9 = fontSchemeM6303k4;
        this.f4330du = jM1513to;
        return z;
    }

    /* JADX INFO: renamed from: W_ */
    public final TLocalData m4601W_() {
        return (TLocalData) this.f4334kk;
    }

    /* JADX INFO: renamed from: X_ */
    public final IBaseSlide m4602X_() {
        return m4596k4(this.f4334kk);
    }

    /* JADX INFO: renamed from: du */
    public C0963et m4603du() {
        if (this.f4331dy == null) {
            this.f4331dy = new C0963et();
        }
        return this.f4331dy;
    }

    @Override // com.aspose.slides.InterfaceC14398rk
    /* JADX INFO: renamed from: kk */
    public final long mo4607kk() {
        return this.f4336to;
    }

    /* JADX INFO: renamed from: to */
    public final ColorFormat m4608to() {
        return this.f4337x1;
    }

    public AbstractC0858ck(TLocalData tlocaldata) {
        this.f4331dy = null;
        this.f4334kk = (InterfaceC14376r6) tlocaldata;
        this.f4336to = 4294967295L;
        this.f4330du = 4294967295L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public static <TEffectiveData extends AbstractC0858ck, TLocalData> TEffectiveData m4597k4(Class<TEffectiveData> cls, TLocalData tlocaldata, AbstractC4682du<TLocalData, TEffectiveData, TEffectiveData> abstractC4682du) {
        PVIObject pVIObject = (PVIObject) C7019kk.m27452k4((Object) tlocaldata, PVIObject.class);
        if (pVIObject == null || pVIObject.getSlide() == null || pVIObject.getPresentation() == null) {
            return null;
        }
        AbstractC0858ck abstractC0858ckM6057k4 = C1083fa.m6057k4(cls, tlocaldata);
        if ((abstractC0858ckM6057k4.m4601W_() == null || pVIObject.m2138ix() || C1083fa.m6059k4(pVIObject) || C1083fa.m6060x1(pVIObject)) ? false : true) {
            ColorFormat colorFormatM5140k4 = dls.m5140k4(pVIObject);
            if (colorFormatM5140k4 == null || colorFormatM5140k4.getColorType() == -1) {
                colorFormatM5140k4 = abstractC0858ckM6057k4.m4608to();
            }
            C14321pz c14321pzM1075k4 = colorFormatM5140k4 != null ? colorFormatM5140k4.m1075k4((IBaseSlide) pVIObject.getSlide()) : null;
            C0963et c0963etM4603du = abstractC0858ckM6057k4.m4603du();
            C14784xf c14784xf = new C14784xf();
            c14784xf.f50066k4 = abstractC0858ckM6057k4.mo4607kk();
            c14784xf.f50068x1 = colorFormatM5140k4;
            c14784xf.f50067kk = c14321pzM1075k4;
            TEffectiveData teffectivedata = (TEffectiveData) c0963etM4603du.m5684k4(c14784xf.Clone());
            if (teffectivedata != null) {
                return teffectivedata;
            }
            dm6 dm6Var = colorFormatM5140k4 != null ? new dm6(c14321pzM1075k4, colorFormatM5140k4) : dm6.f4613k4;
            TEffectiveData teffectivedata2 = (TEffectiveData) abstractC4682du.mo445k4(tlocaldata, abstractC0858ckM6057k4);
            teffectivedata2.mo4833k4(teffectivedata2.m4602X_(), dm6Var);
            teffectivedata2.mo6273k4(teffectivedata2.m4602X_());
            ((AbstractC0858ck) teffectivedata2).f4336to = ((abstractC0858ckM6057k4.mo4607kk() & 4294967295L) + 1) & 4294967295L;
            c0963etM4603du.m5685k4(c14784xf.Clone(), teffectivedata2);
            return teffectivedata2;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public static <TEffectiveData extends AbstractC0858ck, TLocalData> TEffectiveData m4598k4(Class<TEffectiveData> cls, TEffectiveData[] teffectivedataArr, TLocalData tlocaldata, AbstractC4682du<TLocalData, TEffectiveData, TEffectiveData> abstractC4682du) {
        if (teffectivedataArr[0] == null) {
            TEffectiveData teffectivedata = (TEffectiveData) m4597k4(cls, tlocaldata, abstractC4682du);
            if (teffectivedata != null) {
                return teffectivedata;
            }
            teffectivedataArr[0] = abstractC4682du.mo445k4(tlocaldata, null);
        }
        return teffectivedataArr[0];
    }

    /* JADX INFO: renamed from: k4 */
    public final void m4604k4(Class<TEffectiveData> cls) {
        InterfaceC14398rk interfaceC14398rk = this.f4333k4;
        if (interfaceC14398rk != null) {
            ((AbstractC0858ck) interfaceC14398rk).m4604k4(cls);
            return;
        }
        if (this.f4334kk == null) {
            throw new ArgumentNullException();
        }
        AbstractC0858ck abstractC0858ckM6057k4 = C1083fa.m6057k4(cls, m4601W_());
        long version = this.f4334kk.getVersion() & 4294967295L;
        InterfaceC14398rk interfaceC14398rk2 = abstractC0858ckM6057k4.f4333k4;
        long jMo4607kk = version + ((interfaceC14398rk2 == null ? abstractC0858ckM6057k4.mo4607kk() : interfaceC14398rk2.mo4607kk()) & 4294967295L);
        long j = jMo4607kk & 4294967295L;
        long j2 = jMo4607kk & 4294967295L;
        long j3 = this.f4336to;
        boolean z = j2 != (j3 & 4294967295L);
        if (j2 != (4294967295L & j3)) {
            mo4883k4(abstractC0858ckM6057k4, m4601W_());
        }
        boolean zMo4606k4 = mo4606k4(z) | z;
        boolean zM4605k4 = m4605k4(abstractC0858ckM6057k4);
        boolean zM4595h4 = m4595h4();
        if (zMo4606k4 || zM4605k4 || zM4595h4) {
            IBaseSlide iBaseSlideM4602X_ = m4602X_();
            mo4833k4(iBaseSlideM4602X_, this.f4337x1 != null ? new dm6(this.f4337x1.m1075k4(iBaseSlideM4602X_), this.f4337x1) : dm6.f4613k4);
        }
        if (m4600m9() || zMo4606k4) {
            mo6273k4(m4602X_());
        }
        this.f4336to = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m4605k4(TEffectiveData teffectivedata) {
        ColorFormat colorFormatM5140k4 = dls.m5140k4(this.f4334kk);
        if (colorFormatM5140k4 == null || colorFormatM5140k4.getColorType() == -1) {
            colorFormatM5140k4 = teffectivedata.f4337x1;
        }
        boolean zM4599k4 = m4599k4(colorFormatM5140k4, this.f4337x1);
        this.f4337x1 = colorFormatM5140k4;
        return zM4599k4;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m4599k4(InterfaceC14376r6 interfaceC14376r6, InterfaceC14376r6 interfaceC14376r62) {
        if (interfaceC14376r62 == null && interfaceC14376r6 == null) {
            return false;
        }
        return (interfaceC14376r62 == interfaceC14376r6 && interfaceC14376r62.getVersion() == interfaceC14376r6.getVersion()) ? false : true;
    }

    /* JADX INFO: renamed from: k4 */
    public boolean mo4606k4(boolean z) {
        return false;
    }
}
