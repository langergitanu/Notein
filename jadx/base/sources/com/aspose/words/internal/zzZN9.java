package com.aspose.words.internal;

import com.aspose.words.StyleIdentifier;
import com.aspose.words.internal.zzZLB;
import com.huawei.hms.network.embedded.C18115b5;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import java.math.BigDecimal;
import java.net.URI;
import java.text.DecimalFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZN9 {
    private static final Map<String, Class> zzZVn = new HashMap<String, Class>() { // from class: com.aspose.words.internal.zzZN9.1
        {
            put("System.Type", Class.class);
            put("System.Boolean", Boolean.class);
            put("System.Byte", Byte.class);
            put("System.SByte", Byte.class);
            put("System.Char", Character.class);
            put("System.Decimal", BigDecimal.class);
            put("System.Double", Double.class);
            put("System.Single", Float.class);
            put("System.Int32", Integer.class);
            put("System.UInt32", Integer.class);
            put("System.Int64", Long.class);
            put("System.UInt64", Long.class);
            put("System.Object", Object.class);
            put("System.Int16", Short.class);
            put("System.UInt16", Short.class);
            put("System.String", String.class);
            put("System.Int8", Byte.class);
            put("System.UInt8", Byte.class);
            put("System.TimeSpan", Date.class);
            put("System.DateTime", Date.class);
            put("System.Uri", URI.class);
            put("System.Guid", UUID.class);
            put("System.Numerics.BigInteger", BigDecimal.class);
        }
    };
    private static final ThreadLocal<DecimalFormat> zzZVm = new ThreadLocal<DecimalFormat>() { // from class: com.aspose.words.internal.zzZN9.2
        private static DecimalFormat zzhe() {
            DecimalFormat decimalFormatZzT = zzZHS.zzT(zzZP1.zzj8().getLocale());
            decimalFormatZzT.applyPattern("0.##################");
            return decimalFormatZzT;
        }

        @Override // java.lang.ThreadLocal
        public final /* synthetic */ DecimalFormat initialValue() {
            return zzhe();
        }
    };

    private static String zzI(String str, boolean z) {
        int i;
        if (zzZKN.zzU3(str)) {
            return str;
        }
        int length = str.length();
        int iIndexOf = str.indexOf(95);
        StringBuilder sb = null;
        Iterator<zzZNT> it = iIndexOf >= 0 ? new zzZNR("(?<=_)[Xx]([0-9a-fA-F]{4}|[0-9a-fA-F]{8})_").zzs(str, iIndexOf).iterator() : null;
        int index = (it == null || !it.hasNext()) ? -1 : it.next().getIndex() - 1;
        int i2 = 0;
        if ((zzZL6.zzZN(str.charAt(0)) || (!z && (z || str.charAt(0) == ':'))) && index != 0) {
            i = 0;
        } else {
            sb = new StringBuilder(length + 20);
            sb.append("_x");
            if (length > 1 && zzZL6.isHighSurrogate(str.charAt(0)) && zzZL6.isLowSurrogate(str.charAt(1))) {
                sb.append(String.format("%08X", Integer.valueOf(zzZL6.zzZ8(str.charAt(1), str.charAt(0)))));
                i = 2;
                i2 = 1;
            } else {
                sb.append(String.format("%04X", Integer.valueOf(str.charAt(0))));
                i = 1;
            }
            sb.append(C18115b5.CONNECTOR);
            i2++;
            if (index == 0 && it.hasNext()) {
                index = it.next().getIndex() - 1;
            }
        }
        while (i2 < length) {
            if ((z && !zzZL6.zzZL(str.charAt(i2))) || ((!z && !zzZL6.zzZM(str.charAt(i2))) || index == i2)) {
                if (sb == null) {
                    sb = new StringBuilder(length + 20);
                }
                if (index == i2 && it.hasNext()) {
                    index = it.next().getIndex() - 1;
                }
                sb.append((CharSequence) str, i, (i + i2) - i);
                sb.append("_x");
                i = i2 + 1;
                if (length > i && zzZL6.isHighSurrogate(str.charAt(i2)) && zzZL6.isLowSurrogate(str.charAt(i))) {
                    sb.append(String.format("%08X", Integer.valueOf(zzZL6.zzZ8(str.charAt(i), str.charAt(i2)))));
                    i = i2 + 2;
                    i2 = i;
                } else {
                    sb.append(String.format("%04X", Integer.valueOf(str.charAt(i2))));
                }
                sb.append(C18115b5.CONNECTOR);
            }
            i2++;
        }
        if (i == 0) {
            return str;
        }
        if (i < length) {
            sb.append((CharSequence) str, i, (length + i) - i);
        }
        return sb.toString();
    }

    public static String zzR(Integer num) {
        return num.toString();
    }

    public static String zzUC(String str) {
        return zzI(str, false);
    }

    public static String zzUD(String str) {
        return zzI(str, true);
    }

    public static Class zzUE(String str) {
        if (str == null || "".equals(str)) {
            return null;
        }
        int iIndexOf = str.indexOf(",");
        if (iIndexOf > 0) {
            str = str.substring(0, iIndexOf);
        }
        Class cls = zzZVn.get(str);
        return cls != null ? cls : String.class;
    }

    private static Character zzUF(String str) {
        return Character.valueOf(str.charAt(0));
    }

    private static zzZNF zzUG(String str) {
        boolean z;
        char c;
        String strTrim = str.trim();
        if (strTrim.length() == 0) {
            throw new IllegalArgumentException("Invalid format string for duration schema datatype.");
        }
        char c2 = 0;
        int i = strTrim.charAt(0) == '-' ? 1 : 0;
        boolean z2 = i == 1;
        if (strTrim.charAt(i) != 'P') {
            throw new IllegalArgumentException("Invalid format string for duration schema datatype.");
        }
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        boolean z3 = false;
        int i5 = i + 1;
        long j = 0;
        int i6 = 0;
        int i7 = 0;
        boolean z4 = false;
        while (true) {
            if (i5 >= strTrim.length()) {
                z = z2;
                break;
            }
            int i8 = i6;
            if (strTrim.charAt(i5) != 'T') {
                int i9 = i5;
                while (i9 < strTrim.length() && strTrim.charAt(i9) >= '0' && '9' >= strTrim.charAt(i9)) {
                    i9++;
                }
                int i10 = c2 == 7 ? i9 - i5 : i8;
                int i11 = Integer.parseInt(strTrim.substring(i5, (i5 + i9) - i5));
                if (c2 == 7) {
                    while (i10 > 7) {
                        i11 /= 10;
                        i10--;
                    }
                    for (int i12 = 7; i10 < i12; i12 = 7) {
                        i11 *= 10;
                        i10++;
                    }
                }
                char cCharAt = strTrim.charAt(i9);
                String str2 = strTrim;
                if (cCharAt != '.') {
                    z = z2;
                    if (cCharAt == 'D') {
                        i7 += i11;
                        if (c2 <= 2) {
                            c = 3;
                            c2 = c;
                        }
                        z3 = true;
                    } else if (cCharAt != 'H') {
                        if (cCharAt != 'M') {
                            if (cCharAt == 'S') {
                                if (c2 == 7) {
                                    j = i11;
                                } else {
                                    i4 = i11;
                                }
                                if (z4 && c2 <= 7) {
                                    c = '\b';
                                    c2 = c;
                                }
                            } else if (cCharAt == 'Y') {
                                i7 += i11 * StyleIdentifier.LIST_TABLE_2_ACCENT_6;
                                if (c2 <= 0) {
                                    c2 = 1;
                                }
                            }
                            z3 = true;
                        } else if (c2 < 2) {
                            i7 = ((i11 % 12) * 30) + ((i11 / 12) * StyleIdentifier.LIST_TABLE_2_ACCENT_6) + i7;
                            c2 = 2;
                        } else if (!z4 || c2 >= 6) {
                            z3 = true;
                        } else {
                            c2 = 6;
                            i3 = i11;
                        }
                    } else if (!z4 || c2 > 4) {
                        i2 = i11;
                        z3 = true;
                    } else {
                        c2 = 5;
                        i2 = i11;
                    }
                } else {
                    z = z2;
                    if (c2 > 7) {
                        z3 = true;
                    }
                    i4 = i11;
                    c2 = 7;
                }
                if (z3) {
                    break;
                }
                i5 = i9 + 1;
                i6 = i10;
                strTrim = str2;
                z2 = z;
            } else {
                i5++;
                i6 = i8;
                c2 = 4;
                z4 = true;
            }
        }
        if (z3) {
            throw new IllegalStateException("Invalid format string for duration schema datatype.");
        }
        zzZNF zzznf = new zzZNF(i7, i2, i3, i4);
        return z ? zzZNF.zzYw(-(zzznf.zzkP() + j)) : zzZNF.zzYw(zzznf.zzkP() + j);
    }

    private static zzZOZ zzUH(String str) {
        return new zzZOZ(str);
    }

    public static boolean zzUI(String str) {
        String lowerCase = str.trim().toLowerCase();
        if ("1".equals(lowerCase) || TelemetryEventStrings.Value.TRUE.equals(lowerCase)) {
            return true;
        }
        if ("0".equals(lowerCase)) {
            return false;
        }
        TelemetryEventStrings.Value.FALSE.equals(lowerCase);
        return false;
    }

    public static Object zzW(Class cls, String str) {
        if (cls != null && cls != String.class) {
            if (cls == Byte.class || cls == Byte.TYPE) {
                return Byte.valueOf(Byte.parseByte(str));
            }
            if (cls == Short.class || cls == Short.TYPE) {
                return Short.valueOf(Short.parseShort(str));
            }
            if (cls == Integer.class || cls == Integer.TYPE) {
                return Integer.valueOf(Integer.parseInt(str));
            }
            if (cls == Long.class || cls == Long.TYPE) {
                return Long.valueOf(Long.parseLong(str));
            }
            if (cls == Float.class || cls == Float.TYPE) {
                return Float.valueOf(Float.parseFloat(str));
            }
            if (cls == Double.class || cls == Double.TYPE) {
                return Double.valueOf(Double.parseDouble(str));
            }
            if (cls == Character.class || cls == Character.TYPE) {
                return zzUF(str);
            }
            if (cls == zzZQ9.class) {
                return zzZQ9.zzf(str);
            }
            if (cls == Boolean.class || cls == Boolean.TYPE) {
                return Boolean.valueOf(zzUI(str));
            }
            if (cls == zzZNF.class) {
                return zzUG(str);
            }
            if (cls == zzZOZ.class) {
                return zzUH(str);
            }
            if (cls == byte[].class) {
                return zzZQB.zzVT(str);
            }
        }
        return str;
    }

    public static String zzZ(Long l) {
        return l.toString();
    }

    public static String zzZ(Float f) {
        return zzZVm.get().format(f);
    }

    public static String zzZ(Double d) {
        return zzZVm.get().format(d);
    }

    public static String zzZ(Boolean bool) {
        return bool.toString();
    }

    public static String zzW(zzZQ9 zzzq9, int i) {
        if (i == 0) {
            zzzq9 = zzZQ9.zzZ(zzzq9, 2L);
        } else if (i == 1) {
            zzzq9 = zzZQ9.zzZ(zzzq9, 1L);
        } else if (i == 2) {
            zzzq9 = new zzZQ9(zzzq9.zzkP(), 0L);
        } else if (i != 3) {
            throw new IllegalArgumentException("Unexpected DateTimeKind value.");
        }
        return new zzZLB(zzzq9, zzZLB.zzY.DateTime).toString();
    }
}
