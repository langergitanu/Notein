package com.aspose.slides.internal.p247ld;

import com.aspose.slides.internal.p093dv.InterfaceC3375k4;
import com.aspose.slides.internal.p180ib.C4804dy;
import com.aspose.slides.internal.p180ib.InterfaceC4809to;
import com.aspose.slides.internal.p315od.C7024du;
import com.aspose.slides.internal.p315od.C7026h4;
import com.aspose.slides.internal.p340pm.C9466kk;
import com.aspose.slides.internal.p472w8.C11898h4;

/* JADX INFO: renamed from: com.aspose.slides.internal.ld.k4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6026k4 implements InterfaceC3375k4 {

    /* JADX INFO: renamed from: k4 */
    protected final C4804dy f17064k4;

    public AbstractC6026k4(C4804dy c4804dy) {
        this.f17064k4 = c4804dy;
    }

    /* JADX INFO: renamed from: k4 */
    public float m24330k4(float f, float f2, float f3, float f4, float f5) {
        return ((f4 * f2) + f) - (f5 * f3);
    }

    /* JADX INFO: renamed from: k4 */
    public abstract void mo24331k4(InterfaceC4809to interfaceC4809to, C11898h4 c11898h4, float f, float f2, float f3, float f4);

    /* JADX INFO: renamed from: x1 */
    public float m24332x1(float f, float f2, float f3, float f4, float f5) {
        return (f5 * f2) + (f4 * f3) + f;
    }

    @Override // com.aspose.slides.internal.p093dv.InterfaceC3375k4
    /* JADX INFO: renamed from: k4 */
    public void mo13932k4(InterfaceC4809to interfaceC4809to, C7026h4 c7026h4, C9466kk.k4 k4Var) {
        C11898h4 c11898h4M56929m9 = this.f17064k4.m19879k4().m56929m9();
        float fM56897x1 = c7026h4.f19098x1.m56897x1();
        float fM56895kk = c7026h4.f19098x1.m56895kk();
        C7024du c7024du = c7026h4.f19096kk;
        mo24331k4(interfaceC4809to, c11898h4M56929m9, fM56897x1, fM56895kk, -c7024du.f19088k4, -c7024du.f19091x1);
    }

    @Override // com.aspose.slides.internal.p093dv.InterfaceC3375k4
    /* JADX INFO: renamed from: x1 */
    public void mo13933x1(InterfaceC4809to interfaceC4809to, C7026h4 c7026h4, C9466kk.k4 k4Var) {
        C11898h4 c11898h4M56913h4 = this.f17064k4.m19879k4().m56913h4();
        float fM56897x1 = c7026h4.f19098x1.m56897x1();
        float fM56895kk = c7026h4.f19098x1.m56895kk();
        C7024du c7024du = c7026h4.f19096kk;
        mo24331k4(interfaceC4809to, c11898h4M56913h4, fM56897x1, fM56895kk, c7024du.f19088k4, c7024du.f19091x1);
    }
}
