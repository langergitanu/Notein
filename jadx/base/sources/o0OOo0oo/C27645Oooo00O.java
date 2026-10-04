package o0OOo0oo;

import oO00ooO.C32445OooOOOO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;

/* JADX INFO: renamed from: o0OOo0oo.Oooo00O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.cloudsync.FetchCloudBundleUseCase", m80623f = "FetchCloudBundleUseCase.kt", m80624l = {36}, m80625m = "invoke-gIAlu-s")
public final class C27645Oooo00O extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C27643Oooo0 f97223OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f97224OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f97225OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27645Oooo00O(C27643Oooo0 c27643Oooo0, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f97223OooOo = c27643Oooo0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f97224OooOo0o = obj;
        this.f97225OooOoO0 |= Integer.MIN_VALUE;
        Object objOooO0O0 = this.f97223OooOo.OooO0O0(null, this);
        return objOooO0O0 == EnumC32485OooO00o.f116726OooOo0o ? objOooO0O0 : new C32445OooOOOO(objOooO0O0);
    }
}
