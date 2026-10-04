package o0o0O0oO;

import com.orion.notein.p607ui.p609vo.NoteVO;
import java.util.Comparator;
import o000OoO.C24536OooO0Oo;

/* JADX INFO: renamed from: o0o0O0oO.OooOoO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30336OooOoO0<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        return C24536OooO0Oo.OooO0O0(Long.valueOf(((NoteVO) t2).getLastModificationTime()), Long.valueOf(((NoteVO) t).getLastModificationTime()));
    }
}
