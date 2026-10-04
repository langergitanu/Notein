package com.huawei.hms.network.embedded;

import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.network.base.common.Headers;
import com.huawei.hms.network.embedded.C18321q3;
import com.huawei.hms.network.httpclient.Request;
import com.huawei.hms.network.httpclient.Response;
import com.huawei.hms.network.httpclient.ResponseBody;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.r3 */
/* JADX INFO: loaded from: classes9.dex */
public class C18334r3 {

    /* JADX INFO: renamed from: a */
    public static final String f55999a = "TrafficController";

    /* JADX INFO: renamed from: b */
    public static final long f56000b = 1000;

    /* JADX INFO: renamed from: c */
    public static final double f56001c = 2.0d;

    /* JADX INFO: renamed from: d */
    public static final double f56002d = 0.5d;

    public static long enableRetryIntervalBackoff(Request request, int i) {
        int maxRetryWaitingTime = ((C18321q3.d) request).getNetConfig().getMaxRetryWaitingTime();
        if (maxRetryWaitingTime <= 0) {
            return 0L;
        }
        long waitingInterval = getWaitingInterval(i, maxRetryWaitingTime);
        waiting(waitingInterval);
        return waitingInterval;
    }

    public static long enableTrafficControlWith429(Request request, Response<ResponseBody> response) {
        long jStringToLong = StringUtils.stringToLong(Headers.m77737of(response.getHeaders()).get("Retry-After"), 0L);
        long retryAfterTime = ((C18321q3.d) request).getNetConfig().getRetryAfterTime();
        if (retryAfterTime <= 0 || jStringToLong <= 0) {
            return 0L;
        }
        long jMin = Math.min(retryAfterTime, jStringToLong);
        waiting(jMin);
        return jMin;
    }

    public static long getWaitingInterval(int i, long j) {
        return Math.min((long) (Math.pow(2.0d, i) * 1000.0d * ((((Math.random() * (-2.0d)) + 1.0d) * 0.5d) + 1.0d)), j);
    }

    public static long requestDiscreteControl(Request request) {
        long maxRequestDiscreteTime = ((C18321q3.d) request).getNetConfig().getMaxRequestDiscreteTime();
        if (maxRequestDiscreteTime <= 0) {
            return 0L;
        }
        long jRandom = (long) (Math.random() * maxRequestDiscreteTime);
        waiting(jRandom);
        return jRandom;
    }

    public static void waiting(long j) {
        try {
            Logger.m76965v(f55999a, "is await success: " + new CountDownLatch(1).await(j, TimeUnit.MILLISECONDS));
        } catch (InterruptedException unused) {
            Logger.m76967w(f55999a, "countDownLatch await interruptedException");
        }
    }
}
