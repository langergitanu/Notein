package o0Ooo0Oo;

import OooOoO.C20504OooO0O0;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.AbstractC22050OooOo0o;
import androidx.recyclerview.widget.OooOOO;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.niui.components.button.SelectableSymbolButtonView;
import com.orion.notein.global.R;
import kotlin.jvm.internal.OooOOO0;
import o0O0o0oO.o00oO0O;
import o0O0oooo.C26371OooOOOo;
import o0Ooo0o0.C29420OooO0Oo;

/* JADX INFO: renamed from: o0Ooo0Oo.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29407OooO0Oo extends AbstractC22050OooOo0o<C29420OooO0Oo, OooO0O0> {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final OooO00o f104281OooO0OO = new OooO00o();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public C26371OooOOOo f104282OooO0O0;

    /* JADX INFO: renamed from: o0Ooo0Oo.OooO0Oo$OooO00o */
    public static final class OooO00o extends OooOOO.AbstractC22036OooO0o0<C29420OooO0Oo> {
        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO00o(C29420OooO0Oo c29420OooO0Oo, C29420OooO0Oo c29420OooO0Oo2) {
            return c29420OooO0Oo.equals(c29420OooO0Oo2);
        }

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO0O0(C29420OooO0Oo c29420OooO0Oo, C29420OooO0Oo c29420OooO0Oo2) {
            return c29420OooO0Oo.f104345OooO00o == c29420OooO0Oo2.f104345OooO00o;
        }
    }

    /* JADX INFO: renamed from: o0Ooo0Oo.OooO0Oo$OooO0O0 */
    public final class OooO0O0 extends RecyclerView.AbstractC22078OooOooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final SelectableSymbolButtonView f104283OooO00o;

        public OooO0O0(View view) {
            super(view);
            SelectableSymbolButtonView selectableSymbolButtonView = (SelectableSymbolButtonView) view.findViewById(R.id.iv_preview);
            this.f104283OooO00o = selectableSymbolButtonView;
            selectableSymbolButtonView.setToggleOnClick(false);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, int i) {
        OooO0O0 holder = (OooO0O0) abstractC22078OooOooO;
        OooOOO0.OooO0oO(holder, "holder");
        C29420OooO0Oo c29420OooO0OoOooO0OO = OooO0OO(i);
        OooOOO0.OooO0o(c29420OooO0OoOooO0OO, "getItem(...)");
        C29420OooO0Oo c29420OooO0Oo = c29420OooO0OoOooO0OO;
        int i2 = c29420OooO0Oo.f104346OooO0O0;
        SelectableSymbolButtonView selectableSymbolButtonView = holder.f104283OooO00o;
        selectableSymbolButtonView.setIcon(i2);
        selectableSymbolButtonView.setEnabled(true);
        selectableSymbolButtonView.setSelected(c29420OooO0Oo.f104347OooO0OO);
        holder.itemView.setOnClickListener(new o00oO0O(1, c29420OooO0Oo, C29407OooO0Oo.this));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final RecyclerView.AbstractC22078OooOooO onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewOooO0OO = C20504OooO0O0.OooO0OO(viewGroup, "parent", R.layout.item_padding_layout, viewGroup, false);
        OooOOO0.OooO0Oo(viewOooO0OO);
        return new OooO0O0(viewOooO0OO);
    }
}
