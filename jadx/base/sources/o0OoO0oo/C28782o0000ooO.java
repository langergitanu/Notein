package o0OoO0oo;

import android.os.Bundle;
import android.os.Parcelable;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.propertypanel.outline.OutlineVO;
import java.io.Serializable;

/* JADX INFO: renamed from: o0OoO0oo.o0000ooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28782o0000ooO implements o000o0O0.OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OutlineVO f101911OooO00o;

    public C28782o0000ooO(OutlineVO outlineVO) {
        this.f101911OooO00o = outlineVO;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C28782o0000ooO) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f101911OooO00o, ((C28782o0000ooO) obj).f101911OooO00o);
    }

    @Override // o000o0O0.OooOo
    public final int getActionId() {
        return R.id.action_noteEditorContainerFragment_to_outlineEditDialogFragment;
    }

    @Override // o000o0O0.OooOo
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        boolean zIsAssignableFrom = Parcelable.class.isAssignableFrom(OutlineVO.class);
        Parcelable parcelable = this.f101911OooO00o;
        if (zIsAssignableFrom) {
            kotlin.jvm.internal.OooOOO0.OooO0o0(parcelable, "null cannot be cast to non-null type android.os.Parcelable");
            bundle.putParcelable("outlineVO", parcelable);
            return bundle;
        }
        if (!Serializable.class.isAssignableFrom(OutlineVO.class)) {
            throw new UnsupportedOperationException(OutlineVO.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        kotlin.jvm.internal.OooOOO0.OooO0o0(parcelable, "null cannot be cast to non-null type java.io.Serializable");
        bundle.putSerializable("outlineVO", (Serializable) parcelable);
        return bundle;
    }

    public final int hashCode() {
        return this.f101911OooO00o.hashCode();
    }

    public final String toString() {
        return "ActionNoteEditorContainerFragmentToOutlineEditDialogFragment(outlineVO=" + this.f101911OooO00o + ")";
    }
}
