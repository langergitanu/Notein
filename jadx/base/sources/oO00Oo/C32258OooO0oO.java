package oO00Oo;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import oO00Oo.AbstractC32252OooO0O0;
import oO00Oo.C32251OooO00o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OOo.C33695OooO0o0;
import oO0o0OOo.InterfaceC33701OooOO0o;

/* JADX INFO: renamed from: oO00Oo.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "io.ktor.websocket.RawWebSocketJvm$1", m80623f = "RawWebSocketJvm.kt", m80624l = {67, 68, 71, 74}, m80625m = "invokeSuspend")
public final class C32258OooO0oO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f115874OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Object f115875OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ OooOO0 f115876OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32258OooO0oO(OooOO0 oooOO02, Continuation<? super C32258OooO0oO> continuation) {
        super(2, continuation);
        this.f115876OooOoO0 = oooOO02;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C32258OooO0oO(this.f115876OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C32258OooO0oO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x006f A[Catch: all -> 0x003b, CancellationException -> 0x003d, OooO0o -> 0x003f, OooO0Oo -> 0x0041, TRY_LEAVE, TryCatch #5 {CancellationException -> 0x003d, OooO0Oo -> 0x0041, blocks: (B:19:0x0037, B:34:0x005b, B:37:0x0067, B:39:0x006f, B:30:0x0048, B:33:0x004f), top: B:60:0x000c, outer: #4 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x007f -> B:34:0x005b). Please report as a decompilation issue!!! */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        C32256OooO0o c32256OooO0o;
        C32255OooO0Oo c32255OooO0Oo;
        InterfaceC33701OooOO0o oooO00o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f115874OooOo;
        OooOO0 oooOO02 = this.f115876OooOoO0;
        try {
            try {
                try {
                } catch (CancellationException e) {
                    oooOO02.f115881OooOoO.f115900OooOoo.OooOOOo(true, e);
                } catch (C32255OooO0Oo e2) {
                    C33695OooO0o0 c33695OooO0o0 = oooOO02.f115882OooOoO0.f115920OooOoOO;
                    AbstractC32252OooO0O0.C20211OooO0O0 c20211OooO0O0 = new AbstractC32252OooO0O0.C20211OooO0O0(new C32251OooO00o(C32251OooO00o.EnumC20210OooO00o.TOO_BIG, e2.getMessage()));
                    this.f115875OooOo0o = e2;
                    this.f115874OooOo = 3;
                    if (c33695OooO0o0.OooOOO(c20211OooO0O0, this) != enumC32485OooO00o) {
                        c32255OooO0Oo = e2;
                    }
                    return enumC32485OooO00o;
                }
            } catch (C32256OooO0o e3) {
                C33695OooO0o0 c33695OooO0o02 = oooOO02.f115882OooOoO0.f115920OooOoOO;
                AbstractC32252OooO0O0.C20211OooO0O0 c20211OooO0O02 = new AbstractC32252OooO0O0.C20211OooO0O0(new C32251OooO00o(C32251OooO00o.EnumC20210OooO00o.PROTOCOL_ERROR, e3.getMessage()));
                this.f115875OooOo0o = e3;
                this.f115874OooOo = 4;
                if (c33695OooO0o02.OooOOO(c20211OooO0O02, this) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                c32256OooO0o = e3;
            } catch (Throwable th) {
                oooOO02.f115880OooOo0o.OooOOOo(false, th);
            }
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C33695OooO0o0 c33695OooO0o03 = oooOO02.f115881OooOoO.f115900OooOoo;
                c33695OooO0o03.getClass();
                oooO00o = new C33695OooO0o0.OooO00o();
            } else {
                if (i == 1) {
                    oooO00o = (InterfaceC33701OooOO0o) this.f115875OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    if (((Boolean) obj).booleanValue()) {
                        AbstractC32252OooO0O0 abstractC32252OooO0O0 = (AbstractC32252OooO0O0) oooO00o.next();
                        C33695OooO0o0 c33695OooO0o04 = oooOO02.f115880OooOo0o;
                        this.f115875OooOo0o = oooO00o;
                        this.f115874OooOo = 2;
                        if (c33695OooO0o04.OooOOO(abstractC32252OooO0O0, this) != enumC32485OooO00o) {
                        }
                        return enumC32485OooO00o;
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
                if (i != 2) {
                    if (i == 3) {
                        c32255OooO0Oo = (C32255OooO0Oo) this.f115875OooOo0o;
                        C32446OooOOOo.OooO0O0(obj);
                        oooOO02.f115880OooOo0o.OooOOOo(false, c32255OooO0Oo);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c32256OooO0o = (C32256OooO0o) this.f115875OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    oooOO02.f115880OooOo0o.OooOOOo(false, c32256OooO0o);
                    return C32460OooOooO.f116667OooO00o;
                }
                oooO00o = (InterfaceC33701OooOO0o) this.f115875OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
            }
            this.f115875OooOo0o = oooO00o;
            this.f115874OooOo = 1;
            obj = oooO00o.OooO00o(this);
            if (obj != enumC32485OooO00o) {
                if (((Boolean) obj).booleanValue()) {
                }
                return C32460OooOooO.f116667OooO00o;
            }
            return enumC32485OooO00o;
        } finally {
            oooOO02.f115880OooOo0o.OooO0Oo(null);
        }
    }
}
