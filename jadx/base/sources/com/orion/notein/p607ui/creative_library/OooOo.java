package com.orion.notein.p607ui.creative_library;

import OooOoO.C20504OooO0O0;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.AbstractC22050OooOo0o;
import androidx.recyclerview.widget.OooOOO;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.C22253OooOO0o;
import com.bumptech.glide.OooO0OO;
import com.google.android.material.card.MaterialCardView;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.creative_library.C23028OooO0Oo;
import kotlin.jvm.internal.OooOOO0;
import o0000OOo.C24217OooO0O0;
import o0OOOoO.C27190OooO0oO;
import o0Oo0oOo.C28313OooO0oo;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOo extends AbstractC22050OooOo0o<C23028OooO0Oo.OooO0O0, OooO0O0> {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final OooO00o f71162OooO0o0 = new OooO00o();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C28313OooO0oo f71163OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f71164OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f71165OooO0Oo;

    public static final class OooO00o extends OooOOO.AbstractC22036OooO0o0<C23028OooO0Oo.OooO0O0> {
        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO00o(C23028OooO0Oo.OooO0O0 oooO0O0, C23028OooO0Oo.OooO0O0 oooO0O02) {
            return oooO0O0.equals(oooO0O02);
        }

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO0O0(C23028OooO0Oo.OooO0O0 oooO0O0, C23028OooO0Oo.OooO0O0 oooO0O02) {
            return OooOOO0.OooO0O0(oooO0O0.f71018OooO00o, oooO0O02.f71018OooO00o);
        }
    }

    public static final class OooO0O0 extends RecyclerView.AbstractC22078OooOooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final C27190OooO0oO f71166OooO00o;

        public OooO0O0(C27190OooO0oO c27190OooO0oO) {
            super(c27190OooO0oO.f94957OooO00o);
            this.f71166OooO00o = c27190OooO0oO;
        }
    }

    public OooOo(C28313OooO0oo c28313OooO0oo) {
        super(f71162OooO0o0);
        this.f71163OooO0O0 = c28313OooO0oo;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, final int i) {
        OooO0O0 holder = (OooO0O0) abstractC22078OooOooO;
        OooOOO0.OooO0oO(holder, "holder");
        final C23028OooO0Oo.OooO0O0 oooO0O0OooO0OO = OooO0OO(i);
        OooOOO0.OooO0Oo(oooO0O0OooO0OO);
        int i2 = this.f71164OooO0OO;
        int i3 = this.f71165OooO0Oo;
        C27190OooO0oO c27190OooO0oO = holder.f71166OooO00o;
        ViewGroup.LayoutParams layoutParams = c27190OooO0oO.f94957OooO00o.getLayoutParams();
        MaterialCardView materialCardView = c27190OooO0oO.f94957OooO00o;
        if (layoutParams == null) {
            materialCardView.setLayoutParams(new ViewGroup.LayoutParams(i2, i3));
        } else if (layoutParams.width != i2 || layoutParams.height != i3) {
            layoutParams.width = i2;
            layoutParams.height = i3;
            materialCardView.setLayoutParams(layoutParams);
        }
        ImageView imageView = c27190OooO0oO.f94958OooO0O0;
        int i4 = oooO0O0OooO0OO.f71019OooO0O0;
        String str = oooO0O0OooO0OO.f71020OooO0OO;
        if (str == null || str.length() == 0) {
            imageView.setBackgroundColor(i4);
        } else {
            ((C22253OooOO0o) OooO0OO.OooO0o0(imageView).OooOO0O(str.concat("?x-oss-process=image/resize,w_800")).OooOo0O(new ColorDrawable(i4))).OoooO0(imageView);
        }
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: o0Oo0oOo.Ooooo0o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C28313OooO0oo c28313OooO0oo = this.f100536OooOo0o.f71163OooO0O0;
                if (c28313OooO0oo != null) {
                    c28313OooO0oo.invoke(Integer.valueOf(i), oooO0O0OooO0OO);
                }
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final RecyclerView.AbstractC22078OooOooO onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewOooO0OO = C20504OooO0O0.OooO0OO(viewGroup, "parent", R.layout.item_creative_preview, viewGroup, false);
        MaterialCardView materialCardView = (MaterialCardView) viewOooO0OO;
        ImageView imageView = (ImageView) C24217OooO0O0.OooO0O0(R.id.preview_image, viewOooO0OO);
        if (imageView != null) {
            return new OooO0O0(new C27190OooO0oO(materialCardView, imageView));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewOooO0OO.getResources().getResourceName(R.id.preview_image)));
    }
}
