package androidx.biometric;

import OooOOOo.C20457OooOOo;
import OooOOOo.C20459OooOOoo;
import android.app.KeyguardManager;
import android.content.Context;
import android.hardware.biometrics.BiometricManager;
import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.util.Log;
import androidx.core.hardware.fingerprint.FingerprintManagerCompat;
import com.orion.notein.global.R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: androidx.biometric.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21589OooO0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO0OO f63226OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final BiometricManager f63227OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final FingerprintManagerCompat f63228OooO0OO;

    /* JADX INFO: renamed from: androidx.biometric.OooO0Oo$OooO00o */
    public static class OooO00o {
        public static int OooO00o(BiometricManager biometricManager) {
            return biometricManager.canAuthenticate();
        }

        public static BiometricManager OooO0O0(Context context) {
            return (BiometricManager) context.getSystemService(BiometricManager.class);
        }

        public static Method OooO0OO() {
            try {
                return BiometricManager.class.getMethod("canAuthenticate", BiometricPrompt.CryptoObject.class);
            } catch (NoSuchMethodException unused) {
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.biometric.OooO0Oo$OooO0O0 */
    public static class OooO0O0 {
        public static int OooO00o(BiometricManager biometricManager, int i) {
            return biometricManager.canAuthenticate(i);
        }
    }

    /* JADX INFO: renamed from: androidx.biometric.OooO0Oo$OooO0OO */
    public static class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Context f63229OooO00o;

        public OooO0OO(Context context) {
            this.f63229OooO00o = context.getApplicationContext();
        }
    }

    public C21589OooO0Oo(OooO0OO oooO0OO) {
        this.f63226OooO00o = oooO0OO;
        int i = Build.VERSION.SDK_INT;
        Context context = oooO0OO.f63229OooO00o;
        this.f63227OooO0O0 = i >= 29 ? OooO00o.OooO0O0(context) : null;
        this.f63228OooO0OO = i <= 29 ? FingerprintManagerCompat.from(context) : null;
    }

    public final int OooO00o(int i) {
        int iOooO00o;
        BiometricPrompt.CryptoObject cryptoObjectOooO0O0;
        Object objInvoke;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            BiometricManager biometricManager = this.f63227OooO0O0;
            if (biometricManager != null) {
                return OooO0O0.OooO00o(biometricManager, i);
            }
            Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
            return 1;
        }
        if (!androidx.biometric.OooO0OO.OooO0O0(i)) {
            return -2;
        }
        if (i == 0) {
            return 12;
        }
        OooO0OO oooO0OO = this.f63226OooO00o;
        Context context = oooO0OO.f63229OooO00o;
        if (C20457OooOOo.OooO00o(context) == null) {
            return 12;
        }
        int iOooO0O0 = 0;
        if (androidx.biometric.OooO0OO.OooO00o(i)) {
            KeyguardManager keyguardManagerOooO00o = C20457OooOOo.OooO00o(context);
            return keyguardManagerOooO00o == null ? false : C20457OooOOo.OooO0O0(keyguardManagerOooO00o) ? 0 : 11;
        }
        if (i2 != 29) {
            if (i2 != 28) {
                return OooO0O0();
            }
            if (!((context == null || context.getPackageManager() == null || !C20459OooOOoo.OooO00o(context.getPackageManager())) ? false : true)) {
                return 12;
            }
            KeyguardManager keyguardManagerOooO00o2 = C20457OooOOo.OooO00o(oooO0OO.f63229OooO00o);
            return !(keyguardManagerOooO00o2 == null ? false : C20457OooOOo.OooO0O0(keyguardManagerOooO00o2)) ? OooO0O0() : OooO0O0() == 0 ? 0 : -1;
        }
        if ((i & 255) == 255) {
            BiometricManager biometricManager2 = this.f63227OooO0O0;
            if (biometricManager2 != null) {
                return OooO00o.OooO00o(biometricManager2);
            }
            Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
            return 1;
        }
        Method methodOooO0OO = OooO00o.OooO0OO();
        if (methodOooO0OO != null && (cryptoObjectOooO0O0 = C21593OooO0oo.OooO0O0(C21593OooO0oo.OooO00o())) != null) {
            if (i2 == 29) {
                try {
                    objInvoke = methodOooO0OO.invoke(this.f63227OooO0O0, cryptoObjectOooO0O0);
                } catch (IllegalAccessException e) {
                    e = e;
                    Log.w("BiometricManager", "Failed to invoke canAuthenticate(CryptoObject).", e);
                } catch (IllegalArgumentException e2) {
                    e = e2;
                    Log.w("BiometricManager", "Failed to invoke canAuthenticate(CryptoObject).", e);
                } catch (InvocationTargetException e3) {
                    e = e3;
                    Log.w("BiometricManager", "Failed to invoke canAuthenticate(CryptoObject).", e);
                }
            } else {
                objInvoke = null;
            }
            if (objInvoke instanceof Integer) {
                return ((Integer) objInvoke).intValue();
            }
            Log.w("BiometricManager", "Invalid return type for canAuthenticate(CryptoObject).");
        }
        BiometricManager biometricManager3 = this.f63227OooO0O0;
        if (biometricManager3 == null) {
            Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
            iOooO00o = 1;
        } else {
            iOooO00o = OooO00o.OooO00o(biometricManager3);
        }
        String str = Build.MODEL;
        if (Build.VERSION.SDK_INT < 30 && str != null) {
            for (String str2 : context.getResources().getStringArray(R.array.assume_strong_biometrics_models)) {
                if (str.equals(str2)) {
                    break;
                }
            }
            z = false;
        } else {
            z = false;
        }
        if (z || iOooO00o != 0) {
            return iOooO00o;
        }
        KeyguardManager keyguardManagerOooO00o3 = C20457OooOOo.OooO00o(oooO0OO.f63229OooO00o);
        if (!(keyguardManagerOooO00o3 == null ? false : C20457OooOOo.OooO0O0(keyguardManagerOooO00o3))) {
            iOooO0O0 = OooO0O0();
        } else if (OooO0O0() != 0) {
            iOooO0O0 = -1;
        }
        return iOooO0O0;
    }

    public final int OooO0O0() {
        FingerprintManagerCompat fingerprintManagerCompat = this.f63228OooO0OO;
        if (fingerprintManagerCompat == null) {
            Log.e("BiometricManager", "Failure in canAuthenticate(). FingerprintManager was null.");
            return 1;
        }
        if (fingerprintManagerCompat.isHardwareDetected()) {
            return !fingerprintManagerCompat.hasEnrolledFingerprints() ? 11 : 0;
        }
        return 12;
    }
}
