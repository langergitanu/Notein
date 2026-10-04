package o0o00oOo;

import Oooo0.C20860Ooooooo;
import Oooo0oO.C21023OooO0Oo;
import android.os.Bundle;
import com.huawei.hms.network.embedded.C18437z2;
import com.orion.notein.domain.models.note.NoteMeta;

/* JADX INFO: loaded from: classes10.dex */
public final class o0000 implements o000o0O0.OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f107020OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f107021OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f107022OooO0OO;

    public o0000(String str, String str2, int i) {
        this.f107020OooO00o = str;
        this.f107021OooO0O0 = str2;
        this.f107022OooO0OO = i;
    }

    public static final o0000 fromBundle(Bundle bundle) {
        if (!C20860Ooooooo.OooO0Oo(bundle, "bundle", o0000.class, NoteMeta.PROPERTY_NOTE_ID)) {
            throw new IllegalArgumentException("Required argument \"noteId\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString(NoteMeta.PROPERTY_NOTE_ID);
        if (string == null) {
            throw new IllegalArgumentException("Argument \"noteId\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey(NoteMeta.PROPERTY_TITLE)) {
            throw new IllegalArgumentException("Required argument \"title\" is missing and does not have an android:defaultValue");
        }
        String string2 = bundle.getString(NoteMeta.PROPERTY_TITLE);
        if (string2 == null) {
            throw new IllegalArgumentException("Argument \"title\" is marked as non-null but was passed a null value.");
        }
        if (bundle.containsKey(C18437z2.f56754h)) {
            return new o0000(string, string2, bundle.getInt(C18437z2.f56754h));
        }
        throw new IllegalArgumentException("Required argument \"type\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0000)) {
            return false;
        }
        o0000 o0000Var = (o0000) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f107020OooO00o, o0000Var.f107020OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f107021OooO0O0, o0000Var.f107021OooO0O0) && this.f107022OooO0OO == o0000Var.f107022OooO0OO;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f107022OooO0OO) + com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(this.f107020OooO00o.hashCode() * 31, 31, this.f107021OooO0O0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RenameDialogFragmentArgs(noteId=");
        sb.append(this.f107020OooO00o);
        sb.append(", title=");
        sb.append(this.f107021OooO0O0);
        sb.append(", type=");
        return C21023OooO0Oo.OooO0OO(")", this.f107022OooO0OO, sb);
    }
}
