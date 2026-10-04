package com.microsoft.identity.common.internal.broker;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, m80612d2 = {"Lcom/microsoft/identity/common/internal/broker/IBrokerValidator;", "", "isSignedByKnownKeys", "", "brokerData", "Lcom/microsoft/identity/common/internal/broker/BrokerData;", "isValidBrokerPackage", "packageName", "", "common_distRelease"}, m80613k = 1, m80614mv = {1, 7, 1}, m80616xi = 48)
public interface IBrokerValidator {
    boolean isSignedByKnownKeys(BrokerData brokerData);

    boolean isValidBrokerPackage(String packageName);
}
