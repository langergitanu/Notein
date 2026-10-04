package androidx.credentials.playservices.controllers.BeginSignIn;

import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.libraries.identity.googleid.GetGoogleIdOption;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import o0000OO0.AbstractC24169OooOOOo;
import o0000OO0.C24192Oooo0oo;
import o0000OO0.C24194OoooO0;
import o0000OO0.C24196OoooO0O;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, m80612d2 = {"Landroidx/credentials/playservices/controllers/BeginSignIn/BeginSignInControllerUtility;", "", "()V", "Companion", "credentials-play-services-auth_release"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class BeginSignInControllerUtility {
    private static final long AUTH_MIN_VERSION_JSON_PARSING = 231815000;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = "BeginSignInUtility";

    @Metadata(m80611d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m80612d2 = {"Landroidx/credentials/playservices/controllers/BeginSignIn/BeginSignInControllerUtility$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "determineDeviceGMSVersionCode", "(Landroid/content/Context;)J", "curAuthVersion", "", "needsBackwardsCompatibleRequest", "(J)Z", "Lcom/google/android/libraries/identity/googleid/GetGoogleIdOption;", "option", "Lcom/google/android/gms/auth/api/identity/BeginSignInRequest$GoogleIdTokenRequestOptions;", "convertToGoogleIdTokenOption", "(Lcom/google/android/libraries/identity/googleid/GetGoogleIdOption;)Lcom/google/android/gms/auth/api/identity/BeginSignInRequest$GoogleIdTokenRequestOptions;", "Lo0000OO0/Oooo0oo;", "request", "Lcom/google/android/gms/auth/api/identity/BeginSignInRequest;", "constructBeginSignInRequest$credentials_play_services_auth_release", "(Lo0000OO0/Oooo0oo;Landroid/content/Context;)Lcom/google/android/gms/auth/api/identity/BeginSignInRequest;", "constructBeginSignInRequest", "AUTH_MIN_VERSION_JSON_PARSING", "J", "", "TAG", "Ljava/lang/String;", "credentials-play-services-auth_release"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
            this();
        }

        private final BeginSignInRequest.GoogleIdTokenRequestOptions convertToGoogleIdTokenOption(GetGoogleIdOption option) {
            BeginSignInRequest.GoogleIdTokenRequestOptions.Builder supported = BeginSignInRequest.GoogleIdTokenRequestOptions.builder().setFilterByAuthorizedAccounts(option.getZzc()).setNonce(option.getZzb()).setRequestVerifiedPhoneNumber(option.getZzf()).setServerClientId(option.getZza()).setSupported(true);
            OooOOO0.OooO0o(supported, "builder()\n              …      .setSupported(true)");
            if (option.getZzd() != null) {
                String zzd = option.getZzd();
                OooOOO0.OooO0Oo(zzd);
                supported.associateLinkedAccounts(zzd, option.getIdTokenDepositionScopes());
            }
            BeginSignInRequest.GoogleIdTokenRequestOptions googleIdTokenRequestOptionsBuild = supported.build();
            OooOOO0.OooO0o(googleIdTokenRequestOptionsBuild, "idTokenOption.build()");
            return googleIdTokenRequestOptionsBuild;
        }

        private final long determineDeviceGMSVersionCode(Context context) {
            OooOOO0.OooO0o(context.getPackageManager(), "context.packageManager");
            return r3.getPackageInfo("com.google.android.gms", 0).versionCode;
        }

        private final boolean needsBackwardsCompatibleRequest(long curAuthVersion) {
            return curAuthVersion < BeginSignInControllerUtility.AUTH_MIN_VERSION_JSON_PARSING;
        }

        /* JADX INFO: renamed from: constructBeginSignInRequest$credentials_play_services_auth_release */
        public final BeginSignInRequest m17x545fe152(C24192Oooo0oo request, Context context) {
            OooOOO0.OooO0oO(request, "request");
            OooOOO0.OooO0oO(context, "context");
            BeginSignInRequest.Builder builder = new BeginSignInRequest.Builder();
            boolean z = false;
            boolean z2 = false;
            for (AbstractC24169OooOOOo abstractC24169OooOOOo : request.f81445OooO00o) {
                if (abstractC24169OooOOOo instanceof C24194OoooO0) {
                    builder.setPasswordRequestOptions(new BeginSignInRequest.PasswordRequestOptions.Builder().setSupported(true).build());
                    z = z || abstractC24169OooOOOo.getIsAutoSelectAllowed();
                } else if ((abstractC24169OooOOOo instanceof C24196OoooO0O) && !z2) {
                    if (needsBackwardsCompatibleRequest(determineDeviceGMSVersionCode(context))) {
                        builder.setPasskeysSignInRequestOptions(PublicKeyCredentialControllerUtility.INSTANCE.convertToPlayAuthPasskeyRequest((C24196OoooO0O) abstractC24169OooOOOo));
                    } else {
                        builder.setPasskeyJsonSignInRequestOptions(PublicKeyCredentialControllerUtility.INSTANCE.convertToPlayAuthPasskeyJsonRequest((C24196OoooO0O) abstractC24169OooOOOo));
                    }
                    z2 = true;
                } else if (abstractC24169OooOOOo instanceof GetGoogleIdOption) {
                    GetGoogleIdOption getGoogleIdOption = (GetGoogleIdOption) abstractC24169OooOOOo;
                    builder.setGoogleIdTokenRequestOptions(convertToGoogleIdTokenOption(getGoogleIdOption));
                    if (z || getGoogleIdOption.getZzg()) {
                    }
                }
            }
            BeginSignInRequest beginSignInRequestBuild = builder.setAutoSelectEnabled(z).build();
            OooOOO0.OooO0o(beginSignInRequestBuild, "requestBuilder\n         …\n                .build()");
            return beginSignInRequestBuild;
        }

        private Companion() {
        }
    }
}
