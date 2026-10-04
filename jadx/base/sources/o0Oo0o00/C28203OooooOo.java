package o0Oo0o00;

import oO00ooO.C32445OooOOOO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;

/* JADX INFO: renamed from: o0Oo0o00.OooooOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.datasync.CloudSyncViewModel", m80623f = "CloudSyncViewModel.kt", m80624l = {571}, m80625m = "checkCloudSyncServiceAvailable-IoAF18A")
public final class C28203OooooOo extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C28201OooooO0 f99974OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f99975OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f99976OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28203OooooOo(C28201OooooO0 c28201OooooO0, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f99974OooOo = c28201OooooO0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.f99975OooOo0o = obj;
        this.f99976OooOoO0 |= Integer.MIN_VALUE;
        Object objOooO0o = this.f99974OooOo.OooO0o(this);
        return objOooO0o == EnumC32485OooO00o.f116726OooOo0o ? objOooO0o : new C32445OooOOOO(objOooO0o);
    }
}
