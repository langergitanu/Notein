package o0o0O00o;

import OooOoO.C20504OooO0O0;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.AbstractC22050OooOo0o;
import androidx.recyclerview.widget.OooOOO;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.global.R;
import kotlin.jvm.internal.OooOOO0;
import o0O0o0oO.ViewOnClickListenerC26036Oooo;
import o0O0o0oO.ViewOnClickListenerC26047OoooO00;
import o0oOoOo.C31049OooOo0;

/* JADX INFO: renamed from: o0o0O00o.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30256OooO00o extends AbstractC22050OooOo0o<C31049OooOo0, OooO0O0> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public ViewOnClickListenerC26047OoooO00 f107808OooO0O0;

    /* JADX INFO: renamed from: o0o0O00o.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C20056OooO00o extends OooOOO.AbstractC22036OooO0o0<C31049OooOo0> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final C20056OooO00o f107809OooO00o = new C20056OooO00o();

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO00o(C31049OooOo0 c31049OooOo0, C31049OooOo0 c31049OooOo02) {
            return c31049OooOo0.equals(c31049OooOo02);
        }

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO0O0(C31049OooOo0 c31049OooOo0, C31049OooOo0 c31049OooOo02) {
            return c31049OooOo0.f110853OooO00o == c31049OooOo02.f110853OooO00o;
        }
    }

    /* JADX INFO: renamed from: o0o0O00o.OooO00o$OooO0O0 */
    public final class OooO0O0 extends RecyclerView.AbstractC22078OooOooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final View f107810OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final TextView f107811OooO0O0;

        public OooO0O0(View view) {
            super(view);
            this.f107810OooO00o = view.findViewById(R.id.iv_selected);
            this.f107811OooO0O0 = (TextView) view.findViewById(R.id.tv_filter);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, int i) {
        OooO0O0 holder = (OooO0O0) abstractC22078OooOooO;
        OooOOO0.OooO0oO(holder, "holder");
        C31049OooOo0 c31049OooOo0OooO0OO = OooO0OO(i);
        OooOOO0.OooO0o(c31049OooOo0OooO0OO, "getItem(...)");
        C31049OooOo0 c31049OooOo0 = c31049OooOo0OooO0OO;
        holder.itemView.setTag(c31049OooOo0);
        TextView textView = holder.f107811OooO0O0;
        int i2 = c31049OooOo0.f110853OooO00o;
        textView.setText(i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? textView.getContext().getString(R.string.note_list_tabs_all_doc) : textView.getContext().getString(R.string.note_list_tabs_folder) : textView.getContext().getString(R.string.note_list_tabs_note) : textView.getContext().getString(R.string.note_list_tabs_pdf) : textView.getContext().getString(R.string.note_list_tabs_all_doc));
        holder.f107810OooO00o.setVisibility(c31049OooOo0.f110854OooO0O0 ? 0 : 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final RecyclerView.AbstractC22078OooOooO onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewOooO0OO = C20504OooO0O0.OooO0OO(viewGroup, "parent", R.layout.item_note_filter, viewGroup, false);
        viewOooO0OO.setOnClickListener(new ViewOnClickListenerC26036Oooo(this, 6));
        return new OooO0O0(viewOooO0OO);
    }
}
