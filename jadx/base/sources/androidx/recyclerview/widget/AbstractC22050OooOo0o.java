package androidx.recyclerview.widget;

import androidx.recyclerview.widget.C22028OooO0Oo;
import androidx.recyclerview.widget.OooO0OO;
import androidx.recyclerview.widget.OooOOO;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.AbstractC22078OooOooO;
import java.util.List;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: androidx.recyclerview.widget.OooOo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC22050OooOo0o<T, VH extends RecyclerView.AbstractC22078OooOooO> extends RecyclerView.AbstractC22062OooO0oO<VH> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C22028OooO0Oo<T> f66021OooO00o;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.OooOo0o$OooO00o */
    public class OooO00o implements C22028OooO0Oo.OooO0O0<T> {
        public OooO00o() {
        }

        @Override // androidx.recyclerview.widget.C22028OooO0Oo.OooO0O0
        public final void OooO00o() {
            AbstractC22050OooOo0o.this.getClass();
        }
    }

    public AbstractC22050OooOo0o(OooOOO.AbstractC22036OooO0o0<T> abstractC22036OooO0o0) {
        OooO00o oooO00o = new OooO00o();
        OooO0O0 oooO0O0 = new OooO0O0(this);
        synchronized (OooO0OO.OooO00o.f65804OooO00o) {
            try {
                if (OooO0OO.OooO00o.f65805OooO0O0 == null) {
                    OooO0OO.OooO00o.f65805OooO0O0 = Executors.newFixedThreadPool(2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C22028OooO0Oo<T> c22028OooO0Oo = new C22028OooO0Oo<>(oooO0O0, new OooO0OO(OooO0OO.OooO00o.f65805OooO0O0, abstractC22036OooO0o0));
        this.f66021OooO00o = c22028OooO0Oo;
        c22028OooO0Oo.f65810OooO0Oo.add(oooO00o);
    }

    public final T OooO0OO(int i) {
        return this.f66021OooO00o.f65811OooO0o.get(i);
    }

    public void OooO0Oo(List<T> list) {
        this.f66021OooO00o.OooO0O0(list, null);
    }

    public final void OooO0o0(List<T> list, Runnable runnable) {
        this.f66021OooO00o.OooO0O0(list, runnable);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public int getItemCount() {
        return this.f66021OooO00o.f65811OooO0o.size();
    }
}
