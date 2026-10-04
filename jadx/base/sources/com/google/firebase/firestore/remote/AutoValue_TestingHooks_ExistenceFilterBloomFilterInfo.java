package com.google.firebase.firestore.remote;

import Oooo0oO.C21023OooO0Oo;
import com.google.firebase.firestore.remote.TestingHooks;

/* JADX INFO: loaded from: classes8.dex */
final class AutoValue_TestingHooks_ExistenceFilterBloomFilterInfo extends TestingHooks.ExistenceFilterBloomFilterInfo {
    private final boolean applied;
    private final int bitmapLength;
    private final BloomFilter bloomFilter;
    private final int hashCount;
    private final int padding;

    public AutoValue_TestingHooks_ExistenceFilterBloomFilterInfo(BloomFilter bloomFilter, boolean z, int i, int i2, int i3) {
        this.bloomFilter = bloomFilter;
        this.applied = z;
        this.hashCount = i;
        this.bitmapLength = i2;
        this.padding = i3;
    }

    @Override // com.google.firebase.firestore.remote.TestingHooks.ExistenceFilterBloomFilterInfo
    public boolean applied() {
        return this.applied;
    }

    @Override // com.google.firebase.firestore.remote.TestingHooks.ExistenceFilterBloomFilterInfo
    public int bitmapLength() {
        return this.bitmapLength;
    }

    @Override // com.google.firebase.firestore.remote.TestingHooks.ExistenceFilterBloomFilterInfo
    public BloomFilter bloomFilter() {
        return this.bloomFilter;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof TestingHooks.ExistenceFilterBloomFilterInfo) {
            TestingHooks.ExistenceFilterBloomFilterInfo existenceFilterBloomFilterInfo = (TestingHooks.ExistenceFilterBloomFilterInfo) obj;
            BloomFilter bloomFilter = this.bloomFilter;
            if (bloomFilter != null ? bloomFilter.equals(existenceFilterBloomFilterInfo.bloomFilter()) : existenceFilterBloomFilterInfo.bloomFilter() == null) {
                if (this.applied == existenceFilterBloomFilterInfo.applied() && this.hashCount == existenceFilterBloomFilterInfo.hashCount() && this.bitmapLength == existenceFilterBloomFilterInfo.bitmapLength() && this.padding == existenceFilterBloomFilterInfo.padding()) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        BloomFilter bloomFilter = this.bloomFilter;
        return (((((((((bloomFilter == null ? 0 : bloomFilter.hashCode()) ^ 1000003) * 1000003) ^ (this.applied ? 1231 : 1237)) * 1000003) ^ this.hashCount) * 1000003) ^ this.bitmapLength) * 1000003) ^ this.padding;
    }

    @Override // com.google.firebase.firestore.remote.TestingHooks.ExistenceFilterBloomFilterInfo
    public int hashCount() {
        return this.hashCount;
    }

    @Override // com.google.firebase.firestore.remote.TestingHooks.ExistenceFilterBloomFilterInfo
    public int padding() {
        return this.padding;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ExistenceFilterBloomFilterInfo{bloomFilter=");
        sb.append(this.bloomFilter);
        sb.append(", applied=");
        sb.append(this.applied);
        sb.append(", hashCount=");
        sb.append(this.hashCount);
        sb.append(", bitmapLength=");
        sb.append(this.bitmapLength);
        sb.append(", padding=");
        return C21023OooO0Oo.OooO0OO("}", this.padding, sb);
    }
}
