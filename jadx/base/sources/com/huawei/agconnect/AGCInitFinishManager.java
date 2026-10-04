package com.huawei.agconnect;

import com.huawei.agconnect.core.p569a.C17592a;

/* JADX INFO: loaded from: classes8.dex */
public abstract class AGCInitFinishManager {
    private static final AGCInitFinishManager INSTANCE = new C17592a();

    public interface AGCInitFinishCallback {
        void onFinish();
    }

    public static AGCInitFinishManager getInstance() {
        return INSTANCE;
    }

    public abstract void addAGCInitFinishCallback(AGCInitFinishCallback aGCInitFinishCallback);
}
