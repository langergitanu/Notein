package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

import android.util.Base64;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.fido2.api.common.Attachment;
import com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria;
import com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier;
import com.google.android.gms.fido.fido2.api.common.ErrorCode;
import com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension;
import com.google.android.gms.fido.fido2.api.common.GoogleThirdPartyPaymentExtension;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialParameters;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity;
import com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethodExtension;
import com.google.android.gms.fido.u2f.api.common.ClientData;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.network.embedded.C18437z2;
import com.huawei.hms.support.feature.result.CommonConstant;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.microsoft.identity.common.java.constants.FidoConstants;
import com.microsoft.identity.common.java.jwt.AbstractJwtRequest;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import o0000OO.C24159OooO0o0;
import o0000OO.OooOO0O;
import o0000OO.OooOOO;
import o0000OO0.C24196OoooO0O;
import o0000OOO.AbstractC24199OooO0o0;
import o0000OOO.C24198OooO0Oo;
import o0000OOO.C24202OooOO0o;
import o0000OOO.C24203OooOOOo;
import o0000OOO.C24204OooOOo;
import o0000OOO.C24206OooOOoo;
import o0000OOO.C24210OooOoO;
import o0000OOO.C24214OooOoo0;
import o0000OOO.OooOo;
import o0000OOo.C24216OooO00o;
import o0000OOo.C24218OooO0OO;
import oO00ooO.C32443OooOOO;
import oO0o0O0o.C33599OooOo0O;
import oOo000Oo.C34444Oooo0O0;
import oOo000Oo.Oooo0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, m80612d2 = {"Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/PublicKeyCredentialControllerUtility;", "", "()V", "Companion", "credentials-play-services-auth_release"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class PublicKeyCredentialControllerUtility {
    private static final int FLAGS = 11;
    private static final String TAG = "PublicKeyUtility";
    private static final LinkedHashMap<ErrorCode, AbstractC24199OooO0o0> orderedErrorCodeToExceptions;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String JSON_KEY_CLIENT_DATA = FidoConstants.WEBAUTHN_RESPONSE_CLIENT_DATA_JSON_KEY;
    private static final String JSON_KEY_ATTESTATION_OBJ = "attestationObject";
    private static final String JSON_KEY_AUTH_DATA = FidoConstants.WEBAUTHN_RESPONSE_AUTHENTICATOR_DATA_JSON_KEY;
    private static final String JSON_KEY_SIGNATURE = FidoConstants.WEBAUTHN_RESPONSE_SIGNATURE_JSON_KEY;
    private static final String JSON_KEY_USER_HANDLE = FidoConstants.WEBAUTHN_RESPONSE_USER_HANDLE_JSON_KEY;
    private static final String JSON_KEY_RESPONSE = FidoConstants.WEBAUTHN_AUTHENTICATION_ASSERTION_RESPONSE_JSON_KEY;
    private static final String JSON_KEY_ID = "id";
    private static final String JSON_KEY_RAW_ID = "rawId";
    private static final String JSON_KEY_TYPE = C18437z2.f56754h;
    private static final String JSON_KEY_RPID = "rpId";
    private static final String JSON_KEY_CHALLENGE = ClientData.KEY_CHALLENGE;
    private static final String JSON_KEY_APPID = HiAnalyticsConstant.HaKey.BI_KEY_APPID;
    private static final String JSON_KEY_THIRD_PARTY_PAYMENT = "thirdPartyPayment";
    private static final String JSON_KEY_AUTH_SELECTION = "authenticatorSelection";
    private static final String JSON_KEY_REQUIRE_RES_KEY = "requireResidentKey";
    private static final String JSON_KEY_RES_KEY = "residentKey";
    private static final String JSON_KEY_AUTH_ATTACHMENT = "authenticatorAttachment";
    private static final String JSON_KEY_TIMEOUT = "timeout";
    private static final String JSON_KEY_EXCLUDE_CREDENTIALS = "excludeCredentials";
    private static final String JSON_KEY_TRANSPORTS = "transports";
    private static final String JSON_KEY_RP = "rp";
    private static final String JSON_KEY_NAME = "name";
    private static final String JSON_KEY_ICON = "icon";
    private static final String JSON_KEY_ALG = AbstractJwtRequest.ClaimNames.ALG;
    private static final String JSON_KEY_USER = "user";
    private static final String JSON_KEY_DISPLAY_NAME = CommonConstant.KEY_DISPLAY_NAME;
    private static final String JSON_KEY_USER_VERIFICATION_METHOD = "userVerificationMethod";
    private static final String JSON_KEY_KEY_PROTECTION_TYPE = "keyProtectionType";
    private static final String JSON_KEY_MATCHER_PROTECTION_TYPE = "matcherProtectionType";
    private static final String JSON_KEY_EXTENSTIONS = "extensions";
    private static final String JSON_KEY_ATTESTATION = "attestation";
    private static final String JSON_KEY_PUB_KEY_CRED_PARAMS = "pubKeyCredParams";
    private static final String JSON_KEY_CLIENT_EXTENSION_RESULTS = "clientExtensionResults";
    private static final String JSON_KEY_RK = "rk";
    private static final String JSON_KEY_CRED_PROPS = "credProps";

    @Metadata(m80611d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\bL\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\fJ7\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u000e\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00120\u00112\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020!2\u0006\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010\u0019\u001a\u00020$¢\u0006\u0004\b&\u0010'J!\u0010.\u001a\u00020+2\u0006\u0010)\u001a\u00020(2\b\u0010*\u001a\u0004\u0018\u00010\u0012H\u0000¢\u0006\u0004\b,\u0010-J\u001f\u00103\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\t2\u0006\u00100\u001a\u00020/H\u0000¢\u0006\u0004\b1\u00102J\u001f\u00105\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\t2\u0006\u00100\u001a\u00020/H\u0000¢\u0006\u0004\b4\u00102J\u001f\u00107\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\t2\u0006\u00100\u001a\u00020/H\u0000¢\u0006\u0004\b6\u00102J\u001f\u00109\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\t2\u0006\u00100\u001a\u00020/H\u0000¢\u0006\u0004\b8\u00102J\u001f\u0010;\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\t2\u0006\u00100\u001a\u00020/H\u0000¢\u0006\u0004\b:\u00102J\u001f\u0010=\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\t2\u0006\u00100\u001a\u00020/H\u0000¢\u0006\u0004\b<\u00102J\u0015\u0010?\u001a\u00020\u000e2\u0006\u0010>\u001a\u00020\u0012¢\u0006\u0004\b?\u0010@J\u0015\u0010B\u001a\u00020\u00122\u0006\u0010A\u001a\u00020\u000e¢\u0006\u0004\bB\u0010CJ\u0015\u0010G\u001a\u00020F2\u0006\u0010E\u001a\u00020D¢\u0006\u0004\bG\u0010HJ\u0017\u0010I\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\bI\u0010JR\u001a\u0010K\u001a\u00020\u00128\u0000X\u0080D¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u001a\u0010O\u001a\u00020\u00128\u0000X\u0080D¢\u0006\f\n\u0004\bO\u0010L\u001a\u0004\bP\u0010NR\u001a\u0010Q\u001a\u00020\u00128\u0000X\u0080D¢\u0006\f\n\u0004\bQ\u0010L\u001a\u0004\bR\u0010NR\u001a\u0010S\u001a\u00020\u00128\u0000X\u0080D¢\u0006\f\n\u0004\bS\u0010L\u001a\u0004\bT\u0010NR\u001a\u0010U\u001a\u00020\u00128\u0000X\u0080D¢\u0006\f\n\u0004\bU\u0010L\u001a\u0004\bV\u0010NR\u001a\u0010W\u001a\u00020\u00128\u0000X\u0080D¢\u0006\f\n\u0004\bW\u0010L\u001a\u0004\bX\u0010NR\u001a\u0010Y\u001a\u00020\u00128\u0000X\u0080D¢\u0006\f\n\u0004\bY\u0010L\u001a\u0004\bZ\u0010NR\u001a\u0010[\u001a\u00020\u00128\u0000X\u0080D¢\u0006\f\n\u0004\b[\u0010L\u001a\u0004\b\\\u0010NR\u001a\u0010]\u001a\u00020\u00128\u0000X\u0080D¢\u0006\f\n\u0004\b]\u0010L\u001a\u0004\b^\u0010NR\u001a\u0010_\u001a\u00020\u00128\u0000X\u0080D¢\u0006\f\n\u0004\b_\u0010L\u001a\u0004\b`\u0010NR\u001a\u0010a\u001a\u00020\u00128\u0000X\u0080D¢\u0006\f\n\u0004\ba\u0010L\u001a\u0004\bb\u0010NR\u001a\u0010c\u001a\u00020\u00128\u0000X\u0080D¢\u0006\f\n\u0004\bc\u0010L\u001a\u0004\bd\u0010NR\u001a\u0010e\u001a\u00020\u00128\u0000X\u0080D¢\u0006\f\n\u0004\be\u0010L\u001a\u0004\bf\u0010NR\u001a\u0010g\u001a\u00020\u00128\u0000X\u0080D¢\u0006\f\n\u0004\bg\u0010L\u001a\u0004\bh\u0010NR\u001a\u0010i\u001a\u00020\u00128\u0000X\u0080D¢\u0006\f\n\u0004\bi\u0010L\u001a\u0004\bj\u0010NR\u001a\u0010k\u001a\u00020\u00128\u0000X\u0080D¢\u0006\f\n\u0004\bk\u0010L\u001a\u0004\bl\u0010NR\u001a\u0010m\u001a\u00020\u00128\u0000X\u0080D¢\u0006\f\n\u0004\bm\u0010L\u001a\u0004\bn\u0010NR\u001a\u0010o\u001a\u00020\u00128\u0000X\u0080D¢\u0006\f\n\u0004\bo\u0010L\u001a\u0004\bp\u0010NR\u001a\u0010q\u001a\u00020\u00128\u0000X\u0080D¢\u0006\f\n\u0004\bq\u0010L\u001a\u0004\br\u0010NR\u001a\u0010s\u001a\u00020\u00128\u0000X\u0080D¢\u0006\f\n\u0004\bs\u0010L\u001a\u0004\bt\u0010NR\u001a\u0010u\u001a\u00020\u00128\u0000X\u0080D¢\u0006\f\n\u0004\bu\u0010L\u001a\u0004\bv\u0010NR\u001a\u0010w\u001a\u00020\u00128\u0000X\u0080D¢\u0006\f\n\u0004\bw\u0010L\u001a\u0004\bx\u0010NR\u001a\u0010y\u001a\u00020\u00128\u0000X\u0080D¢\u0006\f\n\u0004\by\u0010L\u001a\u0004\bz\u0010NR\u001a\u0010{\u001a\u00020\u00128\u0000X\u0080D¢\u0006\f\n\u0004\b{\u0010L\u001a\u0004\b|\u0010NR\u001a\u0010}\u001a\u00020\u00128\u0000X\u0080D¢\u0006\f\n\u0004\b}\u0010L\u001a\u0004\b~\u0010NR\u001b\u0010\u007f\u001a\u00020\u00128\u0000X\u0080D¢\u0006\r\n\u0004\b\u007f\u0010L\u001a\u0005\b\u0080\u0001\u0010NR\u001d\u0010\u0081\u0001\u001a\u00020\u00128\u0000X\u0080D¢\u0006\u000e\n\u0005\b\u0081\u0001\u0010L\u001a\u0005\b\u0082\u0001\u0010NR\u001d\u0010\u0083\u0001\u001a\u00020\u00128\u0000X\u0080D¢\u0006\u000e\n\u0005\b\u0083\u0001\u0010L\u001a\u0005\b\u0084\u0001\u0010NR\u001d\u0010\u0085\u0001\u001a\u00020\u00128\u0000X\u0080D¢\u0006\u000e\n\u0005\b\u0085\u0001\u0010L\u001a\u0005\b\u0086\u0001\u0010NR\u001d\u0010\u0087\u0001\u001a\u00020\u00128\u0000X\u0080D¢\u0006\u000e\n\u0005\b\u0087\u0001\u0010L\u001a\u0005\b\u0088\u0001\u0010NR\u001d\u0010\u0089\u0001\u001a\u00020\u00128\u0000X\u0080D¢\u0006\u000e\n\u0005\b\u0089\u0001\u0010L\u001a\u0005\b\u008a\u0001\u0010NR\u001d\u0010\u008b\u0001\u001a\u00020\u00128\u0000X\u0080D¢\u0006\u000e\n\u0005\b\u008b\u0001\u0010L\u001a\u0005\b\u008c\u0001\u0010NR\u001d\u0010\u008d\u0001\u001a\u00020\u00128\u0000X\u0080D¢\u0006\u000e\n\u0005\b\u008d\u0001\u0010L\u001a\u0005\b\u008e\u0001\u0010NR\u001d\u0010\u008f\u0001\u001a\u00020\u00128\u0000X\u0080D¢\u0006\u000e\n\u0005\b\u008f\u0001\u0010L\u001a\u0005\b\u0090\u0001\u0010NR\u001d\u0010\u0091\u0001\u001a\u00020\u00128\u0000X\u0080D¢\u0006\u000e\n\u0005\b\u0091\u0001\u0010L\u001a\u0005\b\u0092\u0001\u0010NR?\u0010\u0096\u0001\u001a\"\u0012\u0004\u0012\u00020(\u0012\u0005\u0012\u00030\u0094\u00010\u0093\u0001j\u0010\u0012\u0004\u0012\u00020(\u0012\u0005\u0012\u00030\u0094\u0001`\u0095\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0096\u0001\u0010\u0097\u0001\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001R\u0017\u0010\u009a\u0001\u001a\u00020D8\u0002X\u0082T¢\u0006\b\n\u0006\b\u009a\u0001\u0010\u009b\u0001R\u0016\u0010\u009c\u0001\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u009c\u0001\u0010L¨\u0006\u009d\u0001"}, m80612d2 = {"Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/PublicKeyCredentialControllerUtility$Companion;", "", "<init>", "()V", "Lo0000OO0/OooO0o;", "request", "Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialCreationOptions;", "convert", "(Lo0000OO0/OooO0o;)Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialCreationOptions;", "Lorg/json/JSONObject;", "json", "convertJSON$credentials_play_services_auth_release", "(Lorg/json/JSONObject;)Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialCreationOptions;", "convertJSON", "", FidoConstants.WEBAUTHN_RESPONSE_CLIENT_DATA_JSON_KEY, "attestationObject", "", "", "transportArray", "LoO00ooO/OooOooO;", "addAuthenticatorAttestationResponse$credentials_play_services_auth_release", "([B[B[Ljava/lang/String;Lorg/json/JSONObject;)V", "addAuthenticatorAttestationResponse", "Lcom/google/android/gms/auth/api/identity/SignInCredential;", "cred", "toAssertPasskeyResponse", "(Lcom/google/android/gms/auth/api/identity/SignInCredential;)Ljava/lang/String;", "Lo0000OO0/OoooO0O;", "option", "Lcom/google/android/gms/auth/api/identity/BeginSignInRequest$PasskeyJsonRequestOptions;", "convertToPlayAuthPasskeyJsonRequest", "(Lo0000OO0/OoooO0O;)Lcom/google/android/gms/auth/api/identity/BeginSignInRequest$PasskeyJsonRequestOptions;", "Lcom/google/android/gms/auth/api/identity/BeginSignInRequest$PasskeysRequestOptions;", "convertToPlayAuthPasskeyRequest", "(Lo0000OO0/OoooO0O;)Lcom/google/android/gms/auth/api/identity/BeginSignInRequest$PasskeysRequestOptions;", "Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredential;", "Lo0000OO/OooO0o;", "publicKeyCredentialResponseContainsError", "(Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredential;)Lo0000OO/OooO0o;", "Lcom/google/android/gms/fido/fido2/api/common/ErrorCode;", "code", NotificationCompat.CATEGORY_MESSAGE, "Lo0000OO/OooOO0O;", "beginSignInPublicKeyCredentialResponseContainsError$credentials_play_services_auth_release", "(Lcom/google/android/gms/fido/fido2/api/common/ErrorCode;Ljava/lang/String;)Lo0000OO/OooOO0O;", "beginSignInPublicKeyCredentialResponseContainsError", "Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialCreationOptions$Builder;", "builder", "parseOptionalExtensions$credentials_play_services_auth_release", "(Lorg/json/JSONObject;Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialCreationOptions$Builder;)V", "parseOptionalExtensions", "parseOptionalAuthenticatorSelection$credentials_play_services_auth_release", "parseOptionalAuthenticatorSelection", "parseOptionalTimeout$credentials_play_services_auth_release", "parseOptionalTimeout", "parseOptionalWithRequiredDefaultsAttestationAndExcludeCredentials$credentials_play_services_auth_release", "parseOptionalWithRequiredDefaultsAttestationAndExcludeCredentials", "parseRequiredRpAndParams$credentials_play_services_auth_release", "parseRequiredRpAndParams", "parseRequiredChallengeAndUser$credentials_play_services_auth_release", "parseRequiredChallengeAndUser", "str", "b64Decode", "(Ljava/lang/String;)[B", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "b64Encode", "([B)Ljava/lang/String;", "", AbstractJwtRequest.ClaimNames.ALG, "", "checkAlgSupported", "(I)Z", "getChallenge", "(Lorg/json/JSONObject;)[B", "JSON_KEY_CLIENT_DATA", "Ljava/lang/String;", "getJSON_KEY_CLIENT_DATA$credentials_play_services_auth_release", "()Ljava/lang/String;", "JSON_KEY_ATTESTATION_OBJ", "getJSON_KEY_ATTESTATION_OBJ$credentials_play_services_auth_release", "JSON_KEY_AUTH_DATA", "getJSON_KEY_AUTH_DATA$credentials_play_services_auth_release", "JSON_KEY_SIGNATURE", "getJSON_KEY_SIGNATURE$credentials_play_services_auth_release", "JSON_KEY_USER_HANDLE", "getJSON_KEY_USER_HANDLE$credentials_play_services_auth_release", "JSON_KEY_RESPONSE", "getJSON_KEY_RESPONSE$credentials_play_services_auth_release", "JSON_KEY_ID", "getJSON_KEY_ID$credentials_play_services_auth_release", "JSON_KEY_RAW_ID", "getJSON_KEY_RAW_ID$credentials_play_services_auth_release", "JSON_KEY_TYPE", "getJSON_KEY_TYPE$credentials_play_services_auth_release", "JSON_KEY_RPID", "getJSON_KEY_RPID$credentials_play_services_auth_release", "JSON_KEY_CHALLENGE", "getJSON_KEY_CHALLENGE$credentials_play_services_auth_release", "JSON_KEY_APPID", "getJSON_KEY_APPID$credentials_play_services_auth_release", "JSON_KEY_THIRD_PARTY_PAYMENT", "getJSON_KEY_THIRD_PARTY_PAYMENT$credentials_play_services_auth_release", "JSON_KEY_AUTH_SELECTION", "getJSON_KEY_AUTH_SELECTION$credentials_play_services_auth_release", "JSON_KEY_REQUIRE_RES_KEY", "getJSON_KEY_REQUIRE_RES_KEY$credentials_play_services_auth_release", "JSON_KEY_RES_KEY", "getJSON_KEY_RES_KEY$credentials_play_services_auth_release", "JSON_KEY_AUTH_ATTACHMENT", "getJSON_KEY_AUTH_ATTACHMENT$credentials_play_services_auth_release", "JSON_KEY_TIMEOUT", "getJSON_KEY_TIMEOUT$credentials_play_services_auth_release", "JSON_KEY_EXCLUDE_CREDENTIALS", "getJSON_KEY_EXCLUDE_CREDENTIALS$credentials_play_services_auth_release", "JSON_KEY_TRANSPORTS", "getJSON_KEY_TRANSPORTS$credentials_play_services_auth_release", "JSON_KEY_RP", "getJSON_KEY_RP$credentials_play_services_auth_release", "JSON_KEY_NAME", "getJSON_KEY_NAME$credentials_play_services_auth_release", "JSON_KEY_ICON", "getJSON_KEY_ICON$credentials_play_services_auth_release", "JSON_KEY_ALG", "getJSON_KEY_ALG$credentials_play_services_auth_release", "JSON_KEY_USER", "getJSON_KEY_USER$credentials_play_services_auth_release", "JSON_KEY_DISPLAY_NAME", "getJSON_KEY_DISPLAY_NAME$credentials_play_services_auth_release", "JSON_KEY_USER_VERIFICATION_METHOD", "getJSON_KEY_USER_VERIFICATION_METHOD$credentials_play_services_auth_release", "JSON_KEY_KEY_PROTECTION_TYPE", "getJSON_KEY_KEY_PROTECTION_TYPE$credentials_play_services_auth_release", "JSON_KEY_MATCHER_PROTECTION_TYPE", "getJSON_KEY_MATCHER_PROTECTION_TYPE$credentials_play_services_auth_release", "JSON_KEY_EXTENSTIONS", "getJSON_KEY_EXTENSTIONS$credentials_play_services_auth_release", "JSON_KEY_ATTESTATION", "getJSON_KEY_ATTESTATION$credentials_play_services_auth_release", "JSON_KEY_PUB_KEY_CRED_PARAMS", "getJSON_KEY_PUB_KEY_CRED_PARAMS$credentials_play_services_auth_release", "JSON_KEY_CLIENT_EXTENSION_RESULTS", "getJSON_KEY_CLIENT_EXTENSION_RESULTS$credentials_play_services_auth_release", "JSON_KEY_RK", "getJSON_KEY_RK$credentials_play_services_auth_release", "JSON_KEY_CRED_PROPS", "getJSON_KEY_CRED_PROPS$credentials_play_services_auth_release", "Ljava/util/LinkedHashMap;", "Lo0000OOO/OooO0o0;", "Lkotlin/collections/LinkedHashMap;", "orderedErrorCodeToExceptions", "Ljava/util/LinkedHashMap;", "getOrderedErrorCodeToExceptions$credentials_play_services_auth_release", "()Ljava/util/LinkedHashMap;", "FLAGS", "I", "TAG", "credentials-play-services-auth_release"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
            this();
        }

        private final byte[] getChallenge(JSONObject json) throws JSONException {
            String challengeB64 = json.optString(getJSON_KEY_CHALLENGE$credentials_play_services_auth_release(), "");
            OooOOO0.OooO0o(challengeB64, "challengeB64");
            if (challengeB64.length() != 0) {
                return b64Decode(challengeB64);
            }
            throw new JSONException("Challenge not found in request or is unexpectedly empty");
        }

        /* JADX INFO: renamed from: addAuthenticatorAttestationResponse$credentials_play_services_auth_release */
        public final void m18x55ac6fce(byte[] clientDataJSON, byte[] attestationObject, String[] transportArray, JSONObject json) throws JSONException {
            OooOOO0.OooO0oO(clientDataJSON, "clientDataJSON");
            OooOOO0.OooO0oO(attestationObject, "attestationObject");
            OooOOO0.OooO0oO(transportArray, "transportArray");
            OooOOO0.OooO0oO(json, "json");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(getJSON_KEY_CLIENT_DATA$credentials_play_services_auth_release(), b64Encode(clientDataJSON));
            jSONObject.put(m20x54c9ae06(), b64Encode(attestationObject));
            jSONObject.put(getJSON_KEY_TRANSPORTS$credentials_play_services_auth_release(), new JSONArray(transportArray));
            json.put(getJSON_KEY_RESPONSE$credentials_play_services_auth_release(), jSONObject);
        }

        public final byte[] b64Decode(String str) {
            OooOOO0.OooO0oO(str, "str");
            byte[] bArrDecode = Base64.decode(str, 11);
            OooOOO0.OooO0o(bArrDecode, "decode(str, FLAGS)");
            return bArrDecode;
        }

        public final String b64Encode(byte[] data) {
            OooOOO0.OooO0oO(data, "data");
            String strEncodeToString = Base64.encodeToString(data, 11);
            OooOOO0.OooO0o(strEncodeToString, "encodeToString(data, FLAGS)");
            return strEncodeToString;
        }

        /* JADX INFO: renamed from: beginSignInPublicKeyCredentialResponseContainsError$credentials_play_services_auth_release */
        public final OooOO0O m19x9b91fc47(ErrorCode code, String msg) {
            OooOOO0.OooO0oO(code, "code");
            AbstractC24199OooO0o0 abstractC24199OooO0o0 = m31x717581f0().get(code);
            return abstractC24199OooO0o0 == null ? new C24218OooO0OO(new C24214OooOoo0(), com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("unknown fido gms exception - ", msg)) : (code == ErrorCode.CONSTRAINT_ERR && msg != null && C33599OooOo0O.OooOoOO(msg, "Unable to get sync account", false)) ? new o0000OO.OooO("Passkey retrieval was cancelled by the user.") : new C24218OooO0OO(abstractC24199OooO0o0, msg);
        }

        public final boolean checkAlgSupported(int alg) {
            try {
                COSEAlgorithmIdentifier.fromCoseValue(alg);
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }

        public final PublicKeyCredentialCreationOptions convert(o0000OO0.OooO0o request) {
            OooOOO0.OooO0oO(request, "request");
            return convertJSON$credentials_play_services_auth_release(new JSONObject((String) null));
        }

        public final PublicKeyCredentialCreationOptions convertJSON$credentials_play_services_auth_release(JSONObject json) throws JSONException, C24216OooO00o {
            OooOOO0.OooO0oO(json, "json");
            PublicKeyCredentialCreationOptions.Builder builder = new PublicKeyCredentialCreationOptions.Builder();
            m34x2d055f1c(json, builder);
            parseRequiredRpAndParams$credentials_play_services_auth_release(json, builder);
            m33x81bb96da(json, builder);
            parseOptionalTimeout$credentials_play_services_auth_release(json, builder);
            m32x4e596641(json, builder);
            parseOptionalExtensions$credentials_play_services_auth_release(json, builder);
            PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptionsBuild = builder.build();
            OooOOO0.OooO0o(publicKeyCredentialCreationOptionsBuild, "builder.build()");
            return publicKeyCredentialCreationOptionsBuild;
        }

        public final BeginSignInRequest.PasskeyJsonRequestOptions convertToPlayAuthPasskeyJsonRequest(C24196OoooO0O option) {
            OooOOO0.OooO0oO(option, "option");
            BeginSignInRequest.PasskeyJsonRequestOptions passkeyJsonRequestOptionsBuild = new BeginSignInRequest.PasskeyJsonRequestOptions.Builder().setSupported(true).setRequestJson(option.f81447OooO00o).build();
            OooOOO0.OooO0o(passkeyJsonRequestOptionsBuild, "Builder()\n        .setSu…estJson)\n        .build()");
            return passkeyJsonRequestOptionsBuild;
        }

        public final BeginSignInRequest.PasskeysRequestOptions convertToPlayAuthPasskeyRequest(C24196OoooO0O option) throws JSONException {
            OooOOO0.OooO0oO(option, "option");
            JSONObject jSONObject = new JSONObject(option.f81447OooO00o);
            String rpId = jSONObject.optString(getJSON_KEY_RPID$credentials_play_services_auth_release(), "");
            OooOOO0.OooO0o(rpId, "rpId");
            if (rpId.length() == 0) {
                throw new JSONException("GetPublicKeyCredentialOption - rpId not specified in the request or is unexpectedly empty");
            }
            BeginSignInRequest.PasskeysRequestOptions passkeysRequestOptionsBuild = new BeginSignInRequest.PasskeysRequestOptions.Builder().setSupported(true).setRpId(rpId).setChallenge(getChallenge(jSONObject)).build();
            OooOOO0.OooO0o(passkeysRequestOptionsBuild, "Builder()\n        .setSu…allenge)\n        .build()");
            return passkeysRequestOptionsBuild;
        }

        public final String getJSON_KEY_ALG$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_ALG;
        }

        public final String getJSON_KEY_APPID$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_APPID;
        }

        public final String getJSON_KEY_ATTESTATION$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_ATTESTATION;
        }

        /* JADX INFO: renamed from: getJSON_KEY_ATTESTATION_OBJ$credentials_play_services_auth_release */
        public final String m20x54c9ae06() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_ATTESTATION_OBJ;
        }

        /* JADX INFO: renamed from: getJSON_KEY_AUTH_ATTACHMENT$credentials_play_services_auth_release */
        public final String m21x4cbca474() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_AUTH_ATTACHMENT;
        }

        public final String getJSON_KEY_AUTH_DATA$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_AUTH_DATA;
        }

        /* JADX INFO: renamed from: getJSON_KEY_AUTH_SELECTION$credentials_play_services_auth_release */
        public final String m22xf055c137() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_AUTH_SELECTION;
        }

        public final String getJSON_KEY_CHALLENGE$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_CHALLENGE;
        }

        public final String getJSON_KEY_CLIENT_DATA$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_CLIENT_DATA;
        }

        /* JADX INFO: renamed from: getJSON_KEY_CLIENT_EXTENSION_RESULTS$credentials_play_services_auth_release */
        public final String m23xa1a1c52a() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_CLIENT_EXTENSION_RESULTS;
        }

        public final String getJSON_KEY_CRED_PROPS$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_CRED_PROPS;
        }

        public final String getJSON_KEY_DISPLAY_NAME$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_DISPLAY_NAME;
        }

        /* JADX INFO: renamed from: getJSON_KEY_EXCLUDE_CREDENTIALS$credentials_play_services_auth_release */
        public final String m24x174cd597() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_EXCLUDE_CREDENTIALS;
        }

        public final String getJSON_KEY_EXTENSTIONS$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_EXTENSTIONS;
        }

        public final String getJSON_KEY_ICON$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_ICON;
        }

        public final String getJSON_KEY_ID$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_ID;
        }

        /* JADX INFO: renamed from: getJSON_KEY_KEY_PROTECTION_TYPE$credentials_play_services_auth_release */
        public final String m25x1277f26e() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_KEY_PROTECTION_TYPE;
        }

        /* JADX INFO: renamed from: getJSON_KEY_MATCHER_PROTECTION_TYPE$credentials_play_services_auth_release */
        public final String m26x42bd95bb() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_MATCHER_PROTECTION_TYPE;
        }

        public final String getJSON_KEY_NAME$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_NAME;
        }

        /* JADX INFO: renamed from: getJSON_KEY_PUB_KEY_CRED_PARAMS$credentials_play_services_auth_release */
        public final String m27x11a7ad79() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_PUB_KEY_CRED_PARAMS;
        }

        public final String getJSON_KEY_RAW_ID$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RAW_ID;
        }

        /* JADX INFO: renamed from: getJSON_KEY_REQUIRE_RES_KEY$credentials_play_services_auth_release */
        public final String m28xe9a27208() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_REQUIRE_RES_KEY;
        }

        public final String getJSON_KEY_RESPONSE$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE;
        }

        public final String getJSON_KEY_RES_KEY$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RES_KEY;
        }

        public final String getJSON_KEY_RK$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RK;
        }

        public final String getJSON_KEY_RP$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RP;
        }

        public final String getJSON_KEY_RPID$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RPID;
        }

        public final String getJSON_KEY_SIGNATURE$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_SIGNATURE;
        }

        /* JADX INFO: renamed from: getJSON_KEY_THIRD_PARTY_PAYMENT$credentials_play_services_auth_release */
        public final String m29x55d9bf39() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_THIRD_PARTY_PAYMENT;
        }

        public final String getJSON_KEY_TIMEOUT$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT;
        }

        public final String getJSON_KEY_TRANSPORTS$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_TRANSPORTS;
        }

        public final String getJSON_KEY_TYPE$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_TYPE;
        }

        public final String getJSON_KEY_USER$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_USER;
        }

        public final String getJSON_KEY_USER_HANDLE$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_USER_HANDLE;
        }

        /* JADX INFO: renamed from: getJSON_KEY_USER_VERIFICATION_METHOD$credentials_play_services_auth_release */
        public final String m30xd8020d7b() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_USER_VERIFICATION_METHOD;
        }

        /* JADX INFO: renamed from: getOrderedErrorCodeToExceptions$credentials_play_services_auth_release */
        public final LinkedHashMap<ErrorCode, AbstractC24199OooO0o0> m31x717581f0() {
            return PublicKeyCredentialControllerUtility.orderedErrorCodeToExceptions;
        }

        /* JADX INFO: renamed from: parseOptionalAuthenticatorSelection$credentials_play_services_auth_release */
        public final void m32x4e596641(JSONObject json, PublicKeyCredentialCreationOptions.Builder builder) throws JSONException {
            OooOOO0.OooO0oO(json, "json");
            OooOOO0.OooO0oO(builder, "builder");
            if (json.has(m22xf055c137())) {
                JSONObject jSONObject = json.getJSONObject(m22xf055c137());
                AuthenticatorSelectionCriteria.Builder builder2 = new AuthenticatorSelectionCriteria.Builder();
                boolean zOptBoolean = jSONObject.optBoolean(m28xe9a27208(), false);
                String residentKey = jSONObject.optString(getJSON_KEY_RES_KEY$credentials_play_services_auth_release(), "");
                OooOOO0.OooO0o(residentKey, "residentKey");
                builder2.setRequireResidentKey(Boolean.valueOf(zOptBoolean)).setResidentKeyRequirement(residentKey.length() > 0 ? ResidentKeyRequirement.fromString(residentKey) : null);
                String authenticatorAttachmentString = jSONObject.optString(m21x4cbca474(), "");
                OooOOO0.OooO0o(authenticatorAttachmentString, "authenticatorAttachmentString");
                if (authenticatorAttachmentString.length() > 0) {
                    builder2.setAttachment(Attachment.fromString(authenticatorAttachmentString));
                }
                builder.setAuthenticatorSelection(builder2.build());
            }
        }

        public final void parseOptionalExtensions$credentials_play_services_auth_release(JSONObject json, PublicKeyCredentialCreationOptions.Builder builder) throws JSONException {
            OooOOO0.OooO0oO(json, "json");
            OooOOO0.OooO0oO(builder, "builder");
            if (json.has(getJSON_KEY_EXTENSTIONS$credentials_play_services_auth_release())) {
                JSONObject jSONObject = json.getJSONObject(getJSON_KEY_EXTENSTIONS$credentials_play_services_auth_release());
                AuthenticationExtensions.Builder builder2 = new AuthenticationExtensions.Builder();
                String appIdExtension = jSONObject.optString(getJSON_KEY_APPID$credentials_play_services_auth_release(), "");
                OooOOO0.OooO0o(appIdExtension, "appIdExtension");
                if (appIdExtension.length() > 0) {
                    builder2.setFido2Extension(new FidoAppIdExtension(appIdExtension));
                }
                if (jSONObject.optBoolean(m29x55d9bf39(), false)) {
                    builder2.setGoogleThirdPartyPaymentExtension(new GoogleThirdPartyPaymentExtension(true));
                }
                if (jSONObject.optBoolean("uvm", false)) {
                    builder2.setUserVerificationMethodExtension(new UserVerificationMethodExtension(true));
                }
                builder.setAuthenticationExtensions(builder2.build());
            }
        }

        public final void parseOptionalTimeout$credentials_play_services_auth_release(JSONObject json, PublicKeyCredentialCreationOptions.Builder builder) {
            OooOOO0.OooO0oO(json, "json");
            OooOOO0.OooO0oO(builder, "builder");
            if (json.has(getJSON_KEY_TIMEOUT$credentials_play_services_auth_release())) {
                builder.setTimeoutSeconds(Double.valueOf(json.getLong(getJSON_KEY_TIMEOUT$credentials_play_services_auth_release()) / ((double) 1000)));
            }
        }

        /* JADX INFO: renamed from: parseOptionalWithRequiredDefaultsAttestationAndExcludeCredentials$credentials_play_services_auth_release */
        public final void m33x81bb96da(JSONObject json, PublicKeyCredentialCreationOptions.Builder builder) throws JSONException, C24216OooO00o {
            ArrayList arrayList;
            OooOOO0.OooO0oO(json, "json");
            OooOOO0.OooO0oO(builder, "builder");
            ArrayList arrayList2 = new ArrayList();
            if (json.has(m24x174cd597())) {
                JSONArray jSONArray = json.getJSONArray(m24x174cd597());
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    String string = jSONObject.getString(getJSON_KEY_ID$credentials_play_services_auth_release());
                    OooOOO0.OooO0o(string, "descriptorJSON.getString(JSON_KEY_ID)");
                    byte[] bArrB64Decode = b64Decode(string);
                    String descriptorType = jSONObject.getString(getJSON_KEY_TYPE$credentials_play_services_auth_release());
                    OooOOO0.OooO0o(descriptorType, "descriptorType");
                    if (descriptorType.length() == 0) {
                        throw new JSONException("PublicKeyCredentialDescriptor type value is not found or unexpectedly empty");
                    }
                    if (bArrB64Decode.length == 0) {
                        throw new JSONException("PublicKeyCredentialDescriptor id value is not found or unexpectedly empty");
                    }
                    if (jSONObject.has(getJSON_KEY_TRANSPORTS$credentials_play_services_auth_release())) {
                        arrayList = new ArrayList();
                        JSONArray jSONArray2 = jSONObject.getJSONArray(getJSON_KEY_TRANSPORTS$credentials_play_services_auth_release());
                        int length2 = jSONArray2.length();
                        for (int i2 = 0; i2 < length2; i2++) {
                            try {
                                Transport transportFromString = Transport.fromString(jSONArray2.getString(i2));
                                OooOOO0.OooO0o(transportFromString, "fromString(descriptorTransports.getString(j))");
                                arrayList.add(transportFromString);
                            } catch (Transport.UnsupportedTransportException e) {
                                throw new C24216OooO00o(new o0000OOO.OooO0o(), e.getMessage());
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                    arrayList2.add(new PublicKeyCredentialDescriptor(descriptorType, bArrB64Decode, arrayList));
                }
            }
            builder.setExcludeList(arrayList2);
            String attestationString = json.optString(getJSON_KEY_ATTESTATION$credentials_play_services_auth_release(), "none");
            OooOOO0.OooO0o(attestationString, "attestationString");
            builder.setAttestationConveyancePreference(AttestationConveyancePreference.fromString(attestationString.length() != 0 ? attestationString : "none"));
        }

        /* JADX INFO: renamed from: parseRequiredChallengeAndUser$credentials_play_services_auth_release */
        public final void m34x2d055f1c(JSONObject json, PublicKeyCredentialCreationOptions.Builder builder) throws JSONException {
            OooOOO0.OooO0oO(json, "json");
            OooOOO0.OooO0oO(builder, "builder");
            builder.setChallenge(getChallenge(json));
            JSONObject jSONObject = json.getJSONObject(getJSON_KEY_USER$credentials_play_services_auth_release());
            String string = jSONObject.getString(getJSON_KEY_ID$credentials_play_services_auth_release());
            OooOOO0.OooO0o(string, "user.getString(JSON_KEY_ID)");
            byte[] bArrB64Decode = b64Decode(string);
            String userName = jSONObject.getString(getJSON_KEY_NAME$credentials_play_services_auth_release());
            String displayName = jSONObject.getString(getJSON_KEY_DISPLAY_NAME$credentials_play_services_auth_release());
            String strOptString = jSONObject.optString(getJSON_KEY_ICON$credentials_play_services_auth_release(), "");
            OooOOO0.OooO0o(displayName, "displayName");
            if (displayName.length() == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions UserEntity missing displayName or they are unexpectedly empty");
            }
            if (bArrB64Decode.length == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions UserEntity missing user id or they are unexpectedly empty");
            }
            OooOOO0.OooO0o(userName, "userName");
            if (userName.length() == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions UserEntity missing user name or they are unexpectedly empty");
            }
            builder.setUser(new PublicKeyCredentialUserEntity(bArrB64Decode, userName, strOptString, displayName));
        }

        public final void parseRequiredRpAndParams$credentials_play_services_auth_release(JSONObject json, PublicKeyCredentialCreationOptions.Builder builder) throws JSONException {
            OooOOO0.OooO0oO(json, "json");
            OooOOO0.OooO0oO(builder, "builder");
            JSONObject jSONObject = json.getJSONObject(getJSON_KEY_RP$credentials_play_services_auth_release());
            String rpId = jSONObject.getString(getJSON_KEY_ID$credentials_play_services_auth_release());
            String rpName = jSONObject.optString(getJSON_KEY_NAME$credentials_play_services_auth_release(), "");
            String strOptString = jSONObject.optString(getJSON_KEY_ICON$credentials_play_services_auth_release(), "");
            OooOOO0.OooO0Oo(strOptString);
            if (strOptString.length() == 0) {
                strOptString = null;
            }
            OooOOO0.OooO0o(rpName, "rpName");
            if (rpName.length() == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions rp name is missing or unexpectedly empty");
            }
            OooOOO0.OooO0o(rpId, "rpId");
            if (rpId.length() == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions rp ID is missing or unexpectedly empty");
            }
            builder.setRp(new PublicKeyCredentialRpEntity(rpId, rpName, strOptString));
            JSONArray jSONArray = json.getJSONArray(m27x11a7ad79());
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                int i2 = (int) jSONObject2.getLong(getJSON_KEY_ALG$credentials_play_services_auth_release());
                String typeParam = jSONObject2.optString(getJSON_KEY_TYPE$credentials_play_services_auth_release(), "");
                OooOOO0.OooO0o(typeParam, "typeParam");
                if (typeParam.length() == 0) {
                    throw new JSONException("PublicKeyCredentialCreationOptions PublicKeyCredentialParameter type missing or unexpectedly empty");
                }
                if (checkAlgSupported(i2)) {
                    arrayList.add(new PublicKeyCredentialParameters(typeParam, i2));
                }
            }
            builder.setParameters(arrayList);
        }

        public final o0000OO.OooO0o publicKeyCredentialResponseContainsError(PublicKeyCredential cred) {
            OooOOO0.OooO0oO(cred, "cred");
            AuthenticatorResponse response = cred.getResponse();
            OooOOO0.OooO0o(response, "cred.response");
            if (!(response instanceof AuthenticatorErrorResponse)) {
                return null;
            }
            AuthenticatorErrorResponse authenticatorErrorResponse = (AuthenticatorErrorResponse) response;
            ErrorCode errorCode = authenticatorErrorResponse.getErrorCode();
            OooOOO0.OooO0o(errorCode, "authenticatorResponse.errorCode");
            AbstractC24199OooO0o0 abstractC24199OooO0o0 = m31x717581f0().get(errorCode);
            String errorMessage = authenticatorErrorResponse.getErrorMessage();
            return abstractC24199OooO0o0 == null ? new C24216OooO00o(new C24214OooOoo0(), com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("unknown fido gms exception - ", errorMessage)) : (errorCode == ErrorCode.CONSTRAINT_ERR && errorMessage != null && C33599OooOo0O.OooOoOO(errorMessage, "Unable to get sync account", false)) ? new C24159OooO0o0("Passkey registration was cancelled by the user.") : new C24216OooO00o(abstractC24199OooO0o0, errorMessage);
        }

        public final String toAssertPasskeyResponse(SignInCredential cred) throws OooOO0O {
            OooOOO0.OooO0oO(cred, "cred");
            JSONObject jSONObject = new JSONObject();
            PublicKeyCredential publicKeyCredential = cred.getPublicKeyCredential();
            AuthenticatorResponse response = publicKeyCredential != null ? publicKeyCredential.getResponse() : null;
            OooOOO0.OooO0Oo(response);
            if (response instanceof AuthenticatorErrorResponse) {
                AuthenticatorErrorResponse authenticatorErrorResponse = (AuthenticatorErrorResponse) response;
                ErrorCode errorCode = authenticatorErrorResponse.getErrorCode();
                OooOOO0.OooO0o(errorCode, "authenticatorResponse.errorCode");
                throw m19x9b91fc47(errorCode, authenticatorErrorResponse.getErrorMessage());
            }
            if (!(response instanceof AuthenticatorAssertionResponse)) {
                Log.e(PublicKeyCredentialControllerUtility.TAG, "AuthenticatorResponse expected assertion response but got: ".concat(response.getClass().getName()));
                String string = jSONObject.toString();
                OooOOO0.OooO0o(string, "json.toString()");
                return string;
            }
            try {
                String json = publicKeyCredential.toJson();
                OooOOO0.OooO0o(json, "publicKeyCred.toJson()");
                return json;
            } catch (Throwable th) {
                throw new OooOOO("The PublicKeyCredential response json had an unexpected exception when parsing: " + th.getMessage());
            }
        }

        private Companion() {
        }
    }

    static {
        C32443OooOOO[] c32443OooOOOArr = {new C32443OooOOO(ErrorCode.UNKNOWN_ERR, new C24214OooOoo0()), new C32443OooOOO(ErrorCode.ABORT_ERR, new o0000OOO.OooO00o()), new C32443OooOOO(ErrorCode.ATTESTATION_NOT_PRIVATE_ERR, new C24204OooOOo()), new C32443OooOOO(ErrorCode.CONSTRAINT_ERR, new o0000OOO.OooO0O0()), new C32443OooOOO(ErrorCode.DATA_ERR, new C24198OooO0Oo()), new C32443OooOOO(ErrorCode.INVALID_STATE_ERR, new C24202OooOO0o()), new C32443OooOOO(ErrorCode.ENCODING_ERR, new o0000OOO.OooO0o()), new C32443OooOOO(ErrorCode.NETWORK_ERR, new o0000OOO.OooOOO()), new C32443OooOOO(ErrorCode.NOT_ALLOWED_ERR, new C24203OooOOOo()), new C32443OooOOO(ErrorCode.NOT_SUPPORTED_ERR, new C24206OooOOoo()), new C32443OooOOO(ErrorCode.SECURITY_ERR, new OooOo()), new C32443OooOOO(ErrorCode.TIMEOUT_ERR, new C24210OooOoO())};
        LinkedHashMap<ErrorCode, AbstractC24199OooO0o0> linkedHashMap = new LinkedHashMap<>(Oooo0.OooO0Oo(12));
        C34444Oooo0O0.OooOO0O(linkedHashMap, c32443OooOOOArr);
        orderedErrorCodeToExceptions = linkedHashMap;
    }

    public static final PublicKeyCredentialCreationOptions convert(o0000OO0.OooO0o oooO0o) {
        return INSTANCE.convert(oooO0o);
    }
}
