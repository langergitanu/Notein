package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes8.dex */
@Immutable
@ElementTypesAreNonnullByDefault
final class SipHashFunction extends AbstractHashFunction implements Serializable {
    static final HashFunction SIP_HASH_24 = new SipHashFunction(2, 4, 506097522914230528L, 1084818905618843912L);
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: c */
    private final int f51723c;

    /* JADX INFO: renamed from: d */
    private final int f51724d;

    /* JADX INFO: renamed from: k0 */
    private final long f51725k0;

    /* JADX INFO: renamed from: k1 */
    private final long f51726k1;

    public static final class SipHasher extends AbstractStreamingHasher {
        private static final int CHUNK_SIZE = 8;

        /* JADX INFO: renamed from: b */
        private long f51727b;

        /* JADX INFO: renamed from: c */
        private final int f51728c;

        /* JADX INFO: renamed from: d */
        private final int f51729d;
        private long finalM;

        /* JADX INFO: renamed from: v0 */
        private long f51730v0;

        /* JADX INFO: renamed from: v1 */
        private long f51731v1;

        /* JADX INFO: renamed from: v2 */
        private long f51732v2;

        /* JADX INFO: renamed from: v3 */
        private long f51733v3;

        public SipHasher(int i, int i2, long j, long j2) {
            super(8);
            this.f51727b = 0L;
            this.finalM = 0L;
            this.f51728c = i;
            this.f51729d = i2;
            this.f51730v0 = 8317987319222330741L ^ j;
            this.f51731v1 = 7237128888997146477L ^ j2;
            this.f51732v2 = 7816392313619706465L ^ j;
            this.f51733v3 = 8387220255154660723L ^ j2;
        }

        private void processM(long j) {
            this.f51733v3 ^= j;
            sipRound(this.f51728c);
            this.f51730v0 = j ^ this.f51730v0;
        }

        private void sipRound(int i) {
            for (int i2 = 0; i2 < i; i2++) {
                long j = this.f51730v0;
                long j2 = this.f51731v1;
                this.f51730v0 = j + j2;
                this.f51732v2 += this.f51733v3;
                this.f51731v1 = Long.rotateLeft(j2, 13);
                long jRotateLeft = Long.rotateLeft(this.f51733v3, 16);
                long j3 = this.f51731v1;
                long j4 = this.f51730v0;
                this.f51731v1 = j3 ^ j4;
                this.f51733v3 = jRotateLeft ^ this.f51732v2;
                long jRotateLeft2 = Long.rotateLeft(j4, 32);
                long j5 = this.f51732v2;
                long j6 = this.f51731v1;
                this.f51732v2 = j5 + j6;
                this.f51730v0 = jRotateLeft2 + this.f51733v3;
                this.f51731v1 = Long.rotateLeft(j6, 17);
                long jRotateLeft3 = Long.rotateLeft(this.f51733v3, 21);
                long j7 = this.f51731v1;
                long j8 = this.f51732v2;
                this.f51731v1 = j7 ^ j8;
                this.f51733v3 = jRotateLeft3 ^ this.f51730v0;
                this.f51732v2 = Long.rotateLeft(j8, 32);
            }
        }

        @Override // com.google.common.hash.AbstractStreamingHasher
        public HashCode makeHash() {
            long j = this.finalM ^ (this.f51727b << 56);
            this.finalM = j;
            processM(j);
            this.f51732v2 ^= 255;
            sipRound(this.f51729d);
            return HashCode.fromLong(((this.f51730v0 ^ this.f51731v1) ^ this.f51732v2) ^ this.f51733v3);
        }

        @Override // com.google.common.hash.AbstractStreamingHasher
        public void process(ByteBuffer byteBuffer) {
            this.f51727b += 8;
            processM(byteBuffer.getLong());
        }

        @Override // com.google.common.hash.AbstractStreamingHasher
        public void processRemaining(ByteBuffer byteBuffer) {
            this.f51727b += (long) byteBuffer.remaining();
            int i = 0;
            while (byteBuffer.hasRemaining()) {
                this.finalM ^= (((long) byteBuffer.get()) & 255) << i;
                i += 8;
            }
        }
    }

    public SipHashFunction(int i, int i2, long j, long j2) {
        Preconditions.checkArgument(i > 0, "The number of SipRound iterations (c=%s) during Compression must be positive.", i);
        Preconditions.checkArgument(i2 > 0, "The number of SipRound iterations (d=%s) during Finalization must be positive.", i2);
        this.f51723c = i;
        this.f51724d = i2;
        this.f51725k0 = j;
        this.f51726k1 = j2;
    }

    @Override // com.google.common.hash.HashFunction
    public int bits() {
        return 64;
    }

    public boolean equals(Object obj) {
        if (obj instanceof SipHashFunction) {
            SipHashFunction sipHashFunction = (SipHashFunction) obj;
            if (this.f51723c == sipHashFunction.f51723c && this.f51724d == sipHashFunction.f51724d && this.f51725k0 == sipHashFunction.f51725k0 && this.f51726k1 == sipHashFunction.f51726k1) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (int) ((((long) ((SipHashFunction.class.hashCode() ^ this.f51723c) ^ this.f51724d)) ^ this.f51725k0) ^ this.f51726k1);
    }

    @Override // com.google.common.hash.HashFunction
    public Hasher newHasher() {
        return new SipHasher(this.f51723c, this.f51724d, this.f51725k0, this.f51726k1);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Hashing.sipHash");
        sb.append(this.f51723c);
        sb.append("");
        sb.append(this.f51724d);
        sb.append("(");
        sb.append(this.f51725k0);
        sb.append(", ");
        return android.support.v4.media.session.OooO00o.OooO00o(this.f51726k1, ")", sb);
    }
}
