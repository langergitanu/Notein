package o0o00o00;

import Oooo0.o000000O;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.OooOOO;
import androidx.recyclerview.widget.OooOo;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.p609vo.FavoritePenVO;
import com.orion.penkit.tools.DrawToolFactory;
import io.ktor.utils.p616io.C23991Oooooo0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.internal.OooOOO0;
import o00O0oo0.C24969OooOO0;
import o0Oo0oOo.ViewOnClickListenerC28305OooO;
import o0o00o00.C29938OooO00o;
import oO00ooO.C32443OooOOO;
import oOo000Oo.C34444Oooo0O0;

/* JADX INFO: renamed from: o0o00o00.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29938OooO00o extends RecyclerView.AbstractC22062OooO0oO<OooO0OO> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ArrayList f106299OooO00o = new ArrayList();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public ViewOnClickListenerC28305OooO f106300OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final Object f106294OooO0OO = C34444Oooo0O0.OooO0oo(new C32443OooOOO(0, Integer.valueOf(R.drawable.ic_ni_toolbox_ink_pen)), new C32443OooOOO(1, Integer.valueOf(R.drawable.ic_ni_toolbox_ballpoint_pen)), new C32443OooOOO(10, Integer.valueOf(R.drawable.ic_ni_toolbox_pencil)), new C32443OooOOO(12, Integer.valueOf(R.drawable.ic_ni_toolbox_rainbow_pen)), new C32443OooOOO(2, Integer.valueOf(R.drawable.ic_ni_favorite_toolbox_round_hl_pen)), new C32443OooOOO(9, Integer.valueOf(R.drawable.ic_ni_favorite_toolbox_highlighter_pen)), new C32443OooOOO(3, Integer.valueOf(R.drawable.bg_toolbox_eraser_type_normal)), new C32443OooOOO(8, Integer.valueOf(R.drawable.bg_toolbox_vector_type_normal)), new C32443OooOOO(4, Integer.valueOf(R.drawable.bg_toolbox_lasso_type_normal)), new C32443OooOOO(11, Integer.valueOf(R.drawable.ic_ni_favorite_toolbox_tape_pen_color)));

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final Object f106295OooO0Oo = C34444Oooo0O0.OooO0oo(new C32443OooOOO(0, Integer.valueOf(R.drawable.ic_ni_toolbox_ink_pen_color)), new C32443OooOOO(1, Integer.valueOf(R.drawable.ic_ni_toolbox_ballpoint_pen_color)), new C32443OooOOO(10, Integer.valueOf(R.drawable.ic_ni_toolbox_pencil_color)), new C32443OooOOO(12, Integer.valueOf(R.drawable.ic_ni_toolbox_rainbow_color)), new C32443OooOOO(2, Integer.valueOf(R.drawable.ic_ni_favorite_marker_round_color)), new C32443OooOOO(9, Integer.valueOf(R.drawable.ic_ni_favorite_marker_rect_color)), new C32443OooOOO(11, Integer.valueOf(R.drawable.ic_ni_favorite_toolbox_tape_pen)));

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final Object f106297OooO0o0 = C34444Oooo0O0.OooO0oo(new C32443OooOOO(DrawToolFactory.LASSO_TYPE_FREE, Integer.valueOf(R.drawable.ic_ni_toolbox_lasso_free_normal)), new C32443OooOOO(DrawToolFactory.LASSO_TYPE_RECT, Integer.valueOf(R.drawable.ic_ni_toolbox_lasso_rect_normal)), new C32443OooOOO(DrawToolFactory.LASSO_TYPE_CAPTURE, Integer.valueOf(R.drawable.ic_ni_toolbox_lasso_capture_normal)));

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final Object f106296OooO0o = C34444Oooo0O0.OooO0oo(new C32443OooOOO(DrawToolFactory.ERASER_TYPE_PIXEL, Integer.valueOf(R.drawable.ic_ni_toolbox_eraser_type_pixel_normal)), new C32443OooOOO(DrawToolFactory.ERASER_TYPE_STROKE, Integer.valueOf(R.drawable.ic_ni_toolbox_eraser_type_stroke_normal)), new C32443OooOOO(DrawToolFactory.ERASER_TYPE_LASSO, Integer.valueOf(R.drawable.ic_ni_toolbox_eraser_type_lasso_normal)));

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final Object f106298OooO0oO = C34444Oooo0O0.OooO0oo(new C32443OooOOO(7, Integer.valueOf(R.drawable.ic_vector_line)), new C32443OooOOO(19, Integer.valueOf(R.drawable.ic_vector_dash_line)), new C32443OooOOO(0, Integer.valueOf(R.drawable.ic_vector_curve)), new C32443OooOOO(20, Integer.valueOf(R.drawable.ic_vector_wave_line)), new C32443OooOOO(21, Integer.valueOf(R.drawable.ic_vector_arrow_line)), new C32443OooOOO(22, Integer.valueOf(R.drawable.ic_vector_arrow_line_2)), new C32443OooOOO(24, Integer.valueOf(R.drawable.ic_vector_curly_brackets)), new C32443OooOOO(23, Integer.valueOf(R.drawable.ic_vector_coordinates)), new C32443OooOOO(1, Integer.valueOf(R.drawable.ic_vector_triangle)), new C32443OooOOO(3, Integer.valueOf(R.drawable.ic_vector_rectangle)), new C32443OooOOO(9, Integer.valueOf(R.drawable.ic_vector_hexagon)), new C32443OooOOO(6, Integer.valueOf(R.drawable.ic_vector_circle)), new C32443OooOOO(8, Integer.valueOf(R.drawable.ic_vector_ellipse)), new C32443OooOOO(18, Integer.valueOf(R.drawable.ic_vector_pentagram2)), new C32443OooOOO(10, Integer.valueOf(R.drawable.ic_vector_heart)), new C32443OooOOO(11, Integer.valueOf(R.drawable.ic_vector_cube)), new C32443OooOOO(13, Integer.valueOf(R.drawable.ic_vector_triangular_prism)), new C32443OooOOO(12, Integer.valueOf(R.drawable.ic_vector_triangular_pyramid)), new C32443OooOOO(14, Integer.valueOf(R.drawable.ic_vector_cylinder)), new C32443OooOOO(15, Integer.valueOf(R.drawable.ic_vector_cone)), new C32443OooOOO(16, Integer.valueOf(R.drawable.ic_vector_sphere)), new C32443OooOOO(17, Integer.valueOf(R.drawable.ic_vector_sphere_2)));

    /* JADX INFO: renamed from: o0o00o00.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C20032OooO00o extends OooOOO.OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ArrayList f106301OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final List<FavoritePenVO> f106302OooO0O0;

        public C20032OooO00o(ArrayList oldList, List newList) {
            OooOOO0.OooO0oO(oldList, "oldList");
            OooOOO0.OooO0oO(newList, "newList");
            this.f106301OooO00o = oldList;
            this.f106302OooO0O0 = newList;
        }

        @Override // androidx.recyclerview.widget.OooOOO.OooO0O0
        public final boolean OooO00o(int i, int i2) {
            return OooOOO0.OooO0O0(this.f106301OooO00o.get(i), this.f106302OooO0O0.get(i2));
        }

        @Override // androidx.recyclerview.widget.OooOOO.OooO0O0
        public final boolean OooO0O0(int i, int i2) {
            FavoritePenVO favoritePenVO = (FavoritePenVO) this.f106301OooO00o.get(i);
            FavoritePenVO favoritePenVO2 = this.f106302OooO0O0.get(i2);
            return OooOOO0.OooO0O0(favoritePenVO.getId(), favoritePenVO2.getId()) && favoritePenVO.getType() == favoritePenVO2.getType() && OooOOO0.OooO0O0(favoritePenVO.getPenSubType(), favoritePenVO2.getPenSubType());
        }

        @Override // androidx.recyclerview.widget.OooOOO.OooO0O0
        public final Object OooO0OO(int i, int i2) {
            FavoritePenVO favoritePenVO = (FavoritePenVO) this.f106301OooO00o.get(i);
            FavoritePenVO favoritePenVO2 = this.f106302OooO0O0.get(i2);
            Bundle bundle = new Bundle();
            bundle.putBoolean("color", favoritePenVO.getColor() != favoritePenVO2.getColor());
            bundle.putBoolean("width", !(favoritePenVO.getWidth() == favoritePenVO2.getWidth()));
            bundle.putBoolean("editable", favoritePenVO.getEditable() != favoritePenVO2.getEditable());
            bundle.putBoolean("selected", favoritePenVO.getSelected() != favoritePenVO2.getSelected());
            return bundle;
        }

        @Override // androidx.recyclerview.widget.OooOOO.OooO0O0
        public final int OooO0Oo() {
            return this.f106302OooO0O0.size();
        }

        @Override // androidx.recyclerview.widget.OooOOO.OooO0O0
        public final int OooO0o0() {
            return this.f106301OooO00o.size();
        }
    }

    /* JADX INFO: renamed from: o0o00o00.OooO00o$OooO0O0 */
    public static final class OooO0O0 implements OooOo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final C29938OooO00o f106303OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final RunnableC29941OooO0Oo f106304OooO0O0;

        public OooO0O0(C29938OooO00o c29938OooO00o, RunnableC29941OooO0Oo runnableC29941OooO0Oo) {
            this.f106303OooO00o = c29938OooO00o;
            this.f106304OooO0O0 = runnableC29941OooO0Oo;
        }

        @Override // androidx.recyclerview.widget.OooOo
        public final void OooO00o(int i, int i2, Object obj) {
            this.f106303OooO00o.notifyItemRangeChanged(i, i2, obj);
            RunnableC29941OooO0Oo runnableC29941OooO0Oo = this.f106304OooO0O0;
            if (runnableC29941OooO0Oo != null) {
                runnableC29941OooO0Oo.run();
            }
        }

        @Override // androidx.recyclerview.widget.OooOo
        public final void OooO0O0(int i, int i2) {
            this.f106303OooO00o.notifyItemRangeInserted(i, i2);
            RunnableC29941OooO0Oo runnableC29941OooO0Oo = this.f106304OooO0O0;
            if (runnableC29941OooO0Oo != null) {
                runnableC29941OooO0Oo.run();
            }
        }

        @Override // androidx.recyclerview.widget.OooOo
        public final void OooO0OO(int i, int i2) {
            this.f106303OooO00o.notifyItemRangeRemoved(i, i2);
            RunnableC29941OooO0Oo runnableC29941OooO0Oo = this.f106304OooO0O0;
            if (runnableC29941OooO0Oo != null) {
                runnableC29941OooO0Oo.run();
            }
        }

        @Override // androidx.recyclerview.widget.OooOo
        public final void OooO0Oo(int i, int i2) {
            this.f106303OooO00o.notifyItemMoved(i, i2);
            RunnableC29941OooO0Oo runnableC29941OooO0Oo = this.f106304OooO0O0;
            if (runnableC29941OooO0Oo != null) {
                runnableC29941OooO0Oo.run();
            }
        }
    }

    /* JADX INFO: renamed from: o0o00o00.OooO00o$OooO0OO */
    public final class OooO0OO extends RecyclerView.AbstractC22078OooOooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ImageView f106305OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final ImageView f106306OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final TextView f106307OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final View f106308OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final ImageView f106309OooO0o0;

        public OooO0OO(final C29938OooO00o c29938OooO00o, View view) {
            super(view);
            this.f106305OooO00o = (ImageView) view.findViewById(R.id.pen_icon);
            this.f106306OooO0O0 = (ImageView) view.findViewById(R.id.pen_color);
            this.f106307OooO0OO = (TextView) view.findViewById(R.id.tv_width);
            View viewFindViewById = view.findViewById(R.id.btn_remove);
            this.f106308OooO0Oo = viewFindViewById;
            this.f106309OooO0o0 = (ImageView) view.findViewById(R.id.tape_pen_tint);
            view.setOnClickListener(new View.OnClickListener() { // from class: o0o00o00.OooO0O0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    view2.setTag(this.f106311OooOo0o.f106306OooO0O0.getTag());
                    ViewOnClickListenerC28305OooO viewOnClickListenerC28305OooO = c29938OooO00o.f106300OooO0O0;
                    if (viewOnClickListenerC28305OooO != null) {
                        viewOnClickListenerC28305OooO.onClick(view2);
                    }
                }
            });
            viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: o0o00o00.OooO0OO
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ViewOnClickListenerC28305OooO viewOnClickListenerC28305OooO;
                    C29938OooO00o.OooO0OO oooO0OO = this.f106313OooOo0o;
                    if (oooO0OO.f106308OooO0Oo.getVisibility() == 0 && oooO0OO.f106308OooO0Oo.isEnabled() && (viewOnClickListenerC28305OooO = c29938OooO00o.f106300OooO0O0) != null) {
                        viewOnClickListenerC28305OooO.onClick(view2);
                    }
                }
            });
            C23991Oooooo0.OooO0O0(6, viewFindViewById);
        }

        public static void OooO0o(ImageView imageView, int i, FavoritePenVO favoritePenVO) {
            Matrix matrix = new Matrix();
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            if (favoritePenVO.getType() == 0 || favoritePenVO.getType() == 1 || favoritePenVO.getType() == 10 || favoritePenVO.getType() == 12) {
                float f = favoritePenVO.getOrientation() == 1 ? 18.0f : 17.0f;
                matrix.postScale(0.5f, 0.5f);
                matrix.postTranslate(f, 0.0f);
                imageView.setImageResource(i);
                imageView.setScaleType(ImageView.ScaleType.MATRIX);
                imageView.setImageMatrix(matrix);
                layoutParams.height = o000000O.OooO0o(37);
            } else {
                imageView.setImageResource(i);
                imageView.setScaleType(ImageView.ScaleType.FIT_START);
                layoutParams.height = -2;
            }
            imageView.setLayoutParams(layoutParams);
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, java.util.Map] */
        /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.Map] */
        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.util.Map] */
        /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, java.util.Map] */
        /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, java.util.Map] */
        public final void OooO00o(FavoritePenVO item, Bundle bundle) {
            int iIntValue;
            Integer num;
            Integer num2;
            OooOOO0.OooO0oO(item, "item");
            ImageView imageView = this.f106306OooO0O0;
            imageView.setTag(item);
            this.f106308OooO0Oo.setTag(item);
            if (bundle != null && !bundle.isEmpty()) {
                Set<String> setKeySet = bundle.keySet();
                OooOOO0.OooO0o(setKeySet, "keySet(...)");
                for (String str : setKeySet) {
                    if (str != null) {
                        switch (str.hashCode()) {
                            case 94842723:
                                if (str.equals("color")) {
                                    OooO0O0(item);
                                }
                                break;
                            case 113126854:
                                if (str.equals("width")) {
                                    OooO0o0(item);
                                }
                                break;
                            case 1191572123:
                                if (str.equals("selected")) {
                                    OooO0Oo(item);
                                }
                                break;
                            case 1602416228:
                                if (str.equals("editable")) {
                                    OooO0OO(item);
                                }
                                break;
                        }
                    }
                }
                return;
            }
            int iIntValue2 = 0;
            switch (item.getType()) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                    Integer num3 = (Integer) C29938OooO00o.f106294OooO0OO.get(Integer.valueOf(item.getType()));
                    iIntValue = num3 != null ? num3.intValue() : 0;
                    break;
                case 5:
                case 6:
                default:
                    iIntValue = 0;
                    break;
                case 7:
                    String penSubType = item.getPenSubType();
                    if (OooOOO0.OooO0O0(penSubType, "line")) {
                        iIntValue = R.drawable.ic_ni_favorite_toolbox_line_laser;
                    } else if (OooOOO0.OooO0O0(penSubType, "spot")) {
                        iIntValue = R.drawable.ic_ni_favorite_toolbox_spot_laser;
                    } else {
                        iIntValue = 0;
                    }
                    break;
            }
            switch (item.getType()) {
                case 0:
                case 1:
                case 2:
                case 9:
                case 10:
                case 11:
                case 12:
                    Integer num4 = (Integer) C29938OooO00o.f106295OooO0Oo.get(Integer.valueOf(item.getType()));
                    if (num4 != null) {
                        iIntValue2 = num4.intValue();
                    }
                    break;
                case 3:
                    String penSubType2 = item.getPenSubType();
                    if (penSubType2 != null && (num = (Integer) C29938OooO00o.f106296OooO0o.get(penSubType2)) != null) {
                        iIntValue2 = num.intValue();
                    }
                    break;
                case 4:
                    String penSubType3 = item.getPenSubType();
                    if (penSubType3 != null && (num2 = (Integer) C29938OooO00o.f106297OooO0o0.get(penSubType3)) != null) {
                        iIntValue2 = num2.intValue();
                    }
                    break;
                case 7:
                    String penSubType4 = item.getPenSubType();
                    if (OooOOO0.OooO0O0(penSubType4, "line")) {
                        iIntValue2 = R.drawable.ic_ni_favorite_toolbox_line_laser_color;
                    } else if (OooOOO0.OooO0O0(penSubType4, "spot")) {
                        iIntValue2 = R.drawable.ic_ni_favorite_toolbox_spot_laser_color;
                    }
                    break;
                case 8:
                    String penSubType5 = item.getPenSubType();
                    Integer num5 = (Integer) C29938OooO00o.f106298OooO0oO.get(Integer.valueOf(penSubType5 != null ? Integer.parseInt(penSubType5) : -1));
                    if (num5 != null) {
                        iIntValue2 = num5.intValue();
                    }
                    break;
            }
            ImageView icon = this.f106305OooO00o;
            OooOOO0.OooO0o(icon, "icon");
            OooO0o(icon, iIntValue, item);
            OooO0o(imageView, iIntValue2, item);
            OooO0O0(item);
            OooO0o0(item);
            OooO0Oo(item);
            OooO0OO(item);
            int orientation = item.getOrientation();
            ImageView imageView2 = this.f106309OooO0o0;
            if (orientation == 1) {
                if (item.getType() == 8 || item.getType() == 3 || item.getType() == 4) {
                    icon.setRotation(0.0f);
                    imageView.setRotation(0.0f);
                    return;
                } else {
                    icon.setRotation(90.0f);
                    imageView.setRotation(90.0f);
                    imageView2.setRotation(90.0f);
                    return;
                }
            }
            if (item.getType() == 8 || item.getType() == 3 || item.getType() == 4) {
                icon.setRotation(90.0f);
                imageView.setRotation(90.0f);
            } else {
                icon.setRotation(270.0f);
                imageView.setRotation(270.0f);
                imageView2.setRotation(270.0f);
            }
        }

        public final void OooO0O0(FavoritePenVO favoritePenVO) {
            int type = favoritePenVO.getType();
            ImageView imageView = this.f106306OooO0O0;
            if (type == 4 || favoritePenVO.getType() == 3 || favoritePenVO.getType() == 11) {
                imageView.setImageTintList(null);
            } else {
                imageView.setImageTintList(ColorStateList.valueOf(favoritePenVO.getColor()));
            }
            int type2 = favoritePenVO.getType();
            ImageView tapeTintView = this.f106309OooO0o0;
            if (type2 != 11) {
                OooOOO0.OooO0o(tapeTintView, "tapeTintView");
                tapeTintView.setVisibility(8);
            } else {
                OooOOO0.OooO0o(tapeTintView, "tapeTintView");
                tapeTintView.setVisibility(0);
                tapeTintView.getDrawable().setTint(C24969OooOO0.OooO0OO(favoritePenVO.getColor()));
            }
        }

        public final void OooO0OO(FavoritePenVO favoritePenVO) {
            boolean editable = favoritePenVO.getEditable();
            View view = this.f106308OooO0Oo;
            if (editable) {
                view.setVisibility(0);
                view.setEnabled(true);
                view.setClickable(true);
                view.setFocusable(true);
                return;
            }
            view.setVisibility(4);
            view.setEnabled(false);
            view.setClickable(false);
            view.setFocusable(false);
        }

        public final void OooO0Oo(FavoritePenVO favoritePenVO) {
            if (favoritePenVO.getSelected()) {
                View view = this.itemView;
                view.setBackgroundColor(ContextCompat.getColor(view.getContext(), R.color.item_bg_color_pressed));
            } else {
                View view2 = this.itemView;
                view2.setBackgroundColor(ContextCompat.getColor(view2.getContext(), android.R.color.transparent));
            }
        }

        public final void OooO0o0(FavoritePenVO favoritePenVO) {
            String string;
            TextView width = this.f106307OooO0OO;
            OooOOO0.OooO0o(width, "width");
            width.setVisibility(favoritePenVO.getType() != 4 ? 0 : 8);
            if (favoritePenVO.getType() == 3) {
                string = String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(favoritePenVO.getWidth())}, 1));
            } else {
                string = width.getContext().getString(R.string.pen_width_text, Float.valueOf(favoritePenVO.getWidth()));
                OooOOO0.OooO0o(string, "getString(...)");
            }
            width.setText(string);
        }
    }

    public final void OooO0OO(List<FavoritePenVO> list, Runnable runnable) {
        OooOOO0.OooO0oO(list, "list");
        ArrayList arrayList = this.f106299OooO00o;
        OooOOO.C22035OooO0Oo c22035OooO0OoOooO00o = OooOOO.OooO00o(new C20032OooO00o(arrayList, list));
        arrayList.clear();
        arrayList.addAll(list);
        c22035OooO0OoOooO00o.OooO00o(new OooO0O0(this, (RunnableC29941OooO0Oo) runnable));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final int getItemCount() {
        return this.f106299OooO00o.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final int getItemViewType(int i) {
        return ((FavoritePenVO) this.f106299OooO00o.get(i)).getOrientation() == 1 ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, int i) {
        OooO0OO holder = (OooO0OO) abstractC22078OooOooO;
        OooOOO0.OooO0oO(holder, "holder");
        holder.OooO00o((FavoritePenVO) this.f106299OooO00o.get(i), null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final RecyclerView.AbstractC22078OooOooO onCreateViewHolder(ViewGroup parent, int i) {
        OooOOO0.OooO0oO(parent, "parent");
        View viewOooO0O0 = i == 1 ? com.aspose.slides.internal.p332p7.OooO0OO.OooO0O0(parent, R.layout.item_favorite_toolbox_pen, parent, false) : com.aspose.slides.internal.p332p7.OooO0OO.OooO0O0(parent, R.layout.item_favorite_toolbox_pen_horizontal, parent, false);
        OooOOO0.OooO0Oo(viewOooO0O0);
        return new OooO0OO(this, viewOooO0O0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, int i, List payloads) {
        OooO0OO holder = (OooO0OO) abstractC22078OooOooO;
        OooOOO0.OooO0oO(holder, "holder");
        OooOOO0.OooO0oO(payloads, "payloads");
        if (payloads.isEmpty()) {
            super.onBindViewHolder(holder, i, payloads);
            return;
        }
        Object obj = payloads.get(0);
        OooOOO0.OooO0o0(obj, "null cannot be cast to non-null type android.os.Bundle");
        holder.OooO00o((FavoritePenVO) this.f106299OooO00o.get(i), (Bundle) obj);
    }
}
