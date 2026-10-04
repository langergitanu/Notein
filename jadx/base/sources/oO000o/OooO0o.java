package oO000o;

import OooOoOO.C20519OooO0Oo;
import java.io.Closeable;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import o0Oo0oOo.C28328OooOo0o;
import oO000oo.C32136OooO0oo;
import oO00ooO.C32447OooOOo;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o0OO.AbstractC33659Oooooo;
import oO0o0OO.C33635Oooo00O;
import oO0o0OO.InterfaceC33623OooOo0O;
import oO0o0OO.InterfaceC33672o00ooo;
import oOo0000O.InterfaceC34415OooO0oo;
import oOo000Oo.C34438OooOoo0;

/* JADX INFO: loaded from: classes10.dex */
public abstract class OooO0o implements oO000o.OooO0O0 {

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f114915OooOoO0 = AtomicIntegerFieldUpdater.newUpdater(OooO0o.class, "closed");

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final String f114917OooOo0o;
    private volatile /* synthetic */ int closed = 0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final C32447OooOOo f114916OooOo = C20519OooO0Oo.OooO0OO(new OooO0O0());

    public static final class OooO00o extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<Throwable, C32460OooOooO> {
        public OooO00o() {
            super(1);
        }

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final C32460OooOooO invoke(Throwable th) {
            InterfaceC34415OooO0oo interfaceC34415OooO0ooO000O0oO = OooO0o.this.o000O0oO();
            try {
                if (interfaceC34415OooO0ooO000O0oO instanceof AbstractC33659Oooooo) {
                    ((AbstractC33659Oooooo) interfaceC34415OooO0ooO000O0oO).close();
                } else if (interfaceC34415OooO0ooO000O0oO instanceof Closeable) {
                    ((Closeable) interfaceC34415OooO0ooO000O0oO).close();
                }
            } catch (Throwable unused) {
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public static final class OooO0O0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<InterfaceC34415OooO0oo> {
        public OooO0O0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC34415OooO0oo invoke() {
            InterfaceC34415OooO0oo interfaceC34415OooO0ooOooO00o = C28328OooOo0o.OooO00o(null);
            OooO0o oooO0o = OooO0o.this;
            return interfaceC34415OooO0ooOooO00o.plus(oooO0o.o000O0oO()).plus(new C33635Oooo00O(androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), oooO0o.f114917OooOo0o, "-context")));
        }
    }

    public OooO0o(String str) {
        this.f114917OooOo0o = str;
    }

    @Override // oO0o0OO.InterfaceC33636Oooo00o
    public InterfaceC34415OooO0oo OooOOO0() {
        return (InterfaceC34415OooO0oo) this.f114916OooOo.getValue();
    }

    @Override // oO000o.OooO0O0
    public final void OooOooO(oO000o0.OooO0o client) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(client, "client");
        client.f114955OooOoo.OooO0o(C32136OooO0oo.f115229OooO, new C32082OooO0o0(client, this, null));
    }

    @Override // oO000o.OooO0O0
    public Set<InterfaceC32083OooO0oO<?>> OoooOOo() {
        return C34438OooOoo0.f123458OooOo0o;
    }

    public void close() {
        if (f114915OooOoO0.compareAndSet(this, 0, 1)) {
            InterfaceC34415OooO0oo.OooO0O0 oooO0O0 = OooOOO0().get(InterfaceC33672o00ooo.OooO00o.f121379OooOo0o);
            InterfaceC33623OooOo0O interfaceC33623OooOo0O = oooO0O0 instanceof InterfaceC33623OooOo0O ? (InterfaceC33623OooOo0O) oooO0O0 : null;
            if (interfaceC33623OooOo0O == null) {
                return;
            }
            interfaceC33623OooOo0O.complete();
            interfaceC33623OooOo0O.invokeOnCompletion(new OooO00o());
        }
    }
}
