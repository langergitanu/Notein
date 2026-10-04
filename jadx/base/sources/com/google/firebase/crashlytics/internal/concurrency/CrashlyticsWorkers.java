package com.google.firebase.crashlytics.internal.concurrency;

import Oooo0oO.C21111o0ooOoO;
import android.os.Looper;
import com.google.firebase.crashlytics.internal.Logger;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import oO0o0O0o.C33599OooOo0O;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0010\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m80612d2 = {"Lcom/google/firebase/crashlytics/internal/concurrency/CrashlyticsWorkers;", "", "backgroundExecutorService", "Ljava/util/concurrent/ExecutorService;", "blockingExecutorService", "<init>", "(Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/ExecutorService;)V", "common", "Lcom/google/firebase/crashlytics/internal/concurrency/CrashlyticsWorker;", "diskWrite", "dataCollect", "network", "Companion", "com.google.firebase-firebase-crashlytics"}, m80613k = 1, m80614mv = {2, 0, 0}, m80616xi = 48)
public final class CrashlyticsWorkers {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static boolean enforcement;
    public final CrashlyticsWorker common;
    public final CrashlyticsWorker dataCollect;
    public final CrashlyticsWorker diskWrite;
    public final CrashlyticsWorker network;

    @Metadata(m80611d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0006J+\u0010\u000e\u001a\u00020\r2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0012\u0010\u0003R\u001c\u0010\u0016\u001a\n \u0013*\u0004\u0018\u00010\u000b0\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R(\u0010\u0017\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0017\u0010\u0018\u0012\u0004\b\u001c\u0010\u0003\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, m80612d2 = {"Lcom/google/firebase/crashlytics/internal/concurrency/CrashlyticsWorkers$Companion;", "", "<init>", "()V", "", "isNotMainThread", "()Z", "isBlockingThread", "isBackgroundThread", "Lkotlin/Function0;", "isCorrectThread", "", "failureMessage", "LoO00ooO/OooOooO;", "checkThread", "(LoO0O000o/OooO00o;LoO0O000o/OooO00o;)V", "checkNotMainThread", "checkBlockingThread", "checkBackgroundThread", "kotlin.jvm.PlatformType", "getThreadName", "()Ljava/lang/String;", "threadName", "enforcement", "Z", "getEnforcement", "setEnforcement", "(Z)V", "getEnforcement$annotations", "com.google.firebase-firebase-crashlytics"}, m80613k = 1, m80614mv = {2, 0, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String checkBackgroundThread$lambda$2() {
            return C21111o0ooOoO.OooO0OO(CrashlyticsWorkers.INSTANCE.getThreadName(), FilenameUtils.EXTENSION_SEPARATOR, new StringBuilder("Must be called on a background thread, was called on "));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String checkBlockingThread$lambda$1() {
            return C21111o0ooOoO.OooO0OO(CrashlyticsWorkers.INSTANCE.getThreadName(), FilenameUtils.EXTENSION_SEPARATOR, new StringBuilder("Must be called on a blocking thread, was called on "));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String checkNotMainThread$lambda$0() {
            return C21111o0ooOoO.OooO0OO(CrashlyticsWorkers.INSTANCE.getThreadName(), FilenameUtils.EXTENSION_SEPARATOR, new StringBuilder("Must not be called on a main thread, was called on "));
        }

        private final void checkThread(oO0O000o.OooO00o<Boolean> isCorrectThread, oO0O000o.OooO00o<String> failureMessage) {
            if (isCorrectThread.invoke().booleanValue()) {
                return;
            }
            Logger.getLogger().m75275d(failureMessage.invoke());
            getEnforcement();
        }

        public static /* synthetic */ void getEnforcement$annotations() {
        }

        private final String getThreadName() {
            return Thread.currentThread().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isBackgroundThread() {
            String threadName = getThreadName();
            OooOOO0.OooO0o(threadName, "<get-threadName>(...)");
            return C33599OooOo0O.OooOoOO(threadName, "Firebase Background Thread #", false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isBlockingThread() {
            String threadName = getThreadName();
            OooOOO0.OooO0o(threadName, "<get-threadName>(...)");
            return C33599OooOo0O.OooOoOO(threadName, "Firebase Blocking Thread #", false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isNotMainThread() {
            return !Looper.getMainLooper().isCurrentThread();
        }

        public final void checkBackgroundThread() {
            checkThread(new CrashlyticsWorkers$Companion$checkBackgroundThread$1(this), new OooO(0));
        }

        public final void checkBlockingThread() {
            checkThread(new CrashlyticsWorkers$Companion$checkBlockingThread$1(this), new OooOO0O());
        }

        public final void checkNotMainThread() {
            checkThread(new CrashlyticsWorkers$Companion$checkNotMainThread$1(this), new OooOO0());
        }

        public final boolean getEnforcement() {
            return CrashlyticsWorkers.enforcement;
        }

        public final void setEnforcement(boolean z) {
            CrashlyticsWorkers.enforcement = z;
        }

        private Companion() {
        }
    }

    public CrashlyticsWorkers(ExecutorService backgroundExecutorService, ExecutorService blockingExecutorService) {
        OooOOO0.OooO0oO(backgroundExecutorService, "backgroundExecutorService");
        OooOOO0.OooO0oO(blockingExecutorService, "blockingExecutorService");
        this.common = new CrashlyticsWorker(backgroundExecutorService);
        this.diskWrite = new CrashlyticsWorker(backgroundExecutorService);
        this.dataCollect = new CrashlyticsWorker(backgroundExecutorService);
        this.network = new CrashlyticsWorker(blockingExecutorService);
    }

    public static final void checkBackgroundThread() {
        INSTANCE.checkBackgroundThread();
    }

    public static final void checkBlockingThread() {
        INSTANCE.checkBlockingThread();
    }

    public static final void checkNotMainThread() {
        INSTANCE.checkNotMainThread();
    }

    public static final boolean getEnforcement() {
        return INSTANCE.getEnforcement();
    }

    public static final void setEnforcement(boolean z) {
        INSTANCE.setEnforcement(z);
    }
}
