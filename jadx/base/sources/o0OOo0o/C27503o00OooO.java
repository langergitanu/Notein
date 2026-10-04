package o0OOo0o;

import java.util.Iterator;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0OOo0o.o00OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.ResetGlobalSettingsUseCase", m80623f = "ResetGlobalSettingsUseCase.kt", m80624l = {65, 73, 80, 82}, m80625m = "resetGlobalPreferences")
public final class C27503o00OooO extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Iterator f96384OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public o0O00o0 f96385OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ o0O00o0 f96386OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f96387OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f96388OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27503o00OooO(o0O00o0 o0o00o02, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f96386OooOoO = o0o00o02;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f96387OooOoO0 = obj;
        this.f96388OooOoOO |= Integer.MIN_VALUE;
        return o0O00o0.OooO0OO(this.f96386OooOoO, this);
    }
}
