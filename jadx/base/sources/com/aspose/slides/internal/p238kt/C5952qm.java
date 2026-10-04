package com.aspose.slides.internal.p238kt;

import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.p559ms.System.Xml.C13981tl;
import com.aspose.slides.p559ms.System.Xml.XmlDocument;

/* JADX INFO: renamed from: com.aspose.slides.internal.kt.qm */
/* JADX INFO: loaded from: classes.dex */
public class C5952qm extends AbstractC5917bz {

    /* JADX INFO: renamed from: k4 */
    private C5916bv f16834k4;

    /* JADX INFO: renamed from: k4 */
    public final C5916bv m24090k4() {
        return this.f16834k4;
    }

    @Override // com.aspose.slides.internal.p238kt.AbstractC5917bz
    /* JADX INFO: renamed from: x1 */
    public C13981tl mo23904x1() {
        C5916bv c5916bv = this.f16834k4;
        if (c5916bv != null) {
            return c5916bv.m23899to();
        }
        throw new CryptographicException("Malformed element {0}.", "KeyInfoEncryptedKey");
    }

    @Override // com.aspose.slides.internal.p238kt.AbstractC5917bz
    /* JADX INFO: renamed from: k4 */
    public C13981tl mo23902k4(XmlDocument xmlDocument) {
        C5916bv c5916bv = this.f16834k4;
        if (c5916bv != null) {
            return c5916bv.m23894k4(xmlDocument);
        }
        throw new CryptographicException("Malformed element {0}.", "KeyInfoEncryptedKey");
    }

    @Override // com.aspose.slides.internal.p238kt.AbstractC5917bz
    /* JADX INFO: renamed from: k4 */
    public void mo23903k4(C13981tl c13981tl) {
        C5916bv c5916bv = new C5916bv();
        this.f16834k4 = c5916bv;
        c5916bv.m23896k4(c13981tl);
    }
}
