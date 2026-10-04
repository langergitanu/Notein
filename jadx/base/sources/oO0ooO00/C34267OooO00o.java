package oO0ooO00;

import com.aspose.slides.C22218Oooo;
import com.microsoft.identity.common.java.crypto.key.AES256KeyLoader;
import com.microsoft.identity.common.java.platform.AbstractDevicePopManager;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.Provider;
import java.util.HashMap;
import java.util.HashSet;
import o00000oO.C24121OooO00o;
import oO0oO0Oo.C34032OooOo0O;
import oO0oOO00.InterfaceC34104OooO00o;
import oO0oOOOO.InterfaceC34117OooO0o0;
import oO0oo0o.AbstractC34247OooO00o;
import oO0oo0o.InterfaceC34248OooO0O0;
import oO0oooO.InterfaceC34286OooO0o0;
import oOO0000O.C34319OooO0o0;
import oOO0000o.C34322OooO0OO;
import oOO000OO.OooO0OO;
import oOO000Oo.C34327OooO0o0;
import oOO000Oo.OooO0o;

/* JADX INFO: renamed from: oO0ooO00.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34267OooO00o extends Provider {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final Class f123037OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final HashMap f123038OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final String[] f123039OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final String[] f123040OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public static final String[] f123041OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public static final String[] f123042OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public static final String[] f123043OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public static final String[] f123044OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public static final String[] f123045OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public static final String[] f123046Oooo000;

    /* JADX INFO: renamed from: oO0ooO00.OooO00o$OooO00o, reason: collision with other inner class name */
    public class C20348OooO00o implements PrivilegedAction {
        public C20348OooO00o() {
        }

        @Override // java.security.PrivilegedAction
        public final Object run() {
            String str;
            String str2;
            String[] strArr = C34267OooO00o.f123044OooOooO;
            C34267OooO00o c34267OooO00o = C34267OooO00o.this;
            c34267OooO00o.OooO0O0("org.bouncycastle.jcajce.provider.digest.", strArr);
            c34267OooO00o.OooO0O0("org.bouncycastle.jcajce.provider.symmetric.", C34267OooO00o.f123040OooOoO0);
            c34267OooO00o.OooO0O0("org.bouncycastle.jcajce.provider.symmetric.", C34267OooO00o.f123039OooOoO);
            c34267OooO00o.OooO0O0("org.bouncycastle.jcajce.provider.symmetric.", C34267OooO00o.f123041OooOoOO);
            c34267OooO00o.OooO0O0("org.bouncycastle.jcajce.provider.asymmetric.", C34267OooO00o.f123043OooOoo0);
            c34267OooO00o.OooO0O0("org.bouncycastle.jcajce.provider.asymmetric.", C34267OooO00o.f123042OooOoo);
            c34267OooO00o.OooO0O0("org.bouncycastle.jcajce.provider.keystore.", C34267OooO00o.f123045OooOooo);
            c34267OooO00o.OooO0O0("org.bouncycastle.jcajce.provider.drbg.", C34267OooO00o.f123046Oooo000);
            C34267OooO00o.OooO00o(InterfaceC34286OooO0o0.f123094OooO0Oo, new OooO0OO());
            C34267OooO00o.OooO00o(InterfaceC34286OooO0o0.f123096OooO0o0, new C34322OooO0OO());
            C34267OooO00o.OooO00o(InterfaceC34286OooO0o0.f123095OooO0o, new C34327OooO0o0());
            C34267OooO00o.OooO00o(InterfaceC34104OooO00o.f122520OooO00o, new C34327OooO0o0());
            C34267OooO00o.OooO00o(InterfaceC34286OooO0o0.f123097OooO0oO, new OooO0o());
            C34267OooO00o.OooO00o(InterfaceC34104OooO00o.f122521OooO0O0, new OooO0o());
            C34267OooO00o.OooO00o(InterfaceC34286OooO0o0.f123092OooO0O0, new oOO0000O.OooO0o());
            C34267OooO00o.OooO00o(InterfaceC34286OooO0o0.f123093OooO0OO, new C34319OooO0o0());
            C34267OooO00o.OooO00o(InterfaceC34286OooO0o0.f123091OooO00o, new oOO000O0.OooO0OO());
            C34267OooO00o.OooO00o(InterfaceC34286OooO0o0.f123098OooO0oo, new oOO000.OooO0OO());
            C34267OooO00o.OooO00o(InterfaceC34286OooO0o0.f123090OooO, new oOO000.OooO0OO());
            C34267OooO00o.OooO00o(InterfaceC34117OooO0o0.f122611OooOo0O, new oOO0000.OooO0OO());
            c34267OooO00o.put("X509Store.CERTIFICATE/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCertCollection");
            c34267OooO00o.put("X509Store.ATTRIBUTECERTIFICATE/COLLECTION", "org.bouncycastle.jce.provider.X509StoreAttrCertCollection");
            c34267OooO00o.put("X509Store.CRL/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCRLCollection");
            c34267OooO00o.put("X509Store.CERTIFICATEPAIR/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCertPairCollection");
            c34267OooO00o.put("X509Store.CERTIFICATE/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCerts");
            c34267OooO00o.put("X509Store.CRL/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCRLs");
            c34267OooO00o.put("X509Store.ATTRIBUTECERTIFICATE/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPAttrCerts");
            c34267OooO00o.put("X509Store.CERTIFICATEPAIR/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCertPairs");
            c34267OooO00o.put("X509StreamParser.CERTIFICATE", "org.bouncycastle.jce.provider.X509CertParser");
            c34267OooO00o.put("X509StreamParser.ATTRIBUTECERTIFICATE", "org.bouncycastle.jce.provider.X509AttrCertParser");
            c34267OooO00o.put("X509StreamParser.CRL", "org.bouncycastle.jce.provider.X509CRLParser");
            c34267OooO00o.put("X509StreamParser.CERTIFICATEPAIR", "org.bouncycastle.jce.provider.X509CertPairParser");
            c34267OooO00o.put("Cipher.BROKENPBEWITHMD5ANDDES", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$BrokePBEWithMD5AndDES");
            c34267OooO00o.put("Cipher.BROKENPBEWITHSHA1ANDDES", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$BrokePBEWithSHA1AndDES");
            c34267OooO00o.put("Cipher.OLDPBEWITHSHAANDTWOFISH-CBC", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$OldPBEWithSHAAndTwofish");
            Class cls = C34267OooO00o.f123037OooOo;
            c34267OooO00o.put("CertPathValidator.RFC3281", "org.bouncycastle.jce.provider.PKIXAttrCertPathValidatorSpi");
            c34267OooO00o.put("CertPathBuilder.RFC3281", "org.bouncycastle.jce.provider.PKIXAttrCertPathBuilderSpi");
            if (cls != null) {
                str = "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi_8";
                c34267OooO00o.put("CertPathValidator.RFC3280", "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi_8");
                str2 = "org.bouncycastle.jce.provider.PKIXCertPathBuilderSpi_8";
            } else {
                str = "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi";
                c34267OooO00o.put("CertPathValidator.RFC3280", "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi");
                str2 = "org.bouncycastle.jce.provider.PKIXCertPathBuilderSpi";
            }
            c34267OooO00o.put("CertPathBuilder.RFC3280", str2);
            c34267OooO00o.put("CertPathValidator.PKIX", str);
            c34267OooO00o.put("CertPathBuilder.PKIX", str2);
            c34267OooO00o.put("CertStore.Collection", "org.bouncycastle.jce.provider.CertStoreCollectionSpi");
            c34267OooO00o.put("CertStore.LDAP", "org.bouncycastle.jce.provider.X509LDAPCertStoreSpi");
            c34267OooO00o.put("CertStore.Multi", "org.bouncycastle.jce.provider.MultiCertStoreSpi");
            c34267OooO00o.put("Alg.Alias.CertStore.X509LDAP", "LDAP");
            return null;
        }
    }

    static {
        new ThreadLocal();
        new ThreadLocal();
        new HashSet();
        new HashMap();
        f123038OooOo0o = new HashMap();
        f123037OooOo = C24121OooO00o.OooO0O0("java.security.cert.PKIXRevocationChecker");
        f123040OooOoO0 = new String[]{"PBEPBKDF1", "PBEPBKDF2", "PBEPKCS12", "TLSKDF", "SCRYPT"};
        f123039OooOoO = new String[]{"SipHash", "SipHash128", "Poly1305"};
        f123041OooOoOO = new String[]{AES256KeyLoader.AES_ALGORITHM, "ARC4", "ARIA", "Blowfish", "Camellia", "CAST5", "CAST6", "ChaCha", "DES", "DESede", "GOST28147", "Grainv1", "Grain128", "HC128", "HC256", "IDEA", "Noekeon", "RC2", "RC5", "RC6", "Rijndael", "Salsa20", "SEED", "Serpent", "Shacal2", "Skipjack", "SM4", "TEA", "Twofish", "Threefish", "VMPC", "VMPCKSA3", "XTEA", "XSalsa20", "OpenSSLPBKDF", "DSTU7624", "GOST3412_2015", "Zuc"};
        f123043OooOoo0 = new String[]{"X509", "IES", "COMPOSITE"};
        f123042OooOoo = new String[]{"DSA", "DH", "EC", AbstractDevicePopManager.KeyPairGeneratorAlgorithms.RSA, "GOST", "ECGOST", "ElGamal", "DSTU4145", "GM", "EdEC"};
        f123044OooOooO = new String[]{"GOST3411", "Keccak", "MD2", "MD4", "MD5", "SHA1", "RIPEMD128", "RIPEMD160", "RIPEMD256", "RIPEMD320", "SHA224", "SHA256", "SHA384", "SHA512", "SHA3", "Skein", "SM3", "Tiger", "Whirlpool", "Blake2b", "Blake2s", "DSTU7564", "Haraka"};
        f123045OooOooo = new String[]{"BC", "BCFKS", "PKCS12"};
        f123046Oooo000 = new String[]{"DRBG"};
    }

    public C34267OooO00o() {
        super("BC", 1.7d, "BouncyCastle Security Provider v1.70");
        AccessController.doPrivileged(new C20348OooO00o());
    }

    public static void OooO00o(C34032OooOo0O c34032OooOo0O, InterfaceC34248OooO0O0 interfaceC34248OooO0O0) {
        HashMap map = f123038OooOo0o;
        synchronized (map) {
            map.put(c34032OooOo0O, interfaceC34248OooO0O0);
        }
    }

    public final void OooO0O0(String str, String[] strArr) {
        for (int i = 0; i != strArr.length; i++) {
            StringBuilder sbOooO0OO = C22218Oooo.OooO0OO(str);
            sbOooO0OO.append(strArr[i]);
            sbOooO0OO.append("$Mappings");
            Class clsOooO0O0 = C24121OooO00o.OooO0O0(sbOooO0OO.toString());
            if (clsOooO0O0 != null) {
                try {
                    ((AbstractC34247OooO00o) clsOooO0O0.newInstance()).OooO00o();
                } catch (Exception e) {
                    throw new InternalError("cannot create instance of " + str + strArr[i] + "$Mappings : " + e);
                }
            }
        }
    }
}
