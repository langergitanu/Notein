package oO0Ooo0o;

import io.ktor.utils.p616io.InterfaceC23967Oooo00O;
import io.ktor.utils.p616io.o000OOo;
import kotlin.coroutines.Continuation;
import oO00O0oO.OooO0OO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: renamed from: oO0Ooo0o.OooOo00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "io.ktor.client.plugins.logging.ObservingUtilsKt$toReadChannel$1", m80623f = "ObservingUtils.kt", m80624l = {40}, m80625m = "invokeSuspend")
public final class C33448OooOo00 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<o000OOo, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f120903OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f120904OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ OooO0OO.OooO0Oo f120905OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33448OooOo00(OooO0OO.OooO0Oo oooO0Oo, Continuation<? super C33448OooOo00> continuation) {
        super(2, continuation);
        this.f120905OooOoO0 = oooO0Oo;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C33448OooOo00 c33448OooOo00 = new C33448OooOo00(this.f120905OooOoO0, continuation);
        c33448OooOo00.f120903OooOo = obj;
        return c33448OooOo00;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(o000OOo o000ooo2, Continuation<? super C32460OooOooO> continuation) {
        return ((C33448OooOo00) create(o000ooo2, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f120904OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC23967Oooo00O interfaceC23967Oooo00OOooO0OO = ((o000OOo) this.f120903OooOo).OooO0OO();
            this.f120904OooOo0o = 1;
            if (this.f120905OooOoO0.OooO0o0(interfaceC23967Oooo00OOooO0OO, this) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
