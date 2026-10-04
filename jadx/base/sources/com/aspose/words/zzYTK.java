package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzYTK {
    private ArrayList<Node> zzXRL = new ArrayList<>();
    private zzYOR zzXRT;

    public zzYTK(zzYOR zzyor) {
        this.zzXRT = zzyor;
    }

    private boolean zzGD(String str) {
        Iterator<Node> it = this.zzXRT.zzYsq().iterator();
        while (it.hasNext()) {
            BookmarkEnd bookmarkEnd = (BookmarkEnd) com.aspose.words.internal.zzZKW.zzZ(it.next(), BookmarkEnd.class);
            if (bookmarkEnd != null && com.aspose.words.internal.zzZKN.equals(bookmarkEnd.getName(), str)) {
                return true;
            }
        }
        return false;
    }

    private boolean zzGE(String str) {
        Iterator<Node> it = this.zzXRT.zzYsq().iterator();
        while (it.hasNext()) {
            BookmarkStart bookmarkStart = (BookmarkStart) com.aspose.words.internal.zzZKW.zzZ(it.next(), BookmarkStart.class);
            if (bookmarkStart != null && com.aspose.words.internal.zzZKN.equals(bookmarkStart.getName(), str)) {
                return true;
            }
        }
        return false;
    }

    private static boolean zzV(BookmarkStart bookmarkStart) throws Exception {
        Paragraph paragraph = (Paragraph) com.aspose.words.internal.zzZKW.zzZ(bookmarkStart.getBookmark().getBookmarkEnd().getParentNode(), Paragraph.class);
        Paragraph paragraph2 = (Paragraph) com.aspose.words.internal.zzZKW.zzZ(bookmarkStart.getParentNode(), Paragraph.class);
        return paragraph2 == null || paragraph == null || !paragraph2.isInCell() || !paragraph.isInCell() || paragraph.zzZex() == paragraph2.zzZex();
    }

    private void zzW(BookmarkStart bookmarkStart) throws Exception {
        String name = bookmarkStart.getName();
        if (!zzV(bookmarkStart)) {
            zzYv("text:bookmark-start", name);
            zzYv("text:bookmark-end", name);
            return;
        }
        zzYv("text:bookmark-start", name);
        BookmarkEnd bookmarkEnd = bookmarkStart.getBookmark().getBookmarkEnd();
        if (zzGD(bookmarkStart.getName()) || !zzV(bookmarkEnd)) {
            zzYv("text:bookmark-end", name);
        }
    }

    private boolean zzXx(Node node) {
        if (this.zzXRT.zzYsC() == 6 || this.zzXRT.zzYsC() == 5) {
            return true;
        }
        if (zzYOR.zzXk(node) || !this.zzXRT.zzYsF()) {
            return (this.zzXRT.zzYsn() && !this.zzXRT.zzYsm()) || this.zzXRT.zzYsE();
        }
        return true;
    }

    private void zzYv(String str, String str2) {
        this.zzXRT.zzYsG().zzGB(str);
        this.zzXRT.zzYsG().zzYu("text:name", str2);
        this.zzXRT.zzYsG().zzX("/>");
    }

    private boolean zzYyd() {
        return this.zzXRT.zzYsn() && !this.zzXRT.zzYsm() && this.zzXRT.zzYsE();
    }

    public final int visitBookmarkEnd(BookmarkEnd bookmarkEnd) {
        if (zzYyd()) {
            this.zzXRT.zzYsq().add(bookmarkEnd);
        }
        if (!zzXx(bookmarkEnd) && zzV(bookmarkEnd)) {
            if (bookmarkEnd.zzYAY() == 6) {
                zzW(bookmarkEnd);
            } else {
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<BookmarkEnd>) this.zzXRL, bookmarkEnd);
            }
        }
        return 0;
    }

    public final int visitBookmarkStart(BookmarkStart bookmarkStart) throws Exception {
        if (zzYyd()) {
            this.zzXRT.zzYsq().add(bookmarkStart);
        }
        if (zzXx(bookmarkStart)) {
            return 0;
        }
        if (bookmarkStart.zzYAY() == 6) {
            zzW(bookmarkStart);
        } else {
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<BookmarkStart>) this.zzXRL, bookmarkStart);
        }
        return 0;
    }

    public final void zzYye() throws Exception {
        for (Node node : this.zzXRL) {
            int nodeType = node.getNodeType();
            if (nodeType == 9) {
                zzW((BookmarkStart) node);
            } else {
                if (nodeType != 10) {
                    throw new IllegalStateException("Unexpected node type.");
                }
                zzW((BookmarkEnd) node);
            }
        }
        this.zzXRL.clear();
    }

    private static boolean zzV(BookmarkEnd bookmarkEnd) {
        Paragraph paragraph = (Paragraph) com.aspose.words.internal.zzZKW.zzZ(bookmarkEnd.getParentNode(), Paragraph.class);
        return (paragraph != null && paragraph.isInCell() && paragraph.zzZex().getRange().getBookmarks().get(bookmarkEnd.getName()) == null) ? false : true;
    }

    private void zzW(BookmarkEnd bookmarkEnd) {
        if (zzGE(bookmarkEnd.getName())) {
            zzYv("text:bookmark-start", bookmarkEnd.getName());
        }
        zzYv("text:bookmark-end", bookmarkEnd.getName());
    }
}
