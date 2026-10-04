package com.huawei.hms.api;

import com.huawei.hms.support.log.HMSLog;
import java.sql.Timestamp;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class FailedBinderCallBack {
    public static final String CALLER_ID = "callId";

    /* JADX INFO: renamed from: a */
    private static FailedBinderCallBack f52412a;

    /* JADX INFO: renamed from: b */
    private static Map<Long, BinderCallBack> f52413b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c */
    private static final Object f52414c = new Object();

    public interface BinderCallBack {
        void binderCallBack(int i);
    }

    private FailedBinderCallBack() {
    }

    /* JADX INFO: renamed from: a */
    private void m75764a() {
        long time = new Timestamp(System.currentTimeMillis()).getTime() - 10000;
        for (Long l : f52413b.keySet()) {
            if (time >= l.longValue()) {
                f52413b.remove(l);
            }
        }
    }

    public static FailedBinderCallBack getInstance() {
        synchronized (f52414c) {
            try {
                if (f52412a == null) {
                    f52412a = new FailedBinderCallBack();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f52412a;
    }

    public BinderCallBack getCallBack(Long l) {
        Map<Long, BinderCallBack> map = f52413b;
        if (map != null) {
            return map.remove(l);
        }
        HMSLog.m80172e("FailedBinderCallBack", "binderCallBackMap is null");
        return null;
    }

    public void setCallBack(Long l, BinderCallBack binderCallBack) {
        m75765a(l, binderCallBack);
    }

    /* JADX INFO: renamed from: a */
    private void m75765a(Long l, BinderCallBack binderCallBack) {
        if (f52413b == null) {
            HMSLog.m80172e("FailedBinderCallBack", "binderCallBackMap is null");
        } else {
            m75764a();
            f52413b.put(l, binderCallBack);
        }
    }
}
