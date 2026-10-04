package o000o00o;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.util.Log;
import com.orion.notein.data.service.dto.MaterialPurchaseStatusResponse;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: o000o00o.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC24562OooO0OO<Result> {

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public static Handler f83150OooOoOO;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public volatile OooO0Oo f83151OooOo = OooO0Oo.f83160OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final AtomicBoolean f83154OooOoO0 = new AtomicBoolean();

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final AtomicBoolean f83153OooOoO = new AtomicBoolean();

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final OooO0O0 f83152OooOo0o = new OooO0O0(new OooO00o());

    /* JADX INFO: renamed from: o000o00o.OooO0OO$OooO00o */
    public class OooO00o implements Callable<Result> {
        public OooO00o() {
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // java.util.concurrent.Callable
        public final Result call() {
            AbstractC24562OooO0OO abstractC24562OooO0OO = AbstractC24562OooO0OO.this;
            abstractC24562OooO0OO.f83153OooOoO.set(true);
            Result result = null;
            try {
                Process.setThreadPriority(10);
                result = (Result) abstractC24562OooO0OO.OooO00o();
                Binder.flushPendingCommands();
                return result;
            } finally {
            }
        }
    }

    /* JADX INFO: renamed from: o000o00o.OooO0OO$OooO0O0 */
    public class OooO0O0 extends FutureTask<Result> {
        public OooO0O0(OooO00o oooO00o) {
            super(oooO00o);
        }

        @Override // java.util.concurrent.FutureTask
        public final void done() {
            AbstractC24562OooO0OO abstractC24562OooO0OO = AbstractC24562OooO0OO.this;
            AtomicBoolean atomicBoolean = abstractC24562OooO0OO.f83153OooOoO;
            try {
                Result result = get();
                if (atomicBoolean.get()) {
                    return;
                }
                abstractC24562OooO0OO.OooO0Oo(result);
            } catch (InterruptedException e) {
                Log.w("AsyncTask", e);
            } catch (CancellationException unused) {
                if (atomicBoolean.get()) {
                    return;
                }
                abstractC24562OooO0OO.OooO0Oo(null);
            } catch (ExecutionException e2) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e2.getCause());
            } catch (Throwable th) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th);
            }
        }
    }

    /* JADX INFO: renamed from: o000o00o.OooO0OO$OooO0OO, reason: collision with other inner class name */
    public class RunnableC19635OooO0OO implements Runnable {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f83158OooOo0o;

        public RunnableC19635OooO0OO(Object obj) {
            this.f83158OooOo0o = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            AbstractC24562OooO0OO abstractC24562OooO0OO = AbstractC24562OooO0OO.this;
            Object obj = this.f83158OooOo0o;
            if (abstractC24562OooO0OO.f83154OooOoO0.get()) {
                abstractC24562OooO0OO.OooO0O0(obj);
            } else {
                abstractC24562OooO0OO.OooO0OO(obj);
            }
            abstractC24562OooO0OO.f83151OooOo = OooO0Oo.f83162OooOoO0;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: o000o00o.OooO0OO$OooO0Oo */
    public static final class OooO0Oo {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final OooO0Oo f83159OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO0Oo f83160OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public static final /* synthetic */ OooO0Oo[] f83161OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public static final OooO0Oo f83162OooOoO0;

        static {
            OooO0Oo oooO0Oo = new OooO0Oo(MaterialPurchaseStatusResponse.STATUS_PENDING, 0);
            f83160OooOo0o = oooO0Oo;
            OooO0Oo oooO0Oo2 = new OooO0Oo("RUNNING", 1);
            f83159OooOo = oooO0Oo2;
            OooO0Oo oooO0Oo3 = new OooO0Oo("FINISHED", 2);
            f83162OooOoO0 = oooO0Oo3;
            f83161OooOoO = new OooO0Oo[]{oooO0Oo, oooO0Oo2, oooO0Oo3};
        }

        public OooO0Oo() {
            throw null;
        }

        public static OooO0Oo valueOf(String str) {
            return (OooO0Oo) Enum.valueOf(OooO0Oo.class, str);
        }

        public static OooO0Oo[] values() {
            return (OooO0Oo[]) f83161OooOoO.clone();
        }
    }

    public abstract Result OooO00o();

    public void OooO0O0(Result result) {
    }

    public void OooO0OO(Result result) {
    }

    public final void OooO0Oo(Result result) {
        Handler handler;
        synchronized (AbstractC24562OooO0OO.class) {
            try {
                if (f83150OooOoOO == null) {
                    f83150OooOoOO = new Handler(Looper.getMainLooper());
                }
                handler = f83150OooOoOO;
            } catch (Throwable th) {
                throw th;
            }
        }
        handler.post(new RunnableC19635OooO0OO(result));
    }
}
