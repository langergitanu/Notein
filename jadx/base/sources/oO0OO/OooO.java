package oO0OO;

import OooOoO.C20504OooO0O0;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.AbstractC22050OooOo0o;
import androidx.recyclerview.widget.OooOOO;
import androidx.recyclerview.widget.RecyclerView;
import com.android.billingclient.api.C22172OooOoO;
import com.orion.notein.global.R;
import java.util.List;
import kotlin.jvm.internal.OooOOO0;
import o0Ooo0oo.ViewOnClickListenerC29543o000O0o0;
import o0oOoOo.C31088OoooooO;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32443OooOOO;
import oO0OO.C32881OooO0oO;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO extends AbstractC22050OooOo0o<C32443OooOOO<? extends C31088OoooooO.OooO00o, ? extends List<? extends C31088OoooooO>>, OooO0O0> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public ViewOnClickListenerC29543o000O0o0 f117979OooO0O0;

    public static final class OooO00o extends OooOOO.AbstractC22036OooO0o0<C32443OooOOO<? extends C31088OoooooO.OooO00o, ? extends List<? extends C31088OoooooO>>> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO00o f117980OooO00o = new OooO00o();

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO00o(C32443OooOOO<? extends C31088OoooooO.OooO00o, ? extends List<? extends C31088OoooooO>> c32443OooOOO, C32443OooOOO<? extends C31088OoooooO.OooO00o, ? extends List<? extends C31088OoooooO>> c32443OooOOO2) {
            return c32443OooOOO.equals(c32443OooOOO2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO0O0(C32443OooOOO<? extends C31088OoooooO.OooO00o, ? extends List<? extends C31088OoooooO>> c32443OooOOO, C32443OooOOO<? extends C31088OoooooO.OooO00o, ? extends List<? extends C31088OoooooO>> c32443OooOOO2) {
            return ((C31088OoooooO.OooO00o) c32443OooOOO.f116638OooOo0o).ordinal() == ((C31088OoooooO.OooO00o) c32443OooOOO2.f116638OooOo0o).ordinal();
        }

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final Object OooO0OO(C32443OooOOO<? extends C31088OoooooO.OooO00o, ? extends List<? extends C31088OoooooO>> c32443OooOOO, C32443OooOOO<? extends C31088OoooooO.OooO00o, ? extends List<? extends C31088OoooooO>> c32443OooOOO2) {
            return C22172OooOoO.OooO00o("list", "update");
        }
    }

    public final class OooO0O0 extends RecyclerView.AbstractC22078OooOooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final TextView f117981OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final C32881OooO0oO f117982OooO0O0;

        public OooO0O0(View view) {
            super(view);
            this.f117981OooO00o = (TextView) view.findViewById(R.id.category);
            RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rv_session_list);
            C32881OooO0oO c32881OooO0oO = new C32881OooO0oO(C32881OooO0oO.OooO00o.f118003OooO00o);
            this.f117982OooO0O0 = c32881OooO0oO;
            recyclerView.setAdapter(c32881OooO0oO);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, int i) {
        String string;
        OooO0O0 holder = (OooO0O0) abstractC22078OooOooO;
        OooOOO0.OooO0oO(holder, "holder");
        C32443OooOOO<? extends C31088OoooooO.OooO00o, ? extends List<? extends C31088OoooooO>> c32443OooOOOOooO0OO = OooO0OO(i);
        OooOOO0.OooO0o(c32443OooOOOOooO0OO, "getItem(...)");
        C32443OooOOO<? extends C31088OoooooO.OooO00o, ? extends List<? extends C31088OoooooO>> c32443OooOOO = c32443OooOOOOooO0OO;
        ViewOnClickListenerC29543o000O0o0 viewOnClickListenerC29543o000O0o0 = OooO.this.f117979OooO0O0;
        C32881OooO0oO c32881OooO0oO = holder.f117982OooO0O0;
        c32881OooO0oO.f118002OooO0O0 = viewOnClickListenerC29543o000O0o0;
        c32881OooO0oO.OooO0Oo((List) c32443OooOOO.f116637OooOo);
        Context context = holder.itemView.getContext();
        int iOrdinal = ((C31088OoooooO.OooO00o) c32443OooOOO.f116638OooOo0o).ordinal();
        if (iOrdinal == 0) {
            string = context.getString(R.string.section_sessions_today);
        } else if (iOrdinal == 1) {
            string = context.getString(R.string.section_sessions_before_one_week);
        } else {
            if (iOrdinal != 2) {
                throw new C32442OooOO0o();
            }
            string = context.getString(R.string.section_sessions_before_one_month);
        }
        holder.f117981OooO00o.setText(string);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final RecyclerView.AbstractC22078OooOooO onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewOooO0OO = C20504OooO0O0.OooO0OO(viewGroup, "parent", R.layout.item_text_recognize_session_category, viewGroup, false);
        OooOOO0.OooO0Oo(viewOooO0OO);
        return new OooO0O0(viewOooO0OO);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, int i, List payloads) {
        OooO0O0 holder = (OooO0O0) abstractC22078OooOooO;
        OooOOO0.OooO0oO(holder, "holder");
        OooOOO0.OooO0oO(payloads, "payloads");
        if (!payloads.isEmpty()) {
            holder.f117982OooO0O0.OooO0Oo((List) OooO0OO(i).f116637OooOo);
        } else {
            super.onBindViewHolder(holder, i, payloads);
        }
    }
}
