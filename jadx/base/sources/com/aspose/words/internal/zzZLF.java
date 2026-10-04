package com.aspose.words.internal;

import androidx.core.content.C21650OooOoO;
import com.huawei.hms.network.embedded.C18241k5;
import com.microsoft.identity.common.internal.providers.oauth2.ResponseType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
final class zzZLF {
    public static boolean zzP(zzZN4 zzzn4) {
        if (zzzn4 == null) {
            return false;
        }
        String name = zzzn4.getName();
        if ("http://www.w3.org/2003/11/xpath-datatypes".equals(zzzn4.getNamespace())) {
            return "anyAtomicType".equals(name) || "untypedAtomic".equals(name) || "dayTimeDuration".equals(name) || "yearMonthDuration".equals(name);
        }
        if ("http://www.w3.org/2001/XMLSchema".equals(zzzn4.getNamespace())) {
            return "anySimpleType".equals(name) || "duration".equals(name) || "dateTime".equals(name) || "time".equals(name) || "date".equals(name) || "gYearMonth".equals(name) || "gYear".equals(name) || "gMonthDay".equals(name) || "gDay".equals(name) || "gMonth".equals(name) || "boolean".equals(name) || "base64Binary".equals(name) || "hexBinary".equals(name) || "float".equals(name) || "double".equals(name) || "anyURI".equals(name) || "QName".equals(name) || "NOTATION".equals(name) || "string".equals(name) || "normalizedString".equals(name) || ResponseType.TOKEN.equals(name) || "language".equals(name) || "Name".equals(name) || "NCName".equals(name) || "ID".equals(name) || "IDREF".equals(name) || "IDREFS".equals(name) || "ENTITY".equals(name) || "ENTITIES".equals(name) || "NMTOKEN".equals(name) || "NMTOKENS".equals(name) || "decimal".equals(name) || "integer".equals(name) || "nonPositiveInteger".equals(name) || "negativeInteger".equals(name) || "nonNegativeInteger".equals(name) || "unsignedLong".equals(name) || "unsignedInt".equals(name) || "unsignedShort".equals(name) || "unsignedByte".equals(name) || "positiveInteger".equals(name) || "long".equals(name) || "int".equals(name) || "short".equals(name) || "byte".equals(name);
        }
        return false;
    }

    private static boolean zzUi(String str) {
        for (String str2 : str.split(C18241k5.f55433h)) {
            if (!zzZNA.zzUJ(str2)) {
                return false;
            }
        }
        return true;
    }

