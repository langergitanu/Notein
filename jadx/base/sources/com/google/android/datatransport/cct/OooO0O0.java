package com.google.android.datatransport.cct;

import com.google.android.datatransport.cct.CctTransportBackend;
import com.google.android.datatransport.runtime.retries.RetryStrategy;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class OooO0O0 implements RetryStrategy {
    @Override // com.google.android.datatransport.runtime.retries.RetryStrategy
    public final Object shouldRetry(Object obj, Object obj2) {
        return CctTransportBackend.lambda$send$0((CctTransportBackend.HttpRequest) obj, (CctTransportBackend.HttpResponse) obj2);
    }
}
