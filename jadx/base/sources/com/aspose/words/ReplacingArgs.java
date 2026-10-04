package com.aspose.words;

import java.util.regex.Matcher;

/* JADX INFO: loaded from: classes6.dex */
public class ReplacingArgs {
    private int zzXCg;
    private int zzXCh;
    private Node zzXCi;
    private com.aspose.words.internal.zzZNT zzXCj;
    private String zzYyM;

    public ReplacingArgs(com.aspose.words.internal.zzZNT zzznt, Node node, int i, String str) {
        this.zzXCj = zzznt;
        this.zzXCi = node;
        this.zzXCh = i;
        this.zzYyM = str;
    }

    public int getGroupIndex() {
        return this.zzXCg;
    }

    public Matcher getMatch() {
        return com.aspose.words.internal.zzZNT.zzZ(this.zzXCj);
    }

    public Node getMatchNode() {
        return this.zzXCi;
    }

    public int getMatchOffset() {
        return this.zzXCh;
    }

    public String getReplacement() {
        return this.zzYyM;
    }

    public void setGroupIndex(int i) {
        this.zzXCg = i;
    }

    public void setReplacement(String str) {
        com.aspose.words.internal.zzZ4.zzY((Object) str, "value");
        this.zzYyM = str;
    }

    public final com.aspose.words.internal.zzZNT zzYlS() {
        return this.zzXCj;
    }
}
