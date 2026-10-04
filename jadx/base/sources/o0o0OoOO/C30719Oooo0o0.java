package o0o0OoOO;

import OooOoO.C20504OooO0O0;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.AbstractC22050OooOo0o;
import androidx.recyclerview.widget.OooOOO;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.global.R;
import o0ooO0O0.C31430OooO00o;

/* JADX INFO: renamed from: o0o0OoOO.Oooo0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30719Oooo0o0 extends AbstractC22050OooOo0o<C30717Oooo0OO, OooO0O0> {

    /* JADX INFO: renamed from: o0o0OoOO.Oooo0o0$OooO00o */
    public static final class OooO00o extends OooOOO.AbstractC22036OooO0o0<C30717Oooo0OO> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO00o f109850OooO00o = new OooO00o();

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO00o(C30717Oooo0OO c30717Oooo0OO, C30717Oooo0OO c30717Oooo0OO2) {
            return c30717Oooo0OO.equals(c30717Oooo0OO2);
        }

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO0O0(C30717Oooo0OO c30717Oooo0OO, C30717Oooo0OO c30717Oooo0OO2) {
            return c30717Oooo0OO.equals(c30717Oooo0OO2);
        }
    }

    /* JADX INFO: renamed from: o0o0OoOO.Oooo0o0$OooO0O0 */
    public final class OooO0O0 extends RecyclerView.AbstractC22078OooOooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final TextView f109851OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final TextView f109852OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final TextView f109853OooO0OO;

        public OooO0O0(View view) {
            super(view);
            this.f109851OooO00o = (TextView) view.findViewById(R.id.tv_title);
            this.f109852OooO0O0 = (TextView) view.findViewById(R.id.tv_size);
            this.f109853OooO0OO = (TextView) view.findViewById(R.id.tv_imported_time);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, int i) {
        OooO0O0 holder = (OooO0O0) abstractC22078OooOooO;
        kotlin.jvm.internal.OooOOO0.OooO0oO(holder, "holder");
        C30717Oooo0OO c30717Oooo0OOOooO0OO = OooO0OO(i);
        kotlin.jvm.internal.OooOOO0.OooO0Oo(c30717Oooo0OOOooO0OO);
        holder.f109851OooO00o.setText(c30717Oooo0OOOooO0OO.f109846OooO00o);
        holder.f109852OooO0O0.setText(c30717Oooo0OOOooO0OO.f109847OooO0O0);
        holder.f109853OooO0OO.setText(C31430OooO00o.OooO0O0(c30717Oooo0OOOooO0OO.f109848OooO0OO));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final RecyclerView.AbstractC22078OooOooO onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewOooO0OO = C20504OooO0O0.OooO0OO(viewGroup, "parent", R.layout.item_debug_pdf_file, viewGroup, false);
        kotlin.jvm.internal.OooOOO0.OooO0Oo(viewOooO0OO);
        return new OooO0O0(viewOooO0OO);
    }
}
