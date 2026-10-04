package com.aspose.slides.internal.p407st;

import com.aspose.slides.ILinkEmbedController;
import com.aspose.slides.exceptions.InvalidOperationException;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.f9 */
/* JADX INFO: loaded from: classes4.dex */
public class C10434f9 implements ILinkEmbedController {

    /* JADX INFO: renamed from: k4 */
    public static final C10434f9 f36986k4 = new C10434f9();

    @Override // com.aspose.slides.ILinkEmbedController
    public int getObjectStoringLocation(int i, byte[] bArr, String str, String str2, String str3) {
        return 1;
    }

    @Override // com.aspose.slides.ILinkEmbedController
    public String getUrl(int i, int i2) {
        return null;
    }

    @Override // com.aspose.slides.ILinkEmbedController
    public void saveExternal(int i, byte[] bArr) {
        throw new InvalidOperationException("GetUrl returned null, this method shouldn't be called.");
    }
}
