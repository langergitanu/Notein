package oO0oOooo;

import com.microsoft.identity.common.java.crypto.key.AES256KeyLoader;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.HashSet;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import oO0oO0Oo.C34032OooOo0O;
import oO0oOO0O.InterfaceC34105OooO00o;
import oO0oOOOO.InterfaceC34117OooO0o0;
import oO0oOoO.C34174OooO00o;
import oO0oOoO.C34179OooO0o0;
import oO0oOoO.InterfaceC34188OooOOOo;
import oO0ooOO.C34274OooO00o;
import oOooo.InterfaceC34616OooO00o;

/* JADX INFO: renamed from: oO0oOooo.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34223OooO0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final HashMap f122931OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final HashMap f122932OooO0O0;

    static {
        C34274OooO00o c34274OooO00o = C34274OooO00o.f123054OooO00o;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        f122931OooO00o = map;
        HashMap map2 = new HashMap();
        f122932OooO0O0 = map2;
        HashMap map3 = new HashMap();
        HashMap map4 = new HashMap();
        C34032OooOo0O c34032OooOo0O = C34174OooO00o.f122796OooO00o;
        map.put(c34032OooOo0O, "DES");
        C34032OooOo0O c34032OooOo0O2 = C34174OooO00o.f122797OooO0O0;
        map.put(c34032OooOo0O2, "DESEDE");
        C34032OooOo0O c34032OooOo0O3 = C34174OooO00o.f122801OooO0o0;
        map.put(c34032OooOo0O3, AES256KeyLoader.AES_ALGORITHM);
        C34032OooOo0O c34032OooOo0O4 = C34174OooO00o.f122800OooO0o;
        map.put(c34032OooOo0O4, AES256KeyLoader.AES_ALGORITHM);
        C34032OooOo0O c34032OooOo0O5 = C34174OooO00o.f122802OooO0oO;
        map.put(c34032OooOo0O5, AES256KeyLoader.AES_ALGORITHM);
        C34032OooOo0O c34032OooOo0O6 = C34174OooO00o.f122798OooO0OO;
        map.put(c34032OooOo0O6, "RC2");
        C34032OooOo0O c34032OooOo0O7 = C34174OooO00o.f122799OooO0Oo;
        map.put(c34032OooOo0O7, "CAST5");
        C34032OooOo0O c34032OooOo0O8 = C34174OooO00o.f122803OooO0oo;
        map.put(c34032OooOo0O8, "Camellia");
        C34032OooOo0O c34032OooOo0O9 = C34174OooO00o.f122795OooO;
        map.put(c34032OooOo0O9, "Camellia");
        C34032OooOo0O c34032OooOo0O10 = C34174OooO00o.f122804OooOO0;
        map.put(c34032OooOo0O10, "Camellia");
        C34032OooOo0O c34032OooOo0O11 = C34174OooO00o.f122805OooOO0O;
        map.put(c34032OooOo0O11, "SEED");
        C34032OooOo0O c34032OooOo0O12 = InterfaceC34117OooO0o0.f122599OooOO0O;
        map.put(c34032OooOo0O12, "RC4");
        map.put(InterfaceC34616OooO00o.f124001OooO0Oo, "GOST28147");
        map2.put(c34032OooOo0O, "DES/CBC/PKCS5Padding");
        map2.put(c34032OooOo0O6, "RC2/CBC/PKCS5Padding");
        map2.put(c34032OooOo0O2, "DESEDE/CBC/PKCS5Padding");
        map2.put(c34032OooOo0O3, "AES/CBC/PKCS5Padding");
        map2.put(c34032OooOo0O4, "AES/CBC/PKCS5Padding");
        map2.put(c34032OooOo0O5, "AES/CBC/PKCS5Padding");
        map2.put(InterfaceC34117OooO0o0.f122590OooO00o, "RSA/ECB/PKCS1Padding");
        map2.put(c34032OooOo0O7, "CAST5/CBC/PKCS5Padding");
        map2.put(c34032OooOo0O8, "Camellia/CBC/PKCS5Padding");
        map2.put(c34032OooOo0O9, "Camellia/CBC/PKCS5Padding");
        map2.put(c34032OooOo0O10, "Camellia/CBC/PKCS5Padding");
        map2.put(c34032OooOo0O11, "SEED/CBC/PKCS5Padding");
        map2.put(c34032OooOo0O12, "RC4");
        map3.put(c34032OooOo0O2, "DESEDEMac");
        map3.put(c34032OooOo0O3, "AESMac");
        map3.put(c34032OooOo0O4, "AESMac");
        map3.put(c34032OooOo0O5, "AESMac");
        map3.put(c34032OooOo0O6, "RC2Mac");
        map4.put(InterfaceC34188OooOOOo.OooO00o.f122821OooO0O0.f122826OooO00o, "PBKDF2WITHHMACSHA1");
        map4.put(InterfaceC34188OooOOOo.OooO00o.f122822OooO0OO.f122826OooO00o, "PBKDF2WITHHMACSHA224");
        map4.put(InterfaceC34188OooOOOo.OooO00o.f122823OooO0Oo.f122826OooO00o, "PBKDF2WITHHMACSHA256");
        map4.put(InterfaceC34188OooOOOo.OooO00o.f122825OooO0o0.f122826OooO00o, "PBKDF2WITHHMACSHA384");
        map4.put(InterfaceC34188OooOOOo.OooO00o.f122824OooO0o.f122826OooO00o, "PBKDF2WITHHMACSHA512");
        hashSet.add(InterfaceC34105OooO00o.f122536OooOOOO);
        hashSet.add(InterfaceC34105OooO00o.f122543OooOo00);
        hashSet.add(InterfaceC34105OooO00o.f122547OooOoO0);
        hashSet.add(InterfaceC34105OooO00o.f122537OooOOOo);
        hashSet.add(InterfaceC34105OooO00o.f122542OooOo0);
        hashSet.add(InterfaceC34105OooO00o.f122546OooOoO);
    }

    public final Cipher OooO00o(C34032OooOo0O c34032OooOo0O) throws C34179OooO0o0 {
        try {
            String str = (String) f122932OooO0O0.get(c34032OooOo0O);
            if (str != null) {
                try {
                    return Cipher.getInstance(str);
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            return Cipher.getInstance(c34032OooOo0O.f122357OooOo0o);
        } catch (GeneralSecurityException e) {
            throw new C34179OooO0o0("cannot create cipher: " + e.getMessage(), e);
        }
    }

    public final KeyAgreement OooO0O0(C34032OooOo0O c34032OooOo0O) throws C34179OooO0o0 {
        try {
            String str = (String) f122931OooO00o.get(c34032OooOo0O);
            if (str != null) {
                try {
                    return KeyAgreement.getInstance(str);
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            return KeyAgreement.getInstance(c34032OooOo0O.f122357OooOo0o);
        } catch (GeneralSecurityException e) {
            throw new C34179OooO0o0("cannot create key agreement: " + e.getMessage(), e);
        }
    }

    public final KeyFactory OooO0OO(C34032OooOo0O c34032OooOo0O) throws C34179OooO0o0 {
        try {
            String str = (String) f122931OooO00o.get(c34032OooOo0O);
            if (str != null) {
                try {
                    return KeyFactory.getInstance(str);
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            return KeyFactory.getInstance(c34032OooOo0O.f122357OooOo0o);
        } catch (GeneralSecurityException e) {
            throw new C34179OooO0o0("cannot create key factory: " + e.getMessage(), e);
        }
    }
}
