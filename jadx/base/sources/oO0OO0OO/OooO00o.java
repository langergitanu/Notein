package oO0OO0OO;

import com.google.common.base.Preconditions;
import java.io.IOException;
import java.net.Socket;
import oO000Oo.ExecutorC32039o0000Oo;
import oO000OoO.C32078OooO0oo;
import oO000OoO.EnumC32073OooO00o;
import oO0OO0OO.OooO0O0;
import oOo00OoO.C34524OooO0Oo;
import oOo00OoO.C34547OooOoo;
import oOo00OoO.InterfaceC34544OooOoO;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO00o implements InterfaceC34544OooOoO {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final OooO0O0.OooO00o f118623OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final ExecutorC32039o0000Oo f118624OooOoO0;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public InterfaceC34544OooOoO f118629OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public int f118630Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public Socket f118631Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public boolean f118632Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public int f118633Oooo00o;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final Object f118622OooOo0o = new Object();

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final C34524OooO0Oo f118621OooOo = new C34524OooO0Oo();

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public boolean f118627OooOoo0 = false;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public boolean f118626OooOoo = false;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public boolean f118628OooOooO = false;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final int f118625OooOoOO = 10000;

    /* JADX INFO: renamed from: oO0OO0OO.OooO00o$OooO00o, reason: collision with other inner class name */
    public class C20273OooO00o extends AbstractRunnableC32904OooO0o0 {
        public C20273OooO00o() {
            super();
            oO00o00.OooO0O0.OooO0O0();
        }

        @Override // oO0OO0OO.OooO00o.AbstractRunnableC32904OooO0o0
        public final void OooO00o() throws IOException {
            OooO00o oooO00o;
            int i;
            C34524OooO0Oo c34524OooO0Oo = new C34524OooO0Oo();
            oO00o00.OooO0O0.OooO0OO();
            try {
                oO00o00.OooO00o oooO00o2 = oO00o00.OooO0O0.f116246OooO00o;
                oooO00o2.getClass();
                synchronized (OooO00o.this.f118622OooOo0o) {
                    C34524OooO0Oo c34524OooO0Oo2 = OooO00o.this.f118621OooOo;
                    c34524OooO0Oo.write(c34524OooO0Oo2, c34524OooO0Oo2.OooOOO0());
                    oooO00o = OooO00o.this;
                    oooO00o.f118627OooOoo0 = false;
                    i = oooO00o.f118630Oooo0;
                }
                oooO00o.f118629OooOooo.write(c34524OooO0Oo, c34524OooO0Oo.f123723OooOo);
                synchronized (OooO00o.this.f118622OooOo0o) {
                    OooO00o.this.f118630Oooo0 -= i;
                }
                oooO00o2.getClass();
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

    public class OooO0O0 extends AbstractRunnableC32904OooO0o0 {
        public OooO0O0() {
            super();
            oO00o00.OooO0O0.OooO0O0();
        }

        @Override // oO0OO0OO.OooO00o.AbstractRunnableC32904OooO0o0
        public final void OooO00o() throws IOException {
            OooO00o oooO00o;
            C34524OooO0Oo c34524OooO0Oo = new C34524OooO0Oo();
            oO00o00.OooO0O0.OooO0OO();
            try {
                oO00o00.OooO00o oooO00o2 = oO00o00.OooO0O0.f116246OooO00o;
                oooO00o2.getClass();
                synchronized (OooO00o.this.f118622OooOo0o) {
                    C34524OooO0Oo c34524OooO0Oo2 = OooO00o.this.f118621OooOo;
                    c34524OooO0Oo.write(c34524OooO0Oo2, c34524OooO0Oo2.f123723OooOo);
                    oooO00o = OooO00o.this;
                    oooO00o.f118626OooOoo = false;
                }
                oooO00o.f118629OooOooo.write(c34524OooO0Oo, c34524OooO0Oo.f123723OooOo);
                OooO00o.this.f118629OooOooo.flush();
                oooO00o2.getClass();
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

    public class OooO0OO implements Runnable {
        public OooO0OO() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            OooO00o oooO00o = OooO00o.this;
            C34524OooO0Oo c34524OooO0Oo = oooO00o.f118621OooOo;
            OooO0O0.OooO00o oooO00o2 = oooO00o.f118623OooOoO;
            try {
                InterfaceC34544OooOoO interfaceC34544OooOoO = oooO00o.f118629OooOooo;
                if (interfaceC34544OooOoO != null) {
                    long j = c34524OooO0Oo.f123723OooOo;
                    if (j > 0) {
                        interfaceC34544OooOoO.write(c34524OooO0Oo, j);
                    }
                }
            } catch (IOException e) {
                oooO00o2.onException(e);
            }
            c34524OooO0Oo.getClass();
            try {
                InterfaceC34544OooOoO interfaceC34544OooOoO2 = oooO00o.f118629OooOooo;
                if (interfaceC34544OooOoO2 != null) {
                    interfaceC34544OooOoO2.close();
                }
            } catch (IOException e2) {
                oooO00o2.onException(e2);
            }
            try {
                Socket socket = oooO00o.f118631Oooo000;
                if (socket != null) {
                    socket.close();
                }
            } catch (IOException e3) {
                oooO00o2.onException(e3);
            }
        }
    }

    /* JADX INFO: renamed from: oO0OO0OO.OooO00o$OooO0Oo, reason: case insensitive filesystem */
    public class C32903OooO0Oo extends oO0OO0OO.OooO0OO {
        public C32903OooO0Oo(oO000OoO.OooO0OO oooO0OO) {
            super(oooO0OO);
        }

        @Override // oO000OoO.OooO0OO
        public final void OoooO(C32078OooO0oo c32078OooO0oo) throws IOException {
            OooO00o.this.f118633Oooo00o++;
            this.f118643OooOo0o.OoooO(c32078OooO0oo);
        }

        @Override // oO000OoO.OooO0OO
        public final void Ooooooo(int i, EnumC32073OooO00o enumC32073OooO00o) throws IOException {
            OooO00o.this.f118633Oooo00o++;
            this.f118643OooOo0o.Ooooooo(i, enumC32073OooO00o);
        }

        @Override // oO000OoO.OooO0OO
        public final void o0000oo0(int i, int i2, boolean z) throws IOException {
            if (z) {
                OooO00o.this.f118633Oooo00o++;
            }
            this.f118643OooOo0o.o0000oo0(i, i2, z);
        }
    }

    /* JADX INFO: renamed from: oO0OO0OO.OooO00o$OooO0o0, reason: case insensitive filesystem */
    public abstract class AbstractRunnableC32904OooO0o0 implements Runnable {
        public AbstractRunnableC32904OooO0o0() {
        }

        public abstract void OooO00o() throws IOException;

        @Override // java.lang.Runnable
        public final void run() {
            OooO00o oooO00o = OooO00o.this;
            try {
                if (oooO00o.f118629OooOooo == null) {
                    throw new IOException("Unable to perform write due to unavailable sink.");
                }
                OooO00o();
            } catch (Exception e) {
                oooO00o.f118623OooOoO.onException(e);
            }
        }
    }

    public OooO00o(ExecutorC32039o0000Oo executorC32039o0000Oo, OooO oooO) {
        this.f118624OooOoO0 = (ExecutorC32039o0000Oo) Preconditions.checkNotNull(executorC32039o0000Oo, "executor");
        this.f118623OooOoO = (OooO0O0.OooO00o) Preconditions.checkNotNull(oooO, "exceptionHandler");
    }

    public final void OooO00o(InterfaceC34544OooOoO interfaceC34544OooOoO, Socket socket) {
        Preconditions.checkState(this.f118629OooOooo == null, "AsyncSink's becomeConnected should only be called once.");
        this.f118629OooOooo = (InterfaceC34544OooOoO) Preconditions.checkNotNull(interfaceC34544OooOoO, "sink");
        this.f118631Oooo000 = (Socket) Preconditions.checkNotNull(socket, "socket");
    }

    @Override // oOo00OoO.InterfaceC34544OooOoO, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f118628OooOooO) {
            return;
        }
        this.f118628OooOooO = true;
        this.f118624OooOoO0.execute(new OooO0OO());
    }

    @Override // oOo00OoO.InterfaceC34544OooOoO, java.io.Flushable
    public final void flush() throws IOException {
        if (this.f118628OooOooO) {
            throw new IOException("closed");
        }
        oO00o00.OooO0O0.OooO0OO();
        try {
            synchronized (this.f118622OooOo0o) {
                if (!this.f118626OooOoo) {
                    this.f118626OooOoo = true;
                    this.f118624OooOoO0.execute(new OooO0O0());
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

    @Override // oOo00OoO.InterfaceC34544OooOoO
    public final C34547OooOoo timeout() {
        return C34547OooOoo.NONE;
    }

    @Override // oOo00OoO.InterfaceC34544OooOoO
    public final void write(C34524OooO0Oo c34524OooO0Oo, long j) throws IOException {
        Preconditions.checkNotNull(c34524OooO0Oo, "source");
        if (this.f118628OooOooO) {
            throw new IOException("closed");
        }
        oO00o00.OooO0O0.OooO0OO();
        try {
            synchronized (this.f118622OooOo0o) {
                try {
                    this.f118621OooOo.write(c34524OooO0Oo, j);
                    int i = this.f118630Oooo0 + this.f118633Oooo00o;
                    this.f118630Oooo0 = i;
                    boolean z = false;
                    this.f118633Oooo00o = 0;
                    if (!this.f118632Oooo00O && i > this.f118625OooOoOO) {
                        this.f118632Oooo00O = true;
                        z = true;
                    } else if (!this.f118627OooOoo0 && !this.f118626OooOoo && this.f118621OooOo.OooOOO0() > 0) {
                        this.f118627OooOoo0 = true;
                    }
                    if (z) {
                        try {
                            this.f118631Oooo000.close();
                        } catch (IOException e) {
                            this.f118623OooOoO.onException(e);
                        }
                        oO00o00.OooO0O0.f116246OooO00o.getClass();
                        return;
                    }
                    this.f118624OooOoO0.execute(new C20273OooO00o());
                } finally {
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
}
