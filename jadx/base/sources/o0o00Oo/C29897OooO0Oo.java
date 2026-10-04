package o0o00Oo;

import OooOoO.C20504OooO0O0;
import Oooo0.o000000O;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.AbstractC22050OooOo0o;
import androidx.recyclerview.widget.OooOOO;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.global.R;
import java.util.List;
import java.util.Set;
import o0Oo0ooO.ViewOnClickListenerC28408OooO0O0;
import o0oOoOo.C31045OooOOo;

/* JADX INFO: renamed from: o0o00Oo.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29897OooO0Oo extends AbstractC22050OooOo0o<C31045OooOOo, OooO0O0> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f106065OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f106066OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f106067OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public ViewOnClickListenerC28408OooO0O0 f106068OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f106069OooO0o0;

    /* JADX INFO: renamed from: o0o00Oo.OooO0Oo$OooO00o */
    public static final class OooO00o extends OooOOO.AbstractC22036OooO0o0<C31045OooOOo> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO00o f106070OooO00o = new OooO00o();

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO00o(C31045OooOOo c31045OooOOo, C31045OooOOo c31045OooOOo2) {
            return c31045OooOOo.equals(c31045OooOOo2);
        }

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO0O0(C31045OooOOo c31045OooOOo, C31045OooOOo c31045OooOOo2) {
            return c31045OooOOo.f110844OooO00o == c31045OooOOo2.f110844OooO00o;
        }

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final Object OooO0OO(C31045OooOOo c31045OooOOo, C31045OooOOo c31045OooOOo2) {
            C31045OooOOo c31045OooOOo3 = c31045OooOOo;
            C31045OooOOo c31045OooOOo4 = c31045OooOOo2;
            Bundle bundle = new Bundle();
            if (c31045OooOOo3.f110845OooO0O0 != c31045OooOOo4.f110845OooO0O0) {
                bundle.putBoolean("selected", true);
            }
            if (c31045OooOOo3.f110844OooO00o != c31045OooOOo4.f110844OooO00o) {
                bundle.putBoolean("duration", true);
            }
            return bundle;
        }
    }

    /* JADX INFO: renamed from: o0o00Oo.OooO0Oo$OooO0O0 */
    public static final class OooO0O0 extends RecyclerView.AbstractC22078OooOooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final TextView f106071OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final ImageView f106072OooO0O0;

        public OooO0O0(View view) {
            super(view);
            View viewFindViewById = view.findViewById(R.id.tv_duration);
            kotlin.jvm.internal.OooOOO0.OooO0o(viewFindViewById, "findViewById(...)");
            this.f106071OooO00o = (TextView) viewFindViewById;
            View viewFindViewById2 = view.findViewById(R.id.iv_selected);
            kotlin.jvm.internal.OooOOO0.OooO0o(viewFindViewById2, "findViewById(...)");
            this.f106072OooO0O0 = (ImageView) viewFindViewById2;
        }

        public final void OooO00o(C31045OooOOo c31045OooOOo, Bundle bundle) {
            this.itemView.setTag(c31045OooOOo);
            ImageView imageView = this.f106072OooO0O0;
            boolean z = c31045OooOOo.f110845OooO0O0;
            if (bundle == null) {
                OooO0O0(c31045OooOOo);
                imageView.setSelected(z);
                return;
            }
            if (bundle.isEmpty()) {
                OooO0O0(c31045OooOOo);
                imageView.setSelected(z);
                return;
            }
            Set<String> setKeySet = bundle.keySet();
            kotlin.jvm.internal.OooOOO0.OooO0o(setKeySet, "keySet(...)");
            for (String str : setKeySet) {
                if (kotlin.jvm.internal.OooOOO0.OooO0O0(str, "duration")) {
                    OooO0O0(c31045OooOOo);
                } else if (kotlin.jvm.internal.OooOOO0.OooO0O0(str, "selected")) {
                    imageView.setSelected(z);
                }
            }
        }

        public final void OooO0O0(C31045OooOOo c31045OooOOo) {
            int i = c31045OooOOo.f110844OooO00o;
            TextView textView = this.f106071OooO00o;
            textView.setText(i < 0 ? textView.getContext().getString(R.string.laser_disappear_after_next_stroke) : textView.getContext().getString(R.string.laser_disappear_after_n_s, String.valueOf(i)));
        }
    }

    public C29897OooO0Oo() {
        this(0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, int i) {
        OooO0O0 holder = (OooO0O0) abstractC22078OooOooO;
        kotlin.jvm.internal.OooOOO0.OooO0oO(holder, "holder");
        C31045OooOOo c31045OooOOoOooO0OO = OooO0OO(i);
        kotlin.jvm.internal.OooOOO0.OooO0Oo(c31045OooOOoOooO0OO);
        holder.OooO00o(c31045OooOOoOooO0OO, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final RecyclerView.AbstractC22078OooOooO onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewOooO0OO = C20504OooO0O0.OooO0OO(viewGroup, "parent", R.layout.item_laser_display_setting, viewGroup, false);
        ViewGroup.LayoutParams layoutParams = viewOooO0OO.getLayoutParams();
        kotlin.jvm.internal.OooOOO0.OooO0o0(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(this.f106065OooO0O0, this.f106066OooO0OO, this.f106067OooO0Oo, this.f106069OooO0o0);
        viewOooO0OO.setOnClickListener(this.f106068OooO0o);
        return new OooO0O0(viewOooO0OO);
    }

    public /* synthetic */ C29897OooO0Oo(int i) {
        this(o000000O.OooO0o(7), o000000O.OooO0o(0), o000000O.OooO0o(7), o000000O.OooO0o(0));
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
        C31045OooOOo c31045OooOOoOooO0OO = OooO0OO(i);
        kotlin.jvm.internal.OooOOO0.OooO0o(c31045OooOOoOooO0OO, "getItem(...)");
        holder.OooO00o(c31045OooOOoOooO0OO, (Bundle) obj);
    }

    public C29897OooO0Oo(int i, int i2, int i3, int i4) {
        super(OooO00o.f106070OooO00o);
        this.f106065OooO0O0 = i;
        this.f106066OooO0OO = i2;
        this.f106067OooO0Oo = i3;
        this.f106069OooO0o0 = i4;
    }
}
