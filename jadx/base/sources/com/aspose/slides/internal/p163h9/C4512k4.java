package com.aspose.slides.internal.p163h9;

import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.internal.p151gj.C4325rv;
import com.aspose.slides.internal.p151gj.C4329x6;
import com.aspose.slides.internal.p233kn.C5888k4;
import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.h9.k4 */
/* JADX INFO: loaded from: classes.dex */
public class C4512k4 extends AbstractC7020m9<C4512k4> {

    /* JADX INFO: renamed from: k4 */
    public C5888k4<C4329x6> f12570k4 = new C5888k4<>();

    /* JADX INFO: renamed from: kk */
    public IGenericList<C4325rv> f12571kk;

    /* JADX INFO: renamed from: x1 */
    public byte[] f12572x1;

    /* JADX INFO: renamed from: x1 */
    private boolean m18599x1(C4512k4 c4512k4) {
        return C14067j2.m66728k4(c4512k4.f12570k4, this.f12570k4) && C14067j2.m66728k4(c4512k4.f12572x1, this.f12572x1) && C14067j2.m66728k4(c4512k4.f12571kk, this.f12571kk);
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
        if (obj instanceof C4512k4) {
            return m18599x1((C4512k4) obj);
        }
        return false;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public C4512k4 Clone() {
        C4512k4 c4512k4 = new C4512k4();
        CloneTo(c4512k4);
        return c4512k4;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(C4512k4 c4512k4) {
        this.f12570k4.CloneTo(c4512k4.f12570k4);
        c4512k4.f12572x1 = this.f12572x1;
        c4512k4.f12571kk = this.f12571kk;
    }
}
