package com.aspose.slides;

import com.aspose.slides.p559ms.System.C14047bz;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public class PptOptions extends SaveOptions implements IPptOptions, Cloneable {

    /* JADX INFO: renamed from: k4 */
    private C14047bz f3058k4 = new C14047bz("{64818d11-4f9b-11cf-86ea-00aa00b929e8}");

    @Override // com.aspose.slides.IPptOptions
    public final UUID getRootDirectoryClsid() {
        return C14047bz.m66534k4(m2318k4());
    }

    /* JADX INFO: renamed from: k4 */
    public C14047bz m2318k4() {
        return this.f3058k4;
    }

    public Object memberwiseClone() {
        try {
            PptOptions pptOptions = (PptOptions) super.clone();
            pptOptions.f3058k4 = this.f3058k4.Clone();
            return pptOptions;
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // com.aspose.slides.IPptOptions
    public final void setRootDirectoryClsid(UUID uuid) {
        m2319k4(C14047bz.m66533k4(uuid));
    }

    /* JADX INFO: renamed from: k4 */
    public void m2319k4(C14047bz c14047bz) {
        c14047bz.CloneTo(this.f3058k4);
    }
}
