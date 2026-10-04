package o0OOO0O;

import kotlin.coroutines.Continuation;
import o0O0oooO.AbstractApplicationC26277OooOoOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.oss.ObjectStorageServiceRepoImpl$1", m80623f = "ObjectStorageServiceRepoImpl.kt", m80624l = {32}, m80625m = "invokeSuspend")
public final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C26999OooO0o0 f93899OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f93900OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ AbstractApplicationC26277OooOoOO f93901OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0OO(C26999OooO0o0 c26999OooO0o0, AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO, Continuation continuation) {
        super(2, continuation);
        this.f93899OooOo = c26999OooO0o0;
        this.f93901OooOoO0 = abstractApplicationC26277OooOoOO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new OooO0OO(this.f93899OooOo, this.f93901OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f93900OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f93900OooOo0o = 1;
            if (C26999OooO0o0.OooO0Oo(this.f93899OooOo, this.f93901OooOoO0, this) == enumC32485OooO00o) {
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
