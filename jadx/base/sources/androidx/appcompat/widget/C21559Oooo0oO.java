package androidx.appcompat.widget;

import android.graphics.Paint;
import android.graphics.Path;
import android.net.Uri;
import com.aspose.words.internal.zzZNT;
import com.aspose.words.internal.zzZYD;
import java.util.ArrayList;
import oO00ooO.C32443OooOOO;

/* JADX INFO: renamed from: androidx.appcompat.widget.Oooo0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C21559Oooo0oO {
    public static String OooO00o(Uri uri, String str) {
        return str + uri;
    }

    public static void OooO0O0(Path path, Paint paint, ArrayList arrayList) {
        arrayList.add(new C32443OooOOO(path, paint));
    }

    public static boolean OooO0OO(zzZNT zzznt, int i) {
        return zzZYD.zzXk(zzznt.zzhJ().zzQx(i).getValue());
    }
}
