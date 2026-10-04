package o0oOoo00;

import com.orion.notein.p607ui.backup.BackupFragment;
import com.orion.notein.p607ui.backup.ImportLocalDataDialogFragment;
import oO00ooO.C32460OooOooO;

/* JADX INFO: renamed from: o0oOoo00.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31118OooO0OO extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C32460OooOooO> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ BackupFragment f111061OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31118OooO0OO(BackupFragment backupFragment) {
        super(0);
        this.f111061OooOo0o = backupFragment;
    }

    @Override // oO0O000o.OooO00o
    public final C32460OooOooO invoke() {
        new ImportLocalDataDialogFragment().show(this.f111061OooOo0o.getChildFragmentManager(), "RestoreConfirmDialogFragment");
        return C32460OooOooO.f116667OooO00o;
    }
}
