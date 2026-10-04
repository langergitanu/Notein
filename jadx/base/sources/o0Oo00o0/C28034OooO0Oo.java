package o0Oo00o0;

import com.orion.notein.domain.workmanager.PageTextCacheUpdateWorker;
import java.util.List;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0Oo00o0.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.workmanager.PageTextCacheUpdateWorker", m80623f = "PageTextCacheUpdateWorker.kt", m80624l = {55, 62, 65, 85}, m80625m = "doWork")
public final class C28034OooO0Oo extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public List f99391OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public PageTextCacheUpdateWorker f99392OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ PageTextCacheUpdateWorker f99393OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f99394OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f99395OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28034OooO0Oo(PageTextCacheUpdateWorker pageTextCacheUpdateWorker, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f99393OooOoO = pageTextCacheUpdateWorker;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f99394OooOoO0 = obj;
        this.f99395OooOoOO |= Integer.MIN_VALUE;
        return this.f99393OooOoO.OooO0oo(this);
    }
}
