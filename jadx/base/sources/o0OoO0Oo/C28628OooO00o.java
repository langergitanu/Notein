package o0OoO0Oo;

import OooOoO.C20504OooO0O0;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.C21650OooOoO;
import androidx.recyclerview.widget.AbstractC22050OooOo0o;
import androidx.recyclerview.widget.OooOOO;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.global.R;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import o0Oo0Ooo.ViewOnClickListenerC28141OooO0oO;
import o0Oo0ooO.ViewOnClickListenerC28427OooOo00;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OoO0Oo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28628OooO00o extends AbstractC22050OooOo0o<C28629OooO0O0, OooO0O0> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public ViewOnClickListenerC28427OooOo00 f101475OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final DecimalFormat f101476OooO0OO;

    /* JADX INFO: renamed from: o0OoO0Oo.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C19921OooO00o extends OooOOO.AbstractC22036OooO0o0<C28629OooO0O0> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final C19921OooO00o f101477OooO00o = new C19921OooO00o();

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO00o(C28629OooO0O0 c28629OooO0O0, C28629OooO0O0 c28629OooO0O02) {
            return c28629OooO0O0.equals(c28629OooO0O02);
        }

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO0O0(C28629OooO0O0 c28629OooO0O0, C28629OooO0O0 c28629OooO0O02) {
            return kotlin.jvm.internal.OooOOO0.OooO0O0(c28629OooO0O0.f101487OooO00o, c28629OooO0O02.f101487OooO00o);
        }
    }

    /* JADX INFO: renamed from: o0OoO0Oo.OooO00o$OooO0O0 */
    public final class OooO0O0 extends RecyclerView.AbstractC22078OooOooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final View f101478OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final View f101479OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final TextView f101480OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final TextView f101481OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final TextView f101482OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final TextView f101483OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final View f101484OooO0oO;

        public OooO0O0(View view) {
            super(view);
            this.f101478OooO00o = view.findViewById(R.id.section_price);
            this.f101479OooO0O0 = view.findViewById(R.id.section_origin_price);
            this.f101480OooO0OO = (TextView) view.findViewById(R.id.tv_price_value);
            this.f101481OooO0Oo = (TextView) view.findViewById(R.id.tv_origin_price_symbol);
            this.f101483OooO0o0 = (TextView) view.findViewById(R.id.tv_duration);
            this.f101482OooO0o = (TextView) view.findViewById(R.id.tv_top_banner_msg);
            this.f101484OooO0oO = view.findViewById(R.id.section_top);
            view.setOnClickListener(new ViewOnClickListenerC28141OooO0oO(C28628OooO00o.this, 1));
        }
    }

    public C28628OooO00o() {
        super(C19921OooO00o.f101477OooO00o);
        DecimalFormat decimalFormat = new DecimalFormat("0.##");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        decimalFormat.setGroupingUsed(false);
        this.f101476OooO0OO = decimalFormat;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, int i) {
        OooO0O0 holder = (OooO0O0) abstractC22078OooOooO;
        kotlin.jvm.internal.OooOOO0.OooO0oO(holder, "holder");
        C28629OooO0O0 c28629OooO0O0OooO0OO = OooO0OO(i);
        kotlin.jvm.internal.OooOOO0.OooO0o(c28629OooO0O0OooO0OO, "getItem(...)");
        C28629OooO0O0 c28629OooO0O0 = c28629OooO0O0OooO0OO;
        C34406OooO00o.f123390OooO00o.OooO00o("item: " + c28629OooO0O0, new Object[0]);
        View sectionPrice = holder.f101478OooO00o;
        kotlin.jvm.internal.OooOOO0.OooO0o(sectionPrice, "sectionPrice");
        boolean z = c28629OooO0O0.f101492OooO0o0;
        sectionPrice.setVisibility(!z ? 0 : 8);
        View sectionOriginPrice = holder.f101479OooO0O0;
        kotlin.jvm.internal.OooOOO0.OooO0o(sectionOriginPrice, "sectionOriginPrice");
        sectionOriginPrice.setVisibility(!z ? 0 : 8);
        TextView duration = holder.f101483OooO0o0;
        kotlin.jvm.internal.OooOOO0.OooO0o(duration, "duration");
        duration.setVisibility(!z ? 0 : 8);
        int iFloor = (int) Math.floor(c28629OooO0O0.f101490OooO0Oo / 43200.0f);
        duration.setText(iFloor >= 120 ? "永久会员" : C21650OooOoO.OooO00o(iFloor, "个月"));
        holder.itemView.setSelected(c28629OooO0O0.f101486OooO);
        View sectionTop = holder.f101484OooO0oO;
        kotlin.jvm.internal.OooOOO0.OooO0o(sectionTop, "sectionTop");
        String str = c28629OooO0O0.f101491OooO0o;
        sectionTop.setVisibility(str.length() > 0 ? 0 : 8);
        TextView topBannerMsg = holder.f101482OooO0o;
        kotlin.jvm.internal.OooOOO0.OooO0o(topBannerMsg, "topBannerMsg");
        topBannerMsg.setVisibility(str.length() <= 0 ? 8 : 0);
        topBannerMsg.setText(str);
        DecimalFormat decimalFormat = C28628OooO00o.this.f101476OooO0OO;
        String str2 = decimalFormat.format(c28629OooO0O0.f101488OooO0O0);
        kotlin.jvm.internal.OooOOO0.OooO0o(str2, "format(...)");
        holder.f101480OooO0OO.setText(str2);
        String str3 = decimalFormat.format(c28629OooO0O0.f101489OooO0OO);
        kotlin.jvm.internal.OooOOO0.OooO0o(str3, "format(...)");
        holder.f101481OooO0Oo.setText("¥".concat(str3));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final RecyclerView.AbstractC22078OooOooO onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewOooO0OO = C20504OooO0O0.OooO0OO(viewGroup, "parent", R.layout.item_commodity, viewGroup, false);
        kotlin.jvm.internal.OooOOO0.OooO0Oo(viewOooO0OO);
        return new OooO0O0(viewOooO0OO);
    }
}
