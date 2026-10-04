package o00oO0O;

import androidx.compose.p002ui.platform.AndroidComposeView;
import com.hihonor.cloudservice.support.api.entity.auth.Scope;
import java.util.ArrayList;
import java.util.Iterator;
import oO00O0o0.InterfaceC32191OooOOoo;
import oO00ooO.C32460OooOooO;
import oOO00o0.C34370OooO0o0;

/* JADX INFO: renamed from: o00oO0O.OooOooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C25510OooOooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f86984OooO00o = 0;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final /* synthetic */ int f86985OooO0O0 = 0;

    public static String OooO00o(ArrayList arrayList) {
        if (arrayList.size() <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sb.append(((Scope) it.next()).f68825OooOo0o);
            sb.append(" ");
        }
        C34370OooO0o0.OooO0Oo("HnIDCloudServiceUtils", "scopesToStr scopes : " + sb.toString().trim());
        return sb.toString().trim();
    }

    public static final void OooO0O0(InterfaceC32191OooOOoo interfaceC32191OooOOoo, String key, Object obj) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(interfaceC32191OooOOoo, "<this>");
        kotlin.jvm.internal.OooOOO0.OooO0oO(key, "key");
        if (obj != null) {
            interfaceC32191OooOOoo.getHeaders().OooO0O0(key, obj.toString());
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
        }
    }

    public static final InterfaceC25542OoooooO OooO0OO(C25503OooOoOO c25503OooOoOO) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(c25503OooOoOO, "<this>");
        AndroidComposeView androidComposeView = c25503OooOoOO.f86944OooOooO;
        if (androidComposeView != null) {
            return androidComposeView;
        }
        throw new IllegalStateException("LayoutNode should be attached to an owner");
    }
}
