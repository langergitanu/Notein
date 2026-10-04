package androidx.biometric;

import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;
import android.os.Build;
import android.security.identity.IdentityCredential;
import android.security.identity.PresentationSession;
import androidx.biometric.C21590OooO0o0;
import androidx.biometric.C21592OooO0oO;
import androidx.biometric.C21593OooO0oo;
import androidx.lifecycle.C21996Oooo0OO;
import java.lang.ref.WeakReference;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public BiometricPrompt$AuthenticationCallback f63222OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public androidx.biometric.OooO00o f63223OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C21592OooO0oO.OooO00o f63224OooO0OO;

    public static class OooO00o {

        /* JADX INFO: renamed from: androidx.biometric.OooO0O0$OooO00o$OooO00o, reason: collision with other inner class name */
        public class C18995OooO00o extends BiometricPrompt$AuthenticationCallback {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final /* synthetic */ OooO0OO f63225OooO00o;

            public C18995OooO00o(OooO0OO oooO0OO) {
                this.f63225OooO00o = oooO0OO;
            }

            public void onAuthenticationError(int i, CharSequence charSequence) {
                this.f63225OooO00o.OooO00o(i, charSequence);
            }

            public void onAuthenticationFailed() {
                WeakReference<C21592OooO0oO> weakReference = ((C21592OooO0oO.OooO00o) this.f63225OooO00o).f63272OooO00o;
                if (weakReference.get() == null || !weakReference.get().f63256OooOOO) {
                    return;
                }
                C21592OooO0oO c21592OooO0oO = weakReference.get();
                if (c21592OooO0oO.f63266OooOo0O == null) {
                    c21592OooO0oO.f63266OooOo0O = new C21996Oooo0OO<>();
                }
                C21592OooO0oO.OooOO0(c21592OooO0oO.f63266OooOo0O, Boolean.TRUE);
            }

            public void onAuthenticationHelp(int i, CharSequence charSequence) {
            }

            public void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
                BiometricPrompt.CryptoObject cryptoObjectOooO0O0;
                PresentationSession presentationSessionOooO0O0;
                IdentityCredential identityCredentialOooO0O0;
                C21590OooO0o0.OooO0OO oooO0OO = null;
                if (authenticationResult != null && (cryptoObjectOooO0O0 = OooO00o.OooO0O0(authenticationResult)) != null) {
                    Cipher cipherOooO0Oo = C21593OooO0oo.OooO0O0.OooO0Oo(cryptoObjectOooO0O0);
                    if (cipherOooO0Oo != null) {
                        oooO0OO = new C21590OooO0o0.OooO0OO(cipherOooO0Oo);
                    } else {
                        Signature signatureOooO0o = C21593OooO0oo.OooO0O0.OooO0o(cryptoObjectOooO0O0);
                        if (signatureOooO0o != null) {
                            oooO0OO = new C21590OooO0o0.OooO0OO(signatureOooO0o);
                        } else {
                            Mac macOooO0o0 = C21593OooO0oo.OooO0O0.OooO0o0(cryptoObjectOooO0O0);
                            if (macOooO0o0 != null) {
                                oooO0OO = new C21590OooO0o0.OooO0OO(macOooO0o0);
                            } else {
                                int i = Build.VERSION.SDK_INT;
                                if (i >= 30 && (identityCredentialOooO0O0 = C21593OooO0oo.OooO0OO.OooO0O0(cryptoObjectOooO0O0)) != null) {
                                    oooO0OO = new C21590OooO0o0.OooO0OO(identityCredentialOooO0O0);
                                } else if (i >= 33 && (presentationSessionOooO0O0 = C21593OooO0oo.C21594OooO0Oo.OooO0O0(cryptoObjectOooO0O0)) != null) {
                                    oooO0OO = new C21590OooO0o0.OooO0OO(presentationSessionOooO0O0);
                                }
                            }
                        }
                    }
                }
                int i2 = Build.VERSION.SDK_INT;
                int iOooO00o = -1;
                if (i2 >= 30) {
                    if (authenticationResult != null) {
                        iOooO00o = C18996OooO0O0.OooO00o(authenticationResult);
                    }
                } else if (i2 != 29) {
                    iOooO00o = 2;
                }
                this.f63225OooO00o.OooO0O0(new C21590OooO0o0.OooO0O0(oooO0OO, iOooO00o));
            }
        }

        public static BiometricPrompt$AuthenticationCallback OooO00o(OooO0OO oooO0OO) {
            return new C18995OooO00o(oooO0OO);
        }

        public static BiometricPrompt.CryptoObject OooO0O0(BiometricPrompt.AuthenticationResult authenticationResult) {
            return authenticationResult.getCryptoObject();
        }
    }

    /* JADX INFO: renamed from: androidx.biometric.OooO0O0$OooO0O0, reason: collision with other inner class name */
    public static class C18996OooO0O0 {
        public static int OooO00o(BiometricPrompt.AuthenticationResult authenticationResult) {
            return authenticationResult.getAuthenticationType();
        }
    }

    public static class OooO0OO {
        public void OooO00o(int i, CharSequence charSequence) {
            throw null;
        }

        public void OooO0O0(C21590OooO0o0.OooO0O0 oooO0O0) {
            throw null;
        }
    }

    public OooO0O0(C21592OooO0oO.OooO00o oooO00o) {
        this.f63224OooO0OO = oooO00o;
    }
}
