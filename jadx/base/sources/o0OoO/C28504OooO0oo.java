package o0OoO;

import OooOoO.C20504OooO0O0;
import OooOoOO.C20519OooO0Oo;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.AbstractC22050OooOo0o;
import androidx.recyclerview.widget.OooOOO;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.global.R;
import java.util.List;
import java.util.Set;
import o00o00oO.C25291OooO0oO;
import o0Oo0o0o.ViewOnClickListenerC28223OooO;
import o0Oo0o0o.ViewOnClickListenerC28234OooOO0o;
import o0oOoOo.C31044OooOOOo;
import oO00ooO.C32447OooOOo;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OoO.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28504OooO0oo extends AbstractC22050OooOo0o<C31044OooOOOo, OooO0O0> {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final C32447OooOOo f101047OooO0OO = C20519OooO0Oo.OooO0OO(new C28503OooO0oO());

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public ViewOnClickListenerC28223OooO f101048OooO0O0;

    /* JADX INFO: renamed from: o0OoO.OooO0oo$OooO00o */
    public static final class OooO00o extends OooOOO.AbstractC22036OooO0o0<C31044OooOOOo> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO00o f101049OooO00o = new OooO00o();

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO00o(C31044OooOOOo c31044OooOOOo, C31044OooOOOo c31044OooOOOo2) {
            return c31044OooOOOo.equals(c31044OooOOOo2);
        }

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO0O0(C31044OooOOOo c31044OooOOOo, C31044OooOOOo c31044OooOOOo2) {
            return kotlin.jvm.internal.OooOOO0.OooO0O0(c31044OooOOOo.f110841OooO00o, c31044OooOOOo2.f110841OooO00o);
        }

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final Object OooO0OO(C31044OooOOOo c31044OooOOOo, C31044OooOOOo c31044OooOOOo2) {
            C31044OooOOOo c31044OooOOOo3 = c31044OooOOOo;
            C31044OooOOOo c31044OooOOOo4 = c31044OooOOOo2;
            Bundle bundle = new Bundle();
            if (c31044OooOOOo3.f110842OooO0O0 != c31044OooOOOo4.f110842OooO0O0) {
                bundle.putBoolean("selected", true);
            }
            if (c31044OooOOOo3.f110843OooO0OO != c31044OooOOOo4.f110843OooO0OO) {
                bundle.putBoolean("isMultiSelectMode", true);
            }
            if (!kotlin.jvm.internal.OooOOO0.OooO0O0(c31044OooOOOo3.f110841OooO00o, c31044OooOOOo4.f110841OooO00o)) {
                bundle.putBoolean("uri", true);
            }
            return bundle;
        }
    }

    /* JADX INFO: renamed from: o0OoO.OooO0oo$OooO0O0 */
    public final class OooO0O0 extends RecyclerView.AbstractC22078OooOooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ImageView f101050OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final View f101051OooO0O0;

        public OooO0O0(View view) {
            super(view);
            this.f101050OooO00o = (ImageView) view.findViewById(R.id.iv_image);
            this.f101051OooO0O0 = view.findViewById(R.id.iv_select);
        }

        public final void OooO00o(C31044OooOOOo c31044OooOOOo, Bundle bundle) {
            this.itemView.setTag(c31044OooOOOo);
            C34406OooO00o.f123390OooO00o.OooO00o("bundleList: " + bundle, new Object[0]);
            if (bundle == null || bundle.isEmpty()) {
                OooO0O0(c31044OooOOOo);
                OooO0OO(c31044OooOOOo);
                return;
            }
            Set<String> setKeySet = bundle.keySet();
            kotlin.jvm.internal.OooOOO0.OooO0o(setKeySet, "keySet(...)");
            for (String str : setKeySet) {
                if (str != null) {
                    int iHashCode = str.hashCode();
                    if (iHashCode != -314788786) {
                        if (iHashCode != 116076) {
                            if (iHashCode == 1191572123 && str.equals("selected")) {
                                OooO0OO(c31044OooOOOo);
                            }
                        } else if (str.equals("uri")) {
                            OooO0O0(c31044OooOOOo);
                        }
                    } else if (str.equals("isMultiSelectMode")) {
                        OooO0OO(c31044OooOOOo);
                    }
                }
                OooO0O0(c31044OooOOOo);
                OooO0OO(c31044OooOOOo);
            }
        }

        public final void OooO0O0(C31044OooOOOo c31044OooOOOo) {
            ImageView imageView = this.f101050OooO00o;
            com.bumptech.glide.OooO0OO.OooO0Oo(imageView.getContext()).OooO0oO(c31044OooOOOo.f110841OooO00o).OooO00o((C25291OooO0oO) C28504OooO0oo.f101047OooO0OO.getValue()).OoooO0(imageView);
        }

        public final void OooO0OO(C31044OooOOOo c31044OooOOOo) {
            View ivSelect = this.f101051OooO0O0;
            kotlin.jvm.internal.OooOOO0.OooO0o(ivSelect, "ivSelect");
            ivSelect.setVisibility(c31044OooOOOo.f110843OooO0OO ? 0 : 8);
            ivSelect.setActivated(c31044OooOOOo.f110842OooO0O0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, int i) {
        OooO0O0 holder = (OooO0O0) abstractC22078OooOooO;
        kotlin.jvm.internal.OooOOO0.OooO0oO(holder, "holder");
        C31044OooOOOo c31044OooOOOoOooO0OO = OooO0OO(i);
        kotlin.jvm.internal.OooOOO0.OooO0o(c31044OooOOOoOooO0OO, "getItem(...)");
        holder.OooO00o(c31044OooOOOoOooO0OO, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final RecyclerView.AbstractC22078OooOooO onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewOooO0OO = C20504OooO0O0.OooO0OO(viewGroup, "parent", R.layout.item_latest_image, viewGroup, false);
        viewOooO0OO.setOnClickListener(new ViewOnClickListenerC28234OooOO0o(this, 1));
        return new OooO0O0(viewOooO0OO);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, int i, List payloads) {
        OooO0O0 holder = (OooO0O0) abstractC22078OooOooO;
        kotlin.jvm.internal.OooOOO0.OooO0oO(holder, "holder");
        kotlin.jvm.internal.OooOOO0.OooO0oO(payloads, "payloads");
        if (payloads.isEmpty()) {
            C31044OooOOOo c31044OooOOOoOooO0OO = OooO0OO(i);
            kotlin.jvm.internal.OooOOO0.OooO0o(c31044OooOOOoOooO0OO, "getItem(...)");
            holder.OooO00o(c31044OooOOOoOooO0OO, null);
        } else {
            Object obj = payloads.get(0);
            kotlin.jvm.internal.OooOOO0.OooO0o0(obj, "null cannot be cast to non-null type android.os.Bundle");
            C31044OooOOOo c31044OooOOOoOooO0OO2 = OooO0OO(i);
            kotlin.jvm.internal.OooOOO0.OooO0o(c31044OooOOOoOooO0OO2, "getItem(...)");
            holder.OooO00o(c31044OooOOOoOooO0OO2, (Bundle) obj);
        }
    }
}
