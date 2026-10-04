package androidx.datastore.preferences.protobuf;

import OooooOO.C21355Ooooooo;
import androidx.datastore.preferences.protobuf.OooO;
import androidx.datastore.preferences.protobuf.OooOo;
import com.aspose.words.ControlChar;
import com.huawei.hms.network.embedded.C18115b5;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.OoooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21821OoooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final char[] f64518OooO00o;

    static {
        char[] cArr = new char[80];
        f64518OooO00o = cArr;
        Arrays.fill(cArr, ControlChar.SPACE_CHAR);
    }

    public static void OooO00o(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(f64518OooO00o, 0, i2);
            i -= i2;
        }
    }

    public static void OooO0O0(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                OooO0O0(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                OooO0O0(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        OooO00o(i, sb);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i2 = 1; i2 < str.length(); i2++) {
                char cCharAt = str.charAt(i2);
                if (Character.isUpperCase(cCharAt)) {
                    sb2.append(C18115b5.CONNECTOR);
                }
                sb2.append(Character.toLowerCase(cCharAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            OooO.OooO0o oooO0o = OooO.f64403OooOo;
            sb.append(C21355Ooooooo.OooO0O0(new OooO.OooO0o(((String) obj).getBytes(C21805OooOoO.f64482OooO00o))));
            sb.append('\"');
            return;
        }
        if (obj instanceof OooO) {
            sb.append(": \"");
            sb.append(C21355Ooooooo.OooO0O0((OooO) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof OooOo) {
            sb.append(" {");
            OooO0OO((OooOo) obj, sb, i + 2);
            sb.append(IOUtils.LINE_SEPARATOR_UNIX);
            OooO00o(i, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i3 = i + 2;
        OooO0O0(sb, i3, "key", entry.getKey());
        OooO0O0(sb, i3, "value", entry.getValue());
        sb.append(IOUtils.LINE_SEPARATOR_UNIX);
        OooO00o(i, sb);
        sb.append("}");
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x018f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void OooO0OO(OooOo oooOo, StringBuilder sb, int i) {
        int i2;
        boolean zBooleanValue;
        boolean zEquals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = oooOo.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i3 = 0;
        while (true) {
            i2 = 3;
            if (i3 >= length) {
                break;
            }
            Method method3 = declaredMethods[i3];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        map.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i3++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strSubstring = ((String) entry.getKey()).substring(i2);
            if (strSubstring.endsWith("List") && !strSubstring.endsWith("OrBuilderList") && !strSubstring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                OooO0O0(sb, i, androidx.core.content.OooO0OO.OooO00o(4, 0, strSubstring), OooOo.OooO0oo(method2, oooOo, new Object[0]));
            } else if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                OooO0O0(sb, i, androidx.core.content.OooO0OO.OooO00o(3, 0, strSubstring), OooOo.OooO0oo(method, oooOo, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring))) {
                if (strSubstring.endsWith("Bytes")) {
                    if (!treeMap.containsKey("get" + strSubstring.substring(0, strSubstring.length() - 5))) {
                        Method method4 = (Method) entry.getValue();
                        Method method5 = (Method) map.get("has".concat(strSubstring));
                        if (method4 != null) {
                            Object objOooO0oo = OooOo.OooO0oo(method4, oooOo, new Object[0]);
                            if (method5 == null) {
                                zBooleanValue = true;
                                if (objOooO0oo instanceof Boolean) {
                                    zEquals = !((Boolean) objOooO0oo).booleanValue();
                                } else if (objOooO0oo instanceof Integer) {
                                    zEquals = ((Integer) objOooO0oo).intValue() == 0;
                                } else if (objOooO0oo instanceof Float) {
                                    if (Float.floatToRawIntBits(((Float) objOooO0oo).floatValue()) == 0) {
                                    }
                                } else if (objOooO0oo instanceof Double) {
                                    if (Double.doubleToRawLongBits(((Double) objOooO0oo).doubleValue()) == 0) {
                                    }
                                } else if (objOooO0oo instanceof String) {
                                    zEquals = objOooO0oo.equals("");
                                } else if (objOooO0oo instanceof OooO) {
                                    zEquals = objOooO0oo.equals(OooO.f64403OooOo);
                                } else if (!(objOooO0oo instanceof InterfaceC21822OoooO0) ? !(objOooO0oo instanceof Enum) || ((Enum) objOooO0oo).ordinal() != 0 : objOooO0oo != ((InterfaceC21822OoooO0) objOooO0oo).OooO00o()) {
                                }
                                if (zEquals) {
                                    zBooleanValue = false;
                                }
                            } else {
                                zBooleanValue = ((Boolean) OooOo.OooO0oo(method5, oooOo, new Object[0])).booleanValue();
                            }
                            if (zBooleanValue) {
                                OooO0O0(sb, i, strSubstring, objOooO0oo);
                            }
                        }
                    }
                }
            }
            i2 = 3;
        }
        if (oooOo instanceof OooOo.OooO0OO) {
            Iterator<Map.Entry<T, Object>> itOooO0oO = ((OooOo.OooO0OO) oooOo).extensions.OooO0oO();
            while (itOooO0oO.hasNext()) {
                Map.Entry entry2 = (Map.Entry) itOooO0oO.next();
                ((OooOo.C21800OooO0Oo) entry2.getKey()).getClass();
                OooO0O0(sb, i, "[0]", entry2.getValue());
            }
        }
        o00Ooo o00ooo2 = oooOo.unknownFields;
        if (o00ooo2 != null) {
            for (int i4 = 0; i4 < o00ooo2.f64560OooO00o; i4++) {
                OooO0O0(sb, i, String.valueOf(o00ooo2.f64561OooO0O0[i4] >>> 3), o00ooo2.f64562OooO0OO[i4]);
            }
        }
    }
}
