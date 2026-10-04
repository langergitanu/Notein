package o0OoOo00;

import OooOoO.C20504OooO0O0;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.AbstractC22050OooOo0o;
import androidx.recyclerview.widget.OooOOO;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.global.R;
import java.util.List;
import kotlin.jvm.internal.OooOOO0;
import o0O0o0oO.ViewOnClickListenerC26035OooOooo;
import o0Oo0O0.C28050OooO0OO;
import o0OoOo.C29197OooO0Oo;

/* JADX INFO: renamed from: o0OoOo00.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29204OooO0o extends AbstractC22050OooOo0o<C29197OooO0Oo, OooO0O0> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public ViewOnClickListenerC26035OooOooo f103582OooO0O0;

    /* JADX INFO: renamed from: o0OoOo00.OooO0o$OooO00o */
    public static final class OooO00o extends OooOOO.AbstractC22036OooO0o0<C29197OooO0Oo> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO00o f103583OooO00o = new OooO00o();

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO00o(C29197OooO0Oo c29197OooO0Oo, C29197OooO0Oo c29197OooO0Oo2) {
            return c29197OooO0Oo.equals(c29197OooO0Oo2);
        }

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO0O0(C29197OooO0Oo c29197OooO0Oo, C29197OooO0Oo c29197OooO0Oo2) {
            return c29197OooO0Oo.f103564OooO00o == c29197OooO0Oo2.f103564OooO00o;
        }
    }

    /* JADX INFO: renamed from: o0OoOo00.OooO0o$OooO0O0 */
    public final class OooO0O0 extends RecyclerView.AbstractC22078OooOooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final TextView f103584OooO00o;

        public OooO0O0(final C29204OooO0o c29204OooO0o, final View view) {
            super(view);
            this.f103584OooO00o = (TextView) view.findViewById(R.id.tv_speed);
            C28050OooO0OO.OooO00o(view, 500L, new View.OnClickListener() { // from class: o0OoOo00.OooO0oO
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ViewOnClickListenerC26035OooOooo viewOnClickListenerC26035OooOooo = c29204OooO0o.f103582OooO0O0;
                    if (viewOnClickListenerC26035OooOooo != null) {
                        viewOnClickListenerC26035OooOooo.onClick(view);
                    }
                }
            });
        }

        public final void OooO00o(C29197OooO0Oo c29197OooO0Oo) {
            this.itemView.setTag(c29197OooO0Oo);
            String strOooO0OO = Oooo00o.OooO0OO.OooO0OO(new StringBuilder(), c29197OooO0Oo.f103564OooO00o, " x");
            TextView textView = this.f103584OooO00o;
            textView.setText(strOooO0OO);
            textView.setSelected(c29197OooO0Oo.f103565OooO0O0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, int i) {
        OooO0O0 holder = (OooO0O0) abstractC22078OooOooO;
        OooOOO0.OooO0oO(holder, "holder");
        C29197OooO0Oo c29197OooO0OoOooO0OO = OooO0OO(i);
        OooOOO0.OooO0Oo(c29197OooO0OoOooO0OO);
        holder.OooO00o(c29197OooO0OoOooO0OO);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final RecyclerView.AbstractC22078OooOooO onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewOooO0OO = C20504OooO0O0.OooO0OO(viewGroup, "parent", R.layout.item_audio_play_speed, viewGroup, false);
        OooOOO0.OooO0Oo(viewOooO0OO);
        return new OooO0O0(this, viewOooO0OO);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, int i, List payloads) {
        OooO0O0 holder = (OooO0O0) abstractC22078OooOooO;
        OooOOO0.OooO0oO(holder, "holder");
        OooOOO0.OooO0oO(payloads, "payloads");
        if (payloads.isEmpty()) {
            super.onBindViewHolder(holder, i, payloads);
            return;
        }
        Object obj = payloads.get(0);
        OooOOO0.OooO0o0(obj, "null cannot be cast to non-null type android.os.Bundle");
        C29197OooO0Oo c29197OooO0OoOooO0OO = OooO0OO(i);
        OooOOO0.OooO0o(c29197OooO0OoOooO0OO, "getItem(...)");
        holder.OooO00o(c29197OooO0OoOooO0OO);
    }
}
