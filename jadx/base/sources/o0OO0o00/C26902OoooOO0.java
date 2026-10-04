package o0OO0o00;

import java.io.Serializable;
import oO00ooO.C32445OooOOOO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;

/* JADX INFO: renamed from: o0OO0o00.OoooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.huawei.HuaweiDriveSyncBackend", m80623f = "HuaweiDriveSyncBackend.kt", m80624l = {190, 194}, m80625m = "checkIfFileExists-gIAlu-s")
public final class C26902OoooOO0 extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public String f93322OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C26913Oooooo f93323OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C26913Oooooo f93324OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f93325OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f93326OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26902OoooOO0(C26913Oooooo c26913Oooooo, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f93324OooOoO = c26913Oooooo;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f93325OooOoO0 = obj;
        this.f93326OooOoOO |= Integer.MIN_VALUE;
        Serializable serializableOooO0o0 = this.f93324OooOoO.OooO0o0(null, this);
        return serializableOooO0o0 == EnumC32485OooO00o.f116726OooOo0o ? serializableOooO0o0 : new C32445OooOOOO(serializableOooO0o0);
    }
}
