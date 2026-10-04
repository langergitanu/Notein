package com.orion.notein.data.repo.backup;

import com.google.firebase.firestore.local.SQLitePersistence;
import o0000oOO.AbstractC24338OooO0o0;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.backup.BackupBaiduDatasource", m80623f = "BackupBaiduDatasource.kt", m80624l = {896, SQLitePersistence.MAX_ARGS}, m80625m = "getUserInfo")
public final class OooOOOO extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f69873OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public BackupBaiduDatasource f69874OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f69875OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ BackupBaiduDatasource f69876OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOOO(BackupBaiduDatasource backupBaiduDatasource, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f69876OooOoO0 = backupBaiduDatasource;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f69873OooOo = obj;
        this.f69875OooOoO |= Integer.MIN_VALUE;
        AbstractC24338OooO0o0.OooO00o<String> oooO00o = BackupBaiduDatasource.f69830OooO0o;
        return this.f69876OooOoO0.OooOO0(this);
    }
}
