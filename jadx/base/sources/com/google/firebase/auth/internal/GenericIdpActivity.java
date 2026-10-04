package com.google.firebase.auth.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.app.BundleCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.ActivityC21897OooOo0;
import com.aspose.slides.internal.p407st.OooO00o;
import com.aspose.words.WarningType;
import com.facebook.common.callercontext.ContextChain;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.internal.p624firebaseauthapi.zzaeq;
import com.google.android.gms.internal.p624firebaseauthapi.zzaer;
import com.google.android.gms.internal.p624firebaseauthapi.zzaes;
import com.google.android.gms.internal.p624firebaseauthapi.zzagi;
import com.google.android.gms.internal.p624firebaseauthapi.zzagl;
import com.google.android.gms.internal.p624firebaseauthapi.zzajb;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.appcheck.AppCheckTokenResult;
import com.google.firebase.appcheck.interop.InteropAppCheckTokenProvider;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.inject.Provider;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.microsoft.identity.common.internal.p590ui.webview.ProcessUtil;
import com.microsoft.identity.common.java.AuthenticationConstants;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import oooo00o.C35203OooO00o;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class GenericIdpActivity extends ActivityC21897OooOo0 implements zzaes {
    private static long zzb;
    private static final zzcg zzc = zzcg.zzc();
    private boolean zzd = false;

    private final void zzb() {
        zzb = 0L;
        this.zzd = false;
        Intent intent = new Intent();
        intent.putExtra("com.google.firebase.auth.internal.EXTRA_CANCELED", true);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        if (zza(intent)) {
            zzc.zza(this);
        } else {
            zzbl.zza(this, zzao.zza("WEB_CONTEXT_CANCELED"));
        }
        finish();
    }

    @Override // androidx.fragment.app.ActivityC21897OooOo0, OooO0Oo.OooOO0O, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String action = getIntent().getAction();
        if (!"com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(action) && !"com.google.firebase.auth.internal.NONGMSCORE_LINK".equals(action) && !"com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE".equals(action) && !CommonConstant.ACTION.HWID_SCHEME_URL.equals(action)) {
            OooO00o.OooO0O0("Could not do operation - unknown action: ", action, "GenericIdpActivity");
            zzb();
            return;
        }
        long jCurrentTimeMillis = DefaultClock.getInstance().currentTimeMillis();
        if (jCurrentTimeMillis - zzb < 30000) {
            Log.e("GenericIdpActivity", "Could not start operation - already in progress");
            return;
        }
        zzb = jCurrentTimeMillis;
        if (bundle != null) {
            this.zzd = bundle.getBoolean("com.google.firebase.auth.internal.KEY_STARTED_SIGN_IN");
        }
    }

    @Override // OooO0Oo.OooOO0O, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // androidx.fragment.app.ActivityC21897OooOo0, android.app.Activity
    public void onResume() {
        GenericIdpActivity genericIdpActivity;
        super.onResume();
        if (!CommonConstant.ACTION.HWID_SCHEME_URL.equals(getIntent().getAction())) {
            if (this.zzd) {
                zzb();
                return;
            }
            String packageName = getPackageName();
            try {
                String lowerCase = Hex.bytesToStringUppercase(AndroidUtilsLight.getPackageCertificateHashBytes(this, packageName)).toLowerCase(Locale.US);
                FirebaseApp firebaseApp = FirebaseApp.getInstance(getIntent().getStringExtra("com.google.firebase.auth.KEY_FIREBASE_APP_NAME"));
                FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(firebaseApp);
                if (zzagl.zza(firebaseApp)) {
                    genericIdpActivity = this;
                    zza(zza(Uri.parse(zzagl.zza(firebaseApp.getOptions().getApiKey())).buildUpon(), getIntent(), packageName, lowerCase).build(), packageName, firebaseAuth.zzc());
                } else {
                    genericIdpActivity = this;
                    new zzaeq(packageName, lowerCase, getIntent(), firebaseApp, genericIdpActivity).executeOnExecutor(firebaseAuth.zze(), new Void[0]);
                }
            } catch (PackageManager.NameNotFoundException e) {
                genericIdpActivity = this;
                Log.e("GenericIdpActivity", "Could not get package signature: " + packageName + " " + String.valueOf(e));
                zzaer.zzb(this, packageName);
            }
            genericIdpActivity.zzd = true;
            return;
        }
        Intent intent = getIntent();
        if (intent.hasExtra("firebaseError")) {
            zza(zzce.zza(intent.getStringExtra("firebaseError")));
            return;
        }
        if (!intent.hasExtra("link") || !intent.hasExtra("eventId")) {
            zzb();
            return;
        }
        String stringExtra = intent.getStringExtra("link");
        String stringExtra2 = intent.getStringExtra("eventId");
        String packageName2 = getPackageName();
        boolean booleanExtra = intent.getBooleanExtra("encryptionEnabled", true);
        zzr zzrVarZza = zzo.zza().zza(this, packageName2, stringExtra2);
        if (zzrVarZza == null) {
            zzb();
        }
        if (booleanExtra) {
            stringExtra = zzq.zza(getApplicationContext(), FirebaseApp.getInstance(zzrVarZza.zza()).getPersistenceKey()).zza(stringExtra);
        }
        zzajb zzajbVar = new zzajb(zzrVarZza, stringExtra);
        String strZze = zzrVarZza.zze();
        String strZzb = zzrVarZza.zzb();
        zzajbVar.zzb(strZze);
        if (!"com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(strZzb) && !"com.google.firebase.auth.internal.NONGMSCORE_LINK".equals(strZzb) && !"com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE".equals(strZzb)) {
            OooO00o.OooO0O0("unsupported operation: ", strZzb, "GenericIdpActivity");
            zzb();
            return;
        }
        zzb = 0L;
        this.zzd = false;
        Intent intent2 = new Intent();
        SafeParcelableSerializer.serializeToIntentExtra(zzajbVar, intent2, "com.google.firebase.auth.internal.VERIFY_ASSERTION_REQUEST");
        intent2.putExtra("com.google.firebase.auth.internal.OPERATION", strZzb);
        intent2.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        if (zza(intent2)) {
            zzc.zza(this);
        } else {
            zzbl.zza(getApplicationContext(), zzajbVar, strZzb, strZze);
        }
        finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 0, insn: 0x0000: INVOKE 
      (r2v0 ?? I:android.graphics.Bitmap)
      (r3v0 ?? I:android.graphics.Bitmap$CompressFormat)
      (r0 I:int)
      (r0 I:java.io.OutputStream)
     SUPER call: android.graphics.Bitmap.compress(android.graphics.Bitmap$CompressFormat, int, java.io.OutputStream):boolean A[MD:(android.graphics.Bitmap$CompressFormat, int, java.io.OutputStream):boolean (c)], block:B:2:0x0000 */
    /* JADX WARN: Type inference failed for: r0v0, types: [int, java.io.OutputStream] */
    @Override // OooO0Oo.OooOO0O, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        ?? Compress;
        super/*android.graphics.Bitmap*/.compress(bundle, Compress, Compress);
        bundle.putBoolean("com.google.firebase.auth.internal.KEY_STARTED_SIGN_IN", this.zzd);
    }

    @Override // com.google.android.gms.internal.p624firebaseauthapi.zzaes
    public final Context zza() {
        return getApplicationContext();
    }

    private final Uri.Builder zza(Uri.Builder builder, Intent intent, String str, String str2) {
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        String stringExtra2 = intent.getStringExtra("com.google.firebase.auth.KEY_PROVIDER_ID");
        String stringExtra3 = intent.getStringExtra("com.google.firebase.auth.KEY_TENANT_ID");
        String stringExtra4 = intent.getStringExtra("com.google.firebase.auth.KEY_FIREBASE_APP_NAME");
        ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("com.google.firebase.auth.KEY_PROVIDER_SCOPES");
        String strJoin = (stringArrayListExtra == null || stringArrayListExtra.isEmpty()) ? null : TextUtils.join(",", stringArrayListExtra);
        String strZza = zza(intent.getBundleExtra("com.google.firebase.auth.KEY_PROVIDER_CUSTOM_PARAMS"));
        String string = UUID.randomUUID().toString();
        String strZza2 = zzaer.zza(this, UUID.randomUUID().toString());
        String action = intent.getAction();
        String stringExtra5 = intent.getStringExtra("com.google.firebase.auth.internal.CLIENT_VERSION");
        zzo.zza().zza(getApplicationContext(), str, string, strZza2, action, stringExtra2, stringExtra3, stringExtra4);
        String strZza3 = zzq.zza(getApplicationContext(), FirebaseApp.getInstance(stringExtra4).getPersistenceKey()).zza();
        if (TextUtils.isEmpty(strZza3)) {
            Log.e("GenericIdpActivity", "Could not generate an encryption key for Generic IDP - cancelling flow.");
            zza(zzao.zza("Failed to generate/retrieve public encryption key for Generic IDP flow."));
            return null;
        }
        if (strZza2 == null) {
            return null;
        }
        builder.appendQueryParameter("eid", ContextChain.TAG_PRODUCT).appendQueryParameter("v", "X" + stringExtra5).appendQueryParameter("authType", "signInWithRedirect").appendQueryParameter("apiKey", stringExtra).appendQueryParameter("providerId", stringExtra2).appendQueryParameter("sessionId", strZza2).appendQueryParameter("eventId", string).appendQueryParameter("apn", str).appendQueryParameter("sha1Cert", str2).appendQueryParameter("publicKey", strZza3);
        if (!TextUtils.isEmpty(strJoin)) {
            builder.appendQueryParameter("scopes", strJoin);
        }
        if (!TextUtils.isEmpty(strZza)) {
            builder.appendQueryParameter("customParameters", strZza);
        }
        if (!TextUtils.isEmpty(stringExtra3)) {
            builder.appendQueryParameter("tid", stringExtra3);
        }
        return builder;
    }

    @Override // com.google.android.gms.internal.p624firebaseauthapi.zzaes
    public final Uri.Builder zza(Intent intent, String str, String str2) {
        return zza(new Uri.Builder().scheme(AuthenticationConstants.HTTPS_PROTOCOL_STRING).appendPath("__").appendPath(ProcessUtil.AuthServiceProcess).appendPath("handler"), intent, str, str2);
    }

    public static /* synthetic */ Uri zza(Uri uri, Task task) throws Exception {
        Uri.Builder builderBuildUpon = uri.buildUpon();
        if (task.isSuccessful()) {
            AppCheckTokenResult appCheckTokenResult = (AppCheckTokenResult) task.getResult();
            if (appCheckTokenResult.getError() != null) {
                Log.w("GenericIdpActivity", "Error getting App Check token; using placeholder token instead. Error: ".concat(String.valueOf(appCheckTokenResult.getError())));
            }
            builderBuildUpon.fragment("fac=" + appCheckTokenResult.getToken());
        } else {
            OooO00o.OooO0O0("Unexpected error getting App Check token: ", task.getException().getMessage(), "GenericIdpActivity");
        }
        return builderBuildUpon.build();
    }

    @Override // com.google.android.gms.internal.p624firebaseauthapi.zzaes
    public final String zza(String str) {
        String strZza = zzagi.zza("firebear.identityToolkit");
        if (TextUtils.isEmpty(strZza)) {
            return zzagl.zzb(str);
        }
        OooO00o.OooO0O0("Found hermetic configuration for identityToolkit URL: ", strZza, "GenericIdpActivity");
        return strZza;
    }

    private static String zza(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            for (String str : bundle.keySet()) {
                String string = bundle.getString(str);
                if (!TextUtils.isEmpty(string)) {
                    jSONObject.put(str, string);
                }
            }
        } catch (JSONException unused) {
            Log.e("GenericIdpActivity", "Unexpected JSON exception when serializing developer specified custom params");
        }
        return jSONObject.toString();
    }

    @Override // com.google.android.gms.internal.p624firebaseauthapi.zzaes
    public final HttpURLConnection zza(URL url) {
        try {
            return (HttpURLConnection) com.google.android.gms.internal.p624firebaseauthapi.zza.zza().zza(url, "client-firebase-auth-api");
        } catch (IOException unused) {
            Log.e("GenericIdpActivity", "Error generating URL connection");
            return null;
        }
    }

    public static void zza(GenericIdpActivity genericIdpActivity, String str, Task task) {
        if (genericIdpActivity.getPackageManager().resolveActivity(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL), 0) == null) {
            Log.e("GenericIdpActivity", "Device cannot resolve intent for: android.intent.action.VIEW");
            zzaer.zzb(genericIdpActivity, str);
            return;
        }
        List<ResolveInfo> listQueryIntentServices = genericIdpActivity.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
        if (listQueryIntentServices != null && !listQueryIntentServices.isEmpty()) {
            Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL);
            if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
                Bundle bundle = new Bundle();
                BundleCompat.putBinder(bundle, "android.support.customtabs.extra.SESSION", null);
                intent.putExtras(bundle);
            }
            intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
            intent.putExtras(new Bundle());
            intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
            Log.i("GenericIdpActivity", "Opening IDP Sign In link in a custom chrome tab.");
            intent.setData((Uri) task.getResult());
            ContextCompat.startActivity(genericIdpActivity, intent, null);
            return;
        }
        Intent intent2 = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, (Uri) task.getResult());
        intent2.putExtra("com.android.browser.application_id", str);
        Log.i("GenericIdpActivity", "Opening IDP Sign In link in a browser window.");
        intent2.addFlags(1073741824);
        intent2.addFlags(WarningType.HINT);
        genericIdpActivity.startActivity(intent2);
    }

    private final void zza(Status status) {
        zzb = 0L;
        this.zzd = false;
        Intent intent = new Intent();
        zzce.zza(intent, status);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        if (!zza(intent)) {
            zzbl.zza(getApplicationContext(), status);
        } else {
            zzc.zza(this);
        }
        finish();
    }

    @Override // com.google.android.gms.internal.p624firebaseauthapi.zzaes
    public final void zza(String str, Status status) {
        if (status == null) {
            zzb();
        } else {
            zza(status);
        }
    }

    @Override // com.google.android.gms.internal.p624firebaseauthapi.zzaes
    public final void zza(final Uri uri, final String str, Provider<InteropAppCheckTokenProvider> provider) {
        Task taskForResult;
        InteropAppCheckTokenProvider interopAppCheckTokenProvider = provider.get();
        if (interopAppCheckTokenProvider != null) {
            taskForResult = interopAppCheckTokenProvider.getToken(false).continueWith(new Continuation() { // from class: com.google.firebase.auth.internal.zzbf
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    return GenericIdpActivity.zza(uri, task);
                }
            });
        } else {
            taskForResult = Tasks.forResult(uri);
        }
        taskForResult.addOnCompleteListener(new OnCompleteListener() { // from class: com.google.firebase.auth.internal.zzbg
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                GenericIdpActivity.zza(this.zza, str, task);
            }
        });
    }

    private final boolean zza(Intent intent) {
        return C35203OooO00o.OooO00o(this).OooO0OO(intent);
    }
}
