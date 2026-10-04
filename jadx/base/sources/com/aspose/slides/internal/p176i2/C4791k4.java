package com.aspose.slides.internal.p176i2;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.p559ms.System.C14091t6;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.i2.k4 */
/* JADX INFO: loaded from: classes.dex */
public class C4791k4 extends AbstractC7020m9<C4791k4> {

    /* JADX INFO: renamed from: k4 */
    public long f13378k4;

    /* JADX INFO: renamed from: x1 */
    private boolean f13379x1;

    public C4791k4() {
    }

    public Object clone() {
        return Clone();
    }

    public boolean equals(Object obj) {
        if (!m19862k4()) {
            return obj == null;
        }
        if (obj == null) {
            return false;
        }
        return C14091t6.m67192x1(this.f13378k4, obj);
    }

    public int hashCode() {
        if (m19862k4()) {
            return C14091t6.m67182k4(this.f13378k4);
        }
        return 0;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(C4791k4 c4791k4) {
        c4791k4.f13379x1 = this.f13379x1;
        c4791k4.f13378k4 = this.f13378k4;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: kk, reason: merged with bridge method [inline-methods] */
    public C4791k4 Clone() {
        C4791k4 c4791k4 = new C4791k4();
        CloneTo(c4791k4);
        return c4791k4;
    }

    public String toString() {
        return !m19862k4() ? C14113y2.f47374k4 : C14091t6.m67191x1(this.f13378k4);
    }

    /* JADX INFO: renamed from: x1 */
    public final long m19864x1() {
        if (m19862k4()) {
            return this.f13378k4;
        }
        throw new InvalidOperationException("NullableInt64 doesn't have a value.");
    }

    public C4791k4(long j) {
        this.f13378k4 = j;
        this.f13379x1 = true;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m19862k4() {
        return this.f13379x1;
    }
}
