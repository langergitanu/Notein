package com.aspose.words.internal;

import OooOo.C20485OooOoO;
import Oooo0oO.o0Oo0oo;
import com.aspose.words.net.System.Data.DBNull;
import com.aspose.words.net.System.OverflowException;
import java.math.BigInteger;
import java.util.Date;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZQB {
    public static boolean zz1(Object obj) {
        return obj == null || (obj instanceof DBNull);
    }

    public static int zz2(Object obj) {
        if (obj == null) {
            return 0;
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if ((obj instanceof Byte) || (obj instanceof Short)) {
            return ((Number) obj).intValue();
        }
        if (obj instanceof Long) {
            Long l = (Long) obj;
            if (l.longValue() > 2147483647L || l.longValue() < -2147483648L) {
                throw new OverflowException(C20485OooOoO.OooO0O0("Overflow in long to int conversion. long value: ", obj, "."));
            }
            return l.intValue();
        }
        if (obj instanceof Float) {
            Float f = (Float) obj;
            if (f.floatValue() > 2.1474836E9f || f.floatValue() < -2.1474836E9f) {
                throw new OverflowException(C20485OooOoO.OooO0O0("Overflow in Float to int conversion. Float value: ", obj, "."));
            }
            return f.intValue();
        }
        if (obj instanceof Double) {
            Double d = (Double) obj;
            if (d.doubleValue() > 2.147483647E9d || d.doubleValue() < -2.147483648E9d) {
                throw new OverflowException(C20485OooOoO.OooO0O0("Overflow in Double to int conversion. Double value: ", obj, "."));
            }
            return d.intValue();
        }
        if (obj instanceof BigInteger) {
            BigInteger bigInteger = (BigInteger) obj;
            if (bigInteger.compareTo(BigInteger.valueOf(2147483647L)) == 1 || bigInteger.compareTo(BigInteger.valueOf(-2147483648L)) == -1) {
                throw new ClassCastException(C20485OooOoO.OooO0O0("Overflow in BigInteger to int conversion. BigInteger value: ", obj, "."));
            }
            return bigInteger.intValue();
        }
        if (obj instanceof String) {
            return Integer.parseInt(((String) obj).trim());
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue() ? 1 : 0;
        }
        if (obj instanceof Character) {
            Character.getNumericValue(((Character) obj).charValue());
        } else if (obj instanceof Enum) {
            return ((Enum) obj).ordinal();
        }
        throw new OverflowException("Can't convert to Integer value of type '" + obj.getClass().getName() + "'.");
    }

    public static double zz3(Object obj) {
        if (obj == null) {
            return 0.0d;
        }
        if (obj instanceof Byte) {
            return ((Byte) obj).byteValue();
        }
        if (obj instanceof Short) {
            return ((Short) obj).shortValue();
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (obj instanceof Long) {
            return ((Long) obj).longValue();
        }
        if (obj instanceof Float) {
            return ((Float) obj).floatValue();
        }
        if (obj instanceof Double) {
            return ((Double) obj).doubleValue();
        }
        if (obj instanceof String) {
            return Double.parseDouble((String) obj);
        }
        throw new ClassCastException("Cannot convert a value to double.");
    }

    public static zzZQ9 zz4(Object obj) {
        if (obj == null) {
            return zzZQ9.zz35;
        }
        if (obj instanceof zzZQ9) {
            return (zzZQ9) obj;
        }
        if (obj instanceof Date) {
            return zzZQ9.zzZ((Date) obj);
        }
        if (obj instanceof String) {
            try {
                return zzZQ9.zzVS(obj.toString());
            } catch (Throwable th) {
                zzZHV.zzZ(th);
            }
        }
        throw new UnsupportedOperationException(obj + " class=" + obj.getClass());
    }

    public static Long zz5(Object obj) {
        if (obj != null) {
            return Long.valueOf(Long.parseLong(obj.toString()));
        }
        return null;
    }

    public static Boolean zz6(Object obj) {
        return Boolean.valueOf(obj != null && Boolean.parseBoolean(obj.toString()));
    }

    public static char zzRq(int i) {
        if (i < 0 || i > 65535) {
            throw new IllegalArgumentException(o0Oo0oo.OooO0O0(i, "Integer value: ", " can not be converted to 16-bit char!"));
        }
        return (char) i;
    }

    public static boolean zzRr(int i) {
        return i == 1;
    }

    public static short zzRs(int i) {
        if (i < 0 || i > 65535) {
            throw new IllegalArgumentException(o0Oo0oo.OooO0O0(i, "Integer value: ", " can not be converted to 16-bit short!"));
        }
        return (short) i;
    }

    public static short zzRt(int i) {
        if (i < -32768 || i > 32767) {
            throw new IllegalArgumentException(o0Oo0oo.OooO0O0(i, "Integer value: ", " can not be converted to 16-bit short!"));
        }
        return (short) i;
    }

    public static String zzS(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new NullPointerException("inArray");
        }
        if (i < 0 || i > bArr.length) {
            throw new IndexOutOfBoundsException("offset");
        }
        if (i2 < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException("length");
        }
        return zzZHR.zzX(bArr, i, i2, false);
    }

    public static byte[] zzVT(String str) {
        return zzZHR.zzW(str.toCharArray(), str.length());
    }

    public static int zzVU(String str) {
        if (str.startsWith("0x")) {
            str = str.replace("0x", "");
        }
        return Integer.parseInt(str.trim(), 16);
    }

    public static String zzYT(byte[] bArr) {
        if (bArr != null) {
            return zzZHR.zzYI(bArr);
        }
        throw new NullPointerException("inArray");
    }

    public static Long zzZ(Object obj, Integer num) {
        if (obj != null) {
            return Long.valueOf(Long.parseLong(obj.toString(), num.intValue()));
        }
        return null;
    }

    public static int zzZk(double d) {
        if (d >= 0.0d) {
            if (d < 2.1474836475E9d) {
                int i = (int) d;
                double d2 = d - ((double) i);
                return (d2 > 0.5d || (d2 == 0.5d && (i & 1) != 0)) ? i + 1 : i;
            }
        } else if (d >= -2.1474836485E9d) {
            int i2 = (int) d;
            double d3 = d - ((double) i2);
            return (d3 < -0.5d || (d3 == -0.5d && (i2 & 1) != 0)) ? i2 - 1 : i2;
        }
        throw new OverflowException("Overflow_Int32");
    }
}
