package o0oooOo;

import Oooo0oO.C21111o0ooOoO;
import Oooo0oO.o0Oo0oo;
import android.R;
import android.app.Activity;
import android.app.UiModeManager;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.view.MenuItem;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import com.hihonor.honorid.core.data.TmemberRight;
import com.huawei.hms.network.embedded.C18115b5;
import com.microsoft.identity.client.internal.MsalUtils;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import com.xiaomi.account.XiaomiOAuthResponse;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import java.util.UUID;
import o00000.OooOO0;
import o0oooo0O.C31866OooO00o;
import o0oooo0o.C31870OooO0Oo;

/* JADX INFO: renamed from: o0oooOo.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractActivityC31852OooO0O0 extends Activity {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public static final /* synthetic */ int f113522OooOoo0 = 0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public WebSettings f113523OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public WebView f113524OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public boolean f113525OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public String f113526OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public XiaomiOAuthResponse f113527OooOoOO;

    /* JADX INFO: renamed from: o0oooOo.OooO0O0$OooO00o */
    public class OooO00o extends WebChromeClient {
        public OooO00o() {
        }

        @Override // android.webkit.WebChromeClient
        public final void onProgressChanged(WebView webView, int i) {
            ProgressBar progressBar = ((ActivityC31851OooO00o) AbstractActivityC31852OooO0O0.this).f113517OooOoo;
            if (progressBar != null) {
                progressBar.setProgress(i);
            }
        }
    }

    /* JADX INFO: renamed from: o0oooOo.OooO0O0$OooO0O0, reason: collision with other inner class name */
    public class RunnableC20182OooO0O0 implements Runnable {
        public RunnableC20182OooO0O0() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            MenuItem menuItem = ((ActivityC31851OooO00o) AbstractActivityC31852OooO0O0.this).f113518OooOooO;
            if (menuItem != null) {
                menuItem.setVisible(false);
            }
        }
    }

    /* JADX INFO: renamed from: o0oooOo.OooO0O0$OooO0OO */
    public class OooO0OO extends WebViewClient {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f113530OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final StringBuilder f113531OooO0O0 = new StringBuilder();

        public OooO0OO(String str) {
            this.f113530OooO00o = str;
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            ProgressBar progressBar = ((ActivityC31851OooO00o) AbstractActivityC31852OooO0O0.this).f113517OooOoo;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
            super.onPageFinished(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            ProgressBar progressBar = ((ActivityC31851OooO00o) AbstractActivityC31852OooO0O0.this).f113517OooOoo;
            if (progressBar != null) {
                progressBar.setVisibility(0);
            }
            super.onPageStarted(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            MenuItem menuItem = ((ActivityC31851OooO00o) AbstractActivityC31852OooO0O0.this).f113518OooOooO;
            if (menuItem != null) {
                menuItem.setVisible(true);
            }
            super.onReceivedError(webView, i, str, str2);
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            MenuItem menuItem = ((ActivityC31851OooO00o) AbstractActivityC31852OooO0O0.this).f113518OooOooO;
            if (menuItem != null) {
                menuItem.setVisible(true);
            }
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            String str2 = this.f113530OooO00o;
            if (str2 != null && !str.toLowerCase().startsWith(str2.toLowerCase())) {
                return super.shouldOverrideUrlLoading(webView, str);
            }
            String strOooO0Oo = C21111o0ooOoO.OooO0Oo(str, IOUtils.LINE_SEPARATOR_UNIX);
            StringBuilder sb = this.f113531OooO0O0;
            sb.append(strOooO0Oo);
            Bundle bundleOooO0oO = null;
            if (!str.contains("/pass/sns/login/load") && !str.contains("/pass/sns/bind")) {
                String str3 = new String(str);
                int iIndexOf = str3.indexOf(63);
                if (iIndexOf > 0) {
                    String strSubstring = str3.substring(iIndexOf + 1);
                    if (strSubstring.startsWith("code=") || strSubstring.contains("&code=") || strSubstring.startsWith("error=") || strSubstring.contains("&error=")) {
                        bundleOooO0oO = OooOO0.OooO0oO(str3);
                    }
                } else {
                    int iIndexOf2 = str3.indexOf(35);
                    if (iIndexOf2 > 0) {
                        String strSubstring2 = str3.substring(iIndexOf2 + 1);
                        if (strSubstring2.startsWith("access_token=") || strSubstring2.contains("&access_token=") || strSubstring2.startsWith("error=") || strSubstring2.contains("&error=")) {
                            bundleOooO0oO = OooOO0.OooO0oO(str3.replace("#", MsalUtils.QUERY_STRING_SYMBOL));
                        }
                    }
                }
            }
            if (bundleOooO0oO == null) {
                return super.shouldOverrideUrlLoading(webView, str);
            }
            String string = sb.toString();
            try {
                C31870OooO0Oo.OooO0O0 oooO0O0OooO00o = C31870OooO0Oo.OooO00o(string);
                string = "#&^" + oooO0O0OooO00o.f113567OooO0O0 + "!!" + oooO0O0OooO00o.f113566OooO00o + "^&#";
            } catch (Exception e) {
                e.printStackTrace();
            }
            Log.i("AuthorizeActivityBase", "WebViewOauth sucess");
            bundleOooO0oO.putString("info", string);
            int i = AbstractActivityC31852OooO0O0.f113522OooOoo0;
            AbstractActivityC31852OooO0O0.this.OooO0O0(-1, bundleOooO0oO);
            return true;
        }
    }

    public static void OooO0OO(WebSettings webSettings, int i) {
        try {
            webSettings.getClass().getMethod("setForceDark", Integer.TYPE).invoke(webSettings, Integer.valueOf(i));
        } catch (Exception e) {
            Log.e("AuthorizeActivityBase", "setWebSettingsForceDark reflect error", e);
        }
    }

    public final void OooO00o(boolean z) {
        WebView webView = this.f113524OooOo0o;
        String string = this.f113526OooOoO0;
        if (!TextUtils.isEmpty(string)) {
            Uri uri = Uri.parse(string);
            String queryParameter = uri.getQueryParameter("_locale");
            Uri.Builder builderBuildUpon = uri.buildUpon();
            Locale locale = Locale.getDefault();
            String language = locale.getLanguage();
            String country = locale.getCountry();
            if (!TextUtils.isEmpty(country)) {
                language = o0Oo0oo.OooO0Oo(language, C18115b5.CONNECTOR, country);
            }
            if (TextUtils.isEmpty(queryParameter) && !TextUtils.isEmpty(language)) {
                builderBuildUpon.appendQueryParameter("_locale", language);
            }
            String str = 2 == ((UiModeManager) getSystemService("uimode")).getNightMode() ? "night_yes" : "night_no";
            builderBuildUpon.appendQueryParameter("_device_name", Build.DEVICE);
            builderBuildUpon.appendQueryParameter("_uiThemeMode", str);
            string = builderBuildUpon.build().toString();
        }
        webView.loadUrl(string);
        if (!z) {
            new Handler(Looper.getMainLooper()).post(new RunnableC20182OooO0O0());
            return;
        }
        MenuItem menuItem = ((ActivityC31851OooO00o) this).f113518OooOooO;
        if (menuItem != null) {
            menuItem.setVisible(false);
        }
    }

    public final void OooO0O0(int i, Bundle bundle) {
        Intent intent = new Intent();
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        setResult(i, intent);
        XiaomiOAuthResponse xiaomiOAuthResponse = this.f113527OooOoOO;
        if (xiaomiOAuthResponse != null) {
            if (i == 0) {
                com.xiaomi.account.OooO00o oooO00o = xiaomiOAuthResponse.f80221OooOo0o;
                if (oooO00o != null) {
                    try {
                        oooO00o.onCancel();
                    } catch (RemoteException e) {
                        Log.e("com.xiaomi.account.XiaomiOAuthResponse", "RemoteException", e);
                    } catch (RuntimeException e2) {
                        Log.e("com.xiaomi.account.XiaomiOAuthResponse", "RuntimeException", e2);
                    }
                }
            } else {
                com.xiaomi.account.OooO00o oooO00o2 = xiaomiOAuthResponse.f80221OooOo0o;
                if (oooO00o2 != null && bundle != null) {
                    try {
                        oooO00o2.OooOOoo(bundle);
                    } catch (RemoteException e3) {
                        Log.e("com.xiaomi.account.XiaomiOAuthResponse", "RemoteException", e3);
                    } catch (RuntimeException e4) {
                        Log.e("com.xiaomi.account.XiaomiOAuthResponse", "RemoteException", e4);
                        Bundle bundle2 = new Bundle();
                        bundle2.putInt("extra_error_code", -1);
                        bundle2.putString("extra_error_description", e4.getMessage());
                        try {
                            oooO00o2.OooOOoo(bundle2);
                        } catch (RemoteException e5) {
                            Log.e("com.xiaomi.account.XiaomiOAuthResponse", "RemoteException", e5);
                        } catch (RuntimeException e6) {
                            Log.e("com.xiaomi.account.XiaomiOAuthResponse", "RuntimeException", e6);
                        }
                    }
                }
            }
        }
        if (!this.f113525OooOoO) {
            CookieSyncManager.createInstance(this);
            CookieManager.getInstance().removeAllCookie();
        }
        finish();
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1001) {
            OooO0O0(i2, intent != null ? intent.getExtras() : null);
        }
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        WebView webView = this.f113524OooOo0o;
        if (webView == null || !webView.canGoBack()) {
            OooO0O0(0, null);
        } else {
            this.f113524OooOo0o.goBack();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        String strOooO00o;
        super.onCreate(bundle);
        if (getIntent() != null) {
            try {
                new Intent(getIntent()).getStringExtra("");
            } catch (BadParcelableException unused) {
                Log.w("Oooo0o0", "fail checking ParcelableAttack for Activity ".concat(getClass().getName()));
                finish();
                return;
            } catch (RuntimeException e) {
                if (e.getCause() instanceof ClassNotFoundException) {
                    Log.w("Oooo0o0", "fail checking SerializableAttack for Activity ".concat(getClass().getName()));
                    finish();
                    return;
                }
            }
        }
        Intent intent = getIntent();
        Bundle bundleExtra = intent.getBundleExtra("extra_my_bundle");
        if (bundleExtra != null) {
            OooO0O0(intent.getIntExtra("extra_result_code", -1), bundleExtra);
            return;
        }
        this.f113527OooOoOO = (XiaomiOAuthResponse) intent.getParcelableExtra("extra_response");
        if (((Intent) intent.getParcelableExtra("extra_my_intent")) != null) {
            Log.w("AuthorizeActivityBase", "Don't use this and it's deprecated for security reason, JIRA: XS-21578");
        }
        this.f113525OooOoO = intent.getBooleanExtra("extra_keep_cookies ", false);
        WebView webView = new WebView(this);
        this.f113524OooOo0o = webView;
        WebSettings settings = webView.getSettings();
        if (Build.VERSION.SDK_INT >= 29) {
            if ((getResources().getConfiguration().uiMode & 48) == 32) {
                OooO0OO(settings, 2);
            } else {
                OooO0OO(settings, 1);
            }
        }
        webView.setBackgroundColor((getResources().getConfiguration().uiMode & 48) == 32 ? getResources().getColor(R.color.black) : getResources().getColor(R.color.white));
        WebSettings settings2 = this.f113524OooOo0o.getSettings();
        this.f113523OooOo = settings2;
        settings2.setJavaScriptEnabled(true);
        this.f113524OooOo0o.removeJavascriptInterface("searchBoxJavaBridge_");
        this.f113524OooOo0o.removeJavascriptInterface("accessibility");
        this.f113524OooOo0o.removeJavascriptInterface("accessibilityTraversal");
        this.f113523OooOo.setSavePassword(false);
        this.f113523OooOo.setSaveFormData(false);
        this.f113526OooOoO0 = intent.getStringExtra("url");
        if (bundle == null && !this.f113525OooOoO) {
            CookieSyncManager.createInstance(this);
            CookieManager.getInstance().removeAllCookie();
        }
        String userAgentString = this.f113523OooOo.getUserAgentString();
        if (!TextUtils.isEmpty(userAgentString)) {
            this.f113523OooOo.setUserAgentString(C21111o0ooOoO.OooO0Oo(C21111o0ooOoO.OooO0Oo(userAgentString, " Passport/OAuthSDK/0.0.1"), " mi/OAuthSDK/VersionCode/1"));
        }
        String stringExtra = intent.getStringExtra("redirect_uri");
        WebView.setWebContentsDebuggingEnabled(true);
        this.f113524OooOo0o.setWebViewClient(new OooO0OO(stringExtra));
        this.f113524OooOo0o.setWebChromeClient(new OooO00o());
        CookieSyncManager.createInstance(getApplicationContext());
        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.setAcceptCookie(true);
        String stringExtra2 = intent.getStringExtra("userid");
        String stringExtra3 = intent.getStringExtra("serviceToken");
        if (!TextUtils.isEmpty(stringExtra2) && !TextUtils.isEmpty(stringExtra3)) {
            String str = C31854OooO0Oo.f113533OooO00o;
            cookieManager.setCookie(str, stringExtra2);
            cookieManager.setCookie(str, stringExtra3);
        }
        String stringExtra4 = intent.getStringExtra("activatorToken");
        String stringExtra5 = intent.getStringExtra("hash");
        String stringExtra6 = intent.getStringExtra("operator");
        String stringExtra7 = intent.getStringExtra("operatorLink");
        SharedPreferences sharedPreferences = getSharedPreferences(TmemberRight.TAG_DEVICEID, 0);
        String string = sharedPreferences == null ? null : sharedPreferences.getString("hashedDeviceId", null);
        if (TextUtils.isEmpty(string)) {
            try {
                strOooO00o = C31866OooO00o.OooO00o(this, 3, new String[0]);
            } catch (SecurityException unused2) {
                string = null;
            }
            if (TextUtils.isEmpty(strOooO00o) || strOooO00o == null) {
                string = null;
            } else {
                try {
                    string = Base64.encodeToString(MessageDigest.getInstance("SHA1").digest(strOooO00o.getBytes()), 8).substring(0, 16);
                } catch (NoSuchAlgorithmException unused3) {
                    throw new IllegalStateException("failed to init SHA1 digest");
                }
            }
            if (string != null) {
                SharedPreferences sharedPreferences2 = getSharedPreferences(TmemberRight.TAG_DEVICEID, 0);
                if (sharedPreferences2 != null) {
                    sharedPreferences2.edit().putString("hashedDeviceId", string).commit();
                }
            } else {
                String strOooO00o2 = C31866OooO00o.OooO00o(this, 2, new String[0]);
                String strOooO00o3 = TextUtils.isEmpty(strOooO00o2) ? null : com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("android_id_", strOooO00o2);
                if (TextUtils.isEmpty(strOooO00o3)) {
                    string = com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("android_pseudo_", UUID.randomUUID().toString());
                    SharedPreferences sharedPreferences3 = getSharedPreferences(TmemberRight.TAG_DEVICEID, 0);
                    if (sharedPreferences3 != null) {
                        sharedPreferences3.edit().putString("hashedDeviceId", string).commit();
                    }
                } else {
                    SharedPreferences sharedPreferences4 = getSharedPreferences(TmemberRight.TAG_DEVICEID, 0);
                    if (sharedPreferences4 != null) {
                        sharedPreferences4.edit().putString("hashedDeviceId", strOooO00o3).commit();
                    }
                    string = strOooO00o3;
                }
            }
        }
        String str2 = C31854OooO0Oo.f113533OooO00o;
        cookieManager.setCookie(str2, stringExtra5);
        cookieManager.setCookie(str2, stringExtra4);
        cookieManager.setCookie(str2, stringExtra6);
        cookieManager.setCookie(str2, stringExtra7);
        cookieManager.setCookie(str2, "deviceId=" + string);
        CookieSyncManager.getInstance().sync();
        OooO00o(false);
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        WebView webView = this.f113524OooOo0o;
        if (webView != null) {
            webView.removeAllViews();
            this.f113524OooOo0o.destroy();
            this.f113524OooOo0o = null;
        }
        super.onDestroy();
    }
}
