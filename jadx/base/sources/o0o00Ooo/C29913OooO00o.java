package o0o00Ooo;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.AbstractC22050OooOo0o;
import androidx.recyclerview.widget.OooOOO;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.global.R;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: o0o00Ooo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29913OooO00o extends AbstractC22050OooOo0o<Integer, OooO0O0> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f106132OooO0O0;

    /* JADX INFO: renamed from: o0o00Ooo.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C20030OooO00o extends OooOOO.AbstractC22036OooO0o0<Integer> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final C20030OooO00o f106133OooO00o = new C20030OooO00o();

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO00o(Integer num, Integer num2) {
            return num.intValue() == num2.intValue();
        }

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO0O0(Integer num, Integer num2) {
            return num.intValue() == num2.intValue();
        }
    }

    /* JADX INFO: renamed from: o0o00Ooo.OooO00o$OooO0O0 */
    public final class OooO0O0 extends RecyclerView.AbstractC22078OooOooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final View f106134OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final View f106135OooO0O0;

        public OooO0O0(View view) {
            super(view);
            View viewFindViewById = view.findViewById(R.id.color);
            OooOOO0.OooO0o(viewFindViewById, "findViewById(...)");
            this.f106134OooO00o = viewFindViewById;
            View viewFindViewById2 = view.findViewById(R.id.border);
            OooOOO0.OooO0o(viewFindViewById2, "findViewById(...)");
            this.f106135OooO0O0 = viewFindViewById2;
        }
    }

    public C29913OooO00o(int i) {
        super(C20030OooO00o.f106133OooO00o);
        this.f106132OooO0O0 = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, int i) {
        OooO0O0 holder = (OooO0O0) abstractC22078OooOooO;
        OooOOO0.OooO0oO(holder, "holder");
        Integer numOooO0OO = OooO0OO(i);
        OooOOO0.OooO0o(numOooO0OO, "getItem(...)");
        int iIntValue = numOooO0OO.intValue();
        View view = holder.f106134OooO00o;
        Drawable background = view.getBackground();
        OooOOO0.OooO0o0(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        GradientDrawable gradientDrawable = (GradientDrawable) background;
        gradientDrawable.setColor(iIntValue);
        view.setBackground(gradientDrawable);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final RecyclerView.AbstractC22078OooOooO onCreateViewHolder(ViewGroup parent, int i) {
        OooOOO0.OooO0oO(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(this.f106132OooO0O0, parent, false);
        OooOOO0.OooO0Oo(viewInflate);
        return new OooO0O0(viewInflate);
    }
}
