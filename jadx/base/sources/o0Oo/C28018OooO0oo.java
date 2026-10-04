package o0Oo;

import com.orion.notein.domain.models.LocaleCountryCode;
import com.orion.notein.p607ui.p609vo.NoteVO;
import java.util.Comparator;
import o000OoO.C24536OooO0Oo;

/* JADX INFO: renamed from: o0Oo.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28018OooO0oo implements Comparator {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f99355OooOo0o;

    public /* synthetic */ C28018OooO0oo(int i) {
        this.f99355OooOo0o = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f99355OooOo0o) {
            case 0:
                return C24536OooO0Oo.OooO0O0(((LocaleCountryCode) obj).getName(), ((LocaleCountryCode) obj2).getName());
            default:
                return C24536OooO0Oo.OooO0O0(Long.valueOf(((NoteVO) obj2).getLastModificationTime()), Long.valueOf(((NoteVO) obj).getLastModificationTime()));
        }
    }
}
