package com.google.android.gms.auth.api.signin.internal;

import OooOo.Oooo0;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import androidx.fragment.app.ActivityC21897OooOo0;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInApi;
import com.google.android.gms.auth.api.signin.GoogleSignInStatusCodes;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.api.Status;
import com.huawei.hms.network.inner.api.NetworkService;
import java.lang.reflect.Modifier;
import o000o00O.AbstractC24558OooO00o;
import o000o00O.C24559OooO0O0;
import o000o00o.C24561OooO0O0;

/* JADX INFO: loaded from: classes7.dex */
public class SignInHubActivity extends ActivityC21897OooOo0 {
    private static boolean zba = false;
    private boolean zbb = false;
    private SignInConfiguration zbc;
    private boolean zbd;
    private int zbe;
    private Intent zbf;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.lifecycle.OooOoo, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final void zbc() {
        AbstractC24558OooO00o supportLoaderManager = getSupportLoaderManager();
        zbw zbwVar = new zbw(this, null);
        C24559OooO0O0 c24559OooO0O0 = (C24559OooO0O0) supportLoaderManager;
        C24559OooO0O0.OooO0OO oooO0OO = c24559OooO0O0.f83138OooO0O0;
        if (oooO0OO.f83147OooO0o0) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        Oooo0<C24559OooO0O0.OooO00o> oooo0 = oooO0OO.f83146OooO0Oo;
        C24559OooO0O0.OooO00o oooO00oOooO0OO = oooo0.OooO0OO(0);
        ?? r0 = c24559OooO0O0.f83137OooO00o;
        if (oooO00oOooO0OO == 0) {
            try {
                oooO0OO.f83147OooO0o0 = true;
                C24561OooO0O0 c24561OooO0O0OnCreateLoader = zbwVar.onCreateLoader(0, null);
                if (c24561OooO0O0OnCreateLoader == null) {
                    throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
                }
                if (c24561OooO0O0OnCreateLoader.getClass().isMemberClass() && !Modifier.isStatic(c24561OooO0O0OnCreateLoader.getClass().getModifiers())) {
                    throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + c24561OooO0O0OnCreateLoader);
                }
                C24559OooO0O0.OooO00o oooO00o = new C24559OooO0O0.OooO00o(c24561OooO0O0OnCreateLoader);
                oooo0.OooO0o0(0, oooO00o);
                oooO0OO.f83147OooO0o0 = false;
                C24559OooO0O0.C19632OooO0O0<D> c19632OooO0O0 = new C24559OooO0O0.C19632OooO0O0<>(oooO00o.f83139OooOO0o, zbwVar);
                oooO00o.OooO0Oo(r0, c19632OooO0O0);
                Object obj = oooO00o.f83140OooOOO;
                if (obj != null) {
                    oooO00o.OooO(obj);
                }
                oooO00o.f83141OooOOO0 = r0;
                oooO00o.f83140OooOOO = c19632OooO0O0;
            } catch (Throwable th) {
                oooO0OO.f83147OooO0o0 = false;
                throw th;
            }
        } else {
            C24559OooO0O0.C19632OooO0O0<D> c19632OooO0O02 = new C24559OooO0O0.C19632OooO0O0<>(oooO00oOooO0OO.f83139OooOO0o, zbwVar);
            oooO00oOooO0OO.OooO0Oo(r0, c19632OooO0O02);
            Object obj2 = oooO00oOooO0OO.f83140OooOOO;
            if (obj2 != null) {
                oooO00oOooO0OO.OooO(obj2);
            }
            oooO00oOooO0OO.f83141OooOOO0 = r0;
            oooO00oOooO0OO.f83140OooOOO = c19632OooO0O02;
        }
        zba = false;
    }

    private final void zbd(int i) {
        Status status = new Status(i);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        zba = false;
    }

    private final void zbe(String str) {
        Intent intent = new Intent(str);
        if (str.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
            intent.setPackage("com.google.android.gms");
        } else {
            intent.setPackage(getPackageName());
        }
        intent.putExtra(NetworkService.Constants.CONFIG_SERVICE, this.zbc);
        try {
            startActivityForResult(intent, 40962);
        } catch (ActivityNotFoundException unused) {
            this.zbb = true;
            Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
            zbd(17);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    @Override // androidx.fragment.app.ActivityC21897OooOo0, OooO0Oo.OooOO0O, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (this.zbb) {
            return;
        }
        setResult(0);
        if (i != 40962) {
            return;
        }
        if (intent != null) {
            SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra(GoogleSignInApi.EXTRA_SIGN_IN_ACCOUNT);
            if (signInAccount != null && signInAccount.zba() != null) {
                GoogleSignInAccount googleSignInAccountZba = signInAccount.zba();
                if (googleSignInAccountZba == null) {
                    Log.e("AuthSignInClient", "Google account is null");
                    zbd(GoogleSignInStatusCodes.SIGN_IN_FAILED);
                    return;
                }
                zbn.zbc(this).zbe(this.zbc.zba(), googleSignInAccountZba);
                intent.removeExtra(GoogleSignInApi.EXTRA_SIGN_IN_ACCOUNT);
                intent.putExtra("googleSignInAccount", googleSignInAccountZba);
                this.zbd = true;
                this.zbe = i2;
                this.zbf = intent;
                zbc();
                return;
            }
            if (intent.hasExtra("errorCode")) {
                int intExtra = intent.getIntExtra("errorCode", 8);
                if (intExtra == 13) {
                    intExtra = GoogleSignInStatusCodes.SIGN_IN_CANCELLED;
                }
                zbd(intExtra);
                return;
            }
        }
        zbd(8);
    }

    @Override // androidx.fragment.app.ActivityC21897OooOo0, OooO0Oo.OooOO0O, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        if (action == null) {
            Log.e("AuthSignInClient", "Null action");
            zbd(GoogleSignInStatusCodes.SIGN_IN_FAILED);
            return;
        }
        if (action.equals("com.google.android.gms.auth.NO_IMPL")) {
            Log.e("AuthSignInClient", "Action not implemented");
            zbd(GoogleSignInStatusCodes.SIGN_IN_FAILED);
            return;
        }
        if (!action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") && !action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            Log.e("AuthSignInClient", "Unknown action: ".concat(String.valueOf(intent.getAction())));
            finish();
            return;
        }
        Bundle bundleExtra = intent.getBundleExtra(NetworkService.Constants.CONFIG_SERVICE);
        if (bundleExtra == null) {
            Log.e("AuthSignInClient", "Activity started with no configuration.");
            setResult(0);
            finish();
            return;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) bundleExtra.getParcelable(NetworkService.Constants.CONFIG_SERVICE);
        if (signInConfiguration == null) {
            Log.e("AuthSignInClient", "Activity started with invalid configuration.");
            setResult(0);
            finish();
            return;
        }
        this.zbc = signInConfiguration;
        if (bundle == null) {
            if (zba) {
                setResult(0);
                zbd(GoogleSignInStatusCodes.SIGN_IN_CURRENTLY_IN_PROGRESS);
                return;
            } else {
                zba = true;
                zbe(action);
                return;
            }
        }
        boolean z = bundle.getBoolean("signingInGoogleApiClients");
        this.zbd = z;
        if (z) {
            this.zbe = bundle.getInt("signInResultCode");
            Intent intent2 = (Intent) bundle.getParcelable("signInResultData");
            if (intent2 != null) {
                this.zbf = intent2;
                zbc();
            } else {
                Log.e("AuthSignInClient", "Sign in result data cannot be null");
                setResult(0);
                finish();
            }
        }
    }

    @Override // androidx.fragment.app.ActivityC21897OooOo0, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        zba = false;
    }

    @Override // OooO0Oo.OooOO0O, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.zbd);
        if (this.zbd) {
            bundle.putInt("signInResultCode", this.zbe);
            bundle.putParcelable("signInResultData", this.zbf);
        }
    }
}
