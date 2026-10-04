package com.orion.notein.domain.mapper;

import com.orion.notein.domain.models.page.PageLayer;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class OooO0OO implements Predicate {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ PageLayer.Companion f70407OooO00o;

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        return this.f70407OooO00o.isRegularLayerId((String) obj);
    }
}
