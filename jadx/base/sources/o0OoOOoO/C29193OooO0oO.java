package o0OoOOoO;

import OooOoO.C20504OooO0O0;
import OooOoOO.C20519OooO0Oo;
import android.graphics.drawable.PictureDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.AbstractC22050OooOo0o;
import androidx.recyclerview.widget.OooOOO;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.global.R;
import java.io.File;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.OooOOO0;
import o00o00oO.C25291OooO0oO;
import o0Oo0oOo.ViewOnClickListenerC28305OooO;
import o0OoO000.ViewOnClickListenerC28565Ooooo00;
import o0oOo000.C30941OooO0O0;
import o0oOoOo.C31079OoooOoO;
import oO00ooO.C32447OooOOo;
import oO0o0O0o.C33595OooOOo;

/* JADX INFO: renamed from: o0OoOOoO.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29193OooO0oO extends AbstractC22050OooOo0o<C31079OoooOoO, OooO0OO> {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final C32447OooOOo f103539OooO0OO = C20519OooO0Oo.OooO0OO(new C29191OooO0o());

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public ViewOnClickListenerC28305OooO f103540OooO0O0;

    /* JADX INFO: renamed from: o0OoOOoO.OooO0oO$OooO00o */
    public static final class OooO00o {
    }

    /* JADX INFO: renamed from: o0OoOOoO.OooO0oO$OooO0O0 */
    public static final class OooO0O0 extends OooOOO.AbstractC22036OooO0o0<C31079OoooOoO> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO0O0 f103541OooO00o = new OooO0O0();

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO00o(C31079OoooOoO c31079OoooOoO, C31079OoooOoO c31079OoooOoO2) {
            return c31079OoooOoO.equals(c31079OoooOoO2);
        }

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO0O0(C31079OoooOoO c31079OoooOoO, C31079OoooOoO c31079OoooOoO2) {
            return OooOOO0.OooO0O0(c31079OoooOoO.f110919OooO0OO, c31079OoooOoO2.f110919OooO0OO);
        }

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final Object OooO0OO(C31079OoooOoO c31079OoooOoO, C31079OoooOoO c31079OoooOoO2) {
            C31079OoooOoO c31079OoooOoO3 = c31079OoooOoO;
            C31079OoooOoO c31079OoooOoO4 = c31079OoooOoO2;
            Bundle bundle = new Bundle();
            if (c31079OoooOoO3.f110921OooO0o != c31079OoooOoO4.f110921OooO0o) {
                bundle.putBoolean("selected", true);
            }
            if (c31079OoooOoO3.f110923OooO0oO != c31079OoooOoO4.f110923OooO0oO) {
                bundle.putBoolean("isMultiSelectMode", true);
            }
            if (!OooOOO0.OooO0O0(c31079OoooOoO3.f110919OooO0OO, c31079OoooOoO4.f110919OooO0OO)) {
                bundle.putBoolean("uri", true);
            }
            return bundle;
        }
    }

    /* JADX INFO: renamed from: o0OoOOoO.OooO0oO$OooO0OO */
    public final class OooO0OO extends RecyclerView.AbstractC22078OooOooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ImageView f103542OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final View f103543OooO0O0;

        public OooO0OO(View view) {
            super(view);
            this.f103542OooO00o = (ImageView) view.findViewById(R.id.iv_image);
            this.f103543OooO0O0 = view.findViewById(R.id.iv_select);
        }

        public final void OooO00o(C31079OoooOoO c31079OoooOoO, Bundle bundle) {
            this.itemView.setTag(c31079OoooOoO);
            if (bundle == null || bundle.isEmpty()) {
                OooO0O0(c31079OoooOoO);
                OooO0OO(c31079OoooOoO);
                return;
            }
            Set<String> setKeySet = bundle.keySet();
            OooOOO0.OooO0o(setKeySet, "keySet(...)");
            for (String str : setKeySet) {
                if (str != null) {
                    int iHashCode = str.hashCode();
                    if (iHashCode != -314788786) {
                        if (iHashCode != 116076) {
                            if (iHashCode == 1191572123 && str.equals("selected")) {
                                OooO0OO(c31079OoooOoO);
                            }
                        } else if (str.equals("uri")) {
                            OooO0O0(c31079OoooOoO);
                        }
                    } else if (str.equals("isMultiSelectMode")) {
                        OooO0OO(c31079OoooOoO);
                    }
                }
                OooO0O0(c31079OoooOoO);
                OooO0OO(c31079OoooOoO);
            }
        }

        public final void OooO0O0(C31079OoooOoO c31079OoooOoO) {
            String str = c31079OoooOoO.f110919OooO0OO;
            boolean zOooOOo0 = C33595OooOOo.OooOOo0(str, ".svg", true);
            ImageView imageView = this.f103542OooO00o;
            if (zOooOOo0) {
                com.bumptech.glide.OooO0OO.OooO0Oo(imageView.getContext()).OooO00o(PictureDrawable.class).OoooO(new C30941OooO0O0()).OoooOOO(new File(str)).OooO00o((C25291OooO0oO) C29193OooO0oO.f103539OooO0OO.getValue()).OoooO0(imageView);
            } else {
                com.bumptech.glide.OooO0OO.OooO0Oo(imageView.getContext()).OooO0oo(new File(str)).OooO00o((C25291OooO0oO) C29193OooO0oO.f103539OooO0OO.getValue()).OooO().OoooO0(imageView);
            }
        }

        public final void OooO0OO(C31079OoooOoO c31079OoooOoO) {
            View ivSelect = this.f103543OooO0O0;
            OooOOO0.OooO0o(ivSelect, "ivSelect");
            ivSelect.setVisibility(c31079OoooOoO.f110923OooO0oO ? 0 : 8);
            ivSelect.setActivated(c31079OoooOoO.f110921OooO0o);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, int i) {
        OooO0OO holder = (OooO0OO) abstractC22078OooOooO;
        OooOOO0.OooO0oO(holder, "holder");
        C31079OoooOoO c31079OoooOoOOooO0OO = OooO0OO(i);
        OooOOO0.OooO0o(c31079OoooOoOOooO0OO, "getItem(...)");
        holder.OooO00o(c31079OoooOoOOooO0OO, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final RecyclerView.AbstractC22078OooOooO onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewOooO0OO = C20504OooO0O0.OooO0OO(viewGroup, "parent", R.layout.item_latest_image, viewGroup, false);
        viewOooO0OO.setOnClickListener(new ViewOnClickListenerC28565Ooooo00(this, 1));
        return new OooO0OO(viewOooO0OO);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, int i, List payloads) {
        OooO0OO holder = (OooO0OO) abstractC22078OooOooO;
        OooOOO0.OooO0oO(holder, "holder");
        OooOOO0.OooO0oO(payloads, "payloads");
        if (payloads.isEmpty()) {
            C31079OoooOoO c31079OoooOoOOooO0OO = OooO0OO(i);
            OooOOO0.OooO0o(c31079OoooOoOOooO0OO, "getItem(...)");
            holder.OooO00o(c31079OoooOoOOooO0OO, null);
        } else {
            Object obj = payloads.get(0);
            OooOOO0.OooO0o0(obj, "null cannot be cast to non-null type android.os.Bundle");
            C31079OoooOoO c31079OoooOoOOooO0OO2 = OooO0OO(i);
            OooOOO0.OooO0o(c31079OoooOoOOooO0OO2, "getItem(...)");
            holder.OooO00o(c31079OoooOoOOooO0OO2, (Bundle) obj);
        }
    }
}
