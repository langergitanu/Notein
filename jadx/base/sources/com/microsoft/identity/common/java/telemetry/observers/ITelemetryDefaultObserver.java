package com.microsoft.identity.common.java.telemetry.observers;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
@Deprecated
public interface ITelemetryDefaultObserver extends ITelemetryObserver<List<Map<String, String>>> {
    @Override // com.microsoft.identity.common.java.telemetry.observers.ITelemetryObserver
    void onReceived(List<Map<String, String>> list);
}
