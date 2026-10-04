package o0Oo0oO;

import OooOoO.C20504OooO0O0;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.recyclerview.widget.AbstractC22050OooOo0o;
import androidx.recyclerview.widget.OooOOO;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.global.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.OooOOO0;
import o0Oo0oO0.OooOO0;
import o0oOoOo.C31038OooOO0;

/* JADX INFO: renamed from: o0Oo0oO.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28287OooO0OO extends AbstractC22050OooOo0o<C31038OooOO0, OooO0O0> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public OooOO0 f100328OooO0O0;

    /* JADX INFO: renamed from: o0Oo0oO.OooO0OO$OooO00o */
    public static final class OooO00o extends OooOOO.AbstractC22036OooO0o0<C31038OooOO0> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO00o f100329OooO00o = new OooO00o();

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO00o(C31038OooOO0 c31038OooOO0, C31038OooOO0 c31038OooOO02) {
            return c31038OooOO0.equals(c31038OooOO02);
        }

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO0O0(C31038OooOO0 c31038OooOO0, C31038OooOO0 c31038OooOO02) {
            return c31038OooOO0.f110814OooO00o == c31038OooOO02.f110814OooO00o;
        }
    }

    /* JADX INFO: renamed from: o0Oo0oO.OooO0OO$OooO0O0 */
    public final class OooO0O0 extends RecyclerView.AbstractC22078OooOooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final TextView f100330OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final CheckBox f100331OooO0O0;

        public OooO0O0(C28287OooO0OO c28287OooO0OO, View view) {
            super(view);
            View viewFindViewById = view.findViewById(R.id.name);
            OooOOO0.OooO0o(viewFindViewById, "findViewById(...)");
            this.f100330OooO00o = (TextView) viewFindViewById;
            View viewFindViewById2 = view.findViewById(R.id.selected);
            OooOOO0.OooO0o(viewFindViewById2, "findViewById(...)");
            CheckBox checkBox = (CheckBox) viewFindViewById2;
            this.f100331OooO0O0 = checkBox;
            OooOO0 oooOO02 = c28287OooO0OO.f100328OooO0O0;
            if (oooOO02 != null) {
                this.itemView.setOnClickListener(oooOO02);
                checkBox.setOnClickListener(oooOO02);
            }
        }

        public final void OooO00o(C31038OooOO0 c31038OooOO0) {
            this.itemView.setTag(c31038OooOO0);
            CheckBox checkBox = this.f100331OooO0O0;
            checkBox.setTag(c31038OooOO0);
            int i = c31038OooOO0.f110814OooO00o;
            this.f100330OooO00o.setText(i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? "" : this.itemView.getContext().getString(R.string.feedback_type_other) : this.itemView.getContext().getString(R.string.feedback_type_suggestions) : this.itemView.getContext().getString(R.string.feedback_type_net) : this.itemView.getContext().getString(R.string.feedback_type_experience) : this.itemView.getContext().getString(R.string.feedback_type_bug));
            checkBox.setChecked(c31038OooOO0.f110815OooO0O0);
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC22050OooOo0o
    public final void OooO0Oo(List<C31038OooOO0> list) {
        ArrayList arrayList;
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (((C31038OooOO0) obj).f110814OooO00o != 2) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        super.OooO0Oo(arrayList);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, int i) {
        OooO0O0 holder = (OooO0O0) abstractC22078OooOooO;
        OooOOO0.OooO0oO(holder, "holder");
        C31038OooOO0 c31038OooOO0OooO0OO = OooO0OO(i);
        OooOOO0.OooO0o(c31038OooOO0OooO0OO, "getItem(...)");
        holder.OooO00o(c31038OooOO0OooO0OO);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final RecyclerView.AbstractC22078OooOooO onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewOooO0OO = C20504OooO0O0.OooO0OO(viewGroup, "parent", R.layout.item_feedback_type, viewGroup, false);
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
            C31038OooOO0 c31038OooOO0OooO0OO = OooO0OO(i);
            OooOOO0.OooO0o(c31038OooOO0OooO0OO, "getItem(...)");
            holder.OooO00o(c31038OooOO0OooO0OO);
            return;
        }
        super.onBindViewHolder(holder, i, payloads);
    }
}
