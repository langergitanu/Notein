package com.aspose.slides.internal.p525yi;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.CryptographicUnexpectedOperationException;
import com.aspose.slides.internal.p174hz.AbstractC4705c6;
import com.aspose.slides.internal.p174hz.AbstractC4709du;
import com.aspose.slides.internal.p174hz.AbstractC4710dy;
import com.aspose.slides.internal.p174hz.AbstractC4751tq;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.yi.m9 */
/* JADX INFO: loaded from: classes5.dex */
public class C12831m9 extends AbstractC4710dy {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f42681kk = new C7017h4("MD5SHA1");

    /* JADX INFO: renamed from: k4 */
    private AbstractC4751tq f42682k4;

    /* JADX INFO: renamed from: x1 */
    private AbstractC4705c6 f42683x1;

    public C12831m9() {
    }

    @Override // com.aspose.slides.internal.p174hz.AbstractC4710dy
    /* JADX INFO: renamed from: k4 */
    public void mo19595k4(AbstractC4709du abstractC4709du) {
        if (!C7019kk.m27469x1(abstractC4709du, AbstractC4751tq.class)) {
            throw new ArgumentException("Specfied key is not an RSA key");
        }
        this.f42682k4 = (AbstractC4751tq) C7019kk.m27452k4((Object) abstractC4709du, AbstractC4751tq.class);
    }

    public C12831m9(AbstractC4709du abstractC4709du) {
        mo19595k4(abstractC4709du);
    }

    @Override // com.aspose.slides.internal.p174hz.AbstractC4710dy
    /* JADX INFO: renamed from: k4 */
    public void mo19596k4(String str) {
        this.f42683x1 = f42681kk.m27428k4(str) != 0 ? AbstractC4705c6.m19582kk(str) : new C12821du();
    }

    @Override // com.aspose.slides.internal.p174hz.AbstractC4710dy
    /* JADX INFO: renamed from: k4 */
    public boolean mo19597k4(byte[] bArr, byte[] bArr2) {
        AbstractC4751tq abstractC4751tq = this.f42682k4;
        if (abstractC4751tq == null) {
            throw new CryptographicUnexpectedOperationException("The key is a null reference");
        }
        AbstractC4705c6 abstractC4705c6 = this.f42683x1;
        if (abstractC4705c6 == null) {
            throw new CryptographicUnexpectedOperationException("The hash algorithm is a null reference.");
        }
        if (bArr != null) {
            return C12817ar.m59593k4(abstractC4751tq, abstractC4705c6, bArr, bArr2);
        }
        throw new ArgumentNullException("The rgbHash parameter is a null reference.");
    }
}
