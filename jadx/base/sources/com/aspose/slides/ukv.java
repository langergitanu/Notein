package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.IDisposable;

/* JADX INFO: loaded from: classes3.dex */
class ukv implements IDisposable, InterfaceC14751wu {

    /* JADX INFO: renamed from: k4 */
    public final InterfaceC14751wu f49348k4;

    /* JADX INFO: renamed from: x1 */
    private float f49349x1;

    public ukv(InterfaceC14751wu interfaceC14751wu, float f) {
        if (interfaceC14751wu == null) {
            throw new ArgumentNullException("player");
        }
        this.f49348k4 = interfaceC14751wu;
        m71727x1(f);
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public final void dispose() {
        if (C7019kk.m27469x1(this.f49348k4, IDisposable.class)) {
            ((IDisposable) C7019kk.m27452k4((Object) this.f49348k4, IDisposable.class)).dispose();
        }
    }

    @Override // com.aspose.slides.InterfaceC14751wu
    /* JADX INFO: renamed from: k4 */
    public final void mo2023k4() {
        this.f49348k4.mo2023k4();
    }

    /* JADX INFO: renamed from: x1 */
    public final float m71726x1() {
        return this.f49349x1;
    }

    @Override // com.aspose.slides.InterfaceC14751wu
    /* JADX INFO: renamed from: k4 */
    public final void mo2024k4(float f) {
        this.f49348k4.mo2024k4(m71726x1() * f);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m71727x1(float f) {
        this.f49349x1 = f;
    }
}
