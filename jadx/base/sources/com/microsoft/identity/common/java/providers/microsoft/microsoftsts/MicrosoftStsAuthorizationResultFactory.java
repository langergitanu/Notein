package com.microsoft.identity.common.java.providers.microsoft.microsoftsts;

import androidx.concurrent.futures.OooO00o;
import com.aspose.slides.internal.p332p7.OooO0o;
import com.microsoft.identity.common.java.logging.Logger;
import com.microsoft.identity.common.java.providers.microsoft.MicrosoftAuthorizationErrorResponse;
import com.microsoft.identity.common.java.providers.oauth2.AuthorizationResult;
import com.microsoft.identity.common.java.providers.oauth2.AuthorizationResultFactory;
import com.microsoft.identity.common.java.providers.oauth2.AuthorizationStatus;
import com.microsoft.identity.common.java.util.StringUtil;
import com.microsoft.identity.common.java.util.UrlUtil;
import java.net.URI;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class MicrosoftStsAuthorizationResultFactory extends AuthorizationResultFactory<MicrosoftStsAuthorizationResult, MicrosoftStsAuthorizationRequest> {
    private static final String TAG = "MicrosoftStsAuthorizationResultFactory";

    @Override // com.microsoft.identity.common.java.providers.oauth2.AuthorizationResultFactory
    public /* bridge */ /* synthetic */ AuthorizationResult validateAndCreateAuthorizationResult(Map map, String str, String str2) {
        return validateAndCreateAuthorizationResult((Map<String, String>) map, str, str2);
    }

    @Override // com.microsoft.identity.common.java.providers.oauth2.AuthorizationResultFactory
    public MicrosoftStsAuthorizationResult createAuthorizationResultWithErrorResponse(AuthorizationStatus authorizationStatus, String str, String str2) {
        if (str == null) {
            throw new NullPointerException("error is marked non-null but is null");
        }
        String str3 = TAG + ":createAuthorizationResultWithErrorResponse";
        Logger.info(str3, "Error is returned from webview redirect");
        Logger.infoPII(str3, "error: " + str + " errorDescription: " + str2);
        return new MicrosoftStsAuthorizationResult(authorizationStatus, new MicrosoftStsAuthorizationErrorResponse(str, str2));
    }

    @Override // com.microsoft.identity.common.java.providers.oauth2.AuthorizationResultFactory
    public MicrosoftStsAuthorizationResult parseRedirectUriAndCreateAuthorizationResult(URI uri, String str) {
        if (uri == null) {
            throw new NullPointerException("redirectUri is marked non-null but is null");
        }
        String strOooO0OO = OooO00o.OooO0OO(new StringBuilder(), TAG, ":parseUrlAndCreateAuthorizationResponse");
        Map<String, String> parameters = UrlUtil.getParameters(uri);
        if (!parameters.isEmpty()) {
            return parameters.containsKey("code") ? validateAndCreateAuthorizationResult(parameters, str, (String) null) : parameters.containsKey("error") ? createAuthorizationResultWithErrorResponse(AuthorizationStatus.FAIL, parameters.get("error"), parameters.get("error_subcode"), parameters.get("error_description")) : createAuthorizationResultWithErrorResponse(AuthorizationStatus.FAIL, MicrosoftAuthorizationErrorResponse.AUTHORIZATION_FAILED, MicrosoftAuthorizationErrorResponse.AUTHORIZATION_SERVER_INVALID_RESPONSE);
        }
        Logger.warn(strOooO0OO, "Invalid server response, empty query string from the webview redirect.");
        return createAuthorizationResultWithErrorResponse(AuthorizationStatus.FAIL, MicrosoftAuthorizationErrorResponse.AUTHORIZATION_FAILED, MicrosoftAuthorizationErrorResponse.AUTHORIZATION_SERVER_INVALID_RESPONSE);
    }

    @Override // com.microsoft.identity.common.java.providers.oauth2.AuthorizationResultFactory
    public MicrosoftStsAuthorizationResult validateAndCreateAuthorizationResult(Map<String, String> map, String str, String str2) {
        if (map == null) {
            throw new NullPointerException("urlParameters is marked non-null but is null");
        }
        String strOooO0OO = OooO00o.OooO0OO(new StringBuilder(), TAG, ":validateAndCreateAuthorizationResult");
        String str3 = map.get("state");
        String str4 = map.get("code");
        if (StringUtil.isNullOrEmpty(str3)) {
            Logger.warn(strOooO0OO, "State parameter is not returned from the webview redirect.");
            return createAuthorizationResultWithErrorResponse(AuthorizationStatus.FAIL, "state_mismatch", MicrosoftAuthorizationErrorResponse.STATE_NOT_RETURNED);
        }
        if (StringUtil.isNullOrEmpty(str) || !str.equals(str3)) {
            Logger.warn(strOooO0OO, "State parameter returned from the redirect is not same as the one sent in request.");
            return createAuthorizationResultWithErrorResponse(AuthorizationStatus.FAIL, "state_mismatch", MicrosoftAuthorizationErrorResponse.STATE_NOT_THE_SAME);
        }
        Logger.info(strOooO0OO, "Auth code is successfully returned from webview redirect.");
        return new MicrosoftStsAuthorizationResult(AuthorizationStatus.SUCCESS, new MicrosoftStsAuthorizationResponse(str4, str3, map));
    }

    private MicrosoftStsAuthorizationResult createAuthorizationResultWithErrorResponse(AuthorizationStatus authorizationStatus, String str, String str2, String str3) {
        String str4 = TAG + ":createAuthorizationResultWithErrorResponse";
        Logger.info(str4, "Error is returned from webview redirect");
        StringBuilder sbOooO0O0 = OooO0o.OooO0O0("error: ", str, "error subcode:", str2, " errorDescription: ");
        sbOooO0O0.append(str3);
        Logger.infoPII(str4, sbOooO0O0.toString());
        return new MicrosoftStsAuthorizationResult(authorizationStatus, new MicrosoftStsAuthorizationErrorResponse(str, str2, str3));
    }
}
