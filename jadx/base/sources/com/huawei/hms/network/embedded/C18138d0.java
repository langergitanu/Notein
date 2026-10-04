package com.huawei.hms.network.embedded;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Message;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.network.embedded.C18250l0;
import com.huawei.secure.android.common.intent.SafeIntent;
import o0O00o.AbstractC25843OooO00o;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.d0 */
/* JADX INFO: loaded from: classes9.dex */
public class C18138d0 extends AbstractC25843OooO00o {

    /* JADX INFO: renamed from: b */
    public static final String f54506b = "NetDiagBroadcaseReceive";

    /* JADX INFO: renamed from: c */
    public static C18138d0 f54507c;

    /* JADX INFO: renamed from: a */
    public C18124c0 f54508a;

    public C18138d0(C18124c0 c18124c0) {
        this.f54508a = c18124c0;
    }

    /* JADX INFO: renamed from: a */
    public static void m78156a(Context context, C18124c0 c18124c0) {
        Logger.m76963i(f54506b, "the broadcastReceiver will begin to register!");
        if (context == null) {
            Logger.m76965v(f54506b, "context == null,and return it");
            return;
        }
        f54507c = new C18138d0(c18124c0);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(f54507c, intentFilter);
        Logger.m76963i(f54506b, "the broadcastReceiver will end to register!");
    }

    @Override // o0O00o.AbstractC25843OooO00o
    public void onReceiveMsg(Context context, Intent intent) {
        Logger.m76965v(f54506b, "the broadcast has received the event!");
        String strOooO00o = new SafeIntent(intent).OooO00o();
        Message messageObtain = Message.obtain();
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(strOooO00o)) {
            Logger.m76965v(f54506b, "the action is error,please check your action!");
            return;
        }
        messageObtain.what = 1002;
        messageObtain.obj = C18250l0.m.f55516a;
        this.f54508a.m78040b(messageObtain);
    }
}
