package com.orion.notein.data.repo.backup;

import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: com.orion.notein.data.repo.backup.OooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.backup.BackupBaiduDatasource", m80623f = "BackupBaiduDatasource.kt", m80624l = {632, 634, 640}, m80625m = "searchFilesWithInstance")
public final class C22899OooOo0 extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public String f69911OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Object f69912OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ BackupBaiduDatasource f69913OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f69914OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f69915OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22899OooOo0(BackupBaiduDatasource backupBaiduDatasource, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f69913OooOoO = backupBaiduDatasource;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f69914OooOoO0 = obj;
        this.f69915OooOoOO |= Integer.MIN_VALUE;
        return this.f69913OooOoO.OooOOOO(null, null, this);
    }
}
