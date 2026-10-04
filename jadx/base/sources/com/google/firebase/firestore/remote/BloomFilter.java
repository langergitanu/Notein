package com.google.firebase.firestore.remote;

import Oooo0oO.C21023OooO0Oo;
import android.util.Base64;
import androidx.appcompat.widget.C21532OooOOo;
import com.google.protobuf.ByteString;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes8.dex */
public final class BloomFilter {
    private final int bitCount;
    private final ByteString bitmap;
    private final int hashCount;
    private final MessageDigest md5HashMessageDigest;

    public static final class BloomFilterCreateException extends Exception {
        public BloomFilterCreateException(String str) {
            super(str);
        }
    }

    public BloomFilter(ByteString byteString, int i, int i2) {
        if (i < 0 || i >= 8) {
            throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i, "Invalid padding: "));
        }
        if (i2 < 0) {
            throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i2, "Invalid hash count: "));
        }
        if (byteString.size() > 0 && i2 == 0) {
            throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i2, "Invalid hash count: "));
        }
        if (byteString.size() == 0 && i != 0) {
            throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i, "Expected padding of 0 when bitmap length is 0, but got "));
        }
        this.bitmap = byteString;
        this.hashCount = i2;
        this.bitCount = (byteString.size() * 8) - i;
        this.md5HashMessageDigest = createMd5HashMessageDigest();
    }

    public static BloomFilter create(ByteString byteString, int i, int i2) throws BloomFilterCreateException {
        if (i < 0 || i >= 8) {
            throw new BloomFilterCreateException(C21532OooOOo.OooO0OO(i, "Invalid padding: "));
        }
        if (i2 < 0) {
            throw new BloomFilterCreateException(C21532OooOOo.OooO0OO(i2, "Invalid hash count: "));
        }
        if (byteString.size() > 0 && i2 == 0) {
            throw new BloomFilterCreateException(C21532OooOOo.OooO0OO(i2, "Invalid hash count: "));
        }
        if (byteString.size() != 0 || i == 0) {
            return new BloomFilter(byteString, i, i2);
        }
        throw new BloomFilterCreateException(C21532OooOOo.OooO0OO(i, "Expected padding of 0 when bitmap length is 0, but got "));
    }

    private static MessageDigest createMd5HashMessageDigest() {
        try {
            return MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Missing MD5 MessageDigest provider: ", e);
        }
    }

    private int getBitIndex(long j, long j2, int i) {
        return (int) unsignedRemainder((j2 * ((long) i)) + j, this.bitCount);
    }

    private static long getLongLittleEndian(byte[] bArr, int i) {
        long j = 0;
        for (int i2 = 0; i2 < 8; i2++) {
            j |= (((long) bArr[i + i2]) & 255) << (i2 * 8);
        }
        return j;
    }

    private boolean isBitSet(int i) {
        return ((1 << (i % 8)) & this.bitmap.byteAt(i / 8)) != 0;
    }

    private byte[] md5HashDigest(String str) {
        return this.md5HashMessageDigest.digest(str.getBytes(StandardCharsets.UTF_8));
    }

    private static long unsignedRemainder(long j, long j2) {
        long j3 = j - ((((j >>> 1) / j2) << 1) * j2);
        if (j3 < j2) {
            j2 = 0;
        }
        return j3 - j2;
    }

    public int getBitCount() {
        return this.bitCount;
    }

    public boolean mightContain(String str) {
        if (this.bitCount == 0) {
            return false;
        }
        byte[] bArrMd5HashDigest = md5HashDigest(str);
        if (bArrMd5HashDigest.length != 16) {
            throw new RuntimeException(C21023OooO0Oo.OooO0OO(" (expected 16)", bArrMd5HashDigest.length, new StringBuilder("Invalid md5 hash array length: ")));
        }
        long longLittleEndian = getLongLittleEndian(bArrMd5HashDigest, 0);
        long longLittleEndian2 = getLongLittleEndian(bArrMd5HashDigest, 8);
        for (int i = 0; i < this.hashCount; i++) {
            if (!isBitSet(getBitIndex(longLittleEndian, longLittleEndian2, i))) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        return "BloomFilter{hashCount=" + this.hashCount + ", size=" + this.bitCount + ", bitmap=\"" + Base64.encodeToString(this.bitmap.toByteArray(), 2) + "\"}";
    }
}
