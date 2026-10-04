package com.miui.penengine.onestroke;

import android.content.Context;
import android.graphics.Path;
import android.util.Log;
import android.view.MotionEvent;
import com.miui.penengine.p592a.C18756b;
import com.miui.penengine.p596e.C18770e;

/* JADX INFO: loaded from: classes9.dex */
public class MiuiOneStroke {
    private static final String TAG = "MiuiOneStroke";

    public static synchronized int destroyShapeRecognize() {
        C18770e c18770eM80250d = C18756b.m80250d();
        if (c18770eM80250d != null) {
            return c18770eM80250d.m80337a();
        }
        Log.e(TAG, "MiuiOneStroke, destroyShapeRecognize error, sFacade is null!");
        return -1;
    }

    public static synchronized Path getPath() {
        C18770e c18770eM80250d = C18756b.m80250d();
        if (c18770eM80250d == null) {
            return null;
        }
        return c18770eM80250d.m80341b();
    }

    public static synchronized boolean isFeatureEnable(Context context) {
        if (!C18756b.m80257h()) {
            Log.e(TAG, "System environment init error");
            return false;
        }
        C18770e c18770e = C18756b.f57100p;
        if (c18770e == null) {
            Log.e(TAG, "MiuiOneStroke, isFeatureEnable error, sFacade is null!");
            return false;
        }
        boolean zM80342c = c18770e.m80342c();
        if (!zM80342c || c18770e.m80340a(context)) {
            return zM80342c;
        }
        return false;
    }

    public static synchronized void processTouchEvent(MotionEvent motionEvent) {
        C18770e c18770eM80250d = C18756b.m80250d();
        if (c18770eM80250d != null) {
            c18770eM80250d.m80339a(motionEvent);
        }
    }

    public static synchronized void setStopTime(int i) {
        C18770e c18770eM80250d = C18756b.m80250d();
        if (c18770eM80250d != null) {
            c18770eM80250d.m80338a(i);
        }
    }
}
