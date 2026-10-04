package com.aspose.slides.internal.p174hz;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.microsoft.identity.common.java.platform.AbstractDevicePopManager;

/* JADX INFO: renamed from: com.aspose.slides.internal.hz.wp */
/* JADX INFO: loaded from: classes.dex */
public final class C4763wp {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f13310kk = new C7017h4("1.2.840.113549.1.1.1", "1.2.840.113549.1.7.1", "1.2.840.113549.1.9.3", "1.2.840.113549.1.9.4", "1.2.840.113549.1.9.5", "1.2.840.113549.3.7", "2.5.29.19", "2.5.29.15", "2.5.29.37", "2.5.29.14", "2.5.29.17", "2.16.840.1.113730.1.1", "1.2.840.113549.2.5", "1.3.14.3.2.26", AbstractDevicePopManager.KeyPairGeneratorAlgorithms.RSA, "PKCS 7 Data", "Content Type", "Message Digest", "Signing Time", "3des", "Basic Constraints", "Key Usage", "Enhanced Key Usage", "Subject Key Identifier", "Subject Alternative Name", "Netscape Cert Type", "md5", "sha1");

    /* JADX INFO: renamed from: k4 */
    private String f13311k4;

    /* JADX INFO: renamed from: x1 */
    private String f13312x1;

    public C4763wp() {
    }

    /* JADX INFO: renamed from: k4 */
    public String m19794k4() {
        return this.f13312x1;
    }

    /* JADX INFO: renamed from: x1 */
    public String m19795x1() {
        return this.f13311k4;
    }

    public C4763wp(C4763wp c4763wp) {
        if (c4763wp == null) {
            throw new ArgumentNullException("oid");
        }
        this.f13311k4 = c4763wp.m19795x1();
        this.f13312x1 = c4763wp.m19794k4();
    }

    /* JADX INFO: renamed from: k4 */
    private String m19793k4(String str) {
        switch (f13310kk.m27428k4(str)) {
            case 0:
                return AbstractDevicePopManager.KeyPairGeneratorAlgorithms.RSA;
            case 1:
                return "PKCS 7 Data";
            case 2:
                return "Content Type";
            case 3:
                return "Message Digest";
            case 4:
                return "Signing Time";
            case 5:
                return "3des";
            case 6:
                return "Basic Constraints";
            case 7:
                return "Key Usage";
            case 8:
                return "Enhanced Key Usage";
            case 9:
                return "Subject Key Identifier";
            case 10:
                return "Subject Alternative Name";
            case 11:
                return "Netscape Cert Type";
            case 12:
                return "md5";
            case 13:
                return "sha1";
            default:
                return this.f13312x1;
        }
    }

    public C4763wp(String str) {
        if (str == null) {
            throw new ArgumentNullException("oid");
        }
        this.f13311k4 = str;
        this.f13312x1 = m19793k4(str);
    }

    public C4763wp(String str, String str2) {
        this.f13311k4 = str;
        this.f13312x1 = str2;
    }
}
