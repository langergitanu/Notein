package o0000OO0;

import android.content.Context;
import android.credentials.ClearCredentialStateException;
import android.credentials.Credential;
import android.credentials.CredentialManager;
import android.credentials.GetCredentialException;
import android.credentials.GetCredentialRequest;
import android.credentials.GetCredentialResponse;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.p001os.OutcomeReceiver;
import android.util.Log;
import java.util.concurrent.Executor;
import o0000OO.C24158OooO0Oo;
import o0000OO.C24162OooOO0o;
import o0000OO.C24163OooOOOo;
import o0000OO0.AbstractC24167OooO0oo;
import o0000OOo.C24218OooO0OO;
import o0000OOo.C24219OooO0Oo;
import o0000Oo0.C24223OooO00o;
import oO00ooO.C32460OooOooO;
import oO0o0O0o.C33595OooOOo;

/* JADX INFO: renamed from: o0000OO0.Oooo0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24186Oooo0O0 implements InterfaceC24171OooOOo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final CredentialManager f81439OooO00o;

    /* JADX INFO: renamed from: o0000OO0.Oooo0O0$OooO00o */
    public static final class OooO00o extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C32460OooOooO> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ OooOO0O f81440OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(OooOO0O oooOO0O) {
            super(0);
            this.f81440OooOo0o = oooOO0O;
        }

        @Override // oO0O000o.OooO00o
        public final C32460OooOooO invoke() {
            this.f81440OooOo0o.onError(new C24158OooO0Oo("androidx.credentials.TYPE_CLEAR_CREDENTIAL_UNSUPPORTED_EXCEPTION", "Your device doesn't support credential manager"));
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: o0000OO0.Oooo0O0$OooO0O0 */
    public static final class OooO0O0 implements OutcomeReceiver {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ OooOO0O f81441OooOo0o;

        public OooO0O0(OooOO0O oooOO0O) {
            this.f81441OooOo0o = oooOO0O;
        }

        public final void onError(Throwable th) {
            ClearCredentialStateException error = C24188Oooo0OO.OooO00o(th);
            kotlin.jvm.internal.OooOOO0.OooO0oO(error, "error");
            Log.i("CredManProvService", "ClearCredentialStateException error returned from framework");
            this.f81441OooOo0o.onError(new o0000OO.OooO0OO(null));
        }

        public final void onResult(Object obj) {
            Log.i("CredManProvService", "Clear result returned from framework: ");
            this.f81441OooOo0o.onResult((Void) obj);
        }
    }

    /* JADX INFO: renamed from: o0000OO0.Oooo0O0$OooO0OO */
    public static final class OooO0OO extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C32460OooOooO> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C24168OooOO0o f81442OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(C24168OooOO0o c24168OooOO0o) {
            super(0);
            this.f81442OooOo0o = c24168OooOO0o;
        }

        @Override // oO0O000o.OooO00o
        public final C32460OooOooO invoke() {
            this.f81442OooOo0o.onError(new o0000OO.OooOOOO("Your device doesn't support credential manager"));
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: o0000OO0.Oooo0O0$OooO0Oo, reason: case insensitive filesystem */
    public static final class C24187OooO0Oo implements OutcomeReceiver {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C24186Oooo0O0 f81443OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C24168OooOO0o f81444OooOo0o;

        public C24187OooO0Oo(C24168OooOO0o c24168OooOO0o, C24186Oooo0O0 c24186Oooo0O0) {
            this.f81444OooOo0o = c24168OooOO0o;
            this.f81443OooOo = c24186Oooo0O0;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0066  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onError(Throwable th) {
            o0000OO.OooOO0O oooOO02;
            GetCredentialException error = C24190Oooo0o0.OooO00o(th);
            kotlin.jvm.internal.OooOOO0.OooO0oO(error, "error");
            Log.i("CredManProvService", "GetCredentialResponse error returned from framework");
            C24168OooOO0o c24168OooOO0o = this.f81444OooOo0o;
            this.f81443OooOo.getClass();
            String type = error.getType();
            switch (type.hashCode()) {
                case -781118336:
                    if (type.equals("android.credentials.GetCredentialException.TYPE_UNKNOWN")) {
                        oooOO02 = new o0000OO.OooOOO(error.getMessage());
                    } else {
                        String type2 = error.getType();
                        kotlin.jvm.internal.OooOOO0.OooO0o(type2, "error.type");
                        if (C33595OooOOo.OooOoO0(type2, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                            int i = C24219OooO0Oo.f81451OooOoO0;
                            String type3 = error.getType();
                            kotlin.jvm.internal.OooOOO0.OooO0o(type3, "error.type");
                            String message = error.getMessage();
                            try {
                                if (!C33595OooOOo.OooOoO0(type3, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                                    throw new C24223OooO00o();
                                }
                                int i2 = C24218OooO0OO.f81450OooOoO;
                                oooOO02 = C24218OooO0OO.OooO00o.OooO00o(type3, message);
                            } catch (C24223OooO00o unused) {
                                oooOO02 = new o0000OO.OooOO0(type3, message);
                            }
                        } else {
                            String type4 = error.getType();
                            kotlin.jvm.internal.OooOOO0.OooO0o(type4, "error.type");
                            oooOO02 = new o0000OO.OooOO0(type4, error.getMessage());
                        }
                    }
                    c24168OooOO0o.onError(oooOO02);
                    return;
                case -45448328:
                    if (type.equals("android.credentials.GetCredentialException.TYPE_INTERRUPTED")) {
                        oooOO02 = new C24162OooOO0o(error.getMessage());
                    }
                    c24168OooOO0o.onError(oooOO02);
                    return;
                case 580557411:
                    if (type.equals("android.credentials.GetCredentialException.TYPE_USER_CANCELED")) {
                        oooOO02 = new o0000OO.OooO(error.getMessage());
                    }
                    c24168OooOO0o.onError(oooOO02);
                    return;
                case 627896683:
                    if (type.equals("android.credentials.GetCredentialException.TYPE_NO_CREDENTIAL")) {
                        oooOO02 = new C24163OooOOOo(error.getMessage());
                    }
                    c24168OooOO0o.onError(oooOO02);
                    return;
            }
        }

        public final void onResult(Object obj) {
            GetCredentialResponse response = C24189Oooo0o.OooO00o(obj);
            kotlin.jvm.internal.OooOOO0.OooO0oO(response, "response");
            Log.i("CredManProvService", "GetCredentialResponse returned from framework");
            C24168OooOO0o c24168OooOO0o = this.f81444OooOo0o;
            this.f81443OooOo.getClass();
            Credential credential = response.getCredential();
            kotlin.jvm.internal.OooOOO0.OooO0o(credential, "response.credential");
            AbstractC24167OooO0oo.Companion companion = AbstractC24167OooO0oo.INSTANCE;
            String type = credential.getType();
            kotlin.jvm.internal.OooOOO0.OooO0o(type, "credential.type");
            Bundle data = credential.getData();
            kotlin.jvm.internal.OooOOO0.OooO0o(data, "credential.data");
            companion.getClass();
            c24168OooOO0o.onResult(new C24183Oooo(AbstractC24167OooO0oo.Companion.OooO00o(type, data)));
        }
    }

    public C24186Oooo0O0(Context context) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(context, "context");
        this.f81439OooO00o = C24179OooOoo.OooO00o(context.getSystemService("credential"));
    }

    @Override // o0000OO0.InterfaceC24171OooOOo0
    public final boolean isAvailableOnDevice() {
        return Build.VERSION.SDK_INT >= 34 && this.f81439OooO00o != null;
    }

    @Override // o0000OO0.InterfaceC24171OooOOo0
    public final void onClearCredential(o0000OO0.OooO00o oooO00o, CancellationSignal cancellationSignal, Executor executor, OooOOO<Void, o0000OO.OooO00o> oooOOO) {
        Log.i("CredManProvService", "In CredentialProviderFrameworkImpl onClearCredential");
        OooOO0O oooOO0O = (OooOO0O) oooOOO;
        OooO00o oooO00o2 = new OooO00o(oooOO0O);
        CredentialManager credentialManager = this.f81439OooO00o;
        if (credentialManager == null) {
            oooO00o2.invoke();
            return;
        }
        OooO0O0 oooO0O0 = new OooO0O0(oooOO0O);
        kotlin.jvm.internal.OooOOO0.OooO0Oo(credentialManager);
        C24178OooOoOO.OooO00o();
        credentialManager.clearCredentialState(C24172OooOOoo.OooO00o(new Bundle()), cancellationSignal, (OooO) executor, oooO0O0);
    }

    @Override // o0000OO0.InterfaceC24171OooOOo0
    public final void onGetCredential(Context context, C24192Oooo0oo c24192Oooo0oo, CancellationSignal cancellationSignal, Executor executor, OooOOO<C24183Oooo, o0000OO.OooOO0O> oooOOO) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(context, "context");
        C24168OooOO0o c24168OooOO0o = (C24168OooOO0o) oooOOO;
        OooO0OO oooO0OO = new OooO0OO(c24168OooOO0o);
        CredentialManager credentialManager = this.f81439OooO00o;
        if (credentialManager == null) {
            oooO0OO.invoke();
            return;
        }
        C24187OooO0Oo c24187OooO0Oo = new C24187OooO0Oo(c24168OooOO0o, this);
        kotlin.jvm.internal.OooOOO0.OooO0Oo(credentialManager);
        Oooo000.OooO00o();
        Bundle bundle = new Bundle();
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IDENTITY_DOC_UI", false);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false);
        bundle.putParcelable("androidx.credentials.BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME", null);
        GetCredentialRequest.Builder builderOooO00o = C24181OooOooO.OooO00o(bundle);
        for (AbstractC24169OooOOOo abstractC24169OooOOOo : c24192Oooo0oo.f81445OooO00o) {
            C24184Oooo00O.OooO00o();
            builderOooO00o.addCredentialOption(C24182OooOooo.OooO00o(abstractC24169OooOOOo.getType(), abstractC24169OooOOOo.getRequestData(), abstractC24169OooOOOo.getCandidateQueryData()).setIsSystemProviderRequired(abstractC24169OooOOOo.getIsSystemProviderRequired()).setAllowedProviders(abstractC24169OooOOOo.getAllowedProviders()).build());
        }
        GetCredentialRequest getCredentialRequestBuild = builderOooO00o.build();
        kotlin.jvm.internal.OooOOO0.OooO0o(getCredentialRequestBuild, "builder.build()");
        credentialManager.getCredential(context, getCredentialRequestBuild, cancellationSignal, (OooO) executor, (OutcomeReceiver<GetCredentialResponse, GetCredentialException>) c24187OooO0Oo);
    }
}
