package o0oOoo00;

import com.orion.notein.p607ui.backup.BackupFragment;
import oO00ooO.C32460OooOooO;

/* JADX INFO: renamed from: o0oOoo00.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31117OooO0O0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C32460OooOooO> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ BackupFragment f111060OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31117OooO0O0(BackupFragment backupFragment) {
        super(0);
        this.f111060OooOo0o = backupFragment;
    }

    @Override // oO0O000o.OooO00o
    public final C32460OooOooO invoke() {
        BackupFragment backupFragment = this.f111060OooOo0o;
        backupFragment.f70481Oooo00o.show(backupFragment.getChildFragmentManager(), "BackupResultDialogFragment");
        return C32460OooOooO.f116667OooO00o;
    }
}
