package o0O0o00;

import android.graphics.Rect;
import java.util.Comparator;

/* JADX INFO: renamed from: o0O0o00.o0000ooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C25988o0000ooO implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Rect rect = (Rect) obj;
        Rect rect2 = (Rect) obj2;
        int i = rect.top;
        int i2 = rect2.top;
        return i == i2 ? rect.left - rect2.left : i - i2;
    }
}
