package com.miui.penengine.colorpick;

import android.content.Context;
import android.graphics.ColorSpace;
import android.util.Log;
import com.miui.penengine.p592a.C18756b;
import com.miui.penengine.p596e.C18766a;

/* JADX INFO: loaded from: classes9.dex */
public class MiuiColorPick {
    private static final String TAG = "MiuiColorPick";

    public interface ColorListener {
        void onChange(ColorSpace colorSpace, int i);
    }

    public static synchronized void destroy() {
        try {
            C18756b c18756bM80247c = C18756b.m80247c();
            C18766a c18766aM80265b = c18756bM80247c.m80265b();
            if (c18766aM80265b != null) {
                c18766aM80265b.m80320a();
                c18756bM80247c.m80262a(2);
            } else {
                Log.e(TAG, "Destroy color picker failed, sFacade is null!");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static synchronized boolean init(Context context) {
        boolean zM80263a;
        zM80263a = C18756b.m80247c().m80263a(context, 2);
        if (!zM80263a) {
            Log.e(TAG, "Init color picker failed");
        }
        return zM80263a;
    }

    public static synchronized void registerColorListener(ColorListener colorListener) {
        try {
            C18766a c18766aM80265b = C18756b.m80247c().m80265b();
            if (c18766aM80265b != null) {
                c18766aM80265b.m80322a(colorListener);
            } else {
                Log.e(TAG, "Register color listener failed, sFacade is null!");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static synchronized boolean triggerColorPicking() {
        if (C18756b.m80247c().m80267k() == 0) {
            return true;
        }
        Log.e(TAG, "Trigger color picking failed");
        return false;
    }
}
