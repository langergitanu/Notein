package oO0o0o0O;

import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33632Oooo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: oO0o0o0O.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "kotlinx.coroutines.rx3.RxConvertKt$asSingle$1", m80623f = "RxConvert.kt", m80624l = {58}, m80625m = "invokeSuspend")
public final class C33862OooO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<Object>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C33632Oooo f121999OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f122000OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33862OooO0o(C33632Oooo c33632Oooo, Continuation continuation) {
        super(2, continuation);
        this.f121999OooOo = c33632Oooo;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C33862OooO0o(this.f121999OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<Object> continuation) {
        return ((C33862OooO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f122000OooOo0o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        C32446OooOOOo.OooO0O0(obj);
        this.f122000OooOo0o = 1;
        Object objOooOo00 = this.f121999OooOo.OooOo00(this);
        return objOooOo00 == enumC32485OooO00o ? enumC32485OooO00o : objOooOo00;
    }
}
