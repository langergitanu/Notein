package com.aspose.slides.internal.p525yi;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.CryptographicUnexpectedOperationException;
import com.aspose.slides.internal.p174hz.AbstractC4705c6;
import com.aspose.slides.internal.p174hz.AbstractC4715g8;
import com.aspose.slides.internal.p174hz.AbstractC4739nv;
import com.aspose.slides.internal.p174hz.AbstractC4751tq;
import com.aspose.slides.p559ms.System.C14058fa;

/* JADX INFO: renamed from: com.aspose.slides.internal.yi.du */
/* JADX INFO: loaded from: classes5.dex */
public class C12821du extends AbstractC4705c6 {

    /* JADX INFO: renamed from: h4 */
    private boolean f42654h4;

    /* JADX INFO: renamed from: k4 */
    private AbstractC4705c6 f42655k4 = AbstractC4715g8.m19610du();

    /* JADX INFO: renamed from: du */
    private AbstractC4705c6 f42653du = AbstractC4739nv.m19710du();

    public C12821du() {
        this.f13126kk = this.f42653du.m19587up() + this.f42655k4.m19587up();
    }

    @Override // com.aspose.slides.internal.p174hz.AbstractC4705c6
    /* JADX INFO: renamed from: c5 */
    public void mo18846c5() {
        this.f42655k4.mo18846c5();
        this.f42653du.mo18846c5();
        this.f42654h4 = false;
    }

    @Override // com.aspose.slides.internal.p174hz.AbstractC4705c6
    /* JADX INFO: renamed from: dy */
    public byte[] mo18847dy() {
        if (!this.f42654h4) {
            this.f42654h4 = true;
        }
        this.f42655k4.mo19564k4(new byte[0], 0, 0);
        this.f42653du.mo19564k4(new byte[0], 0, 0);
        byte[] bArr = new byte[36];
        C14058fa.m66596k4(this.f42655k4.m19584fa(), 0, bArr, 0, 16);
        C14058fa.m66596k4(this.f42653du.m19584fa(), 0, bArr, 16, 20);
        return bArr;
    }

    /* JADX INFO: renamed from: k4 */
    public boolean m59615k4(AbstractC4751tq abstractC4751tq, byte[] bArr) {
        if (abstractC4751tq == null) {
            throw new CryptographicUnexpectedOperationException("missing key");
        }
        if (bArr == null) {
            throw new ArgumentNullException("rgbSignature");
        }
        C12831m9 c12831m9 = new C12831m9(abstractC4751tq);
        c12831m9.mo19596k4(C12821du.class.getName());
        return c12831m9.mo19597k4(m19584fa(), bArr);
    }

    @Override // com.aspose.slides.internal.p174hz.AbstractC4705c6
    /* JADX INFO: renamed from: x1 */
    public void mo18849x1(byte[] bArr, int i, int i2) {
        if (!this.f42654h4) {
            this.f42654h4 = true;
        }
        this.f42655k4.mo19562k4(bArr, i, i2, bArr, i);
        this.f42653du.mo19562k4(bArr, i, i2, bArr, i);
    }

    /* JADX INFO: renamed from: k4 */
    public byte[] m59616k4(AbstractC4751tq abstractC4751tq) {
        if (abstractC4751tq == null) {
            throw new CryptographicUnexpectedOperationException("missing key");
        }
        C12822dy c12822dy = new C12822dy(abstractC4751tq);
        c12822dy.mo19579k4(C12821du.class.getName());
        return c12822dy.mo19581k4(m19584fa());
    }
}
