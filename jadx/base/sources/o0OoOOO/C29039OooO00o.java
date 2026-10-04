package o0OoOOO;

import OooOoO.C20504OooO0O0;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.AbstractC22050OooOo0o;
import androidx.recyclerview.widget.OooOOO;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.global.R;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.OooOOO0;
import o0Oo0o00.ViewOnClickListenerC28184Oooo0OO;
import o0oOoOo.C31039OooOO0O;

/* JADX INFO: renamed from: o0OoOOO.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29039OooO00o extends AbstractC22050OooOo0o<C31039OooOO0O, OooO0O0> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public ViewOnClickListenerC28184Oooo0OO f102866OooO0O0;

    /* JADX INFO: renamed from: o0OoOOO.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C19951OooO00o extends OooOOO.AbstractC22036OooO0o0<C31039OooOO0O> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final C19951OooO00o f102867OooO00o = new C19951OooO00o();

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO00o(C31039OooOO0O c31039OooOO0O, C31039OooOO0O c31039OooOO0O2) {
            return c31039OooOO0O.equals(c31039OooOO0O2);
        }

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO0O0(C31039OooOO0O c31039OooOO0O, C31039OooOO0O c31039OooOO0O2) {
            return c31039OooOO0O.f110816OooO00o.equals(c31039OooOO0O2.f110816OooO00o);
        }
    }

    /* JADX INFO: renamed from: o0OoOOO.OooO00o$OooO0O0 */
    public final class OooO0O0 extends RecyclerView.AbstractC22078OooOooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final SimpleDateFormat f102868OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final TextView f102869OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final TextView f102870OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final ImageView f102871OooO0Oo;

        public OooO0O0(C29039OooO00o c29039OooO00o, View view) {
            super(view);
            this.f102868OooO00o = new SimpleDateFormat("yyyy/MM/dd", Locale.CHINA);
            this.f102869OooO0O0 = (TextView) view.findViewById(R.id.last_modified);
            View viewFindViewById = view.findViewById(R.id.icon);
            OooOOO0.OooO0o(viewFindViewById, "findViewById(...)");
            View viewFindViewById2 = view.findViewById(R.id.name);
            OooOOO0.OooO0o(viewFindViewById2, "findViewById(...)");
            this.f102870OooO0OO = (TextView) viewFindViewById2;
            this.f102871OooO0Oo = (ImageView) view.findViewById(R.id.selected);
            ViewOnClickListenerC28184Oooo0OO viewOnClickListenerC28184Oooo0OO = c29039OooO00o.f102866OooO0O0;
            if (viewOnClickListenerC28184Oooo0OO != null) {
                this.itemView.setOnClickListener(viewOnClickListenerC28184Oooo0OO);
            }
        }

        public final void OooO00o(C31039OooOO0O c31039OooOO0O) {
            this.itemView.setTag(c31039OooOO0O);
            this.f102870OooO0OO.setText(c31039OooOO0O.f110817OooO0O0);
            int i = c31039OooOO0O.f110818OooO0OO ? 4 : 0;
            ImageView imageView = this.f102871OooO0Oo;
            imageView.setVisibility(i);
            if (c31039OooOO0O.f110820OooO0o0) {
                imageView.setImageResource(R.drawable.ic_ni_checkbox_radio_selected);
            } else {
                imageView.setImageResource(R.drawable.ic_ni_checkbox_radio_normal);
            }
            this.f102869OooO0O0.setText(this.f102868OooO00o.format(Long.valueOf(c31039OooOO0O.f110819OooO0Oo)));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, int i) {
        OooO0O0 holder = (OooO0O0) abstractC22078OooOooO;
        OooOOO0.OooO0oO(holder, "holder");
        C31039OooOO0O c31039OooOO0OOooO0OO = OooO0OO(i);
        OooOOO0.OooO0o(c31039OooOO0OOooO0OO, "getItem(...)");
        holder.OooO00o(c31039OooOO0OOooO0OO);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final RecyclerView.AbstractC22078OooOooO onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewOooO0OO = C20504OooO0O0.OooO0OO(viewGroup, "parent", R.layout.item_font_file_tree_node, viewGroup, false);
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
        if (!((Bundle) obj).getBoolean("needRefresh")) {
            C31039OooOO0O c31039OooOO0OOooO0OO = OooO0OO(i);
            OooOOO0.OooO0o(c31039OooOO0OOooO0OO, "getItem(...)");
            holder.OooO00o(c31039OooOO0OOooO0OO);
            return;
        }
        super.onBindViewHolder(holder, i, payloads);
    }
}
