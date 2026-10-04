package com.orion.notein.data.repo.backup;

import com.aspose.words.StyleIdentifier;
import com.google.api.services.drive.Drive;
import com.orion.notein.domain.models.backup.BackupInstance;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO0o0O0o.C33588OooOO0;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.backup.BackupGoogleDriveDatasource", m80623f = "BackupGoogleDriveDatasource.kt", m80624l = {StyleIdentifier.LIST_TABLE_7_COLORFUL_ACCENT_3, StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_4, StyleIdentifier.LIST_TABLE_3_ACCENT_5}, m80625m = "getInstanceDirFile")
public final class Oooo000 extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Drive f69961OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C22907OooOooO f69962OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public /* synthetic */ Object f69963OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public BackupInstance f69964OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ C22907OooOooO f69965OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f69966OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oooo000(C22907OooOooO c22907OooOooO, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f69965OooOoOO = c22907OooOooO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f69963OooOoO = obj;
        this.f69966OooOoo0 |= Integer.MIN_VALUE;
        C33588OooOO0 c33588OooOO0 = C22907OooOooO.f69937OooO0oO;
        return this.f69965OooOoOO.OooO0o(null, null, this);
    }
}
