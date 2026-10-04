package com.vivo.penengine.impl;

import android.content.Context;
import com.huawei.hms.network.embedded.C18374u4;
import com.vivo.penengine.impl.VivoStylusGestureManagerImpl;

/* JADX INFO: loaded from: classes10.dex */
public final class VivoStylusManagerImpl implements VivoStylusGestureManagerImpl.OnGestureCallback {
    private static final String TAG = "VivoStylusManagerImpl";
    private static volatile VivoStylusManagerImpl instance;
    private final Context mContext;
    private boolean mIsInitialized;

    public enum STYLUS_WRITING_VIBRATE_TYPE {
        OFF,
        TYPE_1,
        TYPE_2;

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(Object obj) {
            return compareTo((Enum) obj);
        }
    }

    private VivoStylusManagerImpl(Context context) {
        this.mContext = context.getApplicationContext();
    }

    public static VivoStylusManagerImpl getInstance(Context context) {
        if (instance == null) {
            synchronized (VivoStylusManagerImpl.class) {
                try {
                    if (instance == null) {
                        instance = new VivoStylusManagerImpl(context);
                    }
                } finally {
                }
            }
        }
        return instance;
    }

    public void destroy() {
        EngineLog.m80593d(TAG, "destroy: init=" + this.mIsInitialized);
        if (this.mIsInitialized) {
            VivoStylusGestureManagerImpl.getInstance(this.mContext).unregisterGestureCallback(this);
            this.mIsInitialized = false;
        }
    }

    public void enableWritingVibrate(boolean z) {
        if (this.mIsInitialized) {
            VivoStylusGestureManagerImpl.getInstance(this.mContext).writingVibrate(z, STYLUS_WRITING_VIBRATE_TYPE.TYPE_2.ordinal());
        }
    }

    public void init() {
        VivoStylusGestureManagerImpl.getInstance(this.mContext).registerGestureCallback(this);
        this.mIsInitialized = true;
        EngineLog.m80593d(TAG, C18374u4.f56270c);
    }

    @Override // com.vivo.penengine.impl.VivoStylusGestureManagerImpl.OnGestureCallback
    public boolean onGesture(int i) {
        return false;
    }
}
