package com.aspose.slides.internal.p539z4;

import com.aspose.slides.p559ms.System.C14051ck;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.z4.ck */
/* JADX INFO: loaded from: classes5.dex */
public class C13367ck extends AbstractC13405sv {

    /* JADX INFO: renamed from: k4 */
    private float f44733k4;

    /* JADX INFO: renamed from: x1 */
    private boolean f44734x1;

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
        return m62072k4((C13367ck) obj);
    }

    @Override // com.aspose.slides.internal.p539z4.AbstractC13373f9
    /* JADX INFO: renamed from: h4 */
    public int mo62023h4() {
        return 8;
    }

    public int hashCode() {
        return (C14064he.m66708k4(this.f44733k4) * 397) ^ C14051ck.m66552k4(this.f44734x1);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62070k4(float f) {
        this.f44733k4 = f;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62071k4(boolean z) {
        this.f44734x1 = z;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m62072k4(C13367ck c13367ck) {
        return C14064he.m66718x1(this.f44733k4, c13367ck.f44733k4) && C14051ck.m66558x1(this.f44734x1, c13367ck.f44734x1);
    }
}
