package o0Oo0ooO;

import OooOoO.C20504OooO0O0;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.AbstractC22050OooOo0o;
import androidx.recyclerview.widget.OooOOO;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.MainActivity;
import com.orion.notein.global.R;

/* JADX INFO: renamed from: o0Oo0ooO.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28410OooO0Oo extends AbstractC22050OooOo0o<C28456OoooOoO, OooO0O0> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final MainActivity.OooOOOO f100708OooO0O0;

    /* JADX INFO: renamed from: o0Oo0ooO.OooO0Oo$OooO00o */
    public static final class OooO00o extends OooOOO.AbstractC22036OooO0o0<C28456OoooOoO> {
        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO00o(C28456OoooOoO c28456OoooOoO, C28456OoooOoO c28456OoooOoO2) {
            return c28456OoooOoO.equals(c28456OoooOoO2);
        }

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO0O0(C28456OoooOoO c28456OoooOoO, C28456OoooOoO c28456OoooOoO2) {
            return c28456OoooOoO.f100833OooO00o == c28456OoooOoO2.f100833OooO00o;
        }
    }

    /* JADX INFO: renamed from: o0Oo0ooO.OooO0Oo$OooO0O0 */
    public final class OooO0O0 extends RecyclerView.AbstractC22078OooOooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ImageView f100709OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final TextView f100710OooO0O0;

        public OooO0O0(View view) {
            super(view);
            View viewFindViewById = view.findViewById(R.id.label_icon);
            kotlin.jvm.internal.OooOOO0.OooO0o(viewFindViewById, "findViewById(...)");
            this.f100709OooO00o = (ImageView) viewFindViewById;
            View viewFindViewById2 = view.findViewById(R.id.label_name);
            kotlin.jvm.internal.OooOOO0.OooO0o(viewFindViewById2, "findViewById(...)");
            this.f100710OooO0O0 = (TextView) viewFindViewById2;
        }
    }

    public C28410OooO0Oo(MainActivity.OooOOOO oooOOOO) {
        super(new OooO00o());
        this.f100708OooO0O0 = oooOOOO;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, int i) {
        OooO0O0 holder = (OooO0O0) abstractC22078OooOooO;
        kotlin.jvm.internal.OooOOO0.OooO0oO(holder, "holder");
        C28456OoooOoO c28456OoooOoOOooO0OO = OooO0OO(i);
        kotlin.jvm.internal.OooOOO0.OooO0Oo(c28456OoooOoOOooO0OO);
        holder.f100710OooO0O0.setText(c28456OoooOoOOooO0OO.f100834OooO0O0);
        holder.f100709OooO00o.setColorFilter(c28456OoooOoOOooO0OO.f100835OooO0OO);
        holder.itemView.setOnClickListener(new ViewOnClickListenerC28412OooO0o0(0, C28410OooO0Oo.this, c28456OoooOoOOooO0OO));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final RecyclerView.AbstractC22078OooOooO onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewOooO0OO = C20504OooO0O0.OooO0OO(viewGroup, "parent", R.layout.item_drawer_menu_label, viewGroup, false);
        kotlin.jvm.internal.OooOOO0.OooO0Oo(viewOooO0OO);
        return new OooO0O0(viewOooO0OO);
    }
}
