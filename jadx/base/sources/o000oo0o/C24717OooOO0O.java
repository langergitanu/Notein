package o000oo0o;

import java.util.Iterator;
import kotlin.coroutines.Continuation;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import oO00ooO.C32435OooO0Oo;
import oO0o0O0O.C33576OooOOOo;
import oO0o0O0o.C33598OooOo0;
import oO0o0oOo.C33898OooO0Oo;
import oO0o0oOo.C33900OooO0o0;
import oO0o0oOo.InterfaceC33895OooO00o;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: o000oo0o.OooOO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24717OooOO0O implements InterfaceC24747OooO0O0, InterfaceC33895OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final InterfaceC33895OooO00o f83785OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final InterfaceC24747OooO0O0 f83786OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public Throwable f83787OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public InterfaceC34415OooO0oo f83788OooOoO0;

    public C24717OooOO0O(InterfaceC24747OooO0O0 delegate) {
        C33898OooO0Oo c33898OooO0OoOooO00o = C33900OooO0o0.OooO00o();
        kotlin.jvm.internal.OooOOO0.OooO0oO(delegate, "delegate");
        this.f83786OooOo0o = delegate;
        this.f83785OooOo = c33898OooO0OoOooO00o;
    }

    @Override // oO0o0oOo.InterfaceC33895OooO00o
    public final Object OooO00o(Continuation continuation) {
        return this.f83785OooOo.OooO00o(continuation);
    }

    @Override // oO0o0oOo.InterfaceC33895OooO00o
    public final boolean OooO0OO() {
        return this.f83785OooOo.OooO0OO();
    }

    @Override // oO0o0oOo.InterfaceC33895OooO00o
    public final void OooOOO0(Object obj) {
        this.f83785OooOo.OooOOO0(null);
    }

    public final void OooOOo0(StringBuilder sb) {
        if (this.f83788OooOoO0 == null && this.f83787OooOoO == null) {
            sb.append("\t\tStatus: Free connection");
            sb.append('\n');
            return;
        }
        sb.append("\t\tStatus: Acquired connection");
        sb.append('\n');
        InterfaceC34415OooO0oo interfaceC34415OooO0oo = this.f83788OooOoO0;
        if (interfaceC34415OooO0oo != null) {
            sb.append("\t\tCoroutine: " + interfaceC34415OooO0oo);
            sb.append('\n');
        }
        Throwable th = this.f83787OooOoO;
        if (th != null) {
            sb.append("\t\tAcquired:");
            sb.append('\n');
            Iterator it = oOo000Oo.OooOo.Oooo0O0(C33576OooOOOo.OooOo0(new C33598OooOo0(C32435OooO0Oo.OooO0O0(th)))).iterator();
            while (it.hasNext()) {
                sb.append("\t\t" + ((String) it.next()));
                sb.append('\n');
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        this.f83786OooOo0o.close();
    }

    @Override // o000ooo.InterfaceC24747OooO0O0
    public final InterfaceC24749OooO0Oo o0ooOOo(String sql) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(sql, "sql");
        return this.f83786OooOo0o.o0ooOOo(sql);
    }

    public final String toString() {
        return this.f83786OooOo0o.toString();
    }
}
