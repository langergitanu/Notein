package com.aspose.slides.internal.p174hz;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.CryptographicUnexpectedOperationException;
import com.aspose.slides.internal.p525yi.C12817ar;
import com.aspose.slides.internal.p525yi.C12825ix;

/* JADX INFO: renamed from: com.aspose.slides.internal.hz.ri */
/* JADX INFO: loaded from: classes.dex */
public class C4744ri extends AbstractC4710dy {

    /* JADX INFO: renamed from: k4 */
    private AbstractC4751tq f13248k4;

    /* JADX INFO: renamed from: x1 */
    private String f13249x1;

    public C4744ri() {
    }

    @Override // com.aspose.slides.internal.p174hz.AbstractC4710dy
    /* JADX INFO: renamed from: k4 */
    public void mo19595k4(AbstractC4709du abstractC4709du) {
        if (abstractC4709du == null) {
            throw new ArgumentNullException("key");
        }
        this.f13248k4 = (AbstractC4751tq) abstractC4709du;
    }

    public C4744ri(AbstractC4709du abstractC4709du) {
        mo19595k4(abstractC4709du);
    }

    @Override // com.aspose.slides.internal.p174hz.AbstractC4710dy
    /* JADX INFO: renamed from: k4 */
    public void mo19596k4(String str) {
        if (str == null) {
            throw new ArgumentNullException("strName");
        }
        this.f13249x1 = str;
    }

    @Override // com.aspose.slides.internal.p174hz.AbstractC4710dy
    /* JADX INFO: renamed from: k4 */
    public boolean mo19597k4(byte[] bArr, byte[] bArr2) {
        AbstractC4751tq abstractC4751tq = this.f13248k4;
        if (abstractC4751tq == null) {
            throw new CryptographicUnexpectedOperationException(C12825ix.m59623k4("No public key available."));
        }
        String str = this.f13249x1;
        if (str == null) {
            throw new CryptographicUnexpectedOperationException(C12825ix.m59623k4("Missing hash algorithm."));
        }
        if (bArr == null) {
            throw new ArgumentNullException("rgbHash");
        }
        if (bArr2 != null) {
            return C12817ar.m59593k4(abstractC4751tq, AbstractC4705c6.m19582kk(str), bArr, bArr2);
        }
        throw new ArgumentNullException("rgbSignature");
    }
}
