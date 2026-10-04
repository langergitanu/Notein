package com.oplus.ocs.base.task;

import com.oplus.ocs.base.utils.C18864d;
import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: renamed from: com.oplus.ocs.base.task.q */
/* JADX INFO: loaded from: classes9.dex */
public final class C18859q<TResult> {

    /* JADX INFO: renamed from: a */
    private Object f57603a = new Object();

    /* JADX INFO: renamed from: b */
    private Queue<InterfaceC18844b<TResult>> f57604b;

    /* JADX INFO: renamed from: c */
    private boolean f57605c;

    /* JADX INFO: renamed from: a */
    public final void m80539a(InterfaceC18844b<TResult> interfaceC18844b) {
        C18864d.m80554a(interfaceC18844b, "Cancellable is not be null");
        synchronized (this.f57603a) {
            try {
                if (this.f57604b == null) {
                    this.f57604b = new ArrayDeque();
                }
                this.f57604b.add(interfaceC18844b);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m80538a(Task<TResult> task) {
        InterfaceC18844b<TResult> interfaceC18844bPoll;
        C18864d.m80554a(task, "Task is not be null");
        synchronized (this.f57603a) {
            if (this.f57604b != null && !this.f57605c) {
                this.f57605c = true;
                while (true) {
                    synchronized (this.f57603a) {
                        try {
                            interfaceC18844bPoll = this.f57604b.poll();
                            if (interfaceC18844bPoll == null) {
                                this.f57605c = false;
                                return;
                            }
                        } finally {
                        }
                    }
                    interfaceC18844bPoll.mo80533a(task);
                }
            }
        }
    }
}
