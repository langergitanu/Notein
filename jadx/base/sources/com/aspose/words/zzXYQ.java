package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzXYQ {
    private com.aspose.words.internal.zzZQC<com.aspose.words.internal.zzZYT<String>> zzWS3 = new com.aspose.words.internal.zzZQC<>();
    private com.aspose.words.internal.zzZYT<String> zzWS2 = new com.aspose.words.internal.zzZYT<>(false);

    public zzXYQ(zzZG4 zzzg4) {
        for (zzZIG zzzigZzZ0e = zzzg4.zzZ0e(); zzzigZzZ0e != null; zzzigZzZ0e = zzzigZzZ0e.zzZ0e()) {
            zzZ(this.zzWS2, zzzigZzZ0e.zzZ2B(), false);
        }
        if (this.zzWS2.containsKey("xml")) {
            return;
        }
        this.zzWS2.zzB("xml", "http://www.w3.org/XML/1998/namespace");
    }

    private com.aspose.words.internal.zzZYT<String> zzXQw() {
        return this.zzWS3.peek();
    }

    private static void zzZ(com.aspose.words.internal.zzZYT<String> zzzyt, zzZK8 zzzk8, boolean z) {
        for (zzZK9 zzzk9 : zzzk8) {
            if (com.aspose.words.internal.zzZKN.zzS(zzzk9.getName(), "xmlns:", com.aspose.words.internal.zzZOF.ORDINAL_IGNORE_CASE$4894b8c8)) {
                String strSubstring = zzzk9.getName().substring(6);
                if (!com.aspose.words.internal.zzZKN.equals(strSubstring, "") && (z || !zzzyt.containsKey(strSubstring))) {
                    zzzyt.set(strSubstring, zzzk9.getValue());
                }
            }
        }
    }

    public final void zz6(zzZIG zzzig) {
        com.aspose.words.internal.zzZYT<String> zzzyt = new com.aspose.words.internal.zzZYT<>(false);
        zzzyt.zzZ(this.zzWS3.size() != 0 ? zzXQw() : this.zzWS2);
        zzZ(zzzyt, zzzig.zzZ2B(), true);
        this.zzWS3.push(zzzyt);
    }

    public final void zzXQx() {
        if (zzXQw().containsKey("xlink")) {
            return;
        }
        zzXQw().zzB("xlink", "http://www.w3.org/1999/xlink");
    }

    public final void zzXQy() {
        this.zzWS3.size();
        this.zzWS3.pop();
    }

    public final boolean zzyd(String str) {
        this.zzWS3.size();
        int iIndexOf = str.indexOf(58);
        if (iIndexOf == -1) {
            return true;
        }
        String strSubstring = str.substring(0, iIndexOf);
        return com.aspose.words.internal.zzZYD.zzh(strSubstring, "xmlns") || zzXQw().containsKey(strSubstring);
    }
}
