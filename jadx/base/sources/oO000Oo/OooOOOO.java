package oO000Oo;

import Oooo0oO.C21111o0ooOoO;
import com.google.common.base.Preconditions;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import oO0OOo0o.AbstractC33061OooO0o0;
import oO0OOo0o.C33077OooOoo;
import oO0OOo0o.C33082Oooo00O;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOOOO {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final Logger f113991OooO0OO = Logger.getLogger(AbstractC33061OooO0o0.class.getName());

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Object f113992OooO00o = new Object();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C33082Oooo00O f113993OooO0O0;

    public OooOOOO(C33082Oooo00O c33082Oooo00O, long j, String str) {
        Preconditions.checkNotNull(str, "description");
        this.f113993OooO0O0 = (C33082Oooo00O) Preconditions.checkNotNull(c33082Oooo00O, "logId");
        String strOooO0Oo = C21111o0ooOoO.OooO0Oo(str, " created");
        C33077OooOoo.OooO00o oooO00o = C33077OooOoo.OooO00o.f119601OooOo0o;
        Long lValueOf = Long.valueOf(j);
        Preconditions.checkNotNull(strOooO0Oo, "description");
        Preconditions.checkNotNull(oooO00o, "severity");
        Preconditions.checkNotNull(lValueOf, "timestampNanos");
        Preconditions.checkState(true, "at least one of channelRef and subchannelRef must be null");
        OooO0O0(new C33077OooOoo(strOooO0Oo, oooO00o, j, null));
    }

    public static void OooO00o(C33082Oooo00O c33082Oooo00O, Level level, String str) {
        Logger logger = f113991OooO0OO;
        if (logger.isLoggable(level)) {
            LogRecord logRecord = new LogRecord(level, "[" + c33082Oooo00O + "] " + str);
            logRecord.setLoggerName(logger.getName());
            logRecord.setSourceClassName(logger.getName());
            logRecord.setSourceMethodName("log");
            logger.log(logRecord);
        }
    }

    public final void OooO0O0(C33077OooOoo c33077OooOoo) {
        int iOrdinal = c33077OooOoo.f119597OooO0O0.ordinal();
        Level level = iOrdinal != 2 ? iOrdinal != 3 ? Level.FINEST : Level.FINE : Level.FINER;
        synchronized (this.f113992OooO00o) {
        }
        OooO00o(this.f113993OooO0O0, level, c33077OooOoo.f119596OooO00o);
    }
}
