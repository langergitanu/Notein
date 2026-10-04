package o0Oo0Oo0;

import android.os.Bundle;
import androidx.appcompat.app.ActivityC21485OooO0oo;
import androidx.lifecycle.o00Oo0;
import com.orion.notein.global.R;
import oO0OOooo.C33157OooO00o;
import oO0OOooo.C33161OooO0o;
import oO0Oo0oo.InterfaceC33226OooO0O0;
import oO0OoOO0.C33282OooO00o;

/* JADX INFO: renamed from: o0Oo0Oo0.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractActivityC28097OooO0Oo extends ActivityC21485OooO0oo implements InterfaceC33226OooO0O0 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public volatile C33157OooO00o f99575OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C33161OooO0o f99576OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public boolean f99577OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final Object f99578OooOoO0;

    public AbstractActivityC28097OooO0Oo() {
        this.f99578OooOoO0 = new Object();
        this.f99577OooOoO = false;
        addOnContextAvailableListener(new C28096OooO0OO(this));
    }

    public final C33157OooO00o componentManager() {
        if (this.f99575OooOo == null) {
            synchronized (this.f99578OooOoO0) {
                try {
                    if (this.f99575OooOo == null) {
                        this.f99575OooOo = new C33157OooO00o(this);
                    }
                } finally {
                }
            }
        }
        return this.f99575OooOo;
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
        this.f99576OooOo0o = c33161OooO0oOooO0O0;
        if (c33161OooO0oOooO0O0.f119906OooO00o == null) {
            c33161OooO0oOooO0O0.OooO00o(getDefaultViewModelCreationExtras());
        }
    }

    @Override // androidx.appcompat.app.ActivityC21485OooO0oo, androidx.fragment.app.ActivityC21897OooOo0, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        C33161OooO0o c33161OooO0o = this.f99576OooOo0o;
        if (c33161OooO0o != null) {
            c33161OooO0o.f119906OooO00o = null;
        }
    }

    public AbstractActivityC28097OooO0Oo(int i) {
        super(R.layout.activity_netdisk_auth);
        this.f99578OooOoO0 = new Object();
        this.f99577OooOoO = false;
        addOnContextAvailableListener(new C28096OooO0OO(this));
    }
}
