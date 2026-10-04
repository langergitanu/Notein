package o0Oo0o0o;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.InterfaceC21912Oooo0o;
import com.aspose.slides.C22201OooO0oO;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.orion.notein.p607ui.export.ExportBottomSheetFragment;
import com.orion.notein.p607ui.export.ExportRequest;
import com.orion.notein.p607ui.noteeditor.NoteEditorContainerFragment;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;
import oO00ooO.C32442OooOO0o;
import oO0OOooo.C33163OooO0oO;
import oO0o0O0o.C33599OooOo0O;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0Oo0o0o.OooOOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C28237OooOOOO implements OooO0o.OooO00o, InterfaceC21912Oooo0o {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Fragment f100078OooOo0o;

    public /* synthetic */ C28237OooOOOO(Fragment fragment) {
        this.f100078OooOo0o = fragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a4  */
    @Override // OooO0o.OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void OooO0O0(Object obj) throws IOException {
        String str;
        ActivityResult result = (ActivityResult) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(result, "result");
        if (result.f62240OooOo0o != -1) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("ExportBottomSheetFragment");
            c20358OooO00o.OooO0o0("User cancelled file browsing", new Object[0]);
            return;
        }
        ExportBottomSheetFragment exportBottomSheetFragment = (ExportBottomSheetFragment) this.f100078OooOo0o;
        Context context = exportBottomSheetFragment.getContext();
        if (context == null) {
            return;
        }
        String lastPathSegment = null;
        Intent intent = result.f62239OooOo;
        Uri data = intent != null ? intent.getData() : null;
        if (data == null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("ExportBottomSheetFragment");
            c20358OooO00o2.OooO0OO("File uri not found", new Object[0]);
            return;
        }
        CopyOnWriteArrayList<String> copyOnWriteArrayList = exportBottomSheetFragment.OooOooo().f71767OooOo;
        String scheme = data.getScheme();
        if (scheme == null) {
            lastPathSegment = data.getLastPathSegment();
        } else {
            int iHashCode = scheme.hashCode();
            if (iHashCode != 3143036) {
                if (iHashCode == 951530617 && scheme.equals(FirebaseAnalytics.Param.CONTENT)) {
                    Cursor cursorQuery = context.getContentResolver().query(data, null, null, null, null);
                    if (cursorQuery != null) {
                        Cursor cursor = cursorQuery;
                        try {
                            Cursor cursor2 = cursor;
                            int columnIndex = cursor2.getColumnIndex("_display_name");
                            if (cursor2.moveToFirst() && columnIndex != -1) {
                                lastPathSegment = cursor2.getString(columnIndex);
                            }
                            cursor.close();
                        } finally {
                        }
                    }
                }
            } else if (scheme.equals("file")) {
                String path = data.getPath();
                if (path != null) {
                    lastPathSegment = new File(path).getName();
                }
            }
        }
        if (lastPathSegment == null) {
            lastPathSegment = "unnamed";
        }
        String strOooooOO = C33599OooOo0O.OooooOO(lastPathSegment, ".", lastPathSegment);
        String str2 = (String) exportBottomSheetFragment.Oooo000().f71706OooO.f121747OooOo0o.getValue();
        C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
        c20358OooO00o3.OooO00o(C22201OooO0oO.OooO0O0(c20358OooO00o3, "ExportBottomSheetFragment", "ExportBottomSheetFragment export, watermarkText: ", str2, "."), new Object[0]);
        int iOooO0O0 = com.android.billingclient.api.OooOO0.OooO0O0(exportBottomSheetFragment.OooOooO());
        ExportRequest exportRequestOooOooO = exportBottomSheetFragment.OooOooO();
        if (exportRequestOooOooO instanceof ExportRequest.PageExport) {
            str = ((ExportRequest.PageExport) exportRequestOooOooO).f71679OooOo;
        } else {
            if (!(exportRequestOooOooO instanceof ExportRequest.NoteExport)) {
                throw new C32442OooOO0o();
            }
            str = "";
        }
        exportBottomSheetFragment.OooOooo().OooO0oO((C33163OooO0oO) context, copyOnWriteArrayList, iOooO0O0, data, strOooooOO, str, str2);
    }

    @Override // androidx.fragment.app.InterfaceC21912Oooo0o
    public void OooO0OO(Bundle bundle, String str) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(bundle, "bundle");
        NoteEditorContainerFragment noteEditorContainerFragment = (NoteEditorContainerFragment) this.f100078OooOo0o;
        NoteEditorContainerFragment.Oooo0(noteEditorContainerFragment);
        noteEditorContainerFragment.Oooo0OO(10, Integer.valueOf(bundle.getInt("page_number", -1)));
    }
}
