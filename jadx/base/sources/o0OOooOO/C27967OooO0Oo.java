package o0OOooOO;

import oO00ooO.C32445OooOOOO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;

/* JADX INFO: renamed from: o0OOooOO.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.paper.DeleteCustomPaperColorUseCase", m80623f = "DeleteCustomPaperColorUseCase.kt", m80624l = {20}, m80625m = "invoke-gIAlu-s")
public final class C27967OooO0Oo extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C27968OooO0o f99155OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f99156OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f99157OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27967OooO0Oo(C27968OooO0o c27968OooO0o, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f99155OooOo = c27968OooO0o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f99156OooOo0o = obj;
        this.f99157OooOoO0 |= Integer.MIN_VALUE;
        Object objOooO00o = this.f99155OooOo.OooO00o(0, this);
        return objOooO00o == EnumC32485OooO00o.f116726OooOo0o ? objOooO00o : new C32445OooOOOO(objOooO00o);
    }
}
