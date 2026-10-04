package o0Ooo0Oo;

import Oooo0.o000000O;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.AbstractC22050OooOo0o;
import androidx.recyclerview.widget.OooOOO;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.global.R;
import kotlin.jvm.internal.OooOOO0;
import o00Ooo.C25080OooOO0o;
import o0O0o0oO.ViewOnClickListenerC26066o00oO0o;
import o0Ooo0Oo.C29404OooO00o;
import org.json.JSONException;

/* JADX INFO: renamed from: o0Ooo0Oo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29404OooO00o extends AbstractC22050OooOo0o<C29406OooO0OO, RecyclerView.AbstractC22078OooOooO> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public C25080OooOO0o f104273OooO0O0;

    /* JADX INFO: renamed from: o0Ooo0Oo.OooO00o$OooO00o, reason: collision with other inner class name */
    public final class C19986OooO00o extends RecyclerView.AbstractC22078OooOooO {
    }

    /* JADX INFO: renamed from: o0Ooo0Oo.OooO00o$OooO0O0 */
    public final class OooO0O0 extends RecyclerView.AbstractC22078OooOooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final View f104274OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final CardView f104275OooO0O0;

        public OooO0O0(View view) {
            super(view);
            this.f104274OooO00o = view.findViewById(R.id.iv_bg);
            this.f104275OooO0O0 = (CardView) view.findViewById(R.id.padding_color);
            view.setOnHoverListener(new View.OnHoverListener() { // from class: o0Ooo0Oo.OooO0O0
                @Override // android.view.View.OnHoverListener
                public final boolean onHover(View view2, MotionEvent motionEvent) {
                    int action = motionEvent.getAction();
                    C29404OooO00o.OooO0O0 oooO0O0 = this.f104278OooO00o;
                    if (action == 9) {
                        oooO0O0.f104275OooO0O0.setCardElevation(o000000O.OooO0o0(6.0f));
                        return false;
                    }
                    if (motionEvent.getAction() != 10) {
                        return false;
                    }
                    oooO0O0.f104275OooO0O0.setCardElevation(0.0f);
                    return false;
                }
            });
        }
    }

    /* JADX INFO: renamed from: o0Ooo0Oo.OooO00o$OooO0OO */
    public static final class OooO0OO extends OooOOO.AbstractC22036OooO0o0<C29406OooO0OO> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO0OO f104277OooO00o = new OooO0OO();

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO00o(C29406OooO0OO c29406OooO0OO, C29406OooO0OO c29406OooO0OO2) {
            return c29406OooO0OO.equals(c29406OooO0OO2);
        }

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO0O0(C29406OooO0OO c29406OooO0OO, C29406OooO0OO c29406OooO0OO2) {
            return c29406OooO0OO.f104279OooO00o == c29406OooO0OO2.f104279OooO00o;
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC22050OooOo0o, androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final int getItemCount() {
        return super.getItemCount() + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final int getItemViewType(int i) {
        return i == getItemCount() - 1 ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO holder, int i) {
        OooOOO0.OooO0oO(holder, "holder");
        if (i == getItemCount() - 1) {
            return;
        }
        OooO0O0 oooO0O0 = (OooO0O0) holder;
        C29406OooO0OO c29406OooO0OOOooO0OO = OooO0OO(i);
        OooOOO0.OooO0o(c29406OooO0OOOooO0OO, "getItem(...)");
        C29406OooO0OO c29406OooO0OO = c29406OooO0OOOooO0OO;
        oooO0O0.itemView.setOnClickListener(new ViewOnClickListenerC26066o00oO0o(1, C29404OooO00o.this, c29406OooO0OO));
        oooO0O0.f104275OooO0O0.setCardBackgroundColor(c29406OooO0OO.f104279OooO00o);
        oooO0O0.itemView.setSelected(c29406OooO0OO.f104280OooO0O0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final RecyclerView.AbstractC22078OooOooO onCreateViewHolder(ViewGroup parent, int i) throws JSONException {
        OooOOO0.OooO0oO(parent, "parent");
        if (i != 1) {
            View viewOooO0O0 = com.aspose.slides.internal.p332p7.OooO0OO.OooO0O0(parent, R.layout.item_page_padding_color, parent, false);
            OooOOO0.OooO0Oo(viewOooO0O0);
            return new OooO0O0(viewOooO0O0);
        }
        View viewOooO0O02 = com.aspose.slides.internal.p332p7.OooO0OO.OooO0O0(parent, R.layout.item_page_padding_custom_color, parent, false);
        OooOOO0.OooO0Oo(viewOooO0O02);
        C19986OooO00o c19986OooO00o = new C19986OooO00o(viewOooO0O02);
        viewOooO0O02.setOnClickListener(new o0OoO000.OooO0OO(this, 1));
        return c19986OooO00o;
    }
}
