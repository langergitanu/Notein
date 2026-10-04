package oO000Oo;

import com.huawei.hms.network.embedded.C18101a5;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import oO0OOo0o.AbstractC33093Oooo0oo;

/* JADX INFO: loaded from: classes10.dex */
public final class o0O0O00 extends AbstractC31985Oooo0oo {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final ReferenceQueue<o0O0O00> f114744OooO0OO = new ReferenceQueue<>();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final ConcurrentHashMap f114745OooO0Oo = new ConcurrentHashMap();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final Logger f114746OooO0o0 = Logger.getLogger(o0O0O00.class.getName());

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO00o f114747OooO0O0;

    public static final class OooO00o extends WeakReference<o0O0O00> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public static final boolean f114748OooO0o = Boolean.parseBoolean(System.getProperty("io.grpc.ManagedChannel.enableAllocationTracking", TelemetryEventStrings.Value.TRUE));

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public static final RuntimeException f114749OooO0oO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ReferenceQueue<o0O0O00> f114750OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final ConcurrentHashMap f114751OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final String f114752OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final SoftReference f114753OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final AtomicBoolean f114754OooO0o0;

        static {
            RuntimeException runtimeException = new RuntimeException("ManagedChannel allocation site not recorded.  Set -Dio.grpc.ManagedChannel.enableAllocationTracking=true to enable it");
            runtimeException.setStackTrace(new StackTraceElement[0]);
            f114749OooO0oO = runtimeException;
        }

        public OooO00o(o0O0O00 o0o0o00, o00Ooo o00ooo2, ReferenceQueue referenceQueue, ConcurrentHashMap concurrentHashMap) {
            super(o0o0o00, referenceQueue);
            this.f114754OooO0o0 = new AtomicBoolean();
            this.f114753OooO0Oo = new SoftReference(f114748OooO0o ? new RuntimeException("ManagedChannel allocation site") : f114749OooO0oO);
            this.f114752OooO0OO = o00ooo2.toString();
            this.f114750OooO00o = referenceQueue;
            this.f114751OooO0O0 = concurrentHashMap;
            concurrentHashMap.put(this, this);
            OooO00o(referenceQueue);
        }

        public static void OooO00o(ReferenceQueue referenceQueue) {
            while (true) {
                OooO00o oooO00o = (OooO00o) referenceQueue.poll();
                if (oooO00o == null) {
                    return;
                }
                SoftReference softReference = oooO00o.f114753OooO0Oo;
                RuntimeException runtimeException = (RuntimeException) softReference.get();
                super.clear();
                oooO00o.f114751OooO0O0.remove(oooO00o);
                softReference.clear();
                if (!oooO00o.f114754OooO0o0.get()) {
                    Level level = Level.SEVERE;
                    Logger logger = o0O0O00.f114746OooO0o0;
                    if (logger.isLoggable(level)) {
                        LogRecord logRecord = new LogRecord(level, "*~*~*~ Previous channel {0} was garbage collected without being shut down! ~*~*~*" + System.getProperty(C18101a5.f54156e) + "    Make sure to call shutdown()/shutdownNow()");
                        logRecord.setLoggerName(logger.getName());
                        logRecord.setParameters(new Object[]{oooO00o.f114752OooO0OO});
                        logRecord.setThrown(runtimeException);
                        logger.log(logRecord);
                    }
                }
            }
        }

        @Override // java.lang.ref.Reference
        public final void clear() {
            super.clear();
            this.f114751OooO0O0.remove(this);
            this.f114753OooO0Oo.clear();
            OooO00o(this.f114750OooO00o);
        }
    }

    public o0O0O00() {
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0O00(o00Ooo o00ooo2) {
        super(o00ooo2);
        ReferenceQueue<o0O0O00> referenceQueue = f114744OooO0OO;
        ConcurrentHashMap concurrentHashMap = f114745OooO0Oo;
        this.f114747OooO0O0 = new OooO00o(this, o00ooo2, referenceQueue, concurrentHashMap);
    }

    @Override // oO0OOo0o.AbstractC33093Oooo0oo
    public final AbstractC33093Oooo0oo OooOO0o() {
        OooO00o oooO00o = this.f114747OooO0O0;
        if (!oooO00o.f114754OooO0o0.getAndSet(true)) {
            oooO00o.clear();
        }
        o00Ooo o00ooo2 = this.f114205OooO00o;
        o00ooo2.OooOo0();
        return o00ooo2;
    }

    @Override // oO0OOo0o.AbstractC33093Oooo0oo
    public final AbstractC33093Oooo0oo OooOOO0() {
        OooO00o oooO00o = this.f114747OooO0O0;
        if (!oooO00o.f114754OooO0o0.getAndSet(true)) {
            oooO00o.clear();
        }
        o00Ooo o00ooo2 = this.f114205OooO00o;
        o00ooo2.OooOOO0();
        return o00ooo2;
    }
}
