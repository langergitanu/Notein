package o0OO0O0;

import com.orion.notein.domain.models.note.AudioFile;
import java.util.Comparator;
import java.util.Map;
import o000OoO.C24536OooO0Oo;

/* JADX INFO: loaded from: classes9.dex */
public final class OooOo<T> implements Comparator {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Map f92246OooOo0o;

    public OooOo(Map map) {
        this.f92246OooOo0o = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        String id = ((AudioFile) t).getId();
        Map map = this.f92246OooOo0o;
        return C24536OooO0Oo.OooO0O0((Integer) map.get(id), (Integer) map.get(((AudioFile) t2).getId()));
    }
}
