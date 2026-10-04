package com.aspose.slides.internal.p539z4;

import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.z4.ks */
/* JADX INFO: loaded from: classes5.dex */
public class C13390ks extends AbstractC13405sv {

    /* JADX INFO: renamed from: k4 */
    private int f44788k4;

    /* JADX INFO: renamed from: x1 */
    private int f44789x1;

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
        return m62197k4((C13390ks) obj);
    }

    @Override // com.aspose.slides.internal.p539z4.AbstractC13373f9
    /* JADX INFO: renamed from: h4 */
    public int mo62023h4() {
        return 8;
    }

    public int hashCode() {
        return (this.f44788k4 * 397) ^ this.f44789x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62196k4(int i) {
        this.f44788k4 = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m62198x1(int i) {
        this.f44789x1 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m62197k4(C13390ks c13390ks) {
        return this.f44788k4 == c13390ks.f44788k4 && this.f44789x1 == c13390ks.f44789x1;
    }
}
