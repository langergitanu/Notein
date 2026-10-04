package com.google.firebase.firestore.remote;

import com.google.firebase.firestore.ListenerRegistration;
import com.google.firebase.firestore.model.DatabaseId;
import com.google.firebase.firestore.remote.WatchChangeAggregator;
import com.google.firebase.firestore.util.Preconditions;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes8.dex */
final class TestingHooks {
    private static final TestingHooks instance = new TestingHooks();
    private final CopyOnWriteArrayList<AtomicReference<ExistenceFilterMismatchListener>> existenceFilterMismatchListeners = new CopyOnWriteArrayList<>();

    public static abstract class ExistenceFilterBloomFilterInfo {
        public static ExistenceFilterBloomFilterInfo create(BloomFilter bloomFilter, boolean z, int i, int i2, int i3) {
            return new AutoValue_TestingHooks_ExistenceFilterBloomFilterInfo(bloomFilter, z, i, i2, i3);
        }

        public static ExistenceFilterBloomFilterInfo from(BloomFilter bloomFilter, WatchChangeAggregator.BloomFilterApplicationStatus bloomFilterApplicationStatus, ExistenceFilter existenceFilter) {
            com.google.firestore.p565v1.BloomFilter unchangedNames = existenceFilter.getUnchangedNames();
            if (unchangedNames == null) {
                return null;
            }
            return create(bloomFilter, bloomFilterApplicationStatus == WatchChangeAggregator.BloomFilterApplicationStatus.SUCCESS, unchangedNames.getHashCount(), unchangedNames.getBits().getBitmap().size(), unchangedNames.getBits().getPadding());
        }

        public abstract boolean applied();

        public abstract int bitmapLength();

        public abstract BloomFilter bloomFilter();

        public abstract int hashCount();

        public abstract int padding();
    }

    public static abstract class ExistenceFilterMismatchInfo {
        public static ExistenceFilterMismatchInfo create(int i, int i2, String str, String str2, ExistenceFilterBloomFilterInfo existenceFilterBloomFilterInfo) {
            return new AutoValue_TestingHooks_ExistenceFilterMismatchInfo(i, i2, str, str2, existenceFilterBloomFilterInfo);
        }

        public static ExistenceFilterMismatchInfo from(int i, ExistenceFilter existenceFilter, DatabaseId databaseId, BloomFilter bloomFilter, WatchChangeAggregator.BloomFilterApplicationStatus bloomFilterApplicationStatus) {
            return create(i, existenceFilter.getCount(), databaseId.getProjectId(), databaseId.getDatabaseId(), ExistenceFilterBloomFilterInfo.from(bloomFilter, bloomFilterApplicationStatus, existenceFilter));
        }

        public abstract ExistenceFilterBloomFilterInfo bloomFilter();

        public abstract String databaseId();

        public abstract int existenceFilterCount();

        public abstract int localCacheCount();

        public abstract String projectId();
    }

    public interface ExistenceFilterMismatchListener {
        void onExistenceFilterMismatch(ExistenceFilterMismatchInfo existenceFilterMismatchInfo);
    }

    private TestingHooks() {
    }

    public static TestingHooks getInstance() {
        return instance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addExistenceFilterMismatchListener$0(AtomicReference atomicReference) {
        atomicReference.set(null);
        this.existenceFilterMismatchListeners.remove(atomicReference);
    }

    public ListenerRegistration addExistenceFilterMismatchListener(ExistenceFilterMismatchListener existenceFilterMismatchListener) {
        Preconditions.checkNotNull(existenceFilterMismatchListener, "a null listener is not allowed");
        final AtomicReference<ExistenceFilterMismatchListener> atomicReference = new AtomicReference<>(existenceFilterMismatchListener);
        this.existenceFilterMismatchListeners.add(atomicReference);
        return new ListenerRegistration() { // from class: com.google.firebase.firestore.remote.OooOoOO
            @Override // com.google.firebase.firestore.ListenerRegistration
            public final void remove() {
                this.f68405OooO00o.lambda$addExistenceFilterMismatchListener$0(atomicReference);
            }
        };
    }

    public void notifyOnExistenceFilterMismatch(ExistenceFilterMismatchInfo existenceFilterMismatchInfo) {
        Iterator<AtomicReference<ExistenceFilterMismatchListener>> it = this.existenceFilterMismatchListeners.iterator();
        while (it.hasNext()) {
            ExistenceFilterMismatchListener existenceFilterMismatchListener = it.next().get();
            if (existenceFilterMismatchListener != null) {
                existenceFilterMismatchListener.onExistenceFilterMismatch(existenceFilterMismatchInfo);
            }
        }
    }
}
