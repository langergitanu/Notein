package com.miui.penengine.auth;

import android.content.Context;
import android.util.Log;
import com.miui.penengine.p592a.C18756b;
import com.miui.penengine.p596e.C18774i;

/* JADX INFO: loaded from: classes9.dex */
public class MiuiAuthHelper {
    private static final String TAG = "MiuiAuthHelper";

    public interface AuthResultListener {
        void onAuthComplete(boolean z);
    }

    public static synchronized void destroyAuthService() {
        C18774i c18774iM80259i = C18756b.m80259i();
        if (c18774iM80259i != null) {
            c18774iM80259i.m80353a();
        }
    }

    public static synchronized boolean initAuthService(Context context, AuthResultListener authResultListener) {
        if (!C18756b.m80257h()) {
            Log.e(TAG, "System environment init error");
            return false;
        }
        C18774i c18774iM80259i = C18756b.m80259i();
        if (c18774iM80259i != null) {
            return c18774iM80259i.m80355a(context, authResultListener);
        }
        Log.e(TAG, "MiuiAuthHelper, initAuthService error, pencilEngineManager is null!");
        return false;
    }

    public static synchronized void runAuthConnect() {
        C18774i c18774iM80259i = C18756b.m80259i();
        if (c18774iM80259i != null) {
            c18774iM80259i.m80356b();
        }
    }
}
