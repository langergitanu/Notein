package oO0Oo;

import Oooo0.C20860Ooooooo;
import Oooo0oO.C21023OooO0Oo;
import android.os.Bundle;

/* JADX INFO: renamed from: oO0Oo.OooOooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33186OooOooO implements o000o0O0.OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f120094OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f120095OooO0O0;

    public C33186OooOooO() {
        this(null, 0);
    }

    public static final C33186OooOooO fromBundle(Bundle bundle) {
        return new C33186OooOooO(C20860Ooooooo.OooO0Oo(bundle, "bundle", C33186OooOooO.class, "note_id") ? bundle.getString("note_id") : null, bundle.containsKey("page_index") ? bundle.getInt("page_index") : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33186OooOooO)) {
            return false;
        }
        C33186OooOooO c33186OooOooO = (C33186OooOooO) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f120094OooO00o, c33186OooOooO.f120094OooO00o) && this.f120095OooO0O0 == c33186OooOooO.f120095OooO0O0;
    }

    public final int hashCode() {
        String str = this.f120094OooO00o;
        return Integer.hashCode(this.f120095OooO0O0) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextRecognizeFragmentArgs(noteId=");
        sb.append(this.f120094OooO00o);
        sb.append(", pageIndex=");
        return C21023OooO0Oo.OooO0OO(")", this.f120095OooO0O0, sb);
    }

    public C33186OooOooO(String str, int i) {
        this.f120094OooO00o = str;
        this.f120095OooO0O0 = i;
    }
}
