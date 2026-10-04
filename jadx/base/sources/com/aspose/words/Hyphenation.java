package com.aspose.words;

import java.io.InputStream;

/* JADX INFO: loaded from: classes6.dex */
public class Hyphenation {
    private static IHyphenationCallback zzYk6;
    private static IWarningCallback zzZG0;
    private static com.aspose.words.internal.zzD3<zzZDA> zzYk7 = new com.aspose.words.internal.zzD3<>();
    private static Object zzcD = new Object();

    private Hyphenation() {
    }

    public static IHyphenationCallback getCallback() {
        return zzYk6;
    }

    public static IWarningCallback getWarningCallback() {
        return zzZG0;
    }

    public static boolean isDictionaryRegistered(String str) {
        boolean z;
        if (str == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: language");
        }
        int iZzJF = zzJF(str);
        synchronized (zzcD) {
            try {
                zzZDA zzzda = zzYk7.get(iZzJF);
                z = (zzzda == null || zzzda.zzZk2()) ? false : true;
            } finally {
            }
        }
        return z;
    }

    public static void registerDictionary(String str, InputStream inputStream) throws Exception {
        zzV(str, com.aspose.words.internal.zzZOP.zzY(inputStream));
    }

    public static void setCallback(IHyphenationCallback iHyphenationCallback) {
        zzYk6 = iHyphenationCallback;
    }

    public static void setWarningCallback(IWarningCallback iWarningCallback) {
        zzZG0 = iWarningCallback;
    }

    public static void unregisterDictionary(String str) {
        if (!com.aspose.words.internal.zzZYD.zzXk(str)) {
            synchronized (zzcD) {
                zzYk7.clear();
            }
        } else {
            int iZzJF = zzJF(str);
            synchronized (zzcD) {
                zzYk7.zzVG(iZzJF);
            }
        }
    }

    private static int zzJF(String str) {
        if (str == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: tag");
        }
        int iZzYx = com.aspose.words.internal.zzBM.zzYx(str);
        if (iZzYx != 127) {
            return iZzYx;
        }
        throw new IllegalArgumentException(com.aspose.words.internal.zzZKN.format("Language name '{0}' is not supported.", str));
    }

    private static void zzV(String str, com.aspose.words.internal.zzZOP zzzop) throws Exception {
        if (str == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: language");
        }
        zzW(zzJF(str), zzzop);
    }

    private static void zzW(int i, com.aspose.words.internal.zzZOP zzzop) throws Exception {
        if (zzzop == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: stream");
        }
        zzZDA zzzdaZzZ5 = zzZ5(zzzop);
        synchronized (zzcD) {
            zzYk7.set(i, zzzdaZzZ5);
        }
    }

    public static zzZDA zzZ(int i, zzZYW zzzyw) throws Exception {
        zzZDA zzzda;
        IHyphenationCallback callback;
        int i2 = 0;
        while (true) {
            synchronized (zzcD) {
                zzzda = zzYk7.get(i);
            }
            if (zzzda != null) {
                if (zzzda.zzZk2()) {
                    return null;
                }
                return zzzda;
            }
            if (i2 != 0 || (callback = getCallback()) == null) {
                break;
            }
            callback.requestDictionary(com.aspose.words.internal.zzBM.zzVn(i));
            i2++;
        }
        if (zzzyw != null) {
            zzY20.zzZ(zzzyw, "Missing hyphenation dictionary. Lines of text can wrap differently.");
        }
        return null;
    }

    private static zzZDA zzZ5(com.aspose.words.internal.zzZOP zzzop) throws Exception {
        zzZDC zzzdc = new zzZDC();
        zzzdc.zzZ4(zzzop);
        return new zzZDA(zzzdc.zzYX7(), zzzdc.zzQZ(), getWarningCallback());
    }

    public static void registerDictionary(String str, String str2) throws Exception {
        if (str == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: language");
        }
        int iZzJF = zzJF(str);
        if (!com.aspose.words.internal.zzZYD.zzXk(str2)) {
            synchronized (zzcD) {
                zzYk7.set(iZzJF, zzZDA.zzYjY);
            }
        } else {
            com.aspose.words.internal.zzZOS zzzos = new com.aspose.words.internal.zzZOS(str2, 3, 1);
            try {
                zzW(iZzJF, zzzos);
            } finally {
                zzzos.close();
            }
        }
    }
}
