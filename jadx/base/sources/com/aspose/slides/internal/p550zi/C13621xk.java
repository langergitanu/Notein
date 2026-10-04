package com.aspose.slides.internal.p550zi;

import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.zi.xk */
/* JADX INFO: loaded from: classes5.dex */
public class C13621xk extends AbstractC7020m9<C13621xk> {

    /* JADX INFO: renamed from: to */
    static final /* synthetic */ boolean f45227to = true;

    /* JADX INFO: renamed from: k4 */
    public boolean f45228k4;

    /* JADX INFO: renamed from: kk */
    public String f45229kk;

    /* JADX INFO: renamed from: x1 */
    public int f45230x1;

    /* JADX INFO: renamed from: x1 */
    private boolean m62870x1(C13621xk c13621xk) {
        return c13621xk.f45228k4 == this.f45228k4 && c13621xk.f45230x1 == this.f45230x1 && C14067j2.m66728k4(c13621xk.f45229kk, this.f45229kk);
    }

    public Object clone() {
        return Clone();
    }

    public boolean equals(Object obj) {
        if (!f45227to && obj == null) {
            throw new AssertionError();
        }
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        if (obj instanceof C13621xk) {
            return m62870x1((C13621xk) obj);
        }
        return false;
    }

    public int hashCode() {
        int i = (((this.f45228k4 ? 1 : 0) * 31) + this.f45230x1) * 31;
        String str = this.f45229kk;
        return i + (str != null ? str.hashCode() : 0);
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public C13621xk Clone() {
        C13621xk c13621xk = new C13621xk();
        CloneTo(c13621xk);
        return c13621xk;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(C13621xk c13621xk) {
        c13621xk.f45228k4 = this.f45228k4;
        c13621xk.f45230x1 = this.f45230x1;
        c13621xk.f45229kk = this.f45229kk;
    }
}
