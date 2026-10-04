package o0OOo0o;

import com.orion.notein.domain.models.page.INoteinDisplayItem;
import java.util.Comparator;
import o000OoO.C24536OooO0Oo;

/* JADX INFO: renamed from: o0OOo0o.o00OO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27468o00OO0oo<T> implements Comparator {
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        return C24536OooO0Oo.OooO0O0(Long.valueOf(((INoteinDisplayItem) t).getCreationTime()), Long.valueOf(((INoteinDisplayItem) t2).getCreationTime()));
    }
}
