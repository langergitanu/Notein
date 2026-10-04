package o0oOoOoO;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.core.content.ContextCompat;
import com.aspose.slides.C22227OoooO;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.orion.notein.global.R;
import kotlin.jvm.internal.OooOOO0;
import o0OoO0.C28513OooO0oO;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0oOoOoO.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31101OooO0oo {
    public static void OooO00o(Context context, String url) {
        OooOOO0.OooO0oO(context, "context");
        OooOOO0.OooO0oO(url, "url");
        try {
            Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL);
            intent.setData(Uri.parse(url));
            ContextCompat.startActivity(context, intent, null);
        } catch (ActivityNotFoundException e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            StringBuilder sbOooO00o = C22227OoooO.OooO00o(c20358OooO00o, "WebHelper", "openWebPage(", url, ") failed. ActivityNotFoundException. ");
            sbOooO00o.append(e);
            c20358OooO00o.OooO0Oo(e, sbOooO00o.toString(), new Object[0]);
            C28513OooO0oO.OooO00o(context, R.string.error_no_browser, "getString(...)", context);
        }
    }
}
