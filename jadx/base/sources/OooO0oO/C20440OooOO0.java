package OooO0oO;

import OooO0oO.AbstractC20431OooO00o;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: OooO0oO.OooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20440OooOO0 extends AbstractC20431OooO00o<Uri, Boolean> {
    @Override // OooO0oO.AbstractC20431OooO00o
    public final Intent OooO00o(Context context, Uri uri) {
        Uri input = uri;
        OooOOO0.OooO0oO(input, "input");
        Intent intentPutExtra = new Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", input);
        OooOOO0.OooO0o(intentPutExtra, "Intent(MediaStore.ACTION…tore.EXTRA_OUTPUT, input)");
        return intentPutExtra;
    }

    @Override // OooO0oO.AbstractC20431OooO00o
    public final AbstractC20431OooO00o.C18958OooO00o<Boolean> OooO0O0(Context context, Uri uri) {
        Uri input = uri;
        OooOOO0.OooO0oO(input, "input");
        return null;
    }

    @Override // OooO0oO.AbstractC20431OooO00o
    public final Boolean OooO0OO(int i, Intent intent) {
        return Boolean.valueOf(i == -1);
    }
}
