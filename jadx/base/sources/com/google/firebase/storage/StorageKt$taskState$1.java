package com.google.firebase.storage;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.storage.StorageTask;
import com.google.firebase.storage.TaskState;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import o00ooO0.C25749OooOoO0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33633Oooo0;
import oO0o0OOo.C33711OooOo00;
import oO0o0OOo.InterfaceC33712OooOo0O;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0012\b\u0000\u0010\u0002*\f0\u0000R\b\u0012\u0004\u0012\u00028\u00000\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m80612d2 = {"Lcom/google/firebase/storage/StorageTask$SnapshotBase;", "Lcom/google/firebase/storage/StorageTask;", "T", "LoO0o0OOo/OooOo0O;", "Lcom/google/firebase/storage/TaskState;", "LoO00ooO/OooOooO;", "<anonymous>", "(LoO0o0OOo/OooOo0O;)V"}, m80613k = 3, m80614mv = {2, 0, 0})
@InterfaceC32482OooO0o0(m80622c = "com.google.firebase.storage.StorageKt$taskState$1", m80623f = "Storage.kt", m80624l = {173}, m80625m = "invokeSuspend")
public final class StorageKt$taskState$1<T> extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33712OooOo0O<? super TaskState<T>>, Continuation<? super C32460OooOooO>, Object> {
    final /* synthetic */ StorageTask<T> $this_taskState;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StorageKt$taskState$1(StorageTask<T> storageTask, Continuation<? super StorageKt$taskState$1> continuation) {
        super(2, continuation);
        this.$this_taskState = storageTask;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$1(final InterfaceC33712OooOo0O interfaceC33712OooOo0O, final StorageTask.SnapshotBase snapshotBase) {
        StorageTaskScheduler.getInstance().scheduleCallback(new Runnable() { // from class: com.google.firebase.storage.OooO00o
            @Override // java.lang.Runnable
            public final void run() {
                StorageKt$taskState$1.invokeSuspend$lambda$1$lambda$0(interfaceC33712OooOo0O, snapshotBase);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$1$lambda$0(InterfaceC33712OooOo0O interfaceC33712OooOo0O, StorageTask.SnapshotBase snapshotBase) {
        C25749OooOoO0.OooO0o0(interfaceC33712OooOo0O, new TaskState.InProgress(snapshotBase));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$3(final InterfaceC33712OooOo0O interfaceC33712OooOo0O, final StorageTask.SnapshotBase snapshotBase) {
        StorageTaskScheduler.getInstance().scheduleCallback(new Runnable() { // from class: com.google.firebase.storage.OooO0o
            @Override // java.lang.Runnable
            public final void run() {
                StorageKt$taskState$1.invokeSuspend$lambda$3$lambda$2(interfaceC33712OooOo0O, snapshotBase);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$3$lambda$2(InterfaceC33712OooOo0O interfaceC33712OooOo0O, StorageTask.SnapshotBase snapshotBase) {
        C25749OooOoO0.OooO0o0(interfaceC33712OooOo0O, new TaskState.Paused(snapshotBase));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$4(InterfaceC33712OooOo0O interfaceC33712OooOo0O, Task task) {
        if (task.isSuccessful()) {
            interfaceC33712OooOo0O.OooO0Oo(null);
        } else {
            C33633Oooo0.OooO0OO(interfaceC33712OooOo0O, "Error getting the TaskState", task.getException());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C32460OooOooO invokeSuspend$lambda$5(StorageTask storageTask, OnProgressListener onProgressListener, OnPausedListener onPausedListener, OnCompleteListener onCompleteListener) {
        storageTask.removeOnProgressListener(onProgressListener);
        storageTask.removeOnPausedListener(onPausedListener);
        storageTask.removeOnCompleteListener(onCompleteListener);
        return C32460OooOooO.f116667OooO00o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        StorageKt$taskState$1 storageKt$taskState$1 = new StorageKt$taskState$1(this.$this_taskState, continuation);
        storageKt$taskState$1.L$0 = obj;
        return storageKt$taskState$1;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.firebase.storage.OnProgressListener, com.google.firebase.storage.OooO0O0] */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.google.firebase.storage.OnPausedListener, com.google.firebase.storage.OooO0OO] */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.google.android.gms.tasks.OnCompleteListener, com.google.firebase.storage.OooO0Oo] */
    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.label;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            final InterfaceC33712OooOo0O interfaceC33712OooOo0O = (InterfaceC33712OooOo0O) this.L$0;
            final ?? r1 = new OnProgressListener() { // from class: com.google.firebase.storage.OooO0O0
                @Override // com.google.firebase.storage.OnProgressListener
                public final void onProgress(Object obj2) {
                    StorageKt$taskState$1.invokeSuspend$lambda$1(interfaceC33712OooOo0O, (StorageTask.SnapshotBase) obj2);
                }
            };
            final ?? r3 = new OnPausedListener() { // from class: com.google.firebase.storage.OooO0OO
                @Override // com.google.firebase.storage.OnPausedListener
                public final void onPaused(Object obj2) {
                    StorageKt$taskState$1.invokeSuspend$lambda$3(interfaceC33712OooOo0O, (StorageTask.SnapshotBase) obj2);
                }
            };
            final ?? r4 = new OnCompleteListener() { // from class: com.google.firebase.storage.OooO0Oo
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    StorageKt$taskState$1.invokeSuspend$lambda$4(interfaceC33712OooOo0O, task);
                }
            };
            this.$this_taskState.addOnProgressListener((OnProgressListener) r1);
            this.$this_taskState.addOnPausedListener((OnPausedListener) r3);
            this.$this_taskState.addOnCompleteListener((OnCompleteListener) r4);
            final StorageTask<T> storageTask = this.$this_taskState;
            oO0O000o.OooO00o oooO00o = new oO0O000o.OooO00o() { // from class: com.google.firebase.storage.OooO0o0
                @Override // oO0O000o.OooO00o
                public final Object invoke() {
                    OooO0OO oooO0OO = r3;
                    C22801OooO0Oo c22801OooO0Oo = r4;
                    return StorageKt$taskState$1.invokeSuspend$lambda$5(storageTask, r1, oooO0OO, c22801OooO0Oo);
                }
            };
            this.label = 1;
            if (C33711OooOo00.OooO00o(interfaceC33712OooOo0O, oooO00o, this) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        return C32460OooOooO.f116667OooO00o;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33712OooOo0O<? super TaskState<T>> interfaceC33712OooOo0O, Continuation<? super C32460OooOooO> continuation) {
        return ((StorageKt$taskState$1) create(interfaceC33712OooOo0O, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }
}
