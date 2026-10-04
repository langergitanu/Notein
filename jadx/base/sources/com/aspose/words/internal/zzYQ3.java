package com.aspose.words.internal;

import java.lang.reflect.Constructor;
import javax.crypto.BadPaddingException;

/* JADX INFO: loaded from: classes5.dex */
class zzYQ3 {
    private static final Constructor zzVUz;

    static {
        Class clsZzwx = zzwx("javax.crypto.AEADBadTagException");
        if (clsZzwx != null) {
            zzVUz = zzi(clsZzwx);
        } else {
            zzVUz = null;
        }
    }

    private static Constructor zzi(Class cls) {
        try {
            return cls.getConstructor(String.class);
        } catch (Exception unused) {
            return null;
        }
    }

    public static void zzwt(String str) throws BadPaddingException {
        BadPaddingException badPaddingException;
        Constructor constructor = zzVUz;
        if (constructor != null) {
            try {
                badPaddingException = (BadPaddingException) constructor.newInstance(str);
            } catch (Exception unused) {
                badPaddingException = null;
            }
            if (badPaddingException != null) {
                throw badPaddingException;
            }
        }
        throw new BadPaddingException(str);
    }

    private static Class zzwx(String str) {
        try {
            return zzYQ3.class.getClassLoader().loadClass(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
