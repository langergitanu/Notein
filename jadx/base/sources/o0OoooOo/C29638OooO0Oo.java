package o0OoooOo;

import Oooo0.C20860Ooooooo;
import android.os.Bundle;
import android.os.Parcelable;
import com.orion.notein.p607ui.noteeditor.propertypanel.comment.CommentVO;
import java.io.Serializable;

/* JADX INFO: renamed from: o0OoooOo.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29638OooO0Oo implements o000o0O0.OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final CommentVO f105096OooO00o;

    public C29638OooO0Oo(CommentVO commentVO) {
        this.f105096OooO00o = commentVO;
    }

    public static final C29638OooO0Oo fromBundle(Bundle bundle) {
        if (!C20860Ooooooo.OooO0Oo(bundle, "bundle", C29638OooO0Oo.class, "commentVO")) {
            throw new IllegalArgumentException("Required argument \"commentVO\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(CommentVO.class) && !Serializable.class.isAssignableFrom(CommentVO.class)) {
            throw new UnsupportedOperationException(CommentVO.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        CommentVO commentVO = (CommentVO) bundle.get("commentVO");
        if (commentVO != null) {
            return new C29638OooO0Oo(commentVO);
        }
        throw new IllegalArgumentException("Argument \"commentVO\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C29638OooO0Oo) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f105096OooO00o, ((C29638OooO0Oo) obj).f105096OooO00o);
    }

    public final int hashCode() {
        return this.f105096OooO00o.hashCode();
    }

    public final String toString() {
        return "CommentEditDialogFragmentArgs(commentVO=" + this.f105096OooO00o + ")";
    }
}
