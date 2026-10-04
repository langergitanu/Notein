package o0o0O0OO;

import Oooo0.C20860Ooooooo;
import android.os.Bundle;
import android.os.Parcelable;
import com.orion.notein.p607ui.p609vo.NoteVO;
import java.io.Serializable;

/* JADX INFO: renamed from: o0o0O0OO.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30278OooO0o implements o000o0O0.OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f107917OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final NoteVO f107918OooO0O0;

    public C30278OooO0o(String str, NoteVO noteVO) {
        this.f107917OooO00o = str;
        this.f107918OooO0O0 = noteVO;
    }

    public static final C30278OooO0o fromBundle(Bundle bundle) {
        NoteVO noteVO;
        if (!C20860Ooooooo.OooO0Oo(bundle, "bundle", C30278OooO0o.class, "topFolder")) {
            throw new IllegalArgumentException("Required argument \"topFolder\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("topFolder");
        if (string == null) {
            throw new IllegalArgumentException("Argument \"topFolder\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("currFolder")) {
            noteVO = null;
        } else {
            if (!Parcelable.class.isAssignableFrom(NoteVO.class) && !Serializable.class.isAssignableFrom(NoteVO.class)) {
                throw new UnsupportedOperationException(NoteVO.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            noteVO = (NoteVO) bundle.get("currFolder");
        }
        return new C30278OooO0o(string, noteVO);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30278OooO0o)) {
            return false;
        }
        C30278OooO0o c30278OooO0o = (C30278OooO0o) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f107917OooO00o, c30278OooO0o.f107917OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f107918OooO0O0, c30278OooO0o.f107918OooO0O0);
    }

    public final int hashCode() {
        int iHashCode = this.f107917OooO00o.hashCode() * 31;
        NoteVO noteVO = this.f107918OooO0O0;
        return iHashCode + (noteVO == null ? 0 : noteVO.hashCode());
    }

    public final String toString() {
        return "SearchListContainerFragmentArgs(topFolder=" + this.f107917OooO00o + ", currFolder=" + this.f107918OooO0O0 + ")";
    }
}
