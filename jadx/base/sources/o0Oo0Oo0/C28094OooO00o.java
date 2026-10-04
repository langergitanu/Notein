package o0Oo0Oo0;

import com.orion.notein.domain.models.backup.BackupException;
import com.orion.notein.p607ui.backup.netdisk.CloudBackupWorker;
import java.io.Serializable;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0Oo0Oo0.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.backup.netdisk.CloudBackupWorker", m80623f = "CloudBackupWorker.kt", m80624l = {34, 36, 40, 41, 48}, m80625m = "doWork")
public final class C28094OooO00o extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public String f99564OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public CloudBackupWorker f99565OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public BackupException f99566OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Serializable f99567OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f99568OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ CloudBackupWorker f99569OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public /* synthetic */ Object f99570OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public int f99571OooOooO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28094OooO00o(CloudBackupWorker cloudBackupWorker, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f99569OooOoo = cloudBackupWorker;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f99570OooOoo0 = obj;
        this.f99571OooOooO |= Integer.MIN_VALUE;
        return this.f99569OooOoo.OooO0oo(this);
    }
}
