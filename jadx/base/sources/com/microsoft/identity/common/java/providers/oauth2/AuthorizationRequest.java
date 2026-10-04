package com.microsoft.identity.common.java.providers.oauth2;

import androidx.concurrent.futures.OooO00o;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.microsoft.identity.common.java.exception.ClientException;
import com.microsoft.identity.common.java.jwt.AbstractJwtRequest;
import com.microsoft.identity.common.java.providers.oauth2.AuthorizationRequest;
import com.microsoft.identity.common.java.util.CommonURIBuilder;
import com.microsoft.identity.common.java.util.ObjectMapper;
import com.microsoft.identity.common.java.util.StringUtil;
import java.io.Serializable;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public abstract class AuthorizationRequest<T extends AuthorizationRequest<T>> implements Serializable {
    private static final String TAG = "AuthorizationRequest";
    private static final long serialVersionUID = 6171895895590170062L;

    @SerializedName(AbstractJwtRequest.ClaimNames.BRK_CLIENT_ID)
    @Expose
    private final String mBrkClientId;

    @SerializedName(AbstractJwtRequest.ClaimNames.BRK_REDIRECT_URI)
    private final String mBrkRedirectUri;

    @SerializedName("claims")
    @Expose
    private final String mClaims;

    @SerializedName("client_id")
    @Expose
    private final String mClientId;
    private final transient List<Map.Entry<String, String>> mExtraQueryParams;

    @SerializedName("redirect_uri")
    private final String mRedirectUri;
    private final transient HashMap<String, String> mRequestHeaders;

    @SerializedName("response_type")
    @Expose
    private final String mResponseType;

    @SerializedName("scope")
    @Expose
    private final String mScope;

    @SerializedName("state")
    @Expose
    private final String mState;

    @Expose
    private final transient boolean mWebViewZoomControlsEnabled;

    @Expose
    private final transient boolean mWebViewZoomEnabled;

    public static abstract class Builder<B extends Builder<B>> {
        private String mBrkClientId;
        private String mBrkRedirectUri;
        private String mClaims;
        private String mClientId;
        public List<Map.Entry<String, String>> mExtraQueryParams;
        private String mRedirectUri;
        private HashMap<String, String> mRequestHeaders;
        private String mScope;
        private String mState;
        private String mResponseType = "code";
        private boolean mWebViewZoomControlsEnabled = false;
        private boolean mWebViewZoomEnabled = false;

        public abstract AuthorizationRequest build();

        public abstract B self();

        public B setBrkClientId(String str) {
            this.mBrkClientId = str;
            return (B) self();
        }

        public B setBrkRedirectUri(String str) {
            this.mBrkRedirectUri = str;
            return (B) self();
        }

        public B setClaims(String str) {
            this.mClaims = str;
            return (B) self();
        }

        public B setClientId(String str) {
            this.mClientId = str;
            return (B) self();
        }

        public B setExtraQueryParams(List<Map.Entry<String, String>> list) {
            this.mExtraQueryParams = list;
            return (B) self();
        }

        public B setRedirectUri(String str) {
            this.mRedirectUri = str;
            return (B) self();
        }

        public B setRequestHeaders(HashMap<String, String> map) {
            this.mRequestHeaders = map;
            return (B) self();
        }

        public B setResponseType(String str) {
            this.mResponseType = str;
            return (B) self();
        }

        public B setScope(String str) {
            this.mScope = str;
            return (B) self();
        }

        public B setState(String str) {
            this.mState = str;
            return (B) self();
        }

        public B setWebViewZoomControlsEnabled(boolean z) {
            this.mWebViewZoomControlsEnabled = z;
            return (B) self();
        }

        public B setWebViewZoomEnabled(boolean z) {
            this.mWebViewZoomEnabled = z;
            return (B) self();
        }
    }

    public static final class ResponseType {
        public static final String CODE = "code";
    }

    public AuthorizationRequest(Builder builder) {
        this.mResponseType = builder.mResponseType;
        this.mClientId = builder.mClientId;
        this.mRedirectUri = builder.mRedirectUri;
        this.mState = builder.mState == null ? null : StringUtil.encodeUrlSafeString(builder.mState);
        this.mScope = builder.mScope;
        this.mBrkClientId = builder.mBrkClientId;
        this.mBrkRedirectUri = builder.mBrkRedirectUri;
        this.mExtraQueryParams = builder.mExtraQueryParams;
        this.mRequestHeaders = builder.mRequestHeaders;
        this.mClaims = builder.mClaims;
        this.mWebViewZoomEnabled = builder.mWebViewZoomEnabled;
        this.mWebViewZoomControlsEnabled = builder.mWebViewZoomControlsEnabled;
    }

    public abstract String getAuthorizationEndpoint() throws ClientException;

    public URI getAuthorizationRequestAsHttpRequest() throws ClientException {
        try {
            CommonURIBuilder commonURIBuilder = new CommonURIBuilder(getAuthorizationEndpoint());
            commonURIBuilder.addParametersIfAbsent(ObjectMapper.serializeObjectHashMap(this));
            commonURIBuilder.addParametersIfAbsent(this.mExtraQueryParams);
            return commonURIBuilder.build();
        } catch (URISyntaxException e) {
            throw new ClientException("malformed_url", e.getMessage(), e);
        }
    }

    public String getBrkClientId() {
        return this.mBrkClientId;
    }

    public String getBrkRedirectUri() {
        return this.mBrkRedirectUri;
    }

    public String getClaims() {
        return this.mClaims;
    }

    public String getClientId() {
        return this.mClientId;
    }

    public List<Map.Entry<String, String>> getExtraQueryParams() {
        return this.mExtraQueryParams;
    }

    public String getRedirectUri() {
        return this.mRedirectUri;
    }

    public HashMap<String, String> getRequestHeaders() {
        return this.mRequestHeaders;
    }

    public String getResponseType() {
        return this.mResponseType;
    }

    public String getScope() {
        return this.mScope;
    }

    public String getState() {
        return this.mState;
    }

    public boolean isWebViewZoomControlsEnabled() {
        return this.mWebViewZoomControlsEnabled;
    }

    public boolean isWebViewZoomEnabled() {
        return this.mWebViewZoomEnabled;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AuthorizationRequest{mResponseType='");
        sb.append(this.mResponseType);
        sb.append("', mClientId='");
        sb.append(this.mClientId);
        sb.append("', mRedirectUri='");
        sb.append(this.mRedirectUri);
        sb.append("', mBrkClientId='");
        sb.append(this.mBrkClientId);
        sb.append("', mBrkRedirectUri='");
        sb.append(this.mBrkRedirectUri);
        sb.append("', mScope='");
        sb.append(this.mScope);
        sb.append("', mState='");
        return OooO00o.OooO0OO(sb, this.mState, "'}");
    }
}
