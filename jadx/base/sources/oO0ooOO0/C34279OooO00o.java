package oO0ooOO0;

import OooOO0.OooO0OO;
import com.microsoft.identity.common.java.platform.AbstractDevicePopManager;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashMap;
import o00ooOo.C25785OooO0oO;
import oO0oO0Oo.C34032OooOo0O;
import oO0oOOOO.InterfaceC34117OooO0o0;
import oO0oOo0.C34142OooO00o;
import oO0oOo0.C34162OooOo00;
import oO0oOo0O.InterfaceC34171OooO0o;
import oO0ooO.C34252OooO00o;

/* JADX INFO: renamed from: oO0ooOO0.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34279OooO00o {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final HashMap f123057OooO0O0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public C25785OooO0oO f123058OooO00o;

    static {
        HashMap map = new HashMap();
        f123057OooO0O0 = map;
        map.put(InterfaceC34171OooO0o.f122784OooOOO0, "ECDSA");
        map.put(InterfaceC34117OooO0o0.f122590OooO00o, AbstractDevicePopManager.KeyPairGeneratorAlgorithms.RSA);
        map.put(InterfaceC34171OooO0o.f122787OooOOo, "DSA");
    }

    public final KeyFactory OooO00o(C34142OooO00o c34142OooO00o) throws NoSuchAlgorithmException, NoSuchProviderException {
        C25785OooO0oO c25785OooO0oO = this.f123058OooO00o;
        C34032OooOo0O c34032OooOo0O = c34142OooO00o.f122685OooOo0o;
        String str = (String) f123057OooO0O0.get(c34032OooOo0O);
        if (str == null) {
            str = c34032OooOo0O.f122357OooOo0o;
        }
        try {
            c25785OooO0oO.getClass();
            return KeyFactory.getInstance(str);
        } catch (NoSuchAlgorithmException e) {
            if (!str.equals("ECDSA")) {
                throw e;
            }
            c25785OooO0oO.getClass();
            return KeyFactory.getInstance("EC");
        }
    }

    public final PublicKey OooO0O0(C34162OooOo00 c34162OooOo00) throws C34252OooO00o {
        try {
            return OooO00o(c34162OooOo00.f122751OooOo0o).generatePublic(new X509EncodedKeySpec(c34162OooOo00.getEncoded()));
        } catch (Exception e) {
            throw new C34252OooO00o(OooO0OO.OooO0Oo(e, new StringBuilder("unable to convert key pair: ")), e);
        }
    }
}
