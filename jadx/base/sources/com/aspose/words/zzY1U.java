package com.aspose.words;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
final class zzY1U {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("Word.Bookmark.Start", "Word.Bookmark.End", "Word.Comment.Start", "Word.Comment.End", "Word.Insertion", "Word.Deletion", "Word.Numbering", "Word.Formatting", FirebaseAnalytics.Param.CONTENT, "pPr", "sectPr", "rPr", "r", "annotation");
    private zzY0U zzWVg;
    private zzYVG zzYPo;

    public zzY1U(zzYVG zzyvg, zzY0U zzy0u) {
        this.zzYPo = zzyvg;
        this.zzWVg = zzy0u;
    }

    public static void zzO(zzYVB zzyvb, zzY6G zzy6g) {
        zzY(zzyvb, zzy6g, false);
    }

    public static void zzP(zzYVB zzyvb, zzY6G zzy6g) {
        zzY(zzyvb, zzy6g, true);
    }

    public static void zzY(zzYVB zzyvb) throws Exception {
        zzYVH zzyvh = new zzYVH(zzyvb.zzZsD());
        if (zzyvh.zzYDj()) {
            int iZzTP = zzUR.zzTP(zzyvh.getType());
            if (iZzTP == 0) {
                zzyvb.zzYz6().put(Integer.valueOf(zzyvh.getId()), zzyvh.getName());
                BookmarkStart bookmarkStart = new BookmarkStart(zzyvb.getDocument(), zzyvh.getName());
                if (zzyvh.zzYzg() >= 0 && zzyvh.zzYzf() >= 0) {
                    bookmarkStart.zzOX(zzyvh.zzYzg());
                    bookmarkStart.zzOW(zzyvh.zzYzf());
                }
                zzyvb.zzYK(bookmarkStart);
                return;
            }
            if (iZzTP == 1) {
                String str = (String) com.aspose.words.internal.zzQW.zzZ((Map<Integer, TValue>) zzyvb.zzYz6(), Integer.valueOf(zzyvh.getId()));
                if (str != null) {
                    zzyvb.zzYK(new BookmarkEnd(zzyvb.getDocument(), str));
                    com.aspose.words.internal.zzZQF.zzY(zzyvb.zzYz6(), Integer.valueOf(zzyvh.getId()));
                    return;
                }
                return;
            }
            if (iZzTP == 2) {
                zzyvb.zzYK(new CommentRangeStart(zzyvb.getDocument(), zzyvh.getId()));
                return;
            }
            if (iZzTP == 3) {
                zzyvb.zzYK(new CommentRangeEnd(zzyvb.getDocument(), zzyvh.getId()));
                return;
            }
            if (iZzTP == 4) {
                zzZV8 zzzv8ZzZ = zzZ(zzyvh, 0);
                zzyvb.zzXUm.zzV(zzzv8ZzZ);
                zzs(zzyvb);
                zzyvb.zzXUm.zzX(zzzv8ZzZ);
                return;
            }
            if (iZzTP != 5) {
                zzyvb.zzTG(zzyvh.getType());
                return;
            }
            zzZV8 zzzv8ZzZ2 = zzZ(zzyvh, 1);
            zzyvb.zzXUm.zzV(zzzv8ZzZ2);
            zzs(zzyvb);
            zzyvb.zzXUm.zzX(zzzv8ZzZ2);
        }
    }

    public static void zzZ(zzYMX zzymx, zzYU4 zzyu4) {
        zzYVH zzyvh = new zzYVH(zzyu4);
        if (zzyvh.zzYDj()) {
            zzYTV zzytv = new zzYTV();
            zzytv.setAuthor(zzyvh.getAuthor());
            zzytv.zz4(zzyvh.zzkT());
            int iZzTP = zzUR.zzTP(zzyvh.getType());
            if (iZzTP == 4) {
                zzytv.zzSu(true);
                zzymx.zzY(zzytv);
            } else {
                if (iZzTP != 6) {
                    zzyu4.zzZ(16777216, 13, "Unexpected annotation type.");
                    return;
                }
                zzYVG.zzZ(zzytv, zzyvh.zzYzh());
                zzytv.zzSt(true);
                zzymx.zzY(zzytv);
            }
        }
    }

