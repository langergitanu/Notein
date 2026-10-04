package com.miui.penengine.posture;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import com.miui.penengine.p592a.C18756b;
import com.miui.penengine.p596e.C18769d;
import com.miui.penengine.p596e.C18773h;

/* JADX INFO: loaded from: classes9.dex */
public class MiuiStylusPosture {
    private static final String TAG = "MiuiStylusPosture";

    public static synchronized void destroy() {
        C18756b c18756bM80247c = C18756b.m80247c();
        c18756bM80247c.m80261a(false);
        c18756bM80247c.m80262a(1);
    }

    public static synchronized boolean genericMotionEvent(MotionEvent motionEvent) {
        C18773h c18773hM80266g = C18756b.m80247c().m80266g();
        if (c18773hM80266g != null) {
            return c18773hM80266g.m80350a(motionEvent);
        }
        Log.e(TAG, "Generic motion event failed, sFacade is null!");
        return false;
    }

    public static synchronized int getDegree() {
        C18773h c18773hM80266g = C18756b.m80247c().m80266g();
        if (c18773hM80266g != null) {
            return c18773hM80266g.m80348a();
        }
        Log.e(TAG, "Get degree failed, sFacade is null!");
        return 0;
    }

    public static synchronized boolean init(Context context) {
        boolean zM80263a;
        try {
            C18756b c18756bM80247c = C18756b.m80247c();
            zM80263a = c18756bM80247c.m80263a(context, 1);
            if (zM80263a) {
                c18756bM80247c.m80261a(true);
            } else {
                Log.e(TAG, "Init stylus posture failed");
            }
        } catch (Throwable th) {
            throw th;
        }
        return zM80263a;
    }

    public static synchronized void setPreviewBrush(C18769d c18769d) {
        try {
            C18773h c18773hM80266g = C18756b.m80247c().m80266g();
            if (c18773hM80266g != null) {
                c18773hM80266g.m80349a(c18769d);
            } else {
                Log.e(TAG, "Set preview brush failed, sFacade is null!");
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
