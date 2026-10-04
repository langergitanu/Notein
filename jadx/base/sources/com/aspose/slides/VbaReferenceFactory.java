package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public class VbaReferenceFactory implements IVbaReferenceFactory {

    /* JADX INFO: renamed from: k4 */
    private static final VbaReferenceFactory f3652k4 = new VbaReferenceFactory();

    public static VbaReferenceFactory getInstance() {
        return f3652k4;
    }

    @Override // com.aspose.slides.IVbaReferenceFactory
    public final IVbaReferenceOleTypeLib createOleTypeLibReference(String str, String str2) {
        return new VbaReferenceOleTypeLib(str, str2);
    }
}
