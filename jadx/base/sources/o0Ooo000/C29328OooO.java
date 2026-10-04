package o0Ooo000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.AbstractC22050OooOo0o;
import androidx.recyclerview.widget.OooOOO;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.hyperlinkeditor.dialog.NoteTreeInfo;
import java.util.List;

/* JADX INFO: renamed from: o0Ooo000.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29328OooO extends AbstractC22050OooOo0o<NoteTreeInfo, C29344OooOOo> {

    /* JADX INFO: renamed from: o0Ooo000.OooO$OooO00o */
    public static final class OooO00o extends OooOOO.AbstractC22036OooO0o0<NoteTreeInfo> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO00o f104039OooO00o = new OooO00o();

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO00o(NoteTreeInfo noteTreeInfo, NoteTreeInfo noteTreeInfo2) {
            return noteTreeInfo.equals(noteTreeInfo2);
        }

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO0O0(NoteTreeInfo noteTreeInfo, NoteTreeInfo noteTreeInfo2) {
            return kotlin.jvm.internal.OooOOO0.OooO0O0(noteTreeInfo.getNoteId(), noteTreeInfo2.getNoteId());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final int getItemViewType(int i) {
        if (i != 0) {
            return 2;
        }
        List<T> list = this.f66021OooO00o.f65811OooO0o;
        kotlin.jvm.internal.OooOOO0.OooO0o(list, "getCurrentList(...)");
        NoteTreeInfo noteTreeInfo = (NoteTreeInfo) oOo000Oo.OooOo.OoooO00(i, list);
        return kotlin.jvm.internal.OooOOO0.OooO0O0(noteTreeInfo != null ? noteTreeInfo.getNoteId() : null, "note_id_root_item") ? 1 : 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, int i) {
        C29344OooOOo holder = (C29344OooOOo) abstractC22078OooOooO;
        kotlin.jvm.internal.OooOOO0.OooO0oO(holder, "holder");
        Object obj = this.f66021OooO00o.f65811OooO0o.get(i);
        kotlin.jvm.internal.OooOOO0.OooO0o(obj, "get(...)");
        holder.OooO00o((NoteTreeInfo) obj);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final RecyclerView.AbstractC22078OooOooO onCreateViewHolder(ViewGroup parent, int i) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(parent, "parent");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(parent.getContext());
        kotlin.jvm.internal.OooOOO0.OooO0o(layoutInflaterFrom, "from(...)");
        if (i == 1) {
            View viewInflate = layoutInflaterFrom.inflate(R.layout.item_note_tree_selection_root, parent, false);
            kotlin.jvm.internal.OooOOO0.OooO0o(viewInflate, "inflate(...)");
            return new C29361Oooo00O(viewInflate);
        }
        View viewInflate2 = layoutInflaterFrom.inflate(R.layout.item_note_tree_selection_item, parent, false);
        kotlin.jvm.internal.OooOOO0.OooO0o(viewInflate2, "inflate(...)");
        return new C29336OooO0oo(viewInflate2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, int i, List payloads) {
        C29344OooOOo holder = (C29344OooOOo) abstractC22078OooOooO;
        kotlin.jvm.internal.OooOOO0.OooO0oO(holder, "holder");
        kotlin.jvm.internal.OooOOO0.OooO0oO(payloads, "payloads");
        super.onBindViewHolder(holder, i, payloads);
    }
}
