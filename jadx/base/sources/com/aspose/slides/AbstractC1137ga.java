package com.aspose.slides;

import com.aspose.slides.AbstractC1137ga;
import com.aspose.slides.internal.p077d8.C3085sv;

/* JADX INFO: renamed from: com.aspose.slides.ga */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC1137ga<TLocalData, TEffectiveData extends AbstractC1137ga<TLocalData, TEffectiveData>> implements InterfaceC14672vc {
    public final boolean equals(Object obj) {
        AbstractC1137ga abstractC1137ga;
        try {
            abstractC1137ga = (AbstractC1137ga) obj;
        } catch (ClassCastException e) {
            C3085sv.m13082k4(e);
            abstractC1137ga = null;
        }
        if (abstractC1137ga == null) {
            return false;
        }
        return mo4836k4(abstractC1137ga);
    }

    public final int hashCode() {
        return 23454;
    }

    /* JADX INFO: renamed from: k4 */
    public void mo6273k4(IBaseSlide iBaseSlide) {
    }

    /* JADX INFO: renamed from: k4 */
    public abstract void mo4883k4(InterfaceC14672vc interfaceC14672vc, TLocalData tlocaldata);

    /* JADX INFO: renamed from: k4 */
    public abstract boolean mo4836k4(TEffectiveData teffectivedata);

    /* JADX INFO: renamed from: k4 */
    public void mo4833k4(IBaseSlide iBaseSlide, dm6 dm6Var) {
    }
}
