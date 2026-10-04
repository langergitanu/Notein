package o000o0O0;

import OooOoo.C20593OooO0Oo;
import androidx.core.app.NotificationCompat;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import o000o0O0.Oooo0;

/* JADX INFO: renamed from: o000o0O0.OooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@Oooo0.OooO00o(NotificationCompat.CATEGORY_NAVIGATION)
@Metadata(m80611d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m80612d2 = {"Lo000o0O0/OooOoO;", "Lo000o0O0/Oooo0;", "Lo000o0O0/OooOoO0;", "navigation-common_release"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
public class C24584OooOoO extends Oooo0<C24585OooOoO0> {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C24600Oooo0OO f83309OooO0OO;

    public C24584OooOoO(C24600Oooo0OO c24600Oooo0OO) {
        this.f83309OooO0OO = c24600Oooo0OO;
    }

    @Override // o000o0O0.Oooo0
    public final C24583OooOo0o OooO00o() {
        return new C24585OooOoO0(this);
    }

    @Override // o000o0O0.Oooo0
    public final void OooO0Oo(List list, C24587OooOoo c24587OooOoo) {
        String strValueOf;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            OooOO0 oooOO02 = (OooOO0) it.next();
            C24585OooOoO0 c24585OooOoO0 = (C24585OooOoO0) oooOO02.f83189OooOo;
            int i = c24585OooOoO0.f83313Oooo00o;
            if (i == 0) {
                StringBuilder sb = new StringBuilder("no start destination defined via app:startDestination for ");
                int i2 = c24585OooOoO0.f83302OooOooO;
                if (i2 != 0) {
                    strValueOf = c24585OooOoO0.f83298OooOoO0;
                    if (strValueOf == null) {
                        strValueOf = String.valueOf(i2);
                    }
                } else {
                    strValueOf = "the root navigation";
                }
                sb.append(strValueOf);
                throw new IllegalStateException(sb.toString().toString());
            }
            C24583OooOo0o c24583OooOo0oOooOO0 = c24585OooOoO0.OooOO0(i, false);
            if (c24583OooOo0oOooOO0 == null) {
                if (c24585OooOoO0.f83311Oooo0 == null) {
                    c24585OooOoO0.f83311Oooo0 = String.valueOf(c24585OooOoO0.f83313Oooo00o);
                }
                String str = c24585OooOoO0.f83311Oooo0;
                kotlin.jvm.internal.OooOOO0.OooO0Oo(str);
                throw new IllegalArgumentException(C20593OooO0Oo.OooO0O0("navigation destination ", str, " is not a direct child of this NavGraph"));
            }
            this.f83309OooO0OO.OooO0O0(c24583OooOo0oOooOO0.f83296OooOo0o).OooO0Oo(com.facebook.soloader.OooOo.OooO0oO(OooO0O0().OooO0OO(c24583OooOo0oOooOO0, c24583OooOo0oOooOO0.OooO0Oo(oooOO02.f83192OooOoO0))), c24587OooOoo);
        }
    }
}
