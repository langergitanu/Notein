package androidx.biometric;

import OooOOOo.C20451OooO0Oo;
import OooOOOo.C20452OooO0o0;
import OooOOOo.C20453OooO0oO;
import OooOOOo.C20454OooO0oo;
import OooOOOo.C20457OooOOo;
import OooOOOo.C20459OooOOoo;
import OooOOOo.OooO;
import OooOOOo.OooOOO;
import OooOOOo.OooOOOO;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import androidx.biometric.C21590OooO0o0;
import androidx.biometric.C21592OooO0oO;
import androidx.biometric.OooO0O0;
import androidx.core.hardware.fingerprint.FingerprintManagerCompat;
import androidx.fragment.app.ActivityC21897OooOo0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C21996Oooo0OO;
import com.orion.notein.global.R;
import java.lang.ref.WeakReference;
import java.security.Signature;
import java.util.concurrent.Executor;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes.dex */
public class BiometricFragment extends Fragment {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final Handler f63206OooOo = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C21592OooO0oO f63207OooOo0o;

    public static class OooO00o {
        public static Intent OooO00o(KeyguardManager keyguardManager, CharSequence charSequence, CharSequence charSequence2) {
            return keyguardManager.createConfirmDeviceCredentialIntent(charSequence, charSequence2);
        }
    }

    public static class OooO0O0 {
        public static void OooO00o(BiometricPrompt biometricPrompt, BiometricPrompt.CryptoObject cryptoObject, CancellationSignal cancellationSignal, Executor executor, BiometricPrompt$AuthenticationCallback biometricPrompt$AuthenticationCallback) {
            biometricPrompt.authenticate(cryptoObject, cancellationSignal, executor, biometricPrompt$AuthenticationCallback);
        }

        public static void OooO0O0(BiometricPrompt biometricPrompt, CancellationSignal cancellationSignal, Executor executor, BiometricPrompt$AuthenticationCallback biometricPrompt$AuthenticationCallback) {
            biometricPrompt.authenticate(cancellationSignal, executor, biometricPrompt$AuthenticationCallback);
        }

        public static BiometricPrompt OooO0OO(BiometricPrompt.Builder builder) {
            return builder.build();
        }

        public static BiometricPrompt.Builder OooO0Oo(Context context) {
            return new BiometricPrompt.Builder(context);
        }

        public static void OooO0o(BiometricPrompt.Builder builder, CharSequence charSequence, Executor executor, DialogInterface.OnClickListener onClickListener) {
            builder.setNegativeButton(charSequence, executor, onClickListener);
        }

        public static void OooO0o0(BiometricPrompt.Builder builder, CharSequence charSequence) {
            builder.setDescription(charSequence);
        }

        public static void OooO0oO(BiometricPrompt.Builder builder, CharSequence charSequence) {
            builder.setTitle(charSequence);
        }
    }

    public static class OooO0OO {
        public static void OooO00o(BiometricPrompt.Builder builder, boolean z) {
            builder.setConfirmationRequired(z);
        }

        public static void OooO0O0(BiometricPrompt.Builder builder, boolean z) {
            builder.setDeviceCredentialAllowed(z);
        }
    }

    /* JADX INFO: renamed from: androidx.biometric.BiometricFragment$OooO0Oo, reason: case insensitive filesystem */
    public static class C21584OooO0Oo {
        public static void OooO00o(BiometricPrompt.Builder builder, int i) {
            builder.setAllowedAuthenticators(i);
        }
    }

    public static class OooO0o implements Runnable {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final WeakReference<BiometricFragment> f63208OooOo0o;

        public OooO0o(BiometricFragment biometricFragment) {
            this.f63208OooOo0o = new WeakReference<>(biometricFragment);
        }

