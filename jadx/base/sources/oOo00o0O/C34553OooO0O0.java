package oOo00o0O;

import Oooo0oO.C21111o0ooOoO;
import com.microsoft.identity.common.java.crypto.key.AES256KeyLoader;
import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.util.HashMap;
import javax.crypto.Cipher;
import oO0oO0Oo.C34032OooOo0O;
import oO0oOO0.InterfaceC34103OooO00o;
import oO0oOO0O.InterfaceC34105OooO00o;
import oO0oOO0o.InterfaceC34106OooO00o;
import oO0oOOO.InterfaceC34107OooO00o;
import oO0oOOOO.InterfaceC34117OooO0o0;
import oO0oOOoO.InterfaceC34132OooO00o;
import oO0oOo0.C34142OooO00o;
import oO0ooOO.C34277OooO0Oo;
import oOooo.InterfaceC34616OooO00o;

/* JADX INFO: renamed from: oOo00o0O.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34553OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final HashMap f123797OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final HashMap f123798OooO0O0;

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        f123797OooO00o = map2;
        HashMap map3 = new HashMap();
        HashMap map4 = new HashMap();
        f123798OooO0O0 = map4;
        HashMap map5 = new HashMap();
        map.put(InterfaceC34107OooO00o.f122558OooO0O0, "SHA1");
        map.put(InterfaceC34105OooO00o.f122526OooO0Oo, "SHA224");
        map.put(InterfaceC34105OooO00o.f122523OooO00o, "SHA256");
        map.put(InterfaceC34105OooO00o.f122524OooO0O0, "SHA384");
        map.put(InterfaceC34105OooO00o.f122525OooO0OO, "SHA512");
        map.put(InterfaceC34132OooO00o.f122661OooO0O0, "RIPEMD128");
        map.put(InterfaceC34132OooO00o.f122660OooO00o, "RIPEMD160");
        map.put(InterfaceC34132OooO00o.f122662OooO0OO, "RIPEMD256");
        map2.put(InterfaceC34117OooO0o0.f122590OooO00o, "RSA/ECB/PKCS1Padding");
        map2.put(InterfaceC34616OooO00o.f123997OooO, "ECGOST3410");
        C34032OooOo0O c34032OooOo0O = InterfaceC34117OooO0o0.f122612OooOo0o;
        map3.put(c34032OooOo0O, "DESEDEWrap");
        map3.put(InterfaceC34117OooO0o0.f122608OooOo, "RC2Wrap");
        C34032OooOo0O c34032OooOo0O2 = InterfaceC34105OooO00o.f122534OooOOO;
        map3.put(c34032OooOo0O2, "AESWrap");
        C34032OooOo0O c34032OooOo0O3 = InterfaceC34105OooO00o.f122540OooOOoo;
        map3.put(c34032OooOo0O3, "AESWrap");
        C34032OooOo0O c34032OooOo0O4 = InterfaceC34105OooO00o.f122541OooOo;
        map3.put(c34032OooOo0O4, "AESWrap");
        C34032OooOo0O c34032OooOo0O5 = InterfaceC34106OooO00o.f122554OooO0Oo;
        map3.put(c34032OooOo0O5, "CamelliaWrap");
        C34032OooOo0O c34032OooOo0O6 = InterfaceC34106OooO00o.f122556OooO0o0;
        map3.put(c34032OooOo0O6, "CamelliaWrap");
        C34032OooOo0O c34032OooOo0O7 = InterfaceC34106OooO00o.f122555OooO0o;
        map3.put(c34032OooOo0O7, "CamelliaWrap");
        C34032OooOo0O c34032OooOo0O8 = InterfaceC34103OooO00o.f122519OooO0O0;
        map3.put(c34032OooOo0O8, "SEEDWrap");
        C34032OooOo0O c34032OooOo0O9 = InterfaceC34117OooO0o0.f122589OooO;
        map3.put(c34032OooOo0O9, "DESede");
        map5.put(c34032OooOo0O, 192);
        map5.put(c34032OooOo0O2, 128);
        map5.put(c34032OooOo0O3, 192);
        map5.put(c34032OooOo0O4, 256);
        map5.put(c34032OooOo0O5, 128);
        map5.put(c34032OooOo0O6, 192);
        map5.put(c34032OooOo0O7, 256);
        map5.put(c34032OooOo0O8, 128);
        map5.put(c34032OooOo0O9, 192);
        map4.put(InterfaceC34105OooO00o.f122533OooOO0o, AES256KeyLoader.AES_ALGORITHM);
        map4.put(InterfaceC34105OooO00o.f122535OooOOO0, AES256KeyLoader.AES_ALGORITHM);
        map4.put(InterfaceC34105OooO00o.f122538OooOOo, AES256KeyLoader.AES_ALGORITHM);
        map4.put(InterfaceC34105OooO00o.f122545OooOo0o, AES256KeyLoader.AES_ALGORITHM);
        map4.put(c34032OooOo0O9, "DESede");
        map4.put(InterfaceC34117OooO0o0.f122598OooOO0, "RC2");
    }

    public static String OooO0OO(C34032OooOo0O c34032OooOo0O) {
        String str = (String) f123798OooO0O0.get(c34032OooOo0O);
        return str != null ? str : c34032OooOo0O.f122357OooOo0o;
    }

    public final AlgorithmParameters OooO00o(C34142OooO00o c34142OooO00o) throws C34277OooO0Oo {
        if (c34142OooO00o.f122685OooOo0o.OooOO0o(InterfaceC34117OooO0o0.f122590OooO00o)) {
            return null;
        }
        try {
            AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance(c34142OooO00o.f122685OooOo0o.f122357OooOo0o);
            try {
                algorithmParameters.init(c34142OooO00o.f122684OooOo.OooO0o().getEncoded());
                return algorithmParameters;
            } catch (IOException e) {
                throw new C34277OooO0Oo(C21111o0ooOoO.OooO00o(e, new StringBuilder("cannot initialise algorithm parameters: ")), e);
            }
        } catch (NoSuchAlgorithmException unused) {
            return null;
        } catch (NoSuchProviderException e2) {
            throw new C34277OooO0Oo("cannot create algorithm parameters: " + e2.getMessage(), e2);
        }
    }

    public final Cipher OooO0O0(C34032OooOo0O c34032OooOo0O, HashMap map) throws C34277OooO0Oo {
        try {
            String str = !map.isEmpty() ? (String) map.get(c34032OooOo0O) : null;
            if (str == null) {
                str = (String) f123797OooO00o.get(c34032OooOo0O);
            }
            if (str != null) {
                try {
                    return Cipher.getInstance(str);
                } catch (NoSuchAlgorithmException unused) {
                    if (str.equals("RSA/ECB/PKCS1Padding")) {
                        try {
                            return Cipher.getInstance("RSA/NONE/PKCS1Padding");
                        } catch (NoSuchAlgorithmException unused2) {
                        }
                    }
                    return Cipher.getInstance(c34032OooOo0O.f122357OooOo0o);
                }
            }
            return Cipher.getInstance(c34032OooOo0O.f122357OooOo0o);
        } catch (GeneralSecurityException e) {
            throw new C34277OooO0Oo("cannot create cipher: " + e.getMessage(), e);
        }
    }
}
