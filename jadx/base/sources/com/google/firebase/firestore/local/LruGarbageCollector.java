package com.google.firebase.firestore.local;

import android.util.SparseArray;
import com.aspose.slides.C22218Oooo;
import com.google.firebase.firestore.util.AsyncQueue;
import com.google.firebase.firestore.util.Consumer;
import com.google.firebase.firestore.util.Logger;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import java.util.Comparator;
import java.util.Locale;
import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes8.dex */
public class LruGarbageCollector {
    private static final long INITIAL_GC_DELAY_MS;
    private static final long REGULAR_GC_DELAY_MS;
    private final LruDelegate delegate;
    private final Params params;

    public class GCScheduler implements Scheduler {
        private final AsyncQueue asyncQueue;
        private AsyncQueue.DelayedTask gcTask;
        private boolean hasRun = false;
        private final LocalStore localStore;

        public GCScheduler(AsyncQueue asyncQueue, LocalStore localStore) {
            this.asyncQueue = asyncQueue;
            this.localStore = localStore;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$scheduleGC$0() {
            this.localStore.collectGarbage(LruGarbageCollector.this);
            this.hasRun = true;
            scheduleGC();
        }

        private void scheduleGC() {
            this.gcTask = this.asyncQueue.enqueueAfterDelay(AsyncQueue.TimerId.GARBAGE_COLLECTION, this.hasRun ? LruGarbageCollector.REGULAR_GC_DELAY_MS : LruGarbageCollector.INITIAL_GC_DELAY_MS, new RunnableC22649OooOoo(this, 0));
        }

        @Override // com.google.firebase.firestore.local.Scheduler
        public void start() {
            if (LruGarbageCollector.this.params.minBytesThreshold != -1) {
                scheduleGC();
            }
        }

        @Override // com.google.firebase.firestore.local.Scheduler
        public void stop() {
            AsyncQueue.DelayedTask delayedTask = this.gcTask;
            if (delayedTask != null) {
                delayedTask.cancel();
            }
        }
    }

    public static class Params {
        private static final long COLLECTION_DISABLED = -1;
        private static final long DEFAULT_CACHE_SIZE_BYTES = 104857600;
        private static final int DEFAULT_COLLECTION_PERCENTILE = 10;
        private static final int DEFAULT_MAX_SEQUENCE_NUMBERS_TO_COLLECT = 1000;
        final int maximumSequenceNumbersToCollect;
        long minBytesThreshold;
        int percentileToCollect;

        public Params(long j, int i, int i2) {
            this.minBytesThreshold = j;
            this.percentileToCollect = i;
            this.maximumSequenceNumbersToCollect = i2;
        }

        public static Params Default() {
            return new Params(DEFAULT_CACHE_SIZE_BYTES, 10, 1000);
        }

        public static Params Disabled() {
            return new Params(-1L, 0, 0);
        }

        public static Params WithCacheSizeBytes(long j) {
            return new Params(j, 10, 1000);
        }
    }

    public static class Results {
        private final int documentsRemoved;
        private final boolean hasRun;
        private final int sequenceNumbersCollected;
        private final int targetsRemoved;

        public Results(boolean z, int i, int i2, int i3) {
            this.hasRun = z;
            this.sequenceNumbersCollected = i;
            this.targetsRemoved = i2;
            this.documentsRemoved = i3;
        }

        public static Results DidNotRun() {
            return new Results(false, 0, 0, 0);
        }

        public int getDocumentsRemoved() {
            return this.documentsRemoved;
        }

        public int getSequenceNumbersCollected() {
            return this.sequenceNumbersCollected;
        }

        public int getTargetsRemoved() {
            return this.targetsRemoved;
        }

        public boolean hasRun() {
            return this.hasRun;
        }
    }

    public static class RollingSequenceNumberBuffer {
        private static final Comparator<Long> COMPARATOR = new C22651OooOooO();
        private final int maxElements;
        private final PriorityQueue<Long> queue;