        @Override // java.lang.Runnable
        public final void run() {
            WeakReference<BiometricFragment> weakReference = this.f63208OooOo0o;
            if (weakReference.get() != null) {
                weakReference.get().Oooo00o();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.biometric.BiometricFragment$OooO0o0, reason: case insensitive filesystem */
    public static class ExecutorC21585OooO0o0 implements Executor {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final Handler f63209OooOo0o = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            this.f63209OooOo0o.post(runnable);
        }
    }

    /* JADX INFO: renamed from: androidx.biometric.BiometricFragment$OooO0oO, reason: case insensitive filesystem */
    public static class RunnableC21586OooO0oO implements Runnable {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final WeakReference<C21592OooO0oO> f63210OooOo0o;

        public RunnableC21586OooO0oO(C21592OooO0oO c21592OooO0oO) {
            this.f63210OooOo0o = new WeakReference<>(c21592OooO0oO);
        }

        @Override // java.lang.Runnable
        public final void run() {
            WeakReference<C21592OooO0oO> weakReference = this.f63210OooOo0o;
            if (weakReference.get() != null) {
                weakReference.get().f63259OooOOOo = false;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.biometric.BiometricFragment$OooO0oo, reason: case insensitive filesystem */
    public static class RunnableC21587OooO0oo implements Runnable {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final WeakReference<C21592OooO0oO> f63211OooOo0o;

        public RunnableC21587OooO0oo(C21592OooO0oO c21592OooO0oO) {
            this.f63211OooOo0o = new WeakReference<>(c21592OooO0oO);
        }

        @Override // java.lang.Runnable
        public final void run() {
            WeakReference<C21592OooO0oO> weakReference = this.f63211OooOo0o;
            if (weakReference.get() != null) {
                weakReference.get().f63261OooOOo0 = false;
            }
        }
    }

    public final void OooOoO() {
        this.f63207OooOo0o.f63257OooOOO0 = false;
        if (isAdded()) {
            FragmentManager parentFragmentManager = getParentFragmentManager();
            FingerprintDialogFragment fingerprintDialogFragment = (FingerprintDialogFragment) parentFragmentManager.OooOooo("androidx.biometric.FingerprintDialogFragment");
            if (fingerprintDialogFragment != null) {
                if (fingerprintDialogFragment.isAdded()) {
                    fingerprintDialogFragment.dismissAllowingStateLoss();
                    return;
                }
                androidx.fragment.app.OooO00o oooO00o = new androidx.fragment.app.OooO00o(parentFragmentManager);
                oooO00o.OooOOO0(fingerprintDialogFragment);
                oooO00o.OooO(true, true);
            }
        }
    }

    public final void OooOoO0(int i) {
        if (i == 3 || !this.f63207OooOo0o.f63261OooOOo0) {
            if (OooOoo0()) {
                this.f63207OooOo0o.f63255OooOO0o = i;
                if (i == 1) {
                    OooOooo(10, OooOOOO.OooO0Oo(getContext(), 10));
                }
            }
            C21592OooO0oO c21592OooO0oO = this.f63207OooOo0o;
            if (c21592OooO0oO.f63247OooO == null) {
                c21592OooO0oO.f63247OooO = new OooOOO();
            }
            OooOOO oooOOO = c21592OooO0oO.f63247OooO;
            CancellationSignal cancellationSignal = oooOOO.f58430OooO00o;
            if (cancellationSignal != null) {
                try {
                    OooOOO.OooO0O0.OooO00o(cancellationSignal);
                } catch (NullPointerException e) {
                    Log.e("CancelSignalProvider", "Got NPE while canceling biometric authentication.", e);
                }
                oooOOO.f58430OooO00o = null;
            }
            androidx.core.os.CancellationSignal cancellationSignal2 = oooOOO.f58431OooO0O0;
            if (cancellationSignal2 != null) {
                try {
                    cancellationSignal2.cancel();
                } catch (NullPointerException e2) {
                    Log.e("CancelSignalProvider", "Got NPE while canceling fingerprint authentication.", e2);
                }
                oooOOO.f58431OooO0O0 = null;
            }
        }
    }

    public final boolean OooOoOO() {
        return Build.VERSION.SDK_INT <= 28 && androidx.biometric.OooO0OO.OooO00o(this.f63207OooOo0o.OooO0o0());
    }

    public final void OooOoo() {
        Context context = getContext();
        KeyguardManager keyguardManagerOooO00o = context != null ? C20457OooOOo.OooO00o(context) : null;
        if (keyguardManagerOooO00o == null) {
            OooOooO(12, getString(R.string.generic_error_no_keyguard));
            return;
        }
        C21592OooO0oO c21592OooO0oO = this.f63207OooOo0o;
        C21590OooO0o0.C21591OooO0Oo c21591OooO0Oo = c21592OooO0oO.f63249OooO0o;
        String str = c21591OooO0Oo != null ? c21591OooO0Oo.f63238OooO00o : null;
        c21592OooO0oO.getClass();
        C21590OooO0o0.C21591OooO0Oo c21591OooO0Oo2 = this.f63207OooOo0o.f63249OooO0o;
        Intent intentOooO00o = OooO00o.OooO00o(keyguardManagerOooO00o, str, c21591OooO0Oo2 != null ? c21591OooO0Oo2.f63239OooO0O0 : null);
        if (intentOooO00o == null) {
            OooOooO(14, getString(R.string.generic_error_no_device_credential));
            return;
        }
        this.f63207OooOo0o.f63258OooOOOO = true;
        if (OooOoo0()) {
            OooOoO();
        }
        intentOooO00o.setFlags(134742016);
        startActivityForResult(intentOooO00o, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean OooOoo0() {
        String str;
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            Context context = getContext();
            if (context == null || this.f63207OooOo0o.f63251OooO0oO == null) {
                if (i == 28) {
                    Bundle arguments = getArguments();
                    Context context2 = getContext();
                    if (!arguments.getBoolean("has_fingerprint", (context2 == null || context2.getPackageManager() == null || !C20459OooOOoo.OooO00o(context2.getPackageManager())) ? false : true)) {
                    }
                }
                return false;
            }
            String str2 = Build.MANUFACTURER;
            String str3 = Build.MODEL;
            if (i == 28) {
                if (str2 == null) {
                    str = Build.MODEL;
                    if (str == null) {
                        for (String str4 : context.getResources().getStringArray(R.array.crypto_fingerprint_fallback_prefixes)) {
                            if (str.startsWith(str4)) {
                                break;
                            }
                        }
                        if (i == 28) {
                        }
                        return false;
                    }
                } else {
                    for (String str5 : context.getResources().getStringArray(R.array.crypto_fingerprint_fallback_vendors)) {
                        if (str2.equalsIgnoreCase(str5)) {
                            break;
                        }
                    }
                    str = Build.MODEL;
                    if (str == null) {
                    }
                }
            }
        }
        return true;
    }

    public final void OooOooO(int i, CharSequence charSequence) {
        OooOooo(i, charSequence);
        dismiss();
    }

    public final void OooOooo(final int i, final CharSequence charSequence) {
        C21592OooO0oO c21592OooO0oO = this.f63207OooOo0o;
        if (c21592OooO0oO.f63258OooOOOO) {
            Log.v("BiometricFragment", "Error not sent to client. User is confirming their device credential.");
            return;
        }
        if (!c21592OooO0oO.f63256OooOOO) {
            Log.w("BiometricFragment", "Error not sent to client. Client is not awaiting a result.");
            return;
        }
        c21592OooO0oO.f63256OooOOO = false;
        Executor oooO0O0 = c21592OooO0oO.f63248OooO0Oo;
        if (oooO0O0 == null) {
            oooO0O0 = new C21592OooO0oO.OooO0O0();
        }
        oooO0O0.execute(new Runnable() { // from class: OooOOOo.OooOO0
            @Override // java.lang.Runnable
            public final void run() {
                C21592OooO0oO c21592OooO0oO2 = this.f58424OooOo0o.f63207OooOo0o;
                if (c21592OooO0oO2.f63250OooO0o0 == null) {
                    c21592OooO0oO2.f63250OooO0o0 = new androidx.biometric.OooO0o();
                }
                c21592OooO0oO2.f63250OooO0o0.OooO00o(i, charSequence);
            }
        });
    }

    public final void Oooo000(C21590OooO0o0.OooO0O0 oooO0O0) {
        C21592OooO0oO c21592OooO0oO = this.f63207OooOo0o;
        if (c21592OooO0oO.f63256OooOOO) {
            c21592OooO0oO.f63256OooOOO = false;
            Executor oooO0O02 = c21592OooO0oO.f63248OooO0Oo;
            if (oooO0O02 == null) {
                oooO0O02 = new C21592OooO0oO.OooO0O0();
            }
            oooO0O02.execute(new OooOOOo.OooO0O0(0, this, oooO0O0));
        } else {
            Log.w("BiometricFragment", "Success not sent to client. Client is not awaiting a result.");
        }
        dismiss();
    }

    public final void Oooo00O(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = getString(R.string.default_error_msg);
        }
        this.f63207OooOo0o.OooO0oo(2);
        this.f63207OooOo0o.OooO0oO(charSequence);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Oooo00o() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (this.f63207OooOo0o.f63257OooOOO0) {
            return;
        }
        if (getContext() == null) {
            Log.w("BiometricFragment", "Not showing biometric prompt. Context is null.");
            return;
        }
        C21592OooO0oO c21592OooO0oO = this.f63207OooOo0o;
        c21592OooO0oO.f63257OooOOO0 = true;
        c21592OooO0oO.f63256OooOOO = true;
        int i = Build.VERSION.SDK_INT;
        Context context = getContext();
        if (context != null) {
            String str = Build.MANUFACTURER;
            if (i != 29) {
                z4 = false;
            } else if (str == null) {
                z3 = false;
                z4 = !z3;
            } else {
                for (String str2 : context.getResources().getStringArray(R.array.keyguard_biometric_and_credential_exclude_vendors)) {
                    if (str.equalsIgnoreCase(str2)) {
                        z3 = true;
                        break;
                    }
                }
                z3 = false;
                z4 = !z3;
            }
            if (z4) {
                int iOooO0o0 = this.f63207OooOo0o.OooO0o0();
                if (((iOooO0o0 & 255) == 255) && androidx.biometric.OooO0OO.OooO00o(iOooO0o0)) {
                    this.f63207OooOo0o.f63260OooOOo = true;
                    z = true;
                } else {
                    z = false;
                }
            }
        }
        if (z) {
            OooOoo();
            return;
        }
        String str3 = null;
        cryptoObject = null;
        cryptoObject = null;
        cryptoObject = null;
        cryptoObject = null;
        FingerprintManagerCompat.CryptoObject cryptoObject = null;
        if (!OooOoo0()) {
            BiometricPrompt.Builder builderOooO0Oo = OooO0O0.OooO0Oo(requireContext().getApplicationContext());
            C21592OooO0oO c21592OooO0oO2 = this.f63207OooOo0o;
            C21590OooO0o0.C21591OooO0Oo c21591OooO0Oo = c21592OooO0oO2.f63249OooO0o;
            String str4 = c21591OooO0Oo != null ? c21591OooO0Oo.f63238OooO00o : null;
            c21592OooO0oO2.getClass();
            C21590OooO0o0.C21591OooO0Oo c21591OooO0Oo2 = this.f63207OooOo0o.f63249OooO0o;
            String str5 = c21591OooO0Oo2 != null ? c21591OooO0Oo2.f63239OooO0O0 : null;
            if (str4 != null) {
                OooO0O0.OooO0oO(builderOooO0Oo, str4);
            }
            if (str5 != null) {
                OooO0O0.OooO0o0(builderOooO0Oo, str5);
            }
            C21592OooO0oO c21592OooO0oO3 = this.f63207OooOo0o;
            String str6 = c21592OooO0oO3.f63254OooOO0O;
            if (str6 != null) {
                str3 = str6;
            } else {
                C21590OooO0o0.C21591OooO0Oo c21591OooO0Oo3 = c21592OooO0oO3.f63249OooO0o;
                if (c21591OooO0Oo3 != null && (str3 = c21591OooO0Oo3.f63240OooO0OO) == null) {
                    str3 = "";
                }
            }
            if (!TextUtils.isEmpty(str3)) {
                Executor oooO0O0 = this.f63207OooOo0o.f63248OooO0Oo;
                if (oooO0O0 == null) {
                    oooO0O0 = new C21592OooO0oO.OooO0O0();
                }
                C21592OooO0oO c21592OooO0oO4 = this.f63207OooOo0o;
                if (c21592OooO0oO4.f63253OooOO0 == null) {
                    c21592OooO0oO4.f63253OooOO0 = new C21592OooO0oO.OooO0OO(c21592OooO0oO4);
                }
                OooO0O0.OooO0o(builderOooO0Oo, str3, oooO0O0, c21592OooO0oO4.f63253OooOO0);
            }
            if (i >= 29) {
                C21590OooO0o0.C21591OooO0Oo c21591OooO0Oo4 = this.f63207OooOo0o.f63249OooO0o;
                OooO0OO.OooO00o(builderOooO0Oo, true);
            }
            int iOooO0o02 = this.f63207OooOo0o.OooO0o0();
            if (i >= 30) {
                C21584OooO0Oo.OooO00o(builderOooO0Oo, iOooO0o02);
            } else if (i >= 29) {
                OooO0OO.OooO0O0(builderOooO0Oo, androidx.biometric.OooO0OO.OooO00o(iOooO0o02));
            }
            BiometricPrompt biometricPromptOooO0OO = OooO0O0.OooO0OO(builderOooO0Oo);
            Context context2 = getContext();
            BiometricPrompt.CryptoObject cryptoObjectOooO0O0 = C21593OooO0oo.OooO0O0(this.f63207OooOo0o.f63251OooO0oO);
            C21592OooO0oO c21592OooO0oO5 = this.f63207OooOo0o;
            if (c21592OooO0oO5.f63247OooO == null) {
                c21592OooO0oO5.f63247OooO = new OooOOO();
            }
            OooOOO oooOOO = c21592OooO0oO5.f63247OooO;
            if (oooOOO.f58430OooO00o == null) {
                oooOOO.f58430OooO00o = OooOOO.OooO0O0.OooO0O0();
            }
            CancellationSignal cancellationSignal = oooOOO.f58430OooO00o;
            ExecutorC21585OooO0o0 executorC21585OooO0o0 = new ExecutorC21585OooO0o0();
            C21592OooO0oO c21592OooO0oO6 = this.f63207OooOo0o;
            if (c21592OooO0oO6.f63252OooO0oo == null) {
                c21592OooO0oO6.f63252OooO0oo = new androidx.biometric.OooO0O0(new C21592OooO0oO.OooO00o(c21592OooO0oO6));
            }
            androidx.biometric.OooO0O0 oooO0O02 = c21592OooO0oO6.f63252OooO0oo;
            if (oooO0O02.f63222OooO00o == null) {
                oooO0O02.f63222OooO00o = OooO0O0.OooO00o.OooO00o(oooO0O02.f63224OooO0OO);
            }
            BiometricPrompt$AuthenticationCallback biometricPrompt$AuthenticationCallback = oooO0O02.f63222OooO00o;
            try {
                if (cryptoObjectOooO0O0 == null) {
                    OooO0O0.OooO0O0(biometricPromptOooO0OO, cancellationSignal, executorC21585OooO0o0, biometricPrompt$AuthenticationCallback);
                } else {
                    OooO0O0.OooO00o(biometricPromptOooO0OO, cryptoObjectOooO0O0, cancellationSignal, executorC21585OooO0o0, biometricPrompt$AuthenticationCallback);
                }
                return;
            } catch (NullPointerException e) {
                Log.e("BiometricFragment", "Got NPE while authenticating with biometric prompt.", e);
                OooOooO(1, context2 != null ? context2.getString(R.string.default_error_msg) : "");
                return;
            }
        }
        Context applicationContext = requireContext().getApplicationContext();
        FingerprintManagerCompat fingerprintManagerCompatFrom = FingerprintManagerCompat.from(applicationContext);
        int i2 = !fingerprintManagerCompatFrom.isHardwareDetected() ? 12 : !fingerprintManagerCompatFrom.hasEnrolledFingerprints() ? 11 : 0;
        if (i2 != 0) {
            OooOooO(i2, OooOOOO.OooO0Oo(applicationContext, i2));
            return;
        }
        if (isAdded()) {
            this.f63207OooOo0o.f63263OooOo = true;
            String str7 = Build.MODEL;
            if (Build.VERSION.SDK_INT == 28 && str7 != null) {
                for (String str8 : applicationContext.getResources().getStringArray(R.array.hide_fingerprint_instantly_prefixes)) {
                    if (str7.startsWith(str8)) {
                        z2 = true;
                        break;
                    }
                }
                z2 = false;
            } else {
                z2 = false;
            }
            if (!z2) {
                this.f63206OooOo.postDelayed(new Runnable() { // from class: OooOOOo.OooO0OO
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f58417OooOo0o.f63207OooOo0o.f63263OooOo = false;
                    }
                }, 500L);
                FingerprintDialogFragment.OooOoOO(getArguments().getBoolean("host_activity", true)).show(getParentFragmentManager(), "androidx.biometric.FingerprintDialogFragment");
            }
            C21592OooO0oO c21592OooO0oO7 = this.f63207OooOo0o;
            c21592OooO0oO7.f63255OooOO0o = 0;
            C21590OooO0o0.OooO0OO oooO0OO = c21592OooO0oO7.f63251OooO0oO;
            if (oooO0OO != null) {
                Cipher cipher = oooO0OO.f63234OooO0O0;
                if (cipher != null) {
                    cryptoObject = new FingerprintManagerCompat.CryptoObject(cipher);
                } else {
                    Signature signature = oooO0OO.f63233OooO00o;
                    if (signature != null) {
                        cryptoObject = new FingerprintManagerCompat.CryptoObject(signature);
                    } else {
                        Mac mac = oooO0OO.f63235OooO0OO;
                        if (mac != null) {
                            cryptoObject = new FingerprintManagerCompat.CryptoObject(mac);
                        } else if (i >= 30 && oooO0OO.f63236OooO0Oo != null) {
                            Log.e("CryptoObjectUtils", "Identity credential is not supported by FingerprintManager.");
                        } else if (i >= 33 && oooO0OO.f63237OooO0o0 != null) {
                            Log.e("CryptoObjectUtils", "Presentation session is not supported by FingerprintManager.");
                        }
                    }
                }
            }
            FingerprintManagerCompat.CryptoObject cryptoObject2 = cryptoObject;
            C21592OooO0oO c21592OooO0oO8 = this.f63207OooOo0o;
            if (c21592OooO0oO8.f63247OooO == null) {
                c21592OooO0oO8.f63247OooO = new OooOOO();
            }
            OooOOO oooOOO2 = c21592OooO0oO8.f63247OooO;
            if (oooOOO2.f58431OooO0O0 == null) {
                oooOOO2.f58431OooO0O0 = new androidx.core.os.CancellationSignal();
            }
            androidx.core.os.CancellationSignal cancellationSignal2 = oooOOO2.f58431OooO0O0;
            C21592OooO0oO c21592OooO0oO9 = this.f63207OooOo0o;
            if (c21592OooO0oO9.f63252OooO0oo == null) {
                c21592OooO0oO9.f63252OooO0oo = new androidx.biometric.OooO0O0(new C21592OooO0oO.OooO00o(c21592OooO0oO9));
            }
            androidx.biometric.OooO0O0 oooO0O03 = c21592OooO0oO9.f63252OooO0oo;
            if (oooO0O03.f63223OooO0O0 == null) {
                oooO0O03.f63223OooO0O0 = new androidx.biometric.OooO00o(oooO0O03);
            }
            try {
                fingerprintManagerCompatFrom.authenticate(cryptoObject2, 0, cancellationSignal2, oooO0O03.f63223OooO0O0, (Handler) null);
            } catch (NullPointerException e2) {
                Log.e("BiometricFragment", "Got NPE while authenticating with fingerprint.", e2);
                OooOooO(1, OooOOOO.OooO0Oo(applicationContext, 1));
            }
        }
    }

    public final void dismiss() {
        OooOoO();
        C21592OooO0oO c21592OooO0oO = this.f63207OooOo0o;
        c21592OooO0oO.f63257OooOOO0 = false;
        if (!c21592OooO0oO.f63258OooOOOO && isAdded()) {
            FragmentManager parentFragmentManager = getParentFragmentManager();
            parentFragmentManager.getClass();
            androidx.fragment.app.OooO00o oooO00o = new androidx.fragment.app.OooO00o(parentFragmentManager);
            oooO00o.OooOOO0(this);
            oooO00o.OooO(true, true);
        }
        Context context = getContext();
        if (context != null) {
            String str = Build.MODEL;
            if (Build.VERSION.SDK_INT == 29 && str != null) {
                for (String str2 : context.getResources().getStringArray(R.array.delay_showing_prompt_models)) {
                    if (str.equals(str2)) {
                        C21592OooO0oO c21592OooO0oO2 = this.f63207OooOo0o;
                        c21592OooO0oO2.f63259OooOOOo = true;
                        this.f63206OooOo.postDelayed(new RunnableC21586OooO0oO(c21592OooO0oO2), 600L);
                        return;
                    }
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        int i3 = 1;
        if (i == 1) {
            C21592OooO0oO c21592OooO0oO = this.f63207OooOo0o;
            c21592OooO0oO.f63258OooOOOO = false;
            if (i2 != -1) {
                OooOooO(10, getString(R.string.generic_error_user_canceled));
                return;
            }
            if (c21592OooO0oO.f63260OooOOo) {
                c21592OooO0oO.f63260OooOOo = false;
                i3 = -1;
            }
            Oooo000(new C21590OooO0o0.OooO0O0(null, i3));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.f63207OooOo0o == null) {
            this.f63207OooOo0o = C21590OooO0o0.OooO0O0(this, getArguments().getBoolean("host_activity", true));
        }
        C21592OooO0oO c21592OooO0oO = this.f63207OooOo0o;
        ActivityC21897OooOo0 activity = getActivity();
        c21592OooO0oO.getClass();
        new WeakReference(activity);
        C21592OooO0oO c21592OooO0oO2 = this.f63207OooOo0o;
        if (c21592OooO0oO2.f63262OooOOoo == null) {
            c21592OooO0oO2.f63262OooOOoo = new C21996Oooo0OO<>();
        }
        c21592OooO0oO2.f63262OooOOoo.OooO0Oo(this, new C20451OooO0Oo(this));
        C21592OooO0oO c21592OooO0oO3 = this.f63207OooOo0o;
        if (c21592OooO0oO3.f63265OooOo00 == null) {
            c21592OooO0oO3.f63265OooOo00 = new C21996Oooo0OO<>();
        }
        c21592OooO0oO3.f63265OooOo00.OooO0Oo(this, new C20452OooO0o0(this));
        C21592OooO0oO c21592OooO0oO4 = this.f63207OooOo0o;
        if (c21592OooO0oO4.f63264OooOo0 == null) {
            c21592OooO0oO4.f63264OooOo0 = new C21996Oooo0OO<>();
        }
        c21592OooO0oO4.f63264OooOo0.OooO0Oo(this, new OooOOOo.OooO0o(this));
        C21592OooO0oO c21592OooO0oO5 = this.f63207OooOo0o;
        if (c21592OooO0oO5.f63266OooOo0O == null) {
            c21592OooO0oO5.f63266OooOo0O = new C21996Oooo0OO<>();
        }
        c21592OooO0oO5.f63266OooOo0O.OooO0Oo(this, new C20453OooO0oO(this));
        C21592OooO0oO c21592OooO0oO6 = this.f63207OooOo0o;
        if (c21592OooO0oO6.f63267OooOo0o == null) {
            c21592OooO0oO6.f63267OooOo0o = new C21996Oooo0OO<>();
        }
        c21592OooO0oO6.f63267OooOo0o.OooO0Oo(this, new C20454OooO0oo(this));
        C21592OooO0oO c21592OooO0oO7 = this.f63207OooOo0o;
        if (c21592OooO0oO7.f63269OooOoO0 == null) {
            c21592OooO0oO7.f63269OooOoO0 = new C21996Oooo0OO<>();
        }
        c21592OooO0oO7.f63269OooOoO0.OooO0Oo(this, new OooO(this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        if (Build.VERSION.SDK_INT == 29 && androidx.biometric.OooO0OO.OooO00o(this.f63207OooOo0o.OooO0o0())) {
            C21592OooO0oO c21592OooO0oO = this.f63207OooOo0o;
            c21592OooO0oO.f63261OooOOo0 = true;
            this.f63206OooOo.postDelayed(new RunnableC21587OooO0oo(c21592OooO0oO), 250L);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        if (Build.VERSION.SDK_INT >= 29 || this.f63207OooOo0o.f63258OooOOOO) {
            return;
        }
        ActivityC21897OooOo0 activity = getActivity();
        if (activity == null || !activity.isChangingConfigurations()) {
            OooOoO0(0);
        }
    }
}
