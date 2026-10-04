package oO0OO;

import OooOoO.C20504OooO0O0;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.AbstractC22050OooOo0o;
import androidx.recyclerview.widget.OooOOO;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.global.R;
import java.util.List;
import kotlin.jvm.internal.OooOOO0;
import o0O0oO.ViewOnClickListenerC26091OooO00o;
import o0Oo0O0.C28050OooO0OO;
import o0OoO000.ViewOnClickListenerC28540OooOoOO;
import o0Ooo0oo.ViewOnClickListenerC29543o000O0o0;
import o0oOoOo.C31088OoooooO;

/* JADX INFO: renamed from: oO0OO.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32881OooO0oO extends AbstractC22050OooOo0o<C31088OoooooO, RecyclerView.AbstractC22078OooOooO> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public ViewOnClickListenerC29543o000O0o0 f118002OooO0O0;

    /* JADX INFO: renamed from: oO0OO.OooO0oO$OooO00o */
    public static final class OooO00o extends OooOOO.AbstractC22036OooO0o0<C31088OoooooO> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO00o f118003OooO00o = new OooO00o();

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO00o(C31088OoooooO c31088OoooooO, C31088OoooooO c31088OoooooO2) {
            return c31088OoooooO.equals(c31088OoooooO2);
        }

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO0O0(C31088OoooooO c31088OoooooO, C31088OoooooO c31088OoooooO2) {
            return true;
        }

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final Object OooO0OO(C31088OoooooO c31088OoooooO, C31088OoooooO c31088OoooooO2) {
            boolean z;
            C31088OoooooO c31088OoooooO3 = c31088OoooooO;
            C31088OoooooO c31088OoooooO4 = c31088OoooooO2;
            Bundle bundle = new Bundle();
            if (!OooOOO0.OooO0O0(c31088OoooooO4.f110954OooO00o, c31088OoooooO3.f110954OooO00o)) {
                return null;
            }
            String str = c31088OoooooO4.f110955OooO0O0;
            boolean z2 = true;
            if (OooOOO0.OooO0O0(str, c31088OoooooO3.f110955OooO0O0)) {
                z = false;
            } else {
                bundle.putString(NoteMeta.PROPERTY_TITLE, str);
                z = true;
            }
            long j = c31088OoooooO4.f110957OooO0Oo;
            if (j != c31088OoooooO3.f110957OooO0Oo) {
                bundle.putLong(NoteMeta.PROPERTY_LAST_MODIFICATION_TIME, j);
            } else {
                z2 = z;
            }
            boolean z3 = c31088OoooooO3.f110956OooO0OO;
            boolean z4 = c31088OoooooO4.f110956OooO0OO;
            if (z4 != z3) {
                bundle.putBoolean("isSelected", z4);
            }
            if (z2) {
                return bundle;
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: oO0OO.OooO0oO$OooO0O0 */
    public final class OooO0O0 extends RecyclerView.AbstractC22078OooOooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final TextView f118004OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final ImageView f118005OooO0O0;

        public OooO0O0(C32881OooO0oO c32881OooO0oO, View view) {
            super(view);
            View viewFindViewById = view.findViewById(R.id.tv_title);
            OooOOO0.OooO0o(viewFindViewById, "findViewById(...)");
            this.f118004OooO00o = (TextView) viewFindViewById;
            View viewFindViewById2 = view.findViewById(R.id.btn_more);
            OooOOO0.OooO0o(viewFindViewById2, "findViewById(...)");
            ImageView imageView = (ImageView) viewFindViewById2;
            this.f118005OooO0O0 = imageView;
            C28050OooO0OO.OooO00o(view, 1000L, new ViewOnClickListenerC26091OooO00o(c32881OooO0oO, 7));
            view.setOnContextClickListener(new ViewOnContextClickListenerC32882OooO0oo());
            imageView.setOnClickListener(new ViewOnClickListenerC28540OooOoOO(c32881OooO0oO, 8));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO holder, int i) {
        OooOOO0.OooO0oO(holder, "holder");
        OooO0O0 oooO0O0 = (OooO0O0) holder;
        C31088OoooooO c31088OoooooOOooO0OO = OooO0OO(i);
        OooOOO0.OooO0o(c31088OoooooOOooO0OO, "getItem(...)");
        C31088OoooooO c31088OoooooO = c31088OoooooOOooO0OO;
        oooO0O0.itemView.setTag(c31088OoooooO);
        oooO0O0.f118005OooO0O0.setTag(c31088OoooooO);
        String title = c31088OoooooO.f110955OooO0O0;
        OooOOO0.OooO0oO(title, "title");
        oooO0O0.f118004OooO00o.setText(title);
        oooO0O0.itemView.setSelected(c31088OoooooO.f110956OooO0OO);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final RecyclerView.AbstractC22078OooOooO onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewOooO0OO = C20504OooO0O0.OooO0OO(viewGroup, "parent", R.layout.item_text_recognize_session, viewGroup, false);
        OooOOO0.OooO0Oo(viewOooO0OO);
        return new OooO0O0(this, viewOooO0OO);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO holder, int i, List<Object> payloads) {
        OooOOO0.OooO0oO(holder, "holder");
        OooOOO0.OooO0oO(payloads, "payloads");
        if (!payloads.isEmpty()) {
            boolean z = false;
            Object obj = payloads.get(0);
            OooOOO0.OooO0o0(obj, "null cannot be cast to non-null type android.os.Bundle");
            Bundle bundle = (Bundle) obj;
            C31088OoooooO c31088OoooooOOooO0OO = OooO0OO(i);
            boolean z2 = true;
            if (bundle.containsKey("isSelected")) {
                ((OooO0O0) holder).itemView.setSelected(c31088OoooooOOooO0OO.f110956OooO0OO);
                z = true;
            }
            if (bundle.containsKey(NoteMeta.PROPERTY_TITLE)) {
                String title = c31088OoooooOOooO0OO.f110955OooO0O0;
                OooOOO0.OooO0oO(title, "title");
                ((OooO0O0) holder).f118004OooO00o.setText(title);
            } else {
                z2 = z;
            }
            bundle.containsKey(NoteMeta.PROPERTY_LAST_MODIFICATION_TIME);
            OooO0O0 oooO0O0 = (OooO0O0) holder;
            OooOOO0.OooO0Oo(c31088OoooooOOooO0OO);
            oooO0O0.itemView.setTag(c31088OoooooOOooO0OO);
            oooO0O0.f118005OooO0O0.setTag(c31088OoooooOOooO0OO);
            if (z2) {
                return;
            }
        }
        super.onBindViewHolder(holder, i, payloads);
    }
}
