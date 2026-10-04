package o0o00oOo;

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
import com.orion.notein.p607ui.notelist.documents.NoteListContainerFragment;
import o0Oo0ooO.C28422OooOOo;
import o0o00oOo.C30033OooO0o;
import oO0o0Oo.C33781o00o0O;

/* JADX INFO: renamed from: o0o00oOo.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30032OooO0Oo extends AbstractC22050OooOo0o<C28422OooOOo, OooO0O0> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public C30033OooO0o.OooO00o f106755OooO0O0;

    /* JADX INFO: renamed from: o0o00oOo.OooO0Oo$OooO00o */
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

    /* JADX INFO: renamed from: o0o00oOo.OooO0Oo$OooO0O0 */
    public final class OooO0O0 extends RecyclerView.AbstractC22078OooOooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final View f106756OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final ImageView f106757OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final View f106758OooO0OO;

        public OooO0O0(View view) {
            super(view);
            View viewFindViewById = view.findViewById(R.id.color);
            kotlin.jvm.internal.OooOOO0.OooO0o(viewFindViewById, "findViewById(...)");
            this.f106756OooO00o = viewFindViewById;
            View viewFindViewById2 = view.findViewById(R.id.selected);
            kotlin.jvm.internal.OooOOO0.OooO0o(viewFindViewById2, "findViewById(...)");
            this.f106757OooO0O0 = (ImageView) viewFindViewById2;
            View viewFindViewById3 = view.findViewById(R.id.placeholder);
            kotlin.jvm.internal.OooOOO0.OooO0o(viewFindViewById3, "findViewById(...)");
            this.f106758OooO0OO = viewFindViewById3;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, final int i) {
        OooO0O0 holder = (OooO0O0) abstractC22078OooOooO;
        kotlin.jvm.internal.OooOOO0.OooO0oO(holder, "holder");
        final C28422OooOOo c28422OooOOoOooO0OO = OooO0OO(i);
        kotlin.jvm.internal.OooOOO0.OooO0Oo(c28422OooOOoOooO0OO);
        View view = holder.itemView;
        final C30032OooO0Oo c30032OooO0Oo = C30032OooO0Oo.this;
        view.setOnClickListener(new View.OnClickListener() { // from class: o0o00oOo.OooO0o0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C30033OooO0o.OooO00o oooO00o = this.f106767OooOo0o.f106755OooO0O0;
                if (oooO00o != null) {
                    NoteListContainerFragment.OooOOOO oooOOOO = C30033OooO0o.this.f106761OooO0O0;
                    int i2 = i;
                    NoteListContainerFragment noteListContainerFragment = NoteListContainerFragment.this;
                    C30033OooO0o c30033OooO0o = noteListContainerFragment.f77376o0OoOo0;
                    if (c30033OooO0o == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("labelFilterPopupWindow");
                        throw null;
                    }
                    c30033OooO0o.OooO00o();
                    com.orion.notein.p607ui.notelist.OooO0OO oooO0OOOooOoo = noteListContainerFragment.OooOoo();
                    Integer numValueOf = Integer.valueOf(i2);
                    C33781o00o0O c33781o00o0O = oooO0OOOooOoo.f77149Oooo0;
                    c33781o00o0O.getClass();
                    c33781o00o0O.OooOO0(null, numValueOf);
                }
            }
        });
        boolean z = c28422OooOOoOooO0OO.f100771OooO0OO;
        ImageView imageView = holder.f106757OooO0O0;
        View view2 = holder.f106758OooO0OO;
        View view3 = holder.f106756OooO00o;
        if (i == 0) {
            view2.setVisibility(0);
            view3.setVisibility(8);
            imageView.setVisibility(z ? 0 : 8);
            return;
        }
        view2.setVisibility(8);
        view3.setVisibility(0);
        Drawable background = view3.getBackground();
        kotlin.jvm.internal.OooOOO0.OooO0o0(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        GradientDrawable gradientDrawable = (GradientDrawable) background;
        gradientDrawable.setColor(c28422OooOOoOooO0OO.f100769OooO00o);
        view3.setBackground(gradientDrawable);
        imageView.setVisibility(z ? 0 : 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final RecyclerView.AbstractC22078OooOooO onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewOooO0OO = C20504OooO0O0.OooO0OO(viewGroup, "parent", R.layout.item_label_color_filter, viewGroup, false);
        kotlin.jvm.internal.OooOOO0.OooO0Oo(viewOooO0OO);
        return new OooO0O0(viewOooO0OO);
    }
}
