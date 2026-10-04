package com.huawei.stylus.penengine.estimate;

import android.util.Log;
import com.huawei.penkit.impl.estimate.HwStrokeEstimateImpl;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class HwStrokeEstimate {
    private static final String HW_STROKE_ESTIMATE_IMPL = "com.huawei.penkit.impl.estimate.HwStrokeEstimateImpl";
    private static final int RET_ERROR = -1;
    private static final String TAG = "PenKit-HwStrokeEstimate";
    private static IHwStrokeEstimate sEstimate;

    static {
        try {
            Class.forName(HW_STROKE_ESTIMATE_IMPL);
            if (sEstimate == null) {
                sEstimate = new HwStrokeEstimateImpl();
            }
        } catch (ClassNotFoundException unused) {
            Log.i(TAG, "sEstimate is unavailable");
        }
    }

    private HwStrokeEstimate() {
    }

    public static synchronized int getEstimateEvent(IHwRecycleQueue iHwRecycleQueue, List<HwMotionEventInfo> list) {
        IHwStrokeEstimate iHwStrokeEstimate = sEstimate;
        if (iHwStrokeEstimate != null) {
            return iHwStrokeEstimate.getEstimateEvent(iHwRecycleQueue, list);
        }
        Log.e(TAG, "HwStrokeEstimate, getEstimateEvent error, sEstimate is null!");
        return -1;
    }

    public static synchronized boolean isFeatureEnable() {
        IHwStrokeEstimate iHwStrokeEstimate = sEstimate;
        if (iHwStrokeEstimate != null) {
            return iHwStrokeEstimate.isFeatureEnable();
        }
        Log.e(TAG, "HwStrokeEstimate, isFeatureEnable error, sEstimate is null!");
        return false;
    }

    public static synchronized void setRefreshRate(float f) {
        try {
            IHwStrokeEstimate iHwStrokeEstimate = sEstimate;
            if (iHwStrokeEstimate != null) {
                iHwStrokeEstimate.setRefreshRate(f);
            } else {
                Log.e(TAG, "HwStrokeEstimate, setRefreshRate error, sEstimate is null!");
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
