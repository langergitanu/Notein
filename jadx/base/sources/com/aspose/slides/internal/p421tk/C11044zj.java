package com.aspose.slides.internal.p421tk;

import com.aspose.slides.internal.p075d5.C3022m9;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.tk.zj */
/* JADX INFO: loaded from: classes4.dex */
public class C11044zj extends AbstractC10986bs {

    /* JADX INFO: renamed from: k4 */
    private C12014ne[] f38382k4;

    public C11044zj(C10988bz c10988bz) {
        super(c10988bz);
    }

    @Override // com.aspose.slides.internal.p421tk.C10988bz
    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        if (C14067j2.m66727k4(obj) != C14067j2.m66727k4(this)) {
            return false;
        }
        return m53471k4((C11044zj) obj);
    }

    @Override // com.aspose.slides.internal.p421tk.C10988bz
    public int hashCode() {
        return (super.hashCode() * 397) ^ (m53473m9() != null ? AbstractC14092to.m67208k4((Object) m53473m9()).hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53470k4(C12014ne[] c12014neArr) {
        this.f38382k4 = c12014neArr;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m53472kk() {
        return (au_() & 128) > 0;
    }

    /* JADX INFO: renamed from: m9 */
    public final C12014ne[] m53473m9() {
        return this.f38382k4;
    }

    /* JADX INFO: renamed from: to */
    public final short m53474to() {
        return (short) (au_() & Short.MAX_VALUE);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m53471k4(C11044zj c11044zj) {
        return m53202k4((C10988bz) c11044zj) && C3022m9.m12723k4(m53473m9(), c11044zj.m53473m9());
    }
}
