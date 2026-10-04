package oO0OO0OO;

import Oooo0OO.AbstractC20960OooOOOO;
import Oooo0oo.AbstractC21138OooO0oo;
import androidx.appcompat.widget.C21532OooOOo;
import androidx.core.location.LocationRequestCompat;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.base.Stopwatch;
import com.google.common.base.Supplier;
import com.google.common.net.HttpHeaders;
import com.huawei.hms.network.embedded.C18241k5;
import com.microsoft.identity.common.java.AuthenticationConstants;
import com.microsoft.identity.common.java.commands.SilentTokenCommand;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.io.EOFException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import oO000Oo.C31987OoooO0;
import oO000Oo.C31989OoooO0O;
import oO000Oo.C31997OoooOo0;
import oO000Oo.C32043o0000o;
import oO000Oo.C32069ooOO;
import oO000Oo.ExecutorC32039o0000Oo;
import oO000Oo.InterfaceC31946OooOOo;
import oO000Oo.InterfaceC31948OooOOoo;
import oO000Oo.InterfaceC31954OooOo0o;
import oO000Oo.OooOo00;
import oO000Oo.RunnableC31996OoooOOo;
import oO000Oo.o000;
import oO000Oo.o000000;
import oO000OoO.C32078OooO0oo;
import oO000OoO.EnumC32073OooO00o;
import oO000OoO.OooO0o;
import oO0OO0OO.C32906OooO0o0;
import oO0OO0OO.C32909OooO0oo;
import oO0OO0OO.C32912OooOOo;
import oO0OO0OO.C32912OooOOo.OooO0O0;
import oO0OO0OO.OooO00o;
import oO0OO0OO.OooO00o.C32903OooO0Oo;
import oO0OO0OO.OooO0O0;
import oO0OOo0O.C33056OooO00o;
import oO0OOo0O.C33057OooO0O0;
import oO0OOo0o.C33058OooO00o;
import oO0OOo0o.C33076OooOoOO;
import oO0OOo0o.C33078OooOoo0;
import oO0OOo0o.C33082Oooo00O;
import oO0OOo0o.C33094OoooO;
import oO0OOo0o.C33101OoooOO0;
import oO0OOo0o.EnumC33111OooooOo;
import oO0OOo0o.o00Oo0;
import oO0OOo0o.o00Ooo;
import oO0OOoo0.C33131OooO0O0;
import oO0OOoo0.C33133OooO0Oo;
import oO0OOoo0.C33142OooOO0o;
import oOo00OoO.C34524OooO0Oo;
import oOo00OoO.C34527OooO0oO;
import oOo00OoO.C34535OooOOOo;
import oOo00OoO.C34540OooOo0;
import oOo00OoO.C34542OooOo0O;
import oOo00OoO.C34547OooOoo;
import oOo00OoO.InterfaceC34548OooOoo0;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO implements InterfaceC31954OooOo0o, OooO0O0.OooO00o, C32912OooOOo.OooO0OO {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public static final Map<EnumC32073OooO00o, o00Oo0> f118569Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public static final Logger f118570OoooO00;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public oO0OO0OO.OooO0O0 f118571OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InetSocketAddress f118572OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f118573OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f118574OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Random f118575OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f118576OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Supplier<Stopwatch> f118577OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final oO000OoO.OooO f118578OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public o000000.OooO00o f118579OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public C32912OooOOo f118580OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final Object f118581OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final C33082Oooo00O f118582OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final HashMap f118583OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public int f118584OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final Executor f118585OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final ExecutorC32039o0000Oo f118586OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final int f118587OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final ScheduledExecutorService f118588OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public int f118589OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public C31997OoooOo0 f118590OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public C33058OooO00o f118591OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public RunnableC32902OooO0Oo f118592OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public o00Oo0 f118593OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public boolean f118594OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public boolean f118595OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public boolean f118596OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final SocketFactory f118597OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public int f118598OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final SSLSocketFactory f118599OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final LinkedList f118600OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final C33131OooO0O0 f118601OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public long f118602Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public C32069ooOO f118603Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public boolean f118604Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public long f118605Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public final Runnable f118606Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public final int f118607Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final OooO00o f118608Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public final o000 f118609Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final C33078OooOoo0 f118610Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final int f118611Oooo0oo;

    public class OooO00o extends AbstractC20960OooOOOO {
        public OooO00o() {
            super(3);
        }

        @Override // Oooo0OO.AbstractC20960OooOOOO
        public final void o000000() {
            OooO.this.f118579OooO0oo.OooO0Oo(false);
        }

        @Override // Oooo0OO.AbstractC20960OooOOOO
        public final void o000OOo() {
            OooO.this.f118579OooO0oo.OooO0Oo(true);
        }
    }

    public class OooO0O0 implements Runnable {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ oO0OO0OO.OooO00o f118613OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f118614OooOo0o;

        public class OooO00o implements InterfaceC34548OooOoo0 {
            @Override // java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
            }

            @Override // oOo00OoO.InterfaceC34548OooOoo0
            public final long read(C34524OooO0Oo c34524OooO0Oo, long j) {
                return -1L;
            }

            @Override // oOo00OoO.InterfaceC34548OooOoo0
            public final C34547OooOoo timeout() {
                return C34547OooOoo.NONE;
            }
        }

        public OooO0O0(CountDownLatch countDownLatch, oO0OO0OO.OooO00o oooO00o) {
            this.f118614OooOo0o = countDownLatch;
            this.f118613OooOo = oooO00o;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // java.lang.Runnable
        public final void run() {
            OooO oooO;
            RunnableC32902OooO0Oo runnableC32902OooO0Oo;
            Socket socketOooO0oo;
            SSLSession session;
            Socket socket;
            try {
                this.f118614OooOo0o.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
            C34542OooOo0O c34542OooOo0OOooO0O0 = C34535OooOOOo.OooO0O0(new OooO00o());
            try {
                try {
                    try {
                        OooO oooO2 = OooO.this;
                        C33078OooOoo0 c33078OooOoo0 = oooO2.f118610Oooo0oO;
                        if (c33078OooOoo0 == null) {
                            socketOooO0oo = oooO2.f118597OooOoOO.createSocket(oooO2.f118572OooO00o.getAddress(), OooO.this.f118572OooO00o.getPort());
                        } else {
                            SocketAddress socketAddress = c33078OooOoo0.f119606OooOo0o;
                            if (!(socketAddress instanceof InetSocketAddress)) {
                                throw new o00Ooo(o00Oo0.f119723OooOOO.OooO0oo("Unsupported SocketAddress implementation " + OooO.this.f118610Oooo0oO.f119606OooOo0o.getClass()));
                            }
                            socketOooO0oo = OooO.OooO0oo(oooO2, c33078OooOoo0.f119605OooOo, (InetSocketAddress) socketAddress, c33078OooOoo0.f119608OooOoO0, c33078OooOoo0.f119607OooOoO);
                        }
                        OooO oooO3 = OooO.this;
                        SSLSocketFactory sSLSocketFactory = oooO3.f118599OooOoo0;
                        if (sSLSocketFactory != null) {
                            String host = oooO3.f118573OooO0O0;
                            URI uriOooO00o = C31989OoooO0O.OooO00o(host);
                            if (uriOooO00o.getHost() != null) {
                                host = uriOooO00o.getHost();
                            }
                            SSLSocket sSLSocketOooO00o = OooOOOO.OooO00o(sSLSocketFactory, socketOooO0oo, host, OooO.this.OooOO0O(), OooO.this.f118601OooOooo);
                            session = sSLSocketOooO00o.getSession();
                            socket = sSLSocketOooO00o;
                        } else {
                            session = null;
                            socket = socketOooO0oo;
                        }
                        socket.setTcpNoDelay(true);
                        C34542OooOo0O c34542OooOo0OOooO0O02 = C34535OooOOOo.OooO0O0(C34535OooOOOo.OooO0oO(socket));
                        this.f118613OooOo.OooO00o(C34535OooOOOo.OooO0Oo(socket), socket);
                        OooO oooO4 = OooO.this;
                        C33058OooO00o c33058OooO00o = oooO4.f118591OooOo0;
                        c33058OooO00o.getClass();
                        C33058OooO00o.C20297OooO00o c20297OooO00o = new C33058OooO00o.C20297OooO00o(c33058OooO00o);
                        c20297OooO00o.OooO0O0(C33076OooOoOO.f119593OooO00o, socket.getRemoteSocketAddress());
                        c20297OooO00o.OooO0O0(C33076OooOoOO.f119594OooO0O0, socket.getLocalSocketAddress());
                        c20297OooO00o.OooO0O0(C33076OooOoOO.f119595OooO0OO, session);
                        c20297OooO00o.OooO0O0(C31987OoooO0.f114211OooO00o, session == null ? EnumC33111OooooOo.f119694OooOo0o : EnumC33111OooooOo.f119693OooOo);
                        oooO4.f118591OooOo0 = c20297OooO00o.OooO00o();
                        OooO oooO5 = OooO.this;
                        oooO5.f118592OooOo00 = oooO5.new RunnableC32902OooO0Oo(oooO5.f118578OooO0oO.OooO00o(c34542OooOo0OOooO0O02));
                        synchronized (OooO.this.f118581OooOO0O) {
                            try {
                                OooO oooO6 = OooO.this;
                                oooO6.getClass();
                                if (session != null) {
                                    OooO oooO7 = OooO.this;
                                    oooO7.getClass();
                                }
                            } finally {
                            }
                        }
                    } catch (Throwable th) {
                        OooO oooO8 = OooO.this;
                        oooO8.f118592OooOo00 = oooO8.new RunnableC32902OooO0Oo(oooO8.f118578OooO0oO.OooO00o(c34542OooOo0OOooO0O0));
                        throw th;
                    }
                } catch (o00Ooo e) {
                    OooO.this.OooOOo0(0, EnumC32073OooO00o.INTERNAL_ERROR, e.f119753OooOo0o);
                    oooO = OooO.this;
                    runnableC32902OooO0Oo = oooO.new RunnableC32902OooO0Oo(oooO.f118578OooO0oO.OooO00o(c34542OooOo0OOooO0O0));
                    oooO.f118592OooOo00 = runnableC32902OooO0Oo;
                }
            } catch (Exception e2) {
                OooO.this.onException(e2);
                oooO = OooO.this;
                runnableC32902OooO0Oo = oooO.new RunnableC32902OooO0Oo(oooO.f118578OooO0oO.OooO00o(c34542OooOo0OOooO0O0));
                oooO.f118592OooOo00 = runnableC32902OooO0Oo;
            }
        }
    }

    public class OooO0OO implements Runnable {
        public OooO0OO() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            OooO.this.getClass();
            OooO oooO = OooO.this;
            oooO.f118585OooOOOO.execute(oooO.f118592OooOo00);
            synchronized (OooO.this.f118581OooOO0O) {
                OooO oooO2 = OooO.this;
                oooO2.f118598OooOoo = Integer.MAX_VALUE;
                oooO2.OooOOo();
            }
            OooO.this.getClass();
        }
    }

    /* JADX INFO: renamed from: oO0OO0OO.OooO$OooO0Oo, reason: case insensitive filesystem */
    public class RunnableC32902OooO0Oo implements Runnable {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final oO000OoO.OooO0O0 f118617OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final OooOO0O f118618OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public boolean f118620OooOoO0;

        public RunnableC32902OooO0Oo(oO000OoO.OooO0O0 oooO0O0) {
            Level level = Level.FINE;
            this.f118618OooOo0o = new OooOO0O();
            this.f118620OooOoO0 = true;
            this.f118617OooOo = oooO0O0;
        }

        @Override // java.lang.Runnable
        public final void run() {
            OooO oooO;
            o00Oo0 o00oo0OooO0oo;
            String name = Thread.currentThread().getName();
            Thread.currentThread().setName("OkHttpClientTransport");
            while (((OooO0o.OooO0OO) this.f118617OooOo).OooO00o(this)) {
                try {
                    C32069ooOO c32069ooOO = OooO.this.f118603Oooo000;
                    if (c32069ooOO != null) {
                        c32069ooOO.OooO00o();
                    }
                } catch (Throwable th) {
                    try {
                        OooO oooO2 = OooO.this;
                        EnumC32073OooO00o enumC32073OooO00o = EnumC32073OooO00o.PROTOCOL_ERROR;
                        o00Oo0 o00oo0OooO0oO = o00Oo0.f119723OooOOO.OooO0oo("error in frame handler").OooO0oO(th);
                        Map<EnumC32073OooO00o, o00Oo0> map = OooO.f118569Oooo;
                        oooO2.OooOOo0(0, enumC32073OooO00o, o00oo0OooO0oO);
                        try {
                            this.f118617OooOo.close();
                        } catch (IOException e) {
                            OooO.f118570OoooO00.log(Level.INFO, "Exception closing frame reader", (Throwable) e);
                        } catch (RuntimeException e2) {
                            if (!"bio == null".equals(e2.getMessage())) {
                                throw e2;
                            }
                        }
                        oooO = OooO.this;
                    } catch (Throwable th2) {
                        try {
                            this.f118617OooOo.close();
                        } catch (IOException e3) {
                            OooO.f118570OoooO00.log(Level.INFO, "Exception closing frame reader", (Throwable) e3);
                        } catch (RuntimeException e4) {
                            if (!"bio == null".equals(e4.getMessage())) {
                                throw e4;
                            }
                        }
                        OooO.this.f118579OooO0oo.OooO0O0();
                        Thread.currentThread().setName(name);
                        throw th2;
                    }
                }
            }
            synchronized (OooO.this.f118581OooOO0O) {
                o00oo0OooO0oo = OooO.this.f118593OooOo0O;
            }
            if (o00oo0OooO0oo == null) {
                o00oo0OooO0oo = o00Oo0.f119725OooOOOO.OooO0oo("End of stream or IOException");
            }
            OooO.this.OooOOo0(0, EnumC32073OooO00o.INTERNAL_ERROR, o00oo0OooO0oo);
            try {
                this.f118617OooOo.close();
            } catch (IOException e5) {
                OooO.f118570OoooO00.log(Level.INFO, "Exception closing frame reader", (Throwable) e5);
            } catch (RuntimeException e6) {
                if (!"bio == null".equals(e6.getMessage())) {
                    throw e6;
                }
            }
            oooO = OooO.this;
            oooO.f118579OooO0oo.OooO0O0();
            Thread.currentThread().setName(name);
        }
    }

    static {
        EnumMap enumMap = new EnumMap(EnumC32073OooO00o.class);
        EnumC32073OooO00o enumC32073OooO00o = EnumC32073OooO00o.NO_ERROR;
        o00Oo0 o00oo02 = o00Oo0.f119723OooOOO;
        enumMap.put(enumC32073OooO00o, o00oo02.OooO0oo("No error: A GRPC status of OK should have been sent"));
        enumMap.put(EnumC32073OooO00o.PROTOCOL_ERROR, o00oo02.OooO0oo("Protocol error"));
        enumMap.put(EnumC32073OooO00o.INTERNAL_ERROR, o00oo02.OooO0oo("Internal error"));
        enumMap.put(EnumC32073OooO00o.FLOW_CONTROL_ERROR, o00oo02.OooO0oo("Flow control error"));
        enumMap.put(EnumC32073OooO00o.STREAM_CLOSED, o00oo02.OooO0oo("Stream closed"));
        enumMap.put(EnumC32073OooO00o.FRAME_TOO_LARGE, o00oo02.OooO0oo("Frame too large"));
        enumMap.put(EnumC32073OooO00o.REFUSED_STREAM, o00Oo0.f119725OooOOOO.OooO0oo("Refused stream"));
        enumMap.put(EnumC32073OooO00o.CANCEL, o00Oo0.f119716OooO0o.OooO0oo("Cancelled"));
        enumMap.put(EnumC32073OooO00o.COMPRESSION_ERROR, o00oo02.OooO0oo("Compression error"));
        enumMap.put(EnumC32073OooO00o.CONNECT_ERROR, o00oo02.OooO0oo("Connect error"));
        enumMap.put(EnumC32073OooO00o.ENHANCE_YOUR_CALM, o00Oo0.f119721OooOO0O.OooO0oo("Enhance your calm"));
        enumMap.put(EnumC32073OooO00o.INADEQUATE_SECURITY, o00Oo0.f119714OooO.OooO0oo("Inadequate security"));
        f118569Oooo = Collections.unmodifiableMap(enumMap);
        f118570OoooO00 = Logger.getLogger(OooO.class.getName());
    }

    public OooO() {
        throw null;
    }

    public OooO(C32906OooO0o0.C20274OooO0o0 c20274OooO0o0, InetSocketAddress inetSocketAddress, String str, C33058OooO00o c33058OooO00o, C33078OooOoo0 c33078OooOoo0, OooO0o oooO0o) {
        C31989OoooO0O.C31990OooO0Oo c31990OooO0Oo = C31989OoooO0O.f114229OooOOo;
        oO000OoO.OooO0o oooO0o2 = new oO000OoO.OooO0o();
        this.f118575OooO0Oo = new Random();
        Object obj = new Object();
        this.f118581OooOO0O = obj;
        this.f118583OooOOO = new HashMap();
        this.f118598OooOoo = 0;
        this.f118600OooOooO = new LinkedList();
        this.f118608Oooo0o = new OooO00o();
        this.f118611Oooo0oo = SilentTokenCommand.ACQUIRE_TOKEN_SILENT_DEFAULT_TIMEOUT_MILLISECONDS;
        this.f118572OooO00o = (InetSocketAddress) Preconditions.checkNotNull(inetSocketAddress, "address");
        this.f118573OooO0O0 = str;
        this.f118587OooOOo = c20274OooO0o0.f118678OooOooO;
        this.f118576OooO0o = c20274OooO0o0.f118683Oooo00o;
        this.f118585OooOOOO = (Executor) Preconditions.checkNotNull(c20274OooO0o0.f118671OooOo, "executor");
        this.f118586OooOOOo = new ExecutorC32039o0000Oo(c20274OooO0o0.f118671OooOo);
        this.f118588OooOOo0 = (ScheduledExecutorService) Preconditions.checkNotNull(c20274OooO0o0.f118673OooOoO, "scheduledExecutorService");
        this.f118584OooOOO0 = 3;
        this.f118597OooOoOO = SocketFactory.getDefault();
        this.f118599OooOoo0 = c20274OooO0o0.f118677OooOoo0;
        this.f118601OooOooo = (C33131OooO0O0) Preconditions.checkNotNull(c20274OooO0o0.f118676OooOoo, "connectionSpec");
        this.f118577OooO0o0 = (Supplier) Preconditions.checkNotNull(c31990OooO0Oo, "stopwatchFactory");
        this.f118578OooO0oO = (oO000OoO.OooO) Preconditions.checkNotNull(oooO0o2, "variant");
        this.f118574OooO0OO = "grpc-java-okhttp/1.62.2";
        this.f118610Oooo0oO = c33078OooOoo0;
        this.f118606Oooo0O0 = (Runnable) Preconditions.checkNotNull(oooO0o, "tooManyPingsRunnable");
        this.f118607Oooo0OO = c20274OooO0o0.f118680Oooo0;
        c20274OooO0o0.f118675OooOoOO.getClass();
        o000 o000Var = new o000(0);
        this.f118609Oooo0o0 = o000Var;
        this.f118582OooOO0o = C33082Oooo00O.OooO00o(OooO.class, inetSocketAddress.toString());
        C33058OooO00o c33058OooO00o2 = C33058OooO00o.f119518OooO0O0;
        C33058OooO00o.OooO0O0<C33058OooO00o> oooO0O0 = C31987OoooO0.f114212OooO0O0;
        IdentityHashMap identityHashMap = new IdentityHashMap(1);
        identityHashMap.put(oooO0O0, c33058OooO00o);
        for (Map.Entry<C33058OooO00o.OooO0O0<?>, Object> entry : c33058OooO00o2.f119519OooO00o.entrySet()) {
            if (!identityHashMap.containsKey(entry.getKey())) {
                identityHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        this.f118591OooOo0 = new C33058OooO00o(identityHashMap);
        synchronized (obj) {
            o000Var.f114314OooO0O0 = (o000.OooO0O0) Preconditions.checkNotNull(new OooOO0());
        }
    }

    public static void OooO0oO(OooO oooO, String str) {
        EnumC32073OooO00o enumC32073OooO00o = EnumC32073OooO00o.PROTOCOL_ERROR;
        oooO.getClass();
        oooO.OooOOo0(0, enumC32073OooO00o, OooOo0(enumC32073OooO00o).OooO0O0(str));
    }

    public static Socket OooO0oo(OooO oooO, InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, String str, String str2) throws o00Ooo {
        oooO.getClass();
        Socket socket = null;
        try {
            InetAddress address = inetSocketAddress2.getAddress();
            SocketFactory socketFactory = oooO.f118597OooOoOO;
            Socket socketCreateSocket = address != null ? socketFactory.createSocket(inetSocketAddress2.getAddress(), inetSocketAddress2.getPort()) : socketFactory.createSocket(inetSocketAddress2.getHostName(), inetSocketAddress2.getPort());
            try {
                socketCreateSocket.setTcpNoDelay(true);
                socketCreateSocket.setSoTimeout(oooO.f118611Oooo0oo);
                InterfaceC34548OooOoo0 interfaceC34548OooOoo0OooO0oO = C34535OooOOOo.OooO0oO(socketCreateSocket);
                C34540OooOo0 c34540OooOo0OooO00o = C34535OooOOOo.OooO00o(C34535OooOOOo.OooO0Oo(socketCreateSocket));
                C33057OooO0O0 c33057OooO0O0OooO = oooO.OooO(inetSocketAddress, str, str2);
                C33133OooO0Oo c33133OooO0Oo = c33057OooO0O0OooO.f119511OooO0O0;
                C33056OooO00o c33056OooO00o = c33057OooO0O0OooO.f119510OooO00o;
                Locale locale = Locale.US;
                c34540OooOo0OooO00o.o00000Oo("CONNECT " + c33056OooO00o.f119504OooO00o + C18241k5.f55433h + c33056OooO00o.f119505OooO0O0 + " HTTP/1.1");
                c34540OooOo0OooO00o.o00000Oo(IOUtils.LINE_SEPARATOR_WINDOWS);
                int length = c33133OooO0Oo.f119819OooO00o.length / 2;
                for (int i = 0; i < length; i++) {
                    int i2 = i * 2;
                    String[] strArr = c33133OooO0Oo.f119819OooO00o;
                    c34540OooOo0OooO00o.o00000Oo((i2 < 0 || i2 >= strArr.length) ? null : strArr[i2]);
                    c34540OooOo0OooO00o.o00000Oo(": ");
                    int i3 = i2 + 1;
                    c34540OooOo0OooO00o.o00000Oo((i3 < 0 || i3 >= strArr.length) ? null : strArr[i3]);
                    c34540OooOo0OooO00o.o00000Oo(IOUtils.LINE_SEPARATOR_WINDOWS);
                }
                c34540OooOo0OooO00o.o00000Oo(IOUtils.LINE_SEPARATOR_WINDOWS);
                c34540OooOo0OooO00o.flush();
                C33142OooOO0o c33142OooOO0oOooO00o = C33142OooOO0o.OooO00o(OooOOOO(interfaceC34548OooOoo0OooO0oO));
                while (!OooOOOO(interfaceC34548OooOoo0OooO0oO).equals("")) {
                }
                int i4 = c33142OooOO0oOooO00o.f119856OooO0O0;
                if (i4 >= 200 && i4 < 300) {
                    socketCreateSocket.setSoTimeout(0);
                    return socketCreateSocket;
                }
                C34524OooO0Oo c34524OooO0Oo = new C34524OooO0Oo();
                try {
                    socketCreateSocket.shutdownOutput();
                    interfaceC34548OooOoo0OooO0oO.read(c34524OooO0Oo, 1024L);
                } catch (IOException e) {
                    c34524OooO0Oo.o000Oo0o("Unable to read body: " + e.toString());
                }
                try {
                    socketCreateSocket.close();
                } catch (IOException unused) {
                }
                Locale locale2 = Locale.US;
                throw new o00Ooo(o00Oo0.f119725OooOOOO.OooO0oo("Response returned from proxy was not successful (expected 2xx, got " + i4 + " " + c33142OooOO0oOooO00o.f119857OooO0OO + "). Response body:\n" + c34524OooO0Oo.o00000OO()));
            } catch (IOException e2) {
                e = e2;
                socket = socketCreateSocket;
                if (socket != null) {
                    C31989OoooO0O.OooO0O0(socket);
                }
                throw new o00Ooo(o00Oo0.f119725OooOOOO.OooO0oo("Failed trying to connect with proxy").OooO0oO(e));
            }
        } catch (IOException e3) {
            e = e3;
        }
    }

    public static String OooOOOO(InterfaceC34548OooOoo0 interfaceC34548OooOoo0) throws IOException {
        C34524OooO0Oo c34524OooO0Oo = new C34524OooO0Oo();
        while (interfaceC34548OooOoo0.read(c34524OooO0Oo, 1L) != -1) {
            if (c34524OooO0Oo.OooOooo(c34524OooO0Oo.f123723OooOo - 1) == 10) {
                return c34524OooO0Oo.o000000o(LocationRequestCompat.PASSIVE_INTERVAL);
            }
        }
        throw new EOFException("\\n not found: " + c34524OooO0Oo.OoooO0O(c34524OooO0Oo.f123723OooOo).OooO0Oo());
    }

    public static o00Oo0 OooOo0(EnumC32073OooO00o enumC32073OooO00o) {
        o00Oo0 o00oo02 = f118569Oooo.get(enumC32073OooO00o);
        if (o00oo02 != null) {
            return o00oo02;
        }
        return o00Oo0.f119718OooO0oO.OooO0oo("Unknown http2 error code: " + enumC32073OooO00o.f114847OooOo0o);
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0199 A[EDGE_INSN: B:108:0x0199->B:160:0x0243 BREAK  A[LOOP:9: B:147:0x0220->B:158:0x023f]] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x012c A[ADDED_TO_REGION, EDGE_INSN: B:203:0x012c->B:83:0x012c BREAK  A[LOOP:2: B:28:0x0090->B:98:0x015e], REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:226:0x012c A[EDGE_INSN: B:226:0x012c->B:83:0x012c BREAK  A[LOOP:7: B:52:0x00d1->B:80:0x0119], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0112 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0119 A[LOOP:7: B:52:0x00d1->B:80:0x0119, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x015a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C33057OooO0O0 OooO(InetSocketAddress inetSocketAddress, String str, String str2) {
        String strSubstring;
        String strO00000OO;
        int i;
        int i2;
        InetAddress byAddress;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        C33056OooO00o.C20296OooO00o c20296OooO00o = new C33056OooO00o.C20296OooO00o();
        c20296OooO00o.f119509OooO0OO = -1;
        c20296OooO00o.f119507OooO00o = AuthenticationConstants.HTTPS_PROTOCOL_STRING;
        String hostName = inetSocketAddress.getHostName();
        if (hostName == null) {
            throw new IllegalArgumentException("host == null");
        }
        int length = hostName.length();
        int i9 = 0;
        int iCharCount = 0;
        while (true) {
            if (iCharCount >= length) {
                strSubstring = hostName.substring(0, length);
                break;
            }
            if (hostName.charAt(iCharCount) != '%') {
                iCharCount++;
            } else {
                C34524OooO0Oo c34524OooO0Oo = new C34524OooO0Oo();
                c34524OooO0Oo.o000Oo0O(0, iCharCount, hostName);
                while (iCharCount < length) {
                    int iCodePointAt = hostName.codePointAt(iCharCount);
                    if (iCodePointAt != 37 || (i8 = iCharCount + 2) >= length) {
                        c34524OooO0Oo.o000Oo(iCodePointAt);
                    } else {
                        int iOooO00o = C33056OooO00o.OooO00o(hostName.charAt(iCharCount + 1));
                        int iOooO00o2 = C33056OooO00o.OooO00o(hostName.charAt(i8));
                        if (iOooO00o != -1 && iOooO00o2 != -1) {
                            c34524OooO0Oo.o0OoO0o((iOooO00o << 4) + iOooO00o2);
                            iCharCount = i8;
                        }
                    }
                    iCharCount += Character.charCount(iCodePointAt);
                }
                strSubstring = c34524OooO0Oo.o00000OO();
            }
        }
        if (!strSubstring.startsWith("[") || !strSubstring.endsWith("]")) {
            try {
                String lowerCase = IDN.toASCII(strSubstring).toLowerCase(Locale.US);
                if (!lowerCase.isEmpty()) {
                    for (int i10 = 0; i10 < lowerCase.length(); i10++) {
                        char cCharAt = lowerCase.charAt(i10);
                        if (cCharAt > 31 && cCharAt < 127 && " #%/:?@[\\]".indexOf(cCharAt) == -1) {
                        }
                    }
                    strO00000OO = lowerCase;
                }
            } catch (IllegalArgumentException unused) {
            }
            strO00000OO = null;
            break;
        }
        int length2 = strSubstring.length() - 1;
        int i11 = 16;
        byte[] bArr = new byte[16];
        int i12 = -1;
        int i13 = -1;
        int i14 = 0;
        int i15 = 1;
        while (i15 < length2) {
            if (i14 != i11) {
                int i16 = i15 + 2;
                char c = 2;
                if (i16 > length2 || !strSubstring.regionMatches(i15, "::", i9, 2)) {
                    if (i14 == 0) {
                        i6 = i15;
                        int i17 = 0;
                        while (i6 < length2) {
                        }
                        i7 = i6 - i15;
                        if (i7 != 0) {
                            break;
                        }
                        break;
                        break;
                    }
                    if (strSubstring.regionMatches(i15, C18241k5.f55433h, i9, 1)) {
                        i15++;
                        i6 = i15;
                        int i172 = 0;
                        while (i6 < length2) {
                            int iOooO00o3 = C33056OooO00o.OooO00o(strSubstring.charAt(i6));
                            char c2 = c;
                            if (iOooO00o3 == -1) {
                                break;
                            }
                            i172 = (i172 << 4) + iOooO00o3;
                            i6++;
                            c = c2;
                        }
                        i7 = i6 - i15;
                        if (i7 != 0 || i7 > 4) {
                            break;
                        }
                        int i18 = i14 + 1;
                        bArr[i14] = (byte) (255 & (i172 >>> 8));
                        i14 += 2;
                        bArr[i18] = (byte) (i172 & 255);
                        i13 = i15;
                        i11 = 16;
                        i15 = i6;
                        i9 = 0;
                    } else if (strSubstring.regionMatches(i15, ".", i9, 1)) {
                        int i19 = i14 - 2;
                        int i20 = i19;
                        int i21 = i13;
                        loop7: while (true) {
                            if (i21 >= length2) {
                                int i22 = i12;
                                if (i20 == i14 + 2) {
                                    i14 += 2;
                                    i12 = i22;
                                }
                            } else {
                                if (i20 == 16) {
                                    break;
                                }
                                if (i20 == i19) {
                                    i3 = i21;
                                    int i23 = 0;
                                    while (true) {
                                        i4 = i19;
                                        if (i3 < length2) {
                                            i5 = i12;
                                            break;
                                        }
                                        char cCharAt2 = strSubstring.charAt(i3);
                                        i5 = i12;
                                        if (cCharAt2 < '0' || cCharAt2 > '9') {
                                            break;
                                        }
                                        if ((i23 == 0 && i21 != i3) || ((i23 * 10) + cCharAt2) - 48 > 255) {
                                            break loop7;
                                        }
                                        i3++;
                                        i19 = i4;
                                        i12 = i5;
                                    }
                                    if (i3 - i21 != 0) {
                                        break;
                                    }
                                    bArr[i20] = (byte) i23;
                                    i20++;
                                    i21 = i3;
                                    i19 = i4;
                                    i12 = i5;
                                } else {
                                    if (strSubstring.charAt(i21) != '.') {
                                        break;
                                    }
                                    i21++;
                                    i3 = i21;
                                    int i232 = 0;
                                    while (true) {
                                        i4 = i19;
                                        if (i3 < length2) {
                                        }
                                        i3++;
                                        i19 = i4;
                                        i12 = i5;
                                    }
                                    if (i3 - i21 != 0) {
                                    }
                                }
                            }
                        }
                    }
                } else if (i12 == -1) {
                    i14 += 2;
                    if (i16 == length2) {
                        i12 = i14;
                        i = 16;
                        break;
                    }
                    i15 = i16;
                    i12 = i14;
                    i6 = i15;
                    int i1722 = 0;
                    while (i6 < length2) {
                    }
                    i7 = i6 - i15;
                    if (i7 != 0) {
                    }
                }
            }
            i2 = i9;
            break;
        }
        i = i11;
        try {
            if (i14 != i) {
                if (i12 != -1) {
                    int i24 = i14 - i12;
                    System.arraycopy(bArr, i12, bArr, 16 - i24, i24);
                    i2 = 0;
                    Arrays.fill(bArr, i12, (16 - i14) + i12, (byte) 0);
                }
                i2 = 0;
                byAddress = null;
                if (byAddress != null) {
                    strO00000OO = null;
                    break;
                }
                byte[] address = byAddress.getAddress();
                int i25 = 16;
                if (address.length != 16) {
                    throw new AssertionError();
                }
                int i26 = i2;
                int i27 = i26;
                int i28 = -1;
                while (i26 < address.length) {
                    int i29 = i26;
                    while (i29 < i25 && address[i29] == 0 && address[i29 + 1] == 0) {
                        i29 += 2;
                        i25 = 16;
                    }
                    int i30 = i29 - i26;
                    if (i30 > i27) {
                        i28 = i26;
                        i27 = i30;
                    }
                    i26 = i29 + 2;
                    i25 = 16;
                }
                C34524OooO0Oo c34524OooO0Oo2 = new C34524OooO0Oo();
                while (i2 < address.length) {
                    if (i2 == i28) {
                        c34524OooO0Oo2.o0OoO0o(58);
                        i2 += i27;
                        if (i2 == 16) {
                            c34524OooO0Oo2.o0OoO0o(58);
                        }
                    } else {
                        if (i2 > 0) {
                            c34524OooO0Oo2.o0OoO0o(58);
                        }
                        c34524OooO0Oo2.o000OOO(((address[i2] & 255) << 8) | (address[i2 + 1] & 255));
                        i2 += 2;
                    }
                }
                strO00000OO = c34524OooO0Oo2.o00000OO();
            } else {
                i2 = 0;
            }
            byAddress = InetAddress.getByAddress(bArr);
            if (byAddress != null) {
            }
        } catch (UnknownHostException unused2) {
            throw new AssertionError();
        }
        if (strO00000OO == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(hostName));
        }
        c20296OooO00o.f119508OooO0O0 = strO00000OO;
        int port = inetSocketAddress.getPort();
        if (port <= 0 || port > 65535) {
            throw new IllegalArgumentException(C21532OooOOo.OooO0OO(port, "unexpected port: "));
        }
        c20296OooO00o.f119509OooO0OO = port;
        if (c20296OooO00o.f119508OooO0O0 == null) {
            throw new IllegalStateException("host == null");
        }
        C33056OooO00o c33056OooO00o = new C33056OooO00o(c20296OooO00o);
        C33057OooO0O0.OooO00o oooO00o = new C33057OooO0O0.OooO00o();
        oooO00o.f119513OooO0O0 = new C33133OooO0Oo.OooO00o();
        oooO00o.f119512OooO00o = c33056OooO00o;
        oooO00o.OooO00o("Host", c33056OooO00o.f119504OooO00o + C18241k5.f55433h + c33056OooO00o.f119505OooO0O0);
        oooO00o.OooO00o("User-Agent", this.f118574OooO0OO);
        if (str != null && str2 != null) {
            try {
                oooO00o.OooO00o(HttpHeaders.PROXY_AUTHORIZATION, "Basic " + C34527OooO0oO.OooO0oO((str + C18241k5.f55433h + str2).getBytes("ISO-8859-1")).OooO00o());
            } catch (UnsupportedEncodingException unused3) {
                throw new AssertionError();
            }
        }
        if (oooO00o.f119512OooO00o != null) {
            return new C33057OooO0O0(oooO00o);
        }
        throw new IllegalStateException("url == null");
    }

    @Override // oO0OO0OO.C32912OooOOo.OooO0OO
    public final C32912OooOOo.OooO0O0[] OooO00o() {
        C32912OooOOo.OooO0O0[] oooO0O0Arr;
        C32912OooOOo.OooO0O0 oooO0O0;
        synchronized (this.f118581OooOO0O) {
            oooO0O0Arr = new C32912OooOOo.OooO0O0[this.f118583OooOOO.size()];
            Iterator it = this.f118583OooOOO.values().iterator();
            int i = 0;
            while (it.hasNext()) {
                int i2 = i + 1;
                C32909OooO0oo.OooO0O0 oooO0O02 = ((C32909OooO0oo) it.next()).f118690OooOO0o;
                synchronized (oooO0O02.f118697OooOo0o) {
                    oooO0O0 = oooO0O02.f118709Oooo0O0;
                }
                oooO0O0Arr[i] = oooO0O0;
                i = i2;
            }
        }
        return oooO0O0Arr;
    }

    @Override // oO000Oo.o000000
    public final void OooO0O0(o00Oo0 o00oo02) {
        OooO0o(o00oo02);
        synchronized (this.f118581OooOO0O) {
            try {
                Iterator it = this.f118583OooOOO.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    it.remove();
                    ((C32909OooO0oo) entry.getValue()).f118690OooOO0o.OooO(o00oo02, false, new C33094OoooO());
                    OooOOO((C32909OooO0oo) entry.getValue());
                }
                for (C32909OooO0oo c32909OooO0oo : this.f118600OooOooO) {
                    c32909OooO0oo.f118690OooOO0o.OooO0oo(o00oo02, InterfaceC31948OooOOoo.OooO00o.f114035OooOoO, true, new C33094OoooO());
                    OooOOO(c32909OooO0oo);
                }
                this.f118600OooOooO.clear();
                OooOo00();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // oO0OOo0o.Oooo000
    public final C33082Oooo00O OooO0OO() {
        return this.f118582OooOO0o;
    }

    @Override // oO000Oo.OooOo00
    public final InterfaceC31946OooOOo OooO0Oo(C33101OoooOO0 c33101OoooOO0, C33094OoooO c33094OoooO, oO0OOo0o.OooO0OO oooO0OO, oO0OOo0o.OooO[] oooOArr) {
        C32909OooO0oo c32909OooO0oo;
        Preconditions.checkNotNull(c33101OoooOO0, "method");
        Preconditions.checkNotNull(c33094OoooO, "headers");
        C33058OooO00o c33058OooO00o = this.f118591OooOo0;
        C32043o0000o c32043o0000o = new C32043o0000o(oooOArr);
        for (oO0OOo0o.OooO oooO : oooOArr) {
            oooO.o00O0O(c33058OooO00o, c33094OoooO);
        }
        synchronized (this.f118581OooOO0O) {
            c32909OooO0oo = new C32909OooO0oo(c33101OoooOO0, c33094OoooO, this.f118571OooO, this, this.f118580OooOO0, this.f118581OooOO0O, this.f118587OooOOo, this.f118576OooO0o, this.f118573OooO0O0, this.f118574OooO0OO, c32043o0000o, this.f118609Oooo0o0, oooO0OO);
        }
        return c32909OooO0oo;
    }

    @Override // oO000Oo.o000000
    public final void OooO0o(o00Oo0 o00oo02) {
        synchronized (this.f118581OooOO0O) {
            try {
                if (this.f118593OooOo0O != null) {
                    return;
                }
                this.f118593OooOo0O = o00oo02;
                this.f118579OooO0oo.OooO0OO(o00oo02);
                OooOo00();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // oO000Oo.o000000
    public final Runnable OooO0o0(o000000.OooO00o oooO00o) {
        this.f118579OooO0oo = (o000000.OooO00o) Preconditions.checkNotNull(oooO00o, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        if (this.f118604Oooo00O) {
            C32069ooOO c32069ooOO = new C32069ooOO(new C32069ooOO.OooO0OO(this), this.f118588OooOOo0, this.f118605Oooo00o, this.f118602Oooo0);
            this.f118603Oooo000 = c32069ooOO;
            synchronized (c32069ooOO) {
            }
        }
        oO0OO0OO.OooO00o oooO00o2 = new oO0OO0OO.OooO00o(this.f118586OooOOOo, this);
        OooO00o.C32903OooO0Oo c32903OooO0Oo = oooO00o2.new C32903OooO0Oo(this.f118578OooO0oO.OooO0O0(C34535OooOOOo.OooO00o(oooO00o2)));
        synchronized (this.f118581OooOO0O) {
            oO0OO0OO.OooO0O0 oooO0O0 = new oO0OO0OO.OooO0O0(this, c32903OooO0Oo);
            this.f118571OooO = oooO0O0;
            this.f118580OooOO0 = new C32912OooOOo(this, oooO0O0);
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.f118586OooOOOo.execute(new OooO0O0(countDownLatch, oooO00o2));
        try {
            OooOOOo();
            countDownLatch.countDown();
            this.f118586OooOOOo.execute(new OooO0OO());
            return null;
        } catch (Throwable th) {
            countDownLatch.countDown();
            throw th;
        }
    }

    public final void OooOO0(int i, o00Oo0 o00oo02, InterfaceC31948OooOOoo.OooO00o oooO00o, boolean z, EnumC32073OooO00o enumC32073OooO00o, C33094OoooO c33094OoooO) {
        synchronized (this.f118581OooOO0O) {
            try {
                C32909OooO0oo c32909OooO0oo = (C32909OooO0oo) this.f118583OooOOO.remove(Integer.valueOf(i));
                if (c32909OooO0oo != null) {
                    if (enumC32073OooO00o != null) {
                        this.f118571OooO.Ooooooo(i, EnumC32073OooO00o.CANCEL);
                    }
                    if (o00oo02 != null) {
                        C32909OooO0oo.OooO0O0 oooO0O0 = c32909OooO0oo.f118690OooOO0o;
                        if (c33094OoooO == null) {
                            c33094OoooO = new C33094OoooO();
                        }
                        oooO0O0.OooO0oo(o00oo02, oooO00o, z, c33094OoooO);
                    }
                    if (!OooOOo()) {
                        OooOo00();
                        OooOOO(c32909OooO0oo);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int OooOO0O() {
        URI uriOooO00o = C31989OoooO0O.OooO00o(this.f118573OooO0O0);
        return uriOooO00o.getPort() != -1 ? uriOooO00o.getPort() : this.f118572OooO00o.getPort();
    }

    public final o00Ooo OooOO0o() {
        synchronized (this.f118581OooOO0O) {
            o00Oo0 o00oo02 = this.f118593OooOo0O;
            if (o00oo02 != null) {
                return new o00Ooo(o00oo02);
            }
            return new o00Ooo(o00Oo0.f119725OooOOOO.OooO0oo("Connection closed"));
        }
    }

    public final void OooOOO(C32909OooO0oo c32909OooO0oo) {
        if (this.f118595OooOoO && this.f118600OooOooO.isEmpty() && this.f118583OooOOO.isEmpty()) {
            this.f118595OooOoO = false;
            C32069ooOO c32069ooOO = this.f118603Oooo000;
            if (c32069ooOO != null) {
                synchronized (c32069ooOO) {
                    try {
                        C32069ooOO.EnumC32071OooO0o0 enumC32071OooO0o0 = c32069ooOO.f114803OooO0Oo;
                        if (enumC32071OooO0o0 == C32069ooOO.EnumC32071OooO0o0.f114813OooOo || enumC32071OooO0o0 == C32069ooOO.EnumC32071OooO0o0.f114816OooOoO0) {
                            c32069ooOO.f114803OooO0Oo = C32069ooOO.EnumC32071OooO0o0.f114814OooOo0o;
                        }
                        if (c32069ooOO.f114803OooO0Oo == C32069ooOO.EnumC32071OooO0o0.f114815OooOoO) {
                            c32069ooOO.f114803OooO0Oo = C32069ooOO.EnumC32071OooO0o0.f114817OooOoOO;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        if (c32909OooO0oo.f113925OooO0OO) {
            this.f118608Oooo0o.o00000OO(c32909OooO0oo, false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean OooOOO0(int i) {
        boolean z;
        synchronized (this.f118581OooOO0O) {
            if (i < this.f118584OooOOO0) {
                z = true;
                if ((i & 1) != 1) {
                    z = false;
                }
            }
        }
        return z;
    }

    public final void OooOOOo() {
        synchronized (this.f118581OooOO0O) {
            try {
                this.f118571OooO.OooOoO0();
                C32078OooO0oo c32078OooO0oo = new C32078OooO0oo();
                c32078OooO0oo.OooO0O0(7, this.f118576OooO0o);
                this.f118571OooO.OoooO0(c32078OooO0oo);
                if (this.f118576OooO0o > 65535) {
                    this.f118571OooO.o00000O(0, r1 - 65535);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean OooOOo() {
        boolean z = false;
        while (true) {
            LinkedList linkedList = this.f118600OooOooO;
            if (linkedList.isEmpty() || this.f118583OooOOO.size() >= this.f118598OooOoo) {
                break;
            }
            OooOOoo((C32909OooO0oo) linkedList.poll());
            z = true;
        }
        return z;
    }

    public final void OooOOo0(int i, EnumC32073OooO00o enumC32073OooO00o, o00Oo0 o00oo02) {
        synchronized (this.f118581OooOO0O) {
            try {
                if (this.f118593OooOo0O == null) {
                    this.f118593OooOo0O = o00oo02;
                    this.f118579OooO0oo.OooO0OO(o00oo02);
                }
                if (enumC32073OooO00o != null && !this.f118594OooOo0o) {
                    this.f118594OooOo0o = true;
                    this.f118571OooO.OooOoO(enumC32073OooO00o, new byte[0]);
                }
                Iterator it = this.f118583OooOOO.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (((Integer) entry.getKey()).intValue() > i) {
                        it.remove();
                        ((C32909OooO0oo) entry.getValue()).f118690OooOO0o.OooO0oo(o00oo02, InterfaceC31948OooOOoo.OooO00o.f114033OooOo, false, new C33094OoooO());
                        OooOOO((C32909OooO0oo) entry.getValue());
                    }
                }
                for (C32909OooO0oo c32909OooO0oo : this.f118600OooOooO) {
                    c32909OooO0oo.f118690OooOO0o.OooO0oo(o00oo02, InterfaceC31948OooOOoo.OooO00o.f114035OooOoO, true, new C33094OoooO());
                    OooOOO(c32909OooO0oo);
                }
                this.f118600OooOooO.clear();
                OooOo00();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void OooOOoo(C32909OooO0oo c32909OooO0oo) {
        boolean zOooO0o0;
        Preconditions.checkState(c32909OooO0oo.f118690OooOO0o.f118710Oooo0OO == -1, "StreamId already assigned");
        this.f118583OooOOO.put(Integer.valueOf(this.f118584OooOOO0), c32909OooO0oo);
        if (!this.f118595OooOoO) {
            this.f118595OooOoO = true;
            C32069ooOO c32069ooOO = this.f118603Oooo000;
            if (c32069ooOO != null) {
                c32069ooOO.OooO0O0();
            }
        }
        if (c32909OooO0oo.f113925OooO0OO) {
            this.f118608Oooo0o.o00000OO(c32909OooO0oo, true);
        }
        C32909OooO0oo.OooO0O0 oooO0O0 = c32909OooO0oo.f118690OooOO0o;
        int i = this.f118584OooOOO0;
        Preconditions.checkState(oooO0O0.f118710Oooo0OO == -1, "the stream has been started with id %s", i);
        oooO0O0.f118710Oooo0OO = i;
        C32912OooOOo c32912OooOOo = oooO0O0.f118706Oooo000;
        oooO0O0.f118709Oooo0O0 = c32912OooOOo.new OooO0O0(i, c32912OooOOo.f118742OooO0OO, (C32912OooOOo.OooO00o) Preconditions.checkNotNull(oooO0O0, "stream"));
        C32909OooO0oo.OooO0O0 oooO0O02 = C32909OooO0oo.this.f118690OooOO0o;
        Preconditions.checkState(oooO0O02.f113936OooOO0 != null);
        synchronized (oooO0O02.f113950OooO0O0) {
            Preconditions.checkState(!oooO0O02.f113953OooO0o, "Already allocated");
            oooO0O02.f113953OooO0o = true;
        }
        synchronized (oooO0O02.f113950OooO0O0) {
            zOooO0o0 = oooO0O02.OooO0o0();
        }
        if (zOooO0o0) {
            oooO0O02.f113936OooOO0.onReady();
        }
        o000 o000Var = oooO0O02.f113951OooO0OO;
        o000Var.getClass();
        o000Var.f114313OooO00o.OooO00o();
        if (oooO0O0.f118708Oooo00o) {
            oooO0O0.f118704OooOooo.OoooO00(oooO0O0.f118695OooOo, oooO0O0.f118710Oooo0OO, C32909OooO0oo.this.f118693OooOOOO);
            for (AbstractC21138OooO0oo abstractC21138OooO0oo : C32909OooO0oo.this.f118688OooOO0.f114553OooO00o) {
                ((oO0OOo0o.OooO) abstractC21138OooO0oo).ooOO();
            }
            oooO0O0.f118695OooOo = null;
            C34524OooO0Oo c34524OooO0Oo = oooO0O0.f118699OooOoO0;
            if (c34524OooO0Oo.f123723OooOo > 0) {
                oooO0O0.f118706Oooo000.OooO00o(oooO0O0.f118698OooOoO, oooO0O0.f118709Oooo0O0, c34524OooO0Oo, oooO0O0.f118700OooOoOO);
            }
            oooO0O0.f118708Oooo00o = false;
        }
        C33101OoooOO0.OooO0OO oooO0OO = c32909OooO0oo.f118687OooO0oo.f119666OooO00o;
        if ((oooO0OO != C33101OoooOO0.OooO0OO.f119678OooOo0o && oooO0OO != C33101OoooOO0.OooO0OO.f119677OooOo) || c32909OooO0oo.f118693OooOOOO) {
            this.f118571OooO.flush();
        }
        int i2 = this.f118584OooOOO0;
        if (i2 < 2147483645) {
            this.f118584OooOOO0 = i2 + 2;
        } else {
            this.f118584OooOOO0 = Integer.MAX_VALUE;
            OooOOo0(Integer.MAX_VALUE, EnumC32073OooO00o.NO_ERROR, o00Oo0.f119725OooOOOO.OooO0oo("Stream ids exhausted"));
        }
    }

    public final void OooOo00() {
        if (this.f118593OooOo0O == null || !this.f118583OooOOO.isEmpty() || !this.f118600OooOooO.isEmpty() || this.f118596OooOoO0) {
            return;
        }
        this.f118596OooOoO0 = true;
        C32069ooOO c32069ooOO = this.f118603Oooo000;
        if (c32069ooOO != null) {
            synchronized (c32069ooOO) {
                try {
                    C32069ooOO.EnumC32071OooO0o0 enumC32071OooO0o0 = c32069ooOO.f114803OooO0Oo;
                    C32069ooOO.EnumC32071OooO0o0 enumC32071OooO0o02 = C32069ooOO.EnumC32071OooO0o0.f114819OooOoo0;
                    if (enumC32071OooO0o0 != enumC32071OooO0o02) {
                        c32069ooOO.f114803OooO0Oo = enumC32071OooO0o02;
                        ScheduledFuture<?> scheduledFuture = c32069ooOO.f114805OooO0o0;
                        if (scheduledFuture != null) {
                            scheduledFuture.cancel(false);
                        }
                        ScheduledFuture<?> scheduledFuture2 = c32069ooOO.f114804OooO0o;
                        if (scheduledFuture2 != null) {
                            scheduledFuture2.cancel(false);
                            c32069ooOO.f114804OooO0o = null;
                        }
                    }
                } finally {
                }
            }
        }
        C31997OoooOo0 c31997OoooOo0 = this.f118590OooOo;
        if (c31997OoooOo0 != null) {
            o00Ooo o00oooOooOO0o = OooOO0o();
            synchronized (c31997OoooOo0) {
                try {
                    if (!c31997OoooOo0.f114247OooO0Oo) {
                        c31997OoooOo0.f114247OooO0Oo = true;
                        c31997OoooOo0.f114249OooO0o0 = o00oooOooOO0o;
                        LinkedHashMap linkedHashMap = c31997OoooOo0.f114246OooO0OO;
                        c31997OoooOo0.f114246OooO0OO = null;
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            try {
                                ((Executor) entry.getValue()).execute(new RunnableC31996OoooOOo((OooOo00.OooO00o) entry.getKey(), o00oooOooOO0o));
                            } catch (Throwable th) {
                                C31997OoooOo0.f114243OooO0oO.log(Level.SEVERE, "Failed to execute PingCallback", th);
                            }
                        }
                    }
                } finally {
                }
            }
            this.f118590OooOo = null;
        }
        if (!this.f118594OooOo0o) {
            this.f118594OooOo0o = true;
            this.f118571OooO.OooOoO(EnumC32073OooO00o.NO_ERROR, new byte[0]);
        }
        this.f118571OooO.close();
    }

    @Override // oO000Oo.InterfaceC31954OooOo0o
    public final C33058OooO00o getAttributes() {
        return this.f118591OooOo0;
    }

    @Override // oO0OO0OO.OooO0O0.OooO00o
    public final void onException(Exception exc) {
        Preconditions.checkNotNull(exc, "failureCause");
        OooOOo0(0, EnumC32073OooO00o.INTERNAL_ERROR, o00Oo0.f119725OooOOOO.OooO0oO(exc));
    }

    public final String toString() {
        return MoreObjects.toStringHelper(this).add("logId", this.f118582OooOO0o.f119622OooO0OO).add("address", this.f118572OooO00o).toString();
    }
}
