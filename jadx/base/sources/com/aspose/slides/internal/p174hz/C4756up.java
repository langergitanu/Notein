package com.aspose.slides.internal.p174hz;

import com.alibaba.sdk.android.oss.internal.OooO00o;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.CryptographicUnexpectedOperationException;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.OverflowException;
import com.aspose.slides.internal.p088dn.C3199kk;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p525yi.C12825ix;
import com.aspose.slides.p559ms.System.AbstractC14068j5;
import com.aspose.slides.p559ms.System.AbstractC14070jw;
import com.aspose.slides.p559ms.System.C14058fa;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14113y2;
import com.microsoft.identity.common.java.crypto.key.AES256KeyLoader;
import com.microsoft.identity.common.java.crypto.key.KeyUtil;
import com.microsoft.identity.common.java.platform.AbstractDevicePopManager;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import java.util.TreeMap;

/* JADX INFO: renamed from: com.aspose.slides.internal.hz.up */
/* JADX INFO: loaded from: classes.dex */
public class C4756up {

    /* JADX INFO: renamed from: k4 */
    private static final Object f13285k4 = new Object();

    /* JADX INFO: renamed from: kk */
    private static TreeMap<String, String> f13286kk;

    /* JADX INFO: renamed from: to */
    private static TreeMap<String, String> f13287to;

    /* JADX INFO: renamed from: x1 */
    private static TreeMap<String, Class> f13288x1;

    /* JADX INFO: renamed from: k4 */
    public static Object m19759k4(String str) {
        return m19760k4(str, null);
    }

    /* JADX INFO: renamed from: kk */
    public static byte[] m19763kk(String str) {
        if (str == null) {
            throw new ArgumentNullException("str");
        }
        String[] strArrM67369h4 = C14113y2.m67369h4(str, FilenameUtils.EXTENSION_SEPARATOR);
        if (strArrM67369h4.length < 2) {
            throw new CryptographicUnexpectedOperationException(C12825ix.m59623k4("OID must have at least two parts"));
        }
        byte[] bArr = new byte[str.length()];
        try {
            bArr[2] = C14080ne.m67009to(Integer.valueOf(((C14080ne.m66982kk(strArrM67369h4[0]) & 255) * 40) + (C14080ne.m66982kk(strArrM67369h4[1]) & 255)));
            int length = 3;
            for (int i = 2; i < strArrM67369h4.length; i++) {
                long jM66866du = C14080ne.m66866du(strArrM67369h4[i]);
                if (jM66866du > 127) {
                    byte[] bArrM19762k4 = m19762k4(jM66866du);
                    C14058fa.m66596k4(bArrM19762k4, 0, bArr, length, bArrM19762k4.length);
                    length += bArrM19762k4.length;
                } else {
                    bArr[length] = C14080ne.m67010to(Long.valueOf(jM66866du));
                    length++;
                }
            }
            byte[] bArr2 = new byte[length];
            bArr2[0] = 6;
            if (length > 127) {
                throw new CryptographicUnexpectedOperationException(C12825ix.m59623k4("OID > 127 bytes"));
            }
            int i2 = length - 2;
            bArr2[1] = C14080ne.m67009to(Integer.valueOf(i2));
            C14058fa.m66596k4(bArr, 2, bArr2, 2, i2);
            return bArr2;
        } catch (Exception unused) {
            throw new CryptographicUnexpectedOperationException(C12825ix.m59623k4("Invalid OID"));
        }
    }

