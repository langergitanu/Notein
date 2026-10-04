package o0OO0o0;

import oO00ooO.C32445OooOOOO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;

/* JADX INFO: renamed from: o0OO0o0.o00o0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.onedrive.OneDriveDriveSyncBackend", m80623f = "OneDriveDriveSyncBackend.kt", m80624l = {235, 239, 240}, m80625m = "fetchAllExistedFileIds-IoAF18A")
public final class C26864o00o0O extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f93057OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public o00oO0O f93058OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f93059OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ o00oO0O f93060OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26864o00o0O(o00oO0O o00oo0o, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f93060OooOoO0 = o00oo0o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f93057OooOo = obj;
        this.f93059OooOoO |= Integer.MIN_VALUE;
        Object objOooOO0O = this.f93060OooOoO0.OooOO0O(this);
        return objOooOO0O == EnumC32485OooO00o.f116726OooOo0o ? objOooOO0O : new C32445OooOOOO(objOooOO0O);
    }
}
