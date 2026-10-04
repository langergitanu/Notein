package oO000Oo;

import OooOoo.C20593OooO0Oo;
import Oooo0OO.AbstractC20960OooOOOO;
import androidx.core.app.NotificationCompat;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.base.Stopwatch;
import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableMap;
import com.google.firebase.firestore.remote.RunnableC22702OooOOo0;
import com.orion.notein.data.service.dto.MaterialPurchaseStatusResponse;
import java.lang.Thread;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import o00O0oo0.C24961OooO00o;
import oO000Oo.C31939OooO0oo;
import oO000Oo.C31939OooO0oo.OooO00o;
import oO000Oo.C31943OooOOOo;
import oO000Oo.C31989OoooO0O;
import oO000Oo.C31999OoooOoo;
import oO000Oo.C32041o0000OoO;
import oO000Oo.InterfaceC32050o0000oOo;
import oO000Oo.Oooo0;
import oO000Oo.o000000;
import oO000Oo.o0000O;
import oO000Oo.o0000OOO;
import oO000Oo.o0000OOO.OooO00o;
import oO000Oo.o000OO.OooO0O0;
import oO000Oo.o000OOo;
import oO0OOo0o.AbstractC33060OooO0Oo;
import oO0OOo0o.AbstractC33061OooO0o0;
import oO0OOo0o.AbstractC33075OooOoO0;
import oO0OOo0o.AbstractC33080OooOooo;
import oO0OOo0o.AbstractC33086Oooo0o;
import oO0OOo0o.AbstractC33087Oooo0o0;
import oO0OOo0o.AbstractC33093Oooo0oo;
import oO0OOo0o.AbstractC33102OoooOOO;
import oO0OOo0o.C33058OooO00o;
import oO0OOo0o.C33063OooO0oo;
import oO0OOo0o.C33065OooOOOo;
import oO0OOo0o.C33068OooOOo;
import oO0OOo0o.C33072OooOo0O;
import oO0OOo0o.C33077OooOoo;
import oO0OOo0o.C33079OooOooO;
import oO0OOo0o.C33082Oooo00O;
import oO0OOo0o.C33094OoooO;
import oO0OOo0o.C33101OoooOO0;
import oO0OOo0o.C33103OoooOOo;
import oO0OOo0o.ExecutorC33121o00ooo;
import oO0OOo0o.InterfaceC33062OooO0oO;
import oO0OOo0o.InterfaceC33110OooooOO;
import oO0OOo0o.OooO0OO;
import oO0OOo0o.OooO0o;
import oO0OOo0o.o000oOoO;

/* JADX INFO: loaded from: classes10.dex */
public final class o00Ooo extends AbstractC33093Oooo0oo implements oO0OOo0o.Oooo000<Object> {

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public static final oO0OOo0o.o00Oo0 f114607Oooooo;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public static final oO0OOo0o.o00Oo0 f114609OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public static final oO0OOo0o.o00Oo0 f114610Ooooooo;

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    public static final C32055OooO0Oo f114611o00O0O;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public static final o000OOo f114612o0OoOo0;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public static final OooO00o f114613ooOO;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final Executor f114614OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C33082Oooo00O f114615OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f114616OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C33103OoooOOo f114617OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o000oOoO.OooO00o f114618OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final InterfaceC31949OooOo0 f114619OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final C31939OooO0oo f114620OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final oO000Oo.OooOO0O f114621OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final OooOOOO f114622OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final o00000O<? extends Executor> f114623OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final o00000O<? extends Executor> f114624OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final ExecutorC32058OooO0oo f114625OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final InterfaceC32050o0000oOo f114626OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final ExecutorC32058OooO0oo f114627OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final ExecutorC33121o00ooo f114628OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final oO0OOo0o.OooOo00 f114629OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final Supplier<Stopwatch> f114630OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final oO0OOo0o.OooOOO0 f114631OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final long f114632OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public AbstractC31975Oooo f114633OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final Oooo0.OooO00o f114634OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final OooOo f114635OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public final AbstractC33060OooO0Oo f114636OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final ArrayList f114637OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public OooOO0O f114638OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public boolean f114639OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public volatile AbstractC33087Oooo0o0.OooOO0 f114640OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final HashSet f114641OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public boolean f114642OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public LinkedHashSet f114643OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final Object f114644OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final oO000Oo.OooOOOO f114645Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public final AtomicBoolean f114646Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final HashSet f114647Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final C31965OooOooO f114648Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public final C32063OooOOo0 f114649Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public boolean f114650Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public boolean f114651Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final CountDownLatch f114652Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public volatile boolean f114653Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final C24961OooO00o f114654Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final C31942OooOO0o f114655Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public OooOOO f114656OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final C33079OooOooO f114657OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final oO000Oo.OooOOO0 f114658OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final OooOOO0 f114659OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public o000OOo f114660OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public final boolean f114661OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public final o0000O.C32027OooOOo f114662OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public final long f114663OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public final long f114664OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public final boolean f114665OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public final C33068OooOOo.OooO00o f114666Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public final OooO f114667Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public final C32056OooO0o0 f114668OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public final o000OO f114669OooooOO;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public boolean f114670o000oOoO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public static final Logger f114606OooooOo = Logger.getLogger(o00Ooo.class.getName());

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public static final Pattern f114608Oooooo0 = Pattern.compile("[a-zA-Z][a-zA-Z0-9+.-]*:/.*");

    public final class OooO extends AbstractC20960OooOOOO {
        public OooO() {
            super(3);
        }

        @Override // Oooo0OO.AbstractC20960OooOOOO
        public final void o000000() {
            o00Ooo o00ooo2 = o00Ooo.this;
            if (o00ooo2.f114646Oooo0.get()) {
                return;
            }
            o00ooo2.OooOo00();
        }

        @Override // Oooo0OO.AbstractC20960OooOOOO
        public final void o000OOo() {
            o00Ooo.this.OooOOo();
        }
    }

    public class OooO00o extends AbstractC33080OooOooo {
        @Override // oO0OOo0o.AbstractC33080OooOooo
        public final AbstractC33080OooOooo.OooO00o OooO00o() {
            throw new IllegalStateException("Resolution is pending");
        }
    }

