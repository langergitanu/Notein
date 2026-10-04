package com.oplus.ocs.base.task;

import com.oplus.ocs.base.utils.C18864d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: com.oplus.ocs.base.task.o */
/* JADX INFO: loaded from: classes9.dex */
final class C18857o implements Continuation<Void, Task<List<Task<?>>>> {

    /* JADX INFO: renamed from: a */
    private Collection f57601a;

    public C18857o(Collection collection) {
        this.f57601a = collection;
    }

    @Override // com.oplus.ocs.base.task.Continuation
    public final /* synthetic */ Task<List<Task<?>>> then(Task<Void> task) {
        C18864d.m80553a(task);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f57601a);
        return Tasks.forResult(arrayList);
    }
}
