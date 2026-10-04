package com.miui.penengine.ocr;

import android.content.Context;
import android.util.Log;
import com.miui.penengine.p592a.C18756b;
import com.miui.penengine.p596e.C18771f;

/* JADX INFO: loaded from: classes9.dex */
public class MiuiRecognize {
    private static final String TAG = "MiuiRecognize";

    public static synchronized void destroyTextRecognize() {
        try {
            C18771f c18771fM80251e = C18756b.m80251e();
            if (c18771fM80251e != null) {
                c18771fM80251e.m80345a();
            } else {
                Log.e(TAG, "Destroy text recognize failed, sFacade is null!");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static synchronized boolean isFeatureEnable(Context context) {
        if (!C18756b.m80257h()) {
            Log.e(TAG, "System environment init error");
            return false;
        }
        C18771f c18771fM80251e = C18756b.m80251e();
        if (c18771fM80251e != null) {
            return c18771fM80251e.m80346a(context);
        }
        Log.e(TAG, "Get feature enable failed, sFacade is null!");
        return false;
    }

    public static synchronized String recognizeText(MiuiInk miuiInk) {
        C18771f c18771fM80251e = C18756b.m80251e();
        if (c18771fM80251e != null) {
            return c18771fM80251e.m80344a(miuiInk);
        }
        Log.e(TAG, "Recognize text failed, sFacade is null!");
        return null;
    }
}
