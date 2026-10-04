package oO0oOooo;

import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.spec.InvalidParameterSpecException;
import java.util.HashSet;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import oO0oO0Oo.AbstractC34028OooOOo;
import oO0oO0Oo.AbstractC34033OooOo0o;
import oO0oO0Oo.C34032OooOo0O;
import oO0oO0Oo.InterfaceC34019OooO0oO;
import oO0oOo0.C34142OooO00o;
import oO0oOoO.C34174OooO00o;
import oO0oOoO.C34176OooO0OO;
import oO0oOoO.C34179OooO0o0;

/* JADX INFO: renamed from: oO0oOooo.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34222OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ C34142OooO00o f122928OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Key f122929OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ C34223OooO0Oo f122930OooO0OO;

    public C34222OooO0OO(C34223OooO0Oo c34223OooO0Oo, C34142OooO00o c34142OooO00o, Key key) {
        this.f122930OooO0OO = c34223OooO0Oo;
        this.f122928OooO00o = c34142OooO00o;
        this.f122929OooO0O0 = key;
    }

    public final Cipher OooO00o() throws C34179OooO0o0, NoSuchPaddingException, NoSuchAlgorithmException, InvalidParameterSpecException, InvalidKeyException, NoSuchProviderException, InvalidAlgorithmParameterException {
        AlgorithmParameters algorithmParameters;
        C34142OooO00o c34142OooO00o = this.f122928OooO00o;
        Cipher cipherOooO00o = this.f122930OooO0OO.OooO00o(c34142OooO00o.f122685OooOo0o);
        InterfaceC34019OooO0oO interfaceC34019OooO0oO = c34142OooO00o.f122684OooOo;
        C34032OooOo0O c34032OooOo0O = c34142OooO00o.f122685OooOo0o;
        String str = c34032OooOo0O.f122357OooOo0o;
        Key key = this.f122929OooO0O0;
        if (interfaceC34019OooO0oO == null || (interfaceC34019OooO0oO instanceof AbstractC34028OooOOo)) {
            if (str.equals(C34174OooO00o.f122796OooO00o.f122357OooOo0o) || str.equals(C34176OooO0OO.f122808OooO00o) || str.equals("1.3.6.1.4.1.188.7.1.1.2") || str.equals("1.2.840.113533.7.66.10")) {
                cipherOooO00o.init(2, key, new IvParameterSpec(new byte[8]));
                return cipherOooO00o;
            }
            cipherOooO00o.init(2, key);
            return cipherOooO00o;
        }
        try {
            String str2 = (String) C34223OooO0Oo.f122931OooO00o.get(c34032OooOo0O);
            if (str2 != null) {
                try {
                    algorithmParameters = AlgorithmParameters.getInstance(str2);
                } catch (NoSuchAlgorithmException unused) {
                    algorithmParameters = AlgorithmParameters.getInstance(c34032OooOo0O.f122357OooOo0o);
                }
                HashSet hashSet = C34220OooO00o.f122927OooO00o;
                try {
                    try {
                        algorithmParameters.init(interfaceC34019OooO0oO.OooO0o().getEncoded(), "ASN.1");
                    } catch (Exception unused2) {
                        algorithmParameters.init(interfaceC34019OooO0oO.OooO0o().getEncoded());
                    }
                    cipherOooO00o.init(2, key, algorithmParameters);
                } catch (IOException e) {
                    throw new C34179OooO0o0("error encoding algorithm parameters.", e);
                }
            } else {
                algorithmParameters = AlgorithmParameters.getInstance(c34032OooOo0O.f122357OooOo0o);
                HashSet hashSet2 = C34220OooO00o.f122927OooO00o;
                algorithmParameters.init(interfaceC34019OooO0oO.OooO0o().getEncoded(), "ASN.1");
                cipherOooO00o.init(2, key, algorithmParameters);
            }
        } catch (NoSuchAlgorithmException e2) {
            if (!str.equals(C34174OooO00o.f122796OooO00o.f122357OooOo0o) && !str.equals(C34176OooO0OO.f122808OooO00o) && !str.equals("1.3.6.1.4.1.188.7.1.1.2") && !str.equals(C34176OooO0OO.f122809OooO0O0) && !str.equals(C34176OooO0OO.f122810OooO0OO) && !str.equals(C34176OooO0OO.f122811OooO0Oo)) {
                throw e2;
            }
            cipherOooO00o.init(2, key, new IvParameterSpec(AbstractC34033OooOo0o.OooOOo0(interfaceC34019OooO0oO).f122362OooOo0o));
        }
        return cipherOooO00o;
    }
}
