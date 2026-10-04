package com.google.firebase.firestore.local;

import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.firestore.local.LruGarbageCollector;
import com.orion.notein.p607ui.noteeditor.propertypanel.p608ai.EditorChatFragment;

/* JADX INFO: renamed from: com.google.firebase.firestore.local.OooOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class RunnableC22649OooOoo implements Runnable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f68238OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f68239OooOo0o;

    public /* synthetic */ RunnableC22649OooOoo(Object obj, int i) {
        this.f68239OooOo0o = i;
        this.f68238OooOo = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f68239OooOo0o) {
            case 0:
                ((LruGarbageCollector.GCScheduler) this.f68238OooOo).lambda$scheduleGC$0();
                return;
            default:
                RecyclerView recyclerView = ((EditorChatFragment) this.f68238OooOo).f75506Oooo00o;
                if (recyclerView != null) {
                    recyclerView.scrollBy(0, 1000);
                    return;
                } else {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("chatRecycler");
                    throw null;
                }
        }
    }
}
