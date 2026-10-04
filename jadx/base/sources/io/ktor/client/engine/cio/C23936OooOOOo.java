package io.ktor.client.engine.cio;

import java.util.TimeZone;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33644OoooO0;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0oOOO0.C34108OooO00o;

/* JADX INFO: renamed from: io.ktor.client.engine.cio.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "io.ktor.client.engine.cio.Endpoint$timeout$1", m80623f = "Endpoint.kt", m80624l = {48}, m80625m = "invokeSuspend")
public final class C23936OooOOOo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C23938OooOOo0 f80423OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f80424OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23936OooOOOo(C23938OooOOo0 c23938OooOOo0, Continuation<? super C23936OooOOOo> continuation) {
        super(2, continuation);
        this.f80423OooOo = c23938OooOOo0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C23936OooOOOo(this.f80423OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C23936OooOOOo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        C23938OooOOo0 c23938OooOOo0;
        long jCurrentTimeMillis;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f80424OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            try {
                C32446OooOOOo.OooO0O0(obj);
            } catch (Throwable unused) {
                this.f80423OooOo.f80437OooOooO.OooO0Oo(null);
                c23938OooOOo0 = this.f80423OooOo;
            }
        }
        do {
            long j = this.f80423OooOo.lastActivity + this.f80423OooOo.f80438OooOooo;
            TimeZone timeZone = C34108OooO00o.f122561OooO00o;
            jCurrentTimeMillis = j - System.currentTimeMillis();
            if (jCurrentTimeMillis <= 0) {
                this.f80423OooOo.f80437OooOooO.OooO0Oo(null);
                c23938OooOOo0 = this.f80423OooOo;
                c23938OooOOo0.f80435OooOoo.invoke();
                return C32460OooOooO.f116667OooO00o;
            }
            this.f80424OooOo0o = 1;
        } while (C33644OoooO0.OooO00o(jCurrentTimeMillis, this) != enumC32485OooO00o);
        return enumC32485OooO00o;
    }
}
