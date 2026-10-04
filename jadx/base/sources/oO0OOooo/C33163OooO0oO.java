package oO0OOooo;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC21979OooOOo0;
import androidx.lifecycle.InterfaceC21986OooOoOO;
import androidx.lifecycle.InterfaceC21987OooOoo;

/* JADX INFO: renamed from: oO0OOooo.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33163OooO0oO extends ContextWrapper {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public LayoutInflater f119911OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public LayoutInflater f119912OooO0O0;

    /* JADX INFO: renamed from: oO0OOooo.OooO0oO$OooO00o */
    public class OooO00o implements InterfaceC21986OooOoOO {
        public OooO00o() {
        }

        @Override // androidx.lifecycle.InterfaceC21986OooOoOO
        public final void OooOOo0(InterfaceC21987OooOoo interfaceC21987OooOoo, AbstractC21979OooOOo0.OooO00o oooO00o) {
            if (oooO00o == AbstractC21979OooOOo0.OooO00o.ON_DESTROY) {
                C33163OooO0oO c33163OooO0oO = C33163OooO0oO.this;
                c33163OooO0oO.getClass();
                c33163OooO0oO.f119911OooO00o = null;
                c33163OooO0oO.f119912OooO0O0 = null;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33163OooO0oO(Context context, Fragment fragment) {
        super(context);
        context.getClass();
        OooO00o oooO00o = new OooO00o();
        this.f119911OooO00o = null;
        fragment.getClass();
        fragment.getLifecycle().OooO00o(oooO00o);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f119912OooO0O0 == null) {
            if (this.f119911OooO00o == null) {
                this.f119911OooO00o = (LayoutInflater) getBaseContext().getSystemService("layout_inflater");
            }
            this.f119912OooO0O0 = this.f119911OooO00o.cloneInContext(this);
        }
        return this.f119912OooO0O0;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C33163OooO0oO(LayoutInflater layoutInflater, Fragment fragment) {
        layoutInflater.getClass();
        Context context = layoutInflater.getContext();
        context.getClass();
        super(context);
        OooO00o oooO00o = new OooO00o();
        this.f119911OooO00o = layoutInflater;
        fragment.getClass();
        fragment.getLifecycle().OooO00o(oooO00o);
    }
}
