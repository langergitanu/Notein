package o0o0OOo0;

import OooOoO.C20504OooO0O0;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.recyclerview.widget.AbstractC22050OooOo0o;
import androidx.recyclerview.widget.OooOOO;
import androidx.recyclerview.widget.RecyclerView;
import com.android.billingclient.api.OooOO0O;
import com.orion.notein.domain.models.transactions.google.GoogleBillingConstants;
import com.orion.notein.global.R;
import java.text.NumberFormat;
import java.time.temporal.ChronoUnit;
import java.util.Currency;
import kotlin.jvm.internal.OooOOO0;
import o0O0oO.ViewOnClickListenerC26091OooO00o;
import o0OoO000.OooO0o;
import o0oOoOo.C31042OooOOO0;
import oO00ooO.C32447OooOOo;

/* JADX INFO: renamed from: o0o0OOo0.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30549OooO0OO extends AbstractC22050OooOo0o<C31042OooOOO0, OooO0O0> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public ViewOnClickListenerC26091OooO00o f109275OooO0O0;

    /* JADX INFO: renamed from: o0o0OOo0.OooO0OO$OooO00o */
    public static final class OooO00o extends OooOOO.AbstractC22036OooO0o0<C31042OooOOO0> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO00o f109276OooO00o = new OooO00o();

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO00o(C31042OooOOO0 c31042OooOOO0, C31042OooOOO0 c31042OooOOO02) {
            return false;
        }

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO0O0(C31042OooOOO0 c31042OooOOO0, C31042OooOOO0 c31042OooOOO02) {
            return OooOOO0.OooO0O0(c31042OooOOO0.OooO0OO(), c31042OooOOO02.OooO0OO());
        }
    }

    /* JADX INFO: renamed from: o0o0OOo0.OooO0OO$OooO0O0 */
    public final class OooO0O0 extends RecyclerView.AbstractC22078OooOooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final CheckBox f109277OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final TextView f109278OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final TextView f109279OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final TextView f109280OooO0Oo;

        /* JADX INFO: renamed from: o0o0OOo0.OooO0OO$OooO0O0$OooO00o */
        public /* synthetic */ class OooO00o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public static final /* synthetic */ int[] f109281OooO00o;

            static {
                int[] iArr = new int[ChronoUnit.values().length];
                try {
                    iArr[ChronoUnit.YEARS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ChronoUnit.MONTHS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f109281OooO00o = iArr;
            }
        }

        public OooO0O0(C30549OooO0OO c30549OooO0OO, View view) {
            super(view);
            this.f109277OooO00o = (CheckBox) view.findViewById(R.id.cb_selected);
            this.f109278OooO0O0 = (TextView) view.findViewById(R.id.tv_product_title);
            this.f109279OooO0OO = (TextView) view.findViewById(R.id.tv_product_description);
            this.f109280OooO0Oo = (TextView) view.findViewById(R.id.tv_discount_tag);
            view.setOnClickListener(new OooO0o(c30549OooO0OO, 4));
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x022f  */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, int i) {
        String str;
        OooO0O0 holder = (OooO0O0) abstractC22078OooOooO;
        OooOOO0.OooO0oO(holder, "holder");
        C31042OooOOO0 c31042OooOOO0OooO0OO = OooO0OO(i);
        OooOOO0.OooO0o(c31042OooOOO0OooO0OO, "getItem(...)");
        C31042OooOOO0 c31042OooOOO0 = c31042OooOOO0OooO0OO;
        holder.itemView.setTag(c31042OooOOO0);
        Context context = holder.itemView.getContext();
        ChronoUnit chronoUnit = c31042OooOOO0.f110831OooO0o0;
        OooOO0O.OooO00o oooO00o = c31042OooOOO0.f110827OooO0O0;
        TextView textView = holder.f109278OooO0O0;
        if (oooO00o != null) {
            OooOOO0.OooO0Oo(context);
            textView.setText(context.getString(R.string.plan_title_lifetime));
        } else {
            OooOOO0.OooO0Oo(context);
            int i2 = OooO0O0.OooO00o.f109281OooO00o[chronoUnit.ordinal()];
            if (i2 == 1) {
                textView.setText(context.getString(R.string.plan_title_annual));
            } else {
                if (i2 != 2) {
                    throw new IllegalArgumentException("Unsupported billing period unit: " + chronoUnit);
                }
                textView.setText(context.getString(R.string.plan_title_monthly));
            }
        }
        Context context2 = holder.itemView.getContext();
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
        currencyInstance.setMaximumFractionDigits(2);
        currencyInstance.setCurrency(Currency.getInstance(c31042OooOOO0.f110832OooO0oO));
        String str2 = currencyInstance.format(Float.valueOf((c31042OooOOO0.f110830OooO0o * 1.0f) / 1000000));
        TextView textView2 = holder.f109279OooO0OO;
        if (oooO00o != null) {
            OooOOO0.OooO0Oo(context2);
            OooOOO0.OooO0Oo(str2);
            textView2.setText(context2.getString(R.string.plan_content_lifetime, str2));
        } else {
            OooOOO0.OooO0Oo(context2);
            OooOOO0.OooO0Oo(str2);
            int i3 = OooO0O0.OooO00o.f109281OooO00o[chronoUnit.ordinal()];
            C32447OooOOo c32447OooOOo = c31042OooOOO0.f110834OooOO0;
            if (i3 == 1) {
                C32447OooOOo c32447OooOOo2 = c31042OooOOO0.f110835OooOO0O;
                if (((Boolean) c32447OooOOo2.getValue()).booleanValue() && ((Boolean) c32447OooOOo.getValue()).booleanValue()) {
                    String strOooO0O0 = c31042OooOOO0.OooO0O0(context2);
                    if (strOooO0O0 != null) {
                        textView2.setText(context2.getString(R.string.plan_content_annual_with_free_trial_and_discount, strOooO0O0, str2));
                    } else {
                        textView2.setText(context2.getString(R.string.plan_content_annual_with_free_trial, str2));
                    }
                } else if (((Boolean) c32447OooOOo2.getValue()).booleanValue()) {
                    String strOooO0O02 = c31042OooOOO0.OooO0O0(context2);
                    if (strOooO0O02 != null) {
                        textView2.setText(context2.getString(R.string.plan_content_annual_with_discount, strOooO0O02, str2));
                    } else {
                        textView2.setText(context2.getString(R.string.plan_content_annual, str2));
                    }
                } else if (((Boolean) c32447OooOOo.getValue()).booleanValue()) {
                    textView2.setText(context2.getString(R.string.plan_content_annual_with_free_trial, str2));
                } else {
                    textView2.setText(context2.getString(R.string.plan_content_annual, str2));
                }
            } else {
                if (i3 != 2) {
                    throw new IllegalArgumentException("Unsupported billing period unit: " + chronoUnit);
                }
                if (((Boolean) c32447OooOOo.getValue()).booleanValue()) {
                    textView2.setText(context2.getString(R.string.plan_content_monthly_with_free_trial, str2));
                } else {
                    textView2.setText(context2.getString(R.string.plan_content_monthly, str2));
                }
            }
        }
        Context context3 = holder.itemView.getContext();
        OooOOO0.OooO0o(context3, "getContext(...)");
        String string = null;
        OooOO0O.C22163OooO0Oo c22163OooO0Oo = c31042OooOOO0.f110828OooO0OO;
        if (c22163OooO0Oo != null && (str = c22163OooO0Oo.f66968OooO0O0) != null) {
            switch (str.hashCode()) {
                case -2141895510:
                    if (str.equals(GoogleBillingConstants.GOOGLE_TAG_DISCOUNT_40_OFF)) {
                        string = context3.getString(R.string.discount_tag_40_off);
                    }
                    break;
                case -2113266359:
                    if (str.equals(GoogleBillingConstants.GOOGLE_TAG_DISCOUNT_50_OFF)) {
                        string = context3.getString(R.string.discount_tag_50_off);
                    }
                    break;
                case -1156051079:
                    if (str.equals("discount-50-off-free-trial")) {
                    }
                    break;
                case -921012874:
                    if (str.equals("discount-20-off-free-trial")) {
                        string = context3.getString(R.string.discount_tag_20_off);
                    }
                    break;
                case 432296823:
                    if (str.equals("discount-30-off-free-trial")) {
                        string = context3.getString(R.string.discount_tag_30_off);
                    }
                    break;
                case 1785606520:
                    if (str.equals("discount-40-off-free-trial")) {
                    }
                    break;
                case 2020644725:
                    if (str.equals("discount-10-off-free-trial")) {
                        string = context3.getString(R.string.discount_tag_10_off);
                    }
                    break;
                case 2067184333:
                    if (str.equals(GoogleBillingConstants.GOOGLE_TAG_DISCOUNT_10_OFF)) {
                    }
                    break;
                case 2095813484:
                    if (str.equals(GoogleBillingConstants.GOOGLE_TAG_DISCOUNT_20_OFF)) {
                    }
                    break;
                case 2124442635:
                    if (str.equals(GoogleBillingConstants.GOOGLE_TAG_DISCOUNT_30_OFF)) {
                    }
                    break;
            }
        }
        TextView discountTag = holder.f109280OooO0Oo;
        OooOOO0.OooO0o(discountTag, "discountTag");
        discountTag.setVisibility(string != null ? 0 : 8);
        discountTag.setText(string);
        CheckBox checkBox = holder.f109277OooO00o;
        boolean z = c31042OooOOO0.f110833OooO0oo;
        checkBox.setChecked(z);
        holder.itemView.setSelected(z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final RecyclerView.AbstractC22078OooOooO onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewOooO0OO = C20504OooO0O0.OooO0OO(viewGroup, "parent", R.layout.item_entry_google_vip_product, viewGroup, false);
        OooOOO0.OooO0Oo(viewOooO0OO);
        return new OooO0O0(this, viewOooO0OO);
    }
}