    /* JADX INFO: renamed from: x1 */
    public static String m19764x1(String str) {
        if (str == null) {
            throw new ArgumentNullException("name");
        }
        synchronized (f13285k4) {
            try {
                if (f13287to == null) {
                    m19761k4();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        String[] strArr = {null};
        C3199kk.m13777k4(f13287to, str, strArr);
        return strArr[0];
    }

    public String toString() {
        return OooO00o.OooO00o("System.Security.Cryptography.", C14067j2.m66727k4(this).mo48540du().substring(C14067j2.m66727k4(this).mo48540du().lastIndexOf(46) + 1));
    }

    /* JADX INFO: renamed from: k4 */
    public static Object m19760k4(String str, Object... objArr) {
        if (str == null) {
            throw new ArgumentNullException("name");
        }
        synchronized (f13285k4) {
            try {
                if (f13288x1 == null) {
                    m19761k4();
                }
            } finally {
            }
        }
        try {
            Class<?>[] clsArr = {null};
            boolean zM13777k4 = C3199kk.m13777k4(f13288x1, str, clsArr);
            Class<?> cls = clsArr[0];
            if (!zM13777k4) {
                String[] strArr = {null};
                boolean zM13777k42 = C3199kk.m13777k4(f13286kk, str, strArr);
                String str2 = strArr[0];
                if (zM13777k42) {
                    str = str2;
                }
                if (str.startsWith("System.Security.Cryptography")) {
                    str = str.replace("System.Security.Cryptography", C4756up.class.getPackage().getName());
                }
                cls = Class.forName(str);
            }
            if (cls == null) {
                return null;
            }
            if (objArr == null || objArr.length <= 0) {
                return cls.newInstance();
            }
            AbstractC14068j5[] abstractC14068j5Arr = new AbstractC14068j5[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                abstractC14068j5Arr[i] = C7019kk.m27443k4(objArr[i].getClass());
            }
            return C7019kk.m27443k4(cls).m66746k4(abstractC14068j5Arr).m48568k4(objArr);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m19761k4() {
        TreeMap<String, Class> treeMap = new TreeMap<>(AbstractC14070jw.m66789to());
        TreeMap<String, String> treeMap2 = new TreeMap<>(AbstractC14070jw.m66789to());
        treeMap.put("RandomNumberGenerator", C4743qw.class);
        treeMap.put("System.Security.Cryptography.he", C4743qw.class);
        treeMap.put("SHA", C4772y9.class);
        treeMap.put("SHA1", C4772y9.class);
        treeMap.put("System.Security.Cryptography.SHA1", C4772y9.class);
        treeMap.put("System.Security.Cryptography.HashAlgorithm", C4772y9.class);
        treeMap.put("System.Security.Cryptography.nv", C4772y9.class);
        treeMap.put("System.Security.Cryptography.c6", C4772y9.class);
        treeMap.put("MD5", C4748sv.class);
        treeMap.put("System.Security.Cryptography.MD5", C4748sv.class);
        treeMap.put("System.Security.Cryptography.g8", C4748sv.class);
        treeMap.put("SHA256", C4767x5.class);
        treeMap.put(KeyUtil.HMAC_KEY_HASH_ALGORITHM, C4767x5.class);
        treeMap.put("System.Security.Cryptography.SHA256", C4767x5.class);
        treeMap.put("System.Security.Cryptography.gk", C4767x5.class);
        treeMap.put("SHA384", C4737na.class);
        treeMap.put("SHA-384", C4737na.class);
        treeMap.put("System.Security.Cryptography.SHA384", C4737na.class);
        treeMap.put("System.Security.Cryptography.yo", C4737na.class);
        treeMap.put("SHA512", C4753u1.class);
        treeMap.put("SHA-512", C4753u1.class);
        treeMap.put("System.Security.Cryptography.SHA512", C4753u1.class);
        treeMap.put("System.Security.Cryptography.wz", C4753u1.class);
        treeMap.put("System.Security.Cryptography.HMAC", C4764wy.class);
        treeMap.put("System.Security.Cryptography.KeyedHashAlgorithm", C4764wy.class);
        treeMap.put("System.Security.Cryptography.lr", C4764wy.class);
        treeMap.put("System.Security.Cryptography.bz", C4764wy.class);
        treeMap.put("HMACMD5", C4773yd.class);
        treeMap.put("System.Security.Cryptography.HMACMD5", C4773yd.class);
        treeMap.put("System.Security.Cryptography.yd", C4773yd.class);
        treeMap.put("HMACSHA1", C4764wy.class);
        treeMap.put("System.Security.Cryptography.HMACSHA1", C4764wy.class);
        treeMap.put("System.Security.Cryptography.wy", C4764wy.class);
        treeMap.put("HMACSHA256", C4697ak.class);
        treeMap.put("System.Security.Cryptography.HMACSHA256", C4697ak.class);
        treeMap.put("System.Security.Cryptography.ak", C4697ak.class);
        treeMap.put("HMACSHA384", C4708dq.class);
        treeMap.put("System.Security.Cryptography.HMACSHA384", C4708dq.class);
        treeMap.put("System.Security.Cryptography.dq", C4708dq.class);
        treeMap.put("HMACSHA512", C4769xk.class);
        treeMap.put("System.Security.Cryptography.HMACSHA512", C4769xk.class);
        treeMap.put("System.Security.Cryptography.xk", C4769xk.class);
        treeMap.put(AbstractDevicePopManager.KeyPairGeneratorAlgorithms.RSA, C4724j2.class);
        treeMap.put("System.Security.Cryptography.RSA", C4724j2.class);
        treeMap.put("System.Security.Cryptography.AsymmetricAlgorithm", C4724j2.class);
        treeMap.put("System.Security.Cryptography.tq", C4724j2.class);
        treeMap.put("System.Security.Cryptography.du", C4724j2.class);
        treeMap.put("DSA", C4754u4.class);
        treeMap.put("System.Security.Cryptography.DSA", C4754u4.class);
        treeMap.put("System.Security.Cryptography.ix", C4754u4.class);
        treeMap.put("DES", C4768x6.class);
        treeMap.put("System.Security.Cryptography.DES", C4768x6.class);
        treeMap.put("System.Security.Cryptography.rv", C4768x6.class);
        treeMap.put("3DES", C4780zm.class);
        treeMap.put("TripleDES", C4780zm.class);
        treeMap.put("Triple DES", C4780zm.class);
        treeMap.put("System.Security.Cryptography.TripleDES", C4780zm.class);
        treeMap.put("System.Security.Cryptography.yw", C4780zm.class);
        treeMap.put("RC2", C4749t6.class);
        treeMap.put("System.Security.Cryptography.RC2", C4749t6.class);
        treeMap.put("System.Security.Cryptography.f9", C4749t6.class);
        treeMap.put("Rijndael", C4734m4.class);
        treeMap.put("System.Security.Cryptography.Rijndael", C4734m4.class);
        treeMap.put("System.Security.Cryptography.y2", C4734m4.class);
        treeMap.put("System.Security.Cryptography.SymmetricAlgorithm", C4734m4.class);
        treeMap.put("System.Security.Cryptography.my", C4734m4.class);
        treeMap.put(AES256KeyLoader.AES_ALGORITHM, C4734m4.class);
        treeMap.put("AesCryptoServiceProvider", C4734m4.class);
        treeMap.put("System.Security.Cryptography.AesCryptoServiceProvider", C4734m4.class);
        treeMap.put("AesManaged", C4734m4.class);
        treeMap.put("System.Security.Cryptography.AesManaged", C4734m4.class);
        treeMap.put("http://www.w3.org/2000/09/xmldsig#sha1", C4772y9.class);
        treeMap.put("http://www.w3.org/2001/04/xmlenc#sha256", C4767x5.class);
        treeMap.put("http://www.w3.org/2001/04/xmlenc#sha512", C4753u1.class);
        treeMap.put("http://www.w3.org/2001/04/xmlenc#des-cbc", C4768x6.class);
        treeMap.put("http://www.w3.org/2001/04/xmlenc#tripledes-cbc", C4780zm.class);
        treeMap.put("http://www.w3.org/2001/04/xmlenc#kw-tripledes", C4780zm.class);
        treeMap.put("http://www.w3.org/2001/04/xmlenc#aes128-cbc", C4734m4.class);
        treeMap.put("http://www.w3.org/2001/04/xmlenc#kw-aes128", C4734m4.class);
        treeMap.put("http://www.w3.org/2001/04/xmlenc#aes192-cbc", C4734m4.class);
        treeMap.put("http://www.w3.org/2001/04/xmlenc#kw-aes192", C4734m4.class);
        treeMap.put("http://www.w3.org/2001/04/xmlenc#aes256-cbc", C4734m4.class);
        treeMap.put("http://www.w3.org/2001/04/xmlenc#kw-aes256", C4734m4.class);
        treeMap.put("http://www.w3.org/2000/09/xmldsig#hmac-sha1", C4764wy.class);
        treeMap.put("http://www.w3.org/2001/04/xmldsig-more#md5", C4748sv.class);
        treeMap.put("http://www.w3.org/2001/04/xmldsig-more#sha384", C4737na.class);
        treeMap.put("http://www.w3.org/2001/04/xmldsig-more#hmac-md5", C4773yd.class);
        treeMap.put("http://www.w3.org/2001/04/xmldsig-more#hmac-sha256", C4697ak.class);
        treeMap.put("http://www.w3.org/2001/04/xmldsig-more#hmac-sha384", C4708dq.class);
        treeMap.put("http://www.w3.org/2001/04/xmldsig-more#hmac-sha512", C4769xk.class);
        treeMap2.put("http://www.w3.org/TR/2001/REC-xml-c14n-20010315", "System.Security.Cryptography.Xml.XmlDsigC14NTransform");
        treeMap2.put("http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments", "System.Security.Cryptography.Xml.XmlDsigC14NWithCommentsTransform");
        treeMap2.put("http://www.w3.org/2001/10/xml-exc-c14n#", "System.Security.Cryptography.Xml.XmlDsigExcC14NTransform");
        treeMap2.put("http://www.w3.org/2001/10/xml-exc-c14n#WithComments", "System.Security.Cryptography.Xml.XmlDsigExcC14NWithCommentsTransform");
        treeMap2.put("http://www.w3.org/2000/09/xmldsig#base64", "System.Security.Cryptography.Xml.XmlDsigBase64Transform");
        treeMap2.put("http://www.w3.org/TR/1999/REC-xpath-19991116", "System.Security.Cryptography.Xml.XmlDsigXPathTransform");
        treeMap2.put("http://www.w3.org/TR/1999/REC-xslt-19991116", "System.Security.Cryptography.Xml.XmlDsigXsltTransform");
        treeMap2.put("http://www.w3.org/2000/09/xmldsig#enveloped-signature", "System.Security.Cryptography.Xml.XmlDsigEnvelopedSignatureTransform");
        treeMap2.put("http://www.w3.org/2002/07/decrypt#XML", "System.Security.Cryptography.Xml.XmlDecryptionTransform");
        treeMap2.put("urn:mpeg:mpeg21:2003:01-REL-R-NS:licenseTransform", "System.Security.Cryptography.Xml.XmlLicenseTransform");
        treeMap2.put("http://www.w3.org/2000/09/xmldsig# X509Data", "System.Security.Cryptography.Xml.KeyInfoX509Data");
        treeMap2.put("http://www.w3.org/2000/09/xmldsig# KeyName", "System.Security.Cryptography.Xml.KeyInfoName");
        treeMap2.put("http://www.w3.org/2000/09/xmldsig# KeyValue/DSAKeyValue", "System.Security.Cryptography.Xml.DSAKeyValue");
        treeMap2.put("http://www.w3.org/2000/09/xmldsig# KeyValue/RSAKeyValue", "System.Security.Cryptography.Xml.RSAKeyValue");
        treeMap2.put("http://www.w3.org/2000/09/xmldsig# RetrievalMethod", "System.Security.Cryptography.Xml.KeyInfoRetrievalMethod");
        treeMap2.put("http://www.w3.org/2001/04/xmlenc# EncryptedKey", "System.Security.Cryptography.Xml.KeyInfoEncryptedKey");
        treeMap2.put("2.5.29.10", "System.Security.Cryptography.X509Certificates.X509BasicConstraintsExtension");
        treeMap2.put("2.5.29.19", "System.Security.Cryptography.X509Certificates.X509BasicConstraintsExtension");
        treeMap2.put("2.5.29.14", "System.Security.Cryptography.X509Certificates.X509SubjectKeyIdentifierExtension");
        treeMap2.put("2.5.29.15", "System.Security.Cryptography.X509Certificates.X509KeyUsageExtension");
        treeMap2.put("2.5.29.37", "System.Security.Cryptography.X509Certificates.X509EnhancedKeyUsageExtension");
        treeMap2.put("X509Chain", "System.Security.Cryptography.X509Certificates.X509Chain");
        treeMap2.put("1.2.840.113549.1.9.3", "System.Security.Cryptography.Pkcs.Pkcs9ContentType");
        treeMap2.put("1.2.840.113549.1.9.4", "System.Security.Cryptography.Pkcs.Pkcs9MessageDigest");
        treeMap2.put("1.2.840.113549.1.9.5", "System.Security.Cryptography.Pkcs.Pkcs9SigningTime");
        treeMap2.put("1.3.6.1.4.1.311.88.2.1", "System.Security.Cryptography.Pkcs.Pkcs9DocumentName");
        treeMap2.put("1.3.6.1.4.1.311.88.2.2", "System.Security.Cryptography.Pkcs.Pkcs9DocumentDescription");
        TreeMap<String, String> treeMap3 = new TreeMap<>(AbstractC14070jw.m66789to());
        treeMap3.put("SHA", "1.3.14.3.2.26");
        treeMap3.put("SHA1", "1.3.14.3.2.26");
        treeMap3.put("System.Security.Cryptography.SHA1", "1.3.14.3.2.26");
        treeMap3.put("System.Security.Cryptography.SHA1CryptoServiceProvider", "1.3.14.3.2.26");
        treeMap3.put("System.Security.Cryptography.SHA1Cng", "1.3.14.3.2.26");
        treeMap3.put("System.Security.Cryptography.SHA1Managed", "1.3.14.3.2.26");
        treeMap3.put(AbstractC4739nv.class.getName(), "1.3.14.3.2.26");
        treeMap3.put(C4772y9.class.getName(), "1.3.14.3.2.26");
        treeMap3.put(C4721ig.class.getName(), "1.3.14.3.2.26");
        treeMap3.put("System.Security.Cryptography.nv", "1.3.14.3.2.26");
        treeMap3.put("System.Security.Cryptography.y9", "1.3.14.3.2.26");
        treeMap3.put("System.Security.Cryptography.ig", "1.3.14.3.2.26");
        treeMap3.put("SHA256", "2.16.840.1.101.3.4.2.1");
        treeMap3.put("System.Security.Cryptography.SHA256", "2.16.840.1.101.3.4.2.1");
        treeMap3.put("System.Security.Cryptography.SHA256CryptoServiceProvider", "2.16.840.1.101.3.4.2.1");
        treeMap3.put("System.Security.Cryptography.SHA256Cng", "2.16.840.1.101.3.4.2.1");
        treeMap3.put("System.Security.Cryptography.SHA256Managed", "2.16.840.1.101.3.4.2.1");
        treeMap3.put(AbstractC4718gk.class.getName(), "2.16.840.1.101.3.4.2.1");
        treeMap3.put(C4767x5.class.getName(), "2.16.840.1.101.3.4.2.1");
        treeMap3.put("System.Security.Cryptography.gk", "2.16.840.1.101.3.4.2.1");
        treeMap3.put("System.Security.Cryptography.x5", "2.16.840.1.101.3.4.2.1");
        treeMap3.put("SHA384", "2.16.840.1.101.3.4.2.2");
        treeMap3.put("System.Security.Cryptography.SHA384", "2.16.840.1.101.3.4.2.2");
        treeMap3.put("System.Security.Cryptography.SHA384CryptoServiceProvider", "2.16.840.1.101.3.4.2.2");
        treeMap3.put("System.Security.Cryptography.SHA384Cng", "2.16.840.1.101.3.4.2.2");
        treeMap3.put("System.Security.Cryptography.SHA384Managed", "2.16.840.1.101.3.4.2.2");
        treeMap3.put(AbstractC4777yo.class.getName(), "2.16.840.1.101.3.4.2.2");
        treeMap3.put(C4737na.class.getName(), "2.16.840.1.101.3.4.2.2");
        treeMap3.put("System.Security.Cryptography.yo", "2.16.840.1.101.3.4.2.2");
        treeMap3.put("System.Security.Cryptography.na", "2.16.840.1.101.3.4.2.2");
        treeMap3.put("SHA512", "2.16.840.1.101.3.4.2.3");
        treeMap3.put("System.Security.Cryptography.SHA512", "2.16.840.1.101.3.4.2.3");
        treeMap3.put("System.Security.Cryptography.SHA512CryptoServiceProvider", "2.16.840.1.101.3.4.2.3");
        treeMap3.put("System.Security.Cryptography.SHA512Cng", "2.16.840.1.101.3.4.2.3");
        treeMap3.put("System.Security.Cryptography.SHA512Managed", "2.16.840.1.101.3.4.2.3");
        treeMap3.put(AbstractC4765wz.class.getName(), "2.16.840.1.101.3.4.2.3");
        treeMap3.put(C4753u1.class.getName(), "2.16.840.1.101.3.4.2.3");
        treeMap3.put("System.Security.Cryptography.wz", "2.16.840.1.101.3.4.2.3");
        treeMap3.put("System.Security.Cryptography.u1", "2.16.840.1.101.3.4.2.3");
        treeMap3.put("RIPEMD160", "1.3.36.3.2.1");
        treeMap3.put("System.Security.Cryptography.RIPEMD160", "1.3.36.3.2.1");
        treeMap3.put("System.Security.Cryptography.RIPEMD160Managed", "1.3.36.3.2.1");
        treeMap3.put("System.Security.Cryptography.vj", "1.3.36.3.2.1");
        treeMap3.put("System.Security.Cryptography.vh", "1.3.36.3.2.1");
        treeMap3.put(AbstractC4760vj.class.getName(), "1.3.36.3.2.1");
        treeMap3.put(C4759vh.class.getName(), "1.3.36.3.2.1");
        treeMap3.put("MD5", "1.2.840.113549.2.5");
        treeMap3.put("System.Security.Cryptography.MD5", "1.2.840.113549.2.5");
        treeMap3.put("System.Security.Cryptography.MD5CryptoServiceProvider", "1.2.840.113549.2.5");
        treeMap3.put("System.Security.Cryptography.MD5Managed", "1.2.840.113549.2.5");
        treeMap3.put("System.Security.Cryptography.g8", "1.2.840.113549.2.5");
        treeMap3.put("System.Security.Cryptography.sv", "1.2.840.113549.2.5");
        treeMap3.put(AbstractC4715g8.class.getName(), "1.2.840.113549.2.5");
        treeMap3.put(C4748sv.class.getName(), "1.2.840.113549.2.5");
        treeMap3.put("TripleDESKeyWrap", "1.2.840.113549.1.9.16.3.6");
        treeMap3.put("RC2", "1.2.840.113549.3.2");
        treeMap3.put("System.Security.Cryptography.RC2CryptoServiceProvider", "1.2.840.113549.3.2");
        treeMap3.put("System.Security.Cryptography.t6", "1.2.840.113549.3.2");
        treeMap3.put(C4749t6.class.getName(), "1.2.840.113549.3.2");
        treeMap3.put("DES", "1.3.14.3.2.7");
        treeMap3.put("System.Security.Cryptography.DESCryptoServiceProvider", "1.3.14.3.2.7");
        treeMap3.put("System.Security.Cryptography.x6", "1.3.14.3.2.7");
        treeMap3.put(C4768x6.class.getName(), "1.3.14.3.2.7");
        treeMap3.put("TripleDES", "1.2.840.113549.3.7");
        treeMap3.put("System.Security.Cryptography.TripleDESCryptoServiceProvider", "1.2.840.113549.3.7");
        treeMap3.put("System.Security.Cryptography.zm", "1.2.840.113549.3.7");
        treeMap3.put(C4780zm.class.getName(), "1.2.840.113549.3.7");
        treeMap.put("HMACRIPEMD160", C4700b3.class);
        treeMap.put("System.Security.Cryptography.HMACRIPEMD160", C4700b3.class);
        treeMap.put("System.Security.Cryptography.b3", C4700b3.class);
        treeMap.put("http://www.w3.org/2001/04/xmldsig-more#hmac-ripemd160", C4700b3.class);
        treeMap.put("http://www.w3.org/2000/09/xmldsig#dsa-sha1", C4698ar.class);
        treeMap.put("System.Security.Cryptography.DSASignatureDescription", C4698ar.class);
        treeMap.put("System.Security.Cryptography.ar", C4698ar.class);
        treeMap.put("MACTripleDES", C4741qm.class);
        treeMap.put("System.Security.Cryptography.MACTripleDES", C4741qm.class);
        treeMap.put("System.Security.Cryptography.qm", C4741qm.class);
        treeMap.put("http://www.w3.org/2000/09/xmldsig#rsa-sha1", C4696ai.class);
        treeMap.put("System.Security.Cryptography.RSASignatureDescription", C4696ai.class);
        String name = C4759vh.class.getName();
        treeMap2.put("RIPEMD160", name);
        treeMap2.put("RIPEMD-160", name);
        treeMap2.put("System.Security.Cryptography.RIPEMD160", name);
        treeMap2.put("System.Security.Cryptography.RIPEMD160Managed", name);
        treeMap2.put("System.Security.Cryptography.vj", name);
        treeMap2.put("System.Security.Cryptography.vh", name);
        treeMap2.put("http://www.w3.org/2001/04/xmlenc#ripemd160", name);
        f13288x1 = treeMap;
        f13286kk = treeMap2;
        f13287to = treeMap3;
    }

    /* JADX INFO: renamed from: k4 */
    private static byte[] m19762k4(long j) {
        if (j > 2147483647L || j < -2147483648L) {
            throw new OverflowException(C12825ix.m59623k4("Part of OID doesn't fit in Int32"));
        }
        long j2 = j;
        int i = 1;
        while (j2 > 127) {
            j2 >>= 7;
            i++;
        }
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            long j3 = (j >> (i2 * 7)) & 127;
            if (i2 != 0) {
                j3 += 128;
            }
            bArr[(i - i2) - 1] = C14080ne.m67010to(Long.valueOf(j3));
        }
        return bArr;
    }
}
