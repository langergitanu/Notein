package o0000o0O;

import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;

/* JADX INFO: renamed from: o0000o0O.o0ooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC32482OooO0o0(m80622c = "androidx.datastore.core.StorageConnectionKt$readData$2", m80623f = "StorageConnection.kt", m80624l = {74}, m80625m = "invokeSuspend")
public final class C24303o0ooOoO extends AbstractC32476OooO implements InterfaceC32510OooOOo0<InterfaceC24298Ooooooo<Object>, Boolean, Continuation<Object>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ InterfaceC24298Ooooooo f81804OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f81805OooOo0o;

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(InterfaceC24298Ooooooo<Object> interfaceC24298Ooooooo, Boolean bool, Continuation<Object> continuation) {
        bool.getClass();
        C24303o0ooOoO c24303o0ooOoO = new C24303o0ooOoO(3, continuation);
        c24303o0ooOoO.f81804OooOo = interfaceC24298Ooooooo;
        return c24303o0ooOoO.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f81805OooOo0o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        C32446OooOOOo.OooO0O0(obj);
        InterfaceC24298Ooooooo interfaceC24298Ooooooo = this.f81804OooOo;
        this.f81805OooOo0o = 1;
        Object objOooO0OO = interfaceC24298Ooooooo.OooO0OO(this);
        return objOooO0OO == enumC32485OooO00o ? enumC32485OooO00o : objOooO0OO;
    }
}
