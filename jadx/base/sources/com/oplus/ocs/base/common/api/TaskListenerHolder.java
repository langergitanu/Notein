package com.oplus.ocs.base.common.api;

import android.os.Looper;
import android.os.Message;
import com.oplus.ocs.base.common.HandlerC18820a;
import com.oplus.ocs.base.common.constant.CommonStatusCodes;
import com.oplus.ocs.base.task.TaskImpl;

/* JADX INFO: loaded from: classes9.dex */
public class TaskListenerHolder<T> {

    /* JADX INFO: renamed from: a */
    private final String f57477a = "TaskListenerHolder";

    /* JADX INFO: renamed from: b */
    private Looper f57478b;

    /* JADX INFO: renamed from: c */
    private TaskImpl<T> f57479c;

    /* JADX INFO: renamed from: d */
    private int f57480d;

    /* JADX INFO: renamed from: e */
    private SuccessNotifier<T> f57481e;

    /* JADX INFO: renamed from: f */
    private FailureNotifier<T> f57482f;

    /* JADX INFO: renamed from: g */
    private TaskListenerHolder<T>.TaskListenerHandler f57483g;

    public interface FailureNotifier<T> {
        void onNotifyListenerFailed(TaskImpl<T> taskImpl, int i, String str);
    }

    public interface SuccessNotifier<T> {
        void notifyListener(TaskImpl<T> taskImpl);
    }

    public class TaskListenerHandler extends HandlerC18820a {
        public TaskListenerHandler(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what != 1) {
                throw new IllegalArgumentException();
            }
            TaskListenerHolder.m80477a(TaskListenerHolder.this, message.arg1);
        }
    }

    public TaskListenerHolder(Looper looper, TaskImpl<T> taskImpl, SuccessNotifier<T> successNotifier, FailureNotifier<T> failureNotifier) {
        this.f57478b = looper;
        this.f57479c = taskImpl;
        this.f57481e = successNotifier;
        this.f57482f = failureNotifier;
        this.f57483g = new TaskListenerHandler(this.f57478b);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m80477a(TaskListenerHolder taskListenerHolder, int i) {
        if (i == 0) {
            SuccessNotifier<T> successNotifier = taskListenerHolder.f57481e;
            if (successNotifier != null) {
                successNotifier.notifyListener(taskListenerHolder.f57479c);
                return;
            }
            return;
        }
        FailureNotifier<T> failureNotifier = taskListenerHolder.f57482f;
        if (failureNotifier != null) {
            failureNotifier.onNotifyListenerFailed(taskListenerHolder.f57479c, i, CommonStatusCodes.getStatusCodeString(i));
        }
    }

    public FailureNotifier<T> getFailureNotifier() {
        return this.f57482f;
    }

    public Looper getLooper() {
        return this.f57478b;
    }

    public SuccessNotifier getOnTaskSuccessListener() {
        return this.f57481e;
    }

    public TaskImpl<T> getTask() {
        return this.f57479c;
    }

    public void setErrorCode(int i) {
        this.f57480d = i;
        Message messageObtain = Message.obtain();
        messageObtain.what = 1;
        messageObtain.arg1 = this.f57480d;
        this.f57483g.sendMessage(messageObtain);
    }
}
