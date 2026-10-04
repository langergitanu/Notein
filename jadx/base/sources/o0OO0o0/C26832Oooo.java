package o0OO0o0;

import oO00ooO.C32445OooOOOO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;

/* JADX INFO: renamed from: o0OO0o0.Oooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.onedrive.OneDriveDriveSessionManager", m80623f = "OneDriveDriveSessionManager.kt", m80624l = {105}, m80625m = "ensureInitialized-IoAF18A")
public final class C26832Oooo extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C26837Oooo0OO f92864OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f92865OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f92866OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26832Oooo(C26837Oooo0OO c26837Oooo0OO, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f92864OooOo = c26837Oooo0OO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f92865OooOo0o = obj;
        this.f92866OooOoO0 |= Integer.MIN_VALUE;
        Object objOooO0o = this.f92864OooOo.OooO0o(this);
        return objOooO0o == EnumC32485OooO00o.f116726OooOo0o ? objOooO0o : new C32445OooOOOO(objOooO0o);
    }
}
