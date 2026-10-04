package com.aspose.slides;

import com.aspose.slides.internal.p077d8.C3100wp;
import com.aspose.slides.internal.p201j8.C5216kk;
import com.aspose.slides.internal.p201j8.C5217to;
import com.aspose.slides.internal.p201j8.InterfaceC5218x1;
import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: loaded from: classes3.dex */
class udt implements InterfaceC5218x1 {

    /* JADX INFO: renamed from: k4 */
    private final ISaveOptions f49314k4;

    public udt(ISaveOptions iSaveOptions) {
        this.f49314k4 = iSaveOptions;
    }

    @Override // com.aspose.slides.internal.p201j8.InterfaceC5218x1
    /* JADX INFO: renamed from: k4 */
    public final boolean mo22246k4(C5217to c5217to) {
        ISaveOptions iSaveOptions = this.f49314k4;
        if (iSaveOptions != null && iSaveOptions.getWarningCallback() != null) {
            if (C7019kk.m27469x1(c5217to, C5216kk.class)) {
                new C3100wp("Brush data cannot be rendered", 1).sendWarning(this.f49314k4.getWarningCallback());
            } else {
                new C3100wp(c5217to.getMessage(), 99).sendWarning(this.f49314k4.getWarningCallback());
            }
        }
        return true;
    }
}
