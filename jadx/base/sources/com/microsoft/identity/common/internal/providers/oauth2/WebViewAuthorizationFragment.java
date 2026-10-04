package com.microsoft.identity.common.internal.providers.oauth2;

import OooO0oO.C20438OooO0oO;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.PermissionRequest;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ProgressBar;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.ActivityC21897OooOo0;
import com.google.firebase.firestore.local.C22646OooOoO;
import com.microsoft.identity.common.C18549R;
import com.microsoft.identity.common.adal.internal.AuthenticationConstants;
import com.microsoft.identity.common.adal.internal.util.StringExtensions;
import com.microsoft.identity.common.internal.p590ui.webview.AzureActiveDirectoryWebViewClient;
import com.microsoft.identity.common.internal.p590ui.webview.ISendResultCallback;
import com.microsoft.identity.common.internal.p590ui.webview.OnPageLoadedCallback;
import com.microsoft.identity.common.internal.p590ui.webview.WebViewUtil;
import com.microsoft.identity.common.java.constants.FidoConstants;
import com.microsoft.identity.common.java.flighting.CommonFlight;
import com.microsoft.identity.common.java.flighting.CommonFlightManager;
import com.microsoft.identity.common.java.p591ui.webview.authorization.IAuthorizationCompletionCallback;
import com.microsoft.identity.common.java.providers.RawAuthorizationResult;
import com.microsoft.identity.common.logging.Logger;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes9.dex */
public class WebViewAuthorizationFragment extends AuthorizationFragment {
    private static final String PKEYAUTH_STATUS = "pkeyAuthStatus";
    private static final String TAG = "WebViewAuthorizationFragment";
    private AzureActiveDirectoryWebViewClient mAADWebViewClient;
    private Intent mAuthIntent;
    private String mAuthorizationRequestUrl;
    private PermissionRequest mCameraPermissionRequest;
    private String mPostPageLoadedJavascript;
    private ProgressBar mProgressBar;
    private String mRedirectUri;
    private HashMap<String, String> mRequestHeaders;
    private WebView mWebView;
    private boolean webViewZoomControlsEnabled;
    private boolean webViewZoomEnabled;
    private boolean mPkeyAuthStatus = false;
    private final OooO0o.OooO0O0<String> cameraRequestActivity = registerForActivityResult(new C20438OooO0oO(), new C22646OooOoO(this, 1));

    public class AuthorizationCompletionCallback implements IAuthorizationCompletionCallback {
        public AuthorizationCompletionCallback() {
        }

        @Override // com.microsoft.identity.common.java.p591ui.webview.authorization.IAuthorizationCompletionCallback
        public void onChallengeResponseReceived(final RawAuthorizationResult rawAuthorizationResult) {
            Logger.info(WebViewAuthorizationFragment.TAG + ":onChallengeResponseReceived", null, "onChallengeResponseReceived:" + rawAuthorizationResult.getResultCode());
            if (WebViewAuthorizationFragment.this.mAADWebViewClient != null) {
                WebViewAuthorizationFragment.this.mAADWebViewClient.finalizeBeforeSendingResult(rawAuthorizationResult, new ISendResultCallback() { // from class: com.microsoft.identity.common.internal.providers.oauth2.WebViewAuthorizationFragment.AuthorizationCompletionCallback.1
                    @Override // com.microsoft.identity.common.internal.p590ui.webview.ISendResultCallback
                    public void onResultReady() {
                        WebViewAuthorizationFragment.this.sendResult(rawAuthorizationResult);
                        WebViewAuthorizationFragment.this.finish();
                    }
                });
            } else {
                WebViewAuthorizationFragment.this.sendResult(rawAuthorizationResult);
                WebViewAuthorizationFragment.this.finish();
            }
        }

