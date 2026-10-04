package androidx.ink.strokes;

import android.os.Parcelable;
import com.orion.notein.p607ui.notelist.folder.ItemDataOfMovingToFolder;
import com.orion.notein.p607ui.notelist.folder.MoveToFolderFragment;

/* JADX INFO: renamed from: androidx.ink.strokes.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C21971OooOO0o implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f65479OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f65480OooOo0o;

    public /* synthetic */ C21971OooOO0o(Object obj, int i) {
        this.f65480OooOo0o = i;
        this.f65479OooOo = obj;
    }

    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        switch (this.f65480OooOo0o) {
            case 0:
                StrokeNative strokeNative = StrokeNative.f65499OooO00o;
                OooOOO0 oooOOO0 = (OooOOO0) this.f65479OooOo;
                oooOOO0.getClass();
                return Long.valueOf(strokeNative.newShallowCopyOfShape(oooOOO0.f65487OooO0O0.OooO00o(oooOOO0, OooOOO0.f65484OooO0o[0])));
            default:
                Parcelable[] parcelableArray = ((MoveToFolderFragment) this.f65479OooOo).requireArguments().getParcelableArray("item_data_list");
                ItemDataOfMovingToFolder[] itemDataOfMovingToFolderArr = parcelableArray != null ? (ItemDataOfMovingToFolder[]) parcelableArray : null;
                return itemDataOfMovingToFolderArr == null ? new ItemDataOfMovingToFolder[0] : itemDataOfMovingToFolderArr;
        }
    }
}
