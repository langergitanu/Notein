package io.ktor.utils.p616io.internal;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: io.ktor.utils.io.internal.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC23996OooO0oO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ByteBuffer f80811OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO f80812OooO0O0;

    /* JADX INFO: renamed from: io.ktor.utils.io.internal.OooO0oO$OooO00o */
    public static final class OooO00o extends AbstractC23996OooO0oO {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final OooO00o f80813OooO0OO = new OooO00o(C23999OooO0oo.f80825OooO00o, C23999OooO0oo.f80826OooO0O0);

        public final String toString() {
            return "IDLE(empty)";
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.internal.OooO0oO$OooO0O0 */
    public static final class OooO0O0 extends AbstractC23996OooO0oO {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final OooO0OO f80814OooO0OO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(OooO0OO initial) {
            super(initial.f80811OooO00o, initial.f80812OooO0O0);
            OooOOO0.OooO0oO(initial, "initial");
            this.f80814OooO0OO = initial;
        }

        @Override // io.ktor.utils.p616io.internal.AbstractC23996OooO0oO
        public final boolean OooO00o() {
            return true;
        }

        @Override // io.ktor.utils.p616io.internal.AbstractC23996OooO0oO
        public final AbstractC23996OooO0oO OooO0Oo() {
            return this.f80814OooO0OO.f80817OooO0o;
        }

        @Override // io.ktor.utils.p616io.internal.AbstractC23996OooO0oO
        public final AbstractC23996OooO0oO OooO0o0() {
            return this.f80814OooO0OO.f80819OooO0oO;
        }

        public final String toString() {
            return "IDLE(with buffer)";
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.internal.OooO0oO$OooO0OO */
    public static final class OooO0OO extends AbstractC23996OooO0oO {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final ByteBuffer f80815OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final ByteBuffer f80816OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final C23997OooO0Oo f80817OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final OooO0O0 f80818OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final C19595OooO0oO f80819OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final C23998OooO0o0 f80820OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(ByteBuffer backingBuffer, int i) {
            super(backingBuffer, new OooO(backingBuffer.capacity() - i));
            OooOOO0.OooO0oO(backingBuffer, "backingBuffer");
            if (backingBuffer.position() != 0) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (backingBuffer.limit() != backingBuffer.capacity()) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            ByteBuffer byteBufferDuplicate = backingBuffer.duplicate();
            OooOOO0.OooO0o(byteBufferDuplicate, "backingBuffer.duplicate()");
            this.f80815OooO0OO = byteBufferDuplicate;
            ByteBuffer byteBufferDuplicate2 = backingBuffer.duplicate();
            OooOOO0.OooO0o(byteBufferDuplicate2, "backingBuffer.duplicate()");
            this.f80816OooO0Oo = byteBufferDuplicate2;
            this.f80818OooO0o0 = new OooO0O0(this);
            this.f80817OooO0o = new C23997OooO0Oo(this);
            this.f80819OooO0oO = new C19595OooO0oO(this);
            this.f80820OooO0oo = new C23998OooO0o0(this);
        }

        @Override // io.ktor.utils.p616io.internal.AbstractC23996OooO0oO
        public final boolean OooO00o() {
            throw new IllegalStateException("Not available for initial state");
        }

        @Override // io.ktor.utils.p616io.internal.AbstractC23996OooO0oO
        public final ByteBuffer OooO0O0() {
            return this.f80816OooO0Oo;
        }

        @Override // io.ktor.utils.p616io.internal.AbstractC23996OooO0oO
        public final ByteBuffer OooO0OO() {
            return this.f80815OooO0OO;
        }

        @Override // io.ktor.utils.p616io.internal.AbstractC23996OooO0oO
        public final AbstractC23996OooO0oO OooO0Oo() {
            return this.f80817OooO0o;
        }

        @Override // io.ktor.utils.p616io.internal.AbstractC23996OooO0oO
        public final AbstractC23996OooO0oO OooO0o0() {
            return this.f80819OooO0oO;
        }

        public final String toString() {
            return "Initial";
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.internal.OooO0oO$OooO0Oo, reason: case insensitive filesystem */
    public static final class C23997OooO0Oo extends AbstractC23996OooO0oO {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final OooO0OO f80821OooO0OO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23997OooO0Oo(OooO0OO initial) {
            super(initial.f80811OooO00o, initial.f80812OooO0O0);
            OooOOO0.OooO0oO(initial, "initial");
            this.f80821OooO0OO = initial;
        }

        @Override // io.ktor.utils.p616io.internal.AbstractC23996OooO0oO
        public final ByteBuffer OooO0O0() {
            return this.f80821OooO0OO.f80816OooO0Oo;
        }

        @Override // io.ktor.utils.p616io.internal.AbstractC23996OooO0oO
        public final AbstractC23996OooO0oO OooO0o() {
            return this.f80821OooO0OO.f80818OooO0o0;
        }

        @Override // io.ktor.utils.p616io.internal.AbstractC23996OooO0oO
        public final AbstractC23996OooO0oO OooO0o0() {
            return this.f80821OooO0OO.f80820OooO0oo;
        }

        public final String toString() {
            return "Reading";
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.internal.OooO0oO$OooO0o */
    public static final class OooO0o extends AbstractC23996OooO0oO {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final OooO0o f80822OooO0OO = new OooO0o(C23999OooO0oo.f80825OooO00o, C23999OooO0oo.f80826OooO0O0);

        public final String toString() {
            return "Terminated";
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.internal.OooO0oO$OooO0o0, reason: case insensitive filesystem */
    public static final class C23998OooO0o0 extends AbstractC23996OooO0oO {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final OooO0OO f80823OooO0OO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23998OooO0o0(OooO0OO initial) {
            super(initial.f80811OooO00o, initial.f80812OooO0O0);
            OooOOO0.OooO0oO(initial, "initial");
            this.f80823OooO0OO = initial;
        }

        @Override // io.ktor.utils.p616io.internal.AbstractC23996OooO0oO
        public final ByteBuffer OooO0O0() {
            return this.f80823OooO0OO.f80816OooO0Oo;
        }

        @Override // io.ktor.utils.p616io.internal.AbstractC23996OooO0oO
        public final ByteBuffer OooO0OO() {
            return this.f80823OooO0OO.f80815OooO0OO;
        }

        @Override // io.ktor.utils.p616io.internal.AbstractC23996OooO0oO
        public final AbstractC23996OooO0oO OooO0o() {
            return this.f80823OooO0OO.f80819OooO0oO;
        }

        @Override // io.ktor.utils.p616io.internal.AbstractC23996OooO0oO
        public final AbstractC23996OooO0oO OooO0oO() {
            return this.f80823OooO0OO.f80817OooO0o;
        }

        public final String toString() {
            return "Reading+Writing";
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.internal.OooO0oO$OooO0oO, reason: collision with other inner class name */
    public static final class C19595OooO0oO extends AbstractC23996OooO0oO {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final OooO0OO f80824OooO0OO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19595OooO0oO(OooO0OO initial) {
            super(initial.f80811OooO00o, initial.f80812OooO0O0);
            OooOOO0.OooO0oO(initial, "initial");
            this.f80824OooO0OO = initial;
        }

        @Override // io.ktor.utils.p616io.internal.AbstractC23996OooO0oO
        public final ByteBuffer OooO0OO() {
            return this.f80824OooO0OO.f80815OooO0OO;
        }

        @Override // io.ktor.utils.p616io.internal.AbstractC23996OooO0oO
        public final AbstractC23996OooO0oO OooO0Oo() {
            return this.f80824OooO0OO.f80820OooO0oo;
        }

        @Override // io.ktor.utils.p616io.internal.AbstractC23996OooO0oO
        public final AbstractC23996OooO0oO OooO0oO() {
            return this.f80824OooO0OO.f80818OooO0o0;
        }

        public final String toString() {
            return "Writing";
        }
    }

    public AbstractC23996OooO0oO(ByteBuffer byteBuffer, OooO oooO) {
        this.f80811OooO00o = byteBuffer;
        this.f80812OooO0O0 = oooO;
    }

    public boolean OooO00o() {
        return this instanceof OooO00o;
    }

    public ByteBuffer OooO0O0() {
        throw new IllegalStateException(("read buffer is not available in state " + this).toString());
    }

    public ByteBuffer OooO0OO() {
        throw new IllegalStateException(("write buffer is not available in state " + this).toString());
    }

    public AbstractC23996OooO0oO OooO0Oo() {
        throw new IllegalStateException(("ByteChannel[state: " + this + "] Concurrent reading is not supported").toString());
    }

    public AbstractC23996OooO0oO OooO0o() {
        throw new IllegalStateException(("Unable to stop reading in state " + this).toString());
    }

    public AbstractC23996OooO0oO OooO0o0() {
        throw new IllegalStateException(("ByteChannel[state: " + this + "] Concurrent writing is not supported").toString());
    }

    public AbstractC23996OooO0oO OooO0oO() {
        throw new IllegalStateException(("Unable to stop writing in state " + this).toString());
    }
}
