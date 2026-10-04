package com.aspose.slides.internal.p174hz;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.CryptographicUnexpectedOperationException;
import com.aspose.slides.internal.p525yi.C12825ix;

/* JADX INFO: renamed from: com.aspose.slides.internal.hz.um */
/* JADX INFO: loaded from: classes.dex */
public class C4755um extends AbstractC4704c5 {

    /* JADX INFO: renamed from: k4 */
    private AbstractC4723ix f13284k4;

    @Override // com.aspose.slides.internal.p174hz.AbstractC4704c5
    /* JADX INFO: renamed from: k4 */
    public void mo19578k4(AbstractC4709du abstractC4709du) {
        if (abstractC4709du == null) {
            throw new ArgumentNullException("key");
        }
        this.f13284k4 = (AbstractC4723ix) abstractC4709du;
    }

    @Override // com.aspose.slides.internal.p174hz.AbstractC4704c5
    /* JADX INFO: renamed from: k4 */
    public void mo19579k4(String str) {
        if (str == null) {
            throw new ArgumentNullException("strName");
        }
        try {
            AbstractC4739nv.m19711k4(str);
        } catch (ClassCastException unused) {
            throw new CryptographicUnexpectedOperationException(C12825ix.m59623k4("DSA requires SHA1"));
        }
    }

    @Override // com.aspose.slides.internal.p174hz.AbstractC4704c5
    /* JADX INFO: renamed from: k4 */
    public byte[] mo19581k4(byte[] bArr) {
        AbstractC4723ix abstractC4723ix = this.f13284k4;
        if (abstractC4723ix != null) {
            return abstractC4723ix.mo19631k4(bArr);
        }
        throw new CryptographicUnexpectedOperationException(C12825ix.m59623k4("missing key"));
    }
}
