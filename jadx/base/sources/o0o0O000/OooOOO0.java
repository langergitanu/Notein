package o0o0O000;

import OooOoo.C20593OooO0Oo;
import Oooo0.C20860Ooooooo;
import android.os.Bundle;
import android.os.Parcelable;
import com.orion.notein.p607ui.notelist.folder.ItemDataOfMovingToFolder;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOOO0 implements o000o0O0.OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ItemDataOfMovingToFolder[] f107668OooO00o;

    public OooOOO0(ItemDataOfMovingToFolder[] itemDataOfMovingToFolderArr) {
        this.f107668OooO00o = itemDataOfMovingToFolderArr;
    }

    public static final OooOOO0 fromBundle(Bundle bundle) {
        ItemDataOfMovingToFolder[] itemDataOfMovingToFolderArr;
        if (!C20860Ooooooo.OooO0Oo(bundle, "bundle", OooOOO0.class, "itemDataList")) {
            throw new IllegalArgumentException("Required argument \"itemDataList\" is missing and does not have an android:defaultValue");
        }
        Parcelable[] parcelableArray = bundle.getParcelableArray("itemDataList");
        if (parcelableArray != null) {
            ArrayList arrayList = new ArrayList(parcelableArray.length);
            for (Parcelable parcelable : parcelableArray) {
                kotlin.jvm.internal.OooOOO0.OooO0o0(parcelable, "null cannot be cast to non-null type com.orion.notein.ui.notelist.folder.ItemDataOfMovingToFolder");
                arrayList.add((ItemDataOfMovingToFolder) parcelable);
            }
            itemDataOfMovingToFolderArr = (ItemDataOfMovingToFolder[]) arrayList.toArray(new ItemDataOfMovingToFolder[0]);
        } else {
            itemDataOfMovingToFolderArr = null;
        }
        if (itemDataOfMovingToFolderArr != null) {
            return new OooOOO0(itemDataOfMovingToFolderArr);
        }
        throw new IllegalArgumentException("Argument \"itemDataList\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OooOOO0) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f107668OooO00o, ((OooOOO0) obj).f107668OooO00o);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f107668OooO00o);
    }

    public final String toString() {
        return C20593OooO0Oo.OooO0O0("MoveToFolderDialogFragmentArgs(itemDataList=", Arrays.toString(this.f107668OooO00o), ")");
    }
}
