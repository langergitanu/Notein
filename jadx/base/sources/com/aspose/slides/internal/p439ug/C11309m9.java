package com.aspose.slides.internal.p439ug;

import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ug.m9 */
/* JADX INFO: loaded from: classes4.dex */
public class C11309m9 extends AbstractC7020m9<C11309m9> {

    /* JADX INFO: renamed from: to */
    static final /* synthetic */ boolean f38903to = true;

    /* JADX INFO: renamed from: k4 */
    public int f38904k4;

    /* JADX INFO: renamed from: kk */
    public int f38905kk;

    /* JADX INFO: renamed from: x1 */
    public String f38906x1;

    /* JADX INFO: renamed from: x1 */
    private boolean m54319x1(C11309m9 c11309m9) {
        return c11309m9.f38904k4 == this.f38904k4 && C14067j2.m66728k4(c11309m9.f38906x1, this.f38906x1) && c11309m9.f38905kk == this.f38905kk;
    }

    public Object clone() {
        return Clone();
    }

    public boolean equals(Object obj) {
        if (!f38903to && obj == null) {
            throw new AssertionError();
        }
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        if (obj instanceof C11309m9) {
            return m54319x1((C11309m9) obj);
        }
        return false;
    }

    public int hashCode() {
        int i = this.f38904k4 * 31;
        String str = this.f38906x1;
        return ((i + (str != null ? str.hashCode() : 0)) * 31) + this.f38905kk;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public C11309m9 Clone() {
        C11309m9 c11309m9 = new C11309m9();
        CloneTo(c11309m9);
        return c11309m9;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(C11309m9 c11309m9) {
        c11309m9.f38904k4 = this.f38904k4;
        c11309m9.f38906x1 = this.f38906x1;
        c11309m9.f38905kk = this.f38905kk;
    }
}
