package com.orion.notein.data.repo.backup;

import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: com.orion.notein.data.repo.backup.OooOooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.backup.BackupGoogleDriveDatasource", m80623f = "BackupGoogleDriveDatasource.kt", m80624l = {131}, m80625m = "cancelAuthorize")
public final class C22908OooOooo extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f69946OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C22907OooOooO f69947OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f69948OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C22907OooOooO f69949OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22908OooOooo(C22907OooOooO c22907OooOooO, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f69949OooOoO0 = c22907OooOooO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f69946OooOo = obj;
        this.f69948OooOoO |= Integer.MIN_VALUE;
        return this.f69949OooOoO0.OooO00o(this);
    }
}
