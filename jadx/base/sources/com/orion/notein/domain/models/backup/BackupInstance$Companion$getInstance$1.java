package com.orion.notein.domain.models.backup;

import com.orion.notein.domain.models.backup.BackupInstance;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80613k = 3, m80614mv = {2, 1, 0}, m80616xi = 48)
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.models.backup.BackupInstance$Companion", m80623f = "BackupInstance.kt", m80624l = {99, 49}, m80625m = "getInstance")
public final class BackupInstance$Companion$getInstance$1 extends AbstractC32479OooO0OO {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BackupInstance.Companion this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackupInstance$Companion$getInstance$1(BackupInstance.Companion companion, Continuation<? super BackupInstance$Companion$getInstance$1> continuation) {
        super(continuation);
        this.this$0 = companion;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getInstance(null, this);
    }
}
