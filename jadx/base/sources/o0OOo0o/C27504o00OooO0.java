package o0OOo0o;

import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0OOo0o.o00OooO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.ResetGlobalSettingsUseCase", m80623f = "ResetGlobalSettingsUseCase.kt", m80624l = {110, 111, 112}, m80625m = "resetCloudSync")
public final class C27504o00OooO0 extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f96389OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public o0O00o0 f96390OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f96391OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ o0O00o0 f96392OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27504o00OooO0(o0O00o0 o0o00o02, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f96392OooOoO0 = o0o00o02;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f96389OooOo = obj;
        this.f96391OooOoO |= Integer.MIN_VALUE;
        return o0O00o0.OooO0O0(this.f96392OooOoO0, this);
    }
}
