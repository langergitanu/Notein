package oO00Oo;

import java.nio.ByteBuffer;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: oO00Oo.OooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "io.ktor.websocket.WebSocketWriter$writeLoopJob$1", m80623f = "WebSocketWriter.kt", m80624l = {40}, m80625m = "invokeSuspend")
public final class C32265OooOo0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Object f115933OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public oO00Oo0o.OooO0o f115934OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C32262OooOOo f115935OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f115936OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32265OooOo0(C32262OooOOo c32262OooOOo, Continuation<? super C32265OooOo0> continuation) {
        super(2, continuation);
        this.f115935OooOoO = c32262OooOOo;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C32265OooOo0(this.f115935OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C32265OooOo0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws Throwable {
        oO00Oo0o.OooO0o oooO0o;
        Object obj2;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f115936OooOoO0;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C32262OooOOo c32262OooOOo = this.f115935OooOoO;
            oooO0o = c32262OooOOo.f115918OooOoO;
            Object objO0000OoO = oooO0o.o0000OoO();
            try {
                this.f115934OooOo0o = oooO0o;
                this.f115933OooOo = objO0000OoO;
                this.f115936OooOoO0 = 1;
                if (C32262OooOOo.OooO00o(c32262OooOOo, (ByteBuffer) objO0000OoO, this) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                obj2 = objO0000OoO;
            } catch (Throwable th) {
                th = th;
                obj2 = objO0000OoO;
                oooO0o.o00o0O(obj2);
                throw th;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj2 = this.f115933OooOo;
            oooO0o = this.f115934OooOo0o;
            try {
                C32446OooOOOo.OooO0O0(obj);
            } catch (Throwable th2) {
                th = th2;
                oooO0o.o00o0O(obj2);
                throw th;
            }
        }
        C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
        oooO0o.o00o0O(obj2);
        return C32460OooOooO.f116667OooO00o;
    }
}
