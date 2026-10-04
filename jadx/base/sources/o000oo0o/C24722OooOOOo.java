package o000oo0o;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24034Oooo00O;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o000oo0o.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC32482OooO0o0(m80622c = "androidx.room.coroutines.Pool$acquireWithTimeout$2", m80623f = "ConnectionPoolImpl.kt", m80624l = {209}, m80625m = "invokeSuspend")
public final class C24722OooOOOo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f83810OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C24034Oooo00O f83811OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C24724OooOOo0 f83812OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C24034Oooo00O<C24717OooOO0O> f83813OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24722OooOOOo(C24034Oooo00O<C24717OooOO0O> c24034Oooo00O, C24724OooOOo0 c24724OooOOo0, Continuation<? super C24722OooOOOo> continuation) {
        super(2, continuation);
        this.f83813OooOoO0 = c24034Oooo00O;
        this.f83812OooOoO = c24724OooOOo0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C24722OooOOOo(this.f83813OooOoO0, this.f83812OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C24722OooOOOo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        C24034Oooo00O<C24717OooOO0O> c24034Oooo00O;
        T t;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f83810OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C24034Oooo00O<C24717OooOO0O> c24034Oooo00O2 = this.f83813OooOoO0;
            this.f83811OooOo0o = c24034Oooo00O2;
            this.f83810OooOo = 1;
            Object objOooO00o = this.f83812OooOoO.OooO00o(this);
            if (objOooO00o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c24034Oooo00O = c24034Oooo00O2;
            t = objOooO00o;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c24034Oooo00O = this.f83811OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            t = obj;
        }
        c24034Oooo00O.f80942OooOo0o = t;
        return C32460OooOooO.f116667OooO00o;
    }
}
