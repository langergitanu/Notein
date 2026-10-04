package com.aspose.slides.internal.p097e0;

import com.aspose.slides.exceptions.InvalidOperationException;

/* JADX INFO: renamed from: com.aspose.slides.internal.e0.wl */
/* JADX INFO: loaded from: classes3.dex */
public class C3537wl extends AbstractC3523kk {

    /* JADX INFO: renamed from: k4 */
    private boolean f9876k4 = true;

    /* JADX INFO: renamed from: x1 */
    private char f9877x1;

    public C3537wl(char c) {
        this.f9877x1 = c;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3523kk
    /* JADX INFO: renamed from: to */
    public char mo14069to() {
        if (!this.f9876k4) {
            throw new InvalidOperationException();
        }
        this.f9876k4 = false;
        return this.f9877x1;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3523kk, com.aspose.slides.internal.p048bv.InterfaceC1870up
    /* JADX INFO: renamed from: x1 */
    public boolean mo9764x1() {
        return this.f9876k4;
    }
}
