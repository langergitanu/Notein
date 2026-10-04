package o0o00Oo;

import OooOoO.C20504OooO0O0;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.AbstractC22050OooOo0o;
import androidx.recyclerview.widget.OooOOO;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.network.embedded.C18437z2;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.p609vo.PenColorVO;
import java.util.List;
import java.util.Set;
import o0OoO000.ViewOnClickListenerC28535OooOo0;

/* JADX INFO: renamed from: o0o00Oo.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29904OooOOo extends AbstractC22050OooOo0o<PenColorVO, OooO0O0> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public View.OnClickListener f106100OooO0O0;

    /* JADX INFO: renamed from: o0o00Oo.OooOOo$OooO00o */
    public static final class OooO00o extends OooOOO.AbstractC22036OooO0o0<PenColorVO> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO00o f106101OooO00o = new OooO00o();

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO00o(PenColorVO penColorVO, PenColorVO penColorVO2) {
            return penColorVO.equals(penColorVO2);
        }

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO0O0(PenColorVO penColorVO, PenColorVO penColorVO2) {
            return true;
        }

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final Object OooO0OO(PenColorVO penColorVO, PenColorVO penColorVO2) {
            PenColorVO penColorVO3 = penColorVO;
            PenColorVO penColorVO4 = penColorVO2;
            Bundle bundle = new Bundle();
            if (penColorVO3.getType() != penColorVO4.getType()) {
                bundle.putBoolean(C18437z2.f56754h, true);
            }
            if (penColorVO3.getSelected() != penColorVO4.getSelected()) {
                bundle.putBoolean("selected", true);
            }
            if (penColorVO3.getColor() != penColorVO4.getColor()) {
                bundle.putBoolean("color", true);
            }
            if (penColorVO3.getEnable() != penColorVO4.getEnable()) {
                bundle.putBoolean("enable", true);
            }
            return bundle;
        }
    }

    /* JADX INFO: renamed from: o0o00Oo.OooOOo$OooO0O0 */
    public final class OooO0O0 extends RecyclerView.AbstractC22078OooOooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final View f106102OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final View f106103OooO0O0;

        public OooO0O0(View view) {
            super(view);
            this.f106102OooO00o = view.findViewById(R.id.color);
            this.f106103OooO0O0 = view.findViewById(R.id.selected);
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final void OooO00o(PenColorVO penColorVO, Bundle bundle) {
            this.itemView.setTag(penColorVO);
            if (bundle == null) {
                OooO0O0(penColorVO);
                OooO0OO(penColorVO);
                return;
            }
            if (bundle.isEmpty()) {
                OooO0O0(penColorVO);
                OooO0OO(penColorVO);
                return;
            }
            Set<String> setKeySet = bundle.keySet();
            kotlin.jvm.internal.OooOOO0.OooO0o(setKeySet, "keySet(...)");
            for (String str : setKeySet) {
                if (str != null) {
                    switch (str.hashCode()) {
                        case -1298848381:
                            if (str.equals("enable")) {
                                OooO0O0(penColorVO);
                                OooO0OO(penColorVO);
                            }
                            break;
                        case 3575610:
                            if (str.equals(C18437z2.f56754h)) {
                                OooO0O0(penColorVO);
                                OooO0OO(penColorVO);
                            }
                            break;
                        case 94842723:
                            if (str.equals("color")) {
                                OooO0O0(penColorVO);
                            }
                            break;
                        case 1191572123:
                            if (str.equals("selected")) {
                                OooO0OO(penColorVO);
                            }
                            break;
                    }
                }
            }
        }

        public final void OooO0O0(PenColorVO penColorVO) {
            int color;
            View view = this.f106102OooO00o;
            Drawable background = view.getBackground();
            kotlin.jvm.internal.OooOOO0.OooO0o0(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            GradientDrawable gradientDrawable = (GradientDrawable) background;
            if (penColorVO.getEnable()) {
                color = penColorVO.getColor();
            } else {
                color = (penColorVO.getColor() & 16777215) + (Math.min(255, Math.max(0, 102)) << 24);
            }
            gradientDrawable.setColor(color);
            view.setBackground(gradientDrawable);
        }

        public final void OooO0OO(PenColorVO penColorVO) {
            View selected = this.f106103OooO0O0;
            kotlin.jvm.internal.OooOOO0.OooO0o(selected, "selected");
            selected.setVisibility((penColorVO.getSelected() && penColorVO.getEnable()) ? 0 : 8);
        }
    }

    public C29904OooOOo() {
        super(OooO00o.f106101OooO00o);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, int i) {
        OooO0O0 holder = (OooO0O0) abstractC22078OooOooO;
        kotlin.jvm.internal.OooOOO0.OooO0oO(holder, "holder");
        PenColorVO penColorVOOooO0OO = OooO0OO(i);
        kotlin.jvm.internal.OooOOO0.OooO0o(penColorVOOooO0OO, "getItem(...)");
        holder.OooO00o(penColorVOOooO0OO, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final RecyclerView.AbstractC22078OooOooO onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewOooO0OO = C20504OooO0O0.OooO0OO(viewGroup, "parent", R.layout.item_toolbox_pen_color, viewGroup, false);
        viewOooO0OO.setOnClickListener(new ViewOnClickListenerC28535OooOo0(this, 2));
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
        Object obj = payloads.get(0);
        kotlin.jvm.internal.OooOOO0.OooO0o0(obj, "null cannot be cast to non-null type android.os.Bundle");
        PenColorVO penColorVOOooO0OO = OooO0OO(i);
        kotlin.jvm.internal.OooOOO0.OooO0o(penColorVOOooO0OO, "getItem(...)");
        holder.OooO00o(penColorVOOooO0OO, (Bundle) obj);
    }
}
