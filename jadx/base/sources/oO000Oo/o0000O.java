package oO000Oo;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import java.io.InputStream;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;
import oO000Oo.InterfaceC31948OooOOoo;
import oO000Oo.InterfaceC32049o0000oOO;
import oO0OOo0o.C33058OooO00o;
import oO0OOo0o.C33068OooOOo;
import oO0OOo0o.C33094OoooO;
import oO0OOo0o.C33101OoooOO0;
import oO0OOo0o.ExecutorC33121o00ooo;
import oO0OOo0o.InterfaceC33064OooOO0o;
import oO0OOo0o.OooO;

/* JADX INFO: loaded from: classes10.dex */
public abstract class o0000O<ReqT> implements InterfaceC31946OooOOo {

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public static final C33094OoooO.OooO0O0 f114411OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public static final oO0OOo0o.o00Oo0 f114412OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public static final C33094OoooO.OooO0O0 f114413OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public static final Random f114414OooOooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C33101OoooOO0<ReqT, ?> f114416OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Executor f114417OooO0O0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ScheduledExecutorService f114419OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o0000OO f114420OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final C33094OoooO f114421OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final C31994OoooOO0 f114422OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final boolean f114423OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final C32027OooOOo f114424OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final long f114425OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final long f114426OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final C32037OooOoOO f114428OooOOO0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public C32031OooOo0O f114433OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public long f114434OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public InterfaceC31948OooOOoo f114435OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public long f114436OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public C32029OooOOoo f114437OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C32029OooOOoo f114438OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public boolean f114439OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public oO0OOo0o.o00Oo0 f114440OooOoO0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ExecutorC33121o00ooo f114418OooO0OO = new ExecutorC33121o00ooo(new OooO00o());

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final Object f114415OooO = new Object();

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final C31998OoooOoO f114427OooOOO = new C31998OoooOoO();

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public volatile OooOo f114429OooOOOO = new OooOo(new ArrayList(8), Collections.EMPTY_LIST, null, null, false, false, false, 0);

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final AtomicBoolean f114430OooOOOo = new AtomicBoolean();

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final AtomicInteger f114432OooOOo0 = new AtomicInteger();

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final AtomicInteger f114431OooOOo = new AtomicInteger();

    public class OooO implements InterfaceC32026OooOOOo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ boolean f114441OooO00o;

        public OooO(boolean z) {
            this.f114441OooO00o = z;
        }

