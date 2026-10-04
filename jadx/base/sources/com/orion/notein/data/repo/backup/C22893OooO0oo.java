package com.orion.notein.data.repo.backup;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import java.util.List;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: com.orion.notein.data.repo.backup.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.backup.BackupBaiduDatasource", m80623f = "BackupBaiduDatasource.kt", m80624l = {176, 182, 209, 227}, m80625m = RequestParameters.SUBRESOURCE_DELETE)
public final class C22893OooO0oo extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public List f69848OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Object f69849OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public /* synthetic */ Object f69850OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public String f69851OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ BackupBaiduDatasource f69852OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f69853OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22893OooO0oo(BackupBaiduDatasource backupBaiduDatasource, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f69852OooOoOO = backupBaiduDatasource;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f69850OooOoO = obj;
        this.f69853OooOoo0 |= Integer.MIN_VALUE;
        return this.f69852OooOoOO.OooO0O0(null, this);
    }
}
