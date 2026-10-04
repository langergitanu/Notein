package o0OoOOo0;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.AbstractC22050OooOo0o;
import androidx.recyclerview.widget.OooOOO;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.global.R;
import kotlin.jvm.internal.OooOOO0;
import o0oOoOo.C31089Ooooooo;

/* JADX INFO: renamed from: o0OoOOo0.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29185OooO0o extends AbstractC22050OooOo0o<C31089Ooooooo, OooO0O0> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f103510OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public View.OnClickListener f103511OooO0OO;

    /* JADX INFO: renamed from: o0OoOOo0.OooO0o$OooO00o */
    public static final class OooO00o extends OooOOO.AbstractC22036OooO0o0<C31089Ooooooo> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO00o f103512OooO00o = new OooO00o();

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO00o(C31089Ooooooo c31089Ooooooo, C31089Ooooooo c31089Ooooooo2) {
            return c31089Ooooooo.equals(c31089Ooooooo2);
        }

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO0O0(C31089Ooooooo c31089Ooooooo, C31089Ooooooo c31089Ooooooo2) {
            return true;
        }
    }

    /* JADX INFO: renamed from: o0OoOOo0.OooO0o$OooO0O0 */
    public final class OooO0O0 extends RecyclerView.AbstractC22078OooOooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ImageView f103513OooO00o;

        public OooO0O0(C29185OooO0o c29185OooO0o, View view) {
            super(view);
            this.f103513OooO00o = (ImageView) view.findViewById(R.id.icon);
            View.OnClickListener onClickListener = c29185OooO0o.f103511OooO0OO;
            if (onClickListener != null) {
                view.setOnClickListener(onClickListener);
            }
        }
    }

    public C29185OooO0o(int i) {
        super(OooO00o.f103512OooO00o);
        this.f103510OooO0O0 = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, int i) {
        Drawable drawable;
        OooO0O0 holder = (OooO0O0) abstractC22078OooOooO;
        OooOOO0.OooO0oO(holder, "holder");
        C31089Ooooooo c31089OooooooOooO0OO = OooO0OO(i);
        OooOOO0.OooO0o(c31089OooooooOooO0OO, "getItem(...)");
        C31089Ooooooo c31089Ooooooo = c31089OooooooOooO0OO;
        holder.itemView.setTag(c31089Ooooooo);
        switch (c31089Ooooooo.f110962OooO00o) {
            case 0:
                drawable = holder.itemView.getContext().getDrawable(R.drawable.ic_ni_textstyle_bold_selector);
                break;
            case 1:
                drawable = holder.itemView.getContext().getDrawable(R.drawable.ic_ni_textstyle_italic_selector);
                break;
            case 2:
                drawable = holder.itemView.getContext().getDrawable(R.drawable.ic_ni_textstyle_underline_selector);
                break;
            case 3:
                drawable = holder.itemView.getContext().getDrawable(R.drawable.ic_ni_textstyle_list_no_order_selector);
                break;
            case 4:
                drawable = holder.itemView.getContext().getDrawable(R.drawable.ic_ni_textstyle_list_in_order_selector);
                break;
            case 5:
                drawable = holder.itemView.getContext().getDrawable(R.drawable.ic_ni_textstyle_space_left_selector);
                break;
            case 6:
                drawable = holder.itemView.getContext().getDrawable(R.drawable.ic_ni_textstyle_space_right_selector);
                break;
            case 7:
                drawable = holder.itemView.getContext().getDrawable(R.drawable.ic_ni_textstyle_align_start_selector);
                break;
            case 8:
                drawable = holder.itemView.getContext().getDrawable(R.drawable.ic_ni_textstyle_align_center_selector);
                break;
            case 9:
                drawable = holder.itemView.getContext().getDrawable(R.drawable.ic_ni_textstyle_align_end_selector);
                break;
            default:
                drawable = null;
                break;
        }
        ImageView imageView = holder.f103513OooO00o;
        if (drawable != null) {
            imageView.setBackground(drawable);
        } else {
            imageView.setBackgroundColor(0);
        }
        imageView.setSelected(c31089Ooooooo.f110963OooO0O0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final RecyclerView.AbstractC22078OooOooO onCreateViewHolder(ViewGroup parent, int i) {
        OooOOO0.OooO0oO(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(this.f103510OooO0O0, parent, false);
        OooOOO0.OooO0Oo(viewInflate);
        return new OooO0O0(this, viewInflate);
    }
}