    private static void zzs(zzYVB zzyvb) throws Exception {
        zzYU4 zzyu4ZzZsD = zzyvb.zzZsD();
        while (zzyu4ZzZsD.zzQ("annotation")) {
            if (zzUR.zzTP(zzyu4ZzZsD.getLocalName()) != 8) {
                zzyu4ZzZsD.zzk();
            } else {
                while (zzyu4ZzZsD.zzQ(FirebaseAnalytics.Param.CONTENT)) {
                    int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
                    if (iZzTP == 12) {
                        zzY11.zzXSw().zzY(zzyvb);
                    } else if (iZzTP != 13) {
                        zzyu4ZzZsD.zzk();
                    } else {
                        zzY(zzyvb);
                    }
                }
            }
        }
    }

    public final void zzZ(zzYVB zzyvb, zzYMX zzymx, zzYEF zzyef) throws Exception {
        zzYU4 zzyu4ZzZsD = zzyvb.zzZsD();
        zzYVH zzyvh = new zzYVH(zzyu4ZzZsD);
        if (zzyvh.zzYDj()) {
            if (zzUR.zzTP(zzyvh.getType()) != 7) {
                zzyvb.zzTG(zzyvh.getType());
                return;
            }
            while (zzyu4ZzZsD.zzQ("annotation")) {
                if (zzUR.zzTP(zzyu4ZzZsD.getLocalName()) != 8) {
                    zzyu4ZzZsD.zzk();
                } else {
                    while (zzyu4ZzZsD.zzQ(FirebaseAnalytics.Param.CONTENT)) {
                        if (zzUR.zzTP(zzyu4ZzZsD.getLocalName()) != 9) {
                            zzyu4ZzZsD.zzk();
                        } else {
                            this.zzYPo.zzZ(zzyvb, zzymx, zzyef, zzyvh);
                        }
                    }
                }
            }
        }
    }

    public final void zzZ(zzYCZ zzycz, zzYVB zzyvb) throws Exception {
        zzYU4 zzyu4ZzZsD = zzyvb.zzZsD();
        zzYVH zzyvh = new zzYVH(zzyu4ZzZsD);
        if (zzyvh.zzYDj()) {
            if (zzUR.zzTP(zzyvh.getType()) != 7) {
                zzyvb.zzTG(zzyvh.getType());
                return;
            }
            while (zzyu4ZzZsD.zzQ("annotation")) {
                if (zzUR.zzTP(zzyu4ZzZsD.getLocalName()) != 8) {
                    zzyu4ZzZsD.zzk();
                } else {
                    while (zzyu4ZzZsD.zzQ(FirebaseAnalytics.Param.CONTENT)) {
                        if (zzUR.zzTP(zzyu4ZzZsD.getLocalName()) != 10) {
                            zzyu4ZzZsD.zzk();
                        } else {
                            WordAttrCollection wordAttrCollection = (WordAttrCollection) zzycz.zzbn();
                            zzycz.clear();
                            this.zzWVg.zzY(zzyvb, zzycz);
                            wordAttrCollection.zzX(zzycz);
                            zzycz.zzZ(new zzZMK(wordAttrCollection, zzyvh.getAuthor(), zzyvh.zzkT()));
                        }
                    }
                }
            }
        }
    }

    private static void zzY(zzYVB zzyvb, zzY6G zzy6g, boolean z) {
        zzYU4 zzyu4ZzZsD = zzyvb.zzZsD();
        zzYVH zzyvh = new zzYVH(zzyu4ZzZsD);
        if (zzyvh.zzYDj()) {
            int iZzTP = zzUR.zzTP(zzyvh.getType());
            if (iZzTP == 4) {
                zzZ(zzy6g, zzyvh, 0);
                return;
            }
            if (iZzTP == 5) {
                zzZ(zzy6g, zzyvh, 1);
                return;
            }
            if (iZzTP != 7) {
                zzyvb.zzTG(zzyvh.getType());
                return;
            }
            while (zzyu4ZzZsD.zzQ("annotation")) {
                if (zzUR.zzTP(zzyu4ZzZsD.getLocalName()) != 8) {
                    zzyu4ZzZsD.zzk();
                } else {
                    zzY(zzyvb, zzy6g, zzyvh, z);
                }
            }
        }
    }

    public static Comment zzY(zzYEF zzyef, zzYVB zzyvb) throws Exception {
        zzyvb.zzXUm.zzY4h();
        zzYU4 zzyu4ZzZsD = zzyvb.zzZsD();
        zzYVH zzyvh = new zzYVH(zzyu4ZzZsD);
        if (!zzyvh.zzZFI()) {
            return null;
        }
        Comment comment = new Comment(zzyvb.getDocument(), zzyef);
        comment.setIdInternal(zzyvh.getId());
        comment.setAuthor(zzyvh.getAuthor());
        comment.setInitial(zzyvh.getInitials());
        if (!com.aspose.words.internal.zzZQ9.zzZ(zzyvh.zzkT(), com.aspose.words.internal.zzZQ9.zz35)) {
            comment.zzv(com.aspose.words.internal.zzZQ9.zzZ(zzyvh.zzkT(), 2L));
        }
        while (zzyu4ZzZsD.zzQ("annotation")) {
            if (zzUR.zzTP(zzyu4ZzZsD.getLocalName()) != 8) {
                zzyu4ZzZsD.zzk();
            } else {
                zzY11.zzXSx();
                zzyvb.zzQ(comment);
            }
        }
        zzyvb.zzXUm.zzY4g();
        return comment;
    }

