package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import com.aspose.slides.C22226Oooo0oo;
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

/* JADX INFO: loaded from: classes7.dex */
final class zbvo {
    private static final char[] zba;

    static {
        char[] cArr = new char[80];
        zba = cArr;
        Arrays.fill(cArr, ControlChar.SPACE_CHAR);
    }

    public static String zba(zbvm zbvmVar, String str) {
        StringBuilder sbOooO0OO = C22226Oooo0oo.OooO0OO("# ", str);
        zbd(zbvmVar, sbOooO0OO, 0);
        return sbOooO0OO.toString();
    }

    public static void zbb(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                zbb(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                zbb(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        zbc(i, sb);
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
            sb.append(zbwj.zba(new zbtb(((String) obj).getBytes(zbuo.zba))));
            sb.append('\"');
            return;
        }
        if (obj instanceof zbtc) {
            sb.append(": \"");
            sb.append(zbwj.zba((zbtc) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof zbuf) {
            sb.append(" {");
            zbd((zbuf) obj, sb, i + 2);
            sb.append(IOUtils.LINE_SEPARATOR_UNIX);
            zbc(i, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        int i3 = i + 2;
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        zbb(sb, i3, "key", entry.getKey());
        zbb(sb, i3, "value", entry.getValue());
        sb.append(IOUtils.LINE_SEPARATOR_UNIX);
        zbc(i, sb);
        sb.append("}");
    }

    private static void zbc(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(zba, 0, i2);
            i -= i2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void zbd(zbvm zbvmVar, StringBuilder sb, int i) {
        int i2;
        boolean zEquals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zbvmVar.getClass().getDeclaredMethods();
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
                zbb(sb, i, strSubstring.substring(0, strSubstring.length() - 4), zbuf.zbz(method2, zbvmVar, new Object[0]));
            } else if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                zbb(sb, i, strSubstring.substring(0, strSubstring.length() - 3), zbuf.zbz(method, zbvmVar, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring)) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(strSubstring.substring(0, strSubstring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) map.get("has".concat(strSubstring));
                if (method4 != null) {
                    Object objZbz = zbuf.zbz(method4, zbvmVar, new Object[0]);
                    if (method5 == null) {
                        if (objZbz instanceof Boolean) {
                            if (((Boolean) objZbz).booleanValue()) {
                                zbb(sb, i, strSubstring, objZbz);
                            }
                        } else if (objZbz instanceof Integer) {
                            if (((Integer) objZbz).intValue() != 0) {
                            }
                        } else if (objZbz instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) objZbz).floatValue()) != 0) {
                            }
                        } else if (!(objZbz instanceof Double)) {
                            if (objZbz instanceof String) {
                                zEquals = objZbz.equals("");
                            } else if (objZbz instanceof zbtc) {
                                zEquals = objZbz.equals(zbtc.zbb);
                            } else if (objZbz instanceof zbvm) {
                                if (objZbz != ((zbvm) objZbz).zbm()) {
                                }
                            } else if (!(objZbz instanceof Enum) || ((Enum) objZbz).ordinal() != 0) {
                            }
                            if (!zEquals) {
                            }
                        } else if (Double.doubleToRawLongBits(((Double) objZbz).doubleValue()) != 0) {
                        }
                    } else if (((Boolean) zbuf.zbz(method5, zbvmVar, new Object[0])).booleanValue()) {
                    }
                }
            }
            i2 = 3;
        }
        if (zbvmVar instanceof zbub) {
            Iterator itZbg = ((zbub) zbvmVar).zbb.zbg();
            while (itZbg.hasNext()) {
                Map.Entry entry2 = (Map.Entry) itZbg.next();
                zbb(sb, i, "[32149011]", entry2.getValue());
            }
        }
        zbwm zbwmVar = ((zbuf) zbvmVar).zbc;
        if (zbwmVar != null) {
            zbwmVar.zbi(sb, i);
        }
    }
}
