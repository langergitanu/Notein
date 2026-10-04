package oO0OOoo0;

import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.ArrayList;

/* JADX INFO: renamed from: oO0OOoo0.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33133OooO0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String[] f119819OooO00o;

    /* JADX INFO: renamed from: oO0OOoo0.OooO0Oo$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ArrayList f119820OooO00o = new ArrayList(20);
    }

    public C33133OooO0Oo(OooO00o oooO00o) {
        ArrayList arrayList = oooO00o.f119820OooO00o;
        this.f119819OooO00o = (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = this.f119819OooO00o;
        int length = strArr.length / 2;
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            String str = null;
            sb.append((i2 < 0 || i2 >= strArr.length) ? null : strArr[i2]);
            sb.append(": ");
            int i3 = i2 + 1;
            if (i3 >= 0 && i3 < strArr.length) {
                str = strArr[i3];
            }
            sb.append(str);
            sb.append(IOUtils.LINE_SEPARATOR_UNIX);
        }
        return sb.toString();
    }
}
