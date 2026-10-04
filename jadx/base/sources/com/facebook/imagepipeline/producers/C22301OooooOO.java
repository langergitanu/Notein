package com.facebook.imagepipeline.producers;

import o00ooO.C25732OooO0O0;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.OooooOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C22301OooooOO<T> implements InterfaceC22291OoooO0O<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC22291OoooO0O<T> f67455OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C22302OooooOo f67456OooO0O0;

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.OooooOO$OooO00o */
    public static final class OooO00o {
    }

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.OooooOO$OooO0O0 */
    public static final class OooO0O0 extends C22260OooO0Oo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ OooO0OO f67457OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ C22301OooooOO<T> f67458OooO0O0;

        public OooO0O0(OooO0OO oooO0OO, C22301OooooOO c22301OooooOO) {
            this.f67457OooO00o = oooO0OO;
            this.f67458OooO0O0 = c22301OooooOO;
        }

        @Override // com.facebook.imagepipeline.producers.InterfaceC22292OoooOO0
        public final void OooO0O0() {
            this.f67457OooO00o.OooO00o();
            C22302OooooOo c22302OooooOo = this.f67458OooO0O0.f67456OooO0O0;
            OooO0OO oooO0OO = this.f67457OooO00o;
            synchronized (c22302OooooOo) {
                c22302OooooOo.f67464OooO0O0.remove(oooO0OO);
            }
        }
    }

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.OooooOO$OooO0OO */
    public static final class OooO0OO extends AbstractRunnableC22299Ooooo0o<T> {

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        public final /* synthetic */ o000oOoO f67459OooOoo;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public final /* synthetic */ OooO<T> f67460OooOoo0;

        /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22288OoooO f67461OooOooO;

        /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
        public final /* synthetic */ C22301OooooOO<T> f67462OooOooo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(OooO<T> oooO, o000oOoO o000oooo2, InterfaceC22288OoooO interfaceC22288OoooO, C22301OooooOO<T> c22301OooooOO) {
            super(oooO, o000oooo2, interfaceC22288OoooO, "BackgroundThreadHandoffProducer");
            this.f67460OooOoo0 = oooO;
            this.f67459OooOoo = o000oooo2;
            this.f67461OooOooO = interfaceC22288OoooO;
            this.f67462OooOooo = c22301OooooOO;
        }

        @Override // com.facebook.imagepipeline.producers.AbstractRunnableC22299Ooooo0o
        public final void OooO0O0(T t) {
        }

        @Override // com.facebook.imagepipeline.producers.AbstractRunnableC22299Ooooo0o
        public final T OooO0Oo() throws Exception {
            return null;
        }

        @Override // com.facebook.imagepipeline.producers.AbstractRunnableC22299Ooooo0o
        public final void OooO0oO(T t) {
            o000oOoO o000oooo2 = this.f67459OooOoo;
            InterfaceC22288OoooO interfaceC22288OoooO = this.f67461OooOooO;
            o000oooo2.OooO(interfaceC22288OoooO, "BackgroundThreadHandoffProducer", null);
            this.f67462OooOooo.f67455OooO00o.OooO00o(this.f67460OooOoo0, interfaceC22288OoooO);
        }
    }

    public C22301OooooOO(InterfaceC22291OoooO0O<T> inputProducer, C22302OooooOo threadHandoffProducerQueue) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(inputProducer, "inputProducer");
        kotlin.jvm.internal.OooOOO0.OooO0oO(threadHandoffProducerQueue, "threadHandoffProducerQueue");
        this.f67455OooO00o = inputProducer;
        this.f67456OooO0O0 = threadHandoffProducerQueue;
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC22291OoooO0O
    public final void OooO00o(OooO<T> consumer, InterfaceC22288OoooO context) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(consumer, "consumer");
        kotlin.jvm.internal.OooOOO0.OooO0oO(context, "context");
        C25732OooO0O0.OooO00o();
        C22302OooooOo c22302OooooOo = this.f67456OooO0O0;
        o000oOoO o000ooooOooOOo0 = context.OooOOo0();
        context.OooOOO0().OooO0O0().getClass();
        OooO0OO oooO0OO = new OooO0OO(consumer, o000ooooOooOOo0, context, this);
        context.OooO0OO(new OooO0O0(oooO0OO, this));
        synchronized (c22302OooooOo) {
            c22302OooooOo.f67463OooO00o.execute(oooO0OO);
        }
    }
}
