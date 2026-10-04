package com.aspose.words;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZQU {
    private static final com.aspose.words.internal.zzZHW zzUR;
    private static com.aspose.words.internal.zzZYJ zzYFj;
    private int zzYFl;
    private int zzYFm;
    private boolean zzZam;
    private String zzYFE = "";
    private String zzYFA = "";
    private String zzYFk = "";

    static {
        com.aspose.words.internal.zzZYJ zzzyj = new com.aspose.words.internal.zzZYJ();
        zzYFj = zzzyj;
        zzzyj.zzH("\\p", 0);
        zzYFj.zzH("\\b", 1);
        zzYFj.zzH("\\h", 2);
        zzYFj.zzH("\\r", 3);
        zzYFj.zzH("\\t", 4);
        zzYFj.zzH("\\u", 5);
        zzUR = new com.aspose.words.internal.zzZHW("\\b", "\\h", "\\p", "\\r", "\\t", "\\u");
    }

    private void setProgId(String str) {
        if (str == null) {
            str = "";
        }
        this.zzYFE = str;
    }

    private void setSourceFullName(String str) {
        if (str == null) {
            str = "";
        }
        this.zzYFA = str;
    }

    private void setSourceItem(String str) {
        if (str == null) {
            str = "";
        }
        this.zzYFk = str;
    }

    private static String zzDA(int i) {
        return zzYFj.zzO(i, "\\p");
    }

    private static int zzM2(String str) {
        return zzYFj.zzG(str, 0);
    }

    public static zzZQU zzM3(String str) {
        zzZQU zzzqu = new zzZQU();
        zzZR1 zzzr1 = new zzZR1(str, new FieldLink());
        zzzqu.setProgId(zzzr1.zzT(0, true, true));
        zzzqu.setSourceFullName(zzzr1.zzT(1, true, true));
        zzzqu.setSourceItem(zzzr1.zzT(2, true, true));
        zzzqu.zzZam = zzzr1.zzMj("\\a");
        int iZzZo = com.aspose.words.internal.zzJB.zzZo(zzzr1.zzt("\\f", true));
        if (iZzZo != Integer.MIN_VALUE) {
            zzzqu.zzYFm = iZzZo;
        }
        zzzqu.zzYFl = zzV(zzzr1.zzZfC());
        return zzzqu;
    }

    private static int zzV(Collection<zzZPC> collection) {
        Iterator<zzZPC> it = collection.iterator();
        int iZzM2 = 0;
        while (it.hasNext()) {
            String lowerCase = it.next().getName().toLowerCase();
            int iZzTP = zzUR.zzTP(lowerCase);
            if (iZzTP == 0 || iZzTP == 1 || iZzTP == 2 || iZzTP == 3 || iZzTP == 4 || iZzTP == 5) {
                iZzM2 = zzM2(lowerCase);
            }
        }
        return iZzM2;
    }

    public static String zzW(OleFormat oleFormat) throws Exception {
        StringBuilder sb = new StringBuilder();
        com.aspose.words.internal.zzZNH.zzZ(sb, " LINK {0} {1} {2} ", oleFormat.getProgId(), zzY0C.zzyw(oleFormat.getSourceFullName()), zzY0C.zzyw(oleFormat.getSourceItem()));
        if (oleFormat.getAutoUpdate()) {
            com.aspose.words.internal.zzZNH.zzZ(sb, "{0} ", "\\a");
        }
        if (oleFormat.zzZfa() != 0) {
            com.aspose.words.internal.zzZNH.zzZ(sb, "{0} {1} ", "\\f", Integer.valueOf(oleFormat.zzZfa()));
        }
        com.aspose.words.internal.zzZNH.zzU(sb, zzDA(oleFormat.zzZf9()));
        return sb.toString();
    }

    public final boolean getAutoUpdate() {
        return this.zzZam;
    }

    public final String getProgId() {
        return this.zzYFE;
    }

    public final String getSourceFullName() {
        return this.zzYFA;
    }

    public final String getSourceItem() {
        return this.zzYFk;
    }

    public final int zzZf9() {
        return this.zzYFl;
    }

    public final int zzZfa() {
        return this.zzYFm;
    }

    public static zzZQU zzW(zzZR4 zzzr4) {
        zzzr4.getFieldType();
        FieldLink fieldLink = (FieldLink) zzZQB.zzX(zzzr4.getStart(), zzzr4.getSeparator(), zzzr4.getEnd());
        zzZQU zzzqu = new zzZQU();
        zzzqu.setProgId(fieldLink.getProgId());
        zzzqu.setSourceFullName(fieldLink.getSourceFullName());
        zzzqu.setSourceItem(fieldLink.getSourceItem());
        zzzqu.zzZam = fieldLink.getAutoUpdate();
        int iZzZo = com.aspose.words.internal.zzJB.zzZo(fieldLink.getFormatUpdateType());
        if (iZzZo != Integer.MIN_VALUE) {
            zzzqu.zzYFm = iZzZo;
        }
        zzzqu.zzYFl = zzV(fieldLink.zzZgq().zzZfC());
        return zzzqu;
    }
}
