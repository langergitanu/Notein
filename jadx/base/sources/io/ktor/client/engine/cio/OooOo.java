package io.ktor.client.engine.cio;

import androidx.core.location.LocationRequestCompat;
import io.ktor.utils.p616io.C23991Oooooo0;
import io.ktor.utils.p616io.C23992OoooooO;
import io.ktor.utils.p616io.InterfaceC23967Oooo00O;
import io.ktor.utils.p616io.InterfaceC23986Ooooo0o;
import io.ktor.utils.p616io.InterfaceC23990Oooooo;
import io.ktor.utils.p616io.o0Oo0oo;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import o0o00oOo.o0000O0O;
import oO000oo.C32134OooO0o0;
import oO00O0oO.OooO0OO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "io.ktor.client.engine.cio.UtilsKt$writeBody$2", m80623f = "utils.kt", m80624l = {140, 129, 130, 131, 140, 140}, m80625m = "invokeSuspend")
public final class OooOo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f80440OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Object f80441OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ InterfaceC23990Oooooo f80442OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C32134OooO0o0 f80443OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ o0Oo0oo f80444OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ boolean f80445OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ InterfaceC23990Oooooo f80446OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOo(C32134OooO0o0 c32134OooO0o0, InterfaceC23990Oooooo interfaceC23990Oooooo, o0Oo0oo o0oo0oo2, InterfaceC23990Oooooo interfaceC23990Oooooo2, boolean z, Continuation<? super OooOo> continuation) {
        super(2, continuation);
        this.f80443OooOoO0 = c32134OooO0o0;
        this.f80442OooOoO = interfaceC23990Oooooo;
        this.f80444OooOoOO = o0oo0oo2;
        this.f80446OooOoo0 = interfaceC23990Oooooo2;
        this.f80445OooOoo = z;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new OooOo(this.f80443OooOoO0, this.f80442OooOoO, this.f80444OooOoOO, this.f80446OooOoo0, this.f80445OooOoo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((OooOo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00d0, code lost:
    
        if (r6.join(r9) == r0) goto L86;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e8  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Throwable th;
        InterfaceC23967Oooo00O interfaceC23967Oooo00OOooO0OO;
        Throwable th2;
        C32460OooOooO c32460OooOooO;
        C32460OooOooO c32460OooOooO2;
        InterfaceC23967Oooo00O interfaceC23967Oooo00OOooO0OO2;
        Throwable thOooO0O0;
        InterfaceC23967Oooo00O interfaceC23967Oooo00OOooO0OO3;
        Throwable thOooO0O02;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f80440OooOo;
        InterfaceC23990Oooooo interfaceC23990Oooooo = this.f80442OooOoO;
        boolean z = this.f80445OooOoo;
        InterfaceC23990Oooooo interfaceC23990Oooooo2 = this.f80446OooOoo0;
        o0Oo0oo o0oo0oo2 = this.f80444OooOoOO;
        try {
            switch (i) {
                case 0:
                    C32446OooOOOo.OooO0O0(obj);
                    oO00O0oO.OooO0OO oooO0OO = this.f80443OooOoO0.f115218OooO0Oo;
                    if (oooO0OO instanceof OooO0OO.OooO0O0) {
                        c32460OooOooO = C32460OooOooO.f116667OooO00o;
                        interfaceC23990Oooooo.flush();
                        if (o0oo0oo2 != null && (interfaceC23967Oooo00OOooO0OO2 = o0oo0oo2.OooO0OO()) != null) {
                            interfaceC23967Oooo00OOooO0OO2.OooO0Oo(null);
                        }
                        if (o0oo0oo2 != null) {
                            this.f80441OooOo0o = c32460OooOooO;
                            this.f80440OooOo = 1;
                            if (o0oo0oo2.join(this) != enumC32485OooO00o) {
                                c32460OooOooO2 = c32460OooOooO;
                                c32460OooOooO = c32460OooOooO2;
                            }
                        }
                        thOooO0O0 = interfaceC23990Oooooo2.OooO0O0();
                        if (thOooO0O0 != null) {
                            Throwable thOooO00o = o0000O0O.OooO00o(thOooO0O0);
                            th2 = thOooO00o instanceof CancellationException ? null : thOooO00o;
                            if (th2 != null) {
                                throw th2;
                            }
                        }
                        if (z) {
                            C23992OoooooO.OooO0O0(interfaceC23990Oooooo2);
                        }
                        return c32460OooOooO;
                    }
                    if (oooO0OO instanceof OooO0OO.OooO00o) {
                        byte[] bArrOooO0o0 = ((OooO0OO.OooO00o) oooO0OO).OooO0o0();
                        this.f80440OooOo = 2;
                        if (C23992OoooooO.OooO0o(interfaceC23990Oooooo, bArrOooO0o0, this) != enumC32485OooO00o) {
                            interfaceC23990Oooooo.flush();
                            if (o0oo0oo2 != null && (interfaceC23967Oooo00OOooO0OO3 = o0oo0oo2.OooO0OO()) != null) {
                                interfaceC23967Oooo00OOooO0OO3.OooO0Oo(null);
                            }
                            if (o0oo0oo2 != null) {
                                this.f80440OooOo = 5;
                                break;
                            }
                            thOooO0O02 = interfaceC23990Oooooo2.OooO0O0();
                            if (thOooO0O02 != null) {
                                Throwable thOooO00o2 = o0000O0O.OooO00o(thOooO0O02);
                                th2 = thOooO00o2 instanceof CancellationException ? null : thOooO00o2;
                                if (th2 != null) {
                                    throw th2;
                                }
                            }
                            if (z) {
                                C23992OoooooO.OooO0O0(interfaceC23990Oooooo2);
                            }
                            return C32460OooOooO.f116667OooO00o;
                        }
                    } else {
                        if (!(oooO0OO instanceof OooO0OO.AbstractC20204OooO0OO)) {
                            if (oooO0OO instanceof OooO0OO.OooO0Oo) {
                                this.f80440OooOo = 4;
                                if (((OooO0OO.OooO0Oo) oooO0OO).OooO0o0(interfaceC23990Oooooo, this) != enumC32485OooO00o) {
                                }
                            }
                            interfaceC23990Oooooo.flush();
                            if (o0oo0oo2 != null) {
                                interfaceC23967Oooo00OOooO0OO3.OooO0Oo(null);
                            }
                            if (o0oo0oo2 != null) {
                            }
                            thOooO0O02 = interfaceC23990Oooooo2.OooO0O0();
                            if (thOooO0O02 != null) {
                            }
                            if (z) {
                            }
                            return C32460OooOooO.f116667OooO00o;
                        }
                        InterfaceC23986Ooooo0o interfaceC23986Ooooo0oOooO0o0 = ((OooO0OO.AbstractC20204OooO0OO) oooO0OO).OooO0o0();
                        this.f80440OooOo = 3;
                        if (C23991Oooooo0.OooO00o(interfaceC23986Ooooo0oOooO0o0, interfaceC23990Oooooo, LocationRequestCompat.PASSIVE_INTERVAL, this) == enumC32485OooO00o) {
                        }
                    }
                    return enumC32485OooO00o;
                case 1:
                    c32460OooOooO2 = (C32460OooOooO) this.f80441OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    c32460OooOooO = c32460OooOooO2;
                    thOooO0O0 = interfaceC23990Oooooo2.OooO0O0();
                    if (thOooO0O0 != null) {
                    }
                    if (z) {
                    }
                    return c32460OooOooO;
                case 2:
                case 3:
                case 4:
                    C32446OooOOOo.OooO0O0(obj);
                    interfaceC23990Oooooo.flush();
                    if (o0oo0oo2 != null) {
                    }
                    if (o0oo0oo2 != null) {
                    }
                    thOooO0O02 = interfaceC23990Oooooo2.OooO0O0();
                    if (thOooO0O02 != null) {
                    }
                    if (z) {
                    }
                    return C32460OooOooO.f116667OooO00o;
                case 5:
                    C32446OooOOOo.OooO0O0(obj);
                    thOooO0O02 = interfaceC23990Oooooo2.OooO0O0();
                    if (thOooO0O02 != null) {
                    }
                    if (z) {
                    }
                    return C32460OooOooO.f116667OooO00o;
                case 6:
                    th = (Throwable) this.f80441OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    th = th;
                    Throwable thOooO0O03 = interfaceC23990Oooooo2.OooO0O0();
                    if (thOooO0O03 != null) {
                        Throwable thOooO00o3 = o0000O0O.OooO00o(thOooO0O03);
                        th2 = thOooO00o3 instanceof CancellationException ? null : thOooO00o3;
                        if (th2 != null) {
                            throw th2;
                        }
                    }
                    if (z) {
                        C23992OoooooO.OooO0O0(interfaceC23990Oooooo2);
                    }
                    throw th;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (Throwable th3) {
            try {
                interfaceC23990Oooooo.OooO0Oo(th3);
                throw th3;
            } catch (Throwable th4) {
                th = th4;
                interfaceC23990Oooooo.flush();
                if (o0oo0oo2 != null && (interfaceC23967Oooo00OOooO0OO = o0oo0oo2.OooO0OO()) != null) {
                    interfaceC23967Oooo00OOooO0OO.OooO0Oo(null);
                }
                if (o0oo0oo2 != null) {
                    this.f80441OooOo0o = th;
                    this.f80440OooOo = 6;
                    if (o0oo0oo2.join(this) != enumC32485OooO00o) {
                        th = th;
                    }
                }
            }
        }
    }
}
