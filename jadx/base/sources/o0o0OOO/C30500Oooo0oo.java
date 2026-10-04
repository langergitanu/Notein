package o0o0OOO;

import Oooo0.C20860Ooooooo;
import android.os.Bundle;
import com.orion.notein.domain.models.folder.Folder;
import com.orion.notein.domain.models.note.NoteMeta;

/* JADX INFO: renamed from: o0o0OOO.Oooo0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30500Oooo0oo implements o000o0O0.OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f108928OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f108929OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f108930OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String f108931OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final String f108932OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f108933OooO0o0;

    public C30500Oooo0oo(String str, String str2, String str3, String str4, String str5, boolean z) {
        this.f108928OooO00o = str;
        this.f108929OooO0O0 = str2;
        this.f108930OooO0OO = str3;
        this.f108931OooO0Oo = str4;
        this.f108933OooO0o0 = z;
        this.f108932OooO0o = str5;
    }

    public static final C30500Oooo0oo fromBundle(Bundle bundle) {
        if (!C20860Ooooooo.OooO0Oo(bundle, "bundle", C30500Oooo0oo.class, "strategyType")) {
            throw new IllegalArgumentException("Required argument \"strategyType\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("strategyType");
        if (string == null) {
            throw new IllegalArgumentException("Argument \"strategyType\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey(Folder.PROPERTY_FOLDER_ID)) {
            throw new IllegalArgumentException("Required argument \"folderId\" is missing and does not have an android:defaultValue");
        }
        return new C30500Oooo0oo(string, bundle.getString(Folder.PROPERTY_FOLDER_ID), bundle.containsKey(NoteMeta.PROPERTY_NOTE_ID) ? bundle.getString(NoteMeta.PROPERTY_NOTE_ID) : null, bundle.containsKey("pageId") ? bundle.getString("pageId") : null, bundle.containsKey("targetMaterialId") ? bundle.getString("targetMaterialId") : null, bundle.containsKey("unbounded") ? bundle.getBoolean("unbounded") : false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30500Oooo0oo)) {
            return false;
        }
        C30500Oooo0oo c30500Oooo0oo = (C30500Oooo0oo) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f108928OooO00o, c30500Oooo0oo.f108928OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f108929OooO0O0, c30500Oooo0oo.f108929OooO0O0) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f108930OooO0OO, c30500Oooo0oo.f108930OooO0OO) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f108931OooO0Oo, c30500Oooo0oo.f108931OooO0Oo) && this.f108933OooO0o0 == c30500Oooo0oo.f108933OooO0o0 && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f108932OooO0o, c30500Oooo0oo.f108932OooO0o);
    }

    public final int hashCode() {
        int iHashCode = this.f108928OooO00o.hashCode() * 31;
        String str = this.f108929OooO0O0;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f108930OooO0OO;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f108931OooO0Oo;
        int iOooO0O0 = OooOoo0.o00000.OooO0O0((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f108933OooO0o0);
        String str4 = this.f108932OooO0o;
        return iOooO0O0 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PaperConfigDialogFragmentArgs(strategyType=");
        sb.append(this.f108928OooO00o);
        sb.append(", folderId=");
        sb.append(this.f108929OooO0O0);
        sb.append(", noteId=");
        sb.append(this.f108930OooO0OO);
        sb.append(", pageId=");
        sb.append(this.f108931OooO0Oo);
        sb.append(", unbounded=");
        sb.append(this.f108933OooO0o0);
        sb.append(", targetMaterialId=");
        return androidx.concurrent.futures.OooO00o.OooO0OO(sb, this.f108932OooO0o, ")");
    }
}
