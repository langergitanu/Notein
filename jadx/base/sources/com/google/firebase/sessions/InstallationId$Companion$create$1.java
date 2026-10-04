package com.google.firebase.sessions;

import com.google.firebase.sessions.InstallationId;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80613k = 3, m80614mv = {2, 0, 0}, m80616xi = 48)
@InterfaceC32482OooO0o0(m80622c = "com.google.firebase.sessions.InstallationId$Companion", m80623f = "InstallationId.kt", m80624l = {31, 39}, m80625m = "create")
public final class InstallationId$Companion$create$1 extends AbstractC32479OooO0OO {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InstallationId.Companion this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstallationId$Companion$create$1(InstallationId.Companion companion, Continuation<? super InstallationId$Companion$create$1> continuation) {
        super(continuation);
        this.this$0 = companion;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.create(null, this);
    }
}
