package com.orion.notein.data.repo.backup;

import com.google.api.services.drive.Drive;
import com.orion.notein.domain.models.backup.BackupFile;
import java.io.File;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.backup.BackupGoogleDriveDatasource", m80623f = "BackupGoogleDriveDatasource.kt", m80624l = {154}, m80625m = "upload")
public final class Oooo0 extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public BackupFile f69954OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C22907OooOooO f69955OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public Drive f69956OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public File f69957OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public /* synthetic */ Object f69958OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public int f69959OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ C22907OooOooO f69960OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oooo0(C22907OooOooO c22907OooOooO, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f69960OooOoo0 = c22907OooOooO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f69958OooOoOO = obj;
        this.f69959OooOoo |= Integer.MIN_VALUE;
        return this.f69960OooOoo0.OooOO0(null, this);
    }
}
