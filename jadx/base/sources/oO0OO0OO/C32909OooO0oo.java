package oO0OO0OO;

import OooO0o.C20424OooO0Oo;
import Oooo0oo.AbstractC21138OooO0oo;
import com.google.common.base.Charsets;
import com.google.common.base.Preconditions;
import com.google.common.p563io.BaseEncoding;
import com.microsoft.identity.client.internal.MsalUtils;
import java.io.EOFException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import oO000Oo.AbstractC31936OooO0Oo;
import oO000Oo.C31989OoooO0O;
import oO000Oo.C32043o0000o;
import oO000Oo.C32052o0000oo0;
import oO000Oo.C32069ooOO;
import oO000Oo.InterfaceC31948OooOOoo;
import oO000Oo.OooO00o;
import oO000Oo.o000;
import oO000Oo.o0000O0;
import oO000Oo.o000oOoO;
import oO000OoO.C32074OooO0Oo;
import oO000OoO.EnumC32073OooO00o;
import oO0OO0OO.C32912OooOOo;
import oO0OOo0o.C33058OooO00o;
import oO0OOo0o.C33084Oooo0O0;
import oO0OOo0o.C33094OoooO;
import oO0OOo0o.C33101OoooOO0;
import oO0OOo0o.Oooo0;
import oO0OOo0o.o00Oo0;
import oOo00OoO.C34524OooO0Oo;
import oOo00OoO.C34527OooO0oO;

