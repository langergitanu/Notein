package o0o0OO0o;

import OooOoO.C20504OooO0O0;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.AbstractC22050OooOo0o;
import androidx.recyclerview.widget.OooOOO;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.global.R;
import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.jvm.internal.OooOOO0;
import o0o0OOO0.C30544OooO0O0;

/* JADX INFO: renamed from: o0o0OO0o.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30452OooO00o extends AbstractC22050OooOo0o<C30544OooO0O0, OooO0O0> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public View.OnClickListener f108739OooO0O0;

    /* JADX INFO: renamed from: o0o0OO0o.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C20074OooO00o extends OooOOO.AbstractC22036OooO0o0<C30544OooO0O0> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final C20074OooO00o f108740OooO00o = new C20074OooO00o();

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO00o(C30544OooO0O0 c30544OooO0O0, C30544OooO0O0 c30544OooO0O02) {
            return c30544OooO0O0.equals(c30544OooO0O02);
        }

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO0O0(C30544OooO0O0 c30544OooO0O0, C30544OooO0O0 c30544OooO0O02) {
            return OooOOO0.OooO0O0(c30544OooO0O0.f109255OooO00o, c30544OooO0O02.f109255OooO00o);
        }
    }

    /* JADX INFO: renamed from: o0o0OO0o.OooO00o$OooO0O0 */
    public final class OooO0O0 extends RecyclerView.AbstractC22078OooOooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final SimpleDateFormat f108741OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final TextView f108742OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final TextView f108743OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final ImageView f108744OooO0Oo;

        public OooO0O0(C30452OooO00o c30452OooO00o, View view) {
            super(view);
            this.f108741OooO00o = new SimpleDateFormat("yyyy/MM/dd", Locale.CHINA);
            this.f108742OooO0O0 = (TextView) view.findViewById(R.id.last_modified);
            View viewFindViewById = view.findViewById(R.id.name);
            OooOOO0.OooO0o(viewFindViewById, "findViewById(...)");
            this.f108743OooO0OO = (TextView) viewFindViewById;
            this.f108744OooO0Oo = (ImageView) view.findViewById(R.id.selected);
            View.OnClickListener onClickListener = c30452OooO00o.f108739OooO0O0;
            if (onClickListener != null) {
                this.itemView.setOnClickListener(onClickListener);
            }
        }
    }

    public C30452OooO00o() {
        super(C20074OooO00o.f108740OooO00o);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, int i) {
        OooO0O0 holder = (OooO0O0) abstractC22078OooOooO;
        OooOOO0.OooO0oO(holder, "holder");
        C30544OooO0O0 c30544OooO0O0OooO0OO = OooO0OO(i);
        OooOOO0.OooO0o(c30544OooO0O0OooO0OO, "getItem(...)");
        C30544OooO0O0 c30544OooO0O0 = c30544OooO0O0OooO0OO;
        holder.itemView.setTag(c30544OooO0O0);
        holder.f108743OooO0OO.setText(c30544OooO0O0.f109256OooO0O0);
        boolean z = c30544OooO0O0.f109257OooO0OO;
        ImageView imageView = holder.f108744OooO0Oo;
        if (z) {
            imageView.setImageResource(R.drawable.ic_ni_checkbox_radio_selected);
        } else {
            imageView.setImageResource(R.drawable.ic_ni_checkbox_radio_normal);
        }
        holder.f108742OooO0O0.setText(holder.f108741OooO00o.format(Long.valueOf(c30544OooO0O0.f109258OooO0Oo)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final RecyclerView.AbstractC22078OooOooO onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewOooO0OO = C20504OooO0O0.OooO0OO(viewGroup, "parent", R.layout.item_file_tree_node, viewGroup, false);
        OooOOO0.OooO0Oo(viewOooO0OO);
        return new OooO0O0(this, viewOooO0OO);
    }
}
