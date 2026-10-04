package com.aspose.slides.internal.p539z4;

import com.aspose.slides.internal.p075d5.C3022m9;
import com.aspose.slides.internal.p498xe.C12521uz;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.z4.bs */
/* JADX INFO: loaded from: classes5.dex */
public class C13361bs extends AbstractC13405sv {

    /* JADX INFO: renamed from: k4 */
    private int f44720k4;

    /* JADX INFO: renamed from: x1 */
    private C12521uz[] f44721x1;

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
        return m62039k4((C13361bs) obj);
    }

    @Override // com.aspose.slides.internal.p539z4.AbstractC13373f9
    /* JADX INFO: renamed from: h4 */
    public int mo62023h4() {
        return (m62036k4() * 16) + 4;
    }

    public int hashCode() {
        return (m62036k4() * 397) ^ (m62040x1() != null ? AbstractC14092to.m67208k4((Object) m62040x1()).hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final int m62036k4() {
        return this.f44720k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final C12521uz[] m62040x1() {
        return this.f44721x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62037k4(int i) {
        this.f44720k4 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62038k4(C12521uz[] c12521uzArr) {
        this.f44721x1 = c12521uzArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m62039k4(C13361bs c13361bs) {
        return m62036k4() == c13361bs.m62036k4() && C3022m9.m12723k4(m62040x1(), c13361bs.m62040x1());
    }
}
