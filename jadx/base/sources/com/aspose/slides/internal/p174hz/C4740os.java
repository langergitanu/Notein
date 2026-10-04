package com.aspose.slides.internal.p174hz;

import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.exceptions.CryptographicUnexpectedOperationException;
import com.aspose.slides.internal.p525yi.C12817ar;
import com.aspose.slides.internal.p525yi.C12825ix;

/* JADX INFO: renamed from: com.aspose.slides.internal.hz.os */
/* JADX INFO: loaded from: classes.dex */
public class C4740os extends AbstractC4719h4 {

    /* JADX INFO: renamed from: k4 */
    private AbstractC4751tq f13242k4;

    public C4740os() {
    }

    /* JADX INFO: renamed from: k4 */
    public void m19712k4(AbstractC4709du abstractC4709du) {
        this.f13242k4 = (AbstractC4751tq) abstractC4709du;
    }

    public C4740os(AbstractC4709du abstractC4709du) {
        m19712k4(abstractC4709du);
    }

    /* JADX INFO: renamed from: k4 */
    public byte[] m19713k4(byte[] bArr) {
        if (this.f13242k4 == null) {
            throw new CryptographicUnexpectedOperationException(C12825ix.m59623k4("No RSA key specified"));
        }
        byte[] bArrM59599k4 = C12817ar.m59599k4(this.f13242k4, AbstractC4739nv.m19710du(), bArr);
        if (bArrM59599k4 != null) {
            return bArrM59599k4;
        }
        throw new CryptographicException(C12825ix.m59623k4("OAEP decoding error."));
    }
}
