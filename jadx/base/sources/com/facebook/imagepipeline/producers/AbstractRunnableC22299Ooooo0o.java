package com.facebook.imagepipeline.producers;

import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.Ooooo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractRunnableC22299Ooooo0o<T> implements Runnable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final OooO<T> f67449OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final AtomicInteger f67450OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final InterfaceC22288OoooO f67451OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final o000oOoO f67452OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final String f67453OooOoOO;

    public AbstractRunnableC22299Ooooo0o(OooO<T> consumer, o000oOoO producerListener, InterfaceC22288OoooO producerContext, String producerName) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(consumer, "consumer");
        kotlin.jvm.internal.OooOOO0.OooO0oO(producerListener, "producerListener");
        kotlin.jvm.internal.OooOOO0.OooO0oO(producerContext, "producerContext");
        kotlin.jvm.internal.OooOOO0.OooO0oO(producerName, "producerName");
        this.f67450OooOo0o = new AtomicInteger(0);
        this.f67449OooOo = consumer;
        this.f67452OooOoO0 = producerListener;
        this.f67451OooOoO = producerContext;
        this.f67453OooOoOO = producerName;
        producerListener.OooO0OO(producerContext, producerName);
    }

    public final void OooO00o() {
        if (this.f67450OooOo0o.compareAndSet(0, 2)) {
            OooO0o0();
        }
    }

    public abstract void OooO0O0(Object obj);

    public Map<String, String> OooO0OO(T t) {
        return null;
    }

    public abstract Object OooO0Oo() throws Exception;

    public void OooO0o(Exception exc) {
        o000oOoO o000oooo2 = this.f67452OooOoO0;
        InterfaceC22288OoooO interfaceC22288OoooO = this.f67451OooOoO;
        String str = this.f67453OooOoOO;
        o000oooo2.OooO0Oo(interfaceC22288OoooO, str);
        o000oooo2.OooOO0O(interfaceC22288OoooO, str, exc, null);
        this.f67449OooOo.onFailure(exc);
    }

    public void OooO0o0() {
        o000oOoO o000oooo2 = this.f67452OooOoO0;
        InterfaceC22288OoooO interfaceC22288OoooO = this.f67451OooOoO;
        String str = this.f67453OooOoOO;
        o000oooo2.OooO0Oo(interfaceC22288OoooO, str);
        o000oooo2.OooO0oO(interfaceC22288OoooO, str);
        this.f67449OooOo.OooO0O0();
    }

    public void OooO0oO(T t) {
        o000oOoO o000oooo2 = this.f67452OooOoO0;
        InterfaceC22288OoooO interfaceC22288OoooO = this.f67451OooOoO;
        String str = this.f67453OooOoOO;
        o000oooo2.OooO(interfaceC22288OoooO, str, o000oooo2.OooO0Oo(interfaceC22288OoooO, str) ? OooO0OO(t) : null);
        this.f67449OooOo.OooO00o(1, t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        AtomicInteger atomicInteger = this.f67450OooOo0o;
        if (atomicInteger.compareAndSet(0, 1)) {
            try {
                Object objOooO0Oo = OooO0Oo();
                atomicInteger.set(3);
                try {
                    OooO0oO(objOooO0Oo);
                } finally {
                    OooO0O0(objOooO0Oo);
                }
            } catch (Exception e) {
                atomicInteger.set(4);
                OooO0o(e);
            }
        }
    }
}
