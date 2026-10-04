package o000oo0o;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24034Oooo00O;
import o000oo0.InterfaceC24688Oooo0OO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o000oo0o.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC32482OooO0o0(m80622c = "androidx.room.coroutines.ConnectionPoolImpl$useConnection$4", m80623f = "ConnectionPoolImpl.kt", m80624l = {143}, m80625m = "invokeSuspend")
public final class C24707OooO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<Object>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ InterfaceC32508OooOOOo<InterfaceC24688Oooo0OO, Continuation<Object>, Object> f83754OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f83755OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C24034Oooo00O<C24723OooOOo> f83756OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C24707OooO(InterfaceC32508OooOOOo<? super InterfaceC24688Oooo0OO, ? super Continuation<Object>, ? extends Object> interfaceC32508OooOOOo, C24034Oooo00O<C24723OooOOo> c24034Oooo00O, Continuation<? super C24707OooO> continuation) {
        super(2, continuation);
        this.f83754OooOo = interfaceC32508OooOOOo;
        this.f83756OooOoO0 = c24034Oooo00O;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C24707OooO(this.f83754OooOo, this.f83756OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<Object> continuation) {
        return ((C24707OooO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f83755OooOo0o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        C32446OooOOOo.OooO0O0(obj);
        C24723OooOOo c24723OooOOo = this.f83756OooOoO0.f80942OooOo0o;
        this.f83755OooOo0o = 1;
        Object objInvoke = this.f83754OooOo.invoke(c24723OooOOo, this);
        return objInvoke == enumC32485OooO00o ? enumC32485OooO00o : objInvoke;
    }
}
