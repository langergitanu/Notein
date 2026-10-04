package ooOOooOo;

import OooO0O0.OooO0O0;
import kotlin.jvm.internal.OooOOO0;
import oO00OOo0.C32239OooO0Oo;
import oO00ooO.C32435OooO0Oo;
import oO00ooO.C32460OooOooO;
import oO0o0OO.InterfaceC33651OoooOoO;
import oO0o0Ooo.C33828OooOO0;
import oO0o0Ooo.C33829OooOO0O;

/* JADX INFO: renamed from: ooOOooOo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C35183OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C32239OooO0Oo<OooO0O0, C33828OooOO0> f126297OooO00o = new C32239OooO0Oo<>();

    /* JADX INFO: renamed from: ooOOooOo.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C20383OooO00o extends C33829OooOO0O implements InterfaceC33651OoooOoO {
    }

    public final void OooO00o(OooO0O0 definition) {
        C32460OooOooO c32460OooOooO;
        OooOOO0.OooO0oO(definition, "definition");
        C33828OooOO0 c33828OooOO0 = (C33828OooOO0) this.f126297OooO00o.OooO00o(definition);
        Throwable th = null;
        if (c33828OooOO0 != null) {
            Object obj = C33829OooOO0O.f121935OooOo0o.get(c33828OooOO0);
            OooOOO0.OooO0o0(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            Throwable th2 = null;
            for (C33829OooOO0O c33829OooOO0OOooO0o0 = (C33829OooOO0O) obj; !c33829OooOO0OOooO0o0.equals(c33828OooOO0); c33829OooOO0OOooO0o0 = c33829OooOO0OOooO0o0.OooO0o0()) {
                if (c33829OooOO0OOooO0o0 instanceof C20383OooO00o) {
                    try {
                        OooOOO0.OooO0o0(null, "null cannot be cast to non-null type kotlin.Function1<T of io.ktor.events.Events.raise$lambda$2, kotlin.Unit>{ io.ktor.events.EventsKt.EventHandler<T of io.ktor.events.Events.raise$lambda$2> }");
                        throw null;
                    } catch (Throwable th3) {
                        if (th2 != null) {
                            C32435OooO0Oo.OooO00o(th2, th3);
                            c32460OooOooO = C32460OooOooO.f116667OooO00o;
                        } else {
                            c32460OooOooO = null;
                        }
                        if (c32460OooOooO == null) {
                            th2 = th3;
                        }
                    }
                }
            }
            th = th2;
        }
        if (th != null) {
            throw th;
        }
    }
}
