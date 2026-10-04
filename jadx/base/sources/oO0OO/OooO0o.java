package oO0OO;

import OooOoO.C20504OooO0O0;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.AbstractC22050OooOo0o;
import androidx.recyclerview.widget.OooOOO;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.global.R;
import kotlin.jvm.internal.OooOOO0;
import o0OoO0oo.ViewOnClickListenerC28958o00oOo0o;
import o0oOoOo.C31084OooooOO;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0o extends AbstractC22050OooOo0o<C31084OooooOO, OooO0O0> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public ViewOnClickListenerC28958o00oOo0o f117994OooO0O0;

    public static final class OooO00o extends OooOOO.AbstractC22036OooO0o0<C31084OooooOO> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO00o f117995OooO00o = new OooO00o();

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO00o(C31084OooooOO c31084OooooOO, C31084OooooOO c31084OooooOO2) {
            return c31084OooooOO.equals(c31084OooooOO2);
        }

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO0O0(C31084OooooOO c31084OooooOO, C31084OooooOO c31084OooooOO2) {
            return true;
        }
    }

    public final class OooO0O0 extends RecyclerView.AbstractC22078OooOooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final TextView f117996OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final View f117997OooO0O0;

        public OooO0O0(OooO0o oooO0o, View view) {
            super(view);
            this.f117996OooO00o = (TextView) view.findViewById(R.id.color);
            this.f117997OooO0O0 = view.findViewById(R.id.border);
            ViewOnClickListenerC28958o00oOo0o viewOnClickListenerC28958o00oOo0o = oooO0o.f117994OooO0O0;
            if (viewOnClickListenerC28958o00oOo0o != null) {
                view.setOnClickListener(viewOnClickListenerC28958o00oOo0o);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, int i) {
        OooO0O0 holder = (OooO0O0) abstractC22078OooOooO;
        OooOOO0.OooO0oO(holder, "holder");
        C31084OooooOO c31084OooooOOOooO0OO = OooO0OO(i);
        OooOOO0.OooO0o(c31084OooooOOOooO0OO, "getItem(...)");
        C31084OooooOO c31084OooooOO = c31084OooooOOOooO0OO;
        holder.itemView.setTag(c31084OooooOO);
        TextView textView = holder.f117996OooO00o;
        int i2 = c31084OooooOO.f110939OooO00o;
        if (i2 == -16777216) {
            textView.setTextColor(holder.itemView.getContext().getColor(R.color.edit_text_text_color_for_night_mode));
            textView.setBackground(null);
        } else {
            textView.setTextColor(i2);
            textView.setBackground(holder.itemView.getContext().getDrawable(R.drawable.bg_text_style_item));
        }
        holder.f117997OooO0O0.setSelected(c31084OooooOO.f110940OooO0O0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final RecyclerView.AbstractC22078OooOooO onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewOooO0OO = C20504OooO0O0.OooO0OO(viewGroup, "parent", R.layout.item_text_foreground_color, viewGroup, false);
        OooOOO0.OooO0Oo(viewOooO0OO);
        return new OooO0O0(this, viewOooO0OO);
    }
}
