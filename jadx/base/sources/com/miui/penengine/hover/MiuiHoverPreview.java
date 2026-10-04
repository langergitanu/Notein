package com.miui.penengine.hover;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import android.view.View;
import com.miui.penengine.p596e.C18769d;

/* JADX INFO: loaded from: classes9.dex */
public class MiuiHoverPreview {
    private static final String TAG = "MiuiHoverPreview";
    private static C18769d sBrushPreview;

    public static synchronized void destroy() {
        try {
            C18769d c18769d = sBrushPreview;
            if (c18769d != null) {
                c18769d.m80332a();
                sBrushPreview = null;
            } else {
                Log.e(TAG, "Destroy failed, sBrushPreview is null!");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static synchronized C18769d getPreviewBrush() {
        return sBrushPreview;
    }

    public static synchronized void init(Context context, View view) {
        try {
            if (sBrushPreview == null) {
                sBrushPreview = new C18769d(context, view);
            } else {
                Log.e(TAG, "Repeated initialization");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static synchronized void setBrush(Bitmap bitmap) {
        try {
            C18769d c18769d = sBrushPreview;
            if (c18769d != null) {
                c18769d.setHoverBrush(bitmap);
            } else {
                Log.e(TAG, "Set brush failed, sBrushPreview is null!");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static synchronized void sizeBrush(float f) {
        try {
            C18769d c18769d = sBrushPreview;
            if (c18769d != null) {
                c18769d.m80335b(f);
            } else {
                Log.e(TAG, "Size brush failed, sBrushPreview is null!");
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
