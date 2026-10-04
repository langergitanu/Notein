package com.aspose.slides.internal.p174hz;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.CryptographicUnexpectedOperationException;
import com.aspose.slides.internal.p525yi.C12817ar;
import com.aspose.slides.internal.p525yi.C12825ix;

/* JADX INFO: renamed from: com.aspose.slides.internal.hz.ca */
/* JADX INFO: loaded from: classes.dex */
public class C4706ca extends AbstractC4704c5 {

    /* JADX INFO: renamed from: k4 */
    private AbstractC4751tq f13129k4;

    /* JADX INFO: renamed from: x1 */
    private AbstractC4705c6 f13130x1;

    @Override // com.aspose.slides.internal.p174hz.AbstractC4704c5
    /* JADX INFO: renamed from: k4 */
    public void mo19578k4(AbstractC4709du abstractC4709du) {
        if (abstractC4709du == null) {
            throw new ArgumentNullException("key");
        }
        this.f13129k4 = (AbstractC4751tq) abstractC4709du;
    }

    @Override // com.aspose.slides.internal.p174hz.AbstractC4704c5
    /* JADX INFO: renamed from: k4 */
    public void mo19579k4(String str) {
        this.f13130x1 = AbstractC4705c6.m19582kk(str);
    }

    @Override // com.aspose.slides.internal.p174hz.AbstractC4704c5
    /* JADX INFO: renamed from: k4 */
    public byte[] mo19581k4(byte[] bArr) {
        AbstractC4751tq abstractC4751tq = this.f13129k4;
        if (abstractC4751tq == null) {
            throw new CryptographicUnexpectedOperationException(C12825ix.m59623k4("No key pair available."));
        }
        AbstractC4705c6 abstractC4705c6 = this.f13130x1;
        if (abstractC4705c6 == null) {
            throw new CryptographicUnexpectedOperationException(C12825ix.m59623k4("Missing hash algorithm."));
        }
        if (bArr != null) {
            return C12817ar.m59607x1(abstractC4751tq, abstractC4705c6, bArr);
        }
        throw new ArgumentNullException("rgbHash");
    }
}
