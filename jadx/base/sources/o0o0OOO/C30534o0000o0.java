package o0o0OOO;

import OooOoO.C20504OooO0O0;
import Oooo.C20813OooO0o0;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.AbstractC22050OooOo0o;
import androidx.recyclerview.widget.OooOOO;
import androidx.recyclerview.widget.RecyclerView;
import com.android.billingclient.api.C22172OooOoO;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.p609vo.PageColorThemeVO;
import java.util.List;
import o0OoO0oO.C28675OooO0Oo;
import o0OoO0oO.C28680OooOO0;
import o0oOoOo.C31091ooOO;

/* JADX INFO: renamed from: o0o0OOO.o0000o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30534o0000o0 extends AbstractC22050OooOo0o<o0oOoOo.o0OoOo0, OooO0O0> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public View.OnClickListener f109152OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public C20813OooO0o0 f109153OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public o0000OO0 f109154OooO0Oo;

    /* JADX INFO: renamed from: o0o0OOO.o0000o0$OooO00o */
    public static final class OooO00o extends OooOOO.AbstractC22036OooO0o0<o0oOoOo.o0OoOo0> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO00o f109155OooO00o = new OooO00o();

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO00o(o0oOoOo.o0OoOo0 o0oooo02, o0oOoOo.o0OoOo0 o0oooo03) {
            return o0oooo02.equals(o0oooo03);
        }

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO0O0(o0oOoOo.o0OoOo0 o0oooo02, o0oOoOo.o0OoOo0 o0oooo03) {
            return o0oooo02.f110973OooO00o.f110975OooO00o == o0oooo03.f110973OooO00o.f110975OooO00o;
        }

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final Object OooO0OO(o0oOoOo.o0OoOo0 o0oooo02, o0oOoOo.o0OoOo0 o0oooo03) {
            return C22172OooOoO.OooO00o("list", "update");
        }
    }

    /* JADX INFO: renamed from: o0o0OOO.o0000o0$OooO0O0 */
    public final class OooO0O0 extends RecyclerView.AbstractC22078OooOooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final TextView f109156OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final View f109157OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final C28680OooOO0 f109158OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final C28675OooO0Oo f109159OooO0Oo;

        public OooO0O0(View view) {
            super(view);
            this.f109156OooO00o = (TextView) view.findViewById(R.id.category);
            this.f109157OooO0O0 = view.findViewById(R.id.divider);
            RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.theme_list);
            C28680OooOO0 c28680OooOO0 = new C28680OooOO0(C28680OooOO0.OooO0O0.f101629OooO00o);
            this.f109158OooO0OO = c28680OooOO0;
            RecyclerView recyclerView2 = (RecyclerView) view.findViewById(R.id.color_list);
            C28675OooO0Oo c28675OooO0Oo = new C28675OooO0Oo();
            this.f109159OooO0Oo = c28675OooO0Oo;
            recyclerView.setAdapter(c28680OooOO0);
            recyclerView2.setAdapter(c28675OooO0Oo);
        }

        public final void OooO00o(o0oOoOo.o0OoOo0 o0oooo02) {
            C31091ooOO c31091ooOO = o0oooo02.f110973OooO00o;
            C28675OooO0Oo c28675OooO0Oo = this.f109159OooO0Oo;
            List<PageColorThemeVO> list = c31091ooOO.f110977OooO0OO;
            c28675OooO0Oo.OooO0Oo(list);
            View divider = this.f109157OooO0O0;
            kotlin.jvm.internal.OooOOO0.OooO0o(divider, "divider");
            divider.setVisibility(!list.isEmpty() ? 0 : 8);
        }
    }

    public C30534o0000o0() {
        super(OooO00o.f109155OooO00o);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, int i) {
        OooO0O0 holder = (OooO0O0) abstractC22078OooOooO;
        kotlin.jvm.internal.OooOOO0.OooO0oO(holder, "holder");
        o0oOoOo.o0OoOo0 o0oooo0OooO0OO = OooO0OO(i);
        kotlin.jvm.internal.OooOOO0.OooO0o(o0oooo0OooO0OO, "getItem(...)");
        o0oOoOo.o0OoOo0 o0oooo02 = o0oooo0OooO0OO;
        C30534o0000o0 c30534o0000o0 = C30534o0000o0.this;
        View.OnClickListener onClickListener = c30534o0000o0.f109152OooO0O0;
        C28680OooOO0 c28680OooOO0 = holder.f109158OooO0OO;
        c28680OooOO0.f101627OooO0O0 = onClickListener;
        c28680OooOO0.OooO0Oo(o0oooo02.f110974OooO0O0);
        o0O0o0oO.o00Ooo o00ooo2 = new o0O0o0oO.o00Ooo(1, c30534o0000o0, o0oooo02);
        C28675OooO0Oo c28675OooO0Oo = holder.f109159OooO0Oo;
        c28675OooO0Oo.f101612OooO0O0 = o00ooo2;
        c28675OooO0Oo.f101613OooO0OO = c30534o0000o0.f109154OooO0Oo;
        holder.OooO00o(o0oooo02);
        Context context = holder.itemView.getContext();
        C31091ooOO c31091ooOO = o0oooo02.f110973OooO00o;
        int id = o0OOOO00.OooOO0O.f94356OooOO0.getId();
        int i2 = c31091ooOO.f110975OooO00o;
        String string = i2 == id ? context.getString(R.string.theme_category_cover_basic) : i2 == o0OOOO00.OooOO0O.f94357OooOO0O.getId() ? context.getString(R.string.theme_category_cover_cartoon) : i2 == o0OOOO00.OooOO0O.f94358OooOO0o.getId() ? context.getString(R.string.theme_category_cover_fruits) : i2 == o0OOOO00.OooOO0O.f94360OooOOO0.getId() ? context.getString(R.string.theme_category_cover_graphics) : i2 == o0OOOO00.OooOO0O.f94359OooOOO.getId() ? context.getString(R.string.theme_category_cover_annual) : i2 == o0OOOO00.OooOO0O.f94361OooOOOO.getId() ? context.getString(R.string.theme_category_page_basic) : i2 == o0OOOO00.OooOO0O.f94362OooOOOo.getId() ? context.getString(R.string.theme_category_page_professional) : i2 == o0OOOO00.OooOO0O.f94368OooOo00.getId() ? context.getString(R.string.theme_category_2_column) : i2 == o0OOOO00.OooOO0O.f94367OooOo0.getId() ? context.getString(R.string.theme_category_3_column) : i2 == o0OOOO00.OooOO0O.f94363OooOOo.getId() ? context.getString(R.string.theme_category_page_custom_pic) : i2 == o0OOOO00.OooOO0O.f94365OooOOoo.getId() ? context.getString(R.string.theme_category_page_study) : i2 == o0OOOO00.OooOO0O.f94364OooOOo0.getId() ? context.getString(R.string.theme_category_page_plan) : context.getString(R.string.custom);
        TextView textView = holder.f109156OooO00o;
        textView.setText(string);
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, c31091ooOO.f110978OooO0Oo ? ContextCompat.getDrawable(textView.getContext(), R.drawable.ic_ni_vip_12) : null, (Drawable) null);
        textView.setCompoundDrawablePadding(Oooo0.o000000O.OooO0o(4));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final RecyclerView.AbstractC22078OooOooO onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewOooO0OO = C20504OooO0O0.OooO0OO(viewGroup, "parent", R.layout.item_note_creation_theme_category, viewGroup, false);
        kotlin.jvm.internal.OooOOO0.OooO0Oo(viewOooO0OO);
        return new OooO0O0(viewOooO0OO);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, int i, List payloads) {
        OooO0O0 holder = (OooO0O0) abstractC22078OooOooO;
        kotlin.jvm.internal.OooOOO0.OooO0oO(holder, "holder");
        kotlin.jvm.internal.OooOOO0.OooO0oO(payloads, "payloads");
        if (!payloads.isEmpty()) {
            o0oOoOo.o0OoOo0 o0oooo0OooO0OO = OooO0OO(i);
            holder.f109158OooO0OO.OooO0Oo(o0oooo0OooO0OO.f110974OooO0O0);
            holder.OooO00o(o0oooo0OooO0OO);
            return;
        }
        super.onBindViewHolder(holder, i, payloads);
    }
}
