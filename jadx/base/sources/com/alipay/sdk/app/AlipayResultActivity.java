package com.alipay.sdk.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import o00OO0.OooO0O0;
import o00Oo0o0.C25047OooO00o;
import o00Oo0oO.C25052OooO0Oo;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class AlipayResultActivity extends Activity {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final ConcurrentHashMap<String, OooO00o> f66829OooOo0o = new ConcurrentHashMap<>();

    public interface OooO00o {
        void OooO00o(int i, String str, String str2);
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        Intent intent;
        C25047OooO00o c25047OooO00oRemove;
        String stringExtra;
        Bundle bundleExtra;
        String stringExtra2;
        Throwable th;
        super.onCreate(bundle);
        try {
            intent = getIntent();
            c25047OooO00oRemove = null;
            try {
                stringExtra = intent.getStringExtra("session");
                bundleExtra = intent.getBundleExtra("result");
                stringExtra2 = intent.getStringExtra("scene");
                HashMap<UUID, C25047OooO00o> map = C25047OooO00o.C19671OooO00o.f85044OooO00o;
                if (!TextUtils.isEmpty(stringExtra)) {
                    c25047OooO00oRemove = C25047OooO00o.C19671OooO00o.f85045OooO0O0.remove(stringExtra);
                }
            } catch (Throwable th2) {
                o00OOOOo.OooO00o.OooO0Oo(null, "biz", "BSPSerError", th2);
                o00OOOOo.OooO00o.OooO0Oo(null, "biz", "ParseBundleSerializableError", th2);
                return;
            }
        } catch (Throwable unused) {
        }
        if (c25047OooO00oRemove == null) {
            return;
        }
        o00OOOOo.OooO00o.OooO0OO(c25047OooO00oRemove, "biz", "BSPSession", stringExtra + "|" + SystemClock.elapsedRealtime());
        if (TextUtils.equals("mqpSchemePay", stringExtra2)) {
            OooO00o oooO00oRemove = f66829OooOo0o.remove(stringExtra);
            if (oooO00oRemove == null) {
                return;
            }
            try {
                oooO00oRemove.OooO00o(bundleExtra.getInt("endCode"), bundleExtra.getString("memo"), bundleExtra.getString("result"));
                return;
            } finally {
                finish();
            }
        }
        if ((TextUtils.isEmpty(stringExtra) || bundleExtra == null) && intent.getData() != null) {
            try {
                JSONObject jSONObject = new JSONObject(new String(Base64.decode(intent.getData().getQuery(), 2), "UTF-8"));
                JSONObject jSONObject2 = jSONObject.getJSONObject("result");
                stringExtra = jSONObject.getString("session");
                o00OOOOo.OooO00o.OooO0OO(c25047OooO00oRemove, "biz", "BSPUriSession", stringExtra);
                Bundle bundle2 = new Bundle();
                try {
                    Iterator<String> itKeys = jSONObject2.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        bundle2.putString(next, jSONObject2.getString(next));
                    }
                    bundleExtra = bundle2;
                } catch (Throwable th3) {
                    th = th3;
                    bundleExtra = bundle2;
                    o00OOOOo.OooO00o.OooO0Oo(c25047OooO00oRemove, "biz", "BSPResEx", th);
                    o00OOOOo.OooO00o.OooO0Oo(c25047OooO00oRemove, "biz", "ParseSchemeQueryError", th);
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
        boolean zIsEmpty = TextUtils.isEmpty(stringExtra);
        String str = c25047OooO00oRemove.f85036OooO0Oo;
        if (zIsEmpty || bundleExtra == null) {
            o00OOOOo.OooO00o.OooO0o(this, "", str, c25047OooO00oRemove);
            finish();
            return;
        }
        try {
            o00OOOOo.OooO00o.OooO0OO(c25047OooO00oRemove, "biz", "PgReturn", "" + SystemClock.elapsedRealtime());
            o00OOOOo.OooO00o.OooO0OO(c25047OooO00oRemove, "biz", "PgReturnV", bundleExtra.getInt("endCode", -1) + "|" + bundleExtra.getString("memo", CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR));
            OooO0O0.OooO00o oooO00o = (OooO0O0.OooO00o) OooO0O0.f84714OooO00o.remove(stringExtra);
            if (oooO00o != null) {
                try {
                    oooO00o.OooO00o();
                } catch (Throwable th5) {
                    C25052OooO0Oo.OooO00o(th5);
                }
            }
            o00OOOOo.OooO00o.OooO0o(this, "", str, c25047OooO00oRemove);
            finish();
        } catch (Throwable th6) {
            o00OOOOo.OooO00o.OooO0o(this, "", str, c25047OooO00oRemove);
            throw th6;
        }
    }
}
