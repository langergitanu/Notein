package o0OO0OoO;

import com.orion.notein.domain.models.cloudsync.CloudBundle;
import oO00ooO.C32445OooOOOO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.CloudSyncRepoImpl", m80623f = "CloudSyncRepoImpl.kt", m80624l = {383, 387, 390}, m80625m = "requestPushMetaOnly-BWLJW6A")
public final class Oooo0 extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public String f92447OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C26740Oooo0oo f92448OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public boolean f92449OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public CloudBundle f92450OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public /* synthetic */ Object f92451OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public int f92452OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ C26740Oooo0oo f92453OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oooo0(C26740Oooo0oo c26740Oooo0oo, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f92453OooOoo0 = c26740Oooo0oo;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f92451OooOoOO = obj;
        this.f92452OooOoo |= Integer.MIN_VALUE;
        Object objOooOooo = this.f92453OooOoo0.OooOooo(null, null, false, this);
        return objOooOooo == EnumC32485OooO00o.f116726OooOo0o ? objOooOooo : new C32445OooOOOO(objOooOooo);
    }
}
