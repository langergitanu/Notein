package com.aspose.slides;

import com.aspose.slides.p559ms.System.IDisposable;

/* JADX INFO: renamed from: com.aspose.slides.ow */
/* JADX INFO: loaded from: classes3.dex */
final class C14258ow implements IDisposable {

    /* JADX INFO: renamed from: k4 */
    private final FontsManager f47967k4;

    public C14258ow(FontsManager fontsManager) {
        this.f47967k4 = fontsManager;
        fontsManager.m1552k4(true);
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public final void dispose() {
        this.f47967k4.m1552k4(false);
    }
}
