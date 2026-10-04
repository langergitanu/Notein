package o0o0OOo0;

import OooOoO.C20504OooO0O0;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.AbstractC22050OooOo0o;
import androidx.recyclerview.widget.OooOOO;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.global.R;
import kotlin.jvm.internal.OooOOO0;
import o0oOoOo.C31058OooOooO;

/* JADX INFO: renamed from: o0o0OOo0.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30547OooO00o extends AbstractC22050OooOo0o<C31058OooOooO, OooO0O0> {

    /* JADX INFO: renamed from: o0o0OOo0.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C20104OooO00o extends OooOOO.AbstractC22036OooO0o0<C31058OooOooO> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final C20104OooO00o f109266OooO00o = new C20104OooO00o();

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO00o(C31058OooOooO c31058OooOooO, C31058OooOooO c31058OooOooO2) {
            return c31058OooOooO.equals(c31058OooOooO2);
        }

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO0O0(C31058OooOooO c31058OooOooO, C31058OooOooO c31058OooOooO2) {
            return c31058OooOooO.equals(c31058OooOooO2);
        }
    }

    /* JADX INFO: renamed from: o0o0OOo0.OooO00o$OooO0O0 */
    public final class OooO0O0 extends RecyclerView.AbstractC22078OooOooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ImageView f109267OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final TextView f109268OooO0O0;

        public OooO0O0(View view) {
            super(view);
            this.f109267OooO00o = (ImageView) view.findViewById(R.id.iv_privilege_icon);
            this.f109268OooO0O0 = (TextView) view.findViewById(R.id.tv_privilege_title);
        }
    }

    public C30547OooO00o() {
        super(C20104OooO00o.f109266OooO00o);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, int i) {
        OooO0O0 holder = (OooO0O0) abstractC22078OooOooO;
        OooOOO0.OooO0oO(holder, "holder");
        C31058OooOooO c31058OooOooOOooO0OO = OooO0OO(i);
        OooOOO0.OooO0o(c31058OooOooOOooO0OO, "getItem(...)");
        C31058OooOooO c31058OooOooO = c31058OooOooOOooO0OO;
        holder.f109267OooO00o.setImageResource(c31058OooOooO.f110884OooO00o);
        holder.f109268OooO0O0.setText(c31058OooOooO.f110885OooO0O0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final RecyclerView.AbstractC22078OooOooO onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewOooO0OO = C20504OooO0O0.OooO0OO(viewGroup, "parent", R.layout.item_ai_plus_privilege, viewGroup, false);
        OooOOO0.OooO0Oo(viewOooO0OO);
        return new OooO0O0(viewOooO0OO);
    }
}
