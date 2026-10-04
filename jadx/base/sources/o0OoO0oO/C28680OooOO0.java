package o0OoO0oO;

import Oooo0.o000000O;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.widget.ImageViewCompat;
import androidx.recyclerview.widget.AbstractC22050OooOo0o;
import androidx.recyclerview.widget.OooOOO;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.domain.models.page.PaperOrientation;
import com.orion.notein.domain.models.papertheme.LambdaPaperTheme;
import com.orion.notein.domain.models.papertheme.LocalResPaperTheme;
import com.orion.notein.domain.models.papertheme.PaperTheme;
import com.orion.notein.domain.models.papertheme.paperstyle.NonePaperStyle;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.p609vo.ThemeVO;
import java.util.List;
import o0Oo00o.C28025OooO0O0;
import o0Oo0O0.C28050OooO0OO;
import o0Oo0o00.ViewOnClickListenerC28181Oooo00O;
import o0Oo0o00.ViewOnClickListenerC28182Oooo00o;
import o0Oo0o0o.C28264OoooO0O;
import o0OoO0oO.C28680OooOO0;
import oO00ooO.C32443OooOOO;
import oOO00oo.C34406OooO00o;
import org.json.JSONException;

/* JADX INFO: renamed from: o0OoO0oO.OooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28680OooOO0 extends AbstractC22050OooOo0o<ThemeVO, RecyclerView.AbstractC22078OooOooO> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public View.OnClickListener f101627OooO0O0;

    /* JADX INFO: renamed from: o0OoO0oO.OooOO0$OooO00o */
    public final class OooO00o extends RecyclerView.AbstractC22078OooOooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final View f101628OooO00o;

        public OooO00o(C28680OooOO0 c28680OooOO0, View view) {
            super(view);
            View btnAdd = view.findViewById(R.id.btn_add_page);
            this.f101628OooO00o = btnAdd;
            kotlin.jvm.internal.OooOOO0.OooO0o(btnAdd, "btnAdd");
            C28050OooO0OO.OooO00o(btnAdd, 1000L, new ViewOnClickListenerC28671OooO(c28680OooOO0, 0));
        }
    }

    /* JADX INFO: renamed from: o0OoO0oO.OooOO0$OooO0O0 */
    public static final class OooO0O0 extends OooOOO.AbstractC22036OooO0o0<ThemeVO> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO0O0 f101629OooO00o = new OooO0O0();

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO00o(ThemeVO themeVO, ThemeVO themeVO2) {
            return themeVO.equals(themeVO2);
        }

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO0O0(ThemeVO themeVO, ThemeVO themeVO2) {
            ThemeVO themeVO3 = themeVO;
            ThemeVO themeVO4 = themeVO2;
            return kotlin.jvm.internal.OooOOO0.OooO0O0(themeVO3.getPaperTheme(), themeVO4.getPaperTheme()) && kotlin.jvm.internal.OooOOO0.OooO0O0(themeVO3.getMyTemplateId(), themeVO4.getMyTemplateId());
        }

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final Object OooO0OO(ThemeVO themeVO, ThemeVO themeVO2) {
            boolean z;
            ThemeVO themeVO3 = themeVO;
            ThemeVO themeVO4 = themeVO2;
            Bundle bundle = new Bundle();
            if (!kotlin.jvm.internal.OooOOO0.OooO0O0(themeVO4.getPaperTheme(), themeVO3.getPaperTheme())) {
                return null;
            }
            boolean z2 = true;
            if (themeVO4.getSelected() != themeVO3.getSelected()) {
                bundle.putBoolean("selected", themeVO4.getSelected());
                z = true;
            } else {
                z = false;
            }
            if (themeVO4.getAvailableFromLocal() != themeVO3.getAvailableFromLocal() || themeVO4.getDownloading() != themeVO3.getDownloading()) {
                bundle.putSerializable("download", new C32443OooOOO(Boolean.valueOf(themeVO4.getAvailableFromLocal()), Boolean.valueOf(themeVO4.getDownloading())));
                z = true;
            }
            if (themeVO4.isStar() != themeVO3.isStar()) {
                bundle.putBoolean("isStar", themeVO4.isStar());
            } else {
                z2 = z;
            }
            if (themeVO4.isStarVisible() != themeVO3.isStarVisible()) {
                bundle.putBoolean("isStarVisible", themeVO4.isStarVisible());
            }
            if (z2) {
                return bundle;
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: o0OoO0oO.OooOO0$OooO0OO */
    public final class OooO0OO extends RecyclerView.AbstractC22078OooOooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final View f101630OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final ImageView f101631OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final View f101632OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final TextView f101633OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final ImageView f101634OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final ImageView f101635OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final View f101636OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final ImageView f101637OooO0oo;

        public OooO0OO(C28680OooOO0 c28680OooOO0, final View view) {
            super(view);
            this.f101630OooO00o = view.findViewById(R.id.cover_wrapper);
            this.f101631OooO0O0 = (ImageView) view.findViewById(R.id.theme_img);
            View viewFindViewById = view.findViewById(R.id.theme_selected);
            kotlin.jvm.internal.OooOOO0.OooO0o(viewFindViewById, "findViewById(...)");
            this.f101632OooO0OO = viewFindViewById;
            this.f101633OooO0Oo = (TextView) view.findViewById(R.id.theme_name);
            View viewFindViewById2 = view.findViewById(R.id.more);
            kotlin.jvm.internal.OooOOO0.OooO0o(viewFindViewById2, "findViewById(...)");
            ImageView imageView = (ImageView) viewFindViewById2;
            this.f101635OooO0o0 = imageView;
            this.f101634OooO0o = (ImageView) view.findViewById(R.id.btn_download);
            this.f101636OooO0oO = view.findViewById(R.id.v_download_mask);
            ImageView imageView2 = (ImageView) view.findViewById(R.id.iv_star);
            this.f101637OooO0oo = imageView2;
            C28025OooO0O0.OooO00o(view);
            view.setOnClickListener(new ViewOnClickListenerC28681OooOO0O(c28680OooOO0, 0));
            view.setOnContextClickListener(new ViewOnContextClickListenerC28682OooOO0o());
            view.setOnHoverListener(new View.OnHoverListener() { // from class: o0OoO0oO.OooOOO0
                @Override // android.view.View.OnHoverListener
                public final boolean onHover(View view2, MotionEvent motionEvent) {
                    int action = motionEvent.getAction();
                    C28680OooOO0.OooO0OO oooO0OO = this.f101640OooO00o;
                    if (action == 9) {
                        oooO0OO.f101630OooO00o.setTranslationZ(view.getContext().getResources().getDimensionPixelSize(R.dimen.default_hovered_translation_z));
                        View view3 = oooO0OO.f101630OooO00o;
                        view3.setScaleX(1.01f);
                        view3.setScaleY(1.01f);
                        return false;
                    }
                    if (motionEvent.getAction() != 10) {
                        return false;
                    }
                    oooO0OO.f101630OooO00o.setTranslationZ(0.0f);
                    View view4 = oooO0OO.f101630OooO00o;
                    view4.setScaleX(1.0f);
                    view4.setScaleY(1.0f);
                    return false;
                }
            });
            imageView.setOnClickListener(new ViewOnClickListenerC28181Oooo00O(c28680OooOO0, 1));
            imageView2.setOnClickListener(new ViewOnClickListenerC28182Oooo00o(c28680OooOO0, 1));
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void OooO00o(ThemeVO themeVO) {
            int iIntValue;
            int iIntValue2;
            PaperTheme paperTheme;
            this.itemView.setTag(themeVO);
            ImageView imageView = this.f101635OooO0o0;
            imageView.setTag(themeVO);
            ImageView ivStar = this.f101637OooO0oo;
            ivStar.setTag(themeVO);
            this.f101632OooO0OO.setVisibility(themeVO.getSelected() ? 0 : 8);
            Context context = this.itemView.getContext();
            kotlin.jvm.internal.OooOOO0.OooO0o(context, "getContext(...)");
            this.f101633OooO0Oo.setText(themeVO.getName(context));
            PaperTheme paperTheme2 = themeVO.getPaperTheme();
            boolean z = paperTheme2 instanceof LocalResPaperTheme;
            ImageView imageView2 = this.f101631OooO0O0;
            if (z) {
                Context context2 = imageView2.getContext();
                kotlin.jvm.internal.OooOOO0.OooO0o(context2, "getContext(...)");
                imageView2.setImageResource(((LocalResPaperTheme) paperTheme2).getTnResourceId(context2));
            } else {
                if (themeVO.getWidth() == -1 || themeVO.getHeight() == -1) {
                    C32443OooOOO c32443OooOOO = paperTheme2.getOrientation() == PaperOrientation.VERTICAL ? new C32443OooOOO(Integer.valueOf(o000000O.OooO0o(93)), Integer.valueOf(o000000O.OooO0o(130))) : new C32443OooOOO(Integer.valueOf(o000000O.OooO0o(130)), Integer.valueOf(o000000O.OooO0o(93)));
                    iIntValue = ((Number) c32443OooOOO.f116638OooOo0o).intValue();
                    iIntValue2 = ((Number) c32443OooOOO.f116637OooOo).intValue();
                } else {
                    iIntValue = themeVO.getWidth();
                    iIntValue2 = themeVO.getHeight();
                }
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iIntValue, iIntValue2, Bitmap.Config.ARGB_8888);
                if (!(themeVO.getPaperTheme() instanceof LambdaPaperTheme)) {
                    paperTheme = themeVO.getPaperTheme();
                } else if (((LambdaPaperTheme) themeVO.getPaperTheme()).getPaperStyle() instanceof NonePaperStyle) {
                    LambdaPaperTheme lambdaPaperTheme = (LambdaPaperTheme) themeVO.getPaperTheme();
                    Context context3 = this.itemView.getContext();
                    kotlin.jvm.internal.OooOOO0.OooO0o(context3, "getContext(...)");
                    LambdaPaperTheme lambdaPaperThemeOooO00o = C28264OoooO0O.OooO00o(lambdaPaperTheme, context3);
                    Context context4 = this.itemView.getContext();
                    kotlin.jvm.internal.OooOOO0.OooO0o(context4, "getContext(...)");
                    paperTheme = C28264OoooO0O.OooO0O0(lambdaPaperThemeOooO00o, context4);
                } else {
                    paperTheme = (LambdaPaperTheme) themeVO.getPaperTheme();
                }
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                Context context5 = this.itemView.getContext();
                kotlin.jvm.internal.OooOOO0.OooO0o(context5, "getContext(...)");
                paperTheme.drawPaperBg(canvas, context5);
                imageView2.setImageBitmap(bitmapCreateBitmap);
                kotlin.jvm.internal.OooOOO0.OooO0Oo(bitmapCreateBitmap);
            }
            imageView.setVisibility(8);
            View view = this.f101636OooO0oO;
            if (view != null) {
                view.setVisibility(!themeVO.getAvailableFromLocal() ? 0 : 8);
            }
            ImageView imageView3 = this.f101634OooO0o;
            if (imageView3 != null) {
                imageView3.setVisibility(!themeVO.getAvailableFromLocal() ? 0 : 8);
            }
            ImageViewCompat.setImageTintList(imageView3, ColorStateList.valueOf(ContextCompat.getColor(imageView3.getContext(), R.color.theme_icon_tint_color)));
            if (imageView3.getVisibility() == 0 && themeVO.getDownloading()) {
                imageView3.setImageResource(R.mipmap.bg_rotate);
                Animation animationLoadAnimation = AnimationUtils.loadAnimation(this.itemView.getContext(), R.anim.rotate_loop);
                kotlin.jvm.internal.OooOOO0.OooO0o(animationLoadAnimation, "loadAnimation(...)");
                imageView3.startAnimation(animationLoadAnimation);
            } else {
                imageView3.setImageResource(R.drawable.ic_ni_download_arrow);
                imageView3.clearAnimation();
            }
            C34406OooO00o.f123390OooO00o.OooO00o("isStarVisible: " + themeVO.isStarVisible() + ", isStar: " + themeVO.isStar(), new Object[0]);
            kotlin.jvm.internal.OooOOO0.OooO0o(ivStar, "ivStar");
            ivStar.setVisibility(themeVO.isStarVisible() ? 0 : 8);
            boolean zIsStar = themeVO.isStar();
            ivStar.setSelected(zIsStar);
            if (zIsStar) {
                ImageViewCompat.setImageTintList(ivStar, null);
            } else {
                ImageViewCompat.setImageTintList(ivStar, ColorStateList.valueOf(ContextCompat.getColor(ivStar.getContext(), R.color.theme_icon_tint_color)));
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final int getItemViewType(int i) {
        return OooO0OO(i).getOrientation() == PaperOrientation.VERTICAL ? 0 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO holder, int i) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(holder, "holder");
        ThemeVO themeVOOooO0OO = OooO0OO(i);
        kotlin.jvm.internal.OooOOO0.OooO0o(themeVOOooO0OO, "getItem(...)");
        ((OooO0OO) holder).OooO00o(themeVOOooO0OO);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final RecyclerView.AbstractC22078OooOooO onCreateViewHolder(ViewGroup parent, int i) throws JSONException {
        kotlin.jvm.internal.OooOOO0.OooO0oO(parent, "parent");
        if (i == 0) {
            View viewOooO0O0 = com.aspose.slides.internal.p332p7.OooO0OO.OooO0O0(parent, R.layout.item_note_creation_theme_v, parent, false);
            kotlin.jvm.internal.OooOOO0.OooO0Oo(viewOooO0O0);
            return new OooO0OO(this, viewOooO0O0);
        }
        if (i != 1) {
            View viewOooO0O02 = com.aspose.slides.internal.p332p7.OooO0OO.OooO0O0(parent, R.layout.item_add_custom_theme, parent, false);
            kotlin.jvm.internal.OooOOO0.OooO0Oo(viewOooO0O02);
            return new OooO00o(this, viewOooO0O02);
        }
        View viewOooO0O03 = com.aspose.slides.internal.p332p7.OooO0OO.OooO0O0(parent, R.layout.item_note_creation_theme_h, parent, false);
        kotlin.jvm.internal.OooOOO0.OooO0Oo(viewOooO0O03);
        return new OooO0OO(this, viewOooO0O03);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO holder, int i, List<Object> payloads) {
        boolean z;
        kotlin.jvm.internal.OooOOO0.OooO0oO(holder, "holder");
        kotlin.jvm.internal.OooOOO0.OooO0oO(payloads, "payloads");
        if (!payloads.isEmpty()) {
            Object obj = payloads.get(0);
            kotlin.jvm.internal.OooOOO0.OooO0o0(obj, "null cannot be cast to non-null type android.os.Bundle");
            Bundle bundle = (Bundle) obj;
            ThemeVO themeVOOooO0OO = OooO0OO(i);
            boolean z2 = true;
            if (bundle.containsKey("selected")) {
                ((OooO0OO) holder).f101632OooO0OO.setVisibility(themeVOOooO0OO.getSelected() ? 0 : 8);
                z = true;
            } else {
                z = false;
            }
            if (bundle.containsKey("download")) {
                kotlin.jvm.internal.OooOOO0.OooO0Oo(themeVOOooO0OO);
                ((OooO0OO) holder).OooO00o(themeVOOooO0OO);
                z = true;
            }
            if (bundle.containsKey("isStarVisible")) {
                boolean zIsStarVisible = themeVOOooO0OO.isStarVisible();
                ImageView ivStar = ((OooO0OO) holder).f101637OooO0oo;
                kotlin.jvm.internal.OooOOO0.OooO0o(ivStar, "ivStar");
                ivStar.setVisibility(zIsStarVisible ? 0 : 8);
                z = true;
            }
            if (bundle.containsKey("isStar")) {
                boolean zIsStar = themeVOOooO0OO.isStar();
                ImageView imageView = ((OooO0OO) holder).f101637OooO0oo;
                imageView.setSelected(zIsStar);
                if (zIsStar) {
                    ImageViewCompat.setImageTintList(imageView, null);
                } else {
                    ImageViewCompat.setImageTintList(imageView, ColorStateList.valueOf(ContextCompat.getColor(imageView.getContext(), R.color.theme_icon_tint_color)));
                }
            } else {
                z2 = z;
            }
            OooO0OO oooO0OO = (OooO0OO) holder;
            kotlin.jvm.internal.OooOOO0.OooO0Oo(themeVOOooO0OO);
            oooO0OO.itemView.setTag(themeVOOooO0OO);
            oooO0OO.f101635OooO0o0.setTag(themeVOOooO0OO);
            oooO0OO.f101637OooO0oo.setTag(themeVOOooO0OO);
            if (z2) {
                return;
            }
        }
        super.onBindViewHolder(holder, i, payloads);
    }
}
