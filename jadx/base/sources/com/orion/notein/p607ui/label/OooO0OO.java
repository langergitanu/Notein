package com.orion.notein.p607ui.label;

import android.content.res.ColorStateList;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.widget.ImageViewCompat;
import androidx.recyclerview.widget.AbstractC22050OooOo0o;
import androidx.recyclerview.widget.OooOOO;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.label.OooO0OO;
import com.orion.notein.p607ui.label.OooOO0O;
import com.orion.notein.p607ui.label.TriStateCheckBox;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.OooOOO0;
import o0O0oo0O.ViewOnClickListenerC26210OooO00o;
import o0Oo0ooO.C28411OooO0o;
import o0Oo0ooO.C28421OooOOOo;
import o0Oo0ooO.C28422OooOOo;
import o0Oo0ooO.ViewOnClickListenerC28413OooO0oO;
import o0Oo0ooO.ViewOnClickListenerC28414OooO0oo;
import o0Oo0ooO.ViewOnClickListenerC28415OooOO0;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.OooOo;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0OO extends AbstractC22050OooOo0o<OooOO0O, RecyclerView.AbstractC22078OooOooO> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final InterfaceC19211OooO0OO f71972OooO0O0;

    public final class OooO00o extends RecyclerView.AbstractC22078OooOooO {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public int f71973OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final EditText f71974OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final ImageView f71975OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final ImageView f71976OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final ImageView f71977OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final C28421OooOOOo f71978OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final ImageView f71979OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public com.orion.notein.p607ui.label.OooO0O0 f71980OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public boolean f71981OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public Integer f71982OooOO0;

        public OooO00o(View view) {
            super(view);
            View viewFindViewById = view.findViewById(R.id.input_text);
            OooOOO0.OooO0o(viewFindViewById, "findViewById(...)");
            this.f71974OooO00o = (EditText) viewFindViewById;
            View viewFindViewById2 = view.findViewById(R.id.back_button);
            OooOOO0.OooO0o(viewFindViewById2, "findViewById(...)");
            this.f71975OooO0O0 = (ImageView) viewFindViewById2;
            View viewFindViewById3 = view.findViewById(R.id.clear_button);
            OooOOO0.OooO0o(viewFindViewById3, "findViewById(...)");
            this.f71976OooO0OO = (ImageView) viewFindViewById3;
            View viewFindViewById4 = view.findViewById(R.id.confirm_button);
            OooOOO0.OooO0o(viewFindViewById4, "findViewById(...)");
            this.f71977OooO0Oo = (ImageView) viewFindViewById4;
            View viewFindViewById5 = view.findViewById(R.id.delete_button);
            OooOOO0.OooO0o(viewFindViewById5, "findViewById(...)");
            View viewFindViewById6 = view.findViewById(R.id.color_list);
            OooOOO0.OooO0o(viewFindViewById6, "findViewById(...)");
            View viewFindViewById7 = view.findViewById(R.id.tag_color_icon);
            OooOOO0.OooO0o(viewFindViewById7, "findViewById(...)");
            this.f71979OooO0o0 = (ImageView) viewFindViewById7;
            C28421OooOOOo c28421OooOOOo = new C28421OooOOOo();
            this.f71978OooO0o = c28421OooOOOo;
            this.f71973OooO = -1;
            ((RecyclerView) viewFindViewById6).setAdapter(c28421OooOOOo);
            ((ImageView) viewFindViewById5).setVisibility(8);
        }
    }

    public final class OooO0O0 extends RecyclerView.AbstractC22078OooOooO {
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.label.OooO0OO$OooO0OO, reason: collision with other inner class name */
    public interface InterfaceC19211OooO0OO {
        default void OooO00o(int i) {
        }

        default void OooO0O0() {
        }

        default void OooO0OO(String name) {
            OooOOO0.OooO0oO(name, "name");
        }

        void OooO0Oo(long j, TriStateCheckBox.OooO00o oooO00o);

        default void OooO0o() {
        }

        default void OooO0o0(int i, String name) {
            OooOOO0.OooO0oO(name, "name");
        }
    }

    public static final class OooO0Oo extends OooOOO.AbstractC22036OooO0o0<OooOO0O> {
        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO00o(OooOO0O oooOO0O, OooOO0O oooOO0O2) {
            return oooOO0O.equals(oooOO0O2);
        }

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO0O0(OooOO0O oooOO0O, OooOO0O oooOO0O2) {
            return oooOO0O.OooO00o() == oooOO0O2.OooO00o();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.label.OooO0OO$OooO0o0, reason: case insensitive filesystem */
    public final class C23131OooO0o0 extends RecyclerView.AbstractC22078OooOooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ImageView f71984OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final TextView f71985OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final TriStateCheckBox f71986OooO0OO;

        public C23131OooO0o0(View view) {
            super(view);
            View viewFindViewById = view.findViewById(R.id.ic_label);
            OooOOO0.OooO0o(viewFindViewById, "findViewById(...)");
            this.f71984OooO00o = (ImageView) viewFindViewById;
            View viewFindViewById2 = view.findViewById(R.id.label_name);
            OooOOO0.OooO0o(viewFindViewById2, "findViewById(...)");
            this.f71985OooO0O0 = (TextView) viewFindViewById2;
            View viewFindViewById3 = view.findViewById(R.id.label_check_box);
            OooOOO0.OooO0o(viewFindViewById3, "findViewById(...)");
            this.f71986OooO0OO = (TriStateCheckBox) viewFindViewById3;
        }
    }

    public OooO0OO(InterfaceC19211OooO0OO interfaceC19211OooO0OO) {
        super(new OooO0Oo());
        this.f71972OooO0O0 = interfaceC19211OooO0OO;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final int getItemViewType(int i) {
        OooOO0O oooOO0OOooO0OO = OooO0OO(i);
        if (oooOO0OOooO0OO instanceof OooOO0O.OooO00o) {
            return ((OooOO0O.OooO00o) oooOO0OOooO0OO).f72062OooO00o ? 1 : 0;
        }
        if (oooOO0OOooO0OO instanceof OooOO0O.OooO0O0) {
            return 2;
        }
        throw new C32442OooOO0o();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO holder, int i) {
        List list;
        OooOOO0.OooO0oO(holder, "holder");
        OooOO0O oooOO0OOooO0OO = OooO0OO(i);
        if ((holder instanceof OooO0O0) && (oooOO0OOooO0OO instanceof OooOO0O.OooO00o)) {
            OooOO0O.OooO00o item = (OooOO0O.OooO00o) oooOO0OOooO0OO;
            OooOOO0.OooO0oO(item, "item");
            ((OooO0O0) holder).itemView.setSelected(item.f72062OooO00o);
            return;
        }
        if (!(holder instanceof OooO00o) || !(oooOO0OOooO0OO instanceof OooOO0O.OooO00o)) {
            if ((holder instanceof C23131OooO0o0) && (oooOO0OOooO0OO instanceof OooOO0O.OooO0O0)) {
                C23131OooO0o0 c23131OooO0o0 = (C23131OooO0o0) holder;
                final C23132OooO0Oo vo = ((OooOO0O.OooO0O0) oooOO0OOooO0OO).f72067OooO00o;
                OooOOO0.OooO0oO(vo, "vo");
                c23131OooO0o0.f71984OooO00o.setColorFilter(vo.f71990OooO0OO);
                c23131OooO0o0.f71985OooO0O0.setText(vo.f71989OooO0O0);
                TriStateCheckBox.OooO00o oooO00o = vo.f71992OooO0o0;
                TriStateCheckBox triStateCheckBox = c23131OooO0o0.f71986OooO0OO;
                triStateCheckBox.setState(oooO00o);
                final OooO0OO oooO0OO = OooO0OO.this;
                triStateCheckBox.setOnStateChange(new InterfaceC32507OooOO0o() { // from class: o0Oo0ooO.OooOO0O
                    @Override // oO0O000o.InterfaceC32507OooOO0o
                    public final Object invoke(Object obj) {
                        TriStateCheckBox.OooO00o newState = (TriStateCheckBox.OooO00o) obj;
                        kotlin.jvm.internal.OooOOO0.OooO0oO(newState, "newState");
                        OooO0OO.InterfaceC19211OooO0OO interfaceC19211OooO0OO = this.f100725OooOo0o.f71972OooO0O0;
                        if (interfaceC19211OooO0OO != null) {
                            interfaceC19211OooO0OO.OooO0Oo(vo.f71988OooO00o, newState);
                        }
                        return C32460OooOooO.f116667OooO00o;
                    }
                });
                return;
            }
            return;
        }
        final OooO00o oooO00o2 = (OooO00o) holder;
        OooOO0O.OooO00o item2 = (OooOO0O.OooO00o) oooOO0OOooO0OO;
        OooOOO0.OooO0oO(item2, "item");
        OooO0OO oooO0OO2 = OooO0OO.this;
        C28411OooO0o c28411OooO0o = new C28411OooO0o(oooO0OO2, 0);
        com.orion.notein.p607ui.label.OooO0O0 oooO0O0 = oooO00o2.f71980OooO0oO;
        EditText editText = oooO00o2.f71974OooO00o;
        if (oooO0O0 != null) {
            editText.removeTextChangedListener(oooO0O0);
        }
        com.orion.notein.p607ui.label.OooO0O0 oooO0O02 = new com.orion.notein.p607ui.label.OooO0O0(oooO00o2, c28411OooO0o);
        editText.addTextChangedListener(oooO0O02);
        oooO00o2.f71980OooO0oO = oooO0O02;
        oooO00o2.f71981OooO0oo = true;
        String string = editText.getText().toString();
        String str = item2.f72063OooO0O0;
        if (OooOOO0.OooO0O0(string, str)) {
            editText.setSelection(str.length());
        } else {
            editText.setText(str);
            editText.setSelection(str.length());
        }
        oooO00o2.f71981OooO0oo = false;
        editText.requestFocus();
        ArrayList arrayList = item2.f72064OooO0OO;
        if (arrayList.isEmpty()) {
            list = C34434OooOoO.f123453OooOo0o;
        } else {
            int size = arrayList.size();
            int i2 = item2.f72065OooO0Oo;
            if (i2 < 0 || i2 >= size) {
                i2 = 0;
            }
            ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(arrayList, 10));
            int i3 = 0;
            for (Object obj : arrayList) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    C34429OooOOo0.OooOOo();
                    throw null;
                }
                arrayList2.add(C28422OooOOo.OooO00o((C28422OooOOo) obj, i3 == i2, 3));
                i3 = i4;
            }
            list = arrayList2;
        }
        Iterator it = list.iterator();
        int i5 = 0;
        while (true) {
            if (!it.hasNext()) {
                i5 = -1;
                break;
            } else if (((C28422OooOOo) it.next()).f100771OooO0OO) {
                break;
            } else {
                i5++;
            }
        }
        oooO00o2.f71973OooO = i5;
        if (i5 < 0 && !list.isEmpty()) {
            oooO00o2.f71973OooO = 0;
        }
        C28422OooOOo c28422OooOOo = (C28422OooOOo) OooOo.OoooO00(oooO00o2.f71973OooO, list);
        oooO00o2.f71982OooOO0 = c28422OooOOo != null ? Integer.valueOf(c28422OooOOo.f100769OooO00o) : null;
        C28421OooOOOo c28421OooOOOo = oooO00o2.f71978OooO0o;
        c28421OooOOOo.OooO0Oo(list);
        Integer num = oooO00o2.f71982OooOO0;
        ImageView imageView = oooO00o2.f71979OooO0o0;
        if (num != null) {
            ImageViewCompat.setImageTintList(imageView, ColorStateList.valueOf(num.intValue()));
        } else {
            ImageViewCompat.setImageTintList(imageView, null);
        }
        oooO00o2.f71975OooO0O0.setOnClickListener(new ViewOnClickListenerC28413OooO0oO(oooO0OO2, 0));
        oooO00o2.f71976OooO0OO.setOnClickListener(new ViewOnClickListenerC26210OooO00o(oooO00o2, 1));
        oooO00o2.f71977OooO0Oo.setOnClickListener(new ViewOnClickListenerC28414OooO0oo(0, oooO00o2, oooO0OO2));
        editText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: o0Oo0ooO.OooO
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i6, KeyEvent keyEvent) {
                if (i6 != 6) {
                    return false;
                }
                oooO00o2.f71977OooO0Oo.performClick();
                return true;
            }
        });
        c28421OooOOOo.f100763OooO0O0 = new com.orion.notein.p607ui.label.OooO00o(oooO00o2, oooO0OO2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final RecyclerView.AbstractC22078OooOooO onCreateViewHolder(ViewGroup parent, int i) {
        OooOOO0.OooO0oO(parent, "parent");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(parent.getContext());
        if (i == 0) {
            View viewInflate = layoutInflaterFrom.inflate(R.layout.item_label_manage_create, parent, false);
            OooOOO0.OooO0o(viewInflate, "inflate(...)");
            OooO0O0 oooO0O0 = new OooO0O0(viewInflate);
            viewInflate.setOnClickListener(new ViewOnClickListenerC28415OooOO0(this, 0));
            return oooO0O0;
        }
        if (i == 1) {
            View viewInflate2 = layoutInflaterFrom.inflate(R.layout.item_label_manage_edit, parent, false);
            OooOOO0.OooO0o(viewInflate2, "inflate(...)");
            return new OooO00o(viewInflate2);
        }
        if (i == 2) {
            View viewInflate3 = layoutInflaterFrom.inflate(R.layout.item_item_label_management, parent, false);
            OooOOO0.OooO0o(viewInflate3, "inflate(...)");
            return new C23131OooO0o0(viewInflate3);
        }
        throw new IllegalStateException(("Unknown view type: " + i).toString());
    }
}
