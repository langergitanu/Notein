package com.huawei.agconnect.core.p569a;

import com.huawei.agconnect.AGCInitFinishManager;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: com.huawei.agconnect.core.a.a */
/* JADX INFO: loaded from: classes8.dex */
public class C17592a extends AGCInitFinishManager {

    /* JADX INFO: renamed from: a */
    private static final List<AGCInitFinishManager.AGCInitFinishCallback> f52038a = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: a */
    public static void m75386a() {
        Iterator<AGCInitFinishManager.AGCInitFinishCallback> it = f52038a.iterator();
        while (it.hasNext()) {
            it.next().onFinish();
        }
    }

    @Override // com.huawei.agconnect.AGCInitFinishManager
    public void addAGCInitFinishCallback(AGCInitFinishManager.AGCInitFinishCallback aGCInitFinishCallback) {
        if (aGCInitFinishCallback != null) {
            f52038a.add(aGCInitFinishCallback);
        }
    }
}
