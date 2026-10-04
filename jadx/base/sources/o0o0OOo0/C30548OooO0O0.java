package o0o0OOo0;

import OooOoO.C20504OooO0O0;
import android.content.Context;
import android.os.Bundle;
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
import kotlin.jvm.internal.OooOOO0;
import o0O0o0oO.o0Oo0oo;
import o0OoO000.ViewOnClickListenerC28526OooO0o0;
import o0oOoOo.C31042OooOOO0;

/* JADX INFO: renamed from: o0o0OOo0.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30548OooO0O0 extends AbstractC22050OooOo0o<C31042OooOOO0, C20105OooO0O0> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public o0Oo0oo f109269OooO0O0;

    /* JADX INFO: renamed from: o0o0OOo0.OooO0O0$OooO00o */
    public static final class OooO00o extends OooOOO.AbstractC22036OooO0o0<C31042OooOOO0> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO00o f109270OooO00o = new OooO00o();

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO00o(C31042OooOOO0 c31042OooOOO0, C31042OooOOO0 c31042OooOOO02) {
            return false;
        }

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO0O0(C31042OooOOO0 c31042OooOOO0, C31042OooOOO0 c31042OooOOO02) {
            return OooOOO0.OooO0O0(c31042OooOOO0.OooO0OO(), c31042OooOOO02.OooO0OO());
        }
    }

    /* JADX INFO: renamed from: o0o0OOo0.OooO0O0$OooO0O0, reason: collision with other inner class name */
    public final class C20105OooO0O0 extends RecyclerView.AbstractC22078OooOooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final CheckBox f109271OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final TextView f109272OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final TextView f109273OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final TextView f109274OooO0Oo;

        public C20105OooO0O0(C30548OooO0O0 c30548OooO0O0, View view) {
            super(view);
            this.f109271OooO00o = (CheckBox) view.findViewById(R.id.cb_selected);
            this.f109272OooO0O0 = (TextView) view.findViewById(R.id.tv_product_title);
            this.f109273OooO0OO = (TextView) view.findViewById(R.id.tv_product_description);
            this.f109274OooO0Oo = (TextView) view.findViewById(R.id.tv_discount_tag);
            view.setOnClickListener(new ViewOnClickListenerC28526OooO0o0(c30548OooO0O0, 4));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006c  */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, int i) {
        String string;
        C20105OooO0O0 holder = (C20105OooO0O0) abstractC22078OooOooO;
        OooOOO0.OooO0oO(holder, "holder");
        C31042OooOOO0 c31042OooOOO0OooO0OO = OooO0OO(i);
        OooOOO0.OooO0o(c31042OooOOO0OooO0OO, "getItem(...)");
        C31042OooOOO0 c31042OooOOO0 = c31042OooOOO0OooO0OO;
        holder.itemView.setTag(c31042OooOOO0);
        Context context = holder.itemView.getContext();
        OooOO0O.OooO00o oooO00o = c31042OooOOO0.f110827OooO0O0;
        OooOO0O oooOO0O = c31042OooOOO0.f110826OooO00o;
        if (oooO00o != null) {
            OooOOO0.OooO0Oo(context);
            OooOO0O.OooO00o OooO00o2 = oooOO0O.OooO00o();
            OooOOO0.OooO0Oo(OooO00o2);
            holder.f109272OooO0O0.setText(OooO00o2.f66954OooO00o);
        }
        Context context2 = holder.itemView.getContext();
        if (oooO00o != null) {
            OooOOO0.OooO0Oo(context2);
            String str = oooOO0O.f66947OooO0OO;
            int iHashCode = str.hashCode();
            if (iHashCode != -1374374669) {
                if (iHashCode == 1254436354 && str.equals(GoogleBillingConstants.GOOGLE_AI_QUOTA_10_IN_APP)) {
                    string = context2.getString(R.string.product_content_ai_quota_1);
                    OooOOO0.OooO0Oo(string);
                } else {
                    string = oooOO0O.f66949OooO0o;
                    OooOOO0.OooO0Oo(string);
                }
                holder.f109273OooO0OO.setText(string);
            } else {
                if (str.equals(GoogleBillingConstants.GOOGLE_AI_QUOTA_1_IN_APP)) {
                    string = context2.getString(R.string.product_content_ai_quota_0);
                    OooOOO0.OooO0Oo(string);
                }
                holder.f109273OooO0OO.setText(string);
            }
        }
        boolean zOooO0O0 = OooOOO0.OooO0O0(oooOO0O.f66947OooO0OO, GoogleBillingConstants.GOOGLE_AI_QUOTA_10_IN_APP);
        TextView discountTag = holder.f109274OooO0Oo;
        if (zOooO0O0) {
            String string2 = null;
            Bundle bundle = c31042OooOOO0.f110825OooO;
            Long lValueOf = bundle != null ? Long.valueOf(bundle.getLong(GoogleBillingConstants.GOOGLE_AI_QUOTA_1_IN_APP)) : null;
            if (lValueOf == null || lValueOf.longValue() == 0) {
                OooOOO0.OooO0o(discountTag, "discountTag");
                discountTag.setVisibility(8);
            } else {
                double dLongValue = (((double) 1) - (c31042OooOOO0.f110830OooO0o / (lValueOf.longValue() * ((long) 10)))) * ((double) 100);
                if (dLongValue < 0.0d) {
                    OooOOO0.OooO0o(discountTag, "discountTag");
                    discountTag.setVisibility(8);
                } else {
                    if (9.0d <= dLongValue && dLongValue <= 11.0d) {
                        string2 = holder.itemView.getContext().getString(R.string.discount_tag_10_off);
                    } else if (19.0d <= dLongValue && dLongValue <= 21.0d) {
                        string2 = holder.itemView.getContext().getString(R.string.discount_tag_20_off);
                    } else if (29.0d <= dLongValue && dLongValue <= 31.0d) {
                        string2 = holder.itemView.getContext().getString(R.string.discount_tag_30_off);
                    } else if (39.0d <= dLongValue && dLongValue <= 41.0d) {
                        string2 = holder.itemView.getContext().getString(R.string.discount_tag_40_off);
                    } else if (49.0d <= dLongValue && dLongValue <= 51.0d) {
                        string2 = holder.itemView.getContext().getString(R.string.discount_tag_50_off);
                    }
                    if (string2 == null) {
                        OooOOO0.OooO0o(discountTag, "discountTag");
                        discountTag.setVisibility(8);
                    } else {
                        discountTag.setText(string2);
                        discountTag.setVisibility(0);
                    }
                }
            }
        } else {
            OooOOO0.OooO0o(discountTag, "discountTag");
            discountTag.setVisibility(8);
        }
        CheckBox checkBox = holder.f109271OooO00o;
        boolean z = c31042OooOOO0.f110833OooO0oo;
        checkBox.setChecked(z);
        holder.itemView.setSelected(z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final RecyclerView.AbstractC22078OooOooO onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewOooO0OO = C20504OooO0O0.OooO0OO(viewGroup, "parent", R.layout.item_entry_google_vip_product, viewGroup, false);
        OooOOO0.OooO0Oo(viewOooO0OO);
        return new C20105OooO0O0(this, viewOooO0OO);
    }
}
