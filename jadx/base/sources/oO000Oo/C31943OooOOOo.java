package oO000Oo;

import com.aspose.slides.C22200OooO0o0;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.MoreExecutors;
import com.microsoft.identity.common.adal.internal.AuthenticationConstants;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import oO000Oo.InterfaceC31948OooOOoo;
import oO000Oo.InterfaceC32049o0000oOO;
import oO000Oo.o000OOo;
import oO000Oo.o00Ooo;
import oO0OOo0o.C33058OooO00o;
import oO0OOo0o.C33065OooOOOo;
import oO0OOo0o.C33068OooOOo;
import oO0OOo0o.C33069OooOOo0;
import oO0OOo0o.C33094OoooO;
import oO0OOo0o.C33101OoooOO0;
import oO0OOo0o.InterfaceC33064OooOO0o;
import oO0OOo0o.OooO0OO;
import oO0OOo0o.OooO0o;
import oO0OOo0o.OooOO0O;
import oO0OOo0o.o00Oo0;

/* JADX INFO: renamed from: oO000Oo.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31943OooOOOo<ReqT, RespT> extends oO0OOo0o.OooO0o<ReqT, RespT> {

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public static final Logger f113994OooOOoo = Logger.getLogger(C31943OooOOOo.class.getName());

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public static final double f113995OooOo00;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public oO0OOo0o.OooO0OO f113996OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C33101OoooOO0<ReqT, RespT> f113997OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final oO00o00.OooO0OO f113998OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Executor f113999OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f114000OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final C33065OooOOOo f114001OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final C31942OooOO0o f114002OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public volatile ScheduledFuture<?> f114003OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final boolean f114004OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public InterfaceC31946OooOOo f114005OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public volatile boolean f114006OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public boolean f114007OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final InterfaceC31944OooO0Oo f114008OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public boolean f114009OooOOO0;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final ScheduledExecutorService f114011OooOOOo;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final C31943OooOOOo<ReqT, RespT>.C31945OooO0o0 f114010OooOOOO = new C31945OooO0o0();

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public oO0OOo0o.OooOo00 f114013OooOOo0 = oO0OOo0o.OooOo00.f119581OooO0Oo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public oO0OOo0o.OooOOO0 f114012OooOOo = oO0OOo0o.OooOOO0.f119558OooO0O0;

    /* JADX INFO: renamed from: oO000Oo.OooOOOo$OooO00o */
    public class OooO00o extends AbstractRunnableC31956OooOoO0 {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ OooO0o.OooO00o f114014OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(OooO0o.OooO00o oooO00o) {
            super(C31943OooOOOo.this.f114001OooO0o);
            this.f114014OooOo = oooO00o;
        }

        @Override // oO000Oo.AbstractRunnableC31956OooOoO0
        public final void OooO00o() {
            this.f114014OooOo.onClose(C33069OooOOo0.OooO00o(C31943OooOOOo.this.f114001OooO0o), new C33094OoooO());
        }
    }

    /* JADX INFO: renamed from: oO000Oo.OooOOOo$OooO0O0 */
    public class OooO0O0 extends AbstractRunnableC31956OooOoO0 {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ OooO0o.OooO00o f114016OooOo;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ String f114018OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(OooO0o.OooO00o oooO00o, String str) {
            super(C31943OooOOOo.this.f114001OooO0o);
            this.f114016OooOo = oooO00o;
            this.f114018OooOoO0 = str;
        }

        @Override // oO000Oo.AbstractRunnableC31956OooOoO0
        public final void OooO00o() {
            oO0OOo0o.o00Oo0 o00oo0OooO0oo = oO0OOo0o.o00Oo0.f119723OooOOO.OooO0oo("Unable to find compressor by name " + this.f114018OooOoO0);
            C33094OoooO c33094OoooO = new C33094OoooO();
            C31943OooOOOo.this.getClass();
            this.f114016OooOo.onClose(o00oo0OooO0oo, c33094OoooO);
        }
    }

    /* JADX INFO: renamed from: oO000Oo.OooOOOo$OooO0OO */
    public class OooO0OO implements InterfaceC31948OooOOoo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooO0o.OooO00o<RespT> f114019OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public oO0OOo0o.o00Oo0 f114020OooO0O0;

        /* JADX INFO: renamed from: oO000Oo.OooOOOo$OooO0OO$OooO00o */
        public final class OooO00o extends AbstractRunnableC31956OooOoO0 {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ C33094OoooO f114022OooOo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(C33094OoooO c33094OoooO) {
                super(C31943OooOOOo.this.f114001OooO0o);
                this.f114022OooOo = c33094OoooO;
            }

            @Override // oO000Oo.AbstractRunnableC31956OooOoO0
            public final void OooO00o() {
                OooO0OO oooO0OO = OooO0OO.this;
                oO00o00.OooO0O0.OooO0OO();
                try {
                    oO00o00.OooO0OO oooO0OO2 = C31943OooOOOo.this.f113998OooO0O0;
                    oO00o00.OooO0O0.OooO00o();
                    oO00o00.OooO0O0.f116246OooO00o.getClass();
                    if (oooO0OO.f114020OooO0O0 == null) {
                        try {
                            oooO0OO.f114019OooO00o.onHeaders(this.f114022OooOo);
                        } catch (Throwable th) {
                            oO0OOo0o.o00Oo0 o00oo0OooO0oo = oO0OOo0o.o00Oo0.f119716OooO0o.OooO0oO(th).OooO0oo("Failed to read headers");
                            oooO0OO.f114020OooO0O0 = o00oo0OooO0oo;
                            C31943OooOOOo.this.f114005OooOO0.OooOO0o(o00oo0OooO0oo);
                        }
                    }
                    oO00o00.OooO0O0.f116246OooO00o.getClass();
                } catch (Throwable th2) {
                    try {
                        oO00o00.OooO0O0.f116246OooO00o.getClass();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        }

        /* JADX INFO: renamed from: oO000Oo.OooOOOo$OooO0OO$OooO0O0 */
        public final class OooO0O0 extends AbstractRunnableC31956OooOoO0 {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ InterfaceC32049o0000oOO.OooO00o f114024OooOo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(InterfaceC32049o0000oOO.OooO00o oooO00o) {
                super(C31943OooOOOo.this.f114001OooO0o);
                this.f114024OooOo = oooO00o;
            }

            @Override // oO000Oo.AbstractRunnableC31956OooOoO0
            public final void OooO00o() {
                oO00o00.OooO0O0.OooO0OO();
                try {
                    oO00o00.OooO0OO oooO0OO = C31943OooOOOo.this.f113998OooO0O0;
                    oO00o00.OooO0O0.OooO00o();
                    oO00o00.OooO00o oooO00o = oO00o00.OooO0O0.f116246OooO00o;
                    oooO00o.getClass();
                    OooO0O0();
                    oooO00o.getClass();
                } catch (Throwable th) {
                    try {
                        oO00o00.OooO0O0.f116246OooO00o.getClass();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }

            public final void OooO0O0() {
                OooO0OO oooO0OO = OooO0OO.this;
                oO0OOo0o.o00Oo0 o00oo02 = oooO0OO.f114020OooO0O0;
                C31943OooOOOo c31943OooOOOo = C31943OooOOOo.this;
                InterfaceC32049o0000oOO.OooO00o oooO00o = this.f114024OooOo;
                if (o00oo02 != null) {
                    Logger logger = C31989OoooO0O.f114214OooO00o;
                    while (true) {
                        InputStream next = oooO00o.next();
                        if (next == null) {
                            return;
                        } else {
                            C31989OoooO0O.OooO0O0(next);
                        }
                    }
                } else {
                    while (true) {
                        try {
                            InputStream next2 = oooO00o.next();
                            if (next2 == null) {
                                return;
                            }
                            try {
                                oooO0OO.f114019OooO00o.onMessage((RespT) c31943OooOOOo.f113997OooO00o.f119671OooO0o0.OooO0O0(next2));
                                next2.close();
                            } catch (Throwable th) {
                                C31989OoooO0O.OooO0O0(next2);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            Logger logger2 = C31989OoooO0O.f114214OooO00o;
                            while (true) {
                                InputStream next3 = oooO00o.next();
                                if (next3 == null) {
                                    oO0OOo0o.o00Oo0 o00oo0OooO0oo = oO0OOo0o.o00Oo0.f119716OooO0o.OooO0oO(th2).OooO0oo("Failed to read message.");
                                    oooO0OO.f114020OooO0O0 = o00oo0OooO0oo;
                                    c31943OooOOOo.f114005OooOO0.OooOO0o(o00oo0OooO0oo);
                                    return;
                                }
                                C31989OoooO0O.OooO0O0(next3);
                            }
                        }
                    }
                }
            }
        }

        /* JADX INFO: renamed from: oO000Oo.OooOOOo$OooO0OO$OooO0OO, reason: collision with other inner class name */
        public final class C20192OooO0OO extends AbstractRunnableC31956OooOoO0 {
            public C20192OooO0OO() {
                super(C31943OooOOOo.this.f114001OooO0o);
            }

            @Override // oO000Oo.AbstractRunnableC31956OooOoO0
            public final void OooO00o() {
                OooO0OO oooO0OO = OooO0OO.this;
                oO00o00.OooO0O0.OooO0OO();
                try {
                    oO00o00.OooO0OO oooO0OO2 = C31943OooOOOo.this.f113998OooO0O0;
                    oO00o00.OooO0O0.OooO00o();
                    oO00o00.OooO0O0.f116246OooO00o.getClass();
                    if (oooO0OO.f114020OooO0O0 == null) {
                        try {
                            oooO0OO.f114019OooO00o.onReady();
                        } catch (Throwable th) {
                            oO0OOo0o.o00Oo0 o00oo0OooO0oo = oO0OOo0o.o00Oo0.f119716OooO0o.OooO0oO(th).OooO0oo("Failed to call onReady.");
                            oooO0OO.f114020OooO0O0 = o00oo0OooO0oo;
                            C31943OooOOOo.this.f114005OooOO0.OooOO0o(o00oo0OooO0oo);
                        }
                    }
                    oO00o00.OooO0O0.f116246OooO00o.getClass();
                } catch (Throwable th2) {
                    try {
                        oO00o00.OooO0O0.f116246OooO00o.getClass();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        }

        public OooO0OO(OooO0o.OooO00o<RespT> oooO00o) {
            this.f114019OooO00o = (OooO0o.OooO00o) Preconditions.checkNotNull(oooO00o, "observer");
        }

        @Override // oO000Oo.InterfaceC32049o0000oOO
        public final void OooO00o(InterfaceC32049o0000oOO.OooO00o oooO00o) {
            C31943OooOOOo c31943OooOOOo = C31943OooOOOo.this;
            oO00o00.OooO0O0.OooO0OO();
            try {
                oO00o00.OooO0OO oooO0OO = c31943OooOOOo.f113998OooO0O0;
                oO00o00.OooO0O0.OooO00o();
                oO00o00.OooO0O0.OooO0O0();
                c31943OooOOOo.f113999OooO0OO.execute(new OooO0O0(oooO00o));
                oO00o00.OooO0O0.f116246OooO00o.getClass();
            } catch (Throwable th) {
                try {
                    oO00o00.OooO0O0.f116246OooO00o.getClass();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        @Override // oO000Oo.InterfaceC31948OooOOoo
        public final void OooO0O0(C33094OoooO c33094OoooO) {
            C31943OooOOOo c31943OooOOOo = C31943OooOOOo.this;
            oO00o00.OooO0O0.OooO0OO();
            try {
                oO00o00.OooO0OO oooO0OO = c31943OooOOOo.f113998OooO0O0;
                oO00o00.OooO0O0.OooO00o();
                oO00o00.OooO0O0.OooO0O0();
                c31943OooOOOo.f113999OooO0OO.execute(new OooO00o(c33094OoooO));
                oO00o00.OooO0O0.f116246OooO00o.getClass();
            } catch (Throwable th) {
                try {
                    oO00o00.OooO0O0.f116246OooO00o.getClass();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        @Override // oO000Oo.InterfaceC31948OooOOoo
        public final void OooO0OO(oO0OOo0o.o00Oo0 o00oo02, InterfaceC31948OooOOoo.OooO00o oooO00o, C33094OoooO c33094OoooO) {
            oO00o00.OooO0O0.OooO0OO();
            try {
                oO00o00.OooO0OO oooO0OO = C31943OooOOOo.this.f113998OooO0O0;
                oO00o00.OooO0O0.OooO00o();
                OooO0Oo(o00oo02, c33094OoooO);
                oO00o00.OooO0O0.f116246OooO00o.getClass();
            } catch (Throwable th) {
                try {
                    oO00o00.OooO0O0.f116246OooO00o.getClass();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        public final void OooO0Oo(oO0OOo0o.o00Oo0 o00oo02, C33094OoooO c33094OoooO) {
            C31943OooOOOo c31943OooOOOo = C31943OooOOOo.this;
            C33068OooOOo c33068OooOOo = c31943OooOOOo.f113996OooO.f119525OooO00o;
            c31943OooOOOo.f114001OooO0o.Oooo000();
            if (c33068OooOOo == null) {
                c33068OooOOo = null;
            }
            if (o00oo02.f119728OooO00o == o00Oo0.OooO00o.CANCELLED && c33068OooOOo != null && c33068OooOOo.OooO0O0()) {
                C31998OoooOoO c31998OoooOoO = new C31998OoooOoO();
                c31943OooOOOo.f114005OooOO0.OooOOO0(c31998OoooOoO);
                o00oo02 = oO0OOo0o.o00Oo0.f119719OooO0oo.OooO0O0("ClientCall was cancelled at or after deadline. " + c31998OoooOoO);
                c33094OoooO = new C33094OoooO();
            }
            oO00o00.OooO0O0.OooO0O0();
            c31943OooOOOo.f113999OooO0OO.execute(new C31947OooOOo0(this, o00oo02, c33094OoooO));
        }

        @Override // oO000Oo.InterfaceC32049o0000oOO
        public final void onReady() {
            C31943OooOOOo c31943OooOOOo = C31943OooOOOo.this;
            C33101OoooOO0.OooO0OO oooO0OO = c31943OooOOOo.f113997OooO00o.f119666OooO00o;
            oooO0OO.getClass();
            if (oooO0OO == C33101OoooOO0.OooO0OO.f119678OooOo0o || oooO0OO == C33101OoooOO0.OooO0OO.f119677OooOo) {
                return;
            }
            oO00o00.OooO0O0.OooO0OO();
            try {
                oO00o00.OooO0O0.OooO00o();
                oO00o00.OooO0O0.OooO0O0();
                c31943OooOOOo.f113999OooO0OO.execute(new C20192OooO0OO());
                oO00o00.OooO0O0.f116246OooO00o.getClass();
            } catch (Throwable th) {
                try {
                    oO00o00.OooO0O0.f116246OooO00o.getClass();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: oO000Oo.OooOOOo$OooO0Oo, reason: case insensitive filesystem */
    public interface InterfaceC31944OooO0Oo {
    }

    /* JADX INFO: renamed from: oO000Oo.OooOOOo$OooO0o */
    public class OooO0o implements Runnable {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final long f114028OooOo0o;

        public OooO0o(long j) {
            this.f114028OooOo0o = j;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C31998OoooOoO c31998OoooOoO = new C31998OoooOoO();
            C31943OooOOOo c31943OooOOOo = C31943OooOOOo.this;
            c31943OooOOOo.f114005OooOO0.OooOOO0(c31998OoooOoO);
            long j = this.f114028OooOo0o;
            long jAbs = Math.abs(j);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            long nanos = jAbs / timeUnit.toNanos(1L);
            long jAbs2 = Math.abs(j) % timeUnit.toNanos(1L);
            StringBuilder sb = new StringBuilder("deadline exceeded after ");
            if (j < 0) {
                sb.append('-');
            }
            sb.append(nanos);
            Locale locale = Locale.US;
            sb.append(String.format(locale, ".%09d", Long.valueOf(jAbs2)));
            sb.append("s. ");
            sb.append(String.format(locale, "Name resolution delay %.9f seconds. ", Double.valueOf(((Long) c31943OooOOOo.f113996OooO.OooO00o(oO0OOo0o.OooO.f119514OooO00o)) == null ? 0.0d : r3.longValue() / C31943OooOOOo.f113995OooOo00)));
            sb.append(c31998OoooOoO);
            c31943OooOOOo.f114005OooOO0.OooOO0o(oO0OOo0o.o00Oo0.f119719OooO0oo.OooO0O0(sb.toString()));
        }
    }

    /* JADX INFO: renamed from: oO000Oo.OooOOOo$OooO0o0, reason: case insensitive filesystem */
    public final class C31945OooO0o0 implements C33065OooOOOo.OooO0O0 {
        public C31945OooO0o0() {
        }

        @Override // oO0OOo0o.C33065OooOOOo.OooO0O0
        public final void OooO00o(C33065OooOOOo c33065OooOOOo) {
            C31943OooOOOo.this.f114005OooOO0.OooOO0o(C33069OooOOo0.OooO00o(c33065OooOOOo));
        }
    }

    static {
        "gzip".getBytes(Charset.forName("US-ASCII"));
        f113995OooOo00 = TimeUnit.SECONDS.toNanos(1L) * 1.0d;
    }

    public C31943OooOOOo(C33101OoooOO0 c33101OoooOO0, Executor executor, oO0OOo0o.OooO0OO oooO0OO, InterfaceC31944OooO0Oo interfaceC31944OooO0Oo, ScheduledExecutorService scheduledExecutorService, C31942OooOO0o c31942OooOO0o) {
        this.f113997OooO00o = c33101OoooOO0;
        String str = c33101OoooOO0.f119667OooO0O0;
        System.identityHashCode(this);
        oO00o00.OooO00o oooO00o = oO00o00.OooO0O0.f116246OooO00o;
        oooO00o.getClass();
        this.f113998OooO0O0 = oO00o00.OooO00o.f116244OooO00o;
        if (executor == MoreExecutors.directExecutor()) {
            this.f113999OooO0OO = new ExecutorC32040o0000Oo0();
            this.f114000OooO0Oo = true;
        } else {
            this.f113999OooO0OO = new ExecutorC32039o0000Oo(executor);
            this.f114000OooO0Oo = false;
        }
        this.f114002OooO0o0 = c31942OooOO0o;
        this.f114001OooO0o = C33065OooOOOo.OooOOoo();
        C33101OoooOO0.OooO0OO oooO0OO2 = C33101OoooOO0.OooO0OO.f119678OooOo0o;
        C33101OoooOO0.OooO0OO oooO0OO3 = c33101OoooOO0.f119666OooO00o;
        this.f114004OooO0oo = oooO0OO3 == oooO0OO2 || oooO0OO3 == C33101OoooOO0.OooO0OO.f119677OooOo;
        this.f113996OooO = oooO0OO;
        this.f114008OooOOO = interfaceC31944OooO0Oo;
        this.f114011OooOOOo = scheduledExecutorService;
        oooO00o.getClass();
    }

    public final void OooO00o(String str, Throwable th) {
        if (str == null && th == null) {
            th = new CancellationException("Cancelled without a message or cause");
            f113994OooOOoo.log(Level.WARNING, "Cancelling without a message or cause is suboptimal", th);
        }
        if (this.f114007OooOO0o) {
            return;
        }
        this.f114007OooOO0o = true;
        try {
            if (this.f114005OooOO0 != null) {
                oO0OOo0o.o00Oo0 o00oo02 = oO0OOo0o.o00Oo0.f119716OooO0o;
                oO0OOo0o.o00Oo0 o00oo0OooO0oo = str != null ? o00oo02.OooO0oo(str) : o00oo02.OooO0oo("Call cancelled without message");
                if (th != null) {
                    o00oo0OooO0oo = o00oo0OooO0oo.OooO0oO(th);
                }
                this.f114005OooOO0.OooOO0o(o00oo0OooO0oo);
            }
            OooO0O0();
        } catch (Throwable th2) {
            OooO0O0();
            throw th2;
        }
    }

    public final void OooO0O0() {
        this.f114001OooO0o.Oooo0(this.f114010OooOOOO);
        ScheduledFuture<?> scheduledFuture = this.f114003OooO0oO;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    public final void OooO0OO(ReqT reqt) {
        Preconditions.checkState(this.f114005OooOO0 != null, "Not started");
        Preconditions.checkState(!this.f114007OooOO0o, "call was cancelled");
        Preconditions.checkState(!this.f114009OooOOO0, "call was half-closed");
        try {
            InterfaceC31946OooOOo interfaceC31946OooOOo = this.f114005OooOO0;
            if (interfaceC31946OooOOo instanceof o0000O) {
                ((o0000O) interfaceC31946OooOOo).OooOoO0(reqt);
            } else {
                interfaceC31946OooOOo.OooO0oO(this.f113997OooO00o.f119669OooO0Oo.OooO00o(reqt));
            }
            if (this.f114004OooO0oo) {
                return;
            }
            this.f114005OooOO0.flush();
        } catch (Error e) {
            this.f114005OooOO0.OooOO0o(oO0OOo0o.o00Oo0.f119716OooO0o.OooO0oo("Client sendMessage() failed with Error"));
            throw e;
        } catch (RuntimeException e2) {
            this.f114005OooOO0.OooOO0o(oO0OOo0o.o00Oo0.f119716OooO0o.OooO0oO(e2).OooO0oo("Failed to stream message"));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OooO0Oo(OooO0o.OooO00o<RespT> oooO00o, C33094OoooO c33094OoooO) {
        InterfaceC33064OooOO0o interfaceC33064OooOO0o;
        InterfaceC31946OooOOo c32068o0ooOoO;
        oO0OOo0o.OooO0OO oooO0OO;
        Preconditions.checkState(this.f114005OooOO0 == null, "Already started");
        Preconditions.checkState(!this.f114007OooOO0o, "call was cancelled");
        Preconditions.checkNotNull(oooO00o, "observer");
        Preconditions.checkNotNull(c33094OoooO, "headers");
        boolean zOooo00o = this.f114001OooO0o.Oooo00o();
        o00000O0 o00000o02 = o00000O0.f114372OooO00o;
        if (zOooo00o) {
            this.f114005OooOO0 = o00000o02;
            this.f113999OooO0OO.execute(new OooO00o(oooO00o));
            return;
        }
        oO0OOo0o.OooO0OO oooO0OO2 = this.f113996OooO;
        OooO0OO.OooO0O0<o000OOo.OooO00o> oooO0O0 = o000OOo.OooO00o.f114591OooO0oO;
        o000OOo.OooO00o oooO00o2 = (o000OOo.OooO00o) oooO0OO2.OooO00o(oooO0O0);
        if (oooO00o2 != null) {
            Long l = oooO00o2.f114592OooO00o;
            if (l != null) {
                long jLongValue = l.longValue();
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                if (timeUnit == null) {
                    C33068OooOOo.OooO00o oooO00o3 = C33068OooOOo.f119573OooOoO;
                    throw new NullPointerException("units");
                }
                C33068OooOOo c33068OooOOo = new C33068OooOOo(timeUnit.toNanos(jLongValue));
                C33068OooOOo c33068OooOOo2 = this.f113996OooO.f119525OooO00o;
                if (c33068OooOOo2 != null) {
                    c33068OooOOo.OooO00o(c33068OooOOo2);
                    if (c33068OooOOo.f119577OooOo - c33068OooOOo2.f119577OooOo < 0) {
                        oO0OOo0o.OooO0OO oooO0OO3 = this.f113996OooO;
                        oooO0OO3.getClass();
                        OooO0OO.OooO00o oooO00oOooO0O0 = oO0OOo0o.OooO0OO.OooO0O0(oooO0OO3);
                        oooO00oOooO0O0.f119534OooO00o = c33068OooOOo;
                        this.f113996OooO = new oO0OOo0o.OooO0OO(oooO00oOooO0O0);
                    }
                }
            }
            Boolean bool = oooO00o2.f114593OooO0O0;
            if (bool != null) {
                if (bool.booleanValue()) {
                    oO0OOo0o.OooO0OO oooO0OO4 = this.f113996OooO;
                    oooO0OO4.getClass();
                    OooO0OO.OooO00o oooO00oOooO0O02 = oO0OOo0o.OooO0OO.OooO0O0(oooO0OO4);
                    oooO00oOooO0O02.f119540OooO0oO = Boolean.TRUE;
                    oooO0OO = new oO0OOo0o.OooO0OO(oooO00oOooO0O02);
                } else {
                    oO0OOo0o.OooO0OO oooO0OO5 = this.f113996OooO;
                    oooO0OO5.getClass();
                    OooO0OO.OooO00o oooO00oOooO0O03 = oO0OOo0o.OooO0OO.OooO0O0(oooO0OO5);
                    oooO00oOooO0O03.f119540OooO0oO = Boolean.FALSE;
                    oooO0OO = new oO0OOo0o.OooO0OO(oooO00oOooO0O03);
                }
                this.f113996OooO = oooO0OO;
            }
            Integer num = oooO00o2.f114594OooO0OO;
            if (num != null) {
                oO0OOo0o.OooO0OO oooO0OO6 = this.f113996OooO;
                Integer num2 = oooO0OO6.f119532OooO0oo;
                if (num2 != null) {
                    this.f113996OooO = oooO0OO6.OooO0OO(Math.min(num2.intValue(), num.intValue()));
                } else {
                    this.f113996OooO = oooO0OO6.OooO0OO(num.intValue());
                }
            }
            Integer num3 = oooO00o2.f114595OooO0Oo;
            if (num3 != null) {
                oO0OOo0o.OooO0OO oooO0OO7 = this.f113996OooO;
                Integer num4 = oooO0OO7.f119524OooO;
                if (num4 != null) {
                    this.f113996OooO = oooO0OO7.OooO0Oo(Math.min(num4.intValue(), num3.intValue()));
                } else {
                    this.f113996OooO = oooO0OO7.OooO0Oo(num3.intValue());
                }
            }
        }
        String str = this.f113996OooO.f119528OooO0Oo;
        OooOO0O.OooO0O0 oooO0O02 = OooOO0O.OooO0O0.f119551OooO00o;
        if (str != null) {
            interfaceC33064OooOO0o = (InterfaceC33064OooOO0o) this.f114012OooOOo.f119559OooO00o.get(str);
            if (interfaceC33064OooOO0o == null) {
                this.f114005OooOO0 = o00000o02;
                this.f113999OooO0OO.execute(new OooO0O0(oooO00o, str));
                return;
            }
        } else {
            interfaceC33064OooOO0o = oooO0O02;
        }
        oO0OOo0o.OooOo00 oooOo00 = this.f114013OooOOo0;
        c33094OoooO.OooO00o(C31989OoooO0O.f114221OooO0oo);
        C33094OoooO.OooO0O0 oooO0O03 = C31989OoooO0O.f114217OooO0Oo;
        c33094OoooO.OooO00o(oooO0O03);
        if (interfaceC33064OooOO0o != oooO0O02) {
            c33094OoooO.OooO0o(oooO0O03, interfaceC33064OooOO0o.OooO00o());
        }
        C33094OoooO.OooO0o oooO0o = C31989OoooO0O.f114219OooO0o0;
        c33094OoooO.OooO00o(oooO0o);
        byte[] bArr = oooOo00.f119583OooO0O0;
        if (bArr.length != 0) {
            c33094OoooO.OooO0o(oooO0o, bArr);
        }
        c33094OoooO.OooO00o(C31989OoooO0O.f114218OooO0o);
        c33094OoooO.OooO00o(C31989OoooO0O.f114220OooO0oO);
        C33068OooOOo c33068OooOOo3 = this.f113996OooO.f119525OooO00o;
        this.f114001OooO0o.Oooo000();
        C33068OooOOo c33068OooOOo4 = c33068OooOOo3 == null ? null : c33068OooOOo3;
        if (c33068OooOOo4 == null || !c33068OooOOo4.OooO0O0()) {
            this.f114001OooO0o.Oooo000();
            C33068OooOOo c33068OooOOo5 = this.f113996OooO.f119525OooO00o;
            Level level = Level.FINE;
            Logger logger = f113994OooOOoo;
            if (logger.isLoggable(level) && c33068OooOOo4 != null && c33068OooOOo4.equals(null)) {
                TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
                long jMax = Math.max(0L, c33068OooOOo4.OooO0OO());
                Locale locale = Locale.US;
                StringBuilder sb = new StringBuilder(C22200OooO0o0.OooO0O0(jMax, "Call timeout set to '", "' ns, due to context deadline."));
                if (c33068OooOOo5 == null) {
                    sb.append(" Explicit call timeout was not set.");
                } else {
                    sb.append(" Explicit call timeout was '" + c33068OooOOo5.OooO0OO() + "' ns.");
                }
                logger.fine(sb.toString());
            }
            InterfaceC31944OooO0Oo interfaceC31944OooO0Oo = this.f114008OooOOO;
            C33101OoooOO0<ReqT, RespT> c33101OoooOO0 = this.f113997OooO00o;
            oO0OOo0o.OooO0OO oooO0OO8 = this.f113996OooO;
            C33065OooOOOo c33065OooOOOo = this.f114001OooO0o;
            o00Ooo.C32056OooO0o0 c32056OooO0o0 = (o00Ooo.C32056OooO0o0) interfaceC31944OooO0Oo;
            if (o00Ooo.this.f114665OoooOoo) {
                o000OOo.OooO00o oooO00o4 = (o000OOo.OooO00o) oooO0OO8.OooO00o(oooO0O0);
                c32068o0ooOoO = new C32068o0ooOoO(c32056OooO0o0, c33101OoooOO0, c33094OoooO, oooO0OO8, oooO00o4 == null ? null : oooO00o4.f114597OooO0o0, oooO00o4 == null ? null : oooO00o4.f114596OooO0o, c33065OooOOOo);
            } else {
                OooOo00 oooOo00OooO00o = c32056OooO0o0.OooO00o(new o0000O00(c33101OoooOO0, c33094OoooO, oooO0OO8));
                C33065OooOOOo c33065OooOOOoOooO0OO = c33065OooOOOo.OooO0OO();
                try {
                    c32068o0ooOoO = oooOo00OooO00o.OooO0Oo(c33101OoooOO0, c33094OoooO, oooO0OO8, C31989OoooO0O.OooO0OO(oooO0OO8, c33094OoooO, 0, false));
                } finally {
                    c33065OooOOOo.OooOooo(c33065OooOOOoOooO0OO);
                }
            }
            this.f114005OooOO0 = c32068o0ooOoO;
        } else {
            oO0OOo0o.OooO[] oooOArrOooO0OO = C31989OoooO0O.OooO0OO(this.f113996OooO, c33094OoooO, 0, false);
            C33068OooOOo c33068OooOOo6 = this.f113996OooO.f119525OooO00o;
            this.f114001OooO0o.Oooo000();
            String str2 = c33068OooOOo6 == null ? AuthenticationConstants.Broker.CHALLENGE_RESPONSE_CONTEXT : "CallOptions";
            Long l2 = (Long) this.f113996OooO.OooO00o(oO0OOo0o.OooO.f119514OooO00o);
            TimeUnit timeUnit3 = TimeUnit.NANOSECONDS;
            double dOooO0OO = c33068OooOOo4.OooO0OO();
            double d = f113995OooOo00;
            this.f114005OooOO0 = new C31980Oooo0O0(oO0OOo0o.o00Oo0.f119719OooO0oo.OooO0oo(String.format("ClientCall started after %s deadline was exceeded %.9f seconds ago. Name resolution delay %.9f seconds.", str2, Double.valueOf(dOooO0OO / d), Double.valueOf(l2 == null ? 0.0d : l2.longValue() / d))), InterfaceC31948OooOOoo.OooO00o.f114034OooOo0o, oooOArrOooO0OO);
        }
        if (this.f114000OooO0Oo) {
            this.f114005OooOO0.OooO0oo();
        }
        this.f113996OooO.getClass();
        Integer num5 = this.f113996OooO.f119532OooO0oo;
        if (num5 != null) {
            this.f114005OooOO0.OooO0OO(num5.intValue());
        }
        Integer num6 = this.f113996OooO.f119524OooO;
        if (num6 != null) {
            this.f114005OooOO0.OooO0Oo(num6.intValue());
        }
        if (c33068OooOOo4 != null) {
            this.f114005OooOO0.OooO0o(c33068OooOOo4);
        }
        this.f114005OooOO0.OooO0O0(interfaceC33064OooOO0o);
        this.f114005OooOO0.OooOO0O(this.f114013OooOOo0);
        C31942OooOO0o c31942OooOO0o = this.f114002OooO0o0;
        c31942OooOO0o.f113986OooO0O0.OooO00o();
        c31942OooOO0o.f113985OooO00o.OooO00o();
        this.f114005OooOO0.OooOOO(new OooO0OO(oooO00o));
        this.f114001OooO0o.OooO00o(this.f114010OooOOOO, MoreExecutors.directExecutor());
        if (c33068OooOOo4 != null) {
            this.f114001OooO0o.Oooo000();
            if (!c33068OooOOo4.equals(null) && this.f114011OooOOOo != null) {
                TimeUnit timeUnit4 = TimeUnit.NANOSECONDS;
                long jOooO0OO = c33068OooOOo4.OooO0OO();
                this.f114003OooO0oO = this.f114011OooOOOo.schedule(new o00O0O(new OooO0o(jOooO0OO)), jOooO0OO, timeUnit4);
            }
        }
        if (this.f114006OooOO0O) {
            OooO0O0();
        }
    }

    @Override // oO0OOo0o.OooO0o
    public final void cancel(String str, Throwable th) {
        oO00o00.OooO0O0.OooO0OO();
        try {
            oO00o00.OooO0O0.OooO00o();
            OooO00o(str, th);
            oO00o00.OooO0O0.f116246OooO00o.getClass();
        } catch (Throwable th2) {
            try {
                oO00o00.OooO0O0.f116246OooO00o.getClass();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // oO0OOo0o.OooO0o
    public final C33058OooO00o getAttributes() {
        InterfaceC31946OooOOo interfaceC31946OooOOo = this.f114005OooOO0;
        return interfaceC31946OooOOo != null ? interfaceC31946OooOOo.getAttributes() : C33058OooO00o.f119518OooO0O0;
    }

    @Override // oO0OOo0o.OooO0o
    public final void halfClose() {
        oO00o00.OooO0O0.OooO0OO();
        try {
            oO00o00.OooO0O0.OooO00o();
            Preconditions.checkState(this.f114005OooOO0 != null, "Not started");
            Preconditions.checkState(!this.f114007OooOO0o, "call was cancelled");
            Preconditions.checkState(!this.f114009OooOOO0, "call already half-closed");
            this.f114009OooOOO0 = true;
            this.f114005OooOO0.OooOO0();
            oO00o00.OooO0O0.f116246OooO00o.getClass();
        } catch (Throwable th) {
            try {
                oO00o00.OooO0O0.f116246OooO00o.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // oO0OOo0o.OooO0o
    public final boolean isReady() {
        if (this.f114009OooOOO0) {
            return false;
        }
        return this.f114005OooOO0.isReady();
    }

    @Override // oO0OOo0o.OooO0o
    public final void request(int i) {
        oO00o00.OooO0O0.OooO0OO();
        try {
            oO00o00.OooO0O0.OooO00o();
            Preconditions.checkState(this.f114005OooOO0 != null, "Not started");
            Preconditions.checkArgument(i >= 0, "Number requested must be non-negative");
            this.f114005OooOO0.OooO00o(i);
            oO00o00.OooO0O0.f116246OooO00o.getClass();
        } catch (Throwable th) {
            try {
                oO00o00.OooO0O0.f116246OooO00o.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // oO0OOo0o.OooO0o
    public final void sendMessage(ReqT reqt) {
        oO00o00.OooO0O0.OooO0OO();
        try {
            oO00o00.OooO0O0.OooO00o();
            OooO0OO(reqt);
            oO00o00.OooO0O0.f116246OooO00o.getClass();
        } catch (Throwable th) {
            try {
                oO00o00.OooO0O0.f116246OooO00o.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // oO0OOo0o.OooO0o
    public final void setMessageCompression(boolean z) {
        Preconditions.checkState(this.f114005OooOO0 != null, "Not started");
        this.f114005OooOO0.OooO0o0(z);
    }

    @Override // oO0OOo0o.OooO0o
    public final void start(OooO0o.OooO00o<RespT> oooO00o, C33094OoooO c33094OoooO) {
        oO00o00.OooO0O0.OooO0OO();
        try {
            oO00o00.OooO0O0.OooO00o();
            OooO0Oo(oooO00o, c33094OoooO);
            oO00o00.OooO0O0.f116246OooO00o.getClass();
        } catch (Throwable th) {
            try {
                oO00o00.OooO0O0.f116246OooO00o.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final String toString() {
        return MoreObjects.toStringHelper(this).add("method", this.f113997OooO00o).toString();
    }
}
