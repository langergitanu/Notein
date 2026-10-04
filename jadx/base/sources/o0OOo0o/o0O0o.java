package o0OOo0o;

import android.graphics.Bitmap;
import java.util.Comparator;
import o000OoO.C24536OooO0Oo;
import oO00O0o0.C32186OooO0oo;

/* JADX INFO: loaded from: classes9.dex */
public final class o0O0o implements Comparator {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f96933OooOo0o;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f96933OooOo0o) {
            case 0:
                Bitmap bitmap = (Bitmap) obj;
                Bitmap bitmap2 = (Bitmap) obj2;
                return C24536OooO0Oo.OooO0O0(Float.valueOf(bitmap.getWidth() / bitmap.getHeight()), Float.valueOf(bitmap2.getWidth() / bitmap2.getHeight()));
            default:
                return C24536OooO0Oo.OooO0O0(Double.valueOf(((C32186OooO0oo) obj2).f115531OooO0OO), Double.valueOf(((C32186OooO0oo) obj).f115531OooO0OO));
        }
    }
}
