package com.aspose.slides;

import com.aspose.slides.AbstractC13680jc;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.jc */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC13680jc<TLocalData, TEffectiveData extends AbstractC13680jc<TLocalData, TEffectiveData>> implements IEffectEffectiveData, InterfaceC13788lo, InterfaceC14398rk {

    /* JADX INFO: renamed from: du */
    long f45465du = 4294967295L;

    /* JADX INFO: renamed from: h4 */
    private long f45466h4;

    /* JADX INFO: renamed from: k4 */
    private Class<TLocalData> f45467k4;

    /* JADX INFO: renamed from: kk */
    private final InterfaceC14376r6 f45468kk;

    /* JADX INFO: renamed from: to */
    ColorFormat f45469to;

    /* JADX INFO: renamed from: x1 */
    private Class<TEffectiveData> f45470x1;

    public AbstractC13680jc(TLocalData tlocaldata, Class<TLocalData> cls, Class<TEffectiveData> cls2) {
        this.f45467k4 = cls;
        this.f45470x1 = cls2;
        this.f45468kk = (InterfaceC14376r6) tlocaldata;
    }

    /* JADX INFO: renamed from: k4 */
    public static IBaseSlide m63280k4(InterfaceC14376r6 interfaceC14376r6) {
        ISlideComponent iSlideComponent;
        if (interfaceC14376r6 == null || (iSlideComponent = (ISlideComponent) C7019kk.m27452k4((Object) interfaceC14376r6.getParent_IPresentationComponent(), ISlideComponent.class)) == null) {
            return null;
        }
        return iSlideComponent.getSlide();
    }

    public final boolean equals(Object obj) {
        AbstractC13680jc abstractC13680jc = (AbstractC13680jc) C7019kk.m27452k4(obj, (Class) this.f45470x1);
        if (abstractC13680jc == null) {
            return false;
        }
        return mo6436k4(abstractC13680jc);
    }

    public final int hashCode() {
        return 23454;
    }

    /* JADX INFO: renamed from: k4 */
    public abstract void mo6434k4(InterfaceC14672vc interfaceC14672vc, TLocalData tlocaldata);

    /* JADX INFO: renamed from: k4 */
    public abstract boolean mo6436k4(TEffectiveData teffectivedata);

    @Override // com.aspose.slides.InterfaceC14398rk
    /* JADX INFO: renamed from: kk */
    public final long mo4607kk() {
        return this.f45465du;
    }

    /* JADX INFO: renamed from: k4 */
    public String mo3874k4() {
        return C14067j2.m66727k4(this).mo48540du();
    }

    /* JADX INFO: renamed from: k4 */
    public void mo4351k4(IBaseSlide iBaseSlide, dm6 dm6Var) {
    }

    /* JADX INFO: renamed from: k4 */
    public final void m63282k4(Class<TEffectiveData> cls) {
        if (this.f45468kk == null) {
            throw new ArgumentNullException();
        }
        AbstractC13680jc abstractC13680jc = (AbstractC13680jc) C0839c2.m4426k4(cls);
        if (abstractC13680jc == null) {
            throw new RuntimeException("Cannot get value from the cache.");
        }
        long version = (this.f45468kk.getVersion() & 4294967295L) + (abstractC13680jc.f45465du & 4294967295L);
        long j = version & 4294967295L;
        long j2 = version & 4294967295L;
        long j3 = this.f45465du;
        boolean z = false;
        boolean z2 = j2 != (j3 & 4294967295L);
        if (j2 != (j3 & 4294967295L)) {
            mo6434k4(abstractC13680jc, this.f45468kk);
        }
        ColorFormat colorFormatM5140k4 = dls.m5140k4(this.f45468kk);
        if (colorFormatM5140k4 == null || colorFormatM5140k4.getColorType() == -1) {
            colorFormatM5140k4 = abstractC13680jc.f45469to;
        }
        boolean zM63281k4 = m63281k4(colorFormatM5140k4, this.f45469to);
        this.f45469to = colorFormatM5140k4;
        IBaseSlide iBaseSlideM63280k4 = m63280k4(this.f45468kk);
        if (iBaseSlideM63280k4 != null) {
            long jMo4607kk = ((InterfaceC14398rk) iBaseSlideM63280k4.createThemeEffective()).mo4607kk();
            boolean z3 = (this.f45466h4 & 4294967295L) != (jMo4607kk & 4294967295L);
            this.f45466h4 = jMo4607kk;
            z = z3;
        }
        if (z2 || zM63281k4 || z) {
            mo4351k4(iBaseSlideM63280k4, this.f45469to != null ? new dm6(this.f45469to.m1075k4(iBaseSlideM63280k4), this.f45469to) : dm6.f4613k4);
        }
        this.f45465du = j;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m63281k4(InterfaceC14376r6 interfaceC14376r6, InterfaceC14376r6 interfaceC14376r62) {
        if (interfaceC14376r62 == null && interfaceC14376r6 == null) {
            return false;
        }
        return (interfaceC14376r62 == interfaceC14376r6 && interfaceC14376r62.getVersion() == interfaceC14376r6.getVersion()) ? false : true;
    }
}
