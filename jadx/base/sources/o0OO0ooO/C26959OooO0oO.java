package o0OO0ooO;

import com.orion.notein.domain.models.material.Material;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0OO0ooO.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.material.MaterialDownloadRepositoryImpl", m80623f = "MaterialDownloadRepositoryImpl.kt", m80624l = {114}, m80625m = "saveMaterial")
public final class C26959OooO0oO extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f93638OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Material f93639OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f93640OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C26952OooO f93641OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26959OooO0oO(C26952OooO c26952OooO, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f93641OooOoO0 = c26952OooO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f93638OooOo = obj;
        this.f93640OooOoO |= Integer.MIN_VALUE;
        return this.f93641OooOoO0.OooO0Oo(null, this);
    }
}
