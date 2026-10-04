package oO000o00;

import com.google.common.base.Preconditions;
import com.google.common.collect.ForwardingMap;
import com.google.common.collect.ImmutableList;
import java.lang.reflect.Array;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import oO000Oo.C32041o0000OoO;
import oO000Oo.InterfaceC32050o0000oOo;
import oO000Oo.o0000O00;
import oO0OOo0o.AbstractC33061OooO0o0;
import oO0OOo0o.AbstractC33086Oooo0o;
import oO0OOo0o.AbstractC33087Oooo0o0;
import oO0OOo0o.C33058OooO00o;
import oO0OOo0o.C33072OooOo0O;
import oO0OOo0o.C33094OoooO;
import oO0OOo0o.ExecutorC33121o00ooo;
import oO0OOo0o.OooO;
import oO0OOo0o.OooOOO;
import oO0OOo0o.OooOOOO;
import oO0OOo0o.o00Oo0;
import oO0OOo0o.oo000o;

/* JADX INFO: renamed from: oO000o00.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32098OooO0oo extends AbstractC33087Oooo0o0 {

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public static final C33058OooO00o.OooO0O0<OooO00o> f115013OooOOO = new C33058OooO00o.OooO0O0<>("addressTrackerKey");

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final InterfaceC32050o0000oOo.OooO00o f115014OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final OooO0O0 f115015OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final ExecutorC33121o00ooo f115016OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final C32096OooO0o0 f115017OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final ScheduledExecutorService f115018OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public ExecutorC33121o00ooo.OooO0OO f115019OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public Long f115020OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final AbstractC33061OooO0o0 f115021OooOOO0;

    /* JADX INFO: renamed from: oO000o00.OooO0oo$OooO */
    public interface OooO {
        void OooO00o(OooO0O0 oooO0O0, long j);
    }

    /* JADX INFO: renamed from: oO000o00.OooO0oo$OooO00o */
    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public OooO0o f115022OooO00o;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public Long f115025OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f115027OooO0o0;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public volatile C20197OooO00o f115023OooO0O0 = new C20197OooO00o();

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public C20197OooO00o f115024OooO0OO = new C20197OooO00o();

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final HashSet f115026OooO0o = new HashSet();

        /* JADX INFO: renamed from: oO000o00.OooO0oo$OooO00o$OooO00o, reason: collision with other inner class name */
        public static class C20197OooO00o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final AtomicLong f115028OooO00o = new AtomicLong();

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public final AtomicLong f115029OooO0O0 = new AtomicLong();
        }

        public OooO00o(OooO0o oooO0o) {
            this.f115022OooO00o = oooO0o;
        }

        public final void OooO00o(C20199OooO0oo c20199OooO0oo) {
            if (OooO0Oo() && !c20199OooO0oo.f115061OooO0OO) {
                c20199OooO0oo.OooOO0O();
            } else if (!OooO0Oo() && c20199OooO0oo.f115061OooO0OO) {
                c20199OooO0oo.f115061OooO0OO = false;
                OooOOOO oooOOOO = c20199OooO0oo.f115062OooO0Oo;
                if (oooOOOO != null) {
                    c20199OooO0oo.f115064OooO0o0.OooO00o(oooOOOO);
                    c20199OooO0oo.f115063OooO0o.OooO0O0(AbstractC33061OooO0o0.OooO00o.f119543OooOo, "Subchannel unejected: {0}", c20199OooO0oo);
                }
            }
            c20199OooO0oo.f115060OooO0O0 = this;
            this.f115026OooO0o.add(c20199OooO0oo);
        }

        public final void OooO0O0(long j) {
            this.f115025OooO0Oo = Long.valueOf(j);
            this.f115027OooO0o0++;
            Iterator it = this.f115026OooO0o.iterator();
            while (it.hasNext()) {
                ((C20199OooO0oo) it.next()).OooOO0O();
            }
        }

        public final long OooO0OO() {
            return this.f115024OooO0OO.f115029OooO0O0.get() + this.f115024OooO0OO.f115028OooO00o.get();
        }

        public final boolean OooO0Oo() {
            return this.f115025OooO0Oo != null;
        }

        public final void OooO0o0() {
            Preconditions.checkState(this.f115025OooO0Oo != null, "not currently ejected");
            this.f115025OooO0Oo = null;
            for (C20199OooO0oo c20199OooO0oo : this.f115026OooO0o) {
                c20199OooO0oo.f115061OooO0OO = false;
                OooOOOO oooOOOO = c20199OooO0oo.f115062OooO0Oo;
                if (oooOOOO != null) {
                    c20199OooO0oo.f115064OooO0o0.OooO00o(oooOOOO);
                    c20199OooO0oo.f115063OooO0o.OooO0O0(AbstractC33061OooO0o0.OooO00o.f119543OooOo, "Subchannel unejected: {0}", c20199OooO0oo);
                }
            }
        }

        public final String toString() {
            return "AddressTracker{subchannels=" + this.f115026OooO0o + '}';
        }
    }

    /* JADX INFO: renamed from: oO000o00.OooO0oo$OooO0O0 */
    public static class OooO0O0 extends ForwardingMap<SocketAddress, OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final HashMap f115030OooOo0o = new HashMap();

        public final double OooOOo0() {
            HashMap map = this.f115030OooOo0o;
            if (map.isEmpty()) {
                return 0.0d;
            }
            Iterator it = map.values().iterator();
            int i = 0;
            int i2 = 0;
            while (it.hasNext()) {
                i2++;
                if (((OooO00o) it.next()).OooO0Oo()) {
                    i++;
                }
            }
            return (((double) i) / ((double) i2)) * 100.0d;
        }

        @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
        public final Object delegate() {
            return this.f115030OooOo0o;
        }

        @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
        public final Map<SocketAddress, OooO00o> delegate() {
            return this.f115030OooOo0o;
        }
    }

    /* JADX INFO: renamed from: oO000o00.OooO0oo$OooO0OO */
    public class OooO0OO extends oO000o00.OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final oO000o00.OooO0o f115031OooO00o;

        public OooO0OO(AbstractC33087Oooo0o0.AbstractC33089OooO0o0 abstractC33089OooO0o0) {
            this.f115031OooO00o = new oO000o00.OooO0o(abstractC33089OooO0o0);
        }

        @Override // oO000o00.OooO0OO, oO0OOo0o.AbstractC33087Oooo0o0.AbstractC33089OooO0o0
        public final AbstractC33087Oooo0o0.OooO OooO00o(AbstractC33087Oooo0o0.OooO0O0 oooO0O0) {
            oO000o00.OooO0o oooO0o = this.f115031OooO00o;
            C32098OooO0oo c32098OooO0oo = C32098OooO0oo.this;
            C20199OooO0oo c20199OooO0oo = c32098OooO0oo.new C20199OooO0oo(oooO0O0, oooO0o);
            List<C33072OooOo0O> list = oooO0O0.f119631OooO00o;
            if (C32098OooO0oo.OooO0oO(list) && c32098OooO0oo.f115015OooO0o.containsKey(list.get(0).f119587OooO00o.get(0))) {
                OooO00o oooO00o = c32098OooO0oo.f115015OooO0o.get(list.get(0).f119587OooO00o.get(0));
                oooO00o.OooO00o(c20199OooO0oo);
                if (oooO00o.f115025OooO0Oo != null) {
                    c20199OooO0oo.OooOO0O();
                }
            }
            return c20199OooO0oo;
        }

        @Override // oO000o00.OooO0OO, oO0OOo0o.AbstractC33087Oooo0o0.AbstractC33089OooO0o0
        public final void OooO0o(OooOOO oooOOO, AbstractC33087Oooo0o0.OooOO0 oooOO02) {
            this.f115031OooO00o.OooO0o(oooOOO, new C32101OooO0oO(oooOO02));
        }

        @Override // oO000o00.OooO0OO
        public final AbstractC33087Oooo0o0.AbstractC33089OooO0o0 OooO0oO() {
            return this.f115031OooO00o;
        }
    }

    /* JADX INFO: renamed from: oO000o00.OooO0oo$OooO0Oo, reason: case insensitive filesystem */
    public class RunnableC32099OooO0Oo implements Runnable {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final AbstractC33061OooO0o0 f115033OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final OooO0o f115034OooOo0o;

        public RunnableC32099OooO0Oo(OooO0o oooO0o, AbstractC33061OooO0o0 abstractC33061OooO0o0) {
            this.f115034OooOo0o = oooO0o;
            this.f115033OooOo = abstractC33061OooO0o0;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C32098OooO0oo c32098OooO0oo = C32098OooO0oo.this;
            c32098OooO0oo.f115020OooOO0o = Long.valueOf(c32098OooO0oo.f115014OooO.OooO00o());
            for (OooO00o oooO00o : C32098OooO0oo.this.f115015OooO0o.f115030OooOo0o.values()) {
                OooO00o.C20197OooO00o c20197OooO00o = oooO00o.f115024OooO0OO;
                c20197OooO00o.f115028OooO00o.set(0L);
                c20197OooO00o.f115029OooO0O0.set(0L);
                OooO00o.C20197OooO00o c20197OooO00o2 = oooO00o.f115023OooO0O0;
                oooO00o.f115023OooO0O0 = oooO00o.f115024OooO0OO;
                oooO00o.f115024OooO0OO = c20197OooO00o2;
            }
            OooO0o oooO0o = this.f115034OooOo0o;
            AbstractC33061OooO0o0 abstractC33061OooO0o0 = this.f115033OooOo;
            ImmutableList.Builder builder = ImmutableList.builder();
            if (oooO0o.f115041OooO0o0 != null) {
                builder.add(new OooOO0(oooO0o, abstractC33061OooO0o0));
            }
            if (oooO0o.f115040OooO0o != null) {
                builder.add(new C32100OooO0o0(oooO0o, abstractC33061OooO0o0));
            }
            for (OooO oooO : builder.build()) {
                C32098OooO0oo c32098OooO0oo2 = C32098OooO0oo.this;
                oooO.OooO00o(c32098OooO0oo2.f115015OooO0o, c32098OooO0oo2.f115020OooOO0o.longValue());
            }
            C32098OooO0oo c32098OooO0oo3 = C32098OooO0oo.this;
            OooO0O0 oooO0O0 = c32098OooO0oo3.f115015OooO0o;
            Long l = c32098OooO0oo3.f115020OooOO0o;
            for (OooO00o oooO00o2 : oooO0O0.f115030OooOo0o.values()) {
                if (!oooO00o2.OooO0Oo()) {
                    int i = oooO00o2.f115027OooO0o0;
                    oooO00o2.f115027OooO0o0 = i == 0 ? 0 : i - 1;
                }
                if (oooO00o2.OooO0Oo()) {
                    if (l.longValue() > Math.min(oooO00o2.f115022OooO00o.f115037OooO0O0.longValue() * ((long) oooO00o2.f115027OooO0o0), Math.max(oooO00o2.f115022OooO00o.f115037OooO0O0.longValue(), oooO00o2.f115022OooO00o.f115038OooO0OO.longValue())) + oooO00o2.f115025OooO0Oo.longValue()) {
                        oooO00o2.OooO0o0();
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: oO000o00.OooO0oo$OooO0o */
    public static final class OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Long f115036OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Long f115037OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final Long f115038OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Integer f115039OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final OooO00o f115040OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final OooO0O0 f115041OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final C32041o0000OoO.OooO0O0 f115042OooO0oO;

        /* JADX INFO: renamed from: oO000o00.OooO0oo$OooO0o$OooO00o */
        public static class OooO00o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final Integer f115043OooO00o;

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public final Integer f115044OooO0O0;

            /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
            public final Integer f115045OooO0OO;

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final Integer f115046OooO0Oo;

            public OooO00o(Integer num, Integer num2, Integer num3, Integer num4) {
                this.f115043OooO00o = num;
                this.f115044OooO0O0 = num2;
                this.f115045OooO0OO = num3;
                this.f115046OooO0Oo = num4;
            }
        }

        /* JADX INFO: renamed from: oO000o00.OooO0oo$OooO0o$OooO0O0 */
        public static class OooO0O0 {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final Integer f115047OooO00o;

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public final Integer f115048OooO0O0;

            /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
            public final Integer f115049OooO0OO;

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final Integer f115050OooO0Oo;

            public OooO0O0(Integer num, Integer num2, Integer num3, Integer num4) {
                this.f115047OooO00o = num;
                this.f115048OooO0O0 = num2;
                this.f115049OooO0OO = num3;
                this.f115050OooO0Oo = num4;
            }
        }

        public OooO0o(Long l, Long l2, Long l3, Integer num, OooO0O0 oooO0O0, OooO00o oooO00o, C32041o0000OoO.OooO0O0 oooO0O02) {
            this.f115036OooO00o = l;
            this.f115037OooO0O0 = l2;
            this.f115038OooO0OO = l3;
            this.f115039OooO0Oo = num;
            this.f115041OooO0o0 = oooO0O0;
            this.f115040OooO0o = oooO00o;
            this.f115042OooO0oO = oooO0O02;
        }
    }

    /* JADX INFO: renamed from: oO000o00.OooO0oo$OooO0o0, reason: case insensitive filesystem */
    public static class C32100OooO0o0 implements OooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooO0o f115051OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final AbstractC33061OooO0o0 f115052OooO0O0;

        public C32100OooO0o0(OooO0o oooO0o, AbstractC33061OooO0o0 abstractC33061OooO0o0) {
            this.f115051OooO00o = oooO0o;
            this.f115052OooO0O0 = abstractC33061OooO0o0;
        }

        @Override // oO000o00.C32098OooO0oo.OooO
        public final void OooO00o(OooO0O0 oooO0O0, long j) {
            OooO0o oooO0o = this.f115051OooO00o;
            ArrayList<OooO00o> arrayListOooO0oo = C32098OooO0oo.OooO0oo(oooO0O0, oooO0o.f115040OooO0o.f115046OooO0Oo.intValue());
            int size = arrayListOooO0oo.size();
            OooO0o.OooO00o oooO00o = oooO0o.f115040OooO0o;
            if (size < oooO00o.f115045OooO0OO.intValue() || arrayListOooO0oo.size() == 0) {
                return;
            }
            for (OooO00o oooO00o2 : arrayListOooO0oo) {
                if (oooO0O0.OooOOo0() >= oooO0o.f115039OooO0Oo.intValue()) {
                    return;
                }
                if (oooO00o2.OooO0OO() >= oooO00o.f115046OooO0Oo.intValue()) {
                    if (oooO00o2.f115024OooO0OO.f115029OooO0O0.get() / oooO00o2.OooO0OO() > ((double) oooO00o.f115043OooO00o.intValue()) / 100.0d) {
                        this.f115052OooO0O0.OooO0O0(AbstractC33061OooO0o0.OooO00o.f119544OooOo0o, "FailurePercentage algorithm detected outlier: {0}, failureRate={1}", oooO00o2, Double.valueOf(oooO00o2.f115024OooO0OO.f115029OooO0O0.get() / oooO00o2.OooO0OO()));
                        if (new Random().nextInt(100) < oooO00o.f115044OooO0O0.intValue()) {
                            oooO00o2.OooO0O0(j);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: oO000o00.OooO0oo$OooO0oO, reason: case insensitive filesystem */
    public class C32101OooO0oO extends AbstractC33087Oooo0o0.OooOO0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final AbstractC33087Oooo0o0.OooOO0 f115053OooO00o;

        /* JADX INFO: renamed from: oO000o00.OooO0oo$OooO0oO$OooO00o */
        public class OooO00o extends OooO.OooO00o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final OooO00o f115054OooO00o;

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public final OooO00o f115055OooO0O0;

            /* JADX INFO: renamed from: oO000o00.OooO0oo$OooO0oO$OooO00o$OooO00o, reason: collision with other inner class name */
            public class C20198OooO00o extends oO000o00.OooO00o {

                /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
                public final /* synthetic */ oO0OOo0o.OooO f115056OooO0O0;

                public C20198OooO00o(oO0OOo0o.OooO oooO) {
                    this.f115056OooO0O0 = oooO;
                }

                @Override // Oooo0oo.AbstractC21138OooO0oo
                public final void Oooooo(o00Oo0 o00oo02) {
                    OooO00o oooO00o = OooO00o.this.f115054OooO00o;
                    boolean zOooO0o = o00oo02.OooO0o();
                    OooO0o oooO0o = oooO00o.f115022OooO00o;
                    if (oooO0o.f115041OooO0o0 != null || oooO0o.f115040OooO0o != null) {
                        if (zOooO0o) {
                            oooO00o.f115023OooO0O0.f115028OooO00o.getAndIncrement();
                        } else {
                            oooO00o.f115023OooO0O0.f115029OooO0O0.getAndIncrement();
                        }
                    }
                    this.f115056OooO0O0.Oooooo(o00oo02);
                }
            }

            /* JADX INFO: renamed from: oO000o00.OooO0oo$OooO0oO$OooO00o$OooO0O0 */
            public class OooO0O0 extends oO0OOo0o.OooO {
                public OooO0O0() {
                }

                @Override // Oooo0oo.AbstractC21138OooO0oo
                public final void Oooooo(o00Oo0 o00oo02) {
                    OooO00o oooO00o = OooO00o.this.f115054OooO00o;
                    boolean zOooO0o = o00oo02.OooO0o();
                    OooO0o oooO0o = oooO00o.f115022OooO00o;
                    if (oooO0o.f115041OooO0o0 == null && oooO0o.f115040OooO0o == null) {
                        return;
                    }
                    if (zOooO0o) {
                        oooO00o.f115023OooO0O0.f115028OooO00o.getAndIncrement();
                    } else {
                        oooO00o.f115023OooO0O0.f115029OooO0O0.getAndIncrement();
                    }
                }
            }

            public OooO00o(OooO00o oooO00o, OooO00o oooO00o2) {
                this.f115054OooO00o = oooO00o;
                this.f115055OooO0O0 = oooO00o2;
            }

            @Override // oO0OOo0o.OooO.OooO00o
            public final oO0OOo0o.OooO OooO00o(OooO.OooO0O0 oooO0O0, C33094OoooO c33094OoooO) {
                OooO00o oooO00o = this.f115055OooO0O0;
                return oooO00o != null ? new C20198OooO00o(oooO00o.OooO00o(oooO0O0, c33094OoooO)) : new OooO0O0();
            }
        }

        public C32101OooO0oO(AbstractC33087Oooo0o0.OooOO0 oooOO02) {
            this.f115053OooO00o = oooOO02;
        }

        @Override // oO0OOo0o.AbstractC33087Oooo0o0.OooOO0
        public final AbstractC33087Oooo0o0.OooO0o OooO00o(o0000O00 o0000o00) {
            AbstractC33087Oooo0o0.OooO0o oooO0oOooO00o = this.f115053OooO00o.OooO00o(o0000o00);
            AbstractC33087Oooo0o0.OooO oooO = oooO0oOooO00o.f119639OooO00o;
            if (oooO == null) {
                return oooO0oOooO00o;
            }
            C33058OooO00o c33058OooO00oOooO0OO = oooO.OooO0OO();
            return AbstractC33087Oooo0o0.OooO0o.OooO0O0(oooO, new OooO00o((OooO00o) c33058OooO00oOooO0OO.f119519OooO00o.get(C32098OooO0oo.f115013OooOOO), oooO0oOooO00o.f119640OooO0O0));
        }
    }

    /* JADX INFO: renamed from: oO000o00.OooO0oo$OooO0oo, reason: collision with other inner class name */
    public class C20199OooO0oo extends AbstractC32095OooO0Oo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final AbstractC33087Oooo0o0.OooO f115059OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public OooO00o f115060OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public boolean f115061OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public OooOOOO f115062OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final AbstractC33061OooO0o0 f115063OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public AbstractC33087Oooo0o0.OooOO0O f115064OooO0o0;

        /* JADX INFO: renamed from: oO000o00.OooO0oo$OooO0oo$OooO00o */
        public class OooO00o implements AbstractC33087Oooo0o0.OooOO0O {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final AbstractC33087Oooo0o0.OooOO0O f115066OooO00o;

            public OooO00o(AbstractC33087Oooo0o0.OooOO0O oooOO0O) {
                this.f115066OooO00o = oooOO0O;
            }

            @Override // oO0OOo0o.AbstractC33087Oooo0o0.OooOO0O
            public final void OooO00o(OooOOOO oooOOOO) {
                C20199OooO0oo c20199OooO0oo = C20199OooO0oo.this;
                c20199OooO0oo.f115062OooO0Oo = oooOOOO;
                if (c20199OooO0oo.f115061OooO0OO) {
                    return;
                }
                this.f115066OooO00o.OooO00o(oooOOOO);
            }
        }

        public C20199OooO0oo(AbstractC33087Oooo0o0.OooO0O0 oooO0O0, oO000o00.OooO0o oooO0o) {
            AbstractC33087Oooo0o0.OooO0O0.C20299OooO0O0<AbstractC33087Oooo0o0.OooOO0O> c20299OooO0O0 = AbstractC33087Oooo0o0.f119627OooO0OO;
            AbstractC33087Oooo0o0.OooOO0O oooOO0O = (AbstractC33087Oooo0o0.OooOO0O) oooO0O0.OooO00o(c20299OooO0O0);
            if (oooOO0O != null) {
                this.f115064OooO0o0 = oooOO0O;
                OooO00o oooO00o = new OooO00o(oooOO0O);
                AbstractC33087Oooo0o0.OooO0O0.OooO00o oooO00oOooO0O0 = AbstractC33087Oooo0o0.OooO0O0.OooO0O0();
                oooO00oOooO0O0.OooO0O0(oooO0O0.f119631OooO00o);
                oooO00oOooO0O0.f119635OooO0O0 = (C33058OooO00o) Preconditions.checkNotNull(oooO0O0.f119632OooO0O0, "attrs");
                Object[][] objArr = oooO0O0.f119633OooO0OO;
                Object[][] objArr2 = (Object[][]) Array.newInstance((Class<?>) Object.class, objArr.length, 2);
                oooO00oOooO0O0.f119636OooO0OO = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
                oooO00oOooO0O0.OooO00o(c20299OooO0O0, oooO00o);
                this.f115059OooO00o = oooO0o.OooO00o(new AbstractC33087Oooo0o0.OooO0O0(oooO00oOooO0O0.f119634OooO00o, oooO00oOooO0O0.f119635OooO0O0, oooO00oOooO0O0.f119636OooO0OO));
            } else {
                this.f115059OooO00o = oooO0o.OooO00o(oooO0O0);
            }
            this.f115063OooO0o = this.f115059OooO00o.OooO0Oo();
        }

        @Override // oO000o00.AbstractC32095OooO0Oo, oO0OOo0o.AbstractC33087Oooo0o0.OooO
        public final void OooO(List<C33072OooOo0O> list) {
            boolean zOooO0oO = C32098OooO0oo.OooO0oO(OooO0O0());
            C32098OooO0oo c32098OooO0oo = C32098OooO0oo.this;
            if (zOooO0oO && C32098OooO0oo.OooO0oO(list)) {
                if (c32098OooO0oo.f115015OooO0o.containsValue(this.f115060OooO0O0)) {
                    OooO00o oooO00o = this.f115060OooO0O0;
                    oooO00o.getClass();
                    this.f115060OooO0O0 = null;
                    oooO00o.f115026OooO0o.remove(this);
                }
                SocketAddress socketAddress = list.get(0).f119587OooO00o.get(0);
                if (c32098OooO0oo.f115015OooO0o.containsKey(socketAddress)) {
                    c32098OooO0oo.f115015OooO0o.get(socketAddress).OooO00o(this);
                }
            } else if (!C32098OooO0oo.OooO0oO(OooO0O0()) || C32098OooO0oo.OooO0oO(list)) {
                if (!C32098OooO0oo.OooO0oO(OooO0O0()) && C32098OooO0oo.OooO0oO(list)) {
                    SocketAddress socketAddress2 = list.get(0).f119587OooO00o.get(0);
                    if (c32098OooO0oo.f115015OooO0o.containsKey(socketAddress2)) {
                        c32098OooO0oo.f115015OooO0o.get(socketAddress2).OooO00o(this);
                    }
                }
            } else if (c32098OooO0oo.f115015OooO0o.containsKey(OooO00o().f119587OooO00o.get(0))) {
                OooO00o oooO00o2 = c32098OooO0oo.f115015OooO0o.get(OooO00o().f119587OooO00o.get(0));
                oooO00o2.getClass();
                this.f115060OooO0O0 = null;
                oooO00o2.f115026OooO0o.remove(this);
                OooO00o.C20197OooO00o c20197OooO00o = oooO00o2.f115023OooO0O0;
                c20197OooO00o.f115028OooO00o.set(0L);
                c20197OooO00o.f115029OooO0O0.set(0L);
                OooO00o.C20197OooO00o c20197OooO00o2 = oooO00o2.f115024OooO0OO;
                c20197OooO00o2.f115028OooO00o.set(0L);
                c20197OooO00o2.f115029OooO0O0.set(0L);
            }
            this.f115059OooO00o.OooO(list);
        }

        @Override // oO0OOo0o.AbstractC33087Oooo0o0.OooO
        public final C33058OooO00o OooO0OO() {
            OooO00o oooO00o = this.f115060OooO0O0;
            AbstractC33087Oooo0o0.OooO oooO = this.f115059OooO00o;
            if (oooO00o == null) {
                return oooO.OooO0OO();
            }
            C33058OooO00o c33058OooO00oOooO0OO = oooO.OooO0OO();
            c33058OooO00oOooO0OO.getClass();
            C33058OooO00o.OooO0O0<OooO00o> oooO0O0 = C32098OooO0oo.f115013OooOOO;
            OooO00o oooO00o2 = this.f115060OooO0O0;
            IdentityHashMap identityHashMap = new IdentityHashMap(1);
            identityHashMap.put(oooO0O0, oooO00o2);
            for (Map.Entry<C33058OooO00o.OooO0O0<?>, Object> entry : c33058OooO00oOooO0OO.f119519OooO00o.entrySet()) {
                if (!identityHashMap.containsKey(entry.getKey())) {
                    identityHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            return new C33058OooO00o(identityHashMap);
        }

        @Override // oO000o00.AbstractC32095OooO0Oo, oO0OOo0o.AbstractC33087Oooo0o0.OooO
        public final void OooO0oO() {
            OooO00o oooO00o = this.f115060OooO0O0;
            if (oooO00o != null) {
                this.f115060OooO0O0 = null;
                oooO00o.f115026OooO0o.remove(this);
            }
            super.OooO0oO();
        }

        @Override // oO0OOo0o.AbstractC33087Oooo0o0.OooO
        public final void OooO0oo(AbstractC33087Oooo0o0.OooOO0O oooOO0O) {
            if (this.f115064OooO0o0 != null) {
                OooOO0().OooO0oo(oooOO0O);
                return;
            }
            this.f115064OooO0o0 = oooOO0O;
            OooOO0().OooO0oo(new OooO00o(oooOO0O));
        }

        @Override // oO000o00.AbstractC32095OooO0Oo
        public final AbstractC33087Oooo0o0.OooO OooOO0() {
            return this.f115059OooO00o;
        }

        public final void OooOO0O() {
            this.f115061OooO0OO = true;
            AbstractC33087Oooo0o0.OooOO0O oooOO0O = this.f115064OooO0o0;
            o00Oo0 o00oo02 = o00Oo0.f119725OooOOOO;
            Preconditions.checkArgument(true ^ o00oo02.OooO0o(), "The error status must not be OK");
            oooOO0O.OooO00o(new OooOOOO(OooOOO.f119555OooOoO0, o00oo02));
            this.f115063OooO0o.OooO0O0(AbstractC33061OooO0o0.OooO00o.f119543OooOo, "Subchannel ejected: {0}", this);
        }

        @Override // oO000o00.AbstractC32095OooO0Oo
        public final String toString() {
            return "OutlierDetectionSubchannel{addresses=" + this.f115059OooO00o.OooO0O0() + '}';
        }
    }

    /* JADX INFO: renamed from: oO000o00.OooO0oo$OooOO0 */
    public static class OooOO0 implements OooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooO0o f115068OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final AbstractC33061OooO0o0 f115069OooO0O0;

        public OooOO0(OooO0o oooO0o, AbstractC33061OooO0o0 abstractC33061OooO0o0) {
            Preconditions.checkArgument(oooO0o.f115041OooO0o0 != null, "success rate ejection config is null");
            this.f115068OooO00o = oooO0o;
            this.f115069OooO0O0 = abstractC33061OooO0o0;
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x011e  */
        @Override // oO000o00.C32098OooO0oo.OooO
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void OooO00o(OooO0O0 oooO0O0, long j) {
            OooO0o oooO0o = this.f115068OooO00o;
            OooO0O0 oooO0O02 = oooO0O0;
            ArrayList<OooO00o> arrayListOooO0oo = C32098OooO0oo.OooO0oo(oooO0O02, oooO0o.f115041OooO0o0.f115050OooO0Oo.intValue());
            int size = arrayListOooO0oo.size();
            OooO0o.OooO0O0 oooO0O03 = oooO0o.f115041OooO0o0;
            if (size < oooO0O03.f115049OooO0OO.intValue() || arrayListOooO0oo.size() == 0) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (OooO00o oooO00o : arrayListOooO0oo) {
                arrayList.add(Double.valueOf(oooO00o.f115024OooO0OO.f115028OooO00o.get() / oooO00o.OooO0OO()));
            }
            Iterator it = arrayList.iterator();
            double d = 0.0d;
            double dDoubleValue = 0.0d;
            while (it.hasNext()) {
                dDoubleValue += ((Double) it.next()).doubleValue();
            }
            double size2 = dDoubleValue / ((double) arrayList.size());
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                double dDoubleValue2 = ((Double) it2.next()).doubleValue() - size2;
                d += dDoubleValue2 * dDoubleValue2;
            }
            double dSqrt = Math.sqrt(d / ((double) arrayList.size()));
            double dIntValue = size2 - (((double) (oooO0O03.f115047OooO00o.intValue() / 1000.0f)) * dSqrt);
            Iterator it3 = arrayListOooO0oo.iterator();
            while (it3.hasNext()) {
                OooO00o oooO00o2 = (OooO00o) it3.next();
                OooO0o oooO0o2 = oooO0o;
                Iterator it4 = it3;
                if (oooO0O02.OooOOo0() >= oooO0o.f115039OooO0Oo.intValue()) {
                    return;
                }
                if (oooO00o2.f115024OooO0OO.f115028OooO00o.get() / oooO00o2.OooO0OO() < dIntValue) {
                    this.f115069OooO0O0.OooO0O0(AbstractC33061OooO0o0.OooO00o.f119544OooOo0o, "SuccessRate algorithm detected outlier: {0}. Parameters: successRate={1}, mean={2}, stdev={3}, requiredSuccessRate={4}", oooO00o2, Double.valueOf(oooO00o2.f115024OooO0OO.f115028OooO00o.get() / oooO00o2.OooO0OO()), Double.valueOf(size2), Double.valueOf(dSqrt), Double.valueOf(dIntValue));
                    if (new Random().nextInt(100) < oooO0O03.f115048OooO0O0.intValue()) {
                        oooO00o2.OooO0O0(j);
                    }
                }
                oooO0O02 = oooO0O0;
                oooO0o = oooO0o2;
                it3 = it4;
            }
        }
    }

    public C32098OooO0oo(AbstractC33087Oooo0o0.AbstractC33089OooO0o0 abstractC33089OooO0o0) {
        InterfaceC32050o0000oOo.OooO00o oooO00o = InterfaceC32050o0000oOo.f114567OooO00o;
        AbstractC33061OooO0o0 abstractC33061OooO0o0OooO0O0 = abstractC33089OooO0o0.OooO0O0();
        this.f115021OooOOO0 = abstractC33061OooO0o0OooO0O0;
        this.f115017OooO0oo = new C32096OooO0o0(new OooO0OO((AbstractC33087Oooo0o0.AbstractC33089OooO0o0) Preconditions.checkNotNull(abstractC33089OooO0o0, "helper")));
        this.f115015OooO0o = new OooO0O0();
        this.f115016OooO0oO = (ExecutorC33121o00ooo) Preconditions.checkNotNull(abstractC33089OooO0o0.OooO0Oo(), "syncContext");
        this.f115018OooOO0 = (ScheduledExecutorService) Preconditions.checkNotNull(abstractC33089OooO0o0.OooO0OO(), "timeService");
        this.f115014OooO = oooO00o;
        abstractC33061OooO0o0OooO0O0.OooO00o(AbstractC33061OooO0o0.OooO00o.f119544OooOo0o, "OutlierDetection lb created.");
    }

    public static boolean OooO0oO(List list) {
        Iterator it = list.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((C33072OooOo0O) it.next()).f119587OooO00o.size();
            if (size > 1) {
                return false;
            }
        }
        return true;
    }

    public static ArrayList OooO0oo(OooO0O0 oooO0O0, int i) {
        ArrayList arrayList = new ArrayList();
        for (OooO00o oooO00o : oooO0O0.values()) {
            if (oooO00o.OooO0OO() >= i) {
                arrayList.add(oooO00o);
            }
        }
        return arrayList;
    }

    @Override // oO0OOo0o.AbstractC33087Oooo0o0
    public final o00Oo0 OooO00o(AbstractC33087Oooo0o0.C33091OooO0oo c33091OooO0oo) {
        AbstractC33061OooO0o0 abstractC33061OooO0o0 = this.f115021OooOOO0;
        abstractC33061OooO0o0.OooO0O0(AbstractC33061OooO0o0.OooO00o.f119544OooOo0o, "Received resolution result: {0}", c33091OooO0oo);
        OooO0o oooO0o = (OooO0o) c33091OooO0oo.f119645OooO0OO;
        ArrayList<SocketAddress> arrayList = new ArrayList();
        Iterator<C33072OooOo0O> it = c33091OooO0oo.f119643OooO00o.iterator();
        while (it.hasNext()) {
            arrayList.addAll(it.next().f119587OooO00o);
        }
        OooO0O0 oooO0O0 = this.f115015OooO0o;
        oooO0O0.keySet().retainAll(arrayList);
        Iterator it2 = oooO0O0.f115030OooOo0o.values().iterator();
        while (it2.hasNext()) {
            ((OooO00o) it2.next()).f115022OooO00o = oooO0o;
        }
        for (SocketAddress socketAddress : arrayList) {
            HashMap map = oooO0O0.f115030OooOo0o;
            if (!map.containsKey(socketAddress)) {
                map.put(socketAddress, new OooO00o(oooO0o));
            }
        }
        AbstractC33086Oooo0o abstractC33086Oooo0o = oooO0o.f115042OooO0oO.f114550OooO00o;
        C32096OooO0o0 c32096OooO0o0 = this.f115017OooO0oo;
        c32096OooO0o0.OooO(abstractC33086Oooo0o);
        if (oooO0o.f115041OooO0o0 == null && oooO0o.f115040OooO0o == null) {
            ExecutorC33121o00ooo.OooO0OO oooO0OO = this.f115019OooOO0O;
            if (oooO0OO != null) {
                oooO0OO.OooO00o();
                this.f115020OooOO0o = null;
                for (OooO00o oooO00o : oooO0O0.f115030OooOo0o.values()) {
                    if (oooO00o.OooO0Oo()) {
                        oooO00o.OooO0o0();
                    }
                    oooO00o.f115027OooO0o0 = 0;
                }
            }
        } else {
            Long l = this.f115020OooOO0o;
            Long l2 = oooO0o.f115036OooO00o;
            Long lValueOf = l == null ? l2 : Long.valueOf(Math.max(0L, l2.longValue() - (this.f115014OooO.OooO00o() - this.f115020OooOO0o.longValue())));
            ExecutorC33121o00ooo.OooO0OO oooO0OO2 = this.f115019OooOO0O;
            if (oooO0OO2 != null) {
                oooO0OO2.OooO00o();
                for (OooO00o oooO00o2 : oooO0O0.f115030OooOo0o.values()) {
                    OooO00o.C20197OooO00o c20197OooO00o = oooO00o2.f115023OooO0O0;
                    c20197OooO00o.f115028OooO00o.set(0L);
                    c20197OooO00o.f115029OooO0O0.set(0L);
                    OooO00o.C20197OooO00o c20197OooO00o2 = oooO00o2.f115024OooO0OO;
                    c20197OooO00o2.f115028OooO00o.set(0L);
                    c20197OooO00o2.f115029OooO0O0.set(0L);
                }
            }
            RunnableC32099OooO0Oo runnableC32099OooO0Oo = new RunnableC32099OooO0Oo(oooO0o, abstractC33061OooO0o0);
            long jLongValue = lValueOf.longValue();
            long jLongValue2 = l2.longValue();
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            ExecutorC33121o00ooo executorC33121o00ooo = this.f115016OooO0oO;
            executorC33121o00ooo.getClass();
            ExecutorC33121o00ooo.OooO0O0 oooO0O02 = new ExecutorC33121o00ooo.OooO0O0(runnableC32099OooO0Oo);
            this.f115019OooOO0O = new ExecutorC33121o00ooo.OooO0OO(oooO0O02, this.f115018OooOO0.scheduleWithFixedDelay(new oo000o(executorC33121o00ooo, oooO0O02, runnableC32099OooO0Oo, jLongValue2), jLongValue, jLongValue2, timeUnit));
        }
        C33058OooO00o c33058OooO00o = C33058OooO00o.f119518OooO0O0;
        c32096OooO0o0.OooO0Oo(new AbstractC33087Oooo0o0.C33091OooO0oo(c33091OooO0oo.f119643OooO00o, c33091OooO0oo.f119644OooO0O0, oooO0o.f115042OooO0oO.f114551OooO0O0));
        return o00Oo0.f119717OooO0o0;
    }

    @Override // oO0OOo0o.AbstractC33087Oooo0o0
    public final void OooO0OO(o00Oo0 o00oo02) {
        this.f115017OooO0oo.OooO0OO(o00oo02);
    }

    @Override // oO0OOo0o.AbstractC33087Oooo0o0
    public final void OooO0o() {
        this.f115017OooO0oo.OooO0o();
    }
}
