package com.aspose.slides.internal.p174hz;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.CryptographicUnexpectedOperationException;
import com.aspose.slides.internal.p525yi.C12817ar;
import com.aspose.slides.internal.p525yi.C12825ix;

/* JADX INFO: renamed from: com.aspose.slides.internal.hz.zj */
/* JADX INFO: loaded from: classes.dex */
public class C4779zj extends AbstractC4735m9 {

    /* JADX INFO: renamed from: k4 */
    private AbstractC4751tq f13366k4;

    /* JADX INFO: renamed from: x1 */
    private AbstractC4720he f13367x1;

    public C4779zj() {
    }

    /* JADX INFO: renamed from: k4 */
    private void m19840k4(AbstractC4709du abstractC4709du) {
        if (abstractC4709du == null) {
            throw new ArgumentNullException("key");
        }
        this.f13366k4 = (AbstractC4751tq) abstractC4709du;
    }

    public C4779zj(AbstractC4709du abstractC4709du) {
        m19840k4(abstractC4709du);
    }

    /* JADX INFO: renamed from: k4 */
    public byte[] m19841k4(byte[] bArr) {
        if (bArr == null) {
            throw new ArgumentNullException("rgbData");
        }
        if (this.f13366k4 == null) {
            throw new CryptographicUnexpectedOperationException(C12825ix.m59623k4("No RSA key specified"));
        }
        if (this.f13367x1 == null) {
            this.f13367x1 = AbstractC4720he.m19622k4();
        }
        return C12817ar.m59600k4(this.f13366k4, this.f13367x1, bArr);
    }
}
