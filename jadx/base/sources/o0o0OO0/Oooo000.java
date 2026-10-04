package o0o0OO0;

import com.orion.notein.domain.models.ocr.AiOcrTextPage;
import java.util.Comparator;
import java.util.Map;
import o000OoO.C24536OooO0Oo;

/* JADX INFO: loaded from: classes10.dex */
public final class Oooo000<T> implements Comparator {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Map f108619OooOo0o;

    public Oooo000(Map map) {
        this.f108619OooOo0o = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        String id = ((AiOcrTextPage) t).getId();
        Map map = this.f108619OooOo0o;
        return C24536OooO0Oo.OooO0O0((Integer) map.get(id), (Integer) map.get(((AiOcrTextPage) t2).getId()));
    }
}
