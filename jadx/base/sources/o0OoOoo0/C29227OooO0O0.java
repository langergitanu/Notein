package o0OoOoo0;

import OooOoO.C20504OooO0O0;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.AbstractC22050OooOo0o;
import androidx.recyclerview.widget.OooOOO;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.p609vo.LatestOpenedNoteVO;
import o0Oo0oOo.o000000O;
import o0Oo0oOo.o00Ooo;
import o0OoO000.o0O0O00;

/* JADX INFO: renamed from: o0OoOoo0.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29227OooO0O0 extends AbstractC22050OooOo0o<LatestOpenedNoteVO, C19967OooO0O0> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o000000O f103640OooO0O0;

    /* JADX INFO: renamed from: o0OoOoo0.OooO0O0$OooO00o */
    public static final class OooO00o extends OooOOO.AbstractC22036OooO0o0<LatestOpenedNoteVO> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO00o f103641OooO00o = new OooO00o();

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO00o(LatestOpenedNoteVO latestOpenedNoteVO, LatestOpenedNoteVO latestOpenedNoteVO2) {
            return latestOpenedNoteVO.equals(latestOpenedNoteVO2);
        }

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO0O0(LatestOpenedNoteVO latestOpenedNoteVO, LatestOpenedNoteVO latestOpenedNoteVO2) {
            return kotlin.jvm.internal.OooOOO0.OooO0O0(latestOpenedNoteVO.getNoteId(), latestOpenedNoteVO2.getNoteId());
        }
    }

    /* JADX INFO: renamed from: o0OoOoo0.OooO0O0$OooO0O0, reason: collision with other inner class name */
    public static final class C19967OooO0O0 extends RecyclerView.AbstractC22078OooOooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o000000O f103642OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final TextView f103643OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final ImageView f103644OooO0OO;

        public C19967OooO0O0(View view, o000000O o000000o2) {
            super(view);
            this.f103642OooO00o = o000000o2;
            View viewFindViewById = view.findViewById(R.id.tv_title);
            kotlin.jvm.internal.OooOOO0.OooO0o(viewFindViewById, "findViewById(...)");
            this.f103643OooO0O0 = (TextView) viewFindViewById;
            View viewFindViewById2 = view.findViewById(R.id.iv_more);
            kotlin.jvm.internal.OooOOO0.OooO0o(viewFindViewById2, "findViewById(...)");
            this.f103644OooO0OO = (ImageView) viewFindViewById2;
        }
    }

    public C29227OooO0O0(o000000O o000000o2) {
        super(OooO00o.f103641OooO00o);
        this.f103640OooO0O0 = o000000o2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, int i) {
        C19967OooO0O0 holder = (C19967OooO0O0) abstractC22078OooOooO;
        kotlin.jvm.internal.OooOOO0.OooO0oO(holder, "holder");
        LatestOpenedNoteVO latestOpenedNoteVOOooO0OO = OooO0OO(i);
        kotlin.jvm.internal.OooOOO0.OooO0o(latestOpenedNoteVOOooO0OO, "getItem(...)");
        LatestOpenedNoteVO latestOpenedNoteVO = latestOpenedNoteVOOooO0OO;
        TextView textView = holder.f103643OooO0O0;
        textView.setTag(latestOpenedNoteVO);
        ImageView imageView = holder.f103644OooO0OO;
        imageView.setTag(latestOpenedNoteVO);
        holder.itemView.setTag(latestOpenedNoteVO);
        holder.itemView.setSelected(latestOpenedNoteVO.isSelected());
        holder.itemView.setOnClickListener(new o0O0O00(holder, 1));
        imageView.setOnClickListener(new o00Ooo(holder, 2));
        textView.setText(latestOpenedNoteVO.getTitle());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final RecyclerView.AbstractC22078OooOooO onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewOooO0OO = C20504OooO0O0.OooO0OO(viewGroup, "parent", R.layout.item_latest_opened_note, viewGroup, false);
        kotlin.jvm.internal.OooOOO0.OooO0Oo(viewOooO0OO);
        return new C19967OooO0O0(viewOooO0OO, this.f103640OooO0O0);
    }
}