/* JADX INFO: renamed from: oO0OO0OO.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32909OooO0oo extends oO000Oo.OooO00o {

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public static final C34524OooO0Oo f118685OooOOOo = new C34524OooO0Oo();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final String f118686OooO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final C33101OoooOO0<?, ?> f118687OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final C32043o0000o f118688OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final String f118689OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final OooO0O0 f118690OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final C33058OooO00o f118691OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final OooO00o f118692OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public boolean f118693OooOOOO;

    /* JADX INFO: renamed from: oO0OO0OO.OooO0oo$OooO00o */
    public class OooO00o {
        public OooO00o() {
        }

        public final void OooO00o(C33094OoooO c33094OoooO, byte[] bArr) {
            oO00o00.OooO0O0.OooO0OO();
            try {
                String str = "/" + C32909OooO0oo.this.f118687OooO0oo.f119667OooO0O0;
                if (bArr != null) {
                    C32909OooO0oo.this.f118693OooOOOO = true;
                    str = str + MsalUtils.QUERY_STRING_SYMBOL + BaseEncoding.base64().encode(bArr);
                }
                synchronized (C32909OooO0oo.this.f118690OooOO0o.f118697OooOo0o) {
                    OooO0O0.OooOO0o(C32909OooO0oo.this.f118690OooOO0o, c33094OoooO, str);
                }
                oO00o00.OooO0O0.f116246OooO00o.getClass();
            } catch (Throwable th) {
                try {
                    oO00o00.OooO0O0.f116246OooO00o.getClass();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: oO0OO0OO.OooO0oo$OooO0O0 */
    public class OooO0O0 extends o000oOoO implements C32912OooOOo.OooO00o {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public ArrayList f118695OooOo;

        /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
        public final int f118696OooOo0O;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final Object f118697OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public boolean f118698OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final C34524OooO0Oo f118699OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public boolean f118700OooOoOO;

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        public int f118701OooOoo;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public boolean f118702OooOoo0;

        /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
        public int f118703OooOooO;

        /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
        public final oO0OO0OO.OooO0O0 f118704OooOooo;

        /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
        public final oO00o00.OooO0OO f118705Oooo0;

        /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
        public final C32912OooOOo f118706Oooo000;

        /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
        public final OooO f118707Oooo00O;

        /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
        public boolean f118708Oooo00o;

        /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
        public C32912OooOOo.OooO0O0 f118709Oooo0O0;

        /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
        public int f118710Oooo0OO;

        public OooO0O0(int i, C32043o0000o c32043o0000o, Object obj, oO0OO0OO.OooO0O0 oooO0O0, C32912OooOOo c32912OooOOo, OooO oooO, int i2) {
            super(i, c32043o0000o, C32909OooO0oo.this.f113923OooO00o);
            this.f114602OooOOoo = Charsets.UTF_8;
            this.f118699OooOoO0 = new C34524OooO0Oo();
            this.f118698OooOoO = false;
            this.f118700OooOoOO = false;
            this.f118702OooOoo0 = false;
            this.f118708Oooo00o = true;
            this.f118710Oooo0OO = -1;
            this.f118697OooOo0o = Preconditions.checkNotNull(obj, "lock");
            this.f118704OooOooo = oooO0O0;
            this.f118706Oooo000 = c32912OooOOo;
            this.f118707Oooo00O = oooO;
            this.f118701OooOoo = i2;
            this.f118703OooOooO = i2;
            this.f118696OooOo0O = i2;
            oO00o00.OooO0O0.f116246OooO00o.getClass();
            this.f118705Oooo0 = oO00o00.OooO00o.f116244OooO00o;
        }

        public static void OooOO0o(OooO0O0 oooO0O0, C33094OoooO c33094OoooO, String str) {
            C32909OooO0oo c32909OooO0oo = C32909OooO0oo.this;
            String str2 = c32909OooO0oo.f118689OooOO0O;
            boolean z = c32909OooO0oo.f118693OooOOOO;
            OooO oooO = oooO0O0.f118707Oooo00O;
            boolean z2 = oooO.f118599OooOoo0 == null;
            C32074OooO0Oo c32074OooO0Oo = C32905OooO0Oo.f118644OooO00o;
            Preconditions.checkNotNull(c33094OoooO, "headers");
            Preconditions.checkNotNull(str, "defaultPath");
            Preconditions.checkNotNull(str2, "authority");
            c33094OoooO.OooO00o(C31989OoooO0O.f114213OooO);
            c33094OoooO.OooO00o(C31989OoooO0O.f114222OooOO0);
            C33094OoooO.OooO0O0 oooO0O02 = C31989OoooO0O.f114223OooOO0O;
            c33094OoooO.OooO00o(oooO0O02);
            ArrayList arrayList = new ArrayList(c33094OoooO.f119655OooO0O0 + 7);
            if (z2) {
                arrayList.add(C32905OooO0Oo.f118645OooO0O0);
            } else {
                arrayList.add(C32905OooO0Oo.f118644OooO00o);
            }
            if (z) {
                arrayList.add(C32905OooO0Oo.f118647OooO0Oo);
            } else {
                arrayList.add(C32905OooO0Oo.f118646OooO0OO);
            }
            arrayList.add(new C32074OooO0Oo(C32074OooO0Oo.f114852OooO0oo, str2));
            arrayList.add(new C32074OooO0Oo(C32074OooO0Oo.f114849OooO0o, str));
            arrayList.add(new C32074OooO0Oo(oooO0O02.f119658OooO00o, c32909OooO0oo.f118686OooO));
            arrayList.add(C32905OooO0Oo.f118649OooO0o0);
            arrayList.add(C32905OooO0Oo.f118648OooO0o);
            Logger logger = C32052o0000oo0.f114574OooO00o;
            Charset charset = Oooo0.f119617OooO00o;
            int i = c33094OoooO.f119655OooO0O0 * 2;
            byte[][] bArr = new byte[i][];
            Object[] objArr = c33094OoooO.f119654OooO00o;
            if (objArr instanceof byte[][]) {
                System.arraycopy(objArr, 0, bArr, 0, i);
            } else {
                for (int i2 = 0; i2 < c33094OoooO.f119655OooO0O0; i2++) {
                    int i3 = i2 * 2;
                    bArr[i3] = c33094OoooO.OooO0o0(i2);
                    int i4 = i3 + 1;
                    Object obj = c33094OoooO.f119654OooO00o[i4];
                    bArr[i4] = obj instanceof byte[] ? (byte[]) obj : ((C33094OoooO.C33096OooO0o0) obj).OooO00o();
                }
            }
            int i5 = 0;
            for (int i6 = 0; i6 < i; i6 += 2) {
                byte[] bArr2 = bArr[i6];
                byte[] bArr3 = bArr[i6 + 1];
                if (C32052o0000oo0.OooO00o(bArr2, C32052o0000oo0.f114575OooO0O0)) {
                    bArr[i5] = bArr2;
                    bArr[i5 + 1] = Oooo0.f119618OooO0O0.encode(bArr3).getBytes(Charsets.US_ASCII);
                } else {
                    for (byte b : bArr3) {
                        if (b < 32 || b > 126) {
                            StringBuilder sbOooO0o0 = C20424OooO0Oo.OooO0o0("Metadata key=", new String(bArr2, Charsets.US_ASCII), ", value=");
                            sbOooO0o0.append(Arrays.toString(bArr3));
                            sbOooO0o0.append(" contains invalid ASCII characters");
                            C32052o0000oo0.f114574OooO00o.warning(sbOooO0o0.toString());
                            break;
                        }
                    }
                    bArr[i5] = bArr2;
                    bArr[i5 + 1] = bArr3;
                }
                i5 += 2;
            }
            if (i5 != i) {
                bArr = (byte[][]) Arrays.copyOfRange(bArr, 0, i5);
            }
            for (int i7 = 0; i7 < bArr.length; i7 += 2) {
                C34527OooO0oO c34527OooO0oOOooO0oO = C34527OooO0oO.OooO0oO(bArr[i7]);
                byte[] bArr4 = c34527OooO0oOOooO0oO.f123736OooOo0o;
                if (bArr4.length != 0 && bArr4[0] != 58) {
                    arrayList.add(new C32074OooO0Oo(c34527OooO0oOOooO0oO, C34527OooO0oO.OooO0oO(bArr[i7 + 1])));
                }
            }
            oooO0O0.f118695OooOo = arrayList;
            o00Oo0 o00oo02 = oooO.f118593OooOo0O;
            if (o00oo02 != null) {
                c32909OooO0oo.f118690OooOO0o.OooO0oo(o00oo02, InterfaceC31948OooOOoo.OooO00o.f114035OooOoO, true, new C33094OoooO());
                return;
            }
            if (oooO.f118583OooOOO.size() < oooO.f118598OooOoo) {
                oooO.OooOOoo(c32909OooO0oo);
                return;
            }
            oooO.f118600OooOooO.add(c32909OooO0oo);
            if (!oooO.f118595OooOoO) {
                oooO.f118595OooOoO = true;
                C32069ooOO c32069ooOO = oooO.f118603Oooo000;
                if (c32069ooOO != null) {
                    c32069ooOO.OooO0O0();
                }
            }
            if (c32909OooO0oo.f113925OooO0OO) {
                oooO.f118608Oooo0o.o00000OO(c32909OooO0oo, true);
            }
        }

        public static void OooOOO0(OooO0O0 oooO0O0, C34524OooO0Oo c34524OooO0Oo, boolean z, boolean z2) {
            if (oooO0O0.f118702OooOoo0) {
                return;
            }
            if (!oooO0O0.f118708Oooo00o) {
                Preconditions.checkState(oooO0O0.f118710Oooo0OO != -1, "streamId should be set");
                oooO0O0.f118706Oooo000.OooO00o(z, oooO0O0.f118709Oooo0O0, c34524OooO0Oo, z2);
            } else {
                oooO0O0.f118699OooOoO0.write(c34524OooO0Oo, (int) c34524OooO0Oo.f123723OooOo);
                oooO0O0.f118698OooOoO |= z;
                oooO0O0.f118700OooOoOO |= z2;
            }
        }

        @Override // oO000Oo.o000000O.OooO00o
        public final void OooO0O0(int i) {
            int i2 = this.f118703OooOooO - i;
            this.f118703OooOooO = i2;
            float f = i2;
            int i3 = this.f118696OooOo0O;
            if (f <= i3 * 0.5f) {
                int i4 = i3 - i2;
                this.f118701OooOoo += i4;
                this.f118703OooOooO = i2 + i4;
                this.f118704OooOooo.o00000O(this.f118710Oooo0OO, i4);
            }
        }

        @Override // oO000Oo.o000000O.OooO00o
        public final void OooO0OO(boolean z) {
            boolean z2 = this.f113939OooOOO;
            InterfaceC31948OooOOoo.OooO00o oooO00o = InterfaceC31948OooOOoo.OooO00o.f114034OooOo0o;
            if (z2) {
                this.f118707Oooo00O.OooOO0(this.f118710Oooo0OO, null, oooO00o, false, null, null);
            } else {
                this.f118707Oooo00O.OooOO0(this.f118710Oooo0OO, null, oooO00o, false, EnumC32073OooO00o.CANCEL, null);
            }
            Preconditions.checkState(this.f113941OooOOOO, "status should have been reported on deframer closed");
            this.f113938OooOO0o = true;
            if (this.f113942OooOOOo && z) {
                OooO(o00Oo0.f119723OooOOO.OooO0oo("Encountered end-of-stream mid-frame"), true, new C33094OoooO());
            }
            OooO00o.OooO0O0.RunnableC20190OooO00o runnableC20190OooO00o = this.f113940OooOOO0;
            if (runnableC20190OooO00o != null) {
                runnableC20190OooO00o.run();
                this.f113940OooOOO0 = null;
            }
        }

        public final void OooOOO(o00Oo0 o00oo02, boolean z, C33094OoooO c33094OoooO) throws EOFException {
            if (this.f118702OooOoo0) {
                return;
            }
            this.f118702OooOoo0 = true;
            if (!this.f118708Oooo00o) {
                this.f118707Oooo00O.OooOO0(this.f118710Oooo0OO, o00oo02, InterfaceC31948OooOOoo.OooO00o.f114034OooOo0o, z, EnumC32073OooO00o.CANCEL, c33094OoooO);
                return;
            }
            OooO oooO = this.f118707Oooo00O;
            LinkedList linkedList = oooO.f118600OooOooO;
            C32909OooO0oo c32909OooO0oo = C32909OooO0oo.this;
            linkedList.remove(c32909OooO0oo);
            oooO.OooOOO(c32909OooO0oo);
            this.f118695OooOo = null;
            this.f118699OooOoO0.OooO00o();
            this.f118708Oooo00o = false;
            if (c33094OoooO == null) {
                c33094OoooO = new C33094OoooO();
            }
            OooO(o00oo02, true, c33094OoooO);
        }

        public final void OooOOOO(Throwable th) {
            OooOOO(o00Oo0.OooO0o0(th), true, new C33094OoooO());
        }

        public final void OooOOOo(int i, boolean z, C34524OooO0Oo c34524OooO0Oo) throws Throwable {
            Throwable th;
            long j = c34524OooO0Oo.f123723OooOo;
            int i2 = this.f118701OooOoo - (((int) j) + i);
            this.f118701OooOoo = i2;
            this.f118703OooOooO -= i;
            if (i2 < 0) {
                this.f118704OooOooo.Ooooooo(this.f118710Oooo0OO, EnumC32073OooO00o.FLOW_CONTROL_ERROR);
                this.f118707Oooo00O.OooOO0(this.f118710Oooo0OO, o00Oo0.f119723OooOOO.OooO0oo("Received data size exceeded our receiving window size"), InterfaceC31948OooOOoo.OooO00o.f114034OooOo0o, false, null, null);
                return;
            }
            OooOOO0 oooOOO0 = new OooOOO0(c34524OooO0Oo);
            o00Oo0 o00oo02 = this.f114601OooOOo0;
            boolean z2 = false;
            if (o00oo02 != null) {
                Charset charset = this.f114602OooOOoo;
                o0000O0.OooO0O0 oooO0O0 = o0000O0.f114502OooO00o;
                Preconditions.checkNotNull(charset, "charset");
                Preconditions.checkNotNull(oooOOO0, "buffer");
                int i3 = (int) c34524OooO0Oo.f123723OooOo;
                byte[] bArr = new byte[i3];
                oooOOO0.o0000o(0, i3, bArr);
                this.f114601OooOOo0 = o00oo02.OooO0O0("DATA-----------------------------\n".concat(new String(bArr, charset)));
                oooOOO0.close();
                if (this.f114601OooOOo0.f119729OooO0O0.length() > 1000 || z) {
                    OooOOO(this.f114601OooOOo0, false, this.f114600OooOOo);
                    return;
                }
                return;
            }
            if (!this.f114603OooOo00) {
                OooOOO(o00Oo0.f119723OooOOO.OooO0oo("headers not received before payload"), false, new C33094OoooO());
                return;
            }
            int i4 = (int) j;
            Preconditions.checkNotNull(oooOOO0, "frame");
            try {
                if (this.f113941OooOOOO) {
                    oO000Oo.OooO00o.f113922OooO0oO.log(Level.INFO, "Received data on closed stream");
                    oooOOO0.close();
                } else {
                    try {
                        this.f113949OooO00o.OooOOO0(oooOOO0);
                    } catch (Throwable th2) {
                        try {
                            OooOOOO(th2);
                        } catch (Throwable th3) {
                            th = th3;
                            if (!z2) {
                                throw th;
                            }
                            oooOOO0.close();
                            throw th;
                        }
                    }
                }
                if (z) {
                    if (i4 > 0) {
                        this.f114601OooOOo0 = o00Oo0.f119723OooOOO.OooO0oo("Received unexpected EOS on non-empty DATA frame from server");
                    } else {
                        this.f114601OooOOo0 = o00Oo0.f119723OooOOO.OooO0oo("Received unexpected EOS on empty DATA frame from server");
                    }
                    C33094OoooO c33094OoooO = new C33094OoooO();
                    this.f114600OooOOo = c33094OoooO;
                    OooO(this.f114601OooOOo0, false, c33094OoooO);
                }
            } catch (Throwable th4) {
                th = th4;
                z2 = true;
            }
        }

        /* JADX WARN: Finally extract failed */
        public final void OooOOo0(ArrayList arrayList, boolean z) throws EOFException {
            o00Oo0 o00oo0OooO0O0;
            C33094OoooO.OooO0o oooO0o = o000oOoO.f114599OooOo0;
            if (z) {
                byte[][] bArrOooO00o = C32915OooOOoo.OooO00o(arrayList);
                int length = bArrOooO00o.length / 2;
                C33094OoooO c33094OoooO = new C33094OoooO();
                c33094OoooO.f119655OooO0O0 = length;
                c33094OoooO.f119654OooO00o = bArrOooO00o;
                Preconditions.checkNotNull(c33094OoooO, "trailers");
                if (this.f114601OooOOo0 == null && !this.f114603OooOo00) {
                    o00Oo0 o00oo0OooOO0O = o000oOoO.OooOO0O(c33094OoooO);
                    this.f114601OooOOo0 = o00oo0OooOO0O;
                    if (o00oo0OooOO0O != null) {
                        this.f114600OooOOo = c33094OoooO;
                    }
                }
                o00Oo0 o00oo02 = this.f114601OooOOo0;
                if (o00oo02 != null) {
                    o00Oo0 o00oo0OooO0O02 = o00oo02.OooO0O0("trailers: " + c33094OoooO);
                    this.f114601OooOOo0 = o00oo0OooO0O02;
                    OooOOO(o00oo0OooO0O02, false, this.f114600OooOOo);
                    return;
                }
                C33094OoooO.OooO0o oooO0o2 = C33084Oooo0O0.f119624OooO0O0;
                o00Oo0 o00oo03 = (o00Oo0) c33094OoooO.OooO0OO(oooO0o2);
                if (o00oo03 != null) {
                    o00oo0OooO0O0 = o00oo03.OooO0oo((String) c33094OoooO.OooO0OO(C33084Oooo0O0.f119623OooO00o));
                } else if (this.f114603OooOo00) {
                    o00oo0OooO0O0 = o00Oo0.f119718OooO0oO.OooO0oo("missing GRPC status in response");
                } else {
                    Integer num = (Integer) c33094OoooO.OooO0OO(oooO0o);
                    o00oo0OooO0O0 = (num != null ? C31989OoooO0O.OooO0oO(num.intValue()) : o00Oo0.f119723OooOOO.OooO0oo("missing HTTP status code")).OooO0O0("missing GRPC status, inferred error from HTTP status code");
                }
                c33094OoooO.OooO00o(oooO0o);
                c33094OoooO.OooO00o(oooO0o2);
                c33094OoooO.OooO00o(C33084Oooo0O0.f119623OooO00o);
                Preconditions.checkNotNull(o00oo0OooO0O0, "status");
                Preconditions.checkNotNull(c33094OoooO, "trailers");
                if (this.f113941OooOOOO) {
                    oO000Oo.OooO00o.f113922OooO0oO.log(Level.INFO, "Received trailers on closed stream:\n {1}\n {2}", new Object[]{o00oo0OooO0O0, c33094OoooO});
                    return;
                }
                for (AbstractC21138OooO0oo abstractC21138OooO0oo : this.f113935OooO0oo.f114553OooO00o) {
                    ((oO0OOo0o.OooO) abstractC21138OooO0oo).o0OoOo0(c33094OoooO);
                }
                OooO(o00oo0OooO0O0, false, c33094OoooO);
                return;
            }
            byte[][] bArrOooO00o2 = C32915OooOOoo.OooO00o(arrayList);
            int length2 = bArrOooO00o2.length / 2;
            C33094OoooO c33094OoooO2 = new C33094OoooO();
            c33094OoooO2.f119655OooO0O0 = length2;
            c33094OoooO2.f119654OooO00o = bArrOooO00o2;
            Preconditions.checkNotNull(c33094OoooO2, "headers");
            o00Oo0 o00oo04 = this.f114601OooOOo0;
            if (o00oo04 != null) {
                this.f114601OooOOo0 = o00oo04.OooO0O0("headers: " + c33094OoooO2);
                return;
            }
            try {
                if (this.f114603OooOo00) {
                    o00Oo0 o00oo0OooO0oo = o00Oo0.f119723OooOOO.OooO0oo("Received headers twice");
                    this.f114601OooOOo0 = o00oo0OooO0oo;
                    this.f114601OooOOo0 = o00oo0OooO0oo.OooO0O0("headers: " + c33094OoooO2);
                    this.f114600OooOOo = c33094OoooO2;
                    this.f114602OooOOoo = o000oOoO.OooOO0(c33094OoooO2);
                    return;
                }
                Integer num2 = (Integer) c33094OoooO2.OooO0OO(oooO0o);
                if (num2 != null && num2.intValue() >= 100 && num2.intValue() < 200) {
                    o00Oo0 o00oo05 = this.f114601OooOOo0;
                    if (o00oo05 != null) {
                        this.f114601OooOOo0 = o00oo05.OooO0O0("headers: " + c33094OoooO2);
                        this.f114600OooOOo = c33094OoooO2;
                        this.f114602OooOOoo = o000oOoO.OooOO0(c33094OoooO2);
                        return;
                    }
                    return;
                }
                this.f114603OooOo00 = true;
                o00Oo0 o00oo0OooOO0O2 = o000oOoO.OooOO0O(c33094OoooO2);
                this.f114601OooOOo0 = o00oo0OooOO0O2;
                if (o00oo0OooOO0O2 != null) {
                    this.f114601OooOOo0 = o00oo0OooOO0O2.OooO0O0("headers: " + c33094OoooO2);
                    this.f114600OooOOo = c33094OoooO2;
                    this.f114602OooOOoo = o000oOoO.OooOO0(c33094OoooO2);
                    return;
                }
                c33094OoooO2.OooO00o(oooO0o);
                c33094OoooO2.OooO00o(C33084Oooo0O0.f119624OooO0O0);
                c33094OoooO2.OooO00o(C33084Oooo0O0.f119623OooO00o);
                OooO0oO(c33094OoooO2);
                o00Oo0 o00oo06 = this.f114601OooOOo0;
                if (o00oo06 != null) {
                    this.f114601OooOOo0 = o00oo06.OooO0O0("headers: " + c33094OoooO2);
                    this.f114600OooOOo = c33094OoooO2;
                    this.f114602OooOOoo = o000oOoO.OooOO0(c33094OoooO2);
                }
            } catch (Throwable th) {
                o00Oo0 o00oo07 = this.f114601OooOOo0;
                if (o00oo07 != null) {
                    this.f114601OooOOo0 = o00oo07.OooO0O0("headers: " + c33094OoooO2);
                    this.f114600OooOOo = c33094OoooO2;
                    this.f114602OooOOoo = o000oOoO.OooOO0(c33094OoooO2);
                }
                throw th;
            }
        }
    }

    public C32909OooO0oo(C33101OoooOO0 c33101OoooOO0, C33094OoooO c33094OoooO, oO0OO0OO.OooO0O0 oooO0O0, OooO oooO, C32912OooOOo c32912OooOOo, Object obj, int i, int i2, String str, String str2, C32043o0000o c32043o0000o, o000 o000Var, oO0OOo0o.OooO0OO oooO0OO) {
        super(new C32914OooOOo0(), c32043o0000o, o000Var, c33094OoooO, oooO0OO, false);
        this.f118692OooOOO0 = new OooO00o();
        this.f118693OooOOOO = false;
        this.f118688OooOO0 = (C32043o0000o) Preconditions.checkNotNull(c32043o0000o, "statsTraceCtx");
        this.f118687OooO0oo = c33101OoooOO0;
        this.f118689OooOO0O = str;
        this.f118686OooO = str2;
        this.f118691OooOOO = oooO.f118591OooOo0;
        String str3 = c33101OoooOO0.f119667OooO0O0;
        this.f118690OooOO0o = new OooO0O0(i, c32043o0000o, obj, oooO0O0, c32912OooOOo, oooO, i2);
    }

    @Override // oO000Oo.OooO00o, oO000Oo.AbstractC31936OooO0Oo
    public final AbstractC31936OooO0Oo.OooO00o OooOOOO() {
        return this.f118690OooOO0o;
    }

    @Override // oO000Oo.OooO00o
    public final OooO00o OooOOOo() {
        return this.f118692OooOOO0;
    }

    @Override // oO000Oo.OooO00o
    /* JADX INFO: renamed from: OooOOo0 */
    public final OooO0O0 OooOOOO() {
        return this.f118690OooOO0o;
    }

    @Override // oO000Oo.InterfaceC31946OooOOo
    public final C33058OooO00o getAttributes() {
        return this.f118691OooOOO;
    }
}
