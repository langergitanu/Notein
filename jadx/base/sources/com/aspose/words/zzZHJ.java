package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZHJ extends zzYJG {
    public zzZHJ(String str, zzY86 zzy86) throws Exception {
        super(str, zzy86, "", "", "Frame file cannot be written to disk when saving the document to a stream.", false, false);
    }

    public final String zzX(Frameset frameset) throws Exception {
        frameset.zzZ5x();
        com.aspose.words.internal.zzZYD.zzXk(frameset.getFrameDefaultUrl());
        String strZzVh = com.aspose.words.internal.zzZOQ.zzVh(frameset.getFrameDefaultUrl());
        if (zzYlL() != null) {
            zzYlL().zzX(new zzYM("application/octet-stream", strZzVh, frameset.zzZ5E()));
            return strZzVh;
        }
        zzYlM();
        com.aspose.words.internal.zzZOS zzzosZzVl = com.aspose.words.internal.zzZOU.zzVl(zzCM(strZzVh));
        try {
            zzzosZzVl.write(frameset.zzZ5E(), 0, frameset.zzZ5E().length);
            return strZzVh;
        } finally {
            zzzosZzVl.close();
        }
    }
}
