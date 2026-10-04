package o0o0OOO;

import com.orion.notein.domain.models.papertheme.MyTemplate;
import java.util.Comparator;
import o000OoO.C24536OooO0Oo;
import o0oo0Oo.C31238OooO;

/* JADX INFO: renamed from: o0o0OOO.OoooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30509OoooOoO implements Comparator {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f108941OooOo0o;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f108941OooOo0o) {
            case 0:
                return C24536OooO0Oo.OooO0O0(Long.valueOf(((MyTemplate) obj2).getCreationTime()), Long.valueOf(((MyTemplate) obj).getCreationTime()));
            default:
                return C24536OooO0Oo.OooO0O0(Float.valueOf(((C31238OooO) obj).f111411OooO0OO), Float.valueOf(((C31238OooO) obj2).f111411OooO0OO));
        }
    }
}
