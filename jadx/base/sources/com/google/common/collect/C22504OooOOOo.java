package com.google.common.collect;

import com.google.common.collect.ImmutableTable;
import java.util.function.Supplier;
import ooOOOOoo.C35079OooOoO;

/* JADX INFO: renamed from: com.google.common.collect.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C22504OooOOOo implements Supplier {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f67814OooO00o;

    public /* synthetic */ C22504OooOOOo(int i) {
        this.f67814OooO00o = i;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.f67814OooO00o) {
            case 0:
                return new ImmutableTable.Builder();
            default:
                return C35079OooOoO.f126001OooO0oo;
        }
    }
}
