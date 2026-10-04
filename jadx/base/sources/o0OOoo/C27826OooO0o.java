package o0OOoo;

import oO00ooO.C32445OooOOOO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;

/* JADX INFO: renamed from: o0OOoo.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.page.RecoverPageUseCase", m80623f = "RecoverPageUseCase.kt", m80624l = {33}, m80625m = "recoverPage-0E7RQCE")
public final class C27826OooO0o extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C27821OooO f98298OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f98299OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f98300OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27826OooO0o(C27821OooO c27821OooO, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f98298OooOo = c27821OooO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.f98299OooOo0o = obj;
        this.f98300OooOoO0 |= Integer.MIN_VALUE;
        Object objOooO0OO = this.f98298OooOo.OooO0OO(null, null, this);
        return objOooO0OO == EnumC32485OooO00o.f116726OooOo0o ? objOooO0OO : new C32445OooOOOO(objOooO0OO);
    }
}
