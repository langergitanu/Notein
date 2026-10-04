package com.aspose.words.internal;

import com.huawei.hms.network.embedded.C18358t1;
import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;

/* JADX INFO: loaded from: classes5.dex */
final class zzKK {
    public static zzZVP zzP(zzKO zzko) {
        if (zzko.getType().isArray()) {
            return zzZVO.zzX(zzko.getType().getComponentType(), zzko.zzv(), null);
        }
        return null;
    }

    public static zzZVP zzV(zzKO zzko, boolean z) {
        return (z && zzko.zznu()) ? new zzZVP(zzko.zzw()) : zzko;
    }

    public static String zzWZ(int i) {
        switch (i) {
            case 0:
                return "+";
            case 1:
                return "&";
            case 2:
                return "&&";
            case 3:
                return "??";
            case 4:
                return "~";
            case 5:
                return "?:";
            case 6:
            case 7:
            case 9:
            case 17:
            case 18:
            case 19:
            case 23:
            case 28:
            default:
                throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: expressionType");
            case 8:
                return "/";
            case 10:
                return "==";
            case 11:
                return "^";
            case 12:
                return ">";
            case 13:
                return ">=";
            case 14:
                return "<<";
            case 15:
                return "<";
            case 16:
                return "<=";
            case 20:
                return "%";
            case 21:
                return C18358t1.g.f56183c;
            case 22:
                return CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR;
            case 24:
                return "!";
            case 25:
                return "!=";
            case 26:
                return "|";
            case 27:
                return "||";
            case 29:
                return ">>";
            case 30:
                return CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR;
        }
    }

    public static String zzX0(int i) {
        switch (i) {
            case 0:
                return "op_Addition";
            case 1:
            case 2:
                return "op_BitwiseAnd";
            case 3:
            case 5:
            case 6:
            case 7:
            case 9:
            case 17:
            case 18:
            case 19:
            case 23:
            case 28:
            default:
                throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: expressionType");
            case 4:
                return "op_OnesComplement";
            case 8:
                return "op_Division";
            case 10:
                return "op_Equality";
            case 11:
                return "op_ExclusiveOr";
            case 12:
                return "op_GreaterThan";
            case 13:
                return "op_GreaterThanOrEqual";
            case 14:
                return "op_LeftShift";
            case 15:
                return "op_LessThan";
            case 16:
                return "op_LessThanOrEqual";
            case 20:
                return "op_Modulus";
            case 21:
                return "op_Multiply";
            case 22:
                return "op_UnaryNegation";
            case 24:
                return "op_LogicalNot";
            case 25:
                return "op_Inequality";
            case 26:
            case 27:
                return "op_BitwiseOr";
            case 29:
                return "op_RightShift";
            case 30:
                return "op_Subtraction";
        }
    }

    private static String zzX1(int i) {
        if (i == 2) {
            return "op_False";
        }
        if (i == 5 || i == 27) {
            return "op_True";
        }
        throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: expressionType");
    }

    public static Object zzZ(zzAD zzad, zzKO zzko, zzKO[] zzkoArr) throws Exception {
        Object objZzx = zzko != null ? zzko.zzx() : null;
        zz6P[] zz6pArrZzAE = zzad.zzAE();
        zzZVP zzzvpZzwU = zzad.zzAI() ? zz6pArrZzAE[zz6pArrZzAE.length - 1].zzwU() : null;
        int length = zzkoArr.length;
        if (length == 0) {
            return zzad.zzr(objZzx);
        }
        if (length == 1) {
            return zzad.zzH(objZzx, zzZ(zz6pArrZzAE, zzzvpZzwU, zzkoArr, 0));
        }
        if (length == 2) {
            return zzad.zzZ(objZzx, zzZ(zz6pArrZzAE, zzzvpZzwU, zzkoArr, 0), zzZ(zz6pArrZzAE, zzzvpZzwU, zzkoArr, 1));
        }
        if (length == 3) {
            return zzad.zzZ(objZzx, zzZ(zz6pArrZzAE, zzzvpZzwU, zzkoArr, 0), zzZ(zz6pArrZzAE, zzzvpZzwU, zzkoArr, 1), zzZ(zz6pArrZzAE, zzzvpZzwU, zzkoArr, 2));
        }
        if (length == 4) {
            return zzad.zzZ(objZzx, zzZ(zz6pArrZzAE, zzzvpZzwU, zzkoArr, 0), zzZ(zz6pArrZzAE, zzzvpZzwU, zzkoArr, 1), zzZ(zz6pArrZzAE, zzzvpZzwU, zzkoArr, 2), zzZ(zz6pArrZzAE, zzzvpZzwU, zzkoArr, 3));
        }
        if (length == 5) {
            return zzad.zzZ(objZzx, zzZ(zz6pArrZzAE, zzzvpZzwU, zzkoArr, 0), zzZ(zz6pArrZzAE, zzzvpZzwU, zzkoArr, 1), zzZ(zz6pArrZzAE, zzzvpZzwU, zzkoArr, 2), zzZ(zz6pArrZzAE, zzzvpZzwU, zzkoArr, 3), zzZ(zz6pArrZzAE, zzzvpZzwU, zzkoArr, 4));
        }
        int length2 = zzkoArr.length;
        Object[] objArr = new Object[length2];
        for (int i = 0; i < length2; i++) {
            objArr[i] = zzZ(zz6pArrZzAE, zzzvpZzwU, zzkoArr, i);
        }
        return zzad.zzZ(objZzx, objArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0007  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Object zzZ(zz6P[] zz6pArr, zzZVP zzzvp, zzKO[] zzkoArr, int i) throws Exception {
        zzZVP zzzvp2;
        if (zzzvp != null) {
            zzzvp2 = zzzvp;
            if (i < zz6pArr.length - 1) {
                zzzvp2 = zz6pArr[i];
            }
        }
        return zzkoArr[i].zzZ(zzzvp2);
    }

    public static Object zzZ(Object obj, zzZVP zzzvp, zzZVP zzzvp2) {
        if (obj == null) {
            if (zzzvp.zznu() && zzzvp2.zznq()) {
                throw new IllegalStateException("Nullable object must have a value.");
            }
            return null;
        }
        if (zzzvp.zzw() == zzzvp2.zzw()) {
            return obj;
        }
        boolean zZznn = zzzvp.zznn();
        if (zZznn && zzzvp2.zzns()) {
            if (!zz7F.zzUk(zzzvp.zznw())) {
                zz7F.zzY(obj, zzzvp.zznw(), zzzvp2.zznw());
            }
            zzzvp2.zzw();
            return zzZZO.zzrN();
        }
        boolean zZznn2 = zzzvp2.zznn();
        if (zzzvp.zzns() && zZznn2) {
            return zz7F.zzX(obj, zzzvp.zznw(), zzzvp2.zznw());
        }
        return (zZznn && zZznn2) ? zz7F.zzY(obj, zzzvp.zznw(), zzzvp2.zznw()) : obj;
    }

    public static zzAD zzZ(int i, zzZVP zzzvp, zzGY zzgy) {
        zzAD zzadZzZ = zzRE.zzZ(zzX1(i), zzzvp, zzgy);
        if (zzadZzZ == null) {
            return null;
        }
        if (zzadZzZ.zzAD() && zzzvp.zznl()) {
            return null;
        }
        return zzadZzZ;
    }
}
