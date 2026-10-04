package o0OoO0oo;

import com.orion.notein.data.repo.transactions.C22926OooO0oo;
import com.orion.penkit.models.DrawRecord;
import com.orion.penkit.models.DrawResult;
import com.orion.penkit.models.ShapeInfo;
import java.util.List;
import o0oo0o.InterfaceC31284OooO0O0;
import oO0O000o.InterfaceC32507OooOO0o;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: renamed from: o0OoO0oo.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28687OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final List<InterfaceC32507OooOO0o<DrawResult, Boolean>> f101643OooO00o = C34429OooOOo0.OooOO0o(new C28685OooO00o(), new C22926OooO0oo(1), new C28686OooO0O0(0));

    public static boolean OooO00o(InterfaceC31284OooO0O0 interfaceC31284OooO0O0) {
        if ((interfaceC31284OooO0O0 instanceof DrawRecord) && ((DrawRecord) interfaceC31284OooO0O0).getPenType() == 11) {
            return true;
        }
        return (interfaceC31284OooO0O0 instanceof ShapeInfo) && ((ShapeInfo) interfaceC31284OooO0O0).getTapeLike();
    }
}
