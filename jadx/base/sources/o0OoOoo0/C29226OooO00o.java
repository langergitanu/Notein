package o0OoOoo0;

import OooOoO.C20504OooO0O0;
import Oooo0.o000000O;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.OooOOO;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.p609vo.LatestOpenedNoteVO;
import java.util.ArrayList;
import java.util.List;
import o0OoO000.o0OO00O;
import o0OoO000.oo0o0Oo;
import oO00ooOO.C32465OooO0O0;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: o0OoOoo0.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29226OooO00o extends RecyclerView.AbstractC22062OooO0oO<OooO0O0> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final int f103625OooO0Oo = o000000O.OooO0o(154);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public ViewOnClickListenerC29233OooO0oo f103627OooO0O0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ArrayList f103626OooO00o = new ArrayList();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f103628OooO0OO = 1000;

    /* JADX INFO: renamed from: o0OoOoo0.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C19966OooO00o extends OooOOO.OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final List<LatestOpenedNoteVO> f103629OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final List<LatestOpenedNoteVO> f103630OooO0O0;

        public C19966OooO00o(List<LatestOpenedNoteVO> list, List<LatestOpenedNoteVO> newList) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(newList, "newList");
            this.f103629OooO00o = list;
            this.f103630OooO0O0 = newList;
        }

        @Override // androidx.recyclerview.widget.OooOOO.OooO0O0
        public final boolean OooO00o(int i, int i2) {
            List<LatestOpenedNoteVO> list = this.f103629OooO00o;
            LatestOpenedNoteVO latestOpenedNoteVO = list.get(i);
            List<LatestOpenedNoteVO> list2 = this.f103630OooO0O0;
            return kotlin.jvm.internal.OooOOO0.OooO0O0(latestOpenedNoteVO, list2.get(i2)) && list.size() == list2.size();
        }

        @Override // androidx.recyclerview.widget.OooOOO.OooO0O0
        public final boolean OooO0O0(int i, int i2) {
            return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f103629OooO00o.get(i), this.f103630OooO0O0.get(i2));
        }

        @Override // androidx.recyclerview.widget.OooOOO.OooO0O0
        public final Object OooO0OO(int i, int i2) {
            C32465OooO0O0 c32465OooO0O0OooO0Oo = com.facebook.soloader.OooOo.OooO0Oo();
            List<LatestOpenedNoteVO> list = this.f103629OooO00o;
            LatestOpenedNoteVO latestOpenedNoteVO = list.get(i);
            List<LatestOpenedNoteVO> list2 = this.f103630OooO0O0;
            LatestOpenedNoteVO latestOpenedNoteVO2 = list2.get(i2);
            if (latestOpenedNoteVO.isSelected() != latestOpenedNoteVO2.isSelected()) {
                c32465OooO0O0OooO0Oo.add("selected");
            }
            if (!kotlin.jvm.internal.OooOOO0.OooO0O0(latestOpenedNoteVO.getTitle(), latestOpenedNoteVO2.getTitle())) {
                c32465OooO0O0OooO0Oo.add(NoteMeta.PROPERTY_TITLE);
            }
            if (latestOpenedNoteVO.isDividerVisible() != latestOpenedNoteVO2.isDividerVisible()) {
                c32465OooO0O0OooO0Oo.add("divider");
            }
            if (list.size() != list2.size()) {
                c32465OooO0O0OooO0Oo.add("width");
            }
            return com.facebook.soloader.OooOo.OooO0O0(c32465OooO0O0OooO0Oo);
        }

        @Override // androidx.recyclerview.widget.OooOOO.OooO0O0
        public final int OooO0Oo() {
            return this.f103630OooO0O0.size();
        }

        @Override // androidx.recyclerview.widget.OooOOO.OooO0O0
        public final int OooO0o0() {
            return this.f103629OooO00o.size();
        }
    }

    /* JADX INFO: renamed from: o0OoOoo0.OooO00o$OooO0O0 */
    public final class OooO0O0 extends RecyclerView.AbstractC22078OooOooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final TextView f103632OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final ConstraintLayout f103633OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final ImageView f103634OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final View f103635OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final View f103636OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final View f103637OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final View f103638OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final View f103639OooO0oo;

        public OooO0O0(View view) {
            super(view);
            View viewFindViewById = view.findViewById(R.id.tv_title);
            kotlin.jvm.internal.OooOOO0.OooO0o(viewFindViewById, "findViewById(...)");
            TextView textView = (TextView) viewFindViewById;
            this.f103632OooO00o = textView;
            View viewFindViewById2 = view.findViewById(R.id.cl_title);
            kotlin.jvm.internal.OooOOO0.OooO0o(viewFindViewById2, "findViewById(...)");
            this.f103633OooO0O0 = (ConstraintLayout) viewFindViewById2;
            View viewFindViewById3 = view.findViewById(R.id.iv_delete);
            kotlin.jvm.internal.OooOOO0.OooO0o(viewFindViewById3, "findViewById(...)");
            ImageView imageView = (ImageView) viewFindViewById3;
            this.f103634OooO0OO = imageView;
            View viewFindViewById4 = view.findViewById(R.id.cl_start_placeholder);
            kotlin.jvm.internal.OooOOO0.OooO0o(viewFindViewById4, "findViewById(...)");
            this.f103635OooO0Oo = viewFindViewById4;
            View viewFindViewById5 = view.findViewById(R.id.v_start_placeholder);
            kotlin.jvm.internal.OooOOO0.OooO0o(viewFindViewById5, "findViewById(...)");
            this.f103637OooO0o0 = viewFindViewById5;
            View viewFindViewById6 = view.findViewById(R.id.cl_end_placeholder);
            kotlin.jvm.internal.OooOOO0.OooO0o(viewFindViewById6, "findViewById(...)");
            this.f103636OooO0o = viewFindViewById6;
            View viewFindViewById7 = view.findViewById(R.id.v_end_placeholder);
            kotlin.jvm.internal.OooOOO0.OooO0o(viewFindViewById7, "findViewById(...)");
            this.f103638OooO0oO = viewFindViewById7;
            View viewFindViewById8 = view.findViewById(R.id.divider);
            kotlin.jvm.internal.OooOOO0.OooO0o(viewFindViewById8, "findViewById(...)");
            this.f103639OooO0oo = viewFindViewById8;
            int i = 1;
            imageView.setOnClickListener(new o0OO00O(C29226OooO00o.this, i));
            textView.setOnClickListener(new oo0o0Oo(C29226OooO00o.this, i));
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final void OooO00o(LatestOpenedNoteVO item, List<String> list) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(item, "item");
            this.f103634OooO0OO.setTag(item);
            TextView textView = this.f103632OooO00o;
            textView.setTag(item);
            C34406OooO00o.f123390OooO00o.OooO00o("list.bind: " + list, new Object[0]);
            boolean zIsEmpty = list.isEmpty();
            View view = this.f103639OooO0oo;
            if (zIsEmpty) {
                OooO0O0(item);
                textView.setText(item.getTitle());
                OooO0OO();
                view.setVisibility(item.isDividerVisible() ? 0 : 8);
                return;
            }
            for (String str : list) {
                switch (str.hashCode()) {
                    case 110371416:
                        if (str.equals(NoteMeta.PROPERTY_TITLE)) {
                            textView.setText(item.getTitle());
                        }
                        break;
                    case 113126854:
                        if (str.equals("width")) {
                            OooO0OO();
                        }
                        break;
                    case 1191572123:
                        if (str.equals("selected")) {
                            OooO0O0(item);
                        }
                        break;
                    case 1674318617:
                        if (str.equals("divider")) {
                            view.setVisibility(item.isDividerVisible() ? 0 : 8);
                        }
                        break;
                }
            }
        }

        public final void OooO0O0(LatestOpenedNoteVO latestOpenedNoteVO) {
            this.f103633OooO0O0.setSelected(latestOpenedNoteVO.isSelected());
            this.f103635OooO0Oo.setSelected(latestOpenedNoteVO.isSelected());
            this.f103637OooO0o0.setSelected(latestOpenedNoteVO.isSelected());
            this.f103636OooO0o.setSelected(latestOpenedNoteVO.isSelected());
            this.f103638OooO0oO.setSelected(latestOpenedNoteVO.isSelected());
        }

        public final void OooO0OO() {
            int i;
            ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
            C29226OooO00o c29226OooO00o = C29226OooO00o.this;
            int size = c29226OooO00o.f103626OooO00o.size();
            if (size < 2) {
                i = C29226OooO00o.f103625OooO0Oo;
            } else {
                i = c29226OooO00o.f103628OooO0OO / size;
                int i2 = C29226OooO00o.f103625OooO0Oo;
                if (i < i2) {
                    i = i2;
                }
            }
            layoutParams.width = i;
            int i3 = (int) (((double) i) * 0.1d);
            View view = this.f103635OooO0Oo;
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            layoutParams2.width = i3;
            view.setLayoutParams(layoutParams2);
            View view2 = this.f103636OooO0o;
            ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
            layoutParams3.width = i3;
            view2.setLayoutParams(layoutParams3);
            this.itemView.setLayoutParams(layoutParams);
        }
    }

    public final void OooO0OO(List<LatestOpenedNoteVO> list) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(list, "list");
        ArrayList arrayList = this.f103626OooO00o;
        OooOOO.C22035OooO0Oo c22035OooO0OoOooO00o = androidx.recyclerview.widget.OooOOO.OooO00o(new C19966OooO00o(oOo000Oo.OooOo.o0ooOO0(arrayList), list));
        arrayList.clear();
        arrayList.addAll(list);
        c22035OooO0OoOooO00o.OooO00o(new androidx.recyclerview.widget.OooO0O0(this));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final int getItemCount() {
        return this.f103626OooO00o.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, int i) {
        OooO0O0 holder = (OooO0O0) abstractC22078OooOooO;
        kotlin.jvm.internal.OooOOO0.OooO0oO(holder, "holder");
        holder.OooO00o((LatestOpenedNoteVO) this.f103626OooO00o.get(i), C34434OooOoO.f123453OooOo0o);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final RecyclerView.AbstractC22078OooOooO onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewOooO0OO = C20504OooO0O0.OooO0OO(viewGroup, "parent", R.layout.item_latest_opened_note_tab, viewGroup, false);
        kotlin.jvm.internal.OooOOO0.OooO0Oo(viewOooO0OO);
        return new OooO0O0(viewOooO0OO);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, int i, List payloads) {
        OooO0O0 holder = (OooO0O0) abstractC22078OooOooO;
        kotlin.jvm.internal.OooOOO0.OooO0oO(holder, "holder");
        kotlin.jvm.internal.OooOOO0.OooO0oO(payloads, "payloads");
        if (payloads.isEmpty()) {
            super.onBindViewHolder(holder, i, payloads);
            return;
        }
        Object obj = payloads.get(0);
        kotlin.jvm.internal.OooOOO0.OooO0o0(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
        holder.OooO00o((LatestOpenedNoteVO) this.f103626OooO00o.get(i), (List) obj);
    }
}
