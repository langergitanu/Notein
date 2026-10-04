package com.microsoft.identity.common.java.providers.microsoft.azureactivedirectory;

import androidx.concurrent.futures.OooO00o;
import com.aspose.slides.internal.p332p7.C22237OooO0o0;
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
public class AzureActiveDirectoryAuthorizationResultFactory extends AuthorizationResultFactory<AzureActiveDirectoryAuthorizationResult, AzureActiveDirectoryAuthorizationRequest> {
    private static final String TAG = "AzureActiveDirectoryAuthorizationResultFactory";

    @Override // com.microsoft.identity.common.java.providers.oauth2.AuthorizationResultFactory
    public /* bridge */ /* synthetic */ AuthorizationResult validateAndCreateAuthorizationResult(Map map, String str, String str2) {
        return validateAndCreateAuthorizationResult((Map<String, String>) map, str, str2);
    }

    @Override // com.microsoft.identity.common.java.providers.oauth2.AuthorizationResultFactory
    public AzureActiveDirectoryAuthorizationResult createAuthorizationResultWithErrorResponse(AuthorizationStatus authorizationStatus, String str, String str2) {
        return new AzureActiveDirectoryAuthorizationResult(authorizationStatus, new AzureActiveDirectoryAuthorizationErrorResponse(str, str2));
    }

    @Override // com.microsoft.identity.common.java.providers.oauth2.AuthorizationResultFactory
    public AzureActiveDirectoryAuthorizationResult parseRedirectUriAndCreateAuthorizationResult(URI uri, String str) {
        Map<String, String> parameters = UrlUtil.getParameters(uri);
        if (parameters == null || parameters.isEmpty()) {
            Logger.warn(TAG, "Invalid server response, empty query string from the webview redirect.");
            return createAuthorizationResultWithErrorResponse(AuthorizationStatus.FAIL, MicrosoftAuthorizationErrorResponse.AUTHORIZATION_FAILED, MicrosoftAuthorizationErrorResponse.AUTHORIZATION_SERVER_INVALID_RESPONSE);
        }
        String str2 = parameters.get("correlation_id");
        return parameters.containsKey("code") ? validateAndCreateAuthorizationResult(parameters, str, str2) : parameters.containsKey("error") ? createAuthorizationResultWithErrorResponse(AuthorizationStatus.FAIL, parameters.get("error"), parameters.get("error_description"), parameters.get("error_codes"), str2) : createAuthorizationResultWithErrorResponse(AuthorizationStatus.FAIL, MicrosoftAuthorizationErrorResponse.AUTHORIZATION_FAILED, MicrosoftAuthorizationErrorResponse.AUTHORIZATION_SERVER_INVALID_RESPONSE);
    }

    @Override // com.microsoft.identity.common.java.providers.oauth2.AuthorizationResultFactory
    public AzureActiveDirectoryAuthorizationResult validateAndCreateAuthorizationResult(Map<String, String> map, String str, String str2) {
        String strOooO0OO = OooO00o.OooO0OO(new StringBuilder(), TAG, ":validateAndCreateAuthorizationResult");
        String str3 = map.get("state");
        String str4 = map.get("code");
        if (StringUtil.isNullOrEmpty(str3)) {
            Logger.warn(strOooO0OO, str2, "State parameter is not returned from the webview redirect.");
            return createAuthorizationResultWithErrorResponse(AuthorizationStatus.FAIL, "state_mismatch", MicrosoftAuthorizationErrorResponse.STATE_NOT_RETURNED);
        }
        if (StringUtil.isNullOrEmpty(str) || !str.equals(str3)) {
            Logger.warn(strOooO0OO, str2, "State parameter returned from the redirect is not same as the one sent in request.");
            return createAuthorizationResultWithErrorResponse(AuthorizationStatus.FAIL, "state_mismatch", MicrosoftAuthorizationErrorResponse.STATE_NOT_THE_SAME);
        }
        Logger.info(strOooO0OO, str2, "Auth code is successfully returned from webview redirect.");
        AzureActiveDirectoryAuthorizationResponse azureActiveDirectoryAuthorizationResponse = new AzureActiveDirectoryAuthorizationResponse(str4, str3);
        azureActiveDirectoryAuthorizationResponse.setCorrelationId(str2);
        return new AzureActiveDirectoryAuthorizationResult(AuthorizationStatus.SUCCESS, azureActiveDirectoryAuthorizationResponse);
    }

    private AzureActiveDirectoryAuthorizationResult createAuthorizationResultWithErrorResponse(AuthorizationStatus authorizationStatus, String str, String str2, String str3, String str4) {
        String str5 = TAG + ":createAuthorizationResultWithErrorResponse";
        Logger.info(str5, str4, "Error is returned from webview redirect");
        Logger.infoPII(str5, str4, C22237OooO0o0.OooO00o("error: ", str, " errorDescription: ", str2));
        AzureActiveDirectoryAuthorizationErrorResponse azureActiveDirectoryAuthorizationErrorResponse = new AzureActiveDirectoryAuthorizationErrorResponse(str, str2);
        azureActiveDirectoryAuthorizationErrorResponse.setErrorCodes(str3);
        return new AzureActiveDirectoryAuthorizationResult(authorizationStatus, azureActiveDirectoryAuthorizationErrorResponse);
    }
}
