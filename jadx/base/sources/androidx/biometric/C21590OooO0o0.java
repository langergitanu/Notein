package androidx.biometric;

import OooOOOo.C20459OooOOoo;
import OooOOOo.OooOOO0;
import OooOOOo.OooOo00;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.security.identity.IdentityCredential;
import android.security.identity.PresentationSession;
import android.text.TextUtils;
import android.util.Log;
import androidx.biometric.BiometricFragment;
import androidx.biometric.C21589OooO0Oo;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.InterfaceC22023o00ooo;
import androidx.lifecycle.o00Oo0;
import com.orion.notein.global.R;
import java.lang.ref.WeakReference;
import java.security.Signature;
import java.util.concurrent.Executor;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import o0OoO0oo.C28711OooOoo;

/* JADX INFO: renamed from: androidx.biometric.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21590OooO0o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final FragmentManager f63230OooO00o;

    /* JADX INFO: renamed from: androidx.biometric.OooO0o0$OooO00o */
    public static abstract class OooO00o {
        public void OooO00o(int i, CharSequence charSequence) {
        }

        public void OooO0O0() {
        }

        public void OooO0OO(OooO0O0 oooO0O0) {
        }
    }

    /* JADX INFO: renamed from: androidx.biometric.OooO0o0$OooO0O0 */
    public static class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooO0OO f63231OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f63232OooO0O0;

        public OooO0O0(OooO0OO oooO0OO, int i) {
            this.f63231OooO00o = oooO0OO;
            this.f63232OooO0O0 = i;
        }
    }

    /* JADX INFO: renamed from: androidx.biometric.OooO0o0$OooO0Oo, reason: case insensitive filesystem */
    public static class C21591OooO0Oo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f63238OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final String f63239OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final String f63240OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int f63241OooO0Oo;

        /* JADX INFO: renamed from: androidx.biometric.OooO0o0$OooO0Oo$OooO00o */
        public static class OooO00o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public String f63242OooO00o = null;

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public String f63243OooO0O0 = null;

            /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
            public String f63244OooO0OO = null;

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public int f63245OooO0Oo = 0;

            public final C21591OooO0Oo OooO00o() {
                if (TextUtils.isEmpty(this.f63242OooO00o)) {
                    throw new IllegalArgumentException("Title must be set and non-empty.");
                }
                if (!androidx.biometric.OooO0OO.OooO0O0(this.f63245OooO0Oo)) {
                    StringBuilder sb = new StringBuilder("Authenticator combination is unsupported on API ");
                    sb.append(Build.VERSION.SDK_INT);
                    sb.append(": ");
                    int i = this.f63245OooO0Oo;
                    sb.append(i != 15 ? i != 255 ? i != 32768 ? i != 32783 ? i != 33023 ? String.valueOf(i) : "BIOMETRIC_WEAK | DEVICE_CREDENTIAL" : "BIOMETRIC_STRONG | DEVICE_CREDENTIAL" : "DEVICE_CREDENTIAL" : "BIOMETRIC_WEAK" : "BIOMETRIC_STRONG");
                    throw new IllegalArgumentException(sb.toString());
                }
                int i2 = this.f63245OooO0Oo;
                boolean zOooO00o = i2 != 0 ? androidx.biometric.OooO0OO.OooO00o(i2) : false;
                if (TextUtils.isEmpty(this.f63244OooO0OO) && !zOooO00o) {
                    throw new IllegalArgumentException("Negative text must be set and non-empty.");
                }
                if (TextUtils.isEmpty(this.f63244OooO0OO) || !zOooO00o) {
                    return new C21591OooO0Oo(this.f63242OooO00o, this.f63243OooO0O0, this.f63244OooO0OO, this.f63245OooO0Oo);
                }
                throw new IllegalArgumentException("Negative text must not be set if device credential authentication is allowed.");
            }
        }

        public C21591OooO0Oo(String str, String str2, String str3, int i) {
            this.f63238OooO00o = str;
            this.f63239OooO0O0 = str2;
            this.f63240OooO0OO = str3;
            this.f63241OooO0Oo = i;
        }
    }

    /* JADX INFO: renamed from: androidx.biometric.OooO0o0$OooO0o0, reason: collision with other inner class name */
    public static class C18997OooO0o0 implements androidx.lifecycle.OooO0o {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final WeakReference<C21592OooO0oO> f63246OooOo0o;

        public C18997OooO0o0(C21592OooO0oO c21592OooO0oO) {
            this.f63246OooOo0o = new WeakReference<>(c21592OooO0oO);
        }

        @Override // androidx.lifecycle.OooO0o
        public final void onDestroy(InterfaceC21987OooOoo interfaceC21987OooOoo) {
            WeakReference<C21592OooO0oO> weakReference = this.f63246OooOo0o;
            if (weakReference.get() != null) {
                weakReference.get().f63250OooO0o0 = null;
            }
        }
    }

    public C21590OooO0o0(Fragment fragment, Executor executor, C28711OooOoo c28711OooOoo) {
        if (executor == null) {
            throw new IllegalArgumentException("Executor must not be null.");
        }
        FragmentManager childFragmentManager = fragment.getChildFragmentManager();
        C21592OooO0oO c21592OooO0oO = (C21592OooO0oO) new o00Oo0(fragment).OooO00o(C21592OooO0oO.class);
        fragment.getLifecycle().OooO00o(new C18997OooO0o0(c21592OooO0oO));
        this.f63230OooO00o = childFragmentManager;
        c21592OooO0oO.f63248OooO0Oo = executor;
        c21592OooO0oO.f63250OooO0o0 = c28711OooOoo;
    }

    public static C21592OooO0oO OooO0O0(Fragment fragment, boolean z) {
        InterfaceC22023o00ooo activity = z ? fragment.getActivity() : null;
        if (activity == null) {
            activity = fragment.getParentFragment();
        }
        if (activity != null) {
            return (C21592OooO0oO) new o00Oo0(activity).OooO00o(C21592OooO0oO.class);
        }
        throw new IllegalStateException("view model not found");
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x00fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OooO00o(C21591OooO0Oo c21591OooO0Oo) {
        FragmentManager fragmentManager = this.f63230OooO00o;
        if (fragmentManager == null) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Client fragment manager was null.");
            return;
        }
        if (fragmentManager.OoooO00()) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Called after onSaveInstanceState().");
            return;
        }
        BiometricFragment biometricFragment = (BiometricFragment) this.f63230OooO00o.OooOooo("androidx.biometric.BiometricFragment");
        boolean z = false;
        if (biometricFragment == null) {
            biometricFragment = new BiometricFragment();
            Bundle bundle = new Bundle();
            bundle.putBoolean("host_activity", false);
            biometricFragment.setArguments(bundle);
            FragmentManager fragmentManager2 = this.f63230OooO00o;
            androidx.fragment.app.OooO00o oooO00oOooO0OO = OooOOO0.OooO0OO(fragmentManager2, fragmentManager2);
            oooO00oOooO0OO.OooO0Oo(0, biometricFragment, "androidx.biometric.BiometricFragment", 1);
            oooO00oOooO0OO.OooO(true, true);
            FragmentManager fragmentManager3 = this.f63230OooO00o;
            fragmentManager3.OooOoO(true);
            fragmentManager3.Oooo00O();
        }
        C21592OooO0oO c21592OooO0oO = biometricFragment.f63207OooOo0o;
        c21592OooO0oO.f63249OooO0o = c21591OooO0Oo;
        int i = c21591OooO0Oo.f63241OooO0Oo;
        if (i == 0) {
            i = 255;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30 || i != 15) {
            c21592OooO0oO.f63251OooO0oO = null;
        } else {
            c21592OooO0oO.f63251OooO0oO = C21593OooO0oo.OooO00o();
        }
        if (biometricFragment.OooOoOO()) {
            biometricFragment.f63207OooOo0o.f63254OooOO0O = biometricFragment.getString(R.string.confirm_device_credential_password);
        } else {
            biometricFragment.f63207OooOo0o.f63254OooOO0O = null;
        }
        Context context = biometricFragment.getContext();
        if (i2 == 29) {
            Bundle arguments = biometricFragment.getArguments();
            Context context2 = biometricFragment.getContext();
            if (!arguments.getBoolean("has_fingerprint", (context2 == null || context2.getPackageManager() == null || !C20459OooOOoo.OooO00o(context2.getPackageManager())) ? false : true)) {
                Bundle arguments2 = biometricFragment.getArguments();
                Context context3 = biometricFragment.getContext();
                if (!arguments2.getBoolean("has_face", i2 >= 29 && context3 != null && context3.getPackageManager() != null && OooOo00.OooO00o(context3.getPackageManager()))) {
                    Bundle arguments3 = biometricFragment.getArguments();
                    Context context4 = biometricFragment.getContext();
                    if (i2 >= 29 && context4 != null && context4.getPackageManager() != null && OooOo00.OooO0O0(context4.getPackageManager())) {
                        z = true;
                    }
                    if (arguments3.getBoolean("has_iris", z)) {
                        if (!biometricFragment.OooOoOO() || new C21589OooO0Oo(new C21589OooO0Oo.OooO0OO(context)).OooO00o(255) == 0) {
                            if (biometricFragment.f63207OooOo0o.f63259OooOOOo) {
                                biometricFragment.f63206OooOo.postDelayed(new BiometricFragment.OooO0o(biometricFragment), 600L);
                                return;
                            } else {
                                biometricFragment.Oooo00o();
                                return;
                            }
                        }
                    }
                }
            }
        }
        biometricFragment.f63207OooOo0o.f63256OooOOO = true;
        biometricFragment.OooOoo();
    }

    /* JADX INFO: renamed from: androidx.biometric.OooO0o0$OooO0OO */
    public static class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Signature f63233OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Cipher f63234OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final Mac f63235OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final IdentityCredential f63236OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final PresentationSession f63237OooO0o0;

        public OooO0OO(Signature signature) {
            this.f63233OooO00o = signature;
            this.f63234OooO0O0 = null;
            this.f63235OooO0OO = null;
            this.f63236OooO0Oo = null;
            this.f63237OooO0o0 = null;
        }

        public OooO0OO(Cipher cipher) {
            this.f63233OooO00o = null;
            this.f63234OooO0O0 = cipher;
            this.f63235OooO0OO = null;
            this.f63236OooO0Oo = null;
            this.f63237OooO0o0 = null;
        }

        public OooO0OO(Mac mac) {
            this.f63233OooO00o = null;
            this.f63234OooO0O0 = null;
            this.f63235OooO0OO = mac;
            this.f63236OooO0Oo = null;
            this.f63237OooO0o0 = null;
        }

        public OooO0OO(IdentityCredential identityCredential) {
            this.f63233OooO00o = null;
            this.f63234OooO0O0 = null;
            this.f63235OooO0OO = null;
            this.f63236OooO0Oo = identityCredential;
            this.f63237OooO0o0 = null;
        }

        public OooO0OO(PresentationSession presentationSession) {
            this.f63233OooO00o = null;
            this.f63234OooO0O0 = null;
            this.f63235OooO0OO = null;
            this.f63236OooO0Oo = null;
            this.f63237OooO0o0 = presentationSession;
        }
    }
}
