package com.aspose.slides;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p118ex.C3823m9;
import com.aspose.slides.p559ms.System.C14084qq;
import com.aspose.slides.p559ms.System.C14093tq;
import java.util.Date;

/* JADX INFO: loaded from: classes3.dex */
public class DigitalSignature implements IDigitalSignature {

    /* JADX INFO: renamed from: k4 */
    private C3823m9 f2115k4;

    /* JADX INFO: renamed from: kk */
    private C14084qq f2116kk = new C14084qq();

    /* JADX INFO: renamed from: to */
    private C14093tq<Boolean> f2117to = new C14093tq<>();

    /* JADX INFO: renamed from: x1 */
    private String f2118x1;

    public DigitalSignature() {
    }

    @Override // com.aspose.slides.IDigitalSignature
    public final byte[] getCertificate() {
        return this.f2115k4.m15278ck();
    }

    @Override // com.aspose.slides.IDigitalSignature
    public final String getComments() {
        String str = this.f2118x1;
        return str == null ? "" : str;
    }

    @Override // com.aspose.slides.IDigitalSignature
    public final Date getSignTime() {
        return C14084qq.m67108kk(m1330x1());
    }

    @Override // com.aspose.slides.IDigitalSignature
    public final boolean isValid() {
        return C14093tq.m67295k4(this.f2117to, new C14093tq(Boolean.TRUE));
    }

    /* JADX INFO: renamed from: k4 */
    public final C3823m9 m1326k4() {
        return this.f2115k4;
    }

    @Override // com.aspose.slides.IDigitalSignature
    public final void setComments(String str) {
        this.f2118x1 = str;
    }

    /* JADX INFO: renamed from: x1 */
    public C14084qq m1330x1() {
        return this.f2116kk;
    }

    public DigitalSignature(String str, String str2) {
        this.f2115k4 = new C3823m9(str, str2);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m1327k4(C3823m9 c3823m9) {
        if (this.f2115k4 != null) {
            throw new InvalidOperationException("Certificate is already set.");
        }
        this.f2115k4 = c3823m9;
    }

    public DigitalSignature(byte[] bArr, String str) {
        this.f2115k4 = new C3823m9(bArr, str);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m1328k4(C14084qq c14084qq) {
        c14084qq.CloneTo(this.f2116kk);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m1329k4(boolean z) {
        this.f2117to = new C14093tq<>(Boolean.valueOf(z));
    }
}
