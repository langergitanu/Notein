package o0o00;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.AbstractC22050OooOo0o;
import androidx.recyclerview.widget.OooOOO;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.network.embedded.C18437z2;
import com.orion.notein.global.R;
import java.util.List;
import kotlin.jvm.internal.OooOOO0;
import o0Oo0O0.C28050OooO0OO;
import o0Oo0oO0.OooOO0;
import o0o00Oo0.C29908OooO00o;

/* JADX INFO: renamed from: o0o00.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29719OooO00o extends AbstractC22050OooOo0o<C29908OooO00o, OooO0O0> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f105371OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public View.OnClickListener f105372OooO0OO;

    /* JADX INFO: renamed from: o0o00.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C20017OooO00o extends OooOOO.AbstractC22036OooO0o0<C29908OooO00o> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final C20017OooO00o f105373OooO00o = new C20017OooO00o();

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO00o(C29908OooO00o c29908OooO00o, C29908OooO00o c29908OooO00o2) {
            return c29908OooO00o.equals(c29908OooO00o2);
        }

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO0O0(C29908OooO00o c29908OooO00o, C29908OooO00o c29908OooO00o2) {
            return c29908OooO00o.f106114OooO00o == c29908OooO00o2.f106114OooO00o;
        }

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final Object OooO0OO(C29908OooO00o c29908OooO00o, C29908OooO00o c29908OooO00o2) {
            C29908OooO00o c29908OooO00o3 = c29908OooO00o;
            C29908OooO00o c29908OooO00o4 = c29908OooO00o2;
            Bundle bundle = new Bundle();
            int i = c29908OooO00o3.f106114OooO00o;
            int i2 = c29908OooO00o4.f106114OooO00o;
            if (i != i2) {
                bundle.putInt(C18437z2.f56754h, i2);
            }
            int i3 = c29908OooO00o3.f106115OooO0O0;
            int i4 = c29908OooO00o4.f106115OooO0O0;
            if (i3 != i4) {
                bundle.putInt("icon", i4);
            }
            boolean z = c29908OooO00o3.f106117OooO0Oo;
            boolean z2 = c29908OooO00o4.f106117OooO0Oo;
            if (z != z2) {
                bundle.putBoolean("activated", z2);
            }
            int i5 = c29908OooO00o3.f106116OooO0OO;
            int i6 = c29908OooO00o4.f106116OooO0OO;
            if (i5 != i6) {
                bundle.putInt("tool_tips", i6);
            }
            if (bundle.isEmpty()) {
                return null;
            }
            return bundle;
        }
    }

    /* JADX INFO: renamed from: o0o00.OooO00o$OooO0O0 */
    public final class OooO0O0 extends RecyclerView.AbstractC22078OooOooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ImageView f105374OooO00o;

        public OooO0O0(C29719OooO00o c29719OooO00o, View view) {
            super(view);
            View viewFindViewById = view.findViewById(R.id.iv_icon);
            OooOOO0.OooO0o(viewFindViewById, "findViewById(...)");
            this.f105374OooO00o = (ImageView) viewFindViewById;
            C28050OooO0OO.OooO00o(view, 500L, new OooOO0(c29719OooO00o, 3));
        }

        public final void OooO00o(C29908OooO00o c29908OooO00o, Bundle bundle) {
            this.itemView.setTag(c29908OooO00o);
            ImageView imageView = this.f105374OooO00o;
            if (bundle == null) {
                imageView.setImageResource(c29908OooO00o.f106115OooO0O0);
                this.itemView.setActivated(c29908OooO00o.f106117OooO0Oo);
                View view = this.itemView;
                view.setTooltipText(view.getContext().getString(c29908OooO00o.f106116OooO0OO));
                return;
            }
            if (bundle.containsKey(C18437z2.f56754h)) {
                imageView.setImageResource(bundle.getInt(C18437z2.f56754h));
            }
            if (bundle.containsKey("icon")) {
                imageView.setImageResource(bundle.getInt("icon"));
            }
            if (bundle.containsKey("activated")) {
                this.itemView.setActivated(bundle.getBoolean("activated"));
            }
            if (bundle.containsKey("tool_tips")) {
                int i = bundle.getInt("tool_tips");
                View view2 = this.itemView;
                view2.setTooltipText(view2.getContext().getString(i));
            }
        }
    }

    public C29719OooO00o(boolean z) {
        super(C20017OooO00o.f105373OooO00o);
        this.f105371OooO0O0 = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, int i) {
        OooO0O0 holder = (OooO0O0) abstractC22078OooOooO;
        OooOOO0.OooO0oO(holder, "holder");
        C29908OooO00o c29908OooO00oOooO0OO = OooO0OO(i);
        OooOOO0.OooO0o(c29908OooO00oOooO0OO, "getItem(...)");
        holder.OooO00o(c29908OooO00oOooO0OO, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final RecyclerView.AbstractC22078OooOooO onCreateViewHolder(ViewGroup parent, int i) {
        OooOOO0.OooO0oO(parent, "parent");
        View viewOooO0O0 = this.f105371OooO0O0 ? com.aspose.slides.internal.p332p7.OooO0OO.OooO0O0(parent, R.layout.item_toolbar_item_immersive, parent, false) : com.aspose.slides.internal.p332p7.OooO0OO.OooO0O0(parent, R.layout.item_toolbar_item, parent, false);
        OooOOO0.OooO0Oo(viewOooO0O0);
        return new OooO0O0(this, viewOooO0O0);
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
        C29908OooO00o c29908OooO00oOooO0OO = OooO0OO(i);
        OooOOO0.OooO0o(c29908OooO00oOooO0OO, "getItem(...)");
        holder.OooO00o(c29908OooO00oOooO0OO, (Bundle) obj);
    }
}
