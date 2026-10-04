package com.facebook.imagepipeline.producers;

import android.util.Pair;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.Oooooo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C22304Oooooo0<T> implements InterfaceC22291OoooO0O<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C22297OoooOoo f67466OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f67467OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ConcurrentLinkedQueue<Pair<OooO<T>, InterfaceC22288OoooO>> f67468OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Executor f67469OooO0Oo;

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.Oooooo0$OooO00o */
    public class OooO00o extends OooOOOO<T, T> {

        /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.Oooooo0$OooO00o$OooO00o, reason: collision with other inner class name */
        public class RunnableC19104OooO00o implements Runnable {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ Pair f67472OooOo0o;

            public RunnableC19104OooO00o(Pair pair) {
                this.f67472OooOo0o = pair;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C22304Oooooo0 c22304Oooooo0 = C22304Oooooo0.this;
                Pair pair = this.f67472OooOo0o;
                OooO oooO = (OooO) pair.first;
                InterfaceC22288OoooO interfaceC22288OoooO = (InterfaceC22288OoooO) pair.second;
                c22304Oooooo0.getClass();
                interfaceC22288OoooO.OooOOo0().OooO(interfaceC22288OoooO, "ThrottlingProducer", null);
                c22304Oooooo0.f67466OooO00o.OooO00o(new OooO00o(oooO), interfaceC22288OoooO);
            }
        }

        public OooO00o(OooO oooO) {
            super(oooO);
        }

        @Override // com.facebook.imagepipeline.producers.OooOOOO, com.facebook.imagepipeline.producers.OooO0O0
        public final void OooO0o() {
            this.f67330OooO0O0.OooO0O0();
            OooOO0o();
        }

        @Override // com.facebook.imagepipeline.producers.OooOOOO, com.facebook.imagepipeline.producers.OooO0O0
        public final void OooO0oO(Throwable th) {
            this.f67330OooO0O0.onFailure(th);
            OooOO0o();
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // com.facebook.imagepipeline.producers.OooO0O0
        public final void OooO0oo(int i, Object obj) {
            this.f67330OooO0O0.OooO00o(i, obj);
            if (OooO0O0.OooO0Oo(i)) {
                OooOO0o();
            }
        }

        public final void OooOO0o() {
            Pair<OooO<T>, InterfaceC22288OoooO> pairPoll;
            synchronized (C22304Oooooo0.this) {
                try {
                    pairPoll = C22304Oooooo0.this.f67468OooO0OO.poll();
                    if (pairPoll == null) {
                        C22304Oooooo0 c22304Oooooo0 = C22304Oooooo0.this;
                        c22304Oooooo0.f67467OooO0O0--;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (pairPoll != null) {
                C22304Oooooo0.this.f67469OooO0Oo.execute(new RunnableC19104OooO00o(pairPoll));
            }
        }
    }

    public C22304Oooooo0(Executor executor, C22297OoooOoo c22297OoooOoo) {
        executor.getClass();
        this.f67469OooO0Oo = executor;
        this.f67466OooO00o = c22297OoooOoo;
        this.f67468OooO0OO = new ConcurrentLinkedQueue<>();
        this.f67467OooO0O0 = 0;
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC22291OoooO0O
    public final void OooO00o(OooO<T> oooO, InterfaceC22288OoooO interfaceC22288OoooO) {
        boolean z;
        interfaceC22288OoooO.OooOOo0().OooO0OO(interfaceC22288OoooO, "ThrottlingProducer");
        synchronized (this) {
            try {
                int i = this.f67467OooO0O0;
                z = true;
                if (i >= 5) {
                    this.f67468OooO0OO.add(Pair.create(oooO, interfaceC22288OoooO));
                } else {
                    this.f67467OooO0O0 = i + 1;
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            return;
        }
        interfaceC22288OoooO.OooOOo0().OooO(interfaceC22288OoooO, "ThrottlingProducer", null);
        this.f67466OooO00o.OooO00o(new OooO00o(oooO), interfaceC22288OoooO);
    }
}
