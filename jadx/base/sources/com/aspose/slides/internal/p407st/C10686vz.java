package com.aspose.slides.internal.p407st;

import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p077d8.C3110yd;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p505xn.C12569rv;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.vz */
/* JADX INFO: loaded from: classes4.dex */
public class C10686vz extends AbstractC7020m9<C10686vz> {

    /* JADX INFO: renamed from: k4 */
    public int f37456k4;

    /* JADX INFO: renamed from: x1 */
    public int f37457x1;

    /* JADX INFO: renamed from: x1 */
    private boolean m51887x1(C10686vz c10686vz) {
        return c10686vz.f37456k4 == this.f37456k4 && c10686vz.f37457x1 == this.f37457x1;
    }

    public Object clone() {
        return Clone();
    }

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        if (obj instanceof C10686vz) {
            return m51887x1((C10686vz) obj);
        }
        return false;
    }

    public int hashCode() {
        return C12569rv.m58664k4(Integer.valueOf(this.f37456k4), Integer.valueOf(this.f37457x1));
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public C10686vz Clone() {
        C10686vz c10686vz = new C10686vz();
        CloneTo(c10686vz);
        return c10686vz;
    }

    /* JADX INFO: renamed from: k4 */
    public static C10686vz m51886k4(AbstractC3150x6 abstractC3150x6) {
        C10686vz c10686vz = new C10686vz();
        c10686vz.f37456k4 = C3110yd.m13239k4(abstractC3150x6);
        c10686vz.f37457x1 = C3110yd.m13239k4(abstractC3150x6);
        return c10686vz;
    }

    /* JADX INFO: renamed from: k4 */
    public void m51889k4(C3149x1 c3149x1) {
        c3149x1.m13446k4(C3085sv.m13071k4(this.f37456k4));
        c3149x1.m13446k4(C3085sv.m13071k4(this.f37457x1));
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(C10686vz c10686vz) {
        c10686vz.f37456k4 = this.f37456k4;
        c10686vz.f37457x1 = this.f37457x1;
    }
}
