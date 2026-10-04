package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz7W {
    public static String zzK(Class cls) {
        if (cls == zzYZ.class) {
            return "data band";
        }
        if (cls == zzSH.class) {
            return "conditional block";
        }
        if (cls == zz71.class) {
            return "template option";
        }
        if (cls == zzZ0.class) {
            return "background color block";
        }
        if (cls == zzZWR.class) {
            return "text color block";
        }
        if (cls == zzXJ.class) {
            return "bookmark placeholder";
        }
        throw new IllegalStateException();
    }

    public static Class zzUC(int i) {
        if (i == 0) {
            return zzYZ.class;
        }
        if (i == 1) {
            return zzSH.class;
        }
        if (i == 2) {
            return zz71.class;
        }
        throw new IllegalStateException();
    }

    public static zzCW zzX(String str, Class cls) {
        return new zzCW(zzZKN.format(str, zzK(cls)));
    }

    public static zzCW zzK(String str, int i) {
        return new zzCW(zzZKN.format(str, zzK(zzUC(i))));
    }
}
