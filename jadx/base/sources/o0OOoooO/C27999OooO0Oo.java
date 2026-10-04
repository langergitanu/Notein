package o0OOoooO;

import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0OOoooO.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.folder.FolderRepoImpl", m80623f = "FolderRepoImpl.kt", m80624l = {144}, m80625m = "getAllFoldersSync")
public final class C27999OooO0Oo extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f99289OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C28009OooOOOO f99290OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f99291OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C28009OooOOOO f99292OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27999OooO0Oo(C28009OooOOOO c28009OooOOOO, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f99292OooOoO0 = c28009OooOOOO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f99289OooOo = obj;
        this.f99291OooOoO |= Integer.MIN_VALUE;
        return this.f99292OooOoO0.OooO0OO(null, this);
    }
}
