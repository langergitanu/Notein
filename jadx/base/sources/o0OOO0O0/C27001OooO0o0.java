package o0OOO0O0;

import com.orion.notein.domain.models.ocr.AiOcrSessionInputSource;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0OOO0O0.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.ocr.datasource.AiOcrSessionLocalDataSource", m80623f = "AiOcrSessionLocalDataSource.kt", m80624l = {174, 181}, m80625m = "saveInputSourceLocked")
public final class C27001OooO0o0 extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public AiOcrSessionInputSource f93943OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C27002OooO0oO f93944OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C27002OooO0oO f93945OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f93946OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f93947OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27001OooO0o0(C27002OooO0oO c27002OooO0oO, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f93945OooOoO = c27002OooO0oO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f93946OooOoO0 = obj;
        this.f93947OooOoOO |= Integer.MIN_VALUE;
        return C27002OooO0oO.OooO0O0(this.f93945OooOoO, null, null, this);
    }
}
