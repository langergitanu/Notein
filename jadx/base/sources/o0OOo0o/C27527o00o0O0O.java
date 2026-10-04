package o0OOo0o;

import com.orion.notein.domain.models.sticker.StickerCollection;
import java.util.Comparator;
import o000OoO.C24536OooO0Oo;

/* JADX INFO: renamed from: o0OOo0o.o00o0O0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27527o00o0O0O<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        return C24536OooO0Oo.OooO0O0(Long.valueOf(((StickerCollection) t2).getCreationTime()), Long.valueOf(((StickerCollection) t).getCreationTime()));
    }
}
