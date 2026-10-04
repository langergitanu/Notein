package com.miui.penengine.estimate;

import android.content.Context;
import android.util.Log;
import com.miui.penengine.p592a.C18756b;
import com.miui.penengine.p596e.InterfaceC18768c;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class MiuiStrokeEstimate {
    private static final String TAG = "MiuiStrokeEstimate";

    public static synchronized int getEstimateEvent(List<MiuiMotionEventInfo> list, List<MiuiMotionEventInfo> list2) {
        InterfaceC18768c interfaceC18768cM80253f = C18756b.m80253f();
        if (interfaceC18768cM80253f != null) {
            return interfaceC18768cM80253f.mo80324a(list, list2);
        }
        Log.e(TAG, "MiuiStrokeEstimate, getEstimateEvent error, sFacade is null!");
        return -1;
    }

    public static synchronized boolean isFeatureEnable(Context context) {
        InterfaceC18768c interfaceC18768cM80253f = C18756b.m80253f();
        if (interfaceC18768cM80253f == null) {
            Log.e(TAG, "MiuiStrokeEstimate, isFeatureEnable error, sFacade is null!");
            return false;
        }
        boolean zMo80327a = interfaceC18768cM80253f.mo80327a();
        if (zMo80327a) {
            interfaceC18768cM80253f.mo80326a(context);
        }
        return zMo80327a;
    }

    public static synchronized void setRefreshRate(float f) {
        try {
            InterfaceC18768c interfaceC18768cM80253f = C18756b.m80253f();
            if (interfaceC18768cM80253f != null) {
                interfaceC18768cM80253f.mo80325a(f);
            } else {
                Log.e(TAG, "MiuiStrokeEstimate, setRefreshRate error, sFacade is null!");
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
