package oO0OOooo;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.fragment.app.Fragment;
import o00o0OOO.C25400OooO0Oo;
import o0O0oooO.C26267OooOOo;
import o0O0oooO.C26268OooOOo0;
import o0OoOO00.C29024Oooo0o0;
import oO0Oo0oo.InterfaceC33226OooO0O0;

/* JADX INFO: renamed from: oO0OOooo.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33162OooO0o0 implements InterfaceC33226OooO0O0<Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final Object f119908OooOo = new Object();

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public volatile C26267OooOOo f119909OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final Fragment f119910OooOoO0;

    /* JADX INFO: renamed from: oO0OOooo.OooO0o0$OooO00o */
    public interface OooO00o {
        C26268OooOOo0 OooO0O0();
    }

    public C33162OooO0o0(Fragment fragment) {
        this.f119910OooOoO0 = fragment;
    }

    public static final Context OooO0O0(Context context) {
        while ((context instanceof ContextWrapper) && !(context instanceof Activity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return context;
    }

    public final C26267OooOOo OooO00o() {
        Fragment fragment = this.f119910OooOoO0;
        if (fragment.getHost() == null) {
            throw new NullPointerException("Hilt Fragments must be attached before creating the component.");
        }
        C25400OooO0Oo.OooO00o(fragment.getHost() instanceof InterfaceC33226OooO0O0, "Hilt Fragments must be attached to an @AndroidEntryPoint Activity. Found: %s", fragment.getHost().getClass());
        C26268OooOOo0 c26268OooOOo0OooO0O0 = ((OooO00o) C29024Oooo0o0.OooO00o(OooO00o.class, fragment.getHost())).OooO0O0();
        c26268OooOOo0OooO0O0.getClass();
        return new C26267OooOOo(c26268OooOOo0OooO0O0.f89728OooO00o, c26268OooOOo0OooO0O0.f89729OooO0O0);
    }

    @Override // oO0Oo0oo.InterfaceC33226OooO0O0
    public final Object generatedComponent() {
        if (this.f119909OooOo0o == null) {
            synchronized (this.f119908OooOo) {
                try {
                    if (this.f119909OooOo0o == null) {
                        this.f119909OooOo0o = OooO00o();
                    }
                } finally {
                }
            }
        }
        return this.f119909OooOo0o;
    }
}
