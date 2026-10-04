package com.microsoft.identity.common.java.controllers;

import com.microsoft.identity.common.java.commands.ICommandResult;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class CommandResult<T> implements ICommandResult<T> {
    private final String mCorrelationId;
    private final T mResult;
    private final Class<T> mResultClass;
    private final ICommandResult.ResultStatus mStatus;
    private List<Map<String, String>> mTelemetryMap;

    @Deprecated
    public CommandResult(ICommandResult.ResultStatus resultStatus, T t) {
        this(resultStatus, t, null);
    }

    /* JADX INFO: renamed from: of */
    public static <T> CommandResult<T> m80238of(ICommandResult.ResultStatus resultStatus, T t, String str) {
        if (resultStatus == null) {
            throw new NullPointerException("status is marked non-null but is null");
        }
        if (t != null) {
            return new CommandResult<>(resultStatus, t, str);
        }
        throw new NullPointerException("result is marked non-null but is null");
    }

    public static CommandResult<Void> ofNull(ICommandResult.ResultStatus resultStatus, String str) {
        if (resultStatus != null) {
            return new CommandResult<>(resultStatus, str);
        }
        throw new NullPointerException("status is marked non-null but is null");
    }

    @Override // com.microsoft.identity.common.java.commands.ICommandResult
    public String getCorrelationId() {
        return this.mCorrelationId;
    }

    @Override // com.microsoft.identity.common.java.commands.ICommandResult
    public T getResult() {
        return this.mResult;
    }

    public Class<T> getResultClass() {
        return this.mResultClass;
    }

    @Override // com.microsoft.identity.common.java.commands.ICommandResult
    public ICommandResult.ResultStatus getStatus() {
        return this.mStatus;
    }

    public List<Map<String, String>> getTelemetryMap() {
        return this.mTelemetryMap;
    }

    public void setTelemetryMap(List<Map<String, String>> list) {
        this.mTelemetryMap = list;
    }

    public CommandResult(ICommandResult.ResultStatus resultStatus, T t, String str) {
        this.mTelemetryMap = new ArrayList();
        if (resultStatus == null) {
            throw new NullPointerException("status is marked non-null but is null");
        }
        if (t == null) {
            throw new NullPointerException("result is marked non-null but is null");
        }
        this.mStatus = resultStatus;
        this.mResult = t;
        this.mCorrelationId = str == null ? TelemetryEventStrings.Value.UNSET : str;
        this.mResultClass = (Class<T>) t.getClass();
    }

    private CommandResult(ICommandResult.ResultStatus resultStatus, String str) {
        this.mTelemetryMap = new ArrayList();
        if (resultStatus != null) {
            this.mStatus = resultStatus;
            this.mResult = null;
            this.mCorrelationId = str == null ? TelemetryEventStrings.Value.UNSET : str;
            this.mResultClass = Void.class;
            return;
        }
        throw new NullPointerException("status is marked non-null but is null");
    }
}
