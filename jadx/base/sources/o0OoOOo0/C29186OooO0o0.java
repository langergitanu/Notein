package o0OoOOo0;

import OooOoO.C20504OooO0O0;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.AbstractC22050OooOo0o;
import androidx.recyclerview.widget.OooOOO;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.global.R;
import java.util.Arrays;
import kotlin.jvm.internal.OooOOO0;
import o0O0o0oO.ViewOnClickListenerC26053OoooOoO;
import o0oOoOo.C31086Oooooo;

/* JADX INFO: renamed from: o0OoOOo0.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29186OooO0o0 extends AbstractC22050OooOo0o<C31086Oooooo, OooO0O0> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public ViewOnClickListenerC26053OoooOoO f103514OooO0O0;

    /* JADX INFO: renamed from: o0OoOOo0.OooO0o0$OooO00o */
    public static final class OooO00o extends OooOOO.AbstractC22036OooO0o0<C31086Oooooo> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO00o f103515OooO00o = new OooO00o();

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO00o(C31086Oooooo c31086Oooooo, C31086Oooooo c31086Oooooo2) {
            return c31086Oooooo.equals(c31086Oooooo2);
        }

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO0O0(C31086Oooooo c31086Oooooo, C31086Oooooo c31086Oooooo2) {
            return true;
        }
    }

    /* JADX INFO: renamed from: o0OoOOo0.OooO0o0$OooO0O0 */
    public final class OooO0O0 extends RecyclerView.AbstractC22078OooOooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final TextView f103516OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final View f103517OooO0O0;

        public OooO0O0(View view) {
            super(view);
            this.f103516OooO00o = (TextView) view.findViewById(R.id.line_height);
            this.f103517OooO0O0 = view.findViewById(R.id.selected);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, int i) {
        OooO0O0 holder = (OooO0O0) abstractC22078OooOooO;
        OooOOO0.OooO0oO(holder, "holder");
        C31086Oooooo c31086OoooooOooO0OO = OooO0OO(i);
        OooOOO0.OooO0o(c31086OoooooOooO0OO, "getItem(...)");
        C31086Oooooo c31086Oooooo = c31086OoooooOooO0OO;
        holder.itemView.setTag(c31086Oooooo);
        holder.f103516OooO00o.setText(holder.itemView.getContext().getString(R.string.line_spacing_desc, String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(c31086Oooooo.f110944OooO00o)}, 1))));
        boolean z = c31086Oooooo.f110945OooO0O0;
        holder.f103517OooO0O0.setVisibility(z ? 0 : 4);
        holder.itemView.setSelected(z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final RecyclerView.AbstractC22078OooOooO onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewOooO0OO = C20504OooO0O0.OooO0OO(viewGroup, "parent", R.layout.item_textstyle_text_line_height, viewGroup, false);
        viewOooO0OO.setOnClickListener(new ViewOnClickListenerC29184OooO0Oo(this, 0));
        return new OooO0O0(viewOooO0OO);
    }
}
