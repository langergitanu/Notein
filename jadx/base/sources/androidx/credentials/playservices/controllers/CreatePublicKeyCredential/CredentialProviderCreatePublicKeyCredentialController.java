package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

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
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import com.google.android.gms.fido.Fido;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.firebase.messaging.Constants;
import com.microsoft.identity.common.java.constants.FidoConstants;
import com.microsoft.identity.common.java.providers.microsoft.MicrosoftAuthorizationErrorResponse;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import o0000OO.C24161OooO0oo;
import o0000OO0.C24166OooO0oO;
import o0000OO0.OooOOO;
import o0000OOO.C24214OooOoo0;
import o0000OOo.C24216OooO00o;
import oO00ooO.C32460OooOooO;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u0000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\b\u0005*\u0001/\b\u0000\u0018\u0000 22 \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0001:\u00012B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ=\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u00022\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00112\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J)\u0010!\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0000¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u0004H\u0017¢\u0006\u0004\b%\u0010&R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010'R(\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00118\u0002@\u0002X\u0083.¢\u0006\f\n\u0004\b\u0012\u0010(\u0012\u0004\b)\u0010*R\u001c\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0083.¢\u0006\f\n\u0004\b\u0014\u0010+\u0012\u0004\b,\u0010*R\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\u0016\u0010-\u0012\u0004\b.\u0010*R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101¨\u00063"}, m80612d2 = {"Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController;", "Landroidx/credentials/playservices/controllers/CredentialProviderController;", "Lo0000OO0/OooO0o;", "Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialCreationOptions;", "Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredential;", "Lo0000OO0/OooO0OO;", "Lo0000OO/OooO0o;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lorg/json/JSONException;", "exception", "Lo0000OOo/OooO00o;", "JSONExceptionToPKCError", "(Lorg/json/JSONException;)Lo0000OOo/OooO00o;", "request", "Lo0000OO0/OooOOO;", "callback", "Ljava/util/concurrent/Executor;", "executor", "Landroid/os/CancellationSignal;", "cancellationSignal", "LoO00ooO/OooOooO;", "invokePlayServices", "(Lo0000OO0/OooO0o;Lo0000OO0/OooOOO;Ljava/util/concurrent/Executor;Landroid/os/CancellationSignal;)V", "", "uniqueRequestCode", "resultCode", "Landroid/content/Intent;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "handleResponse$credentials_play_services_auth_release", "(IILandroid/content/Intent;)V", "handleResponse", "convertRequestToPlayServices", "(Lo0000OO0/OooO0o;)Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialCreationOptions;", FidoConstants.WEBAUTHN_AUTHENTICATION_ASSERTION_RESPONSE_JSON_KEY, "convertResponseToCredentialManager", "(Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredential;)Lo0000OO0/OooO0OO;", "Landroid/content/Context;", "Lo0000OO0/OooOOO;", "getCallback$annotations", "()V", "Ljava/util/concurrent/Executor;", "getExecutor$annotations", "Landroid/os/CancellationSignal;", "getCancellationSignal$annotations", "androidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1", "resultReceiver", "Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1;", "Companion", "credentials-play-services-auth_release"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class CredentialProviderCreatePublicKeyCredentialController extends CredentialProviderController<o0000OO0.OooO0o, PublicKeyCredentialCreationOptions, PublicKeyCredential, o0000OO0.OooO0OO, o0000OO.OooO0o> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = "CreatePublicKey";
    private OooOOO<o0000OO0.OooO0OO, o0000OO.OooO0o> callback;
    private CancellationSignal cancellationSignal;
    private final Context context;
    private Executor executor;
    private final ResultReceiverC0105x1c337a18 resultReceiver;

    @Metadata(m80611d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m80612d2 = {"Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController$Companion;", "", "()V", "TAG", "", "getInstance", "Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController;", "context", "Landroid/content/Context;", "credentials-play-services-auth_release"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
            this();
        }

        public final CredentialProviderCreatePublicKeyCredentialController getInstance(Context context) {
            OooOOO0.OooO0oO(context, "context");
            return new CredentialProviderCreatePublicKeyCredentialController(context);
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController$invokePlayServices$1 */
    @Metadata(m80611d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m80612d2 = {"LoO00ooO/OooOooO;", "invoke", "()V", "<anonymous>"}, m80613k = 3, m80614mv = {1, 8, 0})
    public static final class C01021 extends OooOOOO implements oO0O000o.OooO00o<C32460OooOooO> {

        /* JADX INFO: renamed from: $e */
        final /* synthetic */ JSONException f22$e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01021(JSONException jSONException) {
            super(0);
            this.f22$e = jSONException;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$0(CredentialProviderCreatePublicKeyCredentialController this$0, JSONException e) {
            OooOOO0.OooO0oO(this$0, "this$0");
            OooOOO0.OooO0oO(e, "$e");
            OooOOO oooOOO = this$0.callback;
            if (oooOOO != null) {
                oooOOO.onError(this$0.JSONExceptionToPKCError(e));
            } else {
                OooOOO0.OooOOOO("callback");
                throw null;
            }
        }

        @Override // oO0O000o.OooO00o
        public /* bridge */ /* synthetic */ C32460OooOooO invoke() {
            invoke2();
            return C32460OooOooO.f116667OooO00o;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Executor executor = CredentialProviderCreatePublicKeyCredentialController.this.executor;
            if (executor == null) {
                OooOOO0.OooOOOO("executor");
                throw null;
            }
            final CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController = CredentialProviderCreatePublicKeyCredentialController.this;
            final JSONException jSONException = this.f22$e;
            executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.CreatePublicKeyCredential.OooO0oO
                @Override // java.lang.Runnable
                public final void run() {
                    CredentialProviderCreatePublicKeyCredentialController.C01021.invoke$lambda$0(credentialProviderCreatePublicKeyCredentialController, jSONException);
                }
            });
        }
    }

    /* JADX INFO: renamed from: androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController$invokePlayServices$2 */
    @Metadata(m80611d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m80612d2 = {"LoO00ooO/OooOooO;", "invoke", "()V", "<anonymous>"}, m80613k = 3, m80614mv = {1, 8, 0})
    public static final class C01032 extends OooOOOO implements oO0O000o.OooO00o<C32460OooOooO> {

        /* JADX INFO: renamed from: $t */
        final /* synthetic */ Throwable f23$t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01032(Throwable th) {
            super(0);
            this.f23$t = th;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$0(CredentialProviderCreatePublicKeyCredentialController this$0, Throwable t) {
            OooOOO0.OooO0oO(this$0, "this$0");
            OooOOO0.OooO0oO(t, "$t");
            OooOOO oooOOO = this$0.callback;
            if (oooOOO != null) {
                oooOOO.onError(new C24161OooO0oo(t.getMessage()));
            } else {
                OooOOO0.OooOOOO("callback");
                throw null;
            }
        }

        @Override // oO0O000o.OooO00o
        public /* bridge */ /* synthetic */ C32460OooOooO invoke() {
            invoke2();
            return C32460OooOooO.f116667OooO00o;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Executor executor = CredentialProviderCreatePublicKeyCredentialController.this.executor;
            if (executor == null) {
                OooOOO0.OooOOOO("executor");
                throw null;
            }
            final CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController = CredentialProviderCreatePublicKeyCredentialController.this;
            final Throwable th = this.f23$t;
            executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.CreatePublicKeyCredential.OooO0oo
                @Override // java.lang.Runnable
                public final void run() {
                    CredentialProviderCreatePublicKeyCredentialController.C01032.invoke$lambda$0(credentialProviderCreatePublicKeyCredentialController, th);
                }
            });
        }
    }

    /* JADX INFO: renamed from: androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController$invokePlayServices$3 */
    @Metadata(m80611d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m80612d2 = {"LoO00ooO/OooOooO;", "invoke", "()V", "<anonymous>"}, m80613k = 3, m80614mv = {1, 8, 0})
    public static final class C01043 extends OooOOOO implements oO0O000o.OooO00o<C32460OooOooO> {
        public C01043() {
            super(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$0(CredentialProviderCreatePublicKeyCredentialController this$0) {
            OooOOO0.OooO0oO(this$0, "this$0");
            OooOOO oooOOO = this$0.callback;
            if (oooOOO != null) {
                oooOOO.onError(new C24161OooO0oo(CredentialProviderController.ERROR_MESSAGE_START_ACTIVITY_FAILED));
            } else {
                OooOOO0.OooOOOO("callback");
                throw null;
            }
        }

        @Override // oO0O000o.OooO00o
        public /* bridge */ /* synthetic */ C32460OooOooO invoke() {
            invoke2();
            return C32460OooOooO.f116667OooO00o;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Executor executor = CredentialProviderCreatePublicKeyCredentialController.this.executor;
            if (executor == null) {
                OooOOO0.OooOOOO("executor");
                throw null;
            }
            final CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController = CredentialProviderCreatePublicKeyCredentialController.this;
            executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.CreatePublicKeyCredential.OooO
                @Override // java.lang.Runnable
                public final void run() {
                    CredentialProviderCreatePublicKeyCredentialController.C01043.invoke$lambda$0(credentialProviderCreatePublicKeyCredentialController);
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1] */
    public CredentialProviderCreatePublicKeyCredentialController(Context context) {
        super(context);
        OooOOO0.OooO0oO(context, "context");
        this.context = context;
        final Handler handler = new Handler(Looper.getMainLooper());
        this.resultReceiver = new ResultReceiver(handler) { // from class: androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int resultCode, Bundle resultData) {
                OooOOO0.OooO0oO(resultData, "resultData");
                CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController = this.this$0;
                C0106xdfe2be02 c0106xdfe2be02 = new C0106xdfe2be02(CredentialProviderBaseController.INSTANCE);
                Executor executor = this.this$0.executor;
                if (executor == null) {
                    OooOOO0.OooOOOO("executor");
                    throw null;
                }
                OooOOO oooOOO = this.this$0.callback;
                if (oooOOO == null) {
                    OooOOO0.OooOOOO("callback");
                    throw null;
                }
                if (credentialProviderCreatePublicKeyCredentialController.maybeReportErrorFromResultReceiver(resultData, c0106xdfe2be02, executor, oooOOO, this.this$0.cancellationSignal)) {
                    return;
                }
                this.this$0.handleResponse$credentials_play_services_auth_release(resultData.getInt(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG), resultCode, (Intent) resultData.getParcelable(CredentialProviderBaseController.RESULT_DATA_TAG));
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C24216OooO00o JSONExceptionToPKCError(JSONException exception) {
        String message = exception.getMessage();
        return (message == null || message.length() <= 0) ? new C24216OooO00o(new o0000OOO.OooO0o(), MicrosoftAuthorizationErrorResponse.UNKNOWN_ERROR) : new C24216OooO00o(new o0000OOO.OooO0o(), message);
    }

    private static /* synthetic */ void getCallback$annotations() {
    }

    private static /* synthetic */ void getCancellationSignal$annotations() {
    }

    private static /* synthetic */ void getExecutor$annotations() {
    }

    public static final CredentialProviderCreatePublicKeyCredentialController getInstance(Context context) {
        return INSTANCE.getInstance(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$0(CredentialProviderCreatePublicKeyCredentialController this$0) {
        OooOOO0.OooO0oO(this$0, "this$0");
        OooOOO<o0000OO0.OooO0OO, o0000OO.OooO0o> oooOOO = this$0.callback;
        if (oooOOO != null) {
            oooOOO.onError(new C24216OooO00o(new C24214OooOoo0(), "Upon handling create public key credential response, fido module giving null bytes indicating internal error"));
        } else {
            OooOOO0.OooOOOO("callback");
            throw null;
        }
    }

    public final void handleResponse$credentials_play_services_auth_release(int uniqueRequestCode, int resultCode, Intent data) {
        if (uniqueRequestCode != CredentialProviderBaseController.getCONTROLLER_REQUEST_CODE()) {
            Log.w(TAG, "Returned request code " + CredentialProviderBaseController.getCONTROLLER_REQUEST_CODE() + " does not match what was given " + uniqueRequestCode);
            return;
        }
        if (CredentialProviderController.maybeReportErrorResultCodeCreate(resultCode, C0096xb96e2c35.INSTANCE, new C0097xb96e2c36(this), this.cancellationSignal)) {
            return;
        }
        byte[] byteArrayExtra = data != null ? data.getByteArrayExtra(Fido.FIDO2_KEY_CREDENTIAL_EXTRA) : null;
        if (byteArrayExtra == null) {
            if (CredentialProviderPlayServicesImpl.INSTANCE.cancellationReviewer$credentials_play_services_auth_release(this.cancellationSignal)) {
                return;
            }
            Executor executor = this.executor;
            if (executor != null) {
                executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.CreatePublicKeyCredential.OooO00o
                    @Override // java.lang.Runnable
                    public final void run() {
                        CredentialProviderCreatePublicKeyCredentialController.handleResponse$lambda$0(this.f64343OooOo0o);
                    }
                });
                return;
            } else {
                OooOOO0.OooOOOO("executor");
                throw null;
            }
        }
        PublicKeyCredential publicKeyCredentialDeserializeFromBytes = PublicKeyCredential.deserializeFromBytes(byteArrayExtra);
        OooOOO0.OooO0o(publicKeyCredentialDeserializeFromBytes, "deserializeFromBytes(bytes)");
        o0000OO.OooO0o oooO0oPublicKeyCredentialResponseContainsError = PublicKeyCredentialControllerUtility.INSTANCE.publicKeyCredentialResponseContainsError(publicKeyCredentialDeserializeFromBytes);
        if (oooO0oPublicKeyCredentialResponseContainsError != null) {
            CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new C0098xb96e2c38(this, oooO0oPublicKeyCredentialResponseContainsError));
            return;
        }
        try {
            CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new C0099xb96e2c39(this, convertResponseToCredentialManager(publicKeyCredentialDeserializeFromBytes)));
        } catch (JSONException e) {
            CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new C0100xb96e2c3a(this, e));
        } catch (Throwable th) {
            CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new C0101xb96e2c3b(this, th));
        }
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public PublicKeyCredentialCreationOptions convertRequestToPlayServices(o0000OO0.OooO0o request) {
        OooOOO0.OooO0oO(request, "request");
        return PublicKeyCredentialControllerUtility.INSTANCE.convert(request);
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public o0000OO0.OooO0OO convertResponseToCredentialManager(PublicKeyCredential response) throws C24161OooO0oo {
        OooOOO0.OooO0oO(response, "response");
        try {
            String json = response.toJson();
            OooOOO0.OooO0o(json, "response.toJson()");
            new Bundle().putString("androidx.credentials.BUNDLE_KEY_REGISTRATION_RESPONSE_JSON", json);
            C24166OooO0oO c24166OooO0oO = new C24166OooO0oO();
            if (json.length() != 0) {
                try {
                    new JSONObject(json);
                    return c24166OooO0oO;
                } catch (Exception unused) {
                }
            }
            throw new IllegalArgumentException("registrationResponseJson must not be empty, and must be a valid JSON");
        } catch (Throwable th) {
            throw new C24161OooO0oo("The PublicKeyCredential response json had an unexpected exception when parsing: " + th.getMessage());
        }
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public void invokePlayServices(o0000OO0.OooO0o request, OooOOO<o0000OO0.OooO0OO, o0000OO.OooO0o> callback, Executor executor, CancellationSignal cancellationSignal) {
        OooOOO0.OooO0oO(request, "request");
        OooOOO0.OooO0oO(callback, "callback");
        OooOOO0.OooO0oO(executor, "executor");
        this.cancellationSignal = cancellationSignal;
        this.callback = callback;
        this.executor = executor;
        try {
            PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptionsConvertRequestToPlayServices = convertRequestToPlayServices(request);
            if (CredentialProviderPlayServicesImpl.INSTANCE.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
                return;
            }
            Intent intent = new Intent(this.context, (Class<?>) HiddenActivity.class);
            intent.putExtra(CredentialProviderBaseController.REQUEST_TAG, publicKeyCredentialCreationOptionsConvertRequestToPlayServices);
            generateHiddenActivityIntent(this.resultReceiver, intent, CredentialProviderBaseController.CREATE_PUBLIC_KEY_CREDENTIAL_TAG);
            try {
                this.context.startActivity(intent);
            } catch (Exception unused) {
                CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal, new C01043());
            }
        } catch (JSONException e) {
            CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal, new C01021(e));
        } catch (Throwable th) {
            CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal, new C01032(th));
        }
    }
}