        public RollingSequenceNumberBuffer(int i) {
            this.maxElements = i;
            this.queue = new PriorityQueue<>(i, COMPARATOR);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int lambda$static$0(Long l, Long l2) {
            return l2.compareTo(l);
        }

        public void addElement(Long l) {
            if (this.queue.size() < this.maxElements) {
                this.queue.add(l);
                return;
            }
            if (l.longValue() < this.queue.peek().longValue()) {
                this.queue.poll();
                this.queue.add(l);
            }
        }

        public long getMaxValue() {
            return this.queue.peek().longValue();
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        INITIAL_GC_DELAY_MS = timeUnit.toMillis(1L);
        REGULAR_GC_DELAY_MS = timeUnit.toMillis(5L);
    }

    public LruGarbageCollector(LruDelegate lruDelegate, Params params) {
        this.delegate = lruDelegate;
        this.params = params;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getNthSequenceNumber$0(RollingSequenceNumberBuffer rollingSequenceNumberBuffer, TargetData targetData) {
        rollingSequenceNumberBuffer.addElement(Long.valueOf(targetData.getSequenceNumber()));
    }

    private Results runGarbageCollection(SparseArray<?> sparseArray) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        int iCalculateQueryCount = calculateQueryCount(this.params.percentileToCollect);
        if (iCalculateQueryCount > this.params.maximumSequenceNumbersToCollect) {
            Logger.debug("LruGarbageCollector", "Capping sequence numbers to collect down to the maximum of " + this.params.maximumSequenceNumbersToCollect + " from " + iCalculateQueryCount, new Object[0]);
            iCalculateQueryCount = this.params.maximumSequenceNumbersToCollect;
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        long nthSequenceNumber = getNthSequenceNumber(iCalculateQueryCount);
        long jCurrentTimeMillis3 = System.currentTimeMillis();
        int iRemoveTargets = removeTargets(nthSequenceNumber, sparseArray);
        long jCurrentTimeMillis4 = System.currentTimeMillis();
        int iRemoveOrphanedDocuments = removeOrphanedDocuments(nthSequenceNumber);
        long jCurrentTimeMillis5 = System.currentTimeMillis();
        if (Logger.isDebugEnabled()) {
            StringBuilder sbOooO0OO = C22218Oooo.OooO0OO(android.support.v4.media.session.OooO00o.OooO00o(jCurrentTimeMillis2 - jCurrentTimeMillis, "ms\n", new StringBuilder("LRU Garbage Collection:\n\tCounted targets in ")));
            Locale locale = Locale.ROOT;
            sbOooO0OO.append("\tDetermined least recently used " + iCalculateQueryCount + " sequence numbers in " + (jCurrentTimeMillis3 - jCurrentTimeMillis2) + "ms\n");
            StringBuilder sbOooO0OO2 = C22218Oooo.OooO0OO(sbOooO0OO.toString());
            sbOooO0OO2.append("\tRemoved " + iRemoveTargets + " targets in " + (jCurrentTimeMillis4 - jCurrentTimeMillis3) + "ms\n");
            StringBuilder sbOooO0OO3 = C22218Oooo.OooO0OO(sbOooO0OO2.toString());
            sbOooO0OO3.append("\tRemoved " + iRemoveOrphanedDocuments + " documents in " + (jCurrentTimeMillis5 - jCurrentTimeMillis4) + "ms\n");
            StringBuilder sbOooO0OO4 = C22218Oooo.OooO0OO(sbOooO0OO3.toString());
            StringBuilder sb = new StringBuilder("Total Duration: ");
            sb.append(jCurrentTimeMillis5 - jCurrentTimeMillis);
            sb.append(TranslateLanguage.MALAY);
            sbOooO0OO4.append(sb.toString());
            Logger.debug("LruGarbageCollector", sbOooO0OO4.toString(), new Object[0]);
        }
        return new Results(true, iCalculateQueryCount, iRemoveTargets, iRemoveOrphanedDocuments);
    }

    public int calculateQueryCount(int i) {
        return (int) ((i / 100.0f) * this.delegate.getSequenceNumberCount());
    }

    public Results collect(SparseArray<?> sparseArray) {
        if (this.params.minBytesThreshold == -1) {
            Logger.debug("LruGarbageCollector", "Garbage collection skipped; disabled", new Object[0]);
            return Results.DidNotRun();
        }
        long byteSize = getByteSize();
        if (byteSize >= this.params.minBytesThreshold) {
            return runGarbageCollection(sparseArray);
        }
        StringBuilder sbOooO00o = o00oO0O.o0OoOo0.OooO00o(byteSize, "Garbage collection skipped; Cache size ", " is lower than threshold ");
        sbOooO00o.append(this.params.minBytesThreshold);
        Logger.debug("LruGarbageCollector", sbOooO00o.toString(), new Object[0]);
        return Results.DidNotRun();
    }

    public long getByteSize() {
        return this.delegate.getByteSize();
    }

    public long getNthSequenceNumber(int i) {
        if (i == 0) {
            return -1L;
        }
        final RollingSequenceNumberBuffer rollingSequenceNumberBuffer = new RollingSequenceNumberBuffer(i);
        this.delegate.forEachTarget(new Consumer() { // from class: com.google.firebase.firestore.local.OooOoOO
            @Override // com.google.firebase.firestore.util.Consumer
            public final void accept(Object obj) {
                LruGarbageCollector.lambda$getNthSequenceNumber$0(rollingSequenceNumberBuffer, (TargetData) obj);
            }
        });
        this.delegate.forEachOrphanedDocumentSequenceNumber(new Consumer() { // from class: com.google.firebase.firestore.local.OooOoo0
            @Override // com.google.firebase.firestore.util.Consumer
            public final void accept(Object obj) {
                rollingSequenceNumberBuffer.addElement((Long) obj);
            }
        });
        return rollingSequenceNumberBuffer.getMaxValue();
    }

    public GCScheduler newScheduler(AsyncQueue asyncQueue, LocalStore localStore) {
        return new GCScheduler(asyncQueue, localStore);
    }

    public int removeOrphanedDocuments(long j) {
        return this.delegate.removeOrphanedDocuments(j);
    }

    public int removeTargets(long j, SparseArray<?> sparseArray) {
        return this.delegate.removeTargets(j, sparseArray);
    }

    public LruGarbageCollector withNewThreshold(long j) {
        Params params = this.params;
        params.minBytesThreshold = j;
        params.percentileToCollect = 100;
        return this;
    }
}
