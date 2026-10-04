package com.aspose.slides.internal.p238kt;

import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.kt.jw */
/* JADX INFO: loaded from: classes.dex */
public class C5940jw extends AbstractC7020m9<C5940jw> {

    /* JADX INFO: renamed from: k4 */
    static final /* synthetic */ boolean f16795k4 = true;

    /* JADX INFO: renamed from: kk */
    private String f16796kk;

    /* JADX INFO: renamed from: x1 */
    private String f16797x1;

    public Object clone() {
        return Clone();
    }

    public boolean equals(Object obj) {
        if (!f16795k4 && obj == null) {
            throw new AssertionError();
        }
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        if (obj instanceof C5940jw) {
            return m24031x1((C5940jw) obj);
        }
        return false;
    }

    public int hashCode() {
        String str = this.f16797x1;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f16796kk;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public String m24032k4() {
        return this.f16797x1;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: kk, reason: merged with bridge method [inline-methods] */
    public C5940jw Clone() {
        C5940jw c5940jw = new C5940jw();
        CloneTo(c5940jw);
        return c5940jw;
    }

    /* JADX INFO: renamed from: x1 */
    public String m24036x1() {
        return this.f16796kk;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(C5940jw c5940jw) {
        c5940jw.f16797x1 = this.f16797x1;
        c5940jw.f16796kk = this.f16796kk;
    }

    /* JADX INFO: renamed from: x1 */
    public void m24037x1(String str) {
        this.f16796kk = str;
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m24031x1(C5940jw c5940jw) {
        return C14067j2.m66728k4(c5940jw.f16797x1, this.f16797x1) && C14067j2.m66728k4(c5940jw.f16796kk, this.f16796kk);
    }

    /* JADX INFO: renamed from: k4 */
    public void m24034k4(String str) {
        this.f16797x1 = str;
    }
}
