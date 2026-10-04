package o0Oo00o0;

import com.orion.notein.domain.models.page.Page;
import com.orion.notein.domain.workmanager.PageTextCacheUpdateWorker;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0Oo00o0.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.workmanager.PageTextCacheUpdateWorker", m80623f = "PageTextCacheUpdateWorker.kt", m80624l = {101, 118, 120, 127, 136, 141, 148}, m80625m = "checkAndUpdateHandWritingTextCache")
public final class C28031OooO00o extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Object f99374OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public PageTextCacheUpdateWorker f99375OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public Page f99376OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Object f99377OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public Object f99378OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public /* synthetic */ Object f99379OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public long f99380OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final /* synthetic */ PageTextCacheUpdateWorker f99381OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public int f99382OooOooo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28031OooO00o(PageTextCacheUpdateWorker pageTextCacheUpdateWorker, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f99381OooOooO = pageTextCacheUpdateWorker;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f99379OooOoo = obj;
        this.f99382OooOooo |= Integer.MIN_VALUE;
        return this.f99381OooOooO.OooO(null, this);
    }
}
