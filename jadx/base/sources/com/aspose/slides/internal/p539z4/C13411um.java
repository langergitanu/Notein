package com.aspose.slides.internal.p539z4;

import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.z4.um */
/* JADX INFO: loaded from: classes5.dex */
public class C13411um extends AbstractC13376gf {

    /* JADX INFO: renamed from: k4 */
    private C13362bv f44865k4;

    /* JADX INFO: renamed from: x1 */
    private int f44866x1;

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
        return m62364k4((C13411um) obj);
    }

    @Override // com.aspose.slides.internal.p539z4.AbstractC13373f9
    /* JADX INFO: renamed from: h4 */
    public int mo62023h4() {
        C13362bv c13362bv = this.f44865k4;
        if (c13362bv != null) {
            return c13362bv.mo62023h4() + 4;
        }
        return 4;
    }

    public int hashCode() {
        C13362bv c13362bv = this.f44865k4;
        return ((c13362bv != null ? c13362bv.hashCode() : 0) * 397) ^ this.f44866x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final C13362bv m62361k4() {
        return this.f44865k4;
    }

    public String toString() {
        return C14113y2.m67402k4("CustomEndCap: {0}, CustomEndCapSize: {1}", this.f44865k4, Integer.valueOf(this.f44866x1));
    }

    /* JADX INFO: renamed from: x1 */
    public final int m62365x1() {
        return this.f44866x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62362k4(int i) {
        this.f44866x1 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62363k4(C13362bv c13362bv) {
        this.f44865k4 = c13362bv;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m62364k4(C13411um c13411um) {
        return C14067j2.m66728k4(this.f44865k4, c13411um.f44865k4) && this.f44866x1 == c13411um.f44866x1;
    }
}
