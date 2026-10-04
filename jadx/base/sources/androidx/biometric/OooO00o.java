package androidx.biometric;

import androidx.biometric.C21590OooO0o0;
import androidx.core.hardware.fingerprint.FingerprintManagerCompat;
import androidx.lifecycle.C21996Oooo0OO;
import java.lang.ref.WeakReference;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o extends FingerprintManagerCompat.AuthenticationCallback {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ OooO0O0 f63221OooO00o;

    public OooO00o(OooO0O0 oooO0O0) {
        this.f63221OooO00o = oooO0O0;
    }

    @Override // androidx.core.hardware.fingerprint.FingerprintManagerCompat.AuthenticationCallback
    public final void onAuthenticationError(int i, CharSequence charSequence) {
        this.f63221OooO00o.f63224OooO0OO.OooO00o(i, charSequence);
    }

    @Override // androidx.core.hardware.fingerprint.FingerprintManagerCompat.AuthenticationCallback
    public final void onAuthenticationFailed() {
        WeakReference<C21592OooO0oO> weakReference = this.f63221OooO00o.f63224OooO0OO.f63272OooO00o;
        if (weakReference.get() == null || !weakReference.get().f63256OooOOO) {
            return;
        }
        C21592OooO0oO c21592OooO0oO = weakReference.get();
        if (c21592OooO0oO.f63266OooOo0O == null) {
            c21592OooO0oO.f63266OooOo0O = new C21996Oooo0OO<>();
        }
        C21592OooO0oO.OooOO0(c21592OooO0oO.f63266OooOo0O, Boolean.TRUE);
    }

    @Override // androidx.core.hardware.fingerprint.FingerprintManagerCompat.AuthenticationCallback
    public final void onAuthenticationHelp(int i, CharSequence charSequence) {
        WeakReference<C21592OooO0oO> weakReference = this.f63221OooO00o.f63224OooO0OO.f63272OooO00o;
        if (weakReference.get() != null) {
            C21592OooO0oO c21592OooO0oO = weakReference.get();
            if (c21592OooO0oO.f63264OooOo0 == null) {
                c21592OooO0oO.f63264OooOo0 = new C21996Oooo0OO<>();
            }
            C21592OooO0oO.OooOO0(c21592OooO0oO.f63264OooOo0, charSequence);
        }
    }

    @Override // androidx.core.hardware.fingerprint.FingerprintManagerCompat.AuthenticationCallback
    public final void onAuthenticationSucceeded(FingerprintManagerCompat.AuthenticationResult authenticationResult) {
        FingerprintManagerCompat.CryptoObject cryptoObject;
        C21590OooO0o0.OooO0OO oooO0OO = null;
        if (authenticationResult != null && (cryptoObject = authenticationResult.getCryptoObject()) != null) {
            Cipher cipher = cryptoObject.getCipher();
            if (cipher != null) {
                oooO0OO = new C21590OooO0o0.OooO0OO(cipher);
            } else {
                Signature signature = cryptoObject.getSignature();
                if (signature != null) {
                    oooO0OO = new C21590OooO0o0.OooO0OO(signature);
                } else {
                    Mac mac = cryptoObject.getMac();
                    if (mac != null) {
                        oooO0OO = new C21590OooO0o0.OooO0OO(mac);
                    }
                }
            }
        }
        this.f63221OooO00o.f63224OooO0OO.OooO0O0(new C21590OooO0o0.OooO0O0(oooO0OO, 2));
    }
}
