package o0Ooo0oo;

import OooOoO.C20504OooO0O0;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.AbstractC22050OooOo0o;
import androidx.recyclerview.widget.OooOOO;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.toolbox.VectorVO;
import o0o00Oo.C29907OooOo0;

/* JADX INFO: renamed from: o0Ooo0oo.o00Ooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29555o00Ooo extends AbstractC22050OooOo0o<VectorVO, OooO0O0> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public ViewOnClickListenerC29468OooOooo f104845OooO0O0;

    /* JADX INFO: renamed from: o0Ooo0oo.o00Ooo$OooO00o */
    public static final class OooO00o extends OooOOO.AbstractC22036OooO0o0<VectorVO> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO00o f104846OooO00o = new OooO00o();

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO00o(VectorVO vectorVO, VectorVO vectorVO2) {
            return vectorVO.equals(vectorVO2);
        }

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO0O0(VectorVO vectorVO, VectorVO vectorVO2) {
            return vectorVO.getType() == vectorVO2.getType();
        }
    }

    /* JADX INFO: renamed from: o0Ooo0oo.o00Ooo$OooO0O0 */
    public final class OooO0O0 extends RecyclerView.AbstractC22078OooOooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ImageView f104847OooO00o;

        public OooO0O0(View view) {
            super(view);
            this.f104847OooO00o = (ImageView) view.findViewById(R.id.vector_pen_type_img);
        }
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
        Integer num = (Integer) C29907OooOo0.f106109OooO0OO.get(Integer.valueOf(vectorVO.getType()));
        int iIntValue = num != null ? num.intValue() : R.drawable.ic_ni_graph_cube_selector;
        ImageView imageView = holder.f104847OooO00o;
        imageView.setImageResource(iIntValue);
        imageView.setSelected(vectorVO.getSelected());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final RecyclerView.AbstractC22078OooOooO onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewOooO0OO = C20504OooO0O0.OooO0OO(viewGroup, "parent", R.layout.item_pen_bar_vector_pen_type, viewGroup, false);
        viewOooO0OO.setOnClickListener(new o0OoO000.o0O0O00(this, 2));
        return new OooO0O0(viewOooO0OO);
    }
}
