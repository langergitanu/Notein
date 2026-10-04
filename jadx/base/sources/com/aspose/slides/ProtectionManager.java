package com.aspose.slides;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p356qb.C9816ck;
import com.aspose.slides.internal.p356qb.C9826to;
import com.aspose.slides.internal.p407st.C10443fu;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
public final class ProtectionManager implements IProtectionManager {

    /* JADX INFO: renamed from: du */
    private boolean f3197du;

    /* JADX INFO: renamed from: h4 */
    private C10443fu f3198h4;

    /* JADX INFO: renamed from: k4 */
    private Presentation f3199k4;

    /* JADX INFO: renamed from: kk */
    private String f3200kk;

    /* JADX INFO: renamed from: to */
    private boolean f3201to = true;

    /* JADX INFO: renamed from: x1 */
    private boolean f3202x1;

    public ProtectionManager(Presentation presentation) {
        this.f3199k4 = presentation;
    }

    @Override // com.aspose.slides.IProtectionManager
    public final boolean checkWriteProtection(String str) {
        return this.f3199k4.m2393up().m73086x1().m74567x1(str) || this.f3199k4.m2351fa().m68364k4().m5518x1(str);
    }

    @Override // com.aspose.slides.IProtectionManager
    public final void encrypt(String str) {
        this.f3202x1 = true;
        this.f3200kk = str;
    }

    @Override // com.aspose.slides.IProtectionManager
    public final boolean getEncryptDocumentProperties() {
        return this.f3201to;
    }

    @Override // com.aspose.slides.IProtectionManager
    public final String getEncryptionPassword() {
        return this.f3200kk;
    }

    @Override // com.aspose.slides.IProtectionManager
    public final boolean getReadOnlyRecommended() {
        return this.f3197du;
    }

    @Override // com.aspose.slides.IProtectionManager
    public final boolean isEncrypted() {
        return this.f3202x1;
    }

    @Override // com.aspose.slides.IProtectionManager
    public final boolean isOnlyDocumentPropertiesLoaded() {
        return this.f3198h4 != null;
    }

    @Override // com.aspose.slides.IProtectionManager
    public final boolean isWriteProtected() {
        return this.f3199k4.m2351fa().m68364k4().m5515k4() || this.f3199k4.m2393up().m73086x1().m74565k4();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2464k4() {
        if (getEncryptionPassword() == null) {
            throw new InvalidPasswordException(C14113y2.m67408k4("Presentation is encrypted but LoadOptions.Password is null. ", "Load presentation with right password or remove presentation encryption."));
        }
    }

    @Override // com.aspose.slides.IProtectionManager
    public final void removeEncryption() {
        this.f3202x1 = false;
        this.f3200kk = null;
    }

    @Override // com.aspose.slides.IProtectionManager
    public final void removeWriteProtection() {
        this.f3199k4.m2351fa().m68364k4().m5517x1();
        this.f3199k4.m2393up().m73086x1().m74566x1();
    }

    @Override // com.aspose.slides.IProtectionManager
    public final void setEncryptDocumentProperties(boolean z) {
        if (isOnlyDocumentPropertiesLoaded() && z) {
            throw new InvalidOperationException(C14113y2.m67408k4("EncryptDocumentProperties must be false ", "when property IsOnlyDocumentPropertiesLoaded is true."));
        }
        this.f3201to = z;
    }

    @Override // com.aspose.slides.IProtectionManager
    public final void setReadOnlyRecommended(boolean z) {
        this.f3197du = z;
    }

    @Override // com.aspose.slides.IProtectionManager
    public final void setWriteProtection(String str) {
        this.f3199k4.m2351fa().m68364k4().m5514k4(str);
        this.f3199k4.m2393up().m73086x1().m74564k4(str);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2465k4(AbstractC3150x6 abstractC3150x6) {
        abstractC3150x6.setPosition(0L);
        try {
            C9816ck c9816ck = new C9816ck(abstractC3150x6);
            if (c9816ck.m48360k4().m48345x1("EncryptedPackage") && c9816ck.m48360k4().m48345x1("EncryptionInfo")) {
                boolean z = (c9816ck.m48360k4().m48345x1("\u0005SummaryInformation") || c9816ck.m48360k4().m48345x1("]ocumentSummaryInformation")) ? false : true;
                this.f3201to = z;
                if (z) {
                    return;
                }
                this.f3199k4.m2370k4(c9816ck);
            }
        } catch (C9826to e) {
            throw new PptxUnsupportedFormatException(e.getMessage(), e);
        } catch (RuntimeException e2) {
            throw new PptxReadException("Can't read MSCDFileSystem.", e2);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2466k4(C9816ck c9816ck) throws Throwable {
        this.f3201to = (c9816ck.m48360k4().m48345x1("\u0005SummaryInformation") || c9816ck.m48360k4().m48345x1("]ocumentSummaryInformation")) ? false : true;
        if (!this.f3199k4.m2349du().getOnlyLoadDocumentProperties()) {
            throw new InvalidPasswordException(C14113y2.m67408k4("Presentation is encrypted but LoadOptions.Password is null. ", "Set right password or set LoadOptions.OnlyLoadDocumentProperties to true."));
        }
        if (this.f3201to) {
            this.f3198h4 = null;
            throw new InvalidPasswordException(C14113y2.m67408k4("Can't load document properties. ", "Document properties are encrypted. ", "Set LoadOptions.OnlyLoadDocumentProperties to false ", "and try to load presentation with right password."));
        }
        this.f3198h4 = new C10443fu(c9816ck, true);
        this.f3199k4.m2370k4(c9816ck);
    }
}
