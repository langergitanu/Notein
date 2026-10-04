package o0OoOO0o;

import Oooo0.C20860Ooooooo;
import android.os.Bundle;
import com.orion.notein.domain.models.note.NoteMeta;
import kotlin.jvm.internal.OooOOO0;
import o000o0O0.OooO0o;

/* JADX INFO: renamed from: o0OoOO0o.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29035OooO0O0 implements OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f102858OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f102859OooO0O0;

    public C29035OooO0O0(String str, String str2) {
        this.f102858OooO00o = str;
        this.f102859OooO0O0 = str2;
    }

    public static final C29035OooO0O0 fromBundle(Bundle bundle) {
        if (!C20860Ooooooo.OooO0Oo(bundle, "bundle", C29035OooO0O0.class, "id")) {
            throw new IllegalArgumentException("Required argument \"id\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("id");
        if (string == null) {
            throw new IllegalArgumentException("Argument \"id\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey(NoteMeta.PROPERTY_TITLE)) {
            throw new IllegalArgumentException("Required argument \"title\" is missing and does not have an android:defaultValue");
        }
        String string2 = bundle.getString(NoteMeta.PROPERTY_TITLE);
        if (string2 != null) {
            return new C29035OooO0O0(string, string2);
        }
        throw new IllegalArgumentException("Argument \"title\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29035OooO0O0)) {
            return false;
        }
        C29035OooO0O0 c29035OooO0O0 = (C29035OooO0O0) obj;
        return OooOOO0.OooO0O0(this.f102858OooO00o, c29035OooO0O0.f102858OooO00o) && OooOOO0.OooO0O0(this.f102859OooO0O0, c29035OooO0O0.f102859OooO0O0);
    }

    public final int hashCode() {
        return this.f102859OooO0O0.hashCode() + (this.f102858OooO00o.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TemplateRenameDialogFragmentArgs(id=");
        sb.append(this.f102858OooO00o);
        sb.append(", title=");
        return androidx.concurrent.futures.OooO00o.OooO0OO(sb, this.f102859OooO0O0, ")");
    }
}
