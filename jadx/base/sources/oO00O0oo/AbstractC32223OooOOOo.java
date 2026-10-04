package oO00O0oo;

import OoooOOo.C21201OooOOOO;
import io.ktor.utils.p616io.C23992OoooooO;
import io.ktor.utils.p616io.InterfaceC23967Oooo00O;
import io.ktor.utils.p616io.o0O0O00;
import io.ktor.utils.p616io.o0Oo0oo;
import java.nio.channels.ByteChannel;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SocketChannel;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import oO00O0oo.OooOo00;
import oO00ooO.C32435OooO0Oo;
import oO0O0OOo.C32654OooO0O0;
import oO0O0OOo.C32663OooOO0o;
import oO0o0OO.C33671o00oO0o;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OO.InterfaceC33672o00ooo;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: oO00O0oo.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC32223OooOOOo<S extends SelectableChannel & ByteChannel> extends C32663OooOO0o implements InterfaceC32216OooO0O0, InterfaceC32215OooO00o, InterfaceC32217OooO0OO, InterfaceC33636Oooo00o {

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final SocketChannel f115669OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final OooOo00.OooO0OO f115670OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final C32654OooO0O0 f115671OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final AtomicBoolean f115672OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final AtomicReference<o0Oo0oo> f115673OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final AtomicReference<o0O0O00> f115674Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final C33671o00oO0o f115675Oooo00O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC32223OooOOOo(SocketChannel socketChannel, C32654OooO0O0 selector, OooOo00.OooO0OO oooO0OO) {
        super(socketChannel);
        kotlin.jvm.internal.OooOOO0.OooO0oO(selector, "selector");
        this.f115669OooOoOO = socketChannel;
        this.f115671OooOoo0 = selector;
        this.f115670OooOoo = oooO0OO;
        this.f115672OooOooO = new AtomicBoolean();
        this.f115673OooOooo = new AtomicReference<>();
        this.f115674Oooo000 = new AtomicReference<>();
        this.f115675Oooo00O = oO00o00.OooO0OO.OooO00o();
    }

    @Override // oO00O0oo.InterfaceC32217OooO0OO
    public final o0Oo0oo OooO00o(io.ktor.utils.p616io.OooO00o oooO00o) {
        return (o0Oo0oo) OooOooo("writing", oooO00o, this.f115673OooOooo, new OooOOOO(this, oooO00o));
    }

    @Override // oO0o0OO.InterfaceC33636Oooo00o
    public final InterfaceC34415OooO0oo OooOOO0() {
        return this.f115675Oooo00O;
    }

    @Override // oO00O0oo.InterfaceC32215OooO00o
    public final o0O0O00 OooOOoo(io.ktor.utils.p616io.OooO00o oooO00o) {
        return (o0O0O00) OooOooo("reading", oooO00o, this.f115674Oooo000, new OooOOO(this, oooO00o));
    }

    public final InterfaceC33672o00ooo OooOooo(String str, io.ktor.utils.p616io.OooO00o oooO00o, AtomicReference atomicReference, oO0O000o.OooO00o oooO00o2) throws ClosedChannelException {
        AtomicBoolean atomicBoolean = this.f115672OooOooO;
        if (atomicBoolean.get()) {
            ClosedChannelException closedChannelException = new ClosedChannelException();
            oooO00o.OooO0Oo(closedChannelException);
            throw closedChannelException;
        }
        InterfaceC33672o00ooo interfaceC33672o00ooo = (InterfaceC33672o00ooo) oooO00o2.invoke();
        while (!atomicReference.compareAndSet(null, interfaceC33672o00ooo)) {
            if (atomicReference.get() != null) {
                IllegalStateException illegalStateException = new IllegalStateException(str.concat(" channel has already been set"));
                interfaceC33672o00ooo.cancel((CancellationException) null);
                throw illegalStateException;
            }
        }
        if (!atomicBoolean.get()) {
            oooO00o.Oooo00O(interfaceC33672o00ooo);
            interfaceC33672o00ooo.invokeOnCompletion(new C21201OooOOOO(this, 2));
            return interfaceC33672o00ooo;
        }
        ClosedChannelException closedChannelException2 = new ClosedChannelException();
        interfaceC33672o00ooo.cancel((CancellationException) null);
        oooO00o.OooO0Oo(closedChannelException2);
        throw closedChannelException2;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Oooo000() {
        Throwable cause;
        Throwable cause2;
        CancellationException cancellationException;
        CancellationException cancellationException2;
        if (this.f115672OooOooO.get()) {
            AtomicReference<o0Oo0oo> atomicReference = this.f115673OooOooo;
            o0Oo0oo o0oo0oo2 = atomicReference.get();
            if (o0oo0oo2 == null || o0oo0oo2.isCompleted()) {
                AtomicReference<o0O0O00> atomicReference2 = this.f115674Oooo000;
                o0O0O00 o0o0o00 = atomicReference2.get();
                if (o0o0o00 == null || o0o0o00.isCompleted()) {
                    o0Oo0oo o0oo0oo3 = atomicReference.get();
                    Throwable th = null;
                    if (o0oo0oo3 == null) {
                        cause = null;
                    } else {
                        if (!o0oo0oo3.isCancelled()) {
                            o0oo0oo3 = null;
                        }
                        if (o0oo0oo3 != null && (cancellationException2 = o0oo0oo3.getCancellationException()) != null) {
                            cause = cancellationException2.getCause();
                        }
                    }
                    o0O0O00 o0o0o002 = atomicReference2.get();
                    if (o0o0o002 == null) {
                        cause2 = null;
                    } else {
                        if (!o0o0o002.isCancelled()) {
                            o0o0o002 = null;
                        }
                        if (o0o0o002 != null && (cancellationException = o0o0o002.getCancellationException()) != null) {
                            cause2 = cancellationException.getCause();
                        }
                    }
                    C32654OooO0O0 c32654OooO0O0 = this.f115671OooOoo0;
                    try {
                        ((ByteChannel) getChannel()).close();
                        super.close();
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    c32654OooO0O0.Oooo0OO(this);
                    if (cause == null) {
                        cause = cause2;
                    } else if (cause2 != null && cause != cause2) {
                        C32435OooO0Oo.OooO00o(cause, cause2);
                    }
                    if (cause != null) {
                        if (th != null && cause != th) {
                            C32435OooO0Oo.OooO00o(cause, th);
                        }
                        th = cause;
                    }
                    C33671o00oO0o c33671o00oO0o = this.f115675Oooo00O;
                    if (th == null) {
                        c33671o00oO0o.complete();
                    } else {
                        c33671o00oO0o.OooO00o(th);
                    }
                }
            }
        }
    }

    @Override // oO0O0OOo.C32663OooOO0o, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        InterfaceC23967Oooo00O interfaceC23967Oooo00OOooO0OO;
        if (this.f115672OooOooO.compareAndSet(false, true)) {
            o0Oo0oo o0oo0oo2 = this.f115673OooOooo.get();
            if (o0oo0oo2 != null && (interfaceC23967Oooo00OOooO0OO = o0oo0oo2.OooO0OO()) != null) {
                C23992OoooooO.OooO0O0(interfaceC23967Oooo00OOooO0OO);
            }
            o0O0O00 o0o0o00 = this.f115674Oooo000.get();
            if (o0o0o00 != null) {
                o0o0o00.cancel((CancellationException) null);
            }
            Oooo000();
        }
    }

    @Override // oO0O0OOo.C32663OooOO0o, oO0o0OO.InterfaceC33651OoooOoO
    public final void dispose() {
        close();
    }

    @Override // oO0O0OOo.C32663OooOO0o, oO0O0OOo.OooOO0O
    public S getChannel() {
        return this.f115669OooOoOO;
    }
}
