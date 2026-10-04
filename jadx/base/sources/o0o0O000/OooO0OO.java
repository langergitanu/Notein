package o0o0O000;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.AbstractC22050OooOo0o;
import androidx.recyclerview.widget.OooOOO;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.global.R;
import o0OoOO00.ViewOnClickListenerC29029OoooO00;
import o0oOoOo.C31040OooOO0o;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0OO extends AbstractC22050OooOo0o<C31040OooOO0o, OooO0O0> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f107631OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public View.OnClickListener f107632OooO0OO;

    public static final class OooO00o extends OooOOO.AbstractC22036OooO0o0<C31040OooOO0o> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO00o f107633OooO00o = new OooO00o();

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO00o(C31040OooOO0o c31040OooOO0o, C31040OooOO0o c31040OooOO0o2) {
            return c31040OooOO0o.equals(c31040OooOO0o2);
        }

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO0O0(C31040OooOO0o c31040OooOO0o, C31040OooOO0o c31040OooOO0o2) {
            return c31040OooOO0o.f110821OooO00o == c31040OooOO0o2.f110821OooO00o;
        }
    }

    public final class OooO0O0 extends RecyclerView.AbstractC22078OooOooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ImageView f107634OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final ImageView f107635OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f107636OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int f107637OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final int f107638OooO0o0;

        public OooO0O0(OooO0OO oooO0OO, View view) {
            super(view);
            this.f107634OooO00o = (ImageView) view.findViewById(R.id.color);
            this.f107635OooO0O0 = (ImageView) view.findViewById(R.id.placeholder_icon);
            this.f107636OooO0OO = ContextCompat.getColor(view.getContext(), R.color.folder_color_selected_border_color);
            this.f107637OooO0Oo = ContextCompat.getColor(view.getContext(), R.color.folder_color_normal_border_color);
            this.f107638OooO0o0 = view.getResources().getDimensionPixelSize(R.dimen.folder_color_border_width);
            view.setOnClickListener(new ViewOnClickListenerC29029OoooO00(oooO0OO, 3));
        }
    }

    public OooO0OO(int i) {
        super(OooO00o.f107633OooO00o);
        this.f107631OooO0O0 = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, int i) {
        Drawable[] children;
        OooO0O0 holder = (OooO0O0) abstractC22078OooOooO;
        kotlin.jvm.internal.OooOOO0.OooO0oO(holder, "holder");
        C31040OooOO0o c31040OooOO0oOooO0OO = OooO0OO(i);
        kotlin.jvm.internal.OooOOO0.OooO0o(c31040OooOO0oOooO0OO, "getItem(...)");
        C31040OooOO0o c31040OooOO0o = c31040OooOO0oOooO0OO;
        holder.itemView.setTag(c31040OooOO0o);
        ImageView imageView = holder.f107634OooO00o;
        Drawable background = imageView.getBackground();
        GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
        Drawable drawableMutate = gradientDrawable != null ? gradientDrawable.mutate() : null;
        GradientDrawable gradientDrawable2 = drawableMutate instanceof GradientDrawable ? (GradientDrawable) drawableMutate : null;
        int i2 = 8;
        ImageView imageView2 = holder.f107635OooO0O0;
        boolean z = c31040OooOO0o.f110822OooO0O0;
        int i3 = c31040OooOO0o.f110821OooO00o;
        if (gradientDrawable2 != null) {
            gradientDrawable2.setColor(i3 == 0 ? ContextCompat.getColor(holder.itemView.getContext(), android.R.color.transparent) : i3);
            gradientDrawable2.setStroke(holder.f107638OooO0o0, z ? holder.f107636OooO0OO : holder.f107637OooO0Oo);
            if (imageView2 != null) {
                if (i3 == 0 && !z) {
                    i2 = 0;
                }
                imageView2.setVisibility(i2);
            }
            imageView.setSelected(z);
            imageView.setImageDrawable(null);
            return;
        }
        Drawable foreground = imageView.getForeground();
        StateListDrawable stateListDrawable = foreground instanceof StateListDrawable ? (StateListDrawable) foreground : null;
        if (stateListDrawable != null) {
            Drawable.ConstantState constantState = stateListDrawable.getConstantState();
            DrawableContainer.DrawableContainerState drawableContainerState = constantState instanceof DrawableContainer.DrawableContainerState ? (DrawableContainer.DrawableContainerState) constantState : null;
            if (drawableContainerState != null && (children = drawableContainerState.getChildren()) != null) {
                for (Drawable drawable : children) {
                    GradientDrawable gradientDrawable3 = drawable instanceof GradientDrawable ? (GradientDrawable) drawable : null;
                    if (gradientDrawable3 != null) {
                        gradientDrawable3.setColor(i3);
                    }
                }
            }
        }
        imageView.setImageDrawable(i3 == 0 ? ContextCompat.getDrawable(imageView.getContext(), R.drawable.ic_ni_folder_colorset) : null);
        if (imageView2 != null) {
            if (i3 == 0 && !z) {
                i2 = 0;
            }
            imageView2.setVisibility(i2);
        }
        imageView.setSelected(z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final RecyclerView.AbstractC22078OooOooO onCreateViewHolder(ViewGroup parent, int i) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(this.f107631OooO0O0, parent, false);
        kotlin.jvm.internal.OooOOO0.OooO0Oo(viewInflate);
        return new OooO0O0(this, viewInflate);
    }
}
