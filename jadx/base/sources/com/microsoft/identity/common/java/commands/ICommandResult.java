package com.microsoft.identity.common.java.commands;

/* JADX INFO: loaded from: classes9.dex */
public interface ICommandResult<T> {

    public enum ResultStatus {
        CANCEL,
        COMPLETED,
        ERROR,
        VOID;

        public String getLogStatus() {
            return name();
        }
    }

    String getCorrelationId();

    T getResult();

    ResultStatus getStatus();
}
