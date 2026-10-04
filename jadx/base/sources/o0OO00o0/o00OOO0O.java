package o0OO00o0;

import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oo0oO0.InterfaceC34877o00OooOo;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.OutlineLocalDataSource$deleteOutlinesByPageId$2", m80623f = "OutlineLocalDataSource.kt", m80624l = {63}, m80625m = "invokeSuspend")
public final class o00OOO0O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC34877o00OooOo, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f91829OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f91830OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f91831OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OOO0O(String str, Continuation<? super o00OOO0O> continuation) {
        super(2, continuation);
        this.f91831OooOoO0 = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        o00OOO0O o00ooo0o = new o00OOO0O(this.f91831OooOoO0, continuation);
        o00ooo0o.f91829OooOo = obj;
        return o00ooo0o;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC34877o00OooOo interfaceC34877o00OooOo, Continuation<? super C32460OooOooO> continuation) {
        return ((o00OOO0O) create(interfaceC34877o00OooOo, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f91830OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC34877o00OooOo interfaceC34877o00OooOo = (InterfaceC34877o00OooOo) this.f91829OooOo;
            this.f91830OooOo0o = 1;
            if (interfaceC34877o00OooOo.OooO(this.f91831OooOoO0, this) == enumC32485OooO00o) {
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
