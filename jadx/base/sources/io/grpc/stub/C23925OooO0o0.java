package io.grpc.stub;

import Oooo0oo.AbstractC21138OooO0oo;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import com.google.common.util.concurrent.AbstractFuture;
import com.google.protobuf.GeneratedMessageLite;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import oO0OOo0o.AbstractC33060OooO0Oo;
import oO0OOo0o.C33094OoooO;
import oO0OOo0o.C33101OoooOO0;
import oO0OOo0o.C33119o00o0O;
import oO0OOo0o.OooO0OO;
import oO0OOo0o.OooO0o;
import oO0OOo0o.o00Oo0;
import oO0OOo0o.o00Ooo;

/* JADX INFO: renamed from: io.grpc.stub.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C23925OooO0o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Logger f80311OooO00o = Logger.getLogger(C23925OooO0o0.class.getName());

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final boolean f80312OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final OooO0OO.OooO0O0<OooO0o> f80313OooO0OO;

    /* JADX INFO: renamed from: io.grpc.stub.OooO0o0$OooO00o */
    public static final class OooO00o<T> implements Iterator<T> {

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public Object f80316OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final oO0OOo0o.OooO0o<?, T> f80317OooOoO0;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final ArrayBlockingQueue f80315OooOo0o = new ArrayBlockingQueue(3);

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final C19589OooO00o f80314OooOo = new C19589OooO00o();

        /* JADX INFO: renamed from: io.grpc.stub.OooO0o0$OooO00o$OooO00o, reason: collision with other inner class name */
        public final class C19589OooO00o extends AbstractC23926OooO0Oo<T> {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public boolean f80318OooO00o = false;

            public C19589OooO00o() {
            }

            @Override // io.grpc.stub.C23925OooO0o0.AbstractC23926OooO0Oo
            public final void OooO00o() {
                OooO00o.this.f80317OooOoO0.request(1);
            }

            @Override // oO0OOo0o.OooO0o.OooO00o
            public final void onClose(o00Oo0 o00oo02, C33094OoooO c33094OoooO) {
                Preconditions.checkState(!this.f80318OooO00o, "ClientCall already closed");
                boolean zOooO0o = o00oo02.OooO0o();
                OooO00o oooO00o = OooO00o.this;
                if (zOooO0o) {
                    oooO00o.f80315OooOo0o.add(oooO00o);
                } else {
                    oooO00o.f80315OooOo0o.add(new C33119o00o0O(o00oo02, c33094OoooO));
                }
                this.f80318OooO00o = true;
            }

            @Override // oO0OOo0o.OooO0o.OooO00o
            public final void onHeaders(C33094OoooO c33094OoooO) {
            }

            @Override // oO0OOo0o.OooO0o.OooO00o
            public final void onMessage(T t) {
                Preconditions.checkState(!this.f80318OooO00o, "ClientCall already closed");
                OooO00o.this.f80315OooOo0o.add(t);
            }
        }

        public OooO00o(oO0OOo0o.OooO0o<?, T> oooO0o) {
            this.f80317OooOoO0 = oooO0o;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0029  */
        @Override // java.util.Iterator
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean hasNext() throws Throwable {
            Object obj;
            Object objTake;
            while (true) {
                obj = this.f80316OooOoO;
                boolean z = true;
                boolean z2 = false;
                if (obj != null) {
                    break;
                }
                while (true) {
                    try {
                        objTake = this.f80315OooOo0o.take();
                        break;
                    } catch (InterruptedException e) {
                        try {
                            this.f80317OooOoO0.cancel("Thread interrupted", e);
                            z2 = true;
                        } catch (Throwable th) {
                            th = th;
                            if (z) {
                                Thread.currentThread().interrupt();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        z = z2;
                        if (z) {
                        }
                        throw th;
                    }
                }
                if (z2) {
                    Thread.currentThread().interrupt();
                }
                this.f80316OooOoO = objTake;
            }
            if (!(obj instanceof C33119o00o0O)) {
                return obj != this;
            }
            C33119o00o0O c33119o00o0O = (C33119o00o0O) obj;
            o00Oo0 o00oo02 = c33119o00o0O.f119755OooOo0o;
            o00oo02.getClass();
            throw new C33119o00o0O(o00oo02, c33119o00o0O.f119754OooOo);
        }

        @Override // java.util.Iterator
        public final T next() {
            Object obj = this.f80316OooOoO;
            if (!(obj instanceof C33119o00o0O) && obj != this) {
                this.f80317OooOoO0.request(1);
            }
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T t = (T) this.f80316OooOoO;
            this.f80316OooOoO = null;
            return t;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: io.grpc.stub.OooO0o0$OooO0O0 */
    public static final class OooO0O0<ReqT> extends AbstractC21138OooO0oo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final oO0OOo0o.OooO0o<ReqT, ?> f80320OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final boolean f80321OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public boolean f80322OooO0OO = false;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public boolean f80323OooO0Oo = false;

        public OooO0O0(oO0OOo0o.OooO0o<ReqT, ?> oooO0o, boolean z) {
            this.f80320OooO00o = oooO0o;
            this.f80321OooO0O0 = z;
        }

        @Override // io.grpc.stub.OooO
        public final void OooOooO(C33119o00o0O c33119o00o0O) {
            this.f80320OooO00o.cancel("Cancelled by client with StreamObserver.onError()", c33119o00o0O);
            this.f80322OooO0OO = true;
        }

        @Override // io.grpc.stub.OooO
        public final void Oooo00O() {
            this.f80320OooO00o.halfClose();
            this.f80323OooO0Oo = true;
        }

        @Override // io.grpc.stub.OooO
        public final void onNext(ReqT reqt) {
            Preconditions.checkState(!this.f80322OooO0OO, "Stream was terminated by error, no further calls are allowed");
            Preconditions.checkState(!this.f80323OooO0Oo, "Stream is already completed, no further calls are allowed");
            this.f80320OooO00o.sendMessage(reqt);
        }
    }

    /* JADX INFO: renamed from: io.grpc.stub.OooO0o0$OooO0OO */
    public static final class OooO0OO<RespT> extends AbstractFuture<RespT> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final oO0OOo0o.OooO0o<?, RespT> f80324OooOo0o;

        public OooO0OO(oO0OOo0o.OooO0o<?, RespT> oooO0o) {
            this.f80324OooOo0o = oooO0o;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture
        public final void interruptTask() {
            this.f80324OooOo0o.cancel("GrpcFuture was cancelled", null);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture
        public final String pendingToString() {
            return MoreObjects.toStringHelper(this).add("clientCall", this.f80324OooOo0o).toString();
        }
    }

    /* JADX INFO: renamed from: io.grpc.stub.OooO0o0$OooO0Oo, reason: case insensitive filesystem */
    public static abstract class AbstractC23926OooO0Oo<T> extends OooO0o.OooO00o<T> {
        public abstract void OooO00o();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: io.grpc.stub.OooO0o0$OooO0o */
    public static final class OooO0o {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final OooO0o f80325OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO0o f80326OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public static final /* synthetic */ OooO0o[] f80327OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public static final OooO0o f80328OooOoO0;

        static {
            OooO0o oooO0o = new OooO0o("BLOCKING", 0);
            f80326OooOo0o = oooO0o;
            OooO0o oooO0o2 = new OooO0o("FUTURE", 1);
            f80325OooOo = oooO0o2;
            OooO0o oooO0o3 = new OooO0o("ASYNC", 2);
            f80328OooOoO0 = oooO0o3;
            f80327OooOoO = new OooO0o[]{oooO0o, oooO0o2, oooO0o3};
        }

        public OooO0o() {
            throw null;
        }

        public static OooO0o valueOf(String str) {
            return (OooO0o) Enum.valueOf(OooO0o.class, str);
        }

        public static OooO0o[] values() {
            return (OooO0o[]) f80327OooOoO.clone();
        }
    }

    /* JADX INFO: renamed from: io.grpc.stub.OooO0o0$OooO0o0, reason: collision with other inner class name */
    public static final class C19590OooO0o0<ReqT, RespT> extends AbstractC23926OooO0Oo<RespT> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooO<RespT> f80329OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final OooO0O0<ReqT> f80330OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public boolean f80331OooO0OO;

        public C19590OooO0o0(OooO<RespT> oooO, OooO0O0<ReqT> oooO0O0) {
            this.f80329OooO00o = oooO;
            this.f80330OooO0O0 = oooO0O0;
            if (oooO instanceof io.grpc.stub.OooO0o) {
                ((io.grpc.stub.OooO0o) oooO).OooOO0O();
            }
        }

        @Override // io.grpc.stub.C23925OooO0o0.AbstractC23926OooO0Oo
        public final void OooO00o() {
            OooO0O0<ReqT> oooO0O0 = this.f80330OooO0O0;
            oooO0O0.getClass();
            boolean z = oooO0O0.f80321OooO0O0;
            oO0OOo0o.OooO0o<ReqT, ?> oooO0o = oooO0O0.f80320OooO00o;
            if (z) {
                oooO0o.request(1);
            } else {
                oooO0o.request(2);
            }
        }

        @Override // oO0OOo0o.OooO0o.OooO00o
        public final void onClose(o00Oo0 o00oo02, C33094OoooO c33094OoooO) {
            boolean zOooO0o = o00oo02.OooO0o();
            OooO<RespT> oooO = this.f80329OooO00o;
            if (zOooO0o) {
                oooO.Oooo00O();
            } else {
                oooO.OooOooO(new C33119o00o0O(o00oo02, c33094OoooO));
            }
        }

        @Override // oO0OOo0o.OooO0o.OooO00o
        public final void onHeaders(C33094OoooO c33094OoooO) {
        }

        @Override // oO0OOo0o.OooO0o.OooO00o
        public final void onMessage(RespT respt) {
            boolean z = this.f80331OooO0OO;
            OooO0O0<ReqT> oooO0O0 = this.f80330OooO0O0;
            if (z && !oooO0O0.f80321OooO0O0) {
                throw o00Oo0.f119723OooOOO.OooO0oo("More than one responses received for unary or client-streaming call").OooO00o();
            }
            this.f80331OooO0OO = true;
            this.f80329OooO00o.onNext(respt);
            boolean z2 = oooO0O0.f80321OooO0O0;
            if (z2) {
                oO0OOo0o.OooO0o<ReqT, ?> oooO0o = oooO0O0.f80320OooO00o;
                if (z2) {
                    oooO0o.request(1);
                } else {
                    oooO0o.request(2);
                }
            }
        }

        @Override // oO0OOo0o.OooO0o.OooO00o
        public final void onReady() {
            this.f80330OooO0O0.getClass();
        }
    }

    /* JADX INFO: renamed from: io.grpc.stub.OooO0o0$OooO0oO, reason: case insensitive filesystem */
    public static final class ExecutorC23927OooO0oO extends ConcurrentLinkedQueue<Runnable> implements Executor {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final Logger f80332OooOo = Logger.getLogger(ExecutorC23927OooO0oO.class.getName());

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public static final Object f80333OooOoO0 = new Object();

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public volatile Object f80334OooOo0o;

        public final void OooO0O0() throws InterruptedException {
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            Runnable runnablePoll = poll();
            if (runnablePoll == null) {
                this.f80334OooOo0o = Thread.currentThread();
                do {
                    try {
                        Runnable runnablePoll2 = poll();
                        if (runnablePoll2 == null) {
                            LockSupport.park(this);
                        } else {
                            this.f80334OooOo0o = null;
                            runnablePoll = runnablePoll2;
                        }
                    } catch (Throwable th) {
                        this.f80334OooOo0o = null;
                        throw th;
                    }
                } while (!Thread.interrupted());
                throw new InterruptedException();
            }
            do {
                try {
                    runnablePoll.run();
                } catch (Throwable th2) {
                    f80332OooOo.log(Level.WARNING, "Runnable threw exception", th2);
                }
                runnablePoll = poll();
            } while (runnablePoll != null);
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            add(runnable);
            Object obj = this.f80334OooOo0o;
            if (obj != f80333OooOoO0) {
                LockSupport.unpark((Thread) obj);
            } else if (remove(runnable) && C23925OooO0o0.f80312OooO0O0) {
                throw new RejectedExecutionException();
            }
        }

        public final void shutdown() {
            this.f80334OooOo0o = f80333OooOoO0;
            while (true) {
                Runnable runnablePoll = poll();
                if (runnablePoll == null) {
                    return;
                }
                try {
                    runnablePoll.run();
                } catch (Throwable th) {
                    f80332OooOo.log(Level.WARNING, "Runnable threw exception", th);
                }
            }
        }
    }

    /* JADX INFO: renamed from: io.grpc.stub.OooO0o0$OooO0oo, reason: case insensitive filesystem */
    public static final class C23928OooO0oo<RespT> extends AbstractC23926OooO0Oo<RespT> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooO0OO<RespT> f80335OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public RespT f80336OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public boolean f80337OooO0OO = false;

        public C23928OooO0oo(OooO0OO<RespT> oooO0OO) {
            this.f80335OooO00o = oooO0OO;
        }

        @Override // io.grpc.stub.C23925OooO0o0.AbstractC23926OooO0Oo
        public final void OooO00o() {
            this.f80335OooO00o.f80324OooOo0o.request(2);
        }

        @Override // oO0OOo0o.OooO0o.OooO00o
        public final void onClose(o00Oo0 o00oo02, C33094OoooO c33094OoooO) {
            boolean zOooO0o = o00oo02.OooO0o();
            OooO0OO<RespT> oooO0OO = this.f80335OooO00o;
            if (!zOooO0o) {
                oooO0OO.setException(new C33119o00o0O(o00oo02, c33094OoooO));
                return;
            }
            if (!this.f80337OooO0OO) {
                oooO0OO.setException(new C33119o00o0O(o00Oo0.f119723OooOOO.OooO0oo("No value received for unary call"), c33094OoooO));
            }
            oooO0OO.set(this.f80336OooO0O0);
        }

        @Override // oO0OOo0o.OooO0o.OooO00o
        public final void onHeaders(C33094OoooO c33094OoooO) {
        }

        @Override // oO0OOo0o.OooO0o.OooO00o
        public final void onMessage(RespT respt) {
            if (this.f80337OooO0OO) {
                throw o00Oo0.f119723OooOOO.OooO0oo("More than one value received for unary call").OooO00o();
            }
            this.f80336OooO0O0 = respt;
            this.f80337OooO0OO = true;
        }
    }

    static {
        f80312OooO0O0 = !Strings.isNullOrEmpty(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE")) && Boolean.parseBoolean(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE"));
        Preconditions.checkNotNull("internal-stub-type", "debugString");
        f80313OooO0OO = new OooO0OO.OooO0O0<>("internal-stub-type");
    }

    public static void OooO00o(oO0OOo0o.OooO0o oooO0o, GeneratedMessageLite generatedMessageLite, OooO oooO) {
        Preconditions.checkNotNull(oooO, "responseObserver");
        OooO0O0(oooO0o, generatedMessageLite, new C19590OooO0o0(oooO, new OooO0O0(oooO0o, false)));
    }

    public static <ReqT, RespT> void OooO0O0(oO0OOo0o.OooO0o<ReqT, RespT> oooO0o, ReqT reqt, AbstractC23926OooO0Oo<RespT> abstractC23926OooO0Oo) {
        oooO0o.start(abstractC23926OooO0Oo, new C33094OoooO());
        abstractC23926OooO0Oo.OooO00o();
        try {
            oooO0o.sendMessage(reqt);
            oooO0o.halfClose();
        } catch (Error | RuntimeException e) {
            OooO0o0(oooO0o, e);
            throw null;
        }
    }

    public static OooO00o OooO0OO(AbstractC33060OooO0Oo abstractC33060OooO0Oo, C33101OoooOO0 c33101OoooOO0, oO0OOo0o.OooO0OO oooO0OO, GeneratedMessageLite generatedMessageLite) {
        oO0OOo0o.OooO0o oooO0oOooO0oO = abstractC33060OooO0Oo.OooO0oO(c33101OoooOO0, oooO0OO.OooO0o0(f80313OooO0OO, OooO0o.f80326OooOo0o));
        OooO00o oooO00o = new OooO00o(oooO0oOooO0oO);
        OooO0O0(oooO0oOooO0oO, generatedMessageLite, oooO00o.f80314OooOo);
        return oooO00o;
    }

    public static Object OooO0Oo(AbstractC33060OooO0Oo abstractC33060OooO0Oo, C33101OoooOO0 c33101OoooOO0, oO0OOo0o.OooO0OO oooO0OO, GeneratedMessageLite generatedMessageLite) throws Throwable {
        ExecutorC23927OooO0oO executorC23927OooO0oO = new ExecutorC23927OooO0oO();
        OooO0OO.OooO00o oooO00oOooO0O0 = oO0OOo0o.OooO0OO.OooO0O0(oooO0OO.OooO0o0(f80313OooO0OO, OooO0o.f80326OooOo0o));
        oooO00oOooO0O0.f119535OooO0O0 = executorC23927OooO0oO;
        oO0OOo0o.OooO0o oooO0oOooO0oO = abstractC33060OooO0Oo.OooO0oO(c33101OoooOO0, new oO0OOo0o.OooO0OO(oooO00oOooO0O0));
        boolean z = false;
        try {
            try {
                OooO0OO oooO0OOOooO0o = OooO0o(oooO0oOooO0oO, generatedMessageLite);
                while (!oooO0OOOooO0o.isDone()) {
                    try {
                        executorC23927OooO0oO.OooO0O0();
                    } catch (InterruptedException e) {
                        try {
                            oooO0oOooO0oO.cancel("Thread interrupted", e);
                            z = true;
                        } catch (Error e2) {
                            e = e2;
                            OooO0o0(oooO0oOooO0oO, e);
                            throw null;
                        } catch (RuntimeException e3) {
                            e = e3;
                            OooO0o0(oooO0oOooO0oO, e);
                            throw null;
                        } catch (Throwable th) {
                            th = th;
                            z = true;
                            if (z) {
                                Thread.currentThread().interrupt();
                            }
                            throw th;
                        }
                    }
                }
                executorC23927OooO0oO.shutdown();
                Object objOooO0oO = OooO0oO(oooO0OOOooO0o);
                if (z) {
                    Thread.currentThread().interrupt();
                }
                return objOooO0oO;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Error e4) {
            e = e4;
        } catch (RuntimeException e5) {
            e = e5;
        }
    }

    public static OooO0OO OooO0o(oO0OOo0o.OooO0o oooO0o, Object obj) {
        OooO0OO oooO0OO = new OooO0OO(oooO0o);
        OooO0O0(oooO0o, obj, new C23928OooO0oo(oooO0OO));
        return oooO0OO;
    }

    public static void OooO0o0(oO0OOo0o.OooO0o oooO0o, Throwable th) {
        try {
            oooO0o.cancel(null, th);
        } catch (Error | RuntimeException e) {
            f80311OooO00o.log(Level.SEVERE, "RuntimeException encountered while closing call", e);
        }
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
        if (!(th instanceof Error)) {
            throw new AssertionError(th);
        }
        throw ((Error) th);
    }

    public static Object OooO0oO(OooO0OO oooO0OO) {
        try {
            return oooO0OO.get();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw o00Oo0.f119716OooO0o.OooO0oo("Thread interrupted").OooO0oO(e).OooO00o();
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            for (Throwable cause2 = (Throwable) Preconditions.checkNotNull(cause, "t"); cause2 != null; cause2 = cause2.getCause()) {
                if (cause2 instanceof o00Ooo) {
                    throw new C33119o00o0O(((o00Ooo) cause2).f119753OooOo0o, null);
                }
                if (cause2 instanceof C33119o00o0O) {
                    C33119o00o0O c33119o00o0O = (C33119o00o0O) cause2;
                    throw new C33119o00o0O(c33119o00o0O.f119755OooOo0o, c33119o00o0O.f119754OooOo);
                }
            }
            throw o00Oo0.f119718OooO0oO.OooO0oo("unexpected exception").OooO0oO(cause).OooO00o();
        }
    }
}
