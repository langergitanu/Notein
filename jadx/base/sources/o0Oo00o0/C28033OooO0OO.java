package o0Oo00o0;

import com.orion.notein.domain.models.page.Page;
import java.util.Comparator;
import o000OoO.C24536OooO0Oo;

/* JADX INFO: renamed from: o0Oo00o0.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C28033OooO0OO<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        return C24536OooO0Oo.OooO0O0(Long.valueOf(((Page) t2).getLastModificationTime()), Long.valueOf(((Page) t).getLastModificationTime()));
    }
}
