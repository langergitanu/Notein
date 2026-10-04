package com.huawei.secure.android.common.webview;

import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SafeBrowsingResponse;
import android.webkit.SslErrorHandler;
import android.webkit.URLUtil;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.microsoft.identity.client.internal.MsalUtils;
import java.util.Arrays;
import java.util.Map;
import java.util.regex.Pattern;
import o0O0O0Oo.OooO0O0;
import o0O0oo0o.C26212OooO00o;

/* JADX INFO: loaded from: classes9.dex */
public class SafeWebView extends WebView {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public String[] f68969OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public String f68970OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public String[] f68971OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public String[] f68972OooOoO0;

    /* JADX WARN: Removed duplicated region for block: B:125:0x01c2 A[LOOP:2: B:85:0x0116->B:125:0x01c2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0109 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01c6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b0 A[LOOP:0: B:18:0x0038->B:47:0x00b0, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean OooO00o(String str) {
        boolean zMatches;
        boolean zEquals;
        boolean zStartsWith;
        if (TextUtils.isEmpty(str)) {
            C26212OooO00o.OooO0O0("SafeWebView", "url is null");
            return false;
        }
        if (URLUtil.isNetworkUrl(str)) {
            String[] whitelistWithPath = getWhitelistWithPath();
            String[] whitelistNotMatchSubDomain = getWhitelistNotMatchSubDomain();
            String[] whitelist = getWhitelist();
            if (whitelistWithPath != null && whitelistWithPath.length != 0) {
                if (whitelistWithPath.length == 0) {
                    C26212OooO00o.OooO0O0("UriUtil", "whitelist is null");
                    return false;
                }
                for (String str2 : whitelistWithPath) {
                    if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                        zStartsWith = false;
                        if (!zStartsWith) {
                        }
                    } else {
                        if (str.contains("..") || str.contains("@")) {
                            Log.e("UriUtil", "url contains unsafe char");
                        } else {
                            if (str2.equals(str) || str.startsWith(str2.concat(MsalUtils.QUERY_STRING_SYMBOL)) || str.startsWith(str2.concat("#"))) {
                                zStartsWith = true;
                            } else if (str2.endsWith("/")) {
                                if (Uri.parse(str).getPathSegments().size() - Uri.parse(str2).getPathSegments().size() == 1) {
                                    zStartsWith = str.startsWith(str2);
                                }
                            }
                            if (!zStartsWith) {
                            }
                        }
                        zStartsWith = false;
                        if (!zStartsWith) {
                        }
                    }
                }
                return false;
            }
            if (whitelistNotMatchSubDomain != null && whitelistNotMatchSubDomain.length != 0) {
                if (whitelistNotMatchSubDomain.length == 0) {
                    C26212OooO00o.OooO0O0("UriUtil", "whitelist is null");
                    return false;
                }
                for (String strOooO00o : whitelistNotMatchSubDomain) {
                    if (TextUtils.isEmpty(str) || TextUtils.isEmpty(strOooO00o)) {
                        Log.e("UriUtil", "isUrlHostSameWhitelist: url or host is null");
                        zEquals = false;
                    } else {
                        String strOooO00o2 = o0O0O0Oo.OooO00o.OooO00o(str);
                        if (TextUtils.isEmpty(strOooO00o)) {
                            Pattern pattern = C26212OooO00o.f89545OooO00o;
                            if (!TextUtils.isEmpty("whiteListUrl is null")) {
                                Log.i("UriUtil", C26212OooO00o.OooO00o("whiteListUrl is null"));
                            }
                            strOooO00o = null;
                        } else if (URLUtil.isNetworkUrl(strOooO00o)) {
                            strOooO00o = o0O0O0Oo.OooO00o.OooO00o(strOooO00o);
                        }
                        zEquals = TextUtils.equals(strOooO00o2, strOooO00o);
                    }
                    if (!zEquals) {
                    }
                }
                return false;
            }
            if (whitelist == null || whitelist.length == 0) {
                C26212OooO00o.OooO0O0("UriUtil", "whitelist is null");
                return false;
            }
            int length = whitelist.length;
            for (int i = 0; i < length; i++) {
                String strOooO00o3 = whitelist[i];
                String strOooO00o4 = o0O0O0Oo.OooO00o.OooO00o(str);
                if (TextUtils.isEmpty(strOooO00o4) || TextUtils.isEmpty(strOooO00o3)) {
                    C26212OooO00o.OooO0O0("UriUtil", "url or whitelist is null");
                } else {
                    if (TextUtils.isEmpty(strOooO00o3)) {
                        Pattern pattern2 = C26212OooO00o.f89545OooO00o;
                        if (!TextUtils.isEmpty("whiteListUrl is null")) {
                            Log.i("UriUtil", C26212OooO00o.OooO00o("whiteListUrl is null"));
                        }
                        strOooO00o3 = null;
                    } else if (URLUtil.isNetworkUrl(strOooO00o3)) {
                        strOooO00o3 = o0O0O0Oo.OooO00o.OooO00o(strOooO00o3);
                    }
                    if (TextUtils.isEmpty(strOooO00o3)) {
                        Log.e("UriUtil", "whitelist host is null");
                    } else {
                        if (strOooO00o3.equals(strOooO00o4)) {
                            zMatches = true;
                        } else if (strOooO00o4.endsWith(strOooO00o3)) {
                            try {
                                String strSubstring = strOooO00o4.substring(0, strOooO00o4.length() - strOooO00o3.length());
                                if (strSubstring.endsWith(".")) {
                                    zMatches = strSubstring.matches("^[A-Za-z0-9.-]+$");
                                }
                            } catch (IndexOutOfBoundsException e) {
                                C26212OooO00o.OooO0O0("UriUtil", "IndexOutOfBoundsException" + e.getMessage());
                            } catch (Exception e2) {
                                C26212OooO00o.OooO0O0("UriUtil", "Exception : " + e2.getMessage());
                            }
                        }
                        if (!zMatches) {
                            return true;
                        }
                    }
                }
                zMatches = false;
                if (!zMatches) {
                }
            }
            return false;
        }
        return true;
    }

    public String getDefaultErrorPage() {
        return this.f68970OooOo0o;
    }

    public OooO0O0 getWebViewLoadCallBack() {
        return null;
    }

    @Deprecated
    public String[] getWhitelist() {
        String[] strArr = this.f68969OooOo;
        if (strArr == null) {
            return null;
        }
        return (String[]) Arrays.copyOf(strArr, strArr.length);
    }

    public String[] getWhitelistNotMatchSubDomain() {
        String[] strArr = this.f68972OooOoO0;
        if (strArr == null) {
            return null;
        }
        return (String[]) Arrays.copyOf(strArr, strArr.length);
    }

    @Deprecated
    public String[] getWhitelistNotMathcSubDomain() {
        String[] strArr = this.f68972OooOoO0;
        if (strArr == null) {
            return null;
        }
        return (String[]) Arrays.copyOf(strArr, strArr.length);
    }

    public String[] getWhitelistWithPath() {
        String[] strArr = this.f68971OooOoO;
        if (strArr == null) {
            return null;
        }
        return (String[]) Arrays.copyOf(strArr, strArr.length);
    }

    @Override // android.webkit.WebView
    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (!URLUtil.isHttpUrl(str)) {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
            return;
        }
        Log.e("SafeWebView", "loadDataWithBaseURL: http url , not safe");
        if (TextUtils.isEmpty(this.f68970OooOo0o)) {
            getWebViewLoadCallBack();
        } else {
            super.loadDataWithBaseURL(this.f68970OooOo0o, str2, str3, str4, str5);
        }
    }

    @Override // android.webkit.WebView
    public final void loadUrl(String str) {
        if (!OooO00o(str)) {
            Log.e("SafeWebView", "loadUrl: url is not in white list");
            return;
        }
        if (!URLUtil.isHttpUrl(str)) {
            super.loadUrl(str);
            return;
        }
        Log.e("SafeWebView", "loadUrl: http url , not safe");
        if (TextUtils.isEmpty(this.f68970OooOo0o)) {
            getWebViewLoadCallBack();
        } else {
            super.loadUrl(this.f68970OooOo0o);
        }
    }

    @Override // android.webkit.WebView
    public final void postUrl(String str, byte[] bArr) {
        if (!OooO00o(str)) {
            Log.e("SafeWebView", "postUrl: url is not in white list");
            return;
        }
        if (!URLUtil.isHttpUrl(str)) {
            super.postUrl(str, bArr);
            return;
        }
        Log.e("SafeWebView", "postUrl: http url , not safe");
        if (TextUtils.isEmpty(this.f68970OooOo0o)) {
            getWebViewLoadCallBack();
        } else {
            super.postUrl(this.f68970OooOo0o, bArr);
        }
    }

    public void setDefaultErrorPage(String str) {
        this.f68970OooOo0o = str;
    }

    @Override // android.webkit.WebView
    public void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(new OooO00o(webViewClient));
    }

    public void setWebViewLoadCallBack(OooO0O0 oooO0O0) {
    }

    @Deprecated
    public void setWhitelist(String[] strArr) {
        this.f68969OooOo = strArr == null ? null : (String[]) Arrays.copyOf(strArr, strArr.length);
    }

    public void setWhitelistNotMatchSubDomain(String[] strArr) {
        this.f68972OooOoO0 = strArr == null ? null : (String[]) Arrays.copyOf(strArr, strArr.length);
    }

    @Deprecated
    public void setWhitelistNotMathcSubDomain(String[] strArr) {
        this.f68972OooOoO0 = strArr == null ? null : (String[]) Arrays.copyOf(strArr, strArr.length);
    }

    public void setWhitelistWithPath(String[] strArr) {
        this.f68971OooOoO = strArr == null ? null : (String[]) Arrays.copyOf(strArr, strArr.length);
    }

    public final class OooO00o extends WebViewClient {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final WebViewClient f68973OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final boolean f68974OooO0O0 = true;

        public OooO00o(WebViewClient webViewClient) {
            this.f68973OooO00o = webViewClient;
        }

        @Override // android.webkit.WebViewClient
        public final void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
            WebViewClient webViewClient = this.f68973OooO00o;
            if (webViewClient != null) {
                webViewClient.doUpdateVisitedHistory(webView, str, z);
            } else {
                super.doUpdateVisitedHistory(webView, str, z);
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onFormResubmission(WebView webView, Message message, Message message2) {
            WebViewClient webViewClient = this.f68973OooO00o;
            if (webViewClient != null) {
                webViewClient.onFormResubmission(webView, message, message2);
            } else {
                super.onFormResubmission(webView, message, message2);
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onLoadResource(WebView webView, String str) {
            WebViewClient webViewClient = this.f68973OooO00o;
            if (webViewClient != null) {
                webViewClient.onLoadResource(webView, str);
            } else {
                super.onLoadResource(webView, str);
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onPageCommitVisible(WebView webView, String str) {
            WebViewClient webViewClient = this.f68973OooO00o;
            if (webViewClient != null) {
                webViewClient.onPageCommitVisible(webView, str);
            } else {
                super.onPageCommitVisible(webView, str);
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            WebViewClient webViewClient = this.f68973OooO00o;
            if (webViewClient != null) {
                webViewClient.onPageFinished(webView, str);
            } else {
                super.onPageFinished(webView, str);
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            WebViewClient webViewClient = this.f68973OooO00o;
            if (webViewClient != null && !this.f68974OooO0O0) {
                webViewClient.onPageStarted(webView, str, bitmap);
                return;
            }
            SafeWebView safeWebView = SafeWebView.this;
            if (safeWebView.OooO00o(str)) {
                super.onPageStarted(webView, str, bitmap);
                return;
            }
            Pattern pattern = C26212OooO00o.f89545OooO00o;
            if (!TextUtils.isEmpty("onCheckError url is not in white list ") || !TextUtils.isEmpty(str)) {
                StringBuilder sb = new StringBuilder(512);
                if (!TextUtils.isEmpty("onCheckError url is not in white list ")) {
                    sb.append("onCheckError url is not in white list ");
                }
                if (!TextUtils.isEmpty(str)) {
                    if (!TextUtils.isEmpty(str)) {
                        int length = str.length();
                        if (1 == length) {
                            str = String.valueOf('*');
                        } else {
                            StringBuilder sb2 = new StringBuilder(length);
                            int i = 1;
                            for (int i2 = 0; i2 < length; i2++) {
                                char cCharAt = str.charAt(i2);
                                if (C26212OooO00o.f89545OooO00o.matcher(String.valueOf(cCharAt)).matches()) {
                                    if (i % 2 == 0) {
                                        cCharAt = '*';
                                    }
                                    i++;
                                }
                                sb2.append(cCharAt);
                            }
                            str = sb2.toString();
                        }
                    }
                    sb.append(str);
                }
                Log.e("SafeWebView", sb.toString());
            }
            webView.stopLoading();
            String defaultErrorPage = safeWebView.getDefaultErrorPage();
            if (TextUtils.isEmpty(defaultErrorPage)) {
                safeWebView.getWebViewLoadCallBack();
            } else {
                webView.loadUrl(defaultErrorPage);
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
            WebViewClient webViewClient = this.f68973OooO00o;
            if (webViewClient != null) {
                webViewClient.onReceivedClientCertRequest(webView, clientCertRequest);
            } else {
                super.onReceivedClientCertRequest(webView, clientCertRequest);
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            WebViewClient webViewClient = this.f68973OooO00o;
            if (webViewClient != null) {
                webViewClient.onReceivedError(webView, i, str, str2);
            } else {
                super.onReceivedError(webView, i, str, str2);
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
            WebViewClient webViewClient = this.f68973OooO00o;
            if (webViewClient != null) {
                webViewClient.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
            } else {
                super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            WebViewClient webViewClient = this.f68973OooO00o;
            if (webViewClient != null) {
                webViewClient.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            } else {
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
            WebViewClient webViewClient = this.f68973OooO00o;
            if (webViewClient != null) {
                webViewClient.onReceivedLoginRequest(webView, str, str2, str3);
            } else {
                super.onReceivedLoginRequest(webView, str, str2, str3);
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            WebViewClient webViewClient = this.f68973OooO00o;
            if (webViewClient != null) {
                webViewClient.onReceivedSslError(webView, sslErrorHandler, sslError);
            } else {
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
            }
        }

        @Override // android.webkit.WebViewClient
        public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            WebViewClient webViewClient = this.f68973OooO00o;
            return webViewClient != null ? webViewClient.onRenderProcessGone(webView, renderProcessGoneDetail) : super.onRenderProcessGone(webView, renderProcessGoneDetail);
        }

        @Override // android.webkit.WebViewClient
        public final void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i, SafeBrowsingResponse safeBrowsingResponse) {
            WebViewClient webViewClient = this.f68973OooO00o;
            if (webViewClient != null) {
                webViewClient.onSafeBrowsingHit(webView, webResourceRequest, i, safeBrowsingResponse);
            } else {
                super.onSafeBrowsingHit(webView, webResourceRequest, i, safeBrowsingResponse);
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onScaleChanged(WebView webView, float f, float f2) {
            WebViewClient webViewClient = this.f68973OooO00o;
            if (webViewClient != null) {
                webViewClient.onScaleChanged(webView, f, f2);
            } else {
                super.onScaleChanged(webView, f, f2);
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onTooManyRedirects(WebView webView, Message message, Message message2) {
            WebViewClient webViewClient = this.f68973OooO00o;
            if (webViewClient != null) {
                webViewClient.onTooManyRedirects(webView, message, message2);
            } else {
                super.onTooManyRedirects(webView, message, message2);
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
            WebViewClient webViewClient = this.f68973OooO00o;
            if (webViewClient != null) {
                webViewClient.onUnhandledKeyEvent(webView, keyEvent);
            } else {
                super.onUnhandledKeyEvent(webView, keyEvent);
            }
        }

        @Override // android.webkit.WebViewClient
        public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            WebViewClient webViewClient = this.f68973OooO00o;
            return webViewClient != null ? webViewClient.shouldInterceptRequest(webView, webResourceRequest) : super.shouldInterceptRequest(webView, webResourceRequest);
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
            WebViewClient webViewClient = this.f68973OooO00o;
            return webViewClient != null ? webViewClient.shouldOverrideKeyEvent(webView, keyEvent) : super.shouldOverrideKeyEvent(webView, keyEvent);
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            WebViewClient webViewClient = this.f68973OooO00o;
            return webViewClient != null ? webViewClient.shouldOverrideUrlLoading(webView, str) : super.shouldOverrideUrlLoading(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            WebViewClient webViewClient = this.f68973OooO00o;
            if (webViewClient != null) {
                webViewClient.onReceivedError(webView, webResourceRequest, webResourceError);
            } else {
                super.onReceivedError(webView, webResourceRequest, webResourceError);
            }
        }

        @Override // android.webkit.WebViewClient
        public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            WebViewClient webViewClient = this.f68973OooO00o;
            if (webViewClient != null) {
                return webViewClient.shouldInterceptRequest(webView, str);
            }
            return super.shouldInterceptRequest(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            WebViewClient webViewClient = this.f68973OooO00o;
            if (webViewClient != null) {
                return webViewClient.shouldOverrideUrlLoading(webView, webResourceRequest);
            }
            return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
    }

    @Override // android.webkit.WebView
    public final void loadUrl(String str, Map<String, String> map) {
        if (!OooO00o(str)) {
            Log.e("SafeWebView", "loadUrl: url is not in white list");
            return;
        }
        if (URLUtil.isHttpUrl(str)) {
            Log.e("SafeWebView", "loadUrl: http url , not safe");
            if (!TextUtils.isEmpty(this.f68970OooOo0o)) {
                super.loadUrl(this.f68970OooOo0o, map);
                return;
            } else {
                getWebViewLoadCallBack();
                return;
            }
        }
        super.loadUrl(str, map);
    }
}