    public static void zzZ(zzWP zzwp, zzYVB zzyvb) throws Exception {
        zzYU4 zzyu4ZzZsD = zzyvb.zzZsD();
        zzYVH zzyvh = new zzYVH(zzyu4ZzZsD);
        if (zzyvh.zzYDj()) {
            if (zzUR.zzTP(zzyvh.getType()) != 7) {
                zzyvb.zzTG(zzyvh.getType());
                return;
            }
            while (zzyu4ZzZsD.zzQ("annotation")) {
                if (zzUR.zzTP(zzyu4ZzZsD.getLocalName()) != 8) {
                    zzyu4ZzZsD.zzk();
                } else {
                    WordAttrCollection wordAttrCollection = (WordAttrCollection) zzwp.zzbn();
                    zzwp.clear();
                    zzY11.zzXSt().zzY(zzyvb, zzwp);
                    wordAttrCollection.zzX(zzwp);
                    zzwp.zzZ(new zzZMK(wordAttrCollection, zzyvh.getAuthor(), zzyvh.zzkT()));
                }
            }
        }
    }

    private static void zzY(zzYVB zzyvb, zzY6G zzy6g, zzYVH zzyvh, boolean z) {
        WordAttrCollection wordAttrCollection = (WordAttrCollection) zzy6g.zzbn();
        if (wordAttrCollection.zz6D()) {
            wordAttrCollection.zzYpN();
        }
        zzy6g.remove(10010);
        if (z) {
            zzY0R.zzY(zzy6g, zzyvb);
        } else {
            zzY10.zzZ(zzy6g, zzyvb);
        }
        wordAttrCollection.zzX(zzy6g);
        zzy6g.zzZ(new zzZMK(wordAttrCollection, zzyvh.getAuthor(), zzyvh.zzkT()));
    }

    private static void zzZ(zzY6G zzy6g, zzYVH zzyvh, int i) {
        if (i == 0) {
            zzy6g.zzQ(14, new zzZV8(i, zzyvh.getAuthor(), zzyvh.zzkT()));
        } else {
            if (i == 1) {
                zzy6g.zzQ(12, new zzZV8(i, zzyvh.getAuthor(), zzyvh.zzkT()));
                return;
            }
            throw new IllegalArgumentException("Unexpected revision type.");
        }
    }

    public final void zzZ(zzYEF zzyef, zzYVB zzyvb) throws Exception {
        zzYU4 zzyu4ZzZsD = zzyvb.zzZsD();
        zzYVH zzyvh = new zzYVH(zzyu4ZzZsD);
        if (zzyvh.zzYDj()) {
            int iZzTP = zzUR.zzTP(zzyvh.getType());
            if (iZzTP == 4) {
                zzyef.zzQ(14, zzZ(zzyvh, 0));
                return;
            }
            if (iZzTP == 5) {
                zzyef.zzQ(12, zzZ(zzyvh, 1));
                return;
            }
            if (iZzTP != 7) {
                zzyu4ZzZsD.zzk();
                return;
            }
            while (zzyu4ZzZsD.zzQ("annotation")) {
                if (zzUR.zzTP(zzyu4ZzZsD.getLocalName()) != 8) {
                    zzyu4ZzZsD.zzk();
                } else {
                    while (zzyu4ZzZsD.zzQ(FirebaseAnalytics.Param.CONTENT)) {
                        if (zzUR.zzTP(zzyu4ZzZsD.getLocalName()) != 11) {
                            zzyu4ZzZsD.zzk();
                        } else {
                            this.zzYPo.zzZ(zzyvb, zzyef, zzyvh);
                        }
                    }
                }
            }
        }
    }

    private static zzZV8 zzZ(zzYVH zzyvh, int i) {
        zzZV8 zzzv8 = new zzZV8(i);
        zzzv8.setAuthor(zzyvh.getAuthor());
        zzzv8.zz4(zzyvh.zzkT());
        return zzzv8;
    }
}
