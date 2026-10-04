package com.microsoft.identity.common.java.commands;

/* JADX INFO: loaded from: classes9.dex */
public interface ICommand<T> {
    T execute() throws Exception;

    String getCorrelationId();

    boolean isEligibleForCaching();

    boolean isEligibleForEstsTelemetry();

    boolean willReachTokenEndpoint();
}
