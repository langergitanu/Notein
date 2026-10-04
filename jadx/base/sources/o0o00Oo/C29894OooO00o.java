package o0o00Oo;

import OooOoO.C20504OooO0O0;
import Oooo0.o000000O;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.recyclerview.widget.AbstractC22050OooOo0o;
import androidx.recyclerview.widget.OooOOO;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.p609vo.PenWidthVO;
import java.util.Arrays;
import java.util.List;
import o0O0o0oO.o00O0O;
import o0O0o0oO.o0Oo0oo;
import oOo000Oo.OooOo;

/* JADX INFO: renamed from: o0o00Oo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29894OooO00o extends AbstractC22050OooOo0o<PenWidthVO, OooO0O0> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f106056OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public o0Oo0oo f106057OooO0OO;

    /* JADX INFO: renamed from: o0o00Oo.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C20028OooO00o extends OooOOO.AbstractC22036OooO0o0<PenWidthVO> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final C20028OooO00o f106058OooO00o = new C20028OooO00o();

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO00o(PenWidthVO penWidthVO, PenWidthVO penWidthVO2) {
            return false;
        }

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO0O0(PenWidthVO penWidthVO, PenWidthVO penWidthVO2) {
            return penWidthVO.getType() == penWidthVO2.getType();
        }

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final Object OooO0OO(PenWidthVO penWidthVO, PenWidthVO penWidthVO2) {
            PenWidthVO penWidthVO3 = penWidthVO;
            PenWidthVO penWidthVO4 = penWidthVO2;
            Bundle bundle = new Bundle();
            bundle.putBoolean("selected", penWidthVO3.getSelected() != penWidthVO4.getSelected());
            bundle.putBoolean("width", !(penWidthVO3.getWidthInMillimetre() == penWidthVO4.getWidthInMillimetre()));
            return bundle;
        }
    }

    /* JADX INFO: renamed from: o0o00Oo.OooO00o$OooO0O0 */
    public final class OooO0O0 extends RecyclerView.AbstractC22078OooOooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ImageView f106059OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final TextView f106060OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final View f106061OooO0OO;

        public OooO0O0(View view) {
            super(view);
            this.f106059OooO00o = (ImageView) view.findViewById(R.id.pen_width);
            this.f106060OooO0O0 = (TextView) view.findViewById(R.id.pen_width_text);
            this.f106061OooO0OO = view.findViewById(R.id.selected);
        }
    }

    public C29894OooO00o() {
        super(C20028OooO00o.f106058OooO00o);
        this.f106056OooO0O0 = 5;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, int i) {
        OooO0O0 holder = (OooO0O0) abstractC22078OooOooO;
        kotlin.jvm.internal.OooOOO0.OooO0oO(holder, "holder");
        PenWidthVO penWidthVOOooO0OO = OooO0OO(i);
        kotlin.jvm.internal.OooOOO0.OooO0o(penWidthVOOooO0OO, "getItem(...)");
        PenWidthVO penWidthVO = penWidthVOOooO0OO;
        holder.itemView.setTag(penWidthVO);
        ImageView imageView = holder.f106059OooO00o;
        Drawable drawableMutate = DrawableCompat.wrap(imageView.getDrawable()).mutate();
        kotlin.jvm.internal.OooOOO0.OooO0o0(drawableMutate, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        GradientDrawable gradientDrawable = (GradientDrawable) drawableMutate;
        int widthInMillimetre = (19 - ((int) penWidthVO.getWidthInMillimetre())) / 2;
        if (widthInMillimetre < 0) {
            widthInMillimetre = 0;
        }
        gradientDrawable.setStroke(o000000O.OooO0o(widthInMillimetre), ContextCompat.getColor(imageView.getContext(), R.color.layout_secondary_bg_color));
        View selected = holder.f106061OooO0OO;
        kotlin.jvm.internal.OooOOO0.OooO0o(selected, "selected");
        selected.setVisibility(penWidthVO.getSelected() ? 0 : 8);
        holder.f106060OooO0O0.setText(String.format("%.0f", Arrays.copyOf(new Object[]{Float.valueOf(penWidthVO.getWidthInMillimetre())}, 1)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final RecyclerView.AbstractC22078OooOooO onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewOooO0OO = C20504OooO0O0.OooO0OO(viewGroup, "parent", R.layout.item_toolbox_eraser_width, viewGroup, false);
        viewOooO0OO.setOnClickListener(new o00O0O(this, 4));
        return new OooO0O0(viewOooO0OO);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, int i, List payloads) {
        OooO0O0 holder = (OooO0O0) abstractC22078OooOooO;
        kotlin.jvm.internal.OooOOO0.OooO0oO(holder, "holder");
        kotlin.jvm.internal.OooOOO0.OooO0oO(payloads, "payloads");
        if (payloads.isEmpty()) {
            super.onBindViewHolder(holder, i, payloads);
            return;
        }
        Object objOooo0oO = OooOo.Oooo0oO(payloads);
        kotlin.jvm.internal.OooOOO0.OooO0o0(objOooo0oO, "null cannot be cast to non-null type android.os.Bundle");
        Bundle bundle = (Bundle) objOooo0oO;
        PenWidthVO penWidthVOOooO0OO = OooO0OO(i);
        if (bundle.getBoolean("selected")) {
            kotlin.jvm.internal.OooOOO0.OooO0Oo(penWidthVOOooO0OO);
            View selected = holder.f106061OooO0OO;
            kotlin.jvm.internal.OooOOO0.OooO0o(selected, "selected");
            selected.setVisibility(penWidthVOOooO0OO.getSelected() ? 0 : 8);
        }
        boolean z = bundle.getBoolean("width");
        C29894OooO00o c29894OooO00o = C29894OooO00o.this;
        TextView textView = holder.f106060OooO0O0;
        if (z) {
            kotlin.jvm.internal.OooOOO0.OooO0Oo(penWidthVOOooO0OO);
            ImageView imageView = holder.f106059OooO00o;
            Drawable drawableMutate = DrawableCompat.wrap(imageView.getDrawable()).mutate();
            kotlin.jvm.internal.OooOOO0.OooO0o0(drawableMutate, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            GradientDrawable gradientDrawable = (GradientDrawable) drawableMutate;
            int widthInMillimetre = (19 - ((int) penWidthVOOooO0OO.getWidthInMillimetre())) / 2;
            gradientDrawable.setStroke(o000000O.OooO0o(widthInMillimetre >= 0 ? widthInMillimetre : 0), ContextCompat.getColor(imageView.getContext(), R.color.layout_secondary_bg_color));
            textView.setText(String.format("%.0f", Arrays.copyOf(new Object[]{Float.valueOf(penWidthVOOooO0OO.getWidthInMillimetre())}, 1)));
            int i2 = c29894OooO00o.f106056OooO0O0;
            textView.setRotation(i2 != 3 ? i2 != 7 ? 0.0f : -90.0f : 90.0f);
        }
        kotlin.jvm.internal.OooOOO0.OooO0Oo(penWidthVOOooO0OO);
        holder.itemView.setTag(penWidthVOOooO0OO);
        int i3 = c29894OooO00o.f106056OooO0O0;
        textView.setRotation(i3 != 3 ? i3 != 7 ? 0.0f : -90.0f : 90.0f);
    }
}
