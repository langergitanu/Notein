package o0o0O000;

import OooOoO.C20504OooO0O0;
import Oooo0.o000000O;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.BlendModeColorFilterCompat;
import androidx.core.graphics.BlendModeCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.widget.ImageViewCompat;
import androidx.recyclerview.widget.AbstractC22050OooOo0o;
import androidx.recyclerview.widget.OooOOO;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.p609vo.FolderVO;
import o0OoO0oo.ViewOnClickListenerC28701OooOOo0;
import o0o0O000.C30216OooO00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0o0O000.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30216OooO00o extends AbstractC22050OooOo0o<FolderVO, OooO0O0> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public ViewOnClickListenerC28701OooOOo0 f107624OooO0O0;

    /* JADX INFO: renamed from: o0o0O000.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C20050OooO00o extends OooOOO.AbstractC22036OooO0o0<FolderVO> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final C20050OooO00o f107625OooO00o = new C20050OooO00o();

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO00o(FolderVO folderVO, FolderVO folderVO2) {
            return folderVO.equals(folderVO2);
        }

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO0O0(FolderVO folderVO, FolderVO folderVO2) {
            return kotlin.jvm.internal.OooOOO0.OooO0O0(folderVO.getId(), folderVO2.getId());
        }
    }

    /* JADX INFO: renamed from: o0o0O000.OooO00o$OooO0O0 */
    public final class OooO0O0 extends RecyclerView.AbstractC22078OooOooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final TextView f107626OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final ImageView f107627OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final ImageView f107628OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final ImageView f107629OooO0Oo;

        public OooO0O0(C30216OooO00o c30216OooO00o, View view) {
            super(view);
            this.f107626OooO00o = (TextView) view.findViewById(R.id.folder_name);
            this.f107627OooO0O0 = (ImageView) view.findViewById(R.id.folder_icon);
            ImageView imageView = (ImageView) view.findViewById(R.id.expand_icon);
            this.f107628OooO0OO = imageView;
            this.f107629OooO0Oo = (ImageView) view.findViewById(R.id.is_select);
            ViewOnClickListenerC28701OooOOo0 viewOnClickListenerC28701OooOOo0 = c30216OooO00o.f107624OooO0O0;
            if (viewOnClickListenerC28701OooOOo0 != null) {
                imageView.setOnClickListener(viewOnClickListenerC28701OooOOo0);
                this.itemView.setOnClickListener(viewOnClickListenerC28701OooOOo0);
            }
            view.post(new Runnable() { // from class: o0o0O000.OooO0O0
                @Override // java.lang.Runnable
                public final void run() {
                    Rect rect = new Rect();
                    int iOooO0o = o000000O.OooO0o(8);
                    C30216OooO00o.OooO0O0 oooO0O0 = this.f107630OooOo0o;
                    oooO0O0.f107628OooO0OO.getHitRect(rect);
                    rect.left -= iOooO0o;
                    rect.top -= iOooO0o;
                    rect.right += iOooO0o;
                    rect.bottom += iOooO0o;
                    ImageView imageView2 = oooO0O0.f107628OooO0OO;
                    Object parent = imageView2.getParent();
                    kotlin.jvm.internal.OooOOO0.OooO0o0(parent, "null cannot be cast to non-null type android.view.View");
                    ((View) parent).setTouchDelegate(new TouchDelegate(rect, imageView2));
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, int i) {
        Drawable drawableMutate;
        OooO0O0 holder = (OooO0O0) abstractC22078OooOooO;
        kotlin.jvm.internal.OooOOO0.OooO0oO(holder, "holder");
        FolderVO folderVOOooO0OO = OooO0OO(i);
        kotlin.jvm.internal.OooOOO0.OooO0o(folderVOOooO0OO, "getItem(...)");
        FolderVO folderVO = folderVOOooO0OO;
        holder.itemView.setTag(folderVO);
        ImageView imageView = holder.f107628OooO0OO;
        imageView.setTag(folderVO);
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("FolderAdapter");
        c20358OooO00o.OooO00o("bind folder=%s color=%s", folderVO.getName(), Integer.toHexString(folderVO.getCoverColor()));
        String name = folderVO.getName();
        TextView textView = holder.f107626OooO00o;
        textView.setText(name);
        if (folderVO.getSelectable()) {
            textView.setTextColor(ContextCompat.getColor(textView.getContext(), R.color.item_text_name_color));
        } else {
            textView.setTextColor(ContextCompat.getColor(textView.getContext(), R.color.item_text_value_color));
        }
        ImageView imageView2 = holder.f107627OooO0O0;
        ViewGroup.LayoutParams layoutParams = imageView2.getLayoutParams();
        kotlin.jvm.internal.OooOOO0.OooO0o0(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMarginStart(o000000O.OooO0o(16) * folderVO.getLevel());
        imageView2.setLayoutParams(marginLayoutParams);
        ImageViewCompat.setImageTintList(imageView2, null);
        ImageViewCompat.setImageTintMode(imageView2, null);
        imageView2.setColorFilter((ColorFilter) null);
        Drawable drawable = imageView2.getDrawable();
        if (drawable != null) {
            DrawableCompat.clearColorFilter(drawable);
        }
        if (folderVO.getHasChildren()) {
            imageView.setVisibility(0);
            if (folderVO.isExpand()) {
                imageView.setImageResource(R.drawable.ic_ni_arrow_drop_down_normal);
            } else {
                imageView.setImageResource(R.drawable.ic_ni_arrow_right);
            }
            imageView.setActivated(folderVO.isExpand());
        } else {
            imageView.setVisibility(4);
        }
        if (kotlin.jvm.internal.OooOOO0.OooO0O0(folderVO.getId(), "desktop")) {
            imageView2.setImageResource(R.drawable.ic_ni_grid_normal_new);
            ImageViewCompat.setImageTintList(imageView2, null);
            ImageViewCompat.setImageTintMode(imageView2, null);
            imageView2.setColorFilter((ColorFilter) null);
        } else {
            Drawable drawable2 = ContextCompat.getDrawable(imageView2.getContext(), R.drawable.layer_folder_icon);
            Drawable drawableMutate2 = drawable2 != null ? drawable2.mutate() : null;
            if (drawableMutate2 instanceof LayerDrawable) {
                imageView2.setImageDrawable(drawableMutate2);
                ImageViewCompat.setImageTintList(imageView2, null);
                ImageViewCompat.setImageTintMode(imageView2, null);
                imageView2.setColorFilter((ColorFilter) null);
                Drawable drawableFindDrawableByLayerId = ((LayerDrawable) drawableMutate2).findDrawableByLayerId(R.id.layer_folder_fill);
                if (drawableFindDrawableByLayerId != null && (drawableMutate = drawableFindDrawableByLayerId.mutate()) != null) {
                    c20358OooO00o.OooOOO0("FolderAdapter");
                    c20358OooO00o.OooO00o("tint fill layer name=%s alpha=%d color=%s", folderVO.getName(), Integer.valueOf(drawableMutate.getAlpha()), Integer.toHexString(folderVO.getCoverColor()));
                    drawableMutate.setColorFilter(BlendModeColorFilterCompat.createBlendModeColorFilterCompat(folderVO.getCoverColor(), BlendModeCompat.SRC_IN));
                }
            } else {
                Drawable drawable3 = ContextCompat.getDrawable(imageView2.getContext(), R.drawable.ic_ni_folder_new);
                if (drawable3 != null) {
                    Drawable drawableMutate3 = DrawableCompat.wrap(drawable3).mutate();
                    kotlin.jvm.internal.OooOOO0.OooO0o(drawableMutate3, "mutate(...)");
                    DrawableCompat.setTint(drawableMutate3, folderVO.getCoverColor());
                    imageView2.setImageDrawable(drawableMutate3);
                    ImageViewCompat.setImageTintList(imageView2, null);
                    ImageViewCompat.setImageTintMode(imageView2, null);
                    imageView2.setColorFilter((ColorFilter) null);
                } else {
                    imageView2.setImageDrawable(null);
                }
            }
        }
        View view = holder.itemView;
        view.setBackground(ContextCompat.getDrawable(view.getContext(), R.drawable.list_item_bg_selector));
        holder.itemView.setSelected(folderVO.isSelected());
        boolean zIsSelected = folderVO.isSelected();
        ImageView imageView3 = holder.f107629OooO0Oo;
        if (zIsSelected) {
            imageView3.setVisibility(0);
        } else {
            imageView3.setVisibility(4);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final RecyclerView.AbstractC22078OooOooO onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewOooO0OO = C20504OooO0O0.OooO0OO(viewGroup, "parent", R.layout.item_folder_dialog_folder, viewGroup, false);
        kotlin.jvm.internal.OooOOO0.OooO0Oo(viewOooO0OO);
        return new OooO0O0(this, viewOooO0OO);
    }
}
