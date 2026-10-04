package oO0OOoo0;

import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* JADX INFO: renamed from: oO0OOoo0.OooOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33143OooOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final String[] f119858OooO00o = new String[0];

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Charset f119859OooO0O0 = Charset.forName("UTF-8");

    public static Object[] OooO00o(Object[] objArr, Object[] objArr2) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            int length = objArr2.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    Object obj2 = objArr2[i];
                    if (obj.equals(obj2)) {
                        arrayList.add(obj2);
                        break;
                    }
                    i++;
                }
            }
        }
        return arrayList.toArray((Object[]) Array.newInstance((Class<?>) String.class, arrayList.size()));
    }
}
