package o00ooO0;

import android.graphics.Bitmap;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* JADX INFO: renamed from: o00ooO0.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25744OooOOoo implements OooOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Set<Bitmap> f87866OooO00o;

    public C25744OooOOoo() {
        Set<Bitmap> setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        kotlin.jvm.internal.OooOOO0.OooO0o(setNewSetFromMap, "newIdentityHashSet(...)");
        this.f87866OooO00o = setNewSetFromMap;
    }

    @Override // o00o0o0o.InterfaceC25448OooO0o0
    public final Bitmap get(int i) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, (int) Math.ceil(((double) i) / 2.0d), Bitmap.Config.RGB_565);
        kotlin.jvm.internal.OooOOO0.OooO0o(bitmapCreateBitmap, "createBitmap(...)");
        this.f87866OooO00o.add(bitmapCreateBitmap);
        return bitmapCreateBitmap;
    }

    @Override // o00o0o.InterfaceC25436OooO0OO
    public final void release(Object obj) {
        Bitmap value = (Bitmap) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(value, "value");
        this.f87866OooO00o.remove(value);
        value.recycle();
    }
}
