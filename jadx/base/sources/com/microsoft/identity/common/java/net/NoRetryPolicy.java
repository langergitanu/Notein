package com.microsoft.identity.common.java.net;

import java.io.IOException;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes9.dex */
public class NoRetryPolicy implements IRetryPolicy<HttpResponse> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.microsoft.identity.common.java.net.IRetryPolicy
    public HttpResponse attempt(Callable<HttpResponse> callable) throws IOException {
        return callable.call();
    }
}
