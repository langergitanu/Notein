package o0oOOooO;

import OooOoO.C20504OooO0O0;
import OooOoOO.C20519OooO0Oo;
import Oooo0.o000000O;
import android.graphics.drawable.PictureDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.AbstractC22050OooOo0o;
import androidx.recyclerview.widget.OooOOO;
import androidx.recyclerview.widget.RecyclerView;
import com.hihonor.honorid.core.data.ChildrenInfo;
import com.orion.notein.global.R;
import java.io.File;
import java.util.List;
import java.util.Set;
import o00o00oO.C25291OooO0oO;
import o0OoOoo.ViewOnClickListenerC29221OooO0o;
import o0oOo000.C30941OooO0O0;
import o0oOoOo.C31077OoooOOo;
import oO00ooO.C32447OooOOo;
import oO0O000.C32501OooO0oO;

/* JADX INFO: renamed from: o0oOOooO.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30886OooO0oO extends AbstractC22050OooOo0o<C31077OoooOOo, OooO0OO> {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final C32447OooOOo f110366OooO0o = C20519OooO0Oo.OooO0OO(new C30884OooO0o());

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Integer f110367OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Integer f110368OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f110369OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public View.OnClickListener f110370OooO0o0;

    /* JADX INFO: renamed from: o0oOOooO.OooO0oO$OooO00o */
    public static final class OooO00o {
    }

    /* JADX INFO: renamed from: o0oOOooO.OooO0oO$OooO0O0 */
    public static final class OooO0O0 extends OooOOO.AbstractC22036OooO0o0<C31077OoooOOo> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO0O0 f110371OooO00o = new OooO0O0();

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO00o(C31077OoooOOo c31077OoooOOo, C31077OoooOOo c31077OoooOOo2) {
            return c31077OoooOOo.equals(c31077OoooOOo2);
        }

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO0O0(C31077OoooOOo c31077OoooOOo, C31077OoooOOo c31077OoooOOo2) {
            return kotlin.jvm.internal.OooOOO0.OooO0O0(c31077OoooOOo.f110906OooO00o, c31077OoooOOo2.f110906OooO00o);
        }

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final Object OooO0OO(C31077OoooOOo c31077OoooOOo, C31077OoooOOo c31077OoooOOo2) {
            C31077OoooOOo c31077OoooOOo3 = c31077OoooOOo;
            C31077OoooOOo c31077OoooOOo4 = c31077OoooOOo2;
            Bundle bundle = new Bundle();
            if (!kotlin.jvm.internal.OooOOO0.OooO0O0(c31077OoooOOo3.f110907OooO0O0, c31077OoooOOo4.f110907OooO0O0)) {
                bundle.putBoolean("name", true);
            }
            if (c31077OoooOOo3.f110909OooO0Oo.size() != c31077OoooOOo4.f110909OooO0Oo.size()) {
                bundle.putBoolean(ChildrenInfo.TAG_CHILDREN_INFO, true);
            }
            if (!kotlin.jvm.internal.OooOOO0.OooO0O0(c31077OoooOOo3.f110908OooO0OO, c31077OoooOOo4.f110908OooO0OO)) {
                bundle.putBoolean("first_sticker", true);
            }
            if (c31077OoooOOo3.f110910OooO0o != c31077OoooOOo4.f110910OooO0o) {
                bundle.putBoolean("isAddType", true);
            }
            if (c31077OoooOOo3.f110912OooO0oO != c31077OoooOOo4.f110912OooO0oO) {
                bundle.putBoolean("isSelected", true);
            }
            if (c31077OoooOOo3.f110913OooO0oo != c31077OoooOOo4.f110913OooO0oo) {
                bundle.putBoolean("isLatestType", true);
            }
            return bundle;
        }
    }

    /* JADX INFO: renamed from: o0oOOooO.OooO0oO$OooO0OO */
    public final class OooO0OO extends RecyclerView.AbstractC22078OooOooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final View f110372OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final View f110373OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final ImageView f110374OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final ImageView f110375OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final TextView f110376OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final View f110377OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final TextView f110378OooO0oO;

        public OooO0OO(View view) {
            super(view);
            this.f110372OooO00o = view.findViewById(R.id.iv_add);
            this.f110373OooO0O0 = view.findViewById(R.id.cl_sticker_set_preview);
            this.f110374OooO0OO = (ImageView) view.findViewById(R.id.iv_latest);
            this.f110375OooO0Oo = (ImageView) view.findViewById(R.id.iv_sticker_preview);
            this.f110377OooO0o0 = view.findViewById(R.id.v_sticker_set_preview_border);
            this.f110376OooO0o = (TextView) view.findViewById(R.id.tv_title);
            this.f110378OooO0oO = (TextView) view.findViewById(R.id.tv_count);
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final void OooO00o(C31077OoooOOo c31077OoooOOo, Bundle bundle) {
            this.itemView.setTag(c31077OoooOOo);
            if (bundle == null || bundle.isEmpty()) {
                OooO0O0(c31077OoooOOo);
                return;
            }
            Set<String> setKeySet = bundle.keySet();
            kotlin.jvm.internal.OooOOO0.OooO0o(setKeySet, "keySet(...)");
            for (String str : setKeySet) {
                if (str != null) {
                    switch (str.hashCode()) {
                        case -2050108754:
                            if (str.equals("first_sticker")) {
                                OooO0o0(c31077OoooOOo);
                            } else {
                                continue;
                            }
                            break;
                        case -1728345359:
                            if (str.equals("isAddType")) {
                            }
                            break;
                        case 3373707:
                            if (str.equals("name")) {
                                this.f110376OooO0o.setText(c31077OoooOOo.f110907OooO0O0);
                            } else {
                                continue;
                            }
                            break;
                        case 398301669:
                            if (str.equals("isSelected")) {
                                OooO0Oo(c31077OoooOOo);
                                OooO0OO(c31077OoooOOo);
                            } else {
                                continue;
                            }
                            break;
                        case 1659526655:
                            if (str.equals(ChildrenInfo.TAG_CHILDREN_INFO)) {
                                this.f110378OooO0oO.setText(String.valueOf(c31077OoooOOo.f110909OooO0Oo.size()));
                            } else {
                                continue;
                            }
                            break;
                        case 2046456875:
                            if (str.equals("isLatestType")) {
                            }
                            break;
                    }
                    OooO0O0(c31077OoooOOo);
                }
            }
        }

        public final void OooO0O0(C31077OoooOOo c31077OoooOOo) {
            this.f110376OooO0o.setText(c31077OoooOOo.f110907OooO0O0);
            this.f110378OooO0oO.setText(String.valueOf(c31077OoooOOo.f110909OooO0Oo.size()));
            OooO0o0(c31077OoooOOo);
            View ivAdd = this.f110372OooO00o;
            kotlin.jvm.internal.OooOOO0.OooO0o(ivAdd, "ivAdd");
            ivAdd.setVisibility(c31077OoooOOo.f110910OooO0o ? 0 : 8);
            OooO0Oo(c31077OoooOOo);
            OooO0OO(c31077OoooOOo);
        }

        public final void OooO0OO(C31077OoooOOo c31077OoooOOo) {
            View ivBorder = this.f110377OooO0o0;
            kotlin.jvm.internal.OooOOO0.OooO0o(ivBorder, "ivBorder");
            ivBorder.setVisibility(!c31077OoooOOo.f110913OooO0oo ? 0 : 8);
            ivBorder.setBackground(c31077OoooOOo.f110910OooO0o ? null : ContextCompat.getDrawable(ivBorder.getContext(), R.drawable.bg_sticker_set_preview_border_selector));
            ivBorder.setSelected(c31077OoooOOo.f110912OooO0oO);
        }

        public final void OooO0Oo(C31077OoooOOo c31077OoooOOo) {
            ImageView ivLatest = this.f110374OooO0OO;
            kotlin.jvm.internal.OooOOO0.OooO0o(ivLatest, "ivLatest");
            boolean z = c31077OoooOOo.f110913OooO0oo;
            ivLatest.setVisibility(z ? 0 : 8);
            ivLatest.setImageTintList(ContextCompat.getColorStateList(ivLatest.getContext(), c31077OoooOOo.f110912OooO0oO ? R.color.item_icon_group_tint_color : R.color.icon_tint_color));
            View view = this.f110373OooO0O0;
            view.setBackground(z ? null : ContextCompat.getDrawable(view.getContext(), R.drawable.bg_sticker_set_preview_selector));
        }

        public final void OooO0o0(C31077OoooOOo c31077OoooOOo) {
            int i = (c31077OoooOOo.f110910OooO0o || c31077OoooOOo.f110913OooO0oo) ? 4 : 0;
            ImageView imageView = this.f110375OooO0Oo;
            imageView.setVisibility(i);
            String str = c31077OoooOOo.f110908OooO0OO;
            if (str != null) {
                File file = new File(str);
                if (C32501OooO0oO.OooO0o0(file).equals("svg")) {
                    com.bumptech.glide.OooO0OO.OooO0o0(imageView).OooO00o(PictureDrawable.class).OoooO(new C30941OooO0O0()).OoooOOO(file).OooO00o((C25291OooO0oO) C30886OooO0oO.f110366OooO0o.getValue()).OoooO0(imageView);
                } else {
                    com.bumptech.glide.OooO0OO.OooO0o0(imageView).OooO0oo(file).OooO00o((C25291OooO0oO) C30886OooO0oO.f110366OooO0o.getValue()).OooO().OoooO0(imageView);
                }
            }
        }
    }

    public C30886OooO0oO(Integer num, Integer num2, boolean z) {
        super(OooO0O0.f110371OooO00o);
        this.f110367OooO0O0 = num;
        this.f110368OooO0OO = num2;
        this.f110369OooO0Oo = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, int i) {
        OooO0OO holder = (OooO0OO) abstractC22078OooOooO;
        kotlin.jvm.internal.OooOOO0.OooO0oO(holder, "holder");
        C31077OoooOOo c31077OoooOOoOooO0OO = OooO0OO(i);
        kotlin.jvm.internal.OooOOO0.OooO0o(c31077OoooOOoOooO0OO, "getItem(...)");
        holder.OooO00o(c31077OoooOOoOooO0OO, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final RecyclerView.AbstractC22078OooOooO onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewOooO0OO = C20504OooO0O0.OooO0OO(viewGroup, "parent", R.layout.item_sticker_collection, viewGroup, false);
        ViewGroup.LayoutParams layoutParams = viewOooO0OO.getLayoutParams();
        kotlin.jvm.internal.OooOOO0.OooO0o0(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        Integer num = this.f110368OooO0OO;
        int iIntValue = num != null ? num.intValue() : o000000O.OooO0o(7);
        marginLayoutParams.setMargins(iIntValue, iIntValue, iIntValue, iIntValue);
        viewOooO0OO.setLayoutParams(marginLayoutParams);
        ImageView imageView = (ImageView) viewOooO0OO.findViewById(R.id.iv_sticker_preview);
        ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
        Integer num2 = this.f110367OooO0O0;
        int iIntValue2 = num2 != null ? num2.intValue() : o000000O.OooO0o(78);
        layoutParams2.width = iIntValue2;
        layoutParams2.height = iIntValue2;
        imageView.setLayoutParams(layoutParams2);
        View viewFindViewById = viewOooO0OO.findViewById(R.id.tv_title);
        kotlin.jvm.internal.OooOOO0.OooO0o(viewFindViewById, "findViewById(...)");
        boolean z = this.f110369OooO0Oo;
        viewFindViewById.setVisibility(z ? 0 : 8);
        View viewFindViewById2 = viewOooO0OO.findViewById(R.id.tv_count);
        kotlin.jvm.internal.OooOOO0.OooO0o(viewFindViewById2, "findViewById(...)");
        viewFindViewById2.setVisibility(z ? 0 : 8);
        viewOooO0OO.setOnClickListener(new ViewOnClickListenerC29221OooO0o(this, 2));
        return new OooO0OO(viewOooO0OO);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, int i, List payloads) {
        OooO0OO holder = (OooO0OO) abstractC22078OooOooO;
        kotlin.jvm.internal.OooOOO0.OooO0oO(holder, "holder");
        kotlin.jvm.internal.OooOOO0.OooO0oO(payloads, "payloads");
        if (payloads.isEmpty()) {
            C31077OoooOOo c31077OoooOOoOooO0OO = OooO0OO(i);
            kotlin.jvm.internal.OooOOO0.OooO0o(c31077OoooOOoOooO0OO, "getItem(...)");
            holder.OooO00o(c31077OoooOOoOooO0OO, null);
        } else {
            Object obj = payloads.get(0);
            kotlin.jvm.internal.OooOOO0.OooO0o0(obj, "null cannot be cast to non-null type android.os.Bundle");
            C31077OoooOOo c31077OoooOOoOooO0OO2 = OooO0OO(i);
            kotlin.jvm.internal.OooOOO0.OooO0o(c31077OoooOOoOooO0OO2, "getItem(...)");
            holder.OooO00o(c31077OoooOOoOooO0OO2, (Bundle) obj);
        }
    }
}
