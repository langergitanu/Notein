package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3061j2;

/* JADX INFO: renamed from: com.aspose.slides.h3 */
/* JADX INFO: loaded from: classes3.dex */
final class C1183h3 {

    /* JADX INFO: renamed from: k4 */
    private final int f5391k4;

    /* JADX INFO: renamed from: x1 */
    private final List<C14251ot> f5392x1;

    public C1183h3() {
        this.f5392x1 = new List<>();
        this.f5391k4 = 100;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m6974k4() {
        this.f5392x1.clear();
    }

    /* JADX INFO: renamed from: kk */
    public final void m6976kk() {
        if (this.f5392x1.size() > this.f5391k4) {
            this.f5392x1.removeAt(0);
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final C3061j2<C14251ot> m6977x1() {
        return new C3061j2<>(C14251ot.class, this.f5392x1);
    }

    public C1183h3(int i) {
        this.f5392x1 = new List<>();
        this.f5391k4 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m6975k4(C14251ot c14251ot) {
        this.f5392x1.addItem(c14251ot);
    }
}
