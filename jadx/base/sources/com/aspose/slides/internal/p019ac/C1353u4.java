package com.aspose.slides.internal.p019ac;

import com.aspose.slides.internal.p075d5.C3022m9;
import com.aspose.slides.internal.p475wh.C12018u4;
import com.aspose.slides.internal.p498xe.C12521uz;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ac.u4 */
/* JADX INFO: loaded from: classes3.dex */
public class C1353u4 extends AbstractC1349ne {

    /* JADX INFO: renamed from: k4 */
    private C1356uz f5869k4;

    /* JADX INFO: renamed from: x1 */
    private C12521uz[] f5870x1;

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
        return m7983k4((C1353u4) obj);
    }

    public int hashCode() {
        C1356uz c1356uz = this.f5869k4;
        int iHashCode = (c1356uz != null ? c1356uz.hashCode() : 0) * 397;
        C12521uz[] c12521uzArr = this.f5870x1;
        return iHashCode ^ (c12521uzArr != null ? AbstractC14092to.m67208k4((Object) c12521uzArr).hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final C1356uz m7980k4() {
        return this.f5869k4;
    }

    /* JADX INFO: renamed from: kk */
    public final C12018u4 m7984kk() {
        C12018u4 c12018u4 = new C12018u4();
        c12018u4.m56764to();
        if (m7985x1() != null) {
            for (C12521uz c12521uz : m7985x1()) {
                c12018u4.m56760kk(c12521uz.m58249dy().Clone());
            }
        }
        return c12018u4;
    }

    /* JADX INFO: renamed from: x1 */
    public final C12521uz[] m7985x1() {
        return this.f5870x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m7981k4(C1356uz c1356uz) {
        this.f5869k4 = c1356uz;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m7982k4(C12521uz[] c12521uzArr) {
        this.f5870x1 = c12521uzArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m7983k4(C1353u4 c1353u4) {
        return C14067j2.m66728k4(this.f5869k4, c1353u4.f5869k4) && C3022m9.m12723k4(this.f5870x1, c1353u4.f5870x1);
    }
}
