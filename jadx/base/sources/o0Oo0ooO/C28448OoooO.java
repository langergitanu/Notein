package o0Oo0ooO;

import OooOoo.C20593OooO0Oo;
import Oooo0.C20860Ooooooo;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.orion.notein.p607ui.label.ItemData;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: o0Oo0ooO.OoooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28448OoooO implements o000o0O0.OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ItemData[] f100819OooO00o;

    public C28448OoooO(ItemData[] itemDataArr) {
        this.f100819OooO00o = itemDataArr;
    }

    public static final C28448OoooO fromBundle(Bundle bundle) {
        ItemData[] itemDataArr;
        if (!C20860Ooooooo.OooO0Oo(bundle, "bundle", C28448OoooO.class, FirebaseAnalytics.Param.ITEMS)) {
            throw new IllegalArgumentException("Required argument \"items\" is missing and does not have an android:defaultValue");
        }
        Parcelable[] parcelableArray = bundle.getParcelableArray(FirebaseAnalytics.Param.ITEMS);
        if (parcelableArray != null) {
            ArrayList arrayList = new ArrayList(parcelableArray.length);
            for (Parcelable parcelable : parcelableArray) {
                kotlin.jvm.internal.OooOOO0.OooO0o0(parcelable, "null cannot be cast to non-null type com.orion.notein.ui.label.ItemData");
                arrayList.add((ItemData) parcelable);
            }
            itemDataArr = (ItemData[]) arrayList.toArray(new ItemData[0]);
        } else {
            itemDataArr = null;
        }
        if (itemDataArr != null) {
            return new C28448OoooO(itemDataArr);
        }
        throw new IllegalArgumentException("Argument \"items\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C28448OoooO) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f100819OooO00o, ((C28448OoooO) obj).f100819OooO00o);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f100819OooO00o);
    }

    public final String toString() {
        return C20593OooO0Oo.OooO0O0("LabelPickerBottomSheetFragmentArgs(items=", Arrays.toString(this.f100819OooO00o), ")");
    }
}
