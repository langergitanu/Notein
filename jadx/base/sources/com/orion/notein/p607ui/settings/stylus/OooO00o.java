package com.orion.notein.p607ui.settings.stylus;

import OooOooo.C20785Oooo00o;
import Oooo0oO.C21023OooO0Oo;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.AbstractC22050OooOo0o;
import androidx.recyclerview.widget.OooOOO;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.global.R;
import kotlin.jvm.internal.OooOOO0;
import o0Oo0oOo.ViewOnClickListenerC28314OooOO0;
import o0OoOOoO.ViewOnClickListenerC29187OooO00o;
import o0oOoOo.C31062Oooo000;
import oO00ooO.C32442OooOO0o;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO00o extends AbstractC22050OooOo0o<OooO0O0, RecyclerView.AbstractC22078OooOooO> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public ViewOnClickListenerC29187OooO00o f79301OooO0O0;

    /* JADX INFO: renamed from: com.orion.notein.ui.settings.stylus.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C19505OooO00o extends OooOOO.AbstractC22036OooO0o0<OooO0O0> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final C19505OooO00o f79302OooO00o = new C19505OooO00o();

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO00o(OooO0O0 oooO0O0, OooO0O0 oooO0O02) {
            return oooO0O0.equals(oooO0O02);
        }

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO0O0(OooO0O0 oooO0O0, OooO0O0 oooO0O02) {
            OooO0O0 oooO0O03 = oooO0O0;
            OooO0O0 oooO0O04 = oooO0O02;
            if ((oooO0O03 instanceof OooO0O0.C19506OooO00o) && (oooO0O04 instanceof OooO0O0.C19506OooO00o)) {
                return ((OooO0O0.C19506OooO00o) oooO0O03).f79303OooO00o == ((OooO0O0.C19506OooO00o) oooO0O04).f79303OooO00o;
            }
            if (!(oooO0O03 instanceof OooO0O0.C19507OooO0O0) || !(oooO0O04 instanceof OooO0O0.C19507OooO0O0)) {
                return false;
            }
            OooO0O0.C19507OooO0O0 c19507OooO0O0 = (OooO0O0.C19507OooO0O0) oooO0O03;
            OooO0O0.C19507OooO0O0 c19507OooO0O02 = (OooO0O0.C19507OooO0O0) oooO0O04;
            return OooOOO0.OooO0O0(c19507OooO0O0.f79304OooO00o, c19507OooO0O02.f79304OooO00o) && c19507OooO0O0.f79305OooO0O0.f110894OooO0OO.equals(c19507OooO0O02.f79305OooO0O0.f110894OooO0OO);
        }
    }

    public static abstract class OooO0O0 {

        /* JADX INFO: renamed from: com.orion.notein.ui.settings.stylus.OooO00o$OooO0O0$OooO00o, reason: collision with other inner class name */
        public static final class C19506OooO00o extends OooO0O0 {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final int f79303OooO00o;

            public C19506OooO00o(int i) {
                this.f79303OooO00o = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C19506OooO00o) && this.f79303OooO00o == ((C19506OooO00o) obj).f79303OooO00o;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f79303OooO00o);
            }

            public final String toString() {
                return C21023OooO0Oo.OooO0OO(")", this.f79303OooO00o, new StringBuilder("SectionHeader(titleRes="));
            }
        }

        /* JADX INFO: renamed from: com.orion.notein.ui.settings.stylus.OooO00o$OooO0O0$OooO0O0, reason: collision with other inner class name */
        public static final class C19507OooO0O0 extends OooO0O0 {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final String f79304OooO00o;

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public final C31062Oooo000 f79305OooO0O0;

            /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
            public final int f79306OooO0OO;

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final int f79307OooO0Oo;

            public C19507OooO0O0(String sectionId, C31062Oooo000 c31062Oooo000, int i, int i2) {
                OooOOO0.OooO0oO(sectionId, "sectionId");
                this.f79304OooO00o = sectionId;
                this.f79305OooO0O0 = c31062Oooo000;
                this.f79306OooO0OO = i;
                this.f79307OooO0Oo = i2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C19507OooO0O0)) {
                    return false;
                }
                C19507OooO0O0 c19507OooO0O0 = (C19507OooO0O0) obj;
                return OooOOO0.OooO0O0(this.f79304OooO00o, c19507OooO0O0.f79304OooO00o) && OooOOO0.OooO0O0(this.f79305OooO0O0, c19507OooO0O0.f79305OooO0O0) && this.f79306OooO0OO == c19507OooO0O0.f79306OooO0OO && this.f79307OooO0Oo == c19507OooO0O0.f79307OooO0Oo;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f79307OooO0Oo) + C20785Oooo00o.OooO00o(this.f79306OooO0OO, (this.f79305OooO0O0.hashCode() + (this.f79304OooO00o.hashCode() * 31)) * 31, 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("SectionOption(sectionId=");
                sb.append(this.f79304OooO00o);
                sb.append(", option=");
                sb.append(this.f79305OooO0O0);
                sb.append(", indexInSection=");
                sb.append(this.f79306OooO0OO);
                sb.append(", sectionSize=");
                return C21023OooO0Oo.OooO0OO(")", this.f79307OooO0Oo, sb);
            }
        }
    }

    public final class OooO0OO extends RecyclerView.AbstractC22078OooOooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final TextView f79308OooO00o;

        public OooO0OO(View view) {
            super(view);
            View viewFindViewById = view.findViewById(R.id.section_title);
            OooOOO0.OooO0o(viewFindViewById, "findViewById(...)");
            this.f79308OooO00o = (TextView) viewFindViewById;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.settings.stylus.OooO00o$OooO0Oo, reason: case insensitive filesystem */
    public final class C23835OooO0Oo extends RecyclerView.AbstractC22078OooOooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final TextView f79309OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final ImageView f79310OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final View f79311OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int f79312OooO0Oo;

        public C23835OooO0Oo(OooO00o oooO00o, View view) {
            super(view);
            View viewFindViewById = view.findViewById(R.id.name);
            OooOOO0.OooO0o(viewFindViewById, "findViewById(...)");
            this.f79309OooO00o = (TextView) viewFindViewById;
            View viewFindViewById2 = view.findViewById(R.id.selected);
            OooOOO0.OooO0o(viewFindViewById2, "findViewById(...)");
            this.f79310OooO0O0 = (ImageView) viewFindViewById2;
            View viewFindViewById3 = view.findViewById(R.id.divider);
            OooOOO0.OooO0o(viewFindViewById3, "findViewById(...)");
            this.f79311OooO0OO = viewFindViewById3;
            this.f79312OooO0Oo = Ooooo00.OooOOO.OooO0OO(16);
            view.setOnClickListener(new ViewOnClickListenerC28314OooOO0(oooO00o, 5));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final int getItemViewType(int i) {
        OooO0O0 oooO0O0OooO0OO = OooO0OO(i);
        if (oooO0O0OooO0OO instanceof OooO0O0.C19506OooO00o) {
            return 0;
        }
        if (oooO0O0OooO0OO instanceof OooO0O0.C19507OooO0O0) {
            return 1;
        }
        throw new C32442OooOO0o();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO holder, int i) {
        OooOOO0.OooO0oO(holder, "holder");
        OooO0O0 oooO0O0OooO0OO = OooO0OO(i);
        if (oooO0O0OooO0OO instanceof OooO0O0.C19506OooO00o) {
            OooO0O0.C19506OooO00o item = (OooO0O0.C19506OooO00o) oooO0O0OooO0OO;
            OooOOO0.OooO0oO(item, "item");
            ((OooO0OO) holder).f79308OooO00o.setText(item.f79303OooO00o);
            return;
        }
        if (!(oooO0O0OooO0OO instanceof OooO0O0.C19507OooO0O0)) {
            throw new C32442OooOO0o();
        }
        C23835OooO0Oo c23835OooO0Oo = (C23835OooO0Oo) holder;
        OooO0O0.C19507OooO0O0 item2 = (OooO0O0.C19507OooO0O0) oooO0O0OooO0OO;
        OooOOO0.OooO0oO(item2, "item");
        c23835OooO0Oo.itemView.setTag(item2);
        Context context = c23835OooO0Oo.itemView.getContext();
        C31062Oooo000 c31062Oooo000 = item2.f79305OooO0O0;
        c23835OooO0Oo.f79309OooO00o.setText(context.getString(c31062Oooo000.f110892OooO00o));
        c23835OooO0Oo.f79310OooO0O0.setSelected(c31062Oooo000.f110893OooO0O0);
        int i2 = item2.f79306OooO0OO;
        int i3 = item2.f79307OooO0Oo;
        c23835OooO0Oo.itemView.setBackgroundResource(i3 == 1 ? R.drawable.bg_shortcut_option_selector_single_selector : i2 == 0 ? R.drawable.bg_shortcut_option_selector_top_selector : i2 == i3 + (-1) ? R.drawable.bg_shortcut_option_selector_bottom_selector : R.drawable.bg_shortcut_option_selector_middle_selector);
        int i4 = i3 - 1;
        c23835OooO0Oo.f79311OooO0OO.setVisibility(i2 != i4 ? 0 : 8);
        ViewGroup.LayoutParams layoutParams = c23835OooO0Oo.itemView.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams == null) {
            return;
        }
        int i5 = i2 == i4 ? c23835OooO0Oo.f79312OooO0Oo : 0;
        if (marginLayoutParams.bottomMargin != i5) {
            marginLayoutParams.bottomMargin = i5;
            c23835OooO0Oo.itemView.setLayoutParams(marginLayoutParams);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final RecyclerView.AbstractC22078OooOooO onCreateViewHolder(ViewGroup parent, int i) {
        OooOOO0.OooO0oO(parent, "parent");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(parent.getContext());
        if (i == 0) {
            View viewInflate = layoutInflaterFrom.inflate(R.layout.item_stylus_shortcut_section_header, parent, false);
            OooOOO0.OooO0Oo(viewInflate);
            return new OooO0OO(viewInflate);
        }
        View viewInflate2 = layoutInflaterFrom.inflate(R.layout.item_stylus_shortcut_option, parent, false);
        OooOOO0.OooO0Oo(viewInflate2);
        return new C23835OooO0Oo(this, viewInflate2);
    }
}
