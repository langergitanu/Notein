package OooOo;

import com.aspose.slides.Collections.Generic.SortedList;
import com.google.android.gms.internal.play_billing.zzep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.ComponentRegistrarProcessor;
import java.util.List;

/* JADX INFO: renamed from: OooOo.OooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C20485OooOoO implements ComponentRegistrarProcessor {
    public static int OooO00o(int i, int i2, int i3) {
        return zzep.zzC(i) + i2 + i3;
    }

    public static String OooO0O0(String str, Object obj, String str2) {
        return str + obj + str2;
    }

    public static StringBuilder OooO0OO(int i, String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(i);
        sb.append(str4);
        return sb;
    }

    public static void OooO0Oo(int i, SortedList sortedList, String str, int i2, String str2) {
        sortedList.addItem(Integer.valueOf(i), str);
        sortedList.addItem(Integer.valueOf(i2), str2);
    }

    @Override // com.google.firebase.components.ComponentRegistrarProcessor
    public List processRegistrar(ComponentRegistrar componentRegistrar) {
        return componentRegistrar.getComponents();
    }
}
