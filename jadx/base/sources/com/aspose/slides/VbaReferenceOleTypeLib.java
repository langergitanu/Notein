package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public class VbaReferenceOleTypeLib implements IVbaReferenceOleTypeLib {

    /* JADX INFO: renamed from: k4 */
    private String f3653k4;

    /* JADX INFO: renamed from: x1 */
    private String f3654x1;

    public VbaReferenceOleTypeLib(String str, String str2) {
        this.f3653k4 = str;
        this.f3654x1 = str2;
    }

    @Override // com.aspose.slides.IVbaReferenceOleTypeLib
    public final String getLibid() {
        return this.f3654x1;
    }

    @Override // com.aspose.slides.IVbaReference
    public final String getName() {
        return this.f3653k4;
    }

    @Override // com.aspose.slides.IVbaReferenceOleTypeLib
    public final void setLibid(String str) {
        this.f3654x1 = str;
    }

    @Override // com.aspose.slides.IVbaReference
    public final void setName(String str) {
        this.f3653k4 = str;
    }
}