    public static String[] zzUj(String str) {
        if (str == null || "".equals(str)) {
            return new String[0];
        }
        ArrayList arrayList = null;
        int i = 0;
        boolean z = true;
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt == '\t' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == ' ') {
                if (!z) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(str.substring(i, (i + i2) - i));
                }
                z = true;
            } else if (z) {
                z = false;
                i = i2;
            }
        }
        if (!z && i == 0) {
            return new String[]{str};
        }
        if (!z && i < str.length()) {
            if (i != 0) {
                str = str.substring(i);
            }
            arrayList.add(str);
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static boolean zzUk(String str) {
        return !str.startsWith("##");
    }

    public static int zzUl(String str) {
        String upperCase = str.trim().toUpperCase();
        if ("NONE".equals(upperCase)) {
            return 0;
        }
        if ("SKIP".equals(upperCase)) {
            return 1;
        }
        if ("LAX".equals(upperCase)) {
            return 2;
        }
        return "STRICT".equals(upperCase) ? 3 : 0;
    }

    public static int zzUm(String str) {
        String upperCase = str.trim().toUpperCase();
        if ("NONE".equals(upperCase)) {
            return 0;
        }
        if ("OPTIONAL".equals(upperCase)) {
            return 1;
        }
        if ("REQUIRED".equals(upperCase)) {
            return 3;
        }
        return "PROHIBITED".equals(upperCase) ? 2 : 0;
    }

    public static int zzUn(String str) {
        String strTrim = str.toLowerCase().trim();
        if ("none".equals(strTrim)) {
            return 0;
        }
        if ("qualified".equals(strTrim)) {
            return 1;
        }
        return "unqualified".equals(strTrim) ? 2 : 0;
    }

    public static int zzUo(String str) {
        try {
            if (str.indexOf("#all") != -1 && !"#all".equals(str.trim())) {
                return 255;
            }
            String str2 = "";
            int iZzZ9 = 0;
            for (String str3 : zzUj(str)) {
                if ("".equals(str3)) {
                    iZzZ9 = zzZ9(iZzZ9, 0);
                } else if ("#all".equals(str3)) {
                    iZzZ9 = zzZ9(iZzZ9, 255);
                } else if ("substitution".equals(str3)) {
                    iZzZ9 = zzZ9(iZzZ9, 1);
                } else if ("extension".equals(str3)) {
                    iZzZ9 = zzZ9(iZzZ9, 2);
                } else if ("restriction".equals(str3)) {
                    iZzZ9 = zzZ9(iZzZ9, 4);
                } else if ("list".equals(str3)) {
                    iZzZ9 = zzZ9(iZzZ9, 8);
                } else if ("union".equals(str3)) {
                    iZzZ9 = zzZ9(iZzZ9, 16);
                } else {
                    str2 = str2 + str3 + " ";
                }
            }
            return iZzZ9;
        } catch (Exception unused) {
            return 256;
        }
    }

    public static void zzZ(zzZQR zzzqr, zzZLZ zzzlz) {
        for (int i = 0; i < zzzqr.getAttributeCount(); i++) {
            zzzlz.zzZL(zzzqr.zzRu(i), zzzqr.getAttributeValue(i));
        }
    }

    private static int zzZ9(int i, int i2) {
        throw new IllegalArgumentException(C21650OooOoO.OooO00o(i2, " is not allowed in this attribute."));
    }

    public static zzZN4 zzZ(zzZQR zzzqr, int i) {
        String attributeValue = zzzqr.getAttributeValue(i);
        String attributeNamespace = zzzqr.getAttributeNamespace(i);
        String attributePrefix = zzzqr.getAttributePrefix(i);
        int iIndexOf = attributeValue.indexOf(C18241k5.f55433h);
        String strSubstring = iIndexOf >= 0 ? attributeValue.substring(iIndexOf + 1) : attributeValue;
        if ("".equals(attributePrefix) && iIndexOf > 0) {
            attributePrefix = attributeValue.substring(0, iIndexOf);
        }
        if ("".equals(attributeNamespace)) {
            attributeNamespace = zzzqr.getNamespaceURI(attributePrefix);
        }
        return new zzZN4(strSubstring, attributeNamespace);
    }

    public static void zzZ(zzZLX zzzlx, zzZLZ zzzlz, zzZN4 zzzn4) {
        if (zzzlx.zzT(zzzn4)) {
            if (zzzlz.zzg7()) {
                if (zzzlz.zzg6() != null) {
                    System.err.println(zzZKN.format("Named item {0} was already contained in the schema object table.", zzzn4));
                } else {
                    zzzlz.zzX(zzzlx.zzS(zzzn4));
                }
                zzzlx.zzY(zzzn4, zzzlz);
                return;
            }
            if (zzzlx.zzS(zzzn4).zzg7()) {
                if (zzzlx.zzS(zzzn4).zzg6() != null) {
                    System.err.println(zzZKN.format("Named item {0} was already contained in the schema object table.", zzzn4));
                    return;
                } else {
                    zzzlx.zzS(zzzn4).zzX(zzzlz);
                    return;
                }
            }
            return;
        }
        zzzlx.zzY(zzzn4, zzzlz);
    }

    /* JADX WARN: Finally extract failed */
    public static int zzZ(zzZLX zzzlx, zzZN3 zzzn3, zzZLY zzzly, zzZLZ zzzlz, zzZMZ[] zzzmzArr, zzZMW zzzmw, boolean z) throws Exception {
        ArrayList arrayList = new ArrayList();
        int iZzY = 0;
        for (zzZLZ zzzlz2 : zzzly) {
            zzZMV zzzmv = zzzlz2 instanceof zzZMV ? (zzZMV) zzzlz2 : null;
            if (zzzmv != null) {
                zzZMW zzzmwZzW = (zzzmw == null || zzzmv.zzgO() != zzzmw.zzgQ()) ? zzzn3.zzW(zzzmv.zzgO()) : zzzmw;
                if (zzzmwZzW == null) {
                    if (!zzzn3.zzgU()) {
                        StringBuilder sb = new StringBuilder("Referenced attribute group ");
                        sb.append(zzzmv.zzgO());
                        sb.append(" was not found : the corresponding schema.");
                    }
                } else if (zzzmwZzW.zzZUg) {
                    new StringBuilder("Attribute group recursion was found: ").append(zzzmv.zzgO());
                } else {
                    try {
                        zzzmwZzW.zzZUg = true;
                        iZzY += zzzmwZzW.zzY(zzzn3);
                        zzzmwZzW.zzZUg = false;
                        if (zzzmwZzW.zzgH() != null && zzzlz == null) {
                            zzzmzArr[0] = zzzmwZzW.zzgH();
                        }
                        Iterator<zzZLZ> it = zzzmwZzW.zzgG().values().iterator();
                        while (it.hasNext()) {
                            zzZMX zzzmx = (zzZMX) it.next();
                            if (zzzmx.zzgO() != null && zzzmx.zzgO() != zzZN4.zzZV6 && (!z || !zzZ(zzzmx, (zzZMX) zzzlx.zzS(zzzmx.zzgO())))) {
                                zzZ(zzzlx, zzzmx, zzzmx.zzgO());
                            } else if (!z || !zzZ(zzzmx, (zzZMX) zzzlx.zzS(zzzmx.zzgQ()))) {
                                zzZ(zzzlx, zzzmx, zzzmx.zzgQ());
                            }
                        }
                    } catch (Throwable th) {
                        zzzmwZzW.zzZUg = false;
                        throw th;
                    }
                }
            } else {
                zzZMX zzzmx2 = zzzlz2 instanceof zzZMX ? (zzZMX) zzzlz2 : null;
                if (zzzmx2 != null) {
                    iZzY += zzzmx2.zzY(zzzn3);
                    if (arrayList.contains(zzzmx2.zzgQ())) {
                        zzZKN.format("Duplicate attributes was found for '{0}'", zzzmx2.zzgQ());
                    }
                    arrayList.add(zzzmx2.zzgQ());
                    if (zzzmx2.zzgO() != null && zzzmx2.zzgO() != zzZN4.zzZV6 && (!z || !zzZ(zzzmx2, (zzZMX) zzzlx.zzS(zzzmx2.zzgO())))) {
                        zzZ(zzzlx, zzzmx2, zzzmx2.zzgO());
                    } else if (!z || !zzZ(zzzmx2, (zzZMX) zzzlx.zzS(zzzmx2.zzgQ()))) {
                        zzZ(zzzlx, zzzmx2, zzzmx2.zzgQ());
                    }
                } else if (zzzlz != null) {
                    zzzmzArr[0] = (zzZMZ) zzzlz2;
                    zzzlz.zzY(zzzn3);
                }
            }
        }
        return iZzY;
    }

    private static boolean zzZ(zzZMX zzzmx, zzZMX zzzmx2) {
        return zzzmx != null && zzzmx2 != null && zzzmx.zzgL() == zzzmx2.zzgL() && zzzmx.getForm() == zzzmx2.getForm() && zzzmx.zzgJ() == zzzmx2.zzgJ() && zzzmx.zzgI().equals(zzzmx2.zzgI()) && zzzmx.zzZUo.equals(zzzmx2.zzZUo);
    }

    public static Class zzZ(zzZMN zzzmn) {
        if (zzzmn == null) {
            return String.class;
        }
        return zzzmn.zzhu();
    }

    public static zzZN4 zzZ(zzZQR zzzqr, String str) {
        String namespaceURI;
        String str2;
        if (!zzUi(str)) {
            return zzZN4.zzZV6;
        }
        String[] strArrSplit = str.split(C18241k5.f55433h);
        if (strArrSplit.length == 2) {
            namespaceURI = zzzqr.getNamespaceURI(strArrSplit[0]);
            if (namespaceURI == null) {
                return zzZN4.zzZV6;
            }
            str2 = strArrSplit[1];
        } else {
            namespaceURI = zzzqr.getNamespaceURI("");
            str2 = strArrSplit[0];
        }
        return new zzZN4(str2, namespaceURI);
    }

    public static void zzZ(String str, zzZLZ zzzlz, Map<String, zzZLZ> map) {
        if (str == null) {
            return;
        }
        if (!zzZNA.zzUJ(str)) {
            str.concat(" is not a valid id attribute");
        } else if (map.containsKey(str)) {
            "Duplicate id attribute ".concat(str);
        } else {
            map.put(str, zzzlz);
        }
    }
}
