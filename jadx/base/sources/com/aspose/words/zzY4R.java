package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY4R extends DocumentVisitor {
    public static String zzXG(char c) {
        return c < 4352 ? "Courier New" : (c < 19968 || c > 40959) ? (c < 11904 || c > 12271) ? (c < 12544 || c > 12591) ? (c < 12688 || c > 12783) ? (c < 65072 || c > 65103) ? (c < 12288 || c > 12543) ? (c < 12784 || c > 12799) ? (c < 12832 || c > 12895) ? (c < 12928 || c > 13055) ? (c < 13056 || c > 13311) ? (c < 64016 || c > 64255) ? ((c < 4352 || c > 4607) && (c < 12592 || c > 12687) && ((c < 43360 || c > 43391) && (c < 44032 || c > 55295))) ? ((c < 12800 || c > 12831) && (c < 12896 || c > 12927) && ((c < 13312 || c > 19903) && (c < 63744 || c > 64015))) ? (c < 12272 || c > 12287) ? (c < 40960 || c > 42191) ? "Courier New" : "Microsoft Yi Baiti" : "Microsoft YaHei" : "Malgun Gothic" : "Malgun Gothic" : "MS Gothic" : "MS Gothic" : "MS Gothic" : "MS Gothic" : "MS Gothic" : "MS Gothic" : "Microsoft JhengHei" : "Microsoft JhengHei" : "Microsoft JhengHei" : "Microsoft JhengHei" : "Microsoft JhengHei";
    }

    private static void zzZ(Run run, int i, String str) {
        Run run2 = new Run(run.getDocument(), run.getText().substring(0, i), (zzYEF) run.zzZYh().zzbn());
        run2.getFont().setName(str);
        run.zzYC(run2);
        run.setText(run.getText().substring(i));
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitRun(Run run) {
        String text = run.getText();
        if (!com.aspose.words.internal.zzZYD.zzXk(text)) {
            return 0;
        }
        String strZzXG = zzXG(text.charAt(0));
        int i = 0;
        for (int i2 = 1; i2 < text.length(); i2++) {
            String strZzXG2 = zzXG(text.charAt(i2));
            if (!com.aspose.words.internal.zzZKN.equals(strZzXG, strZzXG2)) {
                zzZ(run, i2 - i, strZzXG);
                i = i2;
                strZzXG = strZzXG2;
            }
        }
        run.getFont().setName(strZzXG);
        return 0;
    }
}
