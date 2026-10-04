package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzYUM {
    public abstract void zzT(zzYEF zzyef) throws Exception;

    public abstract void zzW(Inline inline) throws Exception;

    public abstract void zzY(Inline inline) throws Exception;

    public final void zzZ(zzZ9W zzz9w, Inline inline) throws Exception {
        zzYEJ zzyej = (zzYEJ) inline.zzZYh().get(885);
        zzW(inline);
        zzYU6 zzyu6ZzZm2 = zzz9w.zzZm2();
        zzyu6ZzZm2.zzY("w:ruby");
        zzyu6ZzZm2.zzY("w:rubyPr");
        zzyu6ZzZm2.zzYz("w:rubyAlign", zzYUQ.zzt4(zzyej.zzZGm));
        zzyu6ZzZm2.zzZl("w:hps", zzyej.zzXql);
        zzyu6ZzZm2.zzZl("w:hpsRaise", zzyej.zzXqj);
        zzyu6ZzZm2.zzZl("w:hpsBaseText", zzyej.zzXqk);
        zzyu6ZzZm2.zzYz("w:lid", zzz9w.zzZmh() ? com.aspose.words.internal.zzBM.zzVn(zzyej.zzQy) : com.aspose.words.internal.zzBM.zzVm(zzyej.zzQy));
        zzyu6ZzZm2.zzo();
        zzyu6ZzZm2.zzY("w:rt");
        zzZ(zzz9w, zzyej.zzYe7());
        zzyu6ZzZm2.zzo();
        zzyu6ZzZm2.zzY("w:rubyBase");
        zzZ(zzz9w, zzyej.zzYe6());
        zzyu6ZzZm2.zzo();
        zzyu6ZzZm2.zzo();
        zzT(inline.zzZYh());
    }

    private void zzZ(zzZ9W zzz9w, zzYEH zzyeh) throws Exception {
        for (zzYEI zzyei : zzyeh) {
            zzY(new Run(zzz9w.getDocument(), zzyei.zzZAL, zzyei.zzXqg));
        }
    }
}
