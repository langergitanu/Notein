package o0Ooooo0;

import Oooo0.C20860Ooooooo;
import android.os.Bundle;
import android.os.Parcelable;
import com.orion.notein.p607ui.noteeditor.propertypanel.outline.OutlineVO;
import java.io.Serializable;

/* JADX INFO: renamed from: o0Ooooo0.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29716OooOOoo implements o000o0O0.OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OutlineVO f105362OooO00o;

    public C29716OooOOoo(OutlineVO outlineVO) {
        this.f105362OooO00o = outlineVO;
    }

    public static final C29716OooOOoo fromBundle(Bundle bundle) {
        if (!C20860Ooooooo.OooO0Oo(bundle, "bundle", C29716OooOOoo.class, "outlineVO")) {
            throw new IllegalArgumentException("Required argument \"outlineVO\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(OutlineVO.class) && !Serializable.class.isAssignableFrom(OutlineVO.class)) {
            throw new UnsupportedOperationException(OutlineVO.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        OutlineVO outlineVO = (OutlineVO) bundle.get("outlineVO");
        if (outlineVO != null) {
            return new C29716OooOOoo(outlineVO);
        }
        throw new IllegalArgumentException("Argument \"outlineVO\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C29716OooOOoo) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f105362OooO00o, ((C29716OooOOoo) obj).f105362OooO00o);
    }

    public final int hashCode() {
        return this.f105362OooO00o.hashCode();
    }

    public final String toString() {
        return "OutlineEditDialogFragmentArgs(outlineVO=" + this.f105362OooO00o + ")";
    }
}
