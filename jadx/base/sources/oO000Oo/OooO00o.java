package oO000Oo;

import Oooo0oo.AbstractC21138OooO0oo;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.common.base.Preconditions;
import com.google.common.p563io.ByteStreams;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import oO000Oo.AbstractC31936OooO0Oo;
import oO000Oo.C32012o000000o;
import oO000Oo.InterfaceC31948OooOOoo;
import oO0OO0OO.C32909OooO0oo;
import oO0OO0OO.C32911OooOOOo;
import oO0OO0OO.C32914OooOOo0;
import oO0OOo0o.C33068OooOOo;
import oO0OOo0o.C33076OooOoOO;
import oO0OOo0o.C33094OoooO;
import oO0OOo0o.InterfaceC33064OooOO0o;
import oO0OOo0o.InterfaceC33070OooOOoo;
import oO0OOo0o.OooOO0O;
import oO0OOo0o.OooOo00;
import oOo00OoO.C34524OooO0Oo;

/* JADX INFO: loaded from: classes10.dex */
public abstract class OooO00o extends AbstractC31936OooO0Oo implements InterfaceC31946OooOOo, C32012o000000o.OooO0OO {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final Logger f113922OooO0oO = Logger.getLogger(OooO00o.class.getName());

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o000 f113923OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final InterfaceC31988OoooO00 f113924OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f113925OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f113926OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public volatile boolean f113927OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public C33094OoooO f113928OooO0o0;

    /* JADX INFO: renamed from: oO000Oo.OooO00o$OooO00o, reason: collision with other inner class name */
    public class C20189OooO00o implements InterfaceC31988OoooO00 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public C33094OoooO f113929OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public boolean f113930OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final C32043o0000o f113931OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public byte[] f113932OooO0Oo;

        public C20189OooO00o(C33094OoooO c33094OoooO, C32043o0000o c32043o0000o) {
            this.f113929OooO00o = (C33094OoooO) Preconditions.checkNotNull(c33094OoooO, "headers");
            this.f113931OooO0OO = (C32043o0000o) Preconditions.checkNotNull(c32043o0000o, "statsTraceCtx");
        }

        @Override // oO000Oo.InterfaceC31988OoooO00
        public final InterfaceC31988OoooO00 OooO0O0(InterfaceC33064OooOO0o interfaceC33064OooOO0o) {
            return this;
        }

        @Override // oO000Oo.InterfaceC31988OoooO00
        public final void OooO0Oo(int i) {
        }

