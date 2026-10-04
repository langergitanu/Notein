package com.aspose.slides.p559ms.backend.android.System.Drawing;

import com.aspose.slides.p559ms.backend.System.Drawing.AbstractC14124to;
import com.aspose.slides.p559ms.backend.System.Drawing.GraphicsEnv;
import com.aspose.slides.p559ms.backend.System.Drawing.InterfaceC14121du;

/* JADX INFO: loaded from: classes5.dex */
public final class AndroidGraphicsEnvironment extends GraphicsEnv {

    /* JADX INFO: renamed from: k4 */
    private int f47401k4 = 0;

    @Override // com.aspose.slides.p559ms.backend.System.Drawing.GraphicsEnv
    /* JADX INFO: renamed from: h4 */
    public int mo67576h4() {
        if (this.f47401k4 == 0) {
            this.f47401k4 = 96;
        }
        return this.f47401k4;
    }

    @Override // com.aspose.slides.p559ms.backend.System.Drawing.GraphicsEnv
    /* JADX INFO: renamed from: k4 */
    public InterfaceC14121du mo67577k4() {
        return new C14134kk();
    }

    @Override // com.aspose.slides.p559ms.backend.System.Drawing.GraphicsEnv
    /* JADX INFO: renamed from: x1 */
    public AbstractC14124to mo67578x1() {
        return new C14139x1();
    }
}
