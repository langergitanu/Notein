package o0OO0o00;

import java.io.Serializable;
import oO00ooO.C32445OooOOOO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.huawei.HuaweiDriveSyncBackend", m80623f = "HuaweiDriveSyncBackend.kt", m80624l = {380, 387, 394}, m80625m = "checkServiceAvailable-IoAF18A")
public final class o000oOoO extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f93407OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C26913Oooooo f93408OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f93409OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C26913Oooooo f93410OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000oOoO(C26913Oooooo c26913Oooooo, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f93410OooOoO0 = c26913Oooooo;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f93407OooOo = obj;
        this.f93409OooOoO |= Integer.MIN_VALUE;
        Serializable serializableOooO0Oo = this.f93410OooOoO0.OooO0Oo(this);
        return serializableOooO0Oo == EnumC32485OooO00o.f116726OooOo0o ? serializableOooO0Oo : new C32445OooOOOO(serializableOooO0Oo);
    }
}
