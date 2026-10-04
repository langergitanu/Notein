package o0O00o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import com.huawei.secure.android.common.intent.SafeIntent;
import java.util.regex.Pattern;
import o0O00OoO.C25841OooO00o;

/* JADX INFO: renamed from: o0O00o.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC25843OooO00o extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        boolean zOooO0O0 = true;
        if (intent == null) {
            C25841OooO00o.OooO0OO("IntentUtils", "intent is null");
        } else if (intent instanceof SafeIntent) {
            Pattern pattern = C25841OooO00o.f88180OooO00o;
            if (!TextUtils.isEmpty("safe intent")) {
                Log.i("SecurityComp10105306: ".concat("IntentUtils"), C25841OooO00o.OooO00o("safe intent", false));
            }
            zOooO0O0 = ((SafeIntent) intent).OooO0O0();
        } else {
            try {
                intent.getStringExtra("ANYTHING");
                zOooO0O0 = false;
            } catch (Exception unused) {
            }
        }
        if (zOooO0O0) {
            C25841OooO00o.OooO0OO("IntentUtils", "hasIntentBomb");
        }
        if (zOooO0O0) {
            return;
        }
        onReceiveMsg(context, new SafeIntent(intent));
    }

    public abstract void onReceiveMsg(Context context, Intent intent);
}
