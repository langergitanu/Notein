package com.microsoft.identity.common.java.exception;

import com.microsoft.identity.common.java.telemetry.ITelemetryAccessor;
import com.microsoft.identity.common.java.telemetry.Telemetry;
import com.microsoft.identity.common.java.telemetry.events.ErrorEvent;
import com.microsoft.identity.common.java.util.StringUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes9.dex */
public class BaseException extends Exception implements IErrorInformation, ITelemetryAccessor {
    private static final TreeSet<String> nonCacheableErrorCodes = new TreeSet<>(Arrays.asList("device_network_not_available", ClientException.INTERRUPTED_OPERATION, ClientException.INVALID_BROKER_BUNDLE, "io_error"));
    public static final String sName = "com.microsoft.identity.common.exception.BaseException";
    private static final long serialVersionUID = -5166242728507796770L;
    private String mCliTelemErrorCode;
    private String mCliTelemSubErrorCode;
    private String mCorrelationId;
    private String mErrorCode;
    private String mRefreshTokenAge;
    private String mSpeRing;
    private final List<Throwable> mSuppressedException;
    private final List<Map<String, String>> mTelemetry;
    private String mUsername;

    public BaseException() {
        this(null);
    }

    public void addSuppressedException(Throwable th) {
        if (th == null) {
            throw new NullPointerException("e is marked non-null but is null");
        }
        this.mSuppressedException.add(th);
    }

    public String getCliTelemErrorCode() {
        return this.mCliTelemErrorCode;
    }

    public String getCliTelemSubErrorCode() {
        return this.mCliTelemSubErrorCode;
    }

    public String getCorrelationId() {
        return this.mCorrelationId;
    }

    public String getErrorCode() {
        return this.mErrorCode;
    }

    public String getExceptionName() {
        return sName;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        if (StringUtil.isNullOrEmpty(super.getMessage())) {
            return null;
        }
        return super.getMessage();
    }

    public String getRefreshTokenAge() {
        return this.mRefreshTokenAge;
    }

    public String getSpeRing() {
        return this.mSpeRing;
    }

    public List<Throwable> getSuppressedException() {
        return this.mSuppressedException;
    }

    @Override // com.microsoft.identity.common.java.telemetry.ITelemetryAccessor
    public List<Map<String, String>> getTelemetry() {
        return this.mTelemetry;
    }

    public String getUsername() {
        return this.mUsername;
    }

    public boolean isCacheable() {
        return !nonCacheableErrorCodes.contains(this.mErrorCode);
    }

    public void setCliTelemErrorCode(String str) {
        this.mCliTelemErrorCode = str;
    }

    public void setCliTelemSubErrorCode(String str) {
        this.mCliTelemSubErrorCode = str;
    }

    public void setCorrelationId(String str) {
        this.mCorrelationId = str;
    }

    public void setRefreshTokenAge(String str) {
        this.mRefreshTokenAge = str;
    }

    public void setSpeRing(String str) {
        this.mSpeRing = str;
    }

    public void setTelemetry(List<Map<String, String>> list) {
        if (list == null) {
            throw new NullPointerException("telemetry is marked non-null but is null");
        }
        this.mTelemetry.addAll(list);
    }

    public void setUsername(String str) {
        if (str == null) {
            throw new NullPointerException("username is marked non-null but is null");
        }
        this.mUsername = str;
    }

    public BaseException(String str) {
        this(str, null);
    }

    public BaseException(String str, String str2) {
        this(str, str2, null);
    }

    public BaseException(String str, String str2, Throwable th) {
        super(str2, th);
        this.mTelemetry = new ArrayList();
        this.mSuppressedException = new ArrayList();
        this.mErrorCode = str;
        Telemetry.emit(new ErrorEvent().putException(this));
    }
}
