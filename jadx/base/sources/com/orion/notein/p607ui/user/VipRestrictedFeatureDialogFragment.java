package com.orion.notein.p607ui.user;

import Oooo0.o000000O;
import android.app.Dialog;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.o00Oo0;
import com.aspose.words.StyleIdentifier;
import com.bumptech.glide.C22253OooOO0o;
import com.facebook.soloader.OooOo;
import com.google.android.material.search.OooOO0O;
import com.google.firebase.Firebase;
import com.google.firebase.storage.StorageKt;
import com.google.firebase.storage.StorageReference;
import com.orion.notein.global.R;
import kotlin.Metadata;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import kotlin.jvm.internal.Oooo0;
import o000o00.AbstractC24555OooO00o;
import o000o0O0.C24568OooO0oO;
import o00o000.C25227OooOoO;
import o00o00oO.C25291OooO0oO;
import o0O0oooO.C26320o0000OoO;
import o0Oo0Ooo.ViewOnClickListenerC28141OooO0oO;
import o0Oo0Ooo.ViewOnClickListenerC28142OooO0oo;
import o0oOo0.C30925OooOOOo;
import o0oOo0.C30926OooOOo;
import o0oOo0.C30927OooOOo0;
import oO00ooO.C32443OooOOO;
import oO0o0O0o.C33599OooOo0O;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/user/VipRestrictedFeatureDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class VipRestrictedFeatureDialogFragment extends Hilt_VipRestrictedFeatureDialogFragment {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public ImageView f79668OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final C24568OooO0oO f79669OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public ProgressBar f79670OooOooO;

    public static final class OooO00o extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {
        public OooO00o() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return VipRestrictedFeatureDialogFragment.this.requireActivity().getViewModelStore();
        }
    }

    public static final class OooO0O0 extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {
        public OooO0O0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            return VipRestrictedFeatureDialogFragment.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    public static final class OooO0OO extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {
        public OooO0OO() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            return VipRestrictedFeatureDialogFragment.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.user.VipRestrictedFeatureDialogFragment$OooO0Oo, reason: case insensitive filesystem */
    public static final class C23865OooO0Oo extends OooOOOO implements oO0O000o.OooO00o<Bundle> {
        public C23865OooO0Oo() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Bundle invoke() {
            VipRestrictedFeatureDialogFragment vipRestrictedFeatureDialogFragment = VipRestrictedFeatureDialogFragment.this;
            Bundle arguments = vipRestrictedFeatureDialogFragment.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + vipRestrictedFeatureDialogFragment + " has null arguments");
        }
    }

    public VipRestrictedFeatureDialogFragment() {
        Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
        this.f79669OooOoo0 = new C24568OooO0oO(oooo0.OooO0O0(C30926OooOOo.class), new C23865OooO0Oo());
        new C22026ooOO(oooo0.OooO0O0(C26320o0000OoO.class), new OooO00o(), new OooO0OO(), new OooO0O0());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C30926OooOOo OooOoOO() {
        return (C30926OooOOo) this.f79669OooOoo0.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        OooOOO0.OooO0oO(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_vip_restrict_dialog, viewGroup, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Window window;
        Window window2;
        String string;
        String string2;
        C32443OooOOO c32443OooOOO;
        C32443OooOOO c32443OooOOO2;
        Window window3;
        Window window4;
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setCancelable(false);
        }
        int i = getResources().getConfiguration().screenWidthDp;
        if (i < 480) {
            Dialog dialog2 = getDialog();
            if (dialog2 != null && (window4 = dialog2.getWindow()) != null) {
                window4.setLayout(o000000O.OooO0o(StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_6), -2);
            }
        } else if (i < 600) {
            Dialog dialog3 = getDialog();
            if (dialog3 != null && (window2 = dialog3.getWindow()) != null) {
                window2.setLayout(o000000O.OooO0o(400), -2);
            }
        } else {
            Dialog dialog4 = getDialog();
            if (dialog4 != null && (window = dialog4.getWindow()) != null) {
                window.setLayout(o000000O.OooO0o(500), -2);
            }
        }
        Dialog dialog5 = getDialog();
        if (dialog5 != null && (window3 = dialog5.getWindow()) != null) {
            window3.setBackgroundDrawableResource(android.R.color.transparent);
        }
        this.f79668OooOoo = (ImageView) view.findViewById(R.id.iv_feature);
        this.f79670OooOooO = (ProgressBar) view.findViewById(R.id.iv_progress);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.cl_feature_content);
        OooOOO0.OooO0Oo(viewGroup);
        viewGroup.setVisibility(!OooOoOO().f110501OooO0O0 ? 0 : 8);
        View viewFindViewById = view.findViewById(R.id.v_bottom_padding);
        OooOOO0.OooO0Oo(viewFindViewById);
        viewFindViewById.setVisibility(OooOoOO().f110501OooO0O0 ? 8 : 0);
        TextView textView = (TextView) view.findViewById(R.id.tv_title);
        switch (OooOoOO().f110500OooO00o) {
            case 0:
                string = getString(R.string.promotion_title_translate);
                OooOOO0.OooO0Oo(string);
                break;
            case 1:
                string = getString(R.string.promotion_title_my_template);
                OooOOO0.OooO0Oo(string);
                break;
            case 2:
                string = getString(R.string.promotion_title_eye_dropper);
                OooOOO0.OooO0Oo(string);
                break;
            case 3:
                string = getString(R.string.promotion_title_laser_pen);
                OooOOO0.OooO0Oo(string);
                break;
            case 4:
                string = getString(R.string.promotion_title_shape_pen);
                OooOOO0.OooO0Oo(string);
                break;
            case 5:
                string = getString(R.string.promotion_title_page_copy_and_cut);
                OooOOO0.OooO0Oo(string);
                break;
            case 6:
                string = getString(R.string.promotion_title_page_copy_and_cut);
                OooOOO0.OooO0Oo(string);
                break;
            case 7:
                string = getString(R.string.promotion_title_import_font);
                OooOOO0.OooO0Oo(string);
                break;
            case 8:
                string = getString(R.string.promotion_title_custom_sort);
                OooOOO0.OooO0Oo(string);
                break;
            case 9:
                string = getString(R.string.promotion_title_data_sync);
                OooOOO0.OooO0Oo(string);
                break;
            case 10:
                string = getString(R.string.promotion_title_favorite_pens);
                OooOOO0.OooO0Oo(string);
                break;
            case 11:
                string = getString(R.string.promotion_title_dual_link);
                OooOOO0.OooO0Oo(string);
                break;
            case 12:
                string = getString(R.string.promotion_title_unbounded_note);
                OooOOO0.OooO0Oo(string);
                break;
            default:
                string = "会员功能";
                break;
        }
        textView.setText(string);
        TextView textView2 = (TextView) view.findViewById(R.id.tv_content);
        switch (OooOoOO().f110500OooO00o) {
            case 0:
                string2 = getString(R.string.promotion_content_translate);
                OooOOO0.OooO0Oo(string2);
                break;
            case 1:
                string2 = getString(R.string.promotion_content_my_template);
                OooOOO0.OooO0Oo(string2);
                break;
            case 2:
                string2 = getString(R.string.promotion_content_eye_dropper);
                OooOOO0.OooO0Oo(string2);
                break;
            case 3:
                string2 = getString(R.string.promotion_content_laser_pen);
                OooOOO0.OooO0Oo(string2);
                break;
            case 4:
                string2 = getString(R.string.promotion_content_shape_pen);
                OooOOO0.OooO0Oo(string2);
                break;
            case 5:
                string2 = getString(R.string.promotion_content_page_copy_and_cut);
                OooOOO0.OooO0Oo(string2);
                break;
            case 6:
                string2 = getString(R.string.promotion_content_page_copy_and_cut);
                OooOOO0.OooO0Oo(string2);
                break;
            case 7:
                string2 = getString(R.string.promotion_content_import_font);
                OooOOO0.OooO0Oo(string2);
                break;
            case 8:
                string2 = getString(R.string.promotion_content_custom_sort);
                OooOOO0.OooO0Oo(string2);
                break;
            case 9:
                string2 = getString(R.string.promotion_content_data_sync);
                OooOOO0.OooO0Oo(string2);
                break;
            case 10:
                string2 = getString(R.string.promotion_content_favorite_pens);
                OooOOO0.OooO0Oo(string2);
                break;
            case 11:
                string2 = getString(R.string.promotion_content_dual_link);
                OooOOO0.OooO0Oo(string2);
                break;
            case 12:
                string2 = getString(R.string.promotion_content_unbounded_note);
                OooOOO0.OooO0Oo(string2);
                break;
            default:
                string2 = getString(R.string.vip_promotional);
                OooOOO0.OooO0Oo(string2);
                break;
        }
        textView2.setText(string2);
        view.findViewById(R.id.btn_close).setOnClickListener(new ViewOnClickListenerC28141OooO0oO(this, 6));
        ((TextView) view.findViewById(R.id.btn_upgrade)).setOnClickListener(new OooOO0O(this, 5));
        ((TextView) view.findViewById(R.id.btn_vip_feature_cmp)).setOnClickListener(new ViewOnClickListenerC28142OooO0oo(this, 5));
        if (OooOoOO().f110501OooO0O0) {
            StorageReference reference = StorageKt.getStorage(Firebase.INSTANCE).getReference();
            OooOOO0.OooO0o(reference, "getReference(...)");
            int i2 = OooOoOO().f110500OooO00o;
            if (i2 == 1) {
                c32443OooOOO2 = new C32443OooOOO(reference.child("anim/guide_feature_outlines_v2.gif"), Integer.valueOf(R.drawable.guide_feature_outlines_placeholder));
            } else if (i2 == 2) {
                c32443OooOOO2 = new C32443OooOOO(reference.child("anim/guide_feature_annotations_v2.gif"), Integer.valueOf(R.drawable.guide_feature_annotations_placeholder));
            } else if (i2 == 9) {
                c32443OooOOO2 = new C32443OooOOO(reference.child("anim/guide_feature_in_app_split_screen_v2.gif"), Integer.valueOf(R.drawable.guide_feature_in_app_split_screen_placeholder));
            } else if (i2 != 10) {
                switch (i2) {
                    case 12:
                        c32443OooOOO2 = new C32443OooOOO(reference.child("anim/guide_feature_bidi_links_v2.gif"), Integer.valueOf(R.drawable.guide_feature_bidi_links_placeholder));
                        break;
                    case 13:
                        c32443OooOOO2 = new C32443OooOOO(reference.child("anim/guide_feature_movable_toolbox_v2.gif"), Integer.valueOf(R.drawable.guide_feature_movable_toolbox_placeholder));
                        break;
                    case 14:
                        c32443OooOOO2 = new C32443OooOOO(reference.child("anim/guide_feature_adaptive_stroke_width_v2.gif"), Integer.valueOf(R.drawable.guide_feature_adaptive_stroke_width_placeholder));
                        break;
                    case 15:
                        c32443OooOOO2 = new C32443OooOOO(reference.child("anim/guide_feature_favorite_toolbox_v2.gif"), Integer.valueOf(R.drawable.guide_feature_favorite_toolbox_placeholder));
                        break;
                    case 16:
                        c32443OooOOO2 = new C32443OooOOO(reference.child("anim/guide_feature_auto_shape.gif"), Integer.valueOf(R.drawable.guide_feature_auto_shape_placeholder));
                        break;
                    default:
                        c32443OooOOO2 = null;
                        break;
                }
            } else {
                String BRAND = Build.BRAND;
                OooOOO0.OooO0o(BRAND, "BRAND");
                c32443OooOOO2 = (C33599OooOo0O.OooOoOO(BRAND, "HUAWEI", true) || C33599OooOo0O.OooOoOO(BRAND, "HONOR", true)) ? new C32443OooOOO(reference.child("anim/guide_feature_data_sync_huawei_v2.gif"), Integer.valueOf(R.drawable.guide_feature_data_sync_huawei_placeholder)) : new C32443OooOOO(reference.child("anim/guide_feature_data_sync_no_huawei_v2.gif"), Integer.valueOf(R.drawable.guide_feature_data_sync_no_huawei_placeholder));
            }
            if (c32443OooOOO2 == null) {
                return;
            }
            A a = c32443OooOOO2.f116638OooOo0o;
            OooOOO0.OooO0o(a, "component1(...)");
            C22253OooOO0o c22253OooOO0oOooO0OO = com.bumptech.glide.OooO0OO.OooO0O0(getContext()).OooO0Oo(this).OooOO0((StorageReference) a).OoooO(new C30927OooOOo0(this)).OooOo0(((Number) c32443OooOOO2.f116637OooOo).intValue()).OooO0OO();
            ImageView imageView = this.f79668OooOoo;
            if (imageView != null) {
                c22253OooOO0oOooO0OO.OoooO0(imageView);
                return;
            } else {
                OooOOO0.OooOOOO("featureImage");
                throw null;
            }
        }
        StorageReference reference2 = StorageKt.getStorage(Firebase.INSTANCE).getReference();
        OooOOO0.OooO0o(reference2, "getReference(...)");
        switch (OooOoOO().f110500OooO00o) {
            case 0:
                c32443OooOOO = new C32443OooOOO(reference2.child("anim/vip_feature_translate.webp"), Integer.valueOf(R.drawable.vip_feature_translate_placeholder));
                break;
            case 1:
                c32443OooOOO = new C32443OooOOO(reference2.child("anim/vip_feature_my_template.webp"), Integer.valueOf(R.drawable.vip_feature_my_template_placeholder));
                break;
            case 2:
                c32443OooOOO = new C32443OooOOO(reference2.child("anim/vip_feature_eye_dropper.webp"), Integer.valueOf(R.drawable.vip_feature_eye_dropper_placeholder));
                break;
            case 3:
                c32443OooOOO = new C32443OooOOO(reference2.child("anim/vip_feature_laser_pen.webp"), Integer.valueOf(R.drawable.vip_feature_laser_pen_placeholder));
                break;
            case 4:
                c32443OooOOO = new C32443OooOOO(reference2.child("anim/vip_feature_shape_pen.webp"), Integer.valueOf(R.drawable.vip_feature_shape_pen_placeholder));
                break;
            case 5:
                c32443OooOOO = new C32443OooOOO(reference2.child("anim/vip_feature_page_copy.webp"), Integer.valueOf(R.drawable.vip_feature_page_copy_placeholder));
                break;
            case 6:
                c32443OooOOO = new C32443OooOOO(reference2.child("anim/vip_feature_page_save_as.webp"), Integer.valueOf(R.drawable.vip_feature_page_save_as_placeholder));
                break;
            case 7:
                c32443OooOOO = new C32443OooOOO(reference2.child("anim/vip_feature_font.webp"), Integer.valueOf(R.drawable.vip_feature_font_placeholder));
                break;
            case 8:
                c32443OooOOO = new C32443OooOOO(reference2.child("anim/vip_feature_custom_sort.webp"), Integer.valueOf(R.drawable.vip_feature_custom_sort_placeholder));
                break;
            case 9:
                c32443OooOOO = new C32443OooOOO(reference2.child("anim/vip_feature_data_sync.webp"), Integer.valueOf(R.drawable.vip_feature_data_sync_placeholder));
                break;
            case 10:
                c32443OooOOO = new C32443OooOOO(reference2.child("anim/vip_feature_favorite_pens.webp"), Integer.valueOf(R.drawable.vip_feature_data_sync_placeholder));
                break;
            case 11:
                c32443OooOOO = new C32443OooOOO(reference2.child("anim/vip_feature_dual_link.webp"), Integer.valueOf(R.drawable.vip_feature_dual_link_placeholder));
                break;
            case 12:
                c32443OooOOO = new C32443OooOOO(reference2.child("anim/vip_feature_unbounded_note.webp"), Integer.valueOf(R.drawable.vip_feature_unbounded_note_placeholder));
                break;
            default:
                c32443OooOOO = null;
                break;
        }
        if (c32443OooOOO == null) {
            return;
        }
        A a2 = c32443OooOOO.f116638OooOo0o;
        OooOOO0.OooO0o(a2, "component1(...)");
        int iIntValue = ((Number) c32443OooOOO.f116637OooOo).intValue();
        C25227OooOoO c25227OooOoO = new C25227OooOoO(o000000O.OooO0o(9));
        C25291OooO0oO c25291OooO0oOOooo00O = new C25291OooO0oO().Oooo00O(c25227OooOoO, false);
        OooOOO0.OooO0o(c25291OooO0oOOooo00O, "optionalTransform(...)");
        C22253OooOO0o<Drawable> c22253OooOO0oOooO00o = com.bumptech.glide.OooO0OO.OooO0Oo(requireContext()).OooO(Integer.valueOf(iIntValue)).OooO00o(c25291OooO0oOOooo00O);
        OooOOO0.OooO0o(c22253OooOO0oOooO00o, "apply(...)");
        C22253OooOO0o c22253OooOO0oOooooO0 = com.bumptech.glide.OooO0OO.OooO0O0(getContext()).OooO0Oo(this).OooOO0((StorageReference) a2).OoooO(new C30925OooOOOo(this)).OooOOo(c25227OooOoO).OooooO0(OooOo.OooO0oO(c22253OooOO0oOooO00o));
        ImageView imageView2 = this.f79668OooOoo;
        if (imageView2 != null) {
            c22253OooOO0oOooooO0.OoooO0(imageView2);
        } else {
            OooOOO0.OooOOOO("featureImage");
            throw null;
        }
    }
}
