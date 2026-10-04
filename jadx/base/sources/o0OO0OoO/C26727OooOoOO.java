package o0OO0OoO;

import oO00ooO.C32445OooOOOO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;

/* JADX INFO: renamed from: o0OO0OoO.OooOoOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.CloudSyncRepoImpl", m80623f = "CloudSyncRepoImpl.kt", m80624l = {133, 135, 136}, m80625m = "getCurrentDriveId-IoAF18A")
public final class C26727OooOoOO extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f92426OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C26740Oooo0oo f92427OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f92428OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C26740Oooo0oo f92429OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26727OooOoOO(C26740Oooo0oo c26740Oooo0oo, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f92429OooOoO0 = c26740Oooo0oo;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f92426OooOo = obj;
        this.f92428OooOoO |= Integer.MIN_VALUE;
        Object objOooO0Oo = this.f92429OooOoO0.OooO0Oo(this);
        return objOooO0Oo == EnumC32485OooO00o.f116726OooOo0o ? objOooO0Oo : new C32445OooOOOO(objOooO0Oo);
    }
}
