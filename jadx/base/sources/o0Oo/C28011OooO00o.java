package o0Oo;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.AbstractC22050OooOo0o;
import androidx.recyclerview.widget.OooOOO;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.domain.models.LocaleCountryCode;
import com.orion.notein.global.R;
import org.json.JSONException;

/* JADX INFO: renamed from: o0Oo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28011OooO00o extends AbstractC22050OooOo0o<LocaleCountryCode, OooO0O0> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public ViewOnClickListenerC28013OooO0OO f99343OooO0O0;

    /* JADX INFO: renamed from: o0Oo.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C19885OooO00o extends OooOOO.AbstractC22036OooO0o0<LocaleCountryCode> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final C19885OooO00o f99344OooO00o = new C19885OooO00o();

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO00o(LocaleCountryCode localeCountryCode, LocaleCountryCode localeCountryCode2) {
            return localeCountryCode.equals(localeCountryCode2);
        }

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO0O0(LocaleCountryCode localeCountryCode, LocaleCountryCode localeCountryCode2) {
            return localeCountryCode.equals(localeCountryCode2);
        }
    }

    /* JADX INFO: renamed from: o0Oo.OooO00o$OooO0O0 */
    public final class OooO0O0 extends RecyclerView.AbstractC22078OooOooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final TextView f99345OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final TextView f99346OooO0O0;

        public OooO0O0(C28011OooO00o c28011OooO00o, View view) {
            super(view);
            this.f99345OooO00o = (TextView) view.findViewById(R.id.name);
            this.f99346OooO0O0 = (TextView) view.findViewById(R.id.phone_code);
            view.setOnClickListener(new ViewOnClickListenerC28012OooO0O0(c28011OooO00o, 0));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final int getItemViewType(int i) {
        return !OooO0OO(i).getH() ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, int i) {
        OooO0O0 holder = (OooO0O0) abstractC22078OooOooO;
        kotlin.jvm.internal.OooOOO0.OooO0oO(holder, "holder");
        LocaleCountryCode localeCountryCodeOooO0OO = OooO0OO(i);
        kotlin.jvm.internal.OooOOO0.OooO0o(localeCountryCodeOooO0OO, "getItem(...)");
        LocaleCountryCode localeCountryCode = localeCountryCodeOooO0OO;
        holder.itemView.setTag(localeCountryCode);
        holder.f99345OooO00o.setText(localeCountryCode.getName());
        TextView textView = holder.f99346OooO0O0;
        if (textView != null) {
            textView.setText(localeCountryCode.getCode());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final RecyclerView.AbstractC22078OooOooO onCreateViewHolder(ViewGroup parent, int i) throws JSONException {
        kotlin.jvm.internal.OooOOO0.OooO0oO(parent, "parent");
        View viewOooO0O0 = com.aspose.slides.internal.p332p7.OooO0OO.OooO0O0(parent, i == 0 ? R.layout.item_country_code_header : R.layout.item_country_code, parent, false);
        kotlin.jvm.internal.OooOOO0.OooO0Oo(viewOooO0O0);
        return new OooO0O0(this, viewOooO0O0);
    }
}
