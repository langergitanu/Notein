package o0o0O0O0;

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
import o0Oo0o0o.Oooo000;
import o0oOoOo.C31039OooOO0O;

/* JADX INFO: renamed from: o0o0O0O0.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30266OooO00o extends AbstractC22050OooOo0o<C31039OooOO0O, OooO0O0> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public Oooo000 f107858OooO0O0;

    /* JADX INFO: renamed from: o0o0O0O0.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C20060OooO00o extends OooOOO.AbstractC22036OooO0o0<C31039OooOO0O> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final C20060OooO00o f107859OooO00o = new C20060OooO00o();

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO00o(C31039OooOO0O c31039OooOO0O, C31039OooOO0O c31039OooOO0O2) {
            return c31039OooOO0O.equals(c31039OooOO0O2);
        }

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO0O0(C31039OooOO0O c31039OooOO0O, C31039OooOO0O c31039OooOO0O2) {
            return c31039OooOO0O.f110816OooO00o.equals(c31039OooOO0O2.f110816OooO00o);
        }
    }

    /* JADX INFO: renamed from: o0o0O0O0.OooO00o$OooO0O0 */
    public final class OooO0O0 extends RecyclerView.AbstractC22078OooOooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final SimpleDateFormat f107860OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final TextView f107861OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final ImageView f107862OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final TextView f107863OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final ImageView f107864OooO0o0;

        public OooO0O0(C30266OooO00o c30266OooO00o, View view) {
            super(view);
            this.f107860OooO00o = new SimpleDateFormat("yyyy/MM/dd", Locale.CHINA);
            this.f107861OooO0O0 = (TextView) view.findViewById(R.id.last_modified);
            View viewFindViewById = view.findViewById(R.id.icon);
            kotlin.jvm.internal.OooOOO0.OooO0o(viewFindViewById, "findViewById(...)");
            this.f107862OooO0OO = (ImageView) viewFindViewById;
            View viewFindViewById2 = view.findViewById(R.id.name);
            kotlin.jvm.internal.OooOOO0.OooO0o(viewFindViewById2, "findViewById(...)");
            this.f107863OooO0Oo = (TextView) viewFindViewById2;
            this.f107864OooO0o0 = (ImageView) view.findViewById(R.id.selected);
            Oooo000 oooo000 = c30266OooO00o.f107858OooO0O0;
            if (oooo000 != null) {
                this.itemView.setOnClickListener(oooo000);
            }
        }

        public final void OooO00o(C31039OooOO0O c31039OooOO0O) {
            this.itemView.setTag(c31039OooOO0O);
            this.f107863OooO0Oo.setText(c31039OooOO0O.f110817OooO0O0);
            boolean z = c31039OooOO0O.f110818OooO0OO;
            int i = z ? 4 : 0;
            ImageView imageView = this.f107864OooO0o0;
            imageView.setVisibility(i);
            if (c31039OooOO0O.f110820OooO0o0) {
                imageView.setImageResource(R.drawable.ic_ni_checkbox_radio_selected);
            } else {
                imageView.setImageResource(R.drawable.ic_ni_checkbox_radio_normal);
            }
            ImageView imageView2 = this.f107862OooO0OO;
            if (z) {
                imageView2.setImageResource(R.drawable.ic_ni_folder);
            } else {
                imageView2.setImageResource(R.drawable.ic_ni_note);
            }
            this.f107861OooO0O0.setText(this.f107860OooO00o.format(Long.valueOf(c31039OooOO0O.f110819OooO0Oo)));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, int i) {
        OooO0O0 holder = (OooO0O0) abstractC22078OooOooO;
        kotlin.jvm.internal.OooOOO0.OooO0oO(holder, "holder");
        C31039OooOO0O c31039OooOO0OOooO0OO = OooO0OO(i);
        kotlin.jvm.internal.OooOOO0.OooO0o(c31039OooOO0OOooO0OO, "getItem(...)");
        holder.OooO00o(c31039OooOO0OOooO0OO);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final RecyclerView.AbstractC22078OooOooO onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewOooO0OO = C20504OooO0O0.OooO0OO(viewGroup, "parent", R.layout.item_file_tree_node, viewGroup, false);
        kotlin.jvm.internal.OooOOO0.OooO0Oo(viewOooO0OO);
        return new OooO0O0(this, viewOooO0OO);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, int i, List payloads) {
        OooO0O0 holder = (OooO0O0) abstractC22078OooOooO;
        kotlin.jvm.internal.OooOOO0.OooO0oO(holder, "holder");
        kotlin.jvm.internal.OooOOO0.OooO0oO(payloads, "payloads");
        if (payloads.isEmpty()) {
            super.onBindViewHolder(holder, i, payloads);
            return;
        }
        Object obj = payloads.get(0);
        kotlin.jvm.internal.OooOOO0.OooO0o0(obj, "null cannot be cast to non-null type android.os.Bundle");
        if (!((Bundle) obj).getBoolean("needRefresh")) {
            C31039OooOO0O c31039OooOO0OOooO0OO = OooO0OO(i);
            kotlin.jvm.internal.OooOOO0.OooO0o(c31039OooOO0OOooO0OO, "getItem(...)");
            holder.OooO00o(c31039OooOO0OOooO0OO);
            return;
        }
        super.onBindViewHolder(holder, i, payloads);
    }
}
