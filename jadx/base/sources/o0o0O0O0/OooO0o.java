package o0o0O0O0;

import OooOooo.C20785Oooo00o;
import Oooo0.C20860Ooooooo;
import Oooo0oO.C21023OooO0Oo;
import android.os.Bundle;
import com.orion.notein.domain.models.folder.Folder;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0o implements o000o0O0.OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f107872OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f107873OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f107874OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f107875OooO0Oo;

    public OooO0o(String str, String str2, int i, int i2) {
        this.f107872OooO00o = str;
        this.f107873OooO0O0 = str2;
        this.f107874OooO0OO = i;
        this.f107875OooO0Oo = i2;
    }

    public static final OooO0o fromBundle(Bundle bundle) {
        if (!C20860Ooooooo.OooO0Oo(bundle, "bundle", OooO0o.class, "key")) {
            throw new IllegalArgumentException("Required argument \"key\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("key");
        if (string == null) {
            throw new IllegalArgumentException("Argument \"key\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey(Folder.PROPERTY_FOLDER_ID)) {
            throw new IllegalArgumentException("Required argument \"folderId\" is missing and does not have an android:defaultValue");
        }
        String string2 = bundle.getString(Folder.PROPERTY_FOLDER_ID);
        if (!bundle.containsKey("multi_select")) {
            throw new IllegalArgumentException("Required argument \"multi_select\" is missing and does not have an android:defaultValue");
        }
        int i = bundle.getInt("multi_select");
        if (bundle.containsKey("extensions")) {
            return new OooO0o(string, string2, i, bundle.getInt("extensions"));
        }
        throw new IllegalArgumentException("Required argument \"extensions\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OooO0o)) {
            return false;
        }
        OooO0o oooO0o = (OooO0o) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f107872OooO00o, oooO0o.f107872OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f107873OooO0O0, oooO0o.f107873OooO0O0) && this.f107874OooO0OO == oooO0o.f107874OooO0OO && this.f107875OooO0Oo == oooO0o.f107875OooO0Oo;
    }

    public final int hashCode() {
        int iHashCode = this.f107872OooO00o.hashCode() * 31;
        String str = this.f107873OooO0O0;
        return Integer.hashCode(this.f107875OooO0Oo) + C20785Oooo00o.OooO00o(this.f107874OooO0OO, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImportBatchPdfDialogFragmentArgs(key=");
        sb.append(this.f107872OooO00o);
        sb.append(", folderId=");
        sb.append(this.f107873OooO0O0);
        sb.append(", multiSelect=");
        sb.append(this.f107874OooO0OO);
        sb.append(", extensions=");
        return C21023OooO0Oo.OooO0OO(")", this.f107875OooO0Oo, sb);
    }
}
