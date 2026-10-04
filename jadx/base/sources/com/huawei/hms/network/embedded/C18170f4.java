package com.huawei.hms.network.embedded;

import com.huawei.hms.network.inner.api.PolicyNetworkService;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.f4 */
/* JADX INFO: loaded from: classes9.dex */
public class C18170f4 extends C18292o0 {

    /* JADX INFO: renamed from: b */
    public static final String f54733b = "NetworkConfig";

    public C18170f4(String str) {
        super(str);
    }

    public boolean disableWeakNetworkRetry() {
        return getBoolean(PolicyNetworkService.ClientConstants.DISABLE_WEAKNETWORK_RETRY);
    }

    public boolean enableConcurrentConnect() {
        return getBoolean(PolicyNetworkService.RequestConstants.ENABLE_CONCURRENT_CONNECT);
    }

    public boolean enableConnectEmptyBody() {
        return getBoolean(PolicyNetworkService.RequestConstants.CONNECT_EMPTY_BODY);
    }

    public boolean enableInnerConnectEmptyBody() {
        return getBoolean(PolicyNetworkService.RequestConstants.INNER_CONNECT_EMPTY_BODY);
    }

    public boolean enablePlaintextUrlPath() {
        return getBoolean(PolicyNetworkService.ClientConstants.ENABLE_PLAINTEXT_URL_PATH);
    }

    public boolean enableTrafficControlWith429() {
        return getBoolean(PolicyNetworkService.RequestConstants.ENABLE_TRAFFIC_CONTROL_WITH_429);
    }

    public int getCallTimeout() {
        return getInt(PolicyNetworkService.RequestConstants.CALL_TIMEOUT);
    }

    public int getConcurrentConnectDelay() {
        return getInt(PolicyNetworkService.RequestConstants.CONCURRENT_CONNECT_DELAY);
    }

    public int getConnectTimeout() {
        return getInt(PolicyNetworkService.RequestConstants.CONNECT_TIMEOUT);
    }

    public int getMaxRequestDiscreteTime() {
        return getInt(PolicyNetworkService.RequestConstants.MAX_REQUEST_DISCRETE_TIME);
    }

    public int getMaxRetryWaitingTime() {
        return getInt(PolicyNetworkService.RequestConstants.MAX_RETRY_WAITING_TIME);
    }

    public int getPingInterval() {
        return getInt(PolicyNetworkService.RequestConstants.PING_INTERVAL);
    }

    public int getReadTimeout() {
        return getInt(PolicyNetworkService.RequestConstants.READ_TIMEOUT);
    }

    public int getRetryAfterTime() {
        return 8000;
    }

    public int getRetryTimeOnConnectionFailure() {
        return getInt(PolicyNetworkService.RequestConstants.RETRY_TIME);
    }

    public int getWriteTimeout() {
        return getInt(PolicyNetworkService.RequestConstants.WRITE_TIMEOUT);
    }
}
