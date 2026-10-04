package o0o0O000;

import Oooo0.C20860Ooooooo;
import android.os.Bundle;
import com.orion.notein.domain.models.folder.Folder;

/* JADX INFO: renamed from: o0o0O000.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30219OooO0o0 implements o000o0O0.OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f107642OooO00o;

    public C30219OooO0o0(String str) {
        this.f107642OooO00o = str;
    }

    public static final C30219OooO0o0 fromBundle(Bundle bundle) {
        if (C20860Ooooooo.OooO0Oo(bundle, "bundle", C30219OooO0o0.class, Folder.PROPERTY_FOLDER_ID)) {
            return new C30219OooO0o0(bundle.getString(Folder.PROPERTY_FOLDER_ID));
        }
        throw new IllegalArgumentException("Required argument \"folderId\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C30219OooO0o0) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f107642OooO00o, ((C30219OooO0o0) obj).f107642OooO00o);
    }

    public final int hashCode() {
        String str = this.f107642OooO00o;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder("FolderCreationDialogFragmentArgs(folderId="), this.f107642OooO00o, ")");
    }
}
