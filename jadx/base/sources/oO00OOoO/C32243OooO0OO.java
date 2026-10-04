package oO00OOoO;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24039Oooo0o0;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32510OooOOo0;

/* JADX INFO: renamed from: oO00OOoO.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32243OooO0OO<TSubject, Call> {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final ArrayList f115807OooO0o0 = new ArrayList();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00O00o0.OooO0O0 f115808OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final AbstractC32247OooO0oO f115809OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public List<InterfaceC32510OooOOo0<AbstractC32246OooO0o0<TSubject, Call>, TSubject, Continuation<? super C32460OooOooO>, Object>> f115810OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f115811OooO0Oo;

    public C32243OooO0OO() {
        throw null;
    }

    public C32243OooO0OO(o00O00o0.OooO0O0 phase, AbstractC32247OooO0oO relation) {
        OooOOO0.OooO0oO(phase, "phase");
        OooOOO0.OooO0oO(relation, "relation");
        ArrayList arrayList = f115807OooO0o0;
        OooOOO0.OooO0o0(arrayList, "null cannot be cast to non-null type kotlin.collections.MutableList<kotlin.Function3<io.ktor.util.pipeline.PipelineContext<TSubject of io.ktor.util.pipeline.PhaseContent, Call of io.ktor.util.pipeline.PhaseContent>, TSubject of io.ktor.util.pipeline.PhaseContent, kotlin.coroutines.Continuation<kotlin.Unit>, kotlin.Any?>{ io.ktor.util.pipeline.PipelineKt.PipelineInterceptorFunction<TSubject of io.ktor.util.pipeline.PhaseContent, Call of io.ktor.util.pipeline.PhaseContent> }>");
        List<InterfaceC32510OooOOo0<AbstractC32246OooO0o0<TSubject, Call>, TSubject, Continuation<? super C32460OooOooO>, Object>> interceptors = C24039Oooo0o0.OooO0O0(arrayList);
        OooOOO0.OooO0oO(interceptors, "interceptors");
        this.f115808OooO00o = phase;
        this.f115809OooO0O0 = relation;
        this.f115810OooO0OO = interceptors;
        this.f115811OooO0Oo = true;
        if (!arrayList.isEmpty()) {
            throw new IllegalStateException("The shared empty array list has been modified");
        }
    }

    public final void OooO00o(InterfaceC32510OooOOo0<? super AbstractC32246OooO0o0<TSubject, Call>, ? super TSubject, ? super Continuation<? super C32460OooOooO>, ? extends Object> interfaceC32510OooOOo0) {
        if (this.f115811OooO0Oo) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.f115810OooO0OO);
            this.f115810OooO0OO = arrayList;
            this.f115811OooO0Oo = false;
        }
        this.f115810OooO0OO.add(interfaceC32510OooOOo0);
    }

    public final String toString() {
        return "Phase `" + ((String) this.f115808OooO00o.f84154OooO0O0) + "`, " + this.f115810OooO0OO.size() + " handlers";
    }
}
