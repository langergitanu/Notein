package o0o00oo;

import OooOoo.C20593OooO0Oo;
import android.os.Bundle;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.notelist.folder.ItemDataOfMovingToFolder;
import java.util.Arrays;

/* JADX INFO: renamed from: o0o00oo.Oooo0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30131Oooo0o0 implements o000o0O0.OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ItemDataOfMovingToFolder[] f107271OooO00o;

    public C30131Oooo0o0(ItemDataOfMovingToFolder[] itemDataOfMovingToFolderArr) {
        this.f107271OooO00o = itemDataOfMovingToFolderArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C30131Oooo0o0) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f107271OooO00o, ((C30131Oooo0o0) obj).f107271OooO00o);
    }

    @Override // o000o0O0.OooOo
    public final int getActionId() {
        return R.id.action_noteListFragment_to_moveToFolderDialogFragment;
    }

    @Override // o000o0O0.OooOo
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArray("itemDataList", this.f107271OooO00o);
        return bundle;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f107271OooO00o);
    }

    public final String toString() {
        return C20593OooO0Oo.OooO0O0("ActionNoteListFragmentToMoveToFolderDialogFragment(itemDataList=", Arrays.toString(this.f107271OooO00o), ")");
    }
}
