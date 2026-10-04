package com.orion.notein.data.repo.backup;

import com.orion.notein.domain.models.backup.BackupFile;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: com.orion.notein.data.repo.backup.OoooO00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.backup.BackupRepoImpl", m80623f = "BackupRepoImpl.kt", m80624l = {79, 83, 87}, m80625m = "searchFilesWithInstance")
public final class C22920OoooO00 extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f70003OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public BackupFile.DiskVendor f70004OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f70005OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C22913Oooo0OO f70006OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22920OoooO00(C22913Oooo0OO c22913Oooo0OO, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f70006OooOoO0 = c22913Oooo0OO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f70003OooOo = obj;
        this.f70005OooOoO |= Integer.MIN_VALUE;
        return this.f70006OooOoO0.OooOO0o(null, null, null, this);
    }
}
