package com.microsoft.identity.common.java.providers;

import androidx.concurrent.futures.OooO00o;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.microsoft.identity.common.java.AuthenticationConstants;
import com.microsoft.identity.common.java.exception.BaseException;
import com.microsoft.identity.common.java.exception.ClientException;
import com.microsoft.identity.common.java.logging.Logger;
import com.microsoft.identity.common.java.util.StringUtil;
import com.microsoft.identity.common.java.util.UrlUtil;
import com.microsoft.identity.common.java.util.ported.PropertyBag;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class RawAuthorizationResult {
    private static final String TAG = "RawAuthorizationResult";
    private final URI mAuthorizationFinalUri;
    private final BaseException mException;
    private final ResultCode mResultCode;

    public static class RawAuthorizationResultBuilder {
        private URI authorizationFinalUri;
        private BaseException exception;
        private ResultCode resultCode;

        /* JADX INFO: Access modifiers changed from: private */
        public RawAuthorizationResultBuilder authorizationFinalUri(URI uri) {
            this.authorizationFinalUri = uri;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public RawAuthorizationResult build() {
            return new RawAuthorizationResult(this.resultCode, this.authorizationFinalUri, this.exception);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public RawAuthorizationResultBuilder exception(BaseException baseException) {
            this.exception = baseException;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public RawAuthorizationResultBuilder resultCode(ResultCode resultCode) {
            this.resultCode = resultCode;
            return this;
        }

        public String toString() {
            return "RawAuthorizationResult.RawAuthorizationResultBuilder(resultCode=" + this.resultCode + ", authorizationFinalUri=" + this.authorizationFinalUri + ", exception=" + this.exception + ")";
        }
    }

    public enum ResultCode {
        UNKNOWN(-1),
        CANCELLED(2001),
        NON_OAUTH_ERROR(2002),
        COMPLETED(CommonConstant.RETCODE.SIGN_IN_PARAMS_ERROR),
        BROKER_INSTALLATION_TRIGGERED(2006),
        DEVICE_REGISTRATION_REQUIRED(CommonConstant.RETCODE.SIGN_IN_NETWORK_UNDER_CONTROLED),
        SDK_CANCELLED(CommonConstant.RETCODE.INVALID_AT_ERROR),
        MDM_FLOW(CommonConstant.RETCODE.SIGN_IN_AUTH_SERVER_FAILED);

        private final int mCode;

        ResultCode(int i) {
            this.mCode = i;
        }

        public static ResultCode fromInteger(Integer num) {
            if (num == null) {
                return UNKNOWN;
            }
            for (ResultCode resultCode : values()) {
                if (resultCode.mCode == num.intValue()) {
                    return resultCode;
                }
            }
            return null;
        }
    }

    public RawAuthorizationResult(ResultCode resultCode, URI uri, BaseException baseException) {
        this.mResultCode = resultCode;
        this.mAuthorizationFinalUri = uri;
        this.mException = baseException;
    }

    private static RawAuthorizationResultBuilder builder() {
        return new RawAuthorizationResultBuilder();
    }

    public static RawAuthorizationResult fromException(BaseException baseException) {
        if (baseException != null) {
            return builder().resultCode(ResultCode.NON_OAUTH_ERROR).exception(baseException).build();
        }
        throw new NullPointerException("e is marked non-null but is null");
    }

    public static RawAuthorizationResult fromPropertyBag(PropertyBag propertyBag) {
        if (propertyBag != null) {
            return builder().resultCode(ResultCode.fromInteger((Integer) propertyBag.get(AuthenticationConstants.LocalBroadcasterFields.RESULT_CODE))).authorizationFinalUri((URI) propertyBag.get("com.microsoft.aad.adal:BrowserFinalUrl")).exception((BaseException) propertyBag.get("com.microsoft.aad.adal:AuthenticationException")).build();
        }
        throw new NullPointerException("propertyBag is marked non-null but is null");
    }

    public static RawAuthorizationResult fromRedirectUri(String str) {
        if (str == null) {
            throw new NullPointerException("redirectUri is marked non-null but is null");
        }
        try {
            URI uri = new URI(str);
            return builder().resultCode(getResultCodeFromFinalRedirectUri(uri)).authorizationFinalUri(uri).build();
        } catch (URISyntaxException e) {
            return fromException(new ClientException("malformed_url", "Failed to parse redirect URL", e));
        }
    }

    public static RawAuthorizationResult fromResultCode(ResultCode resultCode) {
        if (resultCode != ResultCode.NON_OAUTH_ERROR && resultCode != ResultCode.COMPLETED && resultCode != ResultCode.DEVICE_REGISTRATION_REQUIRED && resultCode != ResultCode.BROKER_INSTALLATION_TRIGGERED) {
            return builder().resultCode(resultCode).build();
        }
        throw new IllegalArgumentException("Result code " + resultCode + " should be set via other factory methods");
    }

    public static RawAuthorizationResult fromThrowable(Throwable th) {
        if (th != null) {
            return th instanceof BaseException ? fromException((BaseException) th) : builder().resultCode(ResultCode.NON_OAUTH_ERROR).exception(new BaseException("unknown_error", "Unknown error with class: ".concat(th.getClass().getSimpleName()), th)).build();
        }
        throw new NullPointerException("e is marked non-null but is null");
    }

    private static ResultCode getResultCodeFromFinalRedirectUri(URI uri) throws URISyntaxException {
        if (uri == null) {
            throw new NullPointerException("uri is marked non-null but is null");
        }
        String strOooO0OO = OooO00o.OooO0OO(new StringBuilder(), TAG, "getResultCodeFromFinalRedirectUri");
        Map<String, String> parameters = UrlUtil.getParameters(uri);
        if ("msauth".equalsIgnoreCase(uri.getScheme())) {
            if (parameters.containsKey(AuthenticationConstants.AAD.APP_LINK_KEY)) {
                Logger.info(strOooO0OO, "Return to caller with BROWSER_CODE_WAIT_FOR_BROKER_INSTALL, and waiting for result.");
                return ResultCode.BROKER_INSTALLATION_TRIGGERED;
            }
            if (AuthenticationConstants.AAD.DEVICE_REGISTRATION_REDIRECT_URI_HOSTNAME.equalsIgnoreCase(uri.getHost())) {
                Logger.info(strOooO0OO, " Device needs to be registered, sending BROWSER_CODE_DEVICE_REGISTER");
                return ResultCode.DEVICE_REGISTRATION_REQUIRED;
            }
        }
        if (!StringUtil.equalsIgnoreCase(parameters.get("error_subcode"), "cancel")) {
            return ResultCode.COMPLETED;
        }
        Logger.info(strOooO0OO, "User cancelled the session");
        return ResultCode.CANCELLED;
    }

    public static PropertyBag toPropertyBag(RawAuthorizationResult rawAuthorizationResult) {
        if (rawAuthorizationResult == null) {
            throw new NullPointerException("data is marked non-null but is null");
        }
        PropertyBag propertyBag = new PropertyBag();
        propertyBag.put(AuthenticationConstants.LocalBroadcasterFields.RESULT_CODE, Integer.valueOf(rawAuthorizationResult.mResultCode.mCode));
        propertyBag.put("com.microsoft.aad.adal:BrowserFinalUrl", rawAuthorizationResult.mAuthorizationFinalUri);
        propertyBag.put("com.microsoft.aad.adal:AuthenticationException", rawAuthorizationResult.mException);
        return propertyBag;
    }

    public URI getAuthorizationFinalUri() {
        return this.mAuthorizationFinalUri;
    }

    public BaseException getException() {
        return this.mException;
    }

    public ResultCode getResultCode() {
        return this.mResultCode;
    }
}
