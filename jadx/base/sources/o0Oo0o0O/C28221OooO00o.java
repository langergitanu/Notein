package o0Oo0o0O;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.C21532OooOOo;
import androidx.recyclerview.widget.AbstractC22050OooOo0o;
import androidx.recyclerview.widget.OooOOO;
import androidx.recyclerview.widget.RecyclerView;
import com.aspose.slides.internal.p332p7.OooO0OO;
import com.orion.niui.components.button.TextButtonView;
import com.orion.notein.global.R;
import kotlin.jvm.internal.OooOOO0;
import o0O0o0oO.ViewOnClickListenerC26024OooOOo0;
import o0Oo0O0.C28050OooO0OO;
import o0Oo0o00.C28169OooOo0O;
import o0oOoOo.C31032OooO0OO;
import org.json.JSONException;

/* JADX INFO: renamed from: o0Oo0o0O.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28221OooO00o extends AbstractC22050OooOo0o<C31032OooO0OO, OooO0O0> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public C28169OooOo0O f100048OooO0O0;

    /* JADX INFO: renamed from: o0Oo0o0O.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C19898OooO00o extends OooOOO.AbstractC22036OooO0o0<C31032OooO0OO> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final C19898OooO00o f100049OooO00o = new C19898OooO00o();

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO00o(C31032OooO0OO c31032OooO0OO, C31032OooO0OO c31032OooO0OO2) {
            return c31032OooO0OO.equals(c31032OooO0OO2);
        }

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO0O0(C31032OooO0OO c31032OooO0OO, C31032OooO0OO c31032OooO0OO2) {
            return OooOOO0.OooO0O0(c31032OooO0OO.f110782OooO00o, c31032OooO0OO2.f110782OooO00o);
        }
    }

    /* JADX INFO: renamed from: o0Oo0o0O.OooO00o$OooO0O0 */
    public final class OooO0O0 extends RecyclerView.AbstractC22078OooOooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final TextView f100050OooO00o;

        public OooO0O0(C28221OooO00o c28221OooO00o, View view) {
            super(view);
            View viewFindViewById = view.findViewById(R.id.tv_filename);
            OooOOO0.OooO0o(viewFindViewById, "findViewById(...)");
            this.f100050OooO00o = (TextView) viewFindViewById;
            View viewFindViewById2 = view.findViewById(R.id.btn_resolve);
            OooOOO0.OooO0o(viewFindViewById2, "findViewById(...)");
            C28050OooO0OO.OooO00o((TextButtonView) viewFindViewById2, 500L, new ViewOnClickListenerC26024OooOOo0(1, view, c28221OooO00o));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final int getItemViewType(int i) {
        C31032OooO0OO c31032OooO0OOOooO0OO = OooO0OO(i);
        if (c31032OooO0OOOooO0OO.f110785OooO0Oo) {
            return 0;
        }
        return c31032OooO0OOOooO0OO.f110784OooO0OO ? 1 : 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, int i) {
        OooO0O0 holder = (OooO0O0) abstractC22078OooOooO;
        OooOOO0.OooO0oO(holder, "holder");
        C31032OooO0OO c31032OooO0OOOooO0OO = OooO0OO(i);
        OooOOO0.OooO0o(c31032OooO0OOOooO0OO, "getItem(...)");
        C31032OooO0OO c31032OooO0OO = c31032OooO0OOOooO0OO;
        holder.itemView.setTag(c31032OooO0OO);
        holder.f100050OooO00o.setText(c31032OooO0OO.f110783OooO0O0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final RecyclerView.AbstractC22078OooOooO onCreateViewHolder(ViewGroup parent, int i) throws JSONException {
        View viewOooO0O0;
        OooOOO0.OooO0oO(parent, "parent");
        if (i == 0) {
            viewOooO0O0 = OooO0OO.OooO0O0(parent, R.layout.item_cloud_sync_global_error, parent, false);
        } else if (i == 1) {
            viewOooO0O0 = OooO0OO.OooO0O0(parent, R.layout.item_cloud_sync_conflict_file, parent, false);
        } else {
            if (i != 2) {
                throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i, "Unsupported view type: "));
            }
            viewOooO0O0 = OooO0OO.OooO0O0(parent, R.layout.item_cloud_sync_issues_file, parent, false);
        }
        OooOOO0.OooO0Oo(viewOooO0O0);
        return new OooO0O0(this, viewOooO0O0);
    }
}
