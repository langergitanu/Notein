package o0oooOOo;

import Oooo0oO.o0Oo0oo;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.aspose.words.WarningType;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.huawei.hms.network.embedded.C18115b5;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.microsoft.identity.client.internal.MsalUtils;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import com.xiaomi.account.OooO00o;
import com.xiaomi.account.XiaomiOAuthResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import o0oooOo.C31853OooO0OO;
import o0oooOo.C31854OooO0Oo;
import o0oooOo.C31856OooO0o0;

/* JADX INFO: renamed from: o0oooOOo.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31848OooO0oO implements InterfaceC31841OooO {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final String f113509OooO0OO = androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), C31854OooO0Oo.f113533OooO00o, "/oauth2/authorize");

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f113510OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f113511OooO0O0;

    /* JADX INFO: renamed from: o0oooOOo.OooO0oO$OooO00o */
    public class OooO00o extends OooO00o.AbstractBinderC19585OooO00o {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ ArrayList f113512OooO0o;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f113513OooO0oO;

        public OooO00o(ArrayList arrayList, CountDownLatch countDownLatch) {
            this.f113512OooO0o = arrayList;
            this.f113513OooO0oO = countDownLatch;
        }

        @Override // com.xiaomi.account.OooO00o
        public final void OooOOoo(Bundle bundle) throws RemoteException {
            this.f113512OooO0o.add(C31856OooO0o0.OooO0OO(bundle));
            this.f113513OooO0oO.countDown();
        }

        @Override // com.xiaomi.account.OooO00o
        public final void onCancel() throws RemoteException {
            this.f113513OooO0oO.countDown();
        }
    }

    public C31848OooO0oO(String str, String str2) {
        this.f113510OooO00o = str;
        this.f113511OooO0O0 = str2;
    }

    @Override // o0oooOOo.InterfaceC31841OooO
    public final C31856OooO0o0 OooO00o(WeakReference<Activity> weakReference, C31845OooO0Oo c31845OooO0Oo) throws InterruptedException, OperationCanceledException, IOException, C31853OooO0OO, AuthenticatorException {
        Activity activity = weakReference.get();
        if (c31845OooO0Oo.f113492OooOO0O.booleanValue()) {
            Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL);
            intent.setData(Uri.parse(OooO0O0(c31845OooO0Oo)));
            intent.addFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
            intent.addFlags(WarningType.HINT);
            if (activity != null) {
                activity.startActivity(intent);
                return null;
            }
            Log.e("WebViewOauth", "activity is null");
            return null;
        }
        try {
            Log.i("WebViewOauth", "WebViewOauth quietOAuth start...");
            Log.i("WebViewOauth", "WebViewOauth..quietOAuth..accountAuth is null");
            throw new AuthenticatorException();
        } catch (AuthenticatorException unused) {
            Log.e("WebViewOauth", "quietOAuth failed");
            if (activity == null || activity.isFinishing()) {
                Log.e("WebViewOauth", "activity is null");
                Bundle bundle = new Bundle();
                bundle.putInt("extra_error_code", -1001);
                bundle.putString("extra_error_description", "activity is null");
                return C31856OooO0o0.OooO0OO(bundle);
            }
            CountDownLatch countDownLatch = new CountDownLatch(1);
            ArrayList arrayList = new ArrayList();
            OooO00o oooO00o = new OooO00o(arrayList, countDownLatch);
            Intent intent2 = new Intent(activity, c31845OooO0Oo.f113488OooO0o0);
            intent2.putExtra("url", OooO0O0(c31845OooO0Oo));
            intent2.putExtra("redirect_uri", this.f113511OooO0O0);
            intent2.putExtra("extra_keep_cookies ", false);
            XiaomiOAuthResponse xiaomiOAuthResponse = new XiaomiOAuthResponse();
            xiaomiOAuthResponse.f80221OooOo0o = oooO00o;
            intent2.putExtra("extra_response", xiaomiOAuthResponse);
            activity.startActivity(intent2);
            countDownLatch.await();
            if (arrayList.size() > 0) {
                return (C31856OooO0o0) arrayList.get(0);
            }
            throw new OperationCanceledException();
        }
    }

    public final String OooO0O0(C31845OooO0Oo c31845OooO0Oo) {
        String strEncode;
        Bundle bundle = new Bundle();
        bundle.putString("client_id", this.f113510OooO00o);
        bundle.putString("redirect_uri", this.f113511OooO0O0);
        bundle.putString("response_type", c31845OooO0Oo.f113487OooO0o);
        bundle.putString("scope", c31845OooO0Oo.f113483OooO00o);
        String language = null;
        bundle.putString("state", null);
        Boolean bool = c31845OooO0Oo.f113486OooO0Oo;
        if (bool != null) {
            bundle.putString("skip_confirm", String.valueOf(bool));
        }
        String str = c31845OooO0Oo.f113482OooO;
        if (str != null) {
            bundle.putString("_loginType", str);
        }
        Boolean bool2 = c31845OooO0Oo.f113493OooOO0o;
        if (bool2 != null) {
            bundle.putString("_hideQrApps", bool2.booleanValue() ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE);
        }
        bundle.putString(TranslateLanguage.PORTUGUESE, "0");
        bundle.putString(C18115b5.DEVICE_ID, null);
        bundle.putString("display", null);
        if (!bundle.containsKey("_locale")) {
            Locale locale = Locale.getDefault();
            if (locale != null) {
                language = locale.getLanguage();
                String country = locale.getCountry();
                if (!TextUtils.isEmpty(country)) {
                    language = o0Oo0oo.OooO0Oo(language, C18115b5.CONNECTOR, country);
                }
            }
            if (!TextUtils.isEmpty(language)) {
                bundle.putString("_locale", language);
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(f113509OooO0OO);
        sb.append(MsalUtils.QUERY_STRING_SYMBOL);
        HashMap map = new HashMap();
        for (String str2 : bundle.keySet()) {
            String string = bundle.getString(str2);
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(string)) {
                map.put(str2, string);
            }
        }
        int i = C31842OooO00o.f113472OooO00o;
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry entry : map.entrySet()) {
            try {
                String strEncode2 = URLEncoder.encode((String) entry.getKey(), "UTF-8");
                String str3 = (String) entry.getValue();
                if (str3 != null) {
                    try {
                        strEncode = URLEncoder.encode(str3, "UTF-8");
                    } catch (UnsupportedEncodingException e) {
                        throw new IllegalArgumentException(e);
                    }
                } else {
                    strEncode = "";
                }
                if (sb2.length() > 0) {
                    sb2.append("&");
                }
                androidx.concurrent.futures.OooO0O0.OooO0O0(sb2, strEncode2, "=", strEncode);
            } catch (UnsupportedEncodingException e2) {
                throw new IllegalArgumentException(e2);
            }
        }
        sb.append(sb2.toString());
        return sb.toString();
    }
}
