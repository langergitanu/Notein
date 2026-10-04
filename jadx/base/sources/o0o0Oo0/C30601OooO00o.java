package o0o0Oo0;

import Oooo0.C20860Ooooooo;
import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.orion.notein.domain.models.note.NoteMeta;
import kotlin.jvm.internal.OooOOO0;
import o000o0O0.OooO0o;

/* JADX INFO: renamed from: o0o0Oo0.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30601OooO00o implements OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f109486OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f109487OooO0O0;

    public C30601OooO00o(String str, String str2) {
        this.f109486OooO00o = str;
        this.f109487OooO0O0 = str2;
    }

    public static final C30601OooO00o fromBundle(Bundle bundle) {
        if (!C20860Ooooooo.OooO0Oo(bundle, "bundle", C30601OooO00o.class, NoteMeta.PROPERTY_TITLE)) {
            throw new IllegalArgumentException("Required argument \"title\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString(NoteMeta.PROPERTY_TITLE);
        if (string == null) {
            throw new IllegalArgumentException("Argument \"title\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey(FirebaseAnalytics.Param.CONTENT)) {
            throw new IllegalArgumentException("Required argument \"content\" is missing and does not have an android:defaultValue");
        }
        String string2 = bundle.getString(FirebaseAnalytics.Param.CONTENT);
        if (string2 != null) {
            return new C30601OooO00o(string, string2);
        }
        throw new IllegalArgumentException("Argument \"content\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30601OooO00o)) {
            return false;
        }
        C30601OooO00o c30601OooO00o = (C30601OooO00o) obj;
        return OooOOO0.OooO0O0(this.f109486OooO00o, c30601OooO00o.f109486OooO00o) && OooOOO0.OooO0O0(this.f109487OooO0O0, c30601OooO00o.f109487OooO0O0);
    }

    public final int hashCode() {
        return this.f109487OooO0O0.hashCode() + (this.f109486OooO00o.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PermissionTipsDialogFragmentArgs(title=");
        sb.append(this.f109486OooO00o);
        sb.append(", content=");
        return androidx.concurrent.futures.OooO00o.OooO0OO(sb, this.f109487OooO0O0, ")");
    }
}