        @Override // com.microsoft.identity.common.java.p591ui.webview.authorization.IAuthorizationCompletionCallback
        public void setPKeyAuthStatus(boolean z) {
            String str = WebViewAuthorizationFragment.TAG + ":setPKeyAuthStatus";
            WebViewAuthorizationFragment.this.mPkeyAuthStatus = z;
            Logger.info(str, null, "setPKeyAuthStatus:" + z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void acceptCameraRequest() {
        String[] strArr = {"android.webkit.resource.VIDEO_CAPTURE"};
        PermissionRequest permissionRequest = this.mCameraPermissionRequest;
        if (permissionRequest != null) {
            permissionRequest.grant(strArr);
        }
    }

    private void denyCameraRequest() {
        PermissionRequest permissionRequest = this.mCameraPermissionRequest;
        if (permissionRequest != null) {
            permissionRequest.deny();
        }
    }

    private HashMap<String, String> getRequestHeaders(Bundle bundle) {
        try {
            HashMap<String, String> map = (HashMap) bundle.getSerializable(AuthenticationConstants.AuthorizationIntentKey.REQUEST_HEADERS);
            if (CommonFlightManager.isFlightEnabled(CommonFlight.ENABLE_PASSKEY_FEATURE)) {
                if (map == null) {
                    map = new HashMap<>();
                }
                map.put(FidoConstants.PASSKEY_PROTOCOL_HEADER_NAME, FidoConstants.PASSKEY_PROTOCOL_HEADER_VALUE);
            }
            return map;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleRepeatedRequests(PermissionRequest permissionRequest) {
        String strOooO0OO = androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), TAG, ":handleRepeatedRequests");
        if (isCameraPermissionGranted()) {
            Logger.info(strOooO0OO, "Repeated request, granting the permission.");
            permissionRequest.grant(new String[]{"android.webkit.resource.VIDEO_CAPTURE"});
        } else {
            Logger.info(strOooO0OO, "Repeated request, denying the permission");
            permissionRequest.deny();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isCameraPermissionGranted() {
        return ContextCompat.checkSelfPermission(requireContext(), "android.permission.CAMERA") == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isPermissionRequestForCamera(PermissionRequest permissionRequest) {
        return permissionRequest.getResources().length == 1 && "android.webkit.resource.VIDEO_CAPTURE".equals(permissionRequest.getResources()[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(Boolean bool) {
        Logger.info(TAG, "Camera permission granted: " + bool);
        if (bool.booleanValue()) {
            acceptCameraRequest();
        } else {
            denyCameraRequest();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showCameraRationale$1(DialogInterface dialogInterface, int i) {
        requestCameraPermissionFromUser();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showCameraRationale$2(DialogInterface dialogInterface, int i) {
        denyCameraRequest();
    }

    private void launchWebView() {
        final String strOooO0OO = androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), TAG, ":launchWebView");
        this.mWebView.post(new Runnable() { // from class: com.microsoft.identity.common.internal.providers.oauth2.WebViewAuthorizationFragment.4
            @Override // java.lang.Runnable
            public void run() {
                Logger.info(strOooO0OO, "Launching embedded WebView for acquiring auth code.");
                Logger.infoPII(strOooO0OO, "The start url is " + WebViewAuthorizationFragment.this.mAuthorizationRequestUrl);
                WebViewAuthorizationFragment.this.mAADWebViewClient.setRequestHeaders(WebViewAuthorizationFragment.this.mRequestHeaders);
                WebViewAuthorizationFragment.this.mWebView.loadUrl(WebViewAuthorizationFragment.this.mAuthorizationRequestUrl, WebViewAuthorizationFragment.this.mRequestHeaders);
                WebViewAuthorizationFragment.this.mProgressBar.setVisibility(0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void requestCameraPermissionFromUser() {
        Logger.info(TAG + ":requestCameraPermissionFromUser", "Requesting camera permission.");
        this.cameraRequestActivity.OooO00o("android.permission.CAMERA");
    }

    private void setUpWebView(View view, AzureActiveDirectoryWebViewClient azureActiveDirectoryWebViewClient) {
        final String strOooO0OO = androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), TAG, ":setUpWebView");
        WebView webView = (WebView) view.findViewById(C18549R.id.common_auth_webview);
        this.mWebView = webView;
        String userAgentString = webView.getSettings().getUserAgentString();
        this.mWebView.getSettings().setUserAgentString(userAgentString + AuthenticationConstants.Broker.CLIENT_TLS_NOT_SUPPORTED);
        this.mWebView.getSettings().setJavaScriptEnabled(true);
        this.mWebView.requestFocus(130);
        this.mWebView.setOnTouchListener(new View.OnTouchListener() { // from class: com.microsoft.identity.common.internal.providers.oauth2.WebViewAuthorizationFragment.2
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view2, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if ((action != 0 && action != 1) || view2.hasFocus()) {
                    return false;
                }
                view2.requestFocus();
                return false;
            }
        });
        this.mWebView.getSettings().setLoadWithOverviewMode(true);
        this.mWebView.getSettings().setDomStorageEnabled(true);
        this.mWebView.getSettings().setUseWideViewPort(true);
        this.mWebView.getSettings().setBuiltInZoomControls(this.webViewZoomControlsEnabled);
        this.mWebView.getSettings().setSupportZoom(this.webViewZoomEnabled);
        this.mWebView.setVisibility(4);
        this.mWebView.setWebViewClient(azureActiveDirectoryWebViewClient);
        this.mWebView.setWebChromeClient(new WebChromeClient() { // from class: com.microsoft.identity.common.internal.providers.oauth2.WebViewAuthorizationFragment.3
            @Override // android.webkit.WebChromeClient
            public void onPermissionRequest(PermissionRequest permissionRequest) {
                Logger.info(strOooO0OO, "Permission requested from:" + permissionRequest.getOrigin() + " for resources:" + Arrays.toString(permissionRequest.getResources()));
                if (!WebViewAuthorizationFragment.this.isPermissionRequestForCamera(permissionRequest)) {
                    Logger.warn(strOooO0OO, "Permission request is not for camera.");
                    permissionRequest.deny();
                    return;
                }
                if (WebViewAuthorizationFragment.this.mCameraPermissionRequest != null) {
                    WebViewAuthorizationFragment.this.handleRepeatedRequests(permissionRequest);
                    return;
                }
                Logger.info(strOooO0OO, "New camera request.");
                WebViewAuthorizationFragment.this.mCameraPermissionRequest = permissionRequest;
                if (WebViewAuthorizationFragment.this.isCameraPermissionGranted()) {
                    Logger.info(strOooO0OO, "Camera permission already granted.");
                    WebViewAuthorizationFragment.this.acceptCameraRequest();
                } else if (!WebViewAuthorizationFragment.this.shouldShowRequestPermissionRationale("android.permission.CAMERA")) {
                    WebViewAuthorizationFragment.this.requestCameraPermissionFromUser();
                } else {
                    Logger.info(strOooO0OO, "Show camera rationale.");
                    WebViewAuthorizationFragment.this.showCameraRationale();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showCameraRationale() {
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setMessage(C18549R.string.qr_code_rationale_message).setTitle(C18549R.string.qr_code_rationale_header).setCancelable(false).setPositiveButton(C18549R.string.qr_code_rationale_allow, new DialogInterface.OnClickListener() { // from class: com.microsoft.identity.common.internal.providers.oauth2.OooO00o
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.f69006OooOo0o.lambda$showCameraRationale$1(dialogInterface, i);
            }
        }).setNegativeButton(C18549R.string.qr_code_rationale_block, new DialogInterface.OnClickListener() { // from class: com.microsoft.identity.common.internal.providers.oauth2.OooO0O0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.f69007OooOo0o.lambda$showCameraRationale$2(dialogInterface, i);
            }
        });
        builder.show();
    }

    @Override // com.microsoft.identity.common.internal.providers.oauth2.AuthorizationFragment
    public void extractState(Bundle bundle) {
        super.extractState(bundle);
        this.mAuthIntent = (Intent) bundle.getParcelable(AuthenticationConstants.AuthorizationIntentKey.AUTH_INTENT);
        this.mPkeyAuthStatus = bundle.getBoolean(PKEYAUTH_STATUS, false);
        this.mAuthorizationRequestUrl = bundle.getString(AuthenticationConstants.AuthorizationIntentKey.REQUEST_URL);
        this.mRedirectUri = bundle.getString(AuthenticationConstants.AuthorizationIntentKey.REDIRECT_URI);
        this.mRequestHeaders = getRequestHeaders(bundle);
        this.mPostPageLoadedJavascript = bundle.getString(AuthenticationConstants.AuthorizationIntentKey.POST_PAGE_LOADED_URL);
        this.webViewZoomEnabled = bundle.getBoolean(AuthenticationConstants.AuthorizationIntentKey.WEB_VIEW_ZOOM_ENABLED, true);
        this.webViewZoomControlsEnabled = bundle.getBoolean(AuthenticationConstants.AuthorizationIntentKey.WEB_VIEW_ZOOM_CONTROLS_ENABLED, true);
    }

    @Override // com.microsoft.identity.common.internal.providers.oauth2.AuthorizationFragment
    public void handleBackButtonPressed() {
        Logger.info(TAG + ":handleBackButtonPressed", "Back button is pressed");
        if (this.mWebView.canGoBack()) {
            this.mWebView.goBack();
        } else {
            cancelAuthorization(true);
        }
    }

    @Override // com.microsoft.identity.common.internal.providers.oauth2.AuthorizationFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ActivityC21897OooOo0 activity = getActivity();
        if (activity != null) {
            WebViewUtil.setDataDirectorySuffix(activity.getApplicationContext());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        final String strOooO0OO = androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), TAG, ":onCreateView");
        View viewInflate = layoutInflater.inflate(C18549R.layout.common_activity_authentication, viewGroup, false);
        this.mProgressBar = (ProgressBar) viewInflate.findViewById(C18549R.id.common_auth_webview_progressbar);
        ActivityC21897OooOo0 activity = getActivity();
        if (activity == null) {
            return null;
        }
        AzureActiveDirectoryWebViewClient azureActiveDirectoryWebViewClient = new AzureActiveDirectoryWebViewClient(activity, new AuthorizationCompletionCallback(), new OnPageLoadedCallback() { // from class: com.microsoft.identity.common.internal.providers.oauth2.WebViewAuthorizationFragment.1
            @Override // com.microsoft.identity.common.internal.p590ui.webview.OnPageLoadedCallback
            public void onPageLoaded(String str) {
                WebViewAuthorizationFragment.this.mCameraPermissionRequest = null;
                String[] strArr = new String[1];
                WebViewAuthorizationFragment.this.mProgressBar.setVisibility(4);
                try {
                    strArr[0] = String.format("window.expectedUrl = '%s';%n%s", URLEncoder.encode(str, "UTF-8"), WebViewAuthorizationFragment.this.mPostPageLoadedJavascript);
                } catch (UnsupportedEncodingException unused) {
                    Logger.warn(strOooO0OO, "Inject expectedUrl failed.");
                }
                if (WebViewAuthorizationFragment.this.mAuthResultSent || StringExtensions.isNullOrBlank(strArr[0])) {
                    return;
                }
                WebViewAuthorizationFragment.this.mWebView.evaluateJavascript(strArr[0], null);
            }
        }, this.mRedirectUri);
        this.mAADWebViewClient = azureActiveDirectoryWebViewClient;
        setUpWebView(viewInflate, azureActiveDirectoryWebViewClient);
        launchWebView();
        return viewInflate;
    }

    @Override // com.microsoft.identity.common.internal.providers.oauth2.AuthorizationFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        String strOooO0OO = androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), TAG, ":onDestroy");
        AzureActiveDirectoryWebViewClient azureActiveDirectoryWebViewClient = this.mAADWebViewClient;
        if (azureActiveDirectoryWebViewClient != null) {
            azureActiveDirectoryWebViewClient.onDestroy();
        } else {
            Logger.error(strOooO0OO, "Fragment destroyed, but smartcard usb discovery was unable to be stopped.", null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable(AuthenticationConstants.AuthorizationIntentKey.AUTH_INTENT, this.mAuthIntent);
        bundle.putBoolean(PKEYAUTH_STATUS, this.mPkeyAuthStatus);
        bundle.putString(AuthenticationConstants.AuthorizationIntentKey.REDIRECT_URI, this.mRedirectUri);
        bundle.putString(AuthenticationConstants.AuthorizationIntentKey.REQUEST_URL, this.mAuthorizationRequestUrl);
        bundle.putSerializable(AuthenticationConstants.AuthorizationIntentKey.REQUEST_HEADERS, this.mRequestHeaders);
        bundle.putSerializable(AuthenticationConstants.AuthorizationIntentKey.POST_PAGE_LOADED_URL, this.mPostPageLoadedJavascript);
        bundle.putBoolean(AuthenticationConstants.AuthorizationIntentKey.WEB_VIEW_ZOOM_CONTROLS_ENABLED, this.webViewZoomControlsEnabled);
        bundle.putBoolean(AuthenticationConstants.AuthorizationIntentKey.WEB_VIEW_ZOOM_ENABLED, this.webViewZoomEnabled);
    }
}
