package o0o00oo;

import android.content.Context;
import com.orion.notein.p607ui.notelist.documents.NoteListContainerFragment;
import o0o0O00.C30191OooO0oO;
import oO0OOooo.C33163OooO0oO;
import oO0o0OO.C33609OooO0oo;

/* JADX INFO: renamed from: o0o00oo.OooOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30113OooOo extends C30191OooO0oO {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ NoteListContainerFragment f107215OooO0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30113OooOo(NoteListContainerFragment noteListContainerFragment, com.orion.notein.p607ui.notelist.OooO0OO oooO0OO) {
        super(noteListContainerFragment, oooO0OO);
        this.f107215OooO0o = noteListContainerFragment;
    }

    @Override // o0o0O00.C30191OooO0oO, o0o0O00.C30207OooOo.OooO00o
    public final void OooO00o() {
        NoteListContainerFragment noteListContainerFragment = this.f107215OooO0o;
        Context context = noteListContainerFragment.getContext();
        if (context == null) {
            return;
        }
        C33609OooO0oo.OooO0OO(OooO0O0.OooO0o.OooO00o(noteListContainerFragment, "getViewLifecycleOwner(...)"), null, null, new C30120OooOoOO(noteListContainerFragment, (C33163OooO0oO) context, null), 3);
    }
}
