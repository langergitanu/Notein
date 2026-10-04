package o0o0O0oO;

import android.os.Bundle;
import android.os.Parcelable;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.p609vo.NoteVO;
import java.io.Serializable;

/* JADX INFO: renamed from: o0o0O0oO.OooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30320OooOO0 implements o000o0O0.OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final NoteVO f108103OooO00o;

    public C30320OooOO0(NoteVO noteVO) {
        this.f108103OooO00o = noteVO;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C30320OooOO0) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f108103OooO00o, ((C30320OooOO0) obj).f108103OooO00o);
    }

    @Override // o000o0O0.OooOo
    public final int getActionId() {
        return R.id.f57983x569a61c;
    }

    @Override // o000o0O0.OooOo
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        boolean zIsAssignableFrom = Parcelable.class.isAssignableFrom(NoteVO.class);
        Parcelable parcelable = this.f108103OooO00o;
        if (zIsAssignableFrom) {
            bundle.putParcelable("noteVO", parcelable);
            return bundle;
        }
        if (!Serializable.class.isAssignableFrom(NoteVO.class)) {
            throw new UnsupportedOperationException(NoteVO.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        bundle.putSerializable("noteVO", (Serializable) parcelable);
        return bundle;
    }

    public final int hashCode() {
        NoteVO noteVO = this.f108103OooO00o;
        if (noteVO == null) {
            return 0;
        }
        return noteVO.hashCode();
    }

    public final String toString() {
        return "ActionTrashBinContainerFragmentToTrashBinDeleteAlertDialogFragment(noteVO=" + this.f108103OooO00o + ")";
    }
}
