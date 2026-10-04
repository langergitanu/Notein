package o0OOo0o;

import com.orion.notein.domain.models.note.NoteMeta;
import java.util.Comparator;
import o000OoO.C24536OooO0Oo;

/* JADX INFO: renamed from: o0OOo0o.o00oo0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27583o00oo0oO<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        return C24536OooO0Oo.OooO0O0(Long.valueOf(((NoteMeta) t).getLastModificationTime()), Long.valueOf(((NoteMeta) t2).getLastModificationTime()));
    }
}
