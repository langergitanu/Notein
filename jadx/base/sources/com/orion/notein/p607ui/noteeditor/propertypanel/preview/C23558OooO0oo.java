package com.orion.notein.p607ui.noteeditor.propertypanel.preview;

import OooOoO.C20504OooO0O0;
import Oooo0.o000000O;
import android.graphics.ColorFilter;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.AbstractC22050OooOo0o;
import androidx.recyclerview.widget.OooOOO;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.propertypanel.preview.C23558OooO0oo;
import com.orion.notein.p607ui.noteeditor.propertypanel.preview.EditorPreviewFragment;
import java.io.File;
import kotlin.jvm.internal.OooOOO0;
import o00ooO0o.C25764OooO0O0;
import o0O0o0oO.ViewOnClickListenerC26054OoooOoo;
import o0O0o0oO.ViewOnClickListenerC26055Ooooo00;
import o0O0o0oO.ViewOnClickListenerC26056Ooooo0o;
import o0Ooooo.ViewOnContextClickListenerC29665OooO0OO;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.preview.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C23558OooO0oo extends AbstractC22050OooOo0o<PagePreviewVO, OooO00o> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public EditorPreviewFragment.OooOOO f76123OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public ViewOnContextClickListenerC29665OooO0OO f76124OooO0OO;

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.preview.OooO0oo$OooO00o */
    public final class OooO00o extends RecyclerView.AbstractC22078OooOooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final SimpleDraweeView f76125OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final View f76126OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final TextView f76127OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final View f76128OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final ImageView f76129OooO0o0;

        public OooO00o(final C23558OooO0oo c23558OooO0oo, View view) {
            super(view);
            View viewFindViewById = view.findViewById(R.id.f57988tn);
            OooOOO0.OooO0o(viewFindViewById, "findViewById(...)");
            this.f76125OooO00o = (SimpleDraweeView) viewFindViewById;
            this.f76126OooO0O0 = view.findViewById(R.id.tn_wrapper);
            this.f76127OooO0OO = (TextView) view.findViewById(R.id.page_number);
            View viewFindViewById2 = view.findViewById(R.id.btn_more);
            this.f76128OooO0Oo = viewFindViewById2;
            ImageView imageView = (ImageView) view.findViewById(R.id.btn_label);
            this.f76129OooO0o0 = imageView;
            view.setOnHoverListener(new View.OnHoverListener() { // from class: o0Ooooo.Oooo00O
                @Override // android.view.View.OnHoverListener
                public final boolean onHover(View view2, MotionEvent motionEvent) {
                    int actionMasked = motionEvent.getActionMasked();
                    C23558OooO0oo.OooO00o oooO00o = this.f105272OooO00o;
                    if (actionMasked == 9) {
                        oooO00o.f76126OooO0O0.setTranslationZ(o000000O.OooO0o0(6.0f));
                        View view3 = oooO00o.f76126OooO0O0;
                        view3.setScaleX(1.01f);
                        view3.setScaleY(1.01f);
                        return false;
                    }
                    if (actionMasked != 10) {
                        return false;
                    }
                    oooO00o.f76126OooO0O0.setTranslationZ(0.0f);
                    View view4 = oooO00o.f76126OooO0O0;
                    view4.setScaleX(1.0f);
                    view4.setScaleY(1.0f);
                    return false;
                }
            });
            view.setOnContextClickListener(new View.OnContextClickListener() { // from class: o0Ooooo.Oooo00o
                @Override // android.view.View.OnContextClickListener
                public final boolean onContextClick(View view2) {
                    ViewOnContextClickListenerC29665OooO0OO viewOnContextClickListenerC29665OooO0OO = c23558OooO0oo.f76124OooO0OO;
                    if (viewOnContextClickListenerC29665OooO0OO == null) {
                        return false;
                    }
                    viewOnContextClickListenerC29665OooO0OO.onContextClick(view2);
                    return true;
                }
            });
            this.itemView.setOnClickListener(new ViewOnClickListenerC26054OoooOoo(c23558OooO0oo, 4));
            viewFindViewById2.setOnClickListener(new ViewOnClickListenerC26055Ooooo00(c23558OooO0oo, 2));
            imageView.setOnClickListener(new ViewOnClickListenerC26056Ooooo0o(c23558OooO0oo, 1));
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.preview.OooO0oo$OooO0O0 */
    public static final class OooO0O0 extends OooOOO.AbstractC22036OooO0o0<PagePreviewVO> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO0O0 f76130OooO00o = new OooO0O0();

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO00o(PagePreviewVO pagePreviewVO, PagePreviewVO pagePreviewVO2) {
            return pagePreviewVO.equals(pagePreviewVO2);
        }

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO0O0(PagePreviewVO pagePreviewVO, PagePreviewVO pagePreviewVO2) {
            return OooOOO0.OooO0O0(pagePreviewVO.getId(), pagePreviewVO2.getId());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, int i) {
        OooO00o holder = (OooO00o) abstractC22078OooOooO;
        OooOOO0.OooO0oO(holder, "holder");
        PagePreviewVO pagePreviewVOOooO0OO = OooO0OO(i);
        OooOOO0.OooO0Oo(pagePreviewVOOooO0OO);
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("PreviewTnAdapter");
        c20358OooO00o.OooO00o("page %d, url: %s, (w,h): (%d,%d), rotation: %s", Integer.valueOf(pagePreviewVOOooO0OO.getIndex()), pagePreviewVOOooO0OO.getUrl(), Integer.valueOf(pagePreviewVOOooO0OO.getWidth()), Integer.valueOf(pagePreviewVOOooO0OO.getHeight()), pagePreviewVOOooO0OO.getRotationDirection());
        holder.itemView.setTag(pagePreviewVOOooO0OO);
        View view = holder.f76128OooO0Oo;
        view.setTag(pagePreviewVOOooO0OO);
        ImageView imageView = holder.f76129OooO0o0;
        imageView.setTag(pagePreviewVOOooO0OO);
        int size = pagePreviewVOOooO0OO.getLabelList().size();
        int i2 = 8;
        if (size == 0) {
            imageView.setVisibility((!pagePreviewVOOooO0OO.isCurrent() || pagePreviewVOOooO0OO.isSearchResult()) ? 8 : 0);
            imageView.setColorFilter((ColorFilter) null);
            imageView.setImageResource(R.drawable.ic_add_label);
        } else if (size != 1) {
            imageView.setVisibility(0);
            imageView.setColorFilter((ColorFilter) null);
            imageView.setImageResource(R.drawable.ic_color_label);
        } else {
            imageView.setVisibility(0);
            imageView.setImageResource(R.drawable.ic_label);
            imageView.setColorFilter(pagePreviewVOOooO0OO.getLabelList().get(0).f80083OooOoO0);
        }
        ViewGroup.LayoutParams layoutParams = holder.f76126OooO0O0.getLayoutParams();
        layoutParams.width = pagePreviewVOOooO0OO.getWidth();
        layoutParams.height = pagePreviewVOOooO0OO.getHeight();
        SimpleDraweeView simpleDraweeView = holder.f76125OooO00o;
        ViewGroup.LayoutParams layoutParams2 = simpleDraweeView.getLayoutParams();
        layoutParams2.width = pagePreviewVOOooO0OO.getWidth();
        layoutParams2.height = pagePreviewVOOooO0OO.getHeight();
        C25764OooO0O0 c25764OooO0O0OooO0o = C25764OooO0O0.OooO0o(Uri.fromFile(new File(pagePreviewVOOooO0OO.getUrl())));
        c25764OooO0O0OooO0o.OooO0O0();
        c25764OooO0O0OooO0o.OooO0OO();
        simpleDraweeView.setImageRequest(c25764OooO0O0OooO0o.OooO00o());
        if (pagePreviewVOOooO0OO.isCurrent() && !pagePreviewVOOooO0OO.isSearchResult()) {
            i2 = 0;
        }
        view.setVisibility(i2);
        if (pagePreviewVOOooO0OO.isCurrent()) {
            View view2 = holder.itemView;
            view2.setBackgroundColor(ContextCompat.getColor(view2.getContext(), R.color.item_bg_color_pressed));
        } else {
            View view3 = holder.itemView;
            view3.setBackgroundColor(ContextCompat.getColor(view3.getContext(), R.color.item_bg_secondary_color_normal));
        }
        holder.f76127OooO0OO.setText(String.valueOf(pagePreviewVOOooO0OO.getIndex() + 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final RecyclerView.AbstractC22078OooOooO onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewOooO0OO = C20504OooO0O0.OooO0OO(viewGroup, "parent", R.layout.item_preview_tn, viewGroup, false);
        OooOOO0.OooO0Oo(viewOooO0OO);
        return new OooO00o(this, viewOooO0OO);
    }
}
