package o000oo0o;

import kotlin.coroutines.Continuation;
import o000oo0.InterfaceC24688Oooo0OO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o000oo0o.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC32482OooO0o0(m80622c = "androidx.room.coroutines.ConnectionPoolImpl$useConnection$2", m80623f = "ConnectionPoolImpl.kt", m80624l = {117}, m80625m = "invokeSuspend")
public final class C24715OooO0oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<Object>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ AbstractC32476OooO f83777OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f83778OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C24723OooOOo f83779OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C24715OooO0oo(InterfaceC32508OooOOOo<? super InterfaceC24688Oooo0OO, ? super Continuation<Object>, ? extends Object> interfaceC32508OooOOOo, C24723OooOOo c24723OooOOo, Continuation<? super C24715OooO0oo> continuation) {
        super(2, continuation);
        this.f83777OooOo = (AbstractC32476OooO) interfaceC32508OooOOOo;
        this.f83779OooOoO0 = c24723OooOOo;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [oO00ooo.OooO, oO0O000o.OooOOOo] */
    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C24715OooO0oo(this.f83777OooOo, this.f83779OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<Object> continuation) {
        return ((C24715OooO0oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [oO00ooo.OooO, oO0O000o.OooOOOo] */
    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f83778OooOo0o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        C32446OooOOOo.OooO0O0(obj);
        this.f83778OooOo0o = 1;
        Object objInvoke = this.f83777OooOo.invoke(this.f83779OooOoO0, this);
        return objInvoke == enumC32485OooO00o ? enumC32485OooO00o : objInvoke;
    }
}
