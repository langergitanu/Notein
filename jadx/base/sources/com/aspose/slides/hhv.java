package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p505xn.C12569rv;
import com.aspose.slides.p559ms.System.C14067j2;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
class hhv extends AbstractC7020m9<hhv> {

    /* JADX INFO: renamed from: k4 */
    public IGenericEnumerable<odu> f5506k4;

    /* JADX INFO: renamed from: x1 */
    public oju[] f5507x1;

    /* JADX INFO: renamed from: x1 */
    private boolean m7154x1(hhv hhvVar) {
        return C14067j2.m66728k4(hhvVar.f5506k4, this.f5506k4) && C14067j2.m66728k4(hhvVar.f5507x1, this.f5507x1);
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
        if (obj instanceof hhv) {
            return m7154x1((hhv) obj);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f5507x1) + (C12569rv.m58664k4(this.f5506k4) * 31);
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public hhv Clone() {
        hhv hhvVar = new hhv();
        CloneTo(hhvVar);
        return hhvVar;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(hhv hhvVar) {
        hhvVar.f5506k4 = this.f5506k4;
        hhvVar.f5507x1 = this.f5507x1;
    }
}
