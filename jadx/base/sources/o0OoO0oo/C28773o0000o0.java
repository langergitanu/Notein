package o0OoO0oo;

import android.os.Bundle;
import android.os.Parcelable;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.propertypanel.comment.CommentVO;
import java.io.Serializable;

/* JADX INFO: renamed from: o0OoO0oo.o0000o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28773o0000o0 implements o000o0O0.OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final CommentVO f101897OooO00o;

    public C28773o0000o0(CommentVO commentVO) {
        this.f101897OooO00o = commentVO;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C28773o0000o0) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f101897OooO00o, ((C28773o0000o0) obj).f101897OooO00o);
    }

    @Override // o000o0O0.OooOo
    public final int getActionId() {
        return R.id.action_noteEditorContainerFragment_to_commentEditDialogFragment;
    }

    @Override // o000o0O0.OooOo
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        boolean zIsAssignableFrom = Parcelable.class.isAssignableFrom(CommentVO.class);
        Parcelable parcelable = this.f101897OooO00o;
        if (zIsAssignableFrom) {
            kotlin.jvm.internal.OooOOO0.OooO0o0(parcelable, "null cannot be cast to non-null type android.os.Parcelable");
            bundle.putParcelable("commentVO", parcelable);
            return bundle;
        }
        if (!Serializable.class.isAssignableFrom(CommentVO.class)) {
            throw new UnsupportedOperationException(CommentVO.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        kotlin.jvm.internal.OooOOO0.OooO0o0(parcelable, "null cannot be cast to non-null type java.io.Serializable");
        bundle.putSerializable("commentVO", (Serializable) parcelable);
        return bundle;
    }

    public final int hashCode() {
        return this.f101897OooO00o.hashCode();
    }

    public final String toString() {
        return "ActionNoteEditorContainerFragmentToCommentEditDialogFragment(commentVO=" + this.f101897OooO00o + ")";
    }
}