        @Override // oO000Oo.InterfaceC31988OoooO00
        public final void OooO0o(InputStream inputStream) {
            Preconditions.checkState(this.f113932OooO0Oo == null, "writePayload should not be called multiple times");
            try {
                this.f113932OooO0Oo = ByteStreams.toByteArray(inputStream);
                C32043o0000o c32043o0000o = this.f113931OooO0OO;
                for (AbstractC21138OooO0oo abstractC21138OooO0oo : c32043o0000o.f114553OooO00o) {
                    abstractC21138OooO0oo.Ooooo00(0);
                }
                byte[] bArr = this.f113932OooO0Oo;
                long length = bArr.length;
                long length2 = bArr.length;
                for (AbstractC21138OooO0oo abstractC21138OooO0oo2 : c32043o0000o.f114553OooO00o) {
                    abstractC21138OooO0oo2.Ooooo0o(0, length, length2);
                }
                long length3 = this.f113932OooO0Oo.length;
                AbstractC21138OooO0oo[] abstractC21138OooO0ooArr = c32043o0000o.f114553OooO00o;
                for (AbstractC21138OooO0oo abstractC21138OooO0oo3 : abstractC21138OooO0ooArr) {
                    abstractC21138OooO0oo3.OooooO0(length3);
                }
                long length4 = this.f113932OooO0Oo.length;
                for (AbstractC21138OooO0oo abstractC21138OooO0oo4 : abstractC21138OooO0ooArr) {
                    abstractC21138OooO0oo4.OooooOO(length4);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        @Override // oO000Oo.InterfaceC31988OoooO00
        public final InterfaceC31988OoooO00 OooO0o0(boolean z) {
            return this;
        }

        @Override // oO000Oo.InterfaceC31988OoooO00
        public final void close() {
            this.f113930OooO0O0 = true;
            Preconditions.checkState(this.f113932OooO0Oo != null, "Lack of request message. GET request is only supported for unary requests");
            OooO00o.this.OooOOOo().OooO00o(this.f113929OooO00o, this.f113932OooO0Oo);
            this.f113932OooO0Oo = null;
            this.f113929OooO00o = null;
        }

        @Override // oO000Oo.InterfaceC31988OoooO00
        public final void flush() {
        }

        @Override // oO000Oo.InterfaceC31988OoooO00
        public final boolean isClosed() {
            return this.f113930OooO0O0;
        }
    }

    public static abstract class OooO0O0 extends AbstractC31936OooO0Oo.OooO00o {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public boolean f113934OooO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final C32043o0000o f113935OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public InterfaceC31948OooOOoo f113936OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public oO0OOo0o.OooOo00 f113937OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public boolean f113938OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public volatile boolean f113939OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public RunnableC20190OooO00o f113940OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public boolean f113941OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public boolean f113942OooOOOo;

        /* JADX INFO: renamed from: oO000Oo.OooO00o$OooO0O0$OooO00o, reason: collision with other inner class name */
        public class RunnableC20190OooO00o implements Runnable {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ InterfaceC31948OooOOoo.OooO00o f113943OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ oO0OOo0o.o00Oo0 f113944OooOo0o;

            /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
            public final /* synthetic */ C33094OoooO f113946OooOoO0;

            public RunnableC20190OooO00o(oO0OOo0o.o00Oo0 o00oo02, InterfaceC31948OooOOoo.OooO00o oooO00o, C33094OoooO c33094OoooO) {
                this.f113944OooOo0o = o00oo02;
                this.f113943OooOo = oooO00o;
                this.f113946OooOoO0 = c33094OoooO;
            }

            @Override // java.lang.Runnable
            public final void run() {
                OooO0O0.this.OooO0o(this.f113944OooOo0o, this.f113943OooOo, this.f113946OooOoO0);
            }
        }

        public OooO0O0(int i, C32043o0000o c32043o0000o, o000 o000Var) {
            super(i, c32043o0000o, o000Var);
            this.f113937OooOO0O = oO0OOo0o.OooOo00.f119581OooO0Oo;
            this.f113938OooOO0o = false;
            this.f113935OooO0oo = (C32043o0000o) Preconditions.checkNotNull(c32043o0000o, "statsTraceCtx");
        }

        public final void OooO(oO0OOo0o.o00Oo0 o00oo02, boolean z, C33094OoooO c33094OoooO) {
            OooO0oo(o00oo02, InterfaceC31948OooOOoo.OooO00o.f114034OooOo0o, z, c33094OoooO);
        }

        public final void OooO0o(oO0OOo0o.o00Oo0 o00oo02, InterfaceC31948OooOOoo.OooO00o oooO00o, C33094OoooO c33094OoooO) {
            if (this.f113934OooO) {
                return;
            }
            this.f113934OooO = true;
            C32043o0000o c32043o0000o = this.f113935OooO0oo;
            if (c32043o0000o.f114554OooO0O0.compareAndSet(false, true)) {
                for (AbstractC21138OooO0oo abstractC21138OooO0oo : c32043o0000o.f114553OooO00o) {
                    abstractC21138OooO0oo.Oooooo(o00oo02);
                }
            }
            if (this.f113951OooO0OO != null) {
                o00oo02.OooO0o();
            }
            this.f113936OooOO0.OooO0OO(o00oo02, oooO00o, c33094OoooO);
        }

        public final void OooO0oO(C33094OoooO c33094OoooO) {
            Preconditions.checkState(!this.f113941OooOOOO, "Received headers on closed stream");
            for (AbstractC21138OooO0oo abstractC21138OooO0oo : this.f113935OooO0oo.f114553OooO00o) {
                ((oO0OOo0o.OooO) abstractC21138OooO0oo).Ooooooo();
            }
            OooOO0O.OooO0O0 oooO0O0 = OooOO0O.OooO0O0.f119551OooO00o;
            String str = (String) c33094OoooO.OooO0OO(C31989OoooO0O.f114217OooO0Oo);
            if (str != null) {
                OooOo00.OooO00o oooO00o = this.f113937OooOO0O.f119582OooO00o.get(str);
                InterfaceC33070OooOOoo interfaceC33070OooOOoo = oooO00o != null ? oooO00o.f119584OooO00o : null;
                if (interfaceC33070OooOOoo == null) {
                    ((C32909OooO0oo.OooO0O0) this).OooOOOO(oO0OOo0o.o00Oo0.f119723OooOOO.OooO0oo("Can't find decompressor for ".concat(str)).OooO00o());
                    return;
                } else if (interfaceC33070OooOOoo != oooO0O0) {
                    this.f113949OooO00o.OooOOo0(interfaceC33070OooOOoo);
                }
            }
            this.f113936OooOO0.OooO0O0(c33094OoooO);
        }

        public final void OooO0oo(oO0OOo0o.o00Oo0 o00oo02, InterfaceC31948OooOOoo.OooO00o oooO00o, boolean z, C33094OoooO c33094OoooO) {
            Preconditions.checkNotNull(o00oo02, "status");
            Preconditions.checkNotNull(c33094OoooO, "trailers");
            if (!this.f113941OooOOOO || z) {
                this.f113941OooOOOO = true;
                this.f113942OooOOOo = o00oo02.OooO0o();
                synchronized (this.f113950OooO0O0) {
                    this.f113955OooO0oO = true;
                }
                if (this.f113938OooOO0o) {
                    this.f113940OooOOO0 = null;
                    OooO0o(o00oo02, oooO00o, c33094OoooO);
                    return;
                }
                this.f113940OooOOO0 = new RunnableC20190OooO00o(o00oo02, oooO00o, c33094OoooO);
                if (z) {
                    this.f113949OooO00o.close();
                } else {
                    this.f113949OooO00o.OooOOoo();
                }
            }
        }
    }

    public OooO00o(C32914OooOOo0 c32914OooOOo0, C32043o0000o c32043o0000o, o000 o000Var, C33094OoooO c33094OoooO, oO0OOo0o.OooO0OO oooO0OO, boolean z) {
        Preconditions.checkNotNull(c33094OoooO, "headers");
        this.f113923OooO00o = (o000) Preconditions.checkNotNull(o000Var, "transportTracer");
        this.f113925OooO0OO = !Boolean.TRUE.equals(oooO0OO.OooO00o(C31989OoooO0O.f114225OooOOO));
        this.f113926OooO0Oo = z;
        if (z) {
            this.f113924OooO0O0 = new C20189OooO00o(c33094OoooO, c32043o0000o);
        } else {
            this.f113924OooO0O0 = new C32012o000000o(this, c32914OooOOo0, c32043o0000o);
            this.f113928OooO0o0 = c33094OoooO;
        }
    }

    @Override // oO000Oo.C32012o000000o.OooO0OO
    public final void OooO(o000O000 o000o0002, boolean z, boolean z2, int i) {
        C34524OooO0Oo c34524OooO0Oo;
        Preconditions.checkArgument(o000o0002 != null || z, "null frame before EOS");
        C32909OooO0oo.OooO00o oooO00oOooOOOo = OooOOOo();
        oooO00oOooOOOo.getClass();
        oO00o00.OooO0O0.OooO0OO();
        try {
            if (o000o0002 == null) {
                c34524OooO0Oo = C32909OooO0oo.f118685OooOOOo;
            } else {
                c34524OooO0Oo = ((C32911OooOOOo) o000o0002).f118737OooO00o;
                int i2 = (int) c34524OooO0Oo.f123723OooOo;
                if (i2 > 0) {
                    C32909OooO0oo.OooO0O0 oooO0O0 = C32909OooO0oo.this.f118690OooOO0o;
                    synchronized (oooO0O0.f113950OooO0O0) {
                        oooO0O0.f113954OooO0o0 += i2;
                    }
                }
            }
            synchronized (C32909OooO0oo.this.f118690OooOO0o.f118697OooOo0o) {
                C32909OooO0oo.OooO0O0.OooOOO0(C32909OooO0oo.this.f118690OooOO0o, c34524OooO0Oo, z, z2);
                o000 o000Var = C32909OooO0oo.this.f113923OooO00o;
                if (i == 0) {
                    o000Var.getClass();
                } else {
                    o000Var.getClass();
                    o000Var.f114313OooO00o.OooO00o();
                }
            }
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

    @Override // oO000Oo.InterfaceC31946OooOOo
    public final void OooO0OO(int i) {
        OooOOOO().f113949OooO00o.OooO0OO(i);
    }

    @Override // oO000Oo.InterfaceC31946OooOOo
    public final void OooO0Oo(int i) {
        this.f113924OooO0O0.OooO0Oo(i);
    }

    @Override // oO000Oo.InterfaceC31946OooOOo
    public final void OooO0o(C33068OooOOo c33068OooOOo) {
        C33094OoooO c33094OoooO = this.f113928OooO0o0;
        C33094OoooO.OooO0O0 oooO0O0 = C31989OoooO0O.f114216OooO0OO;
        c33094OoooO.OooO00o(oooO0O0);
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        this.f113928OooO0o0.OooO0o(oooO0O0, Long.valueOf(Math.max(0L, c33068OooOOo.OooO0OO())));
    }

    @Override // oO000Oo.InterfaceC31946OooOOo
    public final void OooOO0() {
        if (OooOOOO().f113939OooOOO) {
            return;
        }
        OooOOOO().f113939OooOOO = true;
        this.f113924OooO0O0.close();
    }

    @Override // oO000Oo.InterfaceC31946OooOOo
    public final void OooOO0O(oO0OOo0o.OooOo00 oooOo00) {
        C32909OooO0oo.OooO0O0 oooO0O0OooOOOO = OooOOOO();
        Preconditions.checkState(oooO0O0OooOOOO.f113936OooOO0 == null, "Already called start");
        oooO0O0OooOOOO.f113937OooOO0O = (oO0OOo0o.OooOo00) Preconditions.checkNotNull(oooOo00, "decompressorRegistry");
    }

    @Override // oO000Oo.InterfaceC31946OooOOo
    public final void OooOO0o(oO0OOo0o.o00Oo0 o00oo02) {
        Preconditions.checkArgument(!o00oo02.OooO0o(), "Should not cancel with OK status");
        this.f113927OooO0o = true;
        C32909OooO0oo.OooO00o oooO00oOooOOOo = OooOOOo();
        oooO00oOooOOOo.getClass();
        oO00o00.OooO0O0.OooO0OO();
        try {
            synchronized (C32909OooO0oo.this.f118690OooOO0o.f118697OooOo0o) {
                C32909OooO0oo.this.f118690OooOO0o.OooOOO(o00oo02, true, null);
            }
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

    @Override // oO000Oo.InterfaceC31946OooOOo
    public final void OooOOO(InterfaceC31948OooOOoo interfaceC31948OooOOoo) {
        C32909OooO0oo.OooO0O0 oooO0O0OooOOOO = OooOOOO();
        Preconditions.checkState(oooO0O0OooOOOO.f113936OooOO0 == null, "Already called setListener");
        oooO0O0OooOOOO.f113936OooOO0 = (InterfaceC31948OooOOoo) Preconditions.checkNotNull(interfaceC31948OooOOoo, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        if (this.f113926OooO0Oo) {
            return;
        }
        OooOOOo().OooO00o(this.f113928OooO0o0, null);
        this.f113928OooO0o0 = null;
    }

    @Override // oO000Oo.InterfaceC31946OooOOo
    public final void OooOOO0(C31998OoooOoO c31998OoooOoO) {
        c31998OoooOoO.OooO0O0(((C32909OooO0oo) this).f118691OooOOO.f119519OooO00o.get(C33076OooOoOO.f119593OooO00o), "remote_addr");
    }

    public abstract C32909OooO0oo.OooO00o OooOOOo();

    @Override // oO000Oo.AbstractC31936OooO0Oo
    /* JADX INFO: renamed from: OooOOo0, reason: merged with bridge method [inline-methods] */
    public abstract C32909OooO0oo.OooO0O0 OooOOOO();

    @Override // oO000Oo.InterfaceC32048o0000oO0
    public final boolean isReady() {
        return OooOOOO().OooO0o0() && !this.f113927OooO0o;
    }
}
