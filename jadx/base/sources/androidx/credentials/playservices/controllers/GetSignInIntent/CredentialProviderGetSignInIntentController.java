package androidx.credentials.playservices.controllers.GetSignInIntent;

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
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import androidx.credentials.playservices.controllers.GetSignInIntent.CredentialProviderGetSignInIntentController;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
import com.google.android.gms.auth.api.identity.Identity;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.common.api.ApiException;
import com.google.android.libraries.identity.googleid.GetSignInWithGoogleOption;
import com.google.android.libraries.identity.googleid.GoogleIdTokenCredential;
import com.google.firebase.messaging.Constants;
import com.microsoft.identity.common.java.constants.FidoConstants;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.C24034Oooo00O;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import o0000OO.C24162OooOO0o;
import o0000OO.OooO;
import o0000OO.OooOO0O;
import o0000OO0.AbstractC24169OooOOOo;
import o0000OO0.C24183Oooo;
import o0000OO0.C24192Oooo0oo;
import o0000OO0.OooOOO;
import oO00ooO.C32460OooOooO;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u0000]\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\b\u0005*\u00015\b\u0000\u0018\u0000 82 \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0001:\u00018B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ=\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\u00022\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ)\u0010$\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\b\u0010!\u001a\u0004\u0018\u00010 H\u0000¢\u0006\u0004\b\"\u0010#R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010%R4\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\f8\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0004\b\r\u0010&\u0012\u0004\b+\u0010,\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R(\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0004\b\u000f\u0010-\u0012\u0004\b2\u0010,\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\u0011\u00103\u0012\u0004\b4\u0010,R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107¨\u00069"}, m80612d2 = {"Landroidx/credentials/playservices/controllers/GetSignInIntent/CredentialProviderGetSignInIntentController;", "Landroidx/credentials/playservices/controllers/CredentialProviderController;", "Lo0000OO0/Oooo0oo;", "Lcom/google/android/gms/auth/api/identity/GetSignInIntentRequest;", "Lcom/google/android/gms/auth/api/identity/SignInCredential;", "Lo0000OO0/Oooo;", "Lo0000OO/OooOO0O;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "request", "Lo0000OO0/OooOOO;", "callback", "Ljava/util/concurrent/Executor;", "executor", "Landroid/os/CancellationSignal;", "cancellationSignal", "LoO00ooO/OooOooO;", "invokePlayServices", "(Lo0000OO0/Oooo0oo;Lo0000OO0/OooOOO;Ljava/util/concurrent/Executor;Landroid/os/CancellationSignal;)V", "convertRequestToPlayServices", "(Lo0000OO0/Oooo0oo;)Lcom/google/android/gms/auth/api/identity/GetSignInIntentRequest;", FidoConstants.WEBAUTHN_AUTHENTICATION_ASSERTION_RESPONSE_JSON_KEY, "convertResponseToCredentialManager", "(Lcom/google/android/gms/auth/api/identity/SignInCredential;)Lo0000OO0/Oooo;", "Lcom/google/android/libraries/identity/googleid/GoogleIdTokenCredential;", "createGoogleIdCredential", "(Lcom/google/android/gms/auth/api/identity/SignInCredential;)Lcom/google/android/libraries/identity/googleid/GoogleIdTokenCredential;", "", "uniqueRequestCode", "resultCode", "Landroid/content/Intent;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "handleResponse$credentials_play_services_auth_release", "(IILandroid/content/Intent;)V", "handleResponse", "Landroid/content/Context;", "Lo0000OO0/OooOOO;", "getCallback", "()Lo0000OO0/OooOOO;", "setCallback", "(Lo0000OO0/OooOOO;)V", "getCallback$annotations", "()V", "Ljava/util/concurrent/Executor;", "getExecutor", "()Ljava/util/concurrent/Executor;", "setExecutor", "(Ljava/util/concurrent/Executor;)V", "getExecutor$annotations", "Landroid/os/CancellationSignal;", "getCancellationSignal$annotations", "androidx/credentials/playservices/controllers/GetSignInIntent/CredentialProviderGetSignInIntentController$resultReceiver$1", "resultReceiver", "Landroidx/credentials/playservices/controllers/GetSignInIntent/CredentialProviderGetSignInIntentController$resultReceiver$1;", "Companion", "credentials-play-services-auth_release"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class CredentialProviderGetSignInIntentController extends CredentialProviderController<C24192Oooo0oo, GetSignInIntentRequest, SignInCredential, C24183Oooo, OooOO0O> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = "GetSignInIntent";
    public OooOOO<C24183Oooo, OooOO0O> callback;
    private CancellationSignal cancellationSignal;
    private final Context context;
    public Executor executor;
    private final CredentialProviderGetSignInIntentController$resultReceiver$1 resultReceiver;

    @Metadata(m80611d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m80612d2 = {"Landroidx/credentials/playservices/controllers/GetSignInIntent/CredentialProviderGetSignInIntentController$Companion;", "", "()V", "TAG", "", "getInstance", "Landroidx/credentials/playservices/controllers/GetSignInIntent/CredentialProviderGetSignInIntentController;", "context", "Landroid/content/Context;", "credentials-play-services-auth_release"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
            this();
        }

        public final CredentialProviderGetSignInIntentController getInstance(Context context) {
            OooOOO0.OooO0oO(context, "context");
            return new CredentialProviderGetSignInIntentController(context);
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: androidx.credentials.playservices.controllers.GetSignInIntent.CredentialProviderGetSignInIntentController$invokePlayServices$1 */
    @Metadata(m80611d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m80612d2 = {"LoO00ooO/OooOooO;", "invoke", "()V", "<anonymous>"}, m80613k = 3, m80614mv = {1, 8, 0})
    public static final class C01101 extends OooOOOO implements oO0O000o.OooO00o<C32460OooOooO> {

        /* JADX INFO: renamed from: $e */
        final /* synthetic */ Exception f26$e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01101(Exception exc) {
            super(0);
            this.f26$e = exc;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public static final void invoke$lambda$0(CredentialProviderGetSignInIntentController this$0, Exception e) {
            OooOOO0.OooO0oO(this$0, "this$0");
            OooOOO0.OooO0oO(e, "$e");
            this$0.getCallback().onError(e);
        }

        @Override // oO0O000o.OooO00o
        public /* bridge */ /* synthetic */ C32460OooOooO invoke() {
            invoke2();
            return C32460OooOooO.f116667OooO00o;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Executor executor = CredentialProviderGetSignInIntentController.this.getExecutor();
            final CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController = CredentialProviderGetSignInIntentController.this;
            final Exception exc = this.f26$e;
            executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.GetSignInIntent.OooO0o
                @Override // java.lang.Runnable
                public final void run() {
                    CredentialProviderGetSignInIntentController.C01101.invoke$lambda$0(credentialProviderGetSignInIntentController, exc);
                }
            });
        }
    }

    /* JADX INFO: renamed from: androidx.credentials.playservices.controllers.GetSignInIntent.CredentialProviderGetSignInIntentController$invokePlayServices$2 */
    @Metadata(m80611d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m80612d2 = {"LoO00ooO/OooOooO;", "invoke", "()V", "<anonymous>"}, m80613k = 3, m80614mv = {1, 8, 0})
    public static final class C01112 extends OooOOOO implements oO0O000o.OooO00o<C32460OooOooO> {
        public C01112() {
            super(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$0(CredentialProviderGetSignInIntentController this$0) {
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
            Executor executor = CredentialProviderGetSignInIntentController.this.getExecutor();
            final CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController = CredentialProviderGetSignInIntentController.this;
            executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.GetSignInIntent.OooO0oO
                @Override // java.lang.Runnable
                public final void run() {
                    CredentialProviderGetSignInIntentController.C01112.invoke$lambda$0(credentialProviderGetSignInIntentController);
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.credentials.playservices.controllers.GetSignInIntent.CredentialProviderGetSignInIntentController$resultReceiver$1] */
    public CredentialProviderGetSignInIntentController(Context context) {
        super(context);
        OooOOO0.OooO0oO(context, "context");
        this.context = context;
        final Handler handler = new Handler(Looper.getMainLooper());
        this.resultReceiver = new ResultReceiver(handler) { // from class: androidx.credentials.playservices.controllers.GetSignInIntent.CredentialProviderGetSignInIntentController$resultReceiver$1
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int resultCode, Bundle resultData) {
                OooOOO0.OooO0oO(resultData, "resultData");
                if (this.this$0.maybeReportErrorFromResultReceiver(resultData, new C0112xf12f72ff(CredentialProviderBaseController.INSTANCE), this.this$0.getExecutor(), this.this$0.getCallback(), this.this$0.cancellationSignal)) {
                    return;
                }
                this.this$0.handleResponse$credentials_play_services_auth_release(resultData.getInt(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG), resultCode, (Intent) resultData.getParcelable(CredentialProviderBaseController.RESULT_DATA_TAG));
            }
        };
    }

    public static /* synthetic */ void getCallback$annotations() {
    }

    private static /* synthetic */ void getCancellationSignal$annotations() {
    }

    public static /* synthetic */ void getExecutor$annotations() {
    }

    public static final CredentialProviderGetSignInIntentController getInstance(Context context) {
        return INSTANCE.getInstance(context);
    }

    public final GoogleIdTokenCredential createGoogleIdCredential(SignInCredential response) throws o0000OO.OooOOO {
        OooOOO0.OooO0oO(response, "response");
        GoogleIdTokenCredential.Builder builder = new GoogleIdTokenCredential.Builder();
        String id = response.getId();
        OooOOO0.OooO0o(id, "response.id");
        GoogleIdTokenCredential.Builder id2 = builder.setId(id);
        try {
            String googleIdToken = response.getGoogleIdToken();
            OooOOO0.OooO0Oo(googleIdToken);
            id2.setIdToken(googleIdToken);
            if (response.getDisplayName() != null) {
                id2.setDisplayName(response.getDisplayName());
            }
            if (response.getGivenName() != null) {
                id2.setGivenName(response.getGivenName());
            }
            if (response.getFamilyName() != null) {
                id2.setFamilyName(response.getFamilyName());
            }
            if (response.getPhoneNumber() != null) {
                id2.setPhoneNumber(response.getPhoneNumber());
            }
            if (response.getProfilePictureUri() != null) {
                id2.setProfilePictureUri(response.getProfilePictureUri());
            }
            return id2.build();
        } catch (Exception unused) {
            throw new o0000OO.OooOOO("When attempting to convert get response, null Google ID Token found");
        }
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
        if (CredentialProviderController.maybeReportErrorResultCodeGet(resultCode, CredentialProviderGetSignInIntentController$handleResponse$1.INSTANCE, new CredentialProviderGetSignInIntentController$handleResponse$2(this), this.cancellationSignal)) {
            return;
        }
        try {
            SignInCredential signInCredentialFromIntent = Identity.getSignInClient(this.context).getSignInCredentialFromIntent(data);
            OooOOO0.OooO0o(signInCredentialFromIntent, "getSignInClient(context)…redentialFromIntent(data)");
            CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new CredentialProviderGetSignInIntentController$handleResponse$3(this, convertResponseToCredentialManager(signInCredentialFromIntent)));
        } catch (ApiException e) {
            C24034Oooo00O c24034Oooo00O = new C24034Oooo00O();
            c24034Oooo00O.f80942OooOo0o = new o0000OO.OooOOO(e.getMessage());
            if (e.getStatusCode() == 16) {
                c24034Oooo00O.f80942OooOo0o = new OooO(e.getMessage());
            } else if (CredentialProviderBaseController.INSTANCE.getRetryables().contains(Integer.valueOf(e.getStatusCode()))) {
                c24034Oooo00O.f80942OooOo0o = new C24162OooOO0o(e.getMessage());
            }
            CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new CredentialProviderGetSignInIntentController$handleResponse$4(this, c24034Oooo00O));
        } catch (OooOO0O e2) {
            CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new CredentialProviderGetSignInIntentController$handleResponse$5(this, e2));
        } catch (Throwable th) {
            CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new CredentialProviderGetSignInIntentController$handleResponse$6(this, new o0000OO.OooOOO(th.getMessage())));
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
    public GetSignInIntentRequest convertRequestToPlayServices(C24192Oooo0oo request) throws o0000OO.OooOOOO {
        OooOOO0.OooO0oO(request, "request");
        List<AbstractC24169OooOOOo> list = request.f81445OooO00o;
        if (list.size() != 1) {
            throw new o0000OO.OooOOOO("GetSignInWithGoogleOption cannot be combined with other options.");
        }
        AbstractC24169OooOOOo abstractC24169OooOOOo = list.get(0);
        OooOOO0.OooO0o0(abstractC24169OooOOOo, "null cannot be cast to non-null type com.google.android.libraries.identity.googleid.GetSignInWithGoogleOption");
        GetSignInWithGoogleOption getSignInWithGoogleOption = (GetSignInWithGoogleOption) abstractC24169OooOOOo;
        GetSignInIntentRequest getSignInIntentRequestBuild = GetSignInIntentRequest.builder().setServerClientId(getSignInWithGoogleOption.getZza()).filterByHostedDomain(getSignInWithGoogleOption.getZzb()).setNonce(getSignInWithGoogleOption.getZzc()).build();
        OooOOO0.OooO0o(getSignInIntentRequestBuild, "builder()\n            .s…nce)\n            .build()");
        return getSignInIntentRequestBuild;
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public C24183Oooo convertResponseToCredentialManager(SignInCredential response) throws o0000OO.OooOOO {
        GoogleIdTokenCredential googleIdTokenCredentialCreateGoogleIdCredential;
        OooOOO0.OooO0oO(response, "response");
        if (response.getGoogleIdToken() != null) {
            googleIdTokenCredentialCreateGoogleIdCredential = createGoogleIdCredential(response);
        } else {
            Log.w(TAG, "Credential returned but no google Id found");
            googleIdTokenCredentialCreateGoogleIdCredential = null;
        }
        if (googleIdTokenCredentialCreateGoogleIdCredential != null) {
            return new C24183Oooo(googleIdTokenCredentialCreateGoogleIdCredential);
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
        try {
            GetSignInIntentRequest getSignInIntentRequestConvertRequestToPlayServices = convertRequestToPlayServices(request);
            Intent intent = new Intent(this.context, (Class<?>) HiddenActivity.class);
            intent.putExtra(CredentialProviderBaseController.REQUEST_TAG, getSignInIntentRequestConvertRequestToPlayServices);
            generateHiddenActivityIntent(this.resultReceiver, intent, CredentialProviderBaseController.SIGN_IN_INTENT_TAG);
            this.context.startActivity(intent);
        } catch (Exception e) {
            if (e instanceof o0000OO.OooOOOO) {
                CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal, new C01101(e));
            } else {
                CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal, new C01112());
            }
        }
    }
}
