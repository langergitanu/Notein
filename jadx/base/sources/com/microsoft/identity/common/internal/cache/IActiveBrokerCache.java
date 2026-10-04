package com.microsoft.identity.common.internal.cache;

import com.microsoft.identity.common.internal.broker.BrokerData;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m80612d2 = {"Lcom/microsoft/identity/common/internal/cache/IActiveBrokerCache;", "", "Lcom/microsoft/identity/common/internal/broker/BrokerData;", "getCachedActiveBroker", "()Lcom/microsoft/identity/common/internal/broker/BrokerData;", "brokerData", "LoO00ooO/OooOooO;", "setCachedActiveBroker", "(Lcom/microsoft/identity/common/internal/broker/BrokerData;)V", "clearCachedActiveBroker", "()V", "", "shouldUseAccountManager", "()Z", "", "timeInMillis", "setShouldUseAccountManagerForTheNextMilliseconds", "(J)V", "common_distRelease"}, m80613k = 1, m80614mv = {1, 7, 1}, m80616xi = 48)
public interface IActiveBrokerCache {
    void clearCachedActiveBroker();

    BrokerData getCachedActiveBroker();

    void setCachedActiveBroker(BrokerData brokerData);

    void setShouldUseAccountManagerForTheNextMilliseconds(long timeInMillis);

    boolean shouldUseAccountManager();
}
