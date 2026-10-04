package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYGM {
    private zzYEM zzXwl;
    private int zzYCU;

    private StringBuilder zzCh(String str) throws Exception {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        sb2.append(com.aspose.words.internal.zzZQB.zzRq(length));
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            sb2.append(cCharAt);
            if (ListLevel.zzx7(cCharAt)) {
                sb.append((char) (i + 1));
            }
        }
        this.zzXwl.zzYfW().zzZ3(sb2.toString(), 1);
        return sb;
    }

    private void zzW(zzZ4J zzz4j) throws Exception {
        this.zzXwl.zzYfW().zzCC("\\list");
        this.zzXwl.zzYfW().zzZ5("\\listtemplateid", zzz4j.zzYOQ());
        this.zzYCU = zzz4j.zzYOR();
        ListLevelCollection listLevels = zzz4j.getListLevels();
        zzoG(listLevels.getCount());
        for (int i = 0; i < listLevels.getCount(); i++) {
            zzZ(listLevels.get(i), i, zzz4j.zzYOR() == 2);
        }
        this.zzXwl.zzYfW().zzY4("\\listname", zzz4j.getName());
        this.zzXwl.zzYfW().zzZ5("\\listid", zzz4j.zzYP8());
        if (zzz4j.isListStyleDefinition()) {
            this.zzXwl.zzYfW().zzY4("\\*\\liststylename", zzz4j.getStyle().getName());
        } else if (zzz4j.isListStyleReference()) {
            this.zzXwl.zzYfW().zzZ5("\\liststyleid", zzz4j.getStyle().getList().zzYP8());
        }
        this.zzXwl.zzYfW().zz7("\\listrestarthdn", zzz4j.isRestartAtEachSection());
        this.zzXwl.zzYfW().zzYj3();
        this.zzXwl.zzYfW().zzFg();
    }

    private void zzYhU() throws Exception {
        this.zzXwl.zzYfW().zzCC("\\*\\listoverridetable");
        ListCollection lists = this.zzXwl.getDocument().getLists();
        int i = 0;
        while (i < lists.getCount()) {
            this.zzXwl.zzYfW().zzCC("\\listoverride");
            List list = lists.get(i);
            this.zzXwl.zzYfW().zzZ5("\\listid", list.zzYP8());
            this.zzXwl.zzYfW().zzZ5("\\listoverridecount", list.zzYPb().getCount());
            i++;
            this.zzXwl.zzYfW().zzZ5("\\ls", i);
            for (zzZ4B zzz4b : list.zzYPb()) {
                this.zzXwl.zzYfW().zzCC("\\lfolevel");
                if (zzz4b.zzYbX) {
                    this.zzXwl.zzYfW().zzCD("\\listoverridestartat");
                    if (!zzz4b.zzYbW) {
                        this.zzXwl.zzYfW().zzZ5("\\levelstartat", zzz4b.zzYbY);
                    }
                }
                if (zzz4b.zzYbW) {
                    this.zzXwl.zzYfW().zzZ5("\\listoverrideformat", 9);
                    zzZ(zzz4b.getListLevel(), zzz4b.getListLevel().zzYOa(), list.zzYPa().zzYOR() == 2);
                }
                this.zzXwl.zzYfW().zzYj3();
            }
            this.zzXwl.zzYfW().zzYj3();
        }
        this.zzXwl.zzYfW().zzYj3();
        this.zzXwl.zzYfW().zzFg();
    }

    private void zzYhV() throws Exception {
        ListCollection lists = this.zzXwl.getDocument().getLists();
        for (int i = 0; i < lists.zzYP1(); i++) {
            zzW(lists.zzxs(i));
        }
    }

    private void zzYhW() throws Exception {
        this.zzXwl.zzYfW().zzCC("\\*\\listtable");
        zzZr7();
        zzYhV();
        this.zzXwl.zzYfW().zzYj3();
        this.zzXwl.zzYfW().zzFg();
    }

    private void zzZr7() throws Exception {
        ListCollection lists = this.zzXwl.getDocument().getLists();
        if (lists.zzYP0() == 0) {
            return;
        }
        this.zzXwl.zzYfW().zzCC("\\*\\listpicture");
        for (int i = 0; i < lists.zzYP0(); i++) {
            this.zzXwl.zzYeg().zzZK(lists.zzxn(i));
        }
        this.zzXwl.zzYfW().zzYj3();
        this.zzXwl.zzYfW().zzFg();
    }

    private void zzoG(int i) throws Exception {
        int i2 = this.zzYCU;
        if (i2 != 0 && i2 != 1) {
            this.zzXwl.zzYfW().zzCD("\\listhybrid");
        } else if (i == 1) {
            this.zzXwl.zzYfW().zzCD("\\listsimple");
        }
    }

    public final void zzZ(zzYEM zzyem) throws Exception {
        this.zzXwl = zzyem;
        if (zzyem.getDocument().getLists().getCount() == 0) {
            return;
        }
        zzYhW();
        zzYhU();
    }

    private void zzZ(ListLevel listLevel, int i, boolean z) throws Exception {
        this.zzXwl.zzYfW().zzCC("\\listlevel");
        int numberStyle = listLevel.getNumberStyle();
        this.zzXwl.zzYfW().zzZ5("\\levelnfc", numberStyle);
        this.zzXwl.zzYfW().zzZ5("\\levelnfcn", numberStyle);
        int alignment = listLevel.getAlignment();
        this.zzXwl.zzYfW().zzZ5("\\leveljc", alignment);
        this.zzXwl.zzYfW().zzZ5("\\leveljcn", alignment);
        this.zzXwl.zzYfW().zzZ5("\\levelstartat", listLevel.getStartAt());
        if (listLevel.getLegacy()) {
            this.zzXwl.zzYfW().zz5("\\levelold", true);
            this.zzXwl.zzYfW().zz5("\\levelprev", listLevel.zzYO8());
            this.zzXwl.zzYfW().zz5("\\levelprevspace", listLevel.zzYO7());
            this.zzXwl.zzYfW().zzZ5("\\levelindent", listLevel.zzYO5());
            this.zzXwl.zzYfW().zzZ5("\\levelspace", listLevel.zzYO6());
        }
        this.zzXwl.zzYfW().zzCC("\\leveltext");
        if (z) {
            this.zzXwl.zzYfW().zzZ5("\\leveltemplateid", i);
        }
        StringBuilder sbZzCh = zzCh(listLevel.getNumberFormat());
        this.zzXwl.zzYfW().zzYj8();
        this.zzXwl.zzYfW().zzYj3();
        this.zzXwl.zzYfW().zzCC("\\levelnumbers");
        for (int i2 = 0; i2 < sbZzCh.length(); i2++) {
            this.zzXwl.zzYfW().zzY0(sbZzCh.charAt(i2));
        }
        this.zzXwl.zzYfW().zzYj8();
        this.zzXwl.zzYfW().zzYj3();
        this.zzXwl.zzYfW().zzZ5("\\levelfollow", listLevel.getTrailingCharacter());
        this.zzXwl.zzYfW().zz7("\\levellegal", listLevel.isLegal());
        this.zzXwl.zzYfW().zz7("\\levelnorestart", listLevel.zzYO9());
        this.zzXwl.zzYel().zzW(listLevel.zzZYh(), false);
        if (listLevel.zzYOc() != 12287) {
            this.zzXwl.zzYfW().zzZ5("\\s", listLevel.zzYOc());
        }
        this.zzXwl.zzYek().zzY(listLevel.zzZYj(), false, true);
        if (listLevel.zzYOb()) {
            this.zzXwl.zzYfW().zzZ5("\\levelpicture", listLevel.zzZ0p());
        }
        this.zzXwl.zzYfW().zzYj3();
        this.zzXwl.zzYfW().zzFg();
    }
}
