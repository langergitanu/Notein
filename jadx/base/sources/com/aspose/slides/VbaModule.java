package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p104ec.C3647um;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
public final class VbaModule implements IVbaModule {

    /* JADX INFO: renamed from: k4 */
    private final String f3640k4;

    /* JADX INFO: renamed from: x1 */
    private final C3647um f3641x1;

    public VbaModule(String str, C3647um c3647um) {
        this.f3640k4 = str;
        this.f3641x1 = c3647um;
    }

    @Override // com.aspose.slides.IVbaModule
    public final String getName() {
        return this.f3640k4;
    }

    @Override // com.aspose.slides.IVbaModule
    public final String getSourceCode() {
        return this.f3641x1.m14808k4();
    }

    /* JADX INFO: renamed from: k4 */
    public final VbaModule m3043k4() {
        VbaModule vbaModule = new VbaModule(getName(), new C3647um(this.f3641x1.m14812x1(), this.f3641x1.m14811kk()));
        vbaModule.setSourceCode(getSourceCode());
        return vbaModule;
    }

    @Override // com.aspose.slides.IVbaModule
    public final void setSourceCode(String str) {
        this.f3641x1.m14810k4(str);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m3044k4(VbaModule vbaModule) {
        if (vbaModule != null) {
            return C14113y2.m67363du(getName(), vbaModule.getName()) && C14113y2.m67363du(getSourceCode(), vbaModule.getSourceCode());
        }
        throw new ArgumentNullException("module");
    }
}
