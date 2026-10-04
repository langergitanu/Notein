package o0000o0O;

import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: o0000o0O.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC32482OooO0o0(m80622c = "androidx.datastore.core.DataStoreImpl$doWithWriteFileLock$3", m80623f = "DataStoreImpl.kt", m80624l = {416}, m80625m = "invokeSuspend")
public final class C24258OooOOo extends AbstractC32476OooO implements InterfaceC32507OooOO0o<Continuation<Object>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C24268OooOoo0 f81599OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f81600OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24258OooOOo(C24268OooOoo0 c24268OooOoo0, Continuation continuation) {
        super(1, continuation);
        this.f81599OooOo = c24268OooOoo0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Continuation<?> continuation) {
        return new C24258OooOOo(this.f81599OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Continuation<Object> continuation) {
        return ((C24258OooOOo) create(continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f81600OooOo0o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        C32446OooOOOo.OooO0O0(obj);
        this.f81600OooOo0o = 1;
        Object objInvoke = this.f81599OooOo.invoke(this);
        return objInvoke == enumC32485OooO00o ? enumC32485OooO00o : objInvoke;
    }
}
