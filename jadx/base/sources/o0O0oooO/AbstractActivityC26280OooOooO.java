package o0O0oooO;

import OooO0o0.InterfaceC20429OooO0O0;
import android.os.Bundle;
import androidx.appcompat.app.ActivityC21485OooO0oo;
import androidx.lifecycle.o00Oo0;
import com.orion.notein.MainActivity;
import oO0OOooo.C33157OooO00o;
import oO0OOooo.C33161OooO0o;
import oO0Oo0oo.InterfaceC33226OooO0O0;
import oO0OoOO0.C33282OooO00o;

/* JADX INFO: renamed from: o0O0oooO.OooOooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractActivityC26280OooOooO extends ActivityC21485OooO0oo implements InterfaceC33226OooO0O0 {
    private volatile C33157OooO00o componentManager;
    private final Object componentManagerLock;
    private boolean injected;
    private C33161OooO0o savedStateHandleHolder;

    /* JADX INFO: renamed from: o0O0oooO.OooOooO$OooO00o */
    public class OooO00o implements InterfaceC20429OooO0O0 {
        public OooO00o() {
        }

        @Override // OooO0o0.InterfaceC20429OooO0O0
        public final void OooO00o(OooO0Oo.OooOO0O oooOO0O) {
            AbstractActivityC26280OooOooO.this.inject();
        }
    }

    public AbstractActivityC26280OooOooO() {
        this.componentManagerLock = new Object();
        this.injected = false;
        _initHiltInternal();
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new OooO00o());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int, java.lang.String, oO0OOooo.OooO0o] */
    /* JADX WARN: Type inference failed for: r1v1, types: [o000o00.OooO00o, void] */
    private void initSavedStateHandleHolder() {
        ?? OooO0O02 = m80771componentManager().OooO0O0();
        this.savedStateHandleHolder = OooO0O02;
        if (OooO0O02.f119906OooO00o == null) {
            OooO0O02.OooO00o(putInt(OooO0O02, OooO0O02));
        }
    }

    public C33157OooO00o createComponentManager() {
        return new C33157OooO00o(this);
    }

    @Override // oO0Oo0oo.InterfaceC33226OooO0O0
    public final Object generatedComponent() {
        return m80771componentManager().generatedComponent();
    }

    @Override // OooO0Oo.OooOO0O, androidx.lifecycle.OooOOOO
    public o00Oo0.OooO0O0 getDefaultViewModelProviderFactory() {
        return C33282OooO00o.OooO00o(this, super.getDefaultViewModelProviderFactory());
    }

    public void inject() {
        if (this.injected) {
            return;
        }
        this.injected = true;
        ((o00Ooo) generatedComponent()).OooO0o0((MainActivity) this);
    }

    @Override // androidx.fragment.app.ActivityC21897OooOo0, OooO0Oo.OooOO0O, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initSavedStateHandleHolder();
    }

    @Override // androidx.appcompat.app.ActivityC21485OooO0oo, androidx.fragment.app.ActivityC21897OooOo0, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C33161OooO0o c33161OooO0o = this.savedStateHandleHolder;
        if (c33161OooO0o != null) {
            c33161OooO0o.f119906OooO00o = null;
        }
    }

    /* JADX INFO: renamed from: componentManager, reason: merged with bridge method [inline-methods] */
    public final C33157OooO00o m80771componentManager() {
        if (this.componentManager == null) {
            synchronized (this.componentManagerLock) {
                try {
                    if (this.componentManager == null) {
                        this.componentManager = createComponentManager();
                    }
                } finally {
                }
            }
        }
        return this.componentManager;
    }

    public AbstractActivityC26280OooOooO(int i) {
        super(i);
        this.componentManagerLock = new Object();
        this.injected = false;
        _initHiltInternal();
    }
}
