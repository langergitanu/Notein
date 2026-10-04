package o0O0oooO;

import com.orion.notein.MainActivity;
import com.orion.notein.NotesRoleEntryActivity;

/* JADX INFO: renamed from: o0O0oooO.Oooo000, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractActivityC26284Oooo000 extends MainActivity {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public boolean f90120OooOo0o = false;

    public AbstractActivityC26284Oooo000() {
        addOnContextAvailableListener(new C26281OooOooo(this));
    }

    @Override // o0O0oooO.AbstractActivityC26280OooOooO
    public final void inject() {
        if (this.f90120OooOo0o) {
            return;
        }
        this.f90120OooOo0o = true;
        ((InterfaceC26354o0ooOoO) generatedComponent()).OooO0Oo((NotesRoleEntryActivity) this);
    }
}
