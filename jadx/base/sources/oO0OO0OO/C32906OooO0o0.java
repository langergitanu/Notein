package oO0OO0OO;

import androidx.core.location.LocationRequestCompat;
import com.google.common.base.Preconditions;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.security.GeneralSecurityException;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import oO000Oo.C31989OoooO0O;
import oO000Oo.C31999OoooOoo;
import oO000Oo.C32044o0000o0;
import oO000Oo.C32046o0000o0o;
import oO000Oo.C32069ooOO;
import oO000Oo.InterfaceC31949OooOo0;
import oO000Oo.InterfaceC31954OooOo0o;
import oO000Oo.OooO0o.OooO00o;
import oO000Oo.o000;
import oO000Oo.oo0o0Oo;
import oO0OOo0o.AbstractC33073OooOo0o;
import oO0OOo0o.AbstractC33081Oooo;
import oO0OOo0o.o00oO0O;
import oO0OOoo0.C33131OooO0O0;
import oO0OOoo0.C33138OooOO0;
import oO0OOoo0.EnumC33130OooO00o;
import oO0OOoo0.EnumC33144OooOOO0;

/* JADX INFO: renamed from: oO0OO0OO.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32906OooO0o0 extends AbstractC33073OooOo0o<C32906OooO0o0> {

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public static final long f118651OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public static final C33131OooO0O0 f118652OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public static final C32046o0000o0o f118653OooOOOO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final oo0o0Oo f118655OooO00o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public SSLSocketFactory f118660OooO0o0;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o000.OooO00o f118656OooO0O0 = o000.f114312OooO0Oo;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C32046o0000o0o f118657OooO0OO = f118653OooOOOO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C32046o0000o0o f118658OooO0Oo = new C32046o0000o0o(C31989OoooO0O.f114230OooOOo0);

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final C33131OooO0O0 f118659OooO0o = f118652OooOOO0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public OooO0O0 f118661OooO0oO = OooO0O0.f118667OooOo0o;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public long f118662OooO0oo = LocationRequestCompat.PASSIVE_INTERVAL;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final long f118654OooO = C31989OoooO0O.f114224OooOO0o;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final int f118663OooOO0 = 65535;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final int f118664OooOO0O = 4194304;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final int f118665OooOO0o = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: oO0OO0OO.OooO0o0$OooO00o */
    public class OooO00o implements C32044o0000o0.OooO0OO<Executor> {
        @Override // oO000Oo.C32044o0000o0.OooO0OO
        public final void OooO0O0(Executor executor) {
            ((ExecutorService) executor).shutdown();
        }

        @Override // oO000Oo.C32044o0000o0.OooO0OO
        public final Executor create() {
            return Executors.newCachedThreadPool(C31989OoooO0O.OooO0o0("grpc-okhttp-%d"));
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: oO0OO0OO.OooO0o0$OooO0O0 */
    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final OooO0O0 f118666OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO0O0 f118667OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public static final /* synthetic */ OooO0O0[] f118668OooOoO0;

        static {
            OooO0O0 oooO0O0 = new OooO0O0("TLS", 0);
            f118667OooOo0o = oooO0O0;
            OooO0O0 oooO0O02 = new OooO0O0("PLAINTEXT", 1);
            f118666OooOo = oooO0O02;
            f118668OooOoO0 = new OooO0O0[]{oooO0O0, oooO0O02};
        }

        public OooO0O0() {
            throw null;
        }

        public static OooO0O0 valueOf(String str) {
            return (OooO0O0) Enum.valueOf(OooO0O0.class, str);
        }

        public static OooO0O0[] values() {
            return (OooO0O0[]) f118668OooOoO0.clone();
        }
    }

    /* JADX INFO: renamed from: oO0OO0OO.OooO0o0$OooO0OO */
    public final class OooO0OO implements oo0o0Oo.OooO00o {
        public OooO0OO() {
        }

        @Override // oO000Oo.oo0o0Oo.OooO00o
        public final int OooO00o() {
            C32906OooO0o0 c32906OooO0o0 = C32906OooO0o0.this;
            int iOrdinal = c32906OooO0o0.f118661OooO0oO.ordinal();
            if (iOrdinal == 0) {
                return 443;
            }
            if (iOrdinal == 1) {
                return 80;
            }
            throw new AssertionError(c32906OooO0o0.f118661OooO0oO + " not handled");
        }
    }

    /* JADX INFO: renamed from: oO0OO0OO.OooO0o0$OooO0Oo, reason: case insensitive filesystem */
    public final class C32907OooO0Oo implements oo0o0Oo.OooO0O0 {
        public C32907OooO0Oo() {
        }

        @Override // oO000Oo.oo0o0Oo.OooO0O0
        public final C20274OooO0o0 OooO00o() {
            SSLSocketFactory sSLSocketFactory;
            C32906OooO0o0 c32906OooO0o0 = C32906OooO0o0.this;
            boolean z = c32906OooO0o0.f118662OooO0oo != LocationRequestCompat.PASSIVE_INTERVAL;
            C32046o0000o0o c32046o0000o0o = c32906OooO0o0.f118657OooO0OO;
            C32046o0000o0o c32046o0000o0o2 = c32906OooO0o0.f118658OooO0Oo;
            int iOrdinal = c32906OooO0o0.f118661OooO0oO.ordinal();
            if (iOrdinal == 0) {
                try {
                    if (c32906OooO0o0.f118660OooO0o0 == null) {
                        c32906OooO0o0.f118660OooO0o0 = SSLContext.getInstance("Default", C33138OooOO0.f119828OooO0Oo.f119829OooO00o).getSocketFactory();
                    }
                    sSLSocketFactory = c32906OooO0o0.f118660OooO0o0;
                } catch (GeneralSecurityException e) {
                    throw new RuntimeException("TLS Provider failure", e);
                }
            } else {
                if (iOrdinal != 1) {
                    throw new RuntimeException("Unknown negotiation type: " + c32906OooO0o0.f118661OooO0oO);
                }
                sSLSocketFactory = null;
            }
            return new C20274OooO0o0(c32046o0000o0o, c32046o0000o0o2, sSLSocketFactory, c32906OooO0o0.f118659OooO0o, c32906OooO0o0.f118664OooOO0O, z, c32906OooO0o0.f118662OooO0oo, c32906OooO0o0.f118654OooO, c32906OooO0o0.f118663OooOO0, c32906OooO0o0.f118665OooOO0o, c32906OooO0o0.f118656OooO0O0);
        }
    }

    /* JADX INFO: renamed from: oO0OO0OO.OooO0o0$OooO0o0, reason: collision with other inner class name */
    public static final class C20274OooO0o0 implements InterfaceC31949OooOo0 {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final Executor f118671OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final C32046o0000o0o f118672OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final ScheduledExecutorService f118673OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final C32046o0000o0o f118674OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public final o000.OooO00o f118675OooOoOO;

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        public final C33131OooO0O0 f118676OooOoo;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public final SSLSocketFactory f118677OooOoo0;

        /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
        public final int f118678OooOooO;

        /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
        public final boolean f118679OooOooo;

        /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
        public final int f118680Oooo0;

        /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
        public final oO000Oo.OooO0o f118681Oooo000;

        /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
        public final long f118682Oooo00O;

        /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
        public final int f118683Oooo00o;

        /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
        public boolean f118684Oooo0O0;

        public C20274OooO0o0(C32046o0000o0o c32046o0000o0o, C32046o0000o0o c32046o0000o0o2, SSLSocketFactory sSLSocketFactory, C33131OooO0O0 c33131OooO0O0, int i, boolean z, long j, long j2, int i2, int i3, o000.OooO00o oooO00o) {
            this.f118672OooOo0o = c32046o0000o0o;
            this.f118671OooOo = (Executor) C32044o0000o0.OooO00o(c32046o0000o0o.f114566OooO00o);
            this.f118674OooOoO0 = c32046o0000o0o2;
            this.f118673OooOoO = (ScheduledExecutorService) C32044o0000o0.OooO00o(c32046o0000o0o2.f114566OooO00o);
            this.f118677OooOoo0 = sSLSocketFactory;
            this.f118676OooOoo = c33131OooO0O0;
            this.f118678OooOooO = i;
            this.f118679OooOooo = z;
            this.f118681Oooo000 = new oO000Oo.OooO0o(j);
            this.f118682Oooo00O = j2;
            this.f118683Oooo00o = i2;
            this.f118680Oooo0 = i3;
            this.f118675OooOoOO = (o000.OooO00o) Preconditions.checkNotNull(oooO00o, "transportTracerFactory");
        }

        @Override // oO000Oo.InterfaceC31949OooOo0
        public final InterfaceC31954OooOo0o OooOo(SocketAddress socketAddress, InterfaceC31949OooOo0.OooO00o oooO00o, C31999OoooOoo.OooO0o oooO0o) {
            if (this.f118684Oooo0O0) {
                throw new IllegalStateException("The transport factory is closed.");
            }
            oO000Oo.OooO0o oooO0o2 = this.f118681Oooo000;
            long j = oooO0o2.f113958OooO0O0.get();
            OooO oooO = new OooO(this, (InetSocketAddress) socketAddress, oooO00o.f114042OooO00o, oooO00o.f114043OooO0O0, oooO00o.f114044OooO0OO, new OooO0o(oooO0o2.new OooO00o(j)));
            if (this.f118679OooOooo) {
                oooO.f118604Oooo00O = true;
                oooO.f118605Oooo00o = j;
                oooO.f118602Oooo0 = this.f118682Oooo00O;
            }
            return oooO;
        }

        @Override // oO000Oo.InterfaceC31949OooOo0
        public final ScheduledExecutorService Oooo0o0() {
            return this.f118673OooOoO;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f118684Oooo0O0) {
                return;
            }
            this.f118684Oooo0O0 = true;
            this.f118672OooOo0o.OooO0O0(this.f118671OooOo);
            this.f118674OooOoO0.OooO0O0(this.f118673OooOoO);
        }

        @Override // oO000Oo.InterfaceC31949OooOo0
        public final Collection<Class<? extends SocketAddress>> o0ooOO0() {
            return Collections.singleton(InetSocketAddress.class);
        }
    }

    static {
        Logger.getLogger(C32906OooO0o0.class.getName());
        C33131OooO0O0.OooO00o oooO00o = new C33131OooO0O0.OooO00o(C33131OooO0O0.f119803OooO0o0);
        oooO00o.OooO00o(EnumC33130OooO00o.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, EnumC33130OooO00o.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, EnumC33130OooO00o.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, EnumC33130OooO00o.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, EnumC33130OooO00o.f119797Oooo0O0, EnumC33130OooO00o.f119793Oooo0);
        oooO00o.OooO0O0(EnumC33144OooOOO0.TLS_1_2);
        if (!oooO00o.f119808OooO00o) {
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }
        oooO00o.f119811OooO0Oo = true;
        f118652OooOOO0 = new C33131OooO0O0(oooO00o);
        f118651OooOOO = TimeUnit.DAYS.toNanos(1000L);
        f118653OooOOOO = new C32046o0000o0o(new OooO00o());
        EnumSet.of(o00oO0O.f119758OooOo0o, o00oO0O.f119757OooOo);
    }

    public C32906OooO0o0(String str) {
        this.f118655OooO00o = new oo0o0Oo(str, new C32907OooO0Oo(), new OooO0OO());
    }

    @Override // oO0OOo0o.AbstractC33081Oooo
    public final void OooO0OO() {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Preconditions.checkArgument(true, "keepalive time must be positive");
        long nanos = timeUnit.toNanos(30L);
        this.f118662OooO0oo = nanos;
        long jMax = Math.max(nanos, C32069ooOO.f114798OooOO0O);
        this.f118662OooO0oo = jMax;
        if (jMax >= f118651OooOOO) {
            this.f118662OooO0oo = LocationRequestCompat.PASSIVE_INTERVAL;
        }
    }

    @Override // oO0OOo0o.AbstractC33081Oooo
    public final void OooO0Oo() {
        Preconditions.checkState(true, "Cannot change security when using ChannelCredentials");
        this.f118661OooO0oO = OooO0O0.f118666OooOo;
    }

    @Override // oO0OOo0o.AbstractC33073OooOo0o
    public final AbstractC33081Oooo<?> OooO0o0() {
        return this.f118655OooO00o;
    }
}
