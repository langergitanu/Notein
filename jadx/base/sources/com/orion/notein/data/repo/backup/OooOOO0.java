package com.orion.notein.data.repo.backup;

import o0000oOO.AbstractC24338OooO0o0;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.backup.BackupBaiduDatasource", m80623f = "BackupBaiduDatasource.kt", m80624l = {842, 843}, m80625m = "getInstanceDirPath")
public final class OooOOO0 extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f69869OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public BackupBaiduDatasource f69870OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f69871OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ BackupBaiduDatasource f69872OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO0(BackupBaiduDatasource backupBaiduDatasource, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f69872OooOoO0 = backupBaiduDatasource;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f69869OooOo = obj;
        this.f69871OooOoO |= Integer.MIN_VALUE;
        AbstractC24338OooO0o0.OooO00o<String> oooO00o = BackupBaiduDatasource.f69830OooO0o;
        return this.f69872OooOoO0.OooO0oO(this);
    }
}
