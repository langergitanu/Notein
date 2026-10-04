package OoooO0O;

import com.aspose.slides.C22218Oooo;
import com.huawei.hms.network.embedded.C18241k5;
import com.microsoft.identity.client.internal.MsalUtils;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import oO00O0o0.C32197OooOoOO;
import oO00O0o0.C32200OooOooO;
import oO00O0o0.C32204Oooo00o;
import oO00O0o0.C32205Oooo0O0;
import oO00ooO.C32443OooOOO;
import oO0O0OO.InterfaceC32627Oooo0oo;
import oO0o.InterfaceC33531OooO0o0;
import oO0o0O0o.C33595OooOOo;
import oO0o0O0o.C33599OooOo0O;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34431OooOo0;
import oOo000Oo.C34434OooOoO;
import ooOOoOO0.AbstractC35114OooO00o;
import ooOOoOO0.C35124OooOOOo;
import ooOOoOO0.C35125OooOOo;

/* JADX INFO: loaded from: classes.dex */
public final class OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f61402OooO00o = 0;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final /* synthetic */ int f61403OooO0O0 = 0;

    public static final Object[] OooO(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 1];
        Oooo.OooO0OO.OooOO0(objArr, 0, objArr2, i, 6);
        Oooo.OooO0OO.OooO0oo(objArr, i, objArr2, i + 1, objArr.length);
        return objArr2;
    }

    public static final C35124OooOOOo OooO00o(Number number, String key, String output) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(key, "key");
        kotlin.jvm.internal.OooOOO0.OooO0oO(output, "output");
        return OooO0Oo(-1, "Unexpected special floating-point value " + number + " with key " + key + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) OooOOOO(-1, output)));
    }

    public static final C35125OooOOo OooO0O0(String output, Number number) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(output, "output");
        return new C35125OooOOo("Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) OooOOOO(-1, output)));
    }

    public static final C35125OooOOo OooO0OO(InterfaceC33531OooO0o0 interfaceC33531OooO0o0) {
        return new C35125OooOOo("Value of type '" + interfaceC33531OooO0o0.OooO0oo() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + interfaceC33531OooO0o0.getKind() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    public static final C35124OooOOOo OooO0Oo(int i, String message) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(message, "message");
        if (i >= 0) {
            message = androidx.core.app.OooO.OooO00o(i, "Unexpected JSON token at offset ", ": ", message);
        }
        kotlin.jvm.internal.OooOOO0.OooO0oO(message, "message");
        return new C35124OooOOOo(message);
    }

    public static final void OooO0o(C32200OooOooO c32200OooOooO, StringBuilder sb) {
        List listOooO0oO;
        sb.append(c32200OooOooO.f115571OooO00o.f115583OooO00o);
        String str = c32200OooOooO.f115571OooO00o.f115583OooO00o;
        if (str.equals("file")) {
            CharSequence charSequence = c32200OooOooO.f115572OooO0O0;
            String strOooOO0O = OooOO0O(c32200OooOooO);
            sb.append("://");
            sb.append(charSequence);
            if (!C33599OooOo0O.OoooOOo(strOooOO0O, IOUtils.DIR_SEPARATOR_UNIX)) {
                sb.append(IOUtils.DIR_SEPARATOR_UNIX);
            }
            sb.append((CharSequence) strOooOO0O);
            return;
        }
        if (str.equals("mailto")) {
            StringBuilder sb2 = new StringBuilder();
            String str2 = c32200OooOooO.f115576OooO0o0;
            String str3 = c32200OooOooO.f115575OooO0o;
            if (str2 != null) {
                sb2.append(str2);
                if (str3 != null) {
                    sb2.append(':');
                    sb2.append(str3);
                }
                sb2.append("@");
            }
            CharSequence string = sb2.toString();
            kotlin.jvm.internal.OooOOO0.OooO0o(string, "StringBuilder().apply(builderAction).toString()");
            CharSequence charSequence2 = c32200OooOooO.f115572OooO0O0;
            sb.append(C18241k5.f55433h);
            sb.append(string);
            sb.append(charSequence2);
            return;
        }
        sb.append("://");
        sb.append(OooOO0(c32200OooOooO));
        String encodedPath = OooOO0O(c32200OooOooO);
        C32197OooOoOO encodedQueryParameters = c32200OooOooO.f115570OooO;
        boolean z = c32200OooOooO.f115574OooO0Oo;
        kotlin.jvm.internal.OooOOO0.OooO0oO(encodedPath, "encodedPath");
        kotlin.jvm.internal.OooOOO0.OooO0oO(encodedQueryParameters, "encodedQueryParameters");
        if (!C33599OooOo0O.Oooo0o0(encodedPath) && !C33595OooOOo.OooOoO0(encodedPath, "/", false)) {
            sb.append(IOUtils.DIR_SEPARATOR_UNIX);
        }
        sb.append((CharSequence) encodedPath);
        if (!encodedQueryParameters.f123698OooO00o.isEmpty() || z) {
            sb.append(MsalUtils.QUERY_STRING_SYMBOL);
        }
        Set<Map.Entry<String, List<String>>> setEntries = encodedQueryParameters.entries();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = setEntries.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str4 = (String) entry.getKey();
            List list = (List) entry.getValue();
            if (list.isEmpty()) {
                listOooO0oO = com.facebook.soloader.OooOo.OooO0oO(new C32443OooOOO(str4, null));
            } else {
                List list2 = list;
                ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new C32443OooOOO(str4, (String) it2.next()));
                }
                listOooO0oO = arrayList2;
            }
            C34431OooOo0.OooOo0o(arrayList, listOooO0oO);
        }
        oOo000Oo.OooOo.OoooOO0(arrayList, sb, "&", null, null, C32205Oooo0O0.f115587OooOo0o, 60);
        if (c32200OooOooO.f115577OooO0oO.length() > 0) {
            sb.append('#');
            sb.append(c32200OooOooO.f115577OooO0oO);
        }
    }

    public static final C35124OooOOOo OooO0o0(CharSequence input, int i, String message) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(message, "message");
        kotlin.jvm.internal.OooOOO0.OooO0oO(input, "input");
        return OooO0Oo(i, message + "\nJSON input: " + ((Object) OooOOOO(i, input)));
    }

    public static final Object[] OooO0oO(int i, Object obj, Object obj2, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length + 2];
        Oooo.OooO0OO.OooOO0(objArr, 0, objArr2, i, 6);
        Oooo.OooO0OO.OooO0oo(objArr, i + 2, objArr2, i, objArr.length);
        objArr2[i] = obj;
        objArr2[i + 1] = obj2;
        return objArr2;
    }

    public static final Object[] OooO0oo(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 2];
        Oooo.OooO0OO.OooOO0(objArr, 0, objArr2, i, 6);
        Oooo.OooO0OO.OooO0oo(objArr, i, objArr2, i + 2, objArr.length);
        return objArr2;
    }

    public static final String OooOO0(C32200OooOooO c32200OooOooO) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(c32200OooOooO, "<this>");
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        String str = c32200OooOooO.f115576OooO0o0;
        String str2 = c32200OooOooO.f115575OooO0o;
        if (str != null) {
            sb2.append(str);
            if (str2 != null) {
                sb2.append(':');
                sb2.append(str2);
            }
            sb2.append("@");
        }
        String string = sb2.toString();
        kotlin.jvm.internal.OooOOO0.OooO0o(string, "StringBuilder().apply(builderAction).toString()");
        sb.append(string);
        sb.append(c32200OooOooO.f115572OooO0O0);
        int i = c32200OooOooO.f115573OooO0OO;
        if (i != 0 && i != c32200OooOooO.f115571OooO00o.f115584OooO0O0) {
            sb.append(C18241k5.f55433h);
            sb.append(String.valueOf(c32200OooOooO.f115573OooO0OO));
        }
        String string2 = sb.toString();
        kotlin.jvm.internal.OooOOO0.OooO0o(string2, "StringBuilder().apply(builderAction).toString()");
        return string2;
    }

    public static final String OooOO0O(C32200OooOooO c32200OooOooO) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(c32200OooOooO, "<this>");
        List<String> list = c32200OooOooO.f115578OooO0oo;
        return list.isEmpty() ? "" : list.size() == 1 ? ((CharSequence) oOo000Oo.OooOo.Oooo0oO(list)).length() == 0 ? "/" : (String) oOo000Oo.OooOo.Oooo0oO(list) : oOo000Oo.OooOo.o000oOoO(list, "/", null, null, null, 62);
    }

    public static final int OooOO0o(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static final boolean OooOOO(InterfaceC32627Oooo0oo interfaceC32627Oooo0oo) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(interfaceC32627Oooo0oo, "<this>");
        return interfaceC32627Oooo0oo.getGetter() == null;
    }

    public static final void OooOOO0(AbstractC35114OooO00o abstractC35114OooO00o, String str) {
        abstractC35114OooO00o.OooOOo0(abstractC35114OooO00o.f126099OooO00o - 1, "Trailing comma before the end of JSON ".concat(str), "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingCommas = true' in 'Json {}' builder to support them.");
        throw null;
    }

    public static final CharSequence OooOOOO(int i, CharSequence charSequence) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(charSequence, "<this>");
        if (charSequence.length() >= 200) {
            if (i != -1) {
                int i2 = i - 30;
                int i3 = i + 30;
                String str = i2 <= 0 ? "" : ".....";
                String str2 = i3 >= charSequence.length() ? "" : ".....";
                StringBuilder sbOooO0OO = C22218Oooo.OooO0OO(str);
                if (i2 < 0) {
                    i2 = 0;
                }
                int length = charSequence.length();
                if (i3 > length) {
                    i3 = length;
                }
                sbOooO0OO.append(charSequence.subSequence(i2, i3).toString());
                sbOooO0OO.append(str2);
                return sbOooO0OO.toString();
            }
            int length2 = charSequence.length() - 60;
            if (length2 > 0) {
                return "....." + charSequence.subSequence(length2, charSequence.length()).toString();
            }
        }
        return charSequence;
    }

    public static final void OooOOOo(C32200OooOooO c32200OooOooO, String value) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(c32200OooOooO, "<this>");
        kotlin.jvm.internal.OooOOO0.OooO0oO(value, "value");
        List<String> listO0ooOoO = C33599OooOo0O.Oooo0o0(value) ? C34434OooOoO.f123453OooOo0o : value.equals("/") ? C32204Oooo00o.f115586OooO00o : oOo000Oo.OooOo.o0ooOoO(C33599OooOo0O.o000oOoO(value, new char[]{IOUtils.DIR_SEPARATOR_UNIX}));
        kotlin.jvm.internal.OooOOO0.OooO0oO(listO0ooOoO, "<set-?>");
        c32200OooOooO.f115578OooO0oo = listO0ooOoO;
    }

    public static final void OooOOo0(AbstractC35114OooO00o abstractC35114OooO00o, Number number) {
        AbstractC35114OooO00o.OooOOo(abstractC35114OooO00o, "Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
        throw null;
    }
}
