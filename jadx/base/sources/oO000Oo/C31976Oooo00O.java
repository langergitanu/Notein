package oO000Oo;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.common.base.Preconditions;
import com.google.common.base.Stopwatch;
import com.google.common.base.Throwables;
import com.google.common.base.Verify;
import com.google.common.base.VerifyException;
import com.google.gson.stream.JsonReader;
import com.huawei.hms.network.embedded.C18241k5;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import java.io.IOException;
import java.io.StringReader;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;
import oO000Oo.C31989OoooO0O;
import oO000Oo.C32009OoooooO;
import oO000Oo.o00Ooo;
import oO0OOo0o.AbstractC33109OooooO0;
import oO0OOo0o.C33058OooO00o;
import oO0OOo0o.C33072OooOo0O;
import oO0OOo0o.ExecutorC33121o00ooo;
import oO0OOo0o.InterfaceC33110OooooOO;
import oO0OOo0o.o000oOoO;

/* JADX INFO: renamed from: oO000Oo.Oooo00O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31976Oooo00O extends oO0OOo0o.o000oOoO {

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public static final Logger f114164OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final InterfaceC31978OooO0o0 f114165OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public static final boolean f114166OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public static final Set<String> f114167OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public static final boolean f114168OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final boolean f114169OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static String f114170OooOoO0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final long f114171OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC33110OooooOO f114172OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Random f114173OooO0O0 = new Random();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public volatile OooO0O0 f114174OooO0OO = OooO0O0.f114193OooOo0o;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final AtomicReference<InterfaceC31977OooO0Oo> f114175OooO0Oo = new AtomicReference<>();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final String f114176OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final String f114177OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f114178OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final C31989OoooO0O.OooO0O0 f114179OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final ExecutorC33121o00ooo f114180OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final Stopwatch f114181OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public boolean f114182OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public Executor f114183OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public boolean f114184OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final boolean f114185OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final o000oOoO.AbstractC33118OooO0oO f114186OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public o000oOoO.AbstractC33116OooO0Oo f114187OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public boolean f114188OooOOo0;

    /* JADX INFO: renamed from: oO000Oo.Oooo00O$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public oO0OOo0o.o00Oo0 f114189OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public List<C33072OooOo0O> f114190OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public o000oOoO.OooO0O0 f114191OooO0OO;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: oO000Oo.Oooo00O$OooO0O0 */
    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final /* synthetic */ OooO0O0[] f114192OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO0O0 f114193OooOo0o;

        static {
            OooO0O0 oooO0O0 = new OooO0O0("INSTANCE", 0);
            f114193OooOo0o = oooO0O0;
            f114192OooOo = new OooO0O0[]{oooO0O0};
        }

        public OooO0O0() {
            throw null;
        }

        public static OooO0O0 valueOf(String str) {
            return (OooO0O0) Enum.valueOf(OooO0O0.class, str);
        }

        public static OooO0O0[] values() {
            return (OooO0O0[]) f114192OooOo.clone();
        }
    }

    /* JADX INFO: renamed from: oO000Oo.Oooo00O$OooO0OO */
    public final class OooO0OO implements Runnable {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final o000oOoO.AbstractC33116OooO0Oo f114195OooOo0o;

        /* JADX INFO: renamed from: oO000Oo.Oooo00O$OooO0OO$OooO00o */
        public class OooO00o implements Runnable {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ boolean f114197OooOo0o;

            public OooO00o(boolean z) {
                this.f114197OooOo0o = z;
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean z = this.f114197OooOo0o;
                OooO0OO oooO0OO = OooO0OO.this;
                if (z) {
                    C31976Oooo00O c31976Oooo00O = C31976Oooo00O.this;
                    c31976Oooo00O.f114182OooOO0o = true;
                    if (c31976Oooo00O.f114171OooO > 0) {
                        c31976Oooo00O.f114181OooOO0O.reset().start();
                    }
                }
                C31976Oooo00O.this.f114188OooOOo0 = false;
            }
        }

        public OooO0OO(o000oOoO.AbstractC33116OooO0Oo abstractC33116OooO0Oo) {
            this.f114195OooOo0o = (o000oOoO.AbstractC33116OooO0Oo) Preconditions.checkNotNull(abstractC33116OooO0Oo, "savedListener");
        }

        @Override // java.lang.Runnable
        public final void run() throws Throwable {
            o000oOoO.OooO0O0 oooO0O0;
            List<C33072OooOo0O> listSingletonList;
            OooO00o oooO00o;
            o000oOoO.AbstractC33116OooO0Oo abstractC33116OooO0Oo = this.f114195OooOo0o;
            Logger logger = C31976Oooo00O.f114164OooOOoo;
            Level level = Level.FINER;
            boolean zIsLoggable = logger.isLoggable(level);
            C31976Oooo00O c31976Oooo00O = C31976Oooo00O.this;
            if (zIsLoggable) {
                logger.finer("Attempting DNS resolution of " + c31976Oooo00O.f114176OooO0o);
            }
            OooO00o oooO00o2 = null;
            oooO00o2 = null;
            oooO00o2 = null;
            try {
                try {
                    AbstractC33109OooooO0 abstractC33109OooooO0OooO00o = c31976Oooo00O.f114172OooO00o.OooO00o(InetSocketAddress.createUnresolved(c31976Oooo00O.f114176OooO0o, c31976Oooo00O.f114178OooO0oO));
                    C33072OooOo0O c33072OooOo0O = abstractC33109OooooO0OooO00o != null ? new C33072OooOo0O(abstractC33109OooooO0OooO00o) : null;
                    List<C33072OooOo0O> list = Collections.EMPTY_LIST;
                    C33058OooO00o c33058OooO00o = C33058OooO00o.f119518OooO0O0;
                    ExecutorC33121o00ooo executorC33121o00ooo = c31976Oooo00O.f114180OooOO0;
                    if (c33072OooOo0O != null) {
                        if (logger.isLoggable(level)) {
                            logger.finer("Using proxy address " + c33072OooOo0O);
                        }
                        listSingletonList = Collections.singletonList(c33072OooOo0O);
                        oooO0O0 = null;
                    } else {
                        OooO00o oooO00oOooO0o = c31976Oooo00O.OooO0o();
                        try {
                            oO0OOo0o.o00Oo0 o00oo02 = oooO00oOooO0o.f114189OooO00o;
                            if (o00oo02 != null) {
                                abstractC33116OooO0Oo.OooO00o(o00oo02);
                                oooO00o = new OooO00o(oooO00oOooO0o.f114189OooO00o == null);
                                executorC33121o00ooo.execute(oooO00o);
                            } else {
                                List<C33072OooOo0O> list2 = oooO00oOooO0o.f114190OooO0O0;
                                if (list2 != null) {
                                    list = list2;
                                }
                                o000oOoO.OooO0O0 oooO0O02 = oooO00oOooO0o.f114191OooO0OO;
                                oooO0O0 = oooO0O02 != null ? oooO0O02 : null;
                                oooO00o2 = oooO00oOooO0o;
                                listSingletonList = list;
                            }
                        } catch (IOException e) {
                            oooO00o2 = oooO00oOooO0o;
                            e = e;
                            abstractC33116OooO0Oo.OooO00o(oO0OOo0o.o00Oo0.f119725OooOOOO.OooO0oo("Unable to resolve host " + c31976Oooo00O.f114176OooO0o).OooO0oO(e));
                            c31976Oooo00O.f114180OooOO0.execute(new OooO00o(oooO00o2 != null && oooO00o2.f114189OooO00o == null));
                            return;
                        } catch (Throwable th) {
                            th = th;
                            oooO00o2 = oooO00oOooO0o;
                            c31976Oooo00O.f114180OooOO0.execute(new OooO00o(oooO00o2 != null && oooO00o2.f114189OooO00o == null));
                            throw th;
                        }
                    }
                    abstractC33116OooO0Oo.OooO0O0(new o000oOoO.OooO0o(listSingletonList, c33058OooO00o, oooO0O0));
                    oooO00o = new OooO00o(oooO00o2 != null && oooO00o2.f114189OooO00o == null);
                    executorC33121o00ooo.execute(oooO00o);
                } catch (IOException e2) {
                    e = e2;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    /* JADX INFO: renamed from: oO000Oo.Oooo00O$OooO0Oo, reason: case insensitive filesystem */
    public interface InterfaceC31977OooO0Oo {
        List<String> OooO00o(String str) throws Exception;
    }

    /* JADX INFO: renamed from: oO000Oo.Oooo00O$OooO0o0, reason: case insensitive filesystem */
    public interface InterfaceC31978OooO0o0 {
        C32009OoooooO.OooO0O0 OooO00o();

        Throwable OooO0O0();
    }

    static {
        Logger logger = Logger.getLogger(C31976Oooo00O.class.getName());
        f114164OooOOoo = logger;
        f114167OooOo00 = Collections.unmodifiableSet(new HashSet(Arrays.asList("clientLanguage", "percentage", "clientHostname", "serviceConfig")));
        String property = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi", TelemetryEventStrings.Value.TRUE);
        String property2 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi_localhost", TelemetryEventStrings.Value.FALSE);
        String property3 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_service_config", TelemetryEventStrings.Value.FALSE);
        f114166OooOo0 = Boolean.parseBoolean(property);
        f114168OooOo0O = Boolean.parseBoolean(property2);
        f114169OooOo0o = Boolean.parseBoolean(property3);
        InterfaceC31978OooO0o0 interfaceC31978OooO0o0 = null;
        try {
            try {
                try {
                    InterfaceC31978OooO0o0 interfaceC31978OooO0o02 = (InterfaceC31978OooO0o0) Class.forName("oO000Oo.OoooooO", true, C31976Oooo00O.class.getClassLoader()).asSubclass(InterfaceC31978OooO0o0.class).getConstructor(new Class[0]).newInstance(new Object[0]);
                    if (interfaceC31978OooO0o02.OooO0O0() != null) {
                        logger.log(Level.FINE, "JndiResourceResolverFactory not available, skipping.", interfaceC31978OooO0o02.OooO0O0());
                    } else {
                        interfaceC31978OooO0o0 = interfaceC31978OooO0o02;
                    }
                } catch (Exception e) {
                    logger.log(Level.FINE, "Can't construct JndiResourceResolverFactory, skipping.", (Throwable) e);
                }
            } catch (Exception e2) {
                logger.log(Level.FINE, "Can't find JndiResourceResolverFactory ctor, skipping.", (Throwable) e2);
            }
        } catch (ClassCastException e3) {
            logger.log(Level.FINE, "Unable to cast JndiResourceResolverFactory, skipping.", (Throwable) e3);
        } catch (ClassNotFoundException e4) {
            logger.log(Level.FINE, "Unable to find JndiResourceResolverFactory, skipping.", (Throwable) e4);
        }
        f114165OooOo = interfaceC31978OooO0o0;
    }

    public C31976Oooo00O(String str, o000oOoO.OooO00o oooO00o, C31989OoooO0O.OooO0O0 oooO0O0, Stopwatch stopwatch, boolean z) {
        Preconditions.checkNotNull(oooO00o, "args");
        this.f114179OooO0oo = oooO0O0;
        URI uriCreate = URI.create("//" + ((String) Preconditions.checkNotNull(str, "name")));
        Preconditions.checkArgument(uriCreate.getHost() != null, "Invalid DNS name: %s", str);
        this.f114177OooO0o0 = (String) Preconditions.checkNotNull(uriCreate.getAuthority(), "nameUri (%s) doesn't have an authority", uriCreate);
        this.f114176OooO0o = uriCreate.getHost();
        if (uriCreate.getPort() == -1) {
            this.f114178OooO0oO = oooO00o.f119702OooO00o;
        } else {
            this.f114178OooO0oO = uriCreate.getPort();
        }
        this.f114172OooO00o = (InterfaceC33110OooooOO) Preconditions.checkNotNull(oooO00o.f119703OooO0O0, "proxyDetector");
        long nanos = 0;
        if (!z) {
            String property = System.getProperty("networkaddress.cache.ttl");
            long j = 30;
            if (property != null) {
                try {
                    j = Long.parseLong(property);
                } catch (NumberFormatException unused) {
                    f114164OooOOoo.log(Level.WARNING, "Property({0}) valid is not valid number format({1}), fall back to default({2})", new Object[]{"networkaddress.cache.ttl", property, 30L});
                }
            }
            nanos = j > 0 ? TimeUnit.SECONDS.toNanos(j) : j;
        }
        this.f114171OooO = nanos;
        this.f114181OooOO0O = (Stopwatch) Preconditions.checkNotNull(stopwatch, NotificationCompat.CATEGORY_STOPWATCH);
        this.f114180OooOO0 = (ExecutorC33121o00ooo) Preconditions.checkNotNull(oooO00o.f119704OooO0OO, "syncContext");
        o00Ooo.ExecutorC32058OooO0oo executorC32058OooO0oo = oooO00o.f119708OooO0oO;
        this.f114183OooOOO = executorC32058OooO0oo;
        this.f114185OooOOOO = executorC32058OooO0oo == null;
        this.f114186OooOOOo = (o000oOoO.AbstractC33118OooO0oO) Preconditions.checkNotNull(oooO00o.f119705OooO0Oo, "serviceConfigParser");
    }

    public static Map<String, ?> OooO0oO(Map<String, ?> map, Random random, String str) {
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            Verify.verify(f114167OooOo00.contains(entry.getKey()), "Bad key: %s", entry);
        }
        List listOooO0Oo = o0OoOo0.OooO0Oo("clientLanguage", map);
        if (listOooO0Oo != null && !listOooO0Oo.isEmpty()) {
            Iterator it = listOooO0Oo.iterator();
            while (it.hasNext()) {
                if ("java".equalsIgnoreCase((String) it.next())) {
                }
            }
            return null;
        }
        Double dOooO0o0 = o0OoOo0.OooO0o0("percentage", map);
        if (dOooO0o0 != null) {
            int iIntValue = dOooO0o0.intValue();
            Verify.verify(iIntValue >= 0 && iIntValue <= 100, "Bad percentage: %s", dOooO0o0);
            if (random.nextInt(100) >= iIntValue) {
                return null;
            }
        }
        List listOooO0Oo2 = o0OoOo0.OooO0Oo("clientHostname", map);
        if (listOooO0Oo2 != null && !listOooO0Oo2.isEmpty()) {
            Iterator it2 = listOooO0Oo2.iterator();
            while (it2.hasNext()) {
                if (((String) it2.next()).equals(str)) {
                }
            }
            return null;
        }
        Map<String, ?> mapOooO0oO = o0OoOo0.OooO0oO("serviceConfig", map);
        if (mapOooO0oO != null) {
            return mapOooO0oO;
        }
        throw new VerifyException(String.format("key '%s' missing in '%s'", map, "serviceConfig"));
    }

    public static ArrayList OooO0oo(List list) throws IOException {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str.startsWith("grpc_config=")) {
                String strSubstring = str.substring(12);
                Logger logger = C32010Ooooooo.f114310OooO00o;
                JsonReader jsonReader = new JsonReader(new StringReader(strSubstring));
                try {
                    Object objOooO00o = C32010Ooooooo.OooO00o(jsonReader);
                    if (!(objOooO00o instanceof List)) {
                        throw new ClassCastException(androidx.datastore.preferences.protobuf.o000oOoO.OooO00o(objOooO00o, "wrong type "));
                    }
                    List list2 = (List) objOooO00o;
                    o0OoOo0.OooO00o(list2);
                    arrayList.addAll(list2);
                } finally {
                    try {
                        jsonReader.close();
                    } catch (IOException e) {
                        logger.log(Level.WARNING, "Failed to close", (Throwable) e);
                    }
                }
            } else {
                f114164OooOOoo.log(Level.FINE, "Ignoring non service config {0}", new Object[]{str});
            }
        }
        return arrayList;
    }

    public final void OooO() {
        if (this.f114188OooOOo0 || this.f114184OooOOO0) {
            return;
        }
        if (this.f114182OooOO0o) {
            long j = this.f114171OooO;
            if (j != 0 && (j <= 0 || this.f114181OooOO0O.elapsed(TimeUnit.NANOSECONDS) <= j)) {
                return;
            }
        }
        this.f114188OooOOo0 = true;
        this.f114183OooOOO.execute(new OooO0OO(this.f114187OooOOo));
    }

    @Override // oO0OOo0o.o000oOoO
    public final String OooO00o() {
        return this.f114177OooO0o0;
    }

    @Override // oO0OOo0o.o000oOoO
    public final void OooO0O0() {
        Preconditions.checkState(this.f114187OooOOo != null, "not started");
        OooO();
    }

    @Override // oO0OOo0o.o000oOoO
    public final void OooO0OO() {
        if (this.f114184OooOOO0) {
            return;
        }
        this.f114184OooOOO0 = true;
        Executor executor = this.f114183OooOOO;
        if (executor == null || !this.f114185OooOOOO) {
            return;
        }
        C32044o0000o0.OooO0O0(this.f114179OooO0oo, executor);
        this.f114183OooOOO = null;
    }

    public final OooO00o OooO0o() {
        InterfaceC31977OooO0Oo interfaceC31977OooO0OoOooO00o;
        InterfaceC31978OooO0o0 interfaceC31978OooO0o0;
        o000oOoO.OooO0O0 oooO0O0;
        String str = this.f114176OooO0o;
        OooO00o oooO00o = new OooO00o();
        try {
            oooO00o.f114190OooO0O0 = OooOO0();
            if (f114169OooOo0o) {
                List<String> listOooO00o = Collections.EMPTY_LIST;
                boolean z = false;
                if (f114166OooOo0) {
                    if ("localhost".equalsIgnoreCase(str)) {
                        z = f114168OooOo0O;
                    } else if (!str.contains(C18241k5.f55433h)) {
                        boolean z2 = true;
                        for (int i = 0; i < str.length(); i++) {
                            char cCharAt = str.charAt(i);
                            if (cCharAt != '.') {
                                z2 &= cCharAt >= '0' && cCharAt <= '9';
                            }
                        }
                        z = !z2;
                    }
                }
                o000oOoO.OooO0O0 oooO0O02 = null;
                if (z) {
                    interfaceC31977OooO0OoOooO00o = this.f114175OooO0Oo.get();
                    if (interfaceC31977OooO0OoOooO00o == null && (interfaceC31978OooO0o0 = f114165OooOo) != null) {
                        interfaceC31977OooO0OoOooO00o = interfaceC31978OooO0o0.OooO00o();
                    }
                } else {
                    interfaceC31977OooO0OoOooO00o = null;
                }
                Logger logger = f114164OooOOoo;
                if (interfaceC31977OooO0OoOooO00o != null) {
                    try {
                        listOooO00o = interfaceC31977OooO0OoOooO00o.OooO00o("_grpc_config." + str);
                    } catch (Exception e) {
                        logger.log(Level.FINE, "ServiceConfig resolution failure", (Throwable) e);
                    }
                }
                if (listOooO00o.isEmpty()) {
                    logger.log(Level.FINE, "No TXT records found for {0}", new Object[]{str});
                } else {
                    Random random = this.f114173OooO0O0;
                    if (f114170OooOoO0 == null) {
                        try {
                            f114170OooOoO0 = InetAddress.getLocalHost().getHostName();
                        } catch (UnknownHostException e2) {
                            throw new RuntimeException(e2);
                        }
                    }
                    String str2 = f114170OooOoO0;
                    try {
                        Iterator it = OooO0oo(listOooO00o).iterator();
                        Map<String, ?> mapOooO0oO = null;
                        while (it.hasNext()) {
                            try {
                                mapOooO0oO = OooO0oO((Map) it.next(), random, str2);
                                if (mapOooO0oO != null) {
                                    break;
                                }
                            } catch (RuntimeException e3) {
                                oooO0O0 = new o000oOoO.OooO0O0(oO0OOo0o.o00Oo0.f119718OooO0oO.OooO0oo("failed to pick service config choice").OooO0oO(e3));
                            }
                        }
                        oooO0O0 = mapOooO0oO == null ? null : new o000oOoO.OooO0O0(mapOooO0oO);
                    } catch (IOException | RuntimeException e4) {
                        oooO0O0 = new o000oOoO.OooO0O0(oO0OOo0o.o00Oo0.f119718OooO0oO.OooO0oo("failed to parse TXT records").OooO0oO(e4));
                    }
                    if (oooO0O0 != null) {
                        oO0OOo0o.o00Oo0 o00oo02 = oooO0O0.f119709OooO00o;
                        oooO0O02 = o00oo02 != null ? new o000oOoO.OooO0O0(o00oo02) : this.f114186OooOOOo.OooO00o((Map) oooO0O0.f119710OooO0O0);
                    }
                }
                oooO00o.f114191OooO0OO = oooO0O02;
            }
        } catch (Exception e5) {
            oooO00o.f114189OooO00o = oO0OOo0o.o00Oo0.f119725OooOOOO.OooO0oo("Unable to resolve host " + str).OooO0oO(e5);
        }
        return oooO00o;
    }

    @Override // oO0OOo0o.o000oOoO
    public final void OooO0o0(o000oOoO.AbstractC33116OooO0Oo abstractC33116OooO0Oo) {
        Preconditions.checkState(this.f114187OooOOo == null, "already started");
        if (this.f114185OooOOOO) {
            this.f114183OooOOO = (Executor) C32044o0000o0.OooO00o(this.f114179OooO0oo);
        }
        this.f114187OooOOo = (o000oOoO.AbstractC33116OooO0Oo) Preconditions.checkNotNull(abstractC33116OooO0Oo, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        OooO();
    }

    public final List<C33072OooOo0O> OooOO0() {
        try {
            try {
                OooO0O0 oooO0O0 = this.f114174OooO0OO;
                String str = this.f114176OooO0o;
                oooO0O0.getClass();
                List listUnmodifiableList = Collections.unmodifiableList(Arrays.asList(InetAddress.getAllByName(str)));
                ArrayList arrayList = new ArrayList(listUnmodifiableList.size());
                Iterator it = listUnmodifiableList.iterator();
                while (it.hasNext()) {
                    arrayList.add(new C33072OooOo0O(new InetSocketAddress((InetAddress) it.next(), this.f114178OooO0oO)));
                }
                return Collections.unmodifiableList(arrayList);
            } catch (Exception e) {
                Throwables.throwIfUnchecked(e);
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            if (0 != 0) {
                f114164OooOOoo.log(Level.FINE, "Address resolution failure", (Throwable) null);
            }
            throw th;
        }
    }
}
