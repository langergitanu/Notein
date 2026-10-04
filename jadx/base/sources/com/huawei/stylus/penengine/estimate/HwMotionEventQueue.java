package com.huawei.stylus.penengine.estimate;

import android.util.Log;
import com.huawei.penkit.impl.estimate.HwRecycleQueueImpl;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class HwMotionEventQueue {
    private static final int RET_ERROR = -1;
    private static final String TAG = "PenKit-HwMotionEventQueue";
    private IHwRecycleQueue mRecycleQueue;

    public HwMotionEventQueue() {
        if (this.mRecycleQueue == null) {
            this.mRecycleQueue = new HwRecycleQueueImpl();
        }
    }

    public void clear() {
        IHwRecycleQueue iHwRecycleQueue = this.mRecycleQueue;
        if (iHwRecycleQueue != null) {
            iHwRecycleQueue.clear();
        } else {
            Log.e(TAG, "HwMotionEventQueue, clear error, mRecycleQueue is null!");
        }
    }

    public int fill(List<HwMotionEventInfo> list) {
        IHwRecycleQueue iHwRecycleQueue = this.mRecycleQueue;
        if (iHwRecycleQueue != null) {
            return iHwRecycleQueue.fill(list);
        }
        Log.e(TAG, "HwMotionEventQueue, fill error, mRecycleQueue is null!");
        return -1;
    }

    public IHwRecycleQueue getQueue() {
        return this.mRecycleQueue;
    }
}
