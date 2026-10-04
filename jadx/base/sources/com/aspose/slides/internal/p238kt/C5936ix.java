package com.aspose.slides.internal.p238kt;

import com.aspose.slides.internal.p174hz.AbstractC4715g8;
import com.aspose.slides.internal.p174hz.AbstractC4739nv;
import com.aspose.slides.internal.p174hz.AbstractC4778yw;
import com.aspose.slides.internal.p174hz.C4748sv;
import com.aspose.slides.internal.p174hz.C4756up;
import com.aspose.slides.internal.p174hz.C4773yd;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.kt.ix */
/* JADX INFO: loaded from: classes.dex */
public class C5936ix {

    /* JADX INFO: renamed from: k4 */
    private static final char[] f16780k4 = {',', '`', '[', '*', '&'};

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f16781x1 = new C7017h4("http://www.w3.org/TR/2001/REC-xml-c14n-20010315", "http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments", "http://www.w3.org/2001/10/xml-exc-c14n#", "http://www.w3.org/2001/10/xml-exc-c14n#WithComments", "http://www.w3.org/2000/09/xmldsig#base64", "http://www.w3.org/TR/1999/REC-xpath-19991116", "http://www.w3.org/TR/1999/REC-xslt-19991116", "http://www.w3.org/2000/09/xmldsig#enveloped-signature", "http://www.w3.org/2002/07/decrypt#XML", "urn:mpeg:mpeg21:2003:01-REL-R-NS:licenseTransform", "http://www.w3.org/2000/09/xmldsig# X509Data", "http://www.w3.org/2000/09/xmldsig# KeyName", "http://www.w3.org/2000/09/xmldsig# KeyValue/DSAKeyValue", "http://www.w3.org/2000/09/xmldsig# KeyValue/RSAKeyValue", "http://www.w3.org/2000/09/xmldsig# RetrievalMethod", "http://www.w3.org/2001/04/xmlenc# EncryptedKey", "http://www.w3.org/2000/09/xmldsig#dsa-sha1", C5972wl.class.getName(), "http://www.w3.org/2000/09/xmldsig#rsa-sha1", C5979xw.class.getName(), "http://www.w3.org/2001/04/xmldsig-more#rsa-sha256", "http://www.w3.org/2001/04/xmldsig-more#rsa-sha384", "http://www.w3.org/2001/04/xmldsig-more#rsa-sha512", "http://www.w3.org/2000/09/xmldsig#sha1", C4748sv.class.getName(), "http://www.w3.org/2001/04/xmldsig-more#hmac-md5", "http://www.w3.org/2001/04/xmlenc#tripledes-cbc");

    /* JADX INFO: renamed from: k4 */
    public static <T> T m24008k4(Class<T> cls, String str) {
        if (str != null && C14113y2.m67384k4(str, f16780k4) < 0) {
            try {
                Object objM24009k4 = m24009k4(str);
                if (objM24009k4 == null) {
                    objM24009k4 = C4756up.m19759k4(str);
                }
                return (T) C7019kk.m27452k4(objM24009k4, (Class) cls);
            } catch (RuntimeException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public static Object m24009k4(String str) {
        switch (f16781x1.m27428k4(str)) {
            case 0:
                return new C5946m2();
            case 1:
                return new C5938j5();
            case 2:
                return new C5981y9();
            case 3:
                return new C5930gf();
            case 4:
                return new C5947m4();
            case 5:
                return new C5935ig();
            case 6:
                return new C5932gk();
            case 7:
                return new C5950nv();
            case 8:
                return new C5980y2();
            case 9:
                return new C5976x5();
            case 10:
                return new C5958ss();
            case 11:
                return new C5929g8();
            case 12:
                return new C5967uz();
            case 13:
                return new C5960t6();
            case 14:
                return new C5973wp();
            case 15:
                return new C5952qm();
            case 16:
                return new C5972wl();
            case 17:
                return new C5972wl();
            case 18:
                return new C5979xw();
            case 19:
                return new C5979xw();
            case 20:
                return new C5970vj();
            case 21:
                return new C5969vh();
            case 22:
                return new C5954qw();
            case 23:
                return AbstractC4739nv.m19710du();
            case 24:
                return AbstractC4715g8.m19610du();
            case 25:
                return new C4773yd();
            case 26:
                return AbstractC4778yw.m19839kk();
            default:
                return null;
        }
    }
}
