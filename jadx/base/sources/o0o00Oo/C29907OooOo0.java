package o0o00Oo;

import OooOoO.C20504OooO0O0;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.AbstractC22050OooOo0o;
import androidx.recyclerview.widget.OooOOO;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.toolbox.VectorVO;
import o0Oo0o00.ViewOnClickListenerC28154OooO0oO;
import o0OoOOo.ViewOnClickListenerC29131OooO0o;
import oO00ooO.C32443OooOOO;
import oOo000Oo.C34444Oooo0O0;

/* JADX INFO: renamed from: o0o00Oo.OooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29907OooOo0 extends AbstractC22050OooOo0o<VectorVO, OooO0O0> {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final Object f106109OooO0OO = C34444Oooo0O0.OooO0oo(new C32443OooOOO(7, Integer.valueOf(R.drawable.ic_ni_graph_line_selector)), new C32443OooOOO(0, Integer.valueOf(R.drawable.ic_ni_graph_curve_selector)), new C32443OooOOO(19, Integer.valueOf(R.drawable.ic_ni_graph_dotted_line_selector)), new C32443OooOOO(20, Integer.valueOf(R.drawable.ic_ni_graph_wave_selector)), new C32443OooOOO(21, Integer.valueOf(R.drawable.ic_ni_graph_coordinate_right_selector)), new C32443OooOOO(22, Integer.valueOf(R.drawable.ic_ni_graph_coordinate_2way_selector)), new C32443OooOOO(24, Integer.valueOf(R.drawable.ic_ni_graph_brace_selector)), new C32443OooOOO(23, Integer.valueOf(R.drawable.ic_ni_graph_coordinate_selector)), new C32443OooOOO(1, Integer.valueOf(R.drawable.ic_ni_graph_triangle_isosceles_selector)), new C32443OooOOO(3, Integer.valueOf(R.drawable.ic_ni_graph_square_selector)), new C32443OooOOO(9, Integer.valueOf(R.drawable.ic_ni_graph_hexagon_selector)), new C32443OooOOO(6, Integer.valueOf(R.drawable.ic_ni_graph_circle_selector)), new C32443OooOOO(8, Integer.valueOf(R.drawable.ic_ni_graph_ellipse_selector)), new C32443OooOOO(18, Integer.valueOf(R.drawable.ic_ni_graph_pantagon_selector)), new C32443OooOOO(10, Integer.valueOf(R.drawable.ic_ni_graph_heart_selector)), new C32443OooOOO(11, Integer.valueOf(R.drawable.ic_ni_graph_cube_selector)), new C32443OooOOO(13, Integer.valueOf(R.drawable.ic_ni_graph_triangular_prism_selector)), new C32443OooOOO(12, Integer.valueOf(R.drawable.ic_ni_graph_pyramid_selector)), new C32443OooOOO(14, Integer.valueOf(R.drawable.ic_ni_graph_cylinder_selector)), new C32443OooOOO(15, Integer.valueOf(R.drawable.ic_ni_graph_cone_selector)), new C32443OooOOO(16, Integer.valueOf(R.drawable.ic_ni_graph_sphere_selector)), new C32443OooOOO(17, Integer.valueOf(R.drawable.ic_ni_graph_sphere_half_selector)));

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public ViewOnClickListenerC28154OooO0oO f106110OooO0O0;

    /* JADX INFO: renamed from: o0o00Oo.OooOo0$OooO00o */
    public static final class OooO00o extends OooOOO.AbstractC22036OooO0o0<VectorVO> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO00o f106111OooO00o = new OooO00o();

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO00o(VectorVO vectorVO, VectorVO vectorVO2) {
            return vectorVO.equals(vectorVO2);
        }

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO0O0(VectorVO vectorVO, VectorVO vectorVO2) {
            return vectorVO.getType() == vectorVO2.getType();
        }
    }

    /* JADX INFO: renamed from: o0o00Oo.OooOo0$OooO0O0 */
    public final class OooO0O0 extends RecyclerView.AbstractC22078OooOooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ImageView f106112OooO00o;

        public OooO0O0(View view) {
            super(view);
            this.f106112OooO00o = (ImageView) view.findViewById(R.id.vector_pen_type_img);
        }
    }

    public C29907OooOo0() {
        super(OooO00o.f106111OooO00o);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Map] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, int i) {
        OooO0O0 holder = (OooO0O0) abstractC22078OooOooO;
        kotlin.jvm.internal.OooOOO0.OooO0oO(holder, "holder");
        VectorVO vectorVOOooO0OO = OooO0OO(i);
        kotlin.jvm.internal.OooOOO0.OooO0o(vectorVOOooO0OO, "getItem(...)");
        VectorVO vectorVO = vectorVOOooO0OO;
        holder.itemView.setTag(vectorVO);
        Integer num = (Integer) f106109OooO0OO.get(Integer.valueOf(vectorVO.getType()));
        int iIntValue = num != null ? num.intValue() : R.drawable.ic_ni_graph_cube_selector;
        ImageView imageView = holder.f106112OooO00o;
        imageView.setImageResource(iIntValue);
        imageView.setSelected(vectorVO.getSelected());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final RecyclerView.AbstractC22078OooOooO onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewOooO0OO = C20504OooO0O0.OooO0OO(viewGroup, "parent", R.layout.item_vector_pen_type, viewGroup, false);
        viewOooO0OO.setOnClickListener(new ViewOnClickListenerC29131OooO0o(this, 2));
        return new OooO0O0(viewOooO0OO);
    }
}
