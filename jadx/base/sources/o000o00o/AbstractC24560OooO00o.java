package o000o00o;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.SystemClock;
import android.text.format.DateUtils;
import androidx.core.os.OperationCanceledException;
import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import o000o00o.AbstractC24562OooO0OO;

/* JADX INFO: renamed from: o000o00o.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC24560OooO00o<D> extends C24561OooO0O0<D> {
    private static final boolean DEBUG = false;
    private static final String TAG = "AsyncTaskLoader";
    private volatile AbstractC24560OooO00o<D>.RunnableC19633OooO00o mCancellingTask;
    private Executor mExecutor;
    private Handler mHandler;
    private long mLastLoadCompleteTime;
    private volatile AbstractC24560OooO00o<D>.RunnableC19633OooO00o mTask;
    private long mUpdateThrottle;

    /* JADX INFO: renamed from: o000o00o.OooO00o$OooO00o, reason: collision with other inner class name */
    public final class RunnableC19633OooO00o extends AbstractC24562OooO0OO<D> implements Runnable {

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public boolean f83149OooOoo0;

        public RunnableC19633OooO00o() {
        }

        @Override // o000o00o.AbstractC24562OooO0OO
        public final D OooO00o() {
            try {
                return (D) AbstractC24560OooO00o.this.onLoadInBackground();
            } catch (OperationCanceledException e) {
                if (this.f83154OooOoO0.get()) {
                    return null;
                }
                throw e;
            }
        }

        @Override // o000o00o.AbstractC24562OooO0OO
        public final void OooO0O0(D d) {
            AbstractC24560OooO00o.this.dispatchOnCancelled(this, d);
        }

        @Override // o000o00o.AbstractC24562OooO0OO
        public final void OooO0OO(D d) {
            AbstractC24560OooO00o.this.dispatchOnLoadComplete(this, d);
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f83149OooOoo0 = false;
            AbstractC24560OooO00o.this.executePendingTask();
        }
    }

    public AbstractC24560OooO00o(Context context) {
        super(context);
        this.mLastLoadCompleteTime = -10000L;
    }

    public void cancelLoadInBackground() {
    }

    public void dispatchOnCancelled(AbstractC24560OooO00o<D>.RunnableC19633OooO00o runnableC19633OooO00o, D d) {
        onCanceled(d);
        if (this.mCancellingTask == runnableC19633OooO00o) {
            rollbackContentChanged();
            this.mLastLoadCompleteTime = SystemClock.uptimeMillis();
            this.mCancellingTask = null;
            deliverCancellation();
            executePendingTask();
        }
    }

    public void dispatchOnLoadComplete(AbstractC24560OooO00o<D>.RunnableC19633OooO00o runnableC19633OooO00o, D d) {
        if (this.mTask != runnableC19633OooO00o) {
            dispatchOnCancelled(runnableC19633OooO00o, d);
            return;
        }
        if (isAbandoned()) {
            onCanceled(d);
            return;
        }
        commitContentChanged();
        this.mLastLoadCompleteTime = SystemClock.uptimeMillis();
        this.mTask = null;
        deliverResult(d);
    }

    @Override // o000o00o.C24561OooO0O0
    @Deprecated
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2;
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (this.mTask != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.mTask);
            printWriter.print(" waiting=");
            printWriter.println(this.mTask.f83149OooOoo0);
        }
        if (this.mCancellingTask != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.mCancellingTask);
            printWriter.print(" waiting=");
            printWriter.println(this.mCancellingTask.f83149OooOoo0);
        }
        if (this.mUpdateThrottle != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            printWriter.print(DateUtils.formatElapsedTime(timeUnit.toSeconds(this.mUpdateThrottle)));
            printWriter.print(" mLastLoadCompleteTime=");
            if (this.mLastLoadCompleteTime == -10000) {
                str2 = "--";
            } else {
                str2 = CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR + DateUtils.formatElapsedTime(timeUnit.toSeconds(SystemClock.uptimeMillis() - this.mLastLoadCompleteTime));
            }
            printWriter.print(str2);
            printWriter.println();
        }
    }

    public void executePendingTask() {
        if (this.mCancellingTask != null || this.mTask == null) {
            return;
        }
        if (this.mTask.f83149OooOoo0) {
            this.mTask.f83149OooOoo0 = false;
            this.mHandler.removeCallbacks(this.mTask);
        }
        if (this.mUpdateThrottle > 0 && SystemClock.uptimeMillis() < this.mLastLoadCompleteTime + this.mUpdateThrottle) {
            this.mTask.f83149OooOoo0 = true;
            this.mHandler.postAtTime(this.mTask, this.mLastLoadCompleteTime + this.mUpdateThrottle);
            return;
        }
        if (this.mExecutor == null) {
            this.mExecutor = getExecutor();
        }
        AbstractC24560OooO00o<D>.RunnableC19633OooO00o runnableC19633OooO00o = this.mTask;
        Executor executor = this.mExecutor;
        if (runnableC19633OooO00o.f83151OooOo == AbstractC24562OooO0OO.OooO0Oo.f83160OooOo0o) {
            runnableC19633OooO00o.f83151OooOo = AbstractC24562OooO0OO.OooO0Oo.f83159OooOo;
            executor.execute(runnableC19633OooO00o.f83152OooOo0o);
            return;
        }
        int iOrdinal = runnableC19633OooO00o.f83151OooOo.ordinal();
        if (iOrdinal == 1) {
            throw new IllegalStateException("Cannot execute task: the task is already running.");
        }
        if (iOrdinal == 2) {
            throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
        }
        throw new IllegalStateException("We should never reach this state");
    }

    public Executor getExecutor() {
        return AsyncTask.THREAD_POOL_EXECUTOR;
    }

    public boolean isLoadInBackgroundCanceled() {
        return this.mCancellingTask != null;
    }

    public abstract D loadInBackground();

    @Override // o000o00o.C24561OooO0O0
    public boolean onCancelLoad() {
        if (this.mTask == null) {
            return false;
        }
        if (!isStarted()) {
            onContentChanged();
        }
        if (this.mCancellingTask != null) {
            if (this.mTask.f83149OooOoo0) {
                this.mTask.f83149OooOoo0 = false;
                this.mHandler.removeCallbacks(this.mTask);
            }
            this.mTask = null;
            return false;
        }
        if (this.mTask.f83149OooOoo0) {
            this.mTask.f83149OooOoo0 = false;
            this.mHandler.removeCallbacks(this.mTask);
            this.mTask = null;
            return false;
        }
        AbstractC24560OooO00o<D>.RunnableC19633OooO00o runnableC19633OooO00o = this.mTask;
        runnableC19633OooO00o.f83154OooOoO0.set(true);
        boolean zCancel = runnableC19633OooO00o.f83152OooOo0o.cancel(false);
        if (zCancel) {
            this.mCancellingTask = this.mTask;
            cancelLoadInBackground();
        }
        this.mTask = null;
        return zCancel;
    }

    public void onCanceled(D d) {
    }

    @Override // o000o00o.C24561OooO0O0
    public void onForceLoad() {
        super.onForceLoad();
        cancelLoad();
        this.mTask = new RunnableC19633OooO00o();
        executePendingTask();
    }

    public D onLoadInBackground() {
        return loadInBackground();
    }

    public void setUpdateThrottle(long j) {
        this.mUpdateThrottle = j;
        if (j != 0) {
            this.mHandler = new Handler();
        }
    }
}
