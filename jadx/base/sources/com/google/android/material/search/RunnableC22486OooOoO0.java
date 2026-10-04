package com.google.android.material.search;

import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.p607ui.label.LabelManagementBottomSheet;

/* JADX INFO: renamed from: com.google.android.material.search.OooOoO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class RunnableC22486OooOoO0 implements Runnable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f67743OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f67744OooOo0o;

    public /* synthetic */ RunnableC22486OooOoO0(Object obj, int i) {
        this.f67744OooOo0o = i;
        this.f67743OooOo = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f67744OooOo0o) {
            case 0:
                ((SearchView) this.f67743OooOo).requestFocusAndShowKeyboardIfNeeded();
                return;
            default:
                RecyclerView recyclerView = ((LabelManagementBottomSheet) this.f67743OooOo).f71894Oooo00O;
                if (recyclerView != null) {
                    recyclerView.smoothScrollToPosition(0);
                    return;
                } else {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("labelList");
                    throw null;
                }
        }
    }
}
