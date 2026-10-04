package com.aspose.slides;

import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C9135ws;

/* JADX INFO: loaded from: classes3.dex */
class kml extends AbstractC14463so {

    /* JADX INFO: renamed from: k4 */
    private boolean f45790k4;

    /* JADX INFO: renamed from: kk */
    private long f45791kk;

    /* JADX INFO: renamed from: to */
    private IParagraphFormat f45792to;

    /* JADX INFO: renamed from: x1 */
    private C9135ws f45793x1;

    public kml(IParagraphFormat iParagraphFormat) {
        this.f45792to = iParagraphFormat;
    }

    /* JADX INFO: renamed from: to */
    private void m64010to() {
        this.f45791kk++;
        if (C7019kk.m27469x1(this.f45792to, PVIObject.class)) {
            ((PVIObject) this.f45792to).m2145uz();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m64011k4(C9135ws c9135ws) {
        this.f45793x1 = c9135ws;
    }

    /* JADX INFO: renamed from: kk */
    public final long m64014kk() {
        return this.f45791kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final C9135ws m64015x1() {
        return this.f45793x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m64012k4(boolean z) {
        if (C3085sv.m13090k4(Boolean.valueOf(this.f45790k4), Boolean.valueOf(z))) {
            return;
        }
        this.f45790k4 = z;
        m64010to();
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m64013k4() {
        return this.f45790k4;
    }
}
