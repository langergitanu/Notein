package com.orion.notein.data.repo.backup;

import com.orion.notein.domain.models.backup.BackupFile;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: com.orion.notein.data.repo.backup.OoooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.backup.BackupRepoImpl", m80623f = "BackupRepoImpl.kt", m80624l = {41, 44, 50, 57, 60}, m80625m = "useNetworkDisk")
public final class C22922OoooOO0 extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public BackupFile.DiskVendor f70009OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Object f70010OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C22913Oooo0OO f70011OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f70012OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f70013OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22922OoooOO0(C22913Oooo0OO c22913Oooo0OO, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f70011OooOoO = c22913Oooo0OO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f70012OooOoO0 = obj;
        this.f70013OooOoOO |= Integer.MIN_VALUE;
        return this.f70011OooOoO.OooO00o(null, false, this);
    }
}
