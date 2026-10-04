package ooo0o;

import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: ooo0o.OooOo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C35200OooOo0o {
    public static String[] OooO00o(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add("<init>(" + str + ")V");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static LinkedHashSet OooO0O0(String internalName, String... signatures) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(internalName, "internalName");
        kotlin.jvm.internal.OooOOO0.OooO0oO(signatures, "signatures");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : signatures) {
            linkedHashSet.add(internalName + FilenameUtils.EXTENSION_SEPARATOR + str);
        }
        return linkedHashSet;
    }

    public static LinkedHashSet OooO0OO(String str, String... signatures) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(signatures, "signatures");
        return OooO0O0("java/lang/".concat(str), (String[]) Arrays.copyOf(signatures, signatures.length));
    }

    public static LinkedHashSet OooO0Oo(String str, String... strArr) {
        return OooO0O0("java/util/".concat(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }
}
