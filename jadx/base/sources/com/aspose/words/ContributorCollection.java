package com.aspose.words;

import com.aspose.words.ref.Ref;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class ContributorCollection implements Iterable<Contributor> {
    private Map<Integer, Contributor> zzZse = new HashMap();

    private Contributor zzME(int i) {
        Ref ref = new Ref(null);
        boolean zZzZ = com.aspose.words.internal.zzZQF.zzZ((Map<Integer, V>) this.zzZse, Integer.valueOf(i), ref);
        Contributor contributor = (Contributor) ref.get();
        if (zZzZ) {
            return contributor;
        }
        return null;
    }

    public final Contributor getArtist() {
        return zzME(0);
    }

    public final Contributor getAuthor() {
        return zzME(1);
    }

    public final Contributor getBookAuthor() {
        return zzME(2);
    }

    public final Contributor getCompiler() {
        return zzME(3);
    }

    public final Contributor getComposer() {
        return zzME(4);
    }

    public final Contributor getConductor() {
        return zzME(5);
    }

    public final Contributor getCounsel() {
        return zzME(6);
    }

    public final Contributor getDirector() {
        return zzME(7);
    }

    public final Contributor getEditor() {
        return zzME(8);
    }

    public final Contributor getInterviewee() {
        return zzME(9);
    }

    public final Contributor getInterviewer() {
        return zzME(10);
    }

    public final Contributor getInventor() {
        return zzME(11);
    }

    public final Contributor getPerformer() {
        return zzME(12);
    }

    public final Contributor getProducer() {
        return zzME(13);
    }

    public final Contributor getTranslator() {
        return zzME(14);
    }

    public final Contributor getWriter() {
        return zzME(15);
    }

    @Override // java.lang.Iterable
    @ReservedForInternalUse
    @Deprecated
    public final Iterator<Contributor> iterator() {
        return this.zzZse.values().iterator();
    }

    public final void zzZ(Contributor contributor, int i) {
        this.zzZse.put(Integer.valueOf(i), contributor);
    }
}
