package com.aspose.slides.internal.p525yi;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.CryptographicUnexpectedOperationException;
import com.aspose.slides.internal.p174hz.AbstractC4704c5;
import com.aspose.slides.internal.p174hz.AbstractC4705c6;
import com.aspose.slides.internal.p174hz.AbstractC4709du;
import com.aspose.slides.internal.p174hz.AbstractC4751tq;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.yi.dy */
/* JADX INFO: loaded from: classes5.dex */
public class C12822dy extends AbstractC4704c5 {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f42656kk = new C7017h4("MD5SHA1");

    /* JADX INFO: renamed from: k4 */
    private AbstractC4751tq f42657k4;

    /* JADX INFO: renamed from: x1 */
    private AbstractC4705c6 f42658x1;

    public C12822dy() {
    }

    @Override // com.aspose.slides.internal.p174hz.AbstractC4704c5
    /* JADX INFO: renamed from: k4 */
    public void mo19578k4(AbstractC4709du abstractC4709du) {
        if (!C7019kk.m27469x1(abstractC4709du, AbstractC4751tq.class)) {
            throw new ArgumentException("Specfied key is not an RSA key");
        }
        this.f42657k4 = (AbstractC4751tq) C7019kk.m27452k4((Object) abstractC4709du, AbstractC4751tq.class);
    }

    public C12822dy(AbstractC4709du abstractC4709du) {
        mo19578k4(abstractC4709du);
    }

    @Override // com.aspose.slides.internal.p174hz.AbstractC4704c5
    /* JADX INFO: renamed from: k4 */
    public void mo19579k4(String str) {
        this.f42658x1 = f42656kk.m27428k4(str) != 0 ? AbstractC4705c6.m19582kk(str) : new C12821du();
    }

    @Override // com.aspose.slides.internal.p174hz.AbstractC4704c5
    /* JADX INFO: renamed from: k4 */
    public byte[] mo19581k4(byte[] bArr) {
        AbstractC4751tq abstractC4751tq = this.f42657k4;
        if (abstractC4751tq == null) {
            throw new CryptographicUnexpectedOperationException("The key is a null reference");
        }
        AbstractC4705c6 abstractC4705c6 = this.f42658x1;
        if (abstractC4705c6 == null) {
            throw new CryptographicUnexpectedOperationException("The hash algorithm is a null reference.");
        }
        if (bArr != null) {
            return C12817ar.m59607x1(abstractC4751tq, abstractC4705c6, bArr);
        }
        throw new ArgumentNullException("The rgbHash parameter is a null reference.");
    }
}
