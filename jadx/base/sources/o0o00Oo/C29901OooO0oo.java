package o0o00Oo;

import OooOoO.C20504OooO0O0;
import Oooo0.o000000O;
import android.animation.ObjectAnimator;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import androidx.recyclerview.widget.AbstractC22050OooOo0o;
import androidx.recyclerview.widget.OooOOO;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.network.embedded.C18437z2;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.p609vo.PenVO;
import java.util.List;
import o00O0oo0.C24969OooOO0;
import o0o00Oo.C29901OooO0oo;
import oO00ooO.C32443OooOOO;
import oOo000Oo.C34444Oooo0O0;
import oOo000Oo.OooOo;

/* JADX INFO: renamed from: o0o00Oo.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29901OooO0oo extends AbstractC22050OooOo0o<PenVO, OooO0O0> {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final float f106077OooO0OO = o000000O.OooO0o0(12.0f);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final Object f106078OooO0Oo = C34444Oooo0O0.OooO0oo(new C32443OooOOO(0, Integer.valueOf(R.drawable.ic_ni_toolbox_ink_pen)), new C32443OooOOO(1, Integer.valueOf(R.drawable.ic_ni_toolbox_ballpoint_pen)), new C32443OooOOO(10, Integer.valueOf(R.drawable.ic_ni_toolbox_pencil)), new C32443OooOOO(2, Integer.valueOf(R.drawable.ic_ni_toolbox_round_hl_pen)), new C32443OooOOO(9, Integer.valueOf(R.drawable.ic_ni_toolbox_highlighter_pen)), new C32443OooOOO(3, Integer.valueOf(R.drawable.ic_ni_toolbox_eraser)), new C32443OooOOO(4, Integer.valueOf(R.drawable.ic_ni_toolbox_lasso)), new C32443OooOOO(7, Integer.valueOf(R.mipmap.ic_toolbox_laser_pen)), new C32443OooOOO(8, Integer.valueOf(R.drawable.ic_ni_toolbox_vector)), new C32443OooOOO(11, Integer.valueOf(R.drawable.ic_ni_toolbox_tape_pen)), new C32443OooOOO(12, Integer.valueOf(R.drawable.ic_ni_toolbox_rainbow_pen)));

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final Object f106079OooO0o0 = C34444Oooo0O0.OooO0oo(new C32443OooOOO(0, Integer.valueOf(R.drawable.ic_ni_toolbox_ink_pen_color)), new C32443OooOOO(1, Integer.valueOf(R.drawable.ic_ni_toolbox_ballpoint_pen_color)), new C32443OooOOO(10, Integer.valueOf(R.drawable.ic_ni_toolbox_pencil_color)), new C32443OooOOO(2, Integer.valueOf(R.drawable.ic_ni_toolbox_highlight_round_pen_color)), new C32443OooOOO(9, Integer.valueOf(R.drawable.ic_ni_toolbox_highlight_rect_pen_color)), new C32443OooOOO(7, Integer.valueOf(R.drawable.ic_ni_toolbox_laser_line_pen_color)), new C32443OooOOO(8, Integer.valueOf(R.drawable.ic_ni_toolbox_vector_pen_color)), new C32443OooOOO(11, Integer.valueOf(R.drawable.ic_ni_toolbox_tape_pen_color)), new C32443OooOOO(12, Integer.valueOf(R.drawable.ic_ni_toolbox_rainbow_color)));

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public View.OnClickListener f106080OooO0O0;

    /* JADX INFO: renamed from: o0o00Oo.OooO0oo$OooO00o */
    public static final class OooO00o extends OooOOO.AbstractC22036OooO0o0<PenVO> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO00o f106081OooO00o = new OooO00o();

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO00o(PenVO penVO, PenVO penVO2) {
            return penVO.equals(penVO2);
        }

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO0O0(PenVO penVO, PenVO penVO2) {
            return penVO.getType() == penVO2.getType();
        }

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final Object OooO0OO(PenVO penVO, PenVO penVO2) {
            PenVO penVO3 = penVO;
            PenVO penVO4 = penVO2;
            Bundle bundle = new Bundle();
            bundle.putBoolean("selected", penVO3.getSelected() != penVO4.getSelected());
            bundle.putBoolean("color", penVO3.getColor() != penVO4.getColor());
            bundle.putBoolean("extra", !kotlin.jvm.internal.OooOOO0.OooO0O0(penVO3.getExtra(), penVO4.getExtra()));
            return bundle;
        }
    }

    /* JADX INFO: renamed from: o0o00Oo.OooO0oo$OooO0O0 */
    public final class OooO0O0 extends RecyclerView.AbstractC22078OooOooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final View f106082OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final ImageView f106083OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final ImageView f106084OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final ImageView f106085OooO0Oo;

        public OooO0O0(View view) {
            super(view);
            this.f106082OooO00o = view.findViewById(R.id.icon_wrapper);
            this.f106083OooO0O0 = (ImageView) view.findViewById(R.id.pen_icon);
            this.f106084OooO0OO = (ImageView) view.findViewById(R.id.pen_color);
            this.f106085OooO0Oo = (ImageView) view.findViewById(R.id.icon_tape_tint);
            view.setOnHoverListener(new View.OnHoverListener() { // from class: o0o00Oo.OooO
                @Override // android.view.View.OnHoverListener
                public final boolean onHover(View view2, MotionEvent motionEvent) {
                    int actionMasked = motionEvent.getActionMasked();
                    C29901OooO0oo.OooO0O0 oooO0O0 = this.f106055OooO00o;
                    if (actionMasked == 9) {
                        oooO0O0.f106082OooO00o.setScaleX(1.1f);
                        oooO0O0.f106082OooO00o.setScaleY(1.1f);
                        return false;
                    }
                    if (actionMasked != 10) {
                        return false;
                    }
                    oooO0O0.f106082OooO00o.setScaleX(1.0f);
                    oooO0O0.f106082OooO00o.setScaleY(1.0f);
                    return false;
                }
            });
        }

        public final void OooO00o(PenVO penVO) {
            int type = penVO.getType();
            ImageView tapePenTintView = this.f106085OooO0Oo;
            if (type == 11) {
                kotlin.jvm.internal.OooOOO0.OooO0o(tapePenTintView, "tapePenTintView");
                tapePenTintView.setVisibility(0);
                tapePenTintView.getDrawable().setTint(C24969OooOO0.OooO0OO(penVO.getColor()));
            } else {
                if (penVO.getType() == 3 || penVO.getType() == 4) {
                    return;
                }
                this.f106084OooO0OO.getDrawable().setTint(C24969OooOO0.OooO0OO(penVO.getColor()));
                kotlin.jvm.internal.OooOOO0.OooO0o(tapePenTintView, "tapePenTintView");
                tapePenTintView.setVisibility(8);
            }
        }
    }

    public C29901OooO0oo() {
        super(OooO00o.f106081OooO00o);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final int OooO0o(PenVO penVO) {
        switch (penVO.getType()) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                Integer num = (Integer) f106078OooO0Oo.get(Integer.valueOf(penVO.getType()));
                if (num != null) {
                    return num.intValue();
                }
                return 0;
            case 5:
            case 6:
            default:
                return 0;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final int OooO0oO(PenVO penVO) {
        int type = penVO.getType();
        if (type != 0 && type != 1 && type != 2) {
            switch (type) {
                case 7:
                    if (kotlin.jvm.internal.OooOOO0.OooO0O0(penVO.getExtra().getString(C18437z2.f56754h), "line")) {
                        return R.drawable.ic_ni_toolbox_laser_line_pen_color;
                    }
                    if (kotlin.jvm.internal.OooOOO0.OooO0O0(penVO.getExtra().getString(C18437z2.f56754h), "spot")) {
                        return R.drawable.ic_ni_toolbox_laser_spot_pen_color;
                    }
                    throw new IllegalArgumentException("unknown laser pen type");
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                    break;
                default:
                    return 0;
            }
        }
        Integer num = (Integer) f106079OooO0o0.get(Integer.valueOf(penVO.getType()));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, int i) {
        OooO0O0 holder = (OooO0O0) abstractC22078OooOooO;
        kotlin.jvm.internal.OooOOO0.OooO0oO(holder, "holder");
        PenVO penVOOooO0OO = OooO0OO(i);
        kotlin.jvm.internal.OooOOO0.OooO0o(penVOOooO0OO, "getItem(...)");
        PenVO penVO = penVOOooO0OO;
        holder.itemView.setTag(penVO);
        C29901OooO0oo c29901OooO0oo = C29901OooO0oo.this;
        holder.f106083OooO0O0.setImageResource(c29901OooO0oo.OooO0o(penVO));
        holder.f106084OooO0OO.setImageResource(c29901OooO0oo.OooO0oO(penVO));
        boolean selected = penVO.getSelected();
        View view = holder.f106082OooO00o;
        if (selected) {
            view.setTranslationY(0.0f);
        } else {
            view.setTranslationY(f106077OooO0OO);
        }
        holder.OooO00o(penVO);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final RecyclerView.AbstractC22078OooOooO onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewOooO0OO = C20504OooO0O0.OooO0OO(viewGroup, "parent", R.layout.item_toolbox_pen, viewGroup, false);
        viewOooO0OO.setOnTouchListener(new View.OnTouchListener() { // from class: o0o00Oo.OooO0oO
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                View.OnClickListener onClickListener;
                int actionMasked = motionEvent.getActionMasked();
                if ((actionMasked == 1 || actionMasked == 3) && (onClickListener = this.f106076OooOo0o.f106080OooO0O0) != null) {
                    onClickListener.onClick(view);
                }
                return true;
            }
        });
        return new OooO0O0(viewOooO0OO);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, int i, List payloads) {
        Drawable drawable;
        C32443OooOOO c32443OooOOO;
        OooO0O0 holder = (OooO0O0) abstractC22078OooOooO;
        kotlin.jvm.internal.OooOOO0.OooO0oO(holder, "holder");
        kotlin.jvm.internal.OooOOO0.OooO0oO(payloads, "payloads");
        if (payloads.isEmpty()) {
            super.onBindViewHolder(holder, i, payloads);
            return;
        }
        PenVO penVOOooO0OO = OooO0OO(i);
        Object objOooo0oO = OooOo.Oooo0oO(payloads);
        kotlin.jvm.internal.OooOOO0.OooO0o0(objOooo0oO, "null cannot be cast to non-null type android.os.Bundle");
        Bundle bundle = (Bundle) objOooo0oO;
        if (bundle.getBoolean("selected")) {
            kotlin.jvm.internal.OooOOO0.OooO0Oo(penVOOooO0OO);
            boolean selected = penVOOooO0OO.getSelected();
            Float fValueOf = Float.valueOf(0.0f);
            if (selected) {
                c32443OooOOO = new C32443OooOOO(Float.valueOf(o000000O.OooO0o0(12.0f)), fValueOf);
            } else {
                c32443OooOOO = new C32443OooOOO(fValueOf, Float.valueOf(o000000O.OooO0o0(12.0f)));
            }
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(holder.f106082OooO00o, "translationY", ((Number) c32443OooOOO.f116638OooOo0o).floatValue(), ((Number) c32443OooOOO.f116637OooOo).floatValue());
            objectAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }
        if (bundle.getBoolean("color")) {
            kotlin.jvm.internal.OooOOO0.OooO0Oo(penVOOooO0OO);
            holder.OooO00o(penVOOooO0OO);
        }
        if (bundle.getBoolean("extra")) {
            kotlin.jvm.internal.OooOOO0.OooO0Oo(penVOOooO0OO);
            int iOooO0oO = C29901OooO0oo.this.OooO0oO(penVOOooO0OO);
            ImageView imageView = holder.f106084OooO0OO;
            imageView.setImageResource(iOooO0oO);
            if (penVOOooO0OO.getType() != 11 && (drawable = imageView.getDrawable()) != null) {
                drawable.setTint(C24969OooOO0.OooO0OO(penVOOooO0OO.getColor()));
            }
        }
        kotlin.jvm.internal.OooOOO0.OooO0Oo(penVOOooO0OO);
        holder.itemView.setTag(penVOOooO0OO);
    }
}
