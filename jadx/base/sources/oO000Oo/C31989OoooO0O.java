package oO000Oo;

import OoooooO.C21421OooO0oO;
import com.aspose.slides.C22226Oooo0oo;
import com.google.common.base.Preconditions;
import com.google.common.base.Splitter;
import com.google.common.base.Stopwatch;
import com.google.common.base.Supplier;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import com.orion.notein.domain.models.backup.BackupFile;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import oO000Oo.C32044o0000o0;
import oO000Oo.InterfaceC31948OooOOoo;
import oO000o00.C32098OooO0oo;
import oO0OOo0o.AbstractC33087Oooo0o0;
import oO0OOo0o.C33082Oooo00O;
import oO0OOo0o.C33094OoooO;
import oO0OOo0o.C33101OoooOO0;
import oO0OOo0o.OooO;
import oO0OOo0o.OooO0OO;
import oO0OOo0o.Oooo0;
import oO0OOo0o.o00Oo0;

/* JADX INFO: renamed from: oO000Oo.OoooO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31989OoooO0O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final C33094OoooO.OooO0O0 f114213OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Logger f114214OooO00o = Logger.getLogger(C31989OoooO0O.class.getName());

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Set<o00Oo0.OooO00o> f114215OooO0O0 = Collections.unmodifiableSet(EnumSet.of(o00Oo0.OooO00o.OK, o00Oo0.OooO00o.INVALID_ARGUMENT, o00Oo0.OooO00o.NOT_FOUND, o00Oo0.OooO00o.ALREADY_EXISTS, o00Oo0.OooO00o.FAILED_PRECONDITION, o00Oo0.OooO00o.ABORTED, o00Oo0.OooO00o.OUT_OF_RANGE, o00Oo0.OooO00o.DATA_LOSS));

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final C33094OoooO.OooO0O0 f114216OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final C33094OoooO.OooO0O0 f114217OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final C33094OoooO.OooO0O0 f114218OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final C33094OoooO.OooO0o f114219OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final C33094OoooO.OooO0o f114220OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final C33094OoooO.OooO0O0 f114221OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final C33094OoooO.OooO0O0 f114222OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final C33094OoooO.OooO0O0 f114223OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static final long f114224OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public static final OooO0OO.OooO0O0<Boolean> f114225OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public static final C32051o0000oo f114226OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public static final OooO00o f114227OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public static final OooO0O0 f114228OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public static final C31990OooO0Oo f114229OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public static final OooO0OO f114230OooOOo0;

    /* JADX INFO: renamed from: oO000Oo.OoooO0O$OooO00o */
    public class OooO00o extends oO0OOo0o.OooO {
    }

    /* JADX INFO: renamed from: oO000Oo.OoooO0O$OooO0O0 */
    public class OooO0O0 implements C32044o0000o0.OooO0OO<Executor> {
        @Override // oO000Oo.C32044o0000o0.OooO0OO
        public final void OooO0O0(Executor executor) {
            ((ExecutorService) executor).shutdown();
        }

        @Override // oO000Oo.C32044o0000o0.OooO0OO
        public final Executor create() {
            return Executors.newCachedThreadPool(C31989OoooO0O.OooO0o0("grpc-default-executor-%d"));
        }

        public final String toString() {
            return "grpc-default-executor";
        }
    }

    /* JADX INFO: renamed from: oO000Oo.OoooO0O$OooO0OO */
    public class OooO0OO implements C32044o0000o0.OooO0OO<ScheduledExecutorService> {
        @Override // oO000Oo.C32044o0000o0.OooO0OO
        public final void OooO0O0(ScheduledExecutorService scheduledExecutorService) {
            scheduledExecutorService.shutdown();
        }

        @Override // oO000Oo.C32044o0000o0.OooO0OO
        public final ScheduledExecutorService create() {
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, C31989OoooO0O.OooO0o0("grpc-timer-%d"));
            try {
                scheduledExecutorServiceNewScheduledThreadPool.getClass().getMethod("setRemoveOnCancelPolicy", Boolean.TYPE).invoke(scheduledExecutorServiceNewScheduledThreadPool, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
            return Executors.unconfigurableScheduledExecutorService(scheduledExecutorServiceNewScheduledThreadPool);
        }
    }

    /* JADX INFO: renamed from: oO000Oo.OoooO0O$OooO0Oo, reason: case insensitive filesystem */
    public class C31990OooO0Oo implements Supplier<Stopwatch> {
        @Override // com.google.common.base.Supplier
        public final Stopwatch get() {
            return Stopwatch.createUnstarted();
        }
    }

    /* JADX INFO: renamed from: oO000Oo.OoooO0O$OooO0o */
    public static final class OooO0o implements Oooo0.OooO00o<byte[]> {
        @Override // oO0OOo0o.C33094OoooO.InterfaceC33097OooO0oO
        public final byte[] OooO00o(Object obj) {
            return (byte[]) obj;
        }

        @Override // oO0OOo0o.C33094OoooO.InterfaceC33097OooO0oO
        public final Object OooO0O0(byte[] bArr) {
            return bArr;
        }
    }

    /* JADX INFO: renamed from: oO000Oo.OoooO0O$OooO0o0, reason: case insensitive filesystem */
    public class C31991OooO0o0 implements OooOo00 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ C32098OooO0oo.C32101OooO0oO.OooO00o f114231OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ OooOo00 f114232OooO0O0;

        public C31991OooO0o0(C32098OooO0oo.C32101OooO0oO.OooO00o oooO00o, OooOo00 oooOo00) {
            this.f114231OooO00o = oooO00o;
            this.f114232OooO0O0 = oooOo00;
        }

        @Override // oO0OOo0o.Oooo000
        public final C33082Oooo00O OooO0OO() {
            return this.f114232OooO0O0.OooO0OO();
        }

        @Override // oO000Oo.OooOo00
        public final InterfaceC31946OooOOo OooO0Oo(C33101OoooOO0<?, ?> c33101OoooOO0, C33094OoooO c33094OoooO, oO0OOo0o.OooO0OO oooO0OO, oO0OOo0o.OooO[] oooOArr) {
            oO0OOo0o.OooO0OO oooO0OO2 = oO0OOo0o.OooO0OO.f119523OooOO0;
            oO0OOo0o.OooO oooOOooO00o = this.f114231OooO00o.OooO00o(new OooO.OooO0O0((oO0OOo0o.OooO0OO) Preconditions.checkNotNull(oooO0OO, "callOptions cannot be null"), 0, false), c33094OoooO);
            Preconditions.checkState(oooOArr[oooOArr.length - 1] == C31989OoooO0O.f114227OooOOOO, "lb tracer already assigned");
            oooOArr[oooOArr.length - 1] = oooOOooO00o;
            return this.f114232OooO0O0.OooO0Oo(c33101OoooOO0, c33094OoooO, oooO0OO, oooOArr);
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX INFO: renamed from: oO000Oo.OoooO0O$OooO0oO, reason: case insensitive filesystem */
    public static final class EnumC31992OooO0oO {

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public static final EnumC31992OooO0oO[] f114233OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public static final EnumC31992OooO0oO f114234OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public static final /* synthetic */ EnumC31992OooO0oO[] f114235OooOoOO;

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final oO0OOo0o.o00Oo0 f114236OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final int f114237OooOo0o;

        /* JADX INFO: Fake field, exist only in values array */
        EnumC31992OooO0oO EF0;

        /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
            	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:506)
            	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:509)
            	at jadx.core.dex.visitors.regions.LoopRegionVisitor.checkArrayForEach(LoopRegionVisitor.java:227)
            	at jadx.core.dex.visitors.regions.LoopRegionVisitor.checkForIndexedLoop(LoopRegionVisitor.java:141)
            	at jadx.core.dex.visitors.regions.LoopRegionVisitor.processLoopRegion(LoopRegionVisitor.java:78)
            	at jadx.core.dex.visitors.regions.LoopRegionVisitor.enterRegion(LoopRegionVisitor.java:62)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
            	at jadx.core.dex.visitors.regions.LoopRegionVisitor.visit(LoopRegionVisitor.java:55)
            */
        static {
            /*
                oO000Oo.OoooO0O$OooO0oO r0 = new oO000Oo.OoooO0O$OooO0oO
                oO0OOo0o.o00Oo0 r1 = oO0OOo0o.o00Oo0.f119725OooOOOO
                java.lang.String r2 = "NO_ERROR"
                r14 = 0
                r0.<init>(r2, r14, r14, r1)
                oO000Oo.OoooO0O$OooO0oO r2 = new oO000Oo.OoooO0O$OooO0oO
                oO0OOo0o.o00Oo0 r3 = oO0OOo0o.o00Oo0.f119723OooOOO
                java.lang.String r4 = "PROTOCOL_ERROR"
                r15 = 1
                r2.<init>(r4, r15, r15, r3)
                r4 = r2
                oO000Oo.OoooO0O$OooO0oO r2 = new oO000Oo.OoooO0O$OooO0oO
                java.lang.String r5 = "INTERNAL_ERROR"
                r6 = 2
                r2.<init>(r5, r6, r6, r3)
                oO000Oo.C31989OoooO0O.EnumC31992OooO0oO.f114234OooOoO0 = r2
                oO000Oo.OoooO0O$OooO0oO r5 = new oO000Oo.OoooO0O$OooO0oO
                java.lang.String r6 = "FLOW_CONTROL_ERROR"
                r7 = 3
                r5.<init>(r6, r7, r7, r3)
                r6 = r4
                oO000Oo.OoooO0O$OooO0oO r4 = new oO000Oo.OoooO0O$OooO0oO
                java.lang.String r7 = "SETTINGS_TIMEOUT"
                r8 = 4
                r4.<init>(r7, r8, r8, r3)
                r7 = r5
                oO000Oo.OoooO0O$OooO0oO r5 = new oO000Oo.OoooO0O$OooO0oO
                java.lang.String r8 = "STREAM_CLOSED"
                r9 = 5
                r5.<init>(r8, r9, r9, r3)
                r8 = r6
                oO000Oo.OoooO0O$OooO0oO r6 = new oO000Oo.OoooO0O$OooO0oO
                java.lang.String r9 = "FRAME_SIZE_ERROR"
                r10 = 6
                r6.<init>(r9, r10, r10, r3)
                r9 = r7
                oO000Oo.OoooO0O$OooO0oO r7 = new oO000Oo.OoooO0O$OooO0oO
                java.lang.String r10 = "REFUSED_STREAM"
                r11 = 7
                r7.<init>(r10, r11, r11, r1)
                r1 = r8
                oO000Oo.OoooO0O$OooO0oO r8 = new oO000Oo.OoooO0O$OooO0oO
                oO0OOo0o.o00Oo0 r10 = oO0OOo0o.o00Oo0.f119716OooO0o
                java.lang.String r11 = "CANCEL"
                r12 = 8
                r8.<init>(r11, r12, r12, r10)
                r10 = r9
                oO000Oo.OoooO0O$OooO0oO r9 = new oO000Oo.OoooO0O$OooO0oO
                java.lang.String r11 = "COMPRESSION_ERROR"
                r12 = 9
                r9.<init>(r11, r12, r12, r3)
                r11 = r10
                oO000Oo.OoooO0O$OooO0oO r10 = new oO000Oo.OoooO0O$OooO0oO
                java.lang.String r12 = "CONNECT_ERROR"
                r13 = 10
                r10.<init>(r12, r13, r13, r3)
                r3 = r11
                oO000Oo.OoooO0O$OooO0oO r11 = new oO000Oo.OoooO0O$OooO0oO
                oO0OOo0o.o00Oo0 r12 = oO0OOo0o.o00Oo0.f119721OooOO0O
                java.lang.String r13 = "Bandwidth exhausted"
                oO0OOo0o.o00Oo0 r12 = r12.OooO0oo(r13)
                java.lang.String r13 = "ENHANCE_YOUR_CALM"
                r14 = 11
                r11.<init>(r13, r14, r14, r12)
                oO000Oo.OoooO0O$OooO0oO r12 = new oO000Oo.OoooO0O$OooO0oO
                oO0OOo0o.o00Oo0 r13 = oO0OOo0o.o00Oo0.f119714OooO
                java.lang.String r14 = "Permission denied as protocol is not secure enough to call"
                oO0OOo0o.o00Oo0 r13 = r13.OooO0oo(r14)
                java.lang.String r14 = "INADEQUATE_SECURITY"
                r16 = r15
                r15 = 12
                r12.<init>(r14, r15, r15, r13)
                oO000Oo.OoooO0O$OooO0oO r13 = new oO000Oo.OoooO0O$OooO0oO
                oO0OOo0o.o00Oo0 r14 = oO0OOo0o.o00Oo0.f119718OooO0oO
                java.lang.String r15 = "HTTP_1_1_REQUIRED"
                r17 = r0
                r0 = 13
                r13.<init>(r15, r0, r0, r14)
                r0 = r17
                oO000Oo.OoooO0O$OooO0oO[] r0 = new oO000Oo.C31989OoooO0O.EnumC31992OooO0oO[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13}
                oO000Oo.C31989OoooO0O.EnumC31992OooO0oO.f114235OooOoOO = r0
                oO000Oo.OoooO0O$OooO0oO[] r0 = values()
                int r1 = r0.length
                int r1 = r1 + (-1)
                r1 = r0[r1]
                int r1 = r1.f114237OooOo0o
                long r1 = (long) r1
                int r1 = (int) r1
                int r1 = r1 + 1
                oO000Oo.OoooO0O$OooO0oO[] r1 = new oO000Oo.C31989OoooO0O.EnumC31992OooO0oO[r1]
                int r2 = r0.length
                r14 = 0
            Lb8:
                if (r14 >= r2) goto Lc5
                r3 = r0[r14]
                int r4 = r3.f114237OooOo0o
                long r4 = (long) r4
                int r4 = (int) r4
                r1[r4] = r3
                int r14 = r14 + 1
                goto Lb8
            Lc5:
                oO000Oo.C31989OoooO0O.EnumC31992OooO0oO.f114233OooOoO = r1
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: oO000Oo.C31989OoooO0O.EnumC31992OooO0oO.<clinit>():void");
        }

        public EnumC31992OooO0oO(String str, int i, int i2, oO0OOo0o.o00Oo0 o00oo02) {
            this.f114237OooOo0o = i2;
            String str2 = "HTTP/2 error code: " + name();
            this.f114236OooOo = o00oo02.OooO0oo(o00oo02.f119729OooO0O0 != null ? androidx.concurrent.futures.OooO00o.OooO0OO(C22226Oooo0oo.OooO0OO(str2, " ("), o00oo02.f119729OooO0O0, ")") : str2);
        }

        public static EnumC31992OooO0oO valueOf(String str) {
            return (EnumC31992OooO0oO) Enum.valueOf(EnumC31992OooO0oO.class, str);
        }

        public static EnumC31992OooO0oO[] values() {
            return (EnumC31992OooO0oO[]) f114235OooOoOO.clone();
        }
    }

    /* JADX INFO: renamed from: oO000Oo.OoooO0O$OooO0oo, reason: case insensitive filesystem */
    public static class C31993OooO0oo implements C33094OoooO.OooO0OO<Long> {
        @Override // oO0OOo0o.C33094OoooO.OooO0OO
        public final String OooO00o(Long l) {
            Long l2 = l;
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            if (l2.longValue() < 0) {
                throw new IllegalArgumentException("Timeout too small");
            }
            if (l2.longValue() < 100000000) {
                return l2 + BackupFile.PREFIX_NOTE_DIR;
            }
            if (l2.longValue() < 100000000000L) {
                return timeUnit.toMicros(l2.longValue()) + "u";
            }
            if (l2.longValue() < 100000000000000L) {
                return timeUnit.toMillis(l2.longValue()) + "m";
            }
            if (l2.longValue() < 100000000000000000L) {
                return timeUnit.toSeconds(l2.longValue()) + "S";
            }
            if (l2.longValue() < 6000000000000000000L) {
                return timeUnit.toMinutes(l2.longValue()) + "M";
            }
            return timeUnit.toHours(l2.longValue()) + "H";
        }

        @Override // oO0OOo0o.C33094OoooO.OooO0OO
        public final Long OooO0O0(String str) {
            Preconditions.checkArgument(str.length() > 0, "empty timeout");
            Preconditions.checkArgument(str.length() <= 9, "bad timeout format");
            long j = Long.parseLong(str.substring(0, str.length() - 1));
            char cOooO00o = androidx.core.content.OooO0O0.OooO00o(1, str);
            if (cOooO00o == 'H') {
                return Long.valueOf(TimeUnit.HOURS.toNanos(j));
            }
            if (cOooO00o == 'M') {
                return Long.valueOf(TimeUnit.MINUTES.toNanos(j));
            }
            if (cOooO00o == 'S') {
                return Long.valueOf(TimeUnit.SECONDS.toNanos(j));
            }
            if (cOooO00o == 'u') {
                return Long.valueOf(TimeUnit.MICROSECONDS.toNanos(j));
            }
            if (cOooO00o == 'm') {
                return Long.valueOf(TimeUnit.MILLISECONDS.toNanos(j));
            }
            if (cOooO00o == 'n') {
                return Long.valueOf(j);
            }
            throw new IllegalArgumentException(C21421OooO0oO.OooO00o("Invalid timeout unit: ", cOooO00o));
        }
    }

    static {
        Charset.forName("US-ASCII");
        f114216OooO0OO = new C33094OoooO.OooO0O0("grpc-timeout", new C31993OooO0oo());
        C33094OoooO.OooO00o oooO00o = C33094OoooO.f119652OooO0Oo;
        f114217OooO0Oo = new C33094OoooO.OooO0O0("grpc-encoding", oooO00o);
        f114219OooO0o0 = oO0OOo0o.Oooo0.OooO00o("grpc-accept-encoding", new OooO0o());
        f114218OooO0o = new C33094OoooO.OooO0O0("content-encoding", oooO00o);
        f114220OooO0oO = oO0OOo0o.Oooo0.OooO00o("accept-encoding", new OooO0o());
        f114221OooO0oo = new C33094OoooO.OooO0O0("content-length", oooO00o);
        f114213OooO = new C33094OoooO.OooO0O0("content-type", oooO00o);
        f114222OooOO0 = new C33094OoooO.OooO0O0("te", oooO00o);
        f114223OooOO0O = new C33094OoooO.OooO0O0("user-agent", oooO00o);
        Splitter.m75085on(',').trimResults();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f114224OooOO0o = timeUnit.toNanos(20L);
        TimeUnit.HOURS.toNanos(2L);
        timeUnit.toNanos(20L);
        f114226OooOOO0 = new C32051o0000oo();
        Preconditions.checkNotNull("io.grpc.internal.CALL_OPTIONS_RPC_OWNED_BY_BALANCER", "debugString");
        f114225OooOOO = new OooO0OO.OooO0O0<>("io.grpc.internal.CALL_OPTIONS_RPC_OWNED_BY_BALANCER");
        f114227OooOOOO = new OooO00o();
        f114228OooOOOo = new OooO0O0();
        f114230OooOOo0 = new OooO0OO();
        f114229OooOOo = new C31990OooO0Oo();
    }

    public static URI OooO00o(String str) {
        String str2;
        Preconditions.checkNotNull(str, "authority");
        try {
            str2 = str;
            try {
                return new URI(null, str2, null, null, null);
            } catch (URISyntaxException e) {
                e = e;
                throw new IllegalArgumentException(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Invalid authority: ", str2), e);
            }
        } catch (URISyntaxException e2) {
            e = e2;
            str2 = str;
        }
    }

    public static void OooO0O0(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException e) {
            f114214OooO00o.log(Level.WARNING, "exception caught in closeQuietly", (Throwable) e);
        }
    }

    public static oO0OOo0o.OooO[] OooO0OO(oO0OOo0o.OooO0OO oooO0OO, C33094OoooO c33094OoooO, int i, boolean z) {
        List<OooO.OooO00o> list = oooO0OO.f119529OooO0o;
        int size = list.size();
        oO0OOo0o.OooO[] oooOArr = new oO0OOo0o.OooO[size + 1];
        oO0OOo0o.OooO0OO oooO0OO2 = oO0OOo0o.OooO0OO.f119523OooOO0;
        OooO.OooO0O0 oooO0O0 = new OooO.OooO0O0((oO0OOo0o.OooO0OO) Preconditions.checkNotNull(oooO0OO, "callOptions cannot be null"), i, z);
        for (int i2 = 0; i2 < list.size(); i2++) {
            oooOArr[i2] = list.get(i2).OooO00o(oooO0O0, c33094OoooO);
        }
        oooOArr[size] = f114227OooOOOO;
        return oooOArr;
    }

    public static String OooO0Oo(InetSocketAddress inetSocketAddress) {
        try {
            return (String) InetSocketAddress.class.getMethod("getHostString", new Class[0]).invoke(inetSocketAddress, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return inetSocketAddress.getHostName();
        }
    }

    public static OooOo00 OooO0o(AbstractC33087Oooo0o0.OooO0o oooO0o, boolean z) {
        AbstractC33087Oooo0o0.OooO oooO = oooO0o.f119639OooO00o;
        o000000 o000000VarOooO00o = oooO != null ? ((InterfaceC32053o0000ooO) oooO.OooO0o0()).OooO00o() : null;
        if (o000000VarOooO00o != null) {
            C32098OooO0oo.C32101OooO0oO.OooO00o oooO00o = oooO0o.f119640OooO0O0;
            return oooO00o == null ? o000000VarOooO00o : new C31991OooO0o0(oooO00o, o000000VarOooO00o);
        }
        oO0OOo0o.o00Oo0 o00oo02 = oooO0o.f119641OooO0OO;
        if (!o00oo02.OooO0o()) {
            if (oooO0o.f119642OooO0Oo) {
                return new C31981Oooo0OO(OooO0oo(o00oo02), InterfaceC31948OooOOoo.OooO00o.f114036OooOoO0);
            }
            if (!z) {
                return new C31981Oooo0OO(OooO0oo(o00oo02), InterfaceC31948OooOOoo.OooO00o.f114034OooOo0o);
            }
        }
        return null;
    }

    public static ThreadFactory OooO0o0(String str) {
        return new ThreadFactoryBuilder().setDaemon(true).setNameFormat(str).build();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static oO0OOo0o.o00Oo0 OooO0oO(int i) {
        o00Oo0.OooO00o oooO00o;
        if ((i < 100 || i >= 200) && i != 400) {
            if (i == 401) {
                oooO00o = o00Oo0.OooO00o.UNAUTHENTICATED;
            } else if (i == 403) {
                oooO00o = o00Oo0.OooO00o.PERMISSION_DENIED;
            } else if (i == 404) {
                oooO00o = o00Oo0.OooO00o.UNIMPLEMENTED;
            } else if (i == 429) {
                oooO00o = o00Oo0.OooO00o.UNAVAILABLE;
            } else if (i != 431) {
                switch (i) {
                    case 502:
                    case 503:
                    case 504:
                        break;
                    default:
                        oooO00o = o00Oo0.OooO00o.UNKNOWN;
                        break;
                }
            } else {
                oooO00o = o00Oo0.OooO00o.INTERNAL;
            }
        }
        return oooO00o.OooO00o().OooO0oo("HTTP status code " + i);
    }

    public static oO0OOo0o.o00Oo0 OooO0oo(oO0OOo0o.o00Oo0 o00oo02) {
        Preconditions.checkArgument(o00oo02 != null);
        if (!f114215OooO0O0.contains(o00oo02.f119728OooO00o)) {
            return o00oo02;
        }
        return oO0OOo0o.o00Oo0.f119723OooOOO.OooO0oo("Inappropriate status code from control plane: " + o00oo02.f119728OooO00o + " " + o00oo02.f119729OooO0O0).OooO0oO(o00oo02.f119730OooO0OO);
    }
}
