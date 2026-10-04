package OoooooO;

import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.internal.p332p7.ok7;
import com.google.firebase.inappmessaging.internal.InAppMessageStreamManager;
import com.microsoft.identity.common.java.logging.Logger;
import java.util.List;
import oO00o00o.InterfaceC32332OooO0Oo;

/* JADX INFO: renamed from: OoooooO.Oooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C21445Oooo implements InterfaceC32332OooO0Oo {
    public static int OooO00o(List list, int i, int i2) {
        return (list.hashCode() + i) * i2;
    }

    public static String OooO0O0(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        return sb.toString();
    }

    public static void OooO0OO(String str, ok7 ok7Var, com.aspose.slides.Collections.Generic.List list) {
        list.addItem(new C7394ca(str, ok7Var));
    }

    public static void OooO0Oo(StringBuilder sb, String str, String str2, String str3) {
        sb.append(str);
        sb.append(str2);
        Logger.warn(sb.toString(), str3);
    }

    @Override // oO00o00o.InterfaceC32332OooO0Oo
    public boolean test(Object obj) {
        return InAppMessageStreamManager.lambda$createFirebaseInAppMessageStream$9((Boolean) obj);
    }
}
