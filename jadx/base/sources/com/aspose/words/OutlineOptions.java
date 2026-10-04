package com.aspose.words;

import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class OutlineOptions {
    private boolean zzXIa;
    private BookmarksOutlineLevelCollection zzXIb = new BookmarksOutlineLevelCollection();
    private int zzXIc;
    private boolean zzmk;
    private int zzmm;
    private int zzmn;

    public BookmarksOutlineLevelCollection getBookmarksOutlineLevels() {
        return this.zzXIb;
    }

    public boolean getCreateMissingOutlineLevels() {
        return this.zzmk;
    }

    public boolean getCreateOutlinesForHeadingsInTables() {
        return this.zzXIa;
    }

    public int getDefaultBookmarksOutlineLevel() {
        return this.zzmm;
    }

    public int getExpandedOutlineLevels() {
        return this.zzmn;
    }

    public int getHeadingsOutlineLevels() {
        return this.zzXIc;
    }

    public void setCreateMissingOutlineLevels(boolean z) {
        this.zzmk = z;
    }

    public void setCreateOutlinesForHeadingsInTables(boolean z) {
        this.zzXIa = z;
    }

    public void setDefaultBookmarksOutlineLevel(int i) {
        if (i < 0 || i > 9) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: value");
        }
        this.zzmm = i;
    }

    public void setExpandedOutlineLevels(int i) {
        if (i < 0 || i > 9) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: value");
        }
        this.zzmn = i;
    }

    public void setHeadingsOutlineLevels(int i) {
        if (i < 0 || i > 9) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: value");
        }
        this.zzXIc = i;
    }

    public final com.aspose.words.internal.zz6U zzYqF() {
        com.aspose.words.internal.zz6U zz6u = new com.aspose.words.internal.zz6U();
        zz6u.setHeadingsOutlineLevels(this.zzXIc);
        zz6u.setExpandedOutlineLevels(this.zzmn);
        zz6u.setDefaultBookmarksOutlineLevel(this.zzmm);
        zz6u.setCreateMissingOutlineLevels(this.zzmk);
        for (Map.Entry<String, Integer> entry : this.zzXIb) {
            zz6u.zzx5().set(entry.getKey(), entry.getValue());
        }
        return zz6u;
    }
}
