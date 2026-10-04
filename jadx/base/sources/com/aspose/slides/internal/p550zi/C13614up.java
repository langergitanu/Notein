package com.aspose.slides.internal.p550zi;

import com.aspose.slides.exceptions.ObjectDisposedException;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14094ts;
import com.aspose.slides.p559ms.System.IDisposable;

/* JADX INFO: renamed from: com.aspose.slides.internal.zi.up */
/* JADX INFO: loaded from: classes5.dex */
public class C13614up implements IDisposable {

    /* JADX INFO: renamed from: k4 */
    private boolean f45212k4;

    /* JADX INFO: renamed from: k4 */
    private void m62820k4(boolean z) {
        if (this.f45212k4) {
            return;
        }
        try {
            m62822h4();
            if (z) {
                mo24306to();
            }
        } finally {
            this.f45212k4 = true;
        }
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public void dispose() {
        m62820k4(true);
        C14094ts.m67303k4(this);
    }

    /* JADX INFO: renamed from: du */
    public boolean m62821du() {
        return this.f45212k4;
    }

    /* JADX INFO: renamed from: h4 */
    public void m62822h4() {
    }

    /* JADX INFO: renamed from: m9 */
    public void m62823m9() {
        if (m62821du()) {
            throw new ObjectDisposedException(C14067j2.m66727k4(this).mo48540du());
        }
    }

    /* JADX INFO: renamed from: to */
    public void mo24306to() {
    }
}
