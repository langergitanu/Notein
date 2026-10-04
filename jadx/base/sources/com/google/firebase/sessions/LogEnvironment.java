package com.google.firebase.sessions;

import com.google.firebase.encoders.json.NumberedEnum;
import kotlin.Metadata;
import oOo000oo.InterfaceC34452OooO00o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0080\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, m80612d2 = {"Lcom/google/firebase/sessions/LogEnvironment;", "Lcom/google/firebase/encoders/json/NumberedEnum;", "", "number", "", "<init>", "(Ljava/lang/String;II)V", "getNumber", "()I", "LOG_ENVIRONMENT_UNKNOWN", "LOG_ENVIRONMENT_AUTOPUSH", "LOG_ENVIRONMENT_STAGING", "LOG_ENVIRONMENT_PROD", "com.google.firebase-firebase-sessions"}, m80613k = 1, m80614mv = {2, 0, 0}, m80616xi = 48)
public final class LogEnvironment implements NumberedEnum {
    private static final /* synthetic */ InterfaceC34452OooO00o $ENTRIES;
    private static final /* synthetic */ LogEnvironment[] $VALUES;
    private final int number;
    public static final LogEnvironment LOG_ENVIRONMENT_UNKNOWN = new LogEnvironment("LOG_ENVIRONMENT_UNKNOWN", 0, 0);
    public static final LogEnvironment LOG_ENVIRONMENT_AUTOPUSH = new LogEnvironment("LOG_ENVIRONMENT_AUTOPUSH", 1, 1);
    public static final LogEnvironment LOG_ENVIRONMENT_STAGING = new LogEnvironment("LOG_ENVIRONMENT_STAGING", 2, 2);
    public static final LogEnvironment LOG_ENVIRONMENT_PROD = new LogEnvironment("LOG_ENVIRONMENT_PROD", 3, 3);

    private static final /* synthetic */ LogEnvironment[] $values() {
        return new LogEnvironment[]{LOG_ENVIRONMENT_UNKNOWN, LOG_ENVIRONMENT_AUTOPUSH, LOG_ENVIRONMENT_STAGING, LOG_ENVIRONMENT_PROD};
    }

    static {
        LogEnvironment[] logEnvironmentArr$values = $values();
        $VALUES = logEnvironmentArr$values;
        $ENTRIES = OooO.OooO00o.OooO0O0(logEnvironmentArr$values);
    }

    private LogEnvironment(String str, int i, int i2) {
        this.number = i2;
    }

    public static InterfaceC34452OooO00o<LogEnvironment> getEntries() {
        return $ENTRIES;
    }

    public static LogEnvironment valueOf(String str) {
        return (LogEnvironment) Enum.valueOf(LogEnvironment.class, str);
    }

    public static LogEnvironment[] values() {
        return (LogEnvironment[]) $VALUES.clone();
    }

    @Override // com.google.firebase.encoders.json.NumberedEnum
    public int getNumber() {
        return this.number;
    }
}
