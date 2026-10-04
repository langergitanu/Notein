package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public class VbaProjectFactory implements IVbaProjectFactory {

    /* JADX INFO: renamed from: k4 */
    private static final VbaProjectFactory f3649k4 = new VbaProjectFactory();

    public static VbaProjectFactory getInstance() {
        return f3649k4;
    }

    @Override // com.aspose.slides.IVbaProjectFactory
    public final IVbaProject createVbaProject() {
        return new VbaProject();
    }

    @Override // com.aspose.slides.IVbaProjectFactory
    public final IVbaProject readVbaProject(byte[] bArr) {
        return new VbaProject(bArr);
    }
}
