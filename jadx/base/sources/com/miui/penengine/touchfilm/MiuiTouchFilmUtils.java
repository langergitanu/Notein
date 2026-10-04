package com.miui.penengine.touchfilm;

import android.content.Context;
import android.util.Log;
import android.view.KeyEvent;
import com.miui.penengine.p592a.C18756b;
import com.miui.penengine.p596e.C18775j;

/* JADX INFO: loaded from: classes9.dex */
public class MiuiTouchFilmUtils {
    public static final int SHOW_BRUSH_SETTINGS = 4;
    public static final int SHOW_COLOR_WHEEL = 3;
    public static final int STYLUS_SLIDE_DOWN = 6;
    public static final int STYLUS_SLIDE_UP = 5;
    public static final int SWITCH_BETWEEN_BRUSH_AND_ERASER = 1;
    public static final int SWITCH_TO_PREVIOUS_BRUSH = 2;
    private static final String TAG = "MiuiTouchFilmUtils";
    public static final int UNKNOWN_SETTINGS_FUNCTION = 0;

    public interface TouchFilmListener {
        void onBrushPreviewChanged(boolean z);

        void onTouchFilmTriggered(int i);
    }

    public static synchronized boolean init(Context context, TouchFilmListener touchFilmListener) {
        C18756b c18756bM80247c = C18756b.m80247c();
        boolean zM80263a = c18756bM80247c.m80263a(context, 4);
        C18775j c18775jM80260j = C18756b.m80260j();
        if (c18775jM80260j == null || !zM80263a) {
            Log.e(TAG, "Init error, sFacade is null!");
            return false;
        }
        c18775jM80260j.m80364a(context, touchFilmListener);
        c18756bM80247c.m80264b(true);
        return true;
    }

    public static synchronized void onDestroy() {
        try {
            C18756b c18756bM80247c = C18756b.m80247c();
            C18775j c18775jM80260j = C18756b.m80260j();
            if (c18775jM80260j != null) {
                c18775jM80260j.m80366b();
                c18756bM80247c.m80264b(false);
            } else {
                Log.e(TAG, "Destroy error, sFacade is null!");
            }
            c18756bM80247c.m80262a(4);
        } catch (Throwable th) {
            throw th;
        }
    }

    public static synchronized boolean onDispatchKeyEvent(KeyEvent keyEvent) {
        C18775j c18775jM80260j = C18756b.m80260j();
        if (c18775jM80260j != null) {
            return c18775jM80260j.m80365a(keyEvent);
        }
        Log.e(TAG, "Handle key event error, sFacade is null!");
        return false;
    }
}
