package com.google.android.gms.internal.p624firebaseauthapi;

import androidx.core.content.OooO0OO;
import com.aspose.slides.C22226Oooo0oo;
import com.aspose.words.ControlChar;
import com.google.android.gms.internal.p624firebaseauthapi.zzalf;
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

/* JADX INFO: loaded from: classes7.dex */
final class zzamn {
    private static final char[] zza;

    static {
        char[] cArr = new char[80];
        zza = cArr;
        Arrays.fill(cArr, ControlChar.SPACE_CHAR);
    }

    public static String zza(zzamm zzammVar, String str) {
        StringBuilder sbOooO0OO = C22226Oooo0oo.OooO0OO("# ", str);
        zza(zzammVar, sbOooO0OO, 0);
        return sbOooO0OO.toString();
    }

    private static void zza(int i, StringBuilder sb) {
        while (i > 0) {
            char[] cArr = zza;
            int length = i > cArr.length ? cArr.length : i;
            sb.append(cArr, 0, length);
            i -= length;
        }
    }

    public static void zza(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                zza(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                zza(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        zza(i, sb);
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
            sb.append(zzann.zza(zzajv.zza((String) obj)));
            sb.append('\"');
            return;
        }
        if (obj instanceof zzajv) {
            sb.append(": \"");
            sb.append(zzann.zza((zzajv) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof zzalf) {
            sb.append(" {");
            zza((zzalf) obj, sb, i + 2);
            sb.append(IOUtils.LINE_SEPARATOR_UNIX);
            zza(i, sb);
            sb.append("}");
            return;
        }
        if (obj instanceof Map.Entry) {
            sb.append(" {");
            Map.Entry entry = (Map.Entry) obj;
            int i3 = i + 2;
            zza(sb, i3, "key", entry.getKey());
            zza(sb, i3, "value", entry.getValue());
            sb.append(IOUtils.LINE_SEPARATOR_UNIX);
            zza(i, sb);
            sb.append("}");
            return;
        }
        sb.append(": ");
        sb.append(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x017a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void zza(zzamm zzammVar, StringBuilder sb, int i) {
        int i2;
        int i3;
        boolean zBooleanValue;
        boolean zEquals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zzammVar.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i4 = 0;
        while (true) {
            i2 = 3;
            if (i4 >= length) {
                break;
            }
            Method method3 = declaredMethods[i4];
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
            i4++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strSubstring = ((String) entry.getKey()).substring(i2);
            if (strSubstring.endsWith("List") && !strSubstring.endsWith("OrBuilderList") && !strSubstring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                zza(sb, i, OooO0OO.OooO00o(4, 0, strSubstring), zzalf.zza(method2, zzammVar, new Object[0]));
                i2 = 3;
            } else {
                if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                    i3 = 3;
                    zza(sb, i, OooO0OO.OooO00o(3, 0, strSubstring), zzalf.zza(method, zzammVar, new Object[0]));
                } else {
                    i3 = 3;
                    if (hashSet.contains("set".concat(strSubstring))) {
                        if (strSubstring.endsWith("Bytes")) {
                            if (!treeMap.containsKey("get" + OooO0OO.OooO00o(5, 0, strSubstring))) {
                                Method method4 = (Method) entry.getValue();
                                Method method5 = (Method) map.get("has".concat(strSubstring));
                                if (method4 != null) {
                                    Object objZza = zzalf.zza(method4, zzammVar, new Object[0]);
                                    if (method5 == null) {
                                        zBooleanValue = true;
                                        if (objZza instanceof Boolean) {
                                            zEquals = !((Boolean) objZza).booleanValue();
                                        } else if (objZza instanceof Integer) {
                                            if (((Integer) objZza).intValue() == 0) {
                                            }
                                        } else if (objZza instanceof Float) {
                                            if (Float.floatToRawIntBits(((Float) objZza).floatValue()) == 0) {
                                            }
                                        } else if (objZza instanceof Double) {
                                            if (Double.doubleToRawLongBits(((Double) objZza).doubleValue()) == 0) {
                                            }
                                        } else if (objZza instanceof String) {
                                            zEquals = objZza.equals("");
                                        } else if (objZza instanceof zzajv) {
                                            zEquals = objZza.equals(zzajv.zza);
                                        } else if (!(objZza instanceof zzamm) ? !(objZza instanceof Enum) || ((Enum) objZza).ordinal() != 0 : objZza != ((zzamm) objZza).zzs()) {
                                        }
                                        if (zEquals) {
                                            zBooleanValue = false;
                                        }
                                    } else {
                                        zBooleanValue = ((Boolean) zzalf.zza(method5, zzammVar, new Object[0])).booleanValue();
                                    }
                                    if (zBooleanValue) {
                                        zza(sb, i, strSubstring, objZza);
                                    }
                                }
                            }
                        }
                    }
                }
                i2 = i3;
            }
        }
        if (zzammVar instanceof zzalf.zzd) {
            Iterator<Map.Entry<T, Object>> itZzd = ((zzalf.zzd) zzammVar).zzc.zzd();
            if (itZzd.hasNext()) {
                throw new NoSuchMethodError();
            }
        }
        zzanx zzanxVar = ((zzalf) zzammVar).zzb;
        if (zzanxVar != null) {
            zzanxVar.zza(sb, i);
        }
    }
}
