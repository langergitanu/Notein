package com.google.android.play.integrity.internal;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.play.integrity.internal.d */
/* JADX INFO: loaded from: classes7.dex */
public final class C16393d {
    /* JADX INFO: renamed from: a */
    public static final List m75045a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC16395f abstractC16395f = (AbstractC16395f) it.next();
            Bundle bundle = new Bundle();
            bundle.putInt("event_type", abstractC16395f.mo75047a());
            bundle.putLong("event_timestamp", abstractC16395f.mo75048b());
            arrayList.add(bundle);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public static final void m75046b(int i, List list) {
        list.add(AbstractC16395f.m75049c(i, System.currentTimeMillis()));
    }
}
