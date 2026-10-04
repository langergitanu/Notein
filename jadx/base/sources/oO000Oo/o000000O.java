package oO000Oo;

import Oooo0oo.AbstractC21138OooO0oo;
import com.aspose.words.StyleIdentifier;
import com.google.common.base.Preconditions;
import com.google.firebase.messaging.Constants;
import java.io.Closeable;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import oO000Oo.AbstractC31936OooO0Oo;
import oO000Oo.InterfaceC32049o0000oOO;
import oO000Oo.o0000O0;
import oO0OOo0o.InterfaceC33070OooOOoo;
import oO0OOo0o.OooOO0O;

/* JADX INFO: loaded from: classes10.dex */
public final class o000000O implements Closeable, InterfaceC31955OooOoO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f114328OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public OooO00o f114329OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final o000 f114330OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final C32043o0000o f114331OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public InterfaceC33070OooOOoo f114332OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public int f114333OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public byte[] f114334OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public EnumC32011OooO0Oo f114335OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public int f114336OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public long f114337Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public boolean f114338Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public C31950OooOo0O f114339Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public C31950OooOo0O f114340Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public boolean f114341Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public int f114342Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public boolean f114343Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public int f114344Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public volatile boolean f114345Oooo0oO;

    public interface OooO00o {
        void OooO00o(InterfaceC32049o0000oOO.OooO00o oooO00o);

        void OooO0O0(int i);

        void OooO0OO(boolean z);
    }

    public static class OooO0O0 implements InterfaceC32049o0000oOO.OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public InputStream f114346OooO00o;

        @Override // oO000Oo.InterfaceC32049o0000oOO.OooO00o
        public final InputStream next() {
            InputStream inputStream = this.f114346OooO00o;
            this.f114346OooO00o = null;
            return inputStream;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: oO000Oo.o000000O$OooO0Oo, reason: case insensitive filesystem */
    public static final class EnumC32011OooO0Oo {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final EnumC32011OooO0Oo f114352OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final EnumC32011OooO0Oo f114353OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public static final /* synthetic */ EnumC32011OooO0Oo[] f114354OooOoO0;

        static {
            EnumC32011OooO0Oo enumC32011OooO0Oo = new EnumC32011OooO0Oo("HEADER", 0);
            f114353OooOo0o = enumC32011OooO0Oo;
            EnumC32011OooO0Oo enumC32011OooO0Oo2 = new EnumC32011OooO0Oo("BODY", 1);
            f114352OooOo = enumC32011OooO0Oo2;
            f114354OooOoO0 = new EnumC32011OooO0Oo[]{enumC32011OooO0Oo, enumC32011OooO0Oo2};
        }

        public EnumC32011OooO0Oo() {
            throw null;
        }

        public static EnumC32011OooO0Oo valueOf(String str) {
            return (EnumC32011OooO0Oo) Enum.valueOf(EnumC32011OooO0Oo.class, str);
        }

        public static EnumC32011OooO0Oo[] values() {
            return (EnumC32011OooO0Oo[]) f114354OooOoO0.clone();
        }
    }

    public o000000O(AbstractC31936OooO0Oo.OooO00o oooO00o, int i, C32043o0000o c32043o0000o, o000 o000Var) {
        OooOO0O.OooO0O0 oooO0O0 = OooOO0O.OooO0O0.f119551OooO00o;
        this.f114335OooOooO = EnumC32011OooO0Oo.f114353OooOo0o;
        this.f114336OooOooo = 5;
        this.f114340Oooo00o = new C31950OooOo0O();
        this.f114341Oooo0O0 = false;
        this.f114342Oooo0OO = -1;
        this.f114343Oooo0o = false;
        this.f114345Oooo0oO = false;
        this.f114329OooOo0o = (OooO00o) Preconditions.checkNotNull(oooO00o, "sink");
        this.f114332OooOoOO = (InterfaceC33070OooOOoo) Preconditions.checkNotNull(oooO0O0, "decompressor");
        this.f114328OooOo = i;
        this.f114331OooOoO0 = (C32043o0000o) Preconditions.checkNotNull(c32043o0000o, "statsTraceCtx");
        this.f114330OooOoO = (o000) Preconditions.checkNotNull(o000Var, "transportTracer");
    }

    @Override // oO000Oo.InterfaceC31955OooOoO
    public final void OooO00o(int i) {
        Preconditions.checkArgument(i > 0, "numMessages must be > 0");
        if (isClosed()) {
            return;
        }
        this.f114337Oooo0 += (long) i;
        OooOooo();
    }

    @Override // oO000Oo.InterfaceC31955OooOoO
    public final void OooO0OO(int i) {
        this.f114328OooOo = i;
    }

    @Override // oO000Oo.InterfaceC31955OooOoO
    public final void OooOOO0(oO0OO0OO.OooOOO0 oooOOO0) throws Throwable {
        boolean z;
        Throwable th;
        Preconditions.checkNotNull(oooOOO0, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        try {
            if (!isClosed() && !this.f114343Oooo0o) {
                z = false;
                this.f114340Oooo00o.OooO0OO(oooOOO0);
                try {
                    OooOooo();
                    return;
                } catch (Throwable th2) {
                    th = th2;
                    if (z) {
                        oooOOO0.close();
                    }
                    throw th;
                }
            }
            oooOOO0.close();
        } catch (Throwable th3) {
            z = true;
            th = th3;
        }
    }

    @Override // oO000Oo.InterfaceC31955OooOoO
    public final void OooOOo0(InterfaceC33070OooOOoo interfaceC33070OooOOoo) {
        Preconditions.checkState(true, "Already set full stream decompressor");
        this.f114332OooOoOO = (InterfaceC33070OooOOoo) Preconditions.checkNotNull(interfaceC33070OooOOoo, "Can't pass an empty decompressor");
    }

    @Override // oO000Oo.InterfaceC31955OooOoO
    public final void OooOOoo() {
        if (isClosed()) {
            return;
        }
        if (this.f114340Oooo00o.f114053OooOoO0 == 0) {
            close();
        } else {
            this.f114343Oooo0o = true;
        }
    }

    public final void OooOooo() {
        if (this.f114341Oooo0O0) {
            return;
        }
        boolean z = true;
        this.f114341Oooo0O0 = true;
        while (!this.f114345Oooo0oO && this.f114337Oooo0 > 0 && Oooo0()) {
            try {
                int iOrdinal = this.f114335OooOooO.ordinal();
                if (iOrdinal == 0) {
                    Oooo00o();
                } else {
                    if (iOrdinal != 1) {
                        throw new AssertionError("Invalid state: " + this.f114335OooOooO);
                    }
                    Oooo000();
                    this.f114337Oooo0--;
                }
            } catch (Throwable th) {
                this.f114341Oooo0O0 = false;
                throw th;
            }
        }
        if (this.f114345Oooo0oO) {
            close();
            this.f114341Oooo0O0 = false;
            return;
        }
        if (this.f114343Oooo0o) {
            if (this.f114340Oooo00o.f114053OooOoO0 != 0) {
                z = false;
            }
            if (z) {
                close();
            }
        }
        this.f114341Oooo0O0 = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002e, code lost:
    
        r1.OooO00o(r3);
        r8.f114344Oooo0o0 += r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0058, code lost:
    
        if (r8.f114335OooOooO == r0) goto L17;
     */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean Oooo0() throws Throwable {
        EnumC32011OooO0Oo enumC32011OooO0Oo = EnumC32011OooO0Oo.f114352OooOo;
        C32043o0000o c32043o0000o = this.f114331OooOoO0;
        int i = 0;
        z = false;
        z = false;
        boolean z = false;
        try {
            if (this.f114339Oooo00O == null) {
                this.f114339Oooo00O = new C31950OooOo0O();
            }
            int i2 = 0;
            while (true) {
                try {
                    int i3 = this.f114336OooOooo - this.f114339Oooo00O.f114053OooOoO0;
                    if (i3 <= 0) {
                        z = true;
                        if (i2 > 0) {
                            this.f114329OooOo0o.OooO0O0(i2);
                        }
                        return true;
                    }
                    int i4 = this.f114340Oooo00o.f114053OooOoO0;
                    if (i4 != 0) {
                        int iMin = Math.min(i3, i4);
                        i2 += iMin;
                        this.f114339Oooo00O.OooO0OO(this.f114340Oooo00o.OooOo0O(iMin));
                    } else if (i2 > 0) {
                        this.f114329OooOo0o.OooO0O0(i2);
                        if (this.f114335OooOooO == enumC32011OooO0Oo) {
                        }
                    }
                } catch (Throwable th) {
                    int i5 = i2;
                    th = th;
                    i = i5;
                    if (i > 0) {
                        this.f114329OooOo0o.OooO0O0(i);
                        if (this.f114335OooOooO == enumC32011OooO0Oo) {
                            c32043o0000o.OooO00o(i);
                            this.f114344Oooo0o0 += i;
                        }
                    }
                    throw th;
                }
            }
            return z;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final void Oooo000() {
        InputStream oooO0OO;
        int i = this.f114342Oooo0OO;
        long j = this.f114344Oooo0o0;
        C32043o0000o c32043o0000o = this.f114331OooOoO0;
        for (AbstractC21138OooO0oo abstractC21138OooO0oo : c32043o0000o.f114553OooO00o) {
            abstractC21138OooO0oo.OoooOo0(i, j);
        }
        this.f114344Oooo0o0 = 0;
        if (this.f114338Oooo000) {
            InterfaceC33070OooOOoo interfaceC33070OooOOoo = this.f114332OooOoOO;
            if (interfaceC33070OooOOoo == OooOO0O.OooO0O0.f119551OooO00o) {
                throw oO0OOo0o.o00Oo0.f119723OooOOO.OooO0oo("Can't decode compressed gRPC message as compression not configured").OooO00o();
            }
            try {
                C31950OooOo0O c31950OooOo0O = this.f114339Oooo00O;
                o0000O0.OooO0O0 oooO0O0 = o0000O0.f114502OooO00o;
                o0000O0.OooO00o oooO00o = new o0000O0.OooO00o();
                oooO00o.f114503OooOo0o = (InterfaceC32047o0000oO) Preconditions.checkNotNull(c31950OooOo0O, "buffer");
                oooO0OO = new OooO0OO(interfaceC33070OooOOoo.OooO0O0(oooO00o), this.f114328OooOo, c32043o0000o);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            long j2 = this.f114339Oooo00O.f114053OooOoO0;
            for (AbstractC21138OooO0oo abstractC21138OooO0oo2 : c32043o0000o.f114553OooO00o) {
                abstractC21138OooO0oo2.OoooOoO(j2);
            }
            C31950OooOo0O c31950OooOo0O2 = this.f114339Oooo00O;
            o0000O0.OooO0O0 oooO0O02 = o0000O0.f114502OooO00o;
            o0000O0.OooO00o oooO00o2 = new o0000O0.OooO00o();
            oooO00o2.f114503OooOo0o = (InterfaceC32047o0000oO) Preconditions.checkNotNull(c31950OooOo0O2, "buffer");
            oooO0OO = oooO00o2;
        }
        this.f114339Oooo00O.getClass();
        this.f114339Oooo00O = null;
        OooO00o oooO00o3 = this.f114329OooOo0o;
        OooO0O0 oooO0O03 = new OooO0O0();
        oooO0O03.f114346OooO00o = oooO0OO;
        oooO00o3.OooO00o(oooO0O03);
        this.f114335OooOooO = EnumC32011OooO0Oo.f114353OooOo0o;
        this.f114336OooOooo = 5;
    }

    public final void Oooo00o() {
        int unsignedByte = this.f114339Oooo00O.readUnsignedByte();
        if ((unsignedByte & StyleIdentifier.MEDIUM_GRID_2_ACCENT_6) != 0) {
            throw oO0OOo0o.o00Oo0.f119723OooOOO.OooO0oo("gRPC frame header malformed: reserved bits not zero").OooO00o();
        }
        this.f114338Oooo000 = (unsignedByte & 1) != 0;
        C31950OooOo0O c31950OooOo0O = this.f114339Oooo00O;
        c31950OooOo0O.OooO00o(4);
        int unsignedByte2 = c31950OooOo0O.readUnsignedByte() | (c31950OooOo0O.readUnsignedByte() << 24) | (c31950OooOo0O.readUnsignedByte() << 16) | (c31950OooOo0O.readUnsignedByte() << 8);
        this.f114336OooOooo = unsignedByte2;
        if (unsignedByte2 < 0 || unsignedByte2 > this.f114328OooOo) {
            oO0OOo0o.o00Oo0 o00oo02 = oO0OOo0o.o00Oo0.f119721OooOO0O;
            Locale locale = Locale.US;
            throw o00oo02.OooO0oo("gRPC message exceeds maximum size " + this.f114328OooOo + ": " + unsignedByte2).OooO00o();
        }
        int i = this.f114342Oooo0OO + 1;
        this.f114342Oooo0OO = i;
        for (AbstractC21138OooO0oo abstractC21138OooO0oo : this.f114331OooOoO0.f114553OooO00o) {
            abstractC21138OooO0oo.OoooOOo(i);
        }
        o000 o000Var = this.f114330OooOoO;
        o000Var.f114315OooO0OO.OooO00o();
        o000Var.f114313OooO00o.OooO00o();
        this.f114335OooOooO = EnumC32011OooO0Oo.f114352OooOo;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, oO000Oo.InterfaceC31955OooOoO
    public final void close() {
        if (isClosed()) {
            return;
        }
        C31950OooOo0O c31950OooOo0O = this.f114339Oooo00O;
        boolean z = false;
        if (c31950OooOo0O != null && c31950OooOo0O.f114053OooOoO0 > 0) {
            z = true;
        }
        try {
            C31950OooOo0O c31950OooOo0O2 = this.f114340Oooo00o;
            if (c31950OooOo0O2 != null) {
                c31950OooOo0O2.close();
            }
            C31950OooOo0O c31950OooOo0O3 = this.f114339Oooo00O;
            if (c31950OooOo0O3 != null) {
                c31950OooOo0O3.close();
            }
            this.f114340Oooo00o = null;
            this.f114339Oooo00O = null;
            this.f114329OooOo0o.OooO0OO(z);
        } catch (Throwable th) {
            this.f114340Oooo00o = null;
            this.f114339Oooo00O = null;
            throw th;
        }
    }

    public final boolean isClosed() {
        return this.f114340Oooo00o == null;
    }

    public static final class OooO0OO extends FilterInputStream {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final C32043o0000o f114347OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final int f114348OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public long f114349OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public long f114350OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public long f114351OooOoOO;

        public OooO0OO(InputStream inputStream, int i, C32043o0000o c32043o0000o) {
            super(inputStream);
            this.f114351OooOoOO = -1L;
            this.f114348OooOo0o = i;
            this.f114347OooOo = c32043o0000o;
        }

        public final void OooO00o() {
            long j = this.f114349OooOoO;
            long j2 = this.f114350OooOoO0;
            if (j > j2) {
                long j3 = j - j2;
                for (AbstractC21138OooO0oo abstractC21138OooO0oo : this.f114347OooOo.f114553OooO00o) {
                    abstractC21138OooO0oo.OoooOoO(j3);
                }
                this.f114350OooOoO0 = this.f114349OooOoO;
            }
        }

        public final void OooO0OO() {
            long j = this.f114349OooOoO;
            int i = this.f114348OooOo0o;
            if (j <= i) {
                return;
            }
            throw oO0OOo0o.o00Oo0.f119721OooOO0O.OooO0oo("Decompressed gRPC message exceeds maximum size " + i).OooO00o();
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final synchronized void mark(int i) {
            ((FilterInputStream) this).in.mark(i);
            this.f114351OooOoOO = this.f114349OooOoO;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final int read() throws IOException {
            int i = ((FilterInputStream) this).in.read();
            if (i != -1) {
                this.f114349OooOoO++;
            }
            OooO0OO();
            OooO00o();
            return i;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final synchronized void reset() throws IOException {
            if (!((FilterInputStream) this).in.markSupported()) {
                throw new IOException("Mark not supported");
            }
            if (this.f114351OooOoOO == -1) {
                throw new IOException("Mark not set");
            }
            ((FilterInputStream) this).in.reset();
            this.f114349OooOoO = this.f114351OooOoOO;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final long skip(long j) throws IOException {
            long jSkip = ((FilterInputStream) this).in.skip(j);
            this.f114349OooOoO += jSkip;
            OooO0OO();
            OooO00o();
            return jSkip;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final int read(byte[] bArr, int i, int i2) throws IOException {
            int i3 = ((FilterInputStream) this).in.read(bArr, i, i2);
            if (i3 != -1) {
                this.f114349OooOoO += (long) i3;
            }
            OooO0OO();
            OooO00o();
            return i3;
        }
    }
}
