package o0OOo0o;

import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0OOo0o.OooOooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.BackupUseCase", m80623f = "BackupUseCase.kt", m80624l = {1001}, m80625m = "recoverTemplateByTemplateFile")
public final class C27347OooOooo extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C27351Oooo0O0 f95210OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f95211OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f95212OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27347OooOooo(C27351Oooo0O0 c27351Oooo0O0, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f95210OooOo = c27351Oooo0O0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f95211OooOo0o = obj;
        this.f95212OooOoO0 |= Integer.MIN_VALUE;
        return this.f95210OooOo.OooOo(null, this);
    }
}
