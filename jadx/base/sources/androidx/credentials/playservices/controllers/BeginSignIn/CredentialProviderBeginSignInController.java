package androidx.credentials.playservices.controllers.BeginSignIn;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.HiddenActivity;
import androidx.credentials.playservices.controllers.BeginSignIn.CredentialProviderBeginSignInController;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.Identity;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.common.api.ApiException;
import com.google.android.libraries.identity.googleid.GoogleIdTokenCredential;
import com.google.firebase.messaging.Constants;
import com.microsoft.identity.common.java.constants.FidoConstants;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.C24034Oooo00O;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import o0000OO.C24162OooOO0o;
import o0000OO.OooO;
import o0000OO.OooOO0O;
import o0000OO0.AbstractC24167OooO0oo;
import o0000OO0.C24183Oooo;
import o0000OO0.C24192Oooo0oo;
import o0000OO0.C24193OoooO;
import o0000OO0.OooOOO;
import o0000OO0.o000oOoO;
import oO00ooO.C32460OooOooO;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u0000]\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\b\u0005*\u00015\b\u0000\u0018\u0000 82 \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0001:\u00018B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ=\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u00022\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00102\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010 \u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0002H\u0017¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0004H\u0017¢\u0006\u0004\b#\u0010$R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010%R4\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00108\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0004\b\u0011\u0010&\u0012\u0004\b+\u0010,\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R(\u0010\u0013\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0004\b\u0013\u0010-\u0012\u0004\b2\u0010,\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\u0015\u00103\u0012\u0004\b4\u0010,R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107¨\u00069"}, m80612d2 = {"Landroidx/credentials/playservices/controllers/BeginSignIn/CredentialProviderBeginSignInController;", "Landroidx/credentials/playservices/controllers/CredentialProviderController;", "Lo0000OO0/Oooo0oo;", "Lcom/google/android/gms/auth/api/identity/BeginSignInRequest;", "Lcom/google/android/gms/auth/api/identity/SignInCredential;", "Lo0000OO0/Oooo;", "Lo0000OO/OooOO0O;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", FidoConstants.WEBAUTHN_AUTHENTICATION_ASSERTION_RESPONSE_JSON_KEY, "Lcom/google/android/libraries/identity/googleid/GoogleIdTokenCredential;", "createGoogleIdCredential", "(Lcom/google/android/gms/auth/api/identity/SignInCredential;)Lcom/google/android/libraries/identity/googleid/GoogleIdTokenCredential;", "request", "Lo0000OO0/OooOOO;", "callback", "Ljava/util/concurrent/Executor;", "executor", "Landroid/os/CancellationSignal;", "cancellationSignal", "LoO00ooO/OooOooO;", "invokePlayServices", "(Lo0000OO0/Oooo0oo;Lo0000OO0/OooOOO;Ljava/util/concurrent/Executor;Landroid/os/CancellationSignal;)V", "", "uniqueRequestCode", "resultCode", "Landroid/content/Intent;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "handleResponse$credentials_play_services_auth_release", "(IILandroid/content/Intent;)V", "handleResponse", "convertRequestToPlayServices", "(Lo0000OO0/Oooo0oo;)Lcom/google/android/gms/auth/api/identity/BeginSignInRequest;", "convertResponseToCredentialManager", "(Lcom/google/android/gms/auth/api/identity/SignInCredential;)Lo0000OO0/Oooo;", "Landroid/content/Context;", "Lo0000OO0/OooOOO;", "getCallback", "()Lo0000OO0/OooOOO;", "setCallback", "(Lo0000OO0/OooOOO;)V", "getCallback$annotations", "()V", "Ljava/util/concurrent/Executor;", "getExecutor", "()Ljava/util/concurrent/Executor;", "setExecutor", "(Ljava/util/concurrent/Executor;)V", "getExecutor$annotations", "Landroid/os/CancellationSignal;", "getCancellationSignal$annotations", "androidx/credentials/playservices/controllers/BeginSignIn/CredentialProviderBeginSignInController$resultReceiver$1", "resultReceiver", "Landroidx/credentials/playservices/controllers/BeginSignIn/CredentialProviderBeginSignInController$resultReceiver$1;", "Companion", "credentials-play-services-auth_release"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class CredentialProviderBeginSignInController extends CredentialProviderController<C24192Oooo0oo, BeginSignInRequest, SignInCredential, C24183Oooo, OooOO0O> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = "BeginSignIn";
    public OooOOO<C24183Oooo, OooOO0O> callback;
    private CancellationSignal cancellationSignal;
    private final Context context;
    public Executor executor;
    private final CredentialProviderBeginSignInController$resultReceiver$1 resultReceiver;

    @Metadata(m80611d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m80612d2 = {"Landroidx/credentials/playservices/controllers/BeginSignIn/CredentialProviderBeginSignInController$Companion;", "", "()V", "TAG", "", "getInstance", "Landroidx/credentials/playservices/controllers/BeginSignIn/CredentialProviderBeginSignInController;", "context", "Landroid/content/Context;", "credentials-play-services-auth_release"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
            this();
        }

        public final CredentialProviderBeginSignInController getInstance(Context context) {
            OooOOO0.OooO0oO(context, "context");
            return new CredentialProviderBeginSignInController(context);
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: androidx.credentials.playservices.controllers.BeginSignIn.CredentialProviderBeginSignInController$invokePlayServices$1 */
    @Metadata(m80611d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m80612d2 = {"LoO00ooO/OooOooO;", "invoke", "()V", "<anonymous>"}, m80613k = 3, m80614mv = {1, 8, 0})
    public static final class C00921 extends OooOOOO implements oO0O000o.OooO00o<C32460OooOooO> {
        public C00921() {
            super(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$0(CredentialProviderBeginSignInController this$0) {
            OooOOO0.OooO0oO(this$0, "this$0");
            this$0.getCallback().onError(new o0000OO.OooOOO(CredentialProviderController.ERROR_MESSAGE_START_ACTIVITY_FAILED));
        }

        @Override // oO0O000o.OooO00o
        public /* bridge */ /* synthetic */ C32460OooOooO invoke() {
            invoke2();
            return C32460OooOooO.f116667OooO00o;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Executor executor = CredentialProviderBeginSignInController.this.getExecutor();
            final CredentialProviderBeginSignInController credentialProviderBeginSignInController = CredentialProviderBeginSignInController.this;
            executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.BeginSignIn.OooO0o
                @Override // java.lang.Runnable
                public final void run() {
                    CredentialProviderBeginSignInController.C00921.invoke$lambda$0(credentialProviderBeginSignInController);
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.credentials.playservices.controllers.BeginSignIn.CredentialProviderBeginSignInController$resultReceiver$1] */
    public CredentialProviderBeginSignInController(Context context) {
        super(context);
        OooOOO0.OooO0oO(context, "context");
        this.context = context;
        final Handler handler = new Handler(Looper.getMainLooper());
        this.resultReceiver = new ResultReceiver(handler) { // from class: androidx.credentials.playservices.controllers.BeginSignIn.CredentialProviderBeginSignInController$resultReceiver$1
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int resultCode, Bundle resultData) {
                OooOOO0.OooO0oO(resultData, "resultData");
                if (this.this$0.maybeReportErrorFromResultReceiver(resultData, new C0093x4b514208(CredentialProviderBaseController.INSTANCE), this.this$0.getExecutor(), this.this$0.getCallback(), this.this$0.cancellationSignal)) {
                    return;
                }
                this.this$0.handleResponse$credentials_play_services_auth_release(resultData.getInt(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG), resultCode, (Intent) resultData.getParcelable(CredentialProviderBaseController.RESULT_DATA_TAG));
            }
        };
    }

    private final GoogleIdTokenCredential createGoogleIdCredential(SignInCredential response) {
        GoogleIdTokenCredential.Builder builder = new GoogleIdTokenCredential.Builder();
        String id = response.getId();
        OooOOO0.OooO0o(id, "response.id");
        GoogleIdTokenCredential.Builder id2 = builder.setId(id);
        String googleIdToken = response.getGoogleIdToken();
        OooOOO0.OooO0Oo(googleIdToken);
        GoogleIdTokenCredential.Builder idToken = id2.setIdToken(googleIdToken);
        if (response.getDisplayName() != null) {
            idToken.setDisplayName(response.getDisplayName());
        }
        if (response.getGivenName() != null) {
            idToken.setGivenName(response.getGivenName());
        }
        if (response.getFamilyName() != null) {
            idToken.setFamilyName(response.getFamilyName());
        }
        if (response.getPhoneNumber() != null) {
            idToken.setPhoneNumber(response.getPhoneNumber());
        }
        if (response.getProfilePictureUri() != null) {
            idToken.setProfilePictureUri(response.getProfilePictureUri());
        }
        return idToken.build();
    }

    public static /* synthetic */ void getCallback$annotations() {
    }

    private static /* synthetic */ void getCancellationSignal$annotations() {
    }

    public static /* synthetic */ void getExecutor$annotations() {
    }

    public static final CredentialProviderBeginSignInController getInstance(Context context) {
        return INSTANCE.getInstance(context);
    }

    public final OooOOO<C24183Oooo, OooOO0O> getCallback() {
        OooOOO<C24183Oooo, OooOO0O> oooOOO = this.callback;
        if (oooOOO != null) {
            return oooOOO;
        }
        OooOOO0.OooOOOO("callback");
        throw null;
    }

    public final Executor getExecutor() {
        Executor executor = this.executor;
        if (executor != null) {
            return executor;
        }
        OooOOO0.OooOOOO("executor");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r5v10, types: [T, o0000OO.OooO] */
    /* JADX WARN: Type inference failed for: r5v3, types: [T, o0000OO.OooOOO] */
    /* JADX WARN: Type inference failed for: r5v8, types: [T, o0000OO.OooOO0o] */
    public final void handleResponse$credentials_play_services_auth_release(int uniqueRequestCode, int resultCode, Intent data) {
        if (uniqueRequestCode != CredentialProviderBaseController.getCONTROLLER_REQUEST_CODE()) {
            Log.w(TAG, "Returned request code " + CredentialProviderBaseController.getCONTROLLER_REQUEST_CODE() + " which  does not match what was given " + uniqueRequestCode);
            return;
        }
        if (CredentialProviderController.maybeReportErrorResultCodeGet(resultCode, CredentialProviderBeginSignInController$handleResponse$1.INSTANCE, new CredentialProviderBeginSignInController$handleResponse$2(this), this.cancellationSignal)) {
            return;
        }
        try {
            SignInCredential signInCredentialFromIntent = Identity.getSignInClient(this.context).getSignInCredentialFromIntent(data);
            OooOOO0.OooO0o(signInCredentialFromIntent, "getSignInClient(context)…redentialFromIntent(data)");
            CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new CredentialProviderBeginSignInController$handleResponse$3(this, convertResponseToCredentialManager(signInCredentialFromIntent)));
        } catch (ApiException e) {
            C24034Oooo00O c24034Oooo00O = new C24034Oooo00O();
            c24034Oooo00O.f80942OooOo0o = new o0000OO.OooOOO(e.getMessage());
            if (e.getStatusCode() == 16) {
                c24034Oooo00O.f80942OooOo0o = new OooO(e.getMessage());
            } else if (CredentialProviderBaseController.INSTANCE.getRetryables().contains(Integer.valueOf(e.getStatusCode()))) {
                c24034Oooo00O.f80942OooOo0o = new C24162OooOO0o(e.getMessage());
            }
            CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new CredentialProviderBeginSignInController$handleResponse$4(this, c24034Oooo00O));
        } catch (OooOO0O e2) {
            CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new CredentialProviderBeginSignInController$handleResponse$5(this, e2));
        } catch (Throwable th) {
            CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new CredentialProviderBeginSignInController$handleResponse$6(this, new o0000OO.OooOOO(th.getMessage())));
        }
    }

    public final void setCallback(OooOOO<C24183Oooo, OooOO0O> oooOOO) {
        OooOOO0.OooO0oO(oooOOO, "<set-?>");
        this.callback = oooOOO;
    }

    public final void setExecutor(Executor executor) {
        OooOOO0.OooO0oO(executor, "<set-?>");
        this.executor = executor;
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public BeginSignInRequest convertRequestToPlayServices(C24192Oooo0oo request) {
        OooOOO0.OooO0oO(request, "request");
        return BeginSignInControllerUtility.INSTANCE.m17x545fe152(request, this.context);
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public C24183Oooo convertResponseToCredentialManager(SignInCredential response) throws OooOO0O {
        AbstractC24167OooO0oo o000oooo2;
        OooOOO0.OooO0oO(response, "response");
        if (response.getPassword() != null) {
            String id = response.getId();
            OooOOO0.OooO0o(id, "response.id");
            String password = response.getPassword();
            OooOOO0.OooO0Oo(password);
            Bundle bundle = new Bundle();
            bundle.putString("androidx.credentials.BUNDLE_KEY_ID", id);
            bundle.putString("androidx.credentials.BUNDLE_KEY_PASSWORD", password);
            o000oooo2 = new C24193OoooO(password, bundle);
        } else if (response.getGoogleIdToken() != null) {
            o000oooo2 = createGoogleIdCredential(response);
        } else if (response.getPublicKeyCredential() != null) {
            String authenticationResponseJson = PublicKeyCredentialControllerUtility.INSTANCE.toAssertPasskeyResponse(response);
            OooOOO0.OooO0oO(authenticationResponseJson, "authenticationResponseJson");
            Bundle bundle2 = new Bundle();
            bundle2.putString("androidx.credentials.BUNDLE_KEY_AUTHENTICATION_RESPONSE_JSON", authenticationResponseJson);
            o000oooo2 = new o000oOoO(authenticationResponseJson, bundle2);
        } else {
            Log.w(TAG, "Credential returned but no google Id or password or passkey found");
            o000oooo2 = null;
        }
        if (o000oooo2 != null) {
            return new C24183Oooo(o000oooo2);
        }
        throw new o0000OO.OooOOO("When attempting to convert get response, null credential found");
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public void invokePlayServices(C24192Oooo0oo request, OooOOO<C24183Oooo, OooOO0O> callback, Executor executor, CancellationSignal cancellationSignal) {
        OooOOO0.OooO0oO(request, "request");
        OooOOO0.OooO0oO(callback, "callback");
        OooOOO0.OooO0oO(executor, "executor");
        this.cancellationSignal = cancellationSignal;
        setCallback(callback);
        setExecutor(executor);
        if (CredentialProviderPlayServicesImpl.INSTANCE.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return;
        }
        BeginSignInRequest beginSignInRequestConvertRequestToPlayServices = convertRequestToPlayServices(request);
        Intent intent = new Intent(this.context, (Class<?>) HiddenActivity.class);
        intent.putExtra(CredentialProviderBaseController.REQUEST_TAG, beginSignInRequestConvertRequestToPlayServices);
        generateHiddenActivityIntent(this.resultReceiver, intent, CredentialProviderBaseController.BEGIN_SIGN_IN_TAG);
        try {
            this.context.startActivity(intent);
        } catch (Exception unused) {
            CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal, new C00921());
        }
    }
}
