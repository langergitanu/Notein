package o0o0O0o;

import Oooo0.o000000O;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.AbstractC22050OooOo0o;
import androidx.recyclerview.widget.OooOOO;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.p609vo.SortKeyVO;
import kotlin.jvm.internal.OooOOO0;
import o0Oo0oO0.ViewOnClickListenerC28296OooO0oo;

/* JADX INFO: renamed from: o0o0O0o.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30292OooO00o extends AbstractC22050OooOo0o<SortKeyVO, OooO0O0> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f107948OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f107949OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public View.OnClickListener f107950OooO0Oo;

    /* JADX INFO: renamed from: o0o0O0o.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C20063OooO00o extends OooOOO.AbstractC22036OooO0o0<SortKeyVO> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final C20063OooO00o f107951OooO00o = new C20063OooO00o();

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO00o(SortKeyVO sortKeyVO, SortKeyVO sortKeyVO2) {
            return sortKeyVO.equals(sortKeyVO2);
        }

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO0O0(SortKeyVO sortKeyVO, SortKeyVO sortKeyVO2) {
            return sortKeyVO.equals(sortKeyVO2);
        }
    }

    /* JADX INFO: renamed from: o0o0O0o.OooO00o$OooO0O0 */
    public final class OooO0O0 extends RecyclerView.AbstractC22078OooOooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final TextView f107952OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final ImageView f107953OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final View f107954OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final View f107955OooO0Oo;

        public OooO0O0(View view) {
            super(view);
            this.f107952OooO00o = (TextView) view.findViewById(R.id.sort_key);
            this.f107953OooO0O0 = (ImageView) view.findViewById(R.id.selected_icon);
            this.f107954OooO0OO = view.findViewById(R.id.cl_sort_key);
            this.f107955OooO0Oo = view.findViewById(R.id.divider);
        }
    }

    public C30292OooO00o(int i, boolean z) {
        super(C20063OooO00o.f107951OooO00o);
        this.f107948OooO0O0 = i;
        this.f107949OooO0OO = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, int i) {
        View view;
        OooO0O0 holder = (OooO0O0) abstractC22078OooOooO;
        OooOOO0.OooO0oO(holder, "holder");
        SortKeyVO sortKeyVOOooO0OO = OooO0OO(i);
        OooOOO0.OooO0o(sortKeyVOOooO0OO, "getItem(...)");
        SortKeyVO sortKeyVO = sortKeyVOOooO0OO;
        holder.itemView.setTag(sortKeyVO);
        boolean selected = sortKeyVO.getSelected();
        ImageView imageView = holder.f107953OooO0O0;
        if (selected) {
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(4);
        }
        holder.f107954OooO0OO.setSelected(sortKeyVO.getSelected());
        Context context = holder.itemView.getContext();
        OooOOO0.OooO0o(context, "getContext(...)");
        String name = sortKeyVO.getName(context);
        TextView textView = holder.f107952OooO00o;
        textView.setText(name);
        if (sortKeyVO.isVipBadgeVisible()) {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, ContextCompat.getDrawable(textView.getContext(), R.drawable.ic_ni_vip_12), (Drawable) null);
            textView.setCompoundDrawablePadding(o000000O.OooO0o(6));
        } else {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        }
        if (!C30292OooO00o.this.f107949OooO0OO || (view = holder.f107955OooO0Oo) == null) {
            return;
        }
        view.setVisibility(sortKeyVO.getKey() != com.orion.notein.p607ui.p609vo.OooO00o.f80092Oooo0 ? 8 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final RecyclerView.AbstractC22078OooOooO onCreateViewHolder(ViewGroup parent, int i) {
        OooOOO0.OooO0oO(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(this.f107948OooO0O0, parent, false);
        viewInflate.setOnClickListener(new ViewOnClickListenerC28296OooO0oo(this, 4));
        return new OooO0O0(viewInflate);
    }
}
