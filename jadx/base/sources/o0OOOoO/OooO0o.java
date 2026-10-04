package o0OOOoO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.google.android.material.card.MaterialCardView;
import com.orion.niui.components.button.TextButtonView;
import com.orion.notein.global.R;
import o0000OOo.C24217OooO0O0;

/* JADX INFO: loaded from: classes9.dex */
public final class OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ConstraintLayout f94947OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final TextButtonView f94948OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final MaterialCardView f94949OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ImageView f94950OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final TextView f94951OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final TextView f94952OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final ConstraintLayout f94953OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final TextView f94954OooO0oo;

    public OooO0o(ConstraintLayout constraintLayout, TextButtonView textButtonView, MaterialCardView materialCardView, ImageView imageView, TextView textView, TextView textView2, ConstraintLayout constraintLayout2, TextView textView3) {
        this.f94947OooO00o = constraintLayout;
        this.f94948OooO0O0 = textButtonView;
        this.f94949OooO0OO = materialCardView;
        this.f94950OooO0Oo = imageView;
        this.f94952OooO0o0 = textView;
        this.f94951OooO0o = textView2;
        this.f94953OooO0oO = constraintLayout2;
        this.f94954OooO0oo = textView3;
    }

    public static OooO0o OooO00o(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.item_creative_material, viewGroup, false);
        int i = R.id.btn_action;
        TextButtonView textButtonView = (TextButtonView) C24217OooO0O0.OooO0O0(R.id.btn_action, viewInflate);
        if (textButtonView != null) {
            i = R.id.card_container;
            MaterialCardView materialCardView = (MaterialCardView) C24217OooO0O0.OooO0O0(R.id.card_container, viewInflate);
            if (materialCardView != null) {
                i = R.id.cover_container;
                if (((ConstraintLayout) C24217OooO0O0.OooO0O0(R.id.cover_container, viewInflate)) != null) {
                    i = R.id.guide_cover_bottom;
                    if (((Guideline) C24217OooO0O0.OooO0O0(R.id.guide_cover_bottom, viewInflate)) != null) {
                        i = R.id.info_container;
                        if (((ConstraintLayout) C24217OooO0O0.OooO0O0(R.id.info_container, viewInflate)) != null) {
                            i = R.id.iv_cover;
                            ImageView imageView = (ImageView) C24217OooO0O0.OooO0O0(R.id.iv_cover, viewInflate);
                            if (imageView != null) {
                                i = R.id.tv_desc;
                                TextView textView = (TextView) C24217OooO0O0.OooO0O0(R.id.tv_desc, viewInflate);
                                if (textView != null) {
                                    i = R.id.tv_title;
                                    TextView textView2 = (TextView) C24217OooO0O0.OooO0O0(R.id.tv_title, viewInflate);
                                    if (textView2 != null) {
                                        i = R.id.vip_badge;
                                        ConstraintLayout constraintLayout = (ConstraintLayout) C24217OooO0O0.OooO0O0(R.id.vip_badge, viewInflate);
                                        if (constraintLayout != null) {
                                            i = R.id.vip_feature_icon;
                                            if (((ImageView) C24217OooO0O0.OooO0O0(R.id.vip_feature_icon, viewInflate)) != null) {
                                                i = R.id.vip_feature_text;
                                                TextView textView3 = (TextView) C24217OooO0O0.OooO0O0(R.id.vip_feature_text, viewInflate);
                                                if (textView3 != null) {
                                                    return new OooO0o((ConstraintLayout) viewInflate, textButtonView, materialCardView, imageView, textView, textView2, constraintLayout, textView3);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
