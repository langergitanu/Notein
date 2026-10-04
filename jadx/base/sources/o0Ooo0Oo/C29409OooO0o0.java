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
import o0O0oooo.C26370OooOOOO;
import o0Ooo0o0.C29421OooO0o0;

/* JADX INFO: renamed from: o0Ooo0Oo.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29409OooO0o0 extends AbstractC22050OooOo0o<C29421OooO0o0, OooO0O0> {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final OooO00o f104287OooO0OO = new OooO00o();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public C26370OooOOOO f104288OooO0O0;

    /* JADX INFO: renamed from: o0Ooo0Oo.OooO0o0$OooO00o */
    public static final class OooO00o extends OooOOO.AbstractC22036OooO0o0<C29421OooO0o0> {
        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO00o(C29421OooO0o0 c29421OooO0o0, C29421OooO0o0 c29421OooO0o02) {
            return c29421OooO0o0.equals(c29421OooO0o02);
        }

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO0O0(C29421OooO0o0 c29421OooO0o0, C29421OooO0o0 c29421OooO0o02) {
            return c29421OooO0o0.f104348OooO00o == c29421OooO0o02.f104348OooO00o;
        }
    }

    /* JADX INFO: renamed from: o0Ooo0Oo.OooO0o0$OooO0O0 */
    public final class OooO0O0 extends RecyclerView.AbstractC22078OooOooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final SelectableSymbolButtonView f104289OooO00o;

        public OooO0O0(View view) {
            super(view);
            SelectableSymbolButtonView selectableSymbolButtonView = (SelectableSymbolButtonView) view.findViewById(R.id.iv_preview);
            this.f104289OooO00o = selectableSymbolButtonView;
            selectableSymbolButtonView.setToggleOnClick(false);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, int i) {
        OooO0O0 holder = (OooO0O0) abstractC22078OooOooO;
        OooOOO0.OooO0oO(holder, "holder");
        C29421OooO0o0 c29421OooO0o0OooO0OO = OooO0OO(i);
        OooOOO0.OooO0o(c29421OooO0o0OooO0OO, "getItem(...)");
        final C29421OooO0o0 c29421OooO0o0 = c29421OooO0o0OooO0OO;
        int i2 = c29421OooO0o0.f104349OooO0O0;
        SelectableSymbolButtonView selectableSymbolButtonView = holder.f104289OooO00o;
        selectableSymbolButtonView.setIcon(i2);
        selectableSymbolButtonView.setEnabled(c29421OooO0o0.f104351OooO0Oo);
        selectableSymbolButtonView.setSelected(c29421OooO0o0.f104350OooO0OO);
        View view = holder.itemView;
        final C29409OooO0o0 c29409OooO0o0 = C29409OooO0o0.this;
        view.setOnClickListener(new View.OnClickListener() { // from class: o0Ooo0Oo.OooO0o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C26370OooOOOO c26370OooOOOO;
                C29421OooO0o0 c29421OooO0o02 = c29421OooO0o0;
                if (!c29421OooO0o02.f104351OooO0Oo || (c26370OooOOOO = c29409OooO0o0.f104288OooO0O0) == null) {
                    return;
                }
                c26370OooOOOO.invoke(c29421OooO0o02);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final RecyclerView.AbstractC22078OooOooO onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewOooO0OO = C20504OooO0O0.OooO0OO(viewGroup, "parent", R.layout.item_padding_pattern, viewGroup, false);
        OooOOO0.OooO0Oo(viewOooO0OO);
        return new OooO0O0(viewOooO0OO);
    }
}
