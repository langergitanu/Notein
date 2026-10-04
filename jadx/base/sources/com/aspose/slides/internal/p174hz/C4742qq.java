package com.aspose.slides.internal.p174hz;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.CryptographicUnexpectedOperationException;
import com.aspose.slides.internal.p525yi.C12825ix;

/* JADX INFO: renamed from: com.aspose.slides.internal.hz.qq */
/* JADX INFO: loaded from: classes.dex */
public class C4742qq extends AbstractC4710dy {

    /* JADX INFO: renamed from: k4 */
    private AbstractC4723ix f13246k4;

    public C4742qq() {
    }

    @Override // com.aspose.slides.internal.p174hz.AbstractC4710dy
    /* JADX INFO: renamed from: k4 */
    public void mo19595k4(AbstractC4709du abstractC4709du) {
        if (abstractC4709du == null) {
            throw new ArgumentNullException("key");
        }
        this.f13246k4 = (AbstractC4723ix) abstractC4709du;
    }

    public C4742qq(AbstractC4709du abstractC4709du) {
        mo19595k4(abstractC4709du);
    }

    @Override // com.aspose.slides.internal.p174hz.AbstractC4710dy
    /* JADX INFO: renamed from: k4 */
    public void mo19596k4(String str) {
        if (str == null) {
            throw new ArgumentNullException("strName");
        }
        try {
            AbstractC4739nv.m19711k4(str);
        } catch (ClassCastException unused) {
            throw new CryptographicUnexpectedOperationException(C12825ix.m59623k4("DSA requires SHA1"));
        }
    }

    @Override // com.aspose.slides.internal.p174hz.AbstractC4710dy
    /* JADX INFO: renamed from: k4 */
    public boolean mo19597k4(byte[] bArr, byte[] bArr2) {
        AbstractC4723ix abstractC4723ix = this.f13246k4;
        if (abstractC4723ix != null) {
            return abstractC4723ix.mo19630k4(bArr, bArr2);
        }
        throw new CryptographicUnexpectedOperationException(C12825ix.m59623k4("missing key"));
    }
}
