package oO00Oo;

import io.ktor.utils.p616io.InterfaceC23986Ooooo0o;
import io.ktor.utils.p616io.InterfaceC23990Oooooo;
import kotlin.jvm.internal.C24023OooOOoo;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.Oooo0;
import oO00Oo0o.C32275OooO0O0;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33635Oooo00O;
import oO0o0OO.C33671o00oO0o;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OO.InterfaceC33672o00ooo;
import oO0o0OOo.C33695OooO0o0;
import oO0o0OOo.C33703OooOOO0;
import oOo0000O.InterfaceC34415OooO0oo;
import oOoo0.InterfaceC34602OooOO0o;
import ooOOoOOo.C35148OooO00o;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOO0 implements InterfaceC33636Oooo00o {

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC34602OooOO0o<Object>[] f115878OooOoOO;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final InterfaceC34415OooO0oo f115879OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C33695OooO0o0 f115880OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final OooOOO0 f115881OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final C32262OooOOo f115882OooOoO0;

    static {
        C24023OooOOoo c24023OooOOoo = new C24023OooOOoo(OooOO0.class, "maxFrameSize", "getMaxFrameSize()J", 0);
        Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
        f115878OooOoOO = new InterfaceC34602OooOO0o[]{oooo0.OooO0o0(c24023OooOOoo), oooo0.OooO0o0(new C24023OooOOoo(OooOO0.class, "masking", "getMasking()Z", 0))};
    }

    public OooOO0() {
        throw null;
    }

    public OooOO0(InterfaceC23986Ooooo0o input, InterfaceC23990Oooooo output, InterfaceC34415OooO0oo coroutineContext) {
        C32275OooO0O0 pool = C35148OooO00o.f126204OooO00o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(input, "input");
        kotlin.jvm.internal.OooOOO0.OooO0oO(output, "output");
        kotlin.jvm.internal.OooOOO0.OooO0oO(coroutineContext, "coroutineContext");
        kotlin.jvm.internal.OooOOO0.OooO0oO(pool, "pool");
        C33671o00oO0o c33671o00oO0o = new C33671o00oO0o((InterfaceC33672o00ooo) coroutineContext.get(InterfaceC33672o00ooo.OooO00o.f121379OooOo0o));
        this.f115880OooOo0o = C33703OooOOO0.OooO00o(0, 6, null);
        InterfaceC34415OooO0oo interfaceC34415OooO0ooPlus = coroutineContext.plus(c33671o00oO0o).plus(new C33635Oooo00O("raw-ws"));
        this.f115879OooOo = interfaceC34415OooO0ooPlus;
        new C32259OooO0oo(2147483647L, this);
        new OooO(true, this);
        this.f115882OooOoO0 = new C32262OooOOo(output, interfaceC34415OooO0ooPlus, pool);
        this.f115881OooOoO = new OooOOO0(input, interfaceC34415OooO0ooPlus, pool);
        C33609OooO0oo.OooO0OO(this, null, null, new C32258OooO0oO(this, null), 3);
        c33671o00oO0o.complete();
    }

    @Override // oO0o0OO.InterfaceC33636Oooo00o
    public final InterfaceC34415OooO0oo OooOOO0() {
        return this.f115879OooOo;
    }
}
