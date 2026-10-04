package com.microsoft.identity.common.java.telemetry.relay;

import com.microsoft.identity.common.java.exception.BaseException;

/* JADX INFO: loaded from: classes9.dex */
@Deprecated
public class TelemetryRelayException extends BaseException {
    public static final String INITIALIZATION_FAILED = "initialization_failed";
    public static final String NOT_INITIALIZED = "not_initialized";
    private static final long serialVersionUID = -1543623857511895210L;

    public TelemetryRelayException(String str, Throwable th, String str2) {
        super(str2, str, th);
    }

    public boolean canEqual(Object obj) {
        return obj instanceof TelemetryRelayException;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof TelemetryRelayException) && ((TelemetryRelayException) obj).canEqual(this) && super.equals(obj);
    }

    public int hashCode() {
        return super.hashCode();
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "TelemetryRelayException()";
    }

    public TelemetryRelayException(Throwable th, String str) {
        this(null, th, str);
    }

    public TelemetryRelayException(String str, String str2) {
        this(str, null, str2);
    }
}