    public final class OooO0O0 implements Runnable {
        public OooO0O0() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            o00Ooo o00ooo2 = o00Ooo.this;
            if (o00ooo2.f114646Oooo0.get() || o00ooo2.f114638OooOoO == null) {
                return;
            }
            o00ooo2.OooOOo0(false);
            o00Ooo.OooOOO(o00ooo2);
        }
    }

    public class OooO0OO implements Thread.UncaughtExceptionHandler {
        public OooO0OO() {
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public final void uncaughtException(Thread thread, Throwable th) {
            Logger logger = o00Ooo.f114606OooooOo;
            Level level = Level.SEVERE;
            StringBuilder sb = new StringBuilder("[");
            o00Ooo o00ooo2 = o00Ooo.this;
            sb.append(o00ooo2.f114615OooO00o);
            sb.append("] Uncaught exception in the SynchronizationContext. Panic!");
            logger.log(level, sb.toString(), th);
            if (o00ooo2.f114642OooOoo0) {
                return;
            }
            o00ooo2.f114642OooOoo0 = true;
            o00ooo2.OooOOo0(true);
            o00ooo2.OooOo0O(false);
            oo000o oo000oVar = new oo000o(th);
            o00ooo2.f114640OooOoOO = oo000oVar;
            o00ooo2.f114648Oooo00O.OooO0oo(oo000oVar);
            o00ooo2.f114659OoooO0O.OooO(null);
            o00ooo2.f114658OoooO00.OooO00o(AbstractC33061OooO0o0.OooO00o.f119545OooOoO, "PANIC! Entering TRANSIENT_FAILURE");
            o00ooo2.f114635OooOo00.OooO00o(oO0OOo0o.OooOOO.f119555OooOoO0);
        }
    }

    /* JADX INFO: renamed from: oO000Oo.o00Ooo$OooO0Oo, reason: case insensitive filesystem */
    public class C32055OooO0Oo extends oO0OOo0o.OooO0o<Object, Object> {
        @Override // oO0OOo0o.OooO0o
        public final void cancel(String str, Throwable th) {
        }

        @Override // oO0OOo0o.OooO0o
        public final void halfClose() {
        }

        @Override // oO0OOo0o.OooO0o
        public final boolean isReady() {
            return false;
        }

        @Override // oO0OOo0o.OooO0o
        public final void request(int i) {
        }

        @Override // oO0OOo0o.OooO0o
        public final void sendMessage(Object obj) {
        }

        @Override // oO0OOo0o.OooO0o
        public final void start(OooO0o.OooO00o<Object> oooO00o, C33094OoooO c33094OoooO) {
        }
    }

    public static final class OooO0o<ReqT, RespT> extends AbstractC33075OooOoO0<ReqT, RespT> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final AbstractC33080OooOooo f114674OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final OooOOO0.OooO00o f114675OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final Executor f114676OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final C33101OoooOO0<ReqT, RespT> f114677OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public oO0OOo0o.OooO0OO f114678OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final C33065OooOOOo f114679OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public oO0OOo0o.OooO0o<ReqT, RespT> f114680OooO0oO;

        public OooO0o(AbstractC33080OooOooo abstractC33080OooOooo, OooOOO0.OooO00o oooO00o, Executor executor, C33101OoooOO0 c33101OoooOO0, oO0OOo0o.OooO0OO oooO0OO) {
            this.f114674OooO00o = abstractC33080OooOooo;
            this.f114675OooO0O0 = oooO00o;
            this.f114677OooO0Oo = c33101OoooOO0;
            Executor executor2 = oooO0OO.f119526OooO0O0;
            executor = executor2 != null ? executor2 : executor;
            this.f114676OooO0OO = executor;
            OooO0OO.OooO00o oooO00oOooO0O0 = oO0OOo0o.OooO0OO.OooO0O0(oooO0OO);
            oooO00oOooO0O0.f119535OooO0O0 = executor;
            this.f114678OooO0o = new oO0OOo0o.OooO0OO(oooO00oOooO0O0);
            this.f114679OooO0o0 = C33065OooOOOo.OooOOoo();
        }

        @Override // oO0OOo0o.AbstractC33075OooOoO0, oO0OOo0o.AbstractC33104OoooOo0, oO0OOo0o.OooO0o
        public final void cancel(String str, Throwable th) {
            oO0OOo0o.OooO0o<ReqT, RespT> oooO0o = this.f114680OooO0oO;
            if (oooO0o != null) {
                oooO0o.cancel(str, th);
            }
        }

        @Override // oO0OOo0o.AbstractC33075OooOoO0, oO0OOo0o.AbstractC33104OoooOo0
        public final oO0OOo0o.OooO0o<ReqT, RespT> delegate() {
            return this.f114680OooO0oO;
        }

        @Override // oO0OOo0o.AbstractC33075OooOoO0, oO0OOo0o.OooO0o
        public final void start(OooO0o.OooO00o<RespT> oooO00o, C33094OoooO c33094OoooO) {
            oO0OOo0o.OooO0OO oooO0OO = this.f114678OooO0o;
            C33101OoooOO0<ReqT, RespT> c33101OoooOO0 = this.f114677OooO0Oo;
            AbstractC33080OooOooo.OooO00o OooO00o2 = this.f114674OooO00o.OooO00o();
            oO0OOo0o.o00Oo0 o00oo02 = OooO00o2.f119615OooO00o;
            if (!o00oo02.OooO0o()) {
                this.f114676OooO0OO.execute(new o0OOO0o(this, oooO00o, C31989OoooO0O.OooO0oo(o00oo02)));
                this.f114680OooO0oO = o00Ooo.f114611o00O0O;
                return;
            }
            o000OOo o000ooo2 = (o000OOo) OooO00o2.f119616OooO0O0;
            o000ooo2.getClass();
            o000OOo.OooO00o oooO00o2 = o000ooo2.f114586OooO0O0.get(c33101OoooOO0.f119667OooO0O0);
            if (oooO00o2 == null) {
                oooO00o2 = o000ooo2.f114587OooO0OO.get(c33101OoooOO0.f119668OooO0OO);
            }
            if (oooO00o2 == null) {
                oooO00o2 = o000ooo2.f114585OooO00o;
            }
            if (oooO00o2 != null) {
                this.f114678OooO0o = this.f114678OooO0o.OooO0o0(o000OOo.OooO00o.f114591OooO0oO, oooO00o2);
            }
            oO0OOo0o.OooO0o<ReqT, RespT> oooO0oOooO0oO = this.f114675OooO0O0.OooO0oO(c33101OoooOO0, this.f114678OooO0o);
            this.f114680OooO0oO = oooO0oOooO0oO;
            oooO0oOooO0oO.start(oooO00o, c33094OoooO);
        }
    }

    /* JADX INFO: renamed from: oO000Oo.o00Ooo$OooO0o0, reason: case insensitive filesystem */
    public final class C32056OooO0o0 implements C31943OooOOOo.InterfaceC31944OooO0Oo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public volatile o0000O.C32037OooOoOO f114681OooO00o;

        public C32056OooO0o0() {
        }

        public final OooOo00 OooO00o(o0000O00 o0000o00) {
            AbstractC33087Oooo0o0.OooOO0 oooOO02 = o00Ooo.this.f114640OooOoOO;
            if (o00Ooo.this.f114646Oooo0.get()) {
                return o00Ooo.this.f114648Oooo00O;
            }
            if (oooOO02 == null) {
                o00Ooo.this.f114628OooOOOO.execute(new o0ooOOo(this));
                return o00Ooo.this.f114648Oooo00O;
            }
            OooOo00 oooOo00OooO0o = C31989OoooO0O.OooO0o(oooOO02.OooO00o(o0000o00), Boolean.TRUE.equals(o0000o00.f114508OooO00o.f119531OooO0oO));
            return oooOo00OooO0o != null ? oooOo00OooO0o : o00Ooo.this.f114648Oooo00O;
        }
    }

    /* JADX INFO: renamed from: oO000Oo.o00Ooo$OooO0oO, reason: case insensitive filesystem */
    public final class C32057OooO0oO implements o000000.OooO00o {
        public C32057OooO0oO() {
        }

        @Override // oO000Oo.o000000.OooO00o
        public final void OooO00o() {
        }

        @Override // oO000Oo.o000000.OooO00o
        public final void OooO0O0() {
            o00Ooo o00ooo2 = o00Ooo.this;
            Preconditions.checkState(o00ooo2.f114646Oooo0.get(), "Channel must have been shut down");
            o00ooo2.f114651Oooo0OO = true;
            o00ooo2.OooOo0O(false);
            o00Ooo.OooOOOO(o00ooo2);
            o00Ooo.OooOOOo(o00ooo2);
        }

        @Override // oO000Oo.o000000.OooO00o
        public final void OooO0OO(oO0OOo0o.o00Oo0 o00oo02) {
            Preconditions.checkState(o00Ooo.this.f114646Oooo0.get(), "Channel must have been shut down");
        }

        @Override // oO000Oo.o000000.OooO00o
        public final void OooO0Oo(boolean z) {
            o00Ooo o00ooo2 = o00Ooo.this;
            o00ooo2.f114667Ooooo0o.o00000OO(o00ooo2.f114648Oooo00O, z);
        }

        @Override // oO000Oo.o000000.OooO00o
        public final C33058OooO00o OooO0o0(C33058OooO00o c33058OooO00o) {
            return c33058OooO00o;
        }
    }

    /* JADX INFO: renamed from: oO000Oo.o00Ooo$OooO0oo, reason: case insensitive filesystem */
    public static final class ExecutorC32058OooO0oo implements Executor {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public Executor f114684OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final o00000O<? extends Executor> f114685OooOo0o;

        public ExecutorC32058OooO0oo(o00000O<? extends Executor> o00000o) {
            this.f114685OooOo0o = (o00000O) Preconditions.checkNotNull(o00000o, "executorPool");
        }

        public final synchronized void OooO00o() {
            Executor executor = this.f114684OooOo;
            if (executor != null) {
                this.f114685OooOo0o.OooO0O0(executor);
                this.f114684OooOo = null;
            }
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            Executor executor;
            synchronized (this) {
                try {
                    if (this.f114684OooOo == null) {
                        this.f114684OooOo = (Executor) Preconditions.checkNotNull(this.f114685OooOo0o.OooO00o(), "%s.getObject()", this.f114684OooOo);
                    }
                    executor = this.f114684OooOo;
                } catch (Throwable th) {
                    throw th;
                }
            }
            executor.execute(runnable);
        }
    }

    public class OooOO0 implements Runnable {
        public OooOO0() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            o00Ooo o00ooo2 = o00Ooo.this;
            if (o00ooo2.f114638OooOoO == null) {
                return;
            }
            o00Ooo.OooOOO(o00ooo2);
        }
    }

    public final class OooOO0O extends AbstractC33087Oooo0o0.AbstractC33089OooO0o0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public C31939OooO0oo.OooO00o f114687OooO00o;

        public final class OooO00o implements Runnable {
            public OooO00o() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                o00Ooo o00ooo2 = o00Ooo.this;
                o00ooo2.f114628OooOOOO.OooO0Oo();
                if (o00ooo2.f114639OooOoO0) {
                    o00ooo2.f114633OooOo.OooO0O0();
                }
            }
        }

        public final class OooO0O0 implements Runnable {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ oO0OOo0o.OooOOO f114690OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ AbstractC33087Oooo0o0.OooOO0 f114691OooOo0o;

            public OooO0O0(AbstractC33087Oooo0o0.OooOO0 oooOO02, oO0OOo0o.OooOOO oooOOO) {
                this.f114691OooOo0o = oooOO02;
                this.f114690OooOo = oooOOO;
            }

            @Override // java.lang.Runnable
            public final void run() {
                OooOO0O oooOO0O = OooOO0O.this;
                o00Ooo o00ooo2 = o00Ooo.this;
                if (oooOO0O != o00ooo2.f114638OooOoO) {
                    return;
                }
                AbstractC33087Oooo0o0.OooOO0 oooOO02 = this.f114691OooOo0o;
                o00ooo2.f114640OooOoOO = oooOO02;
                o00ooo2.f114648Oooo00O.OooO0oo(oooOO02);
                oO0OOo0o.OooOOO oooOOO = oO0OOo0o.OooOOO.f119556OooOoOO;
                oO0OOo0o.OooOOO oooOOO2 = this.f114690OooOo;
                if (oooOOO2 != oooOOO) {
                    o00Ooo.this.f114658OoooO00.OooO0O0(AbstractC33061OooO0o0.OooO00o.f119543OooOo, "Entering {0} state with picker: {1}", oooOOO2, oooOO02);
                    o00Ooo.this.f114635OooOo00.OooO00o(oooOOO2);
                }
            }
        }

        public OooOO0O() {
        }

        @Override // oO0OOo0o.AbstractC33087Oooo0o0.AbstractC33089OooO0o0
        public final AbstractC33087Oooo0o0.OooO OooO00o(AbstractC33087Oooo0o0.OooO0O0 oooO0O0) {
            o00Ooo o00ooo2 = o00Ooo.this;
            o00ooo2.f114628OooOOOO.OooO0Oo();
            Preconditions.checkState(!o00ooo2.f114651Oooo0OO, "Channel is being terminated");
            return o00ooo2.new C32062OooOOOo(oooO0O0);
        }

        @Override // oO0OOo0o.AbstractC33087Oooo0o0.AbstractC33089OooO0o0
        public final AbstractC33061OooO0o0 OooO0O0() {
            return o00Ooo.this.f114658OoooO00;
        }

        @Override // oO0OOo0o.AbstractC33087Oooo0o0.AbstractC33089OooO0o0
        public final ScheduledExecutorService OooO0OO() {
            return o00Ooo.this.f114622OooO0oo;
        }

        @Override // oO0OOo0o.AbstractC33087Oooo0o0.AbstractC33089OooO0o0
        public final ExecutorC33121o00ooo OooO0Oo() {
            return o00Ooo.this.f114628OooOOOO;
        }

        @Override // oO0OOo0o.AbstractC33087Oooo0o0.AbstractC33089OooO0o0
        public final void OooO0o(oO0OOo0o.OooOOO oooOOO, AbstractC33087Oooo0o0.OooOO0 oooOO02) {
            o00Ooo o00ooo2 = o00Ooo.this;
            o00ooo2.f114628OooOOOO.OooO0Oo();
            Preconditions.checkNotNull(oooOOO, "newState");
            Preconditions.checkNotNull(oooOO02, "newPicker");
            o00ooo2.f114628OooOOOO.execute(new OooO0O0(oooOO02, oooOOO));
        }

        @Override // oO0OOo0o.AbstractC33087Oooo0o0.AbstractC33089OooO0o0
        public final void OooO0o0() {
            o00Ooo o00ooo2 = o00Ooo.this;
            o00ooo2.f114628OooOOOO.OooO0Oo();
            o00ooo2.f114628OooOOOO.execute(new OooO00o());
        }
    }

    /* JADX INFO: renamed from: oO000Oo.o00Ooo$OooOO0o, reason: case insensitive filesystem */
    public final class C32059OooOO0o extends o000oOoO.AbstractC33116OooO0Oo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooOO0O f114693OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final oO0OOo0o.o000oOoO f114694OooO0O0;

        /* JADX INFO: renamed from: oO000Oo.o00Ooo$OooOO0o$OooO00o */
        public final class OooO00o implements Runnable {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ oO0OOo0o.o00Oo0 f114697OooOo0o;

            public OooO00o(oO0OOo0o.o00Oo0 o00oo02) {
                this.f114697OooOo0o = o00oo02;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C32059OooOO0o c32059OooOO0o = C32059OooOO0o.this;
                c32059OooOO0o.getClass();
                Logger logger = o00Ooo.f114606OooooOo;
                Level level = Level.WARNING;
                o00Ooo o00ooo2 = o00Ooo.this;
                C33082Oooo00O c33082Oooo00O = o00ooo2.f114615OooO00o;
                oO0OOo0o.o00Oo0 o00oo02 = this.f114697OooOo0o;
                logger.log(level, "[{0}] Failed to resolve name. status={1}", new Object[]{c33082Oooo00O, o00oo02});
                OooOOO0 oooOOO0 = o00ooo2.f114659OoooO0O;
                if (oooOOO0.f114704OooO00o.get() == o00Ooo.f114613ooOO) {
                    oooOOO0.OooO(null);
                }
                OooOOO oooOOO = o00ooo2.f114656OoooO;
                OooOOO oooOOO2 = OooOOO.f114703OooOoO0;
                if (oooOOO != oooOOO2) {
                    o00ooo2.f114658OoooO00.OooO0O0(AbstractC33061OooO0o0.OooO00o.f119546OooOoO0, "Failed to resolve name: {0}", o00oo02);
                    o00ooo2.f114656OoooO = oooOOO2;
                }
                OooOO0O oooOO0O = o00ooo2.f114638OooOoO;
                OooOO0O oooOO0O2 = c32059OooOO0o.f114693OooO00o;
                if (oooOO0O2 != oooOO0O) {
                    return;
                }
                oooOO0O2.f114687OooO00o.f113965OooO0O0.OooO0OO(o00oo02);
            }
        }

        /* JADX INFO: renamed from: oO000Oo.o00Ooo$OooOO0o$OooO0O0 */
        public final class OooO0O0 implements Runnable {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ o000oOoO.OooO0o f114699OooOo0o;

            public OooO0O0(o000oOoO.OooO0o oooO0o) {
                this.f114699OooOo0o = oooO0o;
            }

            /* JADX WARN: Removed duplicated region for block: B:80:0x022f  */
            /* JADX WARN: Removed duplicated region for block: B:83:0x026b  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                o000OOo o000ooo2;
                oO0OOo0o.o00Oo0 o00oo0OooO00o;
                AbstractC33086Oooo0o abstractC33086Oooo0o;
                AbstractC33086Oooo0o abstractC33086Oooo0o2;
                Object obj;
                Object obj2;
                C32059OooOO0o c32059OooOO0o = C32059OooOO0o.this;
                o00Ooo o00ooo2 = o00Ooo.this;
                if (o00ooo2.f114633OooOo != c32059OooOO0o.f114694OooO0O0) {
                    return;
                }
                o000oOoO.OooO0o oooO0o = this.f114699OooOo0o;
                List<C33072OooOo0O> list = oooO0o.f119711OooO00o;
                oO000Oo.OooOOO0 oooOOO0 = o00ooo2.f114658OoooO00;
                AbstractC33061OooO0o0.OooO00o oooO00o = AbstractC33061OooO0o0.OooO00o.f119544OooOo0o;
                oooOOO0.OooO0O0(oooO00o, "Resolved address: {0}, config={1}", list, oooO0o.f119712OooO0O0);
                o00Ooo o00ooo3 = o00Ooo.this;
                OooOOO oooOOO = o00ooo3.f114656OoooO;
                OooOOO oooOOO2 = OooOOO.f114700OooOo;
                AbstractC33061OooO0o0.OooO00o oooO00o2 = AbstractC33061OooO0o0.OooO00o.f119543OooOo;
                if (oooOOO != oooOOO2) {
                    o00ooo3.f114658OoooO00.OooO0O0(oooO00o2, "Address resolved: {0}", list);
                    o00Ooo.this.f114656OoooO = oooOOO2;
                }
                o000oOoO.OooO0o oooO0o2 = this.f114699OooOo0o;
                o000oOoO.OooO0O0 oooO0O0 = oooO0o2.f119713OooO0OO;
                o0000OOO.OooO0O0 oooO0O02 = (o0000OOO.OooO0O0) oooO0o2.f119712OooO0O0.f119519OooO00o.get(o0000OOO.f114528OooO0Oo);
                C33058OooO00o c33058OooO00o = this.f114699OooOo0o.f119712OooO0O0;
                C33058OooO00o.OooO0O0<AbstractC33080OooOooo> oooO0O03 = AbstractC33080OooOooo.f119614OooO00o;
                AbstractC33080OooOooo abstractC33080OooOooo = (AbstractC33080OooOooo) c33058OooO00o.f119519OooO00o.get(oooO0O03);
                o000OOo o000ooo3 = (oooO0O0 == null || (obj2 = oooO0O0.f119710OooO0O0) == null) ? null : (o000OOo) obj2;
                oO0OOo0o.o00Oo0 o00oo02 = oooO0O0 != null ? oooO0O0.f119709OooO00o : null;
                o00Ooo o00ooo4 = o00Ooo.this;
                if (o00ooo4.f114661OoooOOO) {
                    if (o000ooo3 != null) {
                        if (abstractC33080OooOooo != null) {
                            o00ooo4.f114659OoooO0O.OooO(abstractC33080OooOooo);
                            if (o000ooo3.OooO0O0() != null) {
                                o00Ooo.this.f114658OoooO00.OooO00o(oooO00o, "Method configs in service config will be discarded due to presence ofconfig-selector");
                            }
                        } else {
                            o00ooo4.f114659OoooO0O.OooO(o000ooo3.OooO0O0());
                        }
                    } else if (o00oo02 == null) {
                        o000ooo3 = o00Ooo.f114612o0OoOo0;
                        o00ooo4.f114659OoooO0O.OooO(null);
                    } else {
                        if (!o00ooo4.f114670o000oOoO) {
                            o00ooo4.f114658OoooO00.OooO00o(oooO00o2, "Fallback to error due to invalid first service config without default config");
                            C32059OooOO0o.this.OooO00o(oooO0O0.f119709OooO00o);
                            if (oooO0O02 != null) {
                                boolean zOooO0o = oooO0O0.f119709OooO00o.OooO0o();
                                o0000OOO o0000ooo = o0000OOO.this;
                                if (!zOooO0o) {
                                    o0000ooo.f114529OooO0O0.OooO00o(o0000ooo.new OooO00o());
                                    return;
                                }
                                oO000Oo.OooOO0 oooOO02 = o0000ooo.f114529OooO0O0;
                                ExecutorC33121o00ooo executorC33121o00ooo = oooOO02.f113971OooO0O0;
                                executorC33121o00ooo.OooO0Oo();
                                executorC33121o00ooo.execute(new oO000Oo.OooO(oooOO02));
                                return;
                            }
                            return;
                        }
                        o000ooo3 = o00ooo4.f114660OoooOO0;
                    }
                    if (!o000ooo3.equals(o00Ooo.this.f114660OoooOO0)) {
                        o00Ooo.this.f114658OoooO00.OooO0O0(oooO00o2, "Service config changed{0}", o000ooo3 == o00Ooo.f114612o0OoOo0 ? " to empty" : "");
                        o00Ooo o00ooo5 = o00Ooo.this;
                        o00ooo5.f114660OoooOO0 = o000ooo3;
                        o00ooo5.f114668OooooO0.f114681OooO00o = o000ooo3.f114588OooO0Oo;
                    }
                    try {
                        o00Ooo.this.f114670o000oOoO = true;
                    } catch (RuntimeException e) {
                        o00Ooo.f114606OooooOo.log(Level.WARNING, "[" + o00Ooo.this.f114615OooO00o + "] Unexpected exception from parsing service config", (Throwable) e);
                    }
                    o000ooo2 = o000ooo3;
                } else {
                    if (o000ooo3 != null) {
                        o00ooo4.f114658OoooO00.OooO00o(oooO00o2, "Service config from name resolver discarded by channel settings");
                    }
                    o00Ooo.this.getClass();
                    o000ooo2 = o00Ooo.f114612o0OoOo0;
                    if (abstractC33080OooOooo != null) {
                        o00Ooo.this.f114658OoooO00.OooO00o(oooO00o2, "Config selector from name resolver discarded by channel settings");
                    }
                    o00Ooo.this.f114659OoooO0O.OooO(o000ooo2.OooO0O0());
                }
                C33058OooO00o c33058OooO00o2 = this.f114699OooOo0o.f119712OooO0O0;
                C32059OooOO0o c32059OooOO0o2 = C32059OooOO0o.this;
                if (c32059OooOO0o2.f114693OooO00o == o00Ooo.this.f114638OooOoO) {
                    c33058OooO00o2.getClass();
                    C33058OooO00o.C20297OooO00o c20297OooO00o = new C33058OooO00o.C20297OooO00o(c33058OooO00o2);
                    if (c33058OooO00o2.f119519OooO00o.containsKey(oooO0O03)) {
                        IdentityHashMap identityHashMap = new IdentityHashMap(c20297OooO00o.f119520OooO00o.f119519OooO00o);
                        identityHashMap.remove(oooO0O03);
                        c20297OooO00o.f119520OooO00o = new C33058OooO00o(identityHashMap);
                    }
                    IdentityHashMap<C33058OooO00o.OooO0O0<?>, Object> identityHashMap2 = c20297OooO00o.f119521OooO0O0;
                    if (identityHashMap2 != null) {
                        identityHashMap2.remove(oooO0O03);
                    }
                    Map<String, ?> map = o000ooo2.f114589OooO0o;
                    if (map != null) {
                        c20297OooO00o.OooO0O0(AbstractC33087Oooo0o0.f119626OooO0O0, map);
                        c20297OooO00o.OooO00o();
                    }
                    C33058OooO00o c33058OooO00oOooO00o = c20297OooO00o.OooO00o();
                    C31939OooO0oo.OooO00o oooO00o3 = C32059OooOO0o.this.f114693OooO00o.f114687OooO00o;
                    C33058OooO00o c33058OooO00o3 = C33058OooO00o.f119518OooO0O0;
                    AbstractC33087Oooo0o0.C33091OooO0oo c33091OooO0oo = new AbstractC33087Oooo0o0.C33091OooO0oo(list, c33058OooO00oOooO00o, o000ooo2.f114590OooO0o0);
                    oooO00o3.getClass();
                    C32041o0000OoO.OooO0O0 oooO0O04 = (C32041o0000OoO.OooO0O0) c33091OooO0oo.f119645OooO0OO;
                    OooOO0O oooOO0O = oooO00o3.f113964OooO00o;
                    if (oooO0O04 == null) {
                        try {
                            C31939OooO0oo c31939OooO0oo = C31939OooO0oo.this;
                            String str = c31939OooO0oo.f113963OooO0O0;
                            AbstractC33086Oooo0o abstractC33086Oooo0oOooO0O0 = c31939OooO0oo.f113962OooO00o.OooO0O0(str);
                            if (abstractC33086Oooo0oOooO0O0 == null) {
                                throw new C31939OooO0oo.C31941OooO0o0("Trying to load '" + str + "' because using default policy, but it's unavailable");
                            }
                            oooO0O04 = new C32041o0000OoO.OooO0O0(abstractC33086Oooo0oOooO0O0, null);
                            abstractC33086Oooo0o = oooO00o3.f113966OooO0OO;
                            abstractC33086Oooo0o2 = oooO0O04.f114550OooO00o;
                            if (abstractC33086Oooo0o != null || !abstractC33086Oooo0o2.OooO0O0().equals(oooO00o3.f113966OooO0OO.OooO0O0())) {
                                oooOO0O.OooO0o(oO0OOo0o.OooOOO.f119553OooOo0o, new C31939OooO0oo.OooO0O0());
                                oooO00o3.f113965OooO0O0.OooO0o();
                                oooO00o3.f113966OooO0OO = abstractC33086Oooo0o2;
                                AbstractC33087Oooo0o0 abstractC33087Oooo0o0 = oooO00o3.f113965OooO0O0;
                                oooO00o3.f113965OooO0O0 = abstractC33086Oooo0o2.OooO00o(oooOO0O);
                                o00Ooo.this.f114658OoooO00.OooO0O0(oooO00o2, "Load balancer changed from {0} to {1}", abstractC33087Oooo0o0.getClass().getSimpleName(), oooO00o3.f113965OooO0O0.getClass().getSimpleName());
                            }
                            obj = oooO0O04.f114551OooO0O0;
                            if (obj != null) {
                                o00Ooo.this.f114658OoooO00.OooO0O0(oooO00o, "Load-balancing config: {0}", obj);
                            }
                            o00oo0OooO00o = oooO00o3.f113965OooO0O0.OooO00o(new AbstractC33087Oooo0o0.C33091OooO0oo(c33091OooO0oo.f119643OooO00o, c33091OooO0oo.f119644OooO0O0, obj));
                        } catch (C31939OooO0oo.C31941OooO0o0 e2) {
                            oooOO0O.OooO0o(oO0OOo0o.OooOOO.f119555OooOoO0, new C31939OooO0oo.OooO0OO(oO0OOo0o.o00Oo0.f119723OooOOO.OooO0oo(e2.getMessage())));
                            oooO00o3.f113965OooO0O0.OooO0o();
                            oooO00o3.f113966OooO0OO = null;
                            oooO00o3.f113965OooO0O0 = new C31939OooO0oo.C31940OooO0Oo();
                            o00oo0OooO00o = oO0OOo0o.o00Oo0.f119717OooO0o0;
                        }
                    } else {
                        abstractC33086Oooo0o = oooO00o3.f113966OooO0OO;
                        abstractC33086Oooo0o2 = oooO0O04.f114550OooO00o;
                        if (abstractC33086Oooo0o != null) {
                            oooOO0O.OooO0o(oO0OOo0o.OooOOO.f119553OooOo0o, new C31939OooO0oo.OooO0O0());
                            oooO00o3.f113965OooO0O0.OooO0o();
                            oooO00o3.f113966OooO0OO = abstractC33086Oooo0o2;
                            AbstractC33087Oooo0o0 abstractC33087Oooo0o02 = oooO00o3.f113965OooO0O0;
                            oooO00o3.f113965OooO0O0 = abstractC33086Oooo0o2.OooO00o(oooOO0O);
                            o00Ooo.this.f114658OoooO00.OooO0O0(oooO00o2, "Load balancer changed from {0} to {1}", abstractC33087Oooo0o02.getClass().getSimpleName(), oooO00o3.f113965OooO0O0.getClass().getSimpleName());
                            obj = oooO0O04.f114551OooO0O0;
                            if (obj != null) {
                            }
                            o00oo0OooO00o = oooO00o3.f113965OooO0O0.OooO00o(new AbstractC33087Oooo0o0.C33091OooO0oo(c33091OooO0oo.f119643OooO00o, c33091OooO0oo.f119644OooO0O0, obj));
                        }
                    }
                    if (oooO0O02 != null) {
                        boolean zOooO0o2 = o00oo0OooO00o.OooO0o();
                        o0000OOO o0000ooo2 = o0000OOO.this;
                        if (!zOooO0o2) {
                            o0000ooo2.f114529OooO0O0.OooO00o(o0000ooo2.new OooO00o());
                            return;
                        }
                        oO000Oo.OooOO0 oooOO03 = o0000ooo2.f114529OooO0O0;
                        ExecutorC33121o00ooo executorC33121o00ooo2 = oooOO03.f113971OooO0O0;
                        executorC33121o00ooo2.OooO0Oo();
                        executorC33121o00ooo2.execute(new oO000Oo.OooO(oooOO03));
                    }
                }
            }
        }

        public C32059OooOO0o(OooOO0O oooOO0O, AbstractC31975Oooo abstractC31975Oooo) {
            this.f114693OooO00o = (OooOO0O) Preconditions.checkNotNull(oooOO0O, "helperImpl");
            this.f114694OooO0O0 = (oO0OOo0o.o000oOoO) Preconditions.checkNotNull(abstractC31975Oooo, "resolver");
        }

        @Override // oO0OOo0o.o000oOoO.InterfaceC33117OooO0o0
        public final void OooO00o(oO0OOo0o.o00Oo0 o00oo02) {
            Preconditions.checkArgument(!o00oo02.OooO0o(), "the error status must not be OK");
            o00Ooo.this.f114628OooOOOO.execute(new OooO00o(o00oo02));
        }

        @Override // oO0OOo0o.o000oOoO.AbstractC33116OooO0Oo
        public final void OooO0O0(o000oOoO.OooO0o oooO0o) {
            o00Ooo.this.f114628OooOOOO.execute(new OooO0O0(oooO0o));
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class OooOOO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final OooOOO f114700OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooOOO f114701OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public static final /* synthetic */ OooOOO[] f114702OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public static final OooOOO f114703OooOoO0;

        static {
            OooOOO oooOOO = new OooOOO("NO_RESOLUTION", 0);
            f114701OooOo0o = oooOOO;
            OooOOO oooOOO2 = new OooOOO(MaterialPurchaseStatusResponse.STATUS_SUCCESS, 1);
            f114700OooOo = oooOOO2;
            OooOOO oooOOO3 = new OooOOO("ERROR", 2);
            f114703OooOoO0 = oooOOO3;
            f114702OooOoO = new OooOOO[]{oooOOO, oooOOO2, oooOOO3};
        }

        public OooOOO() {
            throw null;
        }

        public static OooOOO valueOf(String str) {
            return (OooOOO) Enum.valueOf(OooOOO.class, str);
        }

        public static OooOOO[] values() {
            return (OooOOO[]) f114702OooOoO.clone();
        }
    }

    public class OooOOO0 extends AbstractC33060OooO0Oo {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final String f114705OooO0O0;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final AtomicReference<AbstractC33080OooOooo> f114704OooO00o = new AtomicReference<>(o00Ooo.f114613ooOO);

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final OooO00o f114706OooO0OO = new OooO00o();

        public class OooO00o extends AbstractC33060OooO0Oo {
            public OooO00o() {
            }

            @Override // oO0OOo0o.AbstractC33060OooO0Oo
            public final String OooO00o() {
                return OooOOO0.this.f114705OooO0O0;
            }

            @Override // oO0OOo0o.AbstractC33060OooO0Oo
            public final <RequestT, ResponseT> oO0OOo0o.OooO0o<RequestT, ResponseT> OooO0oO(C33101OoooOO0<RequestT, ResponseT> c33101OoooOO0, oO0OOo0o.OooO0OO oooO0OO) {
                o00Ooo o00ooo2 = o00Ooo.this;
                Logger logger = o00Ooo.f114606OooooOo;
                o00ooo2.getClass();
                Executor executor = oooO0OO.f119526OooO0O0;
                if (executor == null) {
                    executor = o00ooo2.f114614OooO;
                }
                o00Ooo o00ooo3 = o00Ooo.this;
                C31943OooOOOo c31943OooOOOo = new C31943OooOOOo(c33101OoooOO0, executor, oooO0OO, o00ooo3.f114668OooooO0, o00ooo3.f114653Oooo0o0 ? null : o00Ooo.this.f114621OooO0oO.f113976OooOo0o.Oooo0o0(), o00Ooo.this.f114655Oooo0oo);
                o00Ooo.this.getClass();
                o00Ooo o00ooo4 = o00Ooo.this;
                c31943OooOOOo.f114013OooOOo0 = o00ooo4.f114629OooOOOo;
                c31943OooOOOo.f114012OooOOo = o00ooo4.f114631OooOOo0;
                return c31943OooOOOo;
            }
        }

        public class OooO0O0 implements Runnable {
            public OooO0O0() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                o00Ooo.this.OooOOo();
            }
        }

        /* JADX INFO: Add missing generic type declarations: [ReqT, RespT] */
        public class OooO0OO<ReqT, RespT> extends oO0OOo0o.OooO0o<ReqT, RespT> {
            @Override // oO0OOo0o.OooO0o
            public final void cancel(String str, Throwable th) {
            }

            @Override // oO0OOo0o.OooO0o
            public final void halfClose() {
            }

            @Override // oO0OOo0o.OooO0o
            public final void request(int i) {
            }

            @Override // oO0OOo0o.OooO0o
            public final void sendMessage(ReqT reqt) {
            }

            @Override // oO0OOo0o.OooO0o
            public final void start(OooO0o.OooO00o<RespT> oooO00o, C33094OoooO c33094OoooO) {
                oooO00o.onClose(o00Ooo.f114609OoooooO, new C33094OoooO());
            }
        }

        /* JADX INFO: renamed from: oO000Oo.o00Ooo$OooOOO0$OooO0Oo, reason: case insensitive filesystem */
        public class RunnableC32060OooO0Oo implements Runnable {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ C32061OooO0o0 f114711OooOo0o;

            public RunnableC32060OooO0Oo(C32061OooO0o0 c32061OooO0o0) {
                this.f114711OooOo0o = c32061OooO0o0;
            }

            @Override // java.lang.Runnable
            public final void run() {
                OooOOO0 oooOOO0 = OooOOO0.this;
                AbstractC33080OooOooo abstractC33080OooOooo = oooOOO0.f114704OooO00o.get();
                OooO00o oooO00o = o00Ooo.f114613ooOO;
                C32061OooO0o0 c32061OooO0o0 = this.f114711OooOo0o;
                if (abstractC33080OooOooo != oooO00o) {
                    c32061OooO0o0.OooO0o0();
                    return;
                }
                o00Ooo o00ooo2 = o00Ooo.this;
                if (o00ooo2.f114643OooOooO == null) {
                    o00ooo2.f114643OooOooO = new LinkedHashSet();
                    o00ooo2.f114667Ooooo0o.o00000OO(o00ooo2.f114644OooOooo, true);
                }
                o00ooo2.f114643OooOooO.add(c32061OooO0o0);
            }
        }

        /* JADX INFO: renamed from: oO000Oo.o00Ooo$OooOOO0$OooO0o0, reason: case insensitive filesystem */
        public final class C32061OooO0o0<ReqT, RespT> extends C31958OooOoo<ReqT, RespT> {

            /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
            public final C33065OooOOOo f114712OooOO0O;

            /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
            public final C33101OoooOO0<ReqT, RespT> f114713OooOO0o;

            /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
            public final long f114714OooOOO;

            /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
            public final oO0OOo0o.OooO0OO f114715OooOOO0;

            /* JADX INFO: renamed from: oO000Oo.o00Ooo$OooOOO0$OooO0o0$OooO00o */
            public class OooO00o implements Runnable {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ C31957OooOoOO f114718OooOo0o;

                public OooO00o(C31957OooOoOO c31957OooOoOO) {
                    this.f114718OooOo0o = c31957OooOoOO;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f114718OooOo0o.run();
                    C32061OooO0o0 c32061OooO0o0 = C32061OooO0o0.this;
                    o00Ooo.this.f114628OooOOOO.execute(new OooO0O0());
                }
            }

            /* JADX INFO: renamed from: oO000Oo.o00Ooo$OooOOO0$OooO0o0$OooO0O0 */
            public final class OooO0O0 implements Runnable {
                public OooO0O0() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C32061OooO0o0 c32061OooO0o0 = C32061OooO0o0.this;
                    LinkedHashSet linkedHashSet = o00Ooo.this.f114643OooOooO;
                    if (linkedHashSet != null) {
                        linkedHashSet.remove(c32061OooO0o0);
                        OooOOO0 oooOOO0 = OooOOO0.this;
                        if (o00Ooo.this.f114643OooOooO.isEmpty()) {
                            o00Ooo o00ooo2 = o00Ooo.this;
                            o00ooo2.f114667Ooooo0o.o00000OO(o00ooo2.f114644OooOooo, false);
                            o00Ooo o00ooo3 = o00Ooo.this;
                            o00ooo3.f114643OooOooO = null;
                            if (o00ooo3.f114646Oooo0.get()) {
                                o00Ooo.this.f114649Oooo00o.OooO00o(o00Ooo.f114609OoooooO);
                            }
                        }
                    }
                }
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public C32061OooO0o0(C33065OooOOOo c33065OooOOOo, C33101OoooOO0<ReqT, RespT> c33101OoooOO0, oO0OOo0o.OooO0OO oooO0OO) {
                o00Ooo o00ooo2 = o00Ooo.this;
                Logger logger = o00Ooo.f114606OooooOo;
                o00ooo2.getClass();
                Executor executor = oooO0OO.f119526OooO0O0;
                executor = executor == null ? o00ooo2.f114614OooO : executor;
                o00Ooo o00ooo3 = o00Ooo.this;
                super(executor, o00ooo3.f114622OooO0oo, oooO0OO.f119525OooO00o);
                this.f114712OooOO0O = c33065OooOOOo;
                this.f114713OooOO0o = c33101OoooOO0;
                this.f114715OooOOO0 = oooO0OO;
                o00ooo3.f114666Ooooo00.getClass();
                this.f114714OooOOO = System.nanoTime();
            }

            @Override // oO000Oo.C31958OooOoo
            public final void OooO00o() {
                o00Ooo.this.f114628OooOOOO.execute(new OooO0O0());
            }

            public final void OooO0o0() {
                C31957OooOoOO c31957OooOoOO;
                C33065OooOOOo c33065OooOOOoOooO0OO = this.f114712OooOO0O.OooO0OO();
                try {
                    oO0OOo0o.OooO0OO oooO0OO = this.f114715OooOOO0;
                    OooO0OO.OooO0O0<Long> oooO0O0 = oO0OOo0o.OooO.f119514OooO00o;
                    o00Ooo.this.f114666Ooooo00.getClass();
                    oO0OOo0o.OooO0o<ReqT, RespT> oooO0oOooO0oo = OooOOO0.this.OooO0oo(this.f114713OooOO0o, oooO0OO.OooO0o0(oooO0O0, Long.valueOf(System.nanoTime() - this.f114714OooOOO)));
                    synchronized (this) {
                        try {
                            if (this.f114062OooO0o != null) {
                                c31957OooOoOO = null;
                            } else {
                                oO0OOo0o.OooO0o<ReqT, RespT> oooO0o = (oO0OOo0o.OooO0o) Preconditions.checkNotNull(oooO0oOooO0oo, NotificationCompat.CATEGORY_CALL);
                                oO0OOo0o.OooO0o<ReqT, RespT> oooO0o2 = this.f114062OooO0o;
                                Preconditions.checkState(oooO0o2 == null, "realCall already set to %s", oooO0o2);
                                ScheduledFuture<?> scheduledFuture = this.f114058OooO00o;
                                if (scheduledFuture != null) {
                                    scheduledFuture.cancel(false);
                                }
                                this.f114062OooO0o = oooO0o;
                                c31957OooOoOO = new C31957OooOoOO(this, this.f114060OooO0OO);
                            }
                        } finally {
                        }
                    }
                    if (c31957OooOoOO == null) {
                        o00Ooo.this.f114628OooOOOO.execute(new OooO0O0());
                        return;
                    }
                    o00Ooo o00ooo2 = o00Ooo.this;
                    oO0OOo0o.OooO0OO oooO0OO2 = this.f114715OooOOO0;
                    o00ooo2.getClass();
                    Executor executor = oooO0OO2.f119526OooO0O0;
                    if (executor == null) {
                        executor = o00ooo2.f114614OooO;
                    }
                    executor.execute(new OooO00o(c31957OooOoOO));
                } finally {
                    this.f114712OooOO0O.OooOooo(c33065OooOOOoOooO0OO);
                }
            }
        }

        public OooOOO0(String str) {
            this.f114705OooO0O0 = (String) Preconditions.checkNotNull(str, "authority");
        }

        public final void OooO(AbstractC33080OooOooo abstractC33080OooOooo) {
            LinkedHashSet linkedHashSet;
            AtomicReference<AbstractC33080OooOooo> atomicReference = this.f114704OooO00o;
            AbstractC33080OooOooo abstractC33080OooOooo2 = atomicReference.get();
            atomicReference.set(abstractC33080OooOooo);
            if (abstractC33080OooOooo2 != o00Ooo.f114613ooOO || (linkedHashSet = o00Ooo.this.f114643OooOooO) == null) {
                return;
            }
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                ((C32061OooO0o0) it.next()).OooO0o0();
            }
        }

        @Override // oO0OOo0o.AbstractC33060OooO0Oo
        public final String OooO00o() {
            return this.f114705OooO0O0;
        }

        @Override // oO0OOo0o.AbstractC33060OooO0Oo
        public final <ReqT, RespT> oO0OOo0o.OooO0o<ReqT, RespT> OooO0oO(C33101OoooOO0<ReqT, RespT> c33101OoooOO0, oO0OOo0o.OooO0OO oooO0OO) {
            AtomicReference<AbstractC33080OooOooo> atomicReference = this.f114704OooO00o;
            AbstractC33080OooOooo abstractC33080OooOooo = atomicReference.get();
            OooO00o oooO00o = o00Ooo.f114613ooOO;
            if (abstractC33080OooOooo != oooO00o) {
                return OooO0oo(c33101OoooOO0, oooO0OO);
            }
            o00Ooo o00ooo2 = o00Ooo.this;
            o00ooo2.f114628OooOOOO.execute(new OooO0O0());
            if (atomicReference.get() != oooO00o) {
                return OooO0oo(c33101OoooOO0, oooO0OO);
            }
            if (o00ooo2.f114646Oooo0.get()) {
                return new OooO0OO();
            }
            C32061OooO0o0 c32061OooO0o0 = new C32061OooO0o0(C33065OooOOOo.OooOOoo(), c33101OoooOO0, oooO0OO);
            o00ooo2.f114628OooOOOO.execute(new RunnableC32060OooO0Oo(c32061OooO0o0));
            return c32061OooO0o0;
        }

        public final <ReqT, RespT> oO0OOo0o.OooO0o<ReqT, RespT> OooO0oo(C33101OoooOO0<ReqT, RespT> c33101OoooOO0, oO0OOo0o.OooO0OO oooO0OO) {
            AbstractC33080OooOooo abstractC33080OooOooo = this.f114704OooO00o.get();
            OooO00o oooO00o = this.f114706OooO0OO;
            if (abstractC33080OooOooo == null) {
                return oooO00o.OooO0oO(c33101OoooOO0, oooO0OO);
            }
            if (!(abstractC33080OooOooo instanceof o000OOo.OooO0O0)) {
                return new OooO0o(abstractC33080OooOooo, oooO00o, o00Ooo.this.f114614OooO, c33101OoooOO0, oooO0OO);
            }
            o000OOo o000ooo2 = ((o000OOo.OooO0O0) abstractC33080OooOooo).f114598OooO0O0;
            o000ooo2.getClass();
            o000OOo.OooO00o oooO00o2 = o000ooo2.f114586OooO0O0.get(c33101OoooOO0.f119667OooO0O0);
            if (oooO00o2 == null) {
                oooO00o2 = o000ooo2.f114587OooO0OO.get(c33101OoooOO0.f119668OooO0OO);
            }
            if (oooO00o2 == null) {
                oooO00o2 = o000ooo2.f114585OooO00o;
            }
            if (oooO00o2 != null) {
                oooO0OO = oooO0OO.OooO0o0(o000OOo.OooO00o.f114591OooO0oO, oooO00o2);
            }
            return oooO00o.OooO0oO(c33101OoooOO0, oooO0OO);
        }
    }

    public static final class OooOOOO implements ScheduledExecutorService {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final ScheduledExecutorService f114720OooOo0o;

        public OooOOOO(ScheduledExecutorService scheduledExecutorService) {
            this.f114720OooOo0o = (ScheduledExecutorService) Preconditions.checkNotNull(scheduledExecutorService, "delegate");
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
            return this.f114720OooOo0o.awaitTermination(j, timeUnit);
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            this.f114720OooOo0o.execute(runnable);
        }

        @Override // java.util.concurrent.ExecutorService
        public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
            return this.f114720OooOo0o.invokeAll(collection);
        }

        @Override // java.util.concurrent.ExecutorService
        public final <T> T invokeAny(Collection<? extends Callable<T>> collection) throws ExecutionException, InterruptedException {
            return (T) this.f114720OooOo0o.invokeAny(collection);
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isShutdown() {
            return this.f114720OooOo0o.isShutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isTerminated() {
            return this.f114720OooOo0o.isTerminated();
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public final <V> ScheduledFuture<V> schedule(Callable<V> callable, long j, TimeUnit timeUnit) {
            return this.f114720OooOo0o.schedule(callable, j, timeUnit);
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public final ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
            return this.f114720OooOo0o.scheduleAtFixedRate(runnable, j, j2, timeUnit);
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public final ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
            return this.f114720OooOo0o.scheduleWithFixedDelay(runnable, j, j2, timeUnit);
        }

        @Override // java.util.concurrent.ExecutorService
        public final void shutdown() {
            throw new UnsupportedOperationException("Restricted: shutdown() is not allowed");
        }

        @Override // java.util.concurrent.ExecutorService
        public final List<Runnable> shutdownNow() {
            throw new UnsupportedOperationException("Restricted: shutdownNow() is not allowed");
        }

        @Override // java.util.concurrent.ExecutorService
        public final <T> Future<T> submit(Callable<T> callable) {
            return this.f114720OooOo0o.submit(callable);
        }

        @Override // java.util.concurrent.ExecutorService
        public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException {
            return this.f114720OooOo0o.invokeAll(collection, j, timeUnit);
        }

        @Override // java.util.concurrent.ExecutorService
        public final <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
            return (T) this.f114720OooOo0o.invokeAny(collection, j, timeUnit);
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public final ScheduledFuture<?> schedule(Runnable runnable, long j, TimeUnit timeUnit) {
            return this.f114720OooOo0o.schedule(runnable, j, timeUnit);
        }

        @Override // java.util.concurrent.ExecutorService
        public final Future<?> submit(Runnable runnable) {
            return this.f114720OooOo0o.submit(runnable);
        }

        @Override // java.util.concurrent.ExecutorService
        public final <T> Future<T> submit(Runnable runnable, T t) {
            return this.f114720OooOo0o.submit(runnable, t);
        }
    }

    /* JADX INFO: renamed from: oO000Oo.o00Ooo$OooOOOo, reason: case insensitive filesystem */
    public final class C32062OooOOOo extends AbstractC31937OooO0o0 {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public ExecutorC33121o00ooo.OooO0OO f114721OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final AbstractC33087Oooo0o0.OooO0O0 f114722OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final C33082Oooo00O f114723OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final oO000Oo.OooOOO0 f114724OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final oO000Oo.OooOOOO f114725OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public C31999OoooOoo f114726OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public List<C33072OooOo0O> f114727OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public boolean f114728OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public boolean f114729OooO0oo;

        /* JADX INFO: renamed from: oO000Oo.o00Ooo$OooOOOo$OooO00o */
        public final class OooO00o extends C31999OoooOoo.OooO0OO {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final /* synthetic */ AbstractC33087Oooo0o0.OooOO0O f114731OooO00o;

            public OooO00o(AbstractC33087Oooo0o0.OooOO0O oooOO0O) {
                this.f114731OooO00o = oooOO0O;
            }
        }

        /* JADX INFO: renamed from: oO000Oo.o00Ooo$OooOOOo$OooO0O0 */
        public final class OooO0O0 implements Runnable {
            public OooO0O0() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C31999OoooOoo c31999OoooOoo = C32062OooOOOo.this.f114726OooO0o;
                oO0OOo0o.o00Oo0 o00oo02 = o00Ooo.f114610Ooooooo;
                c31999OoooOoo.getClass();
                c31999OoooOoo.f114262OooOO0O.execute(new RunnableC32005OooooOO(c31999OoooOoo, o00oo02));
            }
        }

        public C32062OooOOOo(AbstractC33087Oooo0o0.OooO0O0 oooO0O0) {
            Preconditions.checkNotNull(oooO0O0, "args");
            List<C33072OooOo0O> list = oooO0O0.f119631OooO00o;
            this.f114727OooO0o0 = list;
            Logger logger = o00Ooo.f114606OooooOo;
            o00Ooo.this.getClass();
            this.f114722OooO00o = oooO0O0;
            C33082Oooo00O c33082Oooo00O = new C33082Oooo00O("Subchannel", o00Ooo.this.f114636OooOo0O.OooO00o(), C33082Oooo00O.f119619OooO0Oo.incrementAndGet());
            this.f114723OooO0O0 = c33082Oooo00O;
            InterfaceC32050o0000oOo interfaceC32050o0000oOo = o00Ooo.this.f114626OooOOO;
            oO000Oo.OooOOOO oooOOOO = new oO000Oo.OooOOOO(c33082Oooo00O, interfaceC32050o0000oOo.OooO00o(), "Subchannel for " + list);
            this.f114725OooO0Oo = oooOOOO;
            this.f114724OooO0OO = new oO000Oo.OooOOO0(oooOOOO, interfaceC32050o0000oOo);
        }

        @Override // oO0OOo0o.AbstractC33087Oooo0o0.OooO
        public final void OooO(List<C33072OooOo0O> list) {
            o00Ooo.this.f114628OooOOOO.OooO0Oo();
            this.f114727OooO0o0 = list;
            C31999OoooOoo c31999OoooOoo = this.f114726OooO0o;
            c31999OoooOoo.getClass();
            Preconditions.checkNotNull(list, "newAddressGroups");
            Iterator<C33072OooOo0O> it = list.iterator();
            while (it.hasNext()) {
                Preconditions.checkNotNull(it.next(), "newAddressGroups contains null entry");
            }
            Preconditions.checkArgument(!list.isEmpty(), "newAddressGroups is empty");
            c31999OoooOoo.f114262OooOO0O.execute(new RunnableC32004OooooO0(c31999OoooOoo, Collections.unmodifiableList(new ArrayList(list))));
        }

        @Override // oO0OOo0o.AbstractC33087Oooo0o0.OooO
        public final List<C33072OooOo0O> OooO0O0() {
            o00Ooo.this.f114628OooOOOO.OooO0Oo();
            Preconditions.checkState(this.f114728OooO0oO, "not started");
            return this.f114727OooO0o0;
        }

        @Override // oO0OOo0o.AbstractC33087Oooo0o0.OooO
        public final C33058OooO00o OooO0OO() {
            return this.f114722OooO00o.f119632OooO0O0;
        }

        @Override // oO0OOo0o.AbstractC33087Oooo0o0.OooO
        public final AbstractC33061OooO0o0 OooO0Oo() {
            return this.f114724OooO0OO;
        }

        @Override // oO0OOo0o.AbstractC33087Oooo0o0.OooO
        public final void OooO0o() {
            o00Ooo.this.f114628OooOOOO.OooO0Oo();
            Preconditions.checkState(this.f114728OooO0oO, "not started");
            this.f114726OooO0o.OooO00o();
        }

        @Override // oO0OOo0o.AbstractC33087Oooo0o0.OooO
        public final Object OooO0o0() {
            Preconditions.checkState(this.f114728OooO0oO, "Subchannel is not started");
            return this.f114726OooO0o;
        }

        @Override // oO0OOo0o.AbstractC33087Oooo0o0.OooO
        public final void OooO0oO() {
            ExecutorC33121o00ooo.OooO0OO oooO0OO;
            o00Ooo o00ooo2 = o00Ooo.this;
            o00ooo2.f114628OooOOOO.OooO0Oo();
            if (this.f114726OooO0o == null) {
                this.f114729OooO0oo = true;
                return;
            }
            if (!this.f114729OooO0oo) {
                this.f114729OooO0oo = true;
            } else {
                if (!o00ooo2.f114651Oooo0OO || (oooO0OO = this.f114721OooO) == null) {
                    return;
                }
                oooO0OO.OooO00o();
                this.f114721OooO = null;
            }
            if (!o00ooo2.f114651Oooo0OO) {
                this.f114721OooO = o00ooo2.f114628OooOOOO.OooO0OO(new o00O0O(new OooO0O0()), 5L, TimeUnit.SECONDS, o00ooo2.f114621OooO0oO.f113976OooOo0o.Oooo0o0());
                return;
            }
            C31999OoooOoo c31999OoooOoo = this.f114726OooO0o;
            oO0OOo0o.o00Oo0 o00oo02 = o00Ooo.f114609OoooooO;
            c31999OoooOoo.getClass();
            c31999OoooOoo.f114262OooOO0O.execute(new RunnableC32005OooooOO(c31999OoooOoo, o00oo02));
        }

        @Override // oO0OOo0o.AbstractC33087Oooo0o0.OooO
        public final void OooO0oo(AbstractC33087Oooo0o0.OooOO0O oooOO0O) {
            o00Ooo o00ooo2 = o00Ooo.this;
            o00ooo2.f114628OooOOOO.OooO0Oo();
            Preconditions.checkState(!this.f114728OooO0oO, "already started");
            Preconditions.checkState(!this.f114729OooO0oo, "already shutdown");
            Preconditions.checkState(!o00ooo2.f114651Oooo0OO, "Channel is being terminated");
            this.f114728OooO0oO = true;
            List<C33072OooOo0O> list = this.f114722OooO00o.f119631OooO00o;
            String strOooO00o = o00ooo2.f114636OooOo0O.OooO00o();
            oO000Oo.OooOO0O oooOO0O2 = o00ooo2.f114621OooO0oO;
            ScheduledExecutorService scheduledExecutorServiceOooo0o0 = oooOO0O2.f113976OooOo0o.Oooo0o0();
            OooO00o oooO00o = new OooO00o(oooOO0O);
            o00ooo2.f114654Oooo0oO.getClass();
            C31999OoooOoo c31999OoooOoo = new C31999OoooOoo(list, strOooO00o, o00ooo2.f114634OooOo0, oooOO0O2, scheduledExecutorServiceOooo0o0, o00ooo2.f114630OooOOo, o00ooo2.f114628OooOOOO, oooO00o, o00ooo2.f114657OoooO0, new C31942OooOO0o(), this.f114725OooO0Oo, this.f114723OooO0O0, this.f114724OooO0OO, o00ooo2.f114637OooOo0o);
            C33077OooOoo.OooO00o oooO00o2 = C33077OooOoo.OooO00o.f119601OooOo0o;
            long jOooO00o = o00ooo2.f114626OooOOO.OooO00o();
            Long lValueOf = Long.valueOf(jOooO00o);
            Preconditions.checkNotNull("Child Subchannel started", "description");
            Preconditions.checkNotNull(oooO00o2, "severity");
            Preconditions.checkNotNull(lValueOf, "timestampNanos");
            Preconditions.checkState(true, "at least one of channelRef and subchannelRef must be null");
            o00ooo2.f114645Oooo.OooO0O0(new C33077OooOoo("Child Subchannel started", oooO00o2, jOooO00o, c31999OoooOoo));
            this.f114726OooO0o = c31999OoooOoo;
            o00ooo2.f114641OooOoo.add(c31999OoooOoo);
        }

        public final String toString() {
            return this.f114723OooO0O0.toString();
        }
    }

    /* JADX INFO: renamed from: oO000Oo.o00Ooo$OooOOo0, reason: case insensitive filesystem */
    public final class C32063OooOOo0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Object f114734OooO00o = new Object();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public HashSet f114735OooO0O0 = new HashSet();

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public oO0OOo0o.o00Oo0 f114736OooO0OO;

        public C32063OooOOo0() {
        }

        public final void OooO00o(oO0OOo0o.o00Oo0 o00oo02) {
            synchronized (this.f114734OooO00o) {
                try {
                    if (this.f114736OooO0OO != null) {
                        return;
                    }
                    this.f114736OooO0OO = o00oo02;
                    boolean zIsEmpty = this.f114735OooO0O0.isEmpty();
                    if (zIsEmpty) {
                        o00Ooo.this.f114648Oooo00O.OooO0o(o00oo02);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    static {
        oO0OOo0o.o00Oo0 o00oo02 = oO0OOo0o.o00Oo0.f119725OooOOOO;
        f114607Oooooo = o00oo02.OooO0oo("Channel shutdownNow invoked");
        f114609OoooooO = o00oo02.OooO0oo("Channel shutdown invoked");
        f114610Ooooooo = o00oo02.OooO0oo("Subchannel shutdown invoked");
        f114612o0OoOo0 = new o000OOo(null, new HashMap(), new HashMap(), null, null, null);
        f114613ooOO = new OooO00o();
        f114611o00O0O = new C32055OooO0Oo();
    }

    public o00Ooo(oo0o0Oo oo0o0oo, InterfaceC31949OooOo0 interfaceC31949OooOo0, Oooo0.OooO00o oooO00o, C32046o0000o0o c32046o0000o0o, C31989OoooO0O.C31990OooO0Oo c31990OooO0Oo, ArrayList arrayList) {
        InterfaceC32050o0000oOo.OooO00o oooO00o2 = InterfaceC32050o0000oOo.f114567OooO00o;
        ExecutorC33121o00ooo executorC33121o00ooo = new ExecutorC33121o00ooo(new OooO0OO());
        this.f114628OooOOOO = executorC33121o00ooo;
        OooOo oooOo = new OooOo();
        oooOo.f114038OooO00o = new ArrayList<>();
        oooOo.f114039OooO0O0 = oO0OOo0o.OooOOO.f119554OooOoO;
        this.f114635OooOo00 = oooOo;
        this.f114641OooOoo = new HashSet(16, 0.75f);
        this.f114644OooOooo = new Object();
        this.f114647Oooo000 = new HashSet(1, 0.75f);
        this.f114649Oooo00o = new C32063OooOOo0();
        this.f114646Oooo0 = new AtomicBoolean(false);
        this.f114652Oooo0o = new CountDownLatch(1);
        this.f114656OoooO = OooOOO.f114701OooOo0o;
        this.f114660OoooOO0 = f114612o0OoOo0;
        this.f114670o000oOoO = false;
        this.f114662OoooOOo = new o0000O.C32027OooOOo();
        this.f114666Ooooo00 = C33068OooOOo.f119573OooOoO;
        C32057OooO0oO c32057OooO0oO = new C32057OooO0oO();
        this.f114667Ooooo0o = new OooO();
        this.f114668OooooO0 = new C32056OooO0o0();
        String str = (String) Preconditions.checkNotNull(oo0o0oo.f114779OooO0o, "target");
        this.f114616OooO0O0 = str;
        C33082Oooo00O c33082Oooo00O = new C33082Oooo00O("Channel", str, C33082Oooo00O.f119619OooO0Oo.incrementAndGet());
        this.f114615OooO00o = c33082Oooo00O;
        this.f114626OooOOO = (InterfaceC32050o0000oOo) Preconditions.checkNotNull(oooO00o2, "timeProvider");
        o00000O<? extends Executor> o00000o = (o00000O) Preconditions.checkNotNull(oo0o0oo.f114775OooO00o, "executorPool");
        this.f114623OooOO0 = o00000o;
        Executor executor = (Executor) Preconditions.checkNotNull(o00000o.OooO00o(), "executor");
        this.f114614OooO = executor;
        this.f114619OooO0o = interfaceC31949OooOo0;
        ExecutorC32058OooO0oo executorC32058OooO0oo = new ExecutorC32058OooO0oo((o00000O) Preconditions.checkNotNull(oo0o0oo.f114776OooO0O0, "offloadExecutorPool"));
        this.f114627OooOOO0 = executorC32058OooO0oo;
        oO000Oo.OooOO0O oooOO0O = new oO000Oo.OooOO0O(interfaceC31949OooOo0, executorC32058OooO0oo);
        this.f114621OooO0oO = oooOO0O;
        OooOOOO oooOOOO = new OooOOOO(oooOO0O.f113976OooOo0o.Oooo0o0());
        this.f114622OooO0oo = oooOOOO;
        oO000Oo.OooOOOO oooOOOO2 = new oO000Oo.OooOOOO(c33082Oooo00O, oooO00o2.OooO00o(), C20593OooO0Oo.OooO0O0("Channel for '", str, "'"));
        this.f114645Oooo = oooOOOO2;
        oO000Oo.OooOOO0 oooOOO0 = new oO000Oo.OooOOO0(oooOOOO2, oooO00o2);
        this.f114658OoooO00 = oooOOO0;
        C32051o0000oo c32051o0000oo = C31989OoooO0O.f114226OooOOO0;
        boolean z = oo0o0oo.f114788OooOOOO;
        this.f114665OoooOoo = z;
        C31939OooO0oo c31939OooO0oo = new C31939OooO0oo(oo0o0oo.f114781OooO0oO);
        this.f114620OooO0o0 = c31939OooO0oo;
        C33103OoooOOo c33103OoooOOo = oo0o0oo.f114778OooO0Oo;
        this.f114617OooO0OO = c33103OoooOOo;
        o000oOoO.OooO00o oooO00o3 = new o000oOoO.OooO00o(Integer.valueOf(oo0o0oo.f114793OooOo.OooO00o()), (InterfaceC33110OooooOO) Preconditions.checkNotNull(c32051o0000oo), (ExecutorC33121o00ooo) Preconditions.checkNotNull(executorC33121o00ooo), (o000oOoO.AbstractC33118OooO0oO) Preconditions.checkNotNull(new C32038o0000OOo(z, oo0o0oo.f114784OooOO0O, oo0o0oo.f114785OooOO0o, c31939OooO0oo)), (ScheduledExecutorService) Preconditions.checkNotNull(oooOOOO), (AbstractC33061OooO0o0) Preconditions.checkNotNull(oooOOO0), executorC32058OooO0oo);
        this.f114618OooO0Oo = oooO00o3;
        this.f114633OooOo = OooOOoo(str, c33103OoooOOo, oooO00o3, oooOO0O.f113976OooOo0o.o0ooOO0());
        this.f114624OooOO0O = (o00000O) Preconditions.checkNotNull(c32046o0000o0o, "balancerRpcExecutorPool");
        this.f114625OooOO0o = new ExecutorC32058OooO0oo(c32046o0000o0o);
        C31965OooOooO c31965OooOooO = new C31965OooOooO(executor, executorC33121o00ooo);
        this.f114648Oooo00O = c31965OooOooO;
        c31965OooOooO.OooO0o0(c32057OooO0oO);
        this.f114634OooOo0 = oooO00o;
        boolean z2 = oo0o0oo.f114791OooOOo0;
        this.f114661OoooOOO = z2;
        OooOOO0 oooOOO02 = new OooOOO0(this.f114633OooOo.OooO00o());
        this.f114659OoooO0O = oooOOO02;
        int i = C33063OooO0oo.f119548OooO00o;
        Preconditions.checkNotNull(oooOOO02, "channel");
        Iterator it = arrayList.iterator();
        AbstractC33060OooO0Oo oooO0O0 = oooOOO02;
        while (it.hasNext()) {
            oooO0O0 = new C33063OooO0oo.OooO0O0(oooO0O0, (InterfaceC33062OooO0oO) it.next());
        }
        this.f114636OooOo0O = oooO0O0;
        this.f114637OooOo0o = new ArrayList(oo0o0oo.f114780OooO0o0);
        this.f114630OooOOo = (Supplier) Preconditions.checkNotNull(c31990OooO0Oo, "stopwatchSupplier");
        long j = oo0o0oo.f114783OooOO0;
        if (j == -1) {
            this.f114632OooOOoo = j;
        } else {
            Preconditions.checkArgument(j >= oo0o0Oo.f114769OooOoOO, "invalid idleTimeoutMillis %s", j);
            this.f114632OooOOoo = oo0o0oo.f114783OooOO0;
        }
        OooOO0 oooOO02 = new OooOO0();
        ScheduledExecutorService scheduledExecutorServiceOooo0o0 = oooOO0O.f113976OooOo0o.Oooo0o0();
        c31990OooO0Oo.getClass();
        this.f114669OooooOO = new o000OO(oooOO02, executorC33121o00ooo, scheduledExecutorServiceOooo0o0, Stopwatch.createUnstarted());
        this.f114629OooOOOo = (oO0OOo0o.OooOo00) Preconditions.checkNotNull(oo0o0oo.f114782OooO0oo, "decompressorRegistry");
        this.f114631OooOOo0 = (oO0OOo0o.OooOOO0) Preconditions.checkNotNull(oo0o0oo.f114774OooO, "compressorRegistry");
        this.f114664OoooOoO = oo0o0oo.f114787OooOOO0;
        this.f114663OoooOo0 = oo0o0oo.f114786OooOOO;
        this.f114654Oooo0oO = new C24961OooO00o();
        this.f114655Oooo0oo = new C31942OooOO0o();
        C33079OooOooO c33079OooOooO = (C33079OooOooO) Preconditions.checkNotNull(oo0o0oo.f114789OooOOOo);
        this.f114657OoooO0 = c33079OooOooO;
        if (z2) {
            return;
        }
        this.f114670o000oOoO = true;
    }

    public static void OooOOO(o00Ooo o00ooo2) {
        o00ooo2.OooOo0O(true);
        C31965OooOooO c31965OooOooO = o00ooo2.f114648Oooo00O;
        c31965OooOooO.OooO0oo(null);
        o00ooo2.f114658OoooO00.OooO00o(AbstractC33061OooO0o0.OooO00o.f119543OooOo, "Entering IDLE state");
        o00ooo2.f114635OooOo00.OooO00o(oO0OOo0o.OooOOO.f119554OooOoO);
        Object[] objArr = {o00ooo2.f114644OooOooo, c31965OooOooO};
        OooO oooO = o00ooo2.f114667Ooooo0o;
        oooO.getClass();
        for (int i = 0; i < 2; i++) {
            if (((Set) oooO.f60501OooOo0o).contains(objArr[i])) {
                o00ooo2.OooOOo();
                return;
            }
        }
    }

    public static void OooOOOO(o00Ooo o00ooo2) {
        if (o00ooo2.f114650Oooo0O0) {
            for (C31999OoooOoo c31999OoooOoo : o00ooo2.f114641OooOoo) {
                c31999OoooOoo.getClass();
                oO0OOo0o.o00Oo0 o00oo02 = f114607Oooooo;
                RunnableC32005OooooOO runnableC32005OooooOO = new RunnableC32005OooooOO(c31999OoooOoo, o00oo02);
                ExecutorC33121o00ooo executorC33121o00ooo = c31999OoooOoo.f114262OooOO0O;
                executorC33121o00ooo.execute(runnableC32005OooooOO);
                executorC33121o00ooo.execute(new RunnableC32007Oooooo(c31999OoooOoo, o00oo02));
            }
            Iterator it = o00ooo2.f114647Oooo000.iterator();
            if (it.hasNext()) {
                ((o00000OO) it.next()).getClass();
                throw null;
            }
        }
    }

    public static void OooOOOo(o00Ooo o00ooo2) {
        if (!o00ooo2.f114653Oooo0o0 && o00ooo2.f114646Oooo0.get() && o00ooo2.f114641OooOoo.isEmpty() && o00ooo2.f114647Oooo000.isEmpty()) {
            o00ooo2.f114658OoooO00.OooO00o(AbstractC33061OooO0o0.OooO00o.f119543OooOo, "Terminated");
            o00ooo2.f114623OooOO0.OooO0O0(o00ooo2.f114614OooO);
            o00ooo2.f114625OooOO0o.OooO00o();
            o00ooo2.f114627OooOOO0.OooO00o();
            o00ooo2.f114621OooO0oO.close();
            o00ooo2.f114653Oooo0o0 = true;
            o00ooo2.f114652Oooo0o.countDown();
        }
    }

    public static AbstractC31975Oooo OooOOoo(String str, C33103OoooOOo c33103OoooOOo, o000oOoO.OooO00o oooO00o, Collection collection) {
        URI uri;
        AbstractC33102OoooOOO abstractC33102OoooOOO;
        String str2;
        String str3;
        String str4;
        ImmutableMap<String, AbstractC33102OoooOOO> immutableMap;
        ImmutableMap<String, AbstractC33102OoooOOO> immutableMap2;
        StringBuilder sb = new StringBuilder();
        AbstractC33102OoooOOO abstractC33102OoooOOO2 = null;
        try {
            uri = new URI(str);
        } catch (URISyntaxException e) {
            sb.append(e.getMessage());
            uri = null;
        }
        if (uri == null) {
            abstractC33102OoooOOO = null;
        } else {
            String scheme = uri.getScheme();
            if (scheme == null) {
                c33103OoooOOo.getClass();
                abstractC33102OoooOOO = null;
            } else {
                synchronized (c33103OoooOOo) {
                    immutableMap2 = c33103OoooOOo.f119685OooO0OO;
                }
                abstractC33102OoooOOO = immutableMap2.get(scheme.toLowerCase(Locale.US));
            }
        }
        if (abstractC33102OoooOOO == null && !f114608Oooooo0.matcher(str).matches()) {
            try {
                synchronized (c33103OoooOOo) {
                    str4 = c33103OoooOOo.f119683OooO00o;
                }
                uri = new URI(str4, "", "/" + str, null);
                String scheme2 = uri.getScheme();
                if (scheme2 != null) {
                    synchronized (c33103OoooOOo) {
                        immutableMap = c33103OoooOOo.f119685OooO0OO;
                    }
                    abstractC33102OoooOOO2 = immutableMap.get(scheme2.toLowerCase(Locale.US));
                }
                abstractC33102OoooOOO = abstractC33102OoooOOO2;
            } catch (URISyntaxException e2) {
                throw new IllegalArgumentException(e2);
            }
        }
        if (abstractC33102OoooOOO == null) {
            if (sb.length() > 0) {
                str3 = " (" + ((Object) sb) + ")";
            } else {
                str3 = "";
            }
            throw new IllegalArgumentException(C20593OooO0Oo.OooO0O0("Could not find a NameResolverProvider for ", str, str3));
        }
        if (collection != null && !collection.containsAll(abstractC33102OoooOOO.OooO0O0())) {
            throw new IllegalArgumentException(androidx.core.database.OooO00o.OooO00o("Address types of NameResolver '", uri.getScheme(), "' for '", str, "' not supported by transport"));
        }
        C31976Oooo00O c31976Oooo00OOooO00o = abstractC33102OoooOOO.OooO00o(uri, oooO00o);
        if (c31976Oooo00OOooO00o != null) {
            Oooo0.OooO00o oooO00o2 = new Oooo0.OooO00o();
            ScheduledExecutorService scheduledExecutorService = oooO00o.f119707OooO0o0;
            if (scheduledExecutorService == null) {
                throw new IllegalStateException("ScheduledExecutorService not set in Builder");
            }
            ExecutorC33121o00ooo executorC33121o00ooo = oooO00o.f119704OooO0OO;
            return new o0000OOO(c31976Oooo00OOooO00o, new oO000Oo.OooOO0(oooO00o2, scheduledExecutorService, executorC33121o00ooo), executorC33121o00ooo);
        }
        if (sb.length() > 0) {
            str2 = " (" + ((Object) sb) + ")";
        } else {
            str2 = "";
        }
        throw new IllegalArgumentException(C20593OooO0Oo.OooO0O0("cannot create a NameResolver for ", str, str2));
    }

    @Override // oO0OOo0o.AbstractC33093Oooo0oo
    public final void OooO() {
        this.f114628OooOOOO.execute(new OooO0O0());
    }

    @Override // oO0OOo0o.AbstractC33060OooO0Oo
    public final String OooO00o() {
        return this.f114636OooOo0O.OooO00o();
    }

    @Override // oO0OOo0o.Oooo000
    public final C33082Oooo00O OooO0OO() {
        return this.f114615OooO00o;
    }

    @Override // oO0OOo0o.AbstractC33060OooO0Oo
    public final <ReqT, RespT> oO0OOo0o.OooO0o<ReqT, RespT> OooO0oO(C33101OoooOO0<ReqT, RespT> c33101OoooOO0, oO0OOo0o.OooO0OO oooO0OO) {
        return this.f114636OooOo0O.OooO0oO(c33101OoooOO0, oooO0OO);
    }

    @Override // oO0OOo0o.AbstractC33093Oooo0oo
    public final boolean OooO0oo(long j) throws InterruptedException {
        return this.f114652Oooo0o.await(j, TimeUnit.SECONDS);
    }

    @Override // oO0OOo0o.AbstractC33093Oooo0oo
    public final oO0OOo0o.OooOOO OooOO0() {
        oO0OOo0o.OooOOO oooOOO = this.f114635OooOo00.f114039OooO0O0;
        if (oooOOO == null) {
            throw new UnsupportedOperationException("Channel state API is not implemented");
        }
        if (oooOOO == oO0OOo0o.OooOOO.f119554OooOoO) {
            this.f114628OooOOOO.execute(new RunnableC32065o00oO0o(this));
        }
        return oooOOO;
    }

    @Override // oO0OOo0o.AbstractC33093Oooo0oo
    public final void OooOO0O(oO0OOo0o.OooOOO oooOOO, RunnableC22702OooOOo0 runnableC22702OooOOo0) {
        this.f114628OooOOOO.execute(new RunnableC32066o00ooo(this, runnableC22702OooOOo0, oooOOO));
    }

    @Override // oO0OOo0o.AbstractC33093Oooo0oo
    public final /* bridge */ /* synthetic */ AbstractC33093Oooo0oo OooOO0o() {
        OooOo0();
        return this;
    }

    @Override // oO0OOo0o.AbstractC33093Oooo0oo
    public final AbstractC33093Oooo0oo OooOOO0() {
        this.f114658OoooO00.OooO00o(AbstractC33061OooO0o0.OooO00o.f119544OooOo0o, "shutdownNow() called");
        OooOo0();
        OooOOO0 oooOOO0 = this.f114659OoooO0O;
        o00Ooo.this.f114628OooOOOO.execute(new o0OO00O(oooOOO0));
        this.f114628OooOOOO.execute(new RunnableC32067o0ooOO0(this));
        return this;
    }

    public final void OooOOo() {
        this.f114628OooOOOO.OooO0Oo();
        if (this.f114646Oooo0.get() || this.f114642OooOoo0) {
            return;
        }
        if (((Set) this.f114667Ooooo0o.f60501OooOo0o).isEmpty()) {
            OooOo00();
        } else {
            OooOOo0(false);
        }
        if (this.f114638OooOoO != null) {
            return;
        }
        this.f114658OoooO00.OooO00o(AbstractC33061OooO0o0.OooO00o.f119543OooOo, "Exiting idle mode");
        OooOO0O oooOO0O = new OooOO0O();
        C31939OooO0oo c31939OooO0oo = this.f114620OooO0o0;
        c31939OooO0oo.getClass();
        oooOO0O.f114687OooO00o = c31939OooO0oo.new OooO00o(oooOO0O);
        this.f114638OooOoO = oooOO0O;
        this.f114633OooOo.OooO0o0(new C32059OooOO0o(oooOO0O, this.f114633OooOo));
        this.f114639OooOoO0 = true;
    }

    public final void OooOOo0(boolean z) {
        ScheduledFuture<?> scheduledFuture;
        o000OO o000oo2 = this.f114669OooooOO;
        o000oo2.f114580OooO0o = false;
        if (!z || (scheduledFuture = o000oo2.f114582OooO0oO) == null) {
            return;
        }
        scheduledFuture.cancel(false);
        o000oo2.f114582OooO0oO = null;
    }

    public final void OooOo0() {
        this.f114658OoooO00.OooO00o(AbstractC33061OooO0o0.OooO00o.f119544OooOo0o, "shutdown() called");
        if (this.f114646Oooo0.compareAndSet(false, true)) {
            o00oO0O o00oo0o = new o00oO0O(this);
            ExecutorC33121o00ooo executorC33121o00ooo = this.f114628OooOOOO;
            executorC33121o00ooo.execute(o00oo0o);
            OooOOO0 oooOOO0 = this.f114659OoooO0O;
            o00Ooo.this.f114628OooOOOO.execute(new o0Oo0oo(oooOOO0));
            executorC33121o00ooo.execute(new RunnableC32064o00o0O(this));
        }
    }

    public final void OooOo00() {
        long j = this.f114632OooOOoo;
        if (j == -1) {
            return;
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        o000OO o000oo2 = this.f114669OooooOO;
        o000oo2.getClass();
        long nanos = timeUnit.toNanos(j);
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        long jElapsed = o000oo2.f114579OooO0Oo.elapsed(timeUnit2) + nanos;
        o000oo2.f114580OooO0o = true;
        if (jElapsed - o000oo2.f114581OooO0o0 < 0 || o000oo2.f114582OooO0oO == null) {
            ScheduledFuture<?> scheduledFuture = o000oo2.f114582OooO0oO;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            o000oo2.f114582OooO0oO = o000oo2.f114576OooO00o.schedule(o000oo2.new OooO0O0(), nanos, timeUnit2);
        }
        o000oo2.f114581OooO0o0 = jElapsed;
    }

    public final void OooOo0O(boolean z) {
        this.f114628OooOOOO.OooO0Oo();
        if (z) {
            Preconditions.checkState(this.f114639OooOoO0, "nameResolver is not started");
            Preconditions.checkState(this.f114638OooOoO != null, "lbHelper is null");
        }
        AbstractC31975Oooo abstractC31975Oooo = this.f114633OooOo;
        if (abstractC31975Oooo != null) {
            abstractC31975Oooo.OooO0OO();
            this.f114639OooOoO0 = false;
            if (z) {
                this.f114633OooOo = OooOOoo(this.f114616OooO0O0, this.f114617OooO0OO, this.f114618OooO0Oo, this.f114621OooO0oO.f113976OooOo0o.o0ooOO0());
            } else {
                this.f114633OooOo = null;
            }
        }
        OooOO0O oooOO0O = this.f114638OooOoO;
        if (oooOO0O != null) {
            C31939OooO0oo.OooO00o oooO00o = oooOO0O.f114687OooO00o;
            oooO00o.f113965OooO0O0.OooO0o();
            oooO00o.f113965OooO0O0 = null;
            this.f114638OooOoO = null;
        }
        this.f114640OooOoOO = null;
    }

    public final String toString() {
        return MoreObjects.toStringHelper(this).add("logId", this.f114615OooO00o.f119622OooO0OO).add("target", this.f114616OooO0O0).toString();
    }
}
