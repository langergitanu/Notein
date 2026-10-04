package o0o0O0oO;

import Oooo0.C20860Ooooooo;
import android.os.Bundle;
import android.os.Parcelable;
import com.orion.notein.p607ui.p609vo.NoteVO;
import java.io.Serializable;

/* JADX INFO: renamed from: o0o0O0oO.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30322OooOO0o implements o000o0O0.OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final NoteVO f108104OooO00o;

    public C30322OooOO0o(NoteVO noteVO) {
        this.f108104OooO00o = noteVO;
    }

    public static final C30322OooOO0o fromBundle(Bundle bundle) {
        if (!C20860Ooooooo.OooO0Oo(bundle, "bundle", C30322OooOO0o.class, "noteVO")) {
            throw new IllegalArgumentException("Required argument \"noteVO\" is missing and does not have an android:defaultValue");
        }
        if (Parcelable.class.isAssignableFrom(NoteVO.class) || Serializable.class.isAssignableFrom(NoteVO.class)) {
            return new C30322OooOO0o((NoteVO) bundle.get("noteVO"));
        }
        throw new UnsupportedOperationException(NoteVO.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C30322OooOO0o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f108104OooO00o, ((C30322OooOO0o) obj).f108104OooO00o);
    }

    public final int hashCode() {
        NoteVO noteVO = this.f108104OooO00o;
        if (noteVO == null) {
            return 0;
        }
        return noteVO.hashCode();
    }

    public final String toString() {
        return "TrashBinDeleteAlertDialogFragmentArgs(noteVO=" + this.f108104OooO00o + ")";
    }
}
