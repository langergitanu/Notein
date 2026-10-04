package com.microsoft.identity.client;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public interface IMsalEventReceiver {
    void onEventsReceived(List<Map<String, String>> list);
}
