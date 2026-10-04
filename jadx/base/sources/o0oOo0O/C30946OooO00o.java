package o0oOo0O;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.os.ConfigurationCompat;
import androidx.recyclerview.widget.AbstractC22050OooOo0o;
import androidx.recyclerview.widget.OooOOO;
import androidx.recyclerview.widget.RecyclerView;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.orion.niui.components.button.TextButtonView;
import com.orion.notein.global.R;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.jvm.internal.OooOOO0;
import o0Oo0o00.ViewOnClickListenerC28179Oooo0;
import o0oOoOo.C31034OooO0o;
import o0oo000O.OooOOOO;
import oO0o0O0o.C33595OooOOo;

/* JADX INFO: renamed from: o0oOo0O.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30946OooO00o extends AbstractC22050OooOo0o<C31034OooO0o, RecyclerView.AbstractC22078OooOooO> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public ViewOnClickListenerC28179Oooo0 f110595OooO0O0;

    /* JADX INFO: renamed from: o0oOo0O.OooO00o$OooO00o, reason: collision with other inner class name */
    public final class C20142OooO00o extends RecyclerView.AbstractC22078OooOooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final SimpleDateFormat f110596OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final TextView f110597OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final TextView f110598OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final TextButtonView f110599OooO0Oo;

        public C20142OooO00o(View view) {
            super(view);
            this.f110596OooO00o = new SimpleDateFormat("yyyy.MM.dd", Locale.CHINA);
            View viewFindViewById = view.findViewById(R.id.coupon_desc);
            OooOOO0.OooO0o(viewFindViewById, "findViewById(...)");
            this.f110597OooO0O0 = (TextView) viewFindViewById;
            View viewFindViewById2 = view.findViewById(R.id.coupon_date_desc);
            OooOOO0.OooO0o(viewFindViewById2, "findViewById(...)");
            this.f110598OooO0OO = (TextView) viewFindViewById2;
            View viewFindViewById3 = view.findViewById(R.id.btn_use);
            OooOOO0.OooO0o(viewFindViewById3, "findViewById(...)");
            this.f110599OooO0Oo = (TextButtonView) viewFindViewById3;
        }

        public final void OooO00o(Long l, long j) {
            TextView textView = this.f110598OooO0OO;
            SimpleDateFormat simpleDateFormat = this.f110596OooO00o;
            if (l == null) {
                textView.setText(simpleDateFormat.format(Long.valueOf(j)));
                return;
            }
            textView.setText(simpleDateFormat.format(l) + " - " + simpleDateFormat.format(Long.valueOf(j)));
        }
    }

    /* JADX INFO: renamed from: o0oOo0O.OooO00o$OooO0O0 */
    public static final class OooO0O0 extends OooOOO.AbstractC22036OooO0o0<C31034OooO0o> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO0O0 f110600OooO00o = new OooO0O0();

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO00o(C31034OooO0o c31034OooO0o, C31034OooO0o c31034OooO0o2) {
            return c31034OooO0o.equals(c31034OooO0o2);
        }

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO0O0(C31034OooO0o c31034OooO0o, C31034OooO0o c31034OooO0o2) {
            return OooOOO0.OooO0O0(c31034OooO0o.f110799OooO00o, c31034OooO0o2.f110799OooO00o);
        }
    }

    /* JADX INFO: renamed from: o0oOo0O.OooO00o$OooO0OO */
    public static final class OooO0OO extends RecyclerView.AbstractC22078OooOooO {
    }

    @Override // androidx.recyclerview.widget.AbstractC22050OooOo0o, androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final int getItemCount() {
        int itemCount = super.getItemCount();
        return itemCount + (itemCount > 0 ? 1 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final int getItemViewType(int i) {
        return i < super.getItemCount() ? 0 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO holder, int i) {
        OooOOO0.OooO0oO(holder, "holder");
        if (!(holder instanceof C20142OooO00o)) {
            if (holder instanceof OooO0OO) {
                return;
            }
            return;
        }
        C20142OooO00o c20142OooO00o = (C20142OooO00o) holder;
        C31034OooO0o c31034OooO0oOooO0OO = OooO0OO(i);
        OooOOO0.OooO0o(c31034OooO0oOooO0OO, "getItem(...)");
        C31034OooO0o c31034OooO0o = c31034OooO0oOooO0OO;
        ViewOnClickListenerC28179Oooo0 viewOnClickListenerC28179Oooo0 = this.f110595OooO0O0;
        TextButtonView textButtonView = c20142OooO00o.f110599OooO0Oo;
        textButtonView.setTag(c31034OooO0o);
        TextView textView = c20142OooO00o.f110597OooO0O0;
        boolean z = false;
        long j = c31034OooO0o.f110803OooO0o;
        Long l = c31034OooO0o.f110804OooO0o0;
        int i2 = c31034OooO0o.f110802OooO0Oo;
        int i3 = c31034OooO0o.f110800OooO0O0;
        if (i3 == 0) {
            Context context = c20142OooO00o.itemView.getContext();
            int i4 = OooOOOO.f111245OooO00o;
            DecimalFormat decimalFormat = new DecimalFormat("0.##");
            decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
            textView.setText(context.getString(R.string.cny_price, decimalFormat.format(i2 / 100.0f)));
            c20142OooO00o.OooO00o(l, j);
        } else if (i3 == 1) {
            Context context2 = c20142OooO00o.itemView.getContext();
            Locale locale = ConfigurationCompat.getLocales(context2.getResources().getConfiguration()).get(0);
            if (locale == null) {
                locale = Locale.getDefault();
            }
            if (i2 == 0) {
                textView.setText("Free VIP");
            } else if (C33595OooOOo.OooOOo(locale.getLanguage(), TranslateLanguage.CHINESE, true)) {
                textView.setText(context2.getString(R.string.cut_off_rate, Integer.valueOf(i2 / 10)));
            } else {
                textView.setText(context2.getString(R.string.cut_off_rate, Integer.valueOf(i2)));
            }
            c20142OooO00o.OooO00o(l, j);
        }
        String string = c20142OooO00o.itemView.getContext().getString(R.string.btn_use_coupon);
        OooOOO0.OooO0Oo(string);
        textButtonView.setText(string);
        boolean z2 = l == null || l.longValue() <= System.currentTimeMillis();
        boolean z3 = j >= System.currentTimeMillis();
        if (z2 && z3) {
            z = true;
        }
        textButtonView.setEnabled(z);
        if (viewOnClickListenerC28179Oooo0 != null) {
            textButtonView.setOnClickListener(viewOnClickListenerC28179Oooo0);
        } else {
            textButtonView.setOnClickListener(null);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final RecyclerView.AbstractC22078OooOooO onCreateViewHolder(ViewGroup parent, int i) {
        OooOOO0.OooO0oO(parent, "parent");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(parent.getContext());
        if (i == 0) {
            View viewInflate = layoutInflaterFrom.inflate(R.layout.item_coupon, parent, false);
            OooOOO0.OooO0o(viewInflate, "inflate(...)");
            return new C20142OooO00o(viewInflate);
        }
        View viewInflate2 = layoutInflaterFrom.inflate(R.layout.item_coupon_footer, parent, false);
        OooOOO0.OooO0o(viewInflate2, "inflate(...)");
        return new OooO0OO(viewInflate2);
    }
}
