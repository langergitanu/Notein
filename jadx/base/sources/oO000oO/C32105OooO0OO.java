package oO000oO;

import androidx.core.location.LocationRequestCompat;
import io.ktor.utils.p616io.C23991Oooooo0;
import io.ktor.utils.p616io.Oooo0;
import io.ktor.utils.p616io.o000OOo;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: renamed from: oO000oO.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "io.ktor.client.network.sockets.TimeoutExceptionsCommonKt$mapEngineExceptions$1", m80623f = "TimeoutExceptionsCommon.kt", m80624l = {38}, m80625m = "invokeSuspend")
public final class C32105OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<o000OOo, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ io.ktor.utils.p616io.OooO00o f115085OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f115086OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Oooo0 f115087OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32105OooO0OO(io.ktor.utils.p616io.OooO00o oooO00o, Oooo0 oooo0, Continuation continuation) {
        super(2, continuation);
        this.f115085OooOo = oooO00o;
        this.f115087OooOoO0 = oooo0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C32105OooO0OO(this.f115085OooOo, this.f115087OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(o000OOo o000ooo2, Continuation<? super C32460OooOooO> continuation) {
        return ((C32105OooO0OO) create(o000ooo2, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f115086OooOo0o;
        io.ktor.utils.p616io.OooO00o oooO00o = this.f115085OooOo;
        try {
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                Oooo0 oooo0 = this.f115087OooOoO0;
                this.f115086OooOo0o = 1;
                if (C23991Oooooo0.OooO00o(oooO00o, oooo0, LocationRequestCompat.PASSIVE_INTERVAL, this) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
        } catch (Throwable th) {
            oooO00o.OooO0Oo(th);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
