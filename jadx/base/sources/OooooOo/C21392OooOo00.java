package OooooOo;

import com.aspose.slides.Collections.Generic.List;
import com.google.firebase.inappmessaging.internal.InAppMessageStreamManager;
import oO00o00o.InterfaceC32330OooO0O0;

/* JADX INFO: renamed from: OooooOo.OooOo00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C21392OooOo00 implements InterfaceC32330OooO0O0 {
    public static float OooO00o(float f, float f2, float f3, float f4) {
        return (f3 - (f * f2)) * f4;
    }

    public static void OooO0O0(int i, int i2, int i3, List list) {
        list.addItem(Integer.valueOf(i));
        list.addItem(Integer.valueOf(i2));
        list.addItem(Integer.valueOf(i3));
    }

    @Override // oO00o00o.InterfaceC32330OooO0O0
    public void accept(Object obj) throws Exception {
        InAppMessageStreamManager.lambda$createFirebaseInAppMessageStream$19((Throwable) obj);
    }
}
