package o0OoOOo0;

import OooOoO.C20504OooO0O0;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.AbstractC22050OooOo0o;
import androidx.recyclerview.widget.OooOOO;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.network.embedded.C18385v2;
import com.orion.notein.global.R;
import kotlin.jvm.internal.OooOOO0;
import o0oOoOo.C31083OooooO0;

/* JADX INFO: renamed from: o0OoOOo0.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29181OooO00o extends AbstractC22050OooOo0o<C31083OooooO0, OooO0O0> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public View.OnClickListener f103491OooO0O0;

    /* JADX INFO: renamed from: o0OoOOo0.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C19962OooO00o extends OooOOO.AbstractC22036OooO0o0<C31083OooooO0> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final C19962OooO00o f103492OooO00o = new C19962OooO00o();

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO00o(C31083OooooO0 c31083OooooO0, C31083OooooO0 c31083OooooO02) {
            return c31083OooooO0.equals(c31083OooooO02);
        }

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO0O0(C31083OooooO0 c31083OooooO0, C31083OooooO0 c31083OooooO02) {
            return true;
        }
    }

    /* JADX INFO: renamed from: o0OoOOo0.OooO00o$OooO0O0 */
    public final class OooO0O0 extends RecyclerView.AbstractC22078OooOooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final TextView f103493OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final View f103494OooO0O0;

        public OooO0O0(C29181OooO00o c29181OooO00o, View view) {
            super(view);
            this.f103493OooO00o = (TextView) view.findViewById(R.id.color);
            this.f103494OooO0O0 = view.findViewById(R.id.border);
            View.OnClickListener onClickListener = c29181OooO00o.f103491OooO0O0;
            if (onClickListener != null) {
                view.setOnClickListener(onClickListener);
            }
        }
    }

    public C29181OooO00o() {
        super(C19962OooO00o.f103492OooO00o);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, int i) {
        OooO0O0 holder = (OooO0O0) abstractC22078OooOooO;
        OooOOO0.OooO0oO(holder, "holder");
        C31083OooooO0 c31083OooooO0OooO0OO = OooO0OO(i);
        OooOOO0.OooO0o(c31083OooooO0OooO0OO, "getItem(...)");
        C31083OooooO0 c31083OooooO0 = c31083OooooO0OooO0OO;
        holder.itemView.setTag(c31083OooooO0);
        TextView textView = holder.f103493OooO00o;
        int i2 = c31083OooooO0.f110936OooO00o;
        if (i2 == 0) {
            textView.setBackground(holder.itemView.getContext().getDrawable(R.drawable.ic_text_box_color_none));
            textView.setText("");
        } else {
            textView.setText(C18385v2.f56336h);
            Drawable drawable = holder.itemView.getContext().getDrawable(R.drawable.bg_toolbox_color);
            OooOOO0.OooO0o0(drawable, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            GradientDrawable gradientDrawable = (GradientDrawable) drawable;
            gradientDrawable.setColor(i2);
            textView.setBackground(gradientDrawable);
        }
        textView.setTextColor(c31083OooooO0.f110937OooO0O0);
        holder.f103494OooO0O0.setSelected(c31083OooooO0.f110938OooO0OO);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final RecyclerView.AbstractC22078OooOooO onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewOooO0OO = C20504OooO0O0.OooO0OO(viewGroup, "parent", R.layout.item_text_box_color, viewGroup, false);
        OooOOO0.OooO0Oo(viewOooO0OO);
        return new OooO0O0(this, viewOooO0OO);
    }
}
