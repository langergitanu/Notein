package o0Oo0OOo;

import OooOoO.C20504OooO0O0;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.AbstractC22050OooOo0o;
import androidx.recyclerview.widget.OooOOO;
import androidx.recyclerview.widget.RecyclerView;
import com.aspose.slides.C22205OooOOo;
import com.orion.notein.global.R;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.OooOOO0;
import o0O0oo0O.ViewOnClickListenerC26210OooO00o;
import o0oOoOo.C31055OooOoOO;

/* JADX INFO: renamed from: o0Oo0OOo.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28084OooO0OO extends AbstractC22050OooOo0o<C31055OooOoOO, OooO0O0> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public ViewOnClickListenerC26210OooO00o f99542OooO0O0;

    /* JADX INFO: renamed from: o0Oo0OOo.OooO0OO$OooO00o */
    public static final class OooO00o extends OooOOO.AbstractC22036OooO0o0<C31055OooOoOO> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO00o f99543OooO00o = new OooO00o();

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO00o(C31055OooOoOO c31055OooOoOO, C31055OooOoOO c31055OooOoOO2) {
            return c31055OooOoOO.equals(c31055OooOoOO2);
        }

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO0O0(C31055OooOoOO c31055OooOoOO, C31055OooOoOO c31055OooOoOO2) {
            return OooOOO0.OooO0O0(c31055OooOoOO.f110868OooO00o, c31055OooOoOO2.f110868OooO00o);
        }

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final Object OooO0OO(C31055OooOoOO c31055OooOoOO, C31055OooOoOO c31055OooOoOO2) {
            C31055OooOoOO c31055OooOoOO3 = c31055OooOoOO;
            C31055OooOoOO c31055OooOoOO4 = c31055OooOoOO2;
            if (OooOOO0.OooO0O0(c31055OooOoOO3.f110868OooO00o, c31055OooOoOO4.f110868OooO00o) && OooOOO0.OooO0O0(c31055OooOoOO3.f110869OooO0O0, c31055OooOoOO4.f110869OooO0O0)) {
                if (c31055OooOoOO3.f110872OooO0o == c31055OooOoOO4.f110872OooO0o && c31055OooOoOO3.f110873OooO0o0 != c31055OooOoOO4.f110873OooO0o0) {
                    return C22205OooOOo.OooO0O0("needRefresh", false);
                }
                return C22205OooOOo.OooO0O0("needRefresh", false);
            }
            return C22205OooOOo.OooO0O0("needRefresh", true);
        }
    }

    /* JADX INFO: renamed from: o0Oo0OOo.OooO0OO$OooO0O0 */
    public final class OooO0O0 extends RecyclerView.AbstractC22078OooOooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final SimpleDateFormat f99544OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final TextView f99545OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final TextView f99546OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final ImageView f99547OooO0Oo;

        public OooO0O0(C28084OooO0OO c28084OooO0OO, View view) {
            super(view);
            this.f99544OooO00o = new SimpleDateFormat("yyyy/MM/dd", Locale.CHINA);
            this.f99545OooO0O0 = (TextView) view.findViewById(R.id.last_modified);
            View viewFindViewById = view.findViewById(R.id.name);
            OooOOO0.OooO0o(viewFindViewById, "findViewById(...)");
            this.f99546OooO0OO = (TextView) viewFindViewById;
            this.f99547OooO0Oo = (ImageView) view.findViewById(R.id.selected);
            ViewOnClickListenerC26210OooO00o viewOnClickListenerC26210OooO00o = c28084OooO0OO.f99542OooO0O0;
            if (viewOnClickListenerC26210OooO00o != null) {
                this.itemView.setOnClickListener(viewOnClickListenerC26210OooO00o);
            }
        }

        public final void OooO00o(C31055OooOoOO c31055OooOoOO) {
            this.itemView.setTag(c31055OooOoOO);
            this.f99546OooO0OO.setText(c31055OooOoOO.f110869OooO0O0);
            boolean z = c31055OooOoOO.f110872OooO0o;
            ImageView imageView = this.f99547OooO0Oo;
            if (z) {
                imageView.setImageResource(R.drawable.ic_ni_checkbox_radio_selected);
            } else {
                imageView.setImageResource(R.drawable.ic_ni_checkbox_radio_normal);
            }
            this.f99545OooO0O0.setText(this.f99544OooO00o.format(Long.valueOf(c31055OooOoOO.f110873OooO0o0)));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, int i) {
        OooO0O0 holder = (OooO0O0) abstractC22078OooOooO;
        OooOOO0.OooO0oO(holder, "holder");
        C31055OooOoOO c31055OooOoOOOooO0OO = OooO0OO(i);
        OooOOO0.OooO0o(c31055OooOoOOOooO0OO, "getItem(...)");
        holder.OooO00o(c31055OooOoOOOooO0OO);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final RecyclerView.AbstractC22078OooOooO onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewOooO0OO = C20504OooO0O0.OooO0OO(viewGroup, "parent", R.layout.item_file_tree_node, viewGroup, false);
        OooOOO0.OooO0Oo(viewOooO0OO);
        return new OooO0O0(this, viewOooO0OO);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, int i, List payloads) {
        OooO0O0 holder = (OooO0O0) abstractC22078OooOooO;
        OooOOO0.OooO0oO(holder, "holder");
        OooOOO0.OooO0oO(payloads, "payloads");
        if (payloads.isEmpty()) {
            super.onBindViewHolder(holder, i, payloads);
            return;
        }
        Object obj = payloads.get(0);
        OooOOO0.OooO0o0(obj, "null cannot be cast to non-null type android.os.Bundle");
        if (!((Bundle) obj).getBoolean("needRefresh")) {
            C31055OooOoOO c31055OooOoOOOooO0OO = OooO0OO(i);
            OooOOO0.OooO0o(c31055OooOoOOOooO0OO, "getItem(...)");
            holder.OooO00o(c31055OooOoOOOooO0OO);
            return;
        }
        super.onBindViewHolder(holder, i, payloads);
    }
}
