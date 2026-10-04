package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYG6 {
    public static void zzS(zzYEM zzyem) throws Exception {
        zzyem.zzYfW().zzYj3();
        zzyem.zzYfW().zzYj3();
    }

    public static void zzZ(zzYEM zzyem, String str, zzYOC zzyoc) throws Exception {
        zzYHZ zzyhzZzYfW = zzyem.zzYfW();
        zzyhzZzYfW.zzCC("\\object");
        zzZQU zzzquZzM3 = zzZQU.zzM3(str);
        zzyhzZzYfW.zzCD(zzzquZzM3.getAutoUpdate() ? "\\objautlink" : "\\objlink");
        if (zzzquZzM3.zzZf9() != 0 || com.aspose.words.internal.zzZYD.zzX(str, " \\p ", false)) {
            zzZ(zzyhzZzYfW, zzzquZzM3.zzZf9());
        }
        zzyhzZzYfW.zzY6("\\*\\objclass", zzzquZzM3.getProgId());
        if (zzyoc.zzYrr() != null) {
            zzZ(zzyhzZzYfW, new zzYOH(zzzquZzM3.getProgId(), zzyoc.zzYrr(), null));
        }
        zzyhzZzYfW.zzCC("\\result");
    }

    private static byte[] zzZO(Shape shape) throws Exception {
        ImageData imageData;
        if (shape != null && (imageData = shape.getImageData()) != null && imageData.zzZjT()) {
            if (imageData.getImageType() == 3) {
                return com.aspose.words.internal.zzEF.zzZw(imageData.getImageBytes());
            }
            if (shape.getOleFormat().zzYrz() && imageData.getImageType() == 2) {
                return com.aspose.words.internal.zzEF.zz7(imageData.getImageSize().getWidthPixels(), imageData.getImageSize().getHeightPixels());
            }
        }
        return null;
    }

    public static void zzZ(zzYEM zzyem, Shape shape) throws Exception {
        shape.zzZid();
        OleFormat oleFormat = shape.getOleFormat();
        zzYHZ zzyhzZzYfW = zzyem.zzYfW();
        zzyhzZzYfW.zzCC("\\object");
        if (shape.zzY9H()) {
            zzyhzZzYfW.zzCD("\\objocx");
        } else if (oleFormat.isLink()) {
            zzyhzZzYfW.zzCD(oleFormat.getAutoUpdate() ? "\\objautlink" : "\\objlink");
        } else {
            zzyhzZzYfW.zzCD("\\objemb");
        }
        if (oleFormat.isLink()) {
            zzZ(zzyhzZzYfW, oleFormat.zzZf9());
        }
        zzyhzZzYfW.zzZ5("\\objw", com.aspose.words.internal.zzSA.zzr(shape.getWidth()));
        zzyhzZzYfW.zzZ5("\\objh", com.aspose.words.internal.zzSA.zzr(shape.getHeight()));
        zzyhzZzYfW.zzY6("\\*\\objclass", oleFormat.getProgId());
        zzZBL zzzblZzYrB = oleFormat.zzYrB();
        if (zzzblZzYrB != null && !shape.zzYbs()) {
            zzZ(zzyhzZzYfW, new zzYOH(oleFormat.getProgId(), zzyem.zzZqS().zzXp9.zzYr(zzYO6.zzX(zzzblZzYrB)), zzZO(shape)));
        } else if (oleFormat.isLink()) {
            zzZ(zzyhzZzYfW, new zzYOG(oleFormat, zzZO(shape)));
        }
        zzyhzZzYfW.zzCC("\\result");
        zzyhzZzYfW.zzYj5();
        zzyem.zzYel().zzW(zzZ7R.zzZ(shape, 0), true);
        new zzYFX(zzyem, shape).zzX(true, false, 255);
        zzyhzZzYfW.zzYj4();
        zzyhzZzYfW.zzYj3();
        zzyhzZzYfW.zzYj3();
    }

    private static void zzZ(zzYHZ zzyhz, int i) throws Exception {
        if (i == 0) {
            zzyhz.zzCD("\\rsltpict");
            return;
        }
        if (i == 1) {
            zzyhz.zzCD("\\rsltbmp");
            return;
        }
        if (i == 2) {
            zzyhz.zzCD("\\rslthtml");
        } else if (i == 3) {
            zzyhz.zzCD("\\rsltrtf");
        } else {
            if (i != 4) {
                return;
            }
            zzyhz.zzCD("\\rslttxt");
        }
    }

    private static void zzZ(zzYHZ zzyhz, zzYOF zzyof) throws Exception {
        zzyhz.zzCC("\\*\\objdata");
        zzyhz.zzFh();
        com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR();
        zzyof.zzZ(new com.aspose.words.internal.zzZOW(zzzor));
        zzyhz.zzXQ(zzzor.zzWy());
        zzyhz.zzYj3();
    }
}
