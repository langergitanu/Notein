package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.p559ms.System.IDisposable;

/* JADX INFO: renamed from: com.aspose.slides.s9 */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC14440s9 implements IDisposable {

    /* JADX INFO: renamed from: k4 */
    public final vbl f48787k4;

    public AbstractC14440s9(vbl vblVar) {
        if (vblVar == null) {
            throw new ArgumentNullException("player");
        }
        this.f48787k4 = vblVar;
    }

    /* JADX INFO: renamed from: I_ */
    public void mo4311I_() {
        this.f48787k4.mo4311I_();
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public final void dispose() {
        this.f48787k4.dispose();
    }
}