        @Override // oO000Oo.o0000O.InterfaceC32026OooOOOo
        public final void OooO00o(C32033OooOoO c32033OooOoO) {
            c32033OooOoO.f114481OooO00o.OooO0o0(this.f114441OooO00o);
        }
    }

    public class OooO00o implements Thread.UncaughtExceptionHandler {
        @Override // java.lang.Thread.UncaughtExceptionHandler
        public final void uncaughtException(Thread thread, Throwable th) {
            throw oO0OOo0o.o00Oo0.OooO0o0(th).OooO0oo("Uncaught exception in the SynchronizationContext. Re-thrown.").OooO00o();
        }
    }

    public class OooO0O0 implements InterfaceC32026OooOOOo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33064OooOO0o f114442OooO00o;

        public OooO0O0(InterfaceC33064OooOO0o interfaceC33064OooOO0o) {
            this.f114442OooO00o = interfaceC33064OooOO0o;
        }

        @Override // oO000Oo.o0000O.InterfaceC32026OooOOOo
        public final void OooO00o(C32033OooOoO c32033OooOoO) {
            c32033OooOoO.f114481OooO00o.OooO0O0(this.f114442OooO00o);
        }
    }

    public class OooO0OO implements InterfaceC32026OooOOOo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ C33068OooOOo f114443OooO00o;

        public OooO0OO(C33068OooOOo c33068OooOOo) {
            this.f114443OooO00o = c33068OooOOo;
        }

        @Override // oO000Oo.o0000O.InterfaceC32026OooOOOo
        public final void OooO00o(C32033OooOoO c32033OooOoO) {
            c32033OooOoO.f114481OooO00o.OooO0o(this.f114443OooO00o);
        }
    }

    /* JADX INFO: renamed from: oO000Oo.o0000O$OooO0Oo, reason: case insensitive filesystem */
    public class C32021OooO0Oo implements InterfaceC32026OooOOOo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ oO0OOo0o.OooOo00 f114444OooO00o;

        public C32021OooO0Oo(oO0OOo0o.OooOo00 oooOo00) {
            this.f114444OooO00o = oooOo00;
        }

        @Override // oO000Oo.o0000O.InterfaceC32026OooOOOo
        public final void OooO00o(C32033OooOoO c32033OooOoO) {
            c32033OooOoO.f114481OooO00o.OooOO0O(this.f114444OooO00o);
        }
    }

    public class OooO0o implements InterfaceC32026OooOOOo {
        @Override // oO000Oo.o0000O.InterfaceC32026OooOOOo
        public final void OooO00o(C32033OooOoO c32033OooOoO) {
            c32033OooOoO.f114481OooO00o.OooOO0();
        }
    }

    /* JADX INFO: renamed from: oO000Oo.o0000O$OooO0o0, reason: case insensitive filesystem */
    public class C32022OooO0o0 implements InterfaceC32026OooOOOo {
        @Override // oO000Oo.o0000O.InterfaceC32026OooOOOo
        public final void OooO00o(C32033OooOoO c32033OooOoO) {
            c32033OooOoO.f114481OooO00o.flush();
        }
    }

    /* JADX INFO: renamed from: oO000Oo.o0000O$OooO0oO, reason: case insensitive filesystem */
    public class C32023OooO0oO implements InterfaceC32026OooOOOo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ int f114445OooO00o;

        public C32023OooO0oO(int i) {
            this.f114445OooO00o = i;
        }

        @Override // oO000Oo.o0000O.InterfaceC32026OooOOOo
        public final void OooO00o(C32033OooOoO c32033OooOoO) {
            c32033OooOoO.f114481OooO00o.OooO0OO(this.f114445OooO00o);
        }
    }

    /* JADX INFO: renamed from: oO000Oo.o0000O$OooO0oo, reason: case insensitive filesystem */
    public class C32024OooO0oo implements InterfaceC32026OooOOOo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ int f114446OooO00o;

        public C32024OooO0oo(int i) {
            this.f114446OooO00o = i;
        }

        @Override // oO000Oo.o0000O.InterfaceC32026OooOOOo
        public final void OooO00o(C32033OooOoO c32033OooOoO) {
            c32033OooOoO.f114481OooO00o.OooO0Oo(this.f114446OooO00o);
        }
    }

    public class OooOO0 implements InterfaceC32026OooOOOo {
        @Override // oO000Oo.o0000O.InterfaceC32026OooOOOo
        public final void OooO00o(C32033OooOoO c32033OooOoO) {
            c32033OooOoO.f114481OooO00o.OooO0oo();
        }
    }

    public class OooOO0O implements InterfaceC32026OooOOOo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ int f114447OooO00o;

        public OooOO0O(int i) {
            this.f114447OooO00o = i;
        }

        @Override // oO000Oo.o0000O.InterfaceC32026OooOOOo
        public final void OooO00o(C32033OooOoO c32033OooOoO) {
            c32033OooOoO.f114481OooO00o.OooO00o(this.f114447OooO00o);
        }
    }

    /* JADX INFO: renamed from: oO000Oo.o0000O$OooOO0o, reason: case insensitive filesystem */
    public class C32025OooOO0o implements InterfaceC32026OooOOOo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ Object f114448OooO00o;

        public C32025OooOO0o(Object obj) {
            this.f114448OooO00o = obj;
        }

        @Override // oO000Oo.o0000O.InterfaceC32026OooOOOo
        public final void OooO00o(C32033OooOoO c32033OooOoO) {
            c32033OooOoO.f114481OooO00o.OooO0oO(o0000O.this.f114416OooO00o.f119669OooO0Oo.OooO00o(this.f114448OooO00o));
            c32033OooOoO.f114481OooO00o.flush();
        }
    }

    public class OooOOO implements Runnable {
        public OooOOO() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            o0000O o0000o2 = o0000O.this;
            if (o0000o2.f114439OooOoO) {
                return;
            }
            o0000o2.f114435OooOo0.onReady();
        }
    }

    public class OooOOO0 extends OooO.OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ C32028OooOOo0 f114451OooO00o;

        public OooOOO0(C32028OooOOo0 c32028OooOOo0) {
            this.f114451OooO00o = c32028OooOOo0;
        }

        @Override // oO0OOo0o.OooO.OooO00o
        public final oO0OOo0o.OooO OooO00o(OooO.OooO0O0 oooO0O0, C33094OoooO c33094OoooO) {
            return this.f114451OooO00o;
        }
    }

    public class OooOOOO implements Runnable {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ InterfaceC31948OooOOoo.OooO00o f114452OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ oO0OOo0o.o00Oo0 f114453OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ C33094OoooO f114455OooOoO0;

        public OooOOOO(oO0OOo0o.o00Oo0 o00oo02, InterfaceC31948OooOOoo.OooO00o oooO00o, C33094OoooO c33094OoooO) {
            this.f114453OooOo0o = o00oo02;
            this.f114452OooOo = oooO00o;
            this.f114455OooOoO0 = c33094OoooO;
        }

        @Override // java.lang.Runnable
        public final void run() {
            o0000O o0000o2 = o0000O.this;
            o0000o2.f114439OooOoO = true;
            o0000o2.f114435OooOo0.OooO0OO(this.f114453OooOo0o, this.f114452OooOo, this.f114455OooOoO0);
        }
    }

    /* JADX INFO: renamed from: oO000Oo.o0000O$OooOOOo, reason: case insensitive filesystem */
    public interface InterfaceC32026OooOOOo {
        void OooO00o(C32033OooOoO c32033OooOoO);
    }

    /* JADX INFO: renamed from: oO000Oo.o0000O$OooOOo, reason: case insensitive filesystem */
    public static final class C32027OooOOo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final AtomicLong f114456OooO00o = new AtomicLong();
    }

    /* JADX INFO: renamed from: oO000Oo.o0000O$OooOOo0, reason: case insensitive filesystem */
    public class C32028OooOOo0 extends oO0OOo0o.OooO {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final C32033OooOoO f114457OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public long f114458OooO0OO;

        public C32028OooOOo0(C32033OooOoO c32033OooOoO) {
            this.f114457OooO0O0 = c32033OooOoO;
        }

        @Override // Oooo0oo.AbstractC21138OooO0oo
        public final void OooooOO(long j) {
            if (o0000O.this.f114429OooOOOO.f114467OooO0o != null) {
                return;
            }
            synchronized (o0000O.this.f114415OooO) {
                try {
                    if (o0000O.this.f114429OooOOOO.f114467OooO0o == null) {
                        C32033OooOoO c32033OooOoO = this.f114457OooO0O0;
                        if (!c32033OooOoO.f114482OooO0O0) {
                            long j2 = this.f114458OooO0OO + j;
                            this.f114458OooO0OO = j2;
                            o0000O o0000o2 = o0000O.this;
                            long j3 = o0000o2.f114436OooOo00;
                            if (j2 <= j3) {
                                return;
                            }
                            if (j2 > o0000o2.f114425OooOO0O) {
                                c32033OooOoO.f114483OooO0OO = true;
                            } else {
                                long jAddAndGet = o0000o2.f114424OooOO0.f114456OooO00o.addAndGet(j2 - j3);
                                o0000O o0000o3 = o0000O.this;
                                o0000o3.f114436OooOo00 = this.f114458OooO0OO;
                                if (jAddAndGet > o0000o3.f114426OooOO0o) {
                                    this.f114457OooO0O0.f114483OooO0OO = true;
                                }
                            }
                            C32033OooOoO c32033OooOoO2 = this.f114457OooO0O0;
                            o0000OO0 o0000oo0OooOOOO = c32033OooOoO2.f114483OooO0OO ? o0000O.this.OooOOOO(c32033OooOoO2) : null;
                            if (o0000oo0OooOOOO != null) {
                                o0000oo0OooOOOO.run();
                            }
                        }
                    }
                } finally {
                }
            }
        }
    }

    /* JADX INFO: renamed from: oO000Oo.o0000O$OooOOoo, reason: case insensitive filesystem */
    public static final class C32029OooOOoo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Object f114460OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public ScheduledFuture f114461OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public boolean f114462OooO0OO;

        public C32029OooOOoo(Object obj) {
            this.f114460OooO00o = obj;
        }

        public final void OooO00o(ScheduledFuture scheduledFuture) {
            synchronized (this.f114460OooO00o) {
                if (!this.f114462OooO0OO) {
                    this.f114461OooO0O0 = scheduledFuture;
                }
            }
        }
    }

    public static final class OooOo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final boolean f114463OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final List<InterfaceC32026OooOOOo> f114464OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final Collection<C32033OooOoO> f114465OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Collection<C32033OooOoO> f114466OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final C32033OooOoO f114467OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final int f114468OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final boolean f114469OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final boolean f114470OooO0oo;

        public OooOo(List<InterfaceC32026OooOOOo> list, Collection<C32033OooOoO> collection, Collection<C32033OooOoO> collection2, C32033OooOoO c32033OooOoO, boolean z, boolean z2, boolean z3, int i) {
            this.f114464OooO0O0 = list;
            this.f114465OooO0OO = (Collection) Preconditions.checkNotNull(collection, "drainedSubstreams");
            this.f114467OooO0o = c32033OooOoO;
            this.f114466OooO0Oo = collection2;
            this.f114469OooO0oO = z;
            this.f114463OooO00o = z2;
            this.f114470OooO0oo = z3;
            this.f114468OooO0o0 = i;
            Preconditions.checkState(!z2 || list == null, "passThrough should imply buffer is null");
            Preconditions.checkState((z2 && c32033OooOoO == null) ? false : true, "passThrough should imply winningSubstream != null");
            Preconditions.checkState(!z2 || (collection.size() == 1 && collection.contains(c32033OooOoO)) || (collection.size() == 0 && c32033OooOoO.f114482OooO0O0), "passThrough should imply winningSubstream is drained");
            Preconditions.checkState((z && c32033OooOoO == null) ? false : true, "cancelled should imply committed");
        }

        public final OooOo OooO00o(C32033OooOoO c32033OooOoO) {
            Collection collectionUnmodifiableCollection;
            Preconditions.checkState(!this.f114470OooO0oo, "hedging frozen");
            Preconditions.checkState(this.f114467OooO0o == null, "already committed");
            Collection<C32033OooOoO> collection = this.f114466OooO0Oo;
            if (collection == null) {
                collectionUnmodifiableCollection = Collections.singleton(c32033OooOoO);
            } else {
                ArrayList arrayList = new ArrayList(collection);
                arrayList.add(c32033OooOoO);
                collectionUnmodifiableCollection = Collections.unmodifiableCollection(arrayList);
            }
            return new OooOo(this.f114464OooO0O0, this.f114465OooO0OO, collectionUnmodifiableCollection, this.f114467OooO0o, this.f114469OooO0oO, this.f114463OooO00o, this.f114470OooO0oo, this.f114468OooO0o0 + 1);
        }

        public final OooOo OooO0O0(C32033OooOoO c32033OooOoO) {
            ArrayList arrayList = new ArrayList(this.f114466OooO0Oo);
            arrayList.remove(c32033OooOoO);
            return new OooOo(this.f114464OooO0O0, this.f114465OooO0OO, Collections.unmodifiableCollection(arrayList), this.f114467OooO0o, this.f114469OooO0oO, this.f114463OooO00o, this.f114470OooO0oo, this.f114468OooO0o0);
        }

        public final OooOo OooO0OO(C32033OooOoO c32033OooOoO, C32033OooOoO c32033OooOoO2) {
            ArrayList arrayList = new ArrayList(this.f114466OooO0Oo);
            arrayList.remove(c32033OooOoO);
            arrayList.add(c32033OooOoO2);
            return new OooOo(this.f114464OooO0O0, this.f114465OooO0OO, Collections.unmodifiableCollection(arrayList), this.f114467OooO0o, this.f114469OooO0oO, this.f114463OooO00o, this.f114470OooO0oo, this.f114468OooO0o0);
        }

        public final OooOo OooO0Oo(C32033OooOoO c32033OooOoO) {
            c32033OooOoO.f114482OooO0O0 = true;
            Collection<C32033OooOoO> collection = this.f114465OooO0OO;
            if (!collection.contains(c32033OooOoO)) {
                return this;
            }
            ArrayList arrayList = new ArrayList(collection);
            arrayList.remove(c32033OooOoO);
            return new OooOo(this.f114464OooO0O0, Collections.unmodifiableCollection(arrayList), this.f114466OooO0Oo, this.f114467OooO0o, this.f114469OooO0oO, this.f114463OooO00o, this.f114470OooO0oo, this.f114468OooO0o0);
        }

        public final OooOo OooO0o0(C32033OooOoO c32033OooOoO) {
            List<InterfaceC32026OooOOOo> list;
            Preconditions.checkState(!this.f114463OooO00o, "Already passThrough");
            boolean z = c32033OooOoO.f114482OooO0O0;
            Collection collectionUnmodifiableCollection = this.f114465OooO0OO;
            if (!z) {
                if (collectionUnmodifiableCollection.isEmpty()) {
                    collectionUnmodifiableCollection = Collections.singletonList(c32033OooOoO);
                } else {
                    ArrayList arrayList = new ArrayList(collectionUnmodifiableCollection);
                    arrayList.add(c32033OooOoO);
                    collectionUnmodifiableCollection = Collections.unmodifiableCollection(arrayList);
                }
            }
            Collection collection = collectionUnmodifiableCollection;
            C32033OooOoO c32033OooOoO2 = this.f114467OooO0o;
            boolean z2 = c32033OooOoO2 != null;
            if (z2) {
                Preconditions.checkState(c32033OooOoO2 == c32033OooOoO, "Another RPC attempt has already committed");
                list = null;
            } else {
                list = this.f114464OooO0O0;
            }
            return new OooOo(list, collection, this.f114466OooO0Oo, this.f114467OooO0o, this.f114469OooO0oO, z2, this.f114470OooO0oo, this.f114468OooO0o0);
        }
    }

    /* JADX INFO: renamed from: oO000Oo.o0000O$OooOo0, reason: case insensitive filesystem */
    public static final class C32030OooOo0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final boolean f114471OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final long f114472OooO0O0;

        public C32030OooOo0(long j, boolean z) {
            this.f114471OooO00o = z;
            this.f114472OooO0O0 = j;
        }
    }

    public final class OooOo00 implements Runnable {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final C32029OooOOoo f114474OooOo0o;

        public class OooO00o implements Runnable {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ C32033OooOoO f114476OooOo0o;

            public OooO00o(C32033OooOoO c32033OooOoO) {
                this.f114476OooOo0o = c32033OooOoO;
            }

            /* JADX WARN: Removed duplicated region for block: B:20:0x0053 A[Catch: all -> 0x0051, TryCatch #0 {all -> 0x0051, blocks: (B:4:0x0007, B:25:0x007c, B:7:0x0013, B:9:0x002c, B:11:0x0034, B:16:0x0042, B:20:0x0053, B:24:0x0073, B:23:0x005e), top: B:35:0x0007 }] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                boolean z;
                C32029OooOOoo c32029OooOOoo;
                synchronized (o0000O.this.f114415OooO) {
                    try {
                        OooOo00 oooOo00 = OooOo00.this;
                        z = true;
                        c32029OooOOoo = null;
                        if (!oooOo00.f114474OooOo0o.f114462OooO0OO) {
                            o0000O o0000o2 = o0000O.this;
                            o0000o2.f114429OooOOOO = o0000o2.f114429OooOOOO.OooO00o(this.f114476OooOo0o);
                            o0000O o0000o3 = o0000O.this;
                            if (o0000o3.OooOo00(o0000o3.f114429OooOOOO)) {
                                C32037OooOoOO c32037OooOoOO = o0000O.this.f114428OooOOO0;
                                if (c32037OooOoOO != null) {
                                    if (c32037OooOoOO.f114501OooO0Oo.get() <= c32037OooOoOO.f114499OooO0O0) {
                                        z = false;
                                    }
                                    if (z) {
                                    }
                                    z = false;
                                }
                                o0000O o0000o4 = o0000O.this;
                                c32029OooOOoo = new C32029OooOOoo(o0000o4.f114415OooO);
                                o0000o4.f114438OooOo0o = c32029OooOOoo;
                                z = false;
                            } else {
                                o0000O o0000o5 = o0000O.this;
                                OooOo oooOo = o0000o5.f114429OooOOOO;
                                if (!oooOo.f114470OooO0oo) {
                                    oooOo = new OooOo(oooOo.f114464OooO0O0, oooOo.f114465OooO0OO, oooOo.f114466OooO0Oo, oooOo.f114467OooO0o, oooOo.f114469OooO0oO, oooOo.f114463OooO00o, true, oooOo.f114468OooO0o0);
                                }
                                o0000o5.f114429OooOOOO = oooOo;
                                o0000O.this.f114438OooOo0o = null;
                                z = false;
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (z) {
                    C32033OooOoO c32033OooOoO = this.f114476OooOo0o;
                    c32033OooOoO.f114481OooO00o.OooOOO(new C32034OooOoO0(c32033OooOoO));
                    this.f114476OooOo0o.f114481OooO00o.OooOO0o(oO0OOo0o.o00Oo0.f119716OooO0o.OooO0oo("Unneeded hedging"));
                } else {
                    if (c32029OooOOoo != null) {
                        o0000O o0000o6 = o0000O.this;
                        c32029OooOOoo.OooO00o(o0000o6.f114419OooO0Oo.schedule(new OooOo00(c32029OooOOoo), o0000o6.f114422OooO0oO.f114239OooO0O0, TimeUnit.NANOSECONDS));
                    }
                    o0000O.this.OooOOo(this.f114476OooOo0o);
                }
            }
        }

        public OooOo00(C32029OooOOoo c32029OooOOoo) {
            this.f114474OooOo0o = c32029OooOOoo;
        }

        @Override // java.lang.Runnable
        public final void run() {
            o0000O o0000o2 = o0000O.this;
            C32033OooOoO c32033OooOoOOooOOOo = o0000o2.OooOOOo(o0000o2.f114429OooOOOO.f114468OooO0o0, false);
            if (c32033OooOoOOooOOOo == null) {
                return;
            }
            o0000O.this.f114417OooO0O0.execute(new OooO00o(c32033OooOoOOooOOOo));
        }
    }

    /* JADX INFO: renamed from: oO000Oo.o0000O$OooOo0O, reason: case insensitive filesystem */
    public static final class C32031OooOo0O {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final oO0OOo0o.o00Oo0 f114477OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final InterfaceC31948OooOOoo.OooO00o f114478OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final C33094OoooO f114479OooO0OO;

        public C32031OooOo0O(oO0OOo0o.o00Oo0 o00oo02, InterfaceC31948OooOOoo.OooO00o oooO00o, C33094OoooO c33094OoooO) {
            this.f114477OooO00o = o00oo02;
            this.f114478OooO0O0 = oooO00o;
            this.f114479OooO0OO = c33094OoooO;
        }
    }

    /* JADX INFO: renamed from: oO000Oo.o0000O$OooOo0o, reason: case insensitive filesystem */
    public class C32032OooOo0o implements InterfaceC32026OooOOOo {
        public C32032OooOo0o() {
        }

        @Override // oO000Oo.o0000O.InterfaceC32026OooOOOo
        public final void OooO00o(C32033OooOoO c32033OooOoO) {
            c32033OooOoO.f114481OooO00o.OooOOO(new C32034OooOoO0(c32033OooOoO));
        }
    }

    /* JADX INFO: renamed from: oO000Oo.o0000O$OooOoO, reason: case insensitive filesystem */
    public static final class C32033OooOoO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public InterfaceC31946OooOOo f114481OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public boolean f114482OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public boolean f114483OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int f114484OooO0Oo;

        public C32033OooOoO(int i) {
            this.f114484OooO0Oo = i;
        }
    }

    /* JADX INFO: renamed from: oO000Oo.o0000O$OooOoO0, reason: case insensitive filesystem */
    public final class C32034OooOoO0 implements InterfaceC31948OooOOoo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final C32033OooOoO f114485OooO00o;

        /* JADX INFO: renamed from: oO000Oo.o0000O$OooOoO0$OooO00o */
        public class OooO00o implements Runnable {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ C33094OoooO f114488OooOo0o;

            public OooO00o(C33094OoooO c33094OoooO) {
                this.f114488OooOo0o = c33094OoooO;
            }

            @Override // java.lang.Runnable
            public final void run() {
                o0000O.this.f114435OooOo0.OooO0O0(this.f114488OooOo0o);
            }
        }

        /* JADX INFO: renamed from: oO000Oo.o0000O$OooOoO0$OooO0O0 */
        public class OooO0O0 implements Runnable {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ C32033OooOoO f114490OooOo0o;

            /* JADX INFO: renamed from: oO000Oo.o0000O$OooOoO0$OooO0O0$OooO00o */
            public class OooO00o implements Runnable {
                public OooO00o() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    OooO0O0 oooO0O0 = OooO0O0.this;
                    o0000O o0000o2 = o0000O.this;
                    C32033OooOoO c32033OooOoO = oooO0O0.f114490OooOo0o;
                    C33094OoooO.OooO0O0 oooO0O02 = o0000O.f114411OooOoOO;
                    o0000o2.OooOOo(c32033OooOoO);
                }
            }

            public OooO0O0(C32033OooOoO c32033OooOoO) {
                this.f114490OooOo0o = c32033OooOoO;
            }

            @Override // java.lang.Runnable
            public final void run() {
                o0000O.this.f114417OooO0O0.execute(new OooO00o());
            }
        }

        /* JADX INFO: renamed from: oO000Oo.o0000O$OooOoO0$OooO0OO */
        public class OooO0OO implements Runnable {
            public OooO0OO() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                o0000O o0000o2 = o0000O.this;
                o0000o2.f114439OooOoO = true;
                InterfaceC31948OooOOoo interfaceC31948OooOOoo = o0000o2.f114435OooOo0;
                C32031OooOo0O c32031OooOo0O = o0000o2.f114433OooOOoo;
                interfaceC31948OooOOoo.OooO0OO(c32031OooOo0O.f114477OooO00o, c32031OooOo0O.f114478OooO0O0, c32031OooOo0O.f114479OooO0OO);
            }
        }

        /* JADX INFO: renamed from: oO000Oo.o0000O$OooOoO0$OooO0Oo, reason: case insensitive filesystem */
        public class RunnableC32035OooO0Oo implements Runnable {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ C32033OooOoO f114494OooOo0o;

            public RunnableC32035OooO0Oo(C32033OooOoO c32033OooOoO) {
                this.f114494OooOo0o = c32033OooOoO;
            }

            @Override // java.lang.Runnable
            public final void run() {
                o0000O o0000o2 = o0000O.this;
                C33094OoooO.OooO0O0 oooO0O0 = o0000O.f114411OooOoOO;
                o0000o2.OooOOo(this.f114494OooOo0o);
            }
        }

        /* JADX INFO: renamed from: oO000Oo.o0000O$OooOoO0$OooO0o */
        public class OooO0o implements Runnable {
            public OooO0o() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                o0000O o0000o2 = o0000O.this;
                if (o0000o2.f114439OooOoO) {
                    return;
                }
                o0000o2.f114435OooOo0.onReady();
            }
        }

        /* JADX INFO: renamed from: oO000Oo.o0000O$OooOoO0$OooO0o0, reason: case insensitive filesystem */
        public class RunnableC32036OooO0o0 implements Runnable {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ InterfaceC32049o0000oOO.OooO00o f114497OooOo0o;

            public RunnableC32036OooO0o0(InterfaceC32049o0000oOO.OooO00o oooO00o) {
                this.f114497OooOo0o = oooO00o;
            }

            @Override // java.lang.Runnable
            public final void run() {
                o0000O.this.f114435OooOo0.OooO00o(this.f114497OooOo0o);
            }
        }

        public C32034OooOoO0(C32033OooOoO c32033OooOoO) {
            this.f114485OooO00o = c32033OooOoO;
        }

        @Override // oO000Oo.InterfaceC32049o0000oOO
        public final void OooO00o(InterfaceC32049o0000oOO.OooO00o oooO00o) {
            OooOo oooOo = o0000O.this.f114429OooOOOO;
            Preconditions.checkState(oooOo.f114467OooO0o != null, "Headers should be received prior to messages.");
            if (oooOo.f114467OooO0o == this.f114485OooO00o) {
                o0000O.this.f114418OooO0OO.execute(new RunnableC32036OooO0o0(oooO00o));
                return;
            }
            Logger logger = C31989OoooO0O.f114214OooO00o;
            while (true) {
                InputStream next = oooO00o.next();
                if (next == null) {
                    return;
                } else {
                    C31989OoooO0O.OooO0O0(next);
                }
            }
        }

        @Override // oO000Oo.InterfaceC31948OooOOoo
        public final void OooO0O0(C33094OoooO c33094OoooO) {
            AtomicInteger atomicInteger;
            int i;
            int i2;
            if (this.f114485OooO00o.f114484OooO0Oo > 0) {
                C33094OoooO.OooO0O0 oooO0O0 = o0000O.f114411OooOoOO;
                c33094OoooO.OooO00o(oooO0O0);
                c33094OoooO.OooO0o(oooO0O0, String.valueOf(this.f114485OooO00o.f114484OooO0Oo));
            }
            o0000O o0000o2 = o0000O.this;
            C32033OooOoO c32033OooOoO = this.f114485OooO00o;
            C33094OoooO.OooO0O0 oooO0O02 = o0000O.f114411OooOoOO;
            o0000OO0 o0000oo0OooOOOO = o0000o2.OooOOOO(c32033OooOoO);
            if (o0000oo0OooOOOO != null) {
                o0000o2.f114417OooO0O0.execute(o0000oo0OooOOOO);
            }
            if (o0000O.this.f114429OooOOOO.f114467OooO0o == this.f114485OooO00o) {
                C32037OooOoOO c32037OooOoOO = o0000O.this.f114428OooOOO0;
                if (c32037OooOoOO != null) {
                    do {
                        atomicInteger = c32037OooOoOO.f114501OooO0Oo;
                        i = atomicInteger.get();
                        i2 = c32037OooOoOO.f114498OooO00o;
                        if (i == i2) {
                            break;
                        }
                    } while (!atomicInteger.compareAndSet(i, Math.min(c32037OooOoOO.f114500OooO0OO + i, i2)));
                }
                o0000O.this.f114418OooO0OO.execute(new OooO00o(c33094OoooO));
            }
        }

        @Override // oO000Oo.InterfaceC31948OooOOoo
        public final void OooO0OO(oO0OOo0o.o00Oo0 o00oo02, InterfaceC31948OooOOoo.OooO00o oooO00o, C33094OoooO c33094OoooO) {
            boolean z;
            C32030OooOo0 c32030OooOo0;
            o0000O o0000o2;
            C32029OooOOoo c32029OooOOoo;
            synchronized (o0000O.this.f114415OooO) {
                o0000O o0000o3 = o0000O.this;
                o0000o3.f114429OooOOOO = o0000o3.f114429OooOOOO.OooO0Oo(this.f114485OooO00o);
                ((ArrayList) o0000O.this.f114427OooOOO.f114251OooO0O0).add(String.valueOf(o00oo02.f119728OooO00o));
            }
            if (o0000O.this.f114431OooOOo.decrementAndGet() == Integer.MIN_VALUE) {
                o0000O.this.f114418OooO0OO.execute(new OooO0OO());
                return;
            }
            C32033OooOoO c32033OooOoO = this.f114485OooO00o;
            if (c32033OooOoO.f114483OooO0OO) {
                o0000O o0000o4 = o0000O.this;
                o0000OO0 o0000oo0OooOOOO = o0000o4.OooOOOO(c32033OooOoO);
                if (o0000oo0OooOOOO != null) {
                    o0000o4.f114417OooO0O0.execute(o0000oo0OooOOOO);
                }
                if (o0000O.this.f114429OooOOOO.f114467OooO0o == this.f114485OooO00o) {
                    o0000O.this.OooOo(o00oo02, oooO00o, c33094OoooO);
                    return;
                }
                return;
            }
            InterfaceC31948OooOOoo.OooO00o oooO00o2 = InterfaceC31948OooOOoo.OooO00o.f114035OooOoO;
            if (oooO00o == oooO00o2 && o0000O.this.f114432OooOOo0.incrementAndGet() > 1000) {
                o0000O o0000o5 = o0000O.this;
                o0000OO0 o0000oo0OooOOOO2 = o0000o5.OooOOOO(this.f114485OooO00o);
                if (o0000oo0OooOOOO2 != null) {
                    o0000o5.f114417OooO0O0.execute(o0000oo0OooOOOO2);
                }
                if (o0000O.this.f114429OooOOOO.f114467OooO0o == this.f114485OooO00o) {
                    o0000O.this.OooOo(oO0OOo0o.o00Oo0.f119723OooOOO.OooO0oo("Too many transparent retries. Might be a bug in gRPC").OooO0oO(o00oo02.OooO00o()), oooO00o, c33094OoooO);
                    return;
                }
                return;
            }
            if (o0000O.this.f114429OooOOOO.f114467OooO0o == null) {
                if (oooO00o == oooO00o2 || (oooO00o == InterfaceC31948OooOOoo.OooO00o.f114033OooOo && o0000O.this.f114430OooOOOo.compareAndSet(false, true))) {
                    C32033OooOoO c32033OooOoOOooOOOo = o0000O.this.OooOOOo(this.f114485OooO00o.f114484OooO0Oo, true);
                    if (c32033OooOoOOooOOOo == null) {
                        return;
                    }
                    o0000O o0000o6 = o0000O.this;
                    if (o0000o6.f114423OooO0oo) {
                        synchronized (o0000o6.f114415OooO) {
                            o0000O o0000o7 = o0000O.this;
                            o0000o7.f114429OooOOOO = o0000o7.f114429OooOOOO.OooO0OO(this.f114485OooO00o, c32033OooOoOOooOOOo);
                        }
                    }
                    o0000O.this.f114417OooO0O0.execute(new RunnableC32035OooO0Oo(c32033OooOoOOooOOOo));
                    return;
                }
                if (oooO00o == InterfaceC31948OooOOoo.OooO00o.f114036OooOoO0) {
                    o0000O o0000o8 = o0000O.this;
                    if (o0000o8.f114423OooO0oo) {
                        o0000o8.OooOOoo();
                    }
                } else {
                    o0000O.this.f114430OooOOOo.set(true);
                    o0000O o0000o9 = o0000O.this;
                    Integer numValueOf = null;
                    if (o0000o9.f114423OooO0oo) {
                        String str = (String) c33094OoooO.OooO0OO(o0000O.f114413OooOoo0);
                        if (str != null) {
                            try {
                                numValueOf = Integer.valueOf(str);
                            } catch (NumberFormatException unused) {
                                numValueOf = -1;
                            }
                        }
                        o0000O o0000o10 = o0000O.this;
                        boolean zContains = o0000o10.f114422OooO0oO.f114240OooO0OO.contains(o00oo02.f119728OooO00o);
                        boolean z2 = (o0000o10.f114428OooOOO0 == null || (!zContains && (numValueOf == null || numValueOf.intValue() >= 0))) ? false : !o0000o10.f114428OooOOO0.OooO00o();
                        if (zContains && !z2 && !o00oo02.OooO0o() && numValueOf != null && numValueOf.intValue() > 0) {
                            numValueOf = 0;
                        }
                        boolean z3 = zContains && !z2;
                        if (z3) {
                            o0000O.OooO(o0000O.this, numValueOf);
                        }
                        synchronized (o0000O.this.f114415OooO) {
                            try {
                                o0000O o0000o11 = o0000O.this;
                                o0000o11.f114429OooOOOO = o0000o11.f114429OooOOOO.OooO0O0(this.f114485OooO00o);
                                if (z3) {
                                    o0000O o0000o12 = o0000O.this;
                                    if (!o0000o12.OooOo00(o0000o12.f114429OooOOOO)) {
                                        if (!o0000O.this.f114429OooOOOO.f114466OooO0Oo.isEmpty()) {
                                        }
                                    }
                                    return;
                                }
                            } finally {
                            }
                        }
                    } else {
                        o0000OO o0000oo2 = o0000o9.f114420OooO0o;
                        long nanos = 0;
                        if (o0000oo2 == null) {
                            c32030OooOo0 = new C32030OooOo0(0L, false);
                        } else {
                            boolean zContains2 = o0000oo2.f114521OooO0o.contains(o00oo02.f119728OooO00o);
                            String str2 = (String) c33094OoooO.OooO0OO(o0000O.f114413OooOoo0);
                            if (str2 != null) {
                                try {
                                    numValueOf = Integer.valueOf(str2);
                                } catch (NumberFormatException unused2) {
                                    numValueOf = -1;
                                }
                            }
                            boolean z4 = (o0000o9.f114428OooOOO0 == null || (!zContains2 && (numValueOf == null || numValueOf.intValue() >= 0))) ? false : !o0000o9.f114428OooOOO0.OooO00o();
                            if (o0000o9.f114420OooO0o.f114517OooO00o <= this.f114485OooO00o.f114484OooO0Oo + 1 || z4) {
                                z = false;
                                c32030OooOo0 = new C32030OooOo0(nanos, z);
                            } else {
                                if (numValueOf == null) {
                                    if (zContains2) {
                                        nanos = (long) (o0000O.f114414OooOooO.nextDouble() * o0000o9.f114434OooOo);
                                        double d = o0000o9.f114434OooOo;
                                        o0000OO o0000oo3 = o0000o9.f114420OooO0o;
                                        o0000o9.f114434OooOo = Math.min((long) (d * o0000oo3.f114520OooO0Oo), o0000oo3.f114519OooO0OO);
                                        z = true;
                                    }
                                    z = false;
                                } else {
                                    if (numValueOf.intValue() >= 0) {
                                        nanos = TimeUnit.MILLISECONDS.toNanos(numValueOf.intValue());
                                        o0000o9.f114434OooOo = o0000o9.f114420OooO0o.f114518OooO0O0;
                                        z = true;
                                    }
                                    z = false;
                                }
                                c32030OooOo0 = new C32030OooOo0(nanos, z);
                            }
                        }
                        if (c32030OooOo0.f114471OooO00o) {
                            C32033OooOoO c32033OooOoOOooOOOo2 = o0000O.this.OooOOOo(this.f114485OooO00o.f114484OooO0Oo + 1, false);
                            if (c32033OooOoOOooOOOo2 == null) {
                                return;
                            }
                            synchronized (o0000O.this.f114415OooO) {
                                o0000o2 = o0000O.this;
                                c32029OooOOoo = new C32029OooOOoo(o0000o2.f114415OooO);
                                o0000o2.f114437OooOo0O = c32029OooOOoo;
                            }
                            c32029OooOOoo.OooO00o(o0000o2.f114419OooO0Oo.schedule(new OooO0O0(c32033OooOoOOooOOOo2), c32030OooOo0.f114472OooO0O0, TimeUnit.NANOSECONDS));
                            return;
                        }
                    }
                }
            }
            o0000O o0000o13 = o0000O.this;
            o0000OO0 o0000oo0OooOOOO3 = o0000o13.OooOOOO(this.f114485OooO00o);
            if (o0000oo0OooOOOO3 != null) {
                o0000o13.f114417OooO0O0.execute(o0000oo0OooOOOO3);
            }
            if (o0000O.this.f114429OooOOOO.f114467OooO0o == this.f114485OooO00o) {
                o0000O.this.OooOo(o00oo02, oooO00o, c33094OoooO);
            }
        }

        @Override // oO000Oo.InterfaceC32049o0000oOO
        public final void onReady() {
            o0000O o0000o2 = o0000O.this;
            if (o0000o2.isReady()) {
                o0000o2.f114418OooO0OO.execute(new OooO0o());
            }
        }
    }

    /* JADX INFO: renamed from: oO000Oo.o0000O$OooOoOO, reason: case insensitive filesystem */
    public static final class C32037OooOoOO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f114498OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f114499OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f114500OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final AtomicInteger f114501OooO0Oo;

        public C32037OooOoOO(float f, float f2) {
            AtomicInteger atomicInteger = new AtomicInteger();
            this.f114501OooO0Oo = atomicInteger;
            this.f114500OooO0OO = (int) (f2 * 1000.0f);
            int i = (int) (f * 1000.0f);
            this.f114498OooO00o = i;
            this.f114499OooO0O0 = i / 2;
            atomicInteger.set(i);
        }

        public final boolean OooO00o() {
            AtomicInteger atomicInteger;
            int i;
            int i2;
            do {
                atomicInteger = this.f114501OooO0Oo;
                i = atomicInteger.get();
                if (i == 0) {
                    return false;
                }
                i2 = i - 1000;
            } while (!atomicInteger.compareAndSet(i, Math.max(i2, 0)));
            return i2 > this.f114499OooO0O0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C32037OooOoOO)) {
                return false;
            }
            C32037OooOoOO c32037OooOoOO = (C32037OooOoOO) obj;
            return this.f114498OooO00o == c32037OooOoOO.f114498OooO00o && this.f114500OooO0OO == c32037OooOoOO.f114500OooO0OO;
        }

        public final int hashCode() {
            return Objects.hashCode(Integer.valueOf(this.f114498OooO00o), Integer.valueOf(this.f114500OooO0OO));
        }
    }

    static {
        C33094OoooO.OooO00o oooO00o = C33094OoooO.f119652OooO0Oo;
        BitSet bitSet = C33094OoooO.AbstractC33095OooO0Oo.f119657OooO0Oo;
        f114411OooOoOO = new C33094OoooO.OooO0O0("grpc-previous-rpc-attempts", oooO00o);
        f114413OooOoo0 = new C33094OoooO.OooO0O0("grpc-retry-pushback-ms", oooO00o);
        f114412OooOoo = oO0OOo0o.o00Oo0.f119716OooO0o.OooO0oo("Stream thrown away because RetriableStream committed");
        f114414OooOooO = new Random();
    }

    public o0000O(C33101OoooOO0<ReqT, ?> c33101OoooOO0, C33094OoooO c33094OoooO, C32027OooOOo c32027OooOOo, long j, long j2, Executor executor, ScheduledExecutorService scheduledExecutorService, o0000OO o0000oo2, C31994OoooOO0 c31994OoooOO0, C32037OooOoOO c32037OooOoOO) {
        this.f114416OooO00o = c33101OoooOO0;
        this.f114424OooOO0 = c32027OooOOo;
        this.f114425OooOO0O = j;
        this.f114426OooOO0o = j2;
        this.f114417OooO0O0 = executor;
        this.f114419OooO0Oo = scheduledExecutorService;
        this.f114421OooO0o0 = c33094OoooO;
        this.f114420OooO0o = o0000oo2;
        if (o0000oo2 != null) {
            this.f114434OooOo = o0000oo2.f114518OooO0O0;
        }
        this.f114422OooO0oO = c31994OoooOO0;
        Preconditions.checkArgument(o0000oo2 == null || c31994OoooOO0 == null, "Should not provide both retryPolicy and hedgingPolicy");
        this.f114423OooO0oo = c31994OoooOO0 != null;
        this.f114428OooOOO0 = c32037OooOoOO;
    }

    public static void OooO(o0000O o0000o2, Integer num) {
        o0000o2.getClass();
        if (num == null) {
            return;
        }
        if (num.intValue() < 0) {
            o0000o2.OooOOoo();
            return;
        }
        synchronized (o0000o2.f114415OooO) {
            try {
                C32029OooOOoo c32029OooOOoo = o0000o2.f114438OooOo0o;
                if (c32029OooOOoo == null) {
                    return;
                }
                c32029OooOOoo.f114462OooO0OO = true;
                ScheduledFuture scheduledFuture = c32029OooOOoo.f114461OooO0O0;
                C32029OooOOoo c32029OooOOoo2 = new C32029OooOOoo(o0000o2.f114415OooO);
                o0000o2.f114438OooOo0o = c32029OooOOoo2;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                c32029OooOOoo2.OooO00o(o0000o2.f114419OooO0Oo.schedule(new OooOo00(c32029OooOOoo2), num.intValue(), TimeUnit.MILLISECONDS));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // oO000Oo.InterfaceC32048o0000oO0
    public final void OooO00o(int i) {
        OooOo oooOo = this.f114429OooOOOO;
        if (oooOo.f114463OooO00o) {
            oooOo.f114467OooO0o.f114481OooO00o.OooO00o(i);
        } else {
            OooOOo0(new OooOO0O(i));
        }
    }

    @Override // oO000Oo.InterfaceC32048o0000oO0
    public final void OooO0O0(InterfaceC33064OooOO0o interfaceC33064OooOO0o) {
        OooOOo0(new OooO0O0(interfaceC33064OooOO0o));
    }

    @Override // oO000Oo.InterfaceC31946OooOOo
    public final void OooO0OO(int i) {
        OooOOo0(new C32023OooO0oO(i));
    }

    @Override // oO000Oo.InterfaceC31946OooOOo
    public final void OooO0Oo(int i) {
        OooOOo0(new C32024OooO0oo(i));
    }

    @Override // oO000Oo.InterfaceC31946OooOOo
    public final void OooO0o(C33068OooOOo c33068OooOOo) {
        OooOOo0(new OooO0OO(c33068OooOOo));
    }

    @Override // oO000Oo.InterfaceC32048o0000oO0
    public final void OooO0o0(boolean z) {
        OooOOo0(new OooO(z));
    }

    @Override // oO000Oo.InterfaceC32048o0000oO0
    public final void OooO0oO(InputStream inputStream) {
        throw new IllegalStateException("RetriableStream.writeMessage() should not be called directly");
    }

    @Override // oO000Oo.InterfaceC32048o0000oO0
    public final void OooO0oo() {
        OooOOo0(new OooOO0());
    }

    @Override // oO000Oo.InterfaceC31946OooOOo
    public final void OooOO0() {
        OooOOo0(new OooO0o());
    }

    @Override // oO000Oo.InterfaceC31946OooOOo
    public final void OooOO0O(oO0OOo0o.OooOo00 oooOo00) {
        OooOOo0(new C32021OooO0Oo(oooOo00));
    }

    @Override // oO000Oo.InterfaceC31946OooOOo
    public final void OooOO0o(oO0OOo0o.o00Oo0 o00oo02) {
        C32033OooOoO c32033OooOoO;
        C32033OooOoO c32033OooOoO2 = new C32033OooOoO(0);
        c32033OooOoO2.f114481OooO00o = new o00000O0();
        o0000OO0 o0000oo0OooOOOO = OooOOOO(c32033OooOoO2);
        if (o0000oo0OooOOOO != null) {
            synchronized (this.f114415OooO) {
                this.f114429OooOOOO = this.f114429OooOOOO.OooO0o0(c32033OooOoO2);
            }
            o0000oo0OooOOOO.run();
            OooOo(o00oo02, InterfaceC31948OooOOoo.OooO00o.f114034OooOo0o, new C33094OoooO());
            return;
        }
        synchronized (this.f114415OooO) {
            try {
                if (this.f114429OooOOOO.f114465OooO0OO.contains(this.f114429OooOOOO.f114467OooO0o)) {
                    c32033OooOoO = this.f114429OooOOOO.f114467OooO0o;
                } else {
                    this.f114440OooOoO0 = o00oo02;
                    c32033OooOoO = null;
                }
                OooOo oooOo = this.f114429OooOOOO;
                this.f114429OooOOOO = new OooOo(oooOo.f114464OooO0O0, oooOo.f114465OooO0OO, oooOo.f114466OooO0Oo, oooOo.f114467OooO0o, true, oooOo.f114463OooO00o, oooOo.f114470OooO0oo, oooOo.f114468OooO0o0);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c32033OooOoO != null) {
            c32033OooOoO.f114481OooO00o.OooOO0o(o00oo02);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0058  */
    @Override // oO000Oo.InterfaceC31946OooOOo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OooOOO(InterfaceC31948OooOOoo interfaceC31948OooOOoo) {
        C32029OooOOoo c32029OooOOoo;
        this.f114435OooOo0 = interfaceC31948OooOOoo;
        oO0OOo0o.o00Oo0 o00oo0OooOo0o = OooOo0o();
        if (o00oo0OooOo0o != null) {
            OooOO0o(o00oo0OooOo0o);
            return;
        }
        synchronized (this.f114415OooO) {
            this.f114429OooOOOO.f114464OooO0O0.add(new C32032OooOo0o());
        }
        C32033OooOoO c32033OooOoOOooOOOo = OooOOOo(0, false);
        if (c32033OooOoOOooOOOo == null) {
            return;
        }
        if (this.f114423OooO0oo) {
            synchronized (this.f114415OooO) {
                try {
                    this.f114429OooOOOO = this.f114429OooOOOO.OooO00o(c32033OooOoOOooOOOo);
                    if (OooOo00(this.f114429OooOOOO)) {
                        C32037OooOoOO c32037OooOoOO = this.f114428OooOOO0;
                        if (c32037OooOoOO != null) {
                            if (c32037OooOoOO.f114501OooO0Oo.get() > c32037OooOoOO.f114499OooO0O0) {
                            }
                        }
                        c32029OooOOoo = new C32029OooOOoo(this.f114415OooO);
                        this.f114438OooOo0o = c32029OooOOoo;
                    } else {
                        c32029OooOOoo = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (c32029OooOOoo != null) {
                c32029OooOOoo.OooO00o(this.f114419OooO0Oo.schedule(new OooOo00(c32029OooOOoo), this.f114422OooO0oO.f114239OooO0O0, TimeUnit.NANOSECONDS));
            }
        }
        OooOOo(c32033OooOoOOooOOOo);
    }

    @Override // oO000Oo.InterfaceC31946OooOOo
    public final void OooOOO0(C31998OoooOoO c31998OoooOoO) {
        OooOo oooOo;
        synchronized (this.f114415OooO) {
            c31998OoooOoO.OooO0O0(this.f114427OooOOO, "closed");
            oooOo = this.f114429OooOOOO;
        }
        if (oooOo.f114467OooO0o != null) {
            C31998OoooOoO c31998OoooOoO2 = new C31998OoooOoO();
            oooOo.f114467OooO0o.f114481OooO00o.OooOOO0(c31998OoooOoO2);
            c31998OoooOoO.OooO0O0(c31998OoooOoO2, "committed");
            return;
        }
        C31998OoooOoO c31998OoooOoO3 = new C31998OoooOoO();
        for (C32033OooOoO c32033OooOoO : oooOo.f114465OooO0OO) {
            C31998OoooOoO c31998OoooOoO4 = new C31998OoooOoO();
            c32033OooOoO.f114481OooO00o.OooOOO0(c31998OoooOoO4);
            ((ArrayList) c31998OoooOoO3.f114251OooO0O0).add(String.valueOf(c31998OoooOoO4));
        }
        c31998OoooOoO.OooO0O0(c31998OoooOoO3, "open");
    }

    public final o0000OO0 OooOOOO(C32033OooOoO c32033OooOoO) {
        Collection collectionSingleton;
        boolean z;
        List<InterfaceC32026OooOOOo> list;
        ScheduledFuture scheduledFuture;
        ScheduledFuture scheduledFuture2;
        synchronized (this.f114415OooO) {
            try {
                if (this.f114429OooOOOO.f114467OooO0o != null) {
                    return null;
                }
                Collection<C32033OooOoO> collection = this.f114429OooOOOO.f114465OooO0OO;
                OooOo oooOo = this.f114429OooOOOO;
                Preconditions.checkState(oooOo.f114467OooO0o == null, "Already committed");
                if (oooOo.f114465OooO0OO.contains(c32033OooOoO)) {
                    collectionSingleton = Collections.singleton(c32033OooOoO);
                    list = null;
                    z = true;
                } else {
                    collectionSingleton = Collections.EMPTY_LIST;
                    z = false;
                    list = oooOo.f114464OooO0O0;
                }
                this.f114429OooOOOO = new OooOo(list, collectionSingleton, oooOo.f114466OooO0Oo, c32033OooOoO, oooOo.f114469OooO0oO, z, oooOo.f114470OooO0oo, oooOo.f114468OooO0o0);
                this.f114424OooOO0.f114456OooO00o.addAndGet(-this.f114436OooOo00);
                C32029OooOOoo c32029OooOOoo = this.f114437OooOo0O;
                if (c32029OooOOoo != null) {
                    c32029OooOOoo.f114462OooO0OO = true;
                    ScheduledFuture scheduledFuture3 = c32029OooOOoo.f114461OooO0O0;
                    this.f114437OooOo0O = null;
                    scheduledFuture = scheduledFuture3;
                } else {
                    scheduledFuture = null;
                }
                C32029OooOOoo c32029OooOOoo2 = this.f114438OooOo0o;
                if (c32029OooOOoo2 != null) {
                    c32029OooOOoo2.f114462OooO0OO = true;
                    ScheduledFuture scheduledFuture4 = c32029OooOOoo2.f114461OooO0O0;
                    this.f114438OooOo0o = null;
                    scheduledFuture2 = scheduledFuture4;
                } else {
                    scheduledFuture2 = null;
                }
                return new o0000OO0(this, collection, c32033OooOoO, scheduledFuture, scheduledFuture2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final C32033OooOoO OooOOOo(int i, boolean z) {
        AtomicInteger atomicInteger;
        int i2;
        do {
            atomicInteger = this.f114431OooOOo;
            i2 = atomicInteger.get();
            if (i2 < 0) {
                return null;
            }
        } while (!atomicInteger.compareAndSet(i2, i2 + 1));
        C32033OooOoO c32033OooOoO = new C32033OooOoO(i);
        OooOOO0 oooOOO0 = new OooOOO0(new C32028OooOOo0(c32033OooOoO));
        C33094OoooO c33094OoooO = new C33094OoooO();
        c33094OoooO.OooO0Oo(this.f114421OooO0o0);
        if (i > 0) {
            c33094OoooO.OooO0o(f114411OooOoOO, String.valueOf(i));
        }
        c32033OooOoO.f114481OooO00o = OooOo0(c33094OoooO, oooOOO0, i, z);
        return c32033OooOoO;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0036, code lost:
    
        if (r1 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0038, code lost:
    
        r8.f114418OooO0OO.execute(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003e, code lost:
    
        if (r2 != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0040, code lost:
    
        r9.f114481OooO00o.OooOOO(new oO000Oo.o0000O.C32034OooOoO0(r8, r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004a, code lost:
    
        r0 = r9.f114481OooO00o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0050, code lost:
    
        if (r8.f114429OooOOOO.f114467OooO0o != r9) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0052, code lost:
    
        r9 = r8.f114440OooOoO0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0055, code lost:
    
        r9 = oO000Oo.o0000O.f114412OooOoo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0057, code lost:
    
        r0.OooOO0o(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0088, code lost:
    
        r0 = r3.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0090, code lost:
    
        if (r0.hasNext() == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0092, code lost:
    
        r4 = (oO000Oo.o0000O.InterfaceC32026OooOOOo) r0.next();
        r4.OooO00o(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x009d, code lost:
    
        if ((r4 instanceof oO000Oo.o0000O.C32032OooOo0o) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x009f, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a0, code lost:
    
        r4 = r8.f114429OooOOOO;
        r5 = r4.f114467OooO0o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a4, code lost:
    
        if (r5 == null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a6, code lost:
    
        if (r5 == r9) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ab, code lost:
    
        if (r4.f114469OooO0oO == false) goto L67;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OooOOo(C32033OooOoO c32033OooOoO) {
        int iMin;
        int i = 0;
        OooOOO oooOOO = null;
        boolean z = false;
        ArrayList arrayList = null;
        while (true) {
            synchronized (this.f114415OooO) {
                try {
                    OooOo oooOo = this.f114429OooOOOO;
                    C32033OooOoO c32033OooOoO2 = oooOo.f114467OooO0o;
                    if (c32033OooOoO2 == null || c32033OooOoO2 == c32033OooOoO) {
                        if (!oooOo.f114469OooO0oO) {
                            if (i == oooOo.f114464OooO0O0.size()) {
                                this.f114429OooOOOO = oooOo.OooO0o0(c32033OooOoO);
                                if (!isReady()) {
                                    return;
                                } else {
                                    oooOOO = new OooOOO();
                                }
                            } else {
                                if (c32033OooOoO.f114482OooO0O0) {
                                    return;
                                }
                                iMin = Math.min(i + 128, oooOo.f114464OooO0O0.size());
                                if (arrayList == null) {
                                    arrayList = new ArrayList(oooOo.f114464OooO0O0.subList(i, iMin));
                                } else {
                                    arrayList.clear();
                                    arrayList.addAll(oooOo.f114464OooO0O0.subList(i, iMin));
                                }
                            }
                        }
                    }
                } finally {
                }
            }
            i = iMin;
        }
    }

    public final void OooOOo0(InterfaceC32026OooOOOo interfaceC32026OooOOOo) {
        Collection<C32033OooOoO> collection;
        synchronized (this.f114415OooO) {
            try {
                if (!this.f114429OooOOOO.f114463OooO00o) {
                    this.f114429OooOOOO.f114464OooO0O0.add(interfaceC32026OooOOOo);
                }
                collection = this.f114429OooOOOO.f114465OooO0OO;
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator<C32033OooOoO> it = collection.iterator();
        while (it.hasNext()) {
            interfaceC32026OooOOOo.OooO00o(it.next());
        }
    }

    public final void OooOOoo() {
        ScheduledFuture scheduledFuture;
        synchronized (this.f114415OooO) {
            try {
                C32029OooOOoo c32029OooOOoo = this.f114438OooOo0o;
                scheduledFuture = null;
                if (c32029OooOOoo != null) {
                    c32029OooOOoo.f114462OooO0OO = true;
                    ScheduledFuture scheduledFuture2 = c32029OooOOoo.f114461OooO0O0;
                    this.f114438OooOo0o = null;
                    scheduledFuture = scheduledFuture2;
                }
                OooOo oooOo = this.f114429OooOOOO;
                if (!oooOo.f114470OooO0oo) {
                    oooOo = new OooOo(oooOo.f114464OooO0O0, oooOo.f114465OooO0OO, oooOo.f114466OooO0Oo, oooOo.f114467OooO0o, oooOo.f114469OooO0oO, oooOo.f114463OooO00o, true, oooOo.f114468OooO0o0);
                }
                this.f114429OooOOOO = oooOo;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    public final void OooOo(oO0OOo0o.o00Oo0 o00oo02, InterfaceC31948OooOOoo.OooO00o oooO00o, C33094OoooO c33094OoooO) {
        this.f114433OooOOoo = new C32031OooOo0O(o00oo02, oooO00o, c33094OoooO);
        if (this.f114431OooOOo.addAndGet(Integer.MIN_VALUE) == Integer.MIN_VALUE) {
            this.f114418OooO0OO.execute(new OooOOOO(o00oo02, oooO00o, c33094OoooO));
        }
    }

    public abstract InterfaceC31946OooOOo OooOo0(C33094OoooO c33094OoooO, OooOOO0 oooOOO0, int i, boolean z);

    public final boolean OooOo00(OooOo oooOo) {
        if (oooOo.f114467OooO0o == null) {
            return oooOo.f114468OooO0o0 < this.f114422OooO0oO.f114238OooO00o && !oooOo.f114470OooO0oo;
        }
        return false;
    }

    public abstract void OooOo0O();

    public abstract oO0OOo0o.o00Oo0 OooOo0o();

    public final void OooOoO0(ReqT reqt) {
        OooOo oooOo = this.f114429OooOOOO;
        if (oooOo.f114463OooO00o) {
            oooOo.f114467OooO0o.f114481OooO00o.OooO0oO(this.f114416OooO00o.f119669OooO0Oo.OooO00o(reqt));
        } else {
            OooOOo0(new C32025OooOO0o(reqt));
        }
    }

    @Override // oO000Oo.InterfaceC32048o0000oO0
    public final void flush() {
        OooOo oooOo = this.f114429OooOOOO;
        if (oooOo.f114463OooO00o) {
            oooOo.f114467OooO0o.f114481OooO00o.flush();
        } else {
            OooOOo0(new C32022OooO0o0());
        }
    }

    @Override // oO000Oo.InterfaceC31946OooOOo
    public final C33058OooO00o getAttributes() {
        return this.f114429OooOOOO.f114467OooO0o != null ? this.f114429OooOOOO.f114467OooO0o.f114481OooO00o.getAttributes() : C33058OooO00o.f119518OooO0O0;
    }

    @Override // oO000Oo.InterfaceC32048o0000oO0
    public final boolean isReady() {
        Iterator<C32033OooOoO> it = this.f114429OooOOOO.f114465OooO0OO.iterator();
        while (it.hasNext()) {
            if (it.next().f114481OooO00o.isReady()) {
                return true;
            }
        }
        return false;
    }
}
