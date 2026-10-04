package o0o0OOO;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.widget.ImageViewCompat;
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
import o0Oo0Ooo.ViewOnClickListenerC28134OooO;
import o0Oo0o0o.C28264OoooO0O;
import o0Oo0ooO.ViewOnClickListenerC28428OooOo0O;
import o0o0OOO.C30465OooO0oo;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34434OooOoO;
import org.json.JSONException;

/* JADX INFO: renamed from: o0o0OOO.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30465OooO0oo extends RecyclerView.AbstractC22062OooO0oO<RecyclerView.AbstractC22078OooOooO> {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f108790OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public View.OnClickListener f108791OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public InterfaceC32508OooOOOo<? super View, ? super ThemeVO, C32460OooOooO> f108792OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public InterfaceC32507OooOO0o<? super ThemeVO, C32460OooOooO> f108793OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public C30471OooOOOO f108794OooO0oO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f108788OooO00o = true;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f108789OooO0O0 = true;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public List<ThemeVO> f108795OooO0oo = C34434OooOoO.f123453OooOo0o;

    /* JADX INFO: renamed from: o0o0OOO.OooO0oo$OooO00o */
    public final class OooO00o extends RecyclerView.AbstractC22078OooOooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ImageView f108796OooO00o;

        public OooO00o(View view) {
            super(view);
            this.f108796OooO00o = (ImageView) view.findViewById(R.id.btn_add);
        }
    }

    /* JADX INFO: renamed from: o0o0OOO.OooO0oo$OooO0O0 */
    public final class OooO0O0 extends RecyclerView.AbstractC22078OooOooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final View f108798OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final ImageView f108799OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final TextView f108800OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final ImageView f108801OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final ImageView f108803OooO0o0;

        public OooO0O0(final View view) {
            super(view);
            this.f108798OooO00o = view.findViewById(R.id.cover_wrapper);
            this.f108799OooO0O0 = (ImageView) view.findViewById(R.id.theme_img);
            this.f108800OooO0OO = (TextView) view.findViewById(R.id.theme_name);
            this.f108801OooO0Oo = (ImageView) view.findViewById(R.id.iv_star);
            this.f108803OooO0o0 = (ImageView) view.findViewById(R.id.iv_more);
            C28025OooO0O0.OooO00o(view);
            view.setOnClickListener(new ViewOnClickListenerC28134OooO(C30465OooO0oo.this, 4));
            view.setOnHoverListener(new View.OnHoverListener() { // from class: o0o0OOO.OooO
                @Override // android.view.View.OnHoverListener
                public final boolean onHover(View view2, MotionEvent motionEvent) {
                    int action = motionEvent.getAction();
                    C30465OooO0oo.OooO0O0 oooO0O0 = this.f108762OooO00o;
                    if (action == 9) {
                        oooO0O0.f108798OooO00o.setTranslationZ(view.getContext().getResources().getDimensionPixelSize(R.dimen.default_hovered_translation_z));
                        View view3 = oooO0O0.f108798OooO00o;
                        view3.setScaleX(1.01f);
                        view3.setScaleY(1.01f);
                        return false;
                    }
                    if (motionEvent.getAction() != 10) {
                        return false;
                    }
                    oooO0O0.f108798OooO00o.setTranslationZ(0.0f);
                    View view4 = oooO0O0.f108798OooO00o;
                    view4.setScaleX(1.0f);
                    view4.setScaleY(1.0f);
                    return false;
                }
            });
        }
    }

    public C30465OooO0oo(boolean z) {
        this.f108790OooO0OO = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final int getItemCount() {
        int size = this.f108795OooO0oo.size();
        return this.f108790OooO0OO ? size + 1 : size;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final int getItemViewType(int i) {
        return (this.f108790OooO0OO && i == 0) ? 1 : 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO holder, int i) {
        int iIntValue;
        int iIntValue2;
        PaperTheme paperTheme;
        kotlin.jvm.internal.OooOOO0.OooO0oO(holder, "holder");
        boolean z = this.f108790OooO0OO;
        if (z && i == 0) {
            OooO00o oooO00o = (OooO00o) holder;
            oooO00o.f108796OooO00o.setOnClickListener(new com.google.android.material.search.OooOOO0(C30465OooO0oo.this, 4));
            View itemView = oooO00o.itemView;
            kotlin.jvm.internal.OooOOO0.OooO0o(itemView, "itemView");
            C28025OooO0O0.OooO00o(itemView);
            return;
        }
        if (z) {
            i--;
        }
        final OooO0O0 oooO0O0 = (OooO0O0) holder;
        final ThemeVO item = this.f108795OooO0oo.get(i);
        kotlin.jvm.internal.OooOOO0.OooO0oO(item, "item");
        oooO0O0.itemView.setTag(item);
        Drawable drawable = item.getSelected() ? ContextCompat.getDrawable(oooO0O0.itemView.getContext(), R.drawable.paper_config_theme_selected_foreground) : null;
        ImageView imageView = oooO0O0.f108799OooO0O0;
        imageView.setForeground(drawable);
        Context context = oooO0O0.itemView.getContext();
        kotlin.jvm.internal.OooOOO0.OooO0o(context, "getContext(...)");
        oooO0O0.f108800OooO0OO.setText(item.getName(context));
        PaperTheme paperTheme2 = item.getPaperTheme();
        if (paperTheme2 instanceof LocalResPaperTheme) {
            Context context2 = imageView.getContext();
            kotlin.jvm.internal.OooOOO0.OooO0o(context2, "getContext(...)");
            imageView.setImageResource(((LocalResPaperTheme) paperTheme2).getTnResourceId(context2));
        } else {
            if (item.getWidth() == -1 || item.getHeight() == -1) {
                C32443OooOOO c32443OooOOO = paperTheme2.getOrientation() == PaperOrientation.VERTICAL ? new C32443OooOOO(Integer.valueOf(Oooo0.o000000O.OooO0o(93)), Integer.valueOf(Oooo0.o000000O.OooO0o(130))) : new C32443OooOOO(Integer.valueOf(Oooo0.o000000O.OooO0o(130)), Integer.valueOf(Oooo0.o000000O.OooO0o(93)));
                iIntValue = ((Number) c32443OooOOO.f116638OooOo0o).intValue();
                iIntValue2 = ((Number) c32443OooOOO.f116637OooOo).intValue();
            } else {
                iIntValue = item.getWidth();
                iIntValue2 = item.getHeight();
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iIntValue, iIntValue2, Bitmap.Config.ARGB_8888);
            if (!(item.getPaperTheme() instanceof LambdaPaperTheme)) {
                paperTheme = item.getPaperTheme();
            } else if (((LambdaPaperTheme) item.getPaperTheme()).getPaperStyle() instanceof NonePaperStyle) {
                LambdaPaperTheme lambdaPaperTheme = (LambdaPaperTheme) item.getPaperTheme();
                Context context3 = oooO0O0.itemView.getContext();
                kotlin.jvm.internal.OooOOO0.OooO0o(context3, "getContext(...)");
                LambdaPaperTheme lambdaPaperThemeOooO00o = C28264OoooO0O.OooO00o(lambdaPaperTheme, context3);
                Context context4 = oooO0O0.itemView.getContext();
                kotlin.jvm.internal.OooOOO0.OooO0o(context4, "getContext(...)");
                paperTheme = C28264OoooO0O.OooO0O0(lambdaPaperThemeOooO00o, context4);
            } else {
                paperTheme = (LambdaPaperTheme) item.getPaperTheme();
            }
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            Context context5 = oooO0O0.itemView.getContext();
            kotlin.jvm.internal.OooOOO0.OooO0o(context5, "getContext(...)");
            paperTheme.drawPaperBg(canvas, context5);
            imageView.setImageBitmap(bitmapCreateBitmap);
            kotlin.jvm.internal.OooOOO0.OooO0Oo(bitmapCreateBitmap);
        }
        final C30465OooO0oo c30465OooO0oo = C30465OooO0oo.this;
        boolean z2 = c30465OooO0oo.f108789OooO0O0;
        boolean z3 = z2 && (item.getSelected() || item.isStar());
        ImageView ivStar = oooO0O0.f108801OooO0Oo;
        kotlin.jvm.internal.OooOOO0.OooO0o(ivStar, "ivStar");
        ivStar.setVisibility(z3 ? 0 : 8);
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("MaterialTemplateAdapter");
        Context context6 = oooO0O0.itemView.getContext();
        kotlin.jvm.internal.OooOOO0.OooO0o(context6, "getContext(...)");
        c20358OooO00o.OooO00o("bind: showStarButton=" + z2 + ", item=" + item.getName(context6) + ", selected=" + item.getSelected() + ", isStar=" + item.isStar() + ", shouldShowStar=" + z3, new Object[0]);
        if (z3) {
            boolean zIsStar = item.isStar();
            ivStar.setSelected(zIsStar);
            if (zIsStar) {
                ImageViewCompat.setImageTintList(ivStar, null);
            } else {
                ImageViewCompat.setImageTintList(ivStar, ColorStateList.valueOf(ContextCompat.getColor(ivStar.getContext(), R.color.theme_icon_tint_color)));
            }
            ivStar.setOnClickListener(new View.OnClickListener() { // from class: o0o0OOO.OooOO0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o2.OooOOO0("MaterialTemplateAdapter");
                    Context context7 = oooO0O0.itemView.getContext();
                    kotlin.jvm.internal.OooOOO0.OooO0o(context7, "getContext(...)");
                    ThemeVO themeVO = item;
                    c20358OooO00o2.OooO00o(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("ivStar clicked: item=", themeVO.getName(context7)), new Object[0]);
                    InterfaceC32507OooOO0o<? super ThemeVO, C32460OooOooO> interfaceC32507OooOO0o = c30465OooO0oo.f108793OooO0o0;
                    if (interfaceC32507OooOO0o != null) {
                        interfaceC32507OooOO0o.invoke(themeVO);
                    }
                }
            });
        }
        ImageView ivMore = oooO0O0.f108803OooO0o0;
        kotlin.jvm.internal.OooOOO0.OooO0o(ivMore, "ivMore");
        boolean z4 = c30465OooO0oo.f108788OooO00o;
        ivMore.setVisibility(z4 ? 0 : 8);
        if (z4) {
            ivMore.setOnClickListener(new ViewOnClickListenerC28428OooOo0O(1, c30465OooO0oo, item));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final RecyclerView.AbstractC22078OooOooO onCreateViewHolder(ViewGroup parent, int i) throws JSONException {
        kotlin.jvm.internal.OooOOO0.OooO0oO(parent, "parent");
        if (i == 1) {
            View viewOooO0O0 = com.aspose.slides.internal.p332p7.OooO0OO.OooO0O0(parent, R.layout.item_my_template_add, parent, false);
            kotlin.jvm.internal.OooOOO0.OooO0Oo(viewOooO0O0);
            return new OooO00o(viewOooO0O0);
        }
        View viewOooO0O02 = com.aspose.slides.internal.p332p7.OooO0OO.OooO0O0(parent, R.layout.item_my_template, parent, false);
        kotlin.jvm.internal.OooOOO0.OooO0Oo(viewOooO0O02);
        return new OooO0O0(viewOooO0O02);
    }
}
