package o0OoO0oo;

import Oooo0oO.C21023OooO0Oo;
import android.os.Bundle;
import com.orion.notein.global.R;

/* JADX INFO: renamed from: o0OoO0oo.o000Ooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28802o000Ooo implements o000o0O0.OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f101985OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f101986OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f101987OooO0OO;

    public C28802o000Ooo() {
        this(null, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28802o000Ooo)) {
            return false;
        }
        C28802o000Ooo c28802o000Ooo = (C28802o000Ooo) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f101985OooO00o, c28802o000Ooo.f101985OooO00o) && this.f101986OooO0O0 == c28802o000Ooo.f101986OooO0O0;
    }

    @Override // o000o0O0.OooOo
    public final int getActionId() {
        return this.f101987OooO0OO;
    }

    @Override // o000o0O0.OooOo
    public final Bundle getArguments() {
        Bundle bundle = new Bundle();
        bundle.putString("note_id", this.f101985OooO00o);
        bundle.putInt("page_index", this.f101986OooO0O0);
        return bundle;
    }

    public final int hashCode() {
        String str = this.f101985OooO00o;
        return Integer.hashCode(this.f101986OooO0O0) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionNoteEditorContainerFragmentToTextRecognizeFragment(noteId=");
        sb.append(this.f101985OooO00o);
        sb.append(", pageIndex=");
        return C21023OooO0Oo.OooO0OO(")", this.f101986OooO0O0, sb);
    }

    public C28802o000Ooo(String str, int i) {
        this.f101985OooO00o = str;
        this.f101986OooO0O0 = i;
        this.f101987OooO0OO = R.id.action_noteEditorContainerFragment_to_textRecognizeFragment;
    }
}
