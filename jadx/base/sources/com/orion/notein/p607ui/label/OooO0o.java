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
import com.orion.notein.p607ui.label.OooO0o;
import com.orion.notein.p607ui.label.OooOO0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.OooOOO0;
import o0O0ooo0.C26239OooO0o;
import o0Oo0Ooo.ViewOnClickListenerC28142OooO0oo;
import o0Oo0ooO.C28421OooOOOo;
import o0Oo0ooO.C28422OooOOo;
import o0Oo0ooO.C28425OooOo;
import o0Oo0ooO.C28456OoooOoO;
import o0Oo0ooO.ViewOnClickListenerC28426OooOo0;
import o0Oo0ooO.ViewOnClickListenerC28427OooOo00;
import o0Oo0ooO.ViewOnClickListenerC28428OooOo0O;
import oO00ooO.C32442OooOO0o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.OooOo;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0o extends AbstractC22050OooOo0o<OooOO0, RecyclerView.AbstractC22078OooOooO> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO0OO f71993OooO0O0;

    public final class OooO00o extends RecyclerView.AbstractC22078OooOooO {
    }

    public final class OooO0O0 extends RecyclerView.AbstractC22078OooOooO {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public boolean f71994OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final EditText f71995OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final ImageView f71996OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final ImageView f71997OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final ImageView f71998OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final ImageView f71999OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final ImageView f72000OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final C28421OooOOOo f72001OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public OooO f72002OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public int f72003OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public Integer f72004OooOO0O;

        public OooO0O0(View view) {
            super(view);
            View viewFindViewById = view.findViewById(R.id.input_text);
            OooOOO0.OooO0o(viewFindViewById, "findViewById(...)");
            this.f71995OooO00o = (EditText) viewFindViewById;
            View viewFindViewById2 = view.findViewById(R.id.back_button);
            OooOOO0.OooO0o(viewFindViewById2, "findViewById(...)");
            this.f71996OooO0O0 = (ImageView) viewFindViewById2;
            View viewFindViewById3 = view.findViewById(R.id.clear_button);
            OooOOO0.OooO0o(viewFindViewById3, "findViewById(...)");
            this.f71997OooO0OO = (ImageView) viewFindViewById3;
            View viewFindViewById4 = view.findViewById(R.id.confirm_button);
            OooOOO0.OooO0o(viewFindViewById4, "findViewById(...)");
            this.f71998OooO0Oo = (ImageView) viewFindViewById4;
            View viewFindViewById5 = view.findViewById(R.id.delete_button);
            OooOOO0.OooO0o(viewFindViewById5, "findViewById(...)");
            this.f72000OooO0o0 = (ImageView) viewFindViewById5;
            View viewFindViewById6 = view.findViewById(R.id.color_list);
            OooOOO0.OooO0o(viewFindViewById6, "findViewById(...)");
            View viewFindViewById7 = view.findViewById(R.id.tag_color_icon);
            OooOOO0.OooO0o(viewFindViewById7, "findViewById(...)");
            this.f71999OooO0o = (ImageView) viewFindViewById7;
            C28421OooOOOo c28421OooOOOo = new C28421OooOOOo();
            this.f72001OooO0oO = c28421OooOOOo;
            this.f72003OooOO0 = -1;
            ((RecyclerView) viewFindViewById6).setAdapter(c28421OooOOOo);
        }

        public final void OooO00o(String str) {
            this.f71994OooO = true;
            EditText editText = this.f71995OooO00o;
            if (OooOOO0.OooO0O0(editText.getText().toString(), str)) {
                editText.setSelection(str.length());
            } else {
                editText.setText(str);
                editText.setSelection(str.length());
            }
            this.f71994OooO = false;
            editText.requestFocus();
        }

        public final void OooO0O0(Integer num) {
            ImageView imageView = this.f71999OooO0o;
            if (num != null) {
                ImageViewCompat.setImageTintList(imageView, ColorStateList.valueOf(num.intValue()));
            } else {
                ImageViewCompat.setImageTintList(imageView, null);
            }
        }
    }

    public interface OooO0OO {
        void OooO(C28456OoooOoO c28456OoooOoO, int i);

        void OooO00o(int i);

        void OooO0O0();

        void OooO0OO(String str);

        void OooO0Oo();

        void OooO0o(int i, String str);

        void OooO0o0(C28456OoooOoO c28456OoooOoO);

        void OooO0oO(C28456OoooOoO c28456OoooOoO);

        void OooO0oo(C28456OoooOoO c28456OoooOoO);
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.label.OooO0o$OooO0Oo, reason: case insensitive filesystem */
    public static final class C23133OooO0Oo extends OooOOO.AbstractC22036OooO0o0<OooOO0> {
        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO00o(OooOO0 oooOO02, OooOO0 oooOO03) {
            return oooOO02.equals(oooOO03);
        }

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO0O0(OooOO0 oooOO02, OooOO0 oooOO03) {
            return oooOO02.OooO00o() == oooOO03.OooO00o();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.label.OooO0o$OooO0o0, reason: case insensitive filesystem */
    public final class C23134OooO0o0 extends RecyclerView.AbstractC22078OooOooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final TextView f72006OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final ImageView f72007OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final ImageView f72008OooO0OO;

        public C23134OooO0o0(View view) {
            super(view);
            View viewFindViewById = view.findViewById(R.id.tv_label_title);
            OooOOO0.OooO0o(viewFindViewById, "findViewById(...)");
            this.f72006OooO00o = (TextView) viewFindViewById;
            View viewFindViewById2 = view.findViewById(R.id.tag_color_icon);
            OooOOO0.OooO0o(viewFindViewById2, "findViewById(...)");
            this.f72007OooO0O0 = (ImageView) viewFindViewById2;
            View viewFindViewById3 = view.findViewById(R.id.label_edit_button);
            OooOOO0.OooO0o(viewFindViewById3, "findViewById(...)");
            this.f72008OooO0OO = (ImageView) viewFindViewById3;
        }
    }

    public OooO0o(OooO0OO oooO0OO) {
        super(new C23133OooO0Oo());
        this.f71993OooO0O0 = oooO0OO;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final int getItemViewType(int i) {
        OooOO0 oooOO0OooO0OO = OooO0OO(i);
        if (oooOO0OooO0OO.OooO0O0()) {
            return 2;
        }
        return oooOO0OooO0OO instanceof OooOO0.OooO00o ? 0 : 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x01cf  */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO holder, int i) {
        ArrayList arrayListO0ooOoO;
        int i2;
        OooOOO0.OooO0oO(holder, "holder");
        OooOO0 oooOO0OooO0OO = OooO0OO(i);
        if ((holder instanceof OooO00o) && (oooOO0OooO0OO instanceof OooOO0.OooO00o)) {
            OooOO0.OooO00o item = (OooOO0.OooO00o) oooOO0OooO0OO;
            OooOOO0.OooO0oO(item, "item");
            ((OooO00o) holder).itemView.setSelected(false);
            return;
        }
        if ((holder instanceof C23134OooO0o0) && (oooOO0OooO0OO instanceof OooOO0.OooO0O0)) {
            final C23134OooO0o0 c23134OooO0o0 = (C23134OooO0o0) holder;
            final C28456OoooOoO vo = ((OooOO0.OooO0O0) oooOO0OooO0OO).f72059OooO00o;
            OooOOO0.OooO0oO(vo, "vo");
            c23134OooO0o0.f72006OooO00o.setText(vo.f100834OooO0O0);
            ImageViewCompat.setImageTintList(c23134OooO0o0.f72007OooO0O0, ColorStateList.valueOf(vo.f100835OooO0OO));
            final OooO0o oooO0o = OooO0o.this;
            c23134OooO0o0.f72008OooO0OO.setOnClickListener(new View.OnClickListener() { // from class: o0Oo0ooO.OooOoo
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int bindingAdapterPosition = c23134OooO0o0.getBindingAdapterPosition();
                    if (bindingAdapterPosition != -1) {
                        com.orion.notein.p607ui.label.OooO0o oooO0o2 = oooO0o;
                        oooO0o2.f71993OooO0O0.OooO(vo, bindingAdapterPosition);
                    }
                }
            });
            return;
        }
        if (holder instanceof OooO0O0) {
            final OooO0O0 oooO0O0 = (OooO0O0) holder;
            OooOOO0.OooO0Oo(oooOO0OooO0OO);
            oooO0O0.itemView.setSelected(true);
            boolean z = oooOO0OooO0OO instanceof OooOO0.OooO00o;
            final OooO0o oooO0o2 = OooO0o.this;
            EditText editText = oooO0O0.f71995OooO00o;
            C28421OooOOOo c28421OooOOOo = oooO0O0.f72001OooO0oO;
            ImageView imageView = oooO0O0.f71998OooO0Oo;
            ImageView imageView2 = oooO0O0.f71997OooO0OO;
            ImageView imageView3 = oooO0O0.f71996OooO0O0;
            ImageView imageView4 = oooO0O0.f72000OooO0o0;
            if (z) {
                OooOO0.OooO00o oooO00o = (OooOO0.OooO00o) oooOO0OooO0OO;
                imageView4.setVisibility(8);
                C26239OooO0o c26239OooO0o = new C26239OooO0o(oooO0o2, 1);
                OooO oooO = oooO0O0.f72002OooO0oo;
                if (oooO != null) {
                    editText.removeTextChangedListener(oooO);
                }
                OooO oooO2 = new OooO(oooO0O0, c26239OooO0o);
                editText.addTextChangedListener(oooO2);
                oooO0O0.f72002OooO0oo = oooO2;
                oooO0O0.OooO00o(oooO00o.f72054OooO00o);
                ArrayList arrayList = oooO00o.f72055OooO0O0;
                ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(C28422OooOOo.OooO00o((C28422OooOOo) it.next(), false, 7));
                }
                ArrayList arrayListO0ooOoO2 = OooOo.o0ooOoO(arrayList2);
                Iterator it2 = arrayListO0ooOoO2.iterator();
                int i3 = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        i2 = -1;
                        break;
                    } else {
                        if (((C28422OooOOo) it2.next()).f100771OooO0OO) {
                            i2 = i3;
                            break;
                        }
                        i3++;
                    }
                }
                oooO0O0.f72003OooOO0 = i2;
                if (i2 < 0 && !arrayListO0ooOoO2.isEmpty()) {
                    oooO0O0.f72003OooOO0 = 0;
                    arrayListO0ooOoO2.set(0, C28422OooOOo.OooO00o((C28422OooOOo) arrayListO0ooOoO2.get(0), true, 3));
                }
                C28422OooOOo c28422OooOOo = (C28422OooOOo) OooOo.OoooO00(oooO0O0.f72003OooOO0, arrayListO0ooOoO2);
                oooO0O0.f72004OooOO0O = c28422OooOOo != null ? Integer.valueOf(c28422OooOOo.f100769OooO00o) : null;
                c28421OooOOOo.OooO0Oo(arrayListO0ooOoO2);
                oooO0O0.OooO0O0(oooO0O0.f72004OooOO0O);
                int i4 = 0;
                imageView3.setOnClickListener(new ViewOnClickListenerC28427OooOo00(oooO0o2, i4));
                imageView2.setOnClickListener(new ViewOnClickListenerC28426OooOo0(oooO0o2, i4));
                imageView.setOnClickListener(new ViewOnClickListenerC28428OooOo0O(0, oooO0O0, oooO0o2));
                editText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: o0Oo0ooO.OooOo0o
                    @Override // android.widget.TextView.OnEditorActionListener
                    public final boolean onEditorAction(TextView textView, int i5, KeyEvent keyEvent) {
                        if (i5 != 6) {
                            return false;
                        }
                        oooO0O0.f71998OooO0Oo.performClick();
                        return true;
                    }
                });
                c28421OooOOOo.f100763OooO0O0 = new C23137OooO0oO(oooO0O0);
                return;
            }
            if (!(oooOO0OooO0OO instanceof OooOO0.OooO0O0)) {
                throw new C32442OooOO0o();
            }
            OooOO0.OooO0O0 oooO0O02 = (OooOO0.OooO0O0) oooOO0OooO0OO;
            imageView4.setVisibility(0);
            C28425OooOo c28425OooOo = new C28425OooOo();
            OooO oooO3 = oooO0O0.f72002OooO0oo;
            if (oooO3 != null) {
                editText.removeTextChangedListener(oooO3);
            }
            OooO oooO4 = new OooO(oooO0O0, c28425OooOo);
            editText.addTextChangedListener(oooO4);
            oooO0O0.f72002OooO0oo = oooO4;
            final C28456OoooOoO c28456OoooOoO = oooO0O02.f72059OooO00o;
            oooO0O0.OooO00o(c28456OoooOoO.f100834OooO0O0);
            List<C28422OooOOo> list = c28456OoooOoO.f100838OooO0o0;
            boolean z2 = list instanceof Collection;
            int i5 = c28456OoooOoO.f100835OooO0OO;
            if (z2 && list.isEmpty()) {
                ArrayList arrayList3 = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
                while (r3.hasNext()) {
                }
                arrayListO0ooOoO = OooOo.o0ooOoO(arrayList3);
            } else {
                Iterator<T> it3 = list.iterator();
                while (it3.hasNext()) {
                    if (((C28422OooOOo) it3.next()).f100771OooO0OO) {
                        ArrayList arrayList4 = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
                        Iterator<T> it4 = list.iterator();
                        while (it4.hasNext()) {
                            arrayList4.add(C28422OooOOo.OooO00o((C28422OooOOo) it4.next(), false, 7));
                        }
                        arrayListO0ooOoO = OooOo.o0ooOoO(arrayList4);
                    }
                }
                ArrayList arrayList32 = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
                for (C28422OooOOo c28422OooOOo2 : list) {
                    arrayList32.add(C28422OooOOo.OooO00o(c28422OooOOo2, c28422OooOOo2.f100769OooO00o == i5, 3));
                }
                arrayListO0ooOoO = OooOo.o0ooOoO(arrayList32);
            }
            Iterator it5 = arrayListO0ooOoO.iterator();
            int i6 = 0;
            while (true) {
                if (!it5.hasNext()) {
                    i6 = -1;
                    break;
                } else if (((C28422OooOOo) it5.next()).f100771OooO0OO) {
                    break;
                } else {
                    i6++;
                }
            }
            oooO0O0.f72003OooOO0 = i6;
            if (i6 < 0 && !arrayListO0ooOoO.isEmpty()) {
                oooO0O0.f72003OooOO0 = 0;
                arrayListO0ooOoO.set(0, C28422OooOOo.OooO00o((C28422OooOOo) arrayListO0ooOoO.get(0), true, 3));
            }
            C28422OooOOo c28422OooOOo3 = (C28422OooOOo) OooOo.OoooO00(oooO0O0.f72003OooOO0, arrayListO0ooOoO);
            oooO0O0.f72004OooOO0O = c28422OooOOo3 != null ? Integer.valueOf(c28422OooOOo3.f100769OooO00o) : Integer.valueOf(i5);
            c28421OooOOOo.OooO0Oo(arrayListO0ooOoO);
            oooO0O0.OooO0O0(oooO0O0.f72004OooOO0O);
            imageView3.setOnClickListener(new View.OnClickListener() { // from class: o0Oo0ooO.OooOoO0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    com.orion.notein.p607ui.label.OooO0o oooO0o3 = this.f100787OooOo0o;
                    oooO0o3.f71993OooO0O0.OooO0oO(c28456OoooOoO);
                }
            });
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: o0Oo0ooO.OooOoO
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    com.orion.notein.p607ui.label.OooO0o oooO0o3 = this.f100785OooOo0o;
                    oooO0o3.f71993OooO0O0.OooO0oO(c28456OoooOoO);
                }
            });
            imageView4.setOnClickListener(new View.OnClickListener() { // from class: o0Oo0ooO.OooOoOO
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    com.orion.notein.p607ui.label.OooO0o oooO0o3 = this.f100789OooOo0o;
                    oooO0o3.f71993OooO0O0.OooO0oo(c28456OoooOoO);
                }
            });
            imageView.setOnClickListener(new View.OnClickListener() { // from class: o0Oo0ooO.OooOoo0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    OooO0o.OooO0O0 oooO0O03 = oooO0O0;
                    Integer num = oooO0O03.f72004OooOO0O;
                    C28456OoooOoO c28456OoooOoO2 = c28456OoooOoO;
                    int iIntValue = num != null ? num.intValue() : c28456OoooOoO2.f100835OooO0OO;
                    String name = oooO0O03.f71995OooO00o.getText().toString();
                    long j = c28456OoooOoO2.f100833OooO00o;
                    kotlin.jvm.internal.OooOOO0.OooO0oO(name, "name");
                    oooO0o2.f71993OooO0O0.OooO0o0(new C28456OoooOoO(j, name, iIntValue, c28456OoooOoO2.f100836OooO0Oo, c28456OoooOoO2.f100838OooO0o0, c28456OoooOoO2.f100837OooO0o, c28456OoooOoO2.f100839OooO0oO));
                }
            });
            editText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: o0Oo0ooO.OooOOoo
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
                    if (i7 != 6) {
                        return false;
                    }
                    oooO0O0.f71998OooO0Oo.performClick();
                    return true;
                }
            });
            c28421OooOOOo.f100763OooO0O0 = new C23138OooO0oo(oooO0O0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final RecyclerView.AbstractC22078OooOooO onCreateViewHolder(ViewGroup parent, int i) {
        OooOOO0.OooO0oO(parent, "parent");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(parent.getContext());
        if (i == 0) {
            View viewInflate = layoutInflaterFrom.inflate(R.layout.item_label_manage_create, parent, false);
            OooOOO0.OooO0o(viewInflate, "inflate(...)");
            OooO00o oooO00o = new OooO00o(viewInflate);
            viewInflate.setOnClickListener(new ViewOnClickListenerC28142OooO0oo(this, 1));
            return oooO00o;
        }
        if (i == 1) {
            View viewInflate2 = layoutInflaterFrom.inflate(R.layout.item_label_manage_display, parent, false);
            OooOOO0.OooO0o(viewInflate2, "inflate(...)");
            return new C23134OooO0o0(viewInflate2);
        }
        if (i == 2) {
            View viewInflate3 = layoutInflaterFrom.inflate(R.layout.item_label_manage_edit, parent, false);
            OooOOO0.OooO0o(viewInflate3, "inflate(...)");
            return new OooO0O0(viewInflate3);
        }
        throw new IllegalStateException(("Unknown viewType: " + i).toString());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onViewRecycled(RecyclerView.AbstractC22078OooOooO holder) {
        OooOOO0.OooO0oO(holder, "holder");
        super.onViewRecycled(holder);
        if (holder instanceof OooO0O0) {
            OooO0O0 oooO0O0 = (OooO0O0) holder;
            OooO oooO = oooO0O0.f72002OooO0oo;
            if (oooO != null) {
                oooO0O0.f71995OooO00o.removeTextChangedListener(oooO);
            }
            oooO0O0.f72002OooO0oo = null;
            oooO0O0.f72001OooO0oO.f100763OooO0O0 = null;
        }
    }
}
