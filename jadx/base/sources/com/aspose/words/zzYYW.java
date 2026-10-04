package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYYW {
    private static com.aspose.words.internal.zzZNR zzXYY = new com.aspose.words.internal.zzZNR("^(?:multipart/[a-z0-9-]+|(?:text|image)(?:/[^/]*)?)?$", 0);

    private static com.aspose.words.internal.zzZNR zzI9(String str) {
        return new com.aspose.words.internal.zzZNR(com.aspose.words.internal.zzZKN.format("^\r*(--{0})(--)?(?:\r?\n)?", com.aspose.words.internal.zzZNR.zzUU(str)), 8);
    }

    public static zzYYV zzIa(String str) throws Exception {
        zzYYR zzyyrZzX = zzYYQ.zzX(str, 0, str.length(), true);
        if (com.aspose.words.internal.zzZYD.zzXk(zzyyrZzX.getContentType()) && !zzXYY.zzUV(zzyyrZzX.getContentType())) {
            throw new UnsupportedOperationException(com.aspose.words.internal.zzZKN.format("Specified content type is not supported: {0}.", zzyyrZzX.getContentType()));
        }
        zzYYR zzyyr = new zzYYR(0);
        zzyyr.zzub(3);
        zzYYV zzyyv = new zzYYV(str, null, zzyyr, 0, str.length());
        zzYYV zzyyv2 = new zzYYV(str, zzyyv, zzyyrZzX, 0, str.length());
        zzyyv.zzyD().add(zzyyv2);
        zzyyv2.zzI8(zzyyrZzX.zzYDc());
        if (zzyyv2.zzYDp().zzYDh() != 0) {
            zzZ(str, zzyyv2, new com.aspose.words.internal.zzDB());
        }
        return zzyyv2;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void zzZ(String str, zzYYV zzyyv, com.aspose.words.internal.zzDB zzdb) throws Exception {
        String str2;
        zzYYV zzyyv2;
        if (zzyyv.zzYDm().zzYDp().isMixed() || zzyyv.zzYDm().zzYDp().zzYD7() || zzyyv.zzYDm().zzYDp().isSigned() || (zzyyv.zzYDm().zzYDp().zzYD6() && zzyyv.zzYDp().zzYD7())) {
            com.aspose.words.internal.zzZNS zzznsZzs = zzI9(zzyyv.zzYDp().zzYDg()).zzs(str, zzyyv.zzYDn());
            int i = 0;
            while (i < zzznsZzs.getCount()) {
                com.aspose.words.internal.zzZNT zzzntZzQw = zzznsZzs.zzQw(i);
                if (!zzzntZzQw.zzhL()) {
                    str2 = str;
                    zzyyv2 = zzyyv;
                } else {
                    if (zzzntZzQw.zzhJ().zzQx(2).zzhL()) {
                        return;
                    }
                    int length = zzzntZzQw.getLength() + zzzntZzQw.getIndex();
                    int index = (i < zzznsZzs.getCount() + (-1) ? zzznsZzs.zzQw(i + 1).getIndex() : str.length()) - length;
                    zzYYR zzyyrZzX = zzYYQ.zzX(str, length, index, false);
                    int iZzVJ = zzdb.zzVJ(length);
                    if (iZzVJ < 0) {
                        zzdb.zz4(~iZzVJ, length);
                        str2 = str;
                        zzyyv2 = zzyyv;
                        zzYYV zzyyv3 = new zzYYV(str2, zzyyv2, zzyyrZzX, length, index);
                        zzyyv2.zzyD().add(zzyyv3);
                        if (zzyyrZzX.zzhL() && zzyyv3.zzYDp().zzYDh() != 0) {
                            zzZ(str2, zzyyv3, zzdb);
                        }
                    }
                }
                i++;
                str = str2;
                zzyyv = zzyyv2;
            }
        }
    }
}
