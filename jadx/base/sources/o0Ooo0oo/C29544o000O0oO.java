package o0Ooo0oo;

import OooOoO.C20504OooO0O0;
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
import o0OoO000.ViewOnClickListenerC28534OooOOoo;
import oO00ooO.C32443OooOOO;

/* JADX INFO: renamed from: o0Ooo0oo.o000O0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29544o000O0oO extends AbstractC22050OooOo0o<PenWidthVO, OooO0O0> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public ViewOnClickListenerC28534OooOOoo f104803OooO0O0;

    /* JADX INFO: renamed from: o0Ooo0oo.o000O0oO$OooO00o */
    public static final class OooO00o extends OooOOO.AbstractC22036OooO0o0<PenWidthVO> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO00o f104804OooO00o = new OooO00o();

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO00o(PenWidthVO penWidthVO, PenWidthVO penWidthVO2) {
            PenWidthVO penWidthVO3 = penWidthVO;
            PenWidthVO penWidthVO4 = penWidthVO2;
            return penWidthVO3.getSelected() == penWidthVO4.getSelected() && penWidthVO3.getColor() == penWidthVO4.getColor() && penWidthVO3.getWidthInMillimetre() == penWidthVO4.getWidthInMillimetre();
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
            bundle.putBoolean("color", penWidthVO3.getColor() != penWidthVO4.getColor());
            bundle.putBoolean("width", !(penWidthVO3.getWidthInMillimetre() == penWidthVO4.getWidthInMillimetre()));
            return bundle;
        }
    }

    /* JADX INFO: renamed from: o0Ooo0oo.o000O0oO$OooO0O0 */
    public final class OooO0O0 extends RecyclerView.AbstractC22078OooOooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ImageView f104805OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final TextView f104806OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final View f104807OooO0OO;

        public OooO0O0(View view) {
            super(view);
            this.f104805OooO00o = (ImageView) view.findViewById(R.id.pen_width);
            this.f104806OooO0O0 = (TextView) view.findViewById(R.id.pen_width_text);
            this.f104807OooO0OO = view.findViewById(R.id.selected);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, int i) {
        C32443OooOOO c32443OooOOO;
        OooO0O0 holder = (OooO0O0) abstractC22078OooOooO;
        kotlin.jvm.internal.OooOOO0.OooO0oO(holder, "holder");
        PenWidthVO penWidthVOOooO0OO = OooO0OO(i);
        kotlin.jvm.internal.OooOOO0.OooO0o(penWidthVOOooO0OO, "getItem(...)");
        PenWidthVO penWidthVO = penWidthVOOooO0OO;
        holder.itemView.setTag(penWidthVO);
        ImageView imageView = holder.f104805OooO00o;
        Drawable drawableMutate = DrawableCompat.wrap(imageView.getDrawable()).mutate();
        kotlin.jvm.internal.OooOOO0.OooO0o0(drawableMutate, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        GradientDrawable gradientDrawable = (GradientDrawable) drawableMutate;
        gradientDrawable.setColor(penWidthVO.getType() == 3 ? ContextCompat.getColor(imageView.getContext(), R.color.toolbox_pen_width_un_selected_bg_color) : penWidthVO.getColor());
        if (penWidthVO.getType() == 3) {
            int widthInMillimetre = ((int) penWidthVO.getWidthInMillimetre()) * 2;
            c32443OooOOO = new C32443OooOOO(Integer.valueOf(widthInMillimetre), Integer.valueOf(widthInMillimetre));
        } else {
            c32443OooOOO = new C32443OooOOO(Integer.valueOf(Math.min((int) Oooo0.o000000O.OooO0Oo(penWidthVO.getWidthInMillimetre()), Oooo0.o000000O.OooO0o(19))), Integer.valueOf(Math.min((int) Oooo0.o000000O.OooO0Oo(penWidthVO.getWidthInMillimetre()), Oooo0.o000000O.OooO0o(19))));
        }
        gradientDrawable.setSize(((Number) c32443OooOOO.f116638OooOo0o).intValue(), ((Number) c32443OooOOO.f116637OooOo).intValue());
        holder.itemView.setSelected(penWidthVO.getSelected());
        holder.f104806OooO0O0.setText(penWidthVO.getType() == 3 ? String.format("%.0f", Arrays.copyOf(new Object[]{Float.valueOf(penWidthVO.getWidthInMillimetre())}, 1)) : String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(penWidthVO.getWidthInMillimetre())}, 1)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final RecyclerView.AbstractC22078OooOooO onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewOooO0OO = C20504OooO0O0.OooO0OO(viewGroup, "parent", R.layout.item_pen_bar_pen_width, viewGroup, false);
        viewOooO0OO.setOnClickListener(new ViewOnClickListenerC29543o000O0o0(this, 0));
        return new OooO0O0(viewOooO0OO);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, int i, List payloads) {
        int color;
        C32443OooOOO c32443OooOOO;
        String str;
        OooO0O0 holder = (OooO0O0) abstractC22078OooOooO;
        kotlin.jvm.internal.OooOOO0.OooO0oO(holder, "holder");
        kotlin.jvm.internal.OooOOO0.OooO0oO(payloads, "payloads");
        if (payloads.isEmpty()) {
            super.onBindViewHolder(holder, i, payloads);
            return;
        }
        Object objOooo0oO = oOo000Oo.OooOo.Oooo0oO(payloads);
        kotlin.jvm.internal.OooOOO0.OooO0o0(objOooo0oO, "null cannot be cast to non-null type android.os.Bundle");
        Bundle bundle = (Bundle) objOooo0oO;
        PenWidthVO penWidthVOOooO0OO = OooO0OO(i);
        if (bundle.getBoolean("selected")) {
            kotlin.jvm.internal.OooOOO0.OooO0Oo(penWidthVOOooO0OO);
            holder.itemView.setSelected(penWidthVOOooO0OO.getSelected());
        }
        boolean z = bundle.getBoolean("width");
        ImageView imageView = holder.f104805OooO00o;
        if (z) {
            kotlin.jvm.internal.OooOOO0.OooO0Oo(penWidthVOOooO0OO);
            Drawable drawableMutate = DrawableCompat.wrap(imageView.getDrawable()).mutate();
            kotlin.jvm.internal.OooOOO0.OooO0o0(drawableMutate, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            GradientDrawable gradientDrawable = (GradientDrawable) drawableMutate;
            if (penWidthVOOooO0OO.getType() == 3) {
                int widthInMillimetre = ((int) penWidthVOOooO0OO.getWidthInMillimetre()) * 2;
                c32443OooOOO = new C32443OooOOO(Integer.valueOf(widthInMillimetre), Integer.valueOf(widthInMillimetre));
            } else {
                c32443OooOOO = new C32443OooOOO(Integer.valueOf(Math.min((int) Oooo0.o000000O.OooO0Oo(penWidthVOOooO0OO.getWidthInMillimetre()), Oooo0.o000000O.OooO0o(19))), Integer.valueOf(Math.min((int) Oooo0.o000000O.OooO0Oo(penWidthVOOooO0OO.getWidthInMillimetre()), Oooo0.o000000O.OooO0o(19))));
            }
            gradientDrawable.setSize(((Number) c32443OooOOO.f116638OooOo0o).intValue(), ((Number) c32443OooOOO.f116637OooOo).intValue());
            if (penWidthVOOooO0OO.getType() == 3) {
                str = String.format("%.0f", Arrays.copyOf(new Object[]{Float.valueOf(penWidthVOOooO0OO.getWidthInMillimetre())}, 1));
            } else {
                str = String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(penWidthVOOooO0OO.getWidthInMillimetre())}, 1));
            }
            holder.f104806OooO0O0.setText(str);
        }
        if (bundle.getBoolean("color")) {
            kotlin.jvm.internal.OooOOO0.OooO0Oo(penWidthVOOooO0OO);
            if (penWidthVOOooO0OO.getType() == 3) {
                color = ContextCompat.getColor(imageView.getContext(), R.color.toolbox_pen_width_un_selected_bg_color);
            } else {
                color = penWidthVOOooO0OO.getColor();
            }
            Drawable drawableMutate2 = DrawableCompat.wrap(imageView.getDrawable()).mutate();
            kotlin.jvm.internal.OooOOO0.OooO0o0(drawableMutate2, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            ((GradientDrawable) drawableMutate2).setColor(color);
        }
        kotlin.jvm.internal.OooOOO0.OooO0Oo(penWidthVOOooO0OO);
        holder.itemView.setTag(penWidthVOOooO0OO);
    }
}
