package com.aspose.slides.internal.p539z4;

import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.z4.x5 */
/* JADX INFO: loaded from: classes5.dex */
public class C13422x5 extends AbstractC13405sv {

    /* JADX INFO: renamed from: k4 */
    private int f44903k4;

    /* JADX INFO: renamed from: x1 */
    private int f44904x1;

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
        return m62444k4((C13422x5) obj);
    }

    @Override // com.aspose.slides.internal.p539z4.AbstractC13373f9
    /* JADX INFO: renamed from: h4 */
    public int mo62023h4() {
        return 8;
    }

    public int hashCode() {
        return (m62442k4() * 397) ^ m62445x1();
    }

    /* JADX INFO: renamed from: k4 */
    public final int m62442k4() {
        return this.f44903k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m62445x1() {
        return this.f44904x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62443k4(int i) {
        this.f44903k4 = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m62446x1(int i) {
        this.f44904x1 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m62444k4(C13422x5 c13422x5) {
        return m62442k4() == c13422x5.m62442k4() && m62445x1() == c13422x5.m62445x1();
    }
}
