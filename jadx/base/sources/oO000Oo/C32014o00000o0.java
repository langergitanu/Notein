package oO000Oo;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.UnmodifiableIterator;
import java.net.SocketAddress;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;
import oO000Oo.C32014o00000o0;
import oO000Oo.C32014o00000o0.OooO0o;
import oO0OOo0o.AbstractC33087Oooo0o0;
import oO0OOo0o.C33058OooO00o;
import oO0OOo0o.C33072OooOo0O;
import oO0OOo0o.ExecutorC33121o00ooo;

/* JADX INFO: renamed from: oO000Oo.o00000o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32014o00000o0 extends AbstractC33087Oooo0o0 {

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public static final Logger f114375OooOOOO = Logger.getLogger(C32014o00000o0.class.getName());

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final AbstractC33087Oooo0o0.AbstractC33089OooO0o0 f114377OooO0o;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public OooO0OO f114379OooO0oo;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public ExecutorC33121o00ooo.OooO0OO f114381OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public oO0OOo0o.OooOOO f114382OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final boolean f114383OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public oO0OOo0o.OooOOO f114384OooOOO0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final HashMap f114378OooO0oO = new HashMap();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f114376OooO = 0;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public boolean f114380OooOO0 = true;

    /* JADX INFO: renamed from: oO000Oo.o00000o0$OooO00o */
    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C32014o00000o0 c32014o00000o0 = C32014o00000o0.this;
            c32014o00000o0.f114381OooOO0O = null;
            if (c32014o00000o0.f114379OooO0oo.OooO0O0()) {
                c32014o00000o0.OooO0o0();
            }
        }
    }

    /* JADX INFO: renamed from: oO000Oo.o00000o0$OooO0O0 */
    public final class OooO0O0 implements AbstractC33087Oooo0o0.OooOO0O {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public oO0OOo0o.OooOOOO f114386OooO00o = oO0OOo0o.OooOOOO.OooO00o(oO0OOo0o.OooOOO.f119554OooOoO);

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public C32017OooO0oO f114387OooO0O0;

        public OooO0O0() {
        }

        @Override // oO0OOo0o.AbstractC33087Oooo0o0.OooOO0O
        public final void OooO00o(oO0OOo0o.OooOOOO oooOOOO) {
            C32014o00000o0.f114375OooOOOO.log(Level.FINE, "Received health status {0} for subchannel {1}", new Object[]{oooOOOO, this.f114387OooO0O0.f114396OooO00o});
            this.f114386OooO00o = oooOOOO;
            C32014o00000o0 c32014o00000o0 = C32014o00000o0.this;
            if (c32014o00000o0.f114379OooO0oo.OooO0OO() && ((C32017OooO0oO) c32014o00000o0.f114378OooO0oO.get(c32014o00000o0.f114379OooO0oo.OooO00o())).f114398OooO0OO == this) {
                c32014o00000o0.OooOO0(this.f114387OooO0O0);
            }
        }
    }

    /* JADX INFO: renamed from: oO000Oo.o00000o0$OooO0OO */
    public static final class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public List<C33072OooOo0O> f114389OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f114390OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f114391OooO0OO;

        public final SocketAddress OooO00o() {
            if (OooO0OO()) {
                return this.f114389OooO00o.get(this.f114390OooO0O0).f119587OooO00o.get(this.f114391OooO0OO);
            }
            throw new IllegalStateException("Index is past the end of the address group list");
        }

        public final boolean OooO0O0() {
            if (OooO0OO()) {
                C33072OooOo0O c33072OooOo0O = this.f114389OooO00o.get(this.f114390OooO0O0);
                int i = this.f114391OooO0OO + 1;
                this.f114391OooO0OO = i;
                if (i >= c33072OooOo0O.f119587OooO00o.size()) {
                    int i2 = this.f114390OooO0O0 + 1;
                    this.f114390OooO0O0 = i2;
                    this.f114391OooO0OO = 0;
                    if (i2 < this.f114389OooO00o.size()) {
                    }
                }
                return true;
            }
            return false;
        }

        public final boolean OooO0OO() {
            return this.f114390OooO0O0 < this.f114389OooO00o.size();
        }

        public final boolean OooO0Oo(SocketAddress socketAddress) {
            for (int i = 0; i < this.f114389OooO00o.size(); i++) {
                int iIndexOf = this.f114389OooO00o.get(i).f119587OooO00o.indexOf(socketAddress);
                if (iIndexOf != -1) {
                    this.f114390OooO0O0 = i;
                    this.f114391OooO0OO = iIndexOf;
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: oO000Oo.o00000o0$OooO0Oo, reason: case insensitive filesystem */
    public static final class C32015OooO0Oo {
    }

    /* JADX INFO: renamed from: oO000Oo.o00000o0$OooO0o */
    public final class OooO0o extends AbstractC33087Oooo0o0.OooOO0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final C32014o00000o0 f114392OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final AtomicBoolean f114393OooO0O0 = new AtomicBoolean(false);

        public OooO0o(C32014o00000o0 c32014o00000o0) {
            this.f114392OooO00o = (C32014o00000o0) Preconditions.checkNotNull(c32014o00000o0, "pickFirstLeafLoadBalancer");
        }

        @Override // oO0OOo0o.AbstractC33087Oooo0o0.OooOO0
        public final AbstractC33087Oooo0o0.OooO0o OooO00o(o0000O00 o0000o00) {
            if (this.f114393OooO0O0.compareAndSet(false, true)) {
                ExecutorC33121o00ooo executorC33121o00oooOooO0Oo = C32014o00000o0.this.f114377OooO0o.OooO0Oo();
                final C32014o00000o0 c32014o00000o0 = this.f114392OooO00o;
                Objects.requireNonNull(c32014o00000o0);
                executorC33121o00oooOooO0Oo.execute(new Runnable() { // from class: oO000Oo.o0000Ooo
                    @Override // java.lang.Runnable
                    public final void run() {
                        c32014o00000o0.OooO0o0();
                    }
                });
            }
            return AbstractC33087Oooo0o0.OooO0o.f119638OooO0o0;
        }
    }

    /* JADX INFO: renamed from: oO000Oo.o00000o0$OooO0o0, reason: case insensitive filesystem */
    public static final class C32016OooO0o0 extends AbstractC33087Oooo0o0.OooOO0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final AbstractC33087Oooo0o0.OooO0o f114395OooO00o;

        public C32016OooO0o0(AbstractC33087Oooo0o0.OooO0o oooO0o) {
            this.f114395OooO00o = (AbstractC33087Oooo0o0.OooO0o) Preconditions.checkNotNull(oooO0o, "result");
        }

        @Override // oO0OOo0o.AbstractC33087Oooo0o0.OooOO0
        public final AbstractC33087Oooo0o0.OooO0o OooO00o(o0000O00 o0000o00) {
            return this.f114395OooO00o;
        }

        public final String toString() {
            return MoreObjects.toStringHelper((Class<?>) C32016OooO0o0.class).add("result", this.f114395OooO00o).toString();
        }
    }

    /* JADX INFO: renamed from: oO000Oo.o00000o0$OooO0oO, reason: case insensitive filesystem */
    public static final class C32017OooO0oO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final AbstractC33087Oooo0o0.OooO f114396OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public oO0OOo0o.OooOOO f114397OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final OooO0O0 f114398OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public boolean f114399OooO0Oo;

        public C32017OooO0oO(AbstractC33087Oooo0o0.OooO oooO, OooO0O0 oooO0O0) {
            oO0OOo0o.OooOOO oooOOO = oO0OOo0o.OooOOO.f119554OooOoO;
            this.f114399OooO0Oo = false;
            this.f114396OooO00o = oooO;
            this.f114397OooO0O0 = oooOOO;
            this.f114398OooO0OO = oooO0O0;
        }

        public static void OooO00o(C32017OooO0oO c32017OooO0oO, oO0OOo0o.OooOOO oooOOO) {
            c32017OooO0oO.f114397OooO0O0 = oooOOO;
            if (oooOOO == oO0OOo0o.OooOOO.f119552OooOo || oooOOO == oO0OOo0o.OooOOO.f119555OooOoO0) {
                c32017OooO0oO.f114399OooO0Oo = true;
            } else if (oooOOO == oO0OOo0o.OooOOO.f119554OooOoO) {
                c32017OooO0oO.f114399OooO0Oo = false;
            }
        }
    }

    public C32014o00000o0(AbstractC33087Oooo0o0.AbstractC33089OooO0o0 abstractC33089OooO0o0) {
        boolean z = false;
        oO0OOo0o.OooOOO oooOOO = oO0OOo0o.OooOOO.f119554OooOoO;
        this.f114382OooOO0o = oooOOO;
        this.f114384OooOOO0 = oooOOO;
        Logger logger = C31989OoooO0O.f114214OooO00o;
        String property = System.getenv("GRPC_EXPERIMENTAL_XDS_DUALSTACK_ENDPOINTS");
        property = property == null ? System.getProperty("GRPC_EXPERIMENTAL_XDS_DUALSTACK_ENDPOINTS") : property;
        if (!Strings.isNullOrEmpty(property) && Boolean.parseBoolean(property)) {
            z = true;
        }
        this.f114383OooOOO = z;
        this.f114377OooO0o = (AbstractC33087Oooo0o0.AbstractC33089OooO0o0) Preconditions.checkNotNull(abstractC33089OooO0o0, "helper");
    }

    public final void OooO(oO0OOo0o.OooOOO oooOOO, AbstractC33087Oooo0o0.OooOO0 oooOO02) {
        if (oooOOO == this.f114384OooOOO0 && (oooOOO == oO0OOo0o.OooOOO.f119554OooOoO || oooOOO == oO0OOo0o.OooOOO.f119553OooOo0o)) {
            return;
        }
        this.f114384OooOOO0 = oooOOO;
        this.f114377OooO0o.OooO0o(oooOOO, oooOO02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO0OOo0o.AbstractC33087Oooo0o0
    public final oO0OOo0o.o00Oo0 OooO00o(AbstractC33087Oooo0o0.C33091OooO0oo c33091OooO0oo) {
        List<C33072OooOo0O> list;
        oO0OOo0o.OooOOO oooOOO;
        if (this.f114382OooOO0o == oO0OOo0o.OooOOO.f119556OooOoOO) {
            return oO0OOo0o.o00Oo0.f119722OooOO0o.OooO0oo("Already shut down");
        }
        List<C33072OooOo0O> list2 = c33091OooO0oo.f119643OooO00o;
        boolean zIsEmpty = list2.isEmpty();
        C33058OooO00o c33058OooO00o = c33091OooO0oo.f119644OooO0O0;
        if (zIsEmpty) {
            oO0OOo0o.o00Oo0 o00oo0OooO0oo = oO0OOo0o.o00Oo0.f119725OooOOOO.OooO0oo("NameResolver returned no usable address. addrs=" + list2 + ", attrs=" + c33058OooO00o);
            OooO0OO(o00oo0OooO0oo);
            return o00oo0OooO0oo;
        }
        Iterator<C33072OooOo0O> it = list2.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                oO0OOo0o.o00Oo0 o00oo0OooO0oo2 = oO0OOo0o.o00Oo0.f119725OooOOOO.OooO0oo("NameResolver returned address list with null endpoint. addrs=" + list2 + ", attrs=" + c33058OooO00o);
                OooO0OO(o00oo0OooO0oo2);
                return o00oo0OooO0oo2;
            }
        }
        this.f114380OooOO0 = true;
        Object obj = c33091OooO0oo.f119645OooO0OO;
        if (obj instanceof C32015OooO0Oo) {
            ((C32015OooO0Oo) obj).getClass();
        }
        ImmutableList immutableListBuild = ImmutableList.builder().addAll((Iterable) list2).build();
        OooO0OO oooO0OO = this.f114379OooO0oo;
        oO0OOo0o.OooOOO oooOOO2 = oO0OOo0o.OooOOO.f119552OooOo;
        if (oooO0OO == null) {
            OooO0OO oooO0OO2 = new OooO0OO();
            oooO0OO2.f114389OooO00o = immutableListBuild != null ? immutableListBuild : Collections.EMPTY_LIST;
            this.f114379OooO0oo = oooO0OO2;
        } else if (this.f114382OooOO0o == oooOOO2) {
            SocketAddress socketAddressOooO00o = oooO0OO.OooO00o();
            OooO0OO oooO0OO3 = this.f114379OooO0oo;
            if (immutableListBuild != null) {
                list = immutableListBuild;
            } else {
                oooO0OO3.getClass();
                list = Collections.EMPTY_LIST;
            }
            oooO0OO3.f114389OooO00o = list;
            oooO0OO3.f114390OooO0O0 = 0;
            oooO0OO3.f114391OooO0OO = 0;
            if (this.f114379OooO0oo.OooO0Oo(socketAddressOooO00o)) {
                return oO0OOo0o.o00Oo0.f119717OooO0o0;
            }
            OooO0OO oooO0OO4 = this.f114379OooO0oo;
            oooO0OO4.f114390OooO0O0 = 0;
            oooO0OO4.f114391OooO0OO = 0;
        } else {
            oooO0OO.f114389OooO00o = immutableListBuild != null ? immutableListBuild : Collections.EMPTY_LIST;
            oooO0OO.f114390OooO0O0 = 0;
            oooO0OO.f114391OooO0OO = 0;
        }
        HashMap map = this.f114378OooO0oO;
        HashSet<SocketAddress> hashSet = new HashSet(map.keySet());
        HashSet hashSet2 = new HashSet();
        UnmodifiableIterator it2 = immutableListBuild.iterator();
        while (it2.hasNext()) {
            hashSet2.addAll(((C33072OooOo0O) it2.next()).f119587OooO00o);
        }
        for (SocketAddress socketAddress : hashSet) {
            if (!hashSet2.contains(socketAddress)) {
                ((C32017OooO0oO) map.remove(socketAddress)).f114396OooO00o.OooO0oO();
            }
        }
        int size = hashSet.size();
        oO0OOo0o.OooOOO oooOOO3 = oO0OOo0o.OooOOO.f119553OooOo0o;
        if (size == 0 || (oooOOO = this.f114382OooOO0o) == oooOOO3 || oooOOO == oooOOO2) {
            this.f114382OooOO0o = oooOOO3;
            OooO(oooOOO3, new C32016OooO0o0(AbstractC33087Oooo0o0.OooO0o.f119638OooO0o0));
            OooO0oO();
            OooO0o0();
        } else {
            oO0OOo0o.OooOOO oooOOO4 = oO0OOo0o.OooOOO.f119554OooOoO;
            if (oooOOO == oooOOO4) {
                OooO(oooOOO4, new OooO0o(this));
            } else if (oooOOO == oO0OOo0o.OooOOO.f119555OooOoO0) {
                OooO0oO();
                OooO0o0();
            }
        }
        return oO0OOo0o.o00Oo0.f119717OooO0o0;
    }

    @Override // oO0OOo0o.AbstractC33087Oooo0o0
    public final void OooO0OO(oO0OOo0o.o00Oo0 o00oo02) {
        HashMap map = this.f114378OooO0oO;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((C32017OooO0oO) it.next()).f114396OooO00o.OooO0oO();
        }
        map.clear();
        OooO(oO0OOo0o.OooOOO.f119555OooOoO0, new C32016OooO0o0(AbstractC33087Oooo0o0.OooO0o.OooO00o(o00oo02)));
    }

    @Override // oO0OOo0o.AbstractC33087Oooo0o0
    public final void OooO0o() {
        Level level = Level.FINE;
        HashMap map = this.f114378OooO0oO;
        f114375OooOOOO.log(level, "Shutting down, currently have {} subchannels created", Integer.valueOf(map.size()));
        oO0OOo0o.OooOOO oooOOO = oO0OOo0o.OooOOO.f119556OooOoOO;
        this.f114382OooOO0o = oooOOO;
        this.f114384OooOOO0 = oooOOO;
        OooO0oO();
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((C32017OooO0oO) it.next()).f114396OooO00o.OooO0oO();
        }
        map.clear();
    }

    @Override // oO0OOo0o.AbstractC33087Oooo0o0
    public final void OooO0o0() {
        AbstractC33087Oooo0o0.OooO oooO;
        OooO0OO oooO0OO = this.f114379OooO0oo;
        if (oooO0OO == null || !oooO0OO.OooO0OO() || this.f114382OooOO0o == oO0OOo0o.OooOOO.f119556OooOoOO) {
            return;
        }
        SocketAddress socketAddressOooO00o = this.f114379OooO0oo.OooO00o();
        HashMap map = this.f114378OooO0oO;
        boolean zContainsKey = map.containsKey(socketAddressOooO00o);
        Logger logger = f114375OooOOOO;
        if (zContainsKey) {
            oooO = ((C32017OooO0oO) map.get(socketAddressOooO00o)).f114396OooO00o;
        } else {
            OooO0O0 oooO0O0 = new OooO0O0();
            AbstractC33087Oooo0o0.OooO0O0.OooO00o oooO00oOooO0O0 = AbstractC33087Oooo0o0.OooO0O0.OooO0O0();
            oooO00oOooO0O0.OooO0O0(Lists.newArrayList(new C33072OooOo0O(socketAddressOooO00o)));
            oooO00oOooO0O0.OooO00o(AbstractC33087Oooo0o0.f119627OooO0OO, oooO0O0);
            final AbstractC33087Oooo0o0.OooO oooOOooO00o = this.f114377OooO0o.OooO00o(new AbstractC33087Oooo0o0.OooO0O0(oooO00oOooO0O0.f119634OooO00o, oooO00oOooO0O0.f119635OooO0O0, oooO00oOooO0O0.f119636OooO0OO));
            if (oooOOooO00o == null) {
                logger.warning("Was not able to create subchannel for " + socketAddressOooO00o);
                throw new IllegalStateException("Can't create subchannel");
            }
            C32017OooO0oO c32017OooO0oO = new C32017OooO0oO(oooOOooO00o, oooO0O0);
            oooO0O0.f114387OooO0O0 = c32017OooO0oO;
            map.put(socketAddressOooO00o, c32017OooO0oO);
            if (oooOOooO00o.OooO0OO().f119519OooO00o.get(AbstractC33087Oooo0o0.f119628OooO0Oo) == null) {
                oooO0O0.f114386OooO00o = oO0OOo0o.OooOOOO.OooO00o(oO0OOo0o.OooOOO.f119552OooOo);
            }
            oooOOooO00o.OooO0oo(new AbstractC33087Oooo0o0.OooOO0O() { // from class: oO000Oo.o00000Oo
                @Override // oO0OOo0o.AbstractC33087Oooo0o0.OooOO0O
                public final void OooO00o(oO0OOo0o.OooOOOO oooOOOO) {
                    AbstractC33087Oooo0o0.OooO oooO2;
                    C32014o00000o0 c32014o00000o0 = this.f114373OooO00o;
                    c32014o00000o0.getClass();
                    oO0OOo0o.OooOOO oooOOO = oooOOOO.f119560OooO00o;
                    HashMap map2 = c32014o00000o0.f114378OooO0oO;
                    AbstractC33087Oooo0o0.OooO oooO3 = oooOOooO00o;
                    C32014o00000o0.C32017OooO0oO c32017OooO0oO2 = (C32014o00000o0.C32017OooO0oO) map2.get(oooO3.OooO00o().f119587OooO00o.get(0));
                    if (c32017OooO0oO2 == null || (oooO2 = c32017OooO0oO2.f114396OooO00o) != oooO3 || oooOOO == oO0OOo0o.OooOOO.f119556OooOoOO) {
                        return;
                    }
                    oO0OOo0o.OooOOO oooOOO2 = oO0OOo0o.OooOOO.f119554OooOoO;
                    AbstractC33087Oooo0o0.AbstractC33089OooO0o0 abstractC33089OooO0o0 = c32014o00000o0.f114377OooO0o;
                    if (oooOOO == oooOOO2) {
                        abstractC33089OooO0o0.OooO0o0();
                    }
                    C32014o00000o0.C32017OooO0oO.OooO00o(c32017OooO0oO2, oooOOO);
                    oO0OOo0o.OooOOO oooOOO3 = c32014o00000o0.f114382OooOO0o;
                    oO0OOo0o.OooOOO oooOOO4 = oO0OOo0o.OooOOO.f119555OooOoO0;
                    oO0OOo0o.OooOOO oooOOO5 = oO0OOo0o.OooOOO.f119553OooOo0o;
                    if (oooOOO3 == oooOOO4 || c32014o00000o0.f114384OooOOO0 == oooOOO4) {
                        if (oooOOO == oooOOO5) {
                            return;
                        }
                        if (oooOOO == oooOOO2) {
                            c32014o00000o0.OooO0o0();
                            return;
                        }
                    }
                    int iOrdinal = oooOOO.ordinal();
                    if (iOrdinal == 0) {
                        c32014o00000o0.f114382OooOO0o = oooOOO5;
                        c32014o00000o0.OooO(oooOOO5, new C32014o00000o0.C32016OooO0o0(AbstractC33087Oooo0o0.OooO0o.f119638OooO0o0));
                        return;
                    }
                    if (iOrdinal == 1) {
                        c32014o00000o0.OooO0oO();
                        for (C32014o00000o0.C32017OooO0oO c32017OooO0oO3 : map2.values()) {
                            if (!c32017OooO0oO3.f114396OooO00o.equals(oooO2)) {
                                c32017OooO0oO3.f114396OooO00o.OooO0oO();
                            }
                        }
                        map2.clear();
                        oO0OOo0o.OooOOO oooOOO6 = oO0OOo0o.OooOOO.f119552OooOo;
                        C32014o00000o0.C32017OooO0oO.OooO00o(c32017OooO0oO2, oooOOO6);
                        map2.put(oooO2.OooO00o().f119587OooO00o.get(0), c32017OooO0oO2);
                        c32014o00000o0.f114379OooO0oo.OooO0Oo(oooO3.OooO00o().f119587OooO00o.get(0));
                        c32014o00000o0.f114382OooOO0o = oooOOO6;
                        c32014o00000o0.OooOO0(c32017OooO0oO2);
                        return;
                    }
                    if (iOrdinal != 2) {
                        if (iOrdinal != 3) {
                            throw new IllegalArgumentException("Unsupported state:" + oooOOO);
                        }
                        C32014o00000o0.OooO0OO oooO0OO2 = c32014o00000o0.f114379OooO0oo;
                        oooO0OO2.f114390OooO0O0 = 0;
                        oooO0OO2.f114391OooO0OO = 0;
                        c32014o00000o0.f114382OooOO0o = oooOOO2;
                        c32014o00000o0.OooO(oooOOO2, c32014o00000o0.new OooO0o(c32014o00000o0));
                        return;
                    }
                    if (c32014o00000o0.f114379OooO0oo.OooO0OO() && ((C32014o00000o0.C32017OooO0oO) map2.get(c32014o00000o0.f114379OooO0oo.OooO00o())).f114396OooO00o == oooO3 && c32014o00000o0.f114379OooO0oo.OooO0O0()) {
                        c32014o00000o0.OooO0oO();
                        c32014o00000o0.OooO0o0();
                    }
                    C32014o00000o0.OooO0OO oooO0OO3 = c32014o00000o0.f114379OooO0oo;
                    if (oooO0OO3 == null || oooO0OO3.OooO0OO()) {
                        return;
                    }
                    int size = map2.size();
                    List<C33072OooOo0O> list = c32014o00000o0.f114379OooO0oo.f114389OooO00o;
                    if (size < (list != null ? list.size() : 0)) {
                        return;
                    }
                    Iterator it = map2.values().iterator();
                    while (it.hasNext()) {
                        if (!((C32014o00000o0.C32017OooO0oO) it.next()).f114399OooO0Oo) {
                            return;
                        }
                    }
                    c32014o00000o0.f114382OooOO0o = oooOOO4;
                    c32014o00000o0.OooO(oooOOO4, new C32014o00000o0.C32016OooO0o0(AbstractC33087Oooo0o0.OooO0o.OooO00o(oooOOOO.f119561OooO0O0)));
                    int i = c32014o00000o0.f114376OooO + 1;
                    c32014o00000o0.f114376OooO = i;
                    List<C33072OooOo0O> list2 = c32014o00000o0.f114379OooO0oo.f114389OooO00o;
                    if (i >= (list2 != null ? list2.size() : 0) || c32014o00000o0.f114380OooOO0) {
                        c32014o00000o0.f114380OooOO0 = false;
                        c32014o00000o0.f114376OooO = 0;
                        abstractC33089OooO0o0.OooO0o0();
                    }
                }
            });
            oooO = oooOOooO00o;
        }
        int iOrdinal = ((C32017OooO0oO) map.get(socketAddressOooO00o)).f114397OooO0O0.ordinal();
        if (iOrdinal == 0) {
            if (this.f114383OooOOO) {
                OooO0oo();
                return;
            } else {
                oooO.OooO0o();
                return;
            }
        }
        if (iOrdinal == 1) {
            logger.warning("Requesting a connection even though we have a READY subchannel");
            return;
        }
        if (iOrdinal == 2) {
            this.f114379OooO0oo.OooO0O0();
            OooO0o0();
        } else {
            if (iOrdinal != 3) {
                return;
            }
            oooO.OooO0o();
            C32017OooO0oO.OooO00o((C32017OooO0oO) map.get(socketAddressOooO00o), oO0OOo0o.OooOOO.f119553OooOo0o);
            OooO0oo();
        }
    }

    public final void OooO0oO() {
        ExecutorC33121o00ooo.OooO0OO oooO0OO = this.f114381OooOO0O;
        if (oooO0OO != null) {
            oooO0OO.OooO00o();
            this.f114381OooOO0O = null;
        }
    }

    public final void OooO0oo() {
        if (this.f114383OooOOO) {
            ExecutorC33121o00ooo.OooO0OO oooO0OO = this.f114381OooOO0O;
            if (oooO0OO != null) {
                ExecutorC33121o00ooo.OooO0O0 oooO0O0 = oooO0OO.f119771OooO00o;
                if (!oooO0O0.f119770OooOoO0 && !oooO0O0.f119768OooOo) {
                    return;
                }
            }
            AbstractC33087Oooo0o0.AbstractC33089OooO0o0 abstractC33089OooO0o0 = this.f114377OooO0o;
            this.f114381OooOO0O = abstractC33089OooO0o0.OooO0Oo().OooO0OO(new OooO00o(), 250L, TimeUnit.MILLISECONDS, abstractC33089OooO0o0.OooO0OO());
        }
    }

    public final void OooOO0(C32017OooO0oO c32017OooO0oO) {
        oO0OOo0o.OooOOO oooOOO = c32017OooO0oO.f114397OooO0O0;
        oO0OOo0o.OooOOO oooOOO2 = oO0OOo0o.OooOOO.f119552OooOo;
        if (oooOOO != oooOOO2) {
            return;
        }
        oO0OOo0o.OooOOOO oooOOOO = c32017OooO0oO.f114398OooO0OO.f114386OooO00o;
        oO0OOo0o.OooOOO oooOOO3 = oooOOOO.f119560OooO00o;
        if (oooOOO3 == oooOOO2) {
            OooO(oooOOO2, new AbstractC33087Oooo0o0.C33088OooO0Oo(AbstractC33087Oooo0o0.OooO0o.OooO0O0(c32017OooO0oO.f114396OooO00o, null)));
            return;
        }
        oO0OOo0o.OooOOO oooOOO4 = oO0OOo0o.OooOOO.f119555OooOoO0;
        if (oooOOO3 == oooOOO4) {
            OooO(oooOOO4, new C32016OooO0o0(AbstractC33087Oooo0o0.OooO0o.OooO00o(oooOOOO.f119561OooO0O0)));
        } else if (this.f114384OooOOO0 != oooOOO4) {
            OooO(oooOOO3, new C32016OooO0o0(AbstractC33087Oooo0o0.OooO0o.f119638OooO0o0));
        }
    }
}
