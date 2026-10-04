package o0Oo0o0O;

import OooOoO.C20504OooO0O0;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.AbstractC22050OooOo0o;
import androidx.recyclerview.widget.OooOOO;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.global.R;
import kotlin.jvm.internal.OooOOO0;
import o0oOoOo.C31035OooO0o0;

/* JADX INFO: renamed from: o0Oo0o0O.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28222OooO0O0 extends AbstractC22050OooOo0o<C31035OooO0o0, C19899OooO0O0> {

    /* JADX INFO: renamed from: o0Oo0o0O.OooO0O0$OooO00o */
    public static final class OooO00o extends OooOOO.AbstractC22036OooO0o0<C31035OooO0o0> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO00o f100051OooO00o = new OooO00o();

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO00o(C31035OooO0o0 c31035OooO0o0, C31035OooO0o0 c31035OooO0o02) {
            return c31035OooO0o0.equals(c31035OooO0o02);
        }

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO0O0(C31035OooO0o0 c31035OooO0o0, C31035OooO0o0 c31035OooO0o02) {
            return OooOOO0.OooO0O0(c31035OooO0o0.f110805OooO00o, c31035OooO0o02.f110805OooO00o);
        }
    }

    /* JADX INFO: renamed from: o0Oo0o0O.OooO0O0$OooO0O0, reason: collision with other inner class name */
    public final class C19899OooO0O0 extends RecyclerView.AbstractC22078OooOooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final TextView f100052OooO00o;

        public C19899OooO0O0(View view) {
            super(view);
            View viewFindViewById = view.findViewById(R.id.tv_filename);
            OooOOO0.OooO0o(viewFindViewById, "findViewById(...)");
            this.f100052OooO00o = (TextView) viewFindViewById;
        }
    }

    public C28222OooO0O0() {
        super(OooO00o.f100051OooO00o);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, int i) {
        C19899OooO0O0 holder = (C19899OooO0O0) abstractC22078OooOooO;
        OooOOO0.OooO0oO(holder, "holder");
        C31035OooO0o0 c31035OooO0o0OooO0OO = OooO0OO(i);
        OooOOO0.OooO0o(c31035OooO0o0OooO0OO, "getItem(...)");
        holder.f100052OooO00o.setText(c31035OooO0o0OooO0OO.f110806OooO0O0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final RecyclerView.AbstractC22078OooOooO onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewOooO0OO = C20504OooO0O0.OooO0OO(viewGroup, "parent", R.layout.item_cloud_syncing_file, viewGroup, false);
        OooOOO0.OooO0Oo(viewOooO0OO);
        return new C19899OooO0O0(viewOooO0OO);
    }
}
