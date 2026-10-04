package oO0OO0OO;

import com.google.common.base.Preconditions;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.EnumMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import oO000OoO.C32078OooO0oo;
import oO000OoO.EnumC32073OooO00o;
import oOo00OoO.C34524OooO0Oo;
import oOo00OoO.C34527OooO0oO;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Logger f118712OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Level f118713OooO0O0;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final OooO00o f118714OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO00o f118715OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public static final /* synthetic */ OooO00o[] f118716OooOoO0;

        static {
            OooO00o oooO00o = new OooO00o("INBOUND", 0);
            f118715OooOo0o = oooO00o;
            OooO00o oooO00o2 = new OooO00o("OUTBOUND", 1);
            f118714OooOo = oooO00o2;
            f118716OooOoO0 = new OooO00o[]{oooO00o, oooO00o2};
        }

        public OooO00o() {
            throw null;
        }

        public static OooO00o valueOf(String str) {
            return (OooO00o) Enum.valueOf(OooO00o.class, str);
        }

        public static OooO00o[] values() {
            return (OooO00o[]) f118716OooOoO0.clone();
        }
    }

    public enum OooO0O0 {
        /* JADX INFO: Fake field, exist only in values array */
        HEADER_TABLE_SIZE(1),
        /* JADX INFO: Fake field, exist only in values array */
        ENABLE_PUSH(2),
        /* JADX INFO: Fake field, exist only in values array */
        MAX_CONCURRENT_STREAMS(4),
        /* JADX INFO: Fake field, exist only in values array */
        MAX_FRAME_SIZE(5),
        /* JADX INFO: Fake field, exist only in values array */
        MAX_HEADER_LIST_SIZE(6),
        /* JADX INFO: Fake field, exist only in values array */
        INITIAL_WINDOW_SIZE(7);


        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final int f118718OooOo0o;

        OooO0O0(int i) {
            this.f118718OooOo0o = i;
        }
    }

    public OooOO0O() {
        Level level = Level.FINE;
        Logger logger = Logger.getLogger(OooO.class.getName());
        this.f118713OooO0O0 = (Level) Preconditions.checkNotNull(level, FirebaseAnalytics.Param.LEVEL);
        this.f118712OooO00o = (Logger) Preconditions.checkNotNull(logger, "logger");
    }

    public static String OooO0oo(C34524OooO0Oo c34524OooO0Oo) {
        long j = c34524OooO0Oo.f123723OooOo;
        if (j <= 64) {
            return c34524OooO0Oo.o0000oO().OooO0Oo();
        }
        return c34524OooO0Oo.o0000O((int) Math.min(j, 64L)).OooO0Oo() + "...";
    }

    public final boolean OooO00o() {
        return this.f118712OooO00o.isLoggable(this.f118713OooO0O0);
    }

    public final void OooO0O0(OooO00o oooO00o, int i, C34524OooO0Oo c34524OooO0Oo, int i2, boolean z) {
        if (OooO00o()) {
            this.f118712OooO00o.log(this.f118713OooO0O0, oooO00o + " DATA: streamId=" + i + " endStream=" + z + " length=" + i2 + " bytes=" + OooO0oo(c34524OooO0Oo));
        }
    }

    public final void OooO0OO(OooO00o oooO00o, int i, EnumC32073OooO00o enumC32073OooO00o, C34527OooO0oO c34527OooO0oO) {
        if (OooO00o()) {
            StringBuilder sb = new StringBuilder();
            sb.append(oooO00o);
            sb.append(" GO_AWAY: lastStreamId=");
            sb.append(i);
            sb.append(" errorCode=");
            sb.append(enumC32073OooO00o);
            sb.append(" length=");
            sb.append(c34527OooO0oO.OooO0OO());
            sb.append(" bytes=");
            C34524OooO0Oo c34524OooO0Oo = new C34524OooO0Oo();
            c34524OooO0Oo.o0000o0(c34527OooO0oO);
            sb.append(OooO0oo(c34524OooO0Oo));
            this.f118712OooO00o.log(this.f118713OooO0O0, sb.toString());
        }
    }

    public final void OooO0Oo(OooO00o oooO00o, long j) {
        if (OooO00o()) {
            this.f118712OooO00o.log(this.f118713OooO0O0, oooO00o + " PING: ack=false bytes=" + j);
        }
    }

    public final void OooO0o(OooO00o oooO00o, C32078OooO0oo c32078OooO0oo) {
        if (OooO00o()) {
            StringBuilder sb = new StringBuilder();
            sb.append(oooO00o);
            sb.append(" SETTINGS: ack=false settings=");
            EnumMap enumMap = new EnumMap(OooO0O0.class);
            for (OooO0O0 oooO0O0 : OooO0O0.values()) {
                if (c32078OooO0oo.OooO00o(oooO0O0.f118718OooOo0o)) {
                    enumMap.put(oooO0O0, Integer.valueOf(c32078OooO0oo.f114899OooO0O0[oooO0O0.f118718OooOo0o]));
                }
            }
            sb.append(enumMap.toString());
            this.f118712OooO00o.log(this.f118713OooO0O0, sb.toString());
        }
    }

    public final void OooO0o0(OooO00o oooO00o, int i, EnumC32073OooO00o enumC32073OooO00o) {
        if (OooO00o()) {
            this.f118712OooO00o.log(this.f118713OooO0O0, oooO00o + " RST_STREAM: streamId=" + i + " errorCode=" + enumC32073OooO00o);
        }
    }

    public final void OooO0oO(OooO00o oooO00o, int i, long j) {
        if (OooO00o()) {
            this.f118712OooO00o.log(this.f118713OooO0O0, oooO00o + " WINDOW_UPDATE: streamId=" + i + " windowSizeIncrement=" + j);
        }
    }
}
