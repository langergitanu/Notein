package o000o00o;

import Oooo0oO.C21023OooO0Oo;
import android.content.Context;
import android.os.Looper;
import com.orion.notein.domain.models.cloudsync.CloudMetaExtra;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import o000o00O.C24559OooO0O0;

/* JADX INFO: renamed from: o000o00o.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C24561OooO0O0<D> {
    private Context mContext;
    private int mId;
    private InterfaceC19634OooO0O0<D> mListener;
    private OooO00o<D> mOnLoadCanceledListener;
    private boolean mStarted = false;
    private boolean mAbandoned = false;
    private boolean mReset = true;
    private boolean mContentChanged = false;
    private boolean mProcessingChange = false;

    /* JADX INFO: renamed from: o000o00o.OooO0O0$OooO00o */
    public interface OooO00o<D> {
    }

    /* JADX INFO: renamed from: o000o00o.OooO0O0$OooO0O0, reason: collision with other inner class name */
    public interface InterfaceC19634OooO0O0<D> {
    }

    public C24561OooO0O0(Context context) {
        this.mContext = context.getApplicationContext();
    }

    public void abandon() {
        this.mAbandoned = true;
        onAbandon();
    }

    public boolean cancelLoad() {
        return onCancelLoad();
    }

    public void commitContentChanged() {
        this.mProcessingChange = false;
    }

    public String dataToString(D d) {
        StringBuilder sb = new StringBuilder(64);
        if (d == null) {
            sb.append(CloudMetaExtra.DEFINE_NON_PARENT_ID);
        } else {
            Class<?> cls = d.getClass();
            sb.append(cls.getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(cls)));
            sb.append("}");
        }
        return sb.toString();
    }

    public void deliverCancellation() {
    }

    public void deliverResult(D d) {
        InterfaceC19634OooO0O0<D> interfaceC19634OooO0O0 = this.mListener;
        if (interfaceC19634OooO0O0 != null) {
            C24559OooO0O0.OooO00o oooO00o = (C24559OooO0O0.OooO00o) interfaceC19634OooO0O0;
            if (Looper.myLooper() == Looper.getMainLooper()) {
                oooO00o.OooOO0(d);
            } else {
                oooO00o.OooO0oo(d);
            }
        }
    }

    @Deprecated
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.mId);
        printWriter.print(" mListener=");
        printWriter.println(this.mListener);
        if (this.mStarted || this.mContentChanged || this.mProcessingChange) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.mStarted);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.mContentChanged);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.mProcessingChange);
        }
        if (this.mAbandoned || this.mReset) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.mAbandoned);
            printWriter.print(" mReset=");
            printWriter.println(this.mReset);
        }
    }

    public void forceLoad() {
        onForceLoad();
    }

    public Context getContext() {
        return this.mContext;
    }

    public int getId() {
        return this.mId;
    }

    public boolean isAbandoned() {
        return this.mAbandoned;
    }

    public boolean isReset() {
        return this.mReset;
    }

    public boolean isStarted() {
        return this.mStarted;
    }

    public void onAbandon() {
    }

    public boolean onCancelLoad() {
        return false;
    }

    public void onContentChanged() {
        if (this.mStarted) {
            forceLoad();
        } else {
            this.mContentChanged = true;
        }
    }

    public void onForceLoad() {
    }

    public void onReset() {
    }

    public void onStartLoading() {
    }

    public void onStopLoading() {
    }

    public void registerListener(int i, InterfaceC19634OooO0O0<D> interfaceC19634OooO0O0) {
        if (this.mListener != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        this.mListener = interfaceC19634OooO0O0;
        this.mId = i;
    }

    public void registerOnLoadCanceledListener(OooO00o<D> oooO00o) {
    }

    public void reset() {
        onReset();
        this.mReset = true;
        this.mStarted = false;
        this.mAbandoned = false;
        this.mContentChanged = false;
        this.mProcessingChange = false;
    }

    public void rollbackContentChanged() {
        if (this.mProcessingChange) {
            onContentChanged();
        }
    }

    public final void startLoading() {
        this.mStarted = true;
        this.mReset = false;
        this.mAbandoned = false;
        onStartLoading();
    }

    public void stopLoading() {
        this.mStarted = false;
        onStopLoading();
    }

    public boolean takeContentChanged() {
        boolean z = this.mContentChanged;
        this.mContentChanged = false;
        this.mProcessingChange |= z;
        return z;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        Class<?> cls = getClass();
        sb.append(cls.getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(cls)));
        sb.append(" id=");
        return C21023OooO0Oo.OooO0OO("}", this.mId, sb);
    }

    public void unregisterListener(InterfaceC19634OooO0O0<D> interfaceC19634OooO0O0) {
        InterfaceC19634OooO0O0<D> interfaceC19634OooO0O02 = this.mListener;
        if (interfaceC19634OooO0O02 == null) {
            throw new IllegalStateException("No listener register");
        }
        if (interfaceC19634OooO0O02 != interfaceC19634OooO0O0) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        this.mListener = null;
    }

    public void unregisterOnLoadCanceledListener(OooO00o<D> oooO00o) {
        throw new IllegalStateException("No listener register");
    }
}
