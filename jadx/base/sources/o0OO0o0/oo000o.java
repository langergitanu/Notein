package o0OO0o0;

import oO00ooO.C32445OooOOOO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.onedrive.OneDriveDriveSyncBackend", m80623f = "OneDriveDriveSyncBackend.kt", m80624l = {185, 188, 194}, m80625m = "fetchFileSnapshot-gIAlu-s")
public final class oo000o extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public String f93129OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Object f93130OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public /* synthetic */ Object f93131OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public o00oO0O f93132OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ o00oO0O f93133OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f93134OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo000o(o00oO0O o00oo0o, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f93133OooOoOO = o00oo0o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f93131OooOoO = obj;
        this.f93134OooOoo0 |= Integer.MIN_VALUE;
        Object objOooOOo0 = this.f93133OooOoOO.OooOOo0(null, this);
        return objOooOOo0 == EnumC32485OooO00o.f116726OooOo0o ? objOooOOo0 : new C32445OooOOOO(objOooOOo0);
    }
}
