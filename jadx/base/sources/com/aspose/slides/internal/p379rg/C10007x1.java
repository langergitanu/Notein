package com.aspose.slides.internal.p379rg;

import com.aspose.slides.internal.p087dm.C3182du;
import com.aspose.slides.internal.p087dm.InterfaceC3186k4;
import com.aspose.slides.internal.p115eq.C3786fa;
import com.aspose.slides.internal.p252lk.C6104k4;
import com.aspose.slides.internal.p404sp.C10307du;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12015qq;

/* JADX INFO: renamed from: com.aspose.slides.internal.rg.x1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10007x1 extends C3182du implements InterfaceC3186k4 {
    public C10007x1() {
        this.f9456h4 = "mask";
    }

    /* JADX INFO: renamed from: ak */
    public final C10307du m49130ak() {
        return C10307du.m50262k4(this.f9461x1.m13692to("x"), C10307du.m50264x1(-10.0f));
    }

    /* JADX INFO: renamed from: b3 */
    public final int m49131b3() {
        return C6104k4.m24738k4(this.f9461x1.m13690kk("maskUnits", "objectBoundingBox"));
    }

    /* JADX INFO: renamed from: c6 */
    public final C10307du m49132c6() {
        return C10307du.m50262k4(this.f9461x1.m13692to("height"), C10307du.m50264x1(120.0f));
    }

    /* JADX INFO: renamed from: dq */
    public final C10307du m49133dq() {
        return C10307du.m50262k4(this.f9461x1.m13692to("y"), C10307du.m50264x1(-10.0f));
    }

    @Override // com.aspose.slides.internal.p087dm.InterfaceC3186k4
    /* JADX INFO: renamed from: k4 */
    public final C12007ix mo13679k4(C3786fa c3786fa, C12015qq c12015qq) {
        C12015qq c12015qqClone = c12015qq.Clone();
        return c12015qqClone.m56696k4() ? C12007ix.f40519k4 : new C12007ix(c3786fa.m15125k4(m49130ak(), "x", this, c12015qqClone.Clone()), c3786fa.m15125k4(m49133dq(), "y", this, c12015qqClone.Clone()), c3786fa.m15125k4(m49135xk(), "width", this, c12015qqClone.Clone()), c3786fa.m15125k4(m49132c6(), "height", this, c12015qqClone.Clone()));
    }

    /* JADX INFO: renamed from: wy */
    public final int m49134wy() {
        return C6104k4.m24738k4(this.f9461x1.m13690kk("maskContentUnits", "userSpaceOnUse"));
    }

    /* JADX INFO: renamed from: xk */
    public final C10307du m49135xk() {
        return C10307du.m50262k4(this.f9461x1.m13692to("width"), C10307du.m50264x1(120.0f));
    }
}
