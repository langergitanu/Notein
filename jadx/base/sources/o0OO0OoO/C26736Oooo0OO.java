package o0OO0OoO;

import kotlin.coroutines.Continuation;
import o0000oOO.C24334OooO0O0;
import o0OOo0Oo.EnumC27285OooO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: renamed from: o0OO0OoO.Oooo0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.CloudSyncRepoImpl$setCurrentCloudType$2", m80623f = "CloudSyncRepoImpl.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C26736Oooo0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C24334OooO0O0, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C26740Oooo0oo f92474OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f92475OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ EnumC27285OooO f92476OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26736Oooo0OO(C26740Oooo0oo c26740Oooo0oo, EnumC27285OooO enumC27285OooO, Continuation<? super C26736Oooo0OO> continuation) {
        super(2, continuation);
        this.f92474OooOo = c26740Oooo0oo;
        this.f92476OooOoO0 = enumC27285OooO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C26736Oooo0OO c26736Oooo0OO = new C26736Oooo0OO(this.f92474OooOo, this.f92476OooOoO0, continuation);
        c26736Oooo0OO.f92475OooOo0o = obj;
        return c26736Oooo0OO;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(C24334OooO0O0 c24334OooO0O0, Continuation<? super C32460OooOooO> continuation) {
        return ((C26736Oooo0OO) create(c24334OooO0O0, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        ((C24334OooO0O0) this.f92475OooOo0o).OooO0oO(this.f92474OooOo.f92495OooO0Oo, this.f92476OooOoO0.name());
        return C32460OooOooO.f116667OooO00o;
    }
}
