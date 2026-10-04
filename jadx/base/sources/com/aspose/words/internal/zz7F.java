package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz7F {
    public static double zzQ(Object obj, int i) {
        if (i == 4) {
            return ((Character) obj).charValue();
        }
        if (i == 9) {
            return ((Integer) obj).doubleValue();
        }
        if (i == 11) {
            return ((Long) obj).doubleValue();
        }
        if (i == 6) {
            return ((Byte) obj).doubleValue();
        }
        if (i == 7) {
            return ((Short) obj).doubleValue();
        }
        if (i == 13) {
            return ((Float) obj).doubleValue();
        }
        if (i == 14) {
            return ((Double) obj).doubleValue();
        }
        throw new IllegalStateException();
    }

    public static float zzR(Object obj, int i) {
        if (i == 4) {
            return ((Character) obj).charValue();
        }
        if (i == 9) {
            return ((Integer) obj).floatValue();
        }
        if (i == 11) {
            return ((Long) obj).floatValue();
        }
        if (i == 6) {
            return ((Byte) obj).floatValue();
        }
        if (i == 7) {
            return ((Short) obj).floatValue();
        }
        if (i == 13) {
            return ((Float) obj).floatValue();
        }
        if (i == 14) {
            return ((Double) obj).floatValue();
        }
        throw new IllegalStateException();
    }

    public static long zzS(Object obj, int i) {
        if (i == 4) {
            return ((Character) obj).charValue();
        }
        if (i == 9) {
            return ((Integer) obj).longValue();
        }
        if (i == 11) {
            return ((Long) obj).longValue();
        }
        if (i == 6) {
            return ((Byte) obj).longValue();
        }
        if (i == 7) {
            return ((Short) obj).longValue();
        }
        if (i == 13) {
            return ((Float) obj).longValue();
        }
        if (i == 14) {
            return ((Double) obj).longValue();
        }
        throw new IllegalStateException();
    }

    public static int zzT(Object obj, int i) {
        if (i == 4) {
            return ((Character) obj).charValue();
        }
        if (i == 9) {
            return ((Integer) obj).intValue();
        }
        if (i == 11) {
            return ((Long) obj).intValue();
        }
        if (i == 6) {
            return ((Byte) obj).intValue();
        }
        if (i == 7) {
            return ((Short) obj).intValue();
        }
        if (i == 13) {
            return ((Float) obj).intValue();
        }
        if (i == 14) {
            return ((Double) obj).intValue();
        }
        throw new IllegalStateException();
    }

    private static short zzU(Object obj, int i) {
        if (i == 4) {
            return (short) ((Character) obj).charValue();
        }
        if (i == 9) {
            return ((Integer) obj).shortValue();
        }
        if (i == 11) {
            return ((Long) obj).shortValue();
        }
        if (i == 6) {
            return ((Byte) obj).shortValue();
        }
        if (i == 7) {
            return ((Short) obj).shortValue();
        }
        if (i == 13) {
            return ((Float) obj).shortValue();
        }
        if (i == 14) {
            return ((Double) obj).shortValue();
        }
        throw new IllegalStateException();
    }

    public static boolean zzUj(int i) {
        if (i == 13 || i == 14) {
            return true;
        }
        return zzUk(i);
    }

    public static boolean zzUk(int i) {
        return i == 4 || i == 9 || i == 11 || i == 6 || i == 7;
    }

    public static boolean zzUl(int i) {
        return i == 4;
    }

    private static byte zzV(Object obj, int i) {
        if (i == 4) {
            return (byte) ((Character) obj).charValue();
        }
        if (i == 9) {
            return ((Integer) obj).byteValue();
        }
        if (i == 11) {
            return ((Long) obj).byteValue();
        }
        if (i == 6) {
            return ((Byte) obj).byteValue();
        }
        if (i == 7) {
            return ((Short) obj).byteValue();
        }
        if (i == 13) {
            return ((Float) obj).byteValue();
        }
        if (i == 14) {
            return ((Double) obj).byteValue();
        }
        throw new IllegalStateException();
    }

    private static char zzW(Object obj, int i) {
        if (i == 4) {
            return ((Character) obj).charValue();
        }
        if (i == 9) {
            return (char) ((Integer) obj).intValue();
        }
        if (i == 11) {
            return (char) ((Long) obj).longValue();
        }
        if (i == 6) {
            return (char) ((Byte) obj).byteValue();
        }
        if (i == 7) {
            return (char) ((Short) obj).shortValue();
        }
        if (i == 13) {
            return (char) ((Float) obj).floatValue();
        }
        if (i == 14) {
            return (char) ((Double) obj).doubleValue();
        }
        throw new IllegalStateException();
    }

    public static Object zzX(Object obj, int i, int i2) {
        if (i2 == 4) {
            return Character.valueOf(zzW(obj, i));
        }
        if (i2 == 9) {
            return Integer.valueOf(zzT(obj, i));
        }
        if (i2 == 11) {
            return Long.valueOf(zzS(obj, i));
        }
        if (i2 == 6) {
            return Byte.valueOf(zzV(obj, i));
        }
        if (i2 == 7) {
            return Short.valueOf(zzU(obj, i));
        }
        if (i2 == 13) {
            return Float.valueOf(zzR(obj, i));
        }
        if (i2 == 14) {
            return Double.valueOf(zzQ(obj, i));
        }
        throw new IllegalStateException();
    }

    public static Object zzY(Object obj, int i, int i2) {
        return i == i2 ? obj : zzX(obj, i, i2);
    }

    public static Class zzYY(int i) {
        if (i == 4) {
            return Character.TYPE;
        }
        if (i == 9) {
            return Integer.TYPE;
        }
        if (i == 11) {
            return Long.TYPE;
        }
        if (i == 6) {
            return Byte.TYPE;
        }
        if (i == 7) {
            return Short.TYPE;
        }
        if (i == 13) {
            return Float.TYPE;
        }
        if (i == 14) {
            return Double.TYPE;
        }
        throw new IllegalArgumentException("Parameter name: typeCode");
    }
}
