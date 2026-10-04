package o0O0OOOo;

import com.android.billingclient.api.C22189OoooO0;
import com.microsoft.identity.common.java.authorities.Authority;
import com.microsoft.identity.common.java.authorities.CIAMAuthority;
import com.microsoft.identity.common.java.logging.LogSession;
import com.microsoft.identity.common.java.logging.Logger;
import com.microsoft.identity.common.java.net.UrlConnectionHttpClient;
import com.microsoft.identity.common.java.providers.oauth2.OAuth2Strategy;
import com.microsoft.identity.common.java.providers.oauth2.OAuth2StrategyParameters;
import java.net.URL;
import java.util.Collection;
import kotlin.jvm.internal.OooOOO0;
import o0000Ooo.C24235OooOO0;
import o0000Ooo.C24239OooOOO0;
import o0000Ooo.C24242OooOOo;
import o0O0OOoO.C25891OooO00o;
import o0O0OOoO.OooO0O0;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.OooOo;

/* JADX INFO: loaded from: classes9.dex */
public final class OooO00o extends CIAMAuthority {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f88343OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO00o(String authorityUrl, String clientId) {
        super(authorityUrl);
        OooOOO0.OooO0oO(authorityUrl, "authorityUrl");
        OooOOO0.OooO0oO(clientId, "clientId");
        this.f88343OooO00o = clientId;
        this.mAuthorityTypeString = Authority.AAD_NA;
        this.mAuthorityUrlString = authorityUrl;
    }

