package com.aspose.words;

import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
final class zzZYE {
    public static void zzR(zzYVB zzyvb) {
        String str;
        zzYVH zzyvh = new zzYVH(zzyvb.zzZsD());
        if (zzyvh.zzYDj() && (str = (String) com.aspose.words.internal.zzQW.zzZ((Map<Integer, TValue>) zzyvb.zzYz6(), Integer.valueOf(zzyvh.getId()))) != null) {
            BookmarkEnd bookmarkEnd = new BookmarkEnd(zzyvb.getDocument(), str);
            bookmarkEnd.zzOY(zzyvh.zz9d());
            zzyvb.zzYK(bookmarkEnd);
            com.aspose.words.internal.zzZQF.zzY(zzyvb.zzYz6(), Integer.valueOf(zzyvh.getId()));
        }
    }

    public static void zzS(zzYVB zzyvb) {
        zzYVH zzyvh = new zzYVH(zzyvb.zzZsD());
        if (zzyvh.zzYDj()) {
            zzyvb.zzYz6().put(Integer.valueOf(zzyvh.getId()), zzyvh.getName());
            BookmarkStart bookmarkStart = new BookmarkStart(zzyvb.getDocument(), zzyvh.getName());
            bookmarkStart.zzOY(zzyvh.zz9d());
            if (zzyvh.zzYzg() >= 0 && zzyvh.zzYzf() >= 0) {
                bookmarkStart.zzOX(zzyvh.zzYzg());
                bookmarkStart.zzOW(zzyvh.zzYzf());
            }
            zzyvb.zzYK(bookmarkStart);
        }
    }
}
