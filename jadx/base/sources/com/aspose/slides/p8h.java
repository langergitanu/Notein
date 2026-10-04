package com.aspose.slides;

import com.aspose.slides.p559ms.System.InterfaceC14089ss;

/* JADX INFO: loaded from: classes3.dex */
class p8h extends AbstractC14463so implements InterfaceC14089ss<p8h> {

    /* JADX INFO: renamed from: k4 */
    private IPortionFormat f48017k4 = null;

    /* JADX INFO: renamed from: k4 */
    public final void m68974k4(IPortionFormat iPortionFormat) {
        this.f48017k4 = iPortionFormat;
    }

    /* JADX INFO: renamed from: x1 */
    public final IPortionFormat m68977x1() {
        return this.f48017k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m68975k4() {
        return this.f48017k4 == null;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m68976k4(p8h p8hVar) {
        if (p8hVar == null) {
            return false;
        }
        if (m68977x1() == null && p8hVar.m68977x1() == null) {
            return true;
        }
        if (m68977x1() == null || p8hVar.m68977x1() == null) {
            return false;
        }
        return m68977x1().equals(p8hVar.m68977x1());
    }
}
