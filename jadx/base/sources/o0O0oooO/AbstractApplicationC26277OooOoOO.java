package o0O0oooO;

import android.app.Application;
import com.orion.notein.App;
import oO0OOooo.C33160OooO0Oo;
import oO0Oo0oo.InterfaceC33226OooO0O0;

/* JADX INFO: renamed from: o0O0oooO.OooOoOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractApplicationC26277OooOoOO extends Application implements InterfaceC33226OooO0O0 {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public boolean f90108OooOo0o = false;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final C33160OooO0Oo f90107OooOo = new C33160OooO0Oo(new OooO00o());

    /* JADX INFO: renamed from: o0O0oooO.OooOoOO$OooO00o */
    public class OooO00o {
        public OooO00o() {
        }
    }

    @Override // oO0Oo0oo.InterfaceC33226OooO0O0
    public final Object generatedComponent() {
        return this.f90107OooOo.generatedComponent();
    }

    @Override // android.app.Application
    public void onCreate() {
        if (!this.f90108OooOo0o) {
            this.f90108OooOo0o = true;
            ((InterfaceC26258OooO0oO) this.f90107OooOo.generatedComponent()).OooO00o((App) this);
        }
        super.onCreate();
    }
}
