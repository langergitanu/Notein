package o000OO0O;

import androidx.hardware.OooO00o;
import com.orion.editor.model.PagePart;
import java.util.Comparator;
import o000OoO.C24536OooO0Oo;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 implements Comparator {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f82810OooOo0o;

    public /* synthetic */ OooO0O0(int i) {
        this.f82810OooOo0o = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f82810OooOo0o) {
            case 0:
                return C24536OooO0Oo.OooO0O0(Long.valueOf(((OooO00o.C19020OooO00o) obj2).f65151OooO0O0), Long.valueOf(((OooO00o.C19020OooO00o) obj).f65151OooO0O0));
            default:
                PagePart pagePart = (PagePart) obj;
                PagePart pagePart2 = (PagePart) obj2;
                return ((int) (pagePart2.OooO0OO().height() * pagePart2.OooO0OO().width())) - ((int) (pagePart.OooO0OO().height() * pagePart.OooO0OO().width()));
        }
    }
}
