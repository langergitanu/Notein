package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYBW {
    private static volatile com.aspose.words.internal.zzD3<String> zzXeW;
    private static Object zzXeV = new Object();
    private static com.aspose.words.internal.zzD3<zzYC3> zzXeU = new com.aspose.words.internal.zzD3<>();
    private static Object zzXeT = new Object();

    public static String zzB5(String str) throws Exception {
        int length = str.length() - 1;
        while (length >= 0 && Character.isDigit(str.charAt(length))) {
            length--;
        }
        int i = length + 1;
        if (i < str.length()) {
            return zzm3(com.aspose.words.internal.zzJB.parseInt(str.substring(i)));
        }
        return null;
    }

    private static com.aspose.words.internal.zzD3<String> zzY8x() throws Exception {
        if (zzXeW == null) {
            synchronized (zzXeV) {
                try {
                    if (zzXeW == null) {
                        zzXeW = zzY8y();
                    }
                } finally {
                }
            }
        }
        return zzXeW;
    }

    private static com.aspose.words.internal.zzD3<String> zzY8y() throws Exception {
        com.aspose.words.internal.zzZOP zzzopZzW = com.aspose.words.internal.zzZXR.zzW("Aspose.Words.Resources.ShapeTypes.txt", Document.class);
        try {
            com.aspose.words.internal.zzZOO zzzoo = new com.aspose.words.internal.zzZOO(zzzopZzW);
            try {
                com.aspose.words.internal.zzD3<String> zzd3 = new com.aspose.words.internal.zzD3<>(220);
                int i = -2;
                for (String line = zzzoo.readLine(); line != null; line = zzzoo.readLine()) {
                    zzd3.add(i, line);
                    i++;
                }
                return zzd3;
            } finally {
                zzzoo.close();
            }
        } finally {
            if (zzzopZzW != null) {
                zzzopZzW.close();
            }
        }
    }

    public static zzYC3 zzm2(int i) {
        zzYC3 zzyc3ZzJA;
        try {
            synchronized (zzXeT) {
                try {
                    zzyc3ZzJA = zzXeU.get(i);
                    if (zzyc3ZzJA == null) {
                        if (zzXeU.zzVE(i)) {
                            zzyc3ZzJA = zzXeU.get(i);
                        } else {
                            zzXeU.set(i, null);
                            String strZzm3 = zzm3(i);
                            if (com.aspose.words.internal.zzZYD.zzXk(strZzm3)) {
                                zzyc3ZzJA = new zzY29().zzJA(strZzm3);
                                zzXeU.set(i, zzyc3ZzJA);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zzyc3ZzJA;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String zzm3(int i) throws Exception {
        return zzY8x().get(i);
    }
}
