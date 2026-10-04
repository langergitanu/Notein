package com.aspose.slides.internal.p174hz;

import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.exceptions.CryptographicUnexpectedOperationException;
import com.aspose.slides.internal.p525yi.C12817ar;
import com.aspose.slides.internal.p525yi.C12825ix;

/* JADX INFO: renamed from: com.aspose.slides.internal.hz.em */
/* JADX INFO: loaded from: classes.dex */
public class C4712em extends AbstractC4719h4 {

    /* JADX INFO: renamed from: k4 */
    private AbstractC4751tq f13138k4;

    public C4712em() {
    }

    /* JADX INFO: renamed from: k4 */
    public void m19603k4(AbstractC4709du abstractC4709du) {
        this.f13138k4 = (AbstractC4751tq) abstractC4709du;
    }

    public C4712em(AbstractC4709du abstractC4709du) {
        m19603k4(abstractC4709du);
    }

    /* JADX INFO: renamed from: k4 */
    public byte[] m19604k4(byte[] bArr) {
        AbstractC4751tq abstractC4751tq = this.f13138k4;
        if (abstractC4751tq == null) {
            throw new CryptographicUnexpectedOperationException(C12825ix.m59623k4("No key pair available."));
        }
        byte[] bArrM59592du = C12817ar.m59592du(abstractC4751tq, bArr);
        if (bArrM59592du != null) {
            return bArrM59592du;
        }
        throw new CryptographicException(C12825ix.m59623k4("PKCS1 decoding error."));
    }
}
