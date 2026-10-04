package com.microsoft.identity.common.java.net;

import java.io.IOException;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes9.dex */
public interface IRetryPolicy<T> {
    T attempt(Callable<T> callable) throws IOException;
}
