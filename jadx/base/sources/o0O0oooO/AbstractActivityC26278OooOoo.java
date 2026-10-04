package o0O0oooO;

import android.os.Bundle;
import androidx.appcompat.app.ActivityC21485OooO0oo;
import androidx.lifecycle.o00Oo0;
import oO0OOooo.C33157OooO00o;
import oO0OOooo.C33161OooO0o;
import oO0Oo0oo.InterfaceC33226OooO0O0;
import oO0OoOO0.C33282OooO00o;

/* JADX INFO: renamed from: o0O0oooO.OooOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractActivityC26278OooOoo extends ActivityC21485OooO0oo implements InterfaceC33226OooO0O0 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public volatile C33157OooO00o f90110OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C33161OooO0o f90111OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final Object f90113OooOoO0 = new Object();

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public boolean f90112OooOoO = false;

    public AbstractActivityC26278OooOoo() {
        addOnContextAvailableListener(new C26279OooOoo0(this, 0));
    }

    public final C33157OooO00o componentManager() {
        if (this.f90110OooOo == null) {
            synchronized (this.f90113OooOoO0) {
                try {
                    if (this.f90110OooOo == null) {
                        this.f90110OooOo = new C33157OooO00o(this);
                    }
                } finally {
                }
            }
        }
        return this.f90110OooOo;
    }

    @Override // oO0Oo0oo.InterfaceC33226OooO0O0
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // OooO0Oo.OooOO0O, androidx.lifecycle.OooOOOO
    public final o00Oo0.OooO0O0 getDefaultViewModelProviderFactory() {
        return C33282OooO00o.OooO00o(this, super.getDefaultViewModelProviderFactory());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [int, java.lang.String, o000o00.OooO00o] */
    /* JADX WARN: Type inference failed for: r0v1, types: [o000o00.OooO00o, void] */
    @Override // androidx.fragment.app.ActivityC21897OooOo0, OooO0Oo.OooOO0O, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C33161OooO0o c33161OooO0oOooO0O0 = componentManager().OooO0O0();
        this.f90111OooOo0o = c33161OooO0oOooO0O0;
        ?? r0 = c33161OooO0oOooO0O0.f119906OooO00o;
        if (r0 == 0) {
            c33161OooO0oOooO0O0.OooO00o(putInt(r0, r0));
        }
    }

    @Override // androidx.appcompat.app.ActivityC21485OooO0oo, androidx.fragment.app.ActivityC21897OooOo0, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        C33161OooO0o c33161OooO0o = this.f90111OooOo0o;
        if (c33161OooO0o != null) {
            c33161OooO0o.f119906OooO00o = null;
        }
    }
}
