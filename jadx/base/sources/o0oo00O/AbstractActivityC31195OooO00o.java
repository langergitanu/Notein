package o0oo00O;

import android.os.Bundle;
import androidx.appcompat.app.ActivityC21485OooO0oo;
import androidx.lifecycle.o00Oo0;
import o0O0oooO.C26279OooOoo0;
import oO0OOooo.C33157OooO00o;
import oO0OOooo.C33161OooO0o;
import oO0Oo0oo.InterfaceC33226OooO0O0;
import oO0OoOO0.C33282OooO00o;

/* JADX INFO: renamed from: o0oo00O.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractActivityC31195OooO00o extends ActivityC21485OooO0oo implements InterfaceC33226OooO0O0 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public volatile C33157OooO00o f111246OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C33161OooO0o f111247OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final Object f111249OooOoO0 = new Object();

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public boolean f111248OooOoO = false;

    public AbstractActivityC31195OooO00o() {
        addOnContextAvailableListener(new C26279OooOoo0(this, 1));
    }

    public final C33157OooO00o componentManager() {
        if (this.f111246OooOo == null) {
            synchronized (this.f111249OooOoO0) {
                try {
                    if (this.f111246OooOo == null) {
                        this.f111246OooOo = new C33157OooO00o(this);
                    }
                } finally {
                }
            }
        }
        return this.f111246OooOo;
    }

    @Override // oO0Oo0oo.InterfaceC33226OooO0O0
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // OooO0Oo.OooOO0O, androidx.lifecycle.OooOOOO
    public final o00Oo0.OooO0O0 getDefaultViewModelProviderFactory() {
        return C33282OooO00o.OooO00o(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.ActivityC21897OooOo0, OooO0Oo.OooOO0O, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C33161OooO0o c33161OooO0oOooO0O0 = componentManager().OooO0O0();
        this.f111247OooOo0o = c33161OooO0oOooO0O0;
        if (c33161OooO0oOooO0O0.f119906OooO00o == null) {
            c33161OooO0oOooO0O0.OooO00o(getDefaultViewModelCreationExtras());
        }
    }

    @Override // androidx.appcompat.app.ActivityC21485OooO0oo, androidx.fragment.app.ActivityC21897OooOo0, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        C33161OooO0o c33161OooO0o = this.f111247OooOo0o;
        if (c33161OooO0o != null) {
            c33161OooO0o.f119906OooO00o = null;
        }
    }
}
