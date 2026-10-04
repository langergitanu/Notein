package o0OoO0oO;

import OooOoO.C20504OooO0O0;
import Oooo0.o000000O;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.AbstractC22050OooOo0o;
import androidx.recyclerview.widget.OooOOO;
import androidx.recyclerview.widget.RecyclerView;
import com.aspose.slides.C22205OooOOo;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.p609vo.PageColorThemeVO;
import java.util.List;
import o0Oo0ooO.ViewOnClickListenerC28438Oooo0;
import o0o0OOO.o0000OO0;

/* JADX INFO: renamed from: o0OoO0oO.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28675OooO0Oo extends AbstractC22050OooOo0o<PageColorThemeVO, OooO0O0> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public View.OnClickListener f101612OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public o0000OO0 f101613OooO0OO;

    /* JADX INFO: renamed from: o0OoO0oO.OooO0Oo$OooO00o */
    public static final class OooO00o extends OooOOO.AbstractC22036OooO0o0<PageColorThemeVO> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO00o f101614OooO00o = new OooO00o();

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO00o(PageColorThemeVO pageColorThemeVO, PageColorThemeVO pageColorThemeVO2) {
            return pageColorThemeVO.equals(pageColorThemeVO2);
        }

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO0O0(PageColorThemeVO pageColorThemeVO, PageColorThemeVO pageColorThemeVO2) {
            return pageColorThemeVO.equals(pageColorThemeVO2);
        }

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final Object OooO0OO(PageColorThemeVO pageColorThemeVO, PageColorThemeVO pageColorThemeVO2) {
            if (pageColorThemeVO.getSelected() != pageColorThemeVO2.getSelected()) {
                return C22205OooOOo.OooO0O0("selected", true);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: o0OoO0oO.OooO0Oo$OooO0O0 */
    public final class OooO0O0 extends RecyclerView.AbstractC22078OooOooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ImageView f101615OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final View f101616OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final TextView f101617OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final ImageView f101618OooO0Oo;

        public OooO0O0(final C28675OooO0Oo c28675OooO0Oo, View view) {
            super(view);
            this.f101615OooO00o = (ImageView) view.findViewById(R.id.color);
            this.f101616OooO0O0 = view.findViewById(R.id.color_border);
            this.f101617OooO0OO = (TextView) view.findViewById(R.id.tv_desc);
            ImageView imageView = (ImageView) view.findViewById(R.id.iv_delete);
            this.f101618OooO0Oo = imageView;
            view.setOnClickListener(new ViewOnClickListenerC28438Oooo0(c28675OooO0Oo, 1));
            imageView.setOnClickListener(new ViewOnClickListenerC28677OooO0o0(c28675OooO0Oo, 0));
            view.setOnLongClickListener(new View.OnLongClickListener() { // from class: o0OoO0oO.OooO0o
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view2) {
                    o0000OO0 o0000oo02 = c28675OooO0Oo.f101613OooO0OO;
                    if (o0000oo02 == null) {
                        return false;
                    }
                    o0000oo02.onLongClick(view2);
                    return true;
                }
            });
        }
    }

    public C28675OooO0Oo() {
        super(OooO00o.f101614OooO00o);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, int i) {
        OooO0O0 holder = (OooO0O0) abstractC22078OooOooO;
        kotlin.jvm.internal.OooOOO0.OooO0oO(holder, "holder");
        PageColorThemeVO pageColorThemeVOOooO0OO = OooO0OO(i);
        kotlin.jvm.internal.OooOOO0.OooO0o(pageColorThemeVOOooO0OO, "getItem(...)");
        PageColorThemeVO pageColorThemeVO = pageColorThemeVOOooO0OO;
        holder.itemView.setTag(pageColorThemeVO);
        boolean zIsAdd = pageColorThemeVO.isAdd();
        ImageView imageView = holder.f101615OooO00o;
        if (zIsAdd) {
            imageView.setImageResource(pageColorThemeVO.isEditAble() ? R.drawable.ic_ni_choose_blue : R.drawable.ic_ni_add_blue);
            imageView.setBackground(null);
        } else {
            Drawable drawable = ContextCompat.getDrawable(imageView.getContext(), R.drawable.page_create_color_picker_bg);
            kotlin.jvm.internal.OooOOO0.OooO0o0(drawable, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            GradientDrawable gradientDrawable = (GradientDrawable) drawable;
            gradientDrawable.setColor(pageColorThemeVO.getColor());
            imageView.setImageDrawable(null);
            imageView.setBackground(gradientDrawable);
        }
        View borderView = holder.f101616OooO0O0;
        kotlin.jvm.internal.OooOOO0.OooO0o(borderView, "borderView");
        borderView.setVisibility(!pageColorThemeVO.isAdd() ? 0 : 8);
        ImageView deleteView = holder.f101618OooO0Oo;
        kotlin.jvm.internal.OooOOO0.OooO0o(deleteView, "deleteView");
        deleteView.setVisibility((!pageColorThemeVO.isEditAble() || pageColorThemeVO.isAdd()) ? 8 : 0);
        deleteView.setTag(pageColorThemeVO);
        holder.itemView.setSelected(pageColorThemeVO.getSelected());
        TextView colorDesc = holder.f101617OooO0OO;
        kotlin.jvm.internal.OooOOO0.OooO0o(colorDesc, "colorDesc");
        colorDesc.setVisibility(pageColorThemeVO.isAdd() ? 0 : 8);
        colorDesc.setText(colorDesc.getContext().getString(R.string.add_more_colors));
        if (!pageColorThemeVO.getShowVipBadge()) {
            colorDesc.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        } else {
            colorDesc.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, ContextCompat.getDrawable(colorDesc.getContext(), R.drawable.ic_ni_vip_12), (Drawable) null);
            colorDesc.setCompoundDrawablePadding(o000000O.OooO0o(4));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final RecyclerView.AbstractC22078OooOooO onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewOooO0OO = C20504OooO0O0.OooO0OO(viewGroup, "parent", R.layout.item_note_creation_page_color, viewGroup, false);
        kotlin.jvm.internal.OooOOO0.OooO0Oo(viewOooO0OO);
        return new OooO0O0(this, viewOooO0OO);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, int i, List payloads) {
        OooO0O0 holder = (OooO0O0) abstractC22078OooOooO;
        kotlin.jvm.internal.OooOOO0.OooO0oO(holder, "holder");
        kotlin.jvm.internal.OooOOO0.OooO0oO(payloads, "payloads");
        if (!payloads.isEmpty()) {
            holder.itemView.setSelected(OooO0OO(i).getSelected());
        } else {
            super.onBindViewHolder(holder, i, payloads);
        }
    }
}
