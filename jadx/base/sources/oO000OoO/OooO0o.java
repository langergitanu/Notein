package oO000OoO;

import OooOo.C20485OooOoO;
import Oooo0.C20855OooooOO;
import androidx.appcompat.widget.C21532OooOOo;
import com.aspose.words.ControlChar;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import oO000Oo.C31989OoooO0O;
import oO000Oo.C31997OoooOo0;
import oO000Oo.InterfaceC31948OooOOoo;
import oO000Oo.OooOo00;
import oO000Oo.RunnableC31995OoooOOO;
import oO000OoO.C32076OooO0o0;
import oO0OO0OO.C32909OooO0oo;
import oO0OO0OO.C32912OooOOo;
import oO0OO0OO.OooO;
import oO0OO0OO.OooOO0O;
import oO0OOo0o.C33094OoooO;
import oO0OOo0o.o00Oo0;
import oOo00OoO.C34524OooO0Oo;
import oOo00OoO.C34527OooO0oO;
import oOo00OoO.C34540OooOo0;
import oOo00OoO.C34542OooOo0O;
import oOo00OoO.C34547OooOoo;
import oOo00OoO.InterfaceC34548OooOoo0;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0o implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Logger f114856OooO00o = Logger.getLogger(OooO0O0.class.getName());

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final C34527OooO0oO f114857OooO0O0;

    public static final class OooO00o implements InterfaceC34548OooOoo0 {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f114858OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final C34542OooOo0O f114859OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public int f114860OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public byte f114861OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public int f114862OooOoOO;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public short f114863OooOoo0;

        public OooO00o(C34542OooOo0O c34542OooOo0O) {
            this.f114859OooOo0o = c34542OooOo0O;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
        }

        @Override // oOo00OoO.InterfaceC34548OooOoo0
        public final long read(C34524OooO0Oo c34524OooO0Oo, long j) throws IOException {
            int i;
            int i2;
            do {
                int i3 = this.f114862OooOoOO;
                C34542OooOo0O c34542OooOo0O = this.f114859OooOo0o;
                if (i3 == 0) {
                    c34542OooOo0O.skip(this.f114863OooOoo0);
                    this.f114863OooOoo0 = (short) 0;
                    if ((this.f114861OooOoO0 & 4) == 0) {
                        i = this.f114860OooOoO;
                        int iOooO0OO = OooO0o.OooO0OO(c34542OooOo0O);
                        this.f114862OooOoOO = iOooO0OO;
                        this.f114858OooOo = iOooO0OO;
                        byte b = (byte) (c34542OooOo0O.readByte() & 255);
                        this.f114861OooOoO0 = (byte) (c34542OooOo0O.readByte() & 255);
                        Logger logger = OooO0o.f114856OooO00o;
                        if (logger.isLoggable(Level.FINE)) {
                            logger.fine(OooO0O0.OooO00o(true, this.f114860OooOoO, this.f114858OooOo, b, this.f114861OooOoO0));
                        }
                        i2 = c34542OooOo0O.readInt() & Integer.MAX_VALUE;
                        this.f114860OooOoO = i2;
                        if (b != 9) {
                            OooO0o.OooO0o0("%s != TYPE_CONTINUATION", Byte.valueOf(b));
                            throw null;
                        }
                    }
                } else {
                    long j2 = c34542OooOo0O.read(c34524OooO0Oo, Math.min(j, i3));
                    if (j2 != -1) {
                        this.f114862OooOoOO -= (int) j2;
                        return j2;
                    }
                }
                return -1L;
            } while (i2 == i);
            OooO0o.OooO0o0("TYPE_CONTINUATION streamId changed", new Object[0]);
            throw null;
        }

        @Override // oOo00OoO.InterfaceC34548OooOoo0
        public final C34547OooOoo timeout() {
            return this.f114859OooOo0o.f123777OooOo0o.timeout();
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final String[] f114864OooO00o = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final String[] f114865OooO0O0 = new String[64];

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final String[] f114866OooO0OO = new String[256];

        static {
            int i = 0;
            int i2 = 0;
            while (true) {
                String[] strArr = f114866OooO0OO;
                if (i2 >= strArr.length) {
                    break;
                }
                strArr[i2] = String.format("%8s", Integer.toBinaryString(i2)).replace(ControlChar.SPACE_CHAR, '0');
                i2++;
            }
            String[] strArr2 = f114865OooO0O0;
            strArr2[0] = "";
            strArr2[1] = "END_STREAM";
            int[] iArr = {1};
            strArr2[8] = "PADDED";
            int i3 = iArr[0];
            strArr2[i3 | 8] = androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), strArr2[i3], "|PADDED");
            strArr2[4] = "END_HEADERS";
            strArr2[32] = "PRIORITY";
            strArr2[36] = "END_HEADERS|PRIORITY";
            int[] iArr2 = {4, 32, 36};
            for (int i4 = 0; i4 < 3; i4++) {
                int i5 = iArr2[i4];
                int i6 = iArr[0];
                String[] strArr3 = f114865OooO0O0;
                int i7 = i6 | i5;
                strArr3[i7] = strArr3[i6] + '|' + strArr3[i5];
                StringBuilder sb = new StringBuilder();
                sb.append(strArr3[i6]);
                sb.append('|');
                strArr3[i7 | 8] = androidx.concurrent.futures.OooO00o.OooO0OO(sb, strArr3[i5], "|PADDED");
            }
            while (true) {
                String[] strArr4 = f114865OooO0O0;
                if (i >= strArr4.length) {
                    return;
                }
                if (strArr4[i] == null) {
                    strArr4[i] = f114866OooO0OO[i];
                }
                i++;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:38:0x0066  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static String OooO00o(boolean z, int i, int i2, byte b, byte b2) {
            String strReplace;
            String str = b < 10 ? f114864OooO00o[b] : String.format("0x%02x", Byte.valueOf(b));
            if (b2 == 0) {
                strReplace = "";
            } else {
                String[] strArr = f114866OooO0OO;
                if (b == 2 || b == 3) {
                    strReplace = strArr[b2];
                } else if (b == 4 || b == 6) {
                    strReplace = b2 == 1 ? "ACK" : strArr[b2];
                } else if (b != 7 && b != 8) {
                    String str2 = b2 < 64 ? f114865OooO0O0[b2] : strArr[b2];
                    strReplace = (b != 5 || (b2 & 4) == 0) ? (b != 0 || (b2 & 32) == 0) ? str2 : str2.replace("PRIORITY", "COMPRESSED") : str2.replace("HEADERS", "PUSH_PROMISE");
                }
            }
            return String.format(Locale.US, "%s 0x%08x %5d %-13s %s", z ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i2), str, strReplace);
        }
    }

    public static final class OooO0OO implements oO000OoO.OooO0O0 {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final OooO00o f114867OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final C34542OooOo0O f114868OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final C32076OooO0o0.OooO00o f114869OooOoO0;

        public OooO0OO(C34542OooOo0O c34542OooOo0O) {
            this.f114868OooOo0o = c34542OooOo0O;
            OooO00o oooO00o = new OooO00o(c34542OooOo0O);
            this.f114867OooOo = oooO00o;
            this.f114869OooOoO0 = new C32076OooO0o0.OooO00o(oooO00o);
        }

        public final boolean OooO00o(OooO.RunnableC32902OooO0Oo runnableC32902OooO0Oo) throws IOException {
            C31997OoooOo0 c31997OoooOo0;
            EnumC32073OooO00o enumC32073OooO00o;
            C32912OooOOo.OooO0O0 oooO0O0;
            try {
                this.f114868OooOo0o.o0000OOO(9L);
                int iOooO0OO = OooO0o.OooO0OO(this.f114868OooOo0o);
                if (iOooO0OO < 0 || iOooO0OO > 16384) {
                    OooO0o.OooO0o0("FRAME_SIZE_ERROR: %s", Integer.valueOf(iOooO0OO));
                    throw null;
                }
                byte b = (byte) (this.f114868OooOo0o.readByte() & 255);
                byte b2 = (byte) (this.f114868OooOo0o.readByte() & 255);
                int i = this.f114868OooOo0o.readInt() & Integer.MAX_VALUE;
                Logger logger = OooO0o.f114856OooO00o;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(OooO0O0.OooO00o(true, i, iOooO0OO, b, b2));
                }
                switch (b) {
                    case 0:
                        OooO0OO(runnableC32902OooO0Oo, iOooO0OO, b2, i);
                        return true;
                    case 1:
                        OooOOo0(runnableC32902OooO0Oo, iOooO0OO, b2, i);
                        return true;
                    case 2:
                        if (iOooO0OO != 5) {
                            OooO0o.OooO0o0("TYPE_PRIORITY length: %d != 5", Integer.valueOf(iOooO0OO));
                            throw null;
                        }
                        if (i == 0) {
                            OooO0o.OooO0o0("TYPE_PRIORITY streamId == 0", new Object[0]);
                            throw null;
                        }
                        C34542OooOo0O c34542OooOo0O = this.f114868OooOo0o;
                        c34542OooOo0O.readInt();
                        c34542OooOo0O.readByte();
                        return true;
                    case 3:
                        OooOooo(runnableC32902OooO0Oo, iOooO0OO, i);
                        return true;
                    case 4:
                        Oooo000(runnableC32902OooO0Oo, iOooO0OO, b2, i);
                        return true;
                    case 5:
                        OooOOoo(runnableC32902OooO0Oo, iOooO0OO, b2, i);
                        return true;
                    case 6:
                        if (iOooO0OO != 8) {
                            OooO0o.OooO0o0("TYPE_PING length != 8: %s", Integer.valueOf(iOooO0OO));
                            throw null;
                        }
                        if (i != 0) {
                            OooO0o.OooO0o0("TYPE_PING streamId != 0", new Object[0]);
                            throw null;
                        }
                        int i2 = this.f114868OooOo0o.readInt();
                        int i3 = this.f114868OooOo0o.readInt();
                        i = (b2 & 1) != 0 ? 1 : 0;
                        long j = (((long) i2) << 32) | (((long) i3) & 4294967295L);
                        runnableC32902OooO0Oo.f118618OooOo0o.OooO0Oo(OooOO0O.OooO00o.f118715OooOo0o, j);
                        if (i != 0) {
                            synchronized (oO0OO0OO.OooO.this.f118581OooOO0O) {
                                try {
                                    oO0OO0OO.OooO oooO = oO0OO0OO.OooO.this;
                                    c31997OoooOo0 = oooO.f118590OooOo;
                                    if (c31997OoooOo0 != null) {
                                        long j2 = c31997OoooOo0.f114244OooO00o;
                                        if (j2 == j) {
                                            oooO.f118590OooOo = null;
                                        } else {
                                            Logger logger2 = oO0OO0OO.OooO.f118570OoooO00;
                                            Level level = Level.WARNING;
                                            Locale locale = Locale.US;
                                            logger2.log(level, "Received unexpected ping ack. Expecting " + j2 + ", got " + j);
                                        }
                                    } else {
                                        oO0OO0OO.OooO.f118570OoooO00.warning("Received unexpected ping ack. No ping outstanding");
                                    }
                                    c31997OoooOo0 = null;
                                } finally {
                                }
                                break;
                            }
                            if (c31997OoooOo0 != null) {
                                synchronized (c31997OoooOo0) {
                                    try {
                                        if (!c31997OoooOo0.f114247OooO0Oo) {
                                            c31997OoooOo0.f114247OooO0Oo = true;
                                            long jElapsed = c31997OoooOo0.f114245OooO0O0.elapsed(TimeUnit.NANOSECONDS);
                                            c31997OoooOo0.f114248OooO0o = jElapsed;
                                            LinkedHashMap linkedHashMap = c31997OoooOo0.f114246OooO0OO;
                                            c31997OoooOo0.f114246OooO0OO = null;
                                            for (Map.Entry entry : linkedHashMap.entrySet()) {
                                                try {
                                                    ((Executor) entry.getValue()).execute(new RunnableC31995OoooOOO((OooOo00.OooO00o) entry.getKey(), jElapsed));
                                                } catch (Throwable th) {
                                                    C31997OoooOo0.f114243OooO0oO.log(Level.SEVERE, "Failed to execute PingCallback", th);
                                                }
                                            }
                                        }
                                    } finally {
                                    }
                                }
                            }
                            break;
                        } else {
                            synchronized (oO0OO0OO.OooO.this.f118581OooOO0O) {
                                oO0OO0OO.OooO.this.f118571OooO.o0000oo0(i2, i3, true);
                                break;
                            }
                        }
                        return true;
                    case 7:
                        if (iOooO0OO < 8) {
                            OooO0o.OooO0o0("TYPE_GOAWAY length < 8: %s", Integer.valueOf(iOooO0OO));
                            throw null;
                        }
                        if (i != 0) {
                            OooO0o.OooO0o0("TYPE_GOAWAY streamId != 0", new Object[0]);
                            throw null;
                        }
                        C34542OooOo0O c34542OooOo0O2 = this.f114868OooOo0o;
                        int i4 = c34542OooOo0O2.readInt();
                        int i5 = c34542OooOo0O2.readInt();
                        int i6 = iOooO0OO - 8;
                        EnumC32073OooO00o[] enumC32073OooO00oArrValues = EnumC32073OooO00o.values();
                        int length = enumC32073OooO00oArrValues.length;
                        while (true) {
                            if (i < length) {
                                enumC32073OooO00o = enumC32073OooO00oArrValues[i];
                                if (enumC32073OooO00o.f114847OooOo0o != i5) {
                                    i++;
                                }
                            } else {
                                enumC32073OooO00o = null;
                            }
                        }
                        if (enumC32073OooO00o == null) {
                            OooO0o.OooO0o0("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(i5));
                            throw null;
                        }
                        C34527OooO0oO c34527OooO0oOOoooO0O = C34527OooO0oO.f123734OooOoO;
                        if (i6 > 0) {
                            c34527OooO0oOOoooO0O = c34542OooOo0O2.OoooO0O(i6);
                        }
                        runnableC32902OooO0Oo.f118618OooOo0o.OooO0OO(OooOO0O.OooO00o.f118715OooOo0o, i4, enumC32073OooO00o, c34527OooO0oOOoooO0O);
                        EnumC32073OooO00o enumC32073OooO00o2 = EnumC32073OooO00o.ENHANCE_YOUR_CALM;
                        oO0OO0OO.OooO oooO2 = oO0OO0OO.OooO.this;
                        if (enumC32073OooO00o == enumC32073OooO00o2) {
                            String strOooOOO0 = c34527OooO0oOOoooO0O.OooOOO0();
                            oO0OO0OO.OooO.f118570OoooO00.log(Level.WARNING, runnableC32902OooO0Oo + ": Received GOAWAY with ENHANCE_YOUR_CALM. Debug data: " + strOooOOO0);
                            if ("too_many_pings".equals(strOooOOO0)) {
                                oooO2.f118606Oooo0O0.run();
                            }
                        }
                        long j3 = enumC32073OooO00o.f114847OooOo0o;
                        C31989OoooO0O.EnumC31992OooO0oO[] enumC31992OooO0oOArr = C31989OoooO0O.EnumC31992OooO0oO.f114233OooOoO;
                        C31989OoooO0O.EnumC31992OooO0oO enumC31992OooO0oO = (j3 >= ((long) enumC31992OooO0oOArr.length) || j3 < 0) ? null : enumC31992OooO0oOArr[(int) j3];
                        o00Oo0 o00oo0OooO0O0 = (enumC31992OooO0oO == null ? o00Oo0.OooO0Oo(C31989OoooO0O.EnumC31992OooO0oO.f114234OooOoO0.f114236OooOo.f119728OooO00o.f119750OooOo0o).OooO0oo("Unrecognized HTTP/2 error code: " + j3) : enumC31992OooO0oO.f114236OooOo).OooO0O0("Received Goaway");
                        if (c34527OooO0oOOoooO0O.OooO0OO() > 0) {
                            o00oo0OooO0O0 = o00oo0OooO0O0.OooO0O0(c34527OooO0oOOoooO0O.OooOOO0());
                        }
                        Map<EnumC32073OooO00o, o00Oo0> map = oO0OO0OO.OooO.f118569Oooo;
                        oooO2.OooOOo0(i4, null, o00oo0OooO0O0);
                        return true;
                    case 8:
                        if (iOooO0OO != 4) {
                            OooO0o.OooO0o0("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(iOooO0OO));
                            throw null;
                        }
                        long j4 = ((long) this.f114868OooOo0o.readInt()) & 2147483647L;
                        if (j4 == 0) {
                            OooO0o.OooO0o0("windowSizeIncrement was 0", new Object[0]);
                            throw null;
                        }
                        runnableC32902OooO0Oo.f118618OooOo0o.OooO0oO(OooOO0O.OooO00o.f118715OooOo0o, i, j4);
                        if (j4 == 0) {
                            if (i == 0) {
                                oO0OO0OO.OooO.OooO0oO(oO0OO0OO.OooO.this, "Received 0 flow control window increment.");
                                return true;
                            }
                            oO0OO0OO.OooO.this.OooOO0(i, o00Oo0.f119723OooOOO.OooO0oo("Received 0 flow control window increment."), InterfaceC31948OooOOoo.OooO00o.f114034OooOo0o, false, EnumC32073OooO00o.PROTOCOL_ERROR, null);
                            return true;
                        }
                        synchronized (oO0OO0OO.OooO.this.f118581OooOO0O) {
                            try {
                                if (i == 0) {
                                    oO0OO0OO.OooO.this.f118580OooOO0.OooO0O0(null, (int) j4);
                                    return true;
                                }
                                C32909OooO0oo c32909OooO0oo = (C32909OooO0oo) oO0OO0OO.OooO.this.f118583OooOOO.get(Integer.valueOf(i));
                                if (c32909OooO0oo != null) {
                                    C32912OooOOo c32912OooOOo = oO0OO0OO.OooO.this.f118580OooOO0;
                                    C32909OooO0oo.OooO0O0 oooO0O02 = c32909OooO0oo.f118690OooOO0o;
                                    synchronized (oooO0O02.f118697OooOo0o) {
                                        oooO0O0 = oooO0O02.f118709Oooo0O0;
                                        break;
                                    }
                                    c32912OooOOo.OooO0O0(oooO0O0, (int) j4);
                                } else if (!oO0OO0OO.OooO.this.OooOOO0(i)) {
                                    i = 1;
                                }
                                if (i != 0) {
                                    oO0OO0OO.OooO.OooO0oO(oO0OO0OO.OooO.this, "Received window_update for unknown stream: " + i);
                                    return true;
                                }
                                return true;
                            } finally {
                            }
                        }
                    default:
                        this.f114868OooOo0o.skip(iOooO0OO);
                        return true;
                }
            } catch (IOException unused) {
                return false;
            }
        }

        public final void OooO0OO(OooO.RunnableC32902OooO0Oo runnableC32902OooO0Oo, int i, byte b, int i2) throws IOException {
            C32909OooO0oo c32909OooO0oo;
            boolean z = (b & 1) != 0;
            if ((b & 32) != 0) {
                OooO0o.OooO0o0("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
                throw null;
            }
            short s = (b & 8) != 0 ? (short) (this.f114868OooOo0o.readByte() & 255) : (short) 0;
            int iOooO0Oo = OooO0o.OooO0Oo(i, b, s);
            C34542OooOo0O c34542OooOo0O = this.f114868OooOo0o;
            runnableC32902OooO0Oo.f118618OooOo0o.OooO0O0(OooOO0O.OooO00o.f118715OooOo0o, i2, c34542OooOo0O.f123776OooOo, iOooO0Oo, z);
            oO0OO0OO.OooO oooO = oO0OO0OO.OooO.this;
            synchronized (oooO.f118581OooOO0O) {
                c32909OooO0oo = (C32909OooO0oo) oooO.f118583OooOOO.get(Integer.valueOf(i2));
            }
            if (c32909OooO0oo != null) {
                long j = iOooO0Oo;
                c34542OooOo0O.o0000OOO(j);
                C34524OooO0Oo c34524OooO0Oo = new C34524OooO0Oo();
                c34524OooO0Oo.write(c34542OooOo0O.f123776OooOo, j);
                oO00o00.OooO0OO oooO0OO = c32909OooO0oo.f118690OooOO0o.f118705Oooo0;
                oO00o00.OooO0O0.f116246OooO00o.getClass();
                synchronized (oO0OO0OO.OooO.this.f118581OooOO0O) {
                    c32909OooO0oo.f118690OooOO0o.OooOOOo(i - iOooO0Oo, z, c34524OooO0Oo);
                }
            } else {
                if (!oO0OO0OO.OooO.this.OooOOO0(i2)) {
                    oO0OO0OO.OooO.OooO0oO(oO0OO0OO.OooO.this, "Received data for unknown stream: " + i2);
                    this.f114868OooOo0o.skip(s);
                }
                synchronized (oO0OO0OO.OooO.this.f118581OooOO0O) {
                    oO0OO0OO.OooO.this.f118571OooO.Ooooooo(i2, EnumC32073OooO00o.STREAM_CLOSED);
                }
                c34542OooOo0O.skip(iOooO0Oo);
            }
            oO0OO0OO.OooO oooO2 = oO0OO0OO.OooO.this;
            int i3 = oooO2.f118589OooOOoo + i;
            oooO2.f118589OooOOoo = i3;
            if (i3 >= oooO2.f118576OooO0o * 0.5f) {
                synchronized (oooO2.f118581OooOO0O) {
                    oO0OO0OO.OooO.this.f118571OooO.o00000O(0, r11.f118589OooOOoo);
                }
                oO0OO0OO.OooO.this.f118589OooOOoo = 0;
            }
            this.f114868OooOo0o.skip(s);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0060, code lost:
        
            throw new java.io.IOException(androidx.appcompat.widget.C21532OooOOo.OooO0OO(r4, "Header index too large "));
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final ArrayList OooOOO0(int i, short s, byte b, int i2) throws IOException {
            C32076OooO0o0.OooO00o oooO00o;
            OooO00o oooO00o2 = this.f114867OooOo;
            oooO00o2.f114862OooOoOO = i;
            oooO00o2.f114858OooOo = i;
            oooO00o2.f114863OooOoo0 = s;
            oooO00o2.f114861OooOoO0 = b;
            oooO00o2.f114860OooOoO = i2;
            while (true) {
                oooO00o = this.f114869OooOoO0;
                C34542OooOo0O c34542OooOo0O = oooO00o.f114879OooO0O0;
                boolean zO0000o0O = c34542OooOo0O.o0000o0O();
                ArrayList arrayList = oooO00o.f114878OooO00o;
                if (zO0000o0O) {
                    ArrayList arrayList2 = new ArrayList(arrayList);
                    arrayList.clear();
                    return arrayList2;
                }
                byte b2 = c34542OooOo0O.readByte();
                int i3 = b2 & 255;
                if (i3 == 128) {
                    throw new IOException("index == 0");
                }
                if ((b2 & UnsignedBytes.MAX_POWER_OF_TWO) == 128) {
                    int iOooO0o0 = oooO00o.OooO0o0(i3, 127);
                    int i4 = iOooO0o0 - 1;
                    if (i4 >= 0) {
                        C32074OooO0Oo[] c32074OooO0OoArr = C32076OooO0o0.f114876OooO0O0;
                        if (i4 <= c32074OooO0OoArr.length - 1) {
                            arrayList.add(c32074OooO0OoArr[i4]);
                        }
                    }
                    int length = oooO00o.f114882OooO0o + 1 + (i4 - C32076OooO0o0.f114876OooO0O0.length);
                    if (length < 0) {
                        break;
                    }
                    C32074OooO0Oo[] c32074OooO0OoArr2 = oooO00o.f114883OooO0o0;
                    if (length > c32074OooO0OoArr2.length - 1) {
                        break;
                    }
                    arrayList.add(c32074OooO0OoArr2[length]);
                } else if (i3 == 64) {
                    C34527OooO0oO c34527OooO0oOOooO0Oo = oooO00o.OooO0Oo();
                    C32076OooO0o0.OooO00o(c34527OooO0oOOooO0Oo);
                    oooO00o.OooO0OO(new C32074OooO0Oo(c34527OooO0oOOooO0Oo, oooO00o.OooO0Oo()));
                } else if ((b2 & SignedBytes.MAX_POWER_OF_TWO) == 64) {
                    oooO00o.OooO0OO(new C32074OooO0Oo(oooO00o.OooO0O0(oooO00o.OooO0o0(i3, 63) - 1), oooO00o.OooO0Oo()));
                } else if ((b2 & 32) == 32) {
                    int iOooO0o02 = oooO00o.OooO0o0(i3, 31);
                    oooO00o.f114881OooO0Oo = iOooO0o02;
                    if (iOooO0o02 < 0 || iOooO0o02 > oooO00o.f114880OooO0OO) {
                        break;
                    }
                    int i5 = oooO00o.f114885OooO0oo;
                    if (iOooO0o02 < i5) {
                        if (iOooO0o02 == 0) {
                            Arrays.fill(oooO00o.f114883OooO0o0, (Object) null);
                            oooO00o.f114882OooO0o = oooO00o.f114883OooO0o0.length - 1;
                            oooO00o.f114884OooO0oO = 0;
                            oooO00o.f114885OooO0oo = 0;
                        } else {
                            oooO00o.OooO00o(i5 - iOooO0o02);
                        }
                    }
                } else if (i3 == 16 || i3 == 0) {
                    C34527OooO0oO c34527OooO0oOOooO0Oo2 = oooO00o.OooO0Oo();
                    C32076OooO0o0.OooO00o(c34527OooO0oOOooO0Oo2);
                    arrayList.add(new C32074OooO0Oo(c34527OooO0oOOooO0Oo2, oooO00o.OooO0Oo()));
                } else {
                    arrayList.add(new C32074OooO0Oo(oooO00o.OooO0O0(oooO00o.OooO0o0(i3, 15) - 1), oooO00o.OooO0Oo()));
                }
            }
            throw new IOException("Invalid dynamic table size update " + oooO00o.f114881OooO0Oo);
        }

        public final void OooOOo0(OooO.RunnableC32902OooO0Oo runnableC32902OooO0Oo, int i, byte b, int i2) throws IOException {
            o00Oo0 o00oo0OooO0oo = null;
            boolean z = false;
            if (i2 == 0) {
                OooO0o.OooO0o0("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
                throw null;
            }
            boolean z2 = (b & 1) != 0;
            short s = (b & 8) != 0 ? (short) (this.f114868OooOo0o.readByte() & 255) : (short) 0;
            if ((b & 32) != 0) {
                C34542OooOo0O c34542OooOo0O = this.f114868OooOo0o;
                c34542OooOo0O.readInt();
                c34542OooOo0O.readByte();
                i -= 5;
            }
            ArrayList arrayListOooOOO0 = OooOOO0(OooO0o.OooO0Oo(i, b, s), s, b, i2);
            OooOO0O oooOO0O = runnableC32902OooO0Oo.f118618OooOo0o;
            OooOO0O.OooO00o oooO00o = OooOO0O.OooO00o.f118715OooOo0o;
            if (oooOO0O.OooO00o()) {
                oooOO0O.f118712OooO00o.log(oooOO0O.f118713OooO0O0, oooO00o + " HEADERS: streamId=" + i2 + " headers=" + arrayListOooOOO0 + " endStream=" + z2);
            }
            if (oO0OO0OO.OooO.this.f118607Oooo0OO != Integer.MAX_VALUE) {
                long jOooO0OO = 0;
                for (int i3 = 0; i3 < arrayListOooOOO0.size(); i3++) {
                    C32074OooO0Oo c32074OooO0Oo = (C32074OooO0Oo) arrayListOooOOO0.get(i3);
                    jOooO0OO += (long) (c32074OooO0Oo.f114854OooO0O0.OooO0OO() + c32074OooO0Oo.f114853OooO00o.OooO0OO() + 32);
                }
                int iMin = (int) Math.min(jOooO0OO, 2147483647L);
                int i4 = oO0OO0OO.OooO.this.f118607Oooo0OO;
                if (iMin > i4) {
                    o00Oo0 o00oo02 = o00Oo0.f119721OooOO0O;
                    Locale locale = Locale.US;
                    StringBuilder sbOooO0OO = C20485OooOoO.OooO0OO(i4, "Response ", z2 ? "trailer" : "header", " metadata larger than ", ": ");
                    sbOooO0OO.append(iMin);
                    o00oo0OooO0oo = o00oo02.OooO0oo(sbOooO0OO.toString());
                }
            }
            synchronized (oO0OO0OO.OooO.this.f118581OooOO0O) {
                try {
                    C32909OooO0oo c32909OooO0oo = (C32909OooO0oo) oO0OO0OO.OooO.this.f118583OooOOO.get(Integer.valueOf(i2));
                    if (c32909OooO0oo == null) {
                        if (oO0OO0OO.OooO.this.OooOOO0(i2)) {
                            oO0OO0OO.OooO.this.f118571OooO.Ooooooo(i2, EnumC32073OooO00o.STREAM_CLOSED);
                        } else {
                            z = true;
                        }
                    } else if (o00oo0OooO0oo == null) {
                        oO00o00.OooO0OO oooO0OO = c32909OooO0oo.f118690OooOO0o.f118705Oooo0;
                        oO00o00.OooO0O0.f116246OooO00o.getClass();
                        c32909OooO0oo.f118690OooOO0o.OooOOo0(arrayListOooOOO0, z2);
                    } else {
                        if (!z2) {
                            oO0OO0OO.OooO.this.f118571OooO.Ooooooo(i2, EnumC32073OooO00o.CANCEL);
                        }
                        c32909OooO0oo.f118690OooOO0o.OooO(o00oo0OooO0oo, false, new C33094OoooO());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z) {
                oO0OO0OO.OooO.OooO0oO(oO0OO0OO.OooO.this, "Received header for unknown stream: " + i2);
            }
        }

        public final void OooOOoo(OooO.RunnableC32902OooO0Oo runnableC32902OooO0Oo, int i, byte b, int i2) throws IOException {
            if (i2 == 0) {
                OooO0o.OooO0o0("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
                throw null;
            }
            short s = (b & 8) != 0 ? (short) (this.f114868OooOo0o.readByte() & 255) : (short) 0;
            int i3 = this.f114868OooOo0o.readInt() & Integer.MAX_VALUE;
            ArrayList arrayListOooOOO0 = OooOOO0(OooO0o.OooO0Oo(i - 4, b, s), s, b, i2);
            OooOO0O oooOO0O = runnableC32902OooO0Oo.f118618OooOo0o;
            OooOO0O.OooO00o oooO00o = OooOO0O.OooO00o.f118715OooOo0o;
            if (oooOO0O.OooO00o()) {
                oooOO0O.f118712OooO00o.log(oooOO0O.f118713OooO0O0, oooO00o + " PUSH_PROMISE: streamId=" + i2 + " promisedStreamId=" + i3 + " headers=" + arrayListOooOOO0);
            }
            synchronized (oO0OO0OO.OooO.this.f118581OooOO0O) {
                oO0OO0OO.OooO.this.f118571OooO.Ooooooo(i2, EnumC32073OooO00o.PROTOCOL_ERROR);
            }
        }

        public final void OooOooo(OooO.RunnableC32902OooO0Oo runnableC32902OooO0Oo, int i, int i2) throws IOException {
            EnumC32073OooO00o enumC32073OooO00o;
            if (i != 4) {
                OooO0o.OooO0o0("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(i));
                throw null;
            }
            if (i2 == 0) {
                OooO0o.OooO0o0("TYPE_RST_STREAM streamId == 0", new Object[0]);
                throw null;
            }
            int i3 = this.f114868OooOo0o.readInt();
            EnumC32073OooO00o[] enumC32073OooO00oArrValues = EnumC32073OooO00o.values();
            int length = enumC32073OooO00oArrValues.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    enumC32073OooO00o = null;
                    break;
                }
                enumC32073OooO00o = enumC32073OooO00oArrValues[i4];
                if (enumC32073OooO00o.f114847OooOo0o == i3) {
                    break;
                } else {
                    i4++;
                }
            }
            if (enumC32073OooO00o == null) {
                OooO0o.OooO0o0("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(i3));
                throw null;
            }
            runnableC32902OooO0Oo.f118618OooOo0o.OooO0o0(OooOO0O.OooO00o.f118715OooOo0o, i2, enumC32073OooO00o);
            o00Oo0 o00oo0OooO0O0 = oO0OO0OO.OooO.OooOo0(enumC32073OooO00o).OooO0O0("Rst Stream");
            o00Oo0.OooO00o oooO00o = o00oo0OooO0O0.f119728OooO00o;
            boolean z = oooO00o == o00Oo0.OooO00o.CANCELLED || oooO00o == o00Oo0.OooO00o.DEADLINE_EXCEEDED;
            synchronized (oO0OO0OO.OooO.this.f118581OooOO0O) {
                try {
                    C32909OooO0oo c32909OooO0oo = (C32909OooO0oo) oO0OO0OO.OooO.this.f118583OooOOO.get(Integer.valueOf(i2));
                    if (c32909OooO0oo != null) {
                        oO00o00.OooO0OO oooO0OO = c32909OooO0oo.f118690OooOO0o.f118705Oooo0;
                        oO00o00.OooO0O0.f116246OooO00o.getClass();
                        oO0OO0OO.OooO.this.OooOO0(i2, o00oo0OooO0O0, enumC32073OooO00o == EnumC32073OooO00o.REFUSED_STREAM ? InterfaceC31948OooOOoo.OooO00o.f114033OooOo : InterfaceC31948OooOOoo.OooO00o.f114034OooOo0o, z, null, null);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x003c, code lost:
        
            oO000OoO.OooO0o.OooO0o0("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", java.lang.Integer.valueOf(r6));
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0049, code lost:
        
            throw null;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void Oooo000(OooO.RunnableC32902OooO0Oo runnableC32902OooO0Oo, int i, byte b, int i2) throws IOException {
            boolean z;
            if (i2 != 0) {
                OooO0o.OooO0o0("TYPE_SETTINGS streamId != 0", new Object[0]);
                throw null;
            }
            if ((b & 1) != 0) {
                if (i == 0) {
                    return;
                }
                OooO0o.OooO0o0("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
                throw null;
            }
            if (i % 6 != 0) {
                OooO0o.OooO0o0("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(i));
                throw null;
            }
            C32078OooO0oo c32078OooO0oo = new C32078OooO0oo();
            int i3 = 0;
            while (true) {
                short s = 4;
                if (i3 >= i) {
                    runnableC32902OooO0Oo.f118618OooOo0o.OooO0o(OooOO0O.OooO00o.f118715OooOo0o, c32078OooO0oo);
                    synchronized (oO0OO0OO.OooO.this.f118581OooOO0O) {
                        try {
                            if (c32078OooO0oo.OooO00o(4)) {
                                oO0OO0OO.OooO.this.f118598OooOoo = c32078OooO0oo.f114899OooO0O0[4];
                            }
                            if (c32078OooO0oo.OooO00o(7)) {
                                int i4 = c32078OooO0oo.f114899OooO0O0[7];
                                C32912OooOOo c32912OooOOo = oO0OO0OO.OooO.this.f118580OooOO0;
                                if (i4 < 0) {
                                    c32912OooOOo.getClass();
                                    throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i4, "Invalid initial window size: "));
                                }
                                int i5 = i4 - c32912OooOOo.f118742OooO0OO;
                                c32912OooOOo.f118742OooO0OO = i4;
                                z = false;
                                for (C32912OooOOo.OooO0O0 oooO0O0 : c32912OooOOo.f118740OooO00o.OooO00o()) {
                                    oooO0O0.OooO00o(i5);
                                }
                                if (i5 > 0) {
                                    z = true;
                                }
                            } else {
                                z = false;
                            }
                            if (runnableC32902OooO0Oo.f118620OooOoO0) {
                                oO0OO0OO.OooO oooO = oO0OO0OO.OooO.this;
                                oooO.f118591OooOo0 = oooO.f118579OooO0oo.OooO0o0(oooO.f118591OooOo0);
                                oO0OO0OO.OooO.this.f118579OooO0oo.OooO00o();
                                runnableC32902OooO0Oo.f118620OooOoO0 = false;
                            }
                            oO0OO0OO.OooO.this.f118571OooO.OoooO(c32078OooO0oo);
                            if (z) {
                                oO0OO0OO.OooO.this.f118580OooOO0.OooO0OO();
                            }
                            oO0OO0OO.OooO.this.OooOOo();
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    int i6 = c32078OooO0oo.f114898OooO00o;
                    if (((i6 & 2) != 0 ? c32078OooO0oo.f114899OooO0O0[1] : -1) >= 0) {
                        C32076OooO0o0.OooO00o oooO00o = this.f114869OooOoO0;
                        int i7 = (i6 & 2) != 0 ? c32078OooO0oo.f114899OooO0O0[1] : -1;
                        oooO00o.f114880OooO0OO = i7;
                        oooO00o.f114881OooO0Oo = i7;
                        int i8 = oooO00o.f114885OooO0oo;
                        if (i7 < i8) {
                            if (i7 != 0) {
                                oooO00o.OooO00o(i8 - i7);
                                return;
                            }
                            Arrays.fill(oooO00o.f114883OooO0o0, (Object) null);
                            oooO00o.f114882OooO0o = oooO00o.f114883OooO0o0.length - 1;
                            oooO00o.f114884OooO0oO = 0;
                            oooO00o.f114885OooO0oo = 0;
                            return;
                        }
                        return;
                    }
                    return;
                }
                short s2 = this.f114868OooOo0o.readShort();
                int i9 = this.f114868OooOo0o.readInt();
                switch (s2) {
                    case 1:
                    case 6:
                        s = s2;
                        c32078OooO0oo.OooO0O0(s, i9);
                        i3 += 6;
                        break;
                    case 2:
                        if (i9 != 0 && i9 != 1) {
                            OooO0o.OooO0o0("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                            throw null;
                        }
                        s = s2;
                        c32078OooO0oo.OooO0O0(s, i9);
                        i3 += 6;
                        break;
                        break;
                    case 3:
                        c32078OooO0oo.OooO0O0(s, i9);
                        i3 += 6;
                        break;
                    case 4:
                        if (i9 < 0) {
                            OooO0o.OooO0o0("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                            throw null;
                        }
                        s = 7;
                        c32078OooO0oo.OooO0O0(s, i9);
                        i3 += 6;
                        break;
                        break;
                    case 5:
                        if (i9 >= 16384 && i9 <= 16777215) {
                            s = s2;
                            c32078OooO0oo.OooO0O0(s, i9);
                            i3 += 6;
                        }
                        break;
                    default:
                        i3 += 6;
                        break;
                }
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            this.f114868OooOo0o.close();
        }
    }

    /* JADX INFO: renamed from: oO000OoO.OooO0o$OooO0Oo, reason: case insensitive filesystem */
    public static final class C32075OooO0Oo implements oO000OoO.OooO0OO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final C34524OooO0Oo f114870OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final C34540OooOo0 f114871OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public int f114872OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final C32076OooO0o0.OooO0O0 f114873OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public boolean f114874OooOoOO;

        public C32075OooO0Oo(C34540OooOo0 c34540OooOo0) {
            this.f114871OooOo0o = c34540OooOo0;
            C34524OooO0Oo c34524OooO0Oo = new C34524OooO0Oo();
            this.f114870OooOo = c34524OooO0Oo;
            this.f114873OooOoO0 = new C32076OooO0o0.OooO0O0(c34524OooO0Oo);
            this.f114872OooOoO = 16384;
        }

        public final void OooO00o(int i, int i2, byte b, byte b2) throws IOException {
            Logger logger = OooO0o.f114856OooO00o;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(OooO0O0.OooO00o(false, i, i2, b, b2));
            }
            int i3 = this.f114872OooOoO;
            if (i2 > i3) {
                Locale locale = Locale.US;
                throw new IllegalArgumentException(C20855OooooOO.OooO0OO(i3, i2, "FRAME_SIZE_ERROR length > ", ": "));
            }
            if ((Integer.MIN_VALUE & i) != 0) {
                Locale locale2 = Locale.US;
                throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i, "reserved bit set: "));
            }
            C34540OooOo0 c34540OooOo0 = this.f114871OooOo0o;
            c34540OooOo0.writeByte((i2 >>> 16) & 255);
            c34540OooOo0.writeByte((i2 >>> 8) & 255);
            c34540OooOo0.writeByte(i2 & 255);
            c34540OooOo0.writeByte(b & 255);
            c34540OooOo0.writeByte(b2 & 255);
            c34540OooOo0.writeInt(i & Integer.MAX_VALUE);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void OooO0OO(ArrayList arrayList, int i, boolean z) throws IOException {
            int length;
            int length2;
            if (this.f114874OooOoOO) {
                throw new IOException("closed");
            }
            C32076OooO0o0.OooO0O0 oooO0O0 = this.f114873OooOoO0;
            oooO0O0.getClass();
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                C32074OooO0Oo c32074OooO0Oo = (C32074OooO0Oo) arrayList.get(i2);
                C34527OooO0oO c34527OooO0oOOooOO0O = c32074OooO0Oo.f114853OooO00o.OooOO0O();
                Integer num = C32076OooO0o0.f114877OooO0OO.get(c34527OooO0oOOooOO0O);
                C34527OooO0oO c34527OooO0oO = c32074OooO0Oo.f114854OooO0O0;
                if (num != null) {
                    int iIntValue = num.intValue();
                    length2 = iIntValue + 1;
                    if (length2 < 2 || length2 > 7) {
                        length = length2;
                        length2 = -1;
                    } else {
                        C32074OooO0Oo[] c32074OooO0OoArr = C32076OooO0o0.f114876OooO0O0;
                        if (c32074OooO0OoArr[iIntValue].f114854OooO0O0.equals(c34527OooO0oO)) {
                            length = length2;
                        } else if (c32074OooO0OoArr[length2].f114854OooO0O0.equals(c34527OooO0oO)) {
                            length2 = iIntValue + 2;
                            length = length2;
                        }
                    }
                } else {
                    length = -1;
                    length2 = -1;
                }
                if (length2 == -1) {
                    int i3 = oooO0O0.f114889OooO0Oo + 1;
                    while (true) {
                        C32074OooO0Oo[] c32074OooO0OoArr2 = oooO0O0.f114887OooO0O0;
                        if (i3 >= c32074OooO0OoArr2.length) {
                            break;
                        }
                        if (c32074OooO0OoArr2[i3].f114853OooO00o.equals(c34527OooO0oOOooOO0O)) {
                            if (oooO0O0.f114887OooO0O0[i3].f114854OooO0O0.equals(c34527OooO0oO)) {
                                length2 = (i3 - oooO0O0.f114889OooO0Oo) + C32076OooO0o0.f114876OooO0O0.length;
                                break;
                            } else if (length == -1) {
                                length = (i3 - oooO0O0.f114889OooO0Oo) + C32076OooO0o0.f114876OooO0O0.length;
                            }
                        }
                        i3++;
                    }
                }
                if (length2 != -1) {
                    oooO0O0.OooO0OO(length2, 127, 128);
                } else if (length == -1) {
                    oooO0O0.f114886OooO00o.o0OoO0o(64);
                    oooO0O0.OooO0O0(c34527OooO0oOOooOO0O);
                    oooO0O0.OooO0O0(c34527OooO0oO);
                    oooO0O0.OooO00o(c32074OooO0Oo);
                } else if (!c34527OooO0oOOooOO0O.OooOO0(C32076OooO0o0.f114875OooO00o) || C32074OooO0Oo.f114852OooO0oo.equals(c34527OooO0oOOooOO0O)) {
                    oooO0O0.OooO0OO(length, 63, 64);
                    oooO0O0.OooO0O0(c34527OooO0oO);
                    oooO0O0.OooO00o(c32074OooO0Oo);
                } else {
                    oooO0O0.OooO0OO(length, 15, 0);
                    oooO0O0.OooO0O0(c34527OooO0oO);
                }
            }
            C34524OooO0Oo c34524OooO0Oo = this.f114870OooOo;
            long j = c34524OooO0Oo.f123723OooOo;
            int iMin = (int) Math.min(this.f114872OooOoO, j);
            long j2 = iMin;
            byte b = j == j2 ? (byte) 4 : (byte) 0;
            if (z) {
                b = (byte) (b | 1);
            }
            OooO00o(i, iMin, (byte) 1, b);
            C34540OooOo0 c34540OooOo0 = this.f114871OooOo0o;
            c34540OooOo0.write(c34524OooO0Oo, j2);
            if (j > j2) {
                long j3 = j - j2;
                while (j3 > 0) {
                    int iMin2 = (int) Math.min(this.f114872OooOoO, j3);
                    long j4 = iMin2;
                    j3 -= j4;
                    OooO00o(i, iMin2, (byte) 9, j3 == 0 ? (byte) 4 : (byte) 0);
                    c34540OooOo0.write(c34524OooO0Oo, j4);
                }
            }
        }

        @Override // oO000OoO.OooO0OO
        public final synchronized void OooOoO(EnumC32073OooO00o enumC32073OooO00o, byte[] bArr) throws IOException {
            try {
                if (this.f114874OooOoOO) {
                    throw new IOException("closed");
                }
                if (enumC32073OooO00o.f114847OooOo0o == -1) {
                    Locale locale = Locale.US;
                    throw new IllegalArgumentException("errorCode.httpCode == -1");
                }
                OooO00o(0, bArr.length + 8, (byte) 7, (byte) 0);
                this.f114871OooOo0o.writeInt(0);
                this.f114871OooOo0o.writeInt(enumC32073OooO00o.f114847OooOo0o);
                if (bArr.length > 0) {
                    this.f114871OooOo0o.write(bArr);
                }
                this.f114871OooOo0o.flush();
            } catch (Throwable th) {
                throw th;
            }
        }

        @Override // oO000OoO.OooO0OO
        public final synchronized void OooOoO0() throws IOException {
            try {
                if (this.f114874OooOoOO) {
                    throw new IOException("closed");
                }
                Logger logger = OooO0o.f114856OooO00o;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(">> CONNECTION " + OooO0o.f114857OooO0O0.OooO0Oo());
                }
                this.f114871OooOo0o.write(OooO0o.f114857OooO0O0.OooOO0o());
                this.f114871OooOo0o.flush();
            } catch (Throwable th) {
                throw th;
            }
        }

        @Override // oO000OoO.OooO0OO
        public final synchronized void OoooO(C32078OooO0oo c32078OooO0oo) throws IOException {
            if (this.f114874OooOoOO) {
                throw new IOException("closed");
            }
            int i = this.f114872OooOoO;
            if ((c32078OooO0oo.f114898OooO00o & 32) != 0) {
                i = c32078OooO0oo.f114899OooO0O0[5];
            }
            this.f114872OooOoO = i;
            OooO00o(0, 0, (byte) 4, (byte) 1);
            this.f114871OooOo0o.flush();
        }

        @Override // oO000OoO.OooO0OO
        public final synchronized void OoooO0(C32078OooO0oo c32078OooO0oo) throws IOException {
            try {
                if (this.f114874OooOoOO) {
                    throw new IOException("closed");
                }
                int i = 0;
                OooO00o(0, Integer.bitCount(c32078OooO0oo.f114898OooO00o) * 6, (byte) 4, (byte) 0);
                while (i < 10) {
                    if (c32078OooO0oo.OooO00o(i)) {
                        this.f114871OooOo0o.writeShort(i == 4 ? 3 : i == 7 ? 4 : i);
                        this.f114871OooOo0o.writeInt(c32078OooO0oo.f114899OooO0O0[i]);
                    }
                    i++;
                }
                this.f114871OooOo0o.flush();
            } catch (Throwable th) {
                throw th;
            }
        }

        @Override // oO000OoO.OooO0OO
        public final synchronized void OoooO00(ArrayList arrayList, int i, boolean z) throws IOException {
            if (this.f114874OooOoOO) {
                throw new IOException("closed");
            }
            OooO0OO(arrayList, i, z);
        }

        @Override // oO000OoO.OooO0OO
        public final synchronized void Ooooooo(int i, EnumC32073OooO00o enumC32073OooO00o) throws IOException {
            if (this.f114874OooOoOO) {
                throw new IOException("closed");
            }
            if (enumC32073OooO00o.f114847OooOo0o == -1) {
                throw new IllegalArgumentException();
            }
            OooO00o(i, 4, (byte) 3, (byte) 0);
            this.f114871OooOo0o.writeInt(enumC32073OooO00o.f114847OooOo0o);
            this.f114871OooOo0o.flush();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final synchronized void close() throws IOException {
            this.f114874OooOoOO = true;
            this.f114871OooOo0o.close();
        }

        @Override // oO000OoO.OooO0OO
        public final synchronized void flush() throws IOException {
            if (this.f114874OooOoOO) {
                throw new IOException("closed");
            }
            this.f114871OooOo0o.flush();
        }

        @Override // oO000OoO.OooO0OO
        public final synchronized void o00000O(int i, long j) throws IOException {
            if (this.f114874OooOoOO) {
                throw new IOException("closed");
            }
            if (j == 0 || j > 2147483647L) {
                Locale locale = Locale.US;
                throw new IllegalArgumentException("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j);
            }
            OooO00o(i, 4, (byte) 8, (byte) 0);
            this.f114871OooOo0o.writeInt((int) j);
            this.f114871OooOo0o.flush();
        }

        @Override // oO000OoO.OooO0OO
        public final int o0000OO0() {
            return this.f114872OooOoO;
        }

        @Override // oO000OoO.OooO0OO
        public final synchronized void o0000oo0(int i, int i2, boolean z) throws IOException {
            if (this.f114874OooOoOO) {
                throw new IOException("closed");
            }
            OooO00o(0, 8, (byte) 6, z ? (byte) 1 : (byte) 0);
            this.f114871OooOo0o.writeInt(i);
            this.f114871OooOo0o.writeInt(i2);
            this.f114871OooOo0o.flush();
        }

        @Override // oO000OoO.OooO0OO
        public final synchronized void o000O0O0(boolean z, int i, C34524OooO0Oo c34524OooO0Oo, int i2) throws IOException {
            if (this.f114874OooOoOO) {
                throw new IOException("closed");
            }
            OooO00o(i, i2, (byte) 0, z ? (byte) 1 : (byte) 0);
            if (i2 > 0) {
                this.f114871OooOo0o.write(c34524OooO0Oo, i2);
            }
        }
    }

    static {
        C34527OooO0oO c34527OooO0oO = C34527OooO0oO.f123734OooOoO;
        f114857OooO0O0 = C34527OooO0oO.OooO00o.OooO0O0("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
    }

    public static int OooO0OO(C34542OooOo0O c34542OooOo0O) throws IOException {
        return (c34542OooOo0O.readByte() & 255) | ((c34542OooOo0O.readByte() & 255) << 16) | ((c34542OooOo0O.readByte() & 255) << 8);
    }

    public static int OooO0Oo(int i, byte b, short s) throws IOException {
        if ((b & 8) != 0) {
            i--;
        }
        if (s <= i) {
            return (short) (i - s);
        }
        OooO0o0("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i));
        throw null;
    }

    public static void OooO0o0(String str, Object... objArr) throws IOException {
        throw new IOException(String.format(Locale.US, str, objArr));
    }

    @Override // oO000OoO.OooO
    public final OooO0OO OooO00o(C34542OooOo0O c34542OooOo0O) {
        return new OooO0OO(c34542OooOo0O);
    }

    @Override // oO000OoO.OooO
    public final C32075OooO0Oo OooO0O0(C34540OooOo0 c34540OooOo0) {
        return new C32075OooO0Oo(c34540OooOo0);
    }
}
