package oO0o0OOO;

import Oooo0oO.C21111o0ooOoO;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.OooOOO0;
import oO0o0OO.C33614OooOOO0;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33651OoooOoO;
import oO0o0OO.o000000;
import oO0o0Ooo.C33833OooOOOO;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: oO0o0OOO.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33685OooO0o extends AbstractC33687OooO0oO {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final String f121425OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final Handler f121426OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final boolean f121427OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final C33685OooO0o f121428OooOoo0;

    public C33685OooO0o(Handler handler, String str, boolean z) {
        this.f121426OooOoO0 = handler;
        this.f121425OooOoO = str;
        this.f121427OooOoOO = z;
        this.f121428OooOoo0 = z ? this : new C33685OooO0o(handler, str, true);
    }

    @Override // oO0o0OOO.AbstractC33687OooO0oO, oO0o0OO.InterfaceC33645OoooO00
    public final InterfaceC33651OoooOoO OooOooo(long j, final Runnable runnable, InterfaceC34415OooO0oo interfaceC34415OooO0oo) {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.f121426OooOoO0.postDelayed(runnable, j)) {
            return new InterfaceC33651OoooOoO() { // from class: oO0o0OOO.OooO0OO
                @Override // oO0o0OO.InterfaceC33651OoooOoO
                public final void dispose() {
                    this.f121421OooOo0o.f121426OooOoO0.removeCallbacks(runnable);
                }
            };
        }
        o000Oo00(interfaceC34415OooO0oo, runnable);
        return o000000.f121353OooOo0o;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C33685OooO0o)) {
            return false;
        }
        C33685OooO0o c33685OooO0o = (C33685OooO0o) obj;
        return c33685OooO0o.f121426OooOoO0 == this.f121426OooOoO0 && c33685OooO0o.f121427OooOoOO == this.f121427OooOoOO;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f121426OooOoO0) ^ (this.f121427OooOoOO ? 1231 : 1237);
    }

    @Override // oO0o0OO.InterfaceC33645OoooO00
    public final void o0000o0(long j, C33614OooOOO0 c33614OooOOO0) {
        RunnableC33686OooO0o0 runnableC33686OooO0o0 = new RunnableC33686OooO0o0(c33614OooOOO0, this);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.f121426OooOoO0.postDelayed(runnableC33686OooO0o0, j)) {
            c33614OooOOO0.OooOo0(new C33684OooO0Oo(0, this, runnableC33686OooO0o0));
        } else {
            o000Oo00(c33614OooOOO0.f121299OooOoOO, runnableC33686OooO0o0);
        }
    }

    @Override // oO0o0OO.AbstractC33630OooOooO
    public final boolean o000OOO(InterfaceC34415OooO0oo interfaceC34415OooO0oo) {
        return (this.f121427OooOoOO && OooOOO0.OooO0O0(Looper.myLooper(), this.f121426OooOoO0.getLooper())) ? false : true;
    }

    @Override // oO0o0OOO.AbstractC33687OooO0oO
    public final AbstractC33687OooO0oO o000OOoO() {
        return this.f121428OooOoo0;
    }

    public final void o000Oo00(InterfaceC34415OooO0oo interfaceC34415OooO0oo, Runnable runnable) {
        oO00o00.OooO0OO.OooO0O0(interfaceC34415OooO0oo, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        ExecutorC33873OooO0O0.f122045OooOoO0.o0OoO0o(interfaceC34415OooO0oo, runnable);
    }

    @Override // oO0o0OO.AbstractC33630OooOooO
    public final void o0OoO0o(InterfaceC34415OooO0oo interfaceC34415OooO0oo, Runnable runnable) {
        if (this.f121426OooOoO0.post(runnable)) {
            return;
        }
        o000Oo00(interfaceC34415OooO0oo, runnable);
    }

    @Override // oO0o0OOO.AbstractC33687OooO0oO, oO0o0OO.AbstractC33630OooOooO
    public final String toString() {
        AbstractC33687OooO0oO abstractC33687OooO0oOO000OOoO;
        String str;
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        AbstractC33687OooO0oO abstractC33687OooO0oO = C33833OooOOOO.f121946OooO00o;
        if (this == abstractC33687OooO0oO) {
            str = "Dispatchers.Main";
        } else {
            try {
                abstractC33687OooO0oOO000OOoO = abstractC33687OooO0oO.o000OOoO();
            } catch (UnsupportedOperationException unused) {
                abstractC33687OooO0oOO000OOoO = null;
            }
            str = this == abstractC33687OooO0oOO000OOoO ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.f121425OooOoO;
        if (string == null) {
            string = this.f121426OooOoO0.toString();
        }
        return this.f121427OooOoOO ? C21111o0ooOoO.OooO0Oo(string, ".immediate") : string;
    }

    public C33685OooO0o(Handler handler) {
        this(handler, null, false);
    }
}
