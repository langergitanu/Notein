package com.microsoft.identity.common.java.providers.oauth2;

import androidx.concurrent.futures.OooO00o;
import com.microsoft.identity.common.java.exception.BaseException;
import com.microsoft.identity.common.java.logging.Logger;
import com.microsoft.identity.common.java.providers.RawAuthorizationResult;
import com.microsoft.identity.common.java.providers.microsoft.MicrosoftAuthorizationErrorResponse;
import com.microsoft.identity.common.java.providers.oauth2.AuthorizationRequest;
import com.microsoft.identity.common.java.providers.oauth2.AuthorizationResult;
import com.microsoft.identity.common.java.util.UrlUtil;
import java.net.URI;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public abstract class AuthorizationResultFactory<GenericAuthorizationResult extends AuthorizationResult, GenericAuthorizationRequest extends AuthorizationRequest> {
    private static final String TAG = "AuthorizationResultFactory";

    /* JADX INFO: renamed from: com.microsoft.identity.common.java.providers.oauth2.AuthorizationResultFactory$1 */
    public static /* synthetic */ class C187371 {

        /* JADX INFO: renamed from: $SwitchMap$com$microsoft$identity$common$java$providers$RawAuthorizationResult$ResultCode */
        static final /* synthetic */ int[] f57083x673a98e8;

        static {
            int[] iArr = new int[RawAuthorizationResult.ResultCode.values().length];
            f57083x673a98e8 = iArr;
            try {
                iArr[RawAuthorizationResult.ResultCode.CANCELLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f57083x673a98e8[RawAuthorizationResult.ResultCode.SDK_CANCELLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f57083x673a98e8[RawAuthorizationResult.ResultCode.COMPLETED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f57083x673a98e8[RawAuthorizationResult.ResultCode.NON_OAUTH_ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f57083x673a98e8[RawAuthorizationResult.ResultCode.BROKER_INSTALLATION_TRIGGERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f57083x673a98e8[RawAuthorizationResult.ResultCode.DEVICE_REGISTRATION_REQUIRED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f57083x673a98e8[RawAuthorizationResult.ResultCode.MDM_FLOW.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public GenericAuthorizationResult createAuthorizationResult(RawAuthorizationResult rawAuthorizationResult, GenericAuthorizationRequest genericauthorizationrequest) {
        if (rawAuthorizationResult == null) {
            throw new NullPointerException("data is marked non-null but is null");
        }
        if (genericauthorizationrequest == null) {
            throw new NullPointerException("request is marked non-null but is null");
        }
        String strOooO0OO = OooO00o.OooO0OO(new StringBuilder(), TAG, ":createAuthorizationResult");
        URI authorizationFinalUri = rawAuthorizationResult.getAuthorizationFinalUri();
        switch (C187371.f57083x673a98e8[rawAuthorizationResult.getResultCode().ordinal()]) {
            case 1:
                Logger.info(strOooO0OO, null, "The authorization request was intentionally cancelled.");
                return (GenericAuthorizationResult) createAuthorizationResultWithErrorResponse(AuthorizationStatus.USER_CANCEL, MicrosoftAuthorizationErrorResponse.USER_CANCEL, MicrosoftAuthorizationErrorResponse.USER_CANCELLED_FLOW);
            case 2:
                Logger.info(strOooO0OO, null, "SDK cancelled the authorization request.");
                return (GenericAuthorizationResult) createAuthorizationResultWithErrorResponse(AuthorizationStatus.SDK_CANCEL, MicrosoftAuthorizationErrorResponse.SDK_AUTH_CANCEL, MicrosoftAuthorizationErrorResponse.SDK_CANCELLED_FLOW);
            case 3:
                if (authorizationFinalUri != null) {
                    return (GenericAuthorizationResult) parseRedirectUriAndCreateAuthorizationResult(authorizationFinalUri, genericauthorizationrequest.getState());
                }
                Logger.warn(strOooO0OO, null, "returned URL is null or empty.");
                return (GenericAuthorizationResult) createAuthorizationResultWithErrorResponse(AuthorizationStatus.FAIL, MicrosoftAuthorizationErrorResponse.AUTHORIZATION_FAILED, MicrosoftAuthorizationErrorResponse.AUTHORIZATION_SERVER_INVALID_RESPONSE);
            case 4:
                BaseException exception = rawAuthorizationResult.getException();
                if (exception != null) {
                    return (GenericAuthorizationResult) createAuthorizationResultWithErrorResponse(AuthorizationStatus.FAIL, exception.getErrorCode(), exception.getMessage());
                }
                break;
            case 5:
                break;
            case 6:
                Logger.info(strOooO0OO, "Device Registration needed, need to start WPJ");
                GenericAuthorizationResult genericauthorizationresult = (GenericAuthorizationResult) createAuthorizationResultWithErrorResponse(AuthorizationStatus.FAIL, MicrosoftAuthorizationErrorResponse.DEVICE_REGISTRATION_NEEDED, MicrosoftAuthorizationErrorResponse.DEVICE_REGISTRATION_NEEDED_ERROR_DESCRIPTION);
                genericauthorizationresult.getAuthorizationErrorResponse().setUpnToWpj(UrlUtil.getParameters(authorizationFinalUri).get("username"));
                return genericauthorizationresult;
            case 7:
                Logger.info(strOooO0OO, "MDM required. Launching Intune MDM link on browser.");
                return (GenericAuthorizationResult) createAuthorizationResultWithErrorResponse(AuthorizationStatus.FAIL, MicrosoftAuthorizationErrorResponse.DEVICE_NEEDS_TO_BE_MANAGED, MicrosoftAuthorizationErrorResponse.DEVICE_NEEDS_TO_BE_MANAGED_ERROR_DESCRIPTION);
            default:
                return (GenericAuthorizationResult) createAuthorizationResultWithErrorResponse(AuthorizationStatus.FAIL, MicrosoftAuthorizationErrorResponse.UNKNOWN_ERROR, "Unknown result code returned [" + rawAuthorizationResult.getResultCode() + "]");
        }
        Logger.info(strOooO0OO, "Device needs to have broker installed, we expect the apps to call usback when the broker is installed");
        GenericAuthorizationResult genericauthorizationresult2 = (GenericAuthorizationResult) createAuthorizationResultWithErrorResponse(AuthorizationStatus.FAIL, MicrosoftAuthorizationErrorResponse.BROKER_NEEDS_TO_BE_INSTALLED, MicrosoftAuthorizationErrorResponse.BROKER_NEEDS_TO_BE_INSTALLED_ERROR_DESCRIPTION);
        genericauthorizationresult2.getAuthorizationErrorResponse().setUpnToWpj(UrlUtil.getParameters(authorizationFinalUri).get("username"));
        return genericauthorizationresult2;
    }

    public abstract GenericAuthorizationResult createAuthorizationResultWithErrorResponse(AuthorizationStatus authorizationStatus, String str, String str2);

    public abstract GenericAuthorizationResult parseRedirectUriAndCreateAuthorizationResult(URI uri, String str);

    public abstract GenericAuthorizationResult validateAndCreateAuthorizationResult(Map<String, String> map, String str, String str2);
}
