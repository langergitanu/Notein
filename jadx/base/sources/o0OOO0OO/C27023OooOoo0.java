package o0OOO0OO;

import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0OOO0OO.OooOoo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.page.PageRepoImpl", m80623f = "PageRepoImpl.kt", m80624l = {140}, m80625m = "getPagesByNoteIdSync")
public final class C27023OooOoo0 extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f94091OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C27020OooOoO0 f94092OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f94093OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C27020OooOoO0 f94094OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27023OooOoo0(C27020OooOoO0 c27020OooOoO0, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f94094OooOoO0 = c27020OooOoO0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f94091OooOo = obj;
        this.f94093OooOoO |= Integer.MIN_VALUE;
        return this.f94094OooOoO0.OooO0oO(null, this);
    }
}
