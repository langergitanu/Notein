package com.microsoft.identity.common.internal.fido;

import android.util.Base64;
import com.google.android.gms.fido.u2f.api.common.ClientData;
import com.microsoft.identity.common.internal.util.CommonMoshiJsonAdapter;
import com.microsoft.identity.common.java.constants.FidoConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import oO0o0O0o.C33580OooO00o;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, m80612d2 = {"Lcom/microsoft/identity/common/internal/fido/WebAuthnJsonUtil;", "", "()V", "Companion", "common_distRelease"}, m80613k = 1, m80614mv = {1, 7, 1}, m80616xi = 48)
public final class WebAuthnJsonUtil {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(m80611d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J.\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\u0004J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004J\n\u0010\f\u001a\u00020\u0004*\u00020\u0004¨\u0006\r"}, m80612d2 = {"Lcom/microsoft/identity/common/internal/fido/WebAuthnJsonUtil$Companion;", "", "()V", "createJsonAuthRequest", "", ClientData.KEY_CHALLENGE, "relyingPartyIdentifier", "allowedCredentials", "", "userVerificationPolicy", "extractAuthenticatorAssertionResponseJson", "fullResponseJson", "base64UrlEncoded", "common_distRelease"}, m80613k = 1, m80614mv = {1, 7, 1}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
            this();
        }

        public final String base64UrlEncoded(String str) {
            OooOOO0.OooO0oO(str, "<this>");
            byte[] bytes = str.getBytes(C33580OooO00o.f121231OooO0O0);
            OooOOO0.OooO0o(bytes, "this as java.lang.String).getBytes(charset)");
            String strEncodeToString = Base64.encodeToString(bytes, 11);
            OooOOO0.OooO0o(strEncodeToString, "encodeToString(data, (Ba…AP or Base64.NO_PADDING))");
            return strEncodeToString;
        }

        public final String createJsonAuthRequest(String challenge, String relyingPartyIdentifier, List<String> allowedCredentials, String userVerificationPolicy) {
            OooOOO0.OooO0oO(challenge, "challenge");
            OooOOO0.OooO0oO(relyingPartyIdentifier, "relyingPartyIdentifier");
            OooOOO0.OooO0oO(userVerificationPolicy, "userVerificationPolicy");
            ArrayList arrayList = new ArrayList();
            if (allowedCredentials != null) {
                Iterator<String> it = allowedCredentials.iterator();
                while (it.hasNext()) {
                    arrayList.add(new PublicKeyCredentialDescriptor("public-key", it.next()));
                }
            }
            String json = new CommonMoshiJsonAdapter().toJson(new PublicKeyCredentialRequestOptions(base64UrlEncoded(challenge), relyingPartyIdentifier, arrayList, userVerificationPolicy));
            OooOOO0.OooO0o(json, "CommonMoshiJsonAdapter().toJson(options)");
            return json;
        }

        public final String extractAuthenticatorAssertionResponseJson(String fullResponseJson) throws JSONException {
            OooOOO0.OooO0oO(fullResponseJson, "fullResponseJson");
            JSONObject jSONObject = new JSONObject(fullResponseJson);
            JSONObject jSONObject2 = jSONObject.getJSONObject(FidoConstants.WEBAUTHN_AUTHENTICATION_ASSERTION_RESPONSE_JSON_KEY);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("id", jSONObject.get("id"));
            jSONObject3.put(FidoConstants.WEBAUTHN_RESPONSE_AUTHENTICATOR_DATA_JSON_KEY, jSONObject2.get(FidoConstants.WEBAUTHN_RESPONSE_AUTHENTICATOR_DATA_JSON_KEY));
            jSONObject3.put(FidoConstants.WEBAUTHN_RESPONSE_CLIENT_DATA_JSON_KEY, jSONObject2.get(FidoConstants.WEBAUTHN_RESPONSE_CLIENT_DATA_JSON_KEY));
            jSONObject3.put(FidoConstants.WEBAUTHN_RESPONSE_SIGNATURE_JSON_KEY, jSONObject2.get(FidoConstants.WEBAUTHN_RESPONSE_SIGNATURE_JSON_KEY));
            jSONObject3.put(FidoConstants.WEBAUTHN_RESPONSE_USER_HANDLE_JSON_KEY, jSONObject2.get(FidoConstants.WEBAUTHN_RESPONSE_USER_HANDLE_JSON_KEY));
            String string = jSONObject3.toString();
            OooOOO0.OooO0o(string, "assertionResult.toString()");
            return string;
        }

        private Companion() {
        }
    }
}
