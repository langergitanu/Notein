package o0Oo00o0;

import com.orion.notein.domain.models.page.Page;
import com.orion.notein.domain.models.papertheme.PdfPaperTheme;
import com.orion.notein.domain.workmanager.PageTextCacheUpdateWorker;
import java.util.Iterator;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0Oo00o0.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.workmanager.PageTextCacheUpdateWorker", m80623f = "PageTextCacheUpdateWorker.kt", m80624l = {165, 175}, m80625m = "checkAndUpdatePdfTextCache")
public final class C28032OooO0O0 extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Iterator f99383OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public PageTextCacheUpdateWorker f99384OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public PdfPaperTheme f99385OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Page f99386OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f99387OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ PageTextCacheUpdateWorker f99388OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public /* synthetic */ Object f99389OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public int f99390OooOooO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28032OooO0O0(PageTextCacheUpdateWorker pageTextCacheUpdateWorker, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f99388OooOoo = pageTextCacheUpdateWorker;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f99389OooOoo0 = obj;
        this.f99390OooOooO |= Integer.MIN_VALUE;
        return this.f99388OooOoo.OooOO0(null, this);
    }
}
