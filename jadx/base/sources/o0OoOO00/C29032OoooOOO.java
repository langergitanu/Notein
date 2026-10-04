package o0OoOO00;

import Oooo0.o000000O;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
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
import o0Oo0o0o.C28264OoooO0O;
import oO00ooO.C32443OooOOO;
import org.json.JSONException;

/* JADX INFO: renamed from: o0OoOO00.OoooOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29032OoooOOO extends AbstractC22050OooOo0o<ThemeVO, RecyclerView.AbstractC22078OooOooO> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public com.google.android.material.search.OooOO0O f102847OooO0O0;

    /* JADX INFO: renamed from: o0OoOO00.OoooOOO$OooO00o */
    public static final class OooO00o extends OooOOO.AbstractC22036OooO0o0<ThemeVO> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO00o f102848OooO00o = new OooO00o();

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
            ThemeVO themeVO3 = themeVO;
            ThemeVO themeVO4 = themeVO2;
            Bundle bundle = new Bundle();
            if (!(themeVO4.getSelected() != themeVO3.getSelected()) || !kotlin.jvm.internal.OooOOO0.OooO0O0(themeVO4.getPaperTheme(), themeVO3.getPaperTheme())) {
                return null;
            }
            bundle.putBoolean("selected", themeVO4.getSelected());
            return bundle;
        }
    }

    /* JADX INFO: renamed from: o0OoOO00.OoooOOO$OooO0O0 */
    public final class OooO0O0 extends RecyclerView.AbstractC22078OooOooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final TextView f102849OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final ImageView f102850OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final View f102851OooO0OO;

        public OooO0O0(C29032OoooOOO c29032OoooOOO, View view) {
            super(view);
            this.f102849OooO00o = (TextView) view.findViewById(R.id.theme_name);
            this.f102850OooO0O0 = (ImageView) view.findViewById(R.id.theme_img);
            View viewFindViewById = view.findViewById(R.id.theme_selected);
            kotlin.jvm.internal.OooOOO0.OooO0o(viewFindViewById, "findViewById(...)");
            this.f102851OooO0OO = viewFindViewById;
            view.setOnClickListener(new ViewOnClickListenerC29033OoooOOo(c29032OoooOOO, 0));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final int getItemViewType(int i) {
        return OooO0OO(i).getOrientation() == PaperOrientation.VERTICAL ? 0 : 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO holder, int i) {
        int iIntValue;
        int iIntValue2;
        PaperTheme paperTheme;
        kotlin.jvm.internal.OooOOO0.OooO0oO(holder, "holder");
        OooO0O0 oooO0O0 = (OooO0O0) holder;
        ThemeVO themeVOOooO0OO = OooO0OO(i);
        kotlin.jvm.internal.OooOOO0.OooO0o(themeVOOooO0OO, "getItem(...)");
        ThemeVO themeVO = themeVOOooO0OO;
        oooO0O0.itemView.setTag(themeVO);
        oooO0O0.itemView.setTag(themeVO);
        oooO0O0.f102851OooO0OO.setVisibility(themeVO.getSelected() ? 0 : 8);
        String displayName = themeVO.getDisplayName();
        if (displayName == null) {
            PaperTheme paperTheme2 = themeVO.getPaperTheme();
            Context context = oooO0O0.itemView.getContext();
            kotlin.jvm.internal.OooOOO0.OooO0o(context, "getContext(...)");
            displayName = paperTheme2.getTitle(context);
        }
        oooO0O0.f102849OooO00o.setText(displayName);
        PaperTheme paperTheme3 = themeVO.getPaperTheme();
        boolean z = paperTheme3 instanceof LocalResPaperTheme;
        ImageView imageView = oooO0O0.f102850OooO0O0;
        if (z) {
            Context context2 = imageView.getContext();
            kotlin.jvm.internal.OooOOO0.OooO0o(context2, "getContext(...)");
            imageView.setImageResource(((LocalResPaperTheme) paperTheme3).getResourceId(context2));
            return;
        }
        if (themeVO.getWidth() == -1 || themeVO.getHeight() == -1) {
            C32443OooOOO c32443OooOOO = paperTheme3.getOrientation() == PaperOrientation.VERTICAL ? new C32443OooOOO(Integer.valueOf(o000000O.OooO0o(93)), Integer.valueOf(o000000O.OooO0o(130))) : new C32443OooOOO(Integer.valueOf(o000000O.OooO0o(130)), Integer.valueOf(o000000O.OooO0o(93)));
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
            Context context3 = oooO0O0.itemView.getContext();
            kotlin.jvm.internal.OooOOO0.OooO0o(context3, "getContext(...)");
            LambdaPaperTheme lambdaPaperThemeOooO00o = C28264OoooO0O.OooO00o(lambdaPaperTheme, context3);
            Context context4 = oooO0O0.itemView.getContext();
            kotlin.jvm.internal.OooOOO0.OooO0o(context4, "getContext(...)");
            paperTheme = C28264OoooO0O.OooO0O0(lambdaPaperThemeOooO00o, context4);
        } else {
            paperTheme = (LambdaPaperTheme) themeVO.getPaperTheme();
        }
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Context context5 = oooO0O0.itemView.getContext();
        kotlin.jvm.internal.OooOOO0.OooO0o(context5, "getContext(...)");
        paperTheme.drawPaperBg(canvas, context5);
        imageView.setImageBitmap(bitmapCreateBitmap);
        kotlin.jvm.internal.OooOOO0.OooO0Oo(bitmapCreateBitmap);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final RecyclerView.AbstractC22078OooOooO onCreateViewHolder(ViewGroup parent, int i) throws JSONException {
        kotlin.jvm.internal.OooOOO0.OooO0oO(parent, "parent");
        if (i == 0) {
            View viewOooO0O0 = com.aspose.slides.internal.p332p7.OooO0OO.OooO0O0(parent, R.layout.item_note_creation_theme_v, parent, false);
            kotlin.jvm.internal.OooOOO0.OooO0Oo(viewOooO0O0);
            return new OooO0O0(this, viewOooO0O0);
        }
        if (i != 1) {
            View viewOooO0O02 = com.aspose.slides.internal.p332p7.OooO0OO.OooO0O0(parent, R.layout.item_note_creation_theme_h, parent, false);
            kotlin.jvm.internal.OooOOO0.OooO0Oo(viewOooO0O02);
            return new OooO0O0(this, viewOooO0O02);
        }
        View viewOooO0O03 = com.aspose.slides.internal.p332p7.OooO0OO.OooO0O0(parent, R.layout.item_note_creation_theme_h, parent, false);
        kotlin.jvm.internal.OooOOO0.OooO0Oo(viewOooO0O03);
        return new OooO0O0(this, viewOooO0O03);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO holder, int i, List<Object> payloads) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(holder, "holder");
        kotlin.jvm.internal.OooOOO0.OooO0oO(payloads, "payloads");
        if (!payloads.isEmpty()) {
            Object obj = payloads.get(0);
            kotlin.jvm.internal.OooOOO0.OooO0o0(obj, "null cannot be cast to non-null type android.os.Bundle");
            if (((Bundle) obj).get("selected") != null) {
                OooO0O0 oooO0O0 = (OooO0O0) holder;
                ThemeVO themeVOOooO0OO = OooO0OO(i);
                kotlin.jvm.internal.OooOOO0.OooO0o(themeVOOooO0OO, "getItem(...)");
                ThemeVO themeVO = themeVOOooO0OO;
                oooO0O0.itemView.setTag(themeVO);
                oooO0O0.f102851OooO0OO.setVisibility(themeVO.getSelected() ? 0 : 8);
                return;
            }
        }
        super.onBindViewHolder(holder, i, payloads);
    }
}
