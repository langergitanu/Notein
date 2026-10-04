package o0Oo0ooO;

import OooOoO.C20504OooO0O0;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.AbstractC22050OooOo0o;
import androidx.recyclerview.widget.OooOOO;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.global.R;

/* JADX INFO: renamed from: o0Oo0ooO.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28421OooOOOo extends AbstractC22050OooOo0o<C28422OooOOo, OooO0O0> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public InterfaceC28462OooooOo f100763OooO0O0;

    /* JADX INFO: renamed from: o0Oo0ooO.OooOOOo$OooO00o */
    public static final class OooO00o extends OooOOO.AbstractC22036OooO0o0<C28422OooOOo> {
        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO00o(C28422OooOOo c28422OooOOo, C28422OooOOo c28422OooOOo2) {
            return c28422OooOOo.equals(c28422OooOOo2);
        }

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO0O0(C28422OooOOo c28422OooOOo, C28422OooOOo c28422OooOOo2) {
            return c28422OooOOo.f100769OooO00o == c28422OooOOo2.f100769OooO00o;
        }
    }

    /* JADX INFO: renamed from: o0Oo0ooO.OooOOOo$OooO0O0 */
    public final class OooO0O0 extends RecyclerView.AbstractC22078OooOooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final View f100764OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final View f100765OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final ImageView f100766OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final GradientDrawable f100767OooO0Oo;

        public OooO0O0(View view) {
            super(view);
            View viewFindViewById = view.findViewById(R.id.color);
            kotlin.jvm.internal.OooOOO0.OooO0o(viewFindViewById, "findViewById(...)");
            this.f100764OooO00o = viewFindViewById;
            View viewFindViewById2 = view.findViewById(R.id.border);
            this.f100765OooO0O0 = viewFindViewById2;
            this.f100766OooO0OO = (ImageView) view.findViewById(R.id.selected);
            Drawable drawableMutate = viewFindViewById.getBackground().mutate();
            kotlin.jvm.internal.OooOOO0.OooO0o0(drawableMutate, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            GradientDrawable gradientDrawable = (GradientDrawable) drawableMutate;
            viewFindViewById.setBackground(gradientDrawable);
            this.f100767OooO0Oo = gradientDrawable;
            if (viewFindViewById2 != null) {
                Drawable background = viewFindViewById2.getBackground();
                viewFindViewById2.setBackground(background != null ? background.mutate() : null);
            }
        }
    }

    public C28421OooOOOo() {
        super(new OooO00o());
        this.f100763OooO0O0 = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, final int i) {
        OooO0O0 holder = (OooO0O0) abstractC22078OooOooO;
        kotlin.jvm.internal.OooOOO0.OooO0oO(holder, "holder");
        final C28422OooOOo c28422OooOOoOooO0OO = OooO0OO(i);
        kotlin.jvm.internal.OooOOO0.OooO0Oo(c28422OooOOoOooO0OO);
        View view = holder.itemView;
        final C28421OooOOOo c28421OooOOOo = C28421OooOOOo.this;
        view.setOnClickListener(new View.OnClickListener() { // from class: o0Oo0ooO.OooOOo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                InterfaceC28462OooooOo interfaceC28462OooooOo = this.f100773OooOo0o.f100763OooO0O0;
                if (interfaceC28462OooooOo != null) {
                    interfaceC28462OooooOo.OooO00o(c28422OooOOoOooO0OO, i);
                }
            }
        });
        holder.f100767OooO0Oo.setColor(c28422OooOOoOooO0OO.f100769OooO00o);
        boolean z = c28422OooOOoOooO0OO.f100771OooO0OO;
        View view2 = holder.f100765OooO0O0;
        if (view2 != null) {
            view2.setSelected(z);
        }
        holder.itemView.setSelected(z);
        ImageView imageView = holder.f100766OooO0OO;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final RecyclerView.AbstractC22078OooOooO onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewOooO0OO = C20504OooO0O0.OooO0OO(viewGroup, "parent", R.layout.item_label_color, viewGroup, false);
        kotlin.jvm.internal.OooOOO0.OooO0Oo(viewOooO0OO);
        return new OooO0O0(viewOooO0OO);
    }
}