    @Override // com.microsoft.identity.common.java.authorities.CIAMAuthority, com.microsoft.identity.common.java.authorities.Authority
    public final OAuth2Strategy createOAuth2Strategy(OAuth2StrategyParameters parameters) {
        OooOOO0.OooO0oO(parameters, "parameters");
        Collection collection = parameters.mChallengeTypes;
        LogSession.Companion companion = LogSession.INSTANCE;
        companion.logMethodCall("OooO00o", null, "OooO00o".concat(".createNativeAuthOAuth2Configuration"));
        URL authorityURL = getAuthorityURL();
        OooOOO0.OooO0o(authorityURL, "this.authorityURL");
        companion.logMethodCall("OooO00o", null, "OooO00o".concat(".getChallengeTypesWithDefault"));
        Logger.info("OooO00o", "Challenge Types passed = " + collection);
        if (collection == null) {
            collection = C34434OooOoO.f123453OooOo0o;
        }
        C25891OooO00o c25891OooO00o = new C25891OooO00o(authorityURL, this.f88343OooO00o, OooOo.o000oOoO(OooOo.Oooo0(OooOo.OooooOO(collection, com.facebook.soloader.OooOo.OooO0oO("redirect"))), " ", null, null, null, 62));
        parameters.setUsingOpenIdConfiguration(false);
        OooOOO0.OooO0o(UrlConnectionHttpClient.getDefaultInstance(), "getDefaultInstance()");
        String TAG = c25891OooO00o.f88406OooO0OO;
        OooOOO0.OooO0o(TAG, "TAG");
        companion.logMethodCall(TAG, null, TAG.concat(".getSignUpStartEndpoint"));
        companion.logMethodCall(TAG, null, OooO0O0.OooO00o.OooO0OO(c25891OooO00o, "/signup/v1.0/start", "config.getSignUpStartEndpoint().toString()", TAG, ".getSignUpChallengeEndpoint"));
        companion.logMethodCall(TAG, null, OooO0O0.OooO00o.OooO0OO(c25891OooO00o, "/signup/v1.0/challenge", "config.getSignUpChallengeEndpoint().toString()", TAG, ".getSignUpContinueEndpoint"));
        companion.logMethodCall(TAG, null, OooO0O0.OooO00o.OooO0OO(c25891OooO00o, "/signup/v1.0/continue", "config.getSignUpContinueEndpoint().toString()", TAG, ".getSignInInitiateEndpoint"));
        companion.logMethodCall(TAG, null, OooO0O0.OooO00o.OooO0OO(c25891OooO00o, "/oauth2/v2.0/initiate", "config.getSignInInitiateEndpoint().toString()", TAG, ".getSignInChallengeEndpoint"));
        companion.logMethodCall(TAG, null, OooO0O0.OooO00o.OooO0OO(c25891OooO00o, "/oauth2/v2.0/challenge", "config.getSignInChallengeEndpoint().toString()", TAG, ".getSignInTokenEndpoint"));
        companion.logMethodCall(TAG, null, OooO0O0.OooO00o.OooO0OO(c25891OooO00o, "/oauth2/v2.0/token", "config.getSignInTokenEndpoint().toString()", TAG, ".getResetPasswordStartEndpoint"));
        companion.logMethodCall(TAG, null, OooO0O0.OooO00o.OooO0OO(c25891OooO00o, "/resetpassword/v1.0/start", "config.getResetPasswordStartEndpoint().toString()", TAG, ".getResetPasswordChallengeEndpoint"));
        companion.logMethodCall(TAG, null, OooO0O0.OooO00o.OooO0OO(c25891OooO00o, "/resetpassword/v1.0/challenge", "config.getResetPasswordC…engeEndpoint().toString()", TAG, ".getResetPasswordContinueEndpoint"));
        OooOOO0.OooO0o(c25891OooO00o.OooO00o(c25891OooO00o.getAuthorityUrl(), "/resetpassword/v1.0/continue").toString(), "config.getResetPasswordC…inueEndpoint().toString()");
        companion.logMethodCall(TAG, null, TAG.concat(".getResetPasswordSubmitEndpoint"));
        companion.logMethodCall(TAG, null, OooO0O0.OooO00o.OooO0OO(c25891OooO00o, "/resetpassword/v1.0/submit", "config.getResetPasswordSubmitEndpoint().toString()", TAG, ".getResetPasswordPollCompletionEndpoint"));
        OooOOO0.OooO0o(c25891OooO00o.OooO00o(c25891OooO00o.getAuthorityUrl(), "/resetpassword/v1.0/poll_completion").toString(), "config.getResetPasswordP…tionEndpoint().toString()");
        new C24235OooOO0();
        C22189OoooO0 c22189OoooO0 = new C22189OoooO0();
        OooOOO0.OooO0o(UrlConnectionHttpClient.getDefaultInstance(), "getDefaultInstance()");
        companion.logMethodCall(TAG, null, TAG.concat(".getSignUpStartEndpoint"));
        companion.logMethodCall(TAG, null, OooO0O0.OooO00o.OooO0OO(c25891OooO00o, "/signup/v1.0/start", "config.getSignUpStartEndpoint().toString()", TAG, ".getSignUpChallengeEndpoint"));
        companion.logMethodCall(TAG, null, OooO0O0.OooO00o.OooO0OO(c25891OooO00o, "/signup/v1.0/challenge", "config.getSignUpChallengeEndpoint().toString()", TAG, ".getSignUpContinueEndpoint"));
        companion.logMethodCall(TAG, null, OooO0O0.OooO00o.OooO0OO(c25891OooO00o, "/signup/v1.0/continue", "config.getSignUpContinueEndpoint().toString()", TAG, ".getSignInInitiateEndpoint"));
        companion.logMethodCall(TAG, null, OooO0O0.OooO00o.OooO0OO(c25891OooO00o, "/oauth2/v2.0/initiate", "config.getSignInInitiateEndpoint().toString()", TAG, ".getSignInChallengeEndpoint"));
        companion.logMethodCall(TAG, null, OooO0O0.OooO00o.OooO0OO(c25891OooO00o, "/oauth2/v2.0/challenge", "config.getSignInChallengeEndpoint().toString()", TAG, ".getSignInTokenEndpoint"));
        companion.logMethodCall(TAG, null, OooO0O0.OooO00o.OooO0OO(c25891OooO00o, "/oauth2/v2.0/token", "config.getSignInTokenEndpoint().toString()", TAG, ".getResetPasswordStartEndpoint"));
        companion.logMethodCall(TAG, null, OooO0O0.OooO00o.OooO0OO(c25891OooO00o, "/resetpassword/v1.0/start", "config.getResetPasswordStartEndpoint().toString()", TAG, ".getResetPasswordChallengeEndpoint"));
        companion.logMethodCall(TAG, null, OooO0O0.OooO00o.OooO0OO(c25891OooO00o, "/resetpassword/v1.0/challenge", "config.getResetPasswordC…engeEndpoint().toString()", TAG, ".getResetPasswordContinueEndpoint"));
        companion.logMethodCall(TAG, null, OooO0O0.OooO00o.OooO0OO(c25891OooO00o, "/resetpassword/v1.0/continue", "config.getResetPasswordC…inueEndpoint().toString()", TAG, ".getResetPasswordSubmitEndpoint"));
        companion.logMethodCall(TAG, null, OooO0O0.OooO00o.OooO0OO(c25891OooO00o, "/resetpassword/v1.0/submit", "config.getResetPasswordSubmitEndpoint().toString()", TAG, ".getResetPasswordPollCompletionEndpoint"));
        OooOOO0.OooO0o(c25891OooO00o.OooO00o(c25891OooO00o.getAuthorityUrl(), "/resetpassword/v1.0/poll_completion").toString(), "config.getResetPasswordP…tionEndpoint().toString()");
        new C24235OooOO0();
        C24242OooOOo c24242OooOOo = new C24242OooOOo();
        OooOOO0.OooO0o(UrlConnectionHttpClient.getDefaultInstance(), "getDefaultInstance()");
        companion.logMethodCall(TAG, null, TAG.concat(".getSignUpStartEndpoint"));
        OooOOO0.OooO0o(c25891OooO00o.OooO00o(c25891OooO00o.getAuthorityUrl(), "/signup/v1.0/start").toString(), "config.getSignUpStartEndpoint().toString()");
        companion.logMethodCall(TAG, null, TAG.concat(".getSignUpChallengeEndpoint"));
        companion.logMethodCall(TAG, null, OooO0O0.OooO00o.OooO0OO(c25891OooO00o, "/signup/v1.0/challenge", "config.getSignUpChallengeEndpoint().toString()", TAG, ".getSignUpContinueEndpoint"));
        companion.logMethodCall(TAG, null, OooO0O0.OooO00o.OooO0OO(c25891OooO00o, "/signup/v1.0/continue", "config.getSignUpContinueEndpoint().toString()", TAG, ".getSignInInitiateEndpoint"));
        companion.logMethodCall(TAG, null, OooO0O0.OooO00o.OooO0OO(c25891OooO00o, "/oauth2/v2.0/initiate", "config.getSignInInitiateEndpoint().toString()", TAG, ".getSignInChallengeEndpoint"));
        companion.logMethodCall(TAG, null, OooO0O0.OooO00o.OooO0OO(c25891OooO00o, "/oauth2/v2.0/challenge", "config.getSignInChallengeEndpoint().toString()", TAG, ".getSignInTokenEndpoint"));
        companion.logMethodCall(TAG, null, OooO0O0.OooO00o.OooO0OO(c25891OooO00o, "/oauth2/v2.0/token", "config.getSignInTokenEndpoint().toString()", TAG, ".getResetPasswordStartEndpoint"));
        companion.logMethodCall(TAG, null, OooO0O0.OooO00o.OooO0OO(c25891OooO00o, "/resetpassword/v1.0/start", "config.getResetPasswordStartEndpoint().toString()", TAG, ".getResetPasswordChallengeEndpoint"));
        companion.logMethodCall(TAG, null, OooO0O0.OooO00o.OooO0OO(c25891OooO00o, "/resetpassword/v1.0/challenge", "config.getResetPasswordC…engeEndpoint().toString()", TAG, ".getResetPasswordContinueEndpoint"));
        companion.logMethodCall(TAG, null, OooO0O0.OooO00o.OooO0OO(c25891OooO00o, "/resetpassword/v1.0/continue", "config.getResetPasswordC…inueEndpoint().toString()", TAG, ".getResetPasswordSubmitEndpoint"));
        companion.logMethodCall(TAG, null, OooO0O0.OooO00o.OooO0OO(c25891OooO00o, "/resetpassword/v1.0/submit", "config.getResetPasswordSubmitEndpoint().toString()", TAG, ".getResetPasswordPollCompletionEndpoint"));
        OooOOO0.OooO0o(c25891OooO00o.OooO00o(c25891OooO00o.getAuthorityUrl(), "/resetpassword/v1.0/poll_completion").toString(), "config.getResetPasswordP…tionEndpoint().toString()");
        new C24235OooOO0();
        return new OooO0O0(parameters, c25891OooO00o, c22189OoooO0, c24242OooOOo, new C24239OooOOO0());
    }
}
