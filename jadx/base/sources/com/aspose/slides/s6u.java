package com.aspose.slides;

import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: loaded from: classes3.dex */
class s6u extends AbstractC14413rs {

    /* JADX INFO: renamed from: k4 */
    private boolean f48764k4;

    /* JADX INFO: renamed from: kk */
    private IParagraphFormat f48765kk;

    /* JADX INFO: renamed from: x1 */
    private boolean f48766x1;

    public s6u(IParagraphFormat iParagraphFormat) {
        this.f48765kk = iParagraphFormat;
    }

    /* JADX INFO: renamed from: kk */
    private void m70451kk() {
        if (C7019kk.m27469x1(this.f48765kk, PVIObject.class)) {
            ((PVIObject) this.f48765kk).m2145uz();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m70452k4(boolean z) {
        if (C3085sv.m13090k4(Boolean.valueOf(this.f48764k4), Boolean.valueOf(z))) {
            return;
        }
        this.f48764k4 = z;
        m70451kk();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m70454x1(boolean z) {
        if (C3085sv.m13090k4(Boolean.valueOf(this.f48766x1), Boolean.valueOf(z))) {
            return;
        }
        this.f48766x1 = z;
        m70451kk();
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m70453k4() {
        return this.f48764k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m70455x1() {
        return this.f48766x1;
    }
}
