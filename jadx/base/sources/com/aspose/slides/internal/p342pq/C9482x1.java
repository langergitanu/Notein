package com.aspose.slides.internal.p342pq;

import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.p559ms.System.AbstractC14068j5;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.pq.x1 */
/* JADX INFO: loaded from: classes4.dex */
public class C9482x1 extends AbstractC7020m9<C9482x1> {

    /* JADX INFO: renamed from: k4 */
    static final /* synthetic */ boolean f34538k4 = true;

    /* JADX INFO: renamed from: kk */
    private AbstractC14068j5 f34539kk;

    /* JADX INFO: renamed from: to */
    private Object f34540to;

    /* JADX INFO: renamed from: x1 */
    private String f34541x1;

    public C9482x1() {
    }

    public Object clone() {
        return Clone();
    }

    public boolean equals(Object obj) {
        if (!f34538k4 && obj == null) {
            throw new AssertionError();
        }
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        if (obj instanceof C9482x1) {
            return m46674x1((C9482x1) obj);
        }
        return false;
    }

    public int hashCode() {
        String str = this.f34541x1;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        AbstractC14068j5 abstractC14068j5 = this.f34539kk;
        int iHashCode2 = (iHashCode + (abstractC14068j5 != null ? abstractC14068j5.hashCode() : 0)) * 31;
        Object obj = this.f34540to;
        return iHashCode2 + (obj != null ? obj.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public String m46675k4() {
        return this.f34541x1;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: kk, reason: merged with bridge method [inline-methods] */
    public C9482x1 Clone() {
        C9482x1 c9482x1 = new C9482x1();
        CloneTo(c9482x1);
        return c9482x1;
    }

    /* JADX INFO: renamed from: x1 */
    public Object m46678x1() {
        return this.f34540to;
    }

    public C9482x1(String str, AbstractC14068j5 abstractC14068j5, Object obj) {
        this.f34541x1 = str;
        this.f34539kk = abstractC14068j5;
        this.f34540to = obj;
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m46674x1(C9482x1 c9482x1) {
        return C14067j2.m66728k4(c9482x1.f34541x1, this.f34541x1) && C14067j2.m66728k4(c9482x1.f34539kk, this.f34539kk) && C14067j2.m66728k4(c9482x1.f34540to, this.f34540to);
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(C9482x1 c9482x1) {
        c9482x1.f34541x1 = this.f34541x1;
        c9482x1.f34539kk = this.f34539kk;
        c9482x1.f34540to = this.f34540to;
    }
}
