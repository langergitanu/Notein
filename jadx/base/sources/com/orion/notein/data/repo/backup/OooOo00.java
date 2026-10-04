package com.orion.notein.data.repo.backup;

import com.google.logging.type.LogSeverity;
import o0000oOO.AbstractC24338OooO0o0;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.backup.BackupBaiduDatasource", m80623f = "BackupBaiduDatasource.kt", m80624l = {667, 674, 682, LogSeverity.ALERT_VALUE}, m80625m = "searchFilesInternal")
public final class OooOo00 extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public String f69916OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Object f69917OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public String f69918OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public String f69919OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public /* synthetic */ Object f69920OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public int f69921OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ BackupBaiduDatasource f69922OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOo00(BackupBaiduDatasource backupBaiduDatasource, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f69922OooOoo0 = backupBaiduDatasource;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f69920OooOoOO = obj;
        this.f69921OooOoo |= Integer.MIN_VALUE;
        AbstractC24338OooO0o0.OooO00o<String> oooO00o = BackupBaiduDatasource.f69830OooO0o;
        return this.f69922OooOoo0.OooOOO(null, null, this);
    }
}
