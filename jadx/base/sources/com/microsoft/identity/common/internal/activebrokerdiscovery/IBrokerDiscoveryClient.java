package com.microsoft.identity.common.internal.activebrokerdiscovery;

import com.microsoft.identity.common.internal.broker.BrokerData;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m80612d2 = {"Lcom/microsoft/identity/common/internal/activebrokerdiscovery/IBrokerDiscoveryClient;", "", "getActiveBroker", "Lcom/microsoft/identity/common/internal/broker/BrokerData;", "shouldSkipCache", "", "common_distRelease"}, m80613k = 1, m80614mv = {1, 7, 1}, m80616xi = 48)
public interface IBrokerDiscoveryClient {

    @Metadata(m80613k = 3, m80614mv = {1, 7, 1}, m80616xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ BrokerData getActiveBroker$default(IBrokerDiscoveryClient iBrokerDiscoveryClient, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getActiveBroker");
            }
            if ((i & 1) != 0) {
                z = false;
            }
            return iBrokerDiscoveryClient.getActiveBroker(z);
        }
    }

    BrokerData getActiveBroker(boolean shouldSkipCache);
}
