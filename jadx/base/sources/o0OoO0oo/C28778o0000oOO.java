package o0OoO0oo;

import android.os.Bundle;
import com.orion.notein.global.R;

/* JADX INFO: renamed from: o0OoO0oo.o0000oOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28778o0000oOO implements o000o0O0.OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f101904OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f101905OooO0O0;

    public C28778o0000oOO(int i, String str) {
        this.f101904OooO00o = i;
        this.f101905OooO0O0 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28778o0000oOO)) {
            return false;
        }
        C28778o0000oOO c28778o0000oOO = (C28778o0000oOO) obj;
        return this.f101904OooO00o == c28778o0000oOO.f101904OooO00o && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f101905OooO0O0, c28778o0000oOO.f101905OooO0O0);
    }

    @Override // o000o0O0.OooOo
    public final int getActionId() {
        return R.id.action_noteEditorContainerFragment_to_newOutlineDialogFragment;
    }

    @Override // o000o0O0.OooOo
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        bundle.putInt("pageIndex", this.f101904OooO00o);
        bundle.putString("pageId", this.f101905OooO0O0);
        return bundle;
    }

    public final int hashCode() {
        return this.f101905OooO0O0.hashCode() + (Integer.hashCode(this.f101904OooO00o) * 31);
    }

    public final String toString() {
        return "ActionNoteEditorContainerFragmentToNewOutlineDialogFragment(pageIndex=" + this.f101904OooO00o + ", pageId=" + this.f101905OooO0O0 + ")";
    }
}
