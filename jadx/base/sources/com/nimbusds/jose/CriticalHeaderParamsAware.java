package com.nimbusds.jose;

import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public interface CriticalHeaderParamsAware {
    Set<String> getDeferredCriticalHeaderParams();

    Set<String> getProcessedCriticalHeaderParams();
}
