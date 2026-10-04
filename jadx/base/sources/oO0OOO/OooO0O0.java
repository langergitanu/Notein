package oO0OOO;

import Oooo0oO.C21111o0ooOoO;
import OoooooO.C21445Oooo;
import androidx.appcompat.widget.C21532OooOOo;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.OooOOO0;
import o0000OOo.C24217OooO0O0;
import oO0o0O0o.C33595OooOOo;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.OooOo;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final String f118813OooO00o = OooOo.o000oOoO(C34429OooOOo0.OooOO0o('k', 'o', 't', 'l', 'i', 'n'), "", null, null, null, 62);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final LinkedHashMap f118814OooO0O0;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List listOooOO0o = C34429OooOOo0.OooOO0o("Boolean", "Z", "Char", "C", "Byte", "B", "Short", "S", "Int", "I", "Float", "F", "Long", "J", "Double", "D");
        int iOooO0oo = C24217OooO0O0.OooO0oo(0, listOooOO0o.size() - 1, 2);
        if (iOooO0oo >= 0) {
            int i = 0;
            while (true) {
                StringBuilder sb = new StringBuilder();
                String str = f118813OooO00o;
                sb.append(str);
                sb.append(IOUtils.DIR_SEPARATOR_UNIX);
                sb.append((String) listOooOO0o.get(i));
                int i2 = i + 1;
                linkedHashMap.put(sb.toString(), listOooOO0o.get(i2));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(IOUtils.DIR_SEPARATOR_UNIX);
                linkedHashMap.put(androidx.concurrent.futures.OooO00o.OooO0OO(sb2, (String) listOooOO0o.get(i), "Array"), "[" + ((String) listOooOO0o.get(i2)));
                if (i == iOooO0oo) {
                    break;
                } else {
                    i += 2;
                }
            }
        }
        linkedHashMap.put(f118813OooO00o + "/Unit", "V");
        OooO00o(linkedHashMap, "Any", "java/lang/Object");
        OooO00o(linkedHashMap, "Nothing", "java/lang/Void");
        OooO00o(linkedHashMap, "Annotation", "java/lang/annotation/Annotation");
        for (String str2 : C34429OooOOo0.OooOO0o("String", "CharSequence", "Throwable", "Cloneable", "Number", "Comparable", "Enum")) {
            OooO00o(linkedHashMap, str2, "java/lang/" + str2);
        }
        for (String str3 : C34429OooOOo0.OooOO0o("Iterator", "Collection", "List", "Set", "Map", "ListIterator")) {
            OooO00o(linkedHashMap, com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("collections/", str3), "java/util/" + str3);
            OooO00o(linkedHashMap, "collections/Mutable" + str3, "java/util/" + str3);
        }
        OooO00o(linkedHashMap, "collections/Iterable", "java/lang/Iterable");
        OooO00o(linkedHashMap, "collections/MutableIterable", "java/lang/Iterable");
        OooO00o(linkedHashMap, "collections/Map.Entry", "java/util/Map$Entry");
        OooO00o(linkedHashMap, "collections/MutableMap.MutableEntry", "java/util/Map$Entry");
        for (int i3 = 0; i3 < 23; i3++) {
            String strOooO0OO = C21532OooOOo.OooO0OO(i3, "Function");
            StringBuilder sb3 = new StringBuilder();
            String str4 = f118813OooO00o;
            sb3.append(str4);
            sb3.append("/jvm/functions/Function");
            sb3.append(i3);
            OooO00o(linkedHashMap, strOooO0OO, sb3.toString());
            OooO00o(linkedHashMap, "reflect/KFunction" + i3, str4 + "/reflect/KFunction");
        }
        for (String str5 : C34429OooOOo0.OooOO0o("Char", "Byte", "Short", "Int", "Float", "Long", "Double", "String", "Enum")) {
            OooO00o(linkedHashMap, C21111o0ooOoO.OooO0Oo(str5, ".Companion"), C21445Oooo.OooO0O0(new StringBuilder(), f118813OooO00o, "/jvm/internal/", str5, "CompanionObject"));
        }
        f118814OooO0O0 = linkedHashMap;
    }

    public static final void OooO00o(LinkedHashMap linkedHashMap, String str, String str2) {
        linkedHashMap.put(f118813OooO00o + IOUtils.DIR_SEPARATOR_UNIX + str, "L" + str2 + ';');
    }

    public static final String OooO0O0(String classId) {
        OooOOO0.OooO0oO(classId, "classId");
        String str = (String) f118814OooO0O0.get(classId);
        if (str != null) {
            return str;
        }
        return "L" + C33595OooOOo.OooOo0(classId, FilenameUtils.EXTENSION_SEPARATOR, '$') + ';';
    }
}
