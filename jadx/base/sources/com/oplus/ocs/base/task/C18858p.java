package com.oplus.ocs.base.task;

import com.oplus.ocs.base.utils.C18864d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.oplus.ocs.base.task.p */
/* JADX INFO: loaded from: classes9.dex */
final class C18858p<TResult> implements Continuation<Void, List<TResult>> {

    /* JADX INFO: renamed from: a */
    private Collection<? extends Task<?>> f57602a;

    public C18858p(Collection<? extends Task<?>> collection) {
        this.f57602a = collection;
    }

    @Override // com.oplus.ocs.base.task.Continuation
    public final /* synthetic */ Object then(Task<Void> task) {
        C18864d.m80553a(task);
        ArrayList arrayList = new ArrayList();
        Iterator<? extends Task<?>> it = this.f57602a.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getResult());
        }
        return arrayList;
    }
}
