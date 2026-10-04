package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.IDisposable;

/* JADX INFO: loaded from: classes3.dex */
class gle implements IDisposable, InterfaceC14751wu {

    /* JADX INFO: renamed from: x1 */
    private int f5269x1 = 0;

    /* JADX INFO: renamed from: k4 */
    private final List<InterfaceC14751wu> f5268k4 = new List<>();

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public final void dispose() {
        if (this.f5268k4.size() == 0) {
            return;
        }
        for (int size = this.f5268k4.size() - 1; size >= 0; size--) {
            InterfaceC14751wu interfaceC14751wu = this.f5268k4.get_Item(size);
            if (C7019kk.m27469x1(interfaceC14751wu, IDisposable.class)) {
                ((IDisposable) C7019kk.m27452k4((Object) interfaceC14751wu, IDisposable.class)).dispose();
            }
        }
        this.f5268k4.clear();
        this.f5269x1 = 0;
    }

    @Override // com.aspose.slides.InterfaceC14751wu
    /* JADX INFO: renamed from: k4 */
    public final void mo2023k4() {
        if (this.f5268k4.size() == 0) {
            return;
        }
        for (int i = this.f5269x1; i < this.f5268k4.size(); i++) {
            this.f5269x1 = i;
            this.f5268k4.get_Item(i).mo2023k4();
        }
    }

    @Override // com.aspose.slides.InterfaceC14751wu
    /* JADX INFO: renamed from: k4 */
    public final void mo2024k4(float f) {
        if (this.f5268k4.size() == 0) {
            return;
        }
        if (f >= 1.0f) {
            mo2023k4();
            return;
        }
        int i = -1;
        InterfaceC14751wu interfaceC14751wu = null;
        int i2 = 0;
        while (i2 < this.f5268k4.size()) {
            InterfaceC14751wu interfaceC14751wu2 = this.f5268k4.get_Item(i2);
            int i3 = i2 + 1;
            float size = i3 / this.f5268k4.size();
            if (f >= i2 / this.f5268k4.size() && f < size) {
                i = i2;
                interfaceC14751wu = interfaceC14751wu2;
            }
            i2 = i3;
        }
        if (interfaceC14751wu != null) {
            int i4 = this.f5269x1;
            if (i > i4) {
                while (i4 < i) {
                    this.f5269x1 = i4;
                    this.f5268k4.get_Item(i4).mo2023k4();
                    i4++;
                }
            }
            this.f5269x1 = i;
            interfaceC14751wu.mo2024k4((f * this.f5268k4.size()) - i);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m6761k4(InterfaceC14751wu interfaceC14751wu) {
        if (interfaceC14751wu == null) {
            throw new ArgumentNullException("player");
        }
        this.f5268k4.addItem(interfaceC14751wu);
    }
}
