package o0OOo0oo;

import com.orion.notein.domain.models.cloudsync.SyncEvent;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO0o0oOo.InterfaceC33895OooO00o;

/* JADX INFO: renamed from: o0OOo0oo.OooOooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.cloudsync.EnsureCloudMetaLocalUseCase", m80623f = "EnsureCloudMetaLocalUseCase.kt", m80624l = {110, 40, 46, 54, 60, 66}, m80625m = "invoke")
public final class C27640OooOooO extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public SyncEvent f97202OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Object f97203OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public String f97204OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public InterfaceC33895OooO00o f97205OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public /* synthetic */ Object f97206OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public int f97207OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ C27641OooOooo f97208OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27640OooOooO(C27641OooOooo c27641OooOooo, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f97208OooOoo0 = c27641OooOooo;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f97206OooOoOO = obj;
        this.f97207OooOoo |= Integer.MIN_VALUE;
        return this.f97208OooOoo0.OooO0O0(null, this);
    }
}
